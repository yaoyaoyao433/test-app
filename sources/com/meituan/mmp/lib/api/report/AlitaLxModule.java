package com.meituan.mmp.lib.api.report;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class AlitaLxModule {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class AlitaLxLog extends ApiFunction<JSONObject, JSONObject> {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction, com.meituan.mmp.lib.api.AbsApi
        public boolean isActivityApi() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
            JSONObject optJSONObject;
            JSONObject jSONObject2 = jSONObject;
            Object[] objArr = {str, jSONObject2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e7a7fc7513382742ca5c983ce180a2b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e7a7fc7513382742ca5c983ce180a2b");
                return;
            }
            Object[] objArr2 = {str, jSONObject2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect2 = AlitaLXLogImpl.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "63fe14d57e3295a9e714fb468c0de86f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "63fe14d57e3295a9e714fb468c0de86f");
                return;
            }
            try {
                JSONArray optJSONArray = jSONObject2.optJSONArray("messageList");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                        if (optJSONObject2 != null) {
                            String optString = optJSONObject2.optString("eventName");
                            if (!TextUtils.isEmpty(optString)) {
                                String optString2 = optJSONObject2.optString("bid");
                                if (TextUtils.isEmpty(optString2)) {
                                    optString2 = "custom_bid";
                                }
                                String optString3 = optJSONObject2.optString("cid");
                                if (TextUtils.isEmpty(optString3)) {
                                    optString2 = "custom_cid";
                                }
                                String str2 = optString2;
                                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("valLab");
                                Map a = optJSONObject3 != null ? AlitaLXLogImpl.a(optJSONObject3.toString()) : new HashMap();
                                String optString4 = optJSONObject2.optString("category");
                                if (TextUtils.isEmpty(optString4) && (optJSONObject = optJSONObject2.optJSONObject("config")) != null) {
                                    optString4 = optJSONObject.optString("category");
                                }
                                AlitaLXLogImpl.a(optString, "", str2, a, optString3, TextUtils.isEmpty(optString4) ? "custom_category" : optString4, true);
                            }
                        }
                    }
                }
                iApiCallback.onSuccess(null);
            } catch (Throwable th) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.putOpt(LogMonitor.EXCEPTION_TAG, th.getMessage());
                } catch (Exception unused) {
                }
                iApiCallback.onFail(jSONObject3);
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes3.dex */
        public static class AlitaLXLogImpl {
            public static ChangeQuickRedirect a;

            static void a(String str, String str2, String str3, Map<String, Object> map, String str4, String str5, boolean z) {
                Object[] objArr = {str, str2, str3, map, str4, str5, (byte) 1};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84620ce018c00c4a5f01f045fd051aff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84620ce018c00c4a5f01f045fd051aff");
                    return;
                }
                try {
                    Class<?> cls = Class.forName("com.sankuai.waimai.alita.core.event.AlitaRealTimeEventCenter");
                    cls.getDeclaredMethod("writeLXCustomEvent", String.class, String.class, String.class, Map.class, String.class, String.class, Boolean.TYPE).invoke(cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]), str, str2, str3, map, str4, str5, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }

            public static Map<String, Object> a(@NonNull String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c97cff0eb64641e3699059a3bf3a35d", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c97cff0eb64641e3699059a3bf3a35d");
                }
                try {
                    return (Map) new GsonBuilder().registerTypeAdapter(Map.class, new GsonTypeAdapter()).create().fromJson(str, (Class<Object>) Map.class);
                } catch (Exception unused) {
                    return new HashMap();
                }
            }

            /* compiled from: ProGuard */
            /* loaded from: classes3.dex */
            public static class GsonTypeAdapter extends TypeAdapter<Object> {
                public static ChangeQuickRedirect a;

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Object obj) throws IOException {
                }

                @Override // com.google.gson.TypeAdapter
                public Object read(JsonReader jsonReader) throws IOException {
                    Object[] objArr = {jsonReader};
                    ChangeQuickRedirect changeQuickRedirect = a;
                    if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d54561678208ecfb3844efa476d4cc3", RobustBitConfig.DEFAULT_VALUE)) {
                        return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d54561678208ecfb3844efa476d4cc3");
                    }
                    switch (jsonReader.peek()) {
                        case BEGIN_ARRAY:
                            ArrayList arrayList = new ArrayList();
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList.add(read(jsonReader));
                            }
                            jsonReader.endArray();
                            return arrayList;
                        case BEGIN_OBJECT:
                            HashMap hashMap = new HashMap();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                hashMap.put(jsonReader.nextName(), read(jsonReader));
                            }
                            jsonReader.endObject();
                            return hashMap;
                        case STRING:
                            return jsonReader.nextString();
                        case NUMBER:
                            String nextString = jsonReader.nextString();
                            if (nextString.contains(CommonConstant.Symbol.DOT) || nextString.contains("e") || nextString.contains("E")) {
                                return Double.valueOf(Double.parseDouble(nextString));
                            }
                            return Long.valueOf(Long.parseLong(nextString));
                        case BOOLEAN:
                            return Boolean.valueOf(jsonReader.nextBoolean());
                        case NULL:
                            jsonReader.nextNull();
                            return null;
                        default:
                            throw new IllegalStateException();
                    }
                }
            }
        }
    }
}
