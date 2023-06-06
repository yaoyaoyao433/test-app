package com.sankuai.waimai.business.page.common.list.animate;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AnimatorZoomCircleImageView extends ImageView {
    public static ChangeQuickRedirect a;
    private float b;
    private int c;
    private int d;
    private int e;
    private Path f;
    private boolean g;

    public float getRadius() {
        return this.b;
    }

    public void setRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91814025781dcc3f837d910f94528950", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91814025781dcc3f837d910f94528950");
            return;
        }
        this.b = f;
        if (this.g) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7727019154b8366be31479f220a27c72", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7727019154b8366be31479f220a27c72");
            } else {
                this.f.reset();
                this.f.addCircle(this.d / 2, this.e / 2, this.c * this.b, Path.Direction.CW);
            }
            invalidate();
        }
    }

    public AnimatorZoomCircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7715291fd86500f1cbabc59ce6e2f027", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7715291fd86500f1cbabc59ce6e2f027");
        } else {
            a(context);
        }
    }

    public AnimatorZoomCircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b91da8f6df69ec5a356aa405fdfaa16", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b91da8f6df69ec5a356aa405fdfaa16");
        } else {
            a(context);
        }
    }

    public AnimatorZoomCircleImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "627d12da3606c909492b5f038ca61f5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "627d12da3606c909492b5f038ca61f5e");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43bfae30c11ebdecf1eabd0e2e78e167", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43bfae30c11ebdecf1eabd0e2e78e167");
        } else {
            this.f = new Path();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60b57c7f20e381287e301828bf1f3aaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60b57c7f20e381287e301828bf1f3aaa");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.d = i;
        this.e = i2;
        this.c = (int) ((i / 2) * 1.4143d);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eef0963cce9ad72aa873ff21ac1efe3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eef0963cce9ad72aa873ff21ac1efe3c");
            return;
        }
        if (this.g) {
            canvas.clipPath(this.f);
        }
        super.onDraw(canvas);
    }

    public void setAllowAnimator(boolean z) {
        this.g = z;
    }
}
