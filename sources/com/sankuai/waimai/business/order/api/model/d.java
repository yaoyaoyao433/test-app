package com.sankuai.waimai.business.order.api.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class d {
    @SerializedName("id")
    public String a;
    @SerializedName("hash_id")
    public String b;
    @SerializedName("tradeno")
    public String c;
    @SerializedName("support_paytypes")
    public int d;
    @SerializedName(DeviceInfo.SIGN)
    public String e;
    @SerializedName("use_credit")
    public boolean f;
    @SerializedName("pay_token")
    public String g;
    @SerializedName("pay_tip")
    public String h;
    @SerializedName("retry_after")
    public int i;
    @SerializedName("next_action")
    public int j;
    @SerializedName("pay_ext")
    public i k;
    @SerializedName("speed_pay")
    public int l;
    @SerializedName("payment_type")
    public int m;
}
