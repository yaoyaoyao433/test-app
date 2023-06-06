package com.sankuai.meituan.bundle.service;

import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j {
    public static ChangeQuickRedirect a;

    public static void a(String str, long j, boolean z, String str2, boolean z2, boolean z3) {
        Object[] objArr = {str, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), str2, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4fdbb2cf0dbff446d3c2b3146ed5792e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4fdbb2cf0dbff446d3c2b3146ed5792e");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(JsBridgeResult.PROPERTY_GET_MEDIA_FRAME_FRAME, str);
        hashMap.put("patch", Integer.valueOf(!z ? 1 : 0));
        hashMap.put("phase", String.valueOf(z2 ? 1 : 0) + String.valueOf(z3 ? 1 : 0));
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("label", str2);
        }
        a("bundle-timing", hashMap, Long.valueOf(j));
    }

    private static void a(String str, Map<String, Object> map, Long l) {
        Object[] objArr = {str, map, l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "568faeccb9a3386a505dd59e99750fa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "568faeccb9a3386a505dd59e99750fa1");
            return;
        }
        try {
            Log.Builder optional = new Log.Builder("").reportChannel("fe_knb_report").ts(System.currentTimeMillis()).tag(str).optional(map);
            if (l != null) {
                optional.value(l.longValue());
            }
            Babel.log(optional.build());
        } catch (Throwable th) {
            k.a("report IOException:" + th.toString(), new Object[0]);
        }
    }

    public static void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12f24e5bb9dd3f9b3680cc731439cafd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12f24e5bb9dd3f9b3680cc731439cafd");
            return;
        }
        Babel.log("bundle-exception", "frame:" + str + "/throwable:" + android.util.Log.getStackTraceString(th));
    }
}
