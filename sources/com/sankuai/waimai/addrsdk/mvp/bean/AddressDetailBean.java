package com.sankuai.waimai.addrsdk.mvp.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AddressDetailBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("address_info")
    public AddressBean addressBean;

    public AddressBean getAddressBean() {
        return this.addressBean;
    }
}
