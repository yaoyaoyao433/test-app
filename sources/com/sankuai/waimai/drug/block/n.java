package com.sankuai.waimai.drug.block;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCart;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class n extends com.sankuai.waimai.store.base.b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    public final com.sankuai.waimai.store.shopping.cart.contract.a b;
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    private final int d;
    private final SCPageConfig e;
    private TextView f;
    private TextView g;
    private LinearLayout h;
    private View i;
    private TextView j;
    private com.sankuai.waimai.store.expose.v2.entity.b k;
    private TextView l;
    private float m;

    public n(com.sankuai.waimai.store.shopping.cart.contract.a aVar, int i) {
        super(aVar.i());
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d4b9295ba22cc73f6a780db190a074d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d4b9295ba22cc73f6a780db190a074d");
            return;
        }
        this.b = aVar;
        this.c = aVar.g();
        this.d = i;
        this.e = aVar.h();
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6676c13de73efec398fb52191ceeec8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6676c13de73efec398fb52191ceeec8c");
            return;
        }
        super.onViewCreated();
        this.f = (TextView) this.mView.findViewById(R.id.text_shop_cart_try_lucky_tips);
        this.g = (TextView) this.mView.findViewById(R.id.text_shop_cart_try_lucky_tag);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7ac937ed291c707ec5b2e0cffd8f6a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7ac937ed291c707ec5b2e0cffd8f6a0");
        } else if (com.sankuai.waimai.store.order.a.e().k(this.c.d()).e.b("prompt_stripe_type") == 1) {
            this.h = (LinearLayout) this.mView.findViewById(R.id.text_shop_cart_try_lucky_tips_new_guest_container);
            this.l = (TextView) this.mView.findViewById(R.id.text_shop_cart_try_lucky_tips_end);
            this.j = (TextView) this.mView.findViewById(R.id.text_shop_cart_try_lucky_tips_new_guest);
            this.i = this.mView.findViewById(R.id.shop_cart_try_lucky_tips_new_guest_line);
            this.i.setBackground(new e.a().c(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_4D222426)).a(com.sankuai.shangou.stone.util.h.a(this.mContext, 0.5f)).a());
            this.f.getViewTreeObserver().addOnDrawListener(new ViewTreeObserver.OnDrawListener() { // from class: com.sankuai.waimai.drug.block.n.1
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b290bd130aeee9f8853448087a059d65", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b290bd130aeee9f8853448087a059d65");
                    } else if (n.this.m <= 0.0f) {
                        u.c(n.this.l);
                    } else if (n.this.f.getMeasuredWidth() >= n.this.m) {
                        u.c(n.this.l);
                    } else {
                        u.a(n.this.l);
                    }
                }
            });
        }
        this.mView.setOnClickListener(this);
        this.k = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_gk84w5dj_mv", this.g);
        if (this.g != null) {
            this.g.setVisibility(8);
        }
        a((PoiShoppingCart.TaskActivity) null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0c127a5e3c34696a2e8ac51739beac5", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0c127a5e3c34696a2e8ac51739beac5");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.tip.b a2 = com.sankuai.waimai.store.order.a.e().k(this.c.d()).k().a().a();
        switch (a2.a) {
            case 1:
                if (this.b != null) {
                    this.b.a(a2.d, true);
                    break;
                }
                break;
            case 2:
                String plusScheme = this.c.b.getPlusScheme();
                if (!t.a(plusScheme)) {
                    com.sankuai.waimai.store.router.d.a(this.mContext, plusScheme);
                    break;
                }
                break;
            case 3:
                com.sankuai.waimai.drug.event.a aVar = (com.sankuai.waimai.drug.event.a) com.sankuai.waimai.store.event.h.a().a((Class<com.sankuai.waimai.store.event.d>) com.sankuai.waimai.drug.event.a.class);
                break;
            case 4:
                if (!t.a(a2.f) && b(a2)) {
                    com.sankuai.waimai.store.router.d.a(this.mContext, a2.f);
                    break;
                }
                break;
        }
        com.sankuai.waimai.store.manager.judas.b.a(this.e.d, "b_waimai_gk84w5dj_mc").a("poi_id", this.c.d()).a("button_code", Integer.valueOf(a2.a)).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.c.v())).a("stid", com.sankuai.waimai.drug.util.c.a(this.c)).a("collect_type", Integer.valueOf(d(a2))).a();
    }

    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.tip.d dVar, PoiShoppingCart.TaskActivity taskActivity, boolean z) {
        boolean z2;
        Object[] objArr = {dVar, taskActivity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeaef58bada50fbaade46aa56f302dc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeaef58bada50fbaade46aa56f302dc5");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.tip.b a2 = dVar.a();
        if (z) {
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a214d9632d3517e10acd0b663e18fc33", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a214d9632d3517e10acd0b663e18fc33")).booleanValue();
            } else {
                z2 = a2 != null && (a2.a == 1 || a2.a == 4);
            }
            if (z2) {
                hide();
                return;
            }
        }
        Object[] objArr3 = {a2, taskActivity};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ce36cba6350e9b486bb88116681b08ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ce36cba6350e9b486bb88116681b08ed");
        } else if (this.g != null) {
            if (!t.a(a2.c)) {
                com.sankuai.waimai.store.shopping.cart.cache.a aVar = com.sankuai.waimai.store.order.a.e().k(this.c.d()).e;
                if (aVar != null && aVar.b("prompt_stripe_type") == 1) {
                    Object[] objArr4 = {a2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c3020a8f91d45bc17542a48d4d5bfe2b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c3020a8f91d45bc17542a48d4d5bfe2b");
                    } else {
                        this.g.setText(a2.c);
                        this.g.setBackground(new e.a().c(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_FFCC33)).a(com.sankuai.waimai.store.util.b.c(this.mContext, R.dimen.wm_sc_common_dimen_10)).a());
                    }
                } else if (a2.a()) {
                    Object[] objArr5 = {a2};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "67e7a1443bbe6d174a6aa16d96f16f27", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "67e7a1443bbe6d174a6aa16d96f16f27");
                    } else {
                        this.g.setText(a2.c);
                        this.g.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_333333));
                        this.g.setIncludeFontPadding(false);
                        this.g.setBackground(com.sankuai.waimai.store.util.e.b(this.mContext, (int) R.color.wm_sg_color_FFC43A, (int) R.dimen.wm_sc_common_dimen_10));
                        this.g.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, com.sankuai.waimai.store.util.e.a(this.mContext, (int) R.drawable.wm_drug_order_cofirm_drug_risk_arrow_right, com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_333333)), (Drawable) null);
                        this.g.setPadding(com.sankuai.shangou.stone.util.h.a(this.mContext, 10.0f), com.sankuai.shangou.stone.util.h.a(this.mContext, 2.5f), com.sankuai.shangou.stone.util.h.a(this.mContext, 5.0f), com.sankuai.shangou.stone.util.h.a(this.mContext, 2.5f));
                    }
                } else if (a2.e == 3) {
                    Object[] objArr6 = {a2};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "72cc77ac431bf372b94ebd75c3030252", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "72cc77ac431bf372b94ebd75c3030252");
                    } else {
                        this.g.setText(a2.c);
                        this.g.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_FF8001));
                        this.g.setIncludeFontPadding(false);
                        this.g.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, com.sankuai.waimai.store.util.e.a(this.mContext, (int) R.drawable.wm_drug_order_cofirm_drug_risk_arrow_right, com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_FF8001)), (Drawable) null);
                        this.g.setTypeface(null, 1);
                    }
                } else {
                    Object[] objArr7 = {a2};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "b5e47df2815f889481d17d65439574cd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "b5e47df2815f889481d17d65439574cd");
                    } else {
                        this.g.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                        this.g.setBackground(null);
                        this.g.setPadding(0, 0, 0, 0);
                        this.g.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_st_common_FE6D27));
                        this.g.setText(com.sankuai.waimai.store.util.l.b(a2.c, this.mContext.getString(R.string.wm_st_shop_cart_try_lucy_color)), TextView.BufferType.SPANNABLE);
                    }
                }
            }
            Object[] objArr8 = {a2, taskActivity};
            ChangeQuickRedirect changeQuickRedirect8 = a;
            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "572799a2ca2dd49d43e6005e333996bf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "572799a2ca2dd49d43e6005e333996bf");
            } else {
                if (b(a2)) {
                    this.g.setVisibility(0);
                    if (this.k != null && (this.mContext instanceof SCBaseActivity)) {
                        this.k.a("poi_id", this.c.d());
                        this.k.a("button_code", Integer.valueOf(a2.a));
                        this.k.a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.c.v()));
                        this.k.a("collect_type", Integer.valueOf(d(a2)));
                        this.k.a("stid", com.sankuai.waimai.drug.util.c.a(this.c));
                        com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) this.mContext, this.k);
                    } else {
                        com.sankuai.waimai.store.manager.judas.b.b(this.e.d, "b_waimai_gk84w5dj_mv").a("poi_id", this.c.d()).a("button_code", Integer.valueOf(a2.a)).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.c.v())).a("collect_type", Integer.valueOf(d(a2))).a("stid", com.sankuai.waimai.drug.util.c.a(this.c)).a();
                    }
                } else {
                    this.g.setVisibility(8);
                }
                this.f.setMaxWidth(Integer.MAX_VALUE);
            }
        }
        a(taskActivity);
    }

    private void a(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.tip.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53e2ec7f5d757b3879aea9ef0725e01e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53e2ec7f5d757b3879aea9ef0725e01e");
        } else if (this.d != 1) {
            if (this.b.c() || this.d != 2) {
                return;
            }
            show();
        } else if (bVar.a == 2) {
            hide();
        } else {
            show();
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b95b0d722a0130d703254f17e8173745", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b95b0d722a0130d703254f17e8173745");
        } else {
            u.a(this.mView, -1, com.sankuai.shangou.stone.util.h.a(this.mContext, i));
        }
    }

    private void a(@Nullable PoiShoppingCart.TaskActivity taskActivity) {
        Object[] objArr = {taskActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25291613ab354d42cba4fb72f6c1a6a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25291613ab354d42cba4fb72f6c1a6a8");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.tip.d a2 = com.sankuai.waimai.store.order.a.e().k(this.c.d()).k().a();
        String str = a2.b;
        String o = this.c.o();
        String p = this.c.p();
        if (!TextUtils.isEmpty(str)) {
            u.a(this.f);
            u.c(this.h);
            this.m = a(str);
            a(com.sankuai.waimai.store.util.l.b(str, com.sankuai.waimai.store.util.b.a((int) R.string.wm_st_shop_cart_try_lucy_color)));
            a(a2.a());
        } else if (!TextUtils.isEmpty(o)) {
            u.a(this.f);
            Spanned b = com.sankuai.waimai.store.util.l.b(o, com.sankuai.waimai.store.util.b.a((int) R.string.wm_st_shop_cart_try_lucy_color));
            this.m = a(o);
            a(b);
            a(a2.a());
            a(this.c.p(), true);
        } else if (!TextUtils.isEmpty(p)) {
            u.c(this.f);
            a(this.c.p(), false);
            a(a2.a());
        } else {
            hide();
        }
    }

    private float a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5046a63802245c87254cdcdb8dfd946", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5046a63802245c87254cdcdb8dfd946")).floatValue();
        }
        String replace = str.replace("<highlight>", "").replace("</highlight>", "");
        Paint paint = new Paint();
        paint.setTextSize(com.sankuai.shangou.stone.util.h.c(this.mContext, 12.0f));
        return paint.measureText(replace);
    }

    private void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5545604e081cf1283d414ede0437b715", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5545604e081cf1283d414ede0437b715");
        } else if (TextUtils.isEmpty(str)) {
            u.c(this.h);
        } else if (com.sankuai.waimai.store.order.a.e().a(this.c.d()) > 0) {
            u.c(this.h);
        } else {
            u.a(this.h);
            if (z) {
                u.a(this.i);
            } else {
                u.c(this.i);
            }
            Spanned b = com.sankuai.waimai.store.util.l.b(str, com.sankuai.waimai.store.util.b.a((int) R.string.wm_st_shop_cart_try_lucy_color));
            if (this.j != null) {
                u.a(this.j);
                this.j.setText(b, TextView.BufferType.SPANNABLE);
            }
        }
    }

    private boolean c(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.tip.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c321c8150aa035a142cd8dff637ed4c2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c321c8150aa035a142cd8dff637ed4c2")).booleanValue();
        }
        return (this.e.e != 1 && this.e.e != 9 && bVar.a == 3) || (this.e.e == 7 && bVar.a == 4);
    }

    private void a(Spanned spanned) {
        Object[] objArr = {spanned};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "104485b9cf2cd5d8f2574ec23d6495e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "104485b9cf2cd5d8f2574ec23d6495e0");
        } else if (this.f != null) {
            this.f.setText(spanned, TextView.BufferType.SPANNABLE);
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        Object[] objArr = {0, Integer.MIN_VALUE, 0, Integer.MIN_VALUE};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "221e45323c09f0fbe1172d0e23f80517", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "221e45323c09f0fbe1172d0e23f80517");
        } else {
            u.d(this.mView, b(0), b(Integer.MIN_VALUE), b(0), b(Integer.MIN_VALUE));
        }
    }

    private int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5e764be342498a12c636ca0812c4ff0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5e764be342498a12c636ca0812c4ff0")).intValue();
        }
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return com.sankuai.shangou.stone.util.h.a(this.mContext, i);
    }

    private boolean b(com.sankuai.waimai.store.platform.domain.core.shopcart.tip.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c289da2ca73ec91338dc2f45b1750598", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c289da2ca73ec91338dc2f45b1750598")).booleanValue() : (bVar == null || t.a(bVar.c) || c(bVar)) ? false : true;
    }

    private int d(com.sankuai.waimai.store.platform.domain.core.shopcart.tip.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4de9cbd4e9ab12834bd07b9a4c0cb9df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4de9cbd4e9ab12834bd07b9a4c0cb9df")).intValue();
        }
        if (bVar == null || bVar.a != 1) {
            return 0;
        }
        return com.sankuai.shangou.stone.util.i.b(Double.valueOf(com.sankuai.waimai.store.order.a.e().n(this.c.d())), Double.valueOf(this.c.s())) ? 1 : 2;
    }
}
