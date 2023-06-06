package com.sankuai.waimai.restaurant.shopcart.widget.tablayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorInt;
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
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.ay;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
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
/* loaded from: classes5.dex */
public class CustomTabLayout extends HorizontalScrollView {
    public static ChangeQuickRedirect a;
    private static final Pools.Pool<e> o = new Pools.SynchronizedPool(16);
    private PagerAdapter A;
    private DataSetObserver B;
    private TabLayoutOnPageChangeListener C;
    private a D;
    private boolean E;
    private final Pools.Pool<f> F;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public ColorStateList g;
    public float h;
    public float i;
    public final int j;
    public int k;
    public int l;
    public int m;
    public ViewPager n;
    private final ArrayList<e> p;
    private e q;
    private final d r;
    private final int s;
    private final int t;
    private final int u;
    private int v;
    private b w;
    private final ArrayList<b> x;
    private b y;
    private ValueAnimator z;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes5.dex */
    public @interface Mode {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes5.dex */
    public @interface TabGravity {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(e eVar);
    }

    public CustomTabLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f46726108ed977e04e46888b8d0032b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f46726108ed977e04e46888b8d0032b6");
        }
    }

    private CustomTabLayout(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1c39b6c411234e46217b9597d957063", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1c39b6c411234e46217b9597d957063");
        }
    }

    @SuppressLint({"PrivateResource"})
    public CustomTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "294d1793339abe7a0539c23da2f1d228", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "294d1793339abe7a0539c23da2f1d228");
            return;
        }
        this.p = new ArrayList<>();
        this.k = 0;
        this.x = new ArrayList<>();
        this.F = new Pools.SimplePool(12);
        this.k = com.sankuai.waimai.foundation.utils.g.a(context);
        com.sankuai.waimai.restaurant.shopcart.widget.tablayout.b.a(context);
        setHorizontalScrollBarEnabled(false);
        this.r = new d(context);
        super.addView(this.r, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.recommendTabIndicatorColor, R.attr.recommendTabIndicatorHeight, R.attr.recommendTabIndicatorWidth, R.attr.recommendTabContentStart, R.attr.recommendTabBackground, R.attr.recommendTabMode, R.attr.recommendTabGravity, R.attr.recommendTabMinWidth, R.attr.recommendTabMaxWidth, R.attr.recommendTabTextAppearance, R.attr.recommendTabTextColor, R.attr.recommendTabSelectedTextColor, R.attr.recommendTabPaddingStart, R.attr.recommendTabPaddingTop, R.attr.recommendTabPaddingEnd, R.attr.recommendTabPaddingBottom, R.attr.recommendTabPadding}, i, 2131558401);
        this.r.b(obtainStyledAttributes.getDimensionPixelSize(1, 0));
        this.r.c(obtainStyledAttributes.getDimensionPixelSize(2, b(30)));
        this.r.a(obtainStyledAttributes.getColor(0, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(16, 0);
        this.e = dimensionPixelSize;
        this.d = dimensionPixelSize;
        this.c = dimensionPixelSize;
        this.b = dimensionPixelSize;
        this.b = obtainStyledAttributes.getDimensionPixelSize(12, this.b);
        this.c = obtainStyledAttributes.getDimensionPixelSize(13, this.c);
        this.d = obtainStyledAttributes.getDimensionPixelSize(14, this.d);
        this.e = obtainStyledAttributes.getDimensionPixelSize(15, this.e);
        this.f = obtainStyledAttributes.getResourceId(9, 2131558898);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(this.f, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.textAllCaps, R.attr.fontFamily});
        try {
            this.h = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            this.g = obtainStyledAttributes2.getColorStateList(3);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(10)) {
                this.g = obtainStyledAttributes.getColorStateList(10);
            }
            if (obtainStyledAttributes.hasValue(11)) {
                int color = obtainStyledAttributes.getColor(11, 0);
                int defaultColor = this.g.getDefaultColor();
                Object[] objArr2 = {Integer.valueOf(defaultColor), Integer.valueOf(color)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                this.g = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6dcb62be8a56612cd0ea302b19d6886e", RobustBitConfig.DEFAULT_VALUE) ? (ColorStateList) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6dcb62be8a56612cd0ea302b19d6886e") : new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{color, defaultColor});
            }
            this.s = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            this.t = obtainStyledAttributes.getDimensionPixelSize(8, -1);
            this.j = obtainStyledAttributes.getResourceId(4, 0);
            this.v = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.m = obtainStyledAttributes.getInt(5, 1);
            this.l = obtainStyledAttributes.getInt(6, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.i = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.u = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            c();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f235ab2464cdc4146e79faa4fe255251", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f235ab2464cdc4146e79faa4fe255251");
        } else {
            this.r.a(i);
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f24c94ff9c379c78754a1d647ad409d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f24c94ff9c379c78754a1d647ad409d");
        } else {
            this.r.b(i);
        }
    }

    public void setSelectedTabIndicatorWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57adf8bc5826d397a090046209c181f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57adf8bc5826d397a090046209c181f7");
        } else {
            this.r.c(i);
        }
    }

    private void a(int i, float f2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(0.0f), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "430546fb894df6f0484df0765f24e094", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "430546fb894df6f0484df0765f24e094");
        } else {
            a(i, 0.0f, true, true);
        }
    }

    public final void a(int i, float f2, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "586ad29dfb801933f24cc2086db6d63a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "586ad29dfb801933f24cc2086db6d63a");
            return;
        }
        int round = Math.round(i + f2);
        if (round < 0 || round >= this.r.getChildCount()) {
            return;
        }
        if (z2) {
            this.r.a(i, f2);
        }
        if (this.z != null && this.z.isRunning()) {
            this.z.cancel();
        }
        scrollTo(a(i, f2), 0);
        if (z) {
            setSelectedTabView(round);
        }
    }

    private float getScrollPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dafdf32248e8ca46c1153a456adea161", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dafdf32248e8ca46c1153a456adea161")).floatValue();
        }
        d dVar = this.r;
        return dVar.b + dVar.c;
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f68efc1998f74b7a306ab56f85a13223", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f68efc1998f74b7a306ab56f85a13223");
            return;
        }
        if (this.w != null) {
            b(this.w);
        }
        this.w = bVar;
        if (bVar != null) {
            a(bVar);
        }
    }

    private void a(@NonNull b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65e52195dc7fbba3b7c99b81a1127bab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65e52195dc7fbba3b7c99b81a1127bab");
        } else if (this.x.contains(bVar)) {
        } else {
            this.x.add(bVar);
        }
    }

    private void b(@NonNull b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfc935b2d6e48d0b59ceb9d5d030e642", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfc935b2d6e48d0b59ceb9d5d030e642");
        } else {
            this.x.remove(bVar);
        }
    }

    public int getTabCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1c6f8669601733dade8e564f47780d4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1c6f8669601733dade8e564f47780d4")).intValue() : this.p.size();
    }

    @Nullable
    public final e a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65b97130f5922bcf409c99766528d991", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65b97130f5922bcf409c99766528d991");
        }
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.p.get(i);
    }

    public int getSelectedTabPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6dc440613df6c91fadd629a8989aae0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6dc440613df6c91fadd629a8989aae0")).intValue();
        }
        if (this.q != null) {
            return this.q.f;
        }
        return -1;
    }

    public void setTabMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27e0d62920aa849f86b7cf6ef00b161f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27e0d62920aa849f86b7cf6ef00b161f");
        } else if (i != this.m) {
            this.m = i;
            c();
        }
    }

    public int getTabMode() {
        return this.m;
    }

    public void setTabGravity(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f37812fefa7713a4305c391ff42d1a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f37812fefa7713a4305c391ff42d1a8");
        } else if (this.l != i) {
            this.l = i;
            c();
        }
    }

    public int getTabGravity() {
        return this.l;
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        Object[] objArr = {colorStateList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64ae0af75a8a69a445838ddde4c1fbff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64ae0af75a8a69a445838ddde4c1fbff");
        } else if (this.g != colorStateList) {
            this.g = colorStateList;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8de20a82cffed06f992e02e93dc5ebf6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8de20a82cffed06f992e02e93dc5ebf6");
                return;
            }
            int size = this.p.size();
            for (int i = 0; i < size; i++) {
                this.p.get(i).c();
            }
        }
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.g;
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        Object[] objArr = {viewPager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd1072719dd87f5b9a58b23b6b58835b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd1072719dd87f5b9a58b23b6b58835b");
            return;
        }
        Object[] objArr2 = {viewPager, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e6337538173ad2dd4491e58f80ddb3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e6337538173ad2dd4491e58f80ddb3f");
        } else {
            a(viewPager, true, false);
        }
    }

    private void a(@Nullable ViewPager viewPager, boolean z, boolean z2) {
        Object[] objArr = {viewPager, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c63033ff94a0f2357b901a18f4d3500d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c63033ff94a0f2357b901a18f4d3500d");
            return;
        }
        if (this.n != null) {
            if (this.C != null) {
                this.n.removeOnPageChangeListener(this.C);
            }
            if (this.D != null) {
                this.n.removeOnAdapterChangeListener(this.D);
            }
        }
        if (this.y != null) {
            b(this.y);
            this.y = null;
        }
        if (viewPager != null) {
            this.n = viewPager;
            if (this.C == null) {
                this.C = new TabLayoutOnPageChangeListener(this);
            }
            this.C.a();
            viewPager.addOnPageChangeListener(this.C);
            this.y = new g(viewPager);
            a(this.y);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                a(adapter, z);
            }
            if (this.D == null) {
                this.D = new a();
            }
            this.D.b = z;
            viewPager.addOnAdapterChangeListener(this.D);
            a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.n = null;
            a((PagerAdapter) null, false);
        }
        this.E = z2;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        Object[] objArr = {pagerAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "172994499b410a3b82c20826cf958d7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "172994499b410a3b82c20826cf958d7f");
        } else {
            a(pagerAdapter, false);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e22a3ac6c5af15b09b3fae16754bd74", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e22a3ac6c5af15b09b3fae16754bd74")).booleanValue() : getTabScrollRange() > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99d1672fc2c2baac491c8fdd7d8a7e31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99d1672fc2c2baac491c8fdd7d8a7e31");
            return;
        }
        super.onAttachedToWindow();
        if (this.n == null) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71ace9db2ebb2e0f8b13ca75d026aeed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71ace9db2ebb2e0f8b13ca75d026aeed");
            return;
        }
        super.onDetachedFromWindow();
        if (this.E) {
            setupWithViewPager(null);
            this.E = false;
        }
    }

    private int getTabScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d202529aaa0cd776448178aef3eed28", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d202529aaa0cd776448178aef3eed28")).intValue() : Math.max(0, ((this.r.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public final void a(@Nullable PagerAdapter pagerAdapter, boolean z) {
        Object[] objArr = {pagerAdapter, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c357929844fac3e2720a0a77dac4ee57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c357929844fac3e2720a0a77dac4ee57");
            return;
        }
        if (this.A != null && this.B != null) {
            this.A.unregisterDataSetObserver(this.B);
        }
        this.A = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.B == null) {
                this.B = new c();
            }
            pagerAdapter.registerDataSetObserver(this.B);
        }
        a();
    }

    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v3 */
    public final void a() {
        int currentItem;
        f fVar;
        e eVar;
        LinearLayout.LayoutParams layoutParams;
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3f837bae85d52945019ebc26575d723", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3f837bae85d52945019ebc26575d723");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        int i2 = 1;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3968e31f7ba3a7b8bcb9a3b212d05807", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3968e31f7ba3a7b8bcb9a3b212d05807");
        } else {
            for (int childCount = this.r.getChildCount() - 1; childCount >= 0; childCount--) {
                Object[] objArr3 = {Integer.valueOf(childCount)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "652f0bfb43c3b3aec1cf0d2c6f4d5633", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "652f0bfb43c3b3aec1cf0d2c6f4d5633");
                } else {
                    f fVar2 = (f) this.r.getChildAt(childCount);
                    this.r.removeViewAt(childCount);
                    if (fVar2 != null) {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = f.a;
                        if (PatchProxy.isSupport(objArr4, fVar2, changeQuickRedirect4, false, "d63e0cd79bc7b8278f070bac77addd2e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, fVar2, changeQuickRedirect4, false, "d63e0cd79bc7b8278f070bac77addd2e");
                        } else {
                            fVar2.a((e) null);
                            fVar2.setSelected(false);
                        }
                        this.F.release(fVar2);
                    }
                    requestLayout();
                }
            }
            Iterator<e> it = this.p.iterator();
            while (it.hasNext()) {
                e next = it.next();
                it.remove();
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = e.a;
                if (PatchProxy.isSupport(objArr5, next, changeQuickRedirect5, false, "4f94e18ea4e516f9583ba44343d5aef8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, next, changeQuickRedirect5, false, "4f94e18ea4e516f9583ba44343d5aef8");
                } else {
                    next.h = null;
                    next.i = null;
                    next.b = null;
                    next.c = null;
                    next.d = null;
                    next.e = null;
                    next.f = -1;
                    next.g = null;
                }
                o.release(next);
            }
            this.q = null;
        }
        if (this.A != null) {
            int count = this.A.getCount();
            int i3 = 0;
            while (i3 < count) {
                Object[] objArr6 = new Object[i];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "8f19162c7773487c624db1487fafc74b", RobustBitConfig.DEFAULT_VALUE)) {
                    eVar = (e) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, i, "8f19162c7773487c624db1487fafc74b");
                } else {
                    e acquire = o.acquire();
                    if (acquire == null) {
                        acquire = new e();
                    }
                    e eVar2 = acquire;
                    eVar2.h = this;
                    Object[] objArr7 = new Object[i2];
                    objArr7[i] = eVar2;
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "04bc963f9851dee70e6d6bce8ac3d882", RobustBitConfig.DEFAULT_VALUE)) {
                        fVar = (f) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, i, "04bc963f9851dee70e6d6bce8ac3d882");
                    } else {
                        f acquire2 = this.F != null ? this.F.acquire() : null;
                        fVar = acquire2 == null ? new f(getContext()) : acquire2;
                        fVar.a(eVar2);
                        fVar.setFocusable((boolean) i2);
                        fVar.setMinimumWidth(getTabMinWidth());
                    }
                    eVar2.i = fVar;
                    eVar = eVar2;
                }
                CharSequence pageTitle = this.A.getPageTitle(i3);
                Object[] objArr8 = new Object[i2];
                objArr8[i] = pageTitle;
                ChangeQuickRedirect changeQuickRedirect8 = e.a;
                if (PatchProxy.isSupport(objArr8, eVar, changeQuickRedirect8, false, "5af1431f9f53716793341e60f4205666", RobustBitConfig.DEFAULT_VALUE)) {
                    eVar = (e) PatchProxy.accessDispatch(objArr8, eVar, changeQuickRedirect8, i, "5af1431f9f53716793341e60f4205666");
                } else {
                    eVar.d = pageTitle;
                    eVar.c();
                }
                e eVar3 = eVar;
                Object[] objArr9 = new Object[2];
                objArr9[i] = eVar3;
                objArr9[i2] = Byte.valueOf((byte) i);
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "d8328977f8efc4c3de2225ec4c22421b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, i, "d8328977f8efc4c3de2225ec4c22421b");
                } else {
                    int size = this.p.size();
                    Object[] objArr10 = new Object[3];
                    objArr10[i] = eVar3;
                    objArr10[i2] = Integer.valueOf(size);
                    objArr10[2] = Byte.valueOf((byte) i);
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "3b1bb0e5193f8c2bba6d246e198ff9a3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, i, "3b1bb0e5193f8c2bba6d246e198ff9a3");
                    } else if (eVar3.h != this) {
                        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
                    } else {
                        a(eVar3, size);
                        Object[] objArr11 = new Object[1];
                        objArr11[i] = eVar3;
                        ChangeQuickRedirect changeQuickRedirect11 = a;
                        if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "d0c6504cdef75b5220d5644bdee0d32c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, i, "d0c6504cdef75b5220d5644bdee0d32c");
                        } else {
                            f fVar3 = eVar3.i;
                            d dVar = this.r;
                            int i4 = eVar3.f;
                            Object[] objArr12 = new Object[i];
                            ChangeQuickRedirect changeQuickRedirect12 = a;
                            if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "c4cfc90b5989feeca9c3fa14b152ad89", RobustBitConfig.DEFAULT_VALUE)) {
                                layoutParams = (LinearLayout.LayoutParams) PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "c4cfc90b5989feeca9c3fa14b152ad89");
                            } else {
                                layoutParams = new LinearLayout.LayoutParams(-2, -1);
                                a(layoutParams);
                            }
                            dVar.addView(fVar3, i4, layoutParams);
                            i3++;
                            i = 0;
                            i2 = 1;
                        }
                    }
                }
                i3++;
                i = 0;
                i2 = 1;
            }
            if (this.n == null || count <= 0 || (currentItem = this.n.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            a(a(currentItem));
        }
    }

    private void a(LinearLayout.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52e519228f7e25dc73732c906bf88fbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52e519228f7e25dc73732c906bf88fbc");
        } else if (this.m == 1 && this.l == 0) {
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ef2c848fd5d7f433e31180bb95ae057", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ef2c848fd5d7f433e31180bb95ae057")).intValue() : com.sankuai.waimai.foundation.utils.g.a(getContext(), i);
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
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.restaurant.shopcart.widget.tablayout.CustomTabLayout.a
            java.lang.String r11 = "d205d1f739b331ee674e1c37138e5df7"
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
            int r1 = r12.t
            if (r1 <= 0) goto L67
            int r0 = r12.t
            goto L6e
        L67:
            r1 = 56
            int r1 = r12.b(r1)
            int r0 = r0 - r1
        L6e:
            r12.k = r0
        L70:
            super.onMeasure(r13, r14)
            int r13 = r12.getChildCount()
            if (r13 != r9) goto Lba
            android.view.View r13 = r12.getChildAt(r8)
            int r0 = r12.m
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
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.restaurant.shopcart.widget.tablayout.CustomTabLayout.onMeasure(int, int):void");
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53f6462ff33b136c6d287973e38620e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53f6462ff33b136c6d287973e38620e5");
        } else if (i == -1) {
        } else {
            if (getWindowToken() == null || !ViewCompat.isLaidOut(this) || this.r.a()) {
                a(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int a2 = a(i, 0.0f);
            if (scrollX != a2) {
                b();
                this.z.setIntValues(scrollX, a2);
                this.z.start();
            }
            this.r.b(i, 300);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57e0dc938a91334e52b25e31ddd6f573", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57e0dc938a91334e52b25e31ddd6f573");
        } else if (this.z == null) {
            this.z = new ValueAnimator();
            this.z.setInterpolator(com.sankuai.waimai.restaurant.shopcart.widget.tablayout.a.c);
            this.z.setDuration(300L);
            this.z.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.restaurant.shopcart.widget.tablayout.CustomTabLayout.1
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr2 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f753358bd0c4101a31305ce6e0a0384c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f753358bd0c4101a31305ce6e0a0384c");
                    } else {
                        CustomTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                    }
                }
            });
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        Object[] objArr = {animatorListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f70da062b23776c3b550d176a862152", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f70da062b23776c3b550d176a862152");
            return;
        }
        b();
        this.z.addListener(animatorListener);
    }

    private void setSelectedTabView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "757527dce8d1a479d66e84062cfca49a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "757527dce8d1a479d66e84062cfca49a");
            return;
        }
        int childCount = this.r.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.r.getChildAt(i2);
                childAt.setSelected(i2 == i);
                if (childAt instanceof f) {
                    if (i2 == i) {
                        ((f) childAt).d.setTypeface(null, 1);
                    } else {
                        ((f) childAt).d.setTypeface(null, 0);
                    }
                }
                i2++;
            }
        }
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14ce7f0c2de43999f97eae618334a89d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14ce7f0c2de43999f97eae618334a89d");
        } else {
            a(eVar, true);
        }
    }

    public final void a(e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0309b2f4e0af7f7224750498bc50613e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0309b2f4e0af7f7224750498bc50613e");
            return;
        }
        e eVar2 = this.q;
        if (eVar2 == eVar) {
            if (eVar2 != null) {
                d(eVar);
                c(eVar.f);
                return;
            }
            return;
        }
        int i = eVar != null ? eVar.f : -1;
        if (z) {
            if ((eVar2 == null || eVar2.f == -1) && i != -1) {
                a(i, 0.0f, true);
            } else {
                c(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        if (eVar2 != null) {
            c(eVar2);
        }
        this.q = eVar;
        if (eVar != null) {
            b(eVar);
        }
    }

    private void b(@NonNull e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a11ffb813a53689f82979f932664ef1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a11ffb813a53689f82979f932664ef1");
            return;
        }
        for (int size = this.x.size() - 1; size >= 0; size--) {
            this.x.get(size).a(eVar);
        }
    }

    private void c(@NonNull e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8e355afb9ac47767dad373d1555412c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8e355afb9ac47767dad373d1555412c");
            return;
        }
        for (int size = this.x.size() - 1; size >= 0; size--) {
            this.x.get(size);
        }
    }

    private void d(@NonNull e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b679aa2745579adf09447f9e81a19237", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b679aa2745579adf09447f9e81a19237");
            return;
        }
        for (int size = this.x.size() - 1; size >= 0; size--) {
            this.x.get(size);
        }
    }

    private int a(int i, float f2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f106873c8d3a0dd131d3f3cea0f5791c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f106873c8d3a0dd131d3f3cea0f5791c")).intValue();
        }
        if (this.m == 0) {
            View childAt = this.r.getChildAt(i);
            int i2 = i + 1;
            View childAt2 = i2 < this.r.getChildCount() ? this.r.getChildAt(i2) : null;
            int width = childAt != null ? childAt.getWidth() : 0;
            int width2 = childAt2 != null ? childAt2.getWidth() : 0;
            int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
            int i3 = (int) ((width + width2) * 0.5f * f2);
            return ViewCompat.getLayoutDirection(this) == 0 ? left + i3 : left - i3;
        }
        return 0;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faab6d758adaca309905b8c334e9d343", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faab6d758adaca309905b8c334e9d343");
            return;
        }
        ViewCompat.setPaddingRelative(this.r, this.m == 0 ? Math.max(0, this.v - this.b) : 0, 0, 0, 0);
        switch (this.m) {
            case 0:
                this.r.setGravity(GravityCompat.START);
                break;
            case 1:
                this.r.setGravity(1);
                break;
        }
        a(true);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6653fc6556c6cb849c705d0a5307376c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6653fc6556c6cb849c705d0a5307376c");
            return;
        }
        for (int i = 0; i < this.r.getChildCount(); i++) {
            View childAt = this.r.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class e {
        public static ChangeQuickRedirect a;
        Object b;
        Drawable c;
        CharSequence d;
        CharSequence e;
        int f;
        View g;
        public CustomTabLayout h;
        public f i;

        public e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dc8111ba850656ded84104e61577cf7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dc8111ba850656ded84104e61577cf7");
            } else {
                this.f = -1;
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7175154529fb90a3a79c273fe65de29", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7175154529fb90a3a79c273fe65de29");
            } else if (this.h == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else {
                this.h.a(this);
            }
        }

        public final boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4875c0b9ae5297af81b7dfc1d7496ef", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4875c0b9ae5297af81b7dfc1d7496ef")).booleanValue();
            }
            if (this.h != null) {
                return this.h.getSelectedTabPosition() == this.f;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80cc3514ec86fcaffe5fb8be5acb18ea", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80cc3514ec86fcaffe5fb8be5acb18ea");
            } else if (this.i != null) {
                this.i.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class f extends LinearLayout {
        public static ChangeQuickRedirect a;
        private e c;
        private TextView d;
        private ImageView e;
        private View f;
        private TextView g;
        private ImageView h;
        private int i;

        public f(Context context) {
            super(context);
            Object[] objArr = {CustomTabLayout.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8415907c9f88824fe0e6542ffb993d19", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8415907c9f88824fe0e6542ffb993d19");
                return;
            }
            this.i = 2;
            if (CustomTabLayout.this.j != 0) {
                ViewCompat.setBackground(this, android.support.v7.content.res.b.b(context, CustomTabLayout.this.j));
            }
            ViewCompat.setPaddingRelative(this, CustomTabLayout.this.b, CustomTabLayout.this.c, CustomTabLayout.this.d, CustomTabLayout.this.e);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        }

        @Override // android.view.View
        public final boolean performClick() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "877aaa22f80badd37a50387ff665e8c2", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "877aaa22f80badd37a50387ff665e8c2")).booleanValue();
            }
            boolean performClick = super.performClick();
            if (this.c != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.c.a();
                return true;
            }
            return performClick;
        }

        @Override // android.view.View
        @SuppressLint({"ObsoleteSdkInt"})
        public final void setSelected(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "056f49e114213ef67569fd8ab067f5da", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "056f49e114213ef67569fd8ab067f5da");
                return;
            }
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            if (this.d != null) {
                this.d.setSelected(z);
            }
            if (this.e != null) {
                this.e.setSelected(z);
            }
            if (this.f != null) {
                this.f.setSelected(z);
            }
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            Object[] objArr = {accessibilityEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "247b38d85b28d42e5046d8286627226b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "247b38d85b28d42e5046d8286627226b");
                return;
            }
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.b.class.getName());
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            Object[] objArr = {accessibilityNodeInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1e3b4824818b322068f346ab2e361f2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1e3b4824818b322068f346ab2e361f2");
                return;
            }
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ActionBar.b.class.getName());
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x00ff, code lost:
            if ((com.meituan.robust.PatchProxy.isSupport(r5, r19, r9, false, "f6833a32cc439b5b78aed2caf1be32d4", com.meituan.robust.utils.RobustBitConfig.DEFAULT_VALUE) ? ((java.lang.Float) com.meituan.robust.PatchProxy.accessDispatch(r5, r19, r9, false, "f6833a32cc439b5b78aed2caf1be32d4")).floatValue() : r15.getLineWidth(0) * (r13 / r15.getPaint().getTextSize())) > ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
        @Override // android.widget.LinearLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onMeasure(int r20, int r21) {
            /*
                Method dump skipped, instructions count: 279
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.restaurant.shopcart.widget.tablayout.CustomTabLayout.f.onMeasure(int, int):void");
        }

        public final void a(@Nullable e eVar) {
            Object[] objArr = {eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dc504b890c9a51a5acca2c41ae9ebfe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dc504b890c9a51a5acca2c41ae9ebfe");
            } else if (eVar != this.c) {
                this.c = eVar;
                a();
            }
        }

        public final void a() {
            boolean z = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "750e1ddfa4c097139391f7c32c499c97", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "750e1ddfa4c097139391f7c32c499c97");
                return;
            }
            e eVar = this.c;
            View view = eVar != null ? eVar.g : null;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f = view;
                if (this.d != null) {
                    this.d.setVisibility(8);
                }
                if (this.e != null) {
                    this.e.setVisibility(8);
                    this.e.setImageDrawable(null);
                }
                this.g = (TextView) view.findViewById(16908308);
                if (this.g != null) {
                    this.i = TextViewCompat.getMaxLines(this.g);
                }
                this.h = (ImageView) view.findViewById(16908294);
            } else {
                if (this.f != null) {
                    removeView(this.f);
                    this.f = null;
                }
                this.g = null;
                this.h = null;
            }
            if (this.f == null) {
                if (this.e == null) {
                    ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    addView(imageView, 0);
                    this.e = imageView;
                }
                if (this.d == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    textView.setTextSize(16.0f);
                    addView(textView);
                    this.d = textView;
                    this.i = TextViewCompat.getMaxLines(this.d);
                }
                TextViewCompat.setTextAppearance(this.d, CustomTabLayout.this.f);
                if (CustomTabLayout.this.g != null) {
                    this.d.setTextColor(CustomTabLayout.this.g);
                }
                a(this.d, this.e);
            } else if (this.g != null || this.h != null) {
                a(this.g, this.h);
            }
            if (eVar != null && eVar.b()) {
                z = true;
            }
            setSelected(z);
        }

        private void a(@Nullable TextView textView, @Nullable ImageView imageView) {
            int i = 0;
            Object[] objArr = {textView, imageView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b490a451d6ab09932d28b6bd8347aab1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b490a451d6ab09932d28b6bd8347aab1");
                return;
            }
            Drawable drawable = this.c != null ? this.c.c : null;
            CharSequence charSequence = this.c != null ? this.c.d : null;
            CharSequence charSequence2 = this.c != null ? this.c.e : null;
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
                imageView.setContentDescription(charSequence2);
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
                textView.setContentDescription(charSequence2);
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z && imageView.getVisibility() == 0) {
                    i = CustomTabLayout.this.b(8);
                }
                if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    imageView.requestLayout();
                }
            }
            ay.a(this, z ? null : charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class d extends LinearLayout {
        public static ChangeQuickRedirect a;
        public int b;
        public float c;
        private int e;
        private int f;
        private final Paint g;
        private int h;
        private int i;
        private int j;
        private ValueAnimator k;

        public d(Context context) {
            super(context);
            Object[] objArr = {CustomTabLayout.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "560de96ab5ade7bc9338404d0f1d5e37", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "560de96ab5ade7bc9338404d0f1d5e37");
                return;
            }
            this.b = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            setWillNotDraw(false);
            this.g = new Paint();
        }

        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a2e8b515146da39cdab294fb2f2d48d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a2e8b515146da39cdab294fb2f2d48d");
            } else if (this.g.getColor() != i) {
                this.g.setColor(i);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public final void b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fd053011a9db8317f8fd7f563d8fc51", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fd053011a9db8317f8fd7f563d8fc51");
            } else if (this.e != i) {
                this.e = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public final void c(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad773ff0cbd13fd58c9c64ab37fa7b7d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad773ff0cbd13fd58c9c64ab37fa7b7d");
            } else if (this.f != i) {
                this.f = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c624d6e0a80e17e4da4ace8166e2e26d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c624d6e0a80e17e4da4ace8166e2e26d")).booleanValue();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17ea7f3cffabfa42e789eafdcb8ca9c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17ea7f3cffabfa42e789eafdcb8ca9c6");
                return;
            }
            if (this.k != null && this.k.isRunning()) {
                this.k.cancel();
            }
            this.b = i;
            this.c = f;
            b();
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onRtlPropertiesChanged(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57a323c252fb77b13f14cedebb0c0c90", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57a323c252fb77b13f14cedebb0c0c90");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26d17b31a8581d708a68fd4067bafa59", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26d17b31a8581d708a68fd4067bafa59");
                return;
            }
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824 && CustomTabLayout.this.m == 1 && CustomTabLayout.this.l == 1) {
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
                    CustomTabLayout.this.l = 0;
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbe72c65d6ed1575a61729a9c1bd4c8c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbe72c65d6ed1575a61729a9c1bd4c8c");
                return;
            }
            super.onLayout(z, i, i2, i3, i4);
            if (this.k != null && this.k.isRunning()) {
                this.k.cancel();
                b(this.b, Math.round((1.0f - this.k.getAnimatedFraction()) * ((float) this.k.getDuration())));
                return;
            }
            b();
        }

        private void b() {
            int i;
            int i2;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "659a964cc21aa589f3f67ac2169d551d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "659a964cc21aa589f3f67ac2169d551d");
                return;
            }
            View childAt = getChildAt(this.b);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft() + (((childAt.getWidth() - CustomTabLayout.this.d) - this.f) / 2);
                i2 = this.f + i;
                if (this.c > 0.0f && this.b < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.b + 1);
                    i = (int) ((this.c * (childAt2.getLeft() + ((childAt2.getWidth() - this.f) / 2))) + ((1.0f - this.c) * i));
                    i2 = this.f + i;
                }
            }
            a(i, i2);
        }

        public final void a(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e317c0b47fe279f3ce3cfb170e65aba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e317c0b47fe279f3ce3cfb170e65aba");
            } else if (i == this.i && i2 == this.j) {
            } else {
                d(i);
                e(i2);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        private void d(int i) {
            if (i < 0) {
                i = 0;
            }
            this.i = i;
        }

        private void e(int i) {
            if (i < 0) {
                i = 0;
            }
            this.j = i;
        }

        public final void b(final int i, int i2) {
            int i3;
            final int i4;
            final int i5;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40f16088eff122c2e664717449bf51e3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40f16088eff122c2e664717449bf51e3");
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
            int width = (((childAt.getWidth() - CustomTabLayout.this.d) - this.f) / 2) + childAt.getLeft();
            final int i6 = width < 0 ? 0 : width;
            final int i7 = i6 + this.f;
            if (Math.abs(i - this.b) <= 1) {
                i4 = this.i;
                i5 = this.j;
            } else {
                int b = CustomTabLayout.this.b(24);
                if (i < this.b) {
                    if (!z) {
                        i3 = b + i6;
                        i4 = i3;
                    }
                    i4 = i6 - b;
                } else {
                    if (z) {
                        i3 = b + i7;
                        i4 = i3;
                    }
                    i4 = i6 - b;
                }
                i5 = i4;
            }
            if (i4 == i6 && i5 == i7) {
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.k = valueAnimator;
            valueAnimator.setInterpolator(com.sankuai.waimai.restaurant.shopcart.widget.tablayout.a.c);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.restaurant.shopcart.widget.tablayout.CustomTabLayout.d.1
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    Object[] objArr2 = {valueAnimator2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6615a37b9126dbdb520d787671100171", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6615a37b9126dbdb520d787671100171");
                        return;
                    }
                    float animatedFraction = valueAnimator2.getAnimatedFraction();
                    d.this.a(com.sankuai.waimai.restaurant.shopcart.widget.tablayout.a.a(i4, i6, animatedFraction), com.sankuai.waimai.restaurant.shopcart.widget.tablayout.a.a(i5, i7, animatedFraction));
                }
            });
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.restaurant.shopcart.widget.tablayout.CustomTabLayout.d.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    d.this.b = i;
                    d.this.c = 0.0f;
                }
            });
            valueAnimator.start();
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            Object[] objArr = {canvas};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31e47d96c0793529e9b0ef7c67be589b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31e47d96c0793529e9b0ef7c67be589b");
                return;
            }
            super.draw(canvas);
            if (this.i < 0 || this.j <= this.i) {
                return;
            }
            canvas.drawRect(this.i, getHeight() - this.e, this.j, getHeight(), this.g);
        }
    }

    private int getDefaultHeight() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c58fdf6a6287cf60d4a8c6a3191786f6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c58fdf6a6287cf60d4a8c6a3191786f6")).intValue();
        }
        int size = this.p.size();
        int i = 0;
        while (true) {
            if (i < size) {
                e eVar = this.p.get(i);
                if (eVar != null && eVar.c != null && !TextUtils.isEmpty(eVar.d)) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return z ? 72 : 48;
    }

    private int getTabMinWidth() {
        if (this.s != -1) {
            return this.s;
        }
        if (this.m == 0) {
            return this.u;
        }
        return 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d723906edd0c184d9096fcf1afd0982", RobustBitConfig.DEFAULT_VALUE) ? (FrameLayout.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d723906edd0c184d9096fcf1afd0982") : generateDefaultLayoutParams();
    }

    public int getTabMaxWidth() {
        return this.k;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {
        public static ChangeQuickRedirect a;
        private final WeakReference<CustomTabLayout> b;
        private int c;
        private int d;

        public TabLayoutOnPageChangeListener(CustomTabLayout customTabLayout) {
            Object[] objArr = {customTabLayout};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "210b4181c4aed9b05f6c0f8bf2ad18bc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "210b4181c4aed9b05f6c0f8bf2ad18bc");
            } else {
                this.b = new WeakReference<>(customTabLayout);
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.c = this.d;
            this.d = i;
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            boolean z = false;
            Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6579f039cc4bc616689f12589790d893", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6579f039cc4bc616689f12589790d893");
                return;
            }
            CustomTabLayout customTabLayout = this.b.get();
            if (customTabLayout != null) {
                customTabLayout.a(i, f, this.d != 2 || this.c == 1, (this.d == 2 && this.c == 0) ? true : true);
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            boolean z = true;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54b536b961dfd792feb4d67874d1736a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54b536b961dfd792feb4d67874d1736a");
                return;
            }
            CustomTabLayout customTabLayout = this.b.get();
            if (customTabLayout == null || customTabLayout.getSelectedTabPosition() == i || i >= customTabLayout.getTabCount()) {
                return;
            }
            if (this.d != 0 && (this.d != 2 || this.c != 0)) {
                z = false;
            }
            customTabLayout.a(customTabLayout.a(i), z);
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "573e7a5353a482df30bcc5a430b55e42", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "573e7a5353a482df30bcc5a430b55e42");
                return;
            }
            this.d = 0;
            this.c = 0;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class g implements b {
        public static ChangeQuickRedirect a;
        private final ViewPager b;

        public g(ViewPager viewPager) {
            Object[] objArr = {viewPager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e78d12e375c7262ebeed85f7c58cd0bd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e78d12e375c7262ebeed85f7c58cd0bd");
            } else {
                this.b = viewPager;
            }
        }

        @Override // com.sankuai.waimai.restaurant.shopcart.widget.tablayout.CustomTabLayout.b
        public final void a(e eVar) {
            Object[] objArr = {eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fb4ae49c6e1540ca559aea77bae1d00", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fb4ae49c6e1540ca559aea77bae1d00");
            } else {
                this.b.setCurrentItem(eVar.f);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class c extends DataSetObserver {
        public static ChangeQuickRedirect a;

        public c() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c456acbe5cadc25fa34996ce25114af", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c456acbe5cadc25fa34996ce25114af");
            } else {
                CustomTabLayout.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e664604cd4cfa93fc27c764695764163", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e664604cd4cfa93fc27c764695764163");
            } else {
                CustomTabLayout.this.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements ViewPager.OnAdapterChangeListener {
        public static ChangeQuickRedirect a;
        boolean b;

        public a() {
            Object[] objArr = {CustomTabLayout.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77e11c2ee5978ef92ebd1b40aa514d02", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77e11c2ee5978ef92ebd1b40aa514d02");
            }
        }

        @Override // android.support.v4.view.ViewPager.OnAdapterChangeListener
        public final void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            Object[] objArr = {viewPager, pagerAdapter, pagerAdapter2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3cabcaaaab758144f17b96e0bb4b587", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3cabcaaaab758144f17b96e0bb4b587");
            } else if (CustomTabLayout.this.n == viewPager) {
                CustomTabLayout.this.a(pagerAdapter2, this.b);
            }
        }
    }

    private void a(e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d64a2b77b224f3ea6b353132ec61a9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d64a2b77b224f3ea6b353132ec61a9e");
            return;
        }
        eVar.f = i;
        this.p.add(i, eVar);
        int size = this.p.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            this.p.get(i2).f = i2;
        }
    }
}
