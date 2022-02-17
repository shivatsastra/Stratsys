package io.swagger.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Attribute
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-20T07:48:45.337Z[GMT]")
@JsonIgnoreProperties(ignoreUnknown = true, value = { "itemNo", "itemType" })
public class Attribute {
	@JsonProperty("saleStartDateGlobal")
	private String saleStartDateGlobal = null;

	@JsonProperty("saleEndDateGlobal")
	private String saleEndDateGlobal = null;

	@JsonProperty("requiresAssemblyYN")
	private Boolean requiresAssemblyYN = null;

	@JsonProperty("unitNameEn")
	private String unitNameEn = null;

	@JsonProperty("validDesigner")
	private String validDesigner = null;

	@JsonProperty("salesCombinationYN")
	private Boolean salesCombinationYN = null;
	
	@JsonProperty("colourDotNo")
	private String colourDotNo = null;	

	@JsonProperty("registerDate")
	private String registerDate = null;

	@JsonProperty("updateDate")
	private String updateDate = null;

	@JsonProperty("deleteDate")
	private String deleteDate = null;

	public Attribute saleStartDateGlobal(String saleStartDateGlobal) {
		this.saleStartDateGlobal = saleStartDateGlobal;
		return this;
	}

	/**
	 * The first start date sales in any market. This date is also used for
	 * consumers having non-customer facing applications to steer the available
	 * range in any market.
	 * 
	 * @return saleStartDateGlobal
	 **/
	@ApiModelProperty(example = "2001-02-01", value = "The first start date sales in any market. This date is also used for consumers having non-customer facing applications to steer the available range in any market.")

	public String getSaleStartDateGlobal() {
		return saleStartDateGlobal;
	}

	public void setSaleStartDateGlobal(String saleStartDateGlobal) {
		this.saleStartDateGlobal = saleStartDateGlobal;
	}

	public Attribute saleEndDateGlobal(String saleEndDateGlobal) {
		this.saleEndDateGlobal = saleEndDateGlobal;
		return this;
	}

	/**
	 * The first start date sales in any market. This date is also used for
	 * consumers having non-customer facing applications to steer the available
	 * range in any market.
	 * 
	 * @return saleStartDateGlobal
	 **/
	@ApiModelProperty(example = "2001-02-01", value = "The first start end sales in any market. This date is also used for consumers having non-customer facing applications to steer the available range in any market.")

	public String getSaleEndDateGlobal() {
		return saleEndDateGlobal;
	}

	public void setSaleEndDateGlobal(String saleEndDateGlobal) {
		this.saleEndDateGlobal = saleEndDateGlobal;
	}

	public Attribute requiresAssemblyYN(Boolean requiresAssemblyYN) {
		this.requiresAssemblyYN = requiresAssemblyYN;
		return this;
	}

	/**
	 * Indicates if the item requires assembly or not. Only applicable for Items of
	 * type ART. Possible values are Y and N.
	 * 
	 * @return requiresAssemblyYN
	 **/
	@ApiModelProperty(example = "true", value = "Indicates if the item requires assembly or not. Only applicable for Items of type ART. Possible values are Y and N.")

	public Boolean isRequiresAssemblyYN() {
		return requiresAssemblyYN;
	}

	public void setRequiresAssemblyYN(Boolean requiresAssemblyYN) {
		this.requiresAssemblyYN = requiresAssemblyYN;
	}

	public Attribute unitNameEn(String unitNameEn) {
		this.unitNameEn = unitNameEn;
		return this;
	}

	/**
	 * Described how this item is sold. The enumeration holds currently two values->
	 * PIECE – Indicates that the item is sold having the same price for all units
	 * of that that specific item. Examples are most of the items in the IKEA Range.
	 * METER – Indicates that this item is sold per METER and that the price varies
	 * depending the customer’s choice regarding the required amount of the product.
	 * Examples are typically fabrics etc.\"
	 * 
	 * @return unitNameEn
	 **/
	@ApiModelProperty(example = "PIECE", value = "Described how this item is sold. The enumeration holds currently two values->  PIECE – Indicates that the item is sold having the same price for all units of that that specific item. Examples are most of the items in the IKEA Range.  METER – Indicates that this item is sold per METER and that the price varies depending the customer’s choice regarding the required amount of the product. Examples are typically fabrics etc.\"")

	public String getUnitNameEn() {
		return unitNameEn;
	}

	public void setUnitNameEn(String unitNameEn) {
		this.unitNameEn = unitNameEn;
	}

	public Attribute validDesigner(String validDesigner) {
		this.validDesigner = validDesigner;
		return this;
	}

	/**
	 * Name of the designer(s) that designed the item in question. Could be
	 * individual persons or referenced to the organization IKEA of Sweden
	 * 
	 * @return validDesigner
	 **/
	@ApiModelProperty(example = "IKEA of Sweden", value = "Name of the designer(s) that designed the item in question. Could be individual persons or referenced to the organization IKEA of Sweden")

	public String getValidDesigner() {
		return validDesigner;
	}

	public void setValidDesigner(String validDesigner) {
		this.validDesigner = validDesigner;
	}

	public Attribute salesCombinationYN(Boolean salesCombinationYN) {
		this.salesCombinationYN = salesCombinationYN;
		return this;
	}

	/**
	 * Indicates if this is a sales combination
	 * 
	 * @return salesCombinationYN
	 **/
	@ApiModelProperty(value = "Indicates if this is a sales combination")

	public Boolean isSalesCombinationYN() {
		return salesCombinationYN;
	}

	public void setSalesCombinationYN(Boolean salesCombinationYN) {
		this.salesCombinationYN = salesCombinationYN;
	}
	
	public Attribute colourDotNo(String colourDotNo) {
		this.colourDotNo = colourDotNo;
		return this;
	}

	/**
	 * Identification for the colour dot image to sticked on the carriers
	 * 
	 * @return colourDotNo
	 **/
	@ApiModelProperty(example = "00012", value = "Identification for the colour dot image to sticked on the carriers")

	public String getColourDotNo() {
		return colourDotNo;
	}

	public void setColourDotNo(String colourDotNo) {
		this.colourDotNo = colourDotNo;
	}

	public Attribute registerDate(String registerDate) {
		this.registerDate = registerDate;
		return this;
	}

	/**
	 * Get registerDate
	 * 
	 * @return registerDate
	 **/
	@ApiModelProperty(value = "")

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public Attribute updateDate(String updateDate) {
		this.updateDate = updateDate;
		return this;
	}

	/**
	 * Get updateDate
	 * 
	 * @return updateDate
	 **/
	@ApiModelProperty(value = "")

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public Attribute deleteDate(String deleteDate) {
		this.deleteDate = deleteDate;
		return this;
	}

	/**
	 * Get deleteDate
	 * 
	 * @return deleteDate
	 **/
	@ApiModelProperty(value = "")

	public String getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(String deleteDate) {
		this.deleteDate = deleteDate;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Attribute attribute = (Attribute) o;
		return Objects.equals(this.saleStartDateGlobal, attribute.saleStartDateGlobal)
				&& Objects.equals(this.saleEndDateGlobal, attribute.saleEndDateGlobal)
				&& Objects.equals(this.requiresAssemblyYN, attribute.requiresAssemblyYN)
				&& Objects.equals(this.unitNameEn, attribute.unitNameEn)
				&& Objects.equals(this.validDesigner, attribute.validDesigner)
				&& Objects.equals(this.salesCombinationYN, attribute.salesCombinationYN)
				&& Objects.equals(this.colourDotNo, attribute.colourDotNo)
				&& Objects.equals(this.registerDate, attribute.registerDate)
				&& Objects.equals(this.updateDate, attribute.updateDate)
				&& Objects.equals(this.deleteDate, attribute.deleteDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(saleStartDateGlobal, saleEndDateGlobal, requiresAssemblyYN, unitNameEn, validDesigner,
				salesCombinationYN, colourDotNo, registerDate, updateDate, deleteDate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Attribute {\n");

		sb.append("    saleStartDateGlobal: ").append(toIndentedString(saleStartDateGlobal)).append("\n");
		sb.append("    saleEndDateGlobal: ").append(toIndentedString(saleEndDateGlobal)).append("\n");
		sb.append("    requiresAssemblyYN: ").append(toIndentedString(requiresAssemblyYN)).append("\n");
		sb.append("    unitNameEn: ").append(toIndentedString(unitNameEn)).append("\n");
		sb.append("    validDesigner: ").append(toIndentedString(validDesigner)).append("\n");
		sb.append("    salesCombinationYN: ").append(toIndentedString(salesCombinationYN)).append("\n");
		sb.append("    colourDotNo: ").append(toIndentedString(colourDotNo)).append("\n");
		sb.append("    registerDate: ").append(toIndentedString(registerDate)).append("\n");
		sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
		sb.append("    deleteDate: ").append(toIndentedString(deleteDate)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	private String itemNo = null;

	private String itemType = null;

	/**
	 * @return the itemNo
	 */
	public String getItemNo() {
		return itemNo;
	}

	/**
	 * @param itemNo the itemNo to set
	 */
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	/**
	 * @return the itemType
	 */
	public String getItemType() {
		return itemType;
	}

	/**
	 * @param itemType the itemType to set
	 */
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
}
