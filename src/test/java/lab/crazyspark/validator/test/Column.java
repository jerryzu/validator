package lab.crazyspark.validator.test;

import lab.crazyspark.validator.mysql.MySQLColumn;

@MySQLColumn(colName = "colName", dataType = "dataType", colLen = "colLen", precision = "precision", scale = "scale", message = "column rule not match")
public class Column {
	private String schemaName;
	private Integer tableID;
	private String tableName;
	private boolean IsMasterKey;
	private Integer colID;
	private String colName;
	private String colDesc;
	private String dataType;
	private Integer colLen;
	private String charUsed;
	private Integer precision;
	private Integer scale;
	private boolean nullable;
	private String remark;
	private Integer status;

	public String getSchemaName() {
		return schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

	public Integer getTableID() {
		return tableID;
	}

	public void setTableID(Integer tableID) {
		this.tableID = tableID;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public boolean isIsMasterKey() {
		return IsMasterKey;
	}

	public void setIsMasterKey(boolean isMasterKey) {
		IsMasterKey = isMasterKey;
	}

	public Integer getColID() {
		return colID;
	}

	public void setColID(Integer colID) {
		this.colID = colID;
	}

	public String getColName() {
		return colName;
	}

	public void setColName(String colName) {
		this.colName = colName;
	}

	public String getColDesc() {
		return colDesc;
	}

	public void setColDesc(String colDesc) {
		this.colDesc = colDesc;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Integer getColLen() {
		return colLen;
	}

	public void setColLen(Integer colLen) {
		this.colLen = colLen;
	}

	public String getCharUsed() {
		return charUsed;
	}

	public void setCharUsed(String charUsed) {
		this.charUsed = charUsed;
	}

	public Integer getPrecision() {
		return precision;
	}

	public void setPrecision(Integer precision) {
		this.precision = precision;
	}

	public Integer getScale() {
		return scale;
	}

	public void setScale(Integer scale) {
		this.scale = scale;
	}

	public boolean isNullable() {
		return nullable;
	}

	public void setNullable(boolean nullable) {
		this.nullable = nullable;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}