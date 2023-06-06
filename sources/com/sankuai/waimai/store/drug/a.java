package com.sankuai.waimai.store.drug;

import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.msc.modules.container.MSCActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.j;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.router.d;
import java.net.URLEncoder;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.router.activity.c {
    public static ChangeQuickRedirect a;

    public a() {
        super(MSCActivity.class);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60d68f207796abe7d08965aff4aabf95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60d68f207796abe7d08965aff4aabf95");
        }
    }

    @Override // com.sankuai.waimai.router.activity.a, com.sankuai.waimai.router.core.h
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        String str;
        String sb;
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0b9ced6ea6e79806bb7bb8a79221d55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0b9ced6ea6e79806bb7bb8a79221d55");
            return;
        }
        try {
            Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra", null);
            String query = jVar.d.getQuery();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.msc.utls.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "35e4823ef8ddbcf96498227fd7582c11", RobustBitConfig.DEFAULT_VALUE)) {
                sb = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "35e4823ef8ddbcf96498227fd7582c11");
            } else {
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.msc.utls.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "e2db5c2ef07553261e6ce9e22363dec0", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "e2db5c2ef07553261e6ce9e22363dec0");
                } else if (k.c()) {
                    str = com.sankuai.waimai.foundation.router.interfaces.b.c + "/msc?";
                } else {
                    str = k.e() ? "dianping://msc?" : "imeituan://www.meituan.com/msc?";
                }
                sb2.append(str);
                sb2.append("appId=61cbdaae3b504b9b");
                sb = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder(sb);
            sb3.append("&targetPath=");
            if (bundle != null && !t.a(bundle.getString(FoodDetailNetWorkPreLoader.URI_POI_STR))) {
                sb3.append(URLEncoder.encode("/pages/msc/drug-goods-detail/index?poi_id_str=" + bundle.getString(FoodDetailNetWorkPreLoader.URI_POI_STR) + "&wmpoiid=" + bundle.getLong(FoodDetailNetWorkPreLoader.URI_POI) + "&spuid=" + bundle.getLong("spuid") + "&skuid=" + bundle.getLong(FoodDetailNetWorkPreLoader.URI_SKU), "UTF-8"));
            } else {
                sb3.append(URLEncoder.encode("/pages/msc/drug-goods-detail/index?" + query, "UTF-8"));
            }
            com.sankuai.shangou.stone.util.log.a.a("newTargetPath", sb3.toString(), new Object[0]);
            d.a(jVar.c, sb3.toString());
            gVar.a(200);
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
    }
}
