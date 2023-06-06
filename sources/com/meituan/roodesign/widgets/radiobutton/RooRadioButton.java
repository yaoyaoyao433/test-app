package com.meituan.roodesign.widgets.radiobutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatRadioButton;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.internal.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooRadioButton extends AppCompatRadioButton {
    public static ChangeQuickRedirect a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected int i;

    public RooRadioButton(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8382c31a361bc5e2acadac280688b40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8382c31a361bc5e2acadac280688b40");
        }
    }

    public RooRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.rooRadioButtonStyle);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cd7e160d58f226c5f426a1c688c415b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cd7e160d58f226c5f426a1c688c415b");
        }
    }

    public RooRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d55afd845cb62c6514630edb8acd434", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d55afd845cb62c6514630edb8acd434");
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.backgroundColor, R.attr.backgroundHeight, R.attr.backgroundStrokeColor, R.attr.backgroundStrokeWidth, R.attr.backgroundWidth, R.attr.iconColor, R.attr.iconHeight, R.attr.iconWidth}, i, 2131559117);
        this.b = obtainStyledAttributes.getDimensionPixelSize(4, getResources().getDimensionPixelSize(R.dimen.roo_rb_bg_width_default));
        this.c = obtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(R.dimen.roo_rb_bg_height_default));
        this.d = obtainStyledAttributes.getColor(0, getResources().getColor(R.color.roo_rb_bg_solid_color_enable_default));
        this.f = obtainStyledAttributes.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.roo_rb_bg_stroke_width));
        this.e = obtainStyledAttributes.getColor(2, getResources().getColor(R.color.roo_rb_bg_stroke_color_default));
        this.g = obtainStyledAttributes.getDimensionPixelSize(7, getResources().getDimensionPixelSize(R.dimen.roo_rb_icon_width_default));
        this.h = obtainStyledAttributes.getDimensionPixelSize(6, getResources().getDimensionPixelSize(R.dimen.roo_rb_icon_height_default));
        this.i = obtainStyledAttributes.getColor(5, getResources().getColor(R.color.roo_rb_icon_color_enable_check_default));
        obtainStyledAttributes.recycle();
        setBackground(null);
        setOnClickListener(new View.OnClickListener() { // from class: com.meituan.roodesign.widgets.radiobutton.RooRadioButton.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0849069eb6e0264fb896159beace537f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0849069eb6e0264fb896159beace537f");
                }
            }
        });
        setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.meituan.roodesign.widgets.radiobutton.RooRadioButton.2
            public static ChangeQuickRedirect a;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Object[] objArr2 = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1846afe1db7a98392b212a54048e3cfd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1846afe1db7a98392b212a54048e3cfd");
                } else {
                    RooRadioButton.this.a(RooRadioButton.this.isEnabled(), RooRadioButton.this.isChecked());
                }
            }
        });
        setButtonDrawable(R.drawable.roo_radio_button_selector);
        a(isEnabled(), isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25e7822755871e52f0737a8482cb274c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25e7822755871e52f0737a8482cb274c");
        } else if (Build.VERSION.SDK_INT >= 23) {
            Drawable current = ((StateListDrawable) getButtonDrawable().mutate()).getCurrent();
            if (current instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) current;
                Drawable mutate = layerDrawable.findDrawableByLayerId(R.id.rb_background).getCurrent().mutate();
                if (mutate instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) mutate;
                    gradientDrawable.setSize(this.b, this.c);
                    gradientDrawable.setStroke(a.a(getContext(), getResources().getDimensionPixelSize(R.dimen.roo_rb_bg_stroke_width)), this.e);
                    if (z && z2) {
                        Drawable mutate2 = layerDrawable.findDrawableByLayerId(R.id.rb_icon).getCurrent().mutate();
                        if (mutate2 instanceof GradientDrawable) {
                            GradientDrawable gradientDrawable2 = (GradientDrawable) mutate2;
                            gradientDrawable2.setSize(this.g, this.h);
                            gradientDrawable2.setColor(this.i);
                        }
                        gradientDrawable.setColor(this.d);
                        gradientDrawable.setStroke(a.a(getContext(), getResources().getDimensionPixelSize(R.dimen.roo_rb_bg_stroke_width)), this.i);
                    }
                }
            }
        }
    }

    public void setBackgroundWidth(int i) {
        this.b = i;
    }

    public void setBackgroundHeight(int i) {
        this.c = i;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.d = i;
    }

    public void setBackgroundStrokeColor(int i) {
        this.e = i;
    }

    public void setBackgroundStrokeWidth(int i) {
        this.f = i;
    }

    public void setIconWidth(int i) {
        this.g = i;
    }

    public void setIconHeight(int i) {
        this.h = i;
    }

    public void setIconColor(int i) {
        this.i = i;
    }

    public int getBackgroundWidth() {
        return this.b;
    }

    public int getBackgroundHeight() {
        return this.c;
    }

    public int getBackgroundColor() {
        return this.d;
    }

    public int getBackgroundStrokeColor() {
        return this.e;
    }

    public int getBackgroundStrokeWidth() {
        return this.f;
    }

    public int getIconWidth() {
        return this.g;
    }

    public int getIconHeight() {
        return this.h;
    }

    public int getIconColor() {
        return this.i;
    }
}
