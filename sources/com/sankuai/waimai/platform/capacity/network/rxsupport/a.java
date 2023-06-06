package com.sankuai.waimai.platform.capacity.network.rxsupport;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.subjects.d;
import rx.subjects.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static a b;
    private e<Object, Object> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "271e4d0b33064e7d52e0a41211b97c66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "271e4d0b33064e7d52e0a41211b97c66");
        } else {
            this.c = new d(rx.subjects.b.g());
        }
    }

    public static synchronized a a() {
        synchronized (a.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b0735c4e9fb4c7f56cd5526a69a8277", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b0735c4e9fb4c7f56cd5526a69a8277");
            }
            if (b == null) {
                b = new a();
            }
            return b;
        }
    }

    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a9a9f3b50d9a2d12144ccfa47a9acc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a9a9f3b50d9a2d12144ccfa47a9acc3");
        } else if (b()) {
            this.c.onNext(obj);
        }
    }

    public final <T> rx.d<T> a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58a06994e4a6858e2c3ead0dccbc2869", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58a06994e4a6858e2c3ead0dccbc2869") : (rx.d<T>) this.c.a((Class<Object>) cls);
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a9d833425b5bb781cb6ba0fa3d66e9b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a9d833425b5bb781cb6ba0fa3d66e9b")).booleanValue() : this.c.h();
    }
}
