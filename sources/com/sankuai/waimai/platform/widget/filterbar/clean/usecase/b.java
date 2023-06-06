package com.sankuai.waimai.platform.widget.filterbar.clean.usecase;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b implements a {
    public static ChangeQuickRedirect a;
    private static a b;
    private Handler c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "727db3b2e4bf0ece8d2560edfbf746bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "727db3b2e4bf0ece8d2560edfbf746bc");
        } else {
            this.c = new Handler(Looper.getMainLooper());
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.a
    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c446384ecb536f07ebb9793da37068c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c446384ecb536f07ebb9793da37068c");
        } else {
            this.c.post(runnable);
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c729db6b6fc86f8ce1f6fe313fce71b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c729db6b6fc86f8ce1f6fe313fce71b1");
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
}
