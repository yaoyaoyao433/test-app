package com.meituan.met.mercury.load.core;

import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static boolean e = true;
    public static boolean f = true;
    public static int g = 10;
    public static int h = 10;
    public static boolean i = true;
    public static boolean j = true;
    public static int k = -1;
    public static boolean l = true;
    public static int m = 5;
    public static Set<String> n = Collections.synchronizedSet(new HashSet());
    public static Map<String, Integer> o = new ConcurrentHashMap();
    public static boolean p = true;
    public static boolean q = true;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f94767c3e9b1facf96310f1b303679a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f94767c3e9b1facf96310f1b303679a7");
            return;
        }
        Horn.register("android_ddd_config", new HornCallback() { // from class: com.meituan.met.mercury.load.core.c.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c533bae65bc9cc70d5bf31166b2ded64", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c533bae65bc9cc70d5bf31166b2ded64");
                } else if (!z || TextUtils.isEmpty(str)) {
                } else {
                    c.this.a(str);
                }
            }
        });
        String accessCache = Horn.accessCache("android_ddd_config");
        if (TextUtils.isEmpty(accessCache)) {
            return;
        }
        a(accessCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daa2e9859805b8fbf63eef42005c6482", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daa2e9859805b8fbf63eef42005c6482");
            return;
        }
        com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("ddd horn config");
        bVar.a("config", str);
        com.meituan.met.mercury.load.utils.c.a(bVar);
        JSONObject jSONObject = new JSONObject(str);
        b = jSONObject.optBoolean("store_threshold_clear", false);
        c = jSONObject.optBoolean("zombie_file_clear", false);
        d = jSONObject.optBoolean("net_shark", false);
        e = jSONObject.optBoolean("enable_logan", true);
        f = jSONObject.optBoolean("enable_babel", true);
        g = jSONObject.optInt("babel_visit_sample", 10);
        h = jSONObject.optInt("babel_clear_sample", 10);
        i = jSONObject.optBoolean("enable_preload", true);
        j = jSONObject.optBoolean("enable_bundle_keep", true);
        k = jSONObject.optInt("unused_invalid_day", -1);
        l = jSONObject.optBoolean("report_exception", true);
        m = jSONObject.optInt("download_tmp_invalid_day", 5);
        n = a(jSONObject.optJSONArray("biz_breakpoint_download"));
        p = jSONObject.optBoolean("enableConcurrentDownload", true);
        a(jSONObject.optJSONObject("biz_download_cnt"));
        q = jSONObject.optBoolean("enable_pike_push", true);
    }

    private static void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f20b50e56fb5bd827705176b0f9a027", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f20b50e56fb5bd827705176b0f9a027");
        } else if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next) && jSONObject.optInt(next, 0) > 0) {
                        o.put(next, Integer.valueOf(jSONObject.optInt(next)));
                    }
                }
            } catch (Throwable th) {
                com.meituan.met.mercury.load.report.d.a("DDLoadHornConfig", "parseBizDownloadCntMap", th);
            }
        }
    }

    private static Set<String> a(@Nullable JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ebbbfb6611dcadc1f5e8cc6b37b5d19", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ebbbfb6611dcadc1f5e8cc6b37b5d19");
        }
        Set<String> synchronizedSet = Collections.synchronizedSet(new HashSet());
        if (jSONArray == null || jSONArray.length() == 0) {
            return synchronizedSet;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                synchronizedSet.add(jSONArray.getString(i2));
            } catch (Throwable th) {
                com.meituan.met.mercury.load.report.d.a("DDLoadHornConfig", "array2Set", th);
            }
        }
        return synchronizedSet;
    }

    @WorkerThread
    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2bf55d41a420bc7fd074b3c814c63ad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2bf55d41a420bc7fd074b3c814c63ad7");
        } else {
            new c();
        }
    }
}
