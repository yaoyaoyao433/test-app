package com.sankuai.xm.imui.common.view.shape;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ShapeFrameLayout extends FrameLayout implements d {
    public static ChangeQuickRedirect a;
    private final c b;

    public ShapeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0a8c2b502652f69a3c3793dd05135a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0a8c2b502652f69a3c3793dd05135a2");
        } else {
            this.b = new c(this);
        }
    }

    public ShapeFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c1f51919c368f33a240e1e7d5ff7222", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c1f51919c368f33a240e1e7d5ff7222");
        }
    }

    public ShapeFrameLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7d80fb46c17af478f74e8bce18616b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7d80fb46c17af478f74e8bce18616b0");
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff0e92e5b2c729c52f6ac735180aaab6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff0e92e5b2c729c52f6ac735180aaab6");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            c cVar = this.b;
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "3c819896170f99c61cc6fa7582564d05", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "3c819896170f99c61cc6fa7582564d05");
                return;
            }
            cVar.d.set(0.0f, 0.0f, i3 - i, i4 - i2);
            if (cVar.b != null) {
                cVar.b.a(cVar.d);
            }
        }
    }

    public a getShape() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "632348c0d6203f667e0183fac7081072", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "632348c0d6203f667e0183fac7081072") : this.b.b;
    }

    @Override // com.sankuai.xm.imui.common.view.shape.d
    public void setShape(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f3f126f88c5129edad362c5f3bb964c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f3f126f88c5129edad362c5f3bb964c");
        } else {
            this.b.b = aVar;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94613764a0c24755d9fcec49714d983c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94613764a0c24755d9fcec49714d983c");
            return;
        }
        c cVar = this.b;
        Object[] objArr2 = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "b4c02afa9d1a1187594cf0551af256ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "b4c02afa9d1a1187594cf0551af256ac");
        } else if (cVar.b != null) {
            cVar.b.a(canvas);
            canvas.saveLayer(cVar.d, cVar.c, 31);
        }
        super.dispatchDraw(canvas);
        c cVar2 = this.b;
        Object[] objArr3 = {canvas};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "aed2795fc24cba0cae3bdbd2e4ee6d51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "aed2795fc24cba0cae3bdbd2e4ee6d51");
        } else if (cVar2.b != null) {
            canvas.restore();
            cVar2.b.b(canvas);
        }
    }
}
