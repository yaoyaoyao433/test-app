package com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.AttrRes;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.dianping.picasso.view.scroller.CustomizedScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.label.RooLabel;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.db.dao.DaoMaster;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.meituan.android.cube.pga.view.a<FrameLayout> implements View.OnClickListener, g.a {
    public static ChangeQuickRedirect d;
    int e;
    int f;
    int g;
    g h;
    a i;
    boolean j;
    private ViewGroup k;
    private ViewGroup l;
    private int m;
    private int n;
    private ValueAnimator o;
    private ObjectAnimator p;
    private int q;
    private ViewGroup.LayoutParams r;
    private ViewGroup.LayoutParams s;
    private AnimatorSet t;
    private int u;
    private int v;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i);
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_view_list_diners_count_selector;
    }

    public e(Context context, View view) {
        super(context, view);
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44a2db3359bcb7c876b9493730f85bf1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44a2db3359bcb7c876b9493730f85bf1");
            return;
        }
        this.e = 0;
        this.f = 0;
        this.g = 15;
        this.q = Integer.MIN_VALUE;
        this.v = 0;
        this.j = false;
        this.k = (ViewGroup) view.findViewById(R.id.order_confirm_tableware_layout_container1);
        this.l = (ViewGroup) view.findViewById(R.id.order_confirm_tableware_layout_container2);
        this.m = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_tableware_selector_container_1_height);
        this.n = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_tableware_selector_container_2_height);
        this.r = this.l.getLayoutParams();
        this.s = view.getLayoutParams();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a3243c68eef49af6e156deea5c9de1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a3243c68eef49af6e156deea5c9de1c");
            return;
        }
        View childAt = ((FrameLayout) this.b).getChildAt(0);
        if (childAt instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) childAt;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = viewGroup.getChildAt(i2);
                if (childAt2 instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) childAt2;
                    int childCount2 = viewGroup2.getChildCount();
                    int i3 = i;
                    for (int i4 = 0; i4 < childCount2; i4++) {
                        View childAt3 = viewGroup2.getChildAt(i4);
                        if (i3 == 7) {
                            this.h = new g(this.c, childAt3, 7, this.g);
                            this.h.h = this;
                        }
                        childAt3.setOnClickListener(this);
                        childAt3.setTag(Integer.valueOf(i3));
                        i3++;
                    }
                    i = i3;
                }
            }
        }
    }

    private void c(View view, boolean z) {
        String str;
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3de4b61c42acfa2230af242716c6d7b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3de4b61c42acfa2230af242716c6d7b8");
        } else if (z) {
        } else {
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1673c6c88b3d7b5438b786570ddd9f7e", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1673c6c88b3d7b5438b786570ddd9f7e");
            } else {
                str = "";
                if (view instanceof RooLabel) {
                    str = ((RooLabel) view).getText().toString();
                } else if (this.h != null) {
                    g gVar = this.h;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = g.d;
                    str = PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "8b29c8dbee0c136caefe31f5f84b2671", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "8b29c8dbee0c136caefe31f5f84b2671") : String.format(gVar.g, gVar.e);
                }
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JudasManualManager.a("b_waimai_xavndgli_mc").a("c_ykhs39e").a("button_name", str).a(this.c).a();
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.g.a
    public final void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d43211e03c86b739cd58fb73969d8758", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d43211e03c86b739cd58fb73969d8758");
        } else {
            a(view, false);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5496bf2408db65125f98f4ee37d14846", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5496bf2408db65125f98f4ee37d14846");
        } else {
            a(view, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19a6ddcc84531e3d5dcfe72e88f822dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19a6ddcc84531e3d5dcfe72e88f822dc");
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue == 3 && !this.j) {
            a(true, z);
            return;
        }
        this.f = intValue == 7 ? this.h.e() : intValue;
        if (this.i != null) {
            this.i.a(this.f);
        }
        c(view, z);
        if (intValue == this.e) {
            return;
        }
        b(view, true);
        b(a(this.e), false);
        this.e = intValue;
    }

    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d88d6bc1aad34f7907a626cc99b70270", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d88d6bc1aad34f7907a626cc99b70270");
            return;
        }
        View a2 = a(3);
        if (a2 != null) {
            this.j = z;
            if (this.j) {
                ((RooLabel) a2).setText("3 份");
                if (z2) {
                    this.l.setVisibility(0);
                    return;
                } else {
                    c(103);
                    return;
                }
            }
            ((RooLabel) a2).setText("更多");
            this.l.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bbd294220bbf5fc1fdbf81911431e12", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bbd294220bbf5fc1fdbf81911431e12");
        }
        if (i >= 4) {
            return this.l.getChildAt(i - 4);
        }
        return this.k.getChildAt(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c3d25a3166c639f92fb479ef106c856", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c3d25a3166c639f92fb479ef106c856");
        } else if (view instanceof RooLabel) {
            RooLabel rooLabel = (RooLabel) view;
            if (z) {
                rooLabel.setBackgroundColor(Color.parseColor("#FFF8E1"));
                rooLabel.setStrokeColor(a(this.c, R.attr.rooBrandWarning, Color.parseColor("#FF8000")));
                rooLabel.setTextColor(Color.parseColor("#FF8000"));
                rooLabel.setContentDescription(rooLabel.getText().toString() + ", 已选中");
                return;
            }
            rooLabel.setBackgroundColor(-1);
            rooLabel.setStrokeColor(a(this.c, R.attr.rooGray, Color.parseColor("#D3D3D3")));
            rooLabel.setTextColor(Color.parseColor("#575859"));
            rooLabel.setContentDescription(rooLabel.getText().toString());
        } else {
            this.h.a(z);
        }
    }

    @ColorInt
    private int a(@NonNull Context context, @AttrRes int i, @ColorInt int i2) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dc316b5484e10e521fb7cba9653200b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dc316b5484e10e521fb7cba9653200b")).intValue();
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i, typedValue, true) ? typedValue.data : i2;
    }

    public final void b(int i) {
        Object[] objArr = {8};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08a77f615b1bede917eb283b9dc37f3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08a77f615b1bede917eb283b9dc37f3c");
        } else {
            ((FrameLayout) this.b).setVisibility(8);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bab29813533ba14037e6309ea2d4418", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bab29813533ba14037e6309ea2d4418");
        } else if (this.j) {
            ((FrameLayout) this.b).setVisibility(0);
            d(this.m + this.n);
            ((FrameLayout) this.b).setAlpha(1.0f);
            e(this.n);
            this.l.setAlpha(1.0f);
        } else {
            ((FrameLayout) this.b).setVisibility(0);
            d(this.m);
            ((FrameLayout) this.b).setAlpha(1.0f);
        }
    }

    private void a(Animator animator) {
        Object[] objArr = {animator};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "882b5405cd47e2005f6355e1e1e1e7b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "882b5405cd47e2005f6355e1e1e1e7b0");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "acb0d859e3709e124855c6eb676430bd", RobustBitConfig.DEFAULT_VALUE)) {
            switch (this.q) {
                case 101:
                    this.u = this.m;
                    break;
                case 102:
                    this.u = 0;
                    break;
                case 103:
                    this.u = this.n;
                    break;
                default:
                    this.u = ((FrameLayout) this.b).getMeasuredHeight();
                    break;
            }
        } else {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "acb0d859e3709e124855c6eb676430bd");
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = d;
        if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3fd8dc473fcb2cd7fa6784bb462929d4", RobustBitConfig.DEFAULT_VALUE)) {
            switch (this.q) {
                case 101:
                    this.v = 350;
                    break;
                case 102:
                    this.v = CustomizedScrollView.ANIMATED_SCROLL_GAP;
                    break;
                case 103:
                    this.v = DaoMaster.SCHEMA_VERSION;
                    break;
                default:
                    this.v = 0;
                    break;
            }
        } else {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3fd8dc473fcb2cd7fa6784bb462929d4");
        }
        this.o = ValueAnimator.ofInt((this.q == 103 || animator != null) ? 0 : ((FrameLayout) this.b).getMeasuredHeight(), this.u);
        if (this.q == 103) {
            this.o.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.e.1
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr4 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0fabddc8b107f98d4ff873fac5ebf161", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0fabddc8b107f98d4ff873fac5ebf161");
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    e eVar = e.this;
                    eVar.d(eVar.m + intValue);
                    e.this.e(intValue);
                }
            });
        } else {
            this.o.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.e.2
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr4 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6f5c3b11f9d6b4121b06f7514c4f811f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6f5c3b11f9d6b4121b06f7514c4f811f");
                    } else {
                        e.this.d(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                }
            });
        }
        this.o.setDuration(this.v);
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0de403132aea47ffe5af0059009e45dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0de403132aea47ffe5af0059009e45dd");
        } else if (this.q == 101) {
            this.p = ObjectAnimator.ofFloat(this.b, "alpha", 0.0f, 1.0f);
            this.p.setStartDelay(this.v / 2);
            this.p.setDuration(this.v);
        } else if (this.q == 102) {
            this.p = ObjectAnimator.ofFloat(this.b, "alpha", 0.9f, 0.0f);
            this.p.setDuration(this.v / 3);
            this.p.setInterpolator(new AccelerateDecelerateInterpolator());
        } else {
            this.p = ObjectAnimator.ofFloat(this.l, "alpha", 0.0f, 1.0f);
            this.p.setStartDelay(this.v / 2);
            this.p.setDuration(this.v);
        }
    }

    private void c(int i) {
        Object[] objArr = {103};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fee7085a691bc6dc4552a18d83ba3d51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fee7085a691bc6dc4552a18d83ba3d51");
        } else {
            a(103, (AnimatorSet) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9c2ada6324fc574a8e7b3df1ab1f6be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9c2ada6324fc574a8e7b3df1ab1f6be");
            return;
        }
        this.s.height = i;
        ((FrameLayout) this.b).setLayoutParams(this.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d47541f92a8f12f4661dd2b7f6eb3851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d47541f92a8f12f4661dd2b7f6eb3851");
            return;
        }
        this.r.height = i;
        this.l.setLayoutParams(this.r);
    }

    public final void a(final int i, AnimatorSet animatorSet) {
        Object[] objArr = {Integer.valueOf(i), animatorSet};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f37960ee9fa7e1df9b8cdd426e4137a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f37960ee9fa7e1df9b8cdd426e4137a");
            return;
        }
        this.q = i;
        if (this.t != null && this.t.isRunning()) {
            this.t.cancel();
        }
        this.t = new AnimatorSet();
        a(animatorSet);
        f();
        if (animatorSet != null && this.p != null) {
            this.t.playTogether(this.o, animatorSet, this.p);
        } else if (this.p != null) {
            this.t.playTogether(this.o, this.p);
        } else {
            this.t.playTogether(this.o);
        }
        this.t.addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.e.3
            public static ChangeQuickRedirect a;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fb645ead091def2a673b9ffdfdb8a7d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fb645ead091def2a673b9ffdfdb8a7d");
                    return;
                }
                super.onAnimationStart(animator);
                if (i == 101) {
                    e.this.d(0);
                    ((FrameLayout) e.this.b).setAlpha(0.0f);
                    ((FrameLayout) e.this.b).setVisibility(0);
                } else if (i == 103) {
                    e.this.e(0);
                    e.this.l.setAlpha(0.0f);
                    e.this.l.setVisibility(0);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45671386b64cd2dd72b180603f340caf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45671386b64cd2dd72b180603f340caf");
                    return;
                }
                super.onAnimationEnd(animator);
                if (i == 102) {
                    ((FrameLayout) e.this.b).setVisibility(8);
                }
                e.this.t.removeListener(this);
            }
        });
        this.t.start();
    }
}
