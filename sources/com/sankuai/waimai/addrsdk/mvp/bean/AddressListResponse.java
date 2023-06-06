package com.sankuai.waimai.addrsdk.mvp.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AddressListResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("address_list")
    public List<AddressBean> addressList;
    @SerializedName("address_type")
    public int addressType = 1;
    @SerializedName("extra")
    public String extra;
}
