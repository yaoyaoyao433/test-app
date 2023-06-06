package com.sankuai.waimai.business.search.global.filterbar;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.config.ILoadConfig;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SearchLoadConfig implements ILoadConfig {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.config.ILoadConfig
    public void loadConfig(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbb5a6f0cfb8c125d4155cb68f86ee41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbb5a6f0cfb8c125d4155cb68f86ee41");
        } else if (context == null || jSONObject == null) {
        } else {
            setFilterBar(context, jSONObject);
        }
    }

    private void setFilterBar(Context context, @NonNull JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15464cfe5fe6d8e4da1f275f9d5a41f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15464cfe5fe6d8e4da1f275f9d5a41f9");
            return;
        }
        com.sankuai.waimai.platform.widget.filterbar.implement.converter.a aVar = new com.sankuai.waimai.platform.widget.filterbar.implement.converter.a();
        HashMap hashMap = new HashMap();
        JSONObject optJSONObject = jSONObject.optJSONObject("sortby_search");
        if (optJSONObject != null) {
            hashMap.put(com.sankuai.waimai.platform.widget.filterbar.domain.repository.c.SEARCH_GLOBAL_POI, aVar.a(com.sankuai.waimai.platform.widget.filterbar.implement.model.b.a(optJSONObject.optJSONArray("SEARCH_POI"))));
            hashMap.put(com.sankuai.waimai.platform.widget.filterbar.domain.repository.c.SEARCH_GLOBAL_PRODUCT, aVar.a(com.sankuai.waimai.platform.widget.filterbar.implement.model.b.a(optJSONObject.optJSONArray("SEARCH_PRODUCT"))));
        }
        com.sankuai.waimai.platform.widget.filterbar.implement.injection.a.a(context, null).b(hashMap);
    }
}
