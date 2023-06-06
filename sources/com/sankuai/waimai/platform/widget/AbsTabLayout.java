package com.sankuai.waimai.platform.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class AbsTabLayout extends FrameLayout {
    public static ChangeQuickRedirect b;
    private int a;
    protected int c;
    protected int d;
    protected LinearLayout e;
    protected ImageView f;
    protected ViewPager g;
    protected Context h;
    private ColorStateList i;
    private HorizontalScrollView j;
    private int k;
    private int l;
    private int m;
    private LayoutInflater n;
    private int o;
    private int p;
    private boolean q;
    private int r;
    private a s;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        boolean a(int i, int i2);
    }

    public abstract View a(CharSequence charSequence, LayoutInflater layoutInflater, int i);

    public void a(View view) {
    }

    public void b(View view) {
    }

    public AbsTabLayout(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd7979c30bb9c6189d46f5c91ffcd384", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd7979c30bb9c6189d46f5c91ffcd384");
            return;
        }
        this.p = 0;
        a(context, null, 0, 0);
    }

    public AbsTabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "568d1205a41224f908f5cacd4e686fda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "568d1205a41224f908f5cacd4e686fda");
            return;
        }
        this.p = 0;
        a(context, attributeSet, 0, 0);
    }

    public AbsTabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "174e6b4f554fbaa65206247d0ded81f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "174e6b4f554fbaa65206247d0ded81f9");
            return;
        }
        this.p = 0;
        a(context, attributeSet, i, 0);
    }

    public void setTabClickCallBack(a aVar) {
        this.s = aVar;
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d82398c4043545b280142fe9552d1cdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d82398c4043545b280142fe9552d1cdf");
            return;
        }
        this.h = context;
        int color = getResources().getColor(R.color.wm_common_text_title);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.tabTextColor, R.attr.tabSelectedTextColor, R.attr.tabWidth, R.attr.tabTextSize, R.attr.tabIndicatorColor, R.attr.tabIndicatorHeight, R.attr.tabIndicatorWidth, R.attr.tabIndicatorMarginLeft}, i, 0);
        this.m = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.i = a(obtainStyledAttributes.getColor(1, color), obtainStyledAttributes.getColor(0, -16777216));
        this.c = obtainStyledAttributes.getColor(4, color);
        this.d = obtainStyledAttributes.getDimensionPixelSize(5, 5);
        this.a = obtainStyledAttributes.getDimensionPixelSize(6, 40);
        this.r = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        this.o = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        obtainStyledAttributes.recycle();
        this.n = LayoutInflater.from(this.h);
        View inflate = this.n.inflate(R.layout.wm_widget_tab_layout, (ViewGroup) this, false);
        this.j = (HorizontalScrollView) inflate.findViewById(R.id.horizontal_scroll_view);
        this.e = (LinearLayout) inflate.findViewById(R.id.tab_container);
        this.f = (ImageView) inflate.findViewById(R.id.tab_indicator);
        addView(inflate);
    }

    private ColorStateList a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8e1b023c3dd6115061177dec674ff4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ColorStateList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8e1b023c3dd6115061177dec674ff4f");
        }
        return new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{i, i2});
    }

    public void setupWithViewPager(@NonNull ViewPager viewPager) {
        Object[] objArr = {viewPager};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5c65919eba0edf38eb52222cf7a4228", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5c65919eba0edf38eb52222cf7a4228");
            return;
        }
        this.g = viewPager;
        int i = this.h.getResources().getDisplayMetrics().widthPixels;
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null && layoutParams.width > 0) {
            this.o = layoutParams.width / adapter.getCount();
        } else if (this.o == 0) {
            this.o = i / adapter.getCount();
        }
        this.e.removeAllViews();
        for (final int i2 = 0; i2 < adapter.getCount(); i2++) {
            View a2 = a(adapter.getPageTitle(i2), this.n, this.o);
            a2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.AbsTabLayout.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d354659f5d1c70cebf090c943ca7c077", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d354659f5d1c70cebf090c943ca7c077");
                    } else if (AbsTabLayout.this.s == null || !AbsTabLayout.this.s.a(AbsTabLayout.this.l, i2)) {
                        AbsTabLayout.this.a(i2);
                        View childAt = AbsTabLayout.this.e.getChildAt(AbsTabLayout.this.l);
                        View childAt2 = AbsTabLayout.this.e.getChildAt(1);
                        if (childAt == null || childAt2 == null || AbsTabLayout.this.g == null) {
                            return;
                        }
                        AbsTabLayout.this.g.setCurrentItem(AbsTabLayout.this.l);
                    }
                }
            });
            this.e.addView(a2);
        }
        ViewGroup.LayoutParams layoutParams2 = this.f.getLayoutParams();
        layoutParams2.width = this.o;
        layoutParams2.height = this.d;
        this.f.setLayoutParams(layoutParams2);
        if (this.r >= 0) {
            this.f.setPadding(this.r, 0, (this.o - this.a) - this.r, 0);
        } else {
            int i3 = (this.o - this.a) / 2;
            this.f.setPadding(i3, 0, i3, 0);
        }
        this.f.setImageDrawable(new ColorDrawable(this.c));
        postInvalidate();
        this.g.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sankuai.waimai.platform.widget.AbsTabLayout.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i4) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i4, float f, int i5) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i4) {
                Object[] objArr2 = {Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06055dd62b00575483d2f558ee687bbb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06055dd62b00575483d2f558ee687bbb");
                } else {
                    AbsTabLayout.this.setCurrentSelectItem(i4);
                }
            }
        });
    }

    public void setCurrentSelectItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2a22d06a9e4d8da24f98ec499bf077b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2a22d06a9e4d8da24f98ec499bf077b");
            return;
        }
        View childAt = this.e.getChildAt(i);
        if (childAt != null) {
            a(i);
            if (this.q) {
                b(this.e.getChildAt(this.p));
            }
            if (!this.q) {
                this.q = true;
            }
            this.p = i;
            a(childAt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d5e5346fc4767923878a53f6521b7be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d5e5346fc4767923878a53f6521b7be");
            return;
        }
        this.l = i;
        TranslateAnimation translateAnimation = new TranslateAnimation(this.k, this.e.getChildAt(this.l).getLeft(), 0.0f, 0.0f);
        translateAnimation.setInterpolator(new LinearInterpolator());
        translateAnimation.setDuration(100L);
        translateAnimation.setFillAfter(true);
        this.f.startAnimation(translateAnimation);
        this.k = this.e.getChildAt(this.l).getLeft();
        View childAt = this.e.getChildAt(this.l);
        View childAt2 = this.e.getChildAt(1);
        if (childAt == null || childAt2 == null) {
            return;
        }
        this.j.smoothScrollTo((this.l > 1 ? childAt.getLeft() : 0) - childAt2.getLeft(), 0);
    }
}
