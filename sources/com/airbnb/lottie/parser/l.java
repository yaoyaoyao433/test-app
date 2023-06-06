package com.airbnb.lottie.parser;

import android.util.JsonReader;
import com.airbnb.lottie.model.content.p;
import com.meituan.android.common.badge.data.Data;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.airbnb.lottie.model.content.e a(JsonReader jsonReader, com.airbnb.lottie.e eVar) throws IOException {
        char c;
        p.b bVar;
        float f;
        char c2;
        char c3;
        ArrayList arrayList = new ArrayList();
        String str = null;
        int i = 0;
        com.airbnb.lottie.model.animatable.c cVar = null;
        com.airbnb.lottie.model.animatable.d dVar = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        com.airbnb.lottie.model.animatable.f fVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        p.a aVar = null;
        p.b bVar3 = null;
        float f2 = 0.0f;
        com.airbnb.lottie.model.animatable.b bVar4 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case 100:
                    if (nextName.equals("d")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 101:
                    if (nextName.equals("e")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 103:
                    if (nextName.equals(com.meituan.android.neohybrid.neo.bridge.presenter.g.n)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 2;
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
                case 119:
                    if (nextName.equals("w")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 3487:
                    if (nextName.equals("ml")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 0;
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
                    str = jsonReader.nextString();
                    continue;
                case 1:
                    bVar = bVar3;
                    f = f2;
                    jsonReader.beginObject();
                    int i2 = -1;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode = nextName2.hashCode();
                        if (hashCode != 107) {
                            if (hashCode == 112 && nextName2.equals("p")) {
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
                    f2 = f;
                    break;
                case 2:
                    dVar = d.a(jsonReader, eVar);
                    continue;
                case 3:
                    bVar = bVar3;
                    f = f2;
                    i = jsonReader.nextInt() == 1 ? com.airbnb.lottie.model.content.f.a : com.airbnb.lottie.model.content.f.b;
                    f2 = f;
                    break;
                case 4:
                    fVar = d.b(jsonReader, eVar);
                    continue;
                case 5:
                    fVar2 = d.b(jsonReader, eVar);
                    continue;
                case 6:
                    bVar = bVar3;
                    bVar2 = d.a(jsonReader, eVar, true);
                    break;
                case 7:
                    bVar = bVar3;
                    aVar = p.a.values()[jsonReader.nextInt() - 1];
                    break;
                case '\b':
                    bVar3 = p.b.values()[jsonReader.nextInt() - 1];
                    f2 = f2;
                    continue;
                case '\t':
                    bVar = bVar3;
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case '\n':
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        com.airbnb.lottie.model.animatable.b bVar5 = null;
                        String str2 = null;
                        while (jsonReader.hasNext()) {
                            com.airbnb.lottie.model.animatable.b bVar6 = bVar4;
                            String nextName3 = jsonReader.nextName();
                            float f3 = f2;
                            int hashCode2 = nextName3.hashCode();
                            p.b bVar7 = bVar3;
                            if (hashCode2 != 110) {
                                if (hashCode2 == 118 && nextName3.equals("v")) {
                                    c3 = 1;
                                }
                                c3 = 65535;
                            } else {
                                if (nextName3.equals("n")) {
                                    c3 = 0;
                                }
                                c3 = 65535;
                            }
                            switch (c3) {
                                case 0:
                                    str2 = jsonReader.nextString();
                                    break;
                                case 1:
                                    bVar5 = d.a(jsonReader, eVar, true);
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                            bVar4 = bVar6;
                            f2 = f3;
                            bVar3 = bVar7;
                        }
                        p.b bVar8 = bVar3;
                        float f4 = f2;
                        com.airbnb.lottie.model.animatable.b bVar9 = bVar4;
                        jsonReader.endObject();
                        if (str2.equals("o")) {
                            bVar4 = bVar5;
                        } else {
                            if (str2.equals("d") || str2.equals(com.meituan.android.neohybrid.neo.bridge.presenter.g.n)) {
                                arrayList.add(bVar5);
                            }
                            bVar4 = bVar9;
                        }
                        f2 = f4;
                        bVar3 = bVar8;
                    }
                    bVar = bVar3;
                    f = f2;
                    com.airbnb.lottie.model.animatable.b bVar10 = bVar4;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    bVar4 = bVar10;
                    f2 = f;
                    break;
                default:
                    bVar = bVar3;
                    f = f2;
                    jsonReader.skipValue();
                    f2 = f;
                    break;
            }
            bVar3 = bVar;
        }
        return new com.airbnb.lottie.model.content.e(str, i, cVar, dVar, fVar, fVar2, bVar2, aVar, bVar3, f2, arrayList, bVar4);
    }
}
