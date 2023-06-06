package com.airbnb.lottie.parser;

import android.util.JsonReader;
import com.airbnb.lottie.model.content.p;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ad {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.airbnb.lottie.model.content.p a(JsonReader jsonReader, com.airbnb.lottie.e eVar) throws IOException {
        char c;
        char c2;
        char c3;
        ArrayList arrayList = new ArrayList();
        String str = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.a aVar = null;
        com.airbnb.lottie.model.animatable.d dVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        p.a aVar2 = null;
        p.b bVar3 = null;
        float f = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 111) {
                if (nextName.equals("o")) {
                    c = 3;
                }
                c = 65535;
            } else if (hashCode == 119) {
                if (nextName.equals("w")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode == 3447) {
                if (nextName.equals("lc")) {
                    c = 4;
                }
                c = 65535;
            } else if (hashCode == 3454) {
                if (nextName.equals("lj")) {
                    c = 5;
                }
                c = 65535;
            } else if (hashCode == 3487) {
                if (nextName.equals("ml")) {
                    c = 6;
                }
                c = 65535;
            } else if (hashCode != 3519) {
                switch (hashCode) {
                    case 99:
                        if (nextName.equals(com.huawei.hms.opendevice.c.a)) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 100:
                        if (nextName.equals("d")) {
                            c = 7;
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
                    aVar = d.d(jsonReader, eVar);
                    break;
                case 2:
                    bVar2 = d.a(jsonReader, eVar, true);
                    break;
                case 3:
                    dVar = d.a(jsonReader, eVar);
                    break;
                case 4:
                    aVar2 = p.a.values()[jsonReader.nextInt() - 1];
                    break;
                case 5:
                    bVar3 = p.b.values()[jsonReader.nextInt() - 1];
                    break;
                case 6:
                    f = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String str2 = null;
                        com.airbnb.lottie.model.animatable.b bVar4 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            int hashCode2 = nextName2.hashCode();
                            if (hashCode2 != 110) {
                                if (hashCode2 == 118 && nextName2.equals("v")) {
                                    c3 = 1;
                                }
                                c3 = 65535;
                            } else {
                                if (nextName2.equals("n")) {
                                    c3 = 0;
                                }
                                c3 = 65535;
                            }
                            switch (c3) {
                                case 0:
                                    str2 = jsonReader.nextString();
                                    break;
                                case 1:
                                    bVar4 = d.a(jsonReader, eVar, true);
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        }
                        jsonReader.endObject();
                        int hashCode3 = str2.hashCode();
                        if (hashCode3 == 100) {
                            if (str2.equals("d")) {
                                c2 = 1;
                            }
                            c2 = 65535;
                        } else if (hashCode3 != 103) {
                            if (hashCode3 == 111 && str2.equals("o")) {
                                c2 = 0;
                            }
                            c2 = 65535;
                        } else {
                            if (str2.equals(com.meituan.android.neohybrid.neo.bridge.presenter.g.n)) {
                                c2 = 2;
                            }
                            c2 = 65535;
                        }
                        switch (c2) {
                            case 0:
                                bVar = bVar4;
                                break;
                            case 1:
                            case 2:
                                arrayList.add(bVar4);
                                break;
                        }
                    }
                    jsonReader.endArray();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.p(str, bVar, arrayList, aVar, dVar, bVar2, aVar2, bVar3, f);
    }
}
