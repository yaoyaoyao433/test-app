package com.sankuai.waimai.platform.widget.pager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes5.dex */
public abstract class TabPageIndicator extends HorizontalScrollView implements PageIndicator {
    public static ChangeQuickRedirect a;
    private static final CharSequence g = "";
    protected final View.OnClickListener b;
    protected final LinearLayout c;
    protected ViewPager d;
    protected String[] e;
    protected a f;
    private b h;
    private Runnable i;
    private ViewPager.OnPageChangeListener j;
    private int k;
    private int l;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
    }

    public static /* synthetic */ Runnable a(TabPageIndicator tabPageIndicator, Runnable runnable) {
        tabPageIndicator.i = null;
        return null;
    }

    public void setTabClickListener(b bVar) {
        this.h = bVar;
    }

    public TabPageIndicator(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5a5573fdaea1eb127ecf85d85a9b2a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5a5573fdaea1eb127ecf85d85a9b2a6");
        }
    }

    private TabPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, null);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96e58f51197f3f1e6aeea7ad71a9ebb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96e58f51197f3f1e6aeea7ad71a9ebb0");
            return;
        }
        this.b = new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.pager.TabPageIndicator.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c386f4bcd7dc70d65357029062647cb5", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c386f4bcd7dc70d65357029062647cb5");
                    return;
                }
                int intValue = ((Integer) view.getTag()).intValue();
                TabPageIndicator.this.d.getCurrentItem();
                TabPageIndicator.this.d.setCurrentItem(intValue);
                if (TabPageIndicator.this.h != null) {
                    b unused = TabPageIndicator.this.h;
                }
            }
        };
        setHorizontalScrollBarEnabled(false);
        this.c = new LinearLayout(context, null);
        this.c.setShowDividers(0);
        addView(this.c, new ViewGroup.LayoutParams(-2, -1));
    }

    public void setOnTabReselectedListener(a aVar) {
        this.f = aVar;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3ba51043796fbb24ba76d7ace45d133", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3ba51043796fbb24ba76d7ace45d133");
            return;
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.k = -1;
        } else if (childCount > 2) {
            this.k = (int) (View.MeasureSpec.getSize(i) * 0.4f);
        } else {
            this.k = View.MeasureSpec.getSize(i) / 2;
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, i2);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setCurrentItem(this.l);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "313ce4335b6a29b7b2ee32ea778f4eaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "313ce4335b6a29b7b2ee32ea778f4eaf");
            return;
        }
        super.onAttachedToWindow();
        if (this.i != null) {
            post(this.i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9c16bf6aedffdb63f67c9d9c89b1232", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9c16bf6aedffdb63f67c9d9c89b1232");
            return;
        }
        super.onDetachedFromWindow();
        if (this.i != null) {
            removeCallbacks(this.i);
        }
    }

    public void setViewPager(ViewPager viewPager) {
        Object[] objArr = {viewPager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "729d8e4746a5dbab07f7d15b483046b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "729d8e4746a5dbab07f7d15b483046b7");
        } else if (this.d == viewPager) {
        } else {
            if (this.d != null) {
                this.d.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() == null) {
                throw new IllegalStateException("ViewPager does not have adapter instance.");
            }
            this.d = viewPager;
            viewPager.setOnPageChangeListener(this);
            a();
        }
    }

    public void setTabs(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "507fa3964a3411c2224abc3054e7bb9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "507fa3964a3411c2224abc3054e7bb9e");
            return;
        }
        this.e = strArr;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91c1ddf449512ff9b4423d5efcf56553", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91c1ddf449512ff9b4423d5efcf56553");
            return;
        }
        this.c.removeAllViews();
        if (this.e != null) {
            int length = this.e.length;
            if (this.l > length) {
                this.l = length - 1;
            }
        } else {
            PagerAdapter adapter = this.d.getAdapter();
            int count = adapter.getCount();
            for (int i = 0; i < count; i++) {
                adapter.getPageTitle(i);
            }
            if (this.l > count) {
                this.l = count - 1;
            }
        }
        setCurrentItem(this.l);
        requestLayout();
    }

    public void setCurrentItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d95d37168ed635fb8d0f266124d0f77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d95d37168ed635fb8d0f266124d0f77");
        } else if (this.d == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        } else {
            this.l = i;
            this.d.setCurrentItem(i);
            int childCount = this.c.getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.c.getChildAt(i2);
                boolean z = i2 == i;
                childAt.setSelected(z);
                if (z) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5e5f27cd76f431402beed6bb797c71a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5e5f27cd76f431402beed6bb797c71a");
                    } else {
                        final View childAt2 = this.c.getChildAt(i);
                        if (this.i != null) {
                            removeCallbacks(this.i);
                        }
                        this.i = new Runnable() { // from class: com.sankuai.waimai.platform.widget.pager.TabPageIndicator.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bdc0701cca00d21f0fcf6331fe6b59e2", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bdc0701cca00d21f0fcf6331fe6b59e2");
                                    return;
                                }
                                TabPageIndicator.this.smoothScrollTo(childAt2.getLeft() - ((TabPageIndicator.this.getWidth() - childAt2.getWidth()) / 2), 0);
                                TabPageIndicator.a(TabPageIndicator.this, null);
                            }
                        };
                        post(this.i);
                    }
                }
                i2++;
            }
        }
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.j = onPageChangeListener;
    }
}
