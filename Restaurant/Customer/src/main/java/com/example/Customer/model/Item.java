package com.example.Customer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table 
public class Item {
    @Id
    private String id;
    @Column
    private String status;
    @Column
    private String location;
    @Column
    private String pincode;
    @Column
    private String deliveryMode;
	public Item()
	{
		
	}
    public Item(String string, String string2, String string3, String string4, String string5) {
        id=string;
		status = string2;
        location=string3;
        pincode=string4;
        deliveryMode=string5;
    }
    
    

    /**
     * @return String return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return String return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return String return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return String return the pincode
     */
    public String getPincode() {
        return pincode;
    }

    /**
     * @param pincode the pincode to set
     */
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    /**
     * @return String return the deliveryMode
     */
    public String getDeliveryMode() {
        return deliveryMode;
    }

    /**
     * @param deliveryMode the deliveryMode to set
     */
    public void setDeliveryMode(String deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

}

