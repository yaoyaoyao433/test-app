package com.meituan.passport.converter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;
    public ar b;
    public a c;

    public i(ar arVar) {
        Object[] objArr = {arVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3625ff656dbf8b5e4ea0bd8445222148", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3625ff656dbf8b5e4ea0bd8445222148");
            return;
        }
        this.c = a.a;
        this.b = arVar;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.converter.i$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements InvocationHandler {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ Object b;

        public AnonymousClass1(Object obj) {
            this.b = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object... objArr) throws Throwable {
            Object[] objArr2 = {obj, method, objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "d43ea407a0e4b7370337e0d1a5322236", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "d43ea407a0e4b7370337e0d1a5322236");
            }
            Object invoke = method.invoke(this.b, objArr);
            if (invoke instanceof rx.d) {
                Object[] objArr3 = {this, invoke};
                ChangeQuickRedirect changeQuickRedirect2 = j.a;
                return rx.d.a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect2, true, "19ff3b2aaa7ec5496c7a80cefaf32aef", RobustBitConfig.DEFAULT_VALUE) ? (d.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect2, true, "19ff3b2aaa7ec5496c7a80cefaf32aef") : new j(this, invoke));
            }
            return invoke;
        }

        public static /* synthetic */ void a(AnonymousClass1 anonymousClass1, Object obj, final rx.j jVar) {
            Object[] objArr = {anonymousClass1, obj, jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "468c631fabdd16cfebcb5ae4034542cf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "468c631fabdd16cfebcb5ae4034542cf");
            } else if (jVar.isUnsubscribed()) {
            } else {
                rx.d dVar = (rx.d) obj;
                jVar.getClass();
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect2 = k.a;
                rx.functions.b kVar = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cfc6f07febb7f586c4d3d7a98c852bd1", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cfc6f07febb7f586c4d3d7a98c852bd1") : new k(jVar);
                rx.functions.b<Throwable> bVar = new rx.functions.b<Throwable>() { // from class: com.meituan.passport.converter.i.1.1
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(Throwable th) {
                        Throwable th2 = th;
                        Object[] objArr3 = {th2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d105012d92f10534cf90a5c913982d5b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d105012d92f10534cf90a5c913982d5b");
                            return;
                        }
                        try {
                            jVar.onError(i.this.c.handleError(th2));
                        } catch (rx.exceptions.f unused) {
                        }
                    }
                };
                jVar.getClass();
                Object[] objArr3 = {jVar};
                ChangeQuickRedirect changeQuickRedirect3 = l.a;
                dVar.a(kVar, bVar, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "75350f8f0095ea805c23e8c20c3b8f16", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "75350f8f0095ea805c23e8c20c3b8f16") : new l(jVar));
            }
        }
    }
}
