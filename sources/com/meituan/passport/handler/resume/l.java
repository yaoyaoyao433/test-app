package com.meituan.passport.handler.resume;

import android.support.v4.app.FragmentActivity;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.handler.exception.g;
import com.meituan.passport.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l<T> extends b<T> {
    public static ChangeQuickRedirect b;
    rx.subjects.b<T> e;
    a<T> f;
    String g;
    String h;
    boolean i;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a<T> {
        rx.d<T> a(String str, String str2);
    }

    public l(FragmentActivity fragmentActivity, a<T> aVar) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72b7bad7ff21f13eacd672da11db0dfc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72b7bad7ff21f13eacd672da11db0dfc");
            return;
        }
        this.e = rx.subjects.b.g();
        this.i = true;
        this.f = aVar;
        this.i = false;
    }

    public l(FragmentActivity fragmentActivity, a<T> aVar, String str, String str2) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, aVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57ddd04afa40a1019a41707fc79def95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57ddd04afa40a1019a41707fc79def95");
            return;
        }
        this.e = rx.subjects.b.g();
        this.i = true;
        this.f = aVar;
        this.h = str;
        this.g = str2;
    }

    @Override // com.meituan.passport.handler.resume.b
    public final rx.d<T> a(ApiException apiException, FragmentActivity fragmentActivity) {
        Object[] objArr = {apiException, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bb901b9516615e281177745ad44d46b", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bb901b9516615e281177745ad44d46b");
        }
        Object[] objArr2 = {this, apiException, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect2 = m.a;
        Throwable b2 = new com.meituan.passport.handler.exception.g(fragmentActivity, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4797129f975ae75635d3cd6c7116d237", RobustBitConfig.DEFAULT_VALUE) ? (g.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4797129f975ae75635d3cd6c7116d237") : new m(this, apiException, fragmentActivity)).b(apiException);
        if (b2 == null) {
            if (this.i) {
                p.a().a(fragmentActivity, apiException.code, this.h, this.g);
            }
            return this.e;
        }
        return rx.d.a(b2);
    }
}
