package com.meituan.roodesign.widgets.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.AttrRes;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.resources.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.security.InvalidParameterException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooBadgeView extends FrameLayout {
    public static ChangeQuickRedirect a = null;
    @StyleRes
    private static final int b = 2131559092;
    @AttrRes
    private static final int c = 2130772145;
    @StyleRes
    private static final int d = 2131558901;
    private View e;
    private AppCompatTextView f;
    private GradientDrawable g;
    private GradientDrawable h;
    @ColorInt
    private int i;
    @ColorInt
    private int j;
    private final float k;
    private final float l;
    private final float m;
    private int n;
    private CharSequence o;
    private int p;
    private int q;
    private int r;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface BadgeType {
    }

    public RooBadgeView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "759560fa7cbcbab5169ce7ee6856eb86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "759560fa7cbcbab5169ce7ee6856eb86");
        }
    }

    private RooBadgeView(Context context, AttributeSet attributeSet) {
        this(context, null, c);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8d3f1fe8c23c3bac7490e9cebe43677", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8d3f1fe8c23c3bac7490e9cebe43677");
        }
    }

    public RooBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d086f8141da39e0bc247a6d554a7930", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d086f8141da39e0bc247a6d554a7930");
            return;
        }
        Context context2 = getContext();
        Resources resources = context2.getResources();
        this.k = resources.getDimensionPixelSize(R.dimen.roo_badge_radius);
        this.m = resources.getDimensionPixelSize(R.dimen.roo_badge_long_text_horizontal_padding);
        this.l = resources.getDimensionPixelSize(R.dimen.roo_badge_with_text_radius);
        this.j = new c(context2, d).c.getDefaultColor();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, new int[]{R.attr.backgroundColor, R.attr.badgeTextColor, R.attr.maxCharacterCount, R.attr.number, R.attr.badgeText, R.attr.badgeType}, i, b);
        this.i = obtainStyledAttributes.getColor(0, -1);
        this.j = obtainStyledAttributes.getColor(1, this.j);
        this.n = obtainStyledAttributes.getColor(3, -1);
        this.p = obtainStyledAttributes.getInt(5, 0);
        this.o = obtainStyledAttributes.getText(4);
        this.q = obtainStyledAttributes.getInt(2, 4);
        obtainStyledAttributes.recycle();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f972ccf83984640b5562c6b4a227ef58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f972ccf83984640b5562c6b4a227ef58");
        } else {
            this.e = new View(getContext());
            this.g = new GradientDrawable();
            this.g.setCornerRadius(this.k);
            this.g.setColor(this.i);
            this.e.setBackground(this.g);
            addView(this.e, new FrameLayout.LayoutParams((int) (this.k * 2.0f), (int) (this.k * 2.0f)));
            this.f = new AppCompatTextView(getContext());
            this.f.setSingleLine(true);
            this.h = new GradientDrawable();
            this.h.setCornerRadius(this.l);
            this.h.setColor(this.i);
            this.f.setBackground(this.h);
            this.f.setPadding((int) this.m, 0, (int) this.m, 0);
            this.f.setTextAppearance(getContext(), d);
            this.f.setTextColor(this.j);
            addView(this.f, new FrameLayout.LayoutParams(-2, -2));
        }
        c();
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fc2bb34c338fafa4f94f10a1274ec9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fc2bb34c338fafa4f94f10a1274ec9e");
            return;
        }
        switch (this.p) {
            case 0:
                this.f.setText(getBadgeNumberText());
                this.f.setIncludeFontPadding(false);
                this.e.setVisibility(b() ? 8 : 0);
                this.f.setVisibility(b() ? 0 : 8);
                return;
            case 1:
                this.f.setText(this.o);
                this.f.setIncludeFontPadding(true);
                this.e.setVisibility(d() ? 8 : 0);
                this.f.setVisibility(d() ? 0 : 8);
                return;
            default:
                throw new InvalidParameterException("Badge type MUST be @BadgeType");
        }
    }

    public void setBadgeType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16a708e34714d67b9d6a413a29bb6820", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16a708e34714d67b9d6a413a29bb6820");
        } else if (this.p != i) {
            this.p = i;
            a();
        }
    }

    @ColorInt
    public int getBackgroundColor() {
        return this.i;
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00713ed7e879a47b84c3acf1f9e176cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00713ed7e879a47b84c3acf1f9e176cc");
        } else if (this.i != i) {
            this.i = i;
            this.g.setColor(i);
            this.h.setColor(i);
            invalidate();
        }
    }

    @ColorInt
    public int getBadgeTextColor() {
        return this.j;
    }

    public void setBadgeTextColor(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "115cff2afa29b00b7d43da8e43c569ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "115cff2afa29b00b7d43da8e43c569ae");
        } else if (this.j != i) {
            this.j = i;
            this.f.setTextColor(i);
            invalidate();
        }
    }

    private boolean b() {
        return this.n != -1;
    }

    public int getNumber() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18d1ab0c5ddf12a50642b756ca9b9aab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18d1ab0c5ddf12a50642b756ca9b9aab")).intValue();
        }
        if (b()) {
            return this.n;
        }
        return 0;
    }

    public void setNumber(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0535d18b7dcf55a7fd1a06e3eaa43f54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0535d18b7dcf55a7fd1a06e3eaa43f54");
            return;
        }
        int max = Math.max(0, i);
        if (this.n != max) {
            this.n = max;
            a();
        }
    }

    public int getMaxCharacterCount() {
        return this.q;
    }

    public void setMaxCharacterCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e575e689a0864afa02d21e43115e2dae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e575e689a0864afa02d21e43115e2dae");
        } else if (this.q != i) {
            this.q = i;
            c();
            a();
        }
    }

    @NonNull
    private String getBadgeNumberText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6b70601c9cb3d2dd82f30b431a02219", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6b70601c9cb3d2dd82f30b431a02219");
        }
        if (getNumber() <= this.r) {
            return Integer.toString(getNumber());
        }
        return getContext().getString(R.string.roo_exceed_max_badge_number_suffix, Integer.valueOf(this.r), "+");
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e03a6dbe778a71dff35050374eada868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e03a6dbe778a71dff35050374eada868");
        } else {
            this.r = ((int) Math.pow(10.0d, getMaxCharacterCount() - 1.0d)) - 1;
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aff9cd0f1f3b7cd834d2334f888d7b69", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aff9cd0f1f3b7cd834d2334f888d7b69")).booleanValue() : !TextUtils.isEmpty(this.o);
    }

    public CharSequence getBadgeText() {
        return this.o;
    }

    public void setBadgeText(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad6c71a5ec26aead7b1f4fc90a9a084e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad6c71a5ec26aead7b1f4fc90a9a084e");
        } else if (TextUtils.equals(this.o, charSequence)) {
        } else {
            this.o = charSequence;
            a();
        }
    }

    public void setBadgeText(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8edc201ae140a64952bd923a2bf0b261", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8edc201ae140a64952bd923a2bf0b261");
        } else {
            setBadgeText(getContext().getString(i));
        }
    }
}
