package com.meituan.android.customerservice.kit.floating;

import android.app.Application;
import com.meituan.android.customerservice.kit.floating.base.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public com.meituan.android.customerservice.kit.floating.base.b b;
    public boolean c;
    private boolean d;

    public a(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8181305d78222a023eaf920f050587b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8181305d78222a023eaf920f050587b7");
            return;
        }
        this.b = new d(application);
        this.d = true;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "805bb0cac59c53090815c0ed9d56d997", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "805bb0cac59c53090815c0ed9d56d997");
            return;
        }
        this.b.b();
        this.c = false;
        this.d = false;
    }
}
