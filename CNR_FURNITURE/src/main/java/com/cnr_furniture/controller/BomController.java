package com.cnr_furniture.controller;

import com.cnr_furniture.domain.ItemInfo.ItemInfoVO;
import com.cnr_furniture.domain.bom.BomSearch;
import com.cnr_furniture.domain.bom.BomVO;
import com.cnr_furniture.service.BomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import lombok.extern.log4j.Log4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Log4j
public class BomController {

    @Autowired
    BomService bomService;

    /**
     * Desc: bom목록 - 제품조회 및 검색
     * @return: standardInfo/bom
     */
    @GetMapping("/bom")
    public String bomInfo(BomSearch bomSearch, Model model) {
        List<ItemInfoVO> itemInfoVOList = bomService.getBomInfoList(bomSearch);
        model.addAttribute("itemList", itemInfoVOList);
        model.addAttribute("bomSearch", bomSearch);

        List<BomVO> bomVOList = bomService.getBomDetails();
        model.addAttribute("bomList", bomVOList);

        return "standardInfo/bom";
    }

    /**
     * Desc: bom목록 - 세부목록 조회
     * @return: /bomList/{i_id}
     */
    @ResponseBody
    @GetMapping(value = "/bomList/{i_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<BomVO>> get(@PathVariable("i_id") int i_id) {
        return new ResponseEntity<>(bomService.getListBom(i_id), HttpStatus.OK);
    }







    /**
     * Desc: bom 등록 - 제품 자재목록 조회 및 검색
     * @return: standardInfo/bomInsert
     */
    @GetMapping("/bomInsert")
    public String bomInsert(BomSearch bomSearch, Model model) {
        List<ItemInfoVO> itemInfoVOList = bomService.getBomInfoList(bomSearch);
        model.addAttribute("itemList", itemInfoVOList);
        model.addAttribute("bomSearch", bomSearch);

        List<BomVO> bomVOList = bomService.getBomListForInsert(bomSearch);
        model.addAttribute("bomList", bomVOList);
        model.addAttribute("bomSearch", bomSearch);

        return "standardInfo/bomInsert";
    }


    /**
     * Desc: bom목록 - bom수정
     * @return: /bomList/{b_material_id}
     */
    @RequestMapping(method = { RequestMethod.POST }
            ,value =  "/bom/{b_material_id}/{b_item_id}"
    )
    public ResponseEntity<String> modify(
                                @RequestBody BomVO bomVO,
                                @PathVariable("b_item_id") int b_item_id,
                                @PathVariable("b_material_id") int b_material_id
    ){
        bomVO.setB_material_id(b_material_id);
        bomVO.setB_item_id(b_item_id);

        log.info("b_material_id: " + b_material_id);
        log.info("modify: " + bomVO);
        boolean isSuccessModify = bomService.modify(bomVO) == 1;

        return  isSuccessModify ? new ResponseEntity<>("success", HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
