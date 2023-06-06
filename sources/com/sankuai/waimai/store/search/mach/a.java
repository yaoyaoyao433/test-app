package com.sankuai.waimai.store.search.mach;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.store.poi.list.util.NewGusetBuyMachBridge;
import com.sankuai.waimai.store.search.common.view.d;
import com.sankuai.waimai.store.search.data.f;
import com.sankuai.waimai.store.search.model.GuidedItem;
import com.sankuai.waimai.store.search.template.machcontainer.b;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.util.i;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements Mach.d {
    public static ChangeQuickRedirect a;
    private Context b;
    private SearchShareData c;
    private b.a d;

    public a(Context context, SearchShareData searchShareData, b.a aVar) {
        Object[] objArr = {context, searchShareData, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b60e0475ad6e10571afe1c764e34a109", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b60e0475ad6e10571afe1c764e34a109");
            return;
        }
        this.b = context;
        this.c = searchShareData;
        this.d = aVar;
    }

    @Override // com.sankuai.waimai.mach.Mach.d
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d39fda1a0cbe8b79d810e1a3da7a351", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d39fda1a0cbe8b79d810e1a3da7a351");
        } else if (TextUtils.equals(str, "std_trigger_expose_event") && this.d != null) {
            this.d.a();
        } else if (map == null) {
        } else {
            char c = 65535;
            switch (str.hashCode()) {
                case -1536479478:
                    if (str.equals("over_page_search_search_request")) {
                        c = 3;
                        break;
                    }
                    break;
                case -985589089:
                    if (str.equals("filter_search_request")) {
                        c = 0;
                        break;
                    }
                    break;
                case 6024897:
                    if (str.equals("submit_order_direct")) {
                        c = 5;
                        break;
                    }
                    break;
                case 415466188:
                    if (str.equals("search_second_search_request")) {
                        c = 1;
                        break;
                    }
                    break;
                case 867196806:
                    if (str.equals("second_search_tab_change")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1873440570:
                    if (str.equals("over_page_filter_search_request")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    Object[] objArr2 = {map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a489d89718365967aa47d2976b66f80c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a489d89718365967aa47d2976b66f80c");
                        return;
                    }
                    map.get("search_action_from");
                    Object obj = map.get("selected_filter_code");
                    if (obj instanceof String) {
                        this.c.ae = (String) obj;
                    } else {
                        this.c.ae = "";
                    }
                    SearchShareData searchShareData = this.c;
                    f.b bVar = new f.b(7);
                    bVar.h = true;
                    searchShareData.a(bVar);
                    return;
                case 1:
                case 2:
                case 3:
                    Object[] objArr3 = {map, str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "78a9a5d73d120eb990a469780a9848f3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "78a9a5d73d120eb990a469780a9848f3");
                        return;
                    }
                    Object obj2 = map.get("selected_item");
                    if (!(obj2 instanceof Map)) {
                        com.sankuai.waimai.store.base.log.a.a("mach poi template js error, selectedItem = " + obj2);
                        return;
                    }
                    GuidedItem guidedItem = (GuidedItem) i.a(i.a(obj2), GuidedItem.class);
                    if (guidedItem == null || this.c == null) {
                        return;
                    }
                    if (TextUtils.equals(str, "search_second_search_request")) {
                        guidedItem.searchText = guidedItem.showText;
                        guidedItem.text = guidedItem.showText;
                        this.c.a(new f.c(guidedItem, "_search_second_search"));
                        return;
                    } else if (TextUtils.equals(str, "over_page_filter_search_request")) {
                        this.c.a(new f.c(guidedItem, "_search_over_page_filer"));
                        d.a(this.b, guidedItem.searchFilterDot, this.c);
                        return;
                    } else if (TextUtils.equals(str, "over_page_search_search_request")) {
                        this.c.a(new f.c(guidedItem, "_search_over_page_search_group"));
                        return;
                    } else {
                        return;
                    }
                case 4:
                    Object[] objArr4 = {map};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ea3620623f4298e5a8277cf01b16c285", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ea3620623f4298e5a8277cf01b16c285");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("action", "refresh_second_search_banner_filter_list");
                        jSONObject.put("filterList", map.get("tabFilterGroup"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    JsHandlerFactory.publish(jSONObject);
                    return;
                case 5:
                    NewGusetBuyMachBridge.a(map, this.b);
                    return;
                default:
                    return;
            }
        }
    }
}
