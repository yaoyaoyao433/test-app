package com.sankuai.waimai.sa.activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import com.sankuai.waimai.platform.widget.listforscrollview.LinearLayoutForList;
import com.sankuai.waimai.sa.model.Product;
import com.sankuai.waimai.sa.model.e;
import com.sankuai.waimai.sa.model.m;
import com.sankuai.waimai.sa.ui.assistant.chat.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements com.sankuai.waimai.sa.ui.assistant.a {
    public static ChangeQuickRedirect a;
    private Context b;
    private Activity c;
    private c d;

    public a(Context context, Activity activity) {
        Object[] objArr = {context, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbefea7fa41df97c879d81b58b4e7b9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbefea7fa41df97c879d81b58b4e7b9b");
            return;
        }
        this.b = context;
        this.c = activity;
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.a
    public final void a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c9482bca6b7b425aefe6169d62c25c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c9482bca6b7b425aefe6169d62c25c0");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("poiId", j);
        bundle.putString("poiName", str);
        com.sankuai.waimai.foundation.router.a.a(this.b, com.sankuai.waimai.foundation.router.interfaces.c.b, bundle);
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.a
    public final void a(long j, String str, long j2) {
        Object[] objArr = {new Long(j), str, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "786b1b9aacf45552dff2483757a30834", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "786b1b9aacf45552dff2483757a30834");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("poiId", j);
        bundle.putString("poiName", str);
        bundle.putString("from", null);
        bundle.putLong("foodId", j2);
        com.sankuai.waimai.foundation.router.a.a(this.c, com.sankuai.waimai.foundation.router.interfaces.c.b, bundle);
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.a
    public final void a(String str, long j, long j2) {
        Object[] objArr = {str, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f071879935890b0d3d7bd5c3c0c99856", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f071879935890b0d3d7bd5c3c0c99856");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("poiId", j);
        bundle.putString("poiName", str);
        bundle.putString("from", null);
        bundle.putLong("foodId", j2);
        bundle.putInt("need_add", 1);
        com.sankuai.waimai.foundation.router.a.a(this.c, com.sankuai.waimai.foundation.router.interfaces.c.b, bundle);
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd028fabacf29ef2a7440b1a60b00f71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd028fabacf29ef2a7440b1a60b00f71");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("hash_id", str);
        bundle.putBoolean("from_smart_assistant", true);
        com.sankuai.waimai.foundation.router.a.a(this.c, com.sankuai.waimai.foundation.router.interfaces.c.S, bundle);
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.a
    public final void a(long j, long j2, String str) {
        Object[] objArr = {new Long(j), new Long(j2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a212c3d405d37f768ca2a7fa66f24732", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a212c3d405d37f768ca2a7fa66f24732");
            return;
        }
        com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.FROM_SMART_ASSISTANT;
        AgainManager.getInstance().orderAgain(new AgainManager.b().a(this.c).a(String.valueOf(j)).b("0").a(j2).d(str).b);
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.a
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccbbeb1c94e30cbc16749b4dbe883d22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccbbeb1c94e30cbc16749b4dbe883d22");
        } else {
            com.sankuai.waimai.foundation.router.a.a(this.b, str);
        }
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.a
    public final void a(Context context, List<OrderedFood> list, long j) {
        Object[] objArr = {context, list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8307b9b80ef9d0a906a4ea9a9a98ad6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8307b9b80ef9d0a906a4ea9a9a98ad6");
        } else if (d.a(list)) {
        } else {
            Collections.reverse(list);
            Bundle bundle = new Bundle();
            bundle.putLong("poiId", j);
            bundle.putString("from", "");
            bundle.putBoolean("isopenshopcart", true);
            bundle.putString("PoiListFragment", "CurrentLocation");
            bundle.putSerializable("food_list", (ArrayList) list);
            com.sankuai.waimai.platform.shop.helper.a.a(context, com.sankuai.waimai.foundation.router.interfaces.c.b, bundle);
        }
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.a
    public final void a(long j, Product product) {
        Object[] objArr = {new Long(j), product};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd9069588787278fd1109d783e6cb3d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd9069588787278fd1109d783e6cb3d9");
        } else if (product == null) {
        } else {
            com.sankuai.waimai.platform.domain.manager.goods.a.a().c = product.convert2GoodsSpu();
            String str = e.a;
            HashMap hashMap = new HashMap();
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI, String.valueOf(j));
            hashMap.put("spuid", String.valueOf(product.spuId));
            hashMap.put("from", "2");
            if (product.sku != null) {
                hashMap.put(FoodDetailNetWorkPreLoader.URI_SKU, String.valueOf(product.sku.id));
            }
            com.sankuai.waimai.foundation.router.a.a(this.b, af.a(Uri.parse(str), hashMap).toString());
        }
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.a
    public final void a(Context context, com.sankuai.waimai.sa.model.c cVar) {
        Object[] objArr = {context, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e407a3d1a9a79efd7aacf4eeb6c51121", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e407a3d1a9a79efd7aacf4eeb6c51121");
            return;
        }
        if (this.d == null) {
            this.d = new c(context, this);
        }
        final c cVar2 = this.d;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar2, changeQuickRedirect2, false, "7f9a9bd8011c12e41e4304a2b780e6e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar2, changeQuickRedirect2, false, "7f9a9bd8011c12e41e4304a2b780e6e1");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("dubaotong", "显示底部dialog", new Object[0]);
        Object[] objArr3 = {cVar};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "cb26718d53f8c3ac491b1746986a05ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "cb26718d53f8c3ac491b1746986a05ef");
        } else {
            cVar2.m = cVar;
            ah.a(cVar2.c, cVar.b());
            ah.a(cVar2.d, cVar.c());
            cVar2.f.setAdapter(new com.sankuai.waimai.sa.ui.assistant.adapter.e(cVar2.b, cVar.a()));
            cVar2.f.setOnItemClickListener(new LinearLayoutForList.a() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.c.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.listforscrollview.LinearLayoutForList.a
                public final void a(View view, Object obj, int i) {
                    Object[] objArr4 = {view, obj, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "587dec027dcffde7696648f603314b0f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "587dec027dcffde7696648f603314b0f");
                        return;
                    }
                    cVar2.n.a(cVar2.m.h(), cVar2.m.a().get(i));
                    com.sankuai.waimai.foundation.utils.log.a.b("BottomPackageDetailDialog", "sku index=" + i, new Object[0]);
                    if (cVar2.m instanceof com.sankuai.waimai.sa.model.m) {
                        JudasManualManager.a("b_od5znzmh").a("c_6tg6wz4r").a("result_id", ((com.sankuai.waimai.sa.model.m) cVar2.m).k).a("package_snapshot_id", ((com.sankuai.waimai.sa.model.m) cVar2.m).a).a("intelligent_mj_group_sku_index", i).a("poi_id", cVar2.m.h()).a();
                    }
                }
            });
            cVar2.g.setText(cVar2.b.getString(R.string.wm_smart_assistant_pick_price, h.a(cVar.e())));
            cVar2.h.setText(cVar2.b.getString(R.string.wm_sa_price_string, h.a(cVar.f())));
            if (h.a(Double.valueOf(cVar.f()), Double.valueOf(cVar.g()))) {
                cVar2.i.setVisibility(8);
            } else {
                cVar2.i.setVisibility(0);
                cVar2.i.setText(String.format("¥%s", h.a(cVar.g())));
                cVar2.i.getPaint().setFlags(16);
            }
        }
        if (cVar2.l != null) {
            cVar2.l.show();
        } else {
            cVar2.l = new CustomDialog.a(cVar2.b).a(cVar2.k).a(cVar2.o, -2).c();
            cVar2.l.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        cVar2.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr4 = {view};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "950aea70729349e5e83116ea4347d2b9", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "950aea70729349e5e83116ea4347d2b9");
                } else if (cVar2.l == null || !cVar2.l.isShowing()) {
                } else {
                    cVar2.l.dismiss();
                }
            }
        });
        cVar2.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.c.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List<Product> a2;
                Object[] objArr4 = {view};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c1feb6ca4d6a6abcf31278541979979f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c1feb6ca4d6a6abcf31278541979979f");
                } else if (cVar2.m != null && (a2 = cVar2.m.a()) != null && a2.size() != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (Product product : a2) {
                        arrayList.add(product.convert2OrderFood());
                    }
                    cVar2.n.a(cVar2.b, arrayList, cVar2.m.h());
                    if (cVar2.m instanceof com.sankuai.waimai.sa.model.m) {
                        JudasManualManager.a("b_3af19twf").a("c_6tg6wz4r").a("result_id", ((com.sankuai.waimai.sa.model.m) cVar2.m).k).a("package_snapshot_id", ((com.sankuai.waimai.sa.model.m) cVar2.m).a).a("poi_id", cVar2.m.h()).a();
                    }
                }
            }
        });
        if (cVar instanceof m) {
            m mVar = (m) cVar;
            JudasManualManager.b("b_k3wzs1q6").a("c_6tg6wz4r").a("result_id", mVar.k).a("package_snapshot_id", mVar.a).a("poi_id", cVar2.m.h()).a();
        }
    }
}
