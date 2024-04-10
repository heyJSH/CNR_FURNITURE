package com.cnr_furniture.service.machine;

import com.cnr_furniture.domain.Machine.MachineCheckVO;
import com.cnr_furniture.domain.Machine.SearhMachine;
import com.cnr_furniture.domain.MachineVO;

import java.util.List;

public interface MachineMNGService {
    // 설비 체크리스트 리스트
    List<MachineCheckVO> getMachineCheckList();

    // 체크리스트 추가
    int insertMachineCheck(MachineCheckVO machineCheckVO);

    // 마지막 체크리스트 가져오기
    MachineCheckVO getMachineCheckOne();

    // 설비명 ID 가져오기
    List<MachineVO> getMachineInfo();

    // 체크리스트 가져오기
    List<MachineCheckVO> getMachineCheckAll(SearhMachine searhMachine);
}