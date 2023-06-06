package com.sankuai.waimai.business.page.common.widget.tablayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.util.Pools;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PointerIconCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v7.app.ActionBar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
@ViewPager.DecorView
/* loaded from: classes4.dex */
public class CustomTabLayout extends HorizontalScrollView implements com.sankuai.waimai.rocks.page.tablist.tab.a {
    public static ChangeQuickRedirect a;
    public static final Interpolator b = new FastOutSlowInInterpolator();
    private static final Pools.Pool<e> r = new Pools.SynchronizedPool(16);
    private int A;
    private boolean B;
    private boolean C;
    private b D;
    private final ArrayList<b> E;
    private b F;
    private ValueAnimator G;
    private PagerAdapter H;
    private DataSetObserver I;
    private TabLayoutOnPageChangeListener J;
    private a K;
    private boolean L;
    private f M;
    private final Pools.Pool<g> N;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public ColorStateList l;
    public final int m;
    public int n;
    public int o;
    public int p;
    public ViewPager q;
    private final ArrayList<e> s;
    private e t;
    private final d u;
    private final int v;
    private final int w;
    private final int x;
    private int y;
    private int z;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface Mode {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface TabGravity {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface TabSelectedType {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(e eVar, boolean z, int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface f {
    }

    private int getDefaultHeight() {
        return 48;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b636e6e3ab0afa77def6b2f30605b9df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b636e6e3ab0afa77def6b2f30605b9df");
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cca7ee8c16f0bf24c64cd57108a8e62f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cca7ee8c16f0bf24c64cd57108a8e62f");
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0102536d092cfc2bcb14e3b57ee699d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0102536d092cfc2bcb14e3b57ee699d0");
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c11dfce21a7720b831e2d1599b90f469", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c11dfce21a7720b831e2d1599b90f469");
        }
    }

    @Override // com.sankuai.waimai.rocks.page.tablist.tab.a
    public View getTabLayout() {
        return this;
    }

    public static /* synthetic */ void a(CustomTabLayout customTabLayout, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, customTabLayout, changeQuickRedirect, false, "0a49d3dd1b91d1299fde40730e7c7fef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, customTabLayout, changeQuickRedirect, false, "0a49d3dd1b91d1299fde40730e7c7fef");
        }
    }

    public CustomTabLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "090b8b50066cef694a74374ce170ba9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "090b8b50066cef694a74374ce170ba9c");
        }
    }

    public CustomTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09a8ff01aca267a316b674e137e13b9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09a8ff01aca267a316b674e137e13b9f");
        }
    }

    @SuppressLint({"PrivateResource"})
    public CustomTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f253896c4291f03bae170980ae1214e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f253896c4291f03bae170980ae1214e4");
            return;
        }
        this.s = new ArrayList<>();
        this.n = 0;
        this.B = false;
        this.C = false;
        this.E = new ArrayList<>();
        this.N = new Pools.SimplePool(12);
        this.n = com.sankuai.waimai.foundation.utils.g.a(context);
        com.sankuai.waimai.business.page.common.widget.tablayout.b.a(context);
        setHorizontalScrollBarEnabled(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.customIndicatorColor, R.attr.customIndicatorHeight, R.attr.customIndicatorWidth, R.attr.customTabContentStart, R.attr.customTabBackground, R.attr.customTabViewLayoutResId, R.attr.customTabMode, R.attr.customTabGravity, R.attr.customTabMinWidth, R.attr.customTabMaxWidth, R.attr.customTabTextColor, R.attr.customTabSelectedTextColor, R.attr.customTabPaddingStart, R.attr.customTabPaddingTop, R.attr.customTabPaddingEnd, R.attr.customTabPaddingBottom, R.attr.customTabPadding, R.attr.customTabSpacing, R.attr.customIndicatorTopMargin, R.attr.autoHideIndicator, R.attr.specialStyleIndicatorBg}, i, 2131558401);
        this.i = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.j = obtainStyledAttributes.getDimensionPixelSize(2, b(30));
        this.k = obtainStyledAttributes.getColor(0, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(18, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(16, 0);
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.d = dimensionPixelSize;
        this.c = dimensionPixelSize;
        this.c = obtainStyledAttributes.getDimensionPixelSize(12, this.c);
        this.d = obtainStyledAttributes.getDimensionPixelSize(13, this.d);
        this.e = obtainStyledAttributes.getDimensionPixelSize(14, this.e);
        this.f = obtainStyledAttributes.getDimensionPixelSize(15, this.f);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(17, this.g);
        if (obtainStyledAttributes.hasValue(10)) {
            this.l = obtainStyledAttributes.getColorStateList(10);
        }
        if (obtainStyledAttributes.hasValue(11)) {
            int color = obtainStyledAttributes.getColor(11, 0);
            int defaultColor = this.l.getDefaultColor();
            Object[] objArr2 = {Integer.valueOf(defaultColor), Integer.valueOf(color)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            this.l = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d961de3ba3ff35ca2e019e4fac361431", RobustBitConfig.DEFAULT_VALUE) ? (ColorStateList) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d961de3ba3ff35ca2e019e4fac361431") : new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{color, defaultColor});
        }
        this.v = obtainStyledAttributes.getDimensionPixelSize(8, -1);
        this.w = obtainStyledAttributes.getDimensionPixelSize(9, -1);
        this.m = obtainStyledAttributes.getResourceId(4, 0);
        this.y = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.p = obtainStyledAttributes.getInt(6, 1);
        this.o = obtainStyledAttributes.getInt(7, 0);
        this.z = obtainStyledAttributes.getResourceId(5, 0);
        this.B = obtainStyledAttributes.getBoolean(20, false);
        this.C = obtainStyledAttributes.getBoolean(19, false);
        obtainStyledAttributes.recycle();
        this.x = getResources().getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
        this.u = new d(context);
        super.addView(this.u, 0, new FrameLayout.LayoutParams(-2, -1));
        d dVar = this.u;
        int i2 = this.i;
        Object[] objArr3 = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "01e947bc3913a305d486de33174d1046", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "01e947bc3913a305d486de33174d1046");
        } else if (dVar.b != i2) {
            dVar.b = i2;
            ViewCompat.postInvalidateOnAnimation(dVar);
        }
        d dVar2 = this.u;
        int i3 = this.j;
        Object[] objArr4 = {Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect4 = d.a;
        if (PatchProxy.isSupport(objArr4, dVar2, changeQuickRedirect4, false, "ad4b7a35fa8a1f657363bb7154a76e05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, dVar2, changeQuickRedirect4, false, "ad4b7a35fa8a1f657363bb7154a76e05");
        } else if (dVar2.c != i3) {
            dVar2.c = i3;
            ViewCompat.postInvalidateOnAnimation(dVar2);
        }
        d dVar3 = this.u;
        int i4 = this.k;
        Object[] objArr5 = {Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect5 = d.a;
        if (PatchProxy.isSupport(objArr5, dVar3, changeQuickRedirect5, false, "05ac206b98ed550358e7ce201bfa27f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, dVar3, changeQuickRedirect5, false, "05ac206b98ed550358e7ce201bfa27f3");
        } else if (dVar3.d.getColor() != i4) {
            dVar3.d.setColor(i4);
            ViewCompat.postInvalidateOnAnimation(dVar3);
        }
        if (this.g > 0) {
            c();
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "fab7b32f6e48eb5222267bd14c3a50d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "fab7b32f6e48eb5222267bd14c3a50d8");
            return;
        }
        ViewCompat.setPaddingRelative(this.u, this.p == 0 ? Math.max(0, this.y - this.c) : 0, 0, 0, 0);
        switch (this.p) {
            case 0:
                this.u.setGravity(GravityCompat.START);
                break;
            case 1:
                this.u.setGravity(1);
                break;
        }
        a(true);
    }

    public void setTabSpacing(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dbcc0d6d9090e6781ba0b3eb10bab6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dbcc0d6d9090e6781ba0b3eb10bab6a");
            return;
        }
        this.g = i;
        c();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d6f4b68d27ef8a4831b5651ddb748d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d6f4b68d27ef8a4831b5651ddb748d2");
            return;
        }
        this.u.setShowDividers(2);
        com.sankuai.waimai.business.page.common.widget.tablayout.a aVar = new com.sankuai.waimai.business.page.common.widget.tablayout.a(getContext());
        aVar.a(this.g, 0);
        aVar.a(0);
        this.u.setDividerDrawable(aVar);
    }

    private void a(int i, float f2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(0.0f), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91435da7a34347148c43e2b1ec6377b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91435da7a34347148c43e2b1ec6377b8");
        } else {
            a(i, 0.0f, true, true);
        }
    }

    public final void a(int i, float f2, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3ba7265d0315b5ae9398dfb65d103f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3ba7265d0315b5ae9398dfb65d103f1");
            return;
        }
        int round = Math.round(i + f2);
        if (round < 0 || round >= this.u.getChildCount()) {
            return;
        }
        if (z2) {
            this.u.a(i, f2);
        }
        if (this.G != null && this.G.isRunning()) {
            this.G.cancel();
        }
        scrollTo(a(i, f2), 0);
        if (z) {
            setSelectedTabView(round);
        }
    }

    public final void a(@NonNull e eVar, boolean z) {
        LinearLayout.LayoutParams layoutParams;
        int i;
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d913d04bc7d1b3424a2e1aa141290cc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d913d04bc7d1b3424a2e1aa141290cc6");
            return;
        }
        int size = this.s.size();
        Object[] objArr2 = {eVar, Integer.valueOf(size), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c95291726f357d2930ae8fc3c348cad5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c95291726f357d2930ae8fc3c348cad5");
        } else if (eVar.d != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        } else {
            a(eVar, size);
            Object[] objArr3 = {eVar};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4ba9d4714817301c2e42da63ffd133c9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4ba9d4714817301c2e42da63ffd133c9");
                i = -1;
            } else {
                g gVar = eVar.e;
                d dVar = this.u;
                int i2 = eVar.c;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c67ab95fbf5e626babb555af77713cdd", RobustBitConfig.DEFAULT_VALUE)) {
                    layoutParams = (LinearLayout.LayoutParams) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c67ab95fbf5e626babb555af77713cdd");
                    i = -1;
                } else {
                    i = -1;
                    layoutParams = new LinearLayout.LayoutParams(-2, -1);
                    a(layoutParams);
                }
                dVar.addView(gVar, i2, layoutParams);
            }
            if (z) {
                eVar.a(false, i);
            }
        }
    }

    public void setScrollStateChangeListener(f fVar) {
        this.M = fVar;
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cb0c92bb0875b07acbe3d8291dfa8ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cb0c92bb0875b07acbe3d8291dfa8ad");
            return;
        }
        if (this.D != null) {
            b(this.D);
        }
        this.D = bVar;
        if (bVar != null) {
            a(bVar);
        }
    }

    public final void a(@NonNull b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af5af4f68f24d3e2d6e036ff311d2e77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af5af4f68f24d3e2d6e036ff311d2e77");
        } else if (this.E.contains(bVar)) {
        } else {
            this.E.add(bVar);
        }
    }

    private void b(@NonNull b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e017a1b0fb93ccc605bd799f456aceb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e017a1b0fb93ccc605bd799f456aceb");
        } else {
            this.E.remove(bVar);
        }
    }

    @NonNull
    public final e a() {
        g gVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffba40cb6c5d551a02247f7d3e32f322", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffba40cb6c5d551a02247f7d3e32f322");
        }
        e acquire = r.acquire();
        if (acquire == null) {
            acquire = new e();
        }
        acquire.d = this;
        Object[] objArr2 = {acquire};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98723c2c2aeab7cf760dba75e99213ff", RobustBitConfig.DEFAULT_VALUE)) {
            gVar = (g) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98723c2c2aeab7cf760dba75e99213ff");
        } else {
            g acquire2 = this.N != null ? this.N.acquire() : null;
            if (acquire2 == null) {
                acquire2 = new g(getContext());
            }
            if (acquire2.d == null) {
                acquire2.d = LayoutInflater.from(getContext()).inflate(this.z, (ViewGroup) acquire.e, false);
            }
            acquire2.setTab(acquire);
            acquire2.setFocusable(true);
            acquire2.setMinimumWidth(getTabMinWidth());
            gVar = acquire2;
        }
        acquire.e = gVar;
        return acquire;
    }

    @Override // com.sankuai.waimai.rocks.page.tablist.tab.a
    public ViewPager.OnPageChangeListener getViewPagerChangeListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "941c2f165c1e3f253530ac1b6d8e9223", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewPager.OnPageChangeListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "941c2f165c1e3f253530ac1b6d8e9223");
        }
        if (this.J == null) {
            this.J = new TabLayoutOnPageChangeListener(this);
        }
        this.J.a();
        return this.J;
    }

    @Override // com.sankuai.waimai.rocks.page.tablist.tab.a
    public int getTabCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1568a247e6034cae784571f9659d9641", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1568a247e6034cae784571f9659d9641")).intValue();
        }
        if (this.s == null) {
            return 0;
        }
        return this.s.size();
    }

    @Nullable
    public final e a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10c64d1b87d7bc4b249e9c2e9a9a1ea5", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10c64d1b87d7bc4b249e9c2e9a9a1ea5");
        }
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.s.get(i);
    }

    public int getSelectedTabPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35ed2bc7cc7ac2edd6ce43be70d41594", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35ed2bc7cc7ac2edd6ce43be70d41594")).intValue();
        }
        if (this.t != null) {
            return this.t.c;
        }
        return -1;
    }

    public void setTabTitleResId(@IdRes int i) {
        this.A = i;
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        Object[] objArr = {viewPager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11ba65fc11950e3e70169f77f8a09caf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11ba65fc11950e3e70169f77f8a09caf");
            return;
        }
        Object[] objArr2 = {viewPager, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7fe6ad12ac71beebce210ab9c65813a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7fe6ad12ac71beebce210ab9c65813a");
        } else {
            a(viewPager, true, false);
        }
    }

    private void a(@Nullable ViewPager viewPager, boolean z, boolean z2) {
        Object[] objArr = {viewPager, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74c7650f451533fc87d1bbc60cd4e8aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74c7650f451533fc87d1bbc60cd4e8aa");
            return;
        }
        if (this.q != null) {
            if (this.J != null) {
                this.q.removeOnPageChangeListener(this.J);
            }
            if (this.K != null) {
                this.q.removeOnAdapterChangeListener(this.K);
            }
        }
        if (this.F != null) {
            b(this.F);
            this.F = null;
        }
        if (viewPager != null) {
            this.q = viewPager;
            if (this.J == null) {
                this.J = new TabLayoutOnPageChangeListener(this);
            }
            this.J.a();
            viewPager.addOnPageChangeListener(this.J);
            this.F = new h(viewPager);
            a(this.F);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                a(adapter, z);
            }
            if (this.K == null) {
                this.K = new a();
            }
            this.K.b = z;
            viewPager.addOnAdapterChangeListener(this.K);
            a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.q = null;
            a((PagerAdapter) null, false);
        }
        this.L = z2;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        Object[] objArr = {pagerAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "700a8a5959983259d3dc7f068ed00830", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "700a8a5959983259d3dc7f068ed00830");
        } else {
            a(pagerAdapter, false);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6be3c200aa623368f9412839b14b797c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6be3c200aa623368f9412839b14b797c")).booleanValue() : getTabScrollRange() > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bd5d27451d630b9b32ff349e1934d72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bd5d27451d630b9b32ff349e1934d72");
            return;
        }
        super.onAttachedToWindow();
        if (this.q == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                a((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "322018283efddcfd148da8d06504585e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "322018283efddcfd148da8d06504585e");
            return;
        }
        super.onDetachedFromWindow();
        if (this.L) {
            setupWithViewPager(null);
            this.L = false;
        }
    }

    private int getTabScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65a11276b6443a1dc77958d3b60df72f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65a11276b6443a1dc77958d3b60df72f")).intValue() : Math.max(0, ((this.u.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public final void a(@Nullable PagerAdapter pagerAdapter, boolean z) {
        Object[] objArr = {pagerAdapter, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "021acc8142a5edb2e4d8fdd07fe1b5ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "021acc8142a5edb2e4d8fdd07fe1b5ee");
            return;
        }
        if (this.H != null && this.I != null) {
            this.H.unregisterDataSetObserver(this.I);
        }
        this.H = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.I == null) {
                this.I = new c();
            }
            pagerAdapter.registerDataSetObserver(this.I);
        }
        b();
    }

    public final void b() {
        int currentItem;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8965df156606c37c9cd604122deb4c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8965df156606c37c9cd604122deb4c2");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a24706b15e078562fc6f12f565fcd75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a24706b15e078562fc6f12f565fcd75");
        } else {
            for (int childCount = this.u.getChildCount() - 1; childCount >= 0; childCount--) {
                Object[] objArr3 = {Integer.valueOf(childCount)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e678a6bd213ab559dc79b77e97bde885", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e678a6bd213ab559dc79b77e97bde885");
                } else {
                    g gVar = (g) this.u.getChildAt(childCount);
                    this.u.removeViewAt(childCount);
                    if (gVar != null) {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = g.a;
                        if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "d2f4bbed800465172a0f64525b60990b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "d2f4bbed800465172a0f64525b60990b");
                        } else {
                            gVar.setTab(null);
                            gVar.setSelected(false);
                        }
                        this.N.release(gVar);
                    }
                    requestLayout();
                }
            }
            Iterator<e> it = this.s.iterator();
            while (it.hasNext()) {
                e next = it.next();
                it.remove();
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = e.a;
                if (PatchProxy.isSupport(objArr5, next, changeQuickRedirect5, false, "dffd4530df7bc4480d3a1e26a7764081", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, next, changeQuickRedirect5, false, "dffd4530df7bc4480d3a1e26a7764081");
                } else {
                    next.d = null;
                    next.e = null;
                    next.b = null;
                    next.c = -1;
                }
                r.release(next);
            }
            this.t = null;
        }
        if (this.H != null) {
            int count = this.H.getCount();
            for (int i = 0; i < count; i++) {
                a(a(), false);
            }
            if (this.q == null || count <= 0 || (currentItem = this.q.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            a(a(currentItem), false, -1);
        }
    }

    private void a(LinearLayout.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e30b155ff402d95cbe16150973ef4271", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e30b155ff402d95cbe16150973ef4271");
        } else if (this.p == 1 && this.o == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    public final int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf9625981adadc947127ca2d20a6958b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf9625981adadc947127ca2d20a6958b")).intValue() : com.sankuai.waimai.foundation.utils.g.a(getContext(), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
        if (r13.getMeasuredWidth() != getMeasuredWidth()) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
        if (r13.getMeasuredWidth() < getMeasuredWidth()) goto L23;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r13, int r14) {
        /*
            r12 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r8 = 0
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.business.page.common.widget.tablayout.CustomTabLayout.a
            java.lang.String r11 = "30c7d172f673e9c6caedb8d3b48f8562"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
            return
        L26:
            int r0 = r12.getDefaultHeight()
            int r0 = r12.b(r0)
            int r1 = r12.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r12.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = android.view.View.MeasureSpec.getMode(r14)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L4a
            if (r1 == 0) goto L45
            goto L56
        L45:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L56
        L4a:
            int r14 = android.view.View.MeasureSpec.getSize(r14)
            int r14 = java.lang.Math.min(r0, r14)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r3)
        L56:
            int r0 = android.view.View.MeasureSpec.getSize(r13)
            int r1 = android.view.View.MeasureSpec.getMode(r13)
            if (r1 == 0) goto L70
            int r1 = r12.w
            if (r1 <= 0) goto L67
            int r0 = r12.w
            goto L6e
        L67:
            r1 = 56
            int r1 = r12.b(r1)
            int r0 = r0 - r1
        L6e:
            r12.n = r0
        L70:
            super.onMeasure(r13, r14)
            int r13 = r12.getChildCount()
            if (r13 != r9) goto Lba
            android.view.View r13 = r12.getChildAt(r8)
            int r0 = r12.p
            switch(r0) {
                case 0: goto L8f;
                case 1: goto L83;
                default: goto L82;
            }
        L82:
            goto L9a
        L83:
            int r0 = r13.getMeasuredWidth()
            int r1 = r12.getMeasuredWidth()
            if (r0 == r1) goto L9a
        L8d:
            r8 = 1
            goto L9a
        L8f:
            int r0 = r13.getMeasuredWidth()
            int r1 = r12.getMeasuredWidth()
            if (r0 >= r1) goto L9a
            goto L8d
        L9a:
            if (r8 == 0) goto Lba
            int r0 = r12.getPaddingTop()
            int r1 = r12.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            int r1 = r1.height
            int r14 = getChildMeasureSpec(r14, r0, r1)
            int r0 = r12.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r13.measure(r0, r14)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.common.widget.tablayout.CustomTabLayout.onMeasure(int, int):void");
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baf6c6f6afd3d63b3dc4e9523537846a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baf6c6f6afd3d63b3dc4e9523537846a");
        } else if (i == -1) {
        } else {
            if (getWindowToken() == null || !ViewCompat.isLaidOut(this) || this.u.a()) {
                a(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int a2 = a(i, 0.0f);
            if (scrollX != a2) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e82681094757075d3e22845f22703aa7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e82681094757075d3e22845f22703aa7");
                } else if (this.G == null) {
                    this.G = new ValueAnimator();
                    this.G.setInterpolator(b);
                    this.G.setDuration(300L);
                    this.G.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.business.page.common.widget.tablayout.CustomTabLayout.1
                        public static ChangeQuickRedirect a;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Object[] objArr3 = {valueAnimator};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "39816e99103c34d9a4180a537c80617b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "39816e99103c34d9a4180a537c80617b");
                            } else {
                                CustomTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                            }
                        }
                    });
                }
                this.G.setIntValues(scrollX, a2);
                this.G.start();
            }
            this.u.b(i, 300);
        }
    }

    private void setSelectedTabView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5decb8dae479a1abcaa1a22c9d600b6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5decb8dae479a1abcaa1a22c9d600b6d");
            return;
        }
        int childCount = this.u.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                this.u.getChildAt(i2).setSelected(i2 == i);
                i2++;
            }
        }
    }

    public final void a(e eVar, boolean z, int i) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b9fe9aa88af9d14ec9e75c307c690ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b9fe9aa88af9d14ec9e75c307c690ce");
        } else {
            a(eVar, true, z, i);
        }
    }

    public final void a(e eVar, boolean z, boolean z2, int i) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6660656ecb8ff47c77986bdbf53051b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6660656ecb8ff47c77986bdbf53051b");
            return;
        }
        e eVar2 = this.t;
        if (eVar2 == eVar) {
            if (eVar2 != null) {
                d(eVar, z2, i);
                c(eVar.c);
                return;
            }
            return;
        }
        int i2 = eVar != null ? eVar.c : -1;
        if (z) {
            if ((eVar2 == null || eVar2.c == -1) && i2 != -1) {
                a(i2, 0.0f, true);
            } else {
                c(i2);
            }
            if (i2 != -1) {
                setSelectedTabView(i2);
            }
        }
        if (eVar2 != null) {
            c(eVar2, z2, i);
        }
        this.t = eVar;
        if (eVar != null) {
            b(eVar, z2, i);
        }
    }

    private void b(@NonNull e eVar, boolean z, int i) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e0529c5d10c68db8f7ed5609452000f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e0529c5d10c68db8f7ed5609452000f");
            return;
        }
        for (int size = this.E.size() - 1; size >= 0; size--) {
            this.E.get(size).a(eVar, z, i);
        }
    }

    private void c(@NonNull e eVar, boolean z, int i) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4088aa795f7d3cbe189967c6ba2a3105", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4088aa795f7d3cbe189967c6ba2a3105");
            return;
        }
        for (int size = this.E.size() - 1; size >= 0; size--) {
            this.E.get(size);
        }
    }

    private void d(@NonNull e eVar, boolean z, int i) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27da571b5a3bd47372010e7e45238f90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27da571b5a3bd47372010e7e45238f90");
            return;
        }
        for (int size = this.E.size() - 1; size >= 0; size--) {
            this.E.get(size);
        }
    }

    private int a(int i, float f2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15cc7b978536cd88bf7b0f72e2f76bce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15cc7b978536cd88bf7b0f72e2f76bce")).intValue();
        }
        if (this.p == 0) {
            View childAt = this.u.getChildAt(i);
            int i2 = i + 1;
            View childAt2 = i2 < this.u.getChildCount() ? this.u.getChildAt(i2) : null;
            int width = childAt != null ? childAt.getWidth() : 0;
            int width2 = childAt2 != null ? childAt2.getWidth() : 0;
            int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
            int i3 = (int) ((width + width2) * 0.5f * f2);
            return ViewCompat.getLayoutDirection(this) == 0 ? left + i3 : left - i3;
        }
        return 0;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03a9e3cdbc28fe4d681e2824a1c52013", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03a9e3cdbc28fe4d681e2824a1c52013");
            return;
        }
        for (int i = 0; i < this.u.getChildCount(); i++) {
            View childAt = this.u.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class e {
        public static ChangeQuickRedirect a;
        Object b;
        public int c;
        public CustomTabLayout d;
        public g e;

        public e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8112cfc47479de897c825d9c6c48252", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8112cfc47479de897c825d9c6c48252");
            } else {
                this.c = -1;
            }
        }

        public final void a(boolean z, int i) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "534b98ce23b6f9604720fb86cad7f46b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "534b98ce23b6f9604720fb86cad7f46b");
            } else if (this.d == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else {
                this.d.a(this, z, i);
            }
        }

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c239eb1feef810b421d10eaededd73e", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c239eb1feef810b421d10eaededd73e")).booleanValue();
            }
            if (this.d != null) {
                return this.d.getSelectedTabPosition() == this.c;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class g extends LinearLayout {
        public static ChangeQuickRedirect a;
        private e c;
        private View d;
        private TextView e;

        public g(Context context) {
            super(context);
            Object[] objArr = {CustomTabLayout.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "379f1943fc4a06748a653c24b51c4f1b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "379f1943fc4a06748a653c24b51c4f1b");
                return;
            }
            if (CustomTabLayout.this.m != 0) {
                ViewCompat.setBackground(this, android.support.v7.content.res.b.b(context, CustomTabLayout.this.m));
            }
            ViewCompat.setPaddingRelative(this, CustomTabLayout.this.c, CustomTabLayout.this.d, CustomTabLayout.this.e, CustomTabLayout.this.f);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        }

        @Override // android.view.View
        public final boolean performClick() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dde531f71e7d2e0f3facedeaa3fcd4c8", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dde531f71e7d2e0f3facedeaa3fcd4c8")).booleanValue();
            }
            boolean performClick = super.performClick();
            if (this.c != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.c.a(true, 0);
                return true;
            }
            return performClick;
        }

        @Override // android.view.View
        @SuppressLint({"ObsoleteSdkInt"})
        public final void setSelected(boolean z) {
            boolean z2 = true;
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15e53f2f8c76f17efd11c53ebb00b3f1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15e53f2f8c76f17efd11c53ebb00b3f1");
                return;
            }
            boolean z3 = isSelected() != z;
            super.setSelected(z);
            if (z3 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            if (this.e != null) {
                this.e.setSelected((!z || CustomTabLayout.this.getTabCount() <= 1) ? false : false);
            }
            if (this.d != null) {
                this.d.setSelected(z);
            }
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            Object[] objArr = {accessibilityEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "190068781cb4b8b414654100416a307d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "190068781cb4b8b414654100416a307d");
                return;
            }
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.b.class.getName());
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            Object[] objArr = {accessibilityNodeInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96f926ab7839be875f75d2db6477fd98", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96f926ab7839be875f75d2db6477fd98");
                return;
            }
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ActionBar.b.class.getName());
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd0526b1379e1825015af8b9016e5a56", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd0526b1379e1825015af8b9016e5a56");
                return;
            }
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = CustomTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(CustomTabLayout.this.n, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
        }

        public final void setTab(@Nullable e eVar) {
            Object[] objArr = {eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eb19b30049431377ba2e9e6dae457e6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eb19b30049431377ba2e9e6dae457e6");
            } else if (eVar != this.c) {
                this.c = eVar;
                a();
            }
        }

        private void a() {
            boolean z = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62a4a6cb7edc22f8ee55f081718181a4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62a4a6cb7edc22f8ee55f081718181a4");
                return;
            }
            e eVar = this.c;
            if (this.d != null) {
                ViewParent parent = this.d.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(this.d);
                    }
                    addView(this.d);
                }
                View findViewById = this.d.findViewById(CustomTabLayout.this.A);
                if (findViewById instanceof TextView) {
                    this.e = (TextView) findViewById;
                }
                if (this.e != null && CustomTabLayout.this.l != null) {
                    this.e.setTextColor(CustomTabLayout.this.l);
                }
            }
            if (eVar != null && eVar.a()) {
                z = true;
            }
            setSelected(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class d extends LinearLayout {
        public static ChangeQuickRedirect a;
        int b;
        int c;
        final Paint d;
        public int e;
        public float f;
        private int h;
        private int i;
        private int j;
        private ValueAnimator k;

        public d(Context context) {
            super(context);
            Object[] objArr = {CustomTabLayout.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33ec2d63054c3ab7b342a45d9b37e4ae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33ec2d63054c3ab7b342a45d9b37e4ae");
                return;
            }
            this.e = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            setWillNotDraw(false);
            this.d = new Paint();
        }

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "190befa32dd8ca7438b3e525154bf6c8", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "190befa32dd8ca7438b3e525154bf6c8")).booleanValue();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public final void a(int i, float f) {
            Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "158d720f4c73ac5811abf8563d6194d2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "158d720f4c73ac5811abf8563d6194d2");
                return;
            }
            if (this.k != null && this.k.isRunning()) {
                this.k.cancel();
            }
            this.e = i;
            this.f = f;
            b();
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onRtlPropertiesChanged(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c769c64042c950f5da4721e14b0b140", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c769c64042c950f5da4721e14b0b140");
                return;
            }
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT >= 23 || this.h == i) {
                return;
            }
            requestLayout();
            this.h = i;
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            boolean z;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a4f30f1e2eb3011905fa321f5395433", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a4f30f1e2eb3011905fa321f5395433");
                return;
            }
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824 && CustomTabLayout.this.p == 1 && CustomTabLayout.this.o == 1) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 <= 0) {
                    return;
                }
                if (i3 * childCount <= getMeasuredWidth() - (CustomTabLayout.this.b(16) * 2)) {
                    z = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i3;
                            layoutParams.weight = 0.0f;
                            z = true;
                        }
                    }
                } else {
                    CustomTabLayout.this.o = 0;
                    CustomTabLayout.this.a(false);
                    z = true;
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8c1e5149036b1d7e5625c1640396bd4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8c1e5149036b1d7e5625c1640396bd4");
                return;
            }
            super.onLayout(z, i, i2, i3, i4);
            if (this.k != null && this.k.isRunning()) {
                this.k.cancel();
                b(this.e, Math.round((1.0f - this.k.getAnimatedFraction()) * ((float) this.k.getDuration())));
                return;
            }
            b();
        }

        private void b() {
            int i;
            int i2;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4979e6dd3bc1afc7c1c634395d55fafc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4979e6dd3bc1afc7c1c634395d55fafc");
                return;
            }
            View childAt = getChildAt(this.e);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i2 = childAt.getLeft() + (((a(this.e) - CustomTabLayout.this.e) - this.c) / 2);
                i = this.c + i2;
                if (this.f > 0.0f && this.e < getChildCount() - 1) {
                    i2 = (int) ((this.f * (getChildAt(this.e + 1).getLeft() + ((a(this.e + 1) - this.c) / 2))) + ((1.0f - this.f) * i2));
                    i = this.c + i2;
                }
            }
            a(i2, i);
        }

        public final void a(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "124561c0264740504ea0fb2eee367d08", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "124561c0264740504ea0fb2eee367d08");
            } else if (i == this.i && i2 == this.j) {
            } else {
                this.i = i;
                this.j = i2;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        private int a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f18da60687d3412fef0b153773e3f39", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f18da60687d3412fef0b153773e3f39")).intValue();
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                return 0;
            }
            View findViewById = childAt.findViewById(R.id.tab_tv);
            if (findViewById != null && findViewById.getWidth() > 0) {
                return findViewById.getWidth();
            }
            return childAt.getWidth();
        }

        public final void b(final int i, int i2) {
            int i3;
            final int i4;
            final int i5;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c8667d7629dd6cac9e9cb3248eb1065", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c8667d7629dd6cac9e9cb3248eb1065");
                return;
            }
            if (this.k != null && this.k.isRunning()) {
                this.k.cancel();
            }
            boolean z = ViewCompat.getLayoutDirection(this) == 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                b();
                return;
            }
            final int left = childAt.getLeft() + (((a(i) - CustomTabLayout.this.e) - this.c) / 2);
            final int i6 = left + this.c;
            if (Math.abs(i - this.e) <= 1) {
                i4 = this.i;
                i5 = this.j;
            } else {
                int b = CustomTabLayout.this.b(24);
                if (i < this.e) {
                    if (!z) {
                        i3 = b + i6;
                        i4 = i3;
                        i5 = i4;
                    }
                    i3 = left - b;
                    i4 = i3;
                    i5 = i4;
                } else {
                    if (z) {
                        i3 = b + i6;
                        i4 = i3;
                        i5 = i4;
                    }
                    i3 = left - b;
                    i4 = i3;
                    i5 = i4;
                }
            }
            if (i4 == left && i5 == i6) {
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.k = valueAnimator;
            valueAnimator.setInterpolator(CustomTabLayout.b);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.business.page.common.widget.tablayout.CustomTabLayout.d.1
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    Object[] objArr2 = {valueAnimator2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e74a630c0df1f3d3f005a8a2a67556c0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e74a630c0df1f3d3f005a8a2a67556c0");
                        return;
                    }
                    float animatedFraction = valueAnimator2.getAnimatedFraction();
                    d.this.a(CustomTabLayout.a(i4, left, animatedFraction), CustomTabLayout.a(i5, i6, animatedFraction));
                }
            });
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.business.page.common.widget.tablayout.CustomTabLayout.d.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    d.this.e = i;
                    d.this.f = 0.0f;
                }
            });
            valueAnimator.start();
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            boolean z = true;
            Object[] objArr = {canvas};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22c24dd99cf0d45366983571c9a0af82", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22c24dd99cf0d45366983571c9a0af82");
                return;
            }
            super.draw(canvas);
            z = (!CustomTabLayout.this.C || CustomTabLayout.this.getTabCount() > 1) ? false : false;
            if (this.i < 0 || this.j <= this.i || z) {
                return;
            }
            if (CustomTabLayout.this.B) {
                canvas.drawBitmap(com.sankuai.waimai.launcher.util.image.a.a(getResources(), (int) R.drawable.wm_custom_tab_layout_indicator), (this.i + ((this.j - this.i) / 2)) - com.sankuai.waimai.foundation.utils.g.a(getContext(), 5.0f), getHeight() - this.b, this.d);
            } else {
                canvas.drawRect(this.i, getHeight() - this.b, this.j, getHeight(), this.d);
            }
        }
    }

    private int getTabMinWidth() {
        if (this.v != -1) {
            return this.v;
        }
        if (this.p == 0) {
            return this.x;
        }
        return 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37071472d36f42fc924d76e5f98d2e1d", RobustBitConfig.DEFAULT_VALUE) ? (FrameLayout.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37071472d36f42fc924d76e5f98d2e1d") : generateDefaultLayoutParams();
    }

    public int getTabMaxWidth() {
        return this.n;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {
        public static ChangeQuickRedirect a;
        private final WeakReference<CustomTabLayout> b;
        private int c;
        private int d;
        private boolean e;

        public TabLayoutOnPageChangeListener(CustomTabLayout customTabLayout) {
            Object[] objArr = {customTabLayout};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afeefe2cb34feabb87942db97789c077", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afeefe2cb34feabb87942db97789c077");
                return;
            }
            this.e = false;
            this.b = new WeakReference<>(customTabLayout);
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f2bf3a54a6ef1ef73dcc995b52d1137", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f2bf3a54a6ef1ef73dcc995b52d1137");
                return;
            }
            this.c = this.d;
            this.d = i;
            if (i == 1) {
                this.e = true;
            }
            if (i == 0) {
                this.e = false;
            }
            CustomTabLayout customTabLayout = this.b.get();
            if (customTabLayout != null) {
                CustomTabLayout.a(customTabLayout, i);
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            boolean z = false;
            Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11f98cd50db98777e5929fee6e63ae33", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11f98cd50db98777e5929fee6e63ae33");
                return;
            }
            CustomTabLayout customTabLayout = this.b.get();
            if (customTabLayout != null) {
                customTabLayout.a(i, f, this.d != 2 || this.c == 1, (this.d == 2 && this.c == 0) ? true : true);
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            boolean z = false;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc1aa2fd6a14454142669304a6585cbf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc1aa2fd6a14454142669304a6585cbf");
                return;
            }
            CustomTabLayout customTabLayout = this.b.get();
            if (customTabLayout == null || customTabLayout.getSelectedTabPosition() == i || i >= customTabLayout.getTabCount()) {
                return;
            }
            if (this.d == 0 || (this.d == 2 && this.c == 0)) {
                z = true;
            }
            customTabLayout.a(customTabLayout.a(i), z, this.e, 1);
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6eeb69bd4287ff44539e4ecb21f5b66", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6eeb69bd4287ff44539e4ecb21f5b66");
                return;
            }
            this.d = 0;
            this.c = 0;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class h implements b {
        public static ChangeQuickRedirect a;
        private final ViewPager b;

        public h(ViewPager viewPager) {
            Object[] objArr = {viewPager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8edc06528874421f5c98248fcf4d6fd5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8edc06528874421f5c98248fcf4d6fd5");
            } else {
                this.b = viewPager;
            }
        }

        @Override // com.sankuai.waimai.business.page.common.widget.tablayout.CustomTabLayout.b
        public final void a(e eVar, boolean z, int i) {
            Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8777c6937ddffbf85864a824f46a1114", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8777c6937ddffbf85864a824f46a1114");
            } else {
                this.b.setCurrentItem(eVar.c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class c extends DataSetObserver {
        public static ChangeQuickRedirect a;

        public c() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85ce6dbebd6d718e9d1708e421d0759e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85ce6dbebd6d718e9d1708e421d0759e");
            } else {
                CustomTabLayout.this.b();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "527d60e46cf2962d799db651ccd0161b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "527d60e46cf2962d799db651ccd0161b");
            } else {
                CustomTabLayout.this.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a implements ViewPager.OnAdapterChangeListener {
        public static ChangeQuickRedirect a;
        boolean b;

        public a() {
            Object[] objArr = {CustomTabLayout.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a73e0703ad903a82b30e15dffa44fa4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a73e0703ad903a82b30e15dffa44fa4");
            }
        }

        @Override // android.support.v4.view.ViewPager.OnAdapterChangeListener
        public final void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            Object[] objArr = {viewPager, pagerAdapter, pagerAdapter2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f62aff0f3d4dc4a2ca1e5bafd05f2432", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f62aff0f3d4dc4a2ca1e5bafd05f2432");
            } else if (CustomTabLayout.this.q == viewPager) {
                CustomTabLayout.this.a(pagerAdapter2, this.b);
            }
        }
    }

    public static int a(int i, int i2, float f2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b24be5193135bebb4be2290c1ce35040", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b24be5193135bebb4be2290c1ce35040")).intValue() : i + Math.round(f2 * (i2 - i));
    }

    private void a(e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "727f2c202a3133ad8aeab76cb5740695", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "727f2c202a3133ad8aeab76cb5740695");
            return;
        }
        eVar.c = i;
        this.s.add(i, eVar);
        int size = this.s.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            this.s.get(i2).c = i2;
        }
    }
}
