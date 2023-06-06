package com.sankuai.waimai.business.order.api.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class i {
    public static ChangeQuickRedirect a;
    @SerializedName("auth_request_code")
    public String b;
    @SerializedName("auth_response_code")
    public String c;
    @SerializedName("auth_type")
    public String d;
    @SerializedName(HybridSignPayJSHandler.ARG_TRADE_NO)
    public String e;
    @SerializedName("pay_token")
    public String f;
    @SerializedName("pay_btime")
    public String g;
    @SerializedName("auth_link")
    public String h;
    @SerializedName("pay_scheme")
    public String i;

    public final Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "207b518e3547ba54962899d342ffb029", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "207b518e3547ba54962899d342ffb029");
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(com.sankuai.waimai.foundation.location.v2.d.a().toJson(this));
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            }
            return hashMap;
        } catch (JSONException e) {
            e.printStackTrace();
            return hashMap;
        }
    }
}
