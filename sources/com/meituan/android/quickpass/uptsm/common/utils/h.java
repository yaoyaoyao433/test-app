package com.meituan.android.quickpass.uptsm.common.utils;

import com.meituan.android.quickpass.qpdev.QuickPassDevManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a = null;
    public static volatile boolean b = false;

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5bc013990a3fb314ebc6b835b96e8c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5bc013990a3fb314ebc6b835b96e8c8");
        } else {
            QuickPassDevManager.a().a(3, "TSM_PAY", str);
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9273caf0503d4694ee5476ed0ccb88fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9273caf0503d4694ee5476ed0ccb88fc");
        } else {
            QuickPassDevManager.a().a(6, "TSM_PAY", str);
        }
    }
}
