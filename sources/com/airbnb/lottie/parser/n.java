package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import android.support.annotation.ColorInt;
import android.util.JsonReader;
import android.util.JsonToken;
import com.meituan.android.common.statistics.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n {
    /* JADX INFO: Access modifiers changed from: package-private */
    @ColorInt
    public static int a(JsonReader jsonReader) throws IOException {
        jsonReader.beginArray();
        int nextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, nextDouble, nextDouble2, nextDouble3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<PointF> a(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(b(jsonReader, f));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.airbnb.lottie.parser.n$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[JsonToken.values().length];

        static {
            try {
                a[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF b(JsonReader jsonReader, float f) throws IOException {
        switch (AnonymousClass1.a[jsonReader.peek().ordinal()]) {
            case 1:
                return c(jsonReader, f);
            case 2:
                return d(jsonReader, f);
            case 3:
                return e(jsonReader, f);
            default:
                throw new IllegalArgumentException("Unknown point starts with " + jsonReader.peek());
        }
    }

    private static PointF c(JsonReader jsonReader, float f) throws IOException {
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(nextDouble * f, nextDouble2 * f);
    }

    private static PointF d(JsonReader jsonReader, float f) throws IOException {
        jsonReader.beginArray();
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != JsonToken.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(nextDouble * f, nextDouble2 * f);
    }

    private static PointF e(JsonReader jsonReader, float f) throws IOException {
        jsonReader.beginObject();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 120:
                    if (nextName.equals(Constants.GestureMoveEvent.KEY_X)) {
                        c = 0;
                        break;
                    }
                    break;
                case 121:
                    if (nextName.equals(Constants.GestureMoveEvent.KEY_Y)) {
                        c = 1;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    f2 = b(jsonReader);
                    break;
                case 1:
                    f3 = b(jsonReader);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new PointF(f2 * f, f3 * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(JsonReader jsonReader) throws IOException {
        JsonToken peek = jsonReader.peek();
        switch (AnonymousClass1.a[peek.ordinal()]) {
            case 1:
                return (float) jsonReader.nextDouble();
            case 2:
                jsonReader.beginArray();
                float nextDouble = (float) jsonReader.nextDouble();
                while (jsonReader.hasNext()) {
                    jsonReader.skipValue();
                }
                jsonReader.endArray();
                return nextDouble;
            default:
                throw new IllegalArgumentException("Unknown value for token of type " + peek);
        }
    }
}
