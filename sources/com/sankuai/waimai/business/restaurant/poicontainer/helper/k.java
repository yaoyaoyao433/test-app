package com.sankuai.waimai.business.restaurant.poicontainer.helper;

import android.content.Context;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendPackage;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k {
    public static ChangeQuickRedirect a;

    public static void a(GoodsSpu goodsSpu, long j, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, Context context) {
        Object[] objArr = {goodsSpu, new Long(j), gVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b262ecae7f239eb7a259b0fe7791aee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b262ecae7f239eb7a259b0fe7791aee");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", gVar.f());
        hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
        hashMap.put("comment_id", Long.valueOf(j));
        JudasManualManager.a a2 = JudasManualManager.a("b_waimai_iehpqxcf_mc").a("c_CijEL");
        a2.b = AppUtil.generatePageInfoKey(context);
        a2.b(hashMap).a();
    }

    public static void a(RecommendPackage.a aVar, long j, String str, int i, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, Context context) {
        Object[] objArr = {aVar, new Long(j), str, Integer.valueOf(i), gVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6eb0462637326092a571e46c0bc14e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6eb0462637326092a571e46c0bc14e3");
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<RecommendPackage.c> it = aVar.i.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        JudasManualManager.a a2 = JudasManualManager.a("b_waimai_4tud30mn_mc").a("c_CijEL");
        a2.b = AppUtil.generatePageInfoKey(context);
        JudasManualManager.a a3 = a2.a("index", i).a("rank_list_id", str).a("comment_id", j).a("sku_id", sb.toString()).a("group_id", aVar.h).a("poi_id", gVar.f());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aVar.f);
        a3.a("price", sb2.toString()).a();
    }

    public static void b(RecommendPackage.a aVar, long j, String str, int i, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, Context context) {
        Object[] objArr = {aVar, new Long(j), str, Integer.valueOf(i), gVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df974d0c4281b2e734553ea1727b0851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df974d0c4281b2e734553ea1727b0851");
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<RecommendPackage.c> it = aVar.i.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        JudasManualManager.a a2 = JudasManualManager.a("b_waimai_4tud30mn_mv").a("c_CijEL");
        a2.b = AppUtil.generatePageInfoKey(context);
        JudasManualManager.a a3 = a2.a("index", i).a("rank_list_id", str).a("comment_id", j).a("sku_id", sb.toString()).a("group_id", aVar.h).a("poi_id", gVar.f());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aVar.f);
        a3.a("price", sb2.toString()).a();
    }
}
