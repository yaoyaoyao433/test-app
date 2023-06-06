package com.airbnb.lottie.parser;

import android.graphics.Path;
import android.util.JsonReader;
import com.meituan.android.common.badge.data.Data;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.airbnb.lottie.model.content.d a(JsonReader jsonReader, com.airbnb.lottie.e eVar) throws IOException {
        char c;
        char c2;
        String str = null;
        Path.FillType fillType = null;
        com.airbnb.lottie.model.animatable.c cVar = null;
        com.airbnb.lottie.model.animatable.d dVar = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        com.airbnb.lottie.model.animatable.f fVar2 = null;
        int i = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 101) {
                if (nextName.equals("e")) {
                    c = 5;
                }
                c = 65535;
            } else if (hashCode == 103) {
                if (nextName.equals(com.meituan.android.neohybrid.neo.bridge.presenter.g.n)) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode == 111) {
                if (nextName.equals("o")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 3519) {
                switch (hashCode) {
                    case 114:
                        if (nextName.equals(com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o)) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 115:
                        if (nextName.equals("s")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 116:
                        if (nextName.equals("t")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
            } else {
                if (nextName.equals("nm")) {
                    c = 0;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    jsonReader.beginObject();
                    int i2 = -1;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode2 = nextName2.hashCode();
                        if (hashCode2 != 107) {
                            if (hashCode2 == 112 && nextName2.equals("p")) {
                                c2 = 0;
                            }
                            c2 = 65535;
                        } else {
                            if (nextName2.equals(Data.TB_DATA_COL_KEY)) {
                                c2 = 1;
                            }
                            c2 = 65535;
                        }
                        switch (c2) {
                            case 0:
                                i2 = jsonReader.nextInt();
                                break;
                            case 1:
                                cVar = d.a(jsonReader, eVar, i2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 2:
                    dVar = d.a(jsonReader, eVar);
                    break;
                case 3:
                    i = jsonReader.nextInt() == 1 ? com.airbnb.lottie.model.content.f.a : com.airbnb.lottie.model.content.f.b;
                    break;
                case 4:
                    fVar = d.b(jsonReader, eVar);
                    break;
                case 5:
                    fVar2 = d.b(jsonReader, eVar);
                    break;
                case 6:
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.d(str, i, fillType, cVar, dVar, fVar, fVar2, null, null);
    }
}
