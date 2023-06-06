package com.sankuai.waimai.store.shopping.cart.block;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCart;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class l extends com.sankuai.waimai.store.base.b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    public final com.sankuai.waimai.store.shopping.cart.contract.a b;
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    private final int d;
    private final SCPageConfig e;
    private TextView f;
    private TextView g;
    private final a h;

    public l(com.sankuai.waimai.store.shopping.cart.contract.a aVar, int i) {
        super(aVar.i());
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fa7054c4ff21c7ad4ab9025584a0a24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fa7054c4ff21c7ad4ab9025584a0a24");
            return;
        }
        this.h = new a(aVar.i(), aVar.h());
        this.b = aVar;
        this.c = aVar.g();
        this.d = i;
        this.e = aVar.h();
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c4b4e60b6dd8b765d50e826a39e1017", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c4b4e60b6dd8b765d50e826a39e1017");
            return;
        }
        super.onViewCreated();
        this.f = (TextView) this.mView.findViewById(R.id.text_shop_cart_try_lucky_tips);
        this.g = (TextView) this.mView.findViewById(R.id.text_shop_cart_try_lucky_tag);
        this.h.bindView(this.mView.findViewById(R.id.task_activity_layout));
        this.mView.setOnClickListener(this);
        if (this.g != null) {
            this.g.setVisibility(8);
        }
        b((PoiShoppingCart.TaskActivity) null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7c11160961fc56d713e02bb5e9aad04", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7c11160961fc56d713e02bb5e9aad04");
            return;
        }
        a aVar = this.h;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "7b0985eccf12b04351bdcab69334925a", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "7b0985eccf12b04351bdcab69334925a")).booleanValue();
        } else {
            z = aVar.mView != null && aVar.mView.getVisibility() == 0;
        }
        if (z) {
            if (this.b != null) {
                this.b.a(0.0d, false);
            }
            com.sankuai.waimai.store.manager.judas.b.a(this.e.d, "b_waimai_med_v4fnj909_mc").a();
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
                com.sankuai.waimai.store.event.e eVar = (com.sankuai.waimai.store.event.e) com.sankuai.waimai.store.event.h.a().a((Class<com.sankuai.waimai.store.event.d>) com.sankuai.waimai.store.event.e.class);
                if (eVar != null) {
                    eVar.a();
                    break;
                }
                break;
            case 4:
                if (!t.a(a2.f) && b(a2)) {
                    com.sankuai.waimai.store.router.d.a(this.mContext, a2.f);
                    break;
                }
                break;
        }
        com.sankuai.waimai.store.manager.judas.b.a(this.e.d, "b_UjQR8").a("poi_id", this.c.d()).a("button_code", Integer.valueOf(a2.a)).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.c.v())).a("stid", com.sankuai.waimai.store.shopping.cart.util.c.a(this.c)).a("collect_type", a2.b == 2 ? "1" : "2").a();
    }

    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.tip.d dVar, PoiShoppingCart.TaskActivity taskActivity) {
        Object[] objArr = {dVar, taskActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "984edb547dbc7d520c13e3c0c3e65133", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "984edb547dbc7d520c13e3c0c3e65133");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.tip.b a2 = dVar.a();
        Object[] objArr2 = {a2, taskActivity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f141fa808314dbda8a2910313b7add66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f141fa808314dbda8a2910313b7add66");
        } else if (this.g != null) {
            if (!t.a(a2.c)) {
                if (a2.a()) {
                    Object[] objArr3 = {a2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "24e56f878bd4f589fc654a57ddab858e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "24e56f878bd4f589fc654a57ddab858e");
                    } else {
                        this.g.setText(a2.c);
                        this.g.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_333333));
                        this.g.setIncludeFontPadding(false);
                        this.g.setBackground(com.sankuai.waimai.store.util.e.b(this.mContext, (int) R.color.wm_sg_color_FFC43A, (int) R.dimen.wm_sc_common_dimen_10));
                        this.g.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, com.sankuai.waimai.store.util.e.a(this.mContext, (int) R.drawable.wm_sg_order_cofirm_drug_risk_arrow_right, com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_333333)), (Drawable) null);
                        this.g.setPadding(com.sankuai.shangou.stone.util.h.a(this.mContext, 10.0f), com.sankuai.shangou.stone.util.h.a(this.mContext, 2.5f), com.sankuai.shangou.stone.util.h.a(this.mContext, 5.0f), com.sankuai.shangou.stone.util.h.a(this.mContext, 2.5f));
                    }
                } else if (a2.e == 3) {
                    Object[] objArr4 = {a2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a391faf2b8d85ab17f87a9d6729ff7cc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a391faf2b8d85ab17f87a9d6729ff7cc");
                    } else {
                        this.g.setText(a2.c);
                        this.g.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_FF8001));
                        this.g.setIncludeFontPadding(false);
                        this.g.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, com.sankuai.waimai.store.util.e.a(this.mContext, (int) R.drawable.wm_sg_order_cofirm_drug_risk_arrow_right, com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_FF8001)), (Drawable) null);
                        this.g.setTypeface(null, 1);
                    }
                } else {
                    Object[] objArr5 = {a2};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "583399bcdde91cf50a1b490dcc52f5ad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "583399bcdde91cf50a1b490dcc52f5ad");
                    } else {
                        this.g.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                        this.g.setBackground(null);
                        this.g.setPadding(0, 0, 0, 0);
                        this.g.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_st_common_FE6D27));
                        this.g.setText(com.sankuai.waimai.store.util.l.b(a2.c, this.mContext.getString(R.string.wm_st_shop_cart_try_lucy_color)), TextView.BufferType.SPANNABLE);
                    }
                }
                if (!this.c.I()) {
                    com.sankuai.waimai.store.manager.judas.b.b(this.e.d, "b_JA73d").a("poi_id", this.c.d()).a("button_code", Integer.valueOf(a2.a)).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.c.v())).a("collect_type", "1").a("stid", com.sankuai.waimai.store.shopping.cart.util.c.a(this.c)).a();
                }
            }
            Object[] objArr6 = {a2, taskActivity};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "04f3a923e199f078547da29c90773ff1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "04f3a923e199f078547da29c90773ff1");
            } else if (b(a2)) {
                this.g.setVisibility(0);
                this.h.hide();
            } else {
                this.g.setVisibility(8);
                this.h.a(taskActivity);
            }
        }
        b(taskActivity);
    }

    private void a(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.tip.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89e14302a0106d0379f40900c825fe9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89e14302a0106d0379f40900c825fe9c");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bd9339b35e5ae19275d16922180edd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bd9339b35e5ae19275d16922180edd9");
        } else {
            u.a(this.mView, -1, com.sankuai.shangou.stone.util.h.a(this.mContext, i));
        }
    }

    private static String a(@Nullable PoiShoppingCart.TaskActivity taskActivity) {
        return taskActivity == null ? "" : taskActivity.tipText;
    }

    private void b(@Nullable PoiShoppingCart.TaskActivity taskActivity) {
        Object[] objArr = {taskActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35ff9dca93b37da1c7821df172c59f58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35ff9dca93b37da1c7821df172c59f58");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.tip.d a2 = com.sankuai.waimai.store.order.a.e().k(this.c.d()).k().a();
        String str = a2.b;
        if (a(str)) {
            str = this.c.o();
        }
        if (TextUtils.isEmpty(str)) {
            str = a(taskActivity);
        }
        if (!TextUtils.isEmpty(str)) {
            a(com.sankuai.waimai.store.util.l.b(str, com.sankuai.waimai.store.util.b.a((int) R.string.wm_st_shop_cart_try_lucy_color)));
            a(a2.a());
            return;
        }
        hide();
    }

    private boolean c(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.tip.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62076e1f766269e41916f42e257fe0bf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62076e1f766269e41916f42e257fe0bf")).booleanValue();
        }
        return (this.e.e != 1 && this.e.e != 9 && bVar.a == 3) || (this.e.e == 7 && bVar.a == 4);
    }

    private void a(Spanned spanned) {
        Object[] objArr = {spanned};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "029efc63383d2adbfbe64e9251c72041", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "029efc63383d2adbfbe64e9251c72041");
        } else if (this.f != null) {
            this.f.setText(spanned, TextView.BufferType.SPANNABLE);
        }
    }

    private boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5df00fd6f958ead4c1a3678a4fadae3e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5df00fd6f958ead4c1a3678a4fadae3e")).booleanValue() : TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.c.o());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.sankuai.waimai.store.base.b {
        public static ChangeQuickRedirect a;
        @Nullable
        private ImageView b;
        @Nullable
        private TextView c;
        private final SCPageConfig d;

        private a(@NonNull Context context, SCPageConfig sCPageConfig) {
            super(context);
            Object[] objArr = {context, sCPageConfig};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1b633df5998594581904d96be14c809", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1b633df5998594581904d96be14c809");
            } else {
                this.d = sCPageConfig;
            }
        }

        @Override // com.sankuai.waimai.store.base.b
        public final void onViewCreated() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a2ea38c8b9734d696dd9afea2fe2598", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a2ea38c8b9734d696dd9afea2fe2598");
                return;
            }
            super.onViewCreated();
            this.b = (ImageView) findView(R.id.task_activity_img);
            this.c = (TextView) findView(R.id.task_activity_text);
        }

        void a(@Nullable PoiShoppingCart.TaskActivity taskActivity) {
            Object[] objArr = {taskActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "998b61f18e936facc9e998d7b4cc1df5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "998b61f18e936facc9e998d7b4cc1df5");
            } else if (taskActivity == null || taskActivity.button == null || TextUtils.isEmpty(taskActivity.button.text)) {
                hide();
            } else {
                show();
                if (this.d != null) {
                    com.sankuai.waimai.store.manager.judas.b.b(this.d.d, "b_waimai_med_v4fnj909_mv").a();
                }
                if (this.c != null) {
                    this.c.setText(taskActivity.button.text);
                    this.c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, com.sankuai.waimai.store.util.e.a(this.mContext, (int) R.drawable.wm_sg_order_cofirm_drug_risk_arrow_right, com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sc_color_915000)), (Drawable) null);
                }
                if (this.b != null) {
                    m.a(taskActivity.button.icon).a(this.b);
                }
            }
        }
    }

    private boolean b(com.sankuai.waimai.store.platform.domain.core.shopcart.tip.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b0c5b56a0fce69a9d09a05fff0350ad", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b0c5b56a0fce69a9d09a05fff0350ad")).booleanValue() : (bVar == null || t.a(bVar.c) || c(bVar)) ? false : true;
    }
}
