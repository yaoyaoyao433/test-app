package com.meituan.mmp.lib.msi.embed;

import android.view.MotionEvent;
import android.view.Surface;
import com.meituan.mmp.lib.embeddedwidget.d;
import com.meituan.mmp.lib.embeddedwidget.i;
import com.meituan.msi.view.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements d {
    public static ChangeQuickRedirect a;
    private c b;

    @Override // com.meituan.mmp.lib.embeddedwidget.c
    public final void a(boolean z) {
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.d
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f494750f69d8787d3867ed8bc32aa27c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f494750f69d8787d3867ed8bc32aa27c");
        }
    }

    public b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc4da193ea8c8b5ed0849beb072cbdda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc4da193ea8c8b5ed0849beb072cbdda");
        } else {
            this.b = cVar;
        }
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.d
    public final void setSurface(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc1148abd2888ed950631c409c27b6bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc1148abd2888ed950631c409c27b6bf");
        } else if (this.b != null) {
            this.b.setSurface(surface);
        }
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.d
    public final void a(Surface surface, int i, int i2) {
        Object[] objArr = {surface, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26dccf9d028957a2bf5f4d8ce60d502f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26dccf9d028957a2bf5f4d8ce60d502f");
        } else if (this.b != null) {
            this.b.a(surface, i, i2);
        }
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.d, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4945e03056424db5d30154493a4d94c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4945e03056424db5d30154493a4d94c")).booleanValue();
        }
        if (this.b != null) {
            this.b.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "442760e4f754da710d060357f078c05b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "442760e4f754da710d060357f078c05b");
        } else if (this.b != null) {
            this.b.d();
        }
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.c
    public final void setMPWidget(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f80f0ae86bc2e009995be8a6a31c3827", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f80f0ae86bc2e009995be8a6a31c3827");
        } else if (this.b != null) {
            this.b.setSLWidget(iVar);
        }
    }
}
