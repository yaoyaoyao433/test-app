package com.airbnb.lottie.parser;

import android.util.JsonReader;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i implements af<Float> {
    public static final i a = new i();

    private i() {
    }

    @Override // com.airbnb.lottie.parser.af
    public final /* synthetic */ Float a(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(n.b(jsonReader) * f);
    }
}
