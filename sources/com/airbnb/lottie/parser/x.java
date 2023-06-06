package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class x {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.j a(JsonReader jsonReader, com.airbnb.lottie.e eVar) throws IOException {
        String str = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 112) {
                if (hashCode != 3519) {
                    switch (hashCode) {
                        case 114:
                            if (nextName.equals(com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o)) {
                                c = 3;
                                break;
                            }
                            break;
                        case 115:
                            if (nextName.equals("s")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                } else if (nextName.equals("nm")) {
                    c = 0;
                }
            } else if (nextName.equals("p")) {
                c = 1;
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
                    bVar = d.a(jsonReader, eVar, true);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.j(str, mVar, fVar, bVar);
    }
}
