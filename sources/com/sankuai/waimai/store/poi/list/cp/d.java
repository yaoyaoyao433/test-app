package com.sankuai.waimai.store.poi.list.cp;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.Porcelain;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends HorizontalScrollView implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    public static ChangeQuickRedirect a;
    public Handler b;
    public Runnable c;
    public boolean d;
    private LinearLayout e;
    private Context f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private int k;
    private PoiVerticalityDataResponse l;
    private List<Porcelain> m;
    private Map<String, Object> n;
    private final int o;
    private int p;
    private int q;
    private final int r;
    private final int s;
    private com.sankuai.waimai.store.param.a t;
    private Map<String, String> u;
    private final String v;
    private Rect w;
    private List<c> x;
    private int y;

    public static /* synthetic */ void a(d dVar, int i, int i2) {
        int a2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "f8f15cf3daff78d5d2e2c8c7750f08da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "f8f15cf3daff78d5d2e2c8c7750f08da");
            return;
        }
        float f = ((i - dVar.q) / ((dVar.p * 1.0f) - dVar.q)) * dVar.p;
        float f2 = ((i - dVar.q) / ((dVar.p * 1.0f) - dVar.q)) * 12.0f;
        if (i != dVar.p) {
            a2 = Math.min(dVar.h + h.a(dVar.f, f + f2), h.a(dVar.f, (dVar.p + 12) * i2));
        } else {
            a2 = h.a(dVar.f, ((dVar.p + 12) * i2) + 1);
        }
        dVar.smoothScrollTo(a2, 0);
    }

    public static /* synthetic */ void b(d dVar, int i) {
        int a2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "4dad1296a7935fddb1272c3118121935", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "4dad1296a7935fddb1272c3118121935");
            return;
        }
        int max = Math.max(dVar.g - 1, 0);
        float f = (((dVar.p - i) * 1.0f) / (dVar.p - dVar.q)) * dVar.p;
        float round = Math.round(((((dVar.p - i) * 1.0f) / (dVar.p - dVar.q)) * 6.0f) + 12.0f);
        if (i != dVar.q) {
            a2 = Math.max(dVar.h - h.a(dVar.f, f + round), h.a(dVar.f, (dVar.p + 12) * max));
        } else {
            a2 = h.a(dVar.f, ((dVar.p + 12) * max) + 1);
        }
        dVar.smoothScrollTo(a2, 0);
    }

    public static /* synthetic */ void i(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "a3eb6366754bda6a85df034920b31320", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "a3eb6366754bda6a85df034920b31320");
            return;
        }
        if (dVar.g == 0 || dVar.g >= dVar.k * 2) {
            dVar.a(dVar.m, dVar.k, dVar.l, dVar.n);
            dVar.invalidate();
            dVar.c();
        }
        int i = 0;
        while (i < dVar.x.size()) {
            View childAt = dVar.e.getChildAt(i);
            if (childAt instanceof c) {
                c cVar = (c) childAt;
                cVar.getLayoutParams().width = h.a(dVar.f, i <= dVar.g ? dVar.p : dVar.q);
                cVar.a(dVar.m.get(i), i <= dVar.g);
                cVar.a(dVar.m.get(i), i <= dVar.g, 1.0f);
            }
            i++;
        }
    }

    public d(Context context, com.sankuai.waimai.store.param.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d63afa8244e2c954ec2acf25f13b7f24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d63afa8244e2c954ec2acf25f13b7f24");
            return;
        }
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = true;
        this.m = new ArrayList();
        this.o = 5000;
        this.p = TbsListener.ErrorCode.STARTDOWNLOAD_3;
        this.q = 86;
        this.r = 12;
        this.s = 6;
        this.u = new HashMap();
        this.v = "1";
        this.x = new ArrayList();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2deedefce619605a885297885bdcd1a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2deedefce619605a885297885bdcd1a4");
        } else {
            this.f = context;
            this.e = new LinearLayout(context);
            this.e.setOrientation(0);
            addView(this.e, -1, -1);
            b();
            this.w = new Rect(0, 0, h.a(getContext()), h.b(getContext()));
        }
        this.t = aVar;
    }

    public final void a(List<Porcelain> list, int i, PoiVerticalityDataResponse poiVerticalityDataResponse, Map<String, Object> map) {
        Object[] objArr = {list, Integer.valueOf(i), poiVerticalityDataResponse, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5415f5a4a5f05fda3a2b34896561b80b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5415f5a4a5f05fda3a2b34896561b80b");
            return;
        }
        this.m = list;
        this.k = i;
        this.l = poiVerticalityDataResponse;
        this.n = map;
        if (this.x.size() > 0) {
            this.x.clear();
        }
        if (this.k == 3) {
            double b = (h.b(this.f, h.a(this.f)) - 36) / 339.0d;
            this.p = (int) Math.ceil(167.0d * b);
            this.q = ((int) Math.ceil(b * 86.0d)) + 1;
        }
        this.e.removeAllViews();
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            Porcelain porcelain = this.m.get(i2);
            boolean isBigCard = porcelain.isBigCard();
            int i3 = isBigCard ? this.p : this.q;
            int i4 = isBigCard ? 12 : 6;
            c cVar = new c(this.f, this.t);
            cVar.a(porcelain, i2, i, poiVerticalityDataResponse, this.y, map);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(h.a(this.f, i3), -1);
            layoutParams.setMargins(h.a(this.f, i4), 0, 0, 0);
            cVar.setLayoutParams(layoutParams);
            cVar.a(this.k == 3, isBigCard, this.q, this.p);
            this.e.addView(cVar);
            this.x.add(cVar);
            if (!"1".equals(this.u.get(this.m.get(i2).blockId)) && com.sankuai.waimai.store.expose.v2.utils.a.a(cVar, this.w)) {
                this.u.put(this.m.get(i2).blockId, "1");
                cVar.b(this.f, this.m.get(i2), i2, i);
            }
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6542c92d0aa49e7a014a0c129db2952", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6542c92d0aa49e7a014a0c129db2952");
            return;
        }
        if (this.j) {
            c();
            this.j = false;
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb1f3f655f1d029c818ad65f2671c081", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb1f3f655f1d029c818ad65f2671c081");
            return;
        }
        for (int i = 0; i < this.x.size(); i++) {
            if (com.sankuai.waimai.store.expose.v2.utils.a.a(this.x.get(i), this.w) && !"1".equals(this.u.get(this.m.get(i).blockId)) && com.sankuai.waimai.store.expose.v2.utils.a.a(this.x.get(i), this.w)) {
                this.u.put(this.m.get(i).blockId, "1");
                this.x.get(i).b(this.f, this.m.get(i), i, this.k);
            }
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe30b038e1d08852646b8d836ac4aa1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe30b038e1d08852646b8d836ac4aa1e");
            return;
        }
        this.i = false;
        this.g = this.k;
        this.h = h.a(this.f, ((this.p + 12) * this.g) + 1);
        scrollTo(this.h, 0);
        smoothScrollTo(this.h, 0);
        if (this.b == null) {
            a();
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        int a2;
        int a3;
        int a4;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77b6f11f5addd299fad0a5e37dbf6237", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77b6f11f5addd299fad0a5e37dbf6237");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (this.i) {
            int scrollX = getScrollX() - this.h;
            int a5 = h.a(this.f, this.p);
            int b = h.b(this.f, scrollX);
            if (scrollX > 0) {
                int min = Math.min(this.g + 1, this.e.getChildCount() - 1);
                View childAt = this.e.getChildAt(min);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                int a6 = scrollX < a5 ? h.a(this.f, ((b / this.p) * (this.p - this.q)) + this.q) : a5;
                if (scrollX < a5) {
                    a4 = h.a(this.f, ((b / this.p) * 6.0f) + 6.0f);
                } else {
                    a4 = h.a(this.f, 12.0f);
                }
                layoutParams.width = a6;
                layoutParams.leftMargin = a4;
                childAt.setLayoutParams(layoutParams);
                if (childAt instanceof c) {
                    float min2 = (Math.min(scrollX, a5) * 1.0f) / a5;
                    c cVar = (c) childAt;
                    cVar.a(((((b * 1.0f) / this.p) * (this.p - this.q)) + this.q) / (this.p * 1.0f), min2, true);
                    cVar.a(this.m.get(min), true, min2);
                    cVar.a(min2);
                    return;
                }
                return;
            }
            View childAt2 = this.e.getChildAt(this.g);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            if (Math.abs(scrollX) < a5) {
                a2 = h.a(this.f, ((b / this.p) * (this.p - this.q)) + this.p);
            } else {
                a2 = h.a(this.f, this.q);
            }
            layoutParams2.width = a2;
            if (Math.abs(scrollX) < a5) {
                a3 = h.a(this.f, ((b / this.p) * 6.0f) + 12.0f);
            } else {
                a3 = h.a(this.f, 6.0f);
            }
            layoutParams2.leftMargin = a3;
            childAt2.setLayoutParams(layoutParams2);
            if (childAt2 instanceof c) {
                float min3 = (Math.min(Math.abs(scrollX), a5) * 1.0f) / a5;
                c cVar2 = (c) childAt2;
                cVar2.a(((((b * 1.0f) / this.p) * (this.p - this.q)) + this.q) / (this.p * 1.0f), min3, false);
                cVar2.a(this.m.get(this.g), false, min3);
                cVar2.a(1.0f - min3);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7484f9260850a6ed46943876f65a5445", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7484f9260850a6ed46943876f65a5445")).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 1:
                this.i = false;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e56117064731e6ade095b03002dd7f81", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e56117064731e6ade095b03002dd7f81");
                } else if (getScrollX() - this.h > 0) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a590d9c738ec4fb840f0099aa6feb0d4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a590d9c738ec4fb840f0099aa6feb0d4");
                    } else {
                        int min = Math.min(this.g + 1, this.e.getChildCount() - 2);
                        if (min != this.e.getChildCount() - 2) {
                            int b = h.b(this.f, ((LinearLayout.LayoutParams) this.e.getChildAt(min).getLayoutParams()).width);
                            a(b, this.p, (500 / (this.p - this.q)) * (this.p - b));
                        }
                    }
                } else {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ab018812ac52d68a6fec5e94d9e3b398", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ab018812ac52d68a6fec5e94d9e3b398");
                    } else if (this.g != 0) {
                        int b2 = h.b(this.f, ((LinearLayout.LayoutParams) this.e.getChildAt(this.g).getLayoutParams()).width);
                        int i = this.q;
                        int i2 = (500 / (this.p - this.q)) * (b2 - this.q);
                        Object[] objArr5 = {Integer.valueOf(b2), Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5ed4dc5c7744139122e1e7f06183ad71", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5ed4dc5c7744139122e1e7f06183ad71");
                        } else {
                            final View childAt = this.e.getChildAt(this.g);
                            ValueAnimator ofInt = ValueAnimator.ofInt(b2, i);
                            ofInt.setDuration(i2);
                            ofInt.start();
                            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.poi.list.cp.d.4
                                public static ChangeQuickRedirect a;

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    Object[] objArr6 = {valueAnimator};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "84606e36d312571accf6a093f28cf731", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "84606e36d312571accf6a093f28cf731");
                                        return;
                                    }
                                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                                    float f = intValue;
                                    layoutParams.width = h.a(d.this.f, f);
                                    layoutParams.leftMargin = h.a(d.this.f, Math.round(((((intValue - d.this.p) * 1.0f) / (d.this.p - d.this.q)) * 6.0f * 1.0f) + 12.0f));
                                    childAt.setLayoutParams(layoutParams);
                                    if (childAt instanceof c) {
                                        float f2 = 1.0f - (((intValue - d.this.q) * 1.0f) / (d.this.p - d.this.q));
                                        ((c) childAt).a(((((f * 1.0f) / d.this.p) * (d.this.p - d.this.q)) + d.this.q) / (d.this.p * 1.0f), f2, false);
                                        ((c) childAt).a((Porcelain) d.this.m.get(d.this.g), false, f2);
                                        ((c) childAt).a(1.0f - f2);
                                    }
                                    d.b(d.this, intValue);
                                }
                            });
                            ofInt.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.store.poi.list.cp.d.5
                                public static ChangeQuickRedirect a;

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationCancel(Animator animator) {
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationRepeat(Animator animator) {
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    Object[] objArr6 = {animator};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "792bc6a13665f9a0f6c7a0d83db58d7b", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "792bc6a13665f9a0f6c7a0d83db58d7b");
                                        return;
                                    }
                                    ((LinearLayout.LayoutParams) childAt.getLayoutParams()).leftMargin = h.a(d.this.f, 6.0f);
                                    if (childAt instanceof c) {
                                        ((c) childAt).a((Porcelain) d.this.m.get(d.this.g), false);
                                    }
                                    d.this.g = Math.max(d.this.g - 1, 0);
                                    if (d.this.g > 0 && d.this.g < d.this.k * 2) {
                                        d.this.h = h.a(d.this.f, ((d.this.p + 12) * d.this.g) + 1);
                                    }
                                    d.i(d.this);
                                }
                            });
                        }
                    }
                }
                if (this.b == null) {
                    a();
                    return true;
                }
                return true;
            case 2:
                this.i = true;
                if (this.b != null) {
                    this.b.removeCallbacks(this.c);
                }
                this.b = null;
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "564df0934e97bc2cd7f8f8fa89fbc0f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "564df0934e97bc2cd7f8f8fa89fbc0f1");
        } else if (this.k < 2) {
        } else {
            if (this.b == null) {
                this.b = new Handler();
            }
            if (this.c == null) {
                this.c = new Runnable() { // from class: com.sankuai.waimai.store.poi.list.cp.d.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2570fa54ba14345fb1f558a878f62579", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2570fa54ba14345fb1f558a878f62579");
                            return;
                        }
                        if (!d.this.i) {
                            d.this.a(d.this.q, d.this.p, 500);
                        }
                        d.this.b.postDelayed(d.this.c, MetricsAnrManager.ANR_THRESHOLD);
                    }
                };
            }
            this.b.postDelayed(this.c, MetricsAnrManager.ANR_THRESHOLD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dddcfa88001a48b959fa3aad7c0b227", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dddcfa88001a48b959fa3aad7c0b227");
            return;
        }
        this.g = Math.min(this.g + 1, this.e.getChildCount() - 2);
        if (this.g == this.e.getChildCount() - 2) {
            return;
        }
        b(i, i2, i3);
    }

    private void b(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6338b7b442902391e9524c8c90a82eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6338b7b442902391e9524c8c90a82eb");
            return;
        }
        final View childAt = this.e.getChildAt(this.g);
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(i3);
        ofInt.start();
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.poi.list.cp.d.2
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32d2162faca42b1554ae11e5a6b591dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32d2162faca42b1554ae11e5a6b591dc");
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                float f = intValue;
                layoutParams.width = h.a(d.this.f, f);
                float f2 = f * 1.0f;
                layoutParams.leftMargin = h.a(d.this.f, Math.round(f2 / (d.this.p - d.this.q)) + 8);
                childAt.setLayoutParams(layoutParams);
                d dVar = d.this;
                d.a(dVar, intValue, dVar.g);
                if (childAt instanceof c) {
                    float f3 = ((intValue - d.this.q) * 1.0f) / (d.this.p - d.this.q);
                    ((c) childAt).a((((f2 / d.this.p) * (d.this.p - d.this.q)) + d.this.q) / (d.this.p * 1.0f), f3, true);
                    ((c) childAt).a((Porcelain) d.this.m.get(d.this.g), true, f3);
                    ((c) childAt).a(f3);
                }
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.store.poi.list.cp.d.3
            public static ChangeQuickRedirect a;

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f45963e67a9fb7aa3a22973c9d04ebb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f45963e67a9fb7aa3a22973c9d04ebb");
                    return;
                }
                ((LinearLayout.LayoutParams) childAt.getLayoutParams()).leftMargin = h.a(d.this.f, 12.0f);
                if (childAt instanceof c) {
                    ((c) childAt).a((Porcelain) d.this.m.get(d.this.g), true);
                    d.this.h = h.a(d.this.f, ((d.this.p + 12) * d.this.g) + 1);
                }
                d.i(d.this);
            }
        });
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65bb932459d8ce09f10ef8676579d2e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65bb932459d8ce09f10ef8676579d2e1");
        } else if (this.u.isEmpty()) {
        } else {
            this.u.clear();
        }
    }

    public final void a(int i, int i2, ArrayList<String> arrayList) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5318f8eb9a9ef3c795c78ed3f22c9ebb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5318f8eb9a9ef3c795c78ed3f22c9ebb");
            return;
        }
        this.y = i2;
        if (this.e != null) {
            for (int i3 = 0; i3 < this.e.getChildCount(); i3++) {
                c cVar = (c) this.e.getChildAt(i3);
                if (cVar != null) {
                    cVar.a(i, i2, arrayList);
                }
            }
        }
    }
}
