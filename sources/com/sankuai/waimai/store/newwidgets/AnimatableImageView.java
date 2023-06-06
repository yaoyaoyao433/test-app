package com.sankuai.waimai.store.newwidgets;

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
import com.sankuai.waimai.store.base.log.a;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes5.dex */
public class AnimatableImageView extends ImageView {
    public static ChangeQuickRedirect a;
    private int b;

    public AnimatableImageView(Context context, @DrawableRes int i) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bf9079a38045e31fc4402e7bfeefc1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bf9079a38045e31fc4402e7bfeefc1c");
        } else {
            setImageResource(i);
        }
    }

    public AnimatableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f68d4a0f99a735ca0b037995dc99eaa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f68d4a0f99a735ca0b037995dc99eaa");
        } else {
            a(context, attributeSet);
        }
    }

    public AnimatableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01613b8f9c7a874e80fd2801ea1e8979", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01613b8f9c7a874e80fd2801ea1e8979");
        } else {
            a(context, attributeSet);
        }
    }

    @TargetApi(21)
    public AnimatableImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa777bc886bf387e3b1e4df7d7152118", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa777bc886bf387e3b1e4df7d7152118");
        } else {
            a(context, attributeSet);
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5d830098dfa77154430e3b8bf34f306", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5d830098dfa77154430e3b8bf34f306");
            return;
        }
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.drawableRes});
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                setImageResource(resourceId);
            }
            obtainStyledAttributes.recycle();
        } catch (Exception e) {
            a.a(e);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49f259dfe4a49df9c3a75f8c5a627803", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49f259dfe4a49df9c3a75f8c5a627803");
            return;
        }
        super.onAttachedToWindow();
        b();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c51fed03f742799a1ce7b1a1afd2d540", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c51fed03f742799a1ce7b1a1afd2d540");
            return;
        }
        a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe531c8566c4d6e6183c68755ab564f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe531c8566c4d6e6183c68755ab564f2");
            return;
        }
        a();
        super.onStartTemporaryDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33936a2639f369660789e9bfd27ac9ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33936a2639f369660789e9bfd27ac9ac");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82cbc9ee0a6ecc7f13f7ee9d63a38bb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82cbc9ee0a6ecc7f13f7ee9d63a38bb3");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "320d9896e569d14a71b4a19a0aca214a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "320d9896e569d14a71b4a19a0aca214a");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "080a072a7606db985c7df228a483385a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "080a072a7606db985c7df228a483385a");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0f42f8f6bea5f400c558c4361d369aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0f42f8f6bea5f400c558c4361d369aa");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82b6aa47c2155613e1c6a1ae3a425f94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82b6aa47c2155613e1c6a1ae3a425f94");
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
