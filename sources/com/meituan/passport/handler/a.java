package com.meituan.passport.handler;

import android.support.annotation.RestrictTo;
import com.meituan.passport.handler.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class a<T extends a> {
    protected T a;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.handler.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0506a<P extends a> {
        public static ChangeQuickRedirect a;
        public P b;
        private a c;

        public static <K extends a> C0506a<K> a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5b3e7e1734b5cf33a57284bd355d42b", RobustBitConfig.DEFAULT_VALUE) ? (C0506a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5b3e7e1734b5cf33a57284bd355d42b") : new C0506a<>();
        }

        public final C0506a<P> a(P p) {
            Object[] objArr = {p};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f280cc9418320d92baacabaaf03e835", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0506a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f280cc9418320d92baacabaaf03e835");
            }
            if (this.b == null) {
                this.b = p;
                this.c = p;
            } else {
                a aVar = this.c;
                aVar.a = p;
                this.c = aVar.a;
            }
            return this;
        }
    }
}
