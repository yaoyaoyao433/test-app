package com.sankuai.waimai.business.restaurant.goodsdetail.adapter.viewholder;

import android.content.Context;
import android.graphics.Typeface;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.utils.c;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendPackage;
import com.sankuai.waimai.business.restaurant.goodsdetail.adapter.a;
import com.sankuai.waimai.business.restaurant.goodsdetail.adapter.e;
import com.sankuai.waimai.business.restaurant.goodsdetail.adapter.viewholder.a;
import com.sankuai.waimai.business.restaurant.goodsdetail.widget.AutoGridView;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.foundation.utils.q;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.restaurant.shopcart.ui.ab;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends a {
    public static ChangeQuickRedirect h;
    TextView i;
    View j;
    TextView k;
    private q l;
    private AutoGridView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private View q;
    private TextView r;

    public b(View view, g gVar, a.InterfaceC0833a interfaceC0833a, boolean z, int i, String str, ab abVar) {
        super(view, gVar, interfaceC0833a, z, i, str, abVar);
        Object[] objArr = {view, gVar, interfaceC0833a, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str, abVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "106ee59a4da9cfb521d244ebfe667a75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "106ee59a4da9cfb521d244ebfe667a75");
            return;
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a5e5649f4476b8c3c90729597a705a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a5e5649f4476b8c3c90729597a705a2");
            return;
        }
        this.l = new q();
        this.m = (AutoGridView) view.findViewById(R.id.product_container);
        this.m.setStrategy(new a.C0832a());
        this.i = (TextView) view.findViewById(R.id.someone_package);
        this.n = (TextView) view.findViewById(R.id.price);
        this.o = (TextView) view.findViewById(R.id.price_signal);
        this.p = (TextView) view.findViewById(R.id.one_click_order);
        this.j = view.findViewById(R.id.package_goods_price_detail_btn);
        this.k = (TextView) view.findViewById(R.id.tv_final_price);
        this.r = (TextView) view.findViewById(R.id.origin_price);
        this.q = view.findViewById(R.id.package_goods_price_detail_btn_mask);
        this.l.a(this.n);
        this.l.a(this.o);
    }

    @Override // com.sankuai.waimai.business.restaurant.goodsdetail.adapter.viewholder.a
    public final void a(final RecommendPackage.a aVar, final int i, boolean z) {
        Object[] objArr = {aVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "238246a2009b4016c698d35e5dd7394f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "238246a2009b4016c698d35e5dd7394f");
        } else if (aVar == null || f.a(this.itemView.getContext())) {
        } else {
            final Context context = this.itemView.getContext();
            this.i.setText(aVar.b);
            this.n.setText(h.a(aVar.f));
            if (h.a(Double.valueOf(aVar.f), Double.valueOf(aVar.g))) {
                this.r.setVisibility(8);
            } else {
                ah.a(this.r, com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_food_price, h.a(aVar.g)));
            }
            try {
                Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/AvenirLTPro-Medium.ttf");
                if (createFromAsset != null) {
                    this.n.setTypeface(createFromAsset);
                    this.o.setTypeface(createFromAsset);
                }
            } catch (Exception unused) {
            }
            if (!this.b.t()) {
                this.p.setVisibility(0);
                this.p.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.adapter.viewholder.b.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fba2fb59f17bd712833615a8c761b6d", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fba2fb59f17bd712833615a8c761b6d");
                        } else if (b.this.c != null) {
                            b.this.c.a(aVar, i);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            Iterator<RecommendPackage.c> it = aVar.i.iterator();
                            while (it.hasNext()) {
                                sb.append(it.next().b);
                                sb.append(CommonConstant.Symbol.COMMA);
                            }
                            JudasManualManager.a a2 = JudasManualManager.a("b_waimai_ncl8a4f7_mc").a(b.this.a());
                            a2.b = AppUtil.generatePageInfoKey(context);
                            JudasManualManager.a a3 = a2.a("poi_id", b.this.b.f()).a("sku_id", sb.toString()).a("group_id", aVar.h).a("index", i).a("i_source", b.this.b.f);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(aVar.f);
                            JudasManualManager.a a4 = a3.a("current_price", sb2.toString());
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(aVar.g);
                            JudasManualManager.a a5 = a4.a("orig_price", sb3.toString());
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(aVar.f);
                            JudasManualManager.a a6 = a5.a("price", sb4.toString()).a("rec_reason", aVar.b).a("rank_list_id", b.this.f);
                            if (b.this.d) {
                                a6.a("ref_list_id", ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok"));
                                a6.a("spu_type", b.this.e);
                            }
                            a6.a();
                            new com.sankuai.waimai.business.restaurant.goodsdetail.widget.b(b.this.b, context, b.this.g).a(aVar.i);
                        }
                    }
                });
            } else {
                this.p.setVisibility(8);
            }
            if (com.sankuai.waimai.foundation.utils.b.a(aVar.j)) {
                this.j.setVisibility(0);
                this.q.setVisibility(0);
                this.q.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.adapter.viewholder.b.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2396fdde3b91b6761de1b5a68c4b4deb", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2396fdde3b91b6761de1b5a68c4b4deb");
                            return;
                        }
                        b bVar = b.this;
                        Context context2 = context;
                        Object[] objArr3 = {context2};
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "a262a475b8b6bfeb155f3774f2b5509f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "a262a475b8b6bfeb155f3774f2b5509f");
                            return;
                        }
                        JudasManualManager.a a2 = JudasManualManager.a("b_waimai_6ep38s11_mc");
                        a2.b = AppUtil.generatePageInfoKey(context2);
                        a2.a(bVar.a()).a();
                    }
                });
            } else {
                this.j.setVisibility(8);
                this.q.setVisibility(8);
            }
            this.m.setAdapter(new e(context, this.b, aVar, this.f, this.d, i, 0, z));
            c.a(this.m, new Runnable() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.adapter.viewholder.b.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7148d9e3366ea4d7abf997cc7e4c03d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7148d9e3366ea4d7abf997cc7e4c03d");
                    } else if (b.this.i == null || b.this.k == null) {
                    } else {
                        int left = b.this.k.getLeft();
                        if (b.this.j.getVisibility() == 0) {
                            left = b.this.j.getLeft();
                        }
                        if (b.this.i.getRight() > left) {
                            b.this.i.setVisibility(8);
                        } else {
                            b.this.i.setVisibility(0);
                        }
                    }
                }
            }, null);
        }
    }
}
