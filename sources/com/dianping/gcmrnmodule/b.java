package com.dianping.gcmrnmodule;

import android.support.annotation.UiThread;
import com.meituan.android.mrn.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static b b;

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2e9c35810d62a952d839b3611283cb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2e9c35810d62a952d839b3611283cb6");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    @UiThread
    public final void a(com.dianping.gcmrnmodule.wrapperviews.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e357de0fadabb326bb1dc26fc2f42a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e357de0fadabb326bb1dc26fc2f42a8");
        } else if (!ai.a() || aVar == null || aVar.getHostInterface() == null) {
        } else {
            aVar.getHostInterface().a(true);
        }
    }
}
