package com.meituan.msc.modules.page.embeddedwidget;

import android.view.MotionEvent;
import android.view.Surface;
import com.meituan.mtwebkit.MTValueCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i implements f {
    public static ChangeQuickRedirect a;
    public e b;
    public g c;
    public d d;
    public Surface e;
    public boolean f;

    @Override // com.meituan.msc.modules.page.embeddedwidget.f
    public final e e() {
        return this.b;
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.f
    public final void a(g gVar) {
        this.f = false;
        this.c = gVar;
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.e
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3190a1e573910874a28e92cc0a48f6d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3190a1e573910874a28e92cc0a48f6d0");
        }
        if (this.b != null) {
            return this.b.a();
        }
        return null;
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.e
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad22df75148bd4641ab4ac33b1e83008", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad22df75148bd4641ab4ac33b1e83008");
        }
        if (this.b != null) {
            return this.b.b();
        }
        return null;
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.e
    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb099d114dc642ede8483c05cb3c3fc6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb099d114dc642ede8483c05cb3c3fc6")).intValue();
        }
        if (this.b != null) {
            return this.b.c();
        }
        return 0;
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.e
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23bed93909394a1843d55af83a3ecc77", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23bed93909394a1843d55af83a3ecc77");
        }
        if (this.b != null) {
            return this.b.d();
        }
        return null;
    }

    @Override // com.meituan.mtwebkit.internal.hyper.SameLayerWidget
    public final void evaluateJavaScript(String str, MTValueCallback<String> mTValueCallback) {
        Object[] objArr = {str, mTValueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60cf9fa2e468204732c29dffc34e1f73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60cf9fa2e468204732c29dffc34e1f73");
        } else if (this.c != null) {
            this.c.evaluateJavaScript(str, mTValueCallback);
        }
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.f
    public final void a(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac941fe175c2e4f8989d5969acccf133", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac941fe175c2e4f8989d5969acccf133");
            return;
        }
        com.meituan.msc.modules.reporter.g.b("MPMapView onSurfaceCreated ", this, surface, this.d);
        this.e = surface;
        if (this.d != null) {
            this.d.a(surface);
        }
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.f
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c26518fdec3e21b9a7e021440ed64e87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c26518fdec3e21b9a7e021440ed64e87");
        } else if (this.d != null) {
            this.d.a(this.e, i, i2);
        }
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.f
    public final void a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0ee4065478606aa43b5008396567770", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0ee4065478606aa43b5008396567770");
        } else if (this.d != null) {
            this.d.a(motionEvent);
        }
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.f
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebd46e6caea51baa5e3aa0a3c464eac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebd46e6caea51baa5e3aa0a3c464eac0");
        } else {
            this.d.a(z);
        }
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.f
    public final void b(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c0c7bb5db91f8a4d07af77c4dd28deb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c0c7bb5db91f8a4d07af77c4dd28deb");
            return;
        }
        if (this.d != null) {
            this.d.a();
        }
        this.e = null;
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.f
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdef43b3a87b10e7983b1475049fbf54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdef43b3a87b10e7983b1475049fbf54");
            return;
        }
        this.c = null;
        this.f = true;
    }
}
