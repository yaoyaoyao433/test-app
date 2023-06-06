package com.meituan.android.paybase.utils;

import android.content.Context;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ah {
    public static ChangeQuickRedirect a;

    @MTPaySuppressFBWarnings({"DMI_HARDCODED_ABSOLUTE_FILENAME"})
    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bc877c113956c60b77b41cfb057ef3e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bc877c113956c60b77b41cfb057ef3e")).booleanValue();
        }
        try {
            if (new File("/system/bin/su").exists()) {
                if (a("/system/bin/su")) {
                    return true;
                }
            }
        } catch (Exception e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SystemInfoUtils_isRoot").a("message", e.getMessage()).b);
        }
        try {
            if (new File("/system/xbin/su").exists()) {
                if (a("/system/xbin/su")) {
                    return true;
                }
            }
        } catch (Exception e2) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SystemInfoUtils_isRoot").a("message", e2.getMessage()).b);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.paybase.utils.ah.a(java.lang.String):boolean");
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04c5bc0ab05f022fca3e7e56ef60df12", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04c5bc0ab05f022fca3e7e56ef60df12")).booleanValue();
        }
        try {
            return (context.getApplicationContext().getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SystemInfoUtils_isApkDebuggable").a("message", e.getMessage()).b);
            return false;
        }
    }
}
