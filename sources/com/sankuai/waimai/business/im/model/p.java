package com.sankuai.waimai.business.im.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class p implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("content")
    public String b;
    @SerializedName("button_text")
    public String c;
    @SerializedName(AgainManager.EXTRA_POI_NAME)
    public String d;
    @SerializedName("button_toast")
    public String e;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String f;
    @SerializedName("poi_id")
    public long g;

    public static p a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89cff5cef58ab8161bd82af6e53e0e20", RobustBitConfig.DEFAULT_VALUE)) {
            return (p) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89cff5cef58ab8161bd82af6e53e0e20");
        }
        if (jSONObject == null) {
            return null;
        }
        return (p) new Gson().fromJson(jSONObject.toString(), (Class<Object>) p.class);
    }
}
