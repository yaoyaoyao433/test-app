package com.viewpagerindicator;

import android.content.Context;
import android.support.constraint.R;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TabPageIndicator extends HorizontalScrollView implements PageIndicator {
    private static final CharSequence a = "";
    private Runnable b;
    private final View.OnClickListener c;
    private final com.viewpagerindicator.b d;
    private ViewPager e;
    private ViewPager.OnPageChangeListener f;
    private int g;
    private int h;
    private a i;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
    }

    static /* synthetic */ Runnable a(TabPageIndicator tabPageIndicator, Runnable runnable) {
        tabPageIndicator.b = null;
        return null;
    }

    public TabPageIndicator(Context context) {
        this(context, null);
    }

    private TabPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, null);
        this.c = new View.OnClickListener() { // from class: com.viewpagerindicator.TabPageIndicator.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int currentItem = TabPageIndicator.this.e.getCurrentItem();
                int i = ((b) view).a;
                TabPageIndicator.this.e.setCurrentItem(i);
                if (currentItem != i || TabPageIndicator.this.i == null) {
                    return;
                }
                a unused = TabPageIndicator.this.i;
            }
        };
        setHorizontalScrollBarEnabled(false);
        this.d = new com.viewpagerindicator.b(context, R.attr.vpiTabPageIndicatorStyle);
        addView(this.d, new ViewGroup.LayoutParams(-2, -1));
    }

    public void setOnTabReselectedListener(a aVar) {
        this.i = aVar;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.g = -1;
        } else if (childCount > 2) {
            this.g = (int) (View.MeasureSpec.getSize(i) * 0.4f);
        } else {
            this.g = View.MeasureSpec.getSize(i) / 2;
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, i2);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setCurrentItem(this.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b != null) {
            post(this.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.b != null) {
            removeCallbacks(this.b);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        if (this.f != null) {
            this.f.onPageScrollStateChanged(i);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        if (this.f != null) {
            this.f.onPageScrolled(i, f, i2);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        setCurrentItem(i);
        if (this.f != null) {
            this.f.onPageSelected(i);
        }
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.e == viewPager) {
            return;
        }
        if (this.e != null) {
            this.e.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.e = viewPager;
        viewPager.setOnPageChangeListener(this);
        a();
    }

    private void a() {
        this.d.removeAllViews();
        PagerAdapter adapter = this.e.getAdapter();
        com.viewpagerindicator.a aVar = adapter instanceof com.viewpagerindicator.a ? (com.viewpagerindicator.a) adapter : null;
        int count = adapter.getCount();
        for (int i = 0; i < count; i++) {
            CharSequence pageTitle = adapter.getPageTitle(i);
            if (pageTitle == null) {
                pageTitle = a;
            }
            int a2 = aVar != null ? aVar.a(i) : 0;
            b bVar = new b(getContext());
            bVar.a = i;
            bVar.setFocusable(true);
            bVar.setOnClickListener(this.c);
            bVar.setText(pageTitle);
            if (a2 != 0) {
                bVar.setCompoundDrawablesWithIntrinsicBounds(a2, 0, 0, 0);
            }
            this.d.addView(bVar, new LinearLayout.LayoutParams(0, -1, 1.0f));
        }
        if (this.h > count) {
            this.h = count - 1;
        }
        setCurrentItem(this.h);
        requestLayout();
    }

    public void setCurrentItem(int i) {
        if (this.e == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.h = i;
        this.e.setCurrentItem(i);
        int childCount = this.d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                final View childAt2 = this.d.getChildAt(i);
                if (this.b != null) {
                    removeCallbacks(this.b);
                }
                this.b = new Runnable() { // from class: com.viewpagerindicator.TabPageIndicator.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        TabPageIndicator.this.smoothScrollTo(childAt2.getLeft() - ((TabPageIndicator.this.getWidth() - childAt2.getWidth()) / 2), 0);
                        TabPageIndicator.a(TabPageIndicator.this, null);
                    }
                };
                post(this.b);
            }
            i2++;
        }
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f = onPageChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class b extends TextView {
        int a;

        public b(Context context) {
            super(context, null, R.attr.vpiTabPageIndicatorStyle);
        }

        @Override // android.widget.TextView, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (TabPageIndicator.this.g <= 0 || getMeasuredWidth() <= TabPageIndicator.this.g) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(TabPageIndicator.this.g, 1073741824), i2);
        }
    }
}
