package com.meituan.android.cashier.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class OrderInfoContent implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8956332120470945187L;
    @SerializedName("item_name")
    private String itemName;
    @SerializedName("item_value")
    private String itemValue;

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String str) {
        this.itemName = str;
    }

    public String getItemValue() {
        return this.itemValue;
    }

    public void setItemValue(String str) {
        this.itemValue = str;
    }
}
