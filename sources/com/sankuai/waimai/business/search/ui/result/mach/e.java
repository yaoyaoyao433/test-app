package com.sankuai.waimai.business.search.ui.result.mach;

import android.app.Activity;
import android.os.SystemClock;
import com.meituan.android.common.aidata.ai.bundle.cache.CacheException;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static void a(String str, Activity activity) {
        Object[] objArr = {str, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3ff09218df5c17554ef0e37cde0562a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3ff09218df5c17554ef0e37cde0562a");
            return;
        }
        com.sankuai.waimai.platform.capacity.log.c.a().a(CacheException.MANAGER_NOT_INIT, "mach/business/wm-search-result", SystemClock.elapsedRealtime());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("template_id", str);
            jSONObject.put("newUser", com.sankuai.waimai.mach.manager_new.b.a().d);
            jSONObject.put("networktype", com.sankuai.waimai.mach.manager_new.common.h.a().b());
            jSONObject.put("WeakNetwork", com.sankuai.waimai.platform.net.d.a().d);
            jSONObject.put("NetworkQuality", com.sankuai.waimai.platform.net.d.a().e);
            jSONObject.put("deviceLevel", DeviceUtil.getDeviceLevel(activity));
            com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.platform.mach.statistics.c().a("mach_load_search").b("template download failed").d(jSONObject.toString()).b());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("template_id", str);
            jSONObject2.put("case_tag", "loadTemplateFailed");
            com.sankuai.waimai.platform.capacity.log.i.a(new com.sankuai.waimai.platform.mach.statistics.c().a("mach_search").d(jSONObject2.toString()).b());
        } catch (Exception unused) {
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b9889a8c16d14bae49d71b7bb1530b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b9889a8c16d14bae49d71b7bb1530b3");
            return;
        }
        com.sankuai.waimai.platform.capacity.log.c.a().a(CacheException.LOAD_BUNDLE_SUCCESS_RENDER_FAILURE, "mach/business/wm-search-result", SystemClock.elapsedRealtime());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("template_id", str);
            jSONObject.put("case_tag", "preRenderFailed");
            jSONObject.put("data", str2);
            com.sankuai.waimai.platform.capacity.log.i.a(new com.sankuai.waimai.platform.mach.statistics.c().a("mach_search").d(jSONObject.toString()).b());
        } catch (Exception unused) {
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3960348ef967ad4c9d01652d57fc140e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3960348ef967ad4c9d01652d57fc140e");
        } else {
            com.sankuai.waimai.platform.capacity.log.c.a().a(CacheException.LOAD_BUNDLE_SUCCESS_RENDER_SUCCESS, "mach/business/wm-search-result", SystemClock.elapsedRealtime());
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2225649f957927d357f448aa3eda4d61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2225649f957927d357f448aa3eda4d61");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("template_id", str);
            jSONObject.put("data", "");
            com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.platform.mach.statistics.c().a("mach_load_search").b("template download success").d(jSONObject.toString()).b());
        } catch (Exception unused) {
        }
    }
}
