package com.eligible.model.coverage;

import com.eligible.model.EligibleObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@Getter
@EqualsAndHashCode(callSuper = false)
public class FinancialFlow extends EligibleObject {
    String percent;
    String amount;
    String timePeriod;
    String timePeriodLabel;
    String level;
    String network;
    String insuranceType;
    String insuranceTypeLabel;
    String pos;
    String posLabel;
    Boolean authorizationRequired;
    String description;
    String quantityCode;
    String quantityLabel;
    String quantity;
    List<ContactDetail> contactDetails;
    Dates dates;
    List<String> comments;
    Boolean copayment;
    Boolean coinsurance;
    Boolean deductible;
    ServiceDelivery serviceDelivery;
    String serviceType;
}
