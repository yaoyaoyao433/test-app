package com.sankuai.waimai.store.view.standard;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.util.Pools;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.PointerIconCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FlashTabLayout extends HorizontalScrollView {
    public static ChangeQuickRedirect a;
    private static final Pools.Pool<e> n = new Pools.SynchronizedPool(16);
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
    private final ArrayList<e> o;
    private e p;
    private final d q;
    private final int r;
    private final int s;
    private final int t;
    private int u;
    private final ArrayList<b> v;
    private final Pools.Pool<g> w;

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
    public interface a {
        void a(View view, int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(e eVar);

        void b(e eVar);

        void c(e eVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        void a(int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public final class f extends View {
        public int a;
    }

    public FlashTabLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d8cdba1e1d1ee19101d24e4817f1f38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d8cdba1e1d1ee19101d24e4817f1f38");
        }
    }

    public FlashTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83b17ae25339ed55cd7a465c4ba92137", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83b17ae25339ed55cd7a465c4ba92137");
        }
    }

    public FlashTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f14a2631e4fb02279de56f6b720782d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f14a2631e4fb02279de56f6b720782d");
            return;
        }
        this.o = new ArrayList<>();
        this.k = Integer.MAX_VALUE;
        this.t = 10;
        this.v = new ArrayList<>();
        this.w = new Pools.SimplePool(12);
        setHorizontalScrollBarEnabled(false);
        this.q = new d(context);
        super.addView(this.q, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.tabTextColor, R.attr.tabSelectedTextColor, R.attr.tabIndicatorColor, R.attr.tabIndicatorHeight, R.attr.tabContentStart, R.attr.tabBackground, R.attr.tabMode, R.attr.tabGravity, R.attr.tabMinWidth, R.attr.tabMaxWidth, R.attr.tabTextAppearance, R.attr.tabPaddingStart, R.attr.tabPaddingTop, R.attr.tabPaddingEnd, R.attr.tabPaddingBottom, R.attr.tabPadding}, i, 2131558401);
        this.q.setSelectedIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(3, 0));
        this.q.setSelectedIndicatorColor(obtainStyledAttributes.getColor(2, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(15, 0);
        this.e = dimensionPixelSize;
        this.d = dimensionPixelSize;
        this.c = dimensionPixelSize;
        this.b = dimensionPixelSize;
        this.b = obtainStyledAttributes.getDimensionPixelSize(11, this.b);
        this.c = obtainStyledAttributes.getDimensionPixelSize(12, this.c);
        this.d = obtainStyledAttributes.getDimensionPixelSize(13, this.d);
        this.e = obtainStyledAttributes.getDimensionPixelSize(14, this.e);
        this.f = obtainStyledAttributes.getResourceId(10, 2131558898);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(this.f, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.textAllCaps, R.attr.fontFamily});
        try {
            this.h = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            this.g = obtainStyledAttributes2.getColorStateList(3);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(0)) {
                this.g = obtainStyledAttributes.getColorStateList(0);
            }
            if (obtainStyledAttributes.hasValue(1)) {
                int color = obtainStyledAttributes.getColor(1, 0);
                int defaultColor = this.g.getDefaultColor();
                Object[] objArr2 = {Integer.valueOf(defaultColor), Integer.valueOf(color)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                this.g = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "36a3409c12d4ed2b871249e56ff2bce5", RobustBitConfig.DEFAULT_VALUE) ? (ColorStateList) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "36a3409c12d4ed2b871249e56ff2bce5") : new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{color, defaultColor});
            }
            this.r = obtainStyledAttributes.getDimensionPixelSize(8, -1);
            this.s = obtainStyledAttributes.getDimensionPixelSize(9, -1);
            this.j = obtainStyledAttributes.getResourceId(5, 0);
            this.u = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.m = obtainStyledAttributes.getInt(6, 1);
            this.l = obtainStyledAttributes.getInt(7, 0);
            obtainStyledAttributes.recycle();
            this.i = getResources().getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            c();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d2441694e19dd584c14663f375ab459", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d2441694e19dd584c14663f375ab459");
        } else {
            this.q.setSelectedIndicatorHeight(i);
        }
    }

    private void a(int i, float f2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(0.0f), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d29a054654d3158e66cc8c1d5953f20a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d29a054654d3158e66cc8c1d5953f20a");
        } else {
            a(i, 0.0f, true, true);
        }
    }

    public final void a(int i, float f2, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "960623fa5fb5f3dca7f043b0dfc95adc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "960623fa5fb5f3dca7f043b0dfc95adc");
            return;
        }
        int round = Math.round(i + f2);
        if (round < 0 || round >= this.q.getChildCount()) {
            return;
        }
        if (z2) {
            this.q.a(i, f2);
        }
        scrollTo(a(i, f2), 0);
        if (z) {
            setSelectedTabView(round);
        }
    }

    public final void a(@NonNull e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f37d619db5fa383232104daf9bc0a66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f37d619db5fa383232104daf9bc0a66");
        } else {
            a(eVar, this.o.size(), z);
        }
    }

    private void a(@NonNull e eVar, int i, boolean z) {
        Object[] objArr = {eVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b630e8cdb40a9b4c4c702f430f90041", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b630e8cdb40a9b4c4c702f430f90041");
        } else if (eVar.j != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        } else {
            a(eVar, i);
            c(eVar);
            if (z) {
                eVar.a();
            }
        }
    }

    private void a(@NonNull f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "610fe79a5db630dd3d19ad45f1829ff2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "610fe79a5db630dd3d19ad45f1829ff2");
            return;
        }
        e a2 = a();
        if (fVar.a != 0) {
            a2.a(fVar.a);
        }
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6200895b00903c4e18ec4df5c8c70574", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6200895b00903c4e18ec4df5c8c70574");
        } else {
            a(a2, this.o.isEmpty());
        }
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2cf033c1cebfc0a3e9b39e4c248b64d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2cf033c1cebfc0a3e9b39e4c248b64d");
        } else if (bVar == null || this.v.contains(bVar)) {
        } else {
            this.v.add(bVar);
        }
    }

    public final e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86c2dc6c979fc5d61bbc1ecf2a53a410", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86c2dc6c979fc5d61bbc1ecf2a53a410");
        }
        e acquire = n.acquire();
        if (acquire == null) {
            acquire = new e();
        }
        acquire.j = this;
        acquire.k = b(acquire);
        return acquire;
    }

    public int getTabCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "538ea77050464d0779004f08c2cc042a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "538ea77050464d0779004f08c2cc042a")).intValue() : this.o.size();
    }

    public final e a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "512f7a7a65d8981d8c1a5e49a9a1a369", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "512f7a7a65d8981d8c1a5e49a9a1a369");
        }
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.o.get(i);
    }

    public int getSelectedTabPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de8e9090d059a59693d85a63b7626c7b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de8e9090d059a59693d85a63b7626c7b")).intValue();
        }
        if (this.p != null) {
            return this.p.h;
        }
        return -1;
    }

    public void setTabMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1021fa3b600b79c25bad2e3695dc810", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1021fa3b600b79c25bad2e3695dc810");
        } else if (i != this.m) {
            this.m = i;
            c();
        }
    }

    public void setTabGravity(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ba00489b1b01c05e62113da769d01dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ba00489b1b01c05e62113da769d01dd");
        } else if (this.l != i) {
            this.l = i;
            c();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a43ae6c45dc5e3ffc4a1a90382e3966", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a43ae6c45dc5e3ffc4a1a90382e3966")).booleanValue() : getTabScrollRange() > 0;
    }

    private int getTabScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8abfe814209981e399c03c791d6c0bfd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8abfe814209981e399c03c791d6c0bfd")).intValue() : Math.max(0, ((this.q.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private g b(@NonNull e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cc8ca3158b188cac0de02dfce8b4ba3", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cc8ca3158b188cac0de02dfce8b4ba3");
        }
        g acquire = this.w != null ? this.w.acquire() : null;
        if (acquire == null) {
            acquire = new g(getContext());
        }
        acquire.a(eVar);
        acquire.setFocusable(true);
        acquire.setMinimumWidth(getTabMinWidth());
        return acquire;
    }

    private void c(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12df516a65a5d1df4baecdc1d0017ca3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12df516a65a5d1df4baecdc1d0017ca3");
        } else {
            this.q.addView(eVar.k, eVar.h, b());
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a9a7ae31d24c38cc8af9b65c89783a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a9a7ae31d24c38cc8af9b65c89783a3");
        } else {
            a(view);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04226cdfc97c39803fe4c60db3392b50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04226cdfc97c39803fe4c60db3392b50");
        } else {
            a(view);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd6704ee110018785acd7c8f8aaef403", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd6704ee110018785acd7c8f8aaef403");
        } else {
            a(view);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13d18b4ea121e4d6cfe0909dac2d1e7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13d18b4ea121e4d6cfe0909dac2d1e7d");
        } else {
            a(view);
        }
    }

    private void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2cef5216ce6bf06cbaefd2d2a4cd4f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2cef5216ce6bf06cbaefd2d2a4cd4f7");
        } else if (view instanceof f) {
            a((f) view);
        }
    }

    private LinearLayout.LayoutParams b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9419ca2095d96dd8bc749615863e2273", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinearLayout.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9419ca2095d96dd8bc749615863e2273");
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        a(layoutParams);
        return layoutParams;
    }

    private void a(LinearLayout.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb3d02ea8702c941b0edf78932b7d7fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb3d02ea8702c941b0edf78932b7d7fd");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a656215475665e1f67bfe87b5ccae9a5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a656215475665e1f67bfe87b5ccae9a5")).intValue() : Math.round(getResources().getDisplayMetrics().density * i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
        if (r13.getMeasuredWidth() != getMeasuredWidth()) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
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
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.store.view.standard.FlashTabLayout.a
            java.lang.String r11 = "ff5892bce71bf82ef9aec677f9e8283a"
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
            r0 = 48
            int r0 = r12.b(r0)
            int r1 = r12.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r12.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = android.view.View.MeasureSpec.getMode(r14)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L48
            if (r1 == 0) goto L43
            goto L54
        L43:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L54
        L48:
            int r14 = android.view.View.MeasureSpec.getSize(r14)
            int r14 = java.lang.Math.min(r0, r14)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r3)
        L54:
            int r0 = android.view.View.MeasureSpec.getSize(r13)
            int r1 = android.view.View.MeasureSpec.getMode(r13)
            if (r1 == 0) goto L6e
            int r1 = r12.s
            if (r1 <= 0) goto L65
            int r0 = r12.s
            goto L6c
        L65:
            r1 = 56
            int r1 = r12.b(r1)
            int r0 = r0 - r1
        L6c:
            r12.k = r0
        L6e:
            super.onMeasure(r13, r14)
            int r13 = r12.getChildCount()
            if (r13 != r9) goto Lb8
            android.view.View r13 = r12.getChildAt(r8)
            int r0 = r12.m
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L81;
                default: goto L80;
            }
        L80:
            goto L98
        L81:
            int r0 = r13.getMeasuredWidth()
            int r1 = r12.getMeasuredWidth()
            if (r0 == r1) goto L98
        L8b:
            r8 = 1
            goto L98
        L8d:
            int r0 = r13.getMeasuredWidth()
            int r1 = r12.getMeasuredWidth()
            if (r0 >= r1) goto L98
            goto L8b
        L98:
            if (r8 == 0) goto Lb8
            int r0 = r12.getPaddingTop()
            int r1 = r12.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            int r1 = r1.height
            int r14 = getChildMeasureSpec(r14, r0, r1)
            int r0 = r12.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r13.measure(r0, r14)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.view.standard.FlashTabLayout.onMeasure(int, int):void");
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06fad2765fee5ac29717ada8308dab02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06fad2765fee5ac29717ada8308dab02");
        } else if (i == -1) {
        } else {
            if (getWindowToken() == null || !ViewCompat.isLaidOut(this) || this.q.a()) {
                a(i, 0.0f, true);
                return;
            }
            getScrollX();
            a(i, 0.0f);
            this.q.b(i, 300);
        }
    }

    private void setSelectedTabView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4637307a24914a1632552577393fb265", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4637307a24914a1632552577393fb265");
            return;
        }
        int childCount = this.q.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.q.getChildAt(i2);
                if (childAt != null) {
                    childAt.setSelected(i2 == i);
                }
                i2++;
            }
        }
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f00aab1001b407ba6d448a0d02274fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f00aab1001b407ba6d448a0d02274fd");
        } else {
            b(eVar, true);
        }
    }

    public final void b(e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "310ede2d35e671a4381f32e9ecb41acd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "310ede2d35e671a4381f32e9ecb41acd");
            return;
        }
        e eVar2 = this.p;
        if (eVar2 == eVar) {
            if (eVar2 != null) {
                f(eVar);
                c(eVar.h);
                return;
            }
            return;
        }
        int i = eVar != null ? eVar.h : -1;
        if (z) {
            if ((eVar2 == null || eVar2.h == -1) && i != -1) {
                a(i, 0.0f, true);
            } else {
                c(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        if (eVar2 != null) {
            e(eVar2);
        }
        this.p = eVar;
        if (eVar != null) {
            d(eVar);
        }
    }

    private void d(@NonNull e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6a47ecb0e477d3f83f61d5c3f1feb27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6a47ecb0e477d3f83f61d5c3f1feb27");
            return;
        }
        for (int size = this.v.size() - 1; size >= 0; size--) {
            this.v.get(size).a(eVar);
        }
    }

    private void e(@NonNull e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aafa9c11ddd59f1f5d605addbcd408a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aafa9c11ddd59f1f5d605addbcd408a");
            return;
        }
        for (int size = this.v.size() - 1; size >= 0; size--) {
            this.v.get(size).b(eVar);
        }
    }

    private void f(@NonNull e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b26d612ddfc66d8b8790fb071704fdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b26d612ddfc66d8b8790fb071704fdc");
            return;
        }
        for (int size = this.v.size() - 1; size >= 0; size--) {
            this.v.get(size).c(eVar);
        }
    }

    private int a(int i, float f2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8f051708c1d012f2125b93b03791464", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8f051708c1d012f2125b93b03791464")).intValue();
        }
        if (this.m == 0) {
            View childAt = this.q.getChildAt(i);
            int i2 = i + 1;
            View childAt2 = i2 < this.q.getChildCount() ? this.q.getChildAt(i2) : null;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "839cb1c05da1240d1cfec59b385901a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "839cb1c05da1240d1cfec59b385901a1");
            return;
        }
        ViewCompat.setPaddingRelative(this.q, this.m == 0 ? Math.max(0, this.u - this.b) : 0, 0, 0, 0);
        switch (this.m) {
            case 0:
                this.q.setGravity(GravityCompat.START);
                break;
            case 1:
                this.q.setGravity(1);
                break;
        }
        a(true);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "017556017e45f93d210086d66f641ca1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "017556017e45f93d210086d66f641ca1");
            return;
        }
        for (int i = 0; i < this.q.getChildCount(); i++) {
            View childAt = this.q.getChildAt(i);
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
        CharSequence c;
        public String d;
        public String e;
        public int f;
        public int g;
        public int h;
        public View i;
        public FlashTabLayout j;
        public g k;

        public e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc44ae25ac299a9a869bf97109da1008", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc44ae25ac299a9a869bf97109da1008");
            } else {
                this.h = -1;
            }
        }

        private e a(@Nullable View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7960c176fbb2104aa1d349d45d1ca44f", RobustBitConfig.DEFAULT_VALUE)) {
                return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7960c176fbb2104aa1d349d45d1ca44f");
            }
            this.i = view;
            c();
            return this;
        }

        public final e a(@LayoutRes int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "507e18b6685051128a819cf99cb587e4", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "507e18b6685051128a819cf99cb587e4") : a(LayoutInflater.from(this.k.getContext()).inflate(i, (ViewGroup) this.k, false));
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b381afcf45907ff85e3f270fa2d9ac0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b381afcf45907ff85e3f270fa2d9ac0");
            } else if (this.j == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else {
                this.j.a(this);
            }
        }

        public final boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1656a7737bafac9589c7e2ed37321f62", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1656a7737bafac9589c7e2ed37321f62")).booleanValue();
            }
            if (this.j != null) {
                return this.j.getSelectedTabPosition() == this.h;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2591b0d0787a03291ed210a5743ef4b6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2591b0d0787a03291ed210a5743ef4b6");
            } else if (this.k != null) {
                this.k.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class g extends LinearLayout {
        public static ChangeQuickRedirect a;
        private e c;
        private View d;

        public g(Context context) {
            super(context);
            Object[] objArr = {FlashTabLayout.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cffaf505ded292236d60a77340037f74", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cffaf505ded292236d60a77340037f74");
                return;
            }
            if (FlashTabLayout.this.j != 0) {
                ViewCompat.setBackground(this, android.support.v7.content.res.b.b(context, FlashTabLayout.this.j));
            }
            ViewCompat.setPaddingRelative(this, FlashTabLayout.this.b, FlashTabLayout.this.c, FlashTabLayout.this.d, FlashTabLayout.this.e);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        }

        @Override // android.view.View
        public final boolean performClick() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0323cc65dfea34ae58ac8b309f53ccb7", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0323cc65dfea34ae58ac8b309f53ccb7")).booleanValue();
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
        public final void setSelected(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6cca3e3f6ab3a74eb47359643727a91", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6cca3e3f6ab3a74eb47359643727a91");
                return;
            }
            super.setSelected(z);
            if (this.d != null) {
                this.d.setSelected(z);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5ab2d02e2851b36117172d0e5d6b0fc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5ab2d02e2851b36117172d0e5d6b0fc");
                return;
            }
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = FlashTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(FlashTabLayout.this.k, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
        }

        public final void a(@Nullable e eVar) {
            Object[] objArr = {eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b306cc3b47b79cca4dcfa80de5972c53", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b306cc3b47b79cca4dcfa80de5972c53");
            } else if (eVar != this.c) {
                this.c = eVar;
                a();
            }
        }

        public final void a() {
            boolean z = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01b7f3a2a18225fe2cdd4e30a8fded1f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01b7f3a2a18225fe2cdd4e30a8fded1f");
                return;
            }
            e eVar = this.c;
            View view = eVar != null ? eVar.i : null;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.d = view;
            } else if (this.d != null) {
                removeView(this.d);
                this.d = null;
            }
            if (eVar != null && eVar.b()) {
                z = true;
            }
            setSelected(z);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class d extends LinearLayout {
        public static ChangeQuickRedirect a;
        public int b;
        public float c;
        private int e;
        private final Paint f;
        private int g;
        private int h;
        private int i;
        private ValueAnimator j;

        public d(Context context) {
            super(context);
            Object[] objArr = {FlashTabLayout.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b43636defd34333f074d98647af5216d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b43636defd34333f074d98647af5216d");
                return;
            }
            this.b = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            setWillNotDraw(false);
            this.f = new Paint();
        }

        public final void setSelectedIndicatorColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e2d258fc34b8496fe4fa2f56e83b40c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e2d258fc34b8496fe4fa2f56e83b40c");
            } else if (this.f.getColor() != i) {
                this.f.setColor(i);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public final void setSelectedIndicatorHeight(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "512b3b2dbe8a11198801bdf174e99256", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "512b3b2dbe8a11198801bdf174e99256");
            } else if (this.e != i) {
                this.e = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "155b0bee27df160a87c5a9c683202425", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "155b0bee27df160a87c5a9c683202425")).booleanValue();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad865d7add32c2fedfc7ddb21cd3735b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad865d7add32c2fedfc7ddb21cd3735b");
                return;
            }
            if (this.j != null && this.j.isRunning()) {
                this.j.cancel();
            }
            this.b = i;
            this.c = f;
            b();
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onRtlPropertiesChanged(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c3d1f5813272293ba8342b04af8e742", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c3d1f5813272293ba8342b04af8e742");
                return;
            }
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT >= 23 || this.g == i) {
                return;
            }
            requestLayout();
            this.g = i;
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            boolean z;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d0e674f34eeed24a5b5c628cce96a99", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d0e674f34eeed24a5b5c628cce96a99");
                return;
            }
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824 && FlashTabLayout.this.m == 1 && FlashTabLayout.this.l == 1) {
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
                if (i3 * childCount <= getMeasuredWidth() - (FlashTabLayout.this.b(16) * 2)) {
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
                    FlashTabLayout.this.l = 0;
                    FlashTabLayout.this.a(false);
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13bbe977b7be924b5f2986fb9f17e295", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13bbe977b7be924b5f2986fb9f17e295");
                return;
            }
            super.onLayout(z, i, i2, i3, i4);
            if (this.j != null && this.j.isRunning()) {
                this.j.cancel();
                b(this.b, Math.round((1.0f - this.j.getAnimatedFraction()) * ((float) this.j.getDuration())));
                return;
            }
            b();
        }

        private void b() {
            int i;
            int i2;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87d5a10b0c2778cedd0560e341eade13", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87d5a10b0c2778cedd0560e341eade13");
                return;
            }
            View childAt = getChildAt(this.b);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.c > 0.0f && this.b < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.b + 1);
                    i = (int) ((this.c * childAt2.getLeft()) + ((1.0f - this.c) * i));
                    i2 = (int) ((this.c * childAt2.getRight()) + ((1.0f - this.c) * i2));
                }
            }
            a(i, i2);
        }

        public final void a(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "614c348f38bd1565dd24fd18fbc2a6f9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "614c348f38bd1565dd24fd18fbc2a6f9");
            } else if (i == this.h && i2 == this.i) {
            } else {
                this.h = i;
                this.i = i2;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public final void b(final int i, int i2) {
            int i3;
            final int i4;
            final int i5;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d3e27c0e354cfe77748ebf20ab9bf69", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d3e27c0e354cfe77748ebf20ab9bf69");
                return;
            }
            if (this.j != null && this.j.isRunning()) {
                this.j.cancel();
            }
            boolean z = ViewCompat.getLayoutDirection(this) == 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                b();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (Math.abs(i - this.b) <= 1) {
                i4 = this.h;
                i5 = this.i;
            } else {
                int b = FlashTabLayout.this.b(24);
                if (i < this.b) {
                    if (!z) {
                        i3 = b + right;
                        i4 = i3;
                        i5 = i4;
                    }
                    i3 = left - b;
                    i4 = i3;
                    i5 = i4;
                } else {
                    if (z) {
                        i3 = b + right;
                        i4 = i3;
                        i5 = i4;
                    }
                    i3 = left - b;
                    i4 = i3;
                    i5 = i4;
                }
            }
            if (i4 == left && i5 == right) {
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.j = valueAnimator;
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.view.standard.FlashTabLayout.d.1
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    Object[] objArr2 = {valueAnimator2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a823c1314abaebf0605f6eb73f4c2a7e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a823c1314abaebf0605f6eb73f4c2a7e");
                        return;
                    }
                    float animatedFraction = valueAnimator2.getAnimatedFraction();
                    d.this.a(FlashTabLayout.a(i4, left, animatedFraction), FlashTabLayout.a(i5, right, animatedFraction));
                }
            });
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.store.view.standard.FlashTabLayout.d.2
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2bdb81e89976bb73175b5f413515982", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2bdb81e89976bb73175b5f413515982");
                return;
            }
            super.draw(canvas);
            if (this.h < 0 || this.i <= this.h) {
                return;
            }
            canvas.drawRect(this.h, getHeight() - this.e, this.i, getHeight(), this.f);
        }
    }

    private int getTabMinWidth() {
        if (this.r != -1) {
            return this.r;
        }
        return this.m == 0 ? 10 : 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4497c64ab093783052128ba53aba1cbb", RobustBitConfig.DEFAULT_VALUE) ? (FrameLayout.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4497c64ab093783052128ba53aba1cbb") : generateDefaultLayoutParams();
    }

    public int getTabMaxWidth() {
        return this.k;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {
        public static ChangeQuickRedirect a;
        private final WeakReference<FlashTabLayout> b;
        private int c;
        private int d;

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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0414db2bd9e5b38394c1b3f6892faf45", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0414db2bd9e5b38394c1b3f6892faf45");
                return;
            }
            FlashTabLayout flashTabLayout = this.b.get();
            if (flashTabLayout != null) {
                flashTabLayout.a(i, f, this.d != 2 || this.c == 1, (this.d == 2 && this.c == 0) ? true : true);
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            boolean z = true;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13e156c6c75055612706f8d19dc551b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13e156c6c75055612706f8d19dc551b4");
                return;
            }
            FlashTabLayout flashTabLayout = this.b.get();
            if (flashTabLayout == null || flashTabLayout.getSelectedTabPosition() == i || i >= flashTabLayout.getTabCount()) {
                return;
            }
            if (this.d != 0 && (this.d != 2 || this.c != 0)) {
                z = false;
            }
            flashTabLayout.b(flashTabLayout.a(i), z);
        }
    }

    public static int a(int i, int i2, float f2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "528831b7396cddef103340b6fa1766c7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "528831b7396cddef103340b6fa1766c7")).intValue() : i + Math.round(f2 * (i2 - i));
    }

    private void a(e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2b6685e1b960cbe817cae46a7d9ce66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2b6685e1b960cbe817cae46a7d9ce66");
            return;
        }
        eVar.h = i;
        this.o.add(i, eVar);
        int size = this.o.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            this.o.get(i2).h = i2;
        }
    }
}
