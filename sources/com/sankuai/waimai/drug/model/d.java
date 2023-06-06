package com.sankuai.waimai.drug.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.sankuai.waimai.store.platform.domain.core.base.BaseDataResponse;
import com.sankuai.waimai.store.platform.shop.model.PriceOptAB;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends BaseDataResponse {
    @SerializedName("smart_collect_switch")
    public int a;
    @SerializedName("style_type")
    public int b;
    @SerializedName("activity_text")
    public String c;
    @SerializedName("collect_title")
    public String d;
    @SerializedName("smart_collect")
    public g e;
    @SerializedName("hot_sale_collect")
    public c f;
    @SerializedName("collect_tabs")
    public b g;
    @SerializedName("drug_extra")
    public String h;
    @SerializedName("price_opt_ab")
    public PriceOptAB i;
    @SerializedName("title_pic")
    public String j;
    @SerializedName("drug_chest_pic")
    public String k;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String l;
}
