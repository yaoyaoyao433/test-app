package com.meituan.msc.modules.api.msi.embed;

import android.view.MotionEvent;
import android.view.Surface;
import com.meituan.msc.modules.page.embeddedwidget.d;
import com.meituan.msc.modules.page.embeddedwidget.i;
import com.meituan.msi.view.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements d {
    public static ChangeQuickRedirect a;
    private c b;

    @Override // com.meituan.msc.modules.page.embeddedwidget.d
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7b58035118bb62c096ae6d40e13094e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7b58035118bb62c096ae6d40e13094e");
        }
    }

    public b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bd0981482c3ce72aa5430d98fee56de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bd0981482c3ce72aa5430d98fee56de");
        } else {
            this.b = cVar;
        }
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.d
    public final void a(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4599d4e4b14882305846b1be23c009a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4599d4e4b14882305846b1be23c009a9");
        } else if (this.b != null) {
            this.b.setSurface(surface);
        }
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.d
    public final void a(Surface surface, int i, int i2) {
        Object[] objArr = {surface, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e56df382bc25be00da74bd4727aa227", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e56df382bc25be00da74bd4727aa227");
        } else if (this.b != null) {
            this.b.a(surface, i, i2);
        }
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.d
    public final boolean a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5b68263664e6c0dae0bcfe50d4026b7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5b68263664e6c0dae0bcfe50d4026b7")).booleanValue();
        }
        if (this.b != null) {
            this.b.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c2ea81e947713bb6f3c90ef4e8b4c0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c2ea81e947713bb6f3c90ef4e8b4c0f");
        } else if (this.b != null) {
            this.b.d();
        }
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.c
    public final void a(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6681e6d6a5a646e2d47a43bcc8769437", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6681e6d6a5a646e2d47a43bcc8769437");
        } else if (this.b != null) {
            this.b.setSLWidget(iVar);
        }
    }
}
