package com.meituan.passport.converter;

import android.support.annotation.StringRes;
import android.support.constraint.R;
import android.support.v4.app.FragmentManager;
import com.meituan.passport.dialogs.ProgressDialogFragment;
import com.meituan.passport.service.ag;
import com.meituan.passport.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h<T> {
    public static ChangeQuickRedirect a;
    WeakReference<m<T>> b;
    public m<T> c;
    ag d;
    boolean e;
    public WeakReference<FragmentManager> f;
    public com.meituan.passport.handler.exception.c g;
    public com.meituan.passport.handler.resume.b<T> h;
    public rx.d<T> i;
    public com.meituan.passport.exception.monitor.c<T> j;
    @StringRes
    public int k;

    public static <K> h<K> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59a308bb892118b5112b3bdc52c42776", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59a308bb892118b5112b3bdc52c42776") : new h<>();
    }

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69ead0e0bd3a255b13c99bbfc8f88527", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69ead0e0bd3a255b13c99bbfc8f88527");
        } else {
            this.k = 0;
        }
    }

    public final h<T> a(m<T> mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "925a1ffabed9e82004881411d969613f", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "925a1ffabed9e82004881411d969613f");
        }
        this.b = new WeakReference<>(mVar);
        return this;
    }

    public final void b() {
        FragmentManager fragmentManager;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "121ffac65c20aca68945e9a3759e6cb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "121ffac65c20aca68945e9a3759e6cb7");
        } else if (this.i == null) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab0e173df0630af0abe5152fae28210e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab0e173df0630af0abe5152fae28210e");
            } else if (this.f != null && (fragmentManager = this.f.get()) != null) {
                if (this.k == 0) {
                    this.k = R.string.passport_loading;
                }
                ProgressDialogFragment.a(fragmentManager, this.k);
            }
            if (this.h != null) {
                this.i = this.h.a(this.i);
            }
            rx.d.a(new rx.j<T>() { // from class: com.meituan.passport.converter.h.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onCompleted() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1b200f92b5c1b90926c7b1aac199d792", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1b200f92b5c1b90926c7b1aac199d792");
                        return;
                    }
                    n.a("PassportObservableLoader.start#onCompleted", "", "");
                    if (h.this.e) {
                        return;
                    }
                    h.this.d();
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr3 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "126c82cf8ad48ab30f3715244237493d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "126c82cf8ad48ab30f3715244237493d");
                        return;
                    }
                    n.a("PassportObservableLoader.start#onError", "", "");
                    if (th instanceof com.sankuai.meituan.retrofit2.exception.c) {
                        n.a("PassportObservableLoader.start#onError", "HttpException e.msg:", th.getMessage());
                    }
                    h.this.c();
                    if (h.this.j != null) {
                        h.this.j.a(th);
                    }
                    if (h.this.g != null) {
                        h.this.g.b(th);
                        n.a("PassportObservableLoader.start#onError", "start to handle throwable", th != null ? th.getMessage() : "throwable is null");
                    }
                }

                @Override // rx.e
                public final void onNext(T t) {
                    Object[] objArr3 = {t};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6ebbb302e693f72cff3da75741ef4745", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6ebbb302e693f72cff3da75741ef4745");
                        return;
                    }
                    n.a("PassportObservableLoader.start#onNext", "", "");
                    if (h.this.d == null) {
                        h.this.d();
                    }
                    m<T> mVar = h.this.c;
                    if (mVar == null && h.this.b != null) {
                        mVar = h.this.b.get();
                    }
                    if (mVar != null) {
                        mVar.a(t);
                        if (h.this.j != null) {
                            h.this.j.a((com.meituan.passport.exception.monitor.c<T>) t);
                        }
                        if (h.this.d != null) {
                            h.this.d.b();
                            h.this.e = true;
                        }
                        n.a("PassportObservableLoader.start#onNext", "callbackInner is not null", t != null ? t.getClass().getName() : "o is null");
                        return;
                    }
                    if (h.this.j != null) {
                        h.this.j.a((Throwable) new com.meituan.passport.exception.a("no_callback"));
                    }
                    n.a("PassportObservableLoader.start#onNext", "callbackInner is null", t != null ? t.getClass().getName() : "o is null");
                }
            }, this.i.b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
        }
    }

    void c() {
        FragmentManager fragmentManager;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "011d3a4af8683485f023397ac575951a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "011d3a4af8683485f023397ac575951a");
        } else if (this.f == null || (fragmentManager = this.f.get()) == null) {
        } else {
            ProgressDialogFragment.a(fragmentManager);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9b4140453612f880e7aa36eb955a220", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9b4140453612f880e7aa36eb955a220");
        } else {
            c();
        }
    }

    public final h<T> a(FragmentManager fragmentManager) {
        Object[] objArr = {fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83957296dc58d94b1de5fd7318695d87", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83957296dc58d94b1de5fd7318695d87");
        }
        this.f = new WeakReference<>(fragmentManager);
        return this;
    }
}
