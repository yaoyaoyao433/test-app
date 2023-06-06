package com.sankuai.waimai.store.search.template.carouselcard;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.view.banner.BannerPagerAdapter;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SearchAutoScrollPagerView extends RelativeLayout {
    public static ChangeQuickRedirect a;
    ViewPager b;
    BannerPagerAdapter c;
    ScSearchPageIndicator d;
    int e;
    SparseArray f;
    b g;
    private final Handler h;
    private Context i;
    private Application.ActivityLifecycleCallbacks j;
    private long k;
    private Runnable l;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
    }

    public SearchAutoScrollPagerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dac30b867bd49ae026cfe8807c80090", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dac30b867bd49ae026cfe8807c80090");
            return;
        }
        this.h = new Handler(Looper.getMainLooper());
        this.c = null;
        this.e = 0;
        this.f = new SparseArray();
        this.g = null;
        this.j = new a();
        this.k = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
        this.l = new Runnable() { // from class: com.sankuai.waimai.store.search.template.carouselcard.SearchAutoScrollPagerView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85801a85d366b73181a716626748a08b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85801a85d366b73181a716626748a08b");
                } else if (SearchAutoScrollPagerView.this.e <= 1) {
                } else {
                    if (SearchAutoScrollPagerView.this.b != null && SearchAutoScrollPagerView.this.b.getAdapter() != null) {
                        SearchAutoScrollPagerView.this.b.setCurrentItem(SearchAutoScrollPagerView.this.b.getCurrentItem() != SearchAutoScrollPagerView.this.b.getAdapter().getCount() - 1 ? SearchAutoScrollPagerView.this.b.getCurrentItem() + 1 : 0);
                    }
                    SearchAutoScrollPagerView.this.h.postDelayed(SearchAutoScrollPagerView.this.l, SearchAutoScrollPagerView.this.k);
                }
            }
        };
        a(context, null);
    }

    public SearchAutoScrollPagerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6c45fd9a0366c3ddad9750ac7184d41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6c45fd9a0366c3ddad9750ac7184d41");
            return;
        }
        this.h = new Handler(Looper.getMainLooper());
        this.c = null;
        this.e = 0;
        this.f = new SparseArray();
        this.g = null;
        this.j = new a();
        this.k = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
        this.l = new Runnable() { // from class: com.sankuai.waimai.store.search.template.carouselcard.SearchAutoScrollPagerView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85801a85d366b73181a716626748a08b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85801a85d366b73181a716626748a08b");
                } else if (SearchAutoScrollPagerView.this.e <= 1) {
                } else {
                    if (SearchAutoScrollPagerView.this.b != null && SearchAutoScrollPagerView.this.b.getAdapter() != null) {
                        SearchAutoScrollPagerView.this.b.setCurrentItem(SearchAutoScrollPagerView.this.b.getCurrentItem() != SearchAutoScrollPagerView.this.b.getAdapter().getCount() - 1 ? SearchAutoScrollPagerView.this.b.getCurrentItem() + 1 : 0);
                    }
                    SearchAutoScrollPagerView.this.h.postDelayed(SearchAutoScrollPagerView.this.l, SearchAutoScrollPagerView.this.k);
                }
            }
        };
        a(context, attributeSet);
    }

    public SearchAutoScrollPagerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94be87b0c24c5c9e60f5f01000cb79ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94be87b0c24c5c9e60f5f01000cb79ee");
            return;
        }
        this.h = new Handler(Looper.getMainLooper());
        this.c = null;
        this.e = 0;
        this.f = new SparseArray();
        this.g = null;
        this.j = new a();
        this.k = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
        this.l = new Runnable() { // from class: com.sankuai.waimai.store.search.template.carouselcard.SearchAutoScrollPagerView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85801a85d366b73181a716626748a08b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85801a85d366b73181a716626748a08b");
                } else if (SearchAutoScrollPagerView.this.e <= 1) {
                } else {
                    if (SearchAutoScrollPagerView.this.b != null && SearchAutoScrollPagerView.this.b.getAdapter() != null) {
                        SearchAutoScrollPagerView.this.b.setCurrentItem(SearchAutoScrollPagerView.this.b.getCurrentItem() != SearchAutoScrollPagerView.this.b.getAdapter().getCount() - 1 ? SearchAutoScrollPagerView.this.b.getCurrentItem() + 1 : 0);
                    }
                    SearchAutoScrollPagerView.this.h.postDelayed(SearchAutoScrollPagerView.this.l, SearchAutoScrollPagerView.this.k);
                }
            }
        };
        a(context, attributeSet);
    }

    @TargetApi(21)
    public SearchAutoScrollPagerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e7114b2fdace6bab9ad73996808eaa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e7114b2fdace6bab9ad73996808eaa");
            return;
        }
        this.h = new Handler(Looper.getMainLooper());
        this.c = null;
        this.e = 0;
        this.f = new SparseArray();
        this.g = null;
        this.j = new a();
        this.k = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
        this.l = new Runnable() { // from class: com.sankuai.waimai.store.search.template.carouselcard.SearchAutoScrollPagerView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85801a85d366b73181a716626748a08b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85801a85d366b73181a716626748a08b");
                } else if (SearchAutoScrollPagerView.this.e <= 1) {
                } else {
                    if (SearchAutoScrollPagerView.this.b != null && SearchAutoScrollPagerView.this.b.getAdapter() != null) {
                        SearchAutoScrollPagerView.this.b.setCurrentItem(SearchAutoScrollPagerView.this.b.getCurrentItem() != SearchAutoScrollPagerView.this.b.getAdapter().getCount() - 1 ? SearchAutoScrollPagerView.this.b.getCurrentItem() + 1 : 0);
                    }
                    SearchAutoScrollPagerView.this.h.postDelayed(SearchAutoScrollPagerView.this.l, SearchAutoScrollPagerView.this.k);
                }
            }
        };
        a(context, attributeSet);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8eb2690c09ad959c8be7079b66a17e34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8eb2690c09ad959c8be7079b66a17e34");
            return;
        }
        super.onFinishInflate();
        LayoutInflater.from(this.i).inflate(R.layout.wm_st_search_layout_banner_viewpager_view, (ViewGroup) this, true);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2cc53c9b6c65a5e94604f9c23ca5475d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2cc53c9b6c65a5e94604f9c23ca5475d");
            return;
        }
        this.b = (ViewPager) findViewById(R.id.vp_poiList_ad_container);
        this.d = (ScSearchPageIndicator) findViewById(R.id.indicator_banner);
        this.d.setVisibility(8);
        ScSearchPageIndicator scSearchPageIndicator = this.d;
        Object[] objArr3 = {3, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect3 = ScSearchPageIndicator.a;
        if (PatchProxy.isSupport(objArr3, scSearchPageIndicator, changeQuickRedirect3, false, "fdbd0f73d8ee84a80ef3eb1ad379337d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, scSearchPageIndicator, changeQuickRedirect3, false, "fdbd0f73d8ee84a80ef3eb1ad379337d");
        } else {
            scSearchPageIndicator.b = 3;
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        this.i = context;
        if (attributeSet == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49b3e8de0104a364b5061b7eb71d1444", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49b3e8de0104a364b5061b7eb71d1444");
            return;
        }
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c72d1cbb215f6f93a5e28c7669cdd788", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c72d1cbb215f6f93a5e28c7669cdd788");
            return;
        }
        super.onDetachedFromWindow();
        b();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe72df8e966021738355bb177c218798", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe72df8e966021738355bb177c218798");
        } else if (this.e <= 1) {
        } else {
            b();
            if (c()) {
                this.h.postDelayed(this.l, this.k);
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b5be45f6ad923a1d26f3dd856d6a259", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b5be45f6ad923a1d26f3dd856d6a259");
        } else {
            this.h.removeCallbacks(this.l);
        }
    }

    public final boolean c() {
        return this.b != null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static ChangeQuickRedirect a;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Object[] objArr = {activity, bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67e3650a722e398c587e931a004aee9e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67e3650a722e398c587e931a004aee9e");
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
            Object[] objArr = {SearchAutoScrollPagerView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ac9d4fb1a02d7b08f29b391fd09bb3a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ac9d4fb1a02d7b08f29b391fd09bb3a");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e2e00f829ace48cdd2a4205cdc84b4a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e2e00f829ace48cdd2a4205cdc84b4a");
            } else if (activity == SearchAutoScrollPagerView.this.getContext()) {
                SearchAutoScrollPagerView.this.a();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15620eaeecd6483c4a2e2e5c0b376dec", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15620eaeecd6483c4a2e2e5c0b376dec");
            } else if (activity == SearchAutoScrollPagerView.this.getContext()) {
                SearchAutoScrollPagerView.this.b();
            }
        }
    }
}
