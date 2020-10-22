package test.model;

import java.util.Date;

public class DataSource {
    private Long id;

    private String dataName;

    private String tableName;

    private String dataSource;

    private Long dataSize;

    private Integer rowsSize;

    private Integer colsSize;

    private Integer operatorInstanceId;

    private String orgCode;

    private String status;

    private String missingValue;

    private String creator;

    private String modifier;

    private Boolean isdelete;

    private Date gmtCreate;

    private Date gmtModify;

    private String groupId;

    private String dataType;

    private String primaryKey;

    private String labelKey;

    private Boolean isdetele;

    private String extFields;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName == null ? null : dataName.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }

    public Long getDataSize() {
        return dataSize;
    }

    public void setDataSize(Long dataSize) {
        this.dataSize = dataSize;
    }

    public Integer getRowsSize() {
        return rowsSize;
    }

    public void setRowsSize(Integer rowsSize) {
        this.rowsSize = rowsSize;
    }

    public Integer getColsSize() {
        return colsSize;
    }

    public void setColsSize(Integer colsSize) {
        this.colsSize = colsSize;
    }

    public Integer getOperatorInstanceId() {
        return operatorInstanceId;
    }

    public void setOperatorInstanceId(Integer operatorInstanceId) {
        this.operatorInstanceId = operatorInstanceId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getMissingValue() {
        return missingValue;
    }

    public void setMissingValue(String missingValue) {
        this.missingValue = missingValue == null ? null : missingValue.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey == null ? null : primaryKey.trim();
    }

    public String getLabelKey() {
        return labelKey;
    }

    public void setLabelKey(String labelKey) {
        this.labelKey = labelKey == null ? null : labelKey.trim();
    }

    public Boolean getIsdetele() {
        return isdetele;
    }

    public void setIsdetele(Boolean isdetele) {
        this.isdetele = isdetele;
    }

    public String getExtFields() {
        return extFields;
    }

    public void setExtFields(String extFields) {
        this.extFields = extFields == null ? null : extFields.trim();
    }
}