package com.sankuai.waimai.skeleton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.skeleton.shimmer.Shimmer;
import com.sankuai.waimai.skeleton.shimmer.ShimmerFrameLayout;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMSkeleton extends FrameLayout {
    public static ChangeQuickRedirect a;
    private Shimmer.a b;
    private Shimmer c;
    private float d;
    private float e;
    private int f;
    private float g;
    private Drawable h;

    public WMSkeleton(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc1e3217013a8c4c5a54349b6641fc6d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc1e3217013a8c4c5a54349b6641fc6d");
        }
    }

    public WMSkeleton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f67ab09bed01d775119bc93bae73e203", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f67ab09bed01d775119bc93bae73e203");
            return;
        }
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "997b3161dcae83d0d82503846f1e4fde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "997b3161dcae83d0d82503846f1e4fde");
            return;
        }
        this.b = new Shimmer.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.wm_shimmer_base_alpha, R.attr.wm_shimmer_highlight_alpha, R.attr.wm_shimmer_duration, R.attr.wm_shimmer_width, R.attr.wm_shimmer_height, R.attr.wm_shimmer_angle, R.attr.skeleton});
            Object[] objArr3 = {obtainStyledAttributes};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "834a8341b084b995d580e939c4d3e20a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "834a8341b084b995d580e939c4d3e20a");
            } else {
                if (obtainStyledAttributes.hasValue(0)) {
                    this.d = obtainStyledAttributes.getFloat(0, 0.0f);
                }
                if (obtainStyledAttributes.hasValue(1)) {
                    this.e = obtainStyledAttributes.getFloat(1, 1.0f);
                }
                if (obtainStyledAttributes.hasValue(2)) {
                    this.f = obtainStyledAttributes.getInteger(2, 1000);
                }
                if (obtainStyledAttributes.hasValue(5)) {
                    this.g = obtainStyledAttributes.getFloat(5, 0.0f);
                }
                if (obtainStyledAttributes.hasValue(6)) {
                    this.h = obtainStyledAttributes.getDrawable(6);
                }
            }
            obtainStyledAttributes.recycle();
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "29e590b359c06b07b351953f89dd5f29", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "29e590b359c06b07b351953f89dd5f29");
            } else {
                setSkeletonBackground(R.drawable.skeleton_background);
            }
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e8d03015d18f4b207ce53912214ea552", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e8d03015d18f4b207ce53912214ea552");
            } else {
                ImageView imageView = new ImageView(getContext());
                if (this.h != null) {
                    imageView.setImageDrawable(this.h);
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    imageView.setAdjustViewBounds(true);
                    addView(imageView, new FrameLayout.LayoutParams(-1, -2));
                }
            }
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "26052ce1f5cd1833394c30a9778ea0e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "26052ce1f5cd1833394c30a9778ea0e4");
                return;
            }
            ShimmerFrameLayout shimmerFrameLayout = new ShimmerFrameLayout(getContext());
            this.c = this.b.b(this.d).c(this.e).a(this.f).a(this.g).b();
            shimmerFrameLayout.a(this.c);
            shimmerFrameLayout.setBackgroundColor(-1);
            addView(shimmerFrameLayout, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public WMSkeleton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de359af2a6a8fb6e21b231a29bc5d671", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de359af2a6a8fb6e21b231a29bc5d671");
        }
    }

    public WMSkeleton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a18add485186f80d495612265df41e5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a18add485186f80d495612265df41e5a");
        }
    }

    private void setSkeletonBackground(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a05002f8298f908b5cd77fe5bb1ab963", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a05002f8298f908b5cd77fe5bb1ab963");
            return;
        }
        setBackgroundResource(i);
        setClipToOutline(true);
    }
}
