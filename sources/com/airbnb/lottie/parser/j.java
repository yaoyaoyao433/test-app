package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j implements af<com.airbnb.lottie.model.content.c> {
    private int a;

    public j(int i) {
        this.a = i;
    }

    private void a(com.airbnb.lottie.model.content.c cVar, List<Float> list) {
        int i;
        int i2 = this.a * 4;
        if (list.size() <= i2) {
            return;
        }
        int size = (list.size() - i2) / 2;
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        int i3 = 0;
        while (i2 < list.size()) {
            if (i2 % 2 == 0) {
                dArr[i3] = list.get(i2).floatValue();
            } else {
                dArr2[i3] = list.get(i2).floatValue();
                i3++;
            }
            i2++;
        }
        for (int i4 = 0; i4 < cVar.b.length; i4++) {
            int i5 = cVar.b[i4];
            double d = cVar.a[i4];
            int i6 = 1;
            while (true) {
                if (i6 < dArr.length) {
                    int i7 = i6 - 1;
                    double d2 = dArr[i7];
                    double d3 = dArr[i6];
                    if (dArr[i6] >= d) {
                        double d4 = dArr2[i7];
                        i = (int) ((d4 + (((d - d2) / (d3 - d2)) * (dArr2[i6] - d4))) * 255.0d);
                        break;
                    }
                    i6++;
                } else {
                    i = (int) (dArr2[dArr2.length - 1] * 255.0d);
                    break;
                }
            }
            cVar.b[i4] = Color.argb(i, Color.red(i5), Color.green(i5), Color.blue(i5));
        }
    }

    @Override // com.airbnb.lottie.parser.af
    public final /* synthetic */ com.airbnb.lottie.model.content.c a(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.a == -1) {
            this.a = arrayList.size() / 4;
        }
        float[] fArr = new float[this.a];
        int[] iArr = new int[this.a];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.a * 4; i3++) {
            int i4 = i3 / 4;
            double floatValue = arrayList.get(i3).floatValue();
            switch (i3 % 4) {
                case 0:
                    fArr[i4] = (float) floatValue;
                    break;
                case 1:
                    i = (int) (floatValue * 255.0d);
                    break;
                case 2:
                    i2 = (int) (floatValue * 255.0d);
                    break;
                case 3:
                    iArr[i4] = Color.argb(255, i, i2, (int) (floatValue * 255.0d));
                    break;
            }
        }
        com.airbnb.lottie.model.content.c cVar = new com.airbnb.lottie.model.content.c(fArr, iArr);
        a(cVar, arrayList);
        return cVar;
    }
}
