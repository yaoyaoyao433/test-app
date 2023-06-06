package com.sankuai.waimai.business.page.common.config;

import android.content.Context;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.list.model.b;
import com.sankuai.waimai.business.page.common.list.model.c;
import com.sankuai.waimai.business.page.common.view.listfloat.IntelligentEntranceBlock;
import com.sankuai.waimai.business.page.home.helper.ResourceHelper;
import com.sankuai.waimai.foundation.location.v2.h;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.config.ILoadConfig;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.b;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PageLoadConfig implements ILoadConfig {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.config.ILoadConfig
    public void loadConfig(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9bf63b064221793c5e0855aa102a5df1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9bf63b064221793c5e0855aa102a5df1");
        } else if (jSONObject != null) {
            setDislikeReasonInfo(context, jSONObject);
            setResource(context, jSONObject);
            setMsgCenterRefreshTime(context, jSONObject);
            setSimilarFavoSwitch(context, jSONObject);
            setFilterBar(context, jSONObject);
            setOrderAddressDistance(jSONObject);
            setHomeLocateRefreshDuration(context, jSONObject);
            setHomeNewStrategyAddressCacheDuration(jSONObject);
            setPoiListRefreshDuration(context, jSONObject);
            setUGCFeedListHasPreloadData(context, jSONObject);
            setIntelligentFloatingLayer(context, jSONObject);
        }
    }

    private void setIntelligentFloatingLayer(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4810463d52498025cd4362e2ba8a5d5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4810463d52498025cd4362e2ba8a5d5e");
            return;
        }
        c cVar = null;
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("intelligent_floating_layer");
            if (optJSONObject != null) {
                cVar = new c();
                cVar.a = optJSONObject.optBoolean("need_show");
                cVar.b = optJSONObject.optString("title");
                cVar.c = optJSONObject.optString("sub_title");
                cVar.d = optJSONObject.optString("guide_icon");
                cVar.e = optJSONObject.optString("entrance_icon");
                cVar.f = optJSONObject.optString(NetLogConstants.Details.SCHEME);
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "zim-intelligent_floating_layer", cVar);
            } else {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "zim-intelligent_floating_layer");
            }
            IntelligentEntranceBlock.a aVar = new IntelligentEntranceBlock.a();
            aVar.a = cVar;
            com.meituan.android.bus.a.a().c(aVar);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b("setIntelligentFloatingLayer", e);
        }
    }

    private void setUGCFeedListHasPreloadData(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "569bfac83f1e38ed8a7387b74685e480", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "569bfac83f1e38ed8a7387b74685e480");
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "refresh_home_feed_tab", jSONObject.optInt("refresh_home_feed_tab", 0) == 1);
        }
    }

    private void setOrderAddressDistance(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4282facc4c9daa261384fcfdb2fc0734", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4282facc4c9daa261384fcfdb2fc0734");
        } else {
            h.a(jSONObject.optInt("order_addr_distance", 0));
        }
    }

    private void setFilterBar(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7768ca517ecd1fc19eac71608796fcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7768ca517ecd1fc19eac71608796fcf");
            return;
        }
        com.sankuai.waimai.platform.widget.filterbar.implement.converter.a aVar = new com.sankuai.waimai.platform.widget.filterbar.implement.converter.a();
        HashMap hashMap = new HashMap();
        hashMap.put(com.sankuai.waimai.platform.widget.filterbar.domain.repository.c.GLOBAL, aVar.a(b.a(jSONObject.optJSONArray("sortby"))));
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "whole_city_filter_bar_data", jSONObject.optString("sortby"));
        JSONObject optJSONObject = jSONObject.optJSONObject("sortby_channel");
        if (optJSONObject != null) {
            hashMap.put(com.sankuai.waimai.platform.widget.filterbar.domain.repository.c.SELF_DELIVERY, aVar.a(b.a(optJSONObject.optJSONArray("SELF_DELIVERY"))));
            hashMap.put(com.sankuai.waimai.platform.widget.filterbar.domain.repository.c.WHOLE_CITY, aVar.a(b.a(optJSONObject.optJSONArray("WHOLE_CITY"))));
        }
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "is_new_filter_bar_style", jSONObject.optBoolean("filter_reveal"));
        com.sankuai.waimai.platform.widget.filterbar.implement.injection.a.a(com.meituan.android.singleton.b.a, null).b(hashMap);
        com.sankuai.waimai.platform.widget.filterbar.implement.injection.a.a(com.meituan.android.singleton.b.a, null).e(jSONObject.optString("filter_group_resource"));
    }

    private void setSimilarFavoSwitch(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfabaa98f5facaa3115fa5bf76b28c37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfabaa98f5facaa3115fa5bf76b28c37");
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "poi_list_show_similar_and_favorite_switch", jSONObject.optBoolean("poi_list_show_similar_and_favorite_switch", false));
        }
    }

    private void setMsgCenterRefreshTime(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69c30fc0dc87acfadd6c2c01680c17b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69c30fc0dc87acfadd6c2c01680c17b5");
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "message_center_refresh_time", jSONObject.optInt("message_center_refresh_time", 20));
        }
    }

    private void setResource(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a89c2bb5f4f2b5ebdbb8fa77c3b92b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a89c2bb5f4f2b5ebdbb8fa77c3b92b5");
            return;
        }
        ArrayList arrayList = null;
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("startconfig");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    com.sankuai.waimai.business.page.home.model.h hVar = new com.sankuai.waimai.business.page.home.model.h();
                    hVar.a(jSONObject2);
                    arrayList2.add(hVar);
                }
                arrayList = arrayList2;
            }
            new ResourceHelper(context).setResourceList(arrayList);
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.a(th);
            i.d(new com.sankuai.waimai.business.page.common.log.a().a("home_page_resource_show").b("parse_error").c(th.getMessage()).b());
        }
    }

    private void setDislikeReasonInfo(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3736fc20b1ac6dcea88f598a0e6f1739", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3736fc20b1ac6dcea88f598a0e6f1739");
            return;
        }
        com.sankuai.waimai.business.page.common.list.model.b bVar = null;
        JSONObject optJSONObject = jSONObject.optJSONObject("dislike_reason_info");
        if (optJSONObject != null) {
            bVar = new com.sankuai.waimai.business.page.common.list.model.b();
            bVar.a = optJSONObject.optString("add_tip");
            bVar.b = optJSONObject.optString("cancel_tip");
            bVar.c = new ArrayList<>();
            JSONArray optJSONArray = optJSONObject.optJSONArray("reason_list");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    b.a aVar = new b.a();
                    aVar.a = optJSONObject2.optInt("code");
                    aVar.b = optJSONObject2.optString("tip");
                    aVar.c = optJSONObject2.optInt("show_special");
                    bVar.c.add(aVar);
                }
            }
        }
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "dislike_reason_info", bVar);
    }

    private void setHomeLocateRefreshDuration(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fd1f91b85e85a2eeebb503e88978976", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fd1f91b85e85a2eeebb503e88978976");
            return;
        }
        int optInt = jSONObject.optInt("refresh_homepage_interval", -1);
        if (optInt > 0) {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "home_locate_refresh_duration", optInt * 60 * 1000);
        }
        int optInt2 = jSONObject.optInt("refresh_homepage_location_interval", -1);
        if (optInt2 > 0) {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "refresh_homepage_location_interval", optInt2 * 60 * 1000);
        }
    }

    private void setHomeNewStrategyAddressCacheDuration(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "615c8b9bdb72142054c65988ce1349aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "615c8b9bdb72142054c65988ce1349aa");
            return;
        }
        long optLong = jSONObject.optLong("address_cache_valid_time", -1L);
        if (optLong >= 0) {
            h.a(optLong * 60 * 1000);
        }
    }

    private void setPoiListRefreshDuration(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9808ce4092f9457478f2a03c7906d456", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9808ce4092f9457478f2a03c7906d456");
            return;
        }
        int optInt = jSONObject.optInt("refresh_poilist_interval", -1);
        if (optInt > 0) {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "poi_list_refresh_duration", optInt * 60 * 1000);
        }
    }
}
