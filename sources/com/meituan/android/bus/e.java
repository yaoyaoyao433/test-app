package com.meituan.android.bus;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import rx.d;
import rx.g;
import rx.internal.operators.ab;
import rx.j;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public final Object b;
    final d c;
    k d;

    public e(Object obj, d dVar, rx.d<?> dVar2) {
        g a2;
        Object[] objArr = {obj, dVar, dVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bbc715ca55d4dafa3c6229c483402f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bbc715ca55d4dafa3c6229c483402f4");
            return;
        }
        this.b = obj;
        this.c = dVar;
        rx.d<R> a3 = dVar2.a((d.b<? extends R, ? super Object>) ab.a.a);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ecb7d94169eb4b37d7b6ef67a8872bf", RobustBitConfig.DEFAULT_VALUE)) {
            switch (this.c.b) {
                case MAIN:
                    a2 = rx.android.schedulers.a.a();
                    break;
                case BACKGROUND:
                    a2 = rx.schedulers.a.d();
                    break;
                default:
                    a2 = rx.schedulers.a.a();
                    break;
            }
        } else {
            a2 = (g) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ecb7d94169eb4b37d7b6ef67a8872bf");
        }
        this.d = rx.d.a(new j<Object>() { // from class: com.meituan.android.bus.e.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final void onCompleted() {
            }

            @Override // rx.e
            public final void onError(Throwable th) {
            }

            @Override // rx.e
            public final void onNext(Object obj2) {
                Object[] objArr3 = {obj2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "768c67e050db60634e72de171290abaa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "768c67e050db60634e72de171290abaa");
                } else if (obj2.getClass() == e.this.c.c) {
                    try {
                        e.this.c.a.invoke(e.this.b, obj2);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }, a3.a(a2));
    }
}
