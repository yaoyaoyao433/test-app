package com.airbnb.lottie.parser;

import android.util.JsonReader;
import com.meituan.android.common.statistics.Constants;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static com.airbnb.lottie.model.animatable.k a(JsonReader jsonReader, com.airbnb.lottie.e eVar) throws IOException {
        char c;
        jsonReader.beginObject();
        com.airbnb.lottie.model.animatable.k kVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (((nextName.hashCode() == 97 && nextName.equals("a")) ? (char) 0 : (char) 65535) != 0) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginObject();
                com.airbnb.lottie.model.animatable.a aVar = null;
                com.airbnb.lottie.model.animatable.a aVar2 = null;
                com.airbnb.lottie.model.animatable.b bVar = null;
                com.airbnb.lottie.model.animatable.b bVar2 = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    int hashCode = nextName2.hashCode();
                    if (hashCode == 116) {
                        if (nextName2.equals("t")) {
                            c = 3;
                        }
                        c = 65535;
                    } else if (hashCode == 3261) {
                        if (nextName2.equals("fc")) {
                            c = 0;
                        }
                        c = 65535;
                    } else if (hashCode != 3664) {
                        if (hashCode == 3684 && nextName2.equals("sw")) {
                            c = 2;
                        }
                        c = 65535;
                    } else {
                        if (nextName2.equals(Constants.Environment.KEY_SC)) {
                            c = 1;
                        }
                        c = 65535;
                    }
                    switch (c) {
                        case 0:
                            aVar = d.d(jsonReader, eVar);
                            break;
                        case 1:
                            aVar2 = d.d(jsonReader, eVar);
                            break;
                        case 2:
                            bVar = d.a(jsonReader, eVar, true);
                            break;
                        case 3:
                            bVar2 = d.a(jsonReader, eVar, true);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                kVar = new com.airbnb.lottie.model.animatable.k(aVar, aVar2, bVar, bVar2);
            }
        }
        jsonReader.endObject();
        return kVar == null ? new com.airbnb.lottie.model.animatable.k(null, null, null, null) : kVar;
    }
}
