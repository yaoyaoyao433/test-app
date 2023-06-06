package com.airbnb.lottie.parser;

import android.util.JsonReader;
import com.airbnb.lottie.model.content.h;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class t {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.h a(JsonReader jsonReader) throws IOException {
        String str = null;
        h.a aVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 3488) {
                if (hashCode == 3519 && nextName.equals("nm")) {
                    c = 0;
                }
            } else if (nextName.equals("mm")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    aVar = h.a.a(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.h(str, aVar);
    }
}
