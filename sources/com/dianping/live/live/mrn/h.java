package com.dianping.live.live.mrn;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private static WeakReference<h> c;
    final com.sankuai.meituan.mtlive.pusher.library.b b;

    private h(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7d7b221c93d21477a27c6b6ec15565e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7d7b221c93d21477a27c6b6ec15565e");
        } else {
            this.b = com.sankuai.meituan.mtlive.pusher.library.h.a(context, 141374);
        }
    }

    public static h a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "914e232edefc0c4a34d9435778f235ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "914e232edefc0c4a34d9435778f235ab");
        }
        if (c == null || c.get() == null) {
            c = new WeakReference<>(new h(context));
        }
        return c.get();
    }

    public final void a(com.sankuai.meituan.mtlive.pusher.library.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7424ef887d2e690e401d56e8d08460a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7424ef887d2e690e401d56e8d08460a");
        } else {
            this.b.a((com.sankuai.meituan.mtlive.pusher.library.b) fVar);
        }
    }

    public final void a(com.sankuai.meituan.mtlive.pusher.library.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4057785e638b5fe2dc81704e601f02f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4057785e638b5fe2dc81704e601f02f2");
        } else {
            this.b.a(cVar);
        }
    }

    public final void a(MLivePusherView mLivePusherView) {
        Object[] objArr = {mLivePusherView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e27b41341884555e090fac1e48ddd1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e27b41341884555e090fac1e48ddd1e");
        } else {
            this.b.a(mLivePusherView);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d564a98af3ba4c643d39ff16d4784f8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d564a98af3ba4c643d39ff16d4784f8b");
        } else {
            this.b.a(z);
        }
    }

    public final int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dde666682c4f154f8bbcc8f7dd50b80", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dde666682c4f154f8bbcc8f7dd50b80")).intValue() : this.b.a(str);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74cd7b5a63326f507ffa8ee5e5d17b92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74cd7b5a63326f507ffa8ee5e5d17b92");
        } else {
            this.b.f();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b8be8a1d2559577a5520204f2e1273c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b8be8a1d2559577a5520204f2e1273c");
            return;
        }
        this.b.m();
        c.clear();
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61f407708428331e7df67d8ba17004dd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61f407708428331e7df67d8ba17004dd")).booleanValue() : this.b.e();
    }

    public final void a(int i, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7ebacc3fb326eb2c819438b8e4adb0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7ebacc3fb326eb2c819438b8e4adb0d");
        } else {
            this.b.a(i, z, false);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27cc36aed5e433bbdac453e563065dae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27cc36aed5e433bbdac453e563065dae");
        } else {
            this.b.c();
        }
    }

    public final boolean b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "250a23d2a36cdeec927ec935ceb974e4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "250a23d2a36cdeec927ec935ceb974e4")).booleanValue() : this.b.b(z);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa4807ddab707e5c8c130a320015af8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa4807ddab707e5c8c130a320015af8d");
        } else {
            this.b.c(i);
        }
    }

    public final boolean c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2d78d36dfef62487f8e4899efa994df", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2d78d36dfef62487f8e4899efa994df")).booleanValue() : this.b.d(z);
    }

    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d18d95bde934fd2a4071b854e8ca8da8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d18d95bde934fd2a4071b854e8ca8da8")).intValue() : this.b.d();
    }

    public final boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a681bdba03c2f7ca832aa38acfc0c09f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a681bdba03c2f7ca832aa38acfc0c09f")).booleanValue() : this.b.a(i);
    }

    public final com.sankuai.meituan.mtlive.pusher.library.a f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e312217ff73e86206b79442cbf3cfcd4", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.mtlive.pusher.library.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e312217ff73e86206b79442cbf3cfcd4") : this.b.l();
    }

    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee38dab2b81acdf2766ea49dc7a2a7a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee38dab2b81acdf2766ea49dc7a2a7a6");
        } else {
            this.b.c(z);
        }
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8cb71dfa14ad45400a565153ff1d53b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8cb71dfa14ad45400a565153ff1d53b")).booleanValue() : this.b.i();
    }
}
