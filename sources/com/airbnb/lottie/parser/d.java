package com.airbnb.lottie.parser;

import android.support.annotation.Nullable;
import android.util.JsonReader;
import java.io.IOException;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static com.airbnb.lottie.model.animatable.b a(JsonReader jsonReader, com.airbnb.lottie.e eVar, boolean z) throws IOException {
        return new com.airbnb.lottie.model.animatable.b(a(jsonReader, z ? com.airbnb.lottie.utils.f.a() : 1.0f, eVar, i.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.d a(JsonReader jsonReader, com.airbnb.lottie.e eVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.d(a(jsonReader, eVar, m.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.f b(JsonReader jsonReader, com.airbnb.lottie.e eVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.f(a(jsonReader, com.airbnb.lottie.utils.f.a(), eVar, v.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.h c(JsonReader jsonReader, com.airbnb.lottie.e eVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.h(a(jsonReader, com.airbnb.lottie.utils.f.a(), eVar, aa.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.a d(JsonReader jsonReader, com.airbnb.lottie.e eVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.a(a(jsonReader, eVar, f.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.c a(JsonReader jsonReader, com.airbnb.lottie.e eVar, int i) throws IOException {
        return new com.airbnb.lottie.model.animatable.c(a(jsonReader, eVar, new j(i)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static <T> List<com.airbnb.lottie.value.a<T>> a(JsonReader jsonReader, com.airbnb.lottie.e eVar, af<T> afVar) throws IOException {
        return p.a(jsonReader, eVar, 1.0f, afVar);
    }

    @Nullable
    private static <T> List<com.airbnb.lottie.value.a<T>> a(JsonReader jsonReader, float f, com.airbnb.lottie.e eVar, af<T> afVar) throws IOException {
        return p.a(jsonReader, eVar, f, afVar);
    }
}
