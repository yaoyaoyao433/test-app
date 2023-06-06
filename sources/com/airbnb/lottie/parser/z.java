package com.airbnb.lottie.parser;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class z implements af<com.airbnb.lottie.value.d> {
    public static final z a = new z();

    private z() {
    }

    @Override // com.airbnb.lottie.parser.af
    public final /* synthetic */ com.airbnb.lottie.value.d a(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new com.airbnb.lottie.value.d((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}
