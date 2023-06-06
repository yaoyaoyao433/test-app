package com.sankuai.waimai.business.search.common.util;

import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.platform.db.dao.PoiSearchHistory;
import com.sankuai.waimai.platform.db.logic.PoiSearchHistoryLogic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class g {
    public static ChangeQuickRedirect a;
    private static volatile g d;
    public JSONObject b;
    public JSONObject c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9836870de08e97fdc3ec55d79f030fcf", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9836870de08e97fdc3ec55d79f030fcf");
        }
        if (d == null) {
            synchronized (g.class) {
                if (d == null) {
                    d = new g();
                }
            }
        }
        return d;
    }

    public final WritableMap b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9b0d1d371cb1d6f1f5339427396ee20", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9b0d1d371cb1d6f1f5339427396ee20");
        }
        WritableMap createMap = Arguments.createMap();
        try {
            return com.meituan.android.mrn.utils.g.a(this.b);
        } catch (JSONException e) {
            e.printStackTrace();
            return createMap;
        }
    }

    public final WritableMap c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c5f741b2a475cdb45378e422ffde763", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c5f741b2a475cdb45378e422ffde763");
        }
        WritableMap createMap = Arguments.createMap();
        try {
            return com.meituan.android.mrn.utils.g.a(this.c);
        } catch (JSONException e) {
            e.printStackTrace();
            return createMap;
        }
    }

    public final String d() {
        List list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1a63455a035b8dc662a2e0c6dba7e38", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1a63455a035b8dc662a2e0c6dba7e38");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ea1dab49913fcb24fccaa0789946b3a", RobustBitConfig.DEFAULT_VALUE)) {
            list = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ea1dab49913fcb24fccaa0789946b3a");
        } else {
            ArrayList arrayList = new ArrayList();
            List<PoiSearchHistory> all = PoiSearchHistoryLogic.getAll();
            if (!com.sankuai.waimai.foundation.utils.d.a(all)) {
                if (all.size() > 10) {
                    all = all.subList(0, 10);
                }
                for (PoiSearchHistory poiSearchHistory : all) {
                    if (poiSearchHistory != null && !TextUtils.isEmpty(poiSearchHistory.getContent())) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("history_search_word", poiSearchHistory.getContent());
                        hashMap.put("wm_poi_id", poiSearchHistory.getPoiId());
                        hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, poiSearchHistory.getPoiIdStr());
                        arrayList.add(hashMap);
                    }
                }
            }
            list = arrayList;
        }
        return com.meituan.android.mrn.utils.g.a(list);
    }
}
