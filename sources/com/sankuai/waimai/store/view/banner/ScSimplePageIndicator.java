package com.sankuai.waimai.store.view.banner;

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
import com.sankuai.shangou.stone.util.log.a;
import com.sankuai.waimai.store.config.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ScSimplePageIndicator extends LinearLayout implements ViewPager.OnPageChangeListener {
    public static ChangeQuickRedirect a = null;
    private static final int d = 2130970346;
    private int b;
    private int c;
    private int e;
    private int f;
    private int g;
    private int h;
    private Drawable i;
    private ViewPager j;
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
    public void onPageScrolled(int i, float f, int i2) {
    }

    public void setChildLayoutDrawable(Drawable drawable) {
        this.i = drawable;
    }

    public ScSimplePageIndicator(Context context, int i, int i2, int i3) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e75eb6480857422af3fc68f165f732d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e75eb6480857422af3fc68f165f732d7");
            return;
        }
        this.b = -1;
        this.c = -1;
        this.e = 1;
        this.f = d;
        this.g = 0;
        this.h = -1;
        this.i = null;
        this.j = null;
        this.l = new DataSetObserver() { // from class: com.sankuai.waimai.store.view.banner.ScSimplePageIndicator.1
            public static ChangeQuickRedirect a;

            @Override // android.database.DataSetObserver
            public final void onChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3cdaa149b17729a5e8fcb20d4143d86", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3cdaa149b17729a5e8fcb20d4143d86");
                    return;
                }
                super.onChanged();
                ScSimplePageIndicator.this.b();
            }
        };
        this.k = LayoutInflater.from(context);
        this.g = i3;
        Object[] objArr2 = {Integer.valueOf(i2), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ef9ddc8017ae2fbf1a89aa5a6488de9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ef9ddc8017ae2fbf1a89aa5a6488de9");
        } else if (i2 > 0 && i2 != this.f) {
            this.f = i2;
        }
        a(i, 0);
        a();
    }

    public ScSimplePageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a58828ad117d13623fb7a2f0594cd77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a58828ad117d13623fb7a2f0594cd77");
            return;
        }
        this.b = -1;
        this.c = -1;
        this.e = 1;
        this.f = d;
        this.g = 0;
        this.h = -1;
        this.i = null;
        this.j = null;
        this.l = new DataSetObserver() { // from class: com.sankuai.waimai.store.view.banner.ScSimplePageIndicator.1
            public static ChangeQuickRedirect a;

            @Override // android.database.DataSetObserver
            public final void onChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3cdaa149b17729a5e8fcb20d4143d86", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3cdaa149b17729a5e8fcb20d4143d86");
                    return;
                }
                super.onChanged();
                ScSimplePageIndicator.this.b();
            }
        };
        this.k = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.childLayout, R.attr.childCount, R.attr.childDrawable, R.attr.checkedSize, R.attr.normalSize, R.attr.checkedPosition});
        this.f = obtainStyledAttributes.getResourceId(0, this.f);
        this.g = obtainStyledAttributes.getResourceId(2, this.g);
        this.h = obtainStyledAttributes.getInteger(5, this.h);
        this.b = obtainStyledAttributes.getDimensionPixelSize(3, this.b);
        this.c = obtainStyledAttributes.getDimensionPixelSize(4, this.c);
        int integer = obtainStyledAttributes.getInteger(1, -1);
        if (integer > 0) {
            a(integer, this.h);
        }
        obtainStyledAttributes.recycle();
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b9ae74faf954efc14d3d112ee6f6a72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b9ae74faf954efc14d3d112ee6f6a72");
            return;
        }
        setOrientation(0);
        if (k.a() && isInEditMode() && getPageCount() == 0) {
            a(5, 2);
        }
    }

    public void setShowMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c71be36ee901e6b5d76f6f2b0c560b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c71be36ee901e6b5d76f6f2b0c560b2");
        } else {
            a(i, true);
        }
    }

    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bec152e805d03b93d77cec0e847c7791", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bec152e805d03b93d77cec0e847c7791");
            return;
        }
        this.e = i;
        if (z) {
            c();
        }
    }

    public int getPageCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69579ffd29ddc6cd54a3ce1372b72893", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69579ffd29ddc6cd54a3ce1372b72893")).intValue() : getChildCount();
    }

    private int b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8f72c23ef180b9de0624d5aa44f0823", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8f72c23ef180b9de0624d5aa44f0823")).intValue();
        }
        if (i <= 0 || i2 < 0) {
            return -1;
        }
        return i2 >= i ? i2 % i : i2;
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "313537c4399b08d6618c424ae406c088", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "313537c4399b08d6618c424ae406c088");
        } else if (i >= 0) {
            this.h = b(i, i2);
            removeAllViews();
            int i3 = 0;
            while (i3 < i) {
                View a2 = a(i3 == this.h);
                ViewGroup.LayoutParams a3 = a(a2, i3 == this.h);
                if (a3 != null) {
                    addView(a2, a3);
                } else {
                    addView(a2);
                }
                i3++;
            }
            c();
        }
    }

    private ViewGroup.LayoutParams a(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fd5d2ec7cbbc25b3cbd3d47af85b052", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fd5d2ec7cbbc25b3cbd3d47af85b052");
        }
        if (this.b <= 0 || this.c <= 0) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = z ? this.b : this.c;
            return layoutParams;
        }
        LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        ((ViewGroup.LayoutParams) generateDefaultLayoutParams).height = this.c;
        ((ViewGroup.LayoutParams) generateDefaultLayoutParams).width = z ? this.b : this.c;
        return null;
    }

    public int getCheckedPosition() {
        return this.h;
    }

    public void setCheckedPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1ca71b29e155b3fa9232356ada062ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1ca71b29e155b3fa9232356ada062ea");
            return;
        }
        int b = b(getPageCount(), i);
        if (b == -1 || b == this.h) {
            return;
        }
        b(this.h, false);
        b(b, true);
        this.h = b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewPager.OnPageChangeListener b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3017b5f8b2a443c017a09eaee8c0f279", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewPager.OnPageChangeListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3017b5f8b2a443c017a09eaee8c0f279");
        }
        if (this.j == null || this.j.getAdapter() == null) {
            return null;
        }
        PagerAdapter adapter = this.j.getAdapter();
        a(adapter.getCount(), this.j.getCurrentItem());
        try {
            adapter.registerDataSetObserver(this.l);
        } catch (IllegalStateException e) {
            a.a(e);
        }
        this.j.removeOnPageChangeListener(this);
        this.j.addOnPageChangeListener(this);
        return this;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22b08c60055103ddc2c580d7d3113e26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22b08c60055103ddc2c580d7d3113e26");
            return;
        }
        int pageCount = getPageCount();
        switch (this.e) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbd7a2674fef04b5c704b03bbe22e127", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbd7a2674fef04b5c704b03bbe22e127");
            return;
        }
        View childAt = getChildAt(i);
        if (childAt != null) {
            childAt.setSelected(z);
            if (this.b <= 0 || this.c <= 0 || this.b == this.c) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (z) {
                layoutParams.width = this.b;
            } else {
                layoutParams.width = this.c;
            }
            childAt.setLayoutParams(layoutParams);
        }
    }

    private View a(boolean z) {
        View view;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3ce3e9814b879a0760ac2de0c87080a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3ce3e9814b879a0760ac2de0c87080a");
        }
        Drawable drawable = null;
        try {
            view = this.k.inflate(this.f, (ViewGroup) this, false);
        } catch (Exception e) {
            a.a(e);
            view = null;
        }
        if (view == null) {
            view = this.k.inflate(d, (ViewGroup) this, false);
        }
        if (this.g > 0) {
            try {
                drawable = getResources().getDrawable(this.g);
            } catch (Exception e2) {
                a.a(e2);
            }
            if (drawable != null) {
                view.setBackground(drawable);
            }
        }
        if (this.i != null) {
            view.setBackground(this.i);
        }
        view.setSelected(z);
        return view;
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "444d90e3787c19b0af0c88534d8b1aa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "444d90e3787c19b0af0c88534d8b1aa9");
        } else {
            setCheckedPosition(i);
        }
    }
}
