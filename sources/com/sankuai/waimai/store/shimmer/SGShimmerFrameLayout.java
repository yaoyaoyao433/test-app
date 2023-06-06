package com.sankuai.waimai.store.shimmer;

import android.annotation.TargetApi;
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
import com.sankuai.waimai.store.shimmer.SGShimmer;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGShimmerFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect a;
    public final a b;
    private final Paint c;
    private boolean d;
    private boolean e;

    public SGShimmerFrameLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23fe649669f86f7c1cb4b80be0fee2b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23fe649669f86f7c1cb4b80be0fee2b5");
            return;
        }
        this.c = new Paint();
        this.b = new a();
        this.d = true;
        this.e = false;
        a(context, null);
    }

    public SGShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31ecdc75a09976ac0225beb279c72ec3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31ecdc75a09976ac0225beb279c72ec3");
            return;
        }
        this.c = new Paint();
        this.b = new a();
        this.d = true;
        this.e = false;
        a(context, attributeSet);
    }

    public SGShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9340c8dbe5910c8ba9a0ab56e7cfd94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9340c8dbe5910c8ba9a0ab56e7cfd94");
            return;
        }
        this.c = new Paint();
        this.b = new a();
        this.d = true;
        this.e = false;
        a(context, attributeSet);
    }

    @TargetApi(21)
    public SGShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c0938e19572cc5ea18f64864ee8d632", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c0938e19572cc5ea18f64864ee8d632");
            return;
        }
        this.c = new Paint();
        this.b = new a();
        this.d = true;
        this.e = false;
        a(context, attributeSet);
    }

    private void a(Context context, @Nullable AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49a9adfd7d4c06042123b37648e8de49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49a9adfd7d4c06042123b37648e8de49");
            return;
        }
        setWillNotDraw(false);
        this.b.setCallback(this);
        if (attributeSet == null) {
            a(new SGShimmer.a().b());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.shimmer_clip_to_children, R.attr.shimmer_colored, R.attr.shimmer_base_color, R.attr.shimmer_highlight_color, R.attr.shimmer_base_alpha, R.attr.shimmer_highlight_alpha, R.attr.shimmer_auto_start, R.attr.shimmer_duration, R.attr.shimmer_repeat_count, R.attr.shimmer_repeat_delay, R.attr.shimmer_repeat_mode, R.attr.shimmer_start_delay, R.attr.shimmer_direction, R.attr.shimmer_dropoff, R.attr.shimmer_fixed_width, R.attr.shimmer_fixed_height, R.attr.shimmer_intensity, R.attr.shimmer_width_ratio, R.attr.shimmer_height_ratio, R.attr.shimmer_shape, R.attr.shimmer_tilt}, 0, 0);
        try {
            a(((obtainStyledAttributes.hasValue(1) && obtainStyledAttributes.getBoolean(1, false)) ? new SGShimmer.c() : new SGShimmer.a()).a(obtainStyledAttributes).b());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private SGShimmerFrameLayout a(@Nullable SGShimmer sGShimmer) {
        Object[] objArr = {sGShimmer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "900545488b2001ab11deb3c24ef20d73", RobustBitConfig.DEFAULT_VALUE)) {
            return (SGShimmerFrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "900545488b2001ab11deb3c24ef20d73");
        }
        this.b.a(sGShimmer);
        if (sGShimmer != null && sGShimmer.p) {
            setLayerType(2, this.c);
        } else {
            setLayerType(0, null);
        }
        return this;
    }

    @Nullable
    public SGShimmer getShimmer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "114d39f95be721280b4643e44c6d0fe4", RobustBitConfig.DEFAULT_VALUE) ? (SGShimmer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "114d39f95be721280b4643e44c6d0fe4") : this.b.c;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d602b715d13a4ba89f242035f0e996b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d602b715d13a4ba89f242035f0e996b5");
            return;
        }
        this.e = false;
        a aVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "4c94faaf967560384a9340d3a25c4094", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "4c94faaf967560384a9340d3a25c4094");
        } else if (aVar.b == null || !aVar.a()) {
        } else {
            aVar.b.cancel();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0ce773acfea57f8eebf0922f754efd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0ce773acfea57f8eebf0922f754efd7");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dcb55b8e2263cd8940dab88cbc9095b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dcb55b8e2263cd8940dab88cbc9095b");
            return;
        }
        super.onVisibilityChanged(view, i);
        if (this.b == null) {
            return;
        }
        if (i != 0) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "992d80b84e4df54a98d011d96837e340", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "992d80b84e4df54a98d011d96837e340")).booleanValue() : this.b.a()) {
                a();
                this.e = true;
            }
        } else if (this.e) {
            this.b.b();
            this.e = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8f71abbbc114586a3b821e2550e3a5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8f71abbbc114586a3b821e2550e3a5c");
            return;
        }
        super.onAttachedToWindow();
        this.b.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "186059988517cb6344699a9eb08ff6bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "186059988517cb6344699a9eb08ff6bb");
            return;
        }
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dafd086766bbe73c0b032050656bcaf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dafd086766bbe73c0b032050656bcaf8");
            return;
        }
        super.dispatchDraw(canvas);
        if (this.d) {
            this.b.draw(canvas);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbd93878dfd6f431dee0ec32dd63881e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbd93878dfd6f431dee0ec32dd63881e")).booleanValue() : super.verifyDrawable(drawable) || drawable == this.b;
    }
}
