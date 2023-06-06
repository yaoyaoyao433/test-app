package com.sankuai.waimai.business.restaurant.poicontainer.utils;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class MachProJsonUtil {
    public static ChangeQuickRedirect a;

    public static MachMap a(String str) throws JsonSyntaxException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7fd64ab430780dc75ee23dcbd717c38", RobustBitConfig.DEFAULT_VALUE) ? (MachMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7fd64ab430780dc75ee23dcbd717c38") : a(new JsonParser().parse(str).getAsJsonObject());
    }

    public static MachMap a(JsonObject jsonObject) throws JsonSyntaxException {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c550c97aec8b90894126280e9e5bcbdc", RobustBitConfig.DEFAULT_VALUE) ? (MachMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c550c97aec8b90894126280e9e5bcbdc") : a(jsonObject, (Set<String>) null);
    }

    public static MachMap a(JsonObject jsonObject, Set<String> set) throws JsonSyntaxException {
        Object[] objArr = {jsonObject, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1785c7346ca22563289f51324aba535c", RobustBitConfig.DEFAULT_VALUE) ? (MachMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1785c7346ca22563289f51324aba535c") : (MachMap) new GsonBuilder().registerTypeAdapterFactory(new MachMapTypeAdapter.MachMapTypeAdapterFactory(set)).setPrettyPrinting().serializeSpecialFloatingPointValues().create().fromJson((JsonElement) jsonObject, (Class<Object>) MachMap.class);
    }

    public static MachArray a(JsonArray jsonArray) throws JsonSyntaxException {
        Object[] objArr = {jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ebf7f2bb819021e719125ba85e045e4", RobustBitConfig.DEFAULT_VALUE) ? (MachArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ebf7f2bb819021e719125ba85e045e4") : a(jsonArray, (Set<String>) null);
    }

    private static MachArray a(JsonArray jsonArray, Set<String> set) throws JsonSyntaxException {
        Object[] objArr = {jsonArray, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03348d15e792bdc5cf0a25cd6a05d754", RobustBitConfig.DEFAULT_VALUE) ? (MachArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03348d15e792bdc5cf0a25cd6a05d754") : (MachArray) new GsonBuilder().registerTypeAdapterFactory(new MachMapTypeAdapter.MachMapTypeAdapterFactory(null)).setPrettyPrinting().serializeSpecialFloatingPointValues().create().fromJson((JsonElement) jsonArray, (Class<Object>) MachArray.class);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class MachMapTypeAdapter extends TypeAdapter<Object> {
        public static ChangeQuickRedirect a;
        private final Set<String> b;
        private final Gson c;

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public static class MachMapTypeAdapterFactory implements TypeAdapterFactory {
            public static ChangeQuickRedirect a;
            private final Set<String> b;

            public MachMapTypeAdapterFactory(Set<String> set) {
                Object[] objArr = {set};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4c9028ead33bef950d35261f495a2b0", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4c9028ead33bef950d35261f495a2b0");
                } else {
                    this.b = set;
                }
            }

            @Override // com.google.gson.TypeAdapterFactory
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Object[] objArr = {gson, typeToken};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e915d521f73e061c5ec638a7a2c48e13", RobustBitConfig.DEFAULT_VALUE)) {
                    return (TypeAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e915d521f73e061c5ec638a7a2c48e13");
                }
                typeToken.getType();
                Class<? super T> rawType = typeToken.getRawType();
                if (MachMap.class.isAssignableFrom(rawType) || MachArray.class.isAssignableFrom(rawType)) {
                    return new MachMapTypeAdapter(gson, this.b);
                }
                return null;
            }
        }

        public MachMapTypeAdapter(Gson gson, Set<String> set) {
            Object[] objArr = {gson, set};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c75e4e96c2b96397ca521e02c5bcf1a8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c75e4e96c2b96397ca521e02c5bcf1a8");
                return;
            }
            this.c = gson;
            this.b = set;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Object obj) throws IOException {
            Object[] objArr = {jsonWriter, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dc3f6005dbc07c8ee273e1a3e147480", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dc3f6005dbc07c8ee273e1a3e147480");
            } else if (obj == null) {
                jsonWriter.nullValue();
            } else if (obj instanceof MachMap) {
                jsonWriter.beginObject();
                for (Map.Entry<String, Object> entry : ((MachMap) obj).getJavaMap().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    write(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
            } else if (obj instanceof MachArray) {
                jsonWriter.beginArray();
                MachArray machArray = (MachArray) obj;
                int size = machArray.size();
                for (int i = 0; i < size; i++) {
                    write(jsonWriter, machArray.get(i));
                }
                jsonWriter.endArray();
            } else {
                TypeAdapter adapter = this.c.getAdapter(obj.getClass());
                if (adapter != null) {
                    adapter.write(jsonWriter, obj);
                }
            }
        }

        @Override // com.google.gson.TypeAdapter
        public Object read(JsonReader jsonReader) throws IOException {
            Object[] objArr = {jsonReader};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b040c9f017f7060ef11e40388c10492", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b040c9f017f7060ef11e40388c10492") : a(jsonReader, "");
        }

        private Object a(JsonReader jsonReader, String str) throws IOException {
            Object[] objArr = {jsonReader, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee0b7e4db6ef3764c0a9e02b6b947c0a", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee0b7e4db6ef3764c0a9e02b6b947c0a");
            }
            switch (jsonReader.peek()) {
                case BEGIN_ARRAY:
                    MachArray machArray = new MachArray();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        machArray.add(a(jsonReader, str));
                    }
                    jsonReader.endArray();
                    return machArray;
                case BEGIN_OBJECT:
                    MachMap machMap = new MachMap();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        machMap.put(nextName, a(jsonReader, a(str, nextName)));
                    }
                    jsonReader.endObject();
                    return machMap;
                case STRING:
                    return jsonReader.nextString();
                case NUMBER:
                    String nextString = jsonReader.nextString();
                    if (this.b == null || !this.b.contains(str)) {
                        if (nextString.contains(CommonConstant.Symbol.DOT) || nextString.contains("e") || nextString.contains("E") || nextString.equals("NaN")) {
                            return Double.valueOf(Double.parseDouble(nextString));
                        }
                        long parseLong = Long.parseLong(nextString);
                        return (parseLong > 9007199254740991L || parseLong < -9007199254740991L) ? nextString : Long.valueOf(parseLong);
                    }
                    return nextString;
                case BOOLEAN:
                    return Boolean.valueOf(jsonReader.nextBoolean());
                case NULL:
                    jsonReader.nextNull();
                    return null;
                default:
                    throw new IllegalStateException();
            }
        }

        private String a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2484ca083168efc89d9a6f1801fff50b", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2484ca083168efc89d9a6f1801fff50b");
            }
            if (TextUtils.isEmpty(str)) {
                return str2;
            }
            return str + CommonConstant.Symbol.DOT + str2;
        }
    }
}
