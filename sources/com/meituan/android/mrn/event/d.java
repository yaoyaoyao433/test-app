package com.meituan.android.mrn.event;

import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d extends com.meituan.android.mrn.utils.event.b {
    public static ChangeQuickRedirect a;
    protected WeakReference<com.meituan.android.mrn.container.b> b;
    protected WeakReference<ReactContext> c;
    protected com.meituan.android.mrn.engine.e d;
    protected String e;
    protected com.meituan.android.mrn.router.d f;
    protected int g;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df986db70fc7909ba4438ef1c8c10649", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df986db70fc7909ba4438ef1c8c10649");
        } else {
            this.g = -1;
        }
    }

    public final com.meituan.android.mrn.container.b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5659e5c2e0335060b9ebffef7a7bf5b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mrn.container.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5659e5c2e0335060b9ebffef7a7bf5b6");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.get();
    }

    public final ReactContext b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e12d337678c66edd06da611db4906c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e12d337678c66edd06da611db4906c8");
        }
        if (this.c == null) {
            return null;
        }
        return this.c.get();
    }

    public final String c() {
        return this.e;
    }

    public final com.meituan.android.mrn.router.d d() {
        return this.f;
    }

    public final d a(com.meituan.android.mrn.container.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a504151da59c5af62795e6191c45c02c", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a504151da59c5af62795e6191c45c02c");
        }
        this.b = new WeakReference<>(bVar);
        return this;
    }

    public final d a(ReactContext reactContext) {
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "515ba8fac36b94e30d5c8ad5174e46a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "515ba8fac36b94e30d5c8ad5174e46a5");
        }
        this.c = new WeakReference<>(reactContext);
        return this;
    }

    public final d a(com.meituan.android.mrn.engine.e eVar) {
        this.d = eVar;
        return this;
    }

    public final d a(String str) {
        this.e = str;
        return this;
    }

    public final d a(int i) {
        this.g = i;
        return this;
    }

    public final d a(com.meituan.android.mrn.router.d dVar) {
        this.f = dVar;
        return this;
    }
}
