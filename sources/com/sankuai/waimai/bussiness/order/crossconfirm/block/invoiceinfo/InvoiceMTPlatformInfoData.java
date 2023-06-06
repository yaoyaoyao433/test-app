package com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class InvoiceMTPlatformInfoData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(GearsLocator.ADDRESS)
    private String address;
    @SerializedName("bankAccount")
    private String bankAccount;
    @SerializedName("bankName")
    private String bankName;
    @SerializedName("companyAddress")
    private String companyAddress;
    @SerializedName("companyTaxId")
    private String companyTaxId;
    @SerializedName("editText")
    private String editText;
    @SerializedName("email")
    private String email;
    @SerializedName("id")
    private String id;
    @SerializedName("isAvailable")
    private boolean isAvailable;
    @SerializedName("isCompleted")
    private boolean isCompleted;
    @SerializedName("phone")
    private String phone;
    @SerializedName("specialInvoice")
    private int specialInvoice;
    @SerializedName("title")
    private String title;
    @SerializedName("type")
    private int type;

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getCompanyTaxId() {
        return this.companyTaxId;
    }

    public void setCompanyTaxId(String str) {
        this.companyTaxId = str;
    }

    public String getCompanyAddress() {
        return this.companyAddress;
    }

    public void setCompanyAddress(String str) {
        this.companyAddress = str;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String str) {
        this.phone = str;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String str) {
        this.bankName = str;
    }

    public String getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(String str) {
        this.bankAccount = str;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public String getEditText() {
        return this.editText;
    }

    public void setEditText(String str) {
        this.editText = str;
    }

    public boolean isIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean z) {
        this.isAvailable = z;
    }

    public boolean isIsCompleted() {
        return this.isCompleted;
    }

    public void setIsCompleted(boolean z) {
        this.isCompleted = z;
    }

    public int getSpecialInvoice() {
        return this.specialInvoice;
    }

    public void setSpecialInvoice(int i) {
        this.specialInvoice = i;
    }
}
