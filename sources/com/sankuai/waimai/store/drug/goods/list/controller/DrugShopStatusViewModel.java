package com.sankuai.waimai.store.drug.goods.list.controller;

import android.arch.lifecycle.k;
import android.arch.lifecycle.o;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugShopStatusViewModel extends o {
    public static ChangeQuickRedirect a;
    public k<com.sankuai.waimai.store.drug.goods.list.model.a> b;
    public k<com.sankuai.waimai.store.drug.goods.list.model.b> c;
    public k<Boolean> d;
    public k<Boolean> e;
    public k<com.sankuai.waimai.store.drug.goods.list.model.c> f;
    public String g;

    public DrugShopStatusViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9061257b60f8f7196b44b173586a14aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9061257b60f8f7196b44b173586a14aa");
            return;
        }
        this.b = new k<>();
        this.c = new k<>();
        this.d = new k<>();
        this.e = new k<>();
        this.f = new k<>();
    }

    public static boolean a(@NonNull RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3a0cd1e7d0ce502f1254ea3a6dbc593", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3a0cd1e7d0ce502f1254ea3a6dbc593")).booleanValue() : com.sankuai.shangou.stone.util.a.b(restMenuResponse.mGoodPoiCategoryList) && restMenuResponse.mFoodSpuFloorsSize <= 0;
    }

    public static void a(String str, int i, @NonNull String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7892d056ac3e8e769d70bc52b7d1f519", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7892d056ac3e8e769d70bc52b7d1f519");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a("c_crkfv64n", str2, "b_waimai_fd2inn2v_mc").a("poi_id", str).a("reason_type", Integer.valueOf(i)).a();
        }
    }

    public static void b(String str, int i, @NonNull String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4db74801b3296d686d2d3fafea58b53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4db74801b3296d686d2d3fafea58b53");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b("c_crkfv64n", str2, "b_waimai_fd2inn2v_mv").a("poi_id", str).a("reason_type", Integer.valueOf(i)).a();
        }
    }
}
