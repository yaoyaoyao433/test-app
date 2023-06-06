package com.sankuai.waimai.store.goods.list.utils;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.goods.list.constant.a;
import com.sankuai.waimai.store.goods.list.delegate.impl.d;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.router.h;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public static long b;
    public static Context c;

    public static /* synthetic */ void a(long j, GoodsSpu goodsSpu, GoodsSku goodsSku) {
        Object[] objArr = {new Long(j), goodsSpu, goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "913a10aa657ee17937f6f6bdaeab2a02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "913a10aa657ee17937f6f6bdaeab2a02");
        } else {
            com.meituan.android.bus.a.a().c(new d.a(null, goodsSpu, goodsSku, null, true, j));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static float b(com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu r18, android.app.Activity r19) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.utils.f.b(com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu, android.app.Activity):float");
    }

    public static String a(GoodsSpu goodsSpu, Activity activity) {
        String str;
        Object[] objArr = {goodsSpu, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc027da422967d4e89f684a6d275e9a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc027da422967d4e89f684a6d275e9a3");
        }
        new StringBuilder("buildUrl: ").append(System.currentTimeMillis());
        float b2 = b(goodsSpu, activity);
        try {
            StringBuilder sb = new StringBuilder(h.y);
            sb.append("?uri=" + URLEncoder.encode(a.C1182a.a, "utf-8"));
            sb.append("&page_height=" + b2);
            sb.append("&need_place_holder=true&is_roundview=true");
            str = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            str = null;
        }
        new StringBuilder("buildUrl: ").append(str);
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(final java.util.Map<java.lang.String, java.lang.Object> r15, final android.support.v4.app.FragmentActivity r16, com.sankuai.waimai.store.order.a r17, com.sankuai.waimai.store.goods.list.viewblocks.SGMSCDialogFragment r18) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.utils.f.a(java.util.Map, android.support.v4.app.FragmentActivity, com.sankuai.waimai.store.order.a, com.sankuai.waimai.store.goods.list.viewblocks.SGMSCDialogFragment):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap<java.lang.Long, java.lang.Integer> a(com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu r23, com.sankuai.waimai.store.platform.domain.core.poi.Poi r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.utils.f.a(com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu, com.sankuai.waimai.store.platform.domain.core.poi.Poi, java.lang.String):java.util.HashMap");
    }

    public static HashMap<Long, Integer> a(GoodsSpu goodsSpu, Poi poi) {
        int a2;
        Object[] objArr = {goodsSpu, poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a00b4bba21be32bcdc663f1c8c33cc54", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a00b4bba21be32bcdc663f1c8c33cc54");
        }
        HashMap<Long, Integer> hashMap = new HashMap<>();
        if (!com.sankuai.shangou.stone.util.a.b(goodsSpu.skus)) {
            for (GoodsSku goodsSku : goodsSpu.skus) {
                if (goodsSku != null && (a2 = com.sankuai.waimai.store.order.a.e().a(poi.getOfficialPoiId(), goodsSpu.getId(), goodsSku.id)) > 0) {
                    hashMap.put(Long.valueOf(goodsSku.id), Integer.valueOf(a2));
                }
            }
        }
        return hashMap;
    }

    private static GoodsAttr a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9db393452c53229a0bfd2a6259427289", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsAttr) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9db393452c53229a0bfd2a6259427289");
        }
        GoodsAttr goodsAttr = new GoodsAttr();
        try {
            goodsAttr.id = jSONObject.optLong("id");
            goodsAttr.value = jSONObject.optString("value", "");
            goodsAttr.setName(jSONObject.optString("name", ""));
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return goodsAttr;
    }
}
