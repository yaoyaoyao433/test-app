package com.sankuai.waimai.store.manager.marketing;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import com.sankuai.waimai.store.search.model.GlobalPageResponse;
import com.sankuai.waimai.store.search.model.GlobalSearchExtraInfo;
import com.sankuai.waimai.store.search.statistics.g;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.util.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public final Map<String, List<com.sankuai.waimai.store.manager.sequence.d>> a(Activity activity, View view, GlobalPageResponse globalPageResponse, d dVar) {
        com.sankuai.waimai.store.manager.sequence.d a2;
        Object[] objArr = {activity, view, globalPageResponse, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ebd034bad22b3bc63648f4b2a02fa2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ebd034bad22b3bc63648f4b2a02fa2f");
        }
        if (globalPageResponse == null || globalPageResponse.globalSearchExtraInfo == null || com.sankuai.shangou.stone.util.a.b(globalPageResponse.globalSearchExtraInfo.floatingInfoList)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (GlobalSearchExtraInfo.FloatingInfo floatingInfo : globalPageResponse.globalSearchExtraInfo.floatingInfoList) {
            if (floatingInfo != null && (a2 = a(activity, view, floatingInfo, dVar)) != null) {
                List list = (List) hashMap.get(MarketingModel.TYPE_RESIDENT_POPUP);
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(MarketingModel.TYPE_RESIDENT_POPUP, list);
                }
                list.add(a2);
            }
        }
        return hashMap;
    }

    private com.sankuai.waimai.store.manager.sequence.d a(Activity activity, View view, GlobalSearchExtraInfo.FloatingInfo floatingInfo, d dVar) {
        com.sankuai.waimai.store.manager.sequence.popup.b bVar;
        Map map;
        Object[] objArr = {activity, view, floatingInfo, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af696cd5e53f38c19d119c47b89d1881", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.manager.sequence.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af696cd5e53f38c19d119c47b89d1881");
        }
        if (floatingInfo == null || t.a(floatingInfo.cardMsg)) {
            com.dianping.judas.util.a.b("moduleData can not be match to SearchPopModel", new Object[0]);
            return null;
        }
        Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(new Gson().toJson(floatingInfo));
        a2.put("card_msg", com.sankuai.waimai.mach.utils.b.a(floatingInfo.cardMsg));
        SearchShareData b = SearchShareData.b((Context) activity);
        if (b != null) {
            Object[] objArr2 = {null, b};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "64bf5b1c7a408ba3724d5de59f77342c", RobustBitConfig.DEFAULT_VALUE)) {
                map = (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "64bf5b1c7a408ba3724d5de59f77342c");
            } else {
                HashMap hashMap = new HashMap();
                if (b != null) {
                    hashMap.put("keyword", b.h);
                    hashMap.put("search_log_id", b.q);
                    hashMap.put("stid", g.f(b));
                    hashMap.put("template_type", Integer.valueOf(b.D));
                    hashMap.put("cat_id", Integer.valueOf(b.z));
                    hashMap.put("search_source", Integer.valueOf(b.aw));
                    hashMap.put("search_global_id", b.r);
                    hashMap.put("rank_type", Long.valueOf(g.c(b)));
                    hashMap.put("filter_type", g.d(b));
                    hashMap.put("qw_type_id", b.g);
                    hashMap.put("label_word", b.l);
                    hashMap.put("sort_type", Integer.valueOf(b.aL));
                    hashMap.put("spu_mode", Integer.valueOf(b.aK));
                    hashMap.put("filter_codes", b.aM == null ? "" : b.aM);
                    hashMap.put("filter_mapping", b.aN == null ? "" : b.aN);
                    hashMap.put("paotui_channel", b.bp == null ? "" : b.bp);
                    hashMap.put("more_param", b.bq == null ? "" : b.bq);
                    hashMap.put("navigate_type", Long.valueOf(b.y));
                    hashMap.put("search_mode", Integer.valueOf(b.aH));
                    hashMap.put("is_filter_result", g.b(b));
                    hashMap.put("is_filter_sec_result", g.e(b));
                    hashMap.put("trace_info", b.aZ);
                    hashMap.put("user_prefer_type", b.ba);
                    hashMap.put("exp_ab_info", i.a(b.be));
                }
                map = hashMap;
            }
            a2.put("mach_custom_env_value", map);
        }
        com.sankuai.waimai.store.platform.marketing.a aVar = new com.sankuai.waimai.store.platform.marketing.a(floatingInfo.templateId, null, i.a(a2));
        try {
            com.sankuai.waimai.store.manager.marketing.parser.inner.mach.b bVar2 = new com.sankuai.waimai.store.manager.marketing.parser.inner.mach.b();
            bVar2.a(dVar);
            if (view.getContext() instanceof Activity) {
                MarketingModel.MarketingResidentModel marketingResidentModel = new MarketingModel.MarketingResidentModel();
                marketingResidentModel.autoCloseTime = 4L;
                marketingResidentModel.delayShowTime = 1L;
                marketingResidentModel.enterAnimDuration = 500L;
                marketingResidentModel.enterAnimType = MarketingModel.POPUP_ANIMATION_BOTTOM_TO_TOP;
                MarketingModel.Gravity gravity = new MarketingModel.Gravity();
                gravity.horizontal = "center";
                gravity.vertical = "bottom";
                marketingResidentModel.gravity = gravity;
                marketingResidentModel.isLeavePageClose = true;
                marketingResidentModel.offsetX = 0;
                marketingResidentModel.offsetY = -20;
                marketingResidentModel.maxShowTimes = 0;
                bVar = new com.sankuai.waimai.store.manager.sequence.popup.b(activity, bVar2, view, marketingResidentModel);
                bVar.a(new com.sankuai.waimai.store.manager.sequence.strategy.c(marketingResidentModel.showTimesKey, marketingResidentModel.maxShowTimes));
            } else {
                bVar = null;
            }
            if (bVar != null) {
                bVar.g = dVar;
                bVar.e = aVar;
            }
            return bVar;
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return null;
        }
    }
}
