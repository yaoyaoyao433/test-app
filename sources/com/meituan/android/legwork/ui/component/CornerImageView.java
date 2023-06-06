package com.meituan.android.legwork.ui.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CornerImageView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    private Path b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public CornerImageView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74d834d1d748a4d2712af1b181c72050", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74d834d1d748a4d2712af1b181c72050");
        }
    }

    public CornerImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66ba7b0dbcd89b4926372967bf5d190f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66ba7b0dbcd89b4926372967bf5d190f");
        }
    }

    public CornerImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d92cd3a9d16e009fd920dbe974d2090b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d92cd3a9d16e009fd920dbe974d2090b");
            return;
        }
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.radius, R.attr.left_top_radius, R.attr.right_top_radius, R.attr.right_bottom_radius, R.attr.left_bottom_radius});
            this.c = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
            this.d = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
            this.e = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            this.f = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
            obtainStyledAttributes.recycle();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b4249caf2180aa4de26c4b916d1bd3f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b4249caf2180aa4de26c4b916d1bd3f");
            } else {
                this.b = new Path();
            }
        } catch (Exception e) {
            x.e("CornerImageView.CornerImageView()", "exception msg:", e);
            x.a(e);
        }
    }

    public void setLeftTopRadius(int i) {
        this.c = i;
    }

    public void setRightTopRadius(int i) {
        this.d = i;
    }

    public void setRightBottomRadius(int i) {
        this.e = i;
    }

    public void setLeftBottomRadius(int i) {
        this.f = i;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49c8c918355a5bb1daece0623ad07f63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49c8c918355a5bb1daece0623ad07f63");
            return;
        }
        this.g = getWidth();
        this.h = getHeight();
        try {
            if (this.b != null && this.g >= this.d && this.h >= this.e) {
                this.b.moveTo(this.c, 0.0f);
                this.b.lineTo(this.g - this.d, 0.0f);
                this.b.quadTo(this.g, 0.0f, this.g, this.d);
                this.b.lineTo(this.g, this.h - this.e);
                this.b.quadTo(this.g, this.h, this.g - this.e, this.h);
                this.b.lineTo(this.f, this.h);
                this.b.quadTo(0.0f, this.h, 0.0f, this.h - this.f);
                this.b.lineTo(0.0f, this.c);
                this.b.quadTo(0.0f, 0.0f, this.c, 0.0f);
                canvas.clipPath(this.b);
            }
        } catch (Exception e) {
            x.a(e);
        }
        super.onDraw(canvas);
    }
}
