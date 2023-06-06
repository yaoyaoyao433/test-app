package com.sankuai.meituan.kernel.net.zstd;

import android.support.annotation.NonNull;
import android.util.Log;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static void a(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "11c366f644dc5e0d33b8374bcce46865", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "11c366f644dc5e0d33b8374bcce46865");
            return;
        }
        StringBuilder sb = new StringBuilder("zstd ");
        for (Object obj : objArr) {
            sb.append(obj);
        }
        if (com.sankuai.meituan.kernel.net.base.c.b()) {
            System.out.println(sb);
        }
        com.dianping.networklog.c.a(sb.toString(), 3);
    }

    public static void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44ab48ac94ee23512baf169d9cd8cdb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44ab48ac94ee23512baf169d9cd8cdb6");
        } else if (com.sankuai.meituan.kernel.net.base.c.b()) {
            throw new RuntimeException(th);
        } else {
            a(str, th.getClass() != null ? th.getClass().getCanonicalName() : null, Log.getStackTraceString(th));
        }
    }

    public static void a(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b13c6064ae141d687e107257eca04f64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b13c6064ae141d687e107257eca04f64");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Integer.valueOf(i));
        hashMap.put("zstdMode", Integer.valueOf(i2));
        hashMap.put("errMsg", str);
        a("zstd_failed", hashMap);
        a(str);
    }

    private static void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7379ffe865dbec7395daf13d6c41dc32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7379ffe865dbec7395daf13d6c41dc32");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KnbConstants.PARAMS_SCENE, str);
        hashMap.put(LogMonitor.EXCEPTION_TAG, str2);
        hashMap.put("errMsg", str3);
        a("zstd_exception", hashMap);
        a(str3);
    }

    private static void a(@NonNull String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4dd59edfc395cda01225f2cc9cc7c864", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4dd59edfc395cda01225f2cc9cc7c864");
        } else {
            Babel.logRT(new Log.Builder("").optional(map).tag(str).reportChannel("babel-general").lv4LocalStatus(true).newLogStatus(true).build());
        }
    }
}
