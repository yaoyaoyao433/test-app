package com.sankuai.waimai.store.search.mach.secondsearch;

import android.app.Activity;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.recycler.c;
import com.sankuai.waimai.store.search.model.CommonMachData;
import com.sankuai.waimai.store.search.model.GuidedItem;
import com.sankuai.waimai.store.search.model.SecondSearchEntity;
import com.sankuai.waimai.store.search.model.l;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.mach.b;
import java.io.Serializable;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements com.sankuai.waimai.store.search.ui.result.mach.prerender.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.ui.result.mach.prerender.a
    public final CommonMachData a(Serializable serializable, String str, String str2, SearchShareData searchShareData, Activity activity, int i) {
        Object[] objArr = {serializable, str, str2, searchShareData, activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5ca742767992d880d0ad499b4493ea0", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommonMachData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5ca742767992d880d0ad499b4493ea0");
        }
        if (serializable instanceof SecondSearchEntity) {
            SecondSearchEntity secondSearchEntity = (SecondSearchEntity) serializable;
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) secondSearchEntity.tabFilterList)) {
                for (l lVar : secondSearchEntity.tabFilterList) {
                    if (lVar != null && !com.sankuai.shangou.stone.util.a.b(lVar.b)) {
                        for (GuidedItem guidedItem : lVar.b) {
                            if (guidedItem != null) {
                                guidedItem.textWidth = com.sankuai.waimai.store.search.util.a.a(activity, guidedItem.showText, null, false, 200, 12);
                            }
                        }
                    }
                }
            }
            String json = new Gson().toJson(secondSearchEntity);
            c a2 = b.a(searchShareData.t, "supermarket-search-second-search", "", activity, com.sankuai.waimai.mach.utils.b.a(json), json, i, 0, null, null, null, searchShareData.L == null ? null : searchShareData.L.f);
            if (a2 == null || a2.b() == null) {
                return null;
            }
            a2.a("mach_extra_key_biz_data", str);
            return new CommonMachData(a2, str2, secondSearchEntity);
        }
        return null;
    }
}
