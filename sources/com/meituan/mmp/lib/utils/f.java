package com.meituan.mmp.lib.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class f {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fda731276a08b90318343f211600e16a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fda731276a08b90318343f211600e16a");
        } else {
            com.meituan.android.cipstorage.x.a(context, "mtplatform_mmp", com.meituan.android.cipstorage.u.e, "hera");
        }
    }

    public static void a(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d89f54732ef213def382b2def143b261", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d89f54732ef213def382b2def143b261");
        } else {
            com.meituan.mmp.lib.update.k.a(new Runnable() { // from class: com.meituan.mmp.lib.utils.f.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a0e5b39153bfaa01fd3f9962243edc2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a0e5b39153bfaa01fd3f9962243edc2");
                        return;
                    }
                    synchronized (f.class) {
                        if (new File(context.getApplicationInfo().dataDir, "files/hera").exists()) {
                            f.b(context);
                        }
                    }
                }
            });
        }
    }

    public static File a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac179a61769ef8a044e0e1eee9538790", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac179a61769ef8a044e0e1eee9538790") : s.d(com.meituan.android.cipstorage.q.a(context, "mtplatform_mmp", str, com.meituan.android.cipstorage.u.e));
    }

    public static File b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1f84146089a8e000969d159a6bd3b80", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1f84146089a8e000969d159a6bd3b80") : s.d(com.meituan.android.cipstorage.q.a(context, "mtplatform_mmp", str, com.meituan.android.cipstorage.u.b));
    }

    public static File c(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c1530f5720dc1eb063e2d835a2eb95c", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c1530f5720dc1eb063e2d835a2eb95c") : s.d(com.meituan.android.cipstorage.q.b(context, str, "mtplatform_mmp"));
    }

    public static File d(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "146d23c053fc5850d8f0da482dfc1616", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "146d23c053fc5850d8f0da482dfc1616") : s.d(com.meituan.android.cipstorage.q.b(context, "mtplatform_mmp", str, com.meituan.android.cipstorage.u.e));
    }
}
