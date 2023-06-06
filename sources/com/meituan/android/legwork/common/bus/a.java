package com.meituan.android.legwork.common.bus;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.subjects.b;
import rx.subjects.d;
import rx.subjects.e;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final a b = new a();
    private final e<Object, Object> c;

    public static a a() {
        return b;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d31a9d87a6fddda98c70865d28fcd193", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d31a9d87a6fddda98c70865d28fcd193");
        } else {
            this.c = new d(b.g());
        }
    }

    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "560744898b062521cddc484c4b39c13c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "560744898b062521cddc484c4b39c13c");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "adf2ba3fbc45ee5e4677e9dff9a05fc9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "adf2ba3fbc45ee5e4677e9dff9a05fc9")).booleanValue() : this.c.h()) {
            this.c.onNext(obj);
        }
    }

    public final <T> rx.d<T> a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3e46fc3099de6b96d0d75f26fdcc5b7", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3e46fc3099de6b96d0d75f26fdcc5b7") : (rx.d<T>) this.c.a((Class<Object>) cls).e();
    }
}
