package com.sankuai.waimai.store.goods.list.sniffer;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.base.net.sg.c;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGGoodListSnifferProductsLogModel extends SGGoodListSnifferCommonModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long poiId;
    @SerializedName("reqParams")
    public String reqParams;
    @SerializedName("result")
    public String result;
    @SerializedName("TraceId")
    public String traceId;

    public SGGoodListSnifferProductsLogModel(String str, String str2, String str3, Poi poi) {
        this.env = c.a().b();
        this.traceId = str;
        this.reqParams = str2;
        this.result = str3;
        if (poi != null) {
            this.buzType = poi.getBuzType();
            this.poiName = poi.getName();
        }
    }
}
