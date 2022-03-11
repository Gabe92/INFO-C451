/*
 * Gabriel Agbo
 * Virtual Library/Library Management System Project
 * INFO-C451
 * 03/11/2022
 */

package com.teamsix.virtuallibrary.models;

import java.util.Date; 

public class Member {
    
    public int memberId;
    public int libraryId;
    public String memberFirstName;
    public String memberLastName;
    public String memberPhoneNumber;
    public String memberEmail; 
    public Date dateCreated; 
    public String status; 
    public Boolean isActive; 
     
    public Member (int memberId, int libraryId, String memberFirstName, 
            String memberLastName, String memberPhoneNumber, 
            String memberEmail, Date dateCreated, String status, 
            Boolean isActive) {
        
        this.memberId = memberId;
        this.libraryId = libraryId; 
        this.memberFirstName = memberFirstName;
        this.memberLastName = memberLastName;
        this.memberPhoneNumber = memberPhoneNumber;    
        this.memberEmail = memberEmail; 
        this.dateCreated = dateCreated;
        this.status = status; 
        this.isActive = isActive; 
    }
    
    public int getMemberId () {
        return this.memberId;
    }
   
    public void setMemberId (int memberId) {
        this.memberId = memberId;
    }
    
    public int getLibraryId () {
        return this.libraryId;
    }
   
    public void setLibraryId (int libraryId) {
        this.libraryId = libraryId;
    }
    
    public String getMemberFirstName () {
        return this.memberFirstName; 
    }
    
    public void setMemberFirstName (String memberFirstName) {
        this.memberFirstName = memberFirstName; 
    }
    
    public String getMemberLastName () {
        return this.memberLastName; 
    }
    
    public void setMemberLastName (String memberLastName) {
        this.memberLastName = memberLastName; 
    }
    
    public String getMemberPhoneNumber () {
        return this.memberPhoneNumber; 
    }
    
    public void setMemberPhoneNumber (String memberPhoneNumber) {
        this.memberPhoneNumber = memberPhoneNumber; 
    }
    
    public String getMemberEmail () {
        return this.memberEmail; 
    }
    
    public void setMemberEmail (String memberEmail) {
        this.memberEmail = memberEmail; 
    }
    
    public Date getDateCreated () {
        return this.dateCreated;
    }
    
    public void setDateCreated (Date dateCreated) {
        this.dateCreated = dateCreated; 
    }
    
    public String getStatus () {
        return this.status; 
    }
    
    public void setStatus (String status) {
        this.status = status; 
    }
    
    public boolean getIsActive () {
        return this.isActive;
    }
   
    public void setIsActive (boolean isActive) {
        this.isActive = isActive;
    }
}