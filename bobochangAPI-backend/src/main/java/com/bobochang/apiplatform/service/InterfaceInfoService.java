package com.bobochang.apiplatform.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bobochang.apicommon.model.dto.interfaceInfo.InterfaceInfoInvokeRequest;
import com.bobochang.apicommon.model.entity.InterfaceInfo;

import javax.servlet.http.HttpServletRequest;

/**
 * @author bobochang
 * @description 针对表【interface_info(接口信息)】的数据库操作Service
 * @createDate 2023-05-26 13:48:25
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

    Object invokeInterfaceInfo(InterfaceInfoInvokeRequest interfaceInfoInvokeRequest, HttpServletRequest request);
}
