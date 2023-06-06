package com.sankuai.waimai.bussiness.order.confirm.coupon.model;

import com.google.gson.annotations.SerializedName;
import com.sankuai.meituan.model.dao.region.RegionLinkDao;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e implements Serializable {
    @SerializedName("title")
    public String a;
    @SerializedName("guide_text")
    public String b;
    @SerializedName("button_text")
    public String c;
    @SerializedName("coupon_amount")
    public String d;
    @SerializedName("coupon_name")
    public String e;
    @SerializedName("use_limit")
    public String f;
    @SerializedName(RegionLinkDao.TABLENAME)
    public String g;
    @SerializedName("member_card_biz_type")
    public String h;
}
