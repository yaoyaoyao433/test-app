package com.airbnb.lottie.parser;

import android.util.JsonReader;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m implements af<Integer> {
    public static final m a = new m();

    private m() {
    }

    @Override // com.airbnb.lottie.parser.af
    public final /* synthetic */ Integer a(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(n.b(jsonReader) * f));
    }
}
