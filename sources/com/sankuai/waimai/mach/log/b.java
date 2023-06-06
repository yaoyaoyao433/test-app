package com.sankuai.waimai.mach.log;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.monitor.MonitorManager;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b {
    public static ChangeQuickRedirect a = null;
    public static final String b = "b";

    public static void a(String str, String... strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "092d3a6cb20141792a7a433ca85c97af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "092d3a6cb20141792a7a433ca85c97af");
        } else {
            MonitorManager.loganReport(a.a, str, a(strArr));
        }
    }

    public static void b(String str, String... strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "142945564484e4a340aa9645d3081780", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "142945564484e4a340aa9645d3081780");
        } else {
            MonitorManager.loganReport(a.b, str, a(strArr));
        }
    }

    public static void a(@NonNull String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "c839087b4e0bba80d10350b32216c2db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "c839087b4e0bba80d10350b32216c2db");
        } else {
            a(str2, objArr);
        }
    }

    public static void b(@NonNull String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "3ad6173a8eb8ec4071684983b40be936", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "3ad6173a8eb8ec4071684983b40be936");
        } else {
            a(str2, objArr);
        }
    }

    private static String a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "fe00a1711cefc2fa565fb99f969045e1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "fe00a1711cefc2fa565fb99f969045e1") : (objArr == null || objArr.length == 0) ? str : String.format(str, objArr);
    }

    public static String a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d5434d57016b818ef20ed18fc0dae92", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d5434d57016b818ef20ed18fc0dae92");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(CommonConstant.Symbol.BIG_BRACKET_LEFT);
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                sb.append(entry.getKey() + CommonConstant.Symbol.COLON + entry.getValue());
            }
        }
        sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        return sb.toString();
    }

    private static String a(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6dfb435575e415b6a977a796e8fc1ee2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6dfb435575e415b6a977a796e8fc1ee2");
        }
        StringBuilder sb = new StringBuilder();
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                sb.append(strArr[i]);
                if (i < strArr.length - 1) {
                    sb.append(StringUtil.SPACE);
                }
            }
        }
        return sb.toString();
    }
}
