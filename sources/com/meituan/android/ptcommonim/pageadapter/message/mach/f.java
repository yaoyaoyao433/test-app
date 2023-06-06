package com.meituan.android.ptcommonim.pageadapter.message.mach;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public final Mach b;
    final b c;
    final e d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public int a;
        public int b;
    }

    private f(Context context, a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c065317365d1c6900dd17bf780cf4765", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c065317365d1c6900dd17bf780cf4765");
            return;
        }
        this.b = aVar.b.a();
        if (aVar.e != null) {
            this.b.registerJsEventCallback(aVar.e);
        }
        this.d = new e(context, aVar.c, aVar.d);
        this.b.setLogReporter(this.d);
        this.c = aVar.f;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf72da28690b4722ed5bc82ff5f29bad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf72da28690b4722ed5bc82ff5f29bad");
            return;
        }
        this.d.b = 0;
        this.b.onExpose();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        final Mach.a b;
        com.sankuai.waimai.mach.d c;
        public com.sankuai.waimai.mach.d d;
        Mach.d e;
        b f;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "834ca1ee74a0f525ce549e6e70bcb679", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "834ca1ee74a0f525ce549e6e70bcb679");
            } else {
                this.b = new Mach.a();
            }
        }

        public final a a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "affa29cb29e092f752a4dd8ffe37a00c", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "affa29cb29e092f752a4dd8ffe37a00c");
            }
            this.b.a(context);
            return this;
        }

        public final a a(com.sankuai.waimai.mach.c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c22fce94660df9beef81d52f21deb57", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c22fce94660df9beef81d52f21deb57");
            }
            this.b.a(cVar);
            return this;
        }

        public final a a(JSInvokeNativeMethod jSInvokeNativeMethod) {
            Object[] objArr = {jSInvokeNativeMethod};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee175fe292f21318d6d82ed0afd55e04", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee175fe292f21318d6d82ed0afd55e04");
            }
            this.b.a(jSInvokeNativeMethod);
            return this;
        }

        public final f b(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54e9f8f41def0e4c6e335e9140ca974d", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54e9f8f41def0e4c6e335e9140ca974d") : new f(context, this);
        }
    }
}
