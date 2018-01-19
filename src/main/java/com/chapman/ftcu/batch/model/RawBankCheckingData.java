package com.chapman.ftcu.batch.model;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author or0189783
 *
 */

@XmlRootElement(name="rawbankcheckingdata")
public class RawBankCheckingData {

	//Transaction ID	Posting Date	Effective Date	Transaction Type	
	//Amount	Check Number	Reference Number	Payee	Memo	Transaction Category	Type	Balance
	private String transactionId; //Transaction ID
	private LocalDate postingDate; //Posting Date	
	private LocalDate effectiveDate; //Effective Date
	private String transactionType;//Transaction Type	
	private Double amount; //Amount	
	private Long checkNumber; //Check_Number
	private String referenceNumber; //Reference Number	
	private String payee; //Payee							
	private String memo; //Memo				
	private String extDesc; //added for bulk updates
	private String transactionCategory; //Transaction Category		
	private String type; //Type	
	private Double balance; //Balance	
	
	public RawBankCheckingData() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the postingDate
	 */
	public LocalDate getPostingDate() {
		return postingDate;
	}

	/**
	 * @return the effectiveDate
	 */
	public LocalDate getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * @return the transactionType
	 */
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 * @return the referenceNumber
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * @return the payee
	 */
	public String getPayee() {
		return payee;
	}

	/**
	 * @return the memo
	 */
 	public String getMemo() {
		return memo;
	}
	
	/**
	 * @return the memo
	 */
	public String getExtDesc() {
		return extDesc;
	}

	/**
	 * @return the transactionCategory
	 */
	public String getTransactionCategory() {
		return transactionCategory;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @return the checkNumber
	 */
	public Long getCheckNumber() {
		return checkNumber;
	}

	/**
	 * @return the balance
	 */
	public Double getBalance() {
		return balance;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @param checkNumber the checkNumber to set
	 */
	public void setCheckNumber(Long checkNumber) {
		this.checkNumber = checkNumber;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	/**
	 * @param postingDate the postingDate to set
	 */
	public void setPostingDate(LocalDate postingDate) {
		this.postingDate = postingDate;
	}

	/**
	 * @param effectiveDate the effectiveDate to set
	 */
	public void setEffectiveDate(LocalDate effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	/**
	 * @param referenceNumber the referenceNumber to set
	 */
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	/**
	 * @param payee the payee to set
	 */
	public void setPayee(String payee) {
		this.payee = payee;
	}

	/**
	 * @param memo the memo to set
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	/**
	 * @param memo the extDesc to set
	 */
	public void setExtDesc(String extDesc) {
		this.extDesc = extDesc;
	}

	/**
	 * @param transactionCategory the transactionCategory to set
	 */
	public void setTransactionCategory(String transactionCategory) {
		this.transactionCategory = transactionCategory;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "RawBankCheckingData [transactionId=" + transactionId + ", postingDate=" + postingDate
				+ ", effectiveDate=" + effectiveDate + ", transactionType=" + transactionType + ", amount=" + amount
				+ ", checkNumber=" + checkNumber + ", referenceNumber=" + referenceNumber + ", payee=" + payee
				+ ", memo=" + memo + ", extDesc=" + extDesc + ", transactionCategory=" + transactionCategory + ", type="
				+ type + ", balance=" + balance + "]";
	}

}
