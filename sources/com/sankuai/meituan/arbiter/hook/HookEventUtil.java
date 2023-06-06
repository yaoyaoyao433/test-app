package com.sankuai.meituan.arbiter.hook;

import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HookEventUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static volatile HookEventListener hookEventListener;

    public static void methodEventStart(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2b5b4099ec09205b3e86c93674357490", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2b5b4099ec09205b3e86c93674357490");
        } else if (hookEventListener == null || TextUtils.isEmpty(str2)) {
        } else {
            if (str == null) {
                str = "";
            }
            hookEventListener.hookEvent(str, str2, true);
        }
    }

    public static void methodEventEnd(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "15666c134a512ed6f1d832775b9dbd5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "15666c134a512ed6f1d832775b9dbd5b");
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            if (str2.startsWith("execStartActivity")) {
                LogCollector.instance().endForExecStartActivity();
            }
            if (hookEventListener == null) {
                return;
            }
            if (str == null) {
                str = "";
            }
            hookEventListener.hookEvent(str, str2, false);
        }
    }

    public static String getActivityName(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8c6ecbfec005c916615bfa6eb164e34a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8c6ecbfec005c916615bfa6eb164e34a");
        }
        if (hookEventListener == null || intent == null) {
            return "";
        }
        ComponentName component = intent.getComponent();
        String className = component != null ? component.getClassName() : null;
        if (className != null) {
            return className;
        }
        String dataString = intent.getDataString();
        if (dataString != null) {
            return dataString;
        }
        String action = intent.getAction();
        if (action != null) {
            return action;
        }
        String scheme = intent.getScheme();
        return scheme != null ? scheme : "";
    }
}
