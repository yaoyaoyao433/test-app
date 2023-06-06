package com.sankuai.waimai.alita.modules;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.feature.h;
import com.sankuai.waimai.alita.core.jsexecutor.modules.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.alita.core.jsexecutor.modules.a {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final String a() {
        return a.a;
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final void a(String str, String str2, String str3, m mVar) {
        boolean z;
        int i;
        int i2;
        JSONObject jSONObject;
        Object[] objArr = {str, str2, str3, mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdd90ecc1c07ac135e0c4d3617e1973c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdd90ecc1c07ac135e0c4d3617e1973c");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a(str + " | FeatureMethodModule | " + str2);
        com.sankuai.waimai.alita.platform.debug.b.a("JsBridge " + a.a + ": taskKey = " + str + ", callbackId = " + str3 + ", args = " + str2);
        int b2 = com.sankuai.waimai.alita.core.engine.d.a().b(str);
        com.sankuai.waimai.alita.core.engine.e.a().d(str, b2);
        Object[] objArr2 = {str2};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        List list = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9100e1116964fa8de29eb042adc2d8dd", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9100e1116964fa8de29eb042adc2d8dd") : (List) new Gson().fromJson(str2, new TypeToken<List<com.sankuai.waimai.alita.core.feature.d>>() { // from class: com.sankuai.waimai.alita.modules.b.1
        }.getType());
        new ArrayList();
        JSONObject jSONObject2 = new JSONObject();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.sankuai.waimai.alita.core.feature.d dVar = (com.sankuai.waimai.alita.core.feature.d) it.next();
            if (TextUtils.isEmpty(dVar.d)) {
                com.sankuai.waimai.alita.core.utils.c.a("query empty features");
            } else {
                List<String> a = com.sankuai.waimai.alita.base.util.a.a(dVar.d);
                if (a.isEmpty()) {
                    com.sankuai.waimai.alita.core.utils.c.a("empty feature!");
                } else {
                    com.sankuai.waimai.alita.core.feature.b a2 = com.sankuai.waimai.alita.core.feature.c.a().a(dVar.b);
                    if (a2 == null) {
                        com.sankuai.waimai.alita.core.utils.c.a("unsupported biz name : " + dVar.b);
                    } else {
                        Object[] objArr3 = {dVar};
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        Iterator it2 = it;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "256327f682e2e04d3693ff062f703eb8", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "256327f682e2e04d3693ff062f703eb8")).booleanValue();
                        } else {
                            if ("waimai".equals(dVar.b)) {
                                if ("poi".equals(dVar.c)) {
                                    dVar.c = "uat_poi";
                                } else if ("global".equals(dVar.c)) {
                                    dVar.c = "uat_global";
                                }
                                z = true;
                            }
                            z = false;
                        }
                        if (!z) {
                            com.sankuai.waimai.alita.core.utils.c.a("unsupported table name : " + dVar.c);
                        } else {
                            h a3 = ((com.sankuai.waimai.alita.e) a2).a(dVar.c);
                            if (a3 == null) {
                                com.sankuai.waimai.alita.core.utils.c.a("unregistered producer for" + dVar.c);
                            } else {
                                JSONObject jSONObject3 = new JSONObject();
                                if ("uat_poi".equals(dVar.c)) {
                                    jSONObject = a(a3.a(dVar.c), a);
                                    i = b2;
                                    i2 = 1;
                                } else {
                                    if ("uat_global".equals(dVar.c)) {
                                        JSONObject a4 = a(a3.a("uat_global"), a);
                                        JSONObject a5 = a(a3.a("all_click_pois"), a);
                                        JSONObject a6 = a(a3.a("all_query_words"), a);
                                        JSONObject a7 = a(a3.a("current_session_click_pois"), a);
                                        JSONObject a8 = a(a3.a("current_session_query_words"), a);
                                        JSONObject a9 = a(a3.a("current_poilist_rank_id_click_pois"), a);
                                        i = b2;
                                        if (a.contains("last_interested_poi_info")) {
                                            a(jSONObject3, a4, a5, a6, a7, a8, a9, a(a3.a("last_interested_poi_info"), a));
                                            i2 = 1;
                                        } else {
                                            i2 = 1;
                                            a(jSONObject3, a4, a5, a6, a7, a8, a9);
                                        }
                                    } else {
                                        i = b2;
                                        i2 = 1;
                                    }
                                    jSONObject = jSONObject3;
                                }
                                try {
                                    String str4 = dVar.c;
                                    Object[] objArr4 = new Object[i2];
                                    objArr4[0] = str4;
                                    ChangeQuickRedirect changeQuickRedirect4 = b;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f17592a8c7212790dba3caf20e9e1b6a", RobustBitConfig.DEFAULT_VALUE)) {
                                        str4 = (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f17592a8c7212790dba3caf20e9e1b6a");
                                    } else if ("uat_poi".equals(str4)) {
                                        str4 = "waimai_poi";
                                    } else if ("uat_global".equals(str4)) {
                                        str4 = "waimai_global";
                                    }
                                    jSONObject2.put(str4, jSONObject);
                                } catch (Exception unused) {
                                }
                                it = it2;
                                b2 = i;
                            }
                        }
                        it = it2;
                    }
                }
            }
        }
        int i3 = b2;
        if (jSONObject2.length() > 0) {
            com.sankuai.waimai.alita.platform.debug.b.a("JsBridge " + a.a + ".success: taskKey = " + str + ", callbackId = " + str3 + ", result = " + jSONObject2);
            com.sankuai.waimai.alita.core.engine.e.a().b(str, i3, true);
            a(mVar, str3, jSONObject2);
            return;
        }
        com.sankuai.waimai.alita.platform.debug.b.a("JsBridge " + a.a + ".failed: taskKey = " + str + ", callbackId = " + str3);
        com.sankuai.waimai.alita.core.engine.e.a().b(str, i3, false);
        a(mVar, str3);
    }

    private void a(JSONObject jSONObject, JSONObject... jSONObjectArr) {
        Object[] objArr = {jSONObject, jSONObjectArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "813c6c89ee85cbaddd2cfa6d4c8efe86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "813c6c89ee85cbaddd2cfa6d4c8efe86");
            return;
        }
        for (JSONObject jSONObject2 : jSONObjectArr) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            } catch (Exception unused) {
            }
        }
    }

    private JSONObject a(JSONObject jSONObject, List<String> list) {
        Object[] objArr = {jSONObject, list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ced8566ba9ced7a0fe220456480cacb0", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ced8566ba9ced7a0fe220456480cacb0");
        }
        if (list.size() == 0 || "*".equals(list.get(0))) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (int i = 0; i < list.size(); i++) {
            if (jSONObject.has(list.get(i))) {
                try {
                    jSONObject2.put(list.get(i), jSONObject.get(list.get(i)));
                } catch (Exception unused) {
                }
            }
        }
        return jSONObject2;
    }
}
