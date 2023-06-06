package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.a a(JsonReader jsonReader, com.airbnb.lottie.e eVar, int i) throws IOException {
        char c;
        String str = null;
        boolean z = i == 3;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 100) {
                if (nextName.equals("d")) {
                    c = 3;
                }
                c = 65535;
            } else if (hashCode == 112) {
                if (nextName.equals("p")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode != 115) {
                if (hashCode == 3519 && nextName.equals("nm")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (nextName.equals("s")) {
                    c = 2;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    mVar = a.b(jsonReader, eVar);
                    break;
                case 2:
                    fVar = d.b(jsonReader, eVar);
                    break;
                case 3:
                    if (jsonReader.nextInt() != 3) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.a(str, mVar, fVar, z);
    }
}
