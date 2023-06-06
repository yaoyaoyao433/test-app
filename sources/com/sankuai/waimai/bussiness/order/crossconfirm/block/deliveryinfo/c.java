package com.sankuai.waimai.bussiness.order.crossconfirm.block.deliveryinfo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.RooIconFont;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.bussiness.order.base.model.c;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.confirm.preview.model.DeliveryListResponse;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.widget.TextWithImageLayout;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    LinearLayout e;
    TextView f;
    TextView g;
    RooIconFont h;
    DeliveryListResponse i;
    Dialog j;
    int k;
    boolean l;
    String m;
    @Nullable
    d n;
    @NonNull
    com.sankuai.waimai.bussiness.order.crossconfirm.a o;
    @NonNull
    f p;
    private ImageView q;
    private LinearLayout r;
    private TextWithImageLayout s;
    private TextView t;
    private ImageView u;
    private boolean v;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_layout_mt_deliver_time;
    }

    public static /* synthetic */ void a(c cVar) {
        String json;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "960679c31554b4e5c85840f5e116fb7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "960679c31554b4e5c85840f5e116fb7b");
        } else if (cVar.i != null) {
            cVar.g();
        } else {
            final Dialog a = com.sankuai.waimai.platform.widget.dialog.a.a(cVar.c);
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.p.aL_());
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cVar.n.a);
            String sb4 = sb3.toString();
            String str = cVar.n.b;
            String token = SubmitOrderManager.getInstance().getToken();
            int i = cVar.n.k;
            AddressItem addressItem = cVar.o.A.a().b;
            int i2 = cVar.n.l;
            String str2 = cVar.n.m;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "4313a23cc557dc27837a9b7a9c597109", RobustBitConfig.DEFAULT_VALUE)) {
                json = (String) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "4313a23cc557dc27837a9b7a9c597109");
            } else {
                json = (cVar.n == null || com.sankuai.waimai.foundation.utils.b.b(cVar.n.n)) ? "" : com.sankuai.waimai.foundation.location.v2.d.a().toJson(cVar.n.n);
            }
            new com.sankuai.waimai.bussiness.order.confirm.preview.request.a(sb2, sb4, str, token, i, addressItem, i2, str2, json, "").a(null, new com.sankuai.waimai.bussiness.order.confirm.submit.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.deliveryinfo.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.confirm.submit.a
                public final void a(Throwable th) {
                    Object[] objArr3 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fd240bfe51cdaf47c2399951b0d43ae8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fd240bfe51cdaf47c2399951b0d43ae8");
                        return;
                    }
                    com.sankuai.waimai.platform.widget.dialog.a.b(a);
                    c.this.a(R.string.wm_order_confirm_fail_to_load_pre_delivery_time_list);
                }

                @Override // com.sankuai.waimai.bussiness.order.confirm.submit.a
                public final void a(BaseResponse baseResponse) {
                    Object[] objArr3 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "398e77260cfb76bdac60d44395347093", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "398e77260cfb76bdac60d44395347093");
                        return;
                    }
                    com.sankuai.waimai.platform.widget.dialog.a.b(a);
                    String a2 = com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(c.this.c, baseResponse, (int) R.string.wm_order_confirm_fail_to_load_pre_delivery_time_list);
                    if (!TextUtils.isEmpty(a2)) {
                        c.this.a(a2);
                    } else if (baseResponse.data == 0) {
                        c.this.a(R.string.wm_order_confirm_fail_to_load_pre_delivery_time_list);
                    } else {
                        c.this.i = (DeliveryListResponse) baseResponse.data;
                        c.this.g();
                    }
                }
            });
        }
    }

    public static /* synthetic */ void a(c cVar, c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "36bd473f5b65766df1831a80a19d9a1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "36bd473f5b65766df1831a80a19d9a1b");
            return;
        }
        String str = "";
        String str2 = cVar.n.g;
        String str3 = cVar.n.c;
        if (TextUtils.equals(str3, "立即送出")) {
            str = str2.contains(CommonConstant.Symbol.MINUS) ? "1" : "2";
        } else if (TextUtils.equals(str3, "指定时间")) {
            str = "3";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("etaformat", str);
        hashMap.put("etavalue", str2);
        JudasManualManager.a("b_8Xs6V").a("c_ykhs39e").a((Map<String, Object>) hashMap).a(cVar.c).a();
    }

    public static /* synthetic */ void a(c cVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "bacf2de116d7d912e4857c47ac8d7593", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "bacf2de116d7d912e4857c47ac8d7593");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            com.sankuai.waimai.foundation.router.a.a(cVar.c, str);
        }
    }

    public static /* synthetic */ void a(c cVar, String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "2741902bb50c1674d1a714ad3c4d7d1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "2741902bb50c1674d1a714ad3c4d7d1a");
            return;
        }
        cVar.k = i;
        cVar.g.setText(str);
    }

    public static /* synthetic */ void d(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "f105714befad6febed115c682a7f14a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "f105714befad6febed115c682a7f14a5");
            return;
        }
        cVar.k = 0;
        cVar.g.setText(cVar.j());
    }

    public c(@NonNull Context context, @NonNull com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a10fb2fda0852d19474252fb0cc0c02a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a10fb2fda0852d19474252fb0cc0c02a");
            return;
        }
        this.k = 0;
        this.l = false;
        this.v = false;
        this.o = aVar;
        this.p = aVar;
        this.r.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.deliveryinfo.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91381e8f9746810ea965c80e7fb3853e", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91381e8f9746810ea965c80e7fb3853e");
                } else if (c.this.h.getVisibility() == 0) {
                    c.a(c.this);
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31574291764b53df7a1ab4aef1b7707c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31574291764b53df7a1ab4aef1b7707c");
            return;
        }
        super.b();
        this.e = (LinearLayout) this.b.findViewById(R.id.layout_ship_time);
        this.q = (ImageView) this.b.findViewById(R.id.img_deliver_time);
        this.r = (LinearLayout) this.b.findViewById(R.id.layout_ship_real_time);
        this.f = (TextView) this.b.findViewById(R.id.txt_ship_des);
        this.g = (TextView) this.b.findViewById(R.id.txt_ship_time);
        this.h = (RooIconFont) this.b.findViewById(R.id.img_pre_delivery_time_arrow);
        this.s = (TextWithImageLayout) this.b.findViewById(R.id.wm_order_delivery_tip_explain_layout);
        this.t = (TextView) this.b.findViewById(R.id.wm_order_delivery_tip_explain_txt);
        this.u = (ImageView) this.b.findViewById(R.id.wm_order_delivery_explain_icon);
        this.g.setText(R.string.wm_order_confirm_not_choose_time);
        this.e.setPadding(this.e.getPaddingLeft(), g.a(this.c, 17.0f), this.e.getPaddingRight(), g.a(this.c, 17.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        com.sankuai.waimai.bussiness.order.base.callback.a h;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d707904a3de9522d87dd6a6c5fae8f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d707904a3de9522d87dd6a6c5fae8f8");
        } else if ((this.j != null && this.j.isShowing()) || this.i == null || this.i.list == null || this.i.list.isEmpty()) {
        } else {
            if (this.n.e) {
                h = i();
            } else {
                h = h();
            }
            this.j = com.sankuai.waimai.bussiness.order.base.utils.e.a((Activity) this.c, this.i.hint, this.i.hintBg, this.i.list, this.k, !e(), h, true);
        }
    }

    private com.sankuai.waimai.bussiness.order.base.callback.a h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b117bd616d1a00bbb73052db05410216", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.bussiness.order.base.callback.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b117bd616d1a00bbb73052db05410216") : new com.sankuai.waimai.bussiness.order.base.callback.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.deliveryinfo.c.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.base.callback.a
            public final void a(int i, int i2, com.sankuai.waimai.bussiness.order.base.model.c cVar, c.a aVar) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), cVar, aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1caa5c2a96a0903478f3d83524ff43cd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1caa5c2a96a0903478f3d83524ff43cd");
                    return;
                }
                if (aVar == null) {
                    c.d(c.this);
                } else {
                    c.a(c.this, aVar);
                    c.this.m = aVar.g;
                    if (c.this.i != null) {
                        c.this.i.position = i;
                        c.this.i.subPosition = i2;
                    }
                    c.a(c.this, aVar.d, aVar.e);
                    c.this.o.F.a((com.meituan.android.cube.pga.common.b<com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c>) new com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c(c.this.p.aL_(), true, false));
                }
                c.this.j = null;
            }
        };
    }

    private com.sankuai.waimai.bussiness.order.base.callback.a i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "096ec8df33e8b5b204857a412f5417dd", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.bussiness.order.base.callback.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "096ec8df33e8b5b204857a412f5417dd") : new com.sankuai.waimai.bussiness.order.base.callback.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.deliveryinfo.c.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.base.callback.a
            public final void a(int i, int i2, com.sankuai.waimai.bussiness.order.base.model.c cVar, c.a aVar) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), cVar, aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04f0035a0a41a492e844710a1963a8c8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04f0035a0a41a492e844710a1963a8c8");
                    return;
                }
                if (aVar != null) {
                    c.this.m = aVar.g;
                    if (c.this.i != null) {
                        c.this.i.position = i;
                        c.this.i.subPosition = i2;
                    }
                    c.a(c.this, aVar.d, aVar.e);
                    c.this.o.F.a((com.meituan.android.cube.pga.common.b<com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c>) new com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c(c.this.p.aL_(), true, false));
                }
                c.this.j = null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "743c24a3b5103111b58c067e5b855a0d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "743c24a3b5103111b58c067e5b855a0d")).booleanValue() : j().equals(this.g.getText());
    }

    @NonNull
    private String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e90228f595bd9f59a4bb48e9e2032b4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e90228f595bd9f59a4bb48e9e2032b4") : this.c.getString(R.string.wm_order_confirm_not_choose_time);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41ac4917f0d8f9f643cde13b8f5e4c5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41ac4917f0d8f9f643cde13b8f5e4c5f");
        } else {
            ae.a(this.c, str);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf((int) R.string.wm_order_confirm_fail_to_load_pre_delivery_time_list)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07e036ed92c7d61f6ca453d7b92cbb3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07e036ed92c7d61f6ca453d7b92cbb3f");
        } else {
            ae.a(this.c, (int) R.string.wm_order_confirm_fail_to_load_pre_delivery_time_list);
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d6d159d68ed62829cf2cc3c59ab3e73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d6d159d68ed62829cf2cc3c59ab3e73");
        } else if (this.v || this.n == null) {
        } else {
            String str = "";
            String str2 = this.n.g;
            String str3 = this.n.c;
            if (TextUtils.equals(str3, "立即送出")) {
                str = str2.contains(CommonConstant.Symbol.MINUS) ? "1" : "2";
            } else if (TextUtils.equals(str3, "指定时间")) {
                str = "3";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("etaformat", str);
            hashMap.put("etavalue", str2);
            JudasManualManager.b("waimai_b_8Xs6V").a("c_ykhs39e").a((Map<String, Object>) hashMap).a(this.c).a();
            this.v = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@NonNull final d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dc35cd540448c69107057c8c39a8f65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dc35cd540448c69107057c8c39a8f65");
        } else if (dVar.j != null) {
            if (!TextUtils.isEmpty(dVar.j.orderDeliveryAlertTip)) {
                this.s.setVisibility(0);
                JudasManualManager.b("b_u3msq5x1").a("c_ykhs39e").a("busy_reason", dVar.j.orderDeliveryType).a(this.c).a();
                ah.a(this.t, dVar.j.orderDeliveryAlertTip);
                if (!TextUtils.isEmpty(dVar.j.explainUrl)) {
                    this.u.setVisibility(0);
                    this.u.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.deliveryinfo.c.5
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12f5814ce8c8bd62d7961c640a212328", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12f5814ce8c8bd62d7961c640a212328");
                                return;
                            }
                            JudasManualManager.a("b_r5vnvppz").a("c_ykhs39e").a(c.this.c).a();
                            c.a(c.this, dVar.j.explainUrl);
                        }
                    });
                    return;
                }
                this.u.setVisibility(8);
                return;
            }
            this.s.setVisibility(8);
        } else {
            this.s.setVisibility(8);
        }
    }
}
