package com.meituan.android.preload.util;

import android.content.Context;
import android.os.Build;
import com.dianping.monitor.impl.m;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c {
    public static ChangeQuickRedirect a = null;
    public static int b = 1;
    public static int c = 2;
    private static volatile c d;
    private final AtomicInteger e;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "692a5fbd2e01be099b7cfbb50cdbb5f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "692a5fbd2e01be099b7cfbb50cdbb5f7");
        } else {
            this.e = new AtomicInteger(0);
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "236e6316765ef691112f169f5f55c396", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "236e6316765ef691112f169f5f55c396");
        }
        if (d == null) {
            synchronized (c.class) {
                if (d == null) {
                    d = new c();
                }
            }
        }
        return d;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "699b257b73e3d465f6eb778b3ab635cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "699b257b73e3d465f6eb778b3ab635cc");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enlight_create_container", Integer.valueOf(this.e.getAndIncrement()));
        Map<String, String> b2 = b();
        b2.put("biz", str);
        a(hashMap, b2);
    }

    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "326c7c6f6430f58685d8f5df705cddc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "326c7c6f6430f58685d8f5df705cddc2");
        } else if (StringUtil.NULL.equals(str2)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("enlight_get_container_success", 0);
            Map<String, String> b2 = b();
            b2.put("biz", str);
            b2.put("page", str2);
            b2.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, str3);
            a(hashMap, b2);
        }
    }

    public final void b(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d07b105a2c816859cd93d72da2d07ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d07b105a2c816859cd93d72da2d07ca");
        } else if (StringUtil.NULL.equals(str2)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("enlight_get_container_business_success", 0);
            Map<String, String> b2 = b();
            b2.put("biz", str);
            b2.put("page", str2);
            b2.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, str3);
            a(hashMap, b2);
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b68b2801878e0265f770a8f1b8e6f6bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b68b2801878e0265f770a8f1b8e6f6bd");
        } else {
            a(b, "enlight_log: ", str);
        }
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1323b1b32b94ab86baab74d7b4d41b08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1323b1b32b94ab86baab74d7b4d41b08");
        } else {
            a(c, "enlight_log: ", str);
        }
    }

    private void a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70fe5e8c8135ebc6d809429ea72e9785", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70fe5e8c8135ebc6d809429ea72e9785");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            String str3 = "";
            if (i == b) {
                str3 = "info";
            } else if (i == c) {
                str3 = "error";
            }
            jSONObject.put("level", str3);
            jSONObject.put(ShieldMonitorKey.TAG_BUSINESS, "waimai");
            jSONObject.put("category", "EnlightLogan");
            if (str2 != null) {
                jSONObject.put(SnifferDBHelper.COLUMN_LOG, str + CommonConstant.Symbol.COMMA + str2);
            } else {
                jSONObject.put(SnifferDBHelper.COLUMN_LOG, "EnlightLogan");
            }
            com.dianping.networklog.c.a(jSONObject.toString(), 3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public Map<String, String> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0346be0053f32ed8bfaf57d08e846d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0346be0053f32ed8bfaf57d08e846d7");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, c());
        switch (com.meituan.android.preload.config.d.b) {
            case PROD:
                hashMap.put("env", "prod");
                break;
            case TEST:
            case STAGE:
                hashMap.put("env", "test");
                break;
        }
        hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_SYS_VERSION, "Android" + Build.VERSION.RELEASE);
        return hashMap;
    }

    public void a(Map<String, Number> map, Map<String, String> map2) {
        int i = 1;
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4543c33313a5aeb461feccb58e8eadf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4543c33313a5aeb461feccb58e8eadf0");
            return;
        }
        Context context = com.meituan.android.singleton.b.a;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "92013d61aec390e2628ef30ae92d5af9", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "92013d61aec390e2628ef30ae92d5af9")).intValue();
        } else {
            String packageName = context.getPackageName();
            if ("com.sankuai.meituan.takeoutnew".equals(packageName)) {
                i = 11;
            } else {
                if (!"com.sankuai.meituan".equals(packageName)) {
                    if (!"com.dianping.v1".equals(packageName)) {
                        if ("com.sankuai.meituan.meituanwaimaibusiness".equals(packageName)) {
                            i = 15;
                        }
                    }
                }
                i = 10;
            }
        }
        m mVar = new m(i, context);
        if (map.size() > 0) {
            for (Map.Entry<String, Number> entry : map.entrySet()) {
                mVar.a(entry.getKey(), Collections.singletonList(Float.valueOf(entry.getValue().floatValue())));
            }
        }
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                mVar.a(entry2.getKey(), entry2.getValue());
            }
        }
        mVar.a();
    }

    private static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c4faa6bcab74a8e07474d0058c1d31b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c4faa6bcab74a8e07474d0058c1d31b");
        }
        Context context = com.meituan.android.singleton.b.a;
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            return "";
        }
    }
}
