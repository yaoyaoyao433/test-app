package com.sankuai.waimai.alita.platform.init;

import android.os.Build;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.init.h;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static final String b = Build.MODEL;
    private static h c = null;

    public static h a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cddb168695eb5679a5185d45d4d6ca6c", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cddb168695eb5679a5185d45d4d6ca6c");
        }
        if (c != null) {
            return c;
        }
        return new a() { // from class: com.sankuai.waimai.alita.platform.init.c.1
        };
    }

    public static void a(h hVar) {
        c = hVar;
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a5cfe08c25b97a11655124ce65e386c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a5cfe08c25b97a11655124ce65e386c")).booleanValue() : a().l() == h.a.RELEASE;
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0262f9305b0ef82383e9ce2724d2a5c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0262f9305b0ef82383e9ce2724d2a5c")).booleanValue() : a().l() == h.a.DEVELOP;
    }

    public static JSONObject d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "775e44a25d68717a80bb26a57c8ddf92", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "775e44a25d68717a80bb26a57c8ddf92");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("appName", a().a());
            jSONObject.putOpt("appVersion", a().c());
            jSONObject.putOpt("alitaVersion", com.sankuai.waimai.alita.core.common.a.a);
            jSONObject.putOpt("deviceType", b);
            jSONObject.putOpt(DeviceInfo.OS_NAME, "android");
            jSONObject.putOpt("osVersion", a().k());
            jSONObject.putOpt("uuid", a().f());
            jSONObject.putOpt("dpid", a().i());
            jSONObject.putOpt("unionId", a().h());
            jSONObject.putOpt(DeviceInfo.USER_ID, a().i());
            jSONObject.putOpt("userName", a().j());
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
