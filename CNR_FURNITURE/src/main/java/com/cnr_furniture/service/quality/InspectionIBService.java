package com.cnr_furniture.service.quality;

import com.cnr_furniture.domain.quality.*;

import java.util.List;

public interface InspectionIBService {
    /* [자재불량등록] - 검색 및 현황 조회 ====================================================================================================== */
    /**
     * Desc: 검색창 - 자재번호 - 조회
     */
    List<InspectionIBListVO> getMatIDList();

    /**
     * Desc: 검색창 - 계약번호 - 조회
     */
    List<InspectionIBListVO> getContractIDList();

    /**
     * Desc: 검색창 - 불량유형1 - 조회
     */
    List<InspectionIBListVO> getQsDiv1List();

    /**
     * Desc: 검색창 - 불량유형1에 따른 불량유형2 조회
     */
    List<InspectionIBListVO> getQsDiv2ListByQsDiv1(String qsDiv1);

    /**
     * Desc: 수입검사현황 목록 조회(with 검색), 자재 IB 불량 현황 조회
     */
    List<InspectionIBListVO> getInspectionIBList(CriteriaInspIBVO cri);

    /* [자재불량등록] - 모달창 ====================================================================================================== */
    /**
     * Desc: 모달창 - 계약번호 - 조회
     */
    List<InspectionIBInsertVO> getContractIDListForModal();

    /**
     * Desc: 모달창 - 불량유형1 - 조회
     */
    List<InspectionIBInsertVO> getQsDiv1ListForModal();

    /**
     * Desc: 모달창 - 불량유형1에 따른 불량유형2 조회
     */
    List<InspectionIBInsertVO> getQsDiv2ListByQsDiv1ForModal(String qsDiv1Modal);

    /**
     * Desc: 모달창 - [계약번호] 입력에 따른 [거래처명], [계약입고수량], [단위], [자재번호], [자재명], [자재용도] 자동 채우기
     */
    InspectionIBInsertVO getContractDetailsByContractIDModal(Long contractIDModal);

    /**
     * Desc: 자재불량 등록 시, DB 저장 - [품질검사 테이블], [재고 테이블]
     */
    void registerInspectionItems(List<InspectionIBInsertVO> items);

}
