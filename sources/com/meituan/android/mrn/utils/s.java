package com.meituan.android.mrn.utils;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class s {
    public static ChangeQuickRedirect a;

    public static void a(ReactContext reactContext) {
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5e72ae528881696275497106f573e07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5e72ae528881696275497106f573e07");
        } else {
            a(r.a(reactContext));
        }
    }

    public static void a(final com.meituan.android.mrn.engine.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45e6112e6719f0a0ed70645ce712c6b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45e6112e6719f0a0ed70645ce712c6b0");
        } else if (kVar == null) {
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.android.mrn.utils.s.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ffae4aa6e436f82e38961d07a44535f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ffae4aa6e436f82e38961d07a44535f");
                        return;
                    }
                    try {
                        for (com.meituan.android.mrn.container.b bVar : com.meituan.android.mrn.engine.k.this.b()) {
                            if (bVar != null) {
                                bVar.e();
                            }
                        }
                    } catch (Throwable th) {
                        c.a("[MRNErrorUtil@showErrorView@run]", th);
                    }
                }
            });
        }
    }
}
