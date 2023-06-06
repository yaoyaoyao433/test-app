package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class aa implements af<com.airbnb.lottie.model.content.l> {
    public static final aa a = new aa();

    private aa() {
    }

    @Override // com.airbnb.lottie.parser.af
    public final /* synthetic */ com.airbnb.lottie.model.content.l a(JsonReader jsonReader, float f) throws IOException {
        char c;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 99) {
                if (nextName.equals(com.huawei.hms.opendevice.c.a)) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode == 105) {
                if (nextName.equals("i")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 111) {
                if (hashCode == 118 && nextName.equals("v")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (nextName.equals("o")) {
                    c = 3;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    z = jsonReader.nextBoolean();
                    break;
                case 1:
                    list = n.a(jsonReader, f);
                    break;
                case 2:
                    list2 = n.a(jsonReader, f);
                    break;
                case 3:
                    list3 = n.a(jsonReader, f);
                    break;
            }
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            jsonReader.endArray();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new com.airbnb.lottie.model.content.l(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = list.get(i);
            int i2 = i - 1;
            arrayList.add(new com.airbnb.lottie.model.a(com.airbnb.lottie.utils.e.a(list.get(i2), list3.get(i2)), com.airbnb.lottie.utils.e.a(pointF2, list2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = list.get(0);
            int i3 = size - 1;
            arrayList.add(new com.airbnb.lottie.model.a(com.airbnb.lottie.utils.e.a(list.get(i3), list3.get(i3)), com.airbnb.lottie.utils.e.a(pointF3, list2.get(0)), pointF3));
        }
        return new com.airbnb.lottie.model.content.l(pointF, z, arrayList);
    }
}
