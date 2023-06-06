package com.tencent.map.sdk.utilities.visualization;

import android.graphics.Color;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class Gradient {
    private static final int DEFAULT_COLOR_MAP_SIZE = 1000;
    public final int mColorMapSize;
    public int[] mColors;
    public float[] mStartPoints;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class a {
        final int a;
        final int b;
        final float c;

        /* synthetic */ a(Gradient gradient, int i, int i2, float f, byte b) {
            this(i, i2, f);
        }

        private a(int i, int i2, float f) {
            this.a = i;
            this.b = i2;
            this.c = f;
        }
    }

    public Gradient(int[] iArr, float[] fArr) {
        this(iArr, fArr, 1000);
    }

    public Gradient(int[] iArr, float[] fArr, int i) {
        if (iArr.length != fArr.length) {
            throw new IllegalArgumentException("colors and startPoints should be same length");
        }
        if (iArr.length == 0) {
            throw new IllegalArgumentException("No colors have been defined");
        }
        for (int i2 = 1; i2 < fArr.length; i2++) {
            if (fArr[i2] <= fArr[i2 - 1]) {
                throw new IllegalArgumentException("startPoints should be in increasing order");
            }
        }
        this.mColorMapSize = i;
        this.mColors = new int[iArr.length];
        this.mStartPoints = new float[fArr.length];
        System.arraycopy(iArr, 0, this.mColors, 0, iArr.length);
        System.arraycopy(fArr, 0, this.mStartPoints, 0, fArr.length);
    }

    private HashMap<Integer, a> generateColorIntervals() {
        HashMap<Integer, a> hashMap = new HashMap<>();
        if (this.mStartPoints[0] != 0.0f) {
            hashMap.put(0, new a(this, Color.argb(0, Color.red(this.mColors[0]), Color.green(this.mColors[0]), Color.blue(this.mColors[0])), this.mColors[0], this.mColorMapSize * this.mStartPoints[0], (byte) 0));
        }
        for (int i = 1; i < this.mColors.length; i++) {
            int i2 = i - 1;
            hashMap.put(Integer.valueOf((int) (this.mColorMapSize * this.mStartPoints[i2])), new a(this, this.mColors[i2], this.mColors[i], this.mColorMapSize * (this.mStartPoints[i] - this.mStartPoints[i2]), (byte) 0));
        }
        if (this.mStartPoints[this.mStartPoints.length - 1] != 1.0f) {
            int length = this.mStartPoints.length - 1;
            hashMap.put(Integer.valueOf((int) (this.mColorMapSize * this.mStartPoints[length])), new a(this, this.mColors[length], this.mColors[length], this.mColorMapSize * (1.0f - this.mStartPoints[length]), (byte) 0));
        }
        return hashMap;
    }

    public final int[] generateColorMap(double d) {
        HashMap<Integer, a> generateColorIntervals = generateColorIntervals();
        int[] iArr = new int[this.mColorMapSize];
        a aVar = generateColorIntervals.get(0);
        int i = 0;
        for (int i2 = 0; i2 < this.mColorMapSize; i2++) {
            if (generateColorIntervals.containsKey(Integer.valueOf(i2))) {
                aVar = generateColorIntervals.get(Integer.valueOf(i2));
                i = i2;
            }
            iArr[i2] = interpolateColor(aVar.a, aVar.b, (i2 - i) / aVar.c);
        }
        if (d != 1.0d) {
            for (int i3 = 0; i3 < this.mColorMapSize; i3++) {
                int i4 = iArr[i3];
                iArr[i3] = Color.argb((int) (Color.alpha(i4) * d), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
        return iArr;
    }

    static int interpolateColor(int i, int i2, float f) {
        int alpha = (int) (((Color.alpha(i2) - Color.alpha(i)) * f) + Color.alpha(i));
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), fArr);
        float[] fArr2 = new float[3];
        Color.RGBToHSV(Color.red(i2), Color.green(i2), Color.blue(i2), fArr2);
        if (fArr[0] - fArr2[0] > 180.0f) {
            fArr2[0] = fArr2[0] + 360.0f;
        } else if (fArr2[0] - fArr[0] > 180.0f) {
            fArr[0] = fArr[0] + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i3 = 0; i3 < 3; i3++) {
            fArr3[i3] = ((fArr2[i3] - fArr[i3]) * f) + fArr[i3];
        }
        return Color.HSVToColor(alpha, fArr3);
    }
}
