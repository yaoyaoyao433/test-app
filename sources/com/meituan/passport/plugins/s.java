package com.meituan.passport.plugins;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.d;
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements d.a {
    public static ChangeQuickRedirect a;
    private final r b;

    public s(r rVar) {
        this.b = rVar;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d8a7ea252e4f69f39af4e6d777c5528", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d8a7ea252e4f69f39af4e6d777c5528");
            return;
        }
        r rVar = this.b;
        rx.j jVar = (rx.j) obj;
        Object[] objArr2 = {rVar, jVar};
        ChangeQuickRedirect changeQuickRedirect2 = r.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "dd028f134fe68eca4fff34570d70aa5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "dd028f134fe68eca4fff34570d70aa5f");
        } else if (jVar.isUnsubscribed()) {
        } else {
            if (TextUtils.isEmpty(rVar.b)) {
                rVar.b = rVar.a(com.meituan.android.singleton.b.a());
            }
            jVar.onNext(rVar.b);
            jVar.onCompleted();
        }
    }
}
