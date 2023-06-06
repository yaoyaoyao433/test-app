package com.sankuai.waimai.store.view.banner;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class AutoScrollPagerView extends RelativeLayout {
    public static ChangeQuickRedirect a;
    private final Handler b;
    private ViewPager c;
    private BannerPagerAdapter d;
    private ScSimplePageIndicator e;
    private Context f;
    private boolean g;
    private float h;
    private int i;
    private SparseArray j;
    private b k;
    private Application.ActivityLifecycleCallbacks l;
    private Runnable m;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
    }

    public AutoScrollPagerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "287b1fd393a6bf1da77199dfa1498c06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "287b1fd393a6bf1da77199dfa1498c06");
            return;
        }
        this.b = new Handler(Looper.getMainLooper());
        this.d = null;
        this.g = false;
        this.h = 0.0f;
        this.i = 0;
        this.j = new SparseArray();
        this.k = null;
        this.l = new a();
        this.m = new Runnable() { // from class: com.sankuai.waimai.store.view.banner.AutoScrollPagerView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1cc77fe2ae31d3898be7cff93806dfd0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1cc77fe2ae31d3898be7cff93806dfd0");
                } else if (AutoScrollPagerView.this.i <= 1) {
                } else {
                    if (AutoScrollPagerView.this.c != null && AutoScrollPagerView.this.c.getAdapter() != null) {
                        AutoScrollPagerView.this.c.setCurrentItem(AutoScrollPagerView.this.c.getCurrentItem() != AutoScrollPagerView.this.c.getAdapter().getCount() - 1 ? AutoScrollPagerView.this.c.getCurrentItem() + 1 : 0);
                    }
                    AutoScrollPagerView.this.b.postDelayed(AutoScrollPagerView.this.m, MetricsAnrManager.ANR_THRESHOLD);
                }
            }
        };
        a(context, (AttributeSet) null);
    }

    public AutoScrollPagerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99566eba1b9e2132191f2d367b237703", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99566eba1b9e2132191f2d367b237703");
            return;
        }
        this.b = new Handler(Looper.getMainLooper());
        this.d = null;
        this.g = false;
        this.h = 0.0f;
        this.i = 0;
        this.j = new SparseArray();
        this.k = null;
        this.l = new a();
        this.m = new Runnable() { // from class: com.sankuai.waimai.store.view.banner.AutoScrollPagerView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1cc77fe2ae31d3898be7cff93806dfd0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1cc77fe2ae31d3898be7cff93806dfd0");
                } else if (AutoScrollPagerView.this.i <= 1) {
                } else {
                    if (AutoScrollPagerView.this.c != null && AutoScrollPagerView.this.c.getAdapter() != null) {
                        AutoScrollPagerView.this.c.setCurrentItem(AutoScrollPagerView.this.c.getCurrentItem() != AutoScrollPagerView.this.c.getAdapter().getCount() - 1 ? AutoScrollPagerView.this.c.getCurrentItem() + 1 : 0);
                    }
                    AutoScrollPagerView.this.b.postDelayed(AutoScrollPagerView.this.m, MetricsAnrManager.ANR_THRESHOLD);
                }
            }
        };
        a(context, attributeSet);
    }

    public AutoScrollPagerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2623277350021a0c42b288cfb8fccea7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2623277350021a0c42b288cfb8fccea7");
            return;
        }
        this.b = new Handler(Looper.getMainLooper());
        this.d = null;
        this.g = false;
        this.h = 0.0f;
        this.i = 0;
        this.j = new SparseArray();
        this.k = null;
        this.l = new a();
        this.m = new Runnable() { // from class: com.sankuai.waimai.store.view.banner.AutoScrollPagerView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1cc77fe2ae31d3898be7cff93806dfd0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1cc77fe2ae31d3898be7cff93806dfd0");
                } else if (AutoScrollPagerView.this.i <= 1) {
                } else {
                    if (AutoScrollPagerView.this.c != null && AutoScrollPagerView.this.c.getAdapter() != null) {
                        AutoScrollPagerView.this.c.setCurrentItem(AutoScrollPagerView.this.c.getCurrentItem() != AutoScrollPagerView.this.c.getAdapter().getCount() - 1 ? AutoScrollPagerView.this.c.getCurrentItem() + 1 : 0);
                    }
                    AutoScrollPagerView.this.b.postDelayed(AutoScrollPagerView.this.m, MetricsAnrManager.ANR_THRESHOLD);
                }
            }
        };
        a(context, attributeSet);
    }

    @TargetApi(21)
    public AutoScrollPagerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c497746f8f2a6fac792dbd6652cb2f0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c497746f8f2a6fac792dbd6652cb2f0e");
            return;
        }
        this.b = new Handler(Looper.getMainLooper());
        this.d = null;
        this.g = false;
        this.h = 0.0f;
        this.i = 0;
        this.j = new SparseArray();
        this.k = null;
        this.l = new a();
        this.m = new Runnable() { // from class: com.sankuai.waimai.store.view.banner.AutoScrollPagerView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1cc77fe2ae31d3898be7cff93806dfd0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1cc77fe2ae31d3898be7cff93806dfd0");
                } else if (AutoScrollPagerView.this.i <= 1) {
                } else {
                    if (AutoScrollPagerView.this.c != null && AutoScrollPagerView.this.c.getAdapter() != null) {
                        AutoScrollPagerView.this.c.setCurrentItem(AutoScrollPagerView.this.c.getCurrentItem() != AutoScrollPagerView.this.c.getAdapter().getCount() - 1 ? AutoScrollPagerView.this.c.getCurrentItem() + 1 : 0);
                    }
                    AutoScrollPagerView.this.b.postDelayed(AutoScrollPagerView.this.m, MetricsAnrManager.ANR_THRESHOLD);
                }
            }
        };
        a(context, attributeSet);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e25e81ee7986359caca351a99f1caf38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e25e81ee7986359caca351a99f1caf38");
            return;
        }
        super.onFinishInflate();
        LayoutInflater.from(this.f).inflate(R.layout.wm_st_layout_banner_viewpager_view, (ViewGroup) this, true);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d617c8228038f85bbdfd9c62ce1ba276", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d617c8228038f85bbdfd9c62ce1ba276");
            return;
        }
        this.c = (ViewPager) findViewById(R.id.vp_poiList_ad_container);
        if (this.c.getLayoutParams() != null) {
            ((RelativeLayout.LayoutParams) this.c.getLayoutParams()).bottomMargin = (int) this.h;
        }
        this.e = (ScSimplePageIndicator) findViewById(R.id.indicator_banner);
        this.e.setVisibility(8);
        this.e.a(3, false);
        ImageView imageView = (ImageView) findViewById(R.id.img_ad_circle);
        if (this.g) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f15aea339208ead9a29af89301a4874", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f15aea339208ead9a29af89301a4874");
            return;
        }
        this.f = context;
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.adMarginBottom, R.attr.radioMarginBottom, R.attr.isShowCircle});
        this.h = obtainStyledAttributes.getDimension(0, 0.0f);
        this.g = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c00b160ea5d14a212e7dd305a39b6e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c00b160ea5d14a212e7dd305a39b6e9");
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.e.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.addRule(11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8304a45118cff3914fc41b8be0a8ac20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8304a45118cff3914fc41b8be0a8ac20");
            return;
        }
        super.onAttachedToWindow();
        b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fce019f375c6a31bcdbeab9b35326ef4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fce019f375c6a31bcdbeab9b35326ef4");
            return;
        }
        Context applicationContext = getContext().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this.l);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36a38a928cda545c1acba1e5a09e62f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36a38a928cda545c1acba1e5a09e62f0");
            return;
        }
        super.onDetachedFromWindow();
        c();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ab30c21afa6718f99d645c5a868fc84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ab30c21afa6718f99d645c5a868fc84");
            return;
        }
        Context applicationContext = getContext().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.l);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0428f3fdc0ca02d63937e6b722360f02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0428f3fdc0ca02d63937e6b722360f02");
        } else if (this.i <= 1) {
        } else {
            c();
            if (d()) {
                this.b.postDelayed(this.m, MetricsAnrManager.ANR_THRESHOLD);
            }
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bab097226c82dd56a6099b4f00f755a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bab097226c82dd56a6099b4f00f755a5");
        } else {
            this.b.removeCallbacks(this.m);
        }
    }

    public final boolean d() {
        return this.c != null;
    }

    public final void a(List list, BannerPagerAdapter bannerPagerAdapter) {
        Object[] objArr = {list, bannerPagerAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3032f455463e75c634b1b801dcf2a6e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3032f455463e75c634b1b801dcf2a6e5");
        } else {
            a(list, null, bannerPagerAdapter);
        }
    }

    private void a(List list, b bVar, BannerPagerAdapter bannerPagerAdapter) {
        Object[] objArr = {list, null, bannerPagerAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51ab04c0c7cbfa7a8f20a25b1f6ceb86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51ab04c0c7cbfa7a8f20a25b1f6ceb86");
        } else if (d()) {
            this.e.a(list.size(), this.c.getCurrentItem());
            this.j.clear();
            this.k = null;
            this.d = bannerPagerAdapter;
            this.i = list.size();
            this.c.setAdapter(this.d);
            int i = this.i * 100;
            this.c.setCurrentItem(i);
            this.e.setCheckedPosition(i);
            g();
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12906ec7f07d89c30b4b6c6e645f87f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12906ec7f07d89c30b4b6c6e645f87f2");
            return;
        }
        this.c.addOnPageChangeListener(this.e);
        this.c.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sankuai.waimai.store.view.banner.AutoScrollPagerView.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f87dc192806ca7c78bd63f284a9ea3ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f87dc192806ca7c78bd63f284a9ea3ea");
                    return;
                }
                try {
                    if (AutoScrollPagerView.this.d != null) {
                        int a2 = i % AutoScrollPagerView.this.d.a();
                        if (AutoScrollPagerView.this.j.get(a2) == null && u.a(AutoScrollPagerView.this)) {
                            if (AutoScrollPagerView.this.k != null) {
                                b unused = AutoScrollPagerView.this.k;
                            }
                            AutoScrollPagerView.this.j.put(a2, Integer.valueOf(a2));
                        }
                    }
                } catch (Exception e) {
                    com.sankuai.shangou.stone.util.log.a.a(e);
                }
            }
        });
        this.c.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.store.view.banner.AutoScrollPagerView.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac1e47d6f8da7e63c279336630110913", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac1e47d6f8da7e63c279336630110913")).booleanValue();
                }
                if (motionEvent.getAction() == 2) {
                    AutoScrollPagerView.this.c();
                } else if (motionEvent.getAction() == 1) {
                    AutoScrollPagerView.this.b();
                }
                return false;
            }
        });
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "247200fb6dcfde53ae1eec5c21a977cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "247200fb6dcfde53ae1eec5c21a977cf");
        } else {
            this.j.clear();
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e26754a925533323d2c1671383624e70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e26754a925533323d2c1671383624e70");
        } else if (this.k == null || this.d.a() <= 0) {
        } else {
            int currentItem = this.c.getCurrentItem() % this.d.a();
            if (this.j.get(currentItem) == null && u.a(this)) {
                this.j.put(currentItem, Integer.valueOf(currentItem));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a implements Application.ActivityLifecycleCallbacks {
        public static ChangeQuickRedirect a;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Object[] objArr = {activity, bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5c337c04903827768df53eba9920c7a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5c337c04903827768df53eba9920c7a");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        private a() {
            Object[] objArr = {AutoScrollPagerView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb4cbd0b5e8dc58cd412be544b9eb09b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb4cbd0b5e8dc58cd412be544b9eb09b");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2525b5178a12f51c526fe04c0aa85f13", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2525b5178a12f51c526fe04c0aa85f13");
            } else if (activity == AutoScrollPagerView.this.getContext()) {
                AutoScrollPagerView.this.b();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cea072e21dbf4675cb26a11d311e3df4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cea072e21dbf4675cb26a11d311e3df4");
            } else if (activity == AutoScrollPagerView.this.getContext()) {
                AutoScrollPagerView.this.c();
            }
        }
    }
}
