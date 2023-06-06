package com.sankuai.waimai.business.restaurant.base.ui;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.RooIconFont;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendPackage;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendPackageFloatResponse;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.log.judas.StatisticsRecyclerView;
import com.sankuai.waimai.log.judas.f;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.restaurant.shopcart.ui.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends com.sankuai.waimai.platform.base.b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    public StatisticsRecyclerView b;
    public com.sankuai.waimai.business.restaurant.goodsdetail.adapter.c c;
    public View.OnClickListener d;
    private View e;
    private TextView f;
    private TextView g;
    private RooIconFont h;
    private ViewGroup i;
    private com.sankuai.waimai.business.restaurant.base.manager.order.g j;
    private ab k;
    private boolean l;
    private String m;

    public static /* synthetic */ boolean a(f fVar, int i, List list) {
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "2ab6278265dd104fa43f6faa867c805d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "2ab6278265dd104fa43f6faa867c805d")).booleanValue() : i >= 0 && list != null && i < list.size();
    }

    public f(@NonNull Context context, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, ab abVar, boolean z) {
        super(context);
        Object[] objArr = {context, gVar, abVar, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2c08fa17a3a3aa6a12bc9b8e392cfc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2c08fa17a3a3aa6a12bc9b8e392cfc4");
            return;
        }
        this.j = gVar;
        this.k = abVar;
        this.l = true;
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d080455a3da64f5f1e877cb4ca3f9014", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d080455a3da64f5f1e877cb4ca3f9014");
        }
        this.i = viewGroup;
        Object[] objArr2 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ca847c48ad904c8d11e9dc074f09861", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ca847c48ad904c8d11e9dc074f09861");
        } else {
            this.e = viewGroup.findViewById(R.id.recommend_background);
            this.f = (TextView) viewGroup.findViewById(R.id.tv_recommend_main_title);
            this.g = (TextView) viewGroup.findViewById(R.id.tv_recommend_sub_title);
            this.h = (RooIconFont) viewGroup.findViewById(R.id.recommend_close);
            this.i.setOnClickListener(this);
            this.e.setOnClickListener(this);
            this.h.setOnClickListener(this);
        }
        Object[] objArr3 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a0a63a55481f87c1727a5b85442501ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a0a63a55481f87c1727a5b85442501ec");
        } else {
            this.b = (StatisticsRecyclerView) viewGroup.findViewById(R.id.recommend_package_list);
            this.b.setLayoutManager(new LinearLayoutManager(this.y));
        }
        return this.i;
    }

    public final void a(@NonNull RecommendPackageFloatResponse recommendPackageFloatResponse, int i, String str) {
        Object[] objArr = {recommendPackageFloatResponse, 0, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf91da95c2001ca90dad4052045bf7ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf91da95c2001ca90dad4052045bf7ca");
        } else if (recommendPackageFloatResponse.c == null) {
        } else {
            String str2 = recommendPackageFloatResponse.d;
            String str3 = recommendPackageFloatResponse.e;
            Object[] objArr2 = {str2, str3};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c41b25b3e7d0ed7828aad210df499b2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c41b25b3e7d0ed7828aad210df499b2");
            } else {
                if (aa.a(str2)) {
                    str2 = f().getString(R.string.wm_restaurant_recommend_package_popup_title);
                }
                if (aa.a(str3)) {
                    str3 = f().getString(R.string.wm_restaurant_recommend_package_popup_sub_title);
                }
                this.f.setText(str2);
                this.g.setText(str3);
            }
            RecommendPackage recommendPackage = recommendPackageFloatResponse.c;
            Object[] objArr3 = {recommendPackage, 0, str};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8c6d3bff07fe3dd62e184814b43bd1ac", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8c6d3bff07fe3dd62e184814b43bd1ac");
            } else if (recommendPackage != null) {
                final ArrayList<RecommendPackage.a> arrayList = new ArrayList<>();
                arrayList.addAll(recommendPackage.recommendItemList);
                a(arrayList);
                this.m = str;
                this.c = new com.sankuai.waimai.business.restaurant.goodsdetail.adapter.c((Activity) this.y, this.j, this.k, arrayList, str, recommendPackage.mSpuType, this.l);
                this.b.setAdapter(this.c);
                this.b.a();
                this.b.b();
                this.b.setOnLogReportListener(new f.b() { // from class: com.sankuai.waimai.business.restaurant.base.ui.f.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.log.judas.f.b
                    public final void b(int i2) {
                    }

                    @Override // com.sankuai.waimai.log.judas.f.b
                    public final void a(int i2) {
                        Object[] objArr4 = {Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f28256bf253463c7f072b0c26f8c9e07", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f28256bf253463c7f072b0c26f8c9e07");
                        } else if (!f.a(f.this, i2, arrayList) || arrayList == null || arrayList.size() <= i2) {
                        } else {
                            RecommendPackage.a aVar = (RecommendPackage.a) arrayList.get(i2);
                            StringBuilder sb = new StringBuilder();
                            Iterator<RecommendPackage.c> it = aVar.i.iterator();
                            while (it.hasNext()) {
                                sb.append(it.next().b);
                                sb.append(CommonConstant.Symbol.COMMA);
                            }
                            JudasManualManager.a a2 = JudasManualManager.b("b_waimai_h5tb8p7w_mv").a(f.this.b());
                            a2.b = AppUtil.generatePageInfoKey(f.this.f());
                            JudasManualManager.a a3 = a2.a("i_source", f.this.j.f).a("poi_id", f.this.j.f()).a("sku_id", sb.toString()).a("group_id", aVar.h).a("index", i2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(aVar.f);
                            JudasManualManager.a a4 = a3.a("current_price", sb2.toString());
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(aVar.g);
                            JudasManualManager.a a5 = a4.a("orig_price", sb3.toString());
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(aVar.f);
                            JudasManualManager.a a6 = a5.a("price", sb4.toString()).a("rec_reason", aVar.b).a("brand_id", f.this.j.A()).a("rank_list_id", f.this.m);
                            if (f.this.l) {
                                a6.a("ref_list_id", ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok"));
                            }
                            a6.a();
                        }
                    }
                });
            }
        }
    }

    private void a(ArrayList<RecommendPackage.a> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "231c44d001ff6daa0749c25525891556", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "231c44d001ff6daa0749c25525891556");
            return;
        }
        Iterator<RecommendPackage.a> it = arrayList.iterator();
        while (it.hasNext()) {
            if (com.sankuai.waimai.foundation.utils.d.a(it.next().i)) {
                it.remove();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61f06232d65182f599be0ab7b580ec83", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61f06232d65182f599be0ab7b580ec83");
            return;
        }
        int id = view.getId();
        if (id == R.id.recommend_close || id == R.id.recommend_background) {
            this.d.onClick(view);
            JudasManualManager.a a2 = JudasManualManager.a("b_waimai_7f6dbcq1_mc").a(b());
            a2.b = AppUtil.generatePageInfoKey(f());
            if (this.l) {
                a2.a("ref_list_id", ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok"));
                a2.a("rank_list_id", this.m);
            }
            a2.a();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4390dba97f6be76e988dfb8ea73d4dc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4390dba97f6be76e988dfb8ea73d4dc5");
        } else if (this.b != null) {
            this.b.a();
        }
    }

    public final String b() {
        return this.l ? "c_CijEL" : "c_u4fk4kw";
    }
}
