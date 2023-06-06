package com.sankuai.waimai.store.drug.newwidgets.indicator;

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
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.store.drug.base.BaseCustomFrameLayout;
import com.sankuai.waimai.store.drug.newwidgets.indicator.common.IndicateView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCTitleWithIndicator extends BaseCustomFrameLayout implements TabLayout.a, ViewPager.OnPageChangeListener, IndicateView.a {
    public static ChangeQuickRedirect g;
    private List<a> e;
    private int f;
    protected TabLayout h;
    protected IndicateView i;
    protected Map<TabLayout.d, TextView> j;
    protected int k;
    protected int l;
    private ViewPager m;
    private int n;
    private boolean o;
    private ArgbEvaluator p;

    @Override // android.support.design.widget.TabLayout.a
    public final void c(TabLayout.d dVar) {
    }

    @Override // com.sankuai.waimai.store.drug.base.BaseCustomFrameLayout
    public int getLayoutId() {
        return R.layout.wm_drug_common_title_with_indicator_container;
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
    }

    public SCTitleWithIndicator(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02287edba1bc4cbfd280839134e025e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02287edba1bc4cbfd280839134e025e9");
            return;
        }
        this.e = new ArrayList();
        this.j = new HashMap();
        this.k = -16777216;
        this.l = -16777216;
        this.f = 0;
        this.n = 0;
        this.o = false;
        this.p = new ArgbEvaluator();
    }

    public SCTitleWithIndicator(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9632d68ed418dc216ec490bf176f481", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9632d68ed418dc216ec490bf176f481");
            return;
        }
        this.e = new ArrayList();
        this.j = new HashMap();
        this.k = -16777216;
        this.l = -16777216;
        this.f = 0;
        this.n = 0;
        this.o = false;
        this.p = new ArgbEvaluator();
    }

    public SCTitleWithIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a09b3a507d6da255cd570f897bd0a233", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a09b3a507d6da255cd570f897bd0a233");
            return;
        }
        this.e = new ArrayList();
        this.j = new HashMap();
        this.k = -16777216;
        this.l = -16777216;
        this.f = 0;
        this.n = 0;
        this.o = false;
        this.p = new ArgbEvaluator();
    }

    @TargetApi(21)
    public SCTitleWithIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d98c2834341c65903a7d33cee2afcc2a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d98c2834341c65903a7d33cee2afcc2a");
            return;
        }
        this.e = new ArrayList();
        this.j = new HashMap();
        this.k = -16777216;
        this.l = -16777216;
        this.f = 0;
        this.n = 0;
        this.o = false;
        this.p = new ArgbEvaluator();
    }

    @Override // com.sankuai.waimai.store.drug.base.BaseCustomFrameLayout
    public final View a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78feda7be69afecebabd723d180c3d79", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78feda7be69afecebabd723d180c3d79");
        }
        this.h = (TabLayout) a(R.id.wm_sc_tablayout);
        this.h.a((TabLayout.a) this);
        this.i = (IndicateView) a(R.id.wm_drug_indicator);
        final IndicateView indicateView = this.i;
        TabLayout tabLayout = this.h;
        Object[] objArr2 = {tabLayout};
        ChangeQuickRedirect changeQuickRedirect2 = IndicateView.a;
        if (PatchProxy.isSupport(objArr2, indicateView, changeQuickRedirect2, false, "de25176ca77b935a93fea279a3a0d77b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, indicateView, changeQuickRedirect2, false, "de25176ca77b935a93fea279a3a0d77b");
        } else {
            indicateView.i = tabLayout;
            if (indicateView.i != null) {
                try {
                    indicateView.h = (LinearLayout) indicateView.i.getChildAt(0);
                    indicateView.f = (HorizontalScrollView) indicateView.h.getParent();
                    indicateView.f.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.store.drug.newwidgets.indicator.common.IndicateView.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            Object[] objArr3 = {view2, motionEvent};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7d290d1041e18fd2e5753defce75c3a4", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7d290d1041e18fd2e5753defce75c3a4")).booleanValue();
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
                    com.sankuai.shangou.stone.util.log.a.a(e);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35ba037b4fb1eabbe191a7b0b7f63562", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35ba037b4fb1eabbe191a7b0b7f63562");
        } else {
            this.h.setTabMode(!z ? 1 : 0);
        }
    }

    public void setIndicatorColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b13ad82f96f112ac0b424794c2e6535", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b13ad82f96f112ac0b424794c2e6535");
        } else {
            this.i.setColor(i);
        }
    }

    public void setupWithViewPager(@NonNull ViewPager viewPager) {
        Object[] objArr = {viewPager};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d96ec7d6d6c39522d2a834afaff1d1bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d96ec7d6d6c39522d2a834afaff1d1bd");
            return;
        }
        this.h.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(this);
        this.m = viewPager;
    }

    public void setTabData(List<a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6f709fcfa7c9841023f9051eb9c91e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6f709fcfa7c9841023f9051eb9c91e4");
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
        post(new Runnable() { // from class: com.sankuai.waimai.store.drug.newwidgets.indicator.SCTitleWithIndicator.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                View childAt;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "268e8937ec793c531c119c86d10a777c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "268e8937ec793c531c119c86d10a777c");
                    return;
                }
                IndicateView indicateView = SCTitleWithIndicator.this.i;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = IndicateView.a;
                if (PatchProxy.isSupport(objArr3, indicateView, changeQuickRedirect3, false, "7e610f80c7dc208ac86a48f3efb315ab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, indicateView, changeQuickRedirect3, false, "7e610f80c7dc208ac86a48f3efb315ab");
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

    public void setScTitleTabData(List<a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e04a83e6ca40ca2e0bd05372737da7de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e04a83e6ca40ca2e0bd05372737da7de");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "490fea2262ae96e311d72ae09e464ba5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "490fea2262ae96e311d72ae09e464ba5");
        } else {
            this.i.setCurrentPosition(i);
        }
    }

    public void setIndicatorHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c6dc8a7af68aa503b493211a0398037", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c6dc8a7af68aa503b493211a0398037");
        } else {
            this.i.setHeight(i);
        }
    }

    public void setIndicatorWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45b7fb388cfa49c3fd5df1e80e4acbba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45b7fb388cfa49c3fd5df1e80e4acbba");
        } else {
            this.i.setWidth(i);
        }
    }

    public final void a(int i, int i2) {
        this.k = i;
        this.l = i2;
    }

    @NonNull
    public TabLayout getTabLayout() {
        return this.h;
    }

    public int getInnerMeasureWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "253a71f31201389558ce398af0a9039d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "253a71f31201389558ce398af0a9039d")).intValue() : this.i.getInnerMeasureWidth();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba47d92d3ecd3782d449b86a1df98c7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba47d92d3ecd3782d449b86a1df98c7b");
            return;
        }
        IndicateView indicateView = this.i;
        Object[] objArr2 = {Byte.valueOf(this.o ? (byte) 1 : (byte) 0), Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = IndicateView.a;
        if (PatchProxy.isSupport(objArr2, indicateView, changeQuickRedirect2, false, "9f285d7eb4c9f608c774056ecca17be6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, indicateView, changeQuickRedirect2, false, "9f285d7eb4c9f608c774056ecca17be6");
            return;
        }
        Object[] objArr3 = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = IndicateView.a;
        if (PatchProxy.isSupport(objArr3, indicateView, changeQuickRedirect3, false, "d0d1f008b997312317dc2f4af95e5209", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, indicateView, changeQuickRedirect3, false, "d0d1f008b997312317dc2f4af95e5209");
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
            if (PatchProxy.isSupport(objArr4, indicateView, changeQuickRedirect4, false, "5471dcebec8a4799c5f02761c9c3cc6a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, indicateView, changeQuickRedirect4, false, "5471dcebec8a4799c5f02761c9c3cc6a");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f066f2f7547537d9933fbcbbe80b9700", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f066f2f7547537d9933fbcbbe80b9700");
            return;
        }
        if ((i == 0 || (this.n == 2 && i == 1)) && this.m != null && !this.o) {
            this.f = this.m.getCurrentItem();
            this.i.setCurrentPosition(this.f);
        }
        this.n = i;
        if (i == 0) {
            this.o = false;
        }
    }

    @Override // android.support.design.widget.TabLayout.a
    public final void a(TabLayout.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f7da5ea753e117b15e7d560548daf8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f7da5ea753e117b15e7d560548daf8b");
            return;
        }
        TextView textView = this.j.get(dVar);
        if (textView != null) {
            textView.setTextColor(this.l);
            textView.getPaint().setFakeBoldText(true);
        }
        if (Math.abs(this.f - dVar.e) > 1) {
            this.o = true;
            this.f = dVar.e;
            this.i.setCurrentPosition(this.f);
        } else {
            this.o = false;
        }
        a aVar = (a) com.sankuai.shangou.stone.util.a.a((List<Object>) this.e, dVar.e);
        if (aVar != null) {
            aVar.f = true;
        }
    }

    @Override // android.support.design.widget.TabLayout.a
    public final void b(TabLayout.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ccb0ee6baf446436d7e793b5fb38d0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ccb0ee6baf446436d7e793b5fb38d0d");
            return;
        }
        TextView textView = this.j.get(dVar);
        if (textView != null) {
            textView.setTextColor(this.k);
            textView.getPaint().setFakeBoldText(false);
        }
        a aVar = (a) com.sankuai.shangou.stone.util.a.a((List<Object>) this.e, dVar.e);
        if (aVar != null) {
            aVar.f = false;
        }
    }

    public TabLayout.d a(int i, TabLayout.d dVar, a aVar) {
        Object[] objArr = {Integer.valueOf(i), dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9891176128883e5eb14d13f2855022f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (TabLayout.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9891176128883e5eb14d13f2855022f5");
        }
        if (aVar != null && dVar != null) {
            dVar.a = Integer.valueOf(aVar.c);
            dVar.a(R.layout.wm_drug_tab_item_view);
            TextView textView = (TextView) dVar.f.findViewById(R.id.tab_item_text);
            if (textView != null) {
                textView.setText(aVar.d);
                this.j.put(dVar, textView);
                if (this.m != null) {
                    if (i == this.m.getCurrentItem()) {
                        textView.setTextColor(this.l);
                    } else {
                        textView.setTextColor(this.k);
                    }
                }
            }
        }
        return dVar;
    }

    @Override // com.sankuai.waimai.store.drug.newwidgets.indicator.common.IndicateView.a
    public final void a(float f, int i, int i2) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c74c5a25608c16aabc3f83fa4f383e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c74c5a25608c16aabc3f83fa4f383e2");
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
        int intValue = ((Integer) this.p.evaluate(f, Integer.valueOf(this.l), Integer.valueOf(this.k))).intValue();
        int intValue2 = ((Integer) this.p.evaluate(f, Integer.valueOf(this.k), Integer.valueOf(this.l))).intValue();
        textView.setTextColor(intValue);
        textView2.setTextColor(intValue2);
    }
}
