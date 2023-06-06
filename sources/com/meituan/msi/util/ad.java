package com.meituan.msi.util;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ad {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a {
        public static ChangeQuickRedirect a;
        private static WeakReference<Activity> b;

        public static Activity a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "199460964e450e4dd1b4e98b1ff57975", RobustBitConfig.DEFAULT_VALUE)) {
                return (Activity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "199460964e450e4dd1b4e98b1ff57975");
            }
            if (b == null) {
                return null;
            }
            return b.get();
        }
    }
}
