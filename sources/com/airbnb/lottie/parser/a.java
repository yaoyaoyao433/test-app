package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.meituan.android.common.badge.data.Data;
import com.meituan.android.common.statistics.Constants;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static com.airbnb.lottie.model.animatable.e a(JsonReader jsonReader, com.airbnb.lottie.e eVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(new com.airbnb.lottie.animation.keyframe.h(eVar, o.a(jsonReader, eVar, com.airbnb.lottie.utils.f.a(), u.a, jsonReader.peek() == JsonToken.BEGIN_OBJECT)));
            }
            jsonReader.endArray();
            p.a(arrayList);
        } else {
            arrayList.add(new com.airbnb.lottie.value.a(n.b(jsonReader, com.airbnb.lottie.utils.f.a())));
        }
        return new com.airbnb.lottie.model.animatable.e(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.airbnb.lottie.model.animatable.m<PointF, PointF> b(JsonReader jsonReader, com.airbnb.lottie.e eVar) throws IOException {
        char c;
        jsonReader.beginObject();
        com.airbnb.lottie.model.animatable.e eVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != 107) {
                switch (hashCode) {
                    case 120:
                        if (nextName.equals(Constants.GestureMoveEvent.KEY_X)) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 121:
                        if (nextName.equals(Constants.GestureMoveEvent.KEY_Y)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
            } else {
                if (nextName.equals(Data.TB_DATA_COL_KEY)) {
                    c = 0;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    eVar2 = a(jsonReader, eVar);
                    continue;
                case 1:
                    if (jsonReader.peek() == JsonToken.STRING) {
                        z = true;
                        break;
                    } else {
                        bVar = d.a(jsonReader, eVar, true);
                        continue;
                    }
                case 2:
                    if (jsonReader.peek() == JsonToken.STRING) {
                        z = true;
                        break;
                    } else {
                        bVar2 = d.a(jsonReader, eVar, true);
                        continue;
                    }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        if (z) {
            eVar.a("Lottie doesn't support expressions.");
        }
        return eVar2 != null ? eVar2 : new com.airbnb.lottie.model.animatable.i(bVar, bVar2);
    }
}
