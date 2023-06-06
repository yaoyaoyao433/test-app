package com.meituan.retrofit2.androidadapter;

import android.support.v4.content.Loader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.d;
import rx.e;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RxLoader<D> extends Loader<a<D>> implements e<D> {
    public static ChangeQuickRedirect a;
    private final d<D> b;
    private final boolean c;
    private k d;
    private a<D> e;

    @Override // rx.e
    public void onCompleted() {
    }

    @Override // android.support.v4.content.Loader
    public void onStartLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e75781c99244d58b54f4b4ec140dae4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e75781c99244d58b54f4b4ec140dae4e");
        } else if (this.d == null) {
            this.d = this.b.a(this);
        } else if (this.e != null) {
            if (this.e.a() || !this.c) {
                deliverResult(this.e);
                return;
            }
            this.e = null;
            this.d = this.b.a(this);
        }
    }

    @Override // rx.e
    public void onError(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2803ee436abbbd78358e3e2f5b8c9fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2803ee436abbbd78358e3e2f5b8c9fd");
            return;
        }
        this.e = a.a(th);
        deliverResult(this.e);
    }

    @Override // rx.e
    public void onNext(D d) {
        Object[] objArr = {d};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f52db47491034c4ca5df8a0f13ea01ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f52db47491034c4ca5df8a0f13ea01ca");
            return;
        }
        this.e = a.a(d);
        deliverResult(this.e);
    }

    @Override // android.support.v4.content.Loader
    public void onAbandon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78068461eca2f539d321574c7107e455", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78068461eca2f539d321574c7107e455");
        } else if (this.d != null) {
            this.d.unsubscribe();
            this.d = null;
        }
    }
}
