package com.sankuai.waimai.store.drug.widgets.shimmer;

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
import com.sankuai.waimai.store.drug.widgets.shimmer.DrugShimmer;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugShimmerFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect a;
    public final a b;
    private final Paint c;
    private boolean d;
    private boolean e;

    public DrugShimmerFrameLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d6ea32004ed98ef80dfa432df1a65f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d6ea32004ed98ef80dfa432df1a65f4");
            return;
        }
        this.c = new Paint();
        this.b = new a();
        this.d = true;
        this.e = false;
        a(context, null);
    }

    public DrugShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5121449e50df79b2fcde1c8c23f5c539", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5121449e50df79b2fcde1c8c23f5c539");
            return;
        }
        this.c = new Paint();
        this.b = new a();
        this.d = true;
        this.e = false;
        a(context, attributeSet);
    }

    public DrugShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d6c3f6541c1f39c2f81300c9a67f8d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d6c3f6541c1f39c2f81300c9a67f8d1");
            return;
        }
        this.c = new Paint();
        this.b = new a();
        this.d = true;
        this.e = false;
        a(context, attributeSet);
    }

    @TargetApi(21)
    public DrugShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74ccccb97ec9c92fea69a79cae8fddb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74ccccb97ec9c92fea69a79cae8fddb0");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "390ea3d36dba0397a4457ebfe3df1bc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "390ea3d36dba0397a4457ebfe3df1bc3");
            return;
        }
        setWillNotDraw(false);
        this.b.setCallback(this);
        if (attributeSet == null) {
            a(new DrugShimmer.a().b());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.drug_shimmer_clip_to_children, R.attr.drug_shimmer_colored, R.attr.drug_shimmer_base_color, R.attr.drug_shimmer_highlight_color, R.attr.drug_shimmer_base_alpha, R.attr.drug_shimmer_highlight_alpha, R.attr.drug_shimmer_auto_start, R.attr.drug_shimmer_duration, R.attr.drug_shimmer_repeat_count, R.attr.drug_shimmer_repeat_delay, R.attr.drug_shimmer_repeat_mode, R.attr.drug_shimmer_start_delay, R.attr.drug_shimmer_direction, R.attr.drug_shimmer_dropoff, R.attr.drug_shimmer_fixed_width, R.attr.drug_shimmer_fixed_height, R.attr.drug_shimmer_intensity, R.attr.drug_shimmer_width_ratio, R.attr.drug_shimmer_height_ratio, R.attr.drug_shimmer_shape, R.attr.drug_shimmer_tilt}, 0, 0);
        try {
            a(((obtainStyledAttributes.hasValue(1) && obtainStyledAttributes.getBoolean(1, false)) ? new DrugShimmer.c() : new DrugShimmer.a()).a(obtainStyledAttributes).b());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private DrugShimmerFrameLayout a(@Nullable DrugShimmer drugShimmer) {
        Object[] objArr = {drugShimmer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4457a5bf604deb0fd3c74b1f6aa30c81", RobustBitConfig.DEFAULT_VALUE)) {
            return (DrugShimmerFrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4457a5bf604deb0fd3c74b1f6aa30c81");
        }
        this.b.a(drugShimmer);
        if (drugShimmer != null && drugShimmer.p) {
            setLayerType(2, this.c);
        } else {
            setLayerType(0, null);
        }
        return this;
    }

    @Nullable
    public DrugShimmer getShimmer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1108b9a5729d1cfe09189a836191521", RobustBitConfig.DEFAULT_VALUE) ? (DrugShimmer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1108b9a5729d1cfe09189a836191521") : this.b.c;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6111f121b987c1d5f0d6784bc9a56d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6111f121b987c1d5f0d6784bc9a56d8");
            return;
        }
        this.e = false;
        a aVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f59c1aa5cf8a7267b6e37277a5767afa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f59c1aa5cf8a7267b6e37277a5767afa");
        } else if (aVar.b == null || !aVar.a()) {
        } else {
            aVar.b.cancel();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2beea1fd93ca5a884ee3a43a7f378170", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2beea1fd93ca5a884ee3a43a7f378170");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4d77560603812bf396415668709d7db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4d77560603812bf396415668709d7db");
            return;
        }
        super.onVisibilityChanged(view, i);
        if (this.b == null) {
            return;
        }
        if (i != 0) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c39a5ed2f05b867bc314141e7818b452", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c39a5ed2f05b867bc314141e7818b452")).booleanValue() : this.b.a()) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e4fc81d6ad114789f34fa4a0e373799", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e4fc81d6ad114789f34fa4a0e373799");
            return;
        }
        super.onAttachedToWindow();
        this.b.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c5916df556cbb5c18a1c1c1ef5cd2ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c5916df556cbb5c18a1c1c1ef5cd2ab");
            return;
        }
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff213203a76915296da3bc14ecca9e32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff213203a76915296da3bc14ecca9e32");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec1d798482c924ece5a9c8ce33fdc6d6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec1d798482c924ece5a9c8ce33fdc6d6")).booleanValue() : super.verifyDrawable(drawable) || drawable == this.b;
    }
}
