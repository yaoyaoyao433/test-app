package com.sankuai.waimai.store.order.prescription.view;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.order.prescription.model.OrderFoodInfo;
import com.sankuai.waimai.store.order.prescription.model.PharmacistStatus;
import com.sankuai.waimai.store.order.prescription.model.PrescriptionTemplate;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    public TextView e;
    public View f;
    public String g;
    public Long h;
    PrescriptionTemplate.b i;
    public PrescriptionTemplate.a j;
    int k;
    public List<OrderFoodInfo> l;
    public boolean m;
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private ImageView r;
    private View s;
    private long t;
    private String u;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_sc_order_prescription_drug_view;
    }

    public static /* synthetic */ void a(f fVar, final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "8c7d56946ffcaeaf5f7d99888ce2169d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "8c7d56946ffcaeaf5f7d99888ce2169d");
        } else {
            com.sankuai.waimai.store.base.net.drug.a.a(fVar.c instanceof BaseActivity ? ((BaseActivity) fVar.c).w() : "OrderPrescriptionDrugView").a(fVar.t, fVar.j == null ? "" : fVar.j.a, fVar.h.longValue(), i, new k<PharmacistStatus>() { // from class: com.sankuai.waimai.store.order.prescription.view.f.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    PharmacistStatus pharmacistStatus = (PharmacistStatus) obj;
                    Object[] objArr2 = {pharmacistStatus};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ddc6920856dcfbedd01a9d258445c46", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ddc6920856dcfbedd01a9d258445c46");
                        return;
                    }
                    super.a((AnonymousClass3) pharmacistStatus);
                    if (pharmacistStatus.online) {
                        f.a(f.this, pharmacistStatus.scheme);
                        return;
                    }
                    final PharmacistStatus.a aVar = pharmacistStatus.popUpMsg;
                    if (aVar != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("type", Integer.valueOf(i));
                        f.this.a("b_waimai_bo8ezf4q_mv", hashMap);
                        CustomDialog.a b = new CustomDialog.a(f.this.c).a(aVar.f).b(aVar.a);
                        b.d.E = false;
                        b.b(aVar.c, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.order.prescription.view.f.3.2
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                Object[] objArr3 = {dialogInterface, Integer.valueOf(i2)};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d43e8bccbd7a1bbb54723073abc54961", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d43e8bccbd7a1bbb54723073abc54961");
                                    return;
                                }
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("button_code", 6);
                                f.a(f.this, "b_waimai_0jxz9y20_mc", hashMap2);
                                dialogInterface.dismiss();
                            }
                        }).a(aVar.e, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.order.prescription.view.f.3.1
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                Object[] objArr3 = {dialogInterface, Integer.valueOf(i2)};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a9e2e38a4a764e8d808da9e661ac030b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a9e2e38a4a764e8d808da9e661ac030b");
                                    return;
                                }
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("button_code", 8);
                                f.a(f.this, "b_waimai_0jxz9y20_mc", hashMap2);
                                f.a(f.this, aVar.d);
                            }
                        }).b();
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c55d7a49dafcab2361791fd8a2fe55e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c55d7a49dafcab2361791fd8a2fe55e");
                        return;
                    }
                    super.a();
                    if (f.this.c instanceof BaseActivity) {
                        ((BaseActivity) f.this.c).u();
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53f80db8379f885c33257294e71a70a6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53f80db8379f885c33257294e71a70a6");
                        return;
                    }
                    super.a(bVar);
                    if (f.this.k <= 0) {
                        f.a(f.this, i);
                        f.this.k++;
                    } else if (f.this.j != null) {
                        com.sankuai.waimai.store.router.d.b(f.this.c, f.this.a(f.this.j.j), new Bundle(), 3);
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7abe676a15010cf1b3f31218920c6731", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7abe676a15010cf1b3f31218920c6731");
                        return;
                    }
                    super.b();
                    if (f.this.c instanceof BaseActivity) {
                        ((BaseActivity) f.this.c).v();
                    }
                }
            });
        }
    }

    public static /* synthetic */ void a(f fVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "e3f97c2678107f857ee7523069ef82c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "e3f97c2678107f857ee7523069ef82c2");
        } else if (t.a(str)) {
        } else {
            com.sankuai.waimai.store.router.d.b(fVar.c, fVar.a(str), new Bundle(), 3);
        }
    }

    public static /* synthetic */ void a(f fVar, String str, Map map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "82de330daaa36fc90942b2614932b2c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "82de330daaa36fc90942b2614932b2c7");
            return;
        }
        com.sankuai.waimai.store.callback.a a = com.sankuai.waimai.store.manager.judas.b.a("c_ykhs39e", str);
        a.a("poi_id", fVar.h);
        a.a("spu_id", fVar.g());
        a.a("stid", fVar.u);
        a.a("template_type", 0);
        a.a("status", "-999");
        if (map != null) {
            a.b(map);
        }
        a.a();
    }

    public f(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00862f57a90e78151b66a4bfd5c52f6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00862f57a90e78151b66a4bfd5c52f6f");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b77ee60ab6cc49cd4d214c0a24c3942", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b77ee60ab6cc49cd4d214c0a24c3942");
            return;
        }
        super.b();
        this.e = (TextView) this.b.findViewById(R.id.prescription_drug_tips);
        this.s = this.b.findViewById(R.id.inquiry_layout);
        this.n = (TextView) this.b.findViewById(R.id.use_drug_name);
        this.o = (TextView) this.b.findViewById(R.id.use_drug_info);
        this.f = this.b.findViewById(R.id.prescription_drug_info);
        this.p = (TextView) this.b.findViewById(R.id.drug_prescription);
        this.r = (ImageView) this.b.findViewById(R.id.inquiry_img);
        this.q = (TextView) this.b.findViewById(R.id.select_inquiry);
        this.n.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.order.prescription.view.f.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2cb86c001deda3188661a11de8de9f92", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2cb86c001deda3188661a11de8de9f92");
                } else if (f.this.i != null) {
                    f.a(f.this, "b_waimai_l6wn2j6p_mc", null);
                    com.sankuai.waimai.store.router.d.b(f.this.c, f.this.i.c, new Bundle(), 3);
                }
            }
        });
    }

    public void a(PrescriptionTemplate.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56aba226e2f863d8344a5f8ae5653fb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56aba226e2f863d8344a5f8ae5653fb0");
            return;
        }
        if (bVar != null) {
            this.i = bVar;
            this.g = bVar.a;
            this.n.setText(bVar.b);
            this.o.setText(bVar.d);
        }
        com.sankuai.waimai.store.view.a a = com.sankuai.waimai.store.view.a.a(this.c, R.dimen.wm_sc_common_dimen_7, R.dimen.wm_sc_common_dimen_12, R.color.wm_st_common_AAAAAA, R.dimen.wm_sc_common_dimen_1, a.EnumC1338a.RIGHT);
        this.n.setCompoundDrawablePadding(h.a(this.c, 12.0f));
        this.n.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, a, (Drawable) null);
    }

    private String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "456471978d0d926c4903d73d88f6859e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "456471978d0d926c4903d73d88f6859e");
        }
        JSONArray jSONArray = new JSONArray();
        List<OrderFoodInfo> f = f();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) f)) {
            for (OrderFoodInfo orderFoodInfo : f) {
                if (orderFoodInfo != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("sku_id", orderFoodInfo.id);
                        jSONObject.put("count", orderFoodInfo.count);
                    } catch (JSONException e) {
                        com.sankuai.waimai.store.base.log.a.a(e);
                    }
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray.toString();
        }
        return "";
    }

    private List<OrderFoodInfo> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fc4ae13ae8e32997602dcc1d51cafaa", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fc4ae13ae8e32997602dcc1d51cafaa");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.l)) {
            for (OrderFoodInfo orderFoodInfo : this.l) {
                if (orderFoodInfo != null && orderFoodInfo.isRx) {
                    arrayList.add(orderFoodInfo);
                }
            }
        }
        return arrayList;
    }

    private String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e194a06b2f60a8a395b98ad696946c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e194a06b2f60a8a395b98ad696946c2");
        }
        List<OrderFoodInfo> f = f();
        if (com.sankuai.shangou.stone.util.a.b(f)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(Long.toString(f.get(0).spuId));
        int size = f.size();
        for (int i = 1; i < size; i++) {
            OrderFoodInfo orderFoodInfo = f.get(i);
            if (orderFoodInfo.isRx) {
                sb.append(CommonConstant.Symbol.COMMA);
                sb.append(orderFoodInfo.spuId);
            }
        }
        return sb.toString();
    }

    String a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4db772b6a34aad4ead512fd82217da7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4db772b6a34aad4ead512fd82217da7e");
        }
        Uri a = af.a(af.a(af.a(af.a(af.a(Uri.parse(str), "medicines", e()), "medical_user_id", this.i == null ? "" : this.i.a), "medical_user_name", this.i == null ? "" : this.i.b), "sourcePage", "1"), "poi_id", Long.toString(this.h.longValue()));
        return a == null ? "" : a.toString();
    }

    public void a(final PrescriptionTemplate.a aVar) {
        int i;
        com.sankuai.waimai.store.view.a aVar2;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b65979b0343674dc47fadf991dbea006", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b65979b0343674dc47fadf991dbea006");
        } else if (aVar == null) {
        } else {
            this.j = aVar;
            this.s.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.order.prescription.view.f.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45d590953f2e5cc94b4ca4c5d7b12d76", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45d590953f2e5cc94b4ca4c5d7b12d76");
                    } else if (aVar.f) {
                        f.this.k = 0;
                        HashMap hashMap = new HashMap();
                        hashMap.put("button_code", Integer.valueOf(aVar.g));
                        f.a(f.this, "b_waimai_augb8yib_mc", hashMap);
                        f.a(f.this, 1);
                    }
                }
            });
            if (t.a(aVar.e)) {
                this.r.setVisibility(8);
            } else {
                this.r.setVisibility(0);
                m.b(aVar.e).a(this.r);
            }
            int b = com.sankuai.waimai.store.util.b.b(this.c, R.color.wm_sg_color_999794);
            if (this.j.f) {
                aVar2 = com.sankuai.waimai.store.view.a.a(this.c, R.dimen.wm_sc_common_dimen_7, R.dimen.wm_sc_common_dimen_12, R.color.wm_st_common_AAAAAA, R.dimen.wm_sc_common_dimen_1, a.EnumC1338a.RIGHT);
                this.q.setCompoundDrawablePadding(h.a(this.c, 12.0f));
                i = com.sankuai.waimai.store.util.b.b(this.c, R.color.wm_st_common_text_title);
            } else {
                i = b;
                aVar2 = null;
            }
            this.q.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, aVar2, (Drawable) null);
            this.q.setTextColor(i);
            this.q.setText(aVar.d);
            this.p.setText(aVar.b);
        }
    }

    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5357040023c30e2d9009d8abaaaf36b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5357040023c30e2d9009d8abaaaf36b2");
            return;
        }
        com.sankuai.waimai.store.callback.a b = com.sankuai.waimai.store.manager.judas.b.b("c_ykhs39e", str);
        b.a("poi_id", this.h);
        b.a("spu_id", g());
        b.a("stid", this.u);
        b.a("template_type", 0);
        b.a("status", "-999");
        if (map != null) {
            b.b(map);
        }
        b.a();
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bac05959a5fb0f1b5449d03cd308fdfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bac05959a5fb0f1b5449d03cd308fdfa");
        } else {
            this.u = this.c.getString(R.string.wm_sc_prescription_exp_name, str);
        }
    }
}
