package com.sankuai.waimai.alita.core.jsexecutor.modules;

import android.support.annotation.Nullable;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i extends com.sankuai.waimai.alita.core.jsexecutor.modules.a {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final String a() {
        return "getFeaturesWithBiz";
    }

    public static /* synthetic */ void a(i iVar, List list, m mVar, String str, String str2) {
        Object[] objArr = {list, mVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, iVar, changeQuickRedirect, false, "21c2769f079d9d70eeb5e956b414e447", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, iVar, changeQuickRedirect, false, "21c2769f079d9d70eeb5e956b414e447");
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2) != null && ((a) list.get(i2)).a) {
                i++;
            }
        }
        if (i == list.size()) {
            int b2 = com.sankuai.waimai.alita.core.engine.d.a().b(str2);
            try {
                com.sankuai.waimai.alita.core.utils.c.a("checkFinished | merge json | " + str2);
                JSONObject jSONObject = new JSONObject();
                for (int i3 = 0; i3 < list.size(); i3++) {
                    if (((a) list.get(i3)).b != null) {
                        com.sankuai.waimai.alita.core.utils.c.a("merge | " + ((a) list.get(i3)).b.toString());
                        iVar.a(jSONObject, ((a) list.get(i3)).b);
                    }
                }
                com.sankuai.waimai.alita.core.engine.e.a().b(str2, b2, true);
                iVar.a(str2, mVar, str, jSONObject);
            } catch (Exception e) {
                com.sankuai.waimai.alita.core.engine.e.a().b(str2, b2, false);
                iVar.a(mVar, str, e.getMessage());
            }
        }
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final void a(String str, String str2, String str3, m mVar) {
        Object[] objArr = {str, str2, str3, mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c78a6ce565d3d69853cff1ea4ab5464", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c78a6ce565d3d69853cff1ea4ab5464");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a("JsBridge getFeaturesWithBiz: taskKey = " + str + ", callbackId = " + str3 + ", args = " + str2);
        int b2 = com.sankuai.waimai.alita.core.engine.d.a().b(str);
        com.sankuai.waimai.alita.core.engine.e.a().d(str, b2);
        HashMap<String, List<com.sankuai.waimai.alita.core.feature.d>> b3 = b(str2);
        if (b3.size() == 0) {
            com.sankuai.waimai.alita.core.engine.e.a().b(str, b2, false);
            a(mVar, str3, "biz param fault");
            return;
        }
        a(b3, mVar, str3, str);
    }

    private HashMap<String, List<com.sankuai.waimai.alita.core.feature.d>> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df3f610919c3cb7ea24dd3e6f16729a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df3f610919c3cb7ea24dd3e6f16729a8");
        }
        HashMap<String, List<com.sankuai.waimai.alita.core.feature.d>> hashMap = new HashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                List<com.sankuai.waimai.alita.core.feature.d> list = (List) com.sankuai.waimai.alita.core.utils.k.a().fromJson(jSONObject.getString(next), new TypeToken<List<com.sankuai.waimai.alita.core.feature.d>>() { // from class: com.sankuai.waimai.alita.core.jsexecutor.modules.i.1
                }.getType());
                for (int i = 0; i < list.size(); i++) {
                    list.get(i).b = next;
                }
                hashMap.put(next, list);
            }
        } catch (Exception e) {
            com.sankuai.waimai.alita.core.utils.c.a("toFeatureConfig | " + e.getMessage());
        }
        return hashMap;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public boolean a;
        public JSONObject b;

        public a() {
        }
    }

    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v3 */
    private void a(HashMap<String, List<com.sankuai.waimai.alita.core.feature.d>> hashMap, final m mVar, final String str, final String str2) {
        Executor a2;
        ?? r10 = 0;
        Object[] objArr = {hashMap, mVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "437199c7260b7408038c03dc6cbe0d9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "437199c7260b7408038c03dc6cbe0d9a");
            return;
        }
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i = 0; i < hashMap.size(); i++) {
            copyOnWriteArrayList.add(i, null);
        }
        int i2 = 0;
        for (Map.Entry<String, List<com.sankuai.waimai.alita.core.feature.d>> entry : hashMap.entrySet()) {
            final String key = entry.getKey();
            List<com.sankuai.waimai.alita.core.feature.d> value = entry.getValue();
            int i3 = i2 + 1;
            com.sankuai.waimai.alita.core.feature.b a3 = com.sankuai.waimai.alita.core.feature.c.a().a(key);
            if (a3 == null) {
                com.sankuai.waimai.alita.core.utils.c.a("unsupported biz name : " + key);
            } else {
                Object[] objArr2 = new Object[1];
                objArr2[r10] = str2;
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.core.jsexecutor.modules.a.a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93559845935575065347cfbd6279838e", RobustBitConfig.DEFAULT_VALUE)) {
                    a2 = (Executor) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, r10, "93559845935575065347cfbd6279838e");
                } else {
                    com.sankuai.waimai.alita.core.jsexecutor.g a4 = a(str2);
                    a2 = a4 == null ? null : a4.a();
                }
                if (a2 == null) {
                    com.sankuai.waimai.alita.core.utils.c.a("GetFeaturesWithBizMethod queryAsyncFeatureTable js executor is null");
                } else {
                    final int i4 = i2;
                    a3.a(a2, value, new com.sankuai.waimai.alita.core.feature.f() { // from class: com.sankuai.waimai.alita.core.jsexecutor.modules.i.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.alita.core.feature.f
                        public final void a(@Nullable final JSONObject jSONObject) {
                            Object[] objArr3 = {jSONObject};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "23cb0365e6136ff582292753760c9756", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "23cb0365e6136ff582292753760c9756");
                            } else if (jSONObject == null) {
                                com.sankuai.waimai.alita.core.utils.c.a("queryAsyncFeatureTable | onSuccess | result is null");
                            } else {
                                i.this.a(str2, new Runnable() { // from class: com.sankuai.waimai.alita.core.jsexecutor.modules.i.2.1
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ca61fed9af3db6dcf5620d2d2f37b7bb", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ca61fed9af3db6dcf5620d2d2f37b7bb");
                                            return;
                                        }
                                        com.sankuai.waimai.alita.core.utils.c.a("queryAsyncFeatureTable | " + str2 + " | " + jSONObject.toString());
                                        a aVar = new a();
                                        aVar.a = true;
                                        JSONObject jSONObject2 = new JSONObject();
                                        try {
                                            try {
                                                jSONObject2.put(key, jSONObject);
                                                aVar.b = jSONObject2;
                                            } catch (Exception e) {
                                                com.sankuai.waimai.alita.core.utils.c.a("queryAsyncFeatureTable | Exception | " + str2 + " | " + e.getMessage());
                                            }
                                        } finally {
                                            copyOnWriteArrayList.set(i4, aVar);
                                            i.a(i.this, copyOnWriteArrayList, mVar, str, str2);
                                        }
                                    }
                                });
                            }
                        }

                        @Override // com.sankuai.waimai.alita.core.feature.f
                        public final void a(@Nullable final Exception exc) {
                            Object[] objArr3 = {exc};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bab70b2a9cc9ea3513d22ac503e5d01a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bab70b2a9cc9ea3513d22ac503e5d01a");
                            } else {
                                i.this.a(str2, new Runnable() { // from class: com.sankuai.waimai.alita.core.jsexecutor.modules.i.2.2
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9871c93d9e1af218451ad4d093ef0105", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9871c93d9e1af218451ad4d093ef0105");
                                            return;
                                        }
                                        StringBuilder sb = new StringBuilder("queryAsyncFeatureTable | onFailed | ");
                                        sb.append(str2);
                                        sb.append(" | ");
                                        sb.append(exc != null ? exc.getMessage() : "");
                                        com.sankuai.waimai.alita.core.utils.c.a(sb.toString());
                                        a aVar = new a();
                                        aVar.a = true;
                                        copyOnWriteArrayList.set(i4, aVar);
                                        i.a(i.this, copyOnWriteArrayList, mVar, str, str2);
                                    }
                                });
                            }
                        }
                    });
                }
            }
            i2 = i3;
            r10 = 0;
        }
    }

    private void a(JSONObject jSONObject, JSONObject... jSONObjectArr) {
        Object[] objArr = {jSONObject, jSONObjectArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc6c654fb32bf397a95bf9cec5ab8e12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc6c654fb32bf397a95bf9cec5ab8e12");
            return;
        }
        for (int i = 0; i <= 0; i++) {
            JSONObject jSONObject2 = jSONObjectArr[i];
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
}
