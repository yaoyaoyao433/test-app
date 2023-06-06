package com.airbnb.lottie.parser;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ab {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.m a(JsonReader jsonReader, com.airbnb.lottie.e eVar) throws IOException {
        char c;
        String str = null;
        com.airbnb.lottie.model.animatable.a aVar = null;
        com.airbnb.lottie.model.animatable.d dVar = null;
        int i = 1;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == -396065730) {
                if (nextName.equals("fillEnabled")) {
                    c = 3;
                }
                c = 65535;
            } else if (hashCode == 99) {
                if (nextName.equals(com.huawei.hms.opendevice.c.a)) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode == 111) {
                if (nextName.equals("o")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 114) {
                if (hashCode == 3519 && nextName.equals("nm")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (nextName.equals(com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o)) {
                    c = 4;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    aVar = d.d(jsonReader, eVar);
                    break;
                case 2:
                    dVar = d.a(jsonReader, eVar);
                    break;
                case 3:
                    z = jsonReader.nextBoolean();
                    break;
                case 4:
                    i = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.m(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar);
    }
}
