package com.facebook.react.uimanager;

import com.dianping.picasso.view.command.AnimationViewCommandModel;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class aq {
    private static ThreadLocal<double[]> a = new ThreadLocal<double[]>() { // from class: com.facebook.react.uimanager.aq.1
        @Override // java.lang.ThreadLocal
        protected final /* bridge */ /* synthetic */ double[] initialValue() {
            return new double[16];
        }
    };

    private static double a(ReadableMap readableMap, String str) {
        double d;
        boolean z = true;
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            if (string.endsWith("rad")) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith("deg")) {
                string = string.substring(0, string.length() - 3);
                z = false;
            }
            d = Float.parseFloat(string);
        } else {
            d = readableMap.getDouble(str);
        }
        return z ? d : (d * 3.141592653589793d) / 180.0d;
    }

    public static void a(ReadableArray readableArray, double[] dArr) {
        double[] dArr2 = a.get();
        p.e(dArr);
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            String nextKey = map.keySetIterator().nextKey();
            p.e(dArr2);
            if ("matrix".equals(nextKey)) {
                ReadableArray array = map.getArray(nextKey);
                for (int i2 = 0; i2 < 16; i2++) {
                    dArr2[i2] = array.getDouble(i2);
                }
            } else if (!"perspective".equals(nextKey)) {
                if (AnimationViewCommandModel.RotationX.equals(nextKey)) {
                    double a2 = a(map, nextKey);
                    dArr2[5] = Math.cos(a2);
                    dArr2[6] = Math.sin(a2);
                    dArr2[9] = -Math.sin(a2);
                    dArr2[10] = Math.cos(a2);
                } else if (AnimationViewCommandModel.RotationY.equals(nextKey)) {
                    double a3 = a(map, nextKey);
                    dArr2[0] = Math.cos(a3);
                    dArr2[2] = -Math.sin(a3);
                    dArr2[8] = Math.sin(a3);
                    dArr2[10] = Math.cos(a3);
                } else if (AnimationViewCommandModel.Rotation.equals(nextKey) || "rotateZ".equals(nextKey)) {
                    double a4 = a(map, nextKey);
                    dArr2[0] = Math.cos(a4);
                    dArr2[1] = Math.sin(a4);
                    dArr2[4] = -Math.sin(a4);
                    dArr2[5] = Math.cos(a4);
                } else if ("scale".equals(nextKey)) {
                    double d = map.getDouble(nextKey);
                    dArr2[0] = d;
                    dArr2[5] = d;
                } else if (!RecceAnimUtils.SCALE_X.equals(nextKey)) {
                    if (!RecceAnimUtils.SCALE_Y.equals(nextKey)) {
                        if ("translate".equals(nextKey)) {
                            ReadableArray array2 = map.getArray(nextKey);
                            double d2 = array2.getDouble(0);
                            double d3 = array2.getDouble(1);
                            double d4 = array2.size() > 2 ? array2.getDouble(2) : 0.0d;
                            dArr2[12] = d2;
                            dArr2[13] = d3;
                            dArr2[14] = d4;
                        } else if ("translateX".equals(nextKey)) {
                            p.a(dArr2, map.getDouble(nextKey), 0.0d);
                        } else if ("translateY".equals(nextKey)) {
                            p.a(dArr2, 0.0d, map.getDouble(nextKey));
                        } else if (!"skewX".equals(nextKey)) {
                            if (!"skewY".equals(nextKey)) {
                                throw new JSApplicationIllegalArgumentException("Unsupported transform type: " + nextKey);
                            }
                            dArr2[1] = Math.tan(a(map, nextKey));
                        } else {
                            dArr2[4] = Math.tan(a(map, nextKey));
                        }
                    } else {
                        dArr2[5] = map.getDouble(nextKey);
                    }
                } else {
                    dArr2[0] = map.getDouble(nextKey);
                }
            } else {
                dArr2[11] = (-1.0d) / map.getDouble(nextKey);
            }
            double d5 = dArr[0];
            double d6 = dArr[1];
            double d7 = dArr[2];
            double d8 = dArr[3];
            double d9 = dArr[4];
            double d10 = dArr[5];
            double d11 = dArr[6];
            double d12 = dArr[7];
            double d13 = dArr[8];
            double d14 = dArr[9];
            double d15 = dArr[10];
            double d16 = dArr[11];
            double d17 = dArr[12];
            double d18 = dArr[13];
            double d19 = dArr[14];
            double d20 = dArr[15];
            double d21 = dArr2[0];
            double d22 = dArr2[1];
            double d23 = dArr2[2];
            double d24 = dArr2[3];
            dArr[0] = (d21 * d5) + (d22 * d9) + (d23 * d13) + (d24 * d17);
            dArr[1] = (d21 * d6) + (d22 * d10) + (d23 * d14) + (d24 * d18);
            dArr[2] = (d21 * d7) + (d22 * d11) + (d23 * d15) + (d24 * d19);
            dArr[3] = (d21 * d8) + (d22 * d12) + (d23 * d16) + (d24 * d20);
            double d25 = dArr2[4];
            double d26 = dArr2[5];
            double d27 = dArr2[6];
            double d28 = dArr2[7];
            dArr[4] = (d25 * d5) + (d26 * d9) + (d27 * d13) + (d28 * d17);
            dArr[5] = (d25 * d6) + (d26 * d10) + (d27 * d14) + (d28 * d18);
            dArr[6] = (d25 * d7) + (d26 * d11) + (d27 * d15) + (d28 * d19);
            dArr[7] = (d25 * d8) + (d26 * d12) + (d27 * d16) + (d28 * d20);
            double d29 = dArr2[8];
            double d30 = dArr2[9];
            double d31 = dArr2[10];
            double d32 = dArr2[11];
            dArr[8] = (d29 * d5) + (d30 * d9) + (d31 * d13) + (d32 * d17);
            dArr[9] = (d29 * d6) + (d30 * d10) + (d31 * d14) + (d32 * d18);
            dArr[10] = (d29 * d7) + (d30 * d11) + (d31 * d15) + (d32 * d19);
            dArr[11] = (d29 * d8) + (d30 * d12) + (d31 * d16) + (d32 * d20);
            double d33 = dArr2[12];
            double d34 = dArr2[13];
            double d35 = dArr2[14];
            double d36 = dArr2[15];
            dArr[12] = (d5 * d33) + (d9 * d34) + (d13 * d35) + (d17 * d36);
            dArr[13] = (d6 * d33) + (d10 * d34) + (d14 * d35) + (d18 * d36);
            dArr[14] = (d7 * d33) + (d11 * d34) + (d15 * d35) + (d19 * d36);
            dArr[15] = (d33 * d8) + (d34 * d12) + (d35 * d16) + (d36 * d20);
        }
    }
}
