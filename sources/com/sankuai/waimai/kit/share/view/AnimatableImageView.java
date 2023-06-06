package com.sankuai.waimai.kit.share.view;

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
/* loaded from: classes5.dex */
public class AnimatableImageView extends ImageView {
    public static ChangeQuickRedirect a;
    private String b;
    private int c;

    public AnimatableImageView(Context context, @DrawableRes int i) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2186ca746ba5b04e1cde780922ae0434", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2186ca746ba5b04e1cde780922ae0434");
            return;
        }
        this.b = "AnimatableImageView";
        setImageResource(i);
    }

    public AnimatableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aec14639c7ca9ae57dc8c105f50b1d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aec14639c7ca9ae57dc8c105f50b1d8");
            return;
        }
        this.b = "AnimatableImageView";
        a(context, attributeSet);
    }

    public AnimatableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4681d1e2c867f16c0b3ce5e58b32f4d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4681d1e2c867f16c0b3ce5e58b32f4d5");
            return;
        }
        this.b = "AnimatableImageView";
        a(context, attributeSet);
    }

    @TargetApi(21)
    public AnimatableImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd04fa59cfbbb52e3f978dda8a76eb7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd04fa59cfbbb52e3f978dda8a76eb7a");
            return;
        }
        this.b = "AnimatableImageView";
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28db1f0d53bff7a634e5dd53fa8c4714", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28db1f0d53bff7a634e5dd53fa8c4714");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.drawableRes});
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45aafba624bb19a1b586a16ade6188e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45aafba624bb19a1b586a16ade6188e8");
            return;
        }
        super.onAttachedToWindow();
        b();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26d37cdf3f0578c0889bc812274d54c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26d37cdf3f0578c0889bc812274d54c0");
            return;
        }
        a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32c45f44fcd2268a41a1ce39c33b8f9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32c45f44fcd2268a41a1ce39c33b8f9f");
            return;
        }
        a();
        super.onStartTemporaryDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ee62ca84d2b2a72dcf1f74e85216741", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ee62ca84d2b2a72dcf1f74e85216741");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10923c20622b3f402630a82cee815f93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10923c20622b3f402630a82cee815f93");
            return;
        }
        if (this.c != i && (drawable2 = getDrawable()) != null && (drawable2 instanceof Animatable)) {
            ((Animatable) drawable2).stop();
        }
        this.c = i;
        if (this.c != 0) {
            super.setImageResource(this.c);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68cc83a00939d23f0e64ce9b41074739", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68cc83a00939d23f0e64ce9b41074739");
            return;
        }
        this.c = 0;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef1d84879c68c017170178b65d298e92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef1d84879c68c017170178b65d298e92");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0669e824352f66240b7191f9be09f6f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0669e824352f66240b7191f9be09f6f8");
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable != null && (drawable instanceof Animatable)) {
            ((Animatable) drawable).stop();
        }
        if (this.c != 0) {
            super.setImageDrawable(null);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cf454c1425d34620b7d547f984c68a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cf454c1425d34620b7d547f984c68a8");
        } else if (getVisibility() == 0) {
            if (this.c != 0) {
                super.setImageResource(this.c);
            }
            Drawable drawable = getDrawable();
            if (drawable == null || !(drawable instanceof Animatable)) {
                return;
            }
            ((Animatable) drawable).start();
        }
    }
}
