package com.sankuai.waimai.foundation.core.utils;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.dianping.monitor.impl.m;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.Collections;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static String b = "waimai_page_container_report";
    private static Executor c = com.sankuai.android.jarvis.c.b();

    public static void a(final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5bd345f646d05f7c05c2cef465ee6be8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5bd345f646d05f7c05c2cef465ee6be8");
        } else if (c != null) {
            com.sankuai.waimai.launcher.util.aop.b.a(c, new Runnable() { // from class: com.sankuai.waimai.foundation.core.utils.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2958d4e813825437764cd2c273b5064", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2958d4e813825437764cd2c273b5064");
                        return;
                    }
                    com.sankuai.waimai.foundation.core.common.a.a();
                    new m(com.sankuai.waimai.foundation.core.common.a.j(), com.meituan.android.singleton.b.a).a(a.b, Collections.singletonList(Float.valueOf(1.0f))).a("biz", TextUtils.isEmpty(str) ? "" : str).a("platform", "android").a("env", com.sankuai.waimai.foundation.core.a.b() ? "test" : "prod").a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, a.c(com.meituan.android.singleton.b.a)).a("page_type", TextUtils.isEmpty(str2) ? "native" : str2).a();
                }
            });
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d723418cfac56d193cec52eec333ffc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d723418cfac56d193cec52eec333ffc");
        } else {
            a("waimai", DiagnoseLog.MRN);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b0e5e68b232c6b11b43e2531e1aefbd8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b0e5e68b232c6b11b43e2531e1aefbd8");
        }
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean a(Context context) {
        String localClassName;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f53d92b5efed210c203a6b6537145bf0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f53d92b5efed210c203a6b6537145bf0")).booleanValue();
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "31d78e913050fd74079634ebc764519e", RobustBitConfig.DEFAULT_VALUE)) {
            localClassName = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "31d78e913050fd74079634ebc764519e");
        } else if (context == null) {
            localClassName = "";
        } else {
            localClassName = context instanceof Activity ? ((Activity) context).getLocalClassName() : "";
        }
        if (TextUtils.isEmpty(localClassName)) {
            return false;
        }
        return b.a(localClassName);
    }
}
