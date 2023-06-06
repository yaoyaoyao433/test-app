package com.meituan.roodesign.widgets.checkbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooCheckBox extends AppCompatCheckBox {
    public static ChangeQuickRedirect a;
    protected int b;
    protected int c;
    protected int d;

    public RooCheckBox(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c73f5b2dec04cec546ead8ad41d30e74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c73f5b2dec04cec546ead8ad41d30e74");
        }
    }

    public RooCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.rooCheckBoxStyle);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6462b3cdd7952fb45e346a771abb82cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6462b3cdd7952fb45e346a771abb82cd");
        }
    }

    public RooCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47fbdb06efd8fc9cf73ebf6c7f86f704", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47fbdb06efd8fc9cf73ebf6c7f86f704");
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.background, R.attr.backgroundColor, R.attr.backgroundHeight, R.attr.backgroundWidth}, i, 2131559112);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.b = obtainStyledAttributes.getColor(1, getResources().getColor(R.color.roo_cb_bg_color_default));
        this.c = obtainStyledAttributes.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.roo_cb_bg_width_default));
        this.d = obtainStyledAttributes.getDimensionPixelSize(2, getResources().getDimensionPixelSize(R.dimen.roo_cb_bg_height_default));
        obtainStyledAttributes.recycle();
        setButtonDrawable(drawable);
        setOnClickListener(new View.OnClickListener() { // from class: com.meituan.roodesign.widgets.checkbox.RooCheckBox.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "21b33f289629b23afb4b7684e2a255dd", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "21b33f289629b23afb4b7684e2a255dd");
                } else {
                    RooCheckBox.this.isChecked();
                }
            }
        });
        setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.meituan.roodesign.widgets.checkbox.RooCheckBox.2
            public static ChangeQuickRedirect a;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Object[] objArr2 = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "452ff880375e4c502c8ee4a000ec3428", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "452ff880375e4c502c8ee4a000ec3428");
                } else {
                    RooCheckBox.this.a(RooCheckBox.this.isEnabled(), z);
                }
            }
        });
        a(isEnabled(), isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f54d986c6dbd2e85bd5b672be2dd31c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f54d986c6dbd2e85bd5b672be2dd31c4");
        } else if (Build.VERSION.SDK_INT >= 23) {
            Drawable current = ((StateListDrawable) getButtonDrawable().mutate()).getCurrent();
            if (current instanceof LayerDrawable) {
                if (!z && z2) {
                    current.setAlpha(getResources().getInteger(R.integer.roo_cb_bg_disable_alpha));
                }
                Drawable findDrawableByLayerId = ((LayerDrawable) current).findDrawableByLayerId(R.id.cb_background);
                if (findDrawableByLayerId instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) findDrawableByLayerId;
                    gradientDrawable.setSize(this.c, this.d);
                    if (!(z && z2) && (z || !z2)) {
                        return;
                    }
                    gradientDrawable.setColor(this.b);
                }
            }
        }
    }

    public void setBackgroundWidth(int i) {
        this.c = i;
    }

    public void setBackgroundHeight(int i) {
        this.d = i;
    }

    public int getBackgroundColor() {
        return this.b;
    }

    public int getBackgroundWidth() {
        return this.c;
    }

    public int getBackgroundHeight() {
        return this.d;
    }
}
