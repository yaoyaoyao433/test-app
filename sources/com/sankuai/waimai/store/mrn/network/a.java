package com.sankuai.waimai.store.mrn.network;

import com.meituan.android.mrn.module.utils.c;
import com.meituan.android.mrn.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.util.monitor.cache.ApiCache;
import com.sankuai.waimai.store.util.monitor.cache.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements i {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.network.i
    public final void a(final i.a aVar, final c cVar) {
        Object[] objArr = {aVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43be97835540c4779882e2ebc1ceab12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43be97835540c4779882e2ebc1ceab12");
        } else {
            aVar.a(aVar.a(), new c() { // from class: com.sankuai.waimai.store.mrn.network.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mrn.module.utils.c
                public final void a(JSONObject jSONObject) {
                    JSONObject optJSONObject;
                    int optInt;
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a645a96291b6c4b55e0eb970073ff2a4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a645a96291b6c4b55e0eb970073ff2a4");
                        return;
                    }
                    if (cVar != null) {
                        cVar.a(jSONObject);
                    }
                    JSONObject a2 = aVar.a();
                    if (a2 == null || jSONObject == null) {
                        return;
                    }
                    String optString = a2.optString("url");
                    String optString2 = a2.optString("baseURL");
                    String optString3 = a2.optString("data");
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
                    if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("data")) == null || (optInt = optJSONObject.optInt("code")) != 0) {
                        return;
                    }
                    String jSONObject2 = optJSONObject.toString();
                    if (t.a(jSONObject2)) {
                        return;
                    }
                    b.a(ApiCache.create(optString2 + optString, optString3, jSONObject2, optInt));
                }

                @Override // com.meituan.android.mrn.module.utils.c
                public final void a(String str, Throwable th, JSONObject jSONObject) {
                    Object[] objArr2 = {str, th, jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "199e8589da7d470a8f16f04ccc2625a1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "199e8589da7d470a8f16f04ccc2625a1");
                    } else if (cVar != null) {
                        cVar.a(str, th, jSONObject);
                    }
                }
            });
        }
    }
}
