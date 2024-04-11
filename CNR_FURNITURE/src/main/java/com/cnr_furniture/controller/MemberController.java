package com.cnr_furniture.controller;

import com.cnr_furniture.domain.member.MemberVO;
import com.cnr_furniture.domain.member.MemberSearch;
import com.cnr_furniture.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import lombok.extern.log4j.Log4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@AllArgsConstructor
@Controller
@Log4j
public class MemberController {
  private MemberService memberService;

  /**
   * Desc: 로그인 페이지
   * @return 로그인 view page
   */
  @GetMapping("/login")
  public String login(@RequestParam(value = "error", required = false) String error,
                      @RequestParam(value = "exception", required = false) String exception,
                      Model model) {
    model.addAttribute("error", error);
    model.addAttribute("exception", exception);

    return "member/login";
  }

  /**
   * Desc: 비밀번호변경 페이지
   * @return 비밀번호변경 view page
   */
  @GetMapping("/PasswordChange")
  public String pwChange() {


    return "member/pwChange";
  }


  /**
   * Desc: 사원정보조회
   * @return 사원정보조회 view page
   */
  @GetMapping("/memberInfo")
  public String memberInfo(MemberSearch search, Model model) {
    // 검색창
    model.addAttribute("search", search);

    // 사원리스트
    List<MemberVO> staffList = memberService.staffList(search);
    model.addAttribute("StaffList", staffList);
    log.info(staffList);

    // 매니저리스트›
    List<MemberVO> managerList = memberService.managerList(search);
    model.addAttribute("ManagerList", managerList);

    // 디렉터 리스트
    List<MemberVO> directorList = memberService.directorList(search);
    model.addAttribute("DirectorList", directorList);

    return "standardInfo/memberInfo";
  }

  /**
   * Desc: 사용자별 권한관리
   * @return 사용자별 권한관리 view page
   */
  @GetMapping("/memberRole")
  public String memberRole(MemberSearch search, Model model) {
    // 검색창
    model.addAttribute("search", search);

    // 직원 목록
    List<MemberVO> employeeList = memberService.employeeList(search);
    model.addAttribute("EmployeeList", employeeList);

    // 권한 조회
    List<MemberVO> roleList = memberService.roleList();
    model.addAttribute("roleList", roleList);
    // 부서 조회
    List<MemberVO> dpNameList = memberService.dpNameList();
    model.addAttribute("dpNameList", dpNameList);

    return "member/memberRole";
  }

  @RequestMapping(value = "/addMember", method = {RequestMethod.GET, RequestMethod.POST})
  public void addMember() {
    log.info("사원등록 페이지 진입");
  }
}
