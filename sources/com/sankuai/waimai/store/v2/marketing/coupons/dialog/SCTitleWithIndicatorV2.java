package com.sankuai.waimai.store.v2.marketing.coupons.dialog;

import android.animation.ArgbEvaluator;
import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.log.a;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.store.base.BaseCustomFrameLayout;
import com.sankuai.waimai.store.newwidgets.indicator.TabInfo;
import com.sankuai.waimai.store.newwidgets.indicator.common.IndicateView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCTitleWithIndicatorV2 extends BaseCustomFrameLayout implements TabLayout.a, ViewPager.OnPageChangeListener, IndicateView.a {
    public static ChangeQuickRedirect g;
    private List<TabInfo> e;
    private int f;
    protected TabLayout h;
    protected IndicateView i;
    protected Map<TabLayout.d, TextView> j;
    protected int k;
    protected int l;
    public View m;
    private ViewPager n;
    private int o;
    private boolean p;
    private ArgbEvaluator q;

    @Override // android.support.design.widget.TabLayout.a
    public final void c(TabLayout.d dVar) {
    }

    @Override // com.sankuai.waimai.store.base.BaseCustomFrameLayout
    public int getLayoutId() {
        return R.layout.wm_sc_common_title_with_indicator_container;
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
    }

    public SCTitleWithIndicatorV2(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38ef81ce655848dfcbdcf6423ac3669e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38ef81ce655848dfcbdcf6423ac3669e");
            return;
        }
        this.e = new ArrayList();
        this.j = new HashMap();
        this.k = -16777216;
        this.l = -16777216;
        this.f = 0;
        this.o = 0;
        this.p = false;
        this.q = new ArgbEvaluator();
    }

    public SCTitleWithIndicatorV2(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bafc2bda96d52ee7d2aa5b845cd15b8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bafc2bda96d52ee7d2aa5b845cd15b8d");
            return;
        }
        this.e = new ArrayList();
        this.j = new HashMap();
        this.k = -16777216;
        this.l = -16777216;
        this.f = 0;
        this.o = 0;
        this.p = false;
        this.q = new ArgbEvaluator();
    }

    public SCTitleWithIndicatorV2(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "986b5eca29a34508d69ff526db871465", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "986b5eca29a34508d69ff526db871465");
            return;
        }
        this.e = new ArrayList();
        this.j = new HashMap();
        this.k = -16777216;
        this.l = -16777216;
        this.f = 0;
        this.o = 0;
        this.p = false;
        this.q = new ArgbEvaluator();
    }

    @TargetApi(21)
    public SCTitleWithIndicatorV2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03a72244910399a51e54fd560d930912", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03a72244910399a51e54fd560d930912");
            return;
        }
        this.e = new ArrayList();
        this.j = new HashMap();
        this.k = -16777216;
        this.l = -16777216;
        this.f = 0;
        this.o = 0;
        this.p = false;
        this.q = new ArgbEvaluator();
    }

    @Override // com.sankuai.waimai.store.base.BaseCustomFrameLayout
    public final View a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf7315420a9091b25dcf7efa30cc2d74", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf7315420a9091b25dcf7efa30cc2d74");
        }
        this.h = (TabLayout) a(R.id.wm_sc_tablayout);
        this.h.a((TabLayout.a) this);
        this.i = (IndicateView) a(R.id.wm_sc_indicator);
        final IndicateView indicateView = this.i;
        TabLayout tabLayout = this.h;
        Object[] objArr2 = {tabLayout};
        ChangeQuickRedirect changeQuickRedirect2 = IndicateView.a;
        if (PatchProxy.isSupport(objArr2, indicateView, changeQuickRedirect2, false, "02d626a9a12410457618e95c3727127f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, indicateView, changeQuickRedirect2, false, "02d626a9a12410457618e95c3727127f");
        } else {
            indicateView.i = tabLayout;
            if (indicateView.i != null) {
                try {
                    indicateView.h = (LinearLayout) indicateView.i.getChildAt(0);
                    indicateView.f = (HorizontalScrollView) indicateView.h.getParent();
                    indicateView.f.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.store.newwidgets.indicator.common.IndicateView.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            Object[] objArr3 = {view2, motionEvent};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2a772542de38c93e24114eb1a7f54080", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2a772542de38c93e24114eb1a7f54080")).booleanValue();
                            }
                            View childAt = indicateView.h.getChildAt(indicateView.e);
                            if (childAt == null) {
                                return false;
                            }
                            int width = (childAt.getWidth() - indicateView.g) / 2;
                            indicateView.a((childAt.getLeft() - indicateView.f.getScrollX()) + width, (childAt.getRight() - indicateView.f.getScrollX()) - width);
                            int action = motionEvent.getAction();
                            if (action != 3) {
                                switch (action) {
                                    case 0:
                                        return false;
                                    case 1:
                                        break;
                                    default:
                                        return false;
                                }
                            }
                            return true;
                        }
                    });
                } catch (Exception e) {
                    a.a(e);
                }
                if (indicateView.h == null || indicateView.f == null) {
                    indicateView.i.setSelectedTabIndicatorHeight(indicateView.b);
                }
            }
        }
        this.i.setOnPercentageListener(this);
        return view;
    }

    public void setEnableScroll(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa9d806f8e1b420960772a8aa2df733f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa9d806f8e1b420960772a8aa2df733f");
        } else {
            this.h.setTabMode(!z ? 1 : 0);
        }
    }

    public void setIndicatorColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0a21c94fe855eef40afec13c4583f34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0a21c94fe855eef40afec13c4583f34");
        } else {
            this.i.setColor(i);
        }
    }

    public void setupWithViewPager(@NonNull ViewPager viewPager) {
        Object[] objArr = {viewPager};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f853c3001e03bd53c52280418e0d50e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f853c3001e03bd53c52280418e0d50e");
            return;
        }
        this.h.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(this);
        this.n = viewPager;
    }

    public void setTabData(List<TabInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09762fd5f7342f570889542f441360d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09762fd5f7342f570889542f441360d4");
            return;
        }
        this.e.clear();
        if (list != null) {
            this.e.addAll(list);
        }
        this.j.clear();
        int size = this.e.size();
        int tabCount = this.h.getTabCount();
        for (int i = 0; i < tabCount && i < size; i++) {
            if (this.e.get(i) != null) {
                a(i, this.h.a(i), this.e.get(i));
            }
        }
        post(new Runnable() { // from class: com.sankuai.waimai.store.v2.marketing.coupons.dialog.SCTitleWithIndicatorV2.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                View childAt;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad1b4659dc08061ebe324cc41dd591f7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad1b4659dc08061ebe324cc41dd591f7");
                    return;
                }
                IndicateView indicateView = SCTitleWithIndicatorV2.this.i;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = IndicateView.a;
                if (PatchProxy.isSupport(objArr3, indicateView, changeQuickRedirect3, false, "684d16af0d8be2c6b8110142e8589a84", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, indicateView, changeQuickRedirect3, false, "684d16af0d8be2c6b8110142e8589a84");
                } else if (indicateView.h == null || indicateView.f == null || (childAt = indicateView.h.getChildAt(indicateView.e)) == null) {
                } else {
                    indicateView.c = indicateView.i.getLeft() + childAt.getLeft() + ((childAt.getWidth() - indicateView.g) / 2);
                    indicateView.d = indicateView.c + indicateView.g;
                    indicateView.a(indicateView.c, indicateView.d);
                    ViewCompat.postInvalidateOnAnimation(indicateView);
                }
            }
        });
    }

    public void setScTitleTabData(List<TabInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "816be500af07c092f46e148fa5df4905", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "816be500af07c092f46e148fa5df4905");
            return;
        }
        this.e.clear();
        if (list != null) {
            this.e.addAll(list);
        }
        this.j.clear();
        int size = this.e.size();
        int tabCount = this.h.getTabCount();
        for (int i = 0; i < tabCount && i < size; i++) {
            if (this.e.get(i) != null) {
                a(i, this.h.a(i), this.e.get(i));
            }
        }
    }

    public void setCurrentPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "364832cea9b9ea314c5817e978b2e4bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "364832cea9b9ea314c5817e978b2e4bb");
        } else {
            this.i.setCurrentPosition(i);
        }
    }

    public void setIndicatorHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "838572cc13c8846bc6d947301d7b8bdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "838572cc13c8846bc6d947301d7b8bdb");
        } else {
            this.i.setHeight(i);
        }
    }

    public void setIndicatorWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "361c24d3c5481e4ee65b784d3921c733", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "361c24d3c5481e4ee65b784d3921c733");
        } else {
            this.i.setWidth(i);
        }
    }

    @NonNull
    public TabLayout getTabLayout() {
        return this.h;
    }

    public int getInnerMeasureWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "092ad2f1468cb77a83bca18e5af367fa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "092ad2f1468cb77a83bca18e5af367fa")).intValue() : this.i.getInnerMeasureWidth();
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        View childAt;
        int i3;
        boolean z;
        float f2;
        float f3;
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86319498979b534d2797cc6daa749075", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86319498979b534d2797cc6daa749075");
            return;
        }
        IndicateView indicateView = this.i;
        Object[] objArr2 = {Byte.valueOf(this.p ? (byte) 1 : (byte) 0), Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = IndicateView.a;
        if (PatchProxy.isSupport(objArr2, indicateView, changeQuickRedirect2, false, "77715ce9d730f834aa76b8062fb10a8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, indicateView, changeQuickRedirect2, false, "77715ce9d730f834aa76b8062fb10a8b");
            return;
        }
        Object[] objArr3 = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = IndicateView.a;
        if (PatchProxy.isSupport(objArr3, indicateView, changeQuickRedirect3, false, "f0b36a8010d6edf6aa5e4c80148546fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, indicateView, changeQuickRedirect3, false, "f0b36a8010d6edf6aa5e4c80148546fc");
        } else if (indicateView.h == null || indicateView.f == null) {
        } else {
            if (f > 1.0E-6d && f < 1.0f) {
                if (indicateView.e == i) {
                    i3 = i + 1;
                    z = false;
                } else {
                    i3 = i;
                    z = true;
                }
                View childAt2 = indicateView.h.getChildAt(indicateView.e);
                View childAt3 = indicateView.h.getChildAt(i3);
                if (p.a(childAt2, childAt3)) {
                    return;
                }
                if (z) {
                    childAt3 = childAt2;
                    childAt2 = childAt3;
                }
                int width = (childAt2.getWidth() + childAt3.getWidth()) / 2;
                int width2 = (childAt2.getWidth() - indicateView.g) / 2;
                childAt3.getWidth();
                float left = (indicateView.i.getLeft() + childAt2.getLeft()) - indicateView.f.getScrollX();
                if (f <= 0.33f) {
                    f2 = left + width2;
                    f3 = indicateView.g + f2 + ((width - indicateView.g) * (f / 0.33f));
                } else if (f <= 0.66f) {
                    f2 = left + (indicateView.g * ((f - 0.33f) / 0.33f)) + width2;
                    f3 = f2 + width;
                } else {
                    float f4 = width2;
                    f2 = left + indicateView.g + ((width - indicateView.g) * ((f - 0.66f) / 0.33f)) + f4;
                    f3 = indicateView.g + left + width + f4;
                }
                indicateView.a((int) f2, (int) f3);
                if (indicateView.j != null) {
                    indicateView.j.a(indicateView.e < i3 ? f : 1.0f - f, indicateView.e, i3);
                    return;
                }
                return;
            }
            indicateView.e = i;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = IndicateView.a;
            if (PatchProxy.isSupport(objArr4, indicateView, changeQuickRedirect4, false, "927b693bfbcc11bce7e7d1763c244b9b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, indicateView, changeQuickRedirect4, false, "927b693bfbcc11bce7e7d1763c244b9b");
            } else if (indicateView.h == null || indicateView.f == null || (childAt = indicateView.h.getChildAt(indicateView.e)) == null) {
            } else {
                int width3 = (childAt.getWidth() - indicateView.g) / 2;
                indicateView.a(((indicateView.i.getLeft() + childAt.getLeft()) - indicateView.f.getScrollX()) + width3, (childAt.getRight() - indicateView.f.getScrollX()) - width3);
            }
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44403d93bfecef0530af684615118fa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44403d93bfecef0530af684615118fa0");
            return;
        }
        if ((i == 0 || (this.o == 2 && i == 1)) && this.n != null && !this.p) {
            this.f = this.n.getCurrentItem();
            this.i.setCurrentPosition(this.f);
        }
        this.o = i;
        if (i == 0) {
            this.p = false;
        }
    }

    @Override // android.support.design.widget.TabLayout.a
    public final void a(TabLayout.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d7a8024606bd5ff3d8d385638763a11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d7a8024606bd5ff3d8d385638763a11");
            return;
        }
        TextView textView = this.j.get(dVar);
        if (textView != null) {
            textView.setTextColor(this.l);
            textView.getPaint().setFakeBoldText(true);
        }
        if (Math.abs(this.f - dVar.e) > 1) {
            this.p = true;
            this.f = dVar.e;
            this.i.setCurrentPosition(this.f);
        } else {
            this.p = false;
        }
        TabInfo tabInfo = (TabInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) this.e, dVar.e);
        if (tabInfo != null) {
            tabInfo.f = true;
        }
    }

    @Override // android.support.design.widget.TabLayout.a
    public final void b(TabLayout.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aca6d9b5fde7c33b3181df1a715a780", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aca6d9b5fde7c33b3181df1a715a780");
            return;
        }
        TextView textView = this.j.get(dVar);
        if (textView != null) {
            textView.setTextColor(this.k);
            textView.getPaint().setFakeBoldText(false);
        }
        TabInfo tabInfo = (TabInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) this.e, dVar.e);
        if (tabInfo != null) {
            tabInfo.f = false;
        }
    }

    public TabLayout.d a(int i, TabLayout.d dVar, TabInfo tabInfo) {
        Object[] objArr = {Integer.valueOf(i), dVar, tabInfo};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adb496b98e96e8855e04a9b4993d278f", RobustBitConfig.DEFAULT_VALUE)) {
            return (TabLayout.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adb496b98e96e8855e04a9b4993d278f");
        }
        if (tabInfo != null && dVar != null) {
            dVar.a = Integer.valueOf(tabInfo.c);
            dVar.a(R.layout.wm_sc_tab_item_view);
            TextView textView = (TextView) dVar.f.findViewById(R.id.tab_item_text);
            if (textView.getContext().getString(R.string.wm_sc_shop_friend_assist).equals(tabInfo.d)) {
                this.m = textView;
            }
            if (textView != null) {
                textView.setText(tabInfo.d);
                this.j.put(dVar, textView);
                if (this.n != null) {
                    if (i == this.n.getCurrentItem()) {
                        textView.setTextColor(this.l);
                    } else {
                        textView.setTextColor(this.k);
                    }
                }
            }
        }
        return dVar;
    }

    @Override // com.sankuai.waimai.store.newwidgets.indicator.common.IndicateView.a
    public final void a(float f, int i, int i2) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4320e9ca2a5c60507ce7817e42eeb44d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4320e9ca2a5c60507ce7817e42eeb44d");
            return;
        }
        TabLayout.d a = this.h.a(i);
        TabLayout.d a2 = this.h.a(i2);
        if (a == null || a2 == null) {
            return;
        }
        TextView textView = this.j.get(a);
        TextView textView2 = this.j.get(a2);
        if (textView == null || textView2 == null) {
            return;
        }
        int intValue = ((Integer) this.q.evaluate(f, Integer.valueOf(this.l), Integer.valueOf(this.k))).intValue();
        int intValue2 = ((Integer) this.q.evaluate(f, Integer.valueOf(this.k), Integer.valueOf(this.l))).intValue();
        textView.setTextColor(intValue);
        textView2.setTextColor(intValue2);
    }
}
