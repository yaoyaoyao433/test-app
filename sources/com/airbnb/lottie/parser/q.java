package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.airbnb.lottie.model.layer.d;
import com.meituan.android.common.statistics.Constants;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class q {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.airbnb.lottie.model.layer.d a(JsonReader jsonReader, com.airbnb.lottie.e eVar) throws IOException {
        ArrayList arrayList;
        char c;
        char c2;
        int i = d.b.a;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        jsonReader.beginObject();
        boolean z = false;
        int i2 = i;
        d.a aVar = null;
        String str = null;
        com.airbnb.lottie.model.animatable.l lVar = null;
        com.airbnb.lottie.model.animatable.j jVar = null;
        com.airbnb.lottie.model.animatable.k kVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        long j = 0;
        long j2 = -1;
        float f = 0.0f;
        float f2 = 1.0f;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        float f3 = 0.0f;
        int i6 = 0;
        int i7 = 0;
        String str2 = null;
        String str3 = null;
        float f4 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case -995424086:
                    if (nextName.equals("parent")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -903568142:
                    if (nextName.equals("shapes")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 104:
                    if (nextName.equals("h")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 3177:
                    if (nextName.equals("cl")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 3233:
                    if (nextName.equals("ef")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 3367:
                    if (nextName.equals(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP)) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 3432:
                    if (nextName.equals("ks")) {
                        c = '\b';
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
                case 3553:
                    if (nextName.equals("op")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 3664:
                    if (nextName.equals(Constants.Environment.KEY_SC)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3669:
                    if (nextName.equals("sh")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3679:
                    if (nextName.equals("sr")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 3681:
                    if (nextName.equals("st")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 3684:
                    if (nextName.equals("sw")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3705:
                    if (nextName.equals("tm")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 3712:
                    if (nextName.equals(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 3717:
                    if (nextName.equals("ty")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 104415:
                    if (nextName.equals("ind")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 108390670:
                    if (nextName.equals("refId")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1441620890:
                    if (nextName.equals("masksProperties")) {
                        c = '\n';
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
                    str2 = jsonReader.nextString();
                    break;
                case 1:
                    j = jsonReader.nextInt();
                    break;
                case 2:
                    str = jsonReader.nextString();
                    break;
                case 3:
                    int nextInt = jsonReader.nextInt();
                    if (nextInt < d.a.Unknown.ordinal()) {
                        aVar = d.a.values()[nextInt];
                        break;
                    } else {
                        aVar = d.a.Unknown;
                        break;
                    }
                case 4:
                    j2 = jsonReader.nextInt();
                    break;
                case 5:
                    i3 = (int) (jsonReader.nextInt() * com.airbnb.lottie.utils.f.a());
                    break;
                case 6:
                    i4 = (int) (jsonReader.nextInt() * com.airbnb.lottie.utils.f.a());
                    break;
                case 7:
                    i5 = Color.parseColor(jsonReader.nextString());
                    break;
                case '\b':
                    lVar = c.a(jsonReader, eVar);
                    break;
                case '\t':
                    i2 = d.b.a()[jsonReader.nextInt()];
                    break;
                case '\n':
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList2.add(s.a(jsonReader, eVar));
                    }
                    jsonReader.endArray();
                    break;
                case 11:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.airbnb.lottie.model.content.b a = g.a(jsonReader, eVar);
                        if (a != null) {
                            arrayList3.add(a);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case '\f':
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode = nextName2.hashCode();
                        if (hashCode != 97) {
                            if (hashCode == 100 && nextName2.equals("d")) {
                                c2 = 0;
                            }
                            c2 = 65535;
                        } else {
                            if (nextName2.equals("a")) {
                                c2 = 1;
                            }
                            c2 = 65535;
                        }
                        switch (c2) {
                            case 0:
                                jVar = new com.airbnb.lottie.model.animatable.j(d.a(jsonReader, eVar, h.a));
                                break;
                            case 1:
                                jsonReader.beginArray();
                                if (jsonReader.hasNext()) {
                                    kVar = b.a(jsonReader, eVar);
                                }
                                while (jsonReader.hasNext()) {
                                    jsonReader.skipValue();
                                }
                                jsonReader.endArray();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    break;
                case '\r':
                    jsonReader.beginArray();
                    ArrayList arrayList4 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName3 = jsonReader.nextName();
                            if (((nextName3.hashCode() == 3519 && nextName3.equals("nm")) ? (char) 0 : (char) 65535) == 0) {
                                arrayList4.add(jsonReader.nextString());
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    eVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList4);
                    break;
                case 14:
                    f2 = (float) jsonReader.nextDouble();
                    continue;
                case 15:
                    f3 = (float) jsonReader.nextDouble();
                    continue;
                case 16:
                    i6 = (int) (jsonReader.nextInt() * com.airbnb.lottie.utils.f.a());
                    continue;
                case 17:
                    i7 = (int) (jsonReader.nextInt() * com.airbnb.lottie.utils.f.a());
                    continue;
                case 18:
                    f = (float) jsonReader.nextDouble();
                    continue;
                case 19:
                    f4 = (float) jsonReader.nextDouble();
                    continue;
                case 20:
                    bVar = d.a(jsonReader, eVar, z);
                    continue;
                case 21:
                    str3 = jsonReader.nextString();
                    continue;
                default:
                    jsonReader.skipValue();
                    break;
            }
            z = false;
        }
        jsonReader.endObject();
        float f5 = f / f2;
        float f6 = f4 / f2;
        ArrayList arrayList5 = new ArrayList();
        if (f5 > 0.0f) {
            arrayList = arrayList5;
            arrayList.add(new com.airbnb.lottie.value.a(eVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(f5)));
        } else {
            arrayList = arrayList5;
        }
        if (f6 <= 0.0f) {
            f6 = eVar.j;
        }
        arrayList.add(new com.airbnb.lottie.value.a(eVar, Float.valueOf(1.0f), Float.valueOf(1.0f), null, f5, Float.valueOf(f6)));
        arrayList.add(new com.airbnb.lottie.value.a(eVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, f6, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            eVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new com.airbnb.lottie.model.layer.d(arrayList3, eVar, str2, j, aVar, j2, str, arrayList2, lVar, i3, i4, i5, f2, f3, i6, i7, jVar, kVar, arrayList, i2, bVar);
    }

    public static com.airbnb.lottie.model.layer.d a(com.airbnb.lottie.e eVar) {
        Rect rect = eVar.h;
        return new com.airbnb.lottie.model.layer.d(Collections.emptyList(), eVar, "__container", -1L, d.a.PreComp, -1L, null, Collections.emptyList(), new com.airbnb.lottie.model.animatable.l(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), d.b.a, null);
    }
}
