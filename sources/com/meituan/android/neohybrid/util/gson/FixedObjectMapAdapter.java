package com.meituan.android.neohybrid.util.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.android.neohybrid.util.gson.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FixedObjectMapAdapter extends TypeAdapter<Object> {
    public static ChangeQuickRedirect a;

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        Object[] objArr = {jsonWriter, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3266cbbefc9fa8c8df8d5fb5f6d0fac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3266cbbefc9fa8c8df8d5fb5f6d0fac0");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        TypeAdapter adapter = (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9e0f2107c1da2baaee3920385a9e8a10", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9e0f2107c1da2baaee3920385a9e8a10") : b.a.a).getAdapter(Object.class);
        if (adapter != null) {
            adapter.write(jsonWriter, obj);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(JsonReader jsonReader) throws IOException {
        Object[] objArr = {jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bcb4e5ce75f2dde0d24a129847b256b", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bcb4e5ce75f2dde0d24a129847b256b");
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
                LinkedTreeMap linkedTreeMap = new LinkedTreeMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    linkedTreeMap.put(jsonReader.nextName(), read(jsonReader));
                }
                jsonReader.endObject();
                return linkedTreeMap;
            case STRING:
                return jsonReader.nextString();
            case NUMBER:
                String nextString = jsonReader.nextString();
                if (nextString.contains(CommonConstant.Symbol.DOT)) {
                    return Double.valueOf(nextString);
                }
                return Long.valueOf(nextString);
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
