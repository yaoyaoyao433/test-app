package com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.helper.h;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    View e;
    TextView f;
    protected d g;
    ValueAnimator h;
    private TextView i;
    private LinearLayout j;
    private FrameLayout k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private int p;
    private int q;
    private double r;
    private int s;
    private com.sankuai.waimai.bussiness.order.crossconfirm.a t;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_price_submit_a;
    }

    public c(Context context, @Nullable ViewStub viewStub, @NonNull com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(context, viewStub);
        Object[] objArr = {context, viewStub, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d76e41274e44c01f0305337319b51268", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d76e41274e44c01f0305337319b51268");
            return;
        }
        this.h = null;
        this.r = -1.0d;
        this.t = aVar;
        this.p = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_submit_b_rmb_symbol);
        this.q = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_submit_b_price_num);
        if (aVar.aM_()) {
            this.n.setTextSize(0, this.q);
            this.n.setTypeface(aVar.aN_());
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57d3b6503016bd5b11eca7de5173f611", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57d3b6503016bd5b11eca7de5173f611");
            return;
        }
        super.b();
        this.i = (TextView) this.b.findViewById(R.id.txt_total_price_discounts);
        this.j = (LinearLayout) this.b.findViewById(R.id.txt_total_price_discounts_ll);
        this.k = (FrameLayout) this.b.findViewById(R.id.txt_total_price_discounts_fl);
        this.l = (TextView) this.b.findViewById(R.id.txt_total_price_discounts_first);
        this.m = (TextView) this.b.findViewById(R.id.txt_total_price_discounts_second);
        this.e = this.b.findViewById(R.id.txt_order_submit);
        this.n = (TextView) this.b.findViewById(R.id.txt_total_price_discounted);
        this.f = (TextView) this.b.findViewById(R.id.txt_order_submit_content);
        this.o = (TextView) this.b.findViewById(R.id.text_vip_price_tips);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(double d2, boolean z, boolean z2) {
        Object[] objArr = {Double.valueOf(d2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "535d48f43e05c80f0199a11819e9d775", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "535d48f43e05c80f0199a11819e9d775");
            return;
        }
        Typeface aN_ = this.t.aN_();
        if (!z || z2) {
            h.a(this.n, this.c.getString(R.string.wm_order_base_price_with_rmb_symbol, com.sankuai.waimai.foundation.utils.h.a(d2)), aN_, this.p, this.q);
        } else {
            h.a(this.n, this.c.getString(R.string.wm_order_base_price_with_rmb_symbol, com.sankuai.waimai.foundation.utils.h.a(Double.valueOf(d2), 2, 2)), aN_, this.p, this.q);
        }
        this.n.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(d dVar, int i) {
        int i2;
        boolean z;
        Object[] objArr = {dVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b65345267482183612d251a61ad34b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b65345267482183612d251a61ad34b8");
        } else if (dVar == null) {
        } else {
            this.g = dVar;
            double d2 = (dVar.b != null && dVar.b.show && dVar.b.selected && com.sankuai.waimai.foundation.utils.h.d(Double.valueOf(dVar.b.price), Double.valueOf(0.0d))) ? dVar.b.price : 0.0d;
            double d3 = dVar.c;
            double d4 = dVar.d;
            double d5 = dVar.e;
            final double d6 = dVar.d;
            String string = this.c.getResources().getString(R.string.wm_order_confirm_to_pay_4);
            Object[] objArr2 = {Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5), (byte) 1, Double.valueOf(d6), string, Integer.valueOf(i), Double.valueOf(d2)};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "df987deb55157450a55e41d814ced0ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "df987deb55157450a55e41d814ced0ce");
                return;
            }
            double d7 = d3 - d4;
            double d8 = this.g.g;
            Object[] objArr3 = {Double.valueOf(d7), string, Double.valueOf(d5), Double.valueOf(d8), Double.valueOf(d2)};
            ChangeQuickRedirect changeQuickRedirect3 = d;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "05e8f38b532d6a3ee0a6b93c66658cd4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "05e8f38b532d6a3ee0a6b93c66658cd4");
            } else {
                Object[] objArr4 = {Double.valueOf(d2)};
                ChangeQuickRedirect changeQuickRedirect4 = d;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f64fd743bcf557538f5b5c542a48c912", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f64fd743bcf557538f5b5c542a48c912");
                } else if (com.sankuai.waimai.foundation.utils.h.d(Double.valueOf(d2), Double.valueOf(0.0d))) {
                    this.o.setVisibility(0);
                    this.o.setText(this.c.getString(R.string.wm_order_confirm_vip_price_tips, com.sankuai.waimai.foundation.utils.h.a(d2)));
                } else {
                    this.o.setVisibility(8);
                }
                if (this.t.aL_() == 0 || 2 == this.t.aL_()) {
                    Object[] objArr5 = {Double.valueOf(d8)};
                    ChangeQuickRedirect changeQuickRedirect5 = d;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1d017471386109e022401a098e443acf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1d017471386109e022401a098e443acf");
                    } else if (d8 > 0.0d) {
                        h.a(this.i, this.c.getString(R.string.wm_order_confirm_discount_value, com.sankuai.waimai.foundation.utils.h.a(d8)), this.t.aN_(), -1, -1, false);
                        this.i.setVisibility(0);
                        this.j.setVisibility(8);
                        this.k.setVisibility(0);
                    } else {
                        this.k.setVisibility(4);
                    }
                } else {
                    int i3 = (d7 > 0.0d ? 1 : (d7 == 0.0d ? 0 : -1));
                    if (i3 <= 0 && d5 <= 0.0d) {
                        this.k.setVisibility(4);
                    } else {
                        int i4 = (d7 > 0.0d ? 1 : (d7 == 0.0d ? 0 : -1));
                        if (i4 > 0 && d5 > 0.0d) {
                            this.l.setText(this.c.getString(R.string.wm_order_confirm_discount_value_total, com.sankuai.waimai.foundation.utils.h.a(d7 + d5)));
                            this.m.setText(this.c.getString(R.string.wm_order_confirm_discount_value_total_explanation, com.sankuai.waimai.foundation.utils.h.a(d7), com.sankuai.waimai.foundation.utils.h.a(d5)));
                            this.m.setVisibility(0);
                            i2 = 8;
                        } else {
                            if (i3 <= 0 && d5 > 0.0d) {
                                this.l.setText(this.c.getString(R.string.wm_order_confirm_discount_value_free_shipping, com.sankuai.waimai.foundation.utils.h.a(d5)));
                            } else if (i4 > 0 && d5 <= 0.0d) {
                                this.l.setText(this.c.getString(R.string.wm_order_confirm_discount_value_promotion, com.sankuai.waimai.foundation.utils.h.a(d7)));
                            }
                            i2 = 8;
                            this.m.setVisibility(8);
                        }
                        this.k.setVisibility(0);
                        this.j.setVisibility(0);
                        this.i.setVisibility(i2);
                    }
                }
            }
            if (this.s != i || (this.r != d6 && d6 >= 0.0d)) {
                this.s = i;
                if (this.r == -1.0d) {
                    a(d6, com.sankuai.waimai.foundation.utils.h.b(d6), true);
                    this.r = d6;
                    return;
                }
                double d9 = this.r;
                this.r = d6;
                double abs = Math.abs(d6 - d9);
                if (this.h != null && this.h.isRunning()) {
                    this.h.cancel();
                }
                if (com.sankuai.waimai.foundation.utils.h.b(d9) || com.sankuai.waimai.foundation.utils.h.b(d6)) {
                    z = true;
                    this.h = ValueAnimator.ofFloat((float) d9, (float) d6);
                    this.h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.c.1
                        public static ChangeQuickRedirect a;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Object[] objArr6 = {valueAnimator};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "20d571f38ac552ea9dc5124876bdf179", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "20d571f38ac552ea9dc5124876bdf179");
                                return;
                            }
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            if (com.sankuai.waimai.foundation.utils.h.b(Double.valueOf(valueAnimator.getAnimatedFraction()), Double.valueOf(1.0d))) {
                                c.this.a(floatValue, true, false);
                            }
                        }
                    });
                } else {
                    this.h = ValueAnimator.ofInt((int) d9, (int) d6);
                    this.h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.c.2
                        public static ChangeQuickRedirect a;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Object[] objArr6 = {valueAnimator};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "2945d9b1113bb9e819a189590393c33a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "2945d9b1113bb9e819a189590393c33a");
                                return;
                            }
                            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                            if (com.sankuai.waimai.foundation.utils.h.b(Double.valueOf(valueAnimator.getAnimatedFraction()), Double.valueOf(1.0d))) {
                                c.this.a(intValue, false, false);
                            }
                        }
                    });
                    z = false;
                }
                this.h.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.c.3
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
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e1a9dcda3cb337da02a42675038358a3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e1a9dcda3cb337da02a42675038358a3");
                            return;
                        }
                        c.this.a(d6, true, true);
                        c.this.h = null;
                    }
                });
                if ((!z && com.sankuai.waimai.foundation.utils.h.c(Double.valueOf(abs), Double.valueOf(5.0d))) || (z && com.sankuai.waimai.foundation.utils.h.c(Double.valueOf(abs), Double.valueOf(0.1d)))) {
                    this.h.setDuration(300L);
                } else {
                    this.h.setDuration(1000L);
                }
                this.h.start();
            }
        }
    }
}
