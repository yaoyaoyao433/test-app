package com.sankuai.meituan.mapsdk.core;

import android.support.annotation.NonNull;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressBean;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private Map<String, List<com.sankuai.meituan.mapsdk.core.statistics.b>> b;
    private d c;
    private String d;

    public g(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56decddb2f92d63951c9bf3a26183cb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56decddb2f92d63951c9bf3a26183cb0");
            return;
        }
        this.c = dVar;
        this.d = com.sankuai.meituan.mapfoundation.datacollector.a.a(dVar.c.getContext());
        this.b = new HashMap();
    }

    public final void a(@NonNull com.sankuai.meituan.mapsdk.core.statistics.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80c1208a48c2fd09c0e89deb6b5780de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80c1208a48c2fd09c0e89deb6b5780de");
            return;
        }
        String a2 = bVar.a();
        List<com.sankuai.meituan.mapsdk.core.statistics.b> list = this.b.get(a2);
        if (list == null) {
            list = new LinkedList<>();
            this.b.put(a2, list);
        }
        list.add(bVar);
        if (list.size() > 50) {
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d1843e8d05eed7e7e319d742f02bc3e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d1843e8d05eed7e7e319d742f02bc3e");
                return;
            }
            try {
                List<com.sankuai.meituan.mapsdk.core.statistics.b> list2 = this.b.get(a2);
                if (list2 != null && !list2.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("mapsdk_provider", 3);
                    hashMap.put("mapsdk_product_key", this.c.o);
                    hashMap.put("page_message", this.d);
                    hashMap.put("mapsdk_platform", this.c.getPlatform());
                    JSONArray jSONArray = new JSONArray(new Gson().toJson(list2));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(AddressBean.TYPE_CABINET, jSONArray);
                    hashMap.put("render_log", jSONObject.toString());
                    com.sankuai.meituan.mapfoundation.datacollector.a.b(new com.sankuai.meituan.mapfoundation.datacollector.b("ditu", this.d, a2, "c_ditu_fibdledl", hashMap));
                }
            } catch (Exception e) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.e(e.getMessage());
            }
        }
    }
}
