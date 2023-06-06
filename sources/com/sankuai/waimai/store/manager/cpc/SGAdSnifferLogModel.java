package com.sankuai.waimai.store.manager.cpc;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGAdSnifferLogModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("actualAddress")
    public String actualAddress;
    @SerializedName("ad_attr")
    public String adAttr;
    @SerializedName("ad_mark")
    public boolean adMark;
    @SerializedName("ad_type")
    public int adType;
    @SerializedName("charge_info")
    public String chargeInfo;
    @SerializedName("x_env")
    public String env;
    @SerializedName("error_params")
    public String errorParams;
    @SerializedName(Constants.PRIVACY.KEY_LATITUDE)
    public double latitude;
    @SerializedName(Constants.PRIVACY.KEY_LONGITUDE)
    public double longitude;
    @SerializedName("miss_params")
    public String missingParams;
    @SerializedName("wm_poi_id")
    public long poiID;
    @SerializedName(AgainManager.EXTRA_POI_NAME)
    public String poiName;
    @SerializedName("rank_trace_id")
    public String rankTraceID;
    @SerializedName("reqParams")
    public String reqParams;
    @SerializedName("TraceID")
    public String traceID;

    public static String getCid() {
        return "";
    }
}
