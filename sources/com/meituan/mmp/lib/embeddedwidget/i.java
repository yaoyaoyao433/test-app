package com.meituan.mmp.lib.embeddedwidget;

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

    public final i a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7003936cc4ab6bf43c16ded8544bb685", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7003936cc4ab6bf43c16ded8544bb685");
        }
        this.d = dVar;
        dVar.setMPWidget(this);
        return this;
    }

    public final boolean g() {
        return this.c != null;
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.f
    public final e e() {
        return this.b;
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.f
    public final void a(g gVar) {
        this.f = false;
        this.c = gVar;
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.e
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08e6c056e72b327c881cc88ee1186674", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08e6c056e72b327c881cc88ee1186674");
        }
        if (this.b != null) {
            return this.b.a();
        }
        return null;
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.e
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4c7ea0b26102af62181aa8e89ccf84b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4c7ea0b26102af62181aa8e89ccf84b");
        }
        if (this.b != null) {
            return this.b.b();
        }
        return null;
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.e
    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebcd2295fd201b1e19a44d25d683d203", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebcd2295fd201b1e19a44d25d683d203")).intValue();
        }
        if (this.b != null) {
            return this.b.c();
        }
        return 0;
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.e
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50c3aa9565f37d298a63658b6f82d308", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50c3aa9565f37d298a63658b6f82d308");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1053c6f45708d374f8a076cf812155aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1053c6f45708d374f8a076cf812155aa");
        } else if (this.c != null) {
            this.c.evaluateJavaScript(str, mTValueCallback);
        }
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.f
    public final void a(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a8b689269f196756394bbbd23a7d91a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a8b689269f196756394bbbd23a7d91a");
            return;
        }
        com.meituan.mmp.lib.trace.b.a("MPMapView onSurfaceCreated ", this, surface, this.d);
        this.e = surface;
        if (this.d != null) {
            this.d.setSurface(surface);
        }
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.f
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29cf1ba577c2f20bd2a2a85fab94c470", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29cf1ba577c2f20bd2a2a85fab94c470");
        } else if (this.d != null) {
            this.d.a(this.e, i, i2);
        }
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.f
    public final void a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b01096a52e36e5eff1e66af3689ba1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b01096a52e36e5eff1e66af3689ba1");
        } else if (this.d != null) {
            this.d.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.f
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e736bdff81991faf7fb492ac39cbdfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e736bdff81991faf7fb492ac39cbdfe");
        } else {
            this.d.b(z);
        }
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.f
    public final void b(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7f979faa00970e5c5fe8fed4a871a36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7f979faa00970e5c5fe8fed4a871a36");
            return;
        }
        if (this.d != null) {
            this.d.a();
        }
        this.e = null;
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.f
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22c0cad10290044118cb58e4af798ed3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22c0cad10290044118cb58e4af798ed3");
            return;
        }
        this.c = null;
        this.f = true;
    }
}
