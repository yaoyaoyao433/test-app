package com.meituan.roodesign.widgets.pricegroup;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.ColorInt;
import android.support.annotation.FontRes;
import android.support.annotation.Nullable;
import android.support.annotation.Px;
import android.support.constraint.R;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.view.GravityCompat;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooPriceGroup extends LinearLayout {
    public static ChangeQuickRedirect a = null;
    private static final int b = 2131558677;
    private AppCompatTextView c;
    private AppCompatTextView d;
    private int e;
    private int f;
    private String g;
    private float h;
    private float i;
    private Typeface j;

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
    }

    public RooPriceGroup(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baf378c04227fad515b6be3b0d185469", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baf378c04227fad515b6be3b0d185469");
        }
    }

    private RooPriceGroup(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, R.attr.rooPriceGroupStyle);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fed3a323a48640e8945957d7f92c34bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fed3a323a48640e8945957d7f92c34bb");
        }
    }

    public RooPriceGroup(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17f26f8d341af3caa39a095d04a887ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17f26f8d341af3caa39a095d04a887ab");
            return;
        }
        this.e = 0;
        this.f = 0;
        this.h = 0.0f;
        this.i = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948, R.attr.reverseLayout, R.attr.originPriceColor, R.attr.discountColor, R.attr.discountPrice, R.attr.originPrice, R.attr.originPriceTextSize, R.attr.discountTextSize}, i, b);
        int i2 = obtainStyledAttributes.getInt(0, 0);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        setBaselineAligned(true);
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "97e0d5285c52fe8324aba1a06b10a7e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "97e0d5285c52fe8324aba1a06b10a7e2");
        } else {
            Context context2 = getContext();
            this.c = new AppCompatTextView(context2);
            this.d = new AppCompatTextView(context2);
            View view = this.c;
            View view2 = this.d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i2 == 0) {
                layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()));
                if (z) {
                    view = this.d;
                    view2 = this.c;
                }
            } else {
                setGravity(GravityCompat.END);
                if (!z) {
                    view = this.d;
                    view2 = this.c;
                }
            }
            addView(view, new LinearLayout.LayoutParams(-2, -2));
            addView(view2, layoutParams);
            super.setOrientation(i2);
            this.g = getResources().getString(R.string.roo_price_group_money);
        }
        Object[] objArr3 = {obtainStyledAttributes};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ce36a30638936cd88a1e9c658f3319cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ce36a30638936cd88a1e9c658f3319cd");
        } else {
            try {
                this.j = Typeface.createFromAsset(getContext().getAssets(), "fonts/AvenirLTPro-Medium.ttf");
            } catch (Exception unused) {
            }
            if (this.j != null) {
                this.c.setTypeface(this.j);
                this.d.setTypeface(this.j);
            }
            setDiscountPriceTextColor(obtainStyledAttributes.getColor(3, getResources().getColor(R.color.roo_default_color_brand_price)));
            this.f = obtainStyledAttributes.getDimensionPixelSize(7, (int) TypedValue.applyDimension(2, getResources().getDimension(R.dimen.roo_price_group_discount_text_size), getResources().getDisplayMetrics()));
            this.h = obtainStyledAttributes.getFloat(4, this.h);
            setOriginPriceTextColor(obtainStyledAttributes.getColor(2, getResources().getColor(R.color.roo_default_color_gray_dark)));
            this.e = obtainStyledAttributes.getDimensionPixelSize(6, (int) TypedValue.applyDimension(2, getResources().getDimension(R.dimen.roo_price_group_origin_price_text_size), getResources().getDisplayMetrics()));
            this.i = obtainStyledAttributes.getFloat(5, this.i);
            a(this.h, this.i, this.f, this.e);
        }
        obtainStyledAttributes.recycle();
    }

    public void setOriginPrice(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc578532398b5d86ec184f6d5e9197f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc578532398b5d86ec184f6d5e9197f5");
        } else if (this.i != f) {
            this.i = f;
            a(-1.0f, this.i, this.f, this.e);
        }
    }

    public float getOriginPrice() {
        return this.i;
    }

    public void setDiscountPrice(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "374315846e1aae523b6a17e9be66092f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "374315846e1aae523b6a17e9be66092f");
        } else if (this.h != f) {
            this.h = f;
            a(this.h, -1.0f, this.f, this.e);
        }
    }

    public float getDiscountPrice() {
        return this.h;
    }

    public void setOriginPriceTextColor(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcf20c9ac1960181f92b5a841dff8372", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcf20c9ac1960181f92b5a841dff8372");
        } else {
            this.d.setTextColor(i);
        }
    }

    public void setOriginPriceVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2a67293b29dd82e1ad32067e1d0d419", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2a67293b29dd82e1ad32067e1d0d419");
        } else {
            this.d.setVisibility(i);
        }
    }

    public void setDiscountPriceTextColor(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a7b975dc4e389a0856bf0cb9e348534", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a7b975dc4e389a0856bf0cb9e348534");
        } else {
            this.c.setTextColor(i);
        }
    }

    public void setOriginPriceTextSize(@Px int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3f61d270356c4769f3d30be3a3ead08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3f61d270356c4769f3d30be3a3ead08");
        } else if (this.e != i) {
            this.e = i;
            a(this.h, this.i, this.f, this.e);
        }
    }

    @Px
    public int getOriginPriceTextSize() {
        return this.e;
    }

    public void setDiscountPriceTextSize(@Px int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11118eaacfcbed6fcb0dc5f102131d43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11118eaacfcbed6fcb0dc5f102131d43");
        } else if (this.f != i) {
            this.f = i;
            a(this.h, this.i, this.f, this.e);
        }
    }

    @Px
    public int getDiscountPriceTextSize() {
        return this.f;
    }

    public void setFontFamily(@FontRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dffd9139062615eaf778d8b55ba56a91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dffd9139062615eaf778d8b55ba56a91");
        } else {
            setFontFamily(ResourcesCompat.getFont(getContext(), i));
        }
    }

    public void setFontFamily(Typeface typeface) {
        Object[] objArr = {typeface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ea7a883e9c25d82bb060b09bf542520", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ea7a883e9c25d82bb060b09bf542520");
        } else if (typeface == null || typeface.equals(this.j)) {
        } else {
            this.j = typeface;
            this.d.setTypeface(this.j);
            this.c.setTypeface(this.j);
        }
    }

    public Typeface getFontFamily() {
        return this.j;
    }

    private void a(float f, float f2, int i, int i2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0efa779fa7e5d938eb74d9219c6246e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0efa779fa7e5d938eb74d9219c6246e2");
            return;
        }
        StringBuilder sb = new StringBuilder(this.g);
        if (f != -1.0f) {
            double d = f;
            if (d % 1.0d == 0.0d) {
                sb.append((int) f);
            } else {
                sb.append(a.a(d));
            }
            SpannableString spannableString = new SpannableString(sb.toString());
            spannableString.setSpan(new AbsoluteSizeSpan(i2 - ((int) TypedValue.applyDimension(2, 1.0f, getResources().getDisplayMetrics()))), 0, 1, 33);
            spannableString.setSpan(new AbsoluteSizeSpan(i), 1, spannableString.length(), 33);
            spannableString.setSpan(new b(0, (int) TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics())), 0, 1, 17);
            spannableString.setSpan(new StyleSpan(1), 0, 1, 33);
            this.c.setText(spannableString);
        }
        StringBuilder sb2 = new StringBuilder(this.g);
        if (f2 != -1.0f) {
            double d2 = f2;
            if (d2 % 1.0d == 0.0d) {
                sb2.append((int) f2);
            } else {
                sb2.append(a.a(d2));
            }
            this.d.setText(sb2.toString());
            this.d.setTextSize(0, i2);
            this.d.getPaint().setFlags(this.d.getPaintFlags() | 16);
        }
    }
}
