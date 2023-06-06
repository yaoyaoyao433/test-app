package com.sankuai.waimai.bussiness.order.crossconfirm.block.packingdeliverycost;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.store.IOrderBusinessService;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.foodInfo.FoodInfoModel;
import com.sankuai.waimai.foundation.utils.ab;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    private int A;
    private int B;
    private TextView C;
    private TextView D;
    private View E;
    private TextView F;
    private ViewGroup G;
    private TextView H;
    private TextView I;
    private TextView J;
    View e;
    ViewGroup f;
    View g;
    TextView h;
    ViewGroup i;
    CheckBox j;
    boolean k;
    c l;
    f m;
    private TextView n;
    private TextView o;
    private ImageView p;
    private TextView q;
    private TextView r;
    private TextView s;
    private TextView t;
    private ImageView u;
    private TextView v;
    private TextView w;
    private TextView x;
    private TextView y;
    private int z;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_layout_pack_and_deliver_cost;
    }

    public b(Context context, f fVar) {
        super(context);
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af36991375bdc2e7453347578384f3bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af36991375bdc2e7453347578384f3bf");
            return;
        }
        this.k = false;
        this.m = fVar;
        this.z = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_common_b_price_symbol);
        this.A = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_common_b_price_num);
        this.B = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_shipping_fee_price_symbol);
        if (fVar.aM_()) {
            this.q.setTextSize(0, this.A);
            this.t.setTextSize(0, this.A);
            this.C.setTextSize(0, this.A);
            this.I.setTextSize(0, this.A);
            this.q.setTypeface(fVar.aN_());
            this.t.setTypeface(fVar.aN_());
            this.C.setTypeface(fVar.aN_());
            this.I.setTypeface(fVar.aN_());
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "523c6c72148b6e0e3d868ba4fa93e16c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "523c6c72148b6e0e3d868ba4fa93e16c");
            return;
        }
        super.b();
        this.e = this.b.findViewById(R.id.layout_pack_and_deliver_cost);
        this.f = (ViewGroup) this.b.findViewById(R.id.layout_pack_cost);
        this.n = (TextView) this.b.findViewById(R.id.txt_pack_name);
        this.p = (ImageView) this.b.findViewById(R.id.box_fee_detail);
        this.o = (TextView) this.b.findViewById(R.id.txt_new_customer_pack_tag);
        this.q = (TextView) this.b.findViewById(R.id.txt_pack_cost);
        this.r = (TextView) this.b.findViewById(R.id.txt_real_pack_cost);
        this.g = this.b.findViewById(R.id.layout_deliver_info);
        this.s = (TextView) this.b.findViewById(R.id.txt_new_customer_delivery_tag);
        this.u = (ImageView) this.b.findViewById(R.id.delivery_shipfee_show);
        this.h = (TextView) this.b.findViewById(R.id.txt_shipment_fee_sub_des);
        this.v = (TextView) this.b.findViewById(R.id.txt_vip_entrance);
        this.w = (TextView) this.b.findViewById(R.id.txt_real_shipping);
        this.t = (TextView) this.b.findViewById(R.id.txt_deliver_cost);
        this.x = (TextView) this.b.findViewById(R.id.txt_shipping_fee_update_reason);
        this.y = (TextView) this.b.findViewById(R.id.txt_shipping_fee_detail);
        this.D = (TextView) this.b.findViewById(R.id.txt_packet_bag_name);
        this.C = (TextView) this.b.findViewById(R.id.txt_packet_bag_cost);
        this.i = (ViewGroup) this.b.findViewById(R.id.layout_packet_bag_cost);
        this.j = (CheckBox) this.b.findViewById(R.id.ckb_packet_bag);
        this.E = this.b.findViewById(R.id.wm_coupon_collect_order_tip_ll);
        this.F = (TextView) this.b.findViewById(R.id.wm_discount_collect_order_tip);
        this.G = (ViewGroup) this.b.findViewById(R.id.layout_drug_tax_fee_cost);
        this.H = (TextView) this.b.findViewById(R.id.txt_tax_fee_name);
        this.I = (TextView) this.b.findViewById(R.id.txt_tax_fee_cost);
        this.J = (TextView) this.b.findViewById(R.id.delivery_shipfee_left_title);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6b0df69b6ebd134d4f72377fc780cf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6b0df69b6ebd134d4f72377fc780cf1");
        } else if (i == 1) {
            this.J.setText(this.c.getResources().getString(R.string.wm_order_base_confirm_deliver_cost_new));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@NonNull final c cVar, final long j, final String str) {
        Object[] objArr = {cVar, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d90603718e8516de723be34ca42cfcee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d90603718e8516de723be34ca42cfcee");
        } else if (cVar.b > 0.0d) {
            Typeface aN_ = this.m.aN_();
            if (!TextUtils.isEmpty(cVar.c)) {
                this.n.setText(cVar.c);
            }
            String string = this.c.getString(R.string.wm_order_base_price_with_rmb_symbol, h.a(cVar.b));
            com.sankuai.waimai.bussiness.order.confirm.helper.h.a(this.q, string, aN_, this.z, this.A);
            if (cVar.d != null) {
                this.r.setVisibility(0);
                this.r.setPaintFlags(this.r.getPaintFlags() | 16);
                com.sankuai.waimai.bussiness.order.confirm.helper.h.a(this.q, this.c.getString(R.string.wm_order_base_price_with_rmb_symbol, h.a(cVar.d.b)), aN_, this.B, this.A);
                com.sankuai.waimai.bussiness.order.confirm.helper.h.a(this.r, string, aN_, this.z, this.A);
                ah.a(this.o, ab.a(cVar.d.a, 10));
            } else {
                this.r.setVisibility(8);
                this.o.setVisibility(8);
            }
            if (cVar.s != null) {
                this.p.setVisibility(0);
                this.p.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.packingdeliverycost.b.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31da2cc3c4ecfc4272b9394432e43943", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31da2cc3c4ecfc4272b9394432e43943");
                            return;
                        }
                        IOrderBusinessService iOrderBusinessService = (IOrderBusinessService) com.sankuai.waimai.router.a.a(IOrderBusinessService.class, IOrderBusinessService.KEY_STORE_BUSINESS);
                        if (iOrderBusinessService != null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("shop_cart_total_box_info", cVar.s);
                            iOrderBusinessService.showDialog(b.this.c, hashMap, "total_box_price_dialog");
                        }
                        JudasManualManager.a("b_vhcsyqyl").a("poi_id", i.a(j, str)).a("stid", cVar.t).a("c_ykhs39e").a(b.this.c).a();
                    }
                });
                a(j, str, cVar.t);
            } else {
                this.p.setVisibility(8);
            }
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
    }

    private void a(long j, String str, String str2) {
        Object[] objArr = {new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "037356a4d6808a2b71f77c6a6d3c470f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "037356a4d6808a2b71f77c6a6d3c470f");
        } else {
            JudasManualManager.b("b_89b8blys").a("c_ykhs39e").a("poi_id", i.a(j, str)).a("stid", str2).a(this.c).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@NonNull final c cVar, boolean z, int i, boolean z2) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3de992264e6b766f84412de29a1df0a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3de992264e6b766f84412de29a1df0a7");
        } else if (z2) {
            this.g.setVisibility(8);
        } else {
            Typeface aN_ = this.m.aN_();
            this.g.setVisibility(0);
            String string = this.c.getString(R.string.wm_order_base_price_with_rmb_symbol, h.a(cVar.e));
            com.sankuai.waimai.bussiness.order.confirm.helper.h.a(this.t, string, aN_, this.z, this.A);
            this.x.setSingleLine(false);
            if (cVar.r == 1) {
                this.x.setMaxLines(5);
                if (!TextUtils.isEmpty(cVar.g) && !TextUtils.isEmpty(cVar.i)) {
                    ah.a(this.x, TextUtils.concat(cVar.g, "，", cVar.i).toString());
                } else {
                    ah.a(this.x, !TextUtils.isEmpty(cVar.g) ? cVar.g : cVar.i);
                }
            } else {
                ah.a(this.x, !TextUtils.isEmpty(cVar.g) ? cVar.g : cVar.i);
            }
            this.u.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.packingdeliverycost.b.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba299e2c271667a43bcb8a6306d334ac", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba299e2c271667a43bcb8a6306d334ac");
                        return;
                    }
                    FoodInfoModel.d dVar = cVar.h;
                    if (dVar == null || TextUtils.isEmpty(dVar.d)) {
                        return;
                    }
                    com.sankuai.waimai.foundation.router.a.a(b.this.c, dVar.d);
                }
            });
            final FoodInfoModel.d dVar = cVar.h;
            if (dVar != null) {
                ah.a(this.y, dVar.a);
            } else {
                this.y.setVisibility(8);
            }
            if (cVar.l != null && cVar.l.visible && !TextUtils.isEmpty(cVar.l.title)) {
                this.v.setText(cVar.l.title);
                this.v.setVisibility(0);
                this.v.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.packingdeliverycost.b.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d606edc090533518b73b42e0aaaaf8c5", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d606edc090533518b73b42e0aaaaf8c5");
                        } else {
                            com.sankuai.waimai.foundation.router.a.a(b.this.c, cVar.l.url);
                        }
                    }
                });
            } else {
                this.v.setOnClickListener(null);
                this.v.setVisibility(8);
            }
            if (i == 3) {
                if (cVar.j != null) {
                    this.w.setVisibility(0);
                    com.sankuai.waimai.bussiness.order.confirm.helper.h.a(this.t, this.c.getString(R.string.wm_order_confirm_origin_price, h.a(cVar.j.b)), aN_, this.z, this.A);
                    this.w.getPaint().setFlags(16);
                    com.sankuai.waimai.bussiness.order.confirm.helper.h.a(this.w, string, aN_, this.B, this.A);
                } else {
                    this.w.setVisibility(8);
                }
            } else if (cVar.e != cVar.f) {
                this.w.setVisibility(0);
                com.sankuai.waimai.bussiness.order.confirm.helper.h.a(this.t, this.c.getString(R.string.wm_order_confirm_origin_price, h.a(cVar.f)), aN_, this.z, this.A);
                this.w.getPaint().setFlags(16);
                com.sankuai.waimai.bussiness.order.confirm.helper.h.a(this.w, string, aN_, this.B, this.A);
            } else {
                this.w.setVisibility(8);
            }
            if (cVar.j != null) {
                ah.a(this.s, ab.a(cVar.j.a, 10));
            } else {
                this.s.setVisibility(8);
            }
            if (dVar != null && dVar.b != null) {
                final FoodInfoModel.b bVar = dVar.b;
                if (bVar.a == 1) {
                    this.E.setVisibility(0);
                    this.F.setText(bVar.b);
                    this.E.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.packingdeliverycost.b.4
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d5d534af383481c40b1be0ec2c904c5", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d5d534af383481c40b1be0ec2c904c5");
                            } else {
                                JudasManualManager.a("b_waimai_qr68yvct_mc").a("c_ykhs39e").a("wm_preview_tanceng", 5).a(b.this.c).a();
                            }
                        }
                    });
                    JudasManualManager.b("b_waimai_qr68yvct_mv").a("c_ykhs39e").a("wm_preview_tanceng", 5).a(this.c).a();
                    return;
                }
                this.E.setVisibility(8);
                return;
            }
            this.E.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final com.sankuai.waimai.platform.domain.core.order.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85dca7e407f34df5ac00be52cde27bce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85dca7e407f34df5ac00be52cde27bce");
            return;
        }
        this.k = false;
        if (bVar != null) {
            this.i.setVisibility(0);
            com.sankuai.waimai.bussiness.order.confirm.helper.h.a(this.C, this.c.getString(R.string.wm_order_base_price_with_rmb_symbol, h.a(bVar.a.doubleValue())), this.m.aN_(), this.z, this.A);
            this.D.setText(bVar.b);
            if (bVar.c > 0) {
                this.j.setVisibility(0);
                this.j.setChecked(bVar.c == 1);
                this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.packingdeliverycost.b.5
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a320a03947bef16a77786bcfcae8cc8", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a320a03947bef16a77786bcfcae8cc8");
                            return;
                        }
                        b.this.k = true;
                        b bVar2 = b.this;
                        com.sankuai.waimai.platform.domain.core.order.b bVar3 = bVar;
                        Object[] objArr3 = {bVar3};
                        ChangeQuickRedirect changeQuickRedirect3 = b.d;
                        if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "0bc1d10ebc4dd3dec2254a02b3a8273b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "0bc1d10ebc4dd3dec2254a02b3a8273b");
                        } else if (bVar3 != null) {
                            bVar3.c = bVar2.j.isChecked() ? 1 : 2;
                        }
                        b.this.m.a(2);
                    }
                });
                return;
            }
            this.j.setVisibility(8);
            return;
        }
        this.i.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(FoodInfoModel.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f30fe384c7b815007076c4eb28b7b873", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f30fe384c7b815007076c4eb28b7b873");
        } else if (cVar != null) {
            this.G.setVisibility(0);
            com.sankuai.waimai.bussiness.order.confirm.helper.h.a(this.I, this.c.getString(R.string.wm_order_base_price_with_rmb_symbol, h.a(cVar.b)), this.m.aN_(), this.z, this.A);
            this.H.setText(cVar.a);
        } else {
            this.G.setVisibility(8);
        }
    }
}
