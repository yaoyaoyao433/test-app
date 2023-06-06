package com.sankuai.waimai.foundation.core.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes4.dex */
public class AnimatableImageView extends ImageView {
    public static ChangeQuickRedirect a;
    private int b;

    public AnimatableImageView(Context context, @DrawableRes int i) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52201f7043ed5f69c40955f8ac9b6f0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52201f7043ed5f69c40955f8ac9b6f0c");
        } else {
            setImageResource(i);
        }
    }

    public AnimatableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b22eba102690a2aaecbeb83eb45f64f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b22eba102690a2aaecbeb83eb45f64f");
        } else {
            a(context, attributeSet);
        }
    }

    public AnimatableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fecc49ff5f3ae5c2476090fb4fd96f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fecc49ff5f3ae5c2476090fb4fd96f3");
        } else {
            a(context, attributeSet);
        }
    }

    @TargetApi(21)
    public AnimatableImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d31ad04948a4ac42810e2be2dcf562e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d31ad04948a4ac42810e2be2dcf562e3");
        } else {
            a(context, attributeSet);
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "670e5caa718af3631c0159a8732ea152", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "670e5caa718af3631c0159a8732ea152");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.coreDrawableRes});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            setImageResource(resourceId);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1337238603105c266dbbc9168368cfe2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1337238603105c266dbbc9168368cfe2");
            return;
        }
        super.onAttachedToWindow();
        b();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fd99f999c545cf01498c1a8f0a0b917", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fd99f999c545cf01498c1a8f0a0b917");
            return;
        }
        a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33c4fab238e3f746132e56d321ce05df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33c4fab238e3f746132e56d321ce05df");
            return;
        }
        a();
        super.onStartTemporaryDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eefb4a6b3f6d7dd5e7f9bab4a9e5f3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eefb4a6b3f6d7dd5e7f9bab4a9e5f3c");
            return;
        }
        super.onFinishTemporaryDetach();
        b();
    }

    @Override // android.widget.ImageView
    @SuppressLint({"ResourceType"})
    public void setImageResource(@DrawableRes int i) {
        Drawable drawable;
        Drawable drawable2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7d6b8f04884482d72ce9159af0c1f9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7d6b8f04884482d72ce9159af0c1f9e");
            return;
        }
        if (this.b != i && (drawable2 = getDrawable()) != null && (drawable2 instanceof Animatable)) {
            ((Animatable) drawable2).stop();
        }
        this.b = i;
        if (this.b != 0) {
            super.setImageResource(this.b);
        } else {
            super.setImageDrawable(null);
        }
        if (getVisibility() == 0 && (drawable = getDrawable()) != null && (drawable instanceof Animatable)) {
            ((Animatable) drawable).start();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "546f601720f33e54d3da5b504e2be287", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "546f601720f33e54d3da5b504e2be287");
            return;
        }
        this.b = 0;
        Drawable drawable2 = getDrawable();
        if (drawable2 != null && (drawable2 instanceof Animatable)) {
            ((Animatable) drawable2).stop();
        }
        super.setImageDrawable(drawable);
        if (getVisibility() == 0 && drawable != null && (drawable instanceof Animatable)) {
            ((Animatable) drawable).start();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22c370476c40cd11e0b39bfb629754c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22c370476c40cd11e0b39bfb629754c6");
            return;
        }
        super.setVisibility(i);
        if (i == 0) {
            b();
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "238ccdcfba8bfa64f892f23e5ed86a1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "238ccdcfba8bfa64f892f23e5ed86a1c");
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable != null && (drawable instanceof Animatable)) {
            ((Animatable) drawable).stop();
        }
        if (this.b != 0) {
            super.setImageDrawable(null);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed2ae20f6601f2e90ebcae947f2e8a44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed2ae20f6601f2e90ebcae947f2e8a44");
        } else if (getVisibility() == 0) {
            if (this.b != 0) {
                super.setImageResource(this.b);
            }
            Drawable drawable = getDrawable();
            if (drawable == null || !(drawable instanceof Animatable)) {
                return;
            }
            ((Animatable) drawable).start();
        }
    }
}
