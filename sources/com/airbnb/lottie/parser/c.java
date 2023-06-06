package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.meituan.android.common.badge.data.Data;
import com.meituan.android.recce.props.gens.Editable;
import com.meituan.robust.common.CommonConstant;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.airbnb.lottie.model.animatable.l a(JsonReader jsonReader, com.airbnb.lottie.e eVar) throws IOException {
        char c;
        boolean z = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z) {
            jsonReader.beginObject();
        }
        com.airbnb.lottie.model.animatable.e eVar2 = null;
        com.airbnb.lottie.model.animatable.g gVar = null;
        com.airbnb.lottie.model.animatable.d dVar = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case Editable.INDEX_ID /* 97 */:
                    if (nextName.equals("a")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 112:
                    if (nextName.equals("p")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 114:
                    if (nextName.equals(com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3242:
                    if (nextName.equals("eo")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3656:
                    if (nextName.equals("rz")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3676:
                    if (nextName.equals(CommonConstant.File.SO)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals(Data.TB_DATA_COL_KEY)) {
                            eVar2 = a.a(jsonReader, eVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    continue;
                case 1:
                    mVar = a.b(jsonReader, eVar);
                    continue;
                case 2:
                    gVar = new com.airbnb.lottie.model.animatable.g(d.a(jsonReader, eVar, z.a));
                    continue;
                case 3:
                    eVar.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVar = d.a(jsonReader, eVar);
                    continue;
                case 6:
                    bVar2 = d.a(jsonReader, eVar, false);
                    continue;
                case 7:
                    bVar3 = d.a(jsonReader, eVar, false);
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            bVar = d.a(jsonReader, eVar, false);
        }
        if (z) {
            jsonReader.endObject();
        }
        if (eVar2 == null) {
            eVar2 = new com.airbnb.lottie.model.animatable.e();
        }
        com.airbnb.lottie.model.animatable.e eVar3 = eVar2;
        if (gVar == null) {
            gVar = new com.airbnb.lottie.model.animatable.g(new com.airbnb.lottie.value.d(1.0f, 1.0f));
        }
        com.airbnb.lottie.model.animatable.g gVar2 = gVar;
        if (dVar == null) {
            dVar = new com.airbnb.lottie.model.animatable.d();
        }
        return new com.airbnb.lottie.model.animatable.l(eVar3, mVar, gVar2, bVar, dVar, bVar2, bVar3);
    }
}
