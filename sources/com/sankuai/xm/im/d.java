package com.sankuai.xm.im;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.im.IMClient;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class d<T> extends IMClient.g<T> {
    public static ChangeQuickRedirect e;
    private Handler a;

    public abstract void b_(T t);

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "041f6d4a08f9b214494ab2af0a8f3796", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "041f6d4a08f9b214494ab2af0a8f3796");
        } else {
            this.a = new Handler(Looper.getMainLooper());
        }
    }

    @Override // com.sankuai.xm.im.IMClient.g
    public final void a(final T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d0df73dcba54a6863bb239a2be73d44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d0df73dcba54a6863bb239a2be73d44");
        } else {
            this.a.post(j.a(new Runnable() { // from class: com.sankuai.xm.im.d.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12a4aa1997fd0b036bf1b199ce2c950f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12a4aa1997fd0b036bf1b199ce2c950f");
                    } else {
                        d.this.b_(t);
                    }
                }
            }));
        }
    }
}
