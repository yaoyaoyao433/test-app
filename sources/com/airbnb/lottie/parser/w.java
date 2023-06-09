package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.model.content.i;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class w {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.i a(JsonReader jsonReader, com.airbnb.lottie.e eVar) throws IOException {
        String str = null;
        i.a aVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        com.airbnb.lottie.model.animatable.b bVar4 = null;
        com.airbnb.lottie.model.animatable.b bVar5 = null;
        com.airbnb.lottie.model.animatable.b bVar6 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 112:
                    if (nextName.equals("p")) {
                        c = 3;
                        break;
                    }
                    break;
                case 114:
                    if (nextName.equals(com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o)) {
                        c = 4;
                        break;
                    }
                    break;
                case 3369:
                    if (nextName.equals("ir")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3370:
                    if (nextName.equals("is")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3555:
                    if (nextName.equals("or")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3588:
                    if (nextName.equals(AdvertisementOption.PRIORITY_VALID_TIME)) {
                        c = 2;
                        break;
                    }
                    break;
                case 3686:
                    if (nextName.equals("sy")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    aVar = i.a.a(jsonReader.nextInt());
                    break;
                case 2:
                    bVar = d.a(jsonReader, eVar, false);
                    break;
                case 3:
                    mVar = a.b(jsonReader, eVar);
                    break;
                case 4:
                    bVar2 = d.a(jsonReader, eVar, false);
                    break;
                case 5:
                    bVar4 = d.a(jsonReader, eVar, true);
                    break;
                case 6:
                    bVar6 = d.a(jsonReader, eVar, false);
                    break;
                case 7:
                    bVar3 = d.a(jsonReader, eVar, true);
                    break;
                case '\b':
                    bVar5 = d.a(jsonReader, eVar, false);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.i(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }
}
