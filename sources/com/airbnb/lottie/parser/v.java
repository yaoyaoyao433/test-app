package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class v implements af<PointF> {
    public static final v a = new v();

    private v() {
    }

    @Override // com.airbnb.lottie.parser.af
    public final /* synthetic */ PointF a(JsonReader jsonReader, float f) throws IOException {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return n.b(jsonReader, f);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return n.b(jsonReader, f);
        }
        if (peek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + peek);
    }
}
