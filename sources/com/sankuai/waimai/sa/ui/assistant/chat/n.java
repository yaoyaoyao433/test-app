package com.sankuai.waimai.sa.ui.assistant.chat;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.listforscrollview.LinearLayoutForList;
import com.sankuai.waimai.sa.model.Product;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class n implements g {
    public static ChangeQuickRedirect a;
    Context b;
    com.sankuai.waimai.sa.ui.assistant.a c;
    private View d;
    private ImageView e;
    private TextView f;
    private View g;
    private ImageView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private Button m;
    private View n;
    private ViewGroup o;
    private TextView p;
    private o q;

    public n(Context context, com.sankuai.waimai.sa.ui.assistant.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97b7f217f33b348a28b521df83808f14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97b7f217f33b348a28b521df83808f14");
            return;
        }
        this.b = context;
        this.c = aVar;
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.g
    public final View a(int i, ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i), viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d78324002ec86c18c59fdabca599fa2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d78324002ec86c18c59fdabca599fa2c");
        }
        if (this.d == null) {
            this.d = LayoutInflater.from(this.b).inflate(R.layout.wm_smart_assistant_temp_poi_and_sku_item, viewGroup, false);
            this.e = (ImageView) this.d.findViewById(R.id.img_poi);
            this.f = (TextView) this.d.findViewById(R.id.txt_poi);
            this.g = this.d.findViewById(R.id.layout_poi);
            this.h = (ImageView) this.d.findViewById(R.id.img_food);
            this.i = (TextView) this.d.findViewById(R.id.txt_food_name);
            this.j = (TextView) this.d.findViewById(R.id.txt_food_spec);
            this.k = (TextView) this.d.findViewById(R.id.txt_food_real_price);
            this.l = (TextView) this.d.findViewById(R.id.txt_food_origin_price);
            this.m = (Button) this.d.findViewById(R.id.btn_buy);
            this.n = this.d.findViewById(R.id.layout_food);
            this.o = (ViewGroup) this.d.findViewById(R.id.layout_recommend_food);
            this.p = (TextView) this.d.findViewById(R.id.txt_none_time);
        }
        return this.d;
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.g
    public final View a() {
        return this.d;
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.g
    public final void a(final com.sankuai.waimai.sa.model.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9f7f646df11583696f53f6beadc8e81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9f7f646df11583696f53f6beadc8e81");
        } else if (bVar != null && bVar.n != null) {
            final com.sankuai.waimai.sa.model.j jVar = bVar.n;
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.c = jVar.c;
            a2.b = this.b;
            a2.i = R.drawable.wm_smart_assistant_temp_poi_and_sku_poi_default;
            a2.a(this.e);
            ah.a(this.f, jVar.b);
            this.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.n.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ed0a76f95d8365056b33a70ce5a1bf9", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ed0a76f95d8365056b33a70ce5a1bf9");
                    } else if (n.this.c != null) {
                        JudasManualManager.a("b_tzafxta9").a("poi_id", String.valueOf(bVar.n.a)).a("result_id", String.valueOf(bVar.c)).a();
                        n.this.c.a(jVar.a, jVar.b);
                    }
                }
            });
            if (jVar.d != null) {
                final Product product = jVar.d;
                b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a3.c = product.picture;
                a3.b = this.b;
                a3.i = R.drawable.wm_smart_assistant_food_ic_default;
                a3.a(this.h);
                ah.a(this.i, product.name);
                this.n.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.n.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed8df973c7deb208dc7e5fa6434802ba", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed8df973c7deb208dc7e5fa6434802ba");
                        } else if (n.this.c != null) {
                            JudasManualManager.a("b_jr3s9n2v").a("poi_id", String.valueOf(bVar.n.a)).a("result_id", String.valueOf(bVar.c)).a();
                            n.this.c.a(jVar.a, jVar.d);
                        }
                    }
                });
                if (product.status == 3) {
                    this.p.setVisibility(0);
                    this.m.setVisibility(8);
                } else {
                    this.p.setVisibility(8);
                    this.m.setVisibility(0);
                }
                if (product.sku != null) {
                    ah.a(this.j, product.sku.specAttrs);
                    ah.a(this.k, this.b.getString(R.string.wm_sa_price_string, com.sankuai.waimai.foundation.utils.h.a(product.sku.price)));
                    if (com.sankuai.waimai.foundation.utils.h.a(Double.valueOf(product.sku.price), Double.valueOf(product.sku.originPrice))) {
                        this.l.setVisibility(8);
                    } else {
                        this.l.setVisibility(0);
                        this.l.getPaint().setFlags(16);
                        ah.a(this.l, String.format("¥%s", com.sankuai.waimai.foundation.utils.h.a(product.sku.originPrice)));
                    }
                    this.m.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.n.3
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2073230429ba21c648fbd382187597b", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2073230429ba21c648fbd382187597b");
                                return;
                            }
                            JudasManualManager.a("b_saxi69g4").a("poi_id", String.valueOf(bVar.n.a)).a("result_id", String.valueOf(bVar.c)).a("package_snapshot_id", String.valueOf(bVar.n.e != null ? bVar.n.e.a : null)).a();
                            ArrayList arrayList = new ArrayList();
                            product.sku.count = 1;
                            arrayList.add(product.convert2OrderFood());
                            n.this.c.a(n.this.b, arrayList, jVar.a);
                        }
                    });
                }
            }
            if (jVar.e == null || jVar.e.f == null || jVar.e.f.size() <= 0) {
                return;
            }
            jVar.e.k = bVar.c;
            com.sankuai.waimai.sa.model.m mVar = jVar.e;
            Object[] objArr2 = {mVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7af022aa62c3901360c064e6769ec46", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7af022aa62c3901360c064e6769ec46");
                return;
            }
            if (this.q == null) {
                this.q = new o(this.b, this.c);
                this.o.addView(this.q.a(this.o));
            }
            final o oVar = this.q;
            Object[] objArr3 = {mVar};
            ChangeQuickRedirect changeQuickRedirect3 = o.a;
            if (PatchProxy.isSupport(objArr3, oVar, changeQuickRedirect3, false, "b38c21d09e1a07536b997e1d7f9d2e61", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, oVar, changeQuickRedirect3, false, "b38c21d09e1a07536b997e1d7f9d2e61");
            } else if (mVar != null) {
                oVar.i = mVar;
                Object[] objArr4 = {mVar};
                ChangeQuickRedirect changeQuickRedirect4 = o.a;
                if (PatchProxy.isSupport(objArr4, oVar, changeQuickRedirect4, false, "1a425499b727c9eac3f52a03eaffbf00", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, oVar, changeQuickRedirect4, false, "1a425499b727c9eac3f52a03eaffbf00");
                } else {
                    ah.a(oVar.f, mVar.c());
                    ah.a(oVar.e, mVar.b());
                    ah.a(oVar.g, mVar.d());
                }
                Object[] objArr5 = {mVar};
                ChangeQuickRedirect changeQuickRedirect5 = o.a;
                if (PatchProxy.isSupport(objArr5, oVar, changeQuickRedirect5, false, "1eee02007307045a349df72df58ac5c1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, oVar, changeQuickRedirect5, false, "1eee02007307045a349df72df58ac5c1");
                } else if (mVar != null && mVar.a() != null && mVar.a().size() != 0) {
                    List<Product> a4 = mVar.a();
                    if (a4 != null && a4 != null && a4.size() > 3) {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < 3; i++) {
                            arrayList.add(a4.get(i));
                        }
                        oVar.d.setVisibility(0);
                        oVar.h.setVisibility(8);
                        oVar.d.setText(oVar.d.getContext().getString(R.string.wm_sa_all_poi, Integer.valueOf(a4.size())));
                        oVar.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.o.2
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr6 = {view};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "831f0d8b0e63f2e87afc6cbc180ab49b", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "831f0d8b0e63f2e87afc6cbc180ab49b");
                                    return;
                                }
                                oVar.b.a(oVar.y, oVar.i);
                                if (oVar.i instanceof com.sankuai.waimai.sa.model.m) {
                                    JudasManualManager.a("b_i81wpp44").a("c_6tg6wz4r").a("result_id", ((com.sankuai.waimai.sa.model.m) oVar.i).k).a("package_snapshot_id", ((com.sankuai.waimai.sa.model.m) oVar.i).a).a("poi_id", oVar.i.h()).a();
                                }
                            }
                        });
                        a4 = arrayList;
                    } else {
                        oVar.d.setVisibility(8);
                        oVar.h.setVisibility(0);
                    }
                    oVar.c.setAdapter(new com.sankuai.waimai.sa.ui.assistant.adapter.d(oVar.f(), a4));
                    oVar.c.setOnItemClickListener(new LinearLayoutForList.a() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.o.3
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.widget.listforscrollview.LinearLayoutForList.a
                        public final void a(View view, Object obj, int i2) {
                            Object[] objArr6 = {view, obj, Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "2a90084042b9db97829650e43caa9c2a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "2a90084042b9db97829650e43caa9c2a");
                                return;
                            }
                            oVar.b.a(oVar.i.h(), oVar.i.a().get(i2));
                            if (oVar.i instanceof com.sankuai.waimai.sa.model.m) {
                                JudasManualManager.a("b_coacp1uj").a("c_6tg6wz4r").a("result_id", ((com.sankuai.waimai.sa.model.m) oVar.i).k).a("package_snapshot_id", ((com.sankuai.waimai.sa.model.m) oVar.i).a).a("intelligent_mj_group_sku_index", i2).a("poi_id", oVar.i.h()).a();
                            }
                        }
                    });
                }
                oVar.a(mVar);
            }
        }
    }
}
