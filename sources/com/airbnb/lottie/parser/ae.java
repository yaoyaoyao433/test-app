package com.airbnb.lottie.parser;

import android.util.JsonReader;
import com.airbnb.lottie.model.content.q;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ae {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.q a(JsonReader jsonReader, com.airbnb.lottie.e eVar) throws IOException {
        char c;
        String str = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        int i = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 101) {
                if (nextName.equals("e")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode == 109) {
                if (nextName.equals("m")) {
                    c = 4;
                }
                c = 65535;
            } else if (hashCode == 111) {
                if (nextName.equals("o")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 115) {
                if (hashCode == 3519 && nextName.equals("nm")) {
                    c = 3;
                }
                c = 65535;
            } else {
                if (nextName.equals("s")) {
                    c = 0;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    bVar = d.a(jsonReader, eVar, false);
                    break;
                case 1:
                    bVar2 = d.a(jsonReader, eVar, false);
                    break;
                case 2:
                    bVar3 = d.a(jsonReader, eVar, false);
                    break;
                case 3:
                    str = jsonReader.nextString();
                    break;
                case 4:
                    i = q.a.a(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.q(str, i, bVar, bVar2, bVar3);
    }
}
