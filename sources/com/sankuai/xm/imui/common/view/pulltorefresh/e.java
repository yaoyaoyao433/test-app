package com.sankuai.xm.imui.common.view.pulltorefresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class e<T extends View> extends LinearLayout {
    public static ChangeQuickRedirect b = null;
    public static boolean c = false;
    private b A;
    private int a;
    public T d;
    boolean e;
    private float f;
    private float g;
    private float h;
    private float i;
    private boolean j;
    private k k;
    private c l;
    private c m;
    private FrameLayout n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private Interpolator s;
    private a t;
    private com.sankuai.xm.imui.common.view.pulltorefresh.internal.c u;
    private com.sankuai.xm.imui.common.view.pulltorefresh.internal.c v;
    private f<T> w;
    private g<T> x;
    private InterfaceC1399e<T> y;
    private e<T>.j z;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface d {
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.imui.common.view.pulltorefresh.e$e  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC1399e<V extends View> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface f<V extends View> {
        void a(e<V> eVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface g<V extends View> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface h {
        void a();
    }

    public abstract T a(Context context, AttributeSet attributeSet);

    public void a(TypedArray typedArray) {
    }

    public abstract boolean d();

    public abstract boolean e();

    public abstract i getPullToRefreshScrollDirection();

    public int getPullToRefreshScrollDuration() {
        return 200;
    }

    public int getPullToRefreshScrollDurationLonger() {
        return TbsListener.ErrorCode.THROWABLE_INITX5CORE;
    }

    public e(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39601dd11d51ab25d0ab1e28833d0458", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39601dd11d51ab25d0ab1e28833d0458");
            return;
        }
        this.j = false;
        this.k = k.RESET;
        this.l = c.a();
        this.o = true;
        this.p = false;
        this.q = true;
        this.r = true;
        this.e = true;
        this.t = a.a();
        b(context, (AttributeSet) null);
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f731dcffe9dcd72405160433b00da499", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f731dcffe9dcd72405160433b00da499");
            return;
        }
        this.j = false;
        this.k = k.RESET;
        this.l = c.a();
        this.o = true;
        this.p = false;
        this.q = true;
        this.r = true;
        this.e = true;
        this.t = a.a();
        b(context, attributeSet);
    }

    public e(Context context, c cVar) {
        super(context);
        Object[] objArr = {context, cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab6df68531b9ef8314f0d83d127dcbc6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab6df68531b9ef8314f0d83d127dcbc6");
            return;
        }
        this.j = false;
        this.k = k.RESET;
        this.l = c.a();
        this.o = true;
        this.p = false;
        this.q = true;
        this.r = true;
        this.e = true;
        this.t = a.a();
        this.l = cVar;
        b(context, (AttributeSet) null);
    }

    public e(Context context, c cVar, a aVar) {
        super(context);
        Object[] objArr = {context, cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2663d28344345a22db9dfc29c2cb90a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2663d28344345a22db9dfc29c2cb90a");
            return;
        }
        this.j = false;
        this.k = k.RESET;
        this.l = c.a();
        this.o = true;
        this.p = false;
        this.q = true;
        this.r = true;
        this.e = true;
        this.t = a.a();
        this.l = cVar;
        this.t = aVar;
        b(context, (AttributeSet) null);
    }

    public void setOnHeaderPullingListener(b bVar) {
        this.A = bVar;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i2), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b2d534b4be1d3fdcd71bff532f7030a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b2d534b4be1d3fdcd71bff532f7030a");
            return;
        }
        if (c) {
            com.sankuai.xm.imui.common.util.d.a("PullToRefresh.addView: " + view.getClass().getSimpleName(), new Object[0]);
        }
        T refreshableView = getRefreshableView();
        if (refreshableView instanceof ViewGroup) {
            ((ViewGroup) refreshableView).addView(view, i2, layoutParams);
            return;
        }
        throw new UnsupportedOperationException("Refreshable View is not a ViewGroup so can't addView");
    }

    public final c getCurrentMode() {
        return this.m;
    }

    public final boolean getFilterTouchEvents() {
        return this.q;
    }

    public final void setFilterTouchEvents(boolean z) {
        this.q = z;
    }

    public final com.sankuai.xm.imui.common.view.pulltorefresh.a getLoadingLayoutProxy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e2e59ac99686608ae52c86b708832b5", 6917529027641081856L) ? (com.sankuai.xm.imui.common.view.pulltorefresh.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e2e59ac99686608ae52c86b708832b5") : a(true, true);
    }

    public final com.sankuai.xm.imui.common.view.pulltorefresh.a a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4fbf53d3040a1522304df069f4dcc7b", 6917529027641081856L) ? (com.sankuai.xm.imui.common.view.pulltorefresh.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4fbf53d3040a1522304df069f4dcc7b") : b(z, z2);
    }

    public final c getMode() {
        return this.l;
    }

    public final void setMode(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0cd32dabfbca76045e91c99f73be145", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0cd32dabfbca76045e91c99f73be145");
        } else if (cVar != this.l) {
            this.l = cVar;
            f();
        }
    }

    public final T getRefreshableView() {
        return this.d;
    }

    public final boolean getShowViewWhileRefreshing() {
        return this.o;
    }

    public final void setShowViewWhileRefreshing(boolean z) {
        this.o = z;
    }

    public final k getState() {
        return this.k;
    }

    public void setDisableScrollingWhileRefreshing(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a16a091ab3f1cbe4cce00e83adf3785", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a16a091ab3f1cbe4cce00e83adf3785");
        } else {
            setScrollingWhileRefreshingEnabled(!z ? 1 : 0);
        }
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bb7b47eaab9548ce7c81e0a1888ea91", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bb7b47eaab9548ce7c81e0a1888ea91")).booleanValue() : this.l.b();
    }

    public final void setPullToRefreshEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08b4ef877d09d1dfac96c4b11f399108", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08b4ef877d09d1dfac96c4b11f399108");
        } else {
            setMode(z ? c.a() : c.DISABLED);
        }
    }

    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62971aeae1371198d8a0a8f943633232", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62971aeae1371198d8a0a8f943633232")).booleanValue() : this.r && com.sankuai.xm.imui.common.view.pulltorefresh.c.a(this.d);
    }

    public final void setPullToRefreshOverScrollEnabled(boolean z) {
        this.r = z;
    }

    public final boolean i() {
        return this.k == k.REFRESHING || this.k == k.MANUAL_REFRESHING;
    }

    public final void setRefreshing(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2c86a237cfd7d368f8e74cdb292f963", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2c86a237cfd7d368f8e74cdb292f963");
        } else if (i()) {
        } else {
            a(k.MANUAL_REFRESHING, z);
        }
    }

    public final void setScrollingWhileRefreshingEnabled(boolean z) {
        this.p = z;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c4a69adc761e0b61f9a4d6e4def4673", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c4a69adc761e0b61f9a4d6e4def4673")).booleanValue();
        }
        if (g()) {
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.j = false;
                return false;
            } else if (action == 0 || !this.j) {
                if (action != 0) {
                    if (action == 2) {
                        if (!this.p && i()) {
                            return true;
                        }
                        if (l()) {
                            float y = motionEvent.getY();
                            float x = motionEvent.getX();
                            int[] iArr = AnonymousClass3.a;
                            getPullToRefreshScrollDirection().ordinal();
                            float f2 = y - this.g;
                            float f3 = x - this.f;
                            float abs = Math.abs(f2);
                            if (abs > this.a && (!this.q || abs > Math.abs(f3))) {
                                if (this.l.c() && f2 >= 1.0f && d()) {
                                    this.g = y;
                                    this.f = x;
                                    this.j = true;
                                    if (this.l == c.BOTH) {
                                        this.m = c.PULL_FROM_START;
                                    }
                                } else if (this.l.d() && f2 <= -1.0f && e()) {
                                    this.g = y;
                                    this.f = x;
                                    this.j = true;
                                    if (this.l == c.BOTH) {
                                        this.m = c.PULL_FROM_END;
                                    }
                                }
                            }
                        }
                    }
                } else if (l()) {
                    float y2 = motionEvent.getY();
                    this.i = y2;
                    this.g = y2;
                    float x2 = motionEvent.getX();
                    this.h = x2;
                    this.f = x2;
                    this.j = false;
                }
                return this.j;
            } else {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int round;
        int footerSize;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd01e3dc0093e4072b62e8c7b63c7a25", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd01e3dc0093e4072b62e8c7b63c7a25")).booleanValue();
        }
        if (g()) {
            if (this.p || !i()) {
                if (motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) {
                    switch (motionEvent.getAction()) {
                        case 0:
                            if (l()) {
                                float y = motionEvent.getY();
                                this.i = y;
                                this.g = y;
                                float x = motionEvent.getX();
                                this.h = x;
                                this.f = x;
                                return true;
                            }
                            break;
                        case 1:
                        case 3:
                            if (this.j) {
                                this.j = false;
                                if (this.k == k.RELEASE_TO_REFRESH && (this.w != null || this.x != null)) {
                                    a(k.REFRESHING, true);
                                    return true;
                                } else if (i()) {
                                    a(0);
                                    return true;
                                } else {
                                    a(k.RESET, new boolean[0]);
                                    return true;
                                }
                            }
                            break;
                        case 2:
                            if (this.j) {
                                this.g = motionEvent.getY();
                                this.f = motionEvent.getX();
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = b;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c26d728be730cd2cb7f0dda8ae919645", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c26d728be730cd2cb7f0dda8ae919645");
                                } else {
                                    int[] iArr = AnonymousClass3.a;
                                    getPullToRefreshScrollDirection().ordinal();
                                    float f2 = this.i;
                                    float f3 = this.g;
                                    if (AnonymousClass3.c[this.m.ordinal()] == 1) {
                                        round = Math.round(Math.max(f2 - f3, 0.0f) / 2.0f);
                                        footerSize = getFooterSize();
                                    } else {
                                        round = Math.round(Math.min(f2 - f3, 0.0f) / 2.0f);
                                        footerSize = getHeaderSize();
                                    }
                                    setHeaderScroll(round);
                                    if (round != 0 && !i()) {
                                        float abs = Math.abs(round) / footerSize;
                                        if (AnonymousClass3.c[this.m.ordinal()] == 1) {
                                            this.v.a(abs);
                                        } else {
                                            this.u.a(abs);
                                        }
                                        if (this.k != k.PULL_TO_REFRESH && footerSize >= Math.abs(round)) {
                                            a(k.PULL_TO_REFRESH, new boolean[0]);
                                        } else if (this.k == k.PULL_TO_REFRESH && footerSize < Math.abs(round)) {
                                            a(k.RELEASE_TO_REFRESH, new boolean[0]);
                                        }
                                    }
                                }
                                return true;
                            }
                            break;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public void setLastUpdatedLabel(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6bc80703e47d6177a1b963f454361ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6bc80703e47d6177a1b963f454361ef");
        } else {
            getLoadingLayoutProxy().setLastUpdatedLabel(charSequence);
        }
    }

    public void setLoadingDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c437bbdfd64fee9ca619c86547181faf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c437bbdfd64fee9ca619c86547181faf");
        } else {
            getLoadingLayoutProxy().setLoadingDrawable(drawable);
        }
    }

    @Override // android.view.View
    public void setLongClickable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5109e90595f535aa5e7f6536451e4bfa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5109e90595f535aa5e7f6536451e4bfa");
        } else {
            getRefreshableView().setLongClickable(z);
        }
    }

    public void setOnPullEventListener(InterfaceC1399e<T> interfaceC1399e) {
        this.y = interfaceC1399e;
    }

    public final void setOnRefreshListener(f<T> fVar) {
        this.w = fVar;
        this.x = null;
    }

    public final void setOnRefreshListener(g<T> gVar) {
        this.x = gVar;
        this.w = null;
    }

    public void setPullLabel(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4c308fdddb3a9d784c6b791a95d28d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4c308fdddb3a9d784c6b791a95d28d9");
        } else {
            getLoadingLayoutProxy().setPullLabel(charSequence);
        }
    }

    public void setRefreshingLabel(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94817bcf8fb6e16e3150b29155e37f2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94817bcf8fb6e16e3150b29155e37f2f");
        } else {
            getLoadingLayoutProxy().setRefreshingLabel(charSequence);
        }
    }

    public void setReleaseLabel(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00c4ae3332477d7709ad55474fcf9101", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00c4ae3332477d7709ad55474fcf9101");
            return;
        }
        c cVar = c.BOTH;
        Object[] objArr2 = {charSequence, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1461b47e9fa4d815cc5b1acbf549a9ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1461b47e9fa4d815cc5b1acbf549a9ca");
        } else {
            a(cVar.c(), cVar.d()).setReleaseLabel(charSequence);
        }
    }

    public void setScrollAnimationInterpolator(Interpolator interpolator) {
        this.s = interpolator;
    }

    public final void a(k kVar, boolean... zArr) {
        Object[] objArr = {kVar, zArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f43c51db13f51071dfa669e9ef698f2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f43c51db13f51071dfa669e9ef698f2c");
            return;
        }
        this.k = kVar;
        switch (this.k) {
            case RESET:
                c();
                return;
            case PULL_TO_REFRESH:
                a();
                return;
            case RELEASE_TO_REFRESH:
                b();
                return;
            case REFRESHING:
            case MANUAL_REFRESHING:
                a(zArr[0]);
                return;
            default:
                return;
        }
    }

    private void a(View view, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aabe522cd956d06f2b3307ae1bad1410", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aabe522cd956d06f2b3307ae1bad1410");
        } else {
            super.addView(view, -1, layoutParams);
        }
    }

    public final com.sankuai.xm.imui.common.view.pulltorefresh.internal.c a(Context context, c cVar, TypedArray typedArray) {
        Object[] objArr = {context, cVar, typedArray};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b9540cf53ff76b99d415c9d42935902", 6917529027641081856L)) {
            return (com.sankuai.xm.imui.common.view.pulltorefresh.internal.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b9540cf53ff76b99d415c9d42935902");
        }
        a aVar = this.t;
        i pullToRefreshScrollDirection = getPullToRefreshScrollDirection();
        Object[] objArr2 = {context, cVar, pullToRefreshScrollDirection, typedArray};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        com.sankuai.xm.imui.common.view.pulltorefresh.internal.c dVar = PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "9bab3e6e39ac72d8e4b20fa20d257313", 6917529027641081856L) ? (com.sankuai.xm.imui.common.view.pulltorefresh.internal.c) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "9bab3e6e39ac72d8e4b20fa20d257313") : new com.sankuai.xm.imui.common.view.pulltorefresh.internal.d(context, cVar, pullToRefreshScrollDirection, typedArray);
        dVar.setVisibility(4);
        return dVar;
    }

    public com.sankuai.xm.imui.common.view.pulltorefresh.b b(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25425b9b9dd97b22a4d526ed19439791", 6917529027641081856L)) {
            return (com.sankuai.xm.imui.common.view.pulltorefresh.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25425b9b9dd97b22a4d526ed19439791");
        }
        com.sankuai.xm.imui.common.view.pulltorefresh.b bVar = new com.sankuai.xm.imui.common.view.pulltorefresh.b();
        if (z && this.l.c()) {
            bVar.a(this.u);
        }
        if (z2 && this.l.d()) {
            bVar.a(this.v);
        }
        return bVar;
    }

    public final com.sankuai.xm.imui.common.view.pulltorefresh.internal.c getFooterLayout() {
        return this.v;
    }

    public final int getFooterSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e16b61c8e111f6cafd1d9521c54a7e81", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e16b61c8e111f6cafd1d9521c54a7e81")).intValue() : this.v.getContentSize();
    }

    public final com.sankuai.xm.imui.common.view.pulltorefresh.internal.c getHeaderLayout() {
        return this.u;
    }

    public final int getHeaderSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a50d697d599daf880a91f54eff9df830", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a50d697d599daf880a91f54eff9df830")).intValue() : this.u.getContentSize();
    }

    public FrameLayout getRefreshableViewWrapper() {
        return this.n;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.imui.common.view.pulltorefresh.e$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] a;

        static {
            try {
                c[c.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[c.PULL_FROM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[c.MANUAL_REFRESH_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[c.BOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            b = new int[k.valuesCustom().length];
            try {
                b[k.RESET.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[k.PULL_TO_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[k.RELEASE_TO_REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[k.REFRESHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[k.MANUAL_REFRESHING.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[k.OVERSCROLLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            a = new int[i.valuesCustom().length];
            try {
                a[i.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "266ea12f26b7fd0d62b9ecc64349d519", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "266ea12f26b7fd0d62b9ecc64349d519");
            return;
        }
        switch (this.m) {
            case PULL_FROM_END:
                this.v.b();
                return;
            case PULL_FROM_START:
                this.u.b();
                return;
            default:
                return;
        }
    }

    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f54454f187342f8d598c627133cee10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f54454f187342f8d598c627133cee10");
            return;
        }
        if (this.l.c()) {
            this.u.c();
        }
        if (this.l.d()) {
            this.v.c();
        }
        if (z) {
            if (this.o) {
                h hVar = new h() { // from class: com.sankuai.xm.imui.common.view.pulltorefresh.e.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.e.h
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7d3688ea5f8db4ca0ccbcb0d665a092", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7d3688ea5f8db4ca0ccbcb0d665a092");
                        } else {
                            e.this.k();
                        }
                    }
                };
                int i2 = AnonymousClass3.c[this.m.ordinal()];
                if (i2 == 1 || i2 == 3) {
                    a(getFooterSize(), hVar);
                    return;
                } else {
                    a(-getHeaderSize(), hVar);
                    return;
                }
            }
            a(0);
            return;
        }
        k();
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aea7c4b66a1ba5a5feb2b9dabb4bc56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aea7c4b66a1ba5a5feb2b9dabb4bc56");
            return;
        }
        switch (this.m) {
            case PULL_FROM_END:
                this.v.d();
                return;
            case PULL_FROM_START:
                this.u.d();
                return;
            default:
                return;
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ca22a3e92766781d9db14c7f1be1855", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ca22a3e92766781d9db14c7f1be1855");
            return;
        }
        this.j = false;
        this.e = true;
        this.u.e();
        this.v.e();
        a(0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Object[] objArr = {parcelable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e35bed062f494b8ec4f4cb861792d74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e35bed062f494b8ec4f4cb861792d74");
        } else if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            setMode(c.a(bundle.getInt("ptr_mode", 0)));
            this.m = c.a(bundle.getInt("ptr_current_mode", 0));
            this.p = bundle.getBoolean("ptr_disable_scrolling", false);
            this.o = bundle.getBoolean("ptr_show_refreshing_view", true);
            super.onRestoreInstanceState(bundle.getParcelable("ptr_super"));
            k a2 = k.a(bundle.getInt("ptr_state", 0));
            if (a2 == k.REFRESHING || a2 == k.MANUAL_REFRESHING) {
                a(a2, true);
            }
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4f2a5417ba773d65eff0f8eaf76667d", 6917529027641081856L)) {
            return (Parcelable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4f2a5417ba773d65eff0f8eaf76667d");
        }
        Bundle bundle = new Bundle();
        bundle.putInt("ptr_state", this.k.h);
        bundle.putInt("ptr_mode", this.l.i);
        bundle.putInt("ptr_current_mode", this.m.i);
        bundle.putBoolean("ptr_disable_scrolling", this.p);
        bundle.putBoolean("ptr_show_refreshing_view", this.o);
        bundle.putParcelable("ptr_super", super.onSaveInstanceState());
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d10e3454ae8b6a3625176db6f25d5b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d10e3454ae8b6a3625176db6f25d5b6");
            return;
        }
        if (c) {
            com.sankuai.xm.imui.common.util.d.a("PullToRefresh" + String.format(".onSizeChanged. W: %d, H: %d", Integer.valueOf(i2), Integer.valueOf(i3)), new Object[0]);
        }
        super.onSizeChanged(i2, i3, i4, i5);
        if (i5 == 0 || i4 == 0) {
            j();
        }
        post(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.imui.common.view.pulltorefresh.e.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a86bd897c60c1ab495543a393e73196d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a86bd897c60c1ab495543a393e73196d");
                } else {
                    e.this.requestLayout();
                }
            }
        }));
    }

    private void j() {
        int i2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b90847c58613f182d693c79580441355", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b90847c58613f182d693c79580441355");
            return;
        }
        int maximumPullScroll = (int) (getMaximumPullScroll() * 1.2f);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        if (AnonymousClass3.a[getPullToRefreshScrollDirection().ordinal()] != 1) {
            i2 = paddingBottom;
        } else {
            if (this.l.c()) {
                this.u.setHeight(maximumPullScroll);
                paddingTop = -maximumPullScroll;
            } else {
                paddingTop = 0;
            }
            if (this.l.d()) {
                this.v.setHeight(maximumPullScroll);
                i2 = -maximumPullScroll;
            } else {
                i2 = 0;
            }
        }
        if (c) {
            com.sankuai.xm.imui.common.util.d.a("PullToRefresh.refreshLoadingViewsSize," + String.format("Setting Padding. L: %d, T: %d, R: %d, B: %d", Integer.valueOf(paddingLeft), Integer.valueOf(paddingTop), Integer.valueOf(paddingRight), Integer.valueOf(i2)), new Object[0]);
        }
        setPadding(paddingLeft, paddingTop, paddingRight, i2);
    }

    public final void setHeaderScroll(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b668ceda156585ac470bc8eabaee1684", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b668ceda156585ac470bc8eabaee1684");
            return;
        }
        if (this.A != null) {
            getPullToRefreshScrollDirection();
            i iVar = i.VERTICAL;
        }
        int maximumPullScroll = getMaximumPullScroll();
        int min = Math.min(maximumPullScroll, Math.max(-maximumPullScroll, i2));
        if (this.e) {
            if (min < 0) {
                this.u.setVisibility(0);
            } else if (min > 0) {
                this.v.setVisibility(0);
            } else {
                this.u.setVisibility(4);
                this.v.setVisibility(4);
            }
        }
        if (AnonymousClass3.a[getPullToRefreshScrollDirection().ordinal()] != 1) {
            return;
        }
        scrollTo(0, min);
    }

    public final void a(int i2) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d62d3f4ff9852049f6d1151a5fd4c3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d62d3f4ff9852049f6d1151a5fd4c3f");
        } else {
            a(0, getPullToRefreshScrollDuration());
        }
    }

    private void a(int i2, h hVar) {
        Object[] objArr = {Integer.valueOf(i2), hVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "151d495a0ebac010f04bfa8a7b4004b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "151d495a0ebac010f04bfa8a7b4004b2");
        } else {
            a(i2, getPullToRefreshScrollDuration(), 0L, hVar);
        }
    }

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dc36e0b81e157d1bdeb89977b4d1fd3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dc36e0b81e157d1bdeb89977b4d1fd3");
            return;
        }
        LinearLayout.LayoutParams loadingLayoutLayoutParams = getLoadingLayoutLayoutParams();
        if (this == this.u.getParent()) {
            removeView(this.u);
        }
        if (this.l.c()) {
            com.sankuai.xm.imui.common.view.pulltorefresh.internal.c cVar = this.u;
            Object[] objArr2 = {cVar, 0, loadingLayoutLayoutParams};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "493ababf7096c2111df84757708795e4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "493ababf7096c2111df84757708795e4");
            } else {
                super.addView(cVar, 0, loadingLayoutLayoutParams);
            }
        }
        if (this == this.v.getParent()) {
            removeView(this.v);
        }
        if (this.l.d()) {
            a(this.v, loadingLayoutLayoutParams);
        }
        j();
        this.m = this.l != c.BOTH ? this.l : c.PULL_FROM_START;
    }

    private void a(Context context, T t) {
        Object[] objArr = {context, t};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "859647d76626630d0ea7d7bbe6a92813", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "859647d76626630d0ea7d7bbe6a92813");
            return;
        }
        this.n = new FrameLayout(context);
        this.n.addView(t, -1, -1);
        a(this.n, new LinearLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4a9465120dcd8335becc261305a51c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4a9465120dcd8335becc261305a51c4");
        } else if (this.w != null) {
            this.w.a(this);
        } else if (this.x == null || this.m == c.PULL_FROM_START) {
        } else {
            c cVar = c.PULL_FROM_END;
        }
    }

    private void b(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52cee8ad2f81276a5b47b9f3b07a663f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52cee8ad2f81276a5b47b9f3b07a663f");
            return;
        }
        int[] iArr = AnonymousClass3.a;
        getPullToRefreshScrollDirection().ordinal();
        setOrientation(1);
        setGravity(17);
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.chat_ptrRefreshableViewBackground, R.attr.chat_ptrHeaderBackground, R.attr.chat_ptrHeaderTextColor, R.attr.chat_ptrHeaderSubTextColor, R.attr.chat_ptrMode, R.attr.chat_ptrShowIndicator, R.attr.chat_ptrDrawable, R.attr.chat_ptrDrawableStart, R.attr.chat_ptrDrawableEnd, R.attr.chat_ptrOverScroll, R.attr.chat_ptrHeaderTextAppearance, R.attr.chat_ptrSubHeaderTextAppearance, R.attr.chat_ptrAnimationStyle, R.attr.chat_ptrScrollingWhileRefreshingEnabled, R.attr.chat_ptrListViewExtrasEnabled, R.attr.chat_ptrRotateDrawableWhilePulling, R.attr.chat_ptrAdapterViewBackground, R.attr.chat_ptrDrawableTop, R.attr.chat_ptrDrawableBottom});
        if (obtainStyledAttributes.hasValue(4)) {
            this.l = c.a(obtainStyledAttributes.getInteger(4, 0));
        }
        if (obtainStyledAttributes.hasValue(12)) {
            this.t = a.a(obtainStyledAttributes.getInteger(12, 0));
        }
        this.d = a(context, attributeSet);
        a(context, (Context) this.d);
        this.u = a(context, c.PULL_FROM_START, obtainStyledAttributes);
        this.v = a(context, c.PULL_FROM_END, obtainStyledAttributes);
        if (obtainStyledAttributes.hasValue(0)) {
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                this.d.setBackgroundDrawable(drawable);
            }
        } else if (obtainStyledAttributes.hasValue(16)) {
            com.sankuai.xm.imui.common.util.d.c("PullToRefresh.warnDeprecation,You're using the deprecated ptrAdapterViewBackground attr, please switch over to ptrRefreshableViewBackground", new Object[0]);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(16);
            if (drawable2 != null) {
                this.d.setBackgroundDrawable(drawable2);
            }
        }
        if (obtainStyledAttributes.hasValue(9)) {
            this.r = obtainStyledAttributes.getBoolean(9, true);
        }
        if (obtainStyledAttributes.hasValue(13)) {
            this.p = obtainStyledAttributes.getBoolean(13, false);
        }
        a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        f();
    }

    private boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22256d6017e5c54211a18c57b494a7dd", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22256d6017e5c54211a18c57b494a7dd")).booleanValue();
        }
        int i2 = AnonymousClass3.c[this.l.ordinal()];
        if (i2 == 4) {
            return e() || d();
        }
        switch (i2) {
            case 1:
                return e();
            case 2:
                return d();
            default:
                return false;
        }
    }

    private LinearLayout.LayoutParams getLoadingLayoutLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "614a1036e88eb8e02fdc0a860f37d6c9", 6917529027641081856L)) {
            return (LinearLayout.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "614a1036e88eb8e02fdc0a860f37d6c9");
        }
        int[] iArr = AnonymousClass3.a;
        getPullToRefreshScrollDirection().ordinal();
        return new LinearLayout.LayoutParams(-1, -2);
    }

    private int getMaximumPullScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c50569862eadc91a1a8e263ca330d6f", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c50569862eadc91a1a8e263ca330d6f")).intValue();
        }
        int[] iArr = AnonymousClass3.a;
        getPullToRefreshScrollDirection().ordinal();
        return Math.round(getHeight() / 2.0f);
    }

    private void a(int i2, long j2) {
        Object[] objArr = {Integer.valueOf(i2), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68f948f2d00943235e899c5347524600", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68f948f2d00943235e899c5347524600");
        } else {
            a(i2, j2, 0L, null);
        }
    }

    private void a(int i2, long j2, long j3, h hVar) {
        Object[] objArr = {Integer.valueOf(i2), new Long(j2), 0L, hVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b86a849a842da783c0efbe87e50b7401", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b86a849a842da783c0efbe87e50b7401");
            return;
        }
        if (this.z != null) {
            this.z.a();
        }
        int[] iArr = AnonymousClass3.a;
        getPullToRefreshScrollDirection().ordinal();
        int scrollY = getScrollY();
        if (scrollY != i2) {
            if (this.s == null) {
                this.s = new DecelerateInterpolator();
            }
            this.z = new j(scrollY, i2, j2, hVar);
            post(this.z);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum a {
        ROTATE,
        FLIP;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "170eb1903edb257871e078d14495d8bc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "170eb1903edb257871e078d14495d8bc");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c319950dbe90e4df9111201fefb37324", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c319950dbe90e4df9111201fefb37324") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55e1b2cc80c177bf72a13a58cc8848b9", 6917529027641081856L) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55e1b2cc80c177bf72a13a58cc8848b9") : (a[]) values().clone();
        }

        public static a a() {
            return ROTATE;
        }

        public static a a(int i) {
            return ROTATE;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum c {
        DISABLED(0),
        PULL_FROM_START(1),
        PULL_FROM_END(2),
        BOTH(3),
        MANUAL_REFRESH_ONLY(4);
        
        public static ChangeQuickRedirect a;
        int i;
        public static c g = PULL_FROM_START;
        public static c h = PULL_FROM_END;

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ae69442700138ef169278c756b8ec20", 6917529027641081856L) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ae69442700138ef169278c756b8ec20") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "afb9f6f8813fcf7be97a83c43ef13ce0", 6917529027641081856L) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "afb9f6f8813fcf7be97a83c43ef13ce0") : (c[]) values().clone();
        }

        c(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "046013528656e623a7e93e74a8ac0f93", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "046013528656e623a7e93e74a8ac0f93");
            } else {
                this.i = i;
            }
        }

        public static c a(int i) {
            c[] valuesCustom;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88f80622b23ef9a74819a489a860c77f", 6917529027641081856L)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88f80622b23ef9a74819a489a860c77f");
            }
            for (c cVar : valuesCustom()) {
                if (i == cVar.i) {
                    return cVar;
                }
            }
            return PULL_FROM_START;
        }

        public static c a() {
            return PULL_FROM_START;
        }

        public final boolean b() {
            return (this == DISABLED || this == MANUAL_REFRESH_ONLY) ? false : true;
        }

        public final boolean c() {
            return this == PULL_FROM_START || this == BOTH;
        }

        public final boolean d() {
            return this == PULL_FROM_END || this == BOTH || this == MANUAL_REFRESH_ONLY;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum i {
        VERTICAL;
        
        public static ChangeQuickRedirect a;

        i() {
            Object[] objArr = {r10, 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ece4b2b0150bf11f6b08baa5b3e4b248", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ece4b2b0150bf11f6b08baa5b3e4b248");
            }
        }

        public static i valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4faaae26f081dd148be0caa6ccf489f2", 6917529027641081856L) ? (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4faaae26f081dd148be0caa6ccf489f2") : (i) Enum.valueOf(i.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static i[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "478dc440914b839875e30d6e763993b6", 6917529027641081856L) ? (i[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "478dc440914b839875e30d6e763993b6") : (i[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum k {
        RESET(0),
        PULL_TO_REFRESH(1),
        RELEASE_TO_REFRESH(2),
        REFRESHING(8),
        MANUAL_REFRESHING(9),
        OVERSCROLLING(16);
        
        public static ChangeQuickRedirect a;
        int h;

        public static k valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0da1c5c74db6af1157f54779c7c45dc", 6917529027641081856L) ? (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0da1c5c74db6af1157f54779c7c45dc") : (k) Enum.valueOf(k.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static k[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f743299a575006f1cab6658eef62b58e", 6917529027641081856L) ? (k[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f743299a575006f1cab6658eef62b58e") : (k[]) values().clone();
        }

        k(int i2) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8baff3b3af84a66c36086d6a1f00775e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8baff3b3af84a66c36086d6a1f00775e");
            } else {
                this.h = i2;
            }
        }

        public static k a(int i2) {
            k[] valuesCustom;
            Object[] objArr = {Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d9f50aa5a9f3c1bf71633a8852fc63f", 6917529027641081856L)) {
                return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d9f50aa5a9f3c1bf71633a8852fc63f");
            }
            for (k kVar : valuesCustom()) {
                if (i2 == kVar.h) {
                    return kVar;
                }
            }
            return RESET;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class j implements Runnable {
        public static ChangeQuickRedirect a;
        private final Interpolator c;
        private final int d;
        private final int e;
        private final long f;
        private h g;
        private boolean h;
        private long i;
        private int j;
        private com.sankuai.xm.base.trace.g k;

        public j(int i, int i2, long j, h hVar) {
            Object[] objArr = {e.this, Integer.valueOf(i), Integer.valueOf(i2), new Long(j), hVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4b0caca6489a745e028d95eb018721e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4b0caca6489a745e028d95eb018721e");
                return;
            }
            this.h = true;
            this.i = -1L;
            this.j = -1;
            this.e = i;
            this.d = i2;
            this.c = e.this.s;
            this.f = j;
            this.g = hVar;
            this.k = com.sankuai.xm.base.trace.j.a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "240539a39b35c6ded9bc2d5952f6a6f7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "240539a39b35c6ded9bc2d5952f6a6f7");
                return;
            }
            try {
                com.sankuai.xm.base.trace.j.a(this.k);
                if (this.i == -1) {
                    this.i = System.currentTimeMillis();
                } else {
                    this.j = this.e - Math.round((this.e - this.d) * this.c.getInterpolation(((float) Math.max(Math.min(((System.currentTimeMillis() - this.i) * 1000) / this.f, 1000L), 0L)) / 1000.0f));
                    e.this.setHeaderScroll(this.j);
                }
                if (this.h && this.d != this.j) {
                    e eVar = e.this;
                    Object[] objArr2 = {eVar, this};
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.imui.common.view.pulltorefresh.internal.e.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "34bf3b912866179e1799c5d4a96c81ea", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "34bf3b912866179e1799c5d4a96c81ea");
                    } else {
                        eVar.postDelayed(this, 16L);
                    }
                } else if (this.g != null) {
                    this.g.a();
                }
                com.sankuai.xm.base.trace.j.c(this.k);
            } catch (Throwable th) {
                com.sankuai.xm.base.trace.j.a(this.k, th);
                throw th;
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d5646a2d2cf835e5fb58aee9768d459", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d5646a2d2cf835e5fb58aee9768d459");
                return;
            }
            this.h = false;
            e.this.removeCallbacks(this);
        }
    }
}
