package com.sankuai.waimai.platform.widget.dialog.view;

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
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.foundation.utils.log.b;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes5.dex */
public class AnimatableImageView extends ImageView {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;
    private int d;

    public AnimatableImageView(Context context, @DrawableRes int i) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fef574be5c76f87f11a837b6b00cf79a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fef574be5c76f87f11a837b6b00cf79a");
            return;
        }
        this.b = "AnimatableImageView";
        setImageResource(i);
        a();
    }

    public AnimatableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04e8fa3af29e09c587fa1b434250424e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04e8fa3af29e09c587fa1b434250424e");
            return;
        }
        this.b = "AnimatableImageView";
        a(context, attributeSet);
    }

    public AnimatableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01326c1ca5ade6168e595b80764ec92c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01326c1ca5ade6168e595b80764ec92c");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d59d8c5d1295e4afb01795b5eb3baa08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d59d8c5d1295e4afb01795b5eb3baa08");
            return;
        }
        this.b = "AnimatableImageView";
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8467fdbfa767ce9a1ebe366e4c257d03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8467fdbfa767ce9a1ebe366e4c257d03");
            return;
        }
        a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.drawableRes});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            setImageResource(resourceId);
        }
        obtainStyledAttributes.recycle();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ec6749d52f2463795975ca10241e4b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ec6749d52f2463795975ca10241e4b8");
        } else if (a.b) {
            this.b = "AnimatableImageView " + Integer.toHexString(hashCode());
            this.c = new b(" [").a(getContext(), getId()).append(']').toString();
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a068fee364b140c6cb731c0761711ee1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a068fee364b140c6cb731c0761711ee1");
        } else if (a.b) {
            String str2 = this.b;
            a.b(str2, str + this.c, new Object[0]);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5adcd326b5cf2c6be26f17dd72d5aa7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5adcd326b5cf2c6be26f17dd72d5aa7a");
            return;
        }
        a("onAttachedToWindow");
        super.onAttachedToWindow();
        c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5127cce4dc3fac0b169633ac54d993a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5127cce4dc3fac0b169633ac54d993a1");
            return;
        }
        a("onDetachedFromWindow");
        b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fb4d8122faddb844bff8c91abbb0efc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fb4d8122faddb844bff8c91abbb0efc");
            return;
        }
        a("onStartTemporaryDetach");
        b();
        super.onStartTemporaryDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69ed617c05079bdf01dc1eaec82d9df6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69ed617c05079bdf01dc1eaec82d9df6");
            return;
        }
        a("onFinishTemporaryDetach");
        super.onFinishTemporaryDetach();
        c();
    }

    @Override // android.widget.ImageView
    @SuppressLint({"ResourceType"})
    public void setImageResource(@DrawableRes int i) {
        Drawable drawable;
        Drawable drawable2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26de91a8e406e22fae0e3974c75020a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26de91a8e406e22fae0e3974c75020a3");
            return;
        }
        if (a.b) {
            b a2 = new b("setImageResource, resId = ").a(getContext(), i).a(this.c == null ? "" : this.c);
            Object[] objArr2 = {this.b};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "492c8f1f9a937a627ad1168370e88d84", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "492c8f1f9a937a627ad1168370e88d84");
            } else {
                boolean z = a.b;
            }
        }
        if (this.d != i && (drawable2 = getDrawable()) != null && (drawable2 instanceof Animatable)) {
            ((Animatable) drawable2).stop();
        }
        this.d = i;
        if (this.d != 0) {
            super.setImageResource(this.d);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bf43fd4900da9b6327402e29c19d871", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bf43fd4900da9b6327402e29c19d871");
            return;
        }
        a("setImageDrawable");
        this.d = 0;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5af97b82c31ea02c7de1187cccb9b535", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5af97b82c31ea02c7de1187cccb9b535");
            return;
        }
        super.setVisibility(i);
        if (i == 0) {
            c();
        } else {
            b();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19e3075ee828fe41628f6d75adef83bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19e3075ee828fe41628f6d75adef83bd");
            return;
        }
        a("    releaseDrawable");
        Drawable drawable = getDrawable();
        if (drawable != null && (drawable instanceof Animatable)) {
            ((Animatable) drawable).stop();
        }
        if (this.d != 0) {
            super.setImageDrawable(null);
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e3aef91998e0273ff2f279621f8c358", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e3aef91998e0273ff2f279621f8c358");
            return;
        }
        a("    resetDrawable");
        if (getVisibility() == 0) {
            if (this.d != 0) {
                super.setImageResource(this.d);
            }
            Drawable drawable = getDrawable();
            if (drawable == null || !(drawable instanceof Animatable)) {
                return;
            }
            ((Animatable) drawable).start();
        }
    }
}
