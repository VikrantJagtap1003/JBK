package com.endurance1.entity;

public class EquipmentRegistration {

	private int equipmentID;
	private String equipmentName;
	private String equipmentType; // (Cardio, Strength, etc.)
	private String purchaseDate;
	private String currentStatus;// (In Use, Under Maintenance, Out of Order)
	private int equipmentCount;

	public int getEquipmentCount() {
		return equipmentCount;
	}

	public void setEquipmentCount(int equipmentCount) {
		this.equipmentCount = equipmentCount;
	}

	public EquipmentRegistration() {
		super();
	}

	@Override
	public String toString() {
		return "EquipmentRegistration [equipmentID=" + equipmentID + ", equipmentName=" + equipmentName
				+ ", equipmentType=" + equipmentType + ", purchaseDate=" + purchaseDate + ", currentStatus="
				+ currentStatus + "]";
	}

	public EquipmentRegistration(int equipmentID, String equipmentName, String equipmentType, String purchaseDate,
			String currentStatus) {
		super();
		this.equipmentID = equipmentID;
		this.equipmentName = equipmentName;
		this.equipmentType = equipmentType;
		this.purchaseDate = purchaseDate;
		this.currentStatus = currentStatus;
	}

	public int getEquipmentID() {
		return equipmentID;
	}

	public void setEquipmentID(int equipmentID) {
		this.equipmentID = equipmentID;
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}
}
