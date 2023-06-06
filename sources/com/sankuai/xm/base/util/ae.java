package com.sankuai.xm.base.util;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class ae implements Runnable {
    public static ChangeQuickRedirect a;
    private static final Handler b = new Handler(Looper.getMainLooper());

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0641f48cfd1f48d539ddf8447c0d8e47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0641f48cfd1f48d539ddf8447c0d8e47");
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            a();
        } else {
            b.post(new Runnable() { // from class: com.sankuai.xm.base.util.ae.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "247a3dfc082021de1c4680aef70651d6", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "247a3dfc082021de1c4680aef70651d6");
                    } else {
                        ae.this.a();
                    }
                }
            });
        }
    }
}
