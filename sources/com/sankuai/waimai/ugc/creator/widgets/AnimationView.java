package com.sankuai.waimai.ugc.creator.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class AnimationView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    private int b;

    public AnimationView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24a9e3b977c8058943289aeeb3c02433", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24a9e3b977c8058943289aeeb3c02433");
        } else {
            a(context, null);
        }
    }

    public AnimationView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae7d450bb66636ccf1698fec24f611e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae7d450bb66636ccf1698fec24f611e7");
        } else {
            a(context, attributeSet);
        }
    }

    public AnimationView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72c0d781ad0f4a860a5c2a0b2edd057d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72c0d781ad0f4a860a5c2a0b2edd057d");
        } else {
            a(context, attributeSet);
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "332105ef728a70130753c05bdc83c3be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "332105ef728a70130753c05bdc83c3be");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843033});
        this.b = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f13ee5e58a772e43e92c142ab88dd1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f13ee5e58a772e43e92c142ab88dd1e");
            return;
        }
        super.onAttachedToWindow();
        b();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5050e32a00825e4c3b1c0e741b64f32a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5050e32a00825e4c3b1c0e741b64f32a");
            return;
        }
        a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50d420ff85db47492d3faf944afed832", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50d420ff85db47492d3faf944afed832");
            return;
        }
        a();
        super.onStartTemporaryDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9ce9f99a61f30ce671896f8fe45fb7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9ce9f99a61f30ce671896f8fe45fb7c");
            return;
        }
        super.onFinishTemporaryDetach();
        b();
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a025bdfe5775e4d7902dbb5188922173", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a025bdfe5775e4d7902dbb5188922173");
            return;
        }
        this.b = 0;
        Drawable drawable2 = getDrawable();
        if (drawable2 instanceof Animatable) {
            ((Animatable) drawable2).stop();
        }
        super.setImageDrawable(drawable);
        if (getVisibility() == 0 && (drawable instanceof Animatable)) {
            ((Animatable) drawable).start();
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    @SuppressLint({"ResourceType"})
    public void setImageResource(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9abdc7e330570314b0b80997bb1af63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9abdc7e330570314b0b80997bb1af63");
            return;
        }
        if (this.b != i) {
            Drawable drawable = getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
        }
        this.b = i;
        if (this.b != 0) {
            super.setImageResource(this.b);
        } else {
            super.setImageDrawable(null);
        }
        if (getVisibility() == 0) {
            Drawable drawable2 = getDrawable();
            if (drawable2 instanceof Animatable) {
                ((Animatable) drawable2).start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a83c172e542cc38ea92ffcf8df52a1d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a83c172e542cc38ea92ffcf8df52a1d4");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb7c7450a170957b698c285ba7cca9cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb7c7450a170957b698c285ba7cca9cc");
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        if (this.b != 0) {
            super.setImageDrawable(null);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f1e4f2b25d5128fc48827fe91185f3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f1e4f2b25d5128fc48827fe91185f3c");
        } else if (getVisibility() == 0) {
            if (this.b != 0) {
                super.setImageResource(this.b);
            }
            Drawable drawable = getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            }
        }
    }
}
