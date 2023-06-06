package com.meituan.passport.plugins;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import rx.d;
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements d.a {
    public static ChangeQuickRedirect a;
    private final e b;

    public f(e eVar) {
        this.b = eVar;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36139a4db6cb547bdc4c302010e46b6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36139a4db6cb547bdc4c302010e46b6b");
            return;
        }
        e eVar = this.b;
        rx.j jVar = (rx.j) obj;
        Object[] objArr2 = {eVar, jVar};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "60d15b12594b2f86e2eba5d21a2f9937", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "60d15b12594b2f86e2eba5d21a2f9937");
        } else if (jVar.isUnsubscribed()) {
        } else {
            try {
                String c = eVar.c();
                if (TextUtils.isEmpty(c)) {
                    com.meituan.passport.utils.m.a(new IOException("fingerPrint is empty"));
                }
                jVar.onNext(c);
                jVar.onCompleted();
            } catch (IOException e) {
                jVar.onError(e);
            }
        }
    }
}
