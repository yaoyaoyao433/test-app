package com.airbnb.lottie.parser;

import android.util.JsonReader;
import android.util.JsonToken;
import com.meituan.android.common.badge.data.Data;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class p {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> List<com.airbnb.lottie.value.a<T>> a(JsonReader jsonReader, com.airbnb.lottie.e eVar, float f, af<T> afVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            eVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 107 && nextName.equals(Data.TB_DATA_COL_KEY)) {
                c = 0;
            }
            if (c == 0) {
                if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                    jsonReader.beginArray();
                    if (jsonReader.peek() == JsonToken.NUMBER) {
                        arrayList.add(o.a(jsonReader, eVar, f, afVar, false));
                    } else {
                        while (jsonReader.hasNext()) {
                            arrayList.add(o.a(jsonReader, eVar, f, afVar, true));
                        }
                    }
                    jsonReader.endArray();
                } else {
                    arrayList.add(o.a(jsonReader, eVar, f, afVar, false));
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        a(arrayList);
        return arrayList;
    }

    public static void a(List<? extends com.airbnb.lottie.value.a<?>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            i2++;
            list.get(i2).f = Float.valueOf(list.get(i2).e);
        }
        com.airbnb.lottie.value.a<?> aVar = list.get(i);
        if (aVar.b == 0) {
            list.remove(aVar);
        }
    }
}
