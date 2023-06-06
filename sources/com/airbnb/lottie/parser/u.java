package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class u implements af<PointF> {
    public static final u a = new u();

    private u() {
    }

    @Override // com.airbnb.lottie.parser.af
    public final /* synthetic */ PointF a(JsonReader jsonReader, float f) throws IOException {
        return n.b(jsonReader, f);
    }
}
