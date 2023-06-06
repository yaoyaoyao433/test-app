package com.sankuai.meituan.android.knb.util;

import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class Reporter {
    public static final String REPORT_TYPE_BRIDGE = "titansx-bridge";
    public static final String REPORT_TYPE_LOCAL_WEBVIEW = "webview";
    public static final String REPORT_TYPE_TITANSX_OFFLINE_USING = "titansx-offline-hit";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final String sChannel = "fe_knb_report";

    public static void report(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d81ac0b75ef42008b53d29f33f7c05e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d81ac0b75ef42008b53d29f33f7c05e0");
        } else {
            report(str, map, (Long) null);
        }
    }

    public static void report(String str, Map<String, Object> map, Long l) {
        Object[] objArr = {str, map, l};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e35ee19648a0c0bc6a45840fa61e5ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e35ee19648a0c0bc6a45840fa61e5ab");
        } else {
            report(System.currentTimeMillis(), str, map, l);
        }
    }

    public static void report(long j, String str, Map<String, Object> map) {
        Object[] objArr = {new Long(j), str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d3f7a4cf8e507e9f66c1f7d08785be65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d3f7a4cf8e507e9f66c1f7d08785be65");
        } else {
            report(j, str, map, null);
        }
    }

    public static void report(long j, String str, Map<String, Object> map, Long l) {
        Object[] objArr = {new Long(j), str, map, l};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "abf7607301769734e217effa69b779fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "abf7607301769734e217effa69b779fd");
            return;
        }
        try {
            Log.Builder optional = new Log.Builder("").reportChannel(sChannel).ts(j).tag(str).optional(map);
            if (l != null) {
                optional.value(l.longValue());
            }
            Babel.log(optional.build());
        } catch (Throwable unused) {
        }
    }

    public static void reportRT(String str, Map<String, Object> map, Long l) {
        Object[] objArr = {str, map, l};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dd85b2c654ef5e00aa032aaf34379b83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dd85b2c654ef5e00aa032aaf34379b83");
            return;
        }
        try {
            Log.Builder optional = new Log.Builder("").reportChannel(sChannel).ts(System.currentTimeMillis()).tag(str).optional(map);
            if (l != null) {
                optional.value(l.longValue());
            }
            Babel.logRT(optional.build());
        } catch (Throwable unused) {
        }
    }
}
