package com.sankuai.waimai.platform.net.networkdiagnose.strategy;

import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.g;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18815675fcba53a39012c8f54ead0548", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18815675fcba53a39012c8f54ead0548");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uuid", com.sankuai.waimai.platform.b.A().c());
            jSONObject.put(Constants.Environment.KEY_CITYID, g.a());
            jSONObject.put("cityname", g.b());
            jSONObject.put("visitid", com.sankuai.waimai.platform.b.A().f());
            jSONObject.put("pushtoken", com.sankuai.waimai.platform.b.A().D());
            jSONObject.put(AppUtil.CacheKey.DEVICEID, com.sankuai.waimai.platform.b.A().b());
            jSONObject.put("dtype", com.sankuai.waimai.platform.b.A().g());
            jSONObject.put("dversion", com.sankuai.waimai.platform.b.A().h());
            jSONObject.put("appversion", com.sankuai.waimai.platform.b.A().i());
            jSONObject.put("appversioncode", com.sankuai.waimai.platform.b.A().j());
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return jSONObject.toString();
    }
}
