package com.sankuai.waimai.platform.widget.filterbar.view.view;

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
/* loaded from: classes5.dex */
public class FilterBarAnimatableImageView extends ImageView {
    public static ChangeQuickRedirect a;
    private int b;

    public FilterBarAnimatableImageView(Context context, @DrawableRes int i) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59e720e98aed78cd3e5c3d2d115c64da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59e720e98aed78cd3e5c3d2d115c64da");
        } else {
            setImageResource(i);
        }
    }

    public FilterBarAnimatableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dd14587588581892edf53d20be6c988", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dd14587588581892edf53d20be6c988");
        } else {
            a(context, attributeSet);
        }
    }

    public FilterBarAnimatableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bd2b40a43eb6cee06f7899b322ba422", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bd2b40a43eb6cee06f7899b322ba422");
        } else {
            a(context, attributeSet);
        }
    }

    @TargetApi(21)
    public FilterBarAnimatableImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71697faa8ad8bdfde5eb286b9522d159", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71697faa8ad8bdfde5eb286b9522d159");
        } else {
            a(context, attributeSet);
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b116fa236418b7650eae1245487ed690", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b116fa236418b7650eae1245487ed690");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.drawableResList});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            setImageResource(resourceId);
        }
        obtainStyledAttributes.recycle();
    }

    private void a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78303fba3f1c810671fdf3dc3a3d11c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78303fba3f1c810671fdf3dc3a3d11c8");
        } else if (getVisibility() == 0 && drawable != null && (drawable instanceof Animatable)) {
            ((Animatable) drawable).start();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68ac7e4c467eca6f70056cf1a4e7fb45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68ac7e4c467eca6f70056cf1a4e7fb45");
            return;
        }
        super.onAttachedToWindow();
        a(getDrawable());
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0b39061d66ab60b55d7a42a6a9939ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0b39061d66ab60b55d7a42a6a9939ce");
        } else {
            super.onDetachedFromWindow();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a434f2b05423bc3b368af6f45efee2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a434f2b05423bc3b368af6f45efee2b");
            return;
        }
        this.b = i;
        super.setImageResource(i);
        a(getDrawable());
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b05233ed94f7d2b78205d6909cbcd7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b05233ed94f7d2b78205d6909cbcd7a");
            return;
        }
        super.setImageDrawable(drawable);
        a(getDrawable());
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80438ea62a587cdabfe4cb659a33c6cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80438ea62a587cdabfe4cb659a33c6cb");
            return;
        }
        super.setVisibility(i);
        if (i == 0) {
            if (this.b != 0) {
                setImageResource(this.b);
                return;
            }
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setCallback(null);
        }
        setImageDrawable(null);
    }
}
