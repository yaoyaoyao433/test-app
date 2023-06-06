package com.airbnb.lottie.parser;

import android.util.JsonReader;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ac {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.o a(JsonReader jsonReader, com.airbnb.lottie.e eVar) throws IOException {
        char c;
        String str = null;
        com.airbnb.lottie.model.animatable.h hVar = null;
        int i = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 3432) {
                if (nextName.equals("ks")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 3519) {
                if (hashCode == 104415 && nextName.equals("ind")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (nextName.equals("nm")) {
                    c = 0;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    i = jsonReader.nextInt();
                    break;
                case 2:
                    hVar = d.c(jsonReader, eVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.o(str, i, hVar);
    }
}
