package com.javashitang.blog.entity;

import java.time.LocalDateTime;

public class OrderSearchInfo {
    private Long id;

    private String orderCode;

    private String hirecontractCode;

    private Integer orderType;

    private Integer orderState;

    private String cityCode;

    private String rentContractCode;

    private String orderZo;

    private String orderZoCode;

    private String orderZe;

    private String orderZeCode;

    private LocalDateTime receiveOrderTime;

    private LocalDateTime acceptDate;

    private Long roomId;

    private Integer isSuspension;

    private LocalDateTime planAcceptDate;

    private LocalDateTime planAmountDate;

    private String orderProcessor;

    private String orderProcessorCode;

    private String orderZd;

    private String orderZdCode;

    private Integer isRisk;

    private LocalDateTime handOverDate;

    private LocalDateTime agentStartDate;

    private String houseSourceCode;

    private String houseCode;

    private String ratingAddress;

    private Integer ziroomVersionId;

    private Integer productId;

    private Integer companyHouseSource;

    private String bzOrderExtend;

    private LocalDateTime orderCreateTime;

    private LocalDateTime lastModifyTime;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer isDel;

    private Integer designState;

    private Integer hireContractIsDel;

    private Integer approvalConfigCount;

    private String assistant;

    private String assistantCode;

    private String configAuditStatus;

    private Integer selfCheckStatus;

    private Integer dispatchOrderStatus;

    private String orderLabelStr;

    private Integer dismantleStatus;

    private Integer startWorkStatus;

    private Integer designMonitorStatus;

    private String customMetricStatus;

    private String kitchenDesignStatus;

    private Integer suspensionType;

    private Integer presentationVersionNo;

    private LocalDateTime applySuspensionDate;

    private LocalDateTime removeSuspensionDate;

    private Integer layLineAcceptState;

    private Integer waterElectricityAcceptState;

    private Integer waterProofAcceptState;

    private Integer oilTileAcceptState;

    private Integer hardCoverAcceptState;

    private String orderOo;

    private String orderOoCode;

    private String orderOoManager;

    private String orderOoManagerCode;

    private String orderOoAssist;

    private String orderOoAssistCode;

    private String orderOoTag;

    public OrderSearchInfo(Long id, String orderCode, String hirecontractCode, Integer orderType, Integer orderState, String cityCode, String rentContractCode, String orderZo, String orderZoCode, String orderZe, String orderZeCode, LocalDateTime receiveOrderTime, LocalDateTime acceptDate, Long roomId, Integer isSuspension, LocalDateTime planAcceptDate, LocalDateTime planAmountDate, String orderProcessor, String orderProcessorCode, String orderZd, String orderZdCode, Integer isRisk, LocalDateTime handOverDate, LocalDateTime agentStartDate, String houseSourceCode, String houseCode, String ratingAddress, Integer ziroomVersionId, Integer productId, Integer companyHouseSource, String bzOrderExtend, LocalDateTime orderCreateTime, LocalDateTime lastModifyTime, LocalDateTime createTime, LocalDateTime updateTime, Integer isDel, Integer designState, Integer hireContractIsDel, Integer approvalConfigCount, String assistant, String assistantCode, String configAuditStatus, Integer selfCheckStatus, Integer dispatchOrderStatus, String orderLabelStr, Integer dismantleStatus, Integer startWorkStatus, Integer designMonitorStatus, String customMetricStatus, String kitchenDesignStatus, Integer suspensionType, Integer presentationVersionNo, LocalDateTime applySuspensionDate, LocalDateTime removeSuspensionDate, Integer layLineAcceptState, Integer waterElectricityAcceptState, Integer waterProofAcceptState, Integer oilTileAcceptState, Integer hardCoverAcceptState, String orderOo, String orderOoCode, String orderOoManager, String orderOoManagerCode, String orderOoAssist, String orderOoAssistCode, String orderOoTag) {
        this.id = id;
        this.orderCode = orderCode;
        this.hirecontractCode = hirecontractCode;
        this.orderType = orderType;
        this.orderState = orderState;
        this.cityCode = cityCode;
        this.rentContractCode = rentContractCode;
        this.orderZo = orderZo;
        this.orderZoCode = orderZoCode;
        this.orderZe = orderZe;
        this.orderZeCode = orderZeCode;
        this.receiveOrderTime = receiveOrderTime;
        this.acceptDate = acceptDate;
        this.roomId = roomId;
        this.isSuspension = isSuspension;
        this.planAcceptDate = planAcceptDate;
        this.planAmountDate = planAmountDate;
        this.orderProcessor = orderProcessor;
        this.orderProcessorCode = orderProcessorCode;
        this.orderZd = orderZd;
        this.orderZdCode = orderZdCode;
        this.isRisk = isRisk;
        this.handOverDate = handOverDate;
        this.agentStartDate = agentStartDate;
        this.houseSourceCode = houseSourceCode;
        this.houseCode = houseCode;
        this.ratingAddress = ratingAddress;
        this.ziroomVersionId = ziroomVersionId;
        this.productId = productId;
        this.companyHouseSource = companyHouseSource;
        this.bzOrderExtend = bzOrderExtend;
        this.orderCreateTime = orderCreateTime;
        this.lastModifyTime = lastModifyTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.isDel = isDel;
        this.designState = designState;
        this.hireContractIsDel = hireContractIsDel;
        this.approvalConfigCount = approvalConfigCount;
        this.assistant = assistant;
        this.assistantCode = assistantCode;
        this.configAuditStatus = configAuditStatus;
        this.selfCheckStatus = selfCheckStatus;
        this.dispatchOrderStatus = dispatchOrderStatus;
        this.orderLabelStr = orderLabelStr;
        this.dismantleStatus = dismantleStatus;
        this.startWorkStatus = startWorkStatus;
        this.designMonitorStatus = designMonitorStatus;
        this.customMetricStatus = customMetricStatus;
        this.kitchenDesignStatus = kitchenDesignStatus;
        this.suspensionType = suspensionType;
        this.presentationVersionNo = presentationVersionNo;
        this.applySuspensionDate = applySuspensionDate;
        this.removeSuspensionDate = removeSuspensionDate;
        this.layLineAcceptState = layLineAcceptState;
        this.waterElectricityAcceptState = waterElectricityAcceptState;
        this.waterProofAcceptState = waterProofAcceptState;
        this.oilTileAcceptState = oilTileAcceptState;
        this.hardCoverAcceptState = hardCoverAcceptState;
        this.orderOo = orderOo;
        this.orderOoCode = orderOoCode;
        this.orderOoManager = orderOoManager;
        this.orderOoManagerCode = orderOoManagerCode;
        this.orderOoAssist = orderOoAssist;
        this.orderOoAssistCode = orderOoAssistCode;
        this.orderOoTag = orderOoTag;
    }

    public OrderSearchInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getHirecontractCode() {
        return hirecontractCode;
    }

    public void setHirecontractCode(String hirecontractCode) {
        this.hirecontractCode = hirecontractCode == null ? null : hirecontractCode.trim();
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getRentContractCode() {
        return rentContractCode;
    }

    public void setRentContractCode(String rentContractCode) {
        this.rentContractCode = rentContractCode == null ? null : rentContractCode.trim();
    }

    public String getOrderZo() {
        return orderZo;
    }

    public void setOrderZo(String orderZo) {
        this.orderZo = orderZo == null ? null : orderZo.trim();
    }

    public String getOrderZoCode() {
        return orderZoCode;
    }

    public void setOrderZoCode(String orderZoCode) {
        this.orderZoCode = orderZoCode == null ? null : orderZoCode.trim();
    }

    public String getOrderZe() {
        return orderZe;
    }

    public void setOrderZe(String orderZe) {
        this.orderZe = orderZe == null ? null : orderZe.trim();
    }

    public String getOrderZeCode() {
        return orderZeCode;
    }

    public void setOrderZeCode(String orderZeCode) {
        this.orderZeCode = orderZeCode == null ? null : orderZeCode.trim();
    }

    public LocalDateTime getReceiveOrderTime() {
        return receiveOrderTime;
    }

    public void setReceiveOrderTime(LocalDateTime receiveOrderTime) {
        this.receiveOrderTime = receiveOrderTime;
    }

    public LocalDateTime getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(LocalDateTime acceptDate) {
        this.acceptDate = acceptDate;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Integer getIsSuspension() {
        return isSuspension;
    }

    public void setIsSuspension(Integer isSuspension) {
        this.isSuspension = isSuspension;
    }

    public LocalDateTime getPlanAcceptDate() {
        return planAcceptDate;
    }

    public void setPlanAcceptDate(LocalDateTime planAcceptDate) {
        this.planAcceptDate = planAcceptDate;
    }

    public LocalDateTime getPlanAmountDate() {
        return planAmountDate;
    }

    public void setPlanAmountDate(LocalDateTime planAmountDate) {
        this.planAmountDate = planAmountDate;
    }

    public String getOrderProcessor() {
        return orderProcessor;
    }

    public void setOrderProcessor(String orderProcessor) {
        this.orderProcessor = orderProcessor == null ? null : orderProcessor.trim();
    }

    public String getOrderProcessorCode() {
        return orderProcessorCode;
    }

    public void setOrderProcessorCode(String orderProcessorCode) {
        this.orderProcessorCode = orderProcessorCode == null ? null : orderProcessorCode.trim();
    }

    public String getOrderZd() {
        return orderZd;
    }

    public void setOrderZd(String orderZd) {
        this.orderZd = orderZd == null ? null : orderZd.trim();
    }

    public String getOrderZdCode() {
        return orderZdCode;
    }

    public void setOrderZdCode(String orderZdCode) {
        this.orderZdCode = orderZdCode == null ? null : orderZdCode.trim();
    }

    public Integer getIsRisk() {
        return isRisk;
    }

    public void setIsRisk(Integer isRisk) {
        this.isRisk = isRisk;
    }

    public LocalDateTime getHandOverDate() {
        return handOverDate;
    }

    public void setHandOverDate(LocalDateTime handOverDate) {
        this.handOverDate = handOverDate;
    }

    public LocalDateTime getAgentStartDate() {
        return agentStartDate;
    }

    public void setAgentStartDate(LocalDateTime agentStartDate) {
        this.agentStartDate = agentStartDate;
    }

    public String getHouseSourceCode() {
        return houseSourceCode;
    }

    public void setHouseSourceCode(String houseSourceCode) {
        this.houseSourceCode = houseSourceCode == null ? null : houseSourceCode.trim();
    }

    public String getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode == null ? null : houseCode.trim();
    }

    public String getRatingAddress() {
        return ratingAddress;
    }

    public void setRatingAddress(String ratingAddress) {
        this.ratingAddress = ratingAddress == null ? null : ratingAddress.trim();
    }

    public Integer getZiroomVersionId() {
        return ziroomVersionId;
    }

    public void setZiroomVersionId(Integer ziroomVersionId) {
        this.ziroomVersionId = ziroomVersionId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCompanyHouseSource() {
        return companyHouseSource;
    }

    public void setCompanyHouseSource(Integer companyHouseSource) {
        this.companyHouseSource = companyHouseSource;
    }

    public String getBzOrderExtend() {
        return bzOrderExtend;
    }

    public void setBzOrderExtend(String bzOrderExtend) {
        this.bzOrderExtend = bzOrderExtend == null ? null : bzOrderExtend.trim();
    }

    public LocalDateTime getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(LocalDateTime orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public LocalDateTime getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(LocalDateTime lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getDesignState() {
        return designState;
    }

    public void setDesignState(Integer designState) {
        this.designState = designState;
    }

    public Integer getHireContractIsDel() {
        return hireContractIsDel;
    }

    public void setHireContractIsDel(Integer hireContractIsDel) {
        this.hireContractIsDel = hireContractIsDel;
    }

    public Integer getApprovalConfigCount() {
        return approvalConfigCount;
    }

    public void setApprovalConfigCount(Integer approvalConfigCount) {
        this.approvalConfigCount = approvalConfigCount;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant == null ? null : assistant.trim();
    }

    public String getAssistantCode() {
        return assistantCode;
    }

    public void setAssistantCode(String assistantCode) {
        this.assistantCode = assistantCode == null ? null : assistantCode.trim();
    }

    public String getConfigAuditStatus() {
        return configAuditStatus;
    }

    public void setConfigAuditStatus(String configAuditStatus) {
        this.configAuditStatus = configAuditStatus == null ? null : configAuditStatus.trim();
    }

    public Integer getSelfCheckStatus() {
        return selfCheckStatus;
    }

    public void setSelfCheckStatus(Integer selfCheckStatus) {
        this.selfCheckStatus = selfCheckStatus;
    }

    public Integer getDispatchOrderStatus() {
        return dispatchOrderStatus;
    }

    public void setDispatchOrderStatus(Integer dispatchOrderStatus) {
        this.dispatchOrderStatus = dispatchOrderStatus;
    }

    public String getOrderLabelStr() {
        return orderLabelStr;
    }

    public void setOrderLabelStr(String orderLabelStr) {
        this.orderLabelStr = orderLabelStr == null ? null : orderLabelStr.trim();
    }

    public Integer getDismantleStatus() {
        return dismantleStatus;
    }

    public void setDismantleStatus(Integer dismantleStatus) {
        this.dismantleStatus = dismantleStatus;
    }

    public Integer getStartWorkStatus() {
        return startWorkStatus;
    }

    public void setStartWorkStatus(Integer startWorkStatus) {
        this.startWorkStatus = startWorkStatus;
    }

    public Integer getDesignMonitorStatus() {
        return designMonitorStatus;
    }

    public void setDesignMonitorStatus(Integer designMonitorStatus) {
        this.designMonitorStatus = designMonitorStatus;
    }

    public String getCustomMetricStatus() {
        return customMetricStatus;
    }

    public void setCustomMetricStatus(String customMetricStatus) {
        this.customMetricStatus = customMetricStatus == null ? null : customMetricStatus.trim();
    }

    public String getKitchenDesignStatus() {
        return kitchenDesignStatus;
    }

    public void setKitchenDesignStatus(String kitchenDesignStatus) {
        this.kitchenDesignStatus = kitchenDesignStatus == null ? null : kitchenDesignStatus.trim();
    }

    public Integer getSuspensionType() {
        return suspensionType;
    }

    public void setSuspensionType(Integer suspensionType) {
        this.suspensionType = suspensionType;
    }

    public Integer getPresentationVersionNo() {
        return presentationVersionNo;
    }

    public void setPresentationVersionNo(Integer presentationVersionNo) {
        this.presentationVersionNo = presentationVersionNo;
    }

    public LocalDateTime getApplySuspensionDate() {
        return applySuspensionDate;
    }

    public void setApplySuspensionDate(LocalDateTime applySuspensionDate) {
        this.applySuspensionDate = applySuspensionDate;
    }

    public LocalDateTime getRemoveSuspensionDate() {
        return removeSuspensionDate;
    }

    public void setRemoveSuspensionDate(LocalDateTime removeSuspensionDate) {
        this.removeSuspensionDate = removeSuspensionDate;
    }

    public Integer getLayLineAcceptState() {
        return layLineAcceptState;
    }

    public void setLayLineAcceptState(Integer layLineAcceptState) {
        this.layLineAcceptState = layLineAcceptState;
    }

    public Integer getWaterElectricityAcceptState() {
        return waterElectricityAcceptState;
    }

    public void setWaterElectricityAcceptState(Integer waterElectricityAcceptState) {
        this.waterElectricityAcceptState = waterElectricityAcceptState;
    }

    public Integer getWaterProofAcceptState() {
        return waterProofAcceptState;
    }

    public void setWaterProofAcceptState(Integer waterProofAcceptState) {
        this.waterProofAcceptState = waterProofAcceptState;
    }

    public Integer getOilTileAcceptState() {
        return oilTileAcceptState;
    }

    public void setOilTileAcceptState(Integer oilTileAcceptState) {
        this.oilTileAcceptState = oilTileAcceptState;
    }

    public Integer getHardCoverAcceptState() {
        return hardCoverAcceptState;
    }

    public void setHardCoverAcceptState(Integer hardCoverAcceptState) {
        this.hardCoverAcceptState = hardCoverAcceptState;
    }

    public String getOrderOo() {
        return orderOo;
    }

    public void setOrderOo(String orderOo) {
        this.orderOo = orderOo == null ? null : orderOo.trim();
    }

    public String getOrderOoCode() {
        return orderOoCode;
    }

    public void setOrderOoCode(String orderOoCode) {
        this.orderOoCode = orderOoCode == null ? null : orderOoCode.trim();
    }

    public String getOrderOoManager() {
        return orderOoManager;
    }

    public void setOrderOoManager(String orderOoManager) {
        this.orderOoManager = orderOoManager == null ? null : orderOoManager.trim();
    }

    public String getOrderOoManagerCode() {
        return orderOoManagerCode;
    }

    public void setOrderOoManagerCode(String orderOoManagerCode) {
        this.orderOoManagerCode = orderOoManagerCode == null ? null : orderOoManagerCode.trim();
    }

    public String getOrderOoAssist() {
        return orderOoAssist;
    }

    public void setOrderOoAssist(String orderOoAssist) {
        this.orderOoAssist = orderOoAssist == null ? null : orderOoAssist.trim();
    }

    public String getOrderOoAssistCode() {
        return orderOoAssistCode;
    }

    public void setOrderOoAssistCode(String orderOoAssistCode) {
        this.orderOoAssistCode = orderOoAssistCode == null ? null : orderOoAssistCode.trim();
    }

    public String getOrderOoTag() {
        return orderOoTag;
    }

    public void setOrderOoTag(String orderOoTag) {
        this.orderOoTag = orderOoTag == null ? null : orderOoTag.trim();
    }
}