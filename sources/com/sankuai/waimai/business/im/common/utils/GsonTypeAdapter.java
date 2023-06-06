package com.sankuai.waimai.business.im.common.utils;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GsonTypeAdapter extends TypeAdapter<Object> {
    public static ChangeQuickRedirect a;

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(JsonReader jsonReader) throws IOException {
        Object[] objArr = {jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7579d90406e6283e35fd9551e9a0bf95", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7579d90406e6283e35fd9551e9a0bf95");
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
                if (!nextString.contains(CommonConstant.Symbol.DOT) && !nextString.contains("e") && !nextString.contains("E")) {
                    if (a(nextString)) {
                        return Integer.valueOf(Integer.parseInt(nextString));
                    }
                    long parseLong = Long.parseLong(nextString);
                    return (parseLong > 9007199254740991L || parseLong < -9007199254740991L) ? nextString : Long.valueOf(parseLong);
                }
                return Double.valueOf(Double.parseDouble(nextString));
            case BOOLEAN:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case NULL:
                jsonReader.nextNull();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    private boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0db3d9587d6e15b66ae07e8067f526af", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0db3d9587d6e15b66ae07e8067f526af")).booleanValue();
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
