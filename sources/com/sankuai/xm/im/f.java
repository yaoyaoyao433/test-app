package com.sankuai.xm.im;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.j;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class f<T> implements a<T> {
    public static ChangeQuickRedirect d;
    private Handler a;

    public abstract void a(int i, String str);

    public abstract void a(T t);

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da7cedc821bbcee6c844591d43cb39f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da7cedc821bbcee6c844591d43cb39f5");
        } else {
            this.a = new Handler(Looper.getMainLooper());
        }
    }

    @Override // com.sankuai.xm.base.callback.Callback
    public void onSuccess(final T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1929bc08c3dbfa9658a4d49baf31837a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1929bc08c3dbfa9658a4d49baf31837a");
        } else {
            this.a.post(j.a(new Runnable() { // from class: com.sankuai.xm.im.f.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6de205b6c019ac453bef3be2529b7396", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6de205b6c019ac453bef3be2529b7396");
                    } else {
                        f.this.a(t);
                    }
                }
            }));
        }
    }

    @Override // com.sankuai.xm.base.callback.Callback
    public void onFailure(final int i, final String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5750089978b3c16d94e32188190cd75f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5750089978b3c16d94e32188190cd75f");
        } else {
            this.a.post(j.a(new Runnable() { // from class: com.sankuai.xm.im.f.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6bb2b9588993b834430daf25c0342579", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6bb2b9588993b834430daf25c0342579");
                    } else {
                        f.this.a(i, str);
                    }
                }
            }));
        }
    }
}
