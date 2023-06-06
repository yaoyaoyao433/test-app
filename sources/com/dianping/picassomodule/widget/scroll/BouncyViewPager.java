package com.dianping.picassomodule.widget.scroll;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.dianping.picassomodule.widget.scroll.PagerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class BouncyViewPager extends WrapContentViewPager {
    public static ChangeQuickRedirect a;
    LinearLayout b;
    View c;
    View d;
    int e;
    private boolean j;
    private PagerAdapter k;
    private boolean l;
    private PagerView.b m;
    private PagerView.e n;
    private ViewPager.OnPageChangeListener o;

    public static /* synthetic */ void f(BouncyViewPager bouncyViewPager) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bouncyViewPager, changeQuickRedirect, false, "db7a9cd54c45511f97ddbb41abff2ad0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bouncyViewPager, changeQuickRedirect, false, "db7a9cd54c45511f97ddbb41abff2ad0");
        } else if (!bouncyViewPager.j || bouncyViewPager.d == null) {
        } else {
            bouncyViewPager.j = false;
            bouncyViewPager.b.removeAllViews();
            bouncyViewPager.b.addView(bouncyViewPager.d);
        }
    }

    public static /* synthetic */ void g(BouncyViewPager bouncyViewPager) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bouncyViewPager, changeQuickRedirect, false, "f664225d409f73c60a270cf462fe7848", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bouncyViewPager, changeQuickRedirect, false, "f664225d409f73c60a270cf462fe7848");
        } else if (bouncyViewPager.j || bouncyViewPager.c == null) {
        } else {
            bouncyViewPager.j = true;
            bouncyViewPager.b.removeAllViews();
            bouncyViewPager.b.addView(bouncyViewPager.c);
        }
    }

    public BouncyViewPager(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6ca9e7d6d1bd2cd990039e20170be73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6ca9e7d6d1bd2cd990039e20170be73");
        }
    }

    private BouncyViewPager(Context context, AttributeSet attributeSet) {
        super(context, null);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "610a301a2a961344c9131a935198589a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "610a301a2a961344c9131a935198589a");
            return;
        }
        this.j = false;
        this.l = false;
        this.o = new ViewPager.SimpleOnPageChangeListener() { // from class: com.dianping.picassomodule.widget.scroll.BouncyViewPager.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f69fe5bb6c5c2536638bc77f803f207", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f69fe5bb6c5c2536638bc77f803f207");
                } else if (BouncyViewPager.this.k == null || i != BouncyViewPager.this.k.getCount() - 1) {
                } else {
                    BouncyViewPager.this.setCurrentItem(i - 1, true);
                }
            }

            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61cfc6d78ca50cf89a6646059de09251", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61cfc6d78ca50cf89a6646059de09251");
                } else if (i == BouncyViewPager.this.k.getCount() - 2) {
                    int measuredWidth = BouncyViewPager.this.b.getChildAt(0).getMeasuredWidth();
                    BouncyViewPager bouncyViewPager = BouncyViewPager.this;
                    if (bouncyViewPager.e != 0) {
                        measuredWidth = BouncyViewPager.this.e;
                    }
                    bouncyViewPager.l = i2 > measuredWidth;
                    if (BouncyViewPager.this.d != null) {
                        if (BouncyViewPager.this.l) {
                            BouncyViewPager.f(BouncyViewPager.this);
                        } else {
                            BouncyViewPager.g(BouncyViewPager.this);
                        }
                    }
                }
            }

            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70695eeb686307b9be60b531cdd9f947", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70695eeb686307b9be60b531cdd9f947");
                } else if (BouncyViewPager.this.k != null) {
                    int currentItem = BouncyViewPager.this.getCurrentItem();
                    if (i == 0 && currentItem == BouncyViewPager.this.k.getCount() - 1) {
                        BouncyViewPager.this.setCurrentItem(currentItem - 1, true);
                    }
                    if (BouncyViewPager.this.l) {
                        BouncyViewPager.this.l = false;
                        BouncyViewPager.g(BouncyViewPager.this);
                        if (BouncyViewPager.this.m != null) {
                            PagerView.b unused = BouncyViewPager.this.m;
                        }
                    }
                }
            }
        };
        addOnPageChangeListener(this.o);
    }

    @Override // android.support.v4.view.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        Object[] objArr = {pagerAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1faaa8da6dfc758da224e9139070964", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1faaa8da6dfc758da224e9139070964");
            return;
        }
        this.k = new a(pagerAdapter);
        super.setAdapter(this.k);
    }

    public void setOnBouncyBackListener(PagerView.b bVar) {
        this.m = bVar;
    }

    public void setOnTriggerStatusChangeListener(PagerView.e eVar) {
        this.n = eVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class a extends PagerAdapter {
        public static ChangeQuickRedirect a;
        private PagerAdapter c;

        public a(PagerAdapter pagerAdapter) {
            Object[] objArr = {BouncyViewPager.this, pagerAdapter};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd11c0f468063680addce968a3a9dcb4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd11c0f468063680addce968a3a9dcb4");
            } else {
                this.c = pagerAdapter;
            }
        }

        @Override // android.support.v4.view.PagerAdapter
        public final int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fd868564c14c732f81d84b3897720cb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fd868564c14c732f81d84b3897720cb")).intValue() : this.c.getCount() + 1;
        }

        @Override // android.support.v4.view.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44440e6376eaeadeb474883ccfb1b2a3", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44440e6376eaeadeb474883ccfb1b2a3");
            }
            if (i >= getCount() - 1) {
                viewGroup.addView(BouncyViewPager.this.b);
                return BouncyViewPager.this.b;
            }
            return this.c.instantiateItem(viewGroup, i);
        }

        @Override // android.support.v4.view.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b172c67c941ff86de08a6cf90b9ce95", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b172c67c941ff86de08a6cf90b9ce95");
            } else if (i < getCount() - 1) {
                this.c.destroyItem(viewGroup, i, obj);
            } else {
                viewGroup.removeView((View) obj);
            }
        }

        @Override // android.support.v4.view.PagerAdapter
        public final boolean isViewFromObject(View view, Object obj) {
            Object[] objArr = {view, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "907b34ed37df52b5b8b643716a274968", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "907b34ed37df52b5b8b643716a274968")).booleanValue() : this.c.isViewFromObject(view, obj);
        }

        @Override // android.support.v4.view.PagerAdapter
        public final void finishUpdate(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "015c55fcbc5e7f0e223d867301109a3f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "015c55fcbc5e7f0e223d867301109a3f");
            } else {
                this.c.finishUpdate(viewGroup);
            }
        }

        @Override // android.support.v4.view.PagerAdapter
        public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
            Object[] objArr = {parcelable, classLoader};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b04d70955bc763ffe1e1ca0c5c5e2880", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b04d70955bc763ffe1e1ca0c5c5e2880");
            } else {
                this.c.restoreState(parcelable, classLoader);
            }
        }

        @Override // android.support.v4.view.PagerAdapter
        public final Parcelable saveState() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aea577cac4dd236c8842b680fd3cf60", RobustBitConfig.DEFAULT_VALUE) ? (Parcelable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aea577cac4dd236c8842b680fd3cf60") : this.c.saveState();
        }

        @Override // android.support.v4.view.PagerAdapter
        public final void startUpdate(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b25ba689e0aa6ecb9241048cdbc6a706", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b25ba689e0aa6ecb9241048cdbc6a706");
            } else {
                this.c.startUpdate(viewGroup);
            }
        }

        @Override // android.support.v4.view.PagerAdapter
        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e2c80378d9f90e1f13a0e66fa845694", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e2c80378d9f90e1f13a0e66fa845694");
            } else {
                this.c.setPrimaryItem(viewGroup, i, obj);
            }
        }
    }
}
