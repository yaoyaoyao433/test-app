package com.sankuai.waimai.irmo.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DelegateDrawView extends ViewGroup {
    public static ChangeQuickRedirect a;
    public final b b;
    public IrmoAnimationDelegate.Observer<Throwable> c;

    public DelegateDrawView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eebdebb07994af07afd8ccaff3387184", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eebdebb07994af07afd8ccaff3387184");
        }
    }

    private DelegateDrawView(Context context, AttributeSet attributeSet) {
        this(context, null, -1);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de4d8a8403c03f77909c05506ec006f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de4d8a8403c03f77909c05506ec006f5");
        }
    }

    public DelegateDrawView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42269911c7afecb172c7a41ff5dbd58f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42269911c7afecb172c7a41ff5dbd58f");
        } else {
            this.b = new b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ac29644b4b943a85730780ff15d7118", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ac29644b4b943a85730780ff15d7118");
            return;
        }
        if (i == 0 && i2 == 0) {
            if ((i4 == 0) & (i3 == 0)) {
                return;
            }
        }
        if (getChildCount() <= 0 || (childAt = getChildAt(0)) == null) {
            return;
        }
        b bVar = this.b;
        int left = childAt.getLeft();
        int top = childAt.getTop();
        int right = childAt.getRight();
        int bottom = childAt.getBottom();
        Object[] objArr2 = {Integer.valueOf(left), Integer.valueOf(top), Integer.valueOf(right), Integer.valueOf(bottom)};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "450b16a922a67248258f6cb43f53894c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "450b16a922a67248258f6cb43f53894c");
            return;
        }
        if (bVar.j == null) {
            bVar.j = new RectF();
        }
        bVar.j.left = left;
        bVar.j.top = top;
        bVar.j.right = right;
        bVar.j.bottom = bottom;
        new StringBuilder("rect: ").append(bVar.j.toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9381b1feaacbdd89ad71568da2525910", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9381b1feaacbdd89ad71568da2525910");
            return;
        }
        try {
            b bVar = this.b;
            Object[] objArr2 = {canvas};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "f4e8ce0822d0b190365795139752e1cf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "f4e8ce0822d0b190365795139752e1cf");
            } else if (bVar.f != null) {
                bVar.f.draw(canvas);
            }
            b bVar2 = this.b;
            Object[] objArr3 = {canvas};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "46923bb1e24a236225c4ebaaa7f2c1fa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "46923bb1e24a236225c4ebaaa7f2c1fa");
            } else if (bVar2.g != null) {
                bVar2.g.draw(canvas);
            }
            canvas.save();
            super.dispatchDraw(canvas);
            canvas.restore();
        } catch (Throwable th) {
            if (this.c != null) {
                this.c.onMsg(th);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4871d1714235723adfd73f36d1bb3a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4871d1714235723adfd73f36d1bb3a1");
            return;
        }
        super.setBackgroundColor(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setBackgroundColor(i);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Object[] objArr = {canvas, view, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5085e41da07c6dfadc24079277883414", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5085e41da07c6dfadc24079277883414")).booleanValue();
        }
        try {
            b bVar = this.b;
            Object[] objArr2 = {canvas};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "d8ad4d14e1c00a43ed85c11173c271e2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "d8ad4d14e1c00a43ed85c11173c271e2");
            } else if (bVar.h != null) {
                bVar.h.draw(canvas);
            }
            boolean drawChild = super.drawChild(canvas, view, j);
            b bVar2 = this.b;
            Object[] objArr3 = {canvas};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "73a20d0e053bf4c11c1a68ac7c44dbcf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "73a20d0e053bf4c11c1a68ac7c44dbcf");
            } else if (bVar2.i != null) {
                bVar2.i.draw(canvas);
            }
            return drawChild;
        } catch (Throwable th) {
            if (this.c != null) {
                this.c.onMsg(th);
                return false;
            }
            return false;
        }
    }

    public void setErrorListener(IrmoAnimationDelegate.Observer<Throwable> observer) {
        this.c = observer;
    }
}
