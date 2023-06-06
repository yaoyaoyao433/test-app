package com.sankuai.waimai.platform.widget.pager;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SimplePageIndicator extends LinearLayout implements ViewPager.OnPageChangeListener {
    public static ChangeQuickRedirect a = null;
    private static final int f = 2130970671;
    public ViewPager b;
    private int c;
    private int d;
    private int e;
    private int g;
    private int h;
    private int i;
    private int j;
    private final LayoutInflater k;
    private final DataSetObserver l;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface ShowMode {
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f2, int i2) {
    }

    public SimplePageIndicator(Context context, int i, int i2, int i3) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1279500ab5c8e272b703a4811488fb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1279500ab5c8e272b703a4811488fb9");
            return;
        }
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.g = 1;
        this.h = f;
        this.i = 0;
        this.j = -1;
        this.b = null;
        this.l = new DataSetObserver() { // from class: com.sankuai.waimai.platform.widget.pager.SimplePageIndicator.1
            public static ChangeQuickRedirect a;

            @Override // android.database.DataSetObserver
            public final void onChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29797999be40d224cf5f6cec129b070e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29797999be40d224cf5f6cec129b070e");
                    return;
                }
                super.onChanged();
                SimplePageIndicator.this.a();
            }
        };
        this.k = LayoutInflater.from(context);
        this.i = i3;
        Object[] objArr2 = {Integer.valueOf(i2), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4742b4379e3ee4db85d7c1cb6565b00f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4742b4379e3ee4db85d7c1cb6565b00f");
        } else if (i2 > 0 && i2 != this.h) {
            this.h = i2;
        }
        a(i, 0);
        b();
    }

    public SimplePageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c96d32bb4b2ca9713173c8b592d340d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c96d32bb4b2ca9713173c8b592d340d3");
            return;
        }
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.g = 1;
        this.h = f;
        this.i = 0;
        this.j = -1;
        this.b = null;
        this.l = new DataSetObserver() { // from class: com.sankuai.waimai.platform.widget.pager.SimplePageIndicator.1
            public static ChangeQuickRedirect a;

            @Override // android.database.DataSetObserver
            public final void onChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29797999be40d224cf5f6cec129b070e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29797999be40d224cf5f6cec129b070e");
                    return;
                }
                super.onChanged();
                SimplePageIndicator.this.a();
            }
        };
        this.k = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.childLayout, R.attr.childCount, R.attr.childDrawable, R.attr.checkedSize, R.attr.normalSize, R.attr.checkedPosition, R.attr.checkedHeightSize});
        this.h = obtainStyledAttributes.getResourceId(0, this.h);
        this.i = obtainStyledAttributes.getResourceId(2, this.i);
        this.j = obtainStyledAttributes.getInteger(5, this.j);
        this.c = obtainStyledAttributes.getDimensionPixelSize(3, this.c);
        this.d = obtainStyledAttributes.getDimensionPixelSize(6, this.d);
        this.e = obtainStyledAttributes.getDimensionPixelSize(4, this.e);
        int integer = obtainStyledAttributes.getInteger(1, -1);
        if (integer > 0) {
            a(integer, this.j);
        }
        obtainStyledAttributes.recycle();
        b();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8208ae5539122ff93f9ccea6b4b1ba10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8208ae5539122ff93f9ccea6b4b1ba10");
        } else {
            setOrientation(0);
        }
    }

    public void setShowMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e42a2a6f6967942676ce244da8f2a16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e42a2a6f6967942676ce244da8f2a16");
        } else {
            a(i, true);
        }
    }

    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7c502827409bb8dc7af380fbe9e4e4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7c502827409bb8dc7af380fbe9e4e4c");
            return;
        }
        this.g = i;
        if (z) {
            c();
        }
    }

    public int getPageCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92497edd50c5aa2a6bb34f9c20896cae", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92497edd50c5aa2a6bb34f9c20896cae")).intValue() : getChildCount();
    }

    private int b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e5144bcd87d515c0ad385eb23681c85", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e5144bcd87d515c0ad385eb23681c85")).intValue();
        }
        if (i <= 0 || i2 < 0) {
            return -1;
        }
        return i2 >= i ? i2 % i : i2;
    }

    public final void a(int i, int i2) {
        LinearLayout.LayoutParams layoutParams;
        int i3 = 2;
        char c = 1;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b4a604b2c7ddbc03d26c08678d3a545", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b4a604b2c7ddbc03d26c08678d3a545");
        } else if (i >= 0) {
            this.j = b(i, i2);
            removeAllViews();
            int i4 = 0;
            while (i4 < i) {
                View a2 = a(i4 == this.j);
                byte b = i4 == this.j ? (byte) 1 : (byte) 0;
                Object[] objArr2 = new Object[i3];
                objArr2[0] = a2;
                objArr2[c] = Byte.valueOf(b);
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e7e923da7fdc429fe9c5e2bf5dc8cde", RobustBitConfig.DEFAULT_VALUE)) {
                    layoutParams = (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e7e923da7fdc429fe9c5e2bf5dc8cde");
                } else {
                    if (this.c > 0 && this.e > 0) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) a2.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.width = b != 0 ? this.c : this.e;
                            if (b != 0 && this.d > 0) {
                                layoutParams2.height = this.d;
                            } else {
                                layoutParams2.height = this.e;
                            }
                            layoutParams2.gravity = 16;
                            layoutParams = layoutParams2;
                        } else {
                            LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
                            generateDefaultLayoutParams.gravity = 16;
                            generateDefaultLayoutParams.height = this.e;
                            generateDefaultLayoutParams.width = b != 0 ? this.c : this.e;
                        }
                    }
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    addView(a2, layoutParams);
                } else {
                    addView(a2);
                }
                i4++;
                i3 = 2;
                c = 1;
            }
            c();
        }
    }

    public int getCheckedPosition() {
        return this.j;
    }

    public void setCheckedPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bf50114e6cdb6a15946d486712fb072", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bf50114e6cdb6a15946d486712fb072");
            return;
        }
        int b = b(getPageCount(), i);
        if (b == -1 || b == this.j) {
            return;
        }
        b(this.j, false);
        b(b, true);
        this.j = b;
    }

    public ViewPager.OnPageChangeListener a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fed71175ba292bef91afa26d5b6e0e00", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewPager.OnPageChangeListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fed71175ba292bef91afa26d5b6e0e00");
        }
        if (this.b == null || this.b.getAdapter() == null) {
            return null;
        }
        PagerAdapter adapter = this.b.getAdapter();
        a(adapter.getCount(), this.b.getCurrentItem());
        try {
            adapter.registerDataSetObserver(this.l);
        } catch (IllegalStateException unused) {
        }
        this.b.removeOnPageChangeListener(this);
        this.b.addOnPageChangeListener(this);
        return this;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f3d0d4674fbec2bdf6d366fccf39cdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f3d0d4674fbec2bdf6d366fccf39cdd");
            return;
        }
        int pageCount = getPageCount();
        switch (this.g) {
            case 2:
                setVisibility(pageCount <= 0 ? 8 : 0);
                return;
            case 3:
                if (pageCount <= 1) {
                    r0 = 8;
                    break;
                }
                break;
        }
        setVisibility(r0);
    }

    private void b(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48523431a5c31c9b1e1b022f10ba2c7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48523431a5c31c9b1e1b022f10ba2c7f");
            return;
        }
        View childAt = getChildAt(i);
        if (childAt != null) {
            childAt.setSelected(z);
            if (this.c > 0 && this.e > 0 && this.c != this.e) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (z) {
                    layoutParams.width = this.c;
                } else {
                    layoutParams.width = this.e;
                }
                childAt.setLayoutParams(layoutParams);
            }
            if (this.d <= 0 || this.e <= 0 || this.d == this.e) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            if (z) {
                layoutParams2.height = this.d;
            } else {
                layoutParams2.height = this.e;
            }
            childAt.setLayoutParams(layoutParams2);
        }
    }

    private View a(boolean z) {
        View view;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cde521931cdc61f37ce071bb71519a13", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cde521931cdc61f37ce071bb71519a13");
        }
        Drawable drawable = null;
        try {
            view = this.k.inflate(this.h, (ViewGroup) this, false);
        } catch (Exception unused) {
            view = null;
        }
        if (view == null) {
            view = this.k.inflate(f, (ViewGroup) this, false);
        }
        if (this.i > 0) {
            try {
                drawable = getResources().getDrawable(this.i);
            } catch (Exception unused2) {
            }
            if (drawable != null) {
                view.setBackground(drawable);
            }
        }
        view.setSelected(z);
        return view;
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "393741f1175897aafcb960af6bdcc7bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "393741f1175897aafcb960af6bdcc7bb");
        } else {
            setCheckedPosition(i);
        }
    }
}
