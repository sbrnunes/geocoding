package mapflow.sample.app.batch.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GEOGRAPHICAL_DATA")
public class GeographicalData {
	@Id
	private String policyNumber;
	private String account;
	private String address1;
	private String address2;
	private String region;
	private String postcodeZip;
	private String country;
	private String inceptionDate;
	private String expiryDate;
	private String riskNumber;
	private String totalSumInsured;
	private String floodRisk;
	private String landSlideRisk;
	private String earthquakeRisk;
	private String onSiteSecurity;
	private String fireAlarm;
	private String intruderDetectionAlarm;
	private String latitude;
	private String longitude;
	
	public GeographicalData() {}
	
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPostcodeZip() {
		return postcodeZip;
	}
	public void setPostcodeZip(String postcodeZip) {
		this.postcodeZip = postcodeZip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getInceptionDate() {
		return inceptionDate;
	}
	public void setInceptionDate(String inceptionDate) {
		this.inceptionDate = inceptionDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getRiskNumber() {
		return riskNumber;
	}
	public void setRiskNumber(String riskNumber) {
		this.riskNumber = riskNumber;
	}
	public String getTotalSumInsured() {
		return totalSumInsured;
	}
	public void setTotalSumInsured(String totalSumInsured) {
		this.totalSumInsured = totalSumInsured;
	}
	public String getFloodRisk() {
		return floodRisk;
	}
	public void setFloodRisk(String floodRisk) {
		this.floodRisk = floodRisk;
	}
	public String getLandSlideRisk() {
		return landSlideRisk;
	}
	public void setLandSlideRisk(String landSlideRisk) {
		this.landSlideRisk = landSlideRisk;
	}
	public String getEarthquakeRisk() {
		return earthquakeRisk;
	}
	public void setEarthquakeRisk(String earthquakeRisk) {
		this.earthquakeRisk = earthquakeRisk;
	}
	public String getOnSiteSecurity() {
		return onSiteSecurity;
	}
	public void setOnSiteSecurity(String onSiteSecurity) {
		this.onSiteSecurity = onSiteSecurity;
	}
	public String getFireAlarm() {
		return fireAlarm;
	}
	public void setFireAlarm(String fireAlarm) {
		this.fireAlarm = fireAlarm;
	}
	public String getIntruderDetectionAlarm() {
		return intruderDetectionAlarm;
	}
	public void setIntruderDetectionAlarm(String intruderDetectionAlarm) {
		this.intruderDetectionAlarm = intruderDetectionAlarm;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	
	
}
