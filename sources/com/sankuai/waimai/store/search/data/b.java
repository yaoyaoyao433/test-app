package com.sankuai.waimai.store.search.data;

import android.support.annotation.VisibleForTesting;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.CardInfo;
import com.sankuai.waimai.store.search.model.ForbiddenInfo;
import com.sankuai.waimai.store.search.model.HotRankEntity;
import com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    @VisibleForTesting
    public Map<String, Class<?>> b;

    public b() {
        Map<String, Class<?>> provideDeserializeModels;
        Map<String, Class<?>> provideDeserializeModels2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7197357b2df30d63d66777f59713ba21", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7197357b2df30d63d66777f59713ba21");
            return;
        }
        this.b = new HashMap();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "39694ae8a0ccb909a692857a1b131514", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "39694ae8a0ccb909a692857a1b131514");
        } else {
            this.b.put("wm_search_forbidden", ForbiddenInfo.class);
            this.b.put("wm_search_direct_card", com.sankuai.waimai.store.search.model.a.class);
            this.b.put("wm_shangou_search_hot_label_rank", HotRankEntity.class);
            this.b.put("wm_shangou_search_nondelivery_paotui_card", CardInfo.class);
            this.b.put("wm_shangou_search_nonlbs_service_card", CardInfo.class);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4152ea19edb8b174d18b6c9e26fcb479", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4152ea19edb8b174d18b6c9e26fcb479");
            return;
        }
        ISearchTemplateProvider iSearchTemplateProvider = (ISearchTemplateProvider) com.sankuai.waimai.router.a.a(ISearchTemplateProvider.class, ISearchTemplateProvider.ROUTER_SERVICE_KEY_STORE_SEARCH);
        ISearchTemplateProvider iSearchTemplateProvider2 = (ISearchTemplateProvider) com.sankuai.waimai.router.a.a(ISearchTemplateProvider.class, ISearchTemplateProvider.ROUTER_SERVICE_KEY_DRUG_SEARCH);
        if (iSearchTemplateProvider != null && (provideDeserializeModels2 = iSearchTemplateProvider.provideDeserializeModels()) != null) {
            this.b.putAll(provideDeserializeModels2);
        }
        if (iSearchTemplateProvider2 == null || (provideDeserializeModels = iSearchTemplateProvider2.provideDeserializeModels()) == null) {
            return;
        }
        this.b.putAll(provideDeserializeModels);
    }
}
