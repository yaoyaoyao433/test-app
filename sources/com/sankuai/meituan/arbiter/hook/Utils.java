package com.sankuai.meituan.arbiter.hook;

import android.content.Intent;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Utils {
    public static final String EXTRA_NEED_EXCEPTION = "need_exception";
    public static final String INTENT_KEY_INTENT = "err_info_intent";
    public static final String INTENT_KEY_TRACE = "err_info_trace";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static HashMap<String, Long> execTimeMap;

    public static void debugExecTimeBegin(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4686bd2b0105661681612a3a897b66e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4686bd2b0105661681612a3a897b66e1");
        } else if (ArbiterHook.isDebug()) {
            if (execTimeMap == null) {
                execTimeMap = new HashMap<>();
            }
            execTimeMap.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void debugExecTimeEnd(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c2e927adb6e6292d749a67f4d8667ac4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c2e927adb6e6292d749a67f4d8667ac4");
        } else if (ArbiterHook.isDebug()) {
            if (execTimeMap == null) {
                execTimeMap = new HashMap<>();
            }
            Long remove = execTimeMap.remove(str);
            if (remove != null) {
                DebugLogUtil.d("debugExecTime : name = " + str + ", execute time = " + String.valueOf(System.currentTimeMillis() - remove.longValue()) + " millisecond");
            }
        }
    }

    public static void setClassLoader(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "08bbe030706b639e1fa7d132f2b39bf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "08bbe030706b639e1fa7d132f2b39bf4");
        } else if (objArr != null) {
            ClassLoader classLoader = Utils.class.getClassLoader();
            for (Object obj : objArr) {
                if (obj instanceof Bundle) {
                    ((Bundle) obj).setClassLoader(classLoader);
                } else if (obj instanceof Intent) {
                    ((Intent) obj).setExtrasClassLoader(classLoader);
                }
            }
        }
    }
}
