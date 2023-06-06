package com.sankuai.waimai.alita.core.jsexecutor.modules;

import android.text.TextUtils;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.intention.AlitaIntention;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class AlitaIntentionNativeModules {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class AlitaGetIntentionsNativeMethod extends com.sankuai.waimai.alita.core.jsexecutor.modules.a {
        public static ChangeQuickRedirect b;

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public static class a implements Serializable {
            @SerializedName("intentions")
            @JsonAdapter(AlitaGetIntentConfigAdapter.class)
            public List<String> a;
        }

        @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
        public final String a() {
            return "getIntentions";
        }

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public static class AlitaGetIntentConfigAdapter extends TypeAdapter<List<String>> {
            public static ChangeQuickRedirect a;

            @Override // com.google.gson.TypeAdapter
            public /* synthetic */ List<String> read(JsonReader jsonReader) throws IOException {
                Object[] objArr = {jsonReader};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c9dd945f7a66588c28aa707a0dd08b9", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c9dd945f7a66588c28aa707a0dd08b9");
                }
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.STRING) {
                    return Arrays.asList(jsonReader.nextString().split("\\s*,\\s*"));
                }
                throw new IllegalStateException("AlitaGetIntentConfig.names 期望的类型是 String，实际的类型是 " + peek);
            }

            @Override // com.google.gson.TypeAdapter
            public /* synthetic */ void write(JsonWriter jsonWriter, List<String> list) throws IOException {
                List<String> list2 = list;
                Object[] objArr = {jsonWriter, list2};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ead848aca7ac422cfab48d470b682e5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ead848aca7ac422cfab48d470b682e5");
                } else if (com.sankuai.waimai.alita.core.utils.f.a(list2)) {
                } else {
                    jsonWriter.value(TextUtils.join(CommonConstant.Symbol.COMMA, list2));
                }
            }
        }

        @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
        public final void a(String str, String str2, String str3, m mVar) {
            Object[] objArr = {str, str2, str3, mVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "122f793d5afa179e3114ae5e49a0f905", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "122f793d5afa179e3114ae5e49a0f905");
                return;
            }
            try {
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                Map map = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "525e641fd9e73f720478391f568fe605", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "525e641fd9e73f720478391f568fe605") : (Map) com.sankuai.waimai.alita.core.utils.k.a().fromJson(str2, new TypeToken<Map<String, a>>() { // from class: com.sankuai.waimai.alita.core.jsexecutor.modules.AlitaIntentionNativeModules.AlitaGetIntentionsNativeMethod.1
                }.getType());
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : map.entrySet()) {
                    String str4 = (String) entry.getKey();
                    Map<String, AlitaIntention> a2 = com.sankuai.waimai.alita.core.intention.c.a().a(str4).a(((a) entry.getValue()).a);
                    JSONObject jSONObject2 = new JSONObject();
                    for (AlitaIntention alitaIntention : a2.values()) {
                        jSONObject2.put(alitaIntention.d, alitaIntention.b());
                    }
                    jSONObject.put(str4, jSONObject2);
                }
                Object[] objArr3 = {mVar, str3, 0, "success", jSONObject};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.core.jsexecutor.modules.a.a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "80788658ff682f764d117cfe957f5ecf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "80788658ff682f764d117cfe957f5ecf");
                } else if (mVar == null || TextUtils.isEmpty(str3)) {
                    com.sankuai.waimai.alita.core.utils.c.a("NativeCallback | no callback");
                } else {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("code", 0);
                        jSONObject3.put("msg", "success");
                        jSONObject3.put("data", jSONObject);
                        String jSONObject4 = jSONObject3.toString();
                        HashMap hashMap = new HashMap();
                        hashMap.put("bridge_name", a());
                        hashMap.put("result", jSONObject4);
                        hashMap.put("callbackId", str3);
                        com.sankuai.waimai.alita.core.utils.c.b("alita_js", (String) null, "bridgeCallback", (Map<String, Object>) hashMap);
                        mVar.a(str3, jSONObject4);
                    } catch (Exception e) {
                        a(mVar, str3, e.getMessage());
                    }
                }
            } catch (Exception e2) {
                a(mVar, str3, e2.getMessage());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends com.sankuai.waimai.alita.core.jsexecutor.modules.a {
        public static ChangeQuickRedirect b;

        @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
        public final String a() {
            return "removeIntention";
        }

        @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
        public final void a(String str, String str2, String str3, m mVar) {
            Object[] objArr = {str, str2, str3, mVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cb4792d297942c36fb40c22ae747013", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cb4792d297942c36fb40c22ae747013");
                return;
            }
            try {
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                AlitaIntention alitaIntention = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0507452ad479a53850b993bf026b1335", RobustBitConfig.DEFAULT_VALUE) ? (AlitaIntention) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0507452ad479a53850b993bf026b1335") : (AlitaIntention) com.sankuai.waimai.alita.core.utils.k.a().fromJson(str2, (Class<Object>) AlitaIntention.class);
                com.sankuai.waimai.alita.core.intention.a a = com.sankuai.waimai.alita.core.intention.c.a().a(alitaIntention.j);
                String str4 = alitaIntention.d;
                Object[] objArr3 = {str4};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.core.intention.a.a;
                if (PatchProxy.isSupport(objArr3, a, changeQuickRedirect3, false, "eb4b45964a474568888385e80a51894a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect3, false, "eb4b45964a474568888385e80a51894a");
                    return;
                }
                AlitaIntention remove = a.b.remove(str4);
                com.sankuai.waimai.alita.core.event.a aVar = new com.sankuai.waimai.alita.core.event.a();
                aVar.b = "intention_update";
                aVar.d = str4;
                aVar.c = a.c;
                if (remove != null) {
                    a.a(2, null, remove, aVar);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class b extends com.sankuai.waimai.alita.core.jsexecutor.modules.a {
        public static ChangeQuickRedirect b;

        @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
        public final String a() {
            return "updateIntention";
        }

        @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
        public final void a(String str, String str2, String str3, m mVar) {
            Object[] objArr = {str, str2, str3, mVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65f467bfb8bd0fca8b9b15e754646e4b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65f467bfb8bd0fca8b9b15e754646e4b");
                return;
            }
            try {
                AlitaIntention a = AlitaIntention.a(str2);
                com.sankuai.waimai.alita.core.intention.c.a().a(a.j).a(a);
            } catch (Exception unused) {
            }
        }
    }
}
