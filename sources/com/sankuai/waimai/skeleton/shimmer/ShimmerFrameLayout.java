package com.sankuai.waimai.skeleton.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.skeleton.shimmer.Shimmer;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ShimmerFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect a;
    private final Paint b;
    private final a c;
    private boolean d;
    private boolean e;

    public ShimmerFrameLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6815ca2ffcc99d85611aa4897703afc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6815ca2ffcc99d85611aa4897703afc");
            return;
        }
        this.b = new Paint();
        this.c = new a();
        this.d = true;
        this.e = false;
        a(context, null);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dfbebada19dfbb0972b5597159686a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dfbebada19dfbb0972b5597159686a9");
            return;
        }
        this.b = new Paint();
        this.c = new a();
        this.d = true;
        this.e = false;
        a(context, attributeSet);
    }

    private void a(Context context, @Nullable AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03a675008509dd9c7c58cbb266ba4a05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03a675008509dd9c7c58cbb266ba4a05");
            return;
        }
        setWillNotDraw(false);
        this.c.setCallback(this);
        if (attributeSet == null) {
            a(new Shimmer.a().b());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.shimmer_base_alpha, R.attr.shimmer_highlight_alpha, R.attr.shimmer_duration, R.attr.shimmer_fixed_width, R.attr.shimmer_fixed_height, R.attr.shimmer_tilt}, 0, 0);
        try {
            a(new Shimmer.a().a(obtainStyledAttributes).b());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final ShimmerFrameLayout a(@Nullable Shimmer shimmer) {
        Object[] objArr = {shimmer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f4b54547792faf314be0429c7ed1673", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShimmerFrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f4b54547792faf314be0429c7ed1673");
        }
        this.c.a(shimmer);
        if (shimmer != null && shimmer.o) {
            setLayerType(2, this.b);
        } else {
            setLayerType(0, null);
        }
        return this;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "506ba471afed1892caa6f83cb0ff6a2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "506ba471afed1892caa6f83cb0ff6a2b");
            return;
        }
        this.e = false;
        a aVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "4e014c425baced158710e5e9d5b0458c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "4e014c425baced158710e5e9d5b0458c");
        } else if (aVar.b == null || !aVar.a()) {
        } else {
            aVar.b.cancel();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea565c9dda9bab3546744c3214ba9bba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea565c9dda9bab3546744c3214ba9bba");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.c.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52e7f396a32dc66fdc537e882fbf2bd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52e7f396a32dc66fdc537e882fbf2bd0");
            return;
        }
        super.onVisibilityChanged(view, i);
        if (this.c == null) {
            return;
        }
        if (i != 0) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "daf600562a62373afc50bd2659286331", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "daf600562a62373afc50bd2659286331")).booleanValue() : this.c.a()) {
                a();
                this.e = true;
            }
        } else if (this.e) {
            this.c.b();
            this.e = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3272846f32a99592c9bd105fa51de5e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3272846f32a99592c9bd105fa51de5e7");
            return;
        }
        super.onAttachedToWindow();
        this.c.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b0d1d12ecaa175bcb3d270b8f14d3d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b0d1d12ecaa175bcb3d270b8f14d3d9");
            return;
        }
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6698897156ecca0ab2bdc2ac2696d432", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6698897156ecca0ab2bdc2ac2696d432");
            return;
        }
        super.dispatchDraw(canvas);
        if (this.d) {
            this.c.draw(canvas);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38ef71b4befa14aa4e90d3cf0d5c456d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38ef71b4befa14aa4e90d3cf0d5c456d")).booleanValue() : super.verifyDrawable(drawable) || drawable == this.c;
    }
}
