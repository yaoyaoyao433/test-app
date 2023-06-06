package com.airbnb.lottie.parser;

import android.support.v4.util.LongSparseArray;
import android.support.v4.util.SparseArrayCompat;
import android.util.JsonReader;
import com.airbnb.lottie.model.layer.d;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.statistics.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class r {
    public static void a(JsonReader jsonReader, com.airbnb.lottie.e eVar, List<com.airbnb.lottie.model.layer.d> list, LongSparseArray<com.airbnb.lottie.model.layer.d> longSparseArray) throws IOException {
        jsonReader.beginArray();
        int i = 0;
        while (jsonReader.hasNext()) {
            com.airbnb.lottie.model.layer.d a = q.a(jsonReader, eVar);
            if (a.e == d.a.Image) {
                i++;
            }
            list.add(a);
            longSparseArray.put(a.d, a);
            if (i > 4) {
                com.airbnb.lottie.d.b("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }

    public static void a(JsonReader jsonReader, com.airbnb.lottie.e eVar, Map<String, List<com.airbnb.lottie.model.layer.d>> map, Map<String, com.airbnb.lottie.g> map2) throws IOException {
        char c;
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                int hashCode = nextName.hashCode();
                if (hashCode == -1109732030) {
                    if (nextName.equals("layers")) {
                        c = 1;
                    }
                    c = 65535;
                } else if (hashCode == 104) {
                    if (nextName.equals("h")) {
                        c = 3;
                    }
                    c = 65535;
                } else if (hashCode == 112) {
                    if (nextName.equals("p")) {
                        c = 4;
                    }
                    c = 65535;
                } else if (hashCode == 117) {
                    if (nextName.equals("u")) {
                        c = 5;
                    }
                    c = 65535;
                } else if (hashCode != 119) {
                    if (hashCode == 3355 && nextName.equals("id")) {
                        c = 0;
                    }
                    c = 65535;
                } else {
                    if (nextName.equals("w")) {
                        c = 2;
                    }
                    c = 65535;
                }
                switch (c) {
                    case 0:
                        str = jsonReader.nextString();
                        break;
                    case 1:
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.airbnb.lottie.model.layer.d a = q.a(jsonReader, eVar);
                            longSparseArray.put(a.d, a);
                            arrayList.add(a);
                        }
                        jsonReader.endArray();
                        break;
                    case 2:
                        i = jsonReader.nextInt();
                        break;
                    case 3:
                        i2 = jsonReader.nextInt();
                        break;
                    case 4:
                        str2 = jsonReader.nextString();
                        break;
                    case 5:
                        str3 = jsonReader.nextString();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (str2 != null) {
                com.airbnb.lottie.g gVar = new com.airbnb.lottie.g(i, i2, str, str2, str3);
                map2.put(gVar.a, gVar);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.endArray();
    }

    public static void a(JsonReader jsonReader, Map<String, com.airbnb.lottie.model.c> map) throws IOException {
        char c;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (((nextName.hashCode() == 3322014 && nextName.equals(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST)) ? (char) 0 : (char) 65535) == 0) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    float f = 0.0f;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode = nextName2.hashCode();
                        if (hashCode == -1866931350) {
                            if (nextName2.equals("fFamily")) {
                                c = 0;
                            }
                            c = 65535;
                        } else if (hashCode == -1408684838) {
                            if (nextName2.equals("ascent")) {
                                c = 3;
                            }
                            c = 65535;
                        } else if (hashCode != -1294566165) {
                            if (hashCode == 96619537 && nextName2.equals("fName")) {
                                c = 1;
                            }
                            c = 65535;
                        } else {
                            if (nextName2.equals("fStyle")) {
                                c = 2;
                            }
                            c = 65535;
                        }
                        switch (c) {
                            case 0:
                                str = jsonReader.nextString();
                                break;
                            case 1:
                                str2 = jsonReader.nextString();
                                break;
                            case 2:
                                str3 = jsonReader.nextString();
                                break;
                            case 3:
                                f = (float) jsonReader.nextDouble();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    com.airbnb.lottie.model.c cVar = new com.airbnb.lottie.model.c(str, str2, str3, f);
                    map.put(cVar.b, cVar);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    public static void a(JsonReader jsonReader, com.airbnb.lottie.e eVar, SparseArrayCompat<com.airbnb.lottie.model.d> sparseArrayCompat) throws IOException {
        char c;
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            double d = 0.0d;
            double d2 = 0.0d;
            char c2 = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                int hashCode = nextName.hashCode();
                if (hashCode == -1866931350) {
                    if (nextName.equals("fFamily")) {
                        c = 4;
                    }
                    c = 65535;
                } else if (hashCode == 119) {
                    if (nextName.equals("w")) {
                        c = 2;
                    }
                    c = 65535;
                } else if (hashCode == 3173) {
                    if (nextName.equals(Constants.Environment.KEY_CH)) {
                        c = 0;
                    }
                    c = 65535;
                } else if (hashCode == 3076010) {
                    if (nextName.equals("data")) {
                        c = 5;
                    }
                    c = 65535;
                } else if (hashCode != 3530753) {
                    if (hashCode == 109780401 && nextName.equals("style")) {
                        c = 3;
                    }
                    c = 65535;
                } else {
                    if (nextName.equals(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE)) {
                        c = 1;
                    }
                    c = 65535;
                }
                switch (c) {
                    case 0:
                        c2 = jsonReader.nextString().charAt(0);
                        break;
                    case 1:
                        d2 = jsonReader.nextDouble();
                        break;
                    case 2:
                        d = jsonReader.nextDouble();
                        break;
                    case 3:
                        str = jsonReader.nextString();
                        break;
                    case 4:
                        str2 = jsonReader.nextString();
                        break;
                    case 5:
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            if ("shapes".equals(jsonReader.nextName())) {
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add((com.airbnb.lottie.model.content.n) g.a(jsonReader, eVar));
                                }
                                jsonReader.endArray();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            com.airbnb.lottie.model.d dVar = new com.airbnb.lottie.model.d(arrayList, c2, d2, d, str, str2);
            sparseArrayCompat.put(dVar.hashCode(), dVar);
        }
        jsonReader.endArray();
    }
}
