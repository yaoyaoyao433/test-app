package com.sankuai.waimai.store.goods.list.sniffer;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.base.net.sg.c;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGGoodListSnifferLogFoodModel extends SGGoodListSnifferCommonModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("containerType")
    public int containerType;
    @SerializedName("reqParams")
    public String reqParams;
    @SerializedName("result")
    public String result;
    @SerializedName("TraceId")
    public String traceId;

    public SGGoodListSnifferLogFoodModel(String str, String str2, String str3, RestMenuResponse restMenuResponse) {
        this.env = c.a().b();
        this.traceId = str;
        this.reqParams = str2;
        this.result = str3;
        if (restMenuResponse != null) {
            this.containerType = restMenuResponse.getTemplateType();
            if (restMenuResponse.getPoi() != null) {
                this.buzType = restMenuResponse.getPoi().getBuzType();
                this.poiName = restMenuResponse.getPoi().getName();
            }
        }
    }
}
