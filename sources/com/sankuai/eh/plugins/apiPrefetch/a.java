package com.sankuai.eh.plugins.apiPrefetch;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.tools.e;
import com.sankuai.eh.component.service.utils.f;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.meituan.retrofit2.ap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a implements Handler.Callback {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;
    private long d;
    private Map<String, b> e;
    private JsonElement f;
    private com.sankuai.eh.plugins.a g;
    private e<a> h;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface d {
        void a(String str);

        void a(JSONObject jSONObject);
    }

    public a(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78b1b1b6c9e45f346c6312fb5caa5f97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78b1b1b6c9e45f346c6312fb5caa5f97");
            return;
        }
        this.h = new e<>(this);
        this.f = jsonElement;
        this.b = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(this.f, "url"), "");
        this.c = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(this.f, "pattern"), "");
        this.e = new HashMap();
    }

    public a(JsonElement jsonElement, com.sankuai.eh.plugins.a aVar) {
        this(jsonElement);
        Object[] objArr = {jsonElement, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b63c9d23e2ce75b65fd47c8d310ea1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b63c9d23e2ce75b65fd47c8d310ea1c");
        } else {
            this.g = aVar;
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86a2dfec52c711a0c97cd0ac81985899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86a2dfec52c711a0c97cd0ac81985899");
        } else {
            new d.c().a("ehc_apiFetch_lifecycle").a(Constants.SPEED_METER_STEP, str).b();
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc9360c7a117af43f54521d356b64d66", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc9360c7a117af43f54521d356b64d66")).booleanValue();
        }
        Map<String, JsonElement> c2 = com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.utils.b.a(this.f, "data"));
        if (f.a(com.sankuai.eh.component.service.utils.b.b(c2.get("ab")))) {
            int a2 = com.sankuai.eh.component.service.utils.b.a(c2.get(JsBridgeResult.ARG_KEY_LOCATION_MODE), 0);
            JsonArray b2 = com.sankuai.eh.component.service.utils.b.b(c2.get(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST));
            if (b2 == null || b2.size() <= 0) {
                return false;
            }
            if (this.g != null) {
                this.g.a(Integer.valueOf(b2.size()));
            }
            this.h.sendEmptyMessageDelayed(10, 8000L);
            if (a2 == 0) {
                a(com.sankuai.eh.component.service.utils.b.c(b2.get(0)));
                return true;
            } else if (a2 != 2) {
                return true;
            } else {
                Iterator<JsonElement> it = b2.iterator();
                while (it.hasNext()) {
                    a(com.sankuai.eh.component.service.utils.b.c(it.next()));
                }
                return true;
            }
        }
        return false;
    }

    private void a(Map<String, JsonElement> map) {
        String str;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5333411ab12fef1417734e00eb75805", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5333411ab12fef1417734e00eb75805");
            return;
        }
        a("api_before_fetch");
        this.d = System.currentTimeMillis();
        Map<String, JsonElement> c2 = com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.utils.b.a(b(map)));
        String b2 = com.sankuai.eh.component.service.utils.b.b(c2.get("url"), "");
        if (TextUtils.isEmpty(b2)) {
            return;
        }
        b bVar = new b();
        if (b2.startsWith("http")) {
            str = com.sankuai.eh.component.service.utils.b.b(c2.get("method"), "GET");
        } else {
            String[] split = b2.split(StringUtil.SPACE);
            str = split.length >= 2 ? split[0] : "";
            b2 = split.length >= 2 ? split[1] : "";
        }
        String b3 = b(b2);
        bVar.b = b3;
        bVar.c = com.sankuai.eh.component.service.utils.b.b(map.get("primaryKey"), "");
        bVar.d = com.sankuai.eh.component.service.utils.b.a(c2.get("delegate"), false).booleanValue();
        this.e.put(bVar.b, bVar);
        Map<String, String> a2 = a(c2.get("headers"));
        if (c2.containsKey("timeout")) {
            a2.put("retrofit-mt-request-timeout", com.sankuai.eh.component.service.utils.b.b(c2.get("timeout"), "8000"));
        }
        c cVar = new c(bVar, c2);
        Call<ap> call = null;
        if ("POST".equalsIgnoreCase(str)) {
            switch (a(a2, com.sankuai.eh.component.service.utils.b.a(c2.get("type"), 0))) {
                case 0:
                    a("api_before_form");
                    call = c(b3, a2, c2, cVar);
                    break;
                case 1:
                    call = b(b3, a2, c2, cVar);
                    break;
                case 2:
                    call = d(b3, a2, c2, cVar);
                    break;
            }
        } else if ("GET".equalsIgnoreCase(str)) {
            call = a(b3, a2, c2, cVar);
        }
        if (call == null) {
            bVar.a(EnumC0558a.ERROR);
            return;
        }
        bVar.g = call;
        a(bVar, b3, map);
    }

    private Call<ap> a(String str, Map<String, String> map, Map<String, JsonElement> map2, c cVar) {
        Object[] objArr = {str, map, map2, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "830ec4a1a9faba22703cd6db1d674158", RobustBitConfig.DEFAULT_VALUE)) {
            return (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "830ec4a1a9faba22703cd6db1d674158");
        }
        Map<String, JsonElement> c2 = com.sankuai.eh.component.service.utils.b.c(b(map2.get(SearchIntents.EXTRA_QUERY)));
        Uri.Builder buildUpon = com.sankuai.eh.component.service.utils.e.g(str).buildUpon();
        for (Map.Entry<String, JsonElement> entry : c2.entrySet()) {
            if (!TextUtils.isEmpty(com.sankuai.eh.component.service.utils.b.b(entry.getValue(), ""))) {
                buildUpon.appendQueryParameter(entry.getKey(), com.sankuai.eh.component.service.utils.b.b(entry.getValue(), ""));
            }
        }
        Call<ap> data = com.sankuai.eh.component.service.network.a.a(com.sankuai.eh.component.service.utils.b.a(map2.get(TrafficRecord.Detail.TUNNEL_SHARK), false).booleanValue()).getData(buildUpon.toString(), map);
        data.a(cVar);
        return data;
    }

    private Call<ap> b(String str, Map<String, String> map, Map<String, JsonElement> map2, c cVar) {
        Object[] objArr = {str, map, map2, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19f421db6958f099b2558ac1d698ee02", RobustBitConfig.DEFAULT_VALUE)) {
            return (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19f421db6958f099b2558ac1d698ee02");
        }
        Map map3 = (Map) com.sankuai.eh.component.service.utils.b.a(b(map2.get("body")), new TypeToken<HashMap<String, String>>() { // from class: com.sankuai.eh.plugins.apiPrefetch.a.1
        }.getType());
        if (map3 == null) {
            map3 = new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map3.entrySet()) {
            hashMap.put(entry.getKey(), al.a(((String) entry.getValue()).getBytes(), "multipart/form-data"));
        }
        Call<ap> postFormData = com.sankuai.eh.component.service.network.a.a(com.sankuai.eh.component.service.utils.b.a(map2.get(TrafficRecord.Detail.TUNNEL_SHARK), false).booleanValue()).postFormData(str, map, hashMap);
        postFormData.a(cVar);
        return postFormData;
    }

    private Call<ap> c(String str, Map<String, String> map, Map<String, JsonElement> map2, c cVar) {
        Object[] objArr = {str, map, map2, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af1e840bc92566d602c09f3e061ee063", RobustBitConfig.DEFAULT_VALUE)) {
            return (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af1e840bc92566d602c09f3e061ee063");
        }
        Map<String, String> map3 = (Map) com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.a(b(map2.get("body"))), new TypeToken<HashMap<String, String>>() { // from class: com.sankuai.eh.plugins.apiPrefetch.a.2
        }.getType());
        if (map3 == null) {
            map3 = new HashMap<>();
        }
        Call<ap> postForm = com.sankuai.eh.component.service.network.a.a(com.sankuai.eh.component.service.utils.b.a(map2.get(TrafficRecord.Detail.TUNNEL_SHARK), false).booleanValue()).postForm(str, map, map3);
        postForm.a(cVar);
        a("api_fetch_form");
        return postForm;
    }

    private Call<ap> d(String str, Map<String, String> map, Map<String, JsonElement> map2, c cVar) {
        Object[] objArr = {str, map, map2, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc769c2c1436582126cb21dcebf12959", RobustBitConfig.DEFAULT_VALUE)) {
            return (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc769c2c1436582126cb21dcebf12959");
        }
        String a2 = com.sankuai.eh.component.service.utils.b.a(b(map2.get("body")));
        ak akVar = null;
        if (!TextUtils.isEmpty(a2)) {
            akVar = al.a(a2.getBytes(), map.containsKey("Content-Type") ? map.get("Content-Type") : "application/json;charset=UTF-8");
        }
        Call<ap> postJson = com.sankuai.eh.component.service.network.a.a(com.sankuai.eh.component.service.utils.b.a(map2.get(TrafficRecord.Detail.TUNNEL_SHARK), false).booleanValue()).postJson(str, map, akVar);
        postJson.a(cVar);
        return postJson;
    }

    private void a(b bVar, String str, Map<String, JsonElement> map) {
        Object[] objArr = {bVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12e5e8ef69aeab025b78e3b2cf6fe530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12e5e8ef69aeab025b78e3b2cf6fe530");
            return;
        }
        bVar.a(EnumC0558a.BUSY);
        com.sankuai.eh.component.service.tools.d.c("prefetch.api.start", new d.b().a("event", "prefetch.api.start").a("primaryKey", com.sankuai.eh.component.service.utils.b.b(map.get("primaryKey"), "")).a("requestUrl", str).a("pattern", this.c).a("api_sign", com.sankuai.eh.component.service.utils.b.a(this.f, "api_sign")).b, null);
    }

    private int a(Map<String, String> map, int i) {
        Object[] objArr = {map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eef54412e1725dca4b3634f36848bb10", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eef54412e1725dca4b3634f36848bb10")).intValue();
        }
        if (map.get("Content-Type") != null) {
            if (map.get("Content-Type").contains(PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM)) {
                return 0;
            }
            if (map.get("Content-Type").contains("multipart/form-data")) {
                return 1;
            }
            return map.get("Content-Type").contains(PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON) ? 2 : -1;
        }
        return i;
    }

    private Map<String, String> a(JsonElement jsonElement) {
        Map map;
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d89e42eccee7be79d9e635ecb47c41b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d89e42eccee7be79d9e635ecb47c41b");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", e());
        hashMap.put(com.sankuai.titans.proxy.util.Constants.KEY_ORIGIN, "https://eh.sankuai.com");
        hashMap.put("Referrer", this.b);
        hashMap.put("Accept", "*/*");
        hashMap.put("Cookie", CookieManager.getInstance().getCookie(this.b));
        if (!(jsonElement instanceof JsonNull) && (map = (Map) com.sankuai.eh.component.service.utils.b.a(jsonElement, new TypeToken<HashMap<String, String>>() { // from class: com.sankuai.eh.plugins.apiPrefetch.a.3
        }.getType())) != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    private String b(Map<String, JsonElement> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b68214b40cd4d8a7f798d8828c7d7d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b68214b40cd4d8a7f798d8828c7d7d1");
        }
        String a2 = com.sankuai.eh.component.service.utils.b.a(map);
        for (Map.Entry<String, String> entry : c().entrySet()) {
            a2 = a2.replace(entry.getKey(), entry.getValue() == null ? "" : entry.getValue());
        }
        return a2;
    }

    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d29d96d5ed673ac748da80ba4763ed67", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d29d96d5ed673ac748da80ba4763ed67");
        }
        if (TextUtils.isEmpty(str) || !str.contains(CommonConstant.Symbol.BIG_BRACKET_LEFT)) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(com.sankuai.eh.component.service.utils.e.a(str)).buildUpon();
        Uri g = com.sankuai.eh.component.service.utils.e.g(str);
        for (String str2 : g.getQueryParameterNames()) {
            String queryParameter = g.getQueryParameter(str2);
            if (!queryParameter.contains(CommonConstant.Symbol.BIG_BRACKET_LEFT) || !queryParameter.contains(CommonConstant.Symbol.BIG_BRACKET_RIGHT)) {
                buildUpon.appendQueryParameter(str2, queryParameter);
            }
        }
        return buildUpon.toString();
    }

    private JsonElement b(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b14ee3b90a8e4462e142115638dd3149", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b14ee3b90a8e4462e142115638dd3149");
        }
        if (jsonElement instanceof JsonObject) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            HashSet<String> hashSet = new HashSet();
            for (String str : asJsonObject.keySet()) {
                String b2 = com.sankuai.eh.component.service.utils.b.b(asJsonObject.get(str), "");
                if (b2.contains(CommonConstant.Symbol.BIG_BRACKET_LEFT) && b2.contains(CommonConstant.Symbol.BIG_BRACKET_RIGHT)) {
                    hashSet.add(str);
                }
            }
            for (String str2 : hashSet) {
                asJsonObject.remove(str2);
            }
        }
        return jsonElement;
    }

    private Map<String, String> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f37477dab00b6dd5c0789d846760777", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f37477dab00b6dd5c0789d846760777");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("{app}", "group");
        hashMap.put("{appVersion}", com.sankuai.eh.component.service.a.c().i());
        hashMap.put("{packageName}", com.sankuai.eh.component.service.a.c().h());
        hashMap.put("{ci}", com.sankuai.eh.component.service.a.c().a());
        hashMap.put("{uuid}", com.sankuai.eh.component.service.a.c().f());
        hashMap.put("{platform}", "android");
        hashMap.put("{platform2}", "Android");
        hashMap.put("{osVersion}", Build.VERSION.RELEASE);
        hashMap.put("{lat}", com.sankuai.eh.component.service.a.c().b());
        hashMap.put("{lng}", com.sankuai.eh.component.service.a.c().c());
        hashMap.put("{fingerprint}", com.sankuai.eh.component.service.a.c().g());
        hashMap.put("{uid}", com.sankuai.eh.component.service.a.c().d());
        hashMap.put("{model}", Build.MODEL);
        hashMap.put("{token}", com.sankuai.eh.component.service.a.c().e());
        Uri parse = Uri.parse(this.b != null ? this.b : "");
        for (String str : parse.getQueryParameterNames()) {
            hashMap.put("{$" + str + CommonConstant.Symbol.BIG_BRACKET_RIGHT, parse.getQueryParameter(str));
        }
        hashMap.putAll(d());
        return hashMap;
    }

    private Map<String, String> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68e03b6ec76845684ee5ebc99931572e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68e03b6ec76845684ee5ebc99931572e");
        }
        HashMap hashMap = new HashMap();
        String str = this.b;
        String str2 = this.c;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str2.contains("*")) {
            return hashMap;
        }
        String[] split = com.sankuai.eh.component.service.utils.e.a(str).split("/");
        String[] split2 = com.sankuai.eh.component.service.utils.e.a(str2).split("/");
        int i = 1;
        if (split.length == split2.length) {
            for (int i2 = 0; i2 < split.length; i2++) {
                if ("*".equals(split2[i2])) {
                    hashMap.put("{:" + i + CommonConstant.Symbol.BIG_BRACKET_RIGHT, split[i2]);
                    i++;
                }
            }
        }
        Uri g = com.sankuai.eh.component.service.utils.e.g(str);
        Uri g2 = com.sankuai.eh.component.service.utils.e.g(str2);
        for (String str3 : g2.getQueryParameterNames()) {
            if (g2.getQueryParameter(str3).contains("*")) {
                String queryParameter = g.getQueryParameter(str3);
                if (!TextUtils.isEmpty(queryParameter)) {
                    hashMap.put("{:" + i + CommonConstant.Symbol.BIG_BRACKET_RIGHT, queryParameter);
                    i++;
                }
            }
        }
        return hashMap;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e8adb41b392ca7990b4428f19c61846", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e8adb41b392ca7990b4428f19c61846")).booleanValue();
        }
        if (message.what == 10) {
            b();
            if (this.e != null) {
                for (b bVar : this.e.values()) {
                    bVar.d = false;
                    bVar.a(EnumC0558a.TIMEOUT);
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class c implements com.sankuai.meituan.retrofit2.f<ap> {
        public static ChangeQuickRedirect a;
        private Map<String, JsonElement> c;
        private b d;

        public c(b bVar, Map<String, JsonElement> map) {
            Object[] objArr = {a.this, bVar, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90aaf7f579e5554356d3e445b38d6a44", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90aaf7f579e5554356d3e445b38d6a44");
                return;
            }
            this.c = map;
            this.d = bVar;
        }

        @Override // com.sankuai.meituan.retrofit2.f
        public final void onResponse(Call<ap> call, Response<ap> response) {
            Object[] objArr = {call, response};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c56faf41d98b0c4893233b4155666f94", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c56faf41d98b0c4893233b4155666f94");
                return;
            }
            a.a("api_fetch_response_succ");
            try {
                try {
                    String str = null;
                    if (response.b() >= 300) {
                        if (response.g() != null) {
                            str = response.g().string();
                        }
                    } else if (response.e() != null) {
                        str = response.e().string();
                    }
                    if (a(response.b(), str)) {
                        a.a("api_fetch_result_succ");
                        this.d.e.put("statusCode", response.b());
                        this.d.e.put("data", str);
                        com.sankuai.eh.component.service.tools.d.c("prefetch.api.success", new d.b().a("requestUrl", this.d.b).a("pattern", a.this.c).a("api_sign", com.sankuai.eh.component.service.utils.b.a(a.this.f, "api_sign")).a("primaryKey", com.sankuai.eh.component.service.utils.b.b(this.c.get("primaryKey"), "")).b, Long.valueOf(System.currentTimeMillis() - a.this.d));
                    } else {
                        com.sankuai.eh.component.service.tools.d.b("响应结果校验失败：" + str);
                        com.dianping.codelog.b.b(a.class, "apiPrefetch failed", "response verify failed: " + response.b() + ", " + str);
                    }
                } catch (Exception e) {
                    com.sankuai.eh.component.service.tools.d.a(e);
                    com.dianping.codelog.b.b(a.class, "apiPrefetch failed", "verify exception: " + e.getMessage());
                }
            } finally {
                this.d.a(EnumC0558a.RESPONSE);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.String] */
        @Override // com.sankuai.meituan.retrofit2.f
        public final void onFailure(Call<ap> call, Throwable th) {
            Class<a> cls;
            String str;
            StringBuilder sb;
            Object[] objArr = {call, th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "407547a981c3beddf602b54916875eed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "407547a981c3beddf602b54916875eed");
                return;
            }
            a.a("api_fetch_response_fail");
            try {
                try {
                    com.sankuai.eh.component.service.tools.d.c("prefetch.api.fail", new d.b().a("requestUrl", this.d.b).a("pattern", a.this.c).a("api_sign", com.sankuai.eh.component.service.utils.b.a(a.this.f, "api_sign")).a("primaryKey", com.sankuai.eh.component.service.utils.b.b(this.c.get("primaryKey"), "")).b, Long.valueOf(System.currentTimeMillis() - a.this.d));
                    this.d.e.put("errorMsg", th.getMessage());
                    this.d.a(EnumC0558a.RESPONSE);
                    cls = a.class;
                    str = "apiPrefetch failed";
                    sb = new StringBuilder("request failed: ");
                } catch (Exception e) {
                    com.sankuai.eh.component.service.tools.d.a(e);
                    this.d.a(EnumC0558a.RESPONSE);
                    cls = a.class;
                    str = "apiPrefetch failed";
                    sb = new StringBuilder("request failed: ");
                }
                sb.append(th.getMessage());
                th = sb.toString();
                com.dianping.codelog.b.b(cls, str, th);
            } catch (Throwable th2) {
                this.d.a(EnumC0558a.RESPONSE);
                com.dianping.codelog.b.b(a.class, "apiPrefetch failed", "request failed: " + th.getMessage());
                throw th2;
            }
        }

        private boolean a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0cdd84ebffc5ae16b4514f412b8a70a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0cdd84ebffc5ae16b4514f412b8a70a")).booleanValue();
            }
            if (str == null) {
                return false;
            }
            try {
                if (this.c.containsKey("verify")) {
                    int a2 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(this.c.get("verify"), "statusCode"), -12345);
                    if (a2 == -12345 || a2 == i) {
                        if (StringUtil.NULL.equals(com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(this.c.get("verify"), "data")))) {
                            return true;
                        }
                        JSONObject jSONObject = new JSONObject(com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(this.c.get("verify"), "data")));
                        JSONObject jSONObject2 = new JSONObject(str);
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            String optString = jSONObject.optString(next);
                            if ("*".equals(optString)) {
                                if (jSONObject2.isNull(next)) {
                                    return false;
                                }
                            } else if (!optString.equals(jSONObject2.optString(next))) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fe9e4f262a4df7ad7b04a905a89f99e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fe9e4f262a4df7ad7b04a905a89f99e");
        } else if (this.e != null) {
            for (b bVar : this.e.values()) {
                if (bVar.g != null && !bVar.g.b()) {
                    bVar.g.cancel();
                }
            }
        }
    }

    public final void a(String str, d dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb0f3b0729ec719449eb7a64e81b3f1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb0f3b0729ec719449eb7a64e81b3f1e");
            return;
        }
        a("api_js_call");
        b bVar = this.e.get(str);
        if (a(bVar, dVar)) {
            return;
        }
        if (bVar.d) {
            bVar.a(com.sankuai.eh.plugins.apiPrefetch.b.a(this, bVar, dVar));
        } else {
            b(bVar, dVar);
        }
    }

    public static /* synthetic */ void a(a aVar, b bVar, d dVar) {
        Object[] objArr = {aVar, bVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4b8eb99c5270c182c634a6a105ea894", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4b8eb99c5270c182c634a6a105ea894");
        } else {
            aVar.b(bVar, dVar);
        }
    }

    private boolean a(b bVar, d dVar) {
        Object[] objArr = {bVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a2e5bc145f67c866fb5fbcc6720aad4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a2e5bc145f67c866fb5fbcc6720aad4")).booleanValue();
        }
        if (bVar == null || bVar.f == EnumC0558a.CONSUMED) {
            a("api_fetch_load_fail_consume");
            dVar.a(bVar == null ? "no prefetch result found" : "already consumed");
            return true;
        }
        return false;
    }

    private void b(b bVar, d dVar) {
        Object[] objArr = {bVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7efcd244f3caf7105cb494b328c1376c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7efcd244f3caf7105cb494b328c1376c");
            return;
        }
        a("api_fetch_load");
        if (a(bVar, dVar)) {
            return;
        }
        if (!bVar.e.isNull("data")) {
            a("api_fetch_load_succ");
            dVar.a(bVar.e);
            com.sankuai.eh.component.service.tools.d.c("prefetch.api.load", new d.b().a("requestUrl", bVar.b).a("primaryKey", bVar.c).a("pattern", this.c).a("api_sign", com.sankuai.eh.component.service.utils.b.a(this.f, "api_sign")).b, Long.valueOf(System.currentTimeMillis() - this.d));
        } else {
            a("api_fetch_load_fail_date");
            dVar.a(bVar.e.optString("errMsg"));
        }
        bVar.a(EnumC0558a.CONSUMED);
    }

    private String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7a8627df280a67b546730ed1bd35417", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7a8627df280a67b546730ed1bd35417");
        }
        String b2 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(this.f, "ua"), "");
        return TextUtils.isEmpty(b2) ? f.f() : b2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public boolean d;
        public JSONObject e;
        public EnumC0558a f;
        Call<ap> g;
        public InterfaceC0559a h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.eh.plugins.apiPrefetch.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public interface InterfaceC0559a {
            void a();
        }

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51a704dfae29e29d5ff1b08e5fa07f68", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51a704dfae29e29d5ff1b08e5fa07f68");
                return;
            }
            this.f = EnumC0558a.INIT;
            this.e = new JSONObject();
        }

        public final void a(InterfaceC0559a interfaceC0559a) {
            Object[] objArr = {interfaceC0559a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21ea25263a91d57e250e6848f0dee9ba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21ea25263a91d57e250e6848f0dee9ba");
                return;
            }
            this.h = interfaceC0559a;
            a(this.f);
        }

        public final void a(EnumC0558a enumC0558a) {
            Object[] objArr = {enumC0558a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b269ffc32d9a1a3efe43bcad24004f3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b269ffc32d9a1a3efe43bcad24004f3");
            } else if (this.f == EnumC0558a.CONSUMED) {
            } else {
                this.f = enumC0558a;
                switch (enumC0558a) {
                    case NONE:
                    case INIT:
                    case BUSY:
                        return;
                    case RESPONSE:
                    case TIMEOUT:
                    case ERROR:
                        a();
                        return;
                    case CONSUMED:
                        this.e = new JSONObject();
                        return;
                    default:
                        return;
                }
            }
        }

        private void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36d264958086673f397f1e703b9fa0d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36d264958086673f397f1e703b9fa0d8");
            } else if (this.h != null) {
                this.h.a();
                this.h = null;
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.eh.plugins.apiPrefetch.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0558a {
        NONE,
        INIT,
        BUSY,
        RESPONSE,
        CONSUMED,
        ERROR,
        TIMEOUT;
        
        public static ChangeQuickRedirect a;

        EnumC0558a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9cc3ec7b1e6d88e6ed25865cd1fd6c0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9cc3ec7b1e6d88e6ed25865cd1fd6c0");
            }
        }

        public static EnumC0558a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b90d6ab48dc7cddee17e533811fa8170", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0558a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b90d6ab48dc7cddee17e533811fa8170") : (EnumC0558a) Enum.valueOf(EnumC0558a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0558a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d68973ae678b82b7ebb2856e9c2aecf1", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0558a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d68973ae678b82b7ebb2856e9c2aecf1") : (EnumC0558a[]) values().clone();
        }
    }
}
