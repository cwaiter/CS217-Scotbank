package uk.co.asepstrath.bank.util;

import com.google.gson.annotations.SerializedName;

public enum AccountCategory {
    @SerializedName("GROCERY")
    Grocery,
    @SerializedName("BILLS")
    Bills,
    @SerializedName("FOOD")
    Food,
    @SerializedName("ENTERTAINMENT")
    Entertainment,
    @SerializedName("PAYMENT")
    Payment;

    public String toString() {
        return this.name();
    }
}
