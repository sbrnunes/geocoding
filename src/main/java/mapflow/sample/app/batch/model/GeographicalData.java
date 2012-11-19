package mapflow.sample.app.batch.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="GEOGRAPHICAL_DATA")
public class GeographicalData {
	@Id 
	@GeneratedValue
	private Long id;
	private Long policyNumber;
	private String account;
	private String address1;
	private String address2;
	private String region;
	private String postcodeZip;
	private String country;
	private Date inceptionDate;
	private Date expiryDate;
	private Integer riskNumber;
	private Integer totalSumInsured;
	private String floodRisk;
	private String landSlideRisk;
	private String earthquakeRisk;
	private String onSiteSecurity;
	private String fireAlarm;
	private String intruderDetectionAlarm;
	
	//Data from Google Maps API
	private float latitude;
	private float longitude;
	
	public GeographicalData() {}
	
	public Long getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(Long policyNumber) {
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
	public Date getInceptionDate() {
		return inceptionDate;
	}
	public void setInceptionDate(Date inceptionDate) {
		this.inceptionDate = inceptionDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Integer getRiskNumber() {
		return riskNumber;
	}
	public void setRiskNumber(Integer riskNumber) {
		this.riskNumber = riskNumber;
	}
	public Integer getTotalSumInsured() {
		return totalSumInsured;
	}
	public void setTotalSumInsured(Integer totalSumInsured) {
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

	public float getLatitude() {
		return latitude;
	}
	
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	
	public float getLongitude() {
		return longitude;
	}
	
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	
	
	
}
