package com.sankuai.waimai.store.mach.page.widget;

import android.content.Context;
import android.os.Build;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NestedScrollLayout extends NestedScrollView {
    public static ChangeQuickRedirect a;
    public ViewGroup b;
    public ViewGroup c;
    public int d;
    public a e;
    public int f;

    public static /* synthetic */ void a(NestedScrollLayout nestedScrollLayout) {
        double exp;
        RecyclerView a2;
        int abs;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, nestedScrollLayout, changeQuickRedirect, false, "96af6904894d1daa79b4819d66ddc7cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, nestedScrollLayout, changeQuickRedirect, false, "96af6904894d1daa79b4819d66ddc7cb");
            return;
        }
        if (nestedScrollLayout.d != 0) {
            a aVar = nestedScrollLayout.e;
            int i = nestedScrollLayout.d;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "a19c050cc6ee94b016341575fedec747", RobustBitConfig.DEFAULT_VALUE)) {
                exp = ((Double) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "a19c050cc6ee94b016341575fedec747")).doubleValue();
            } else {
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                exp = Math.exp((PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "8885ee825bb63391b1e36802ccea4082", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "8885ee825bb63391b1e36802ccea4082")).doubleValue() : Math.log((Math.abs(i) * 0.35f) / (a.c * a.d))) * (a.b / (a.b - 1.0d))) * a.c * a.d;
            }
            if (exp > nestedScrollLayout.f && (a2 = nestedScrollLayout.a(nestedScrollLayout.c)) != null) {
                a aVar2 = nestedScrollLayout.e;
                double d = exp - nestedScrollLayout.f;
                Object[] objArr4 = {Double.valueOf(d)};
                ChangeQuickRedirect changeQuickRedirect4 = a.a;
                if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "407408f57b87d2c6e790ae4bd17584fd", RobustBitConfig.DEFAULT_VALUE)) {
                    abs = ((Integer) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "407408f57b87d2c6e790ae4bd17584fd")).intValue();
                } else {
                    Object[] objArr5 = {Double.valueOf(d)};
                    ChangeQuickRedirect changeQuickRedirect5 = a.a;
                    abs = Math.abs((int) (((Math.exp(PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "027c0549e88109d988ac784c82811579", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "027c0549e88109d988ac784c82811579")).doubleValue() : ((a.b - 1.0d) * Math.log(d / (a.c * a.d))) / a.b) * a.c) * a.d) / 0.3499999940395355d));
                }
                a2.fling(0, abs);
            }
        }
        nestedScrollLayout.f = 0;
        nestedScrollLayout.d = 0;
    }

    public NestedScrollLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e14d3c3f6ae650067b15ee07f64bcff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e14d3c3f6ae650067b15ee07f64bcff");
        }
    }

    public NestedScrollLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "725c44c8ebfdb3f81b7820408542c280", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "725c44c8ebfdb3f81b7820408542c280");
        }
    }

    public NestedScrollLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c99731921bc0f283ae9037f811320633", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c99731921bc0f283ae9037f811320633");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d57cabbf0ce4ff494406ba352cb45d82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d57cabbf0ce4ff494406ba352cb45d82");
            return;
        }
        this.e = new a(getContext());
        if (Build.VERSION.SDK_INT >= 23) {
            setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.sankuai.waimai.store.mach.page.widget.NestedScrollLayout.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i2, int i3, int i4, int i5) {
                    Object[] objArr3 = {view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "13d0ab46d49279f79b485a9eff1b5cb9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "13d0ab46d49279f79b485a9eff1b5cb9");
                        return;
                    }
                    if (i3 == NestedScrollLayout.this.getChildAt(0).getMeasuredHeight() - view.getMeasuredHeight()) {
                        NestedScrollLayout.a(NestedScrollLayout.this);
                    }
                    NestedScrollLayout.this.f += i3 - i5;
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "578c9b2c3d70bf4484d2eff1871bf89c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "578c9b2c3d70bf4484d2eff1871bf89c");
            return;
        }
        super.onFinishInflate();
        if (getChildAt(0) == null || !(getChildAt(0) instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getChildAt(0);
        if (viewGroup.getChildAt(0) != null && (viewGroup.getChildAt(0) instanceof ViewGroup)) {
            this.b = (ViewGroup) viewGroup.getChildAt(0);
        }
        if (viewGroup.getChildAt(1) == null || !(viewGroup.getChildAt(1) instanceof ViewGroup)) {
            return;
        }
        this.c = (ViewGroup) viewGroup.getChildAt(1);
    }

    @Override // android.support.v4.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c802f35ebd099ac76b5b4f97f72a1f20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c802f35ebd099ac76b5b4f97f72a1f20");
            return;
        }
        super.onMeasure(i, i2);
        if (this.c != null) {
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            layoutParams.height = getMeasuredHeight();
            this.c.setLayoutParams(layoutParams);
        }
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0856f98de079a217ab202ed3dff6ae55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0856f98de079a217ab202ed3dff6ae55");
        } else if (this.b != null) {
            if (i2 > 0 && getScrollY() < this.b.getMeasuredHeight()) {
                scrollBy(0, i2);
                iArr[1] = i2;
            }
        }
    }

    @Override // android.support.v4.widget.NestedScrollView
    public void fling(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20919f1480f9d1ca5d34573467faa53b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20919f1480f9d1ca5d34573467faa53b");
            return;
        }
        super.fling(i);
        if (i <= 0) {
            this.d = 0;
        } else {
            this.d = i;
        }
    }

    private RecyclerView a(ViewGroup viewGroup) {
        RecyclerView a2;
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "805247242f57098dcb4c640ad7de5640", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "805247242f57098dcb4c640ad7de5640");
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) childAt;
                if (((RecyclerView.LayoutManager) Objects.requireNonNull(recyclerView.getLayoutManager())).canScrollVertically()) {
                    return recyclerView;
                }
            }
            if ((viewGroup.getChildAt(i) instanceof ViewGroup) && (a2 = a((ViewGroup) viewGroup.getChildAt(i))) != null && ((RecyclerView.LayoutManager) Objects.requireNonNull(a2.getLayoutManager())).canScrollVertically()) {
                return a2;
            }
        }
        return null;
    }
}
