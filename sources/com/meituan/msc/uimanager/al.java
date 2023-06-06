package com.meituan.msc.uimanager;

import com.dianping.picasso.view.command.AnimationViewCommandModel;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class al {
    public static ChangeQuickRedirect a;
    private static ThreadLocal<double[]> b = new ThreadLocal<double[]>() { // from class: com.meituan.msc.uimanager.al.1
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ double[] initialValue() {
            return new double[16];
        }
    };

    private static double a(ReadableMap readableMap, String str) {
        double d;
        boolean z;
        Object[] objArr = {readableMap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "891b4fa4bce01c681844bd564a866d19", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "891b4fa4bce01c681844bd564a866d19")).doubleValue();
        }
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            if (string.endsWith("rad")) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith("deg")) {
                string = string.substring(0, string.length() - 3);
                z = false;
                d = Float.parseFloat(string);
            }
            z = true;
            d = Float.parseFloat(string);
        } else {
            d = readableMap.getDouble(str);
            z = true;
        }
        if (z) {
            return d;
        }
        Object[] objArr2 = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "20f4a17c3b0c331dee95a20803a1c1c4", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "20f4a17c3b0c331dee95a20803a1c1c4")).doubleValue() : (d * 3.141592653589793d) / 180.0d;
    }

    public static void a(ReadableArray readableArray, double[] dArr) {
        ReadableArray array;
        Object[] objArr = {readableArray, dArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd56db0df82f154ae407f6fe4049655c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd56db0df82f154ae407f6fe4049655c");
            return;
        }
        double[] dArr2 = b.get();
        k.a(dArr);
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            String nextKey = map.keySetIterator().nextKey();
            k.a(dArr2);
            if ("matrix".equals(nextKey)) {
                ReadableArray array2 = map.getArray(nextKey);
                for (int i2 = 0; i2 < 16; i2++) {
                    dArr2[i2] = array2.getDouble(i2);
                }
            } else if ("perspective".equals(nextKey)) {
                double d = map.getDouble(nextKey);
                Object[] objArr2 = {dArr2, Double.valueOf(d)};
                ChangeQuickRedirect changeQuickRedirect2 = k.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b60f80cbde13fa62ebebfc652b1f0a45", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b60f80cbde13fa62ebebfc652b1f0a45");
                } else {
                    dArr2[11] = (-1.0d) / d;
                }
            } else if (AnimationViewCommandModel.RotationX.equals(nextKey)) {
                double a2 = a(map, nextKey);
                Object[] objArr3 = {dArr2, Double.valueOf(a2)};
                ChangeQuickRedirect changeQuickRedirect3 = k.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "3ba5e7d39ee878b9f7211c351d42c6e7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "3ba5e7d39ee878b9f7211c351d42c6e7");
                } else {
                    dArr2[5] = Math.cos(a2);
                    dArr2[6] = Math.sin(a2);
                    dArr2[9] = -Math.sin(a2);
                    dArr2[10] = Math.cos(a2);
                }
            } else if (AnimationViewCommandModel.RotationY.equals(nextKey)) {
                double a3 = a(map, nextKey);
                Object[] objArr4 = {dArr2, Double.valueOf(a3)};
                ChangeQuickRedirect changeQuickRedirect4 = k.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "738a2ac366b1f7be1ed2e4d4836d3429", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "738a2ac366b1f7be1ed2e4d4836d3429");
                } else {
                    dArr2[0] = Math.cos(a3);
                    dArr2[2] = -Math.sin(a3);
                    dArr2[8] = Math.sin(a3);
                    dArr2[10] = Math.cos(a3);
                }
            } else if (AnimationViewCommandModel.Rotation.equals(nextKey) || "rotateZ".equals(nextKey)) {
                double a4 = a(map, nextKey);
                Object[] objArr5 = {dArr2, Double.valueOf(a4)};
                ChangeQuickRedirect changeQuickRedirect5 = k.a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "19758c4e0340862e1c82b7e58d6d32d5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "19758c4e0340862e1c82b7e58d6d32d5");
                } else {
                    dArr2[0] = Math.cos(a4);
                    dArr2[1] = Math.sin(a4);
                    dArr2[4] = -Math.sin(a4);
                    dArr2[5] = Math.cos(a4);
                }
            } else if ("scale".equals(nextKey)) {
                Dynamic dynamic = map.getDynamic("scale");
                if (dynamic.getType() == ReadableType.Number) {
                    double d2 = map.getDouble(nextKey);
                    k.a(dArr2, d2);
                    k.b(dArr2, d2);
                } else if (dynamic.getType() == ReadableType.Array && (array = map.getArray(nextKey)) != null && array.size() == 2) {
                    k.a(dArr2, array.getDouble(0));
                    k.b(dArr2, array.getDouble(1));
                }
            } else if (RecceAnimUtils.SCALE_X.equals(nextKey)) {
                k.a(dArr2, map.getDouble(nextKey));
            } else if (RecceAnimUtils.SCALE_Y.equals(nextKey)) {
                k.b(dArr2, map.getDouble(nextKey));
            } else if ("translate".equals(nextKey)) {
                ReadableArray array3 = map.getArray(nextKey);
                double d3 = array3.getDouble(0);
                double d4 = array3.getDouble(1);
                double d5 = array3.size() > 2 ? array3.getDouble(2) : 0.0d;
                Object[] objArr6 = {dArr2, Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)};
                ChangeQuickRedirect changeQuickRedirect6 = k.a;
                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "06d48757581bb8f68fdc9cca106546de", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "06d48757581bb8f68fdc9cca106546de");
                } else {
                    dArr2[12] = d3;
                    dArr2[13] = d4;
                    dArr2[14] = d5;
                }
            } else if ("translateX".equals(nextKey)) {
                k.a(dArr2, map.getDouble(nextKey), 0.0d);
            } else if ("translateY".equals(nextKey)) {
                k.a(dArr2, 0.0d, map.getDouble(nextKey));
            } else if ("skewX".equals(nextKey)) {
                double a5 = a(map, nextKey);
                Object[] objArr7 = {dArr2, Double.valueOf(a5)};
                ChangeQuickRedirect changeQuickRedirect7 = k.a;
                if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "b281fa0f8e2ee049080ed75c3b3537d8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "b281fa0f8e2ee049080ed75c3b3537d8");
                } else {
                    dArr2[4] = Math.tan(a5);
                }
            } else if ("skewY".equals(nextKey)) {
                double a6 = a(map, nextKey);
                Object[] objArr8 = {dArr2, Double.valueOf(a6)};
                ChangeQuickRedirect changeQuickRedirect8 = k.a;
                if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "90bd10bc8127658a3c8d72c6fadb3854", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "90bd10bc8127658a3c8d72c6fadb3854");
                } else {
                    dArr2[1] = Math.tan(a6);
                }
            } else {
                throw new JSApplicationIllegalArgumentException("Unsupported transform type: " + nextKey);
            }
            Object[] objArr9 = {dArr, dArr, dArr2};
            ChangeQuickRedirect changeQuickRedirect9 = k.a;
            if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "2a6b89ef475687abe7065d60ae8136b1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "2a6b89ef475687abe7065d60ae8136b1");
            } else {
                double d6 = dArr[0];
                double d7 = dArr[1];
                double d8 = dArr[2];
                double d9 = dArr[3];
                double d10 = dArr[4];
                double d11 = dArr[5];
                double d12 = dArr[6];
                double d13 = dArr[7];
                double d14 = dArr[8];
                double d15 = dArr[9];
                double d16 = dArr[10];
                double d17 = dArr[11];
                double d18 = dArr[12];
                double d19 = dArr[13];
                double d20 = dArr[14];
                double d21 = dArr[15];
                double d22 = dArr2[0];
                double d23 = dArr2[1];
                double d24 = dArr2[2];
                double d25 = dArr2[3];
                dArr[0] = (d22 * d6) + (d23 * d10) + (d24 * d14) + (d25 * d18);
                dArr[1] = (d22 * d7) + (d23 * d11) + (d24 * d15) + (d25 * d19);
                dArr[2] = (d22 * d8) + (d23 * d12) + (d24 * d16) + (d25 * d20);
                dArr[3] = (d22 * d9) + (d23 * d13) + (d24 * d17) + (d25 * d21);
                double d26 = dArr2[4];
                double d27 = dArr2[5];
                double d28 = dArr2[6];
                double d29 = dArr2[7];
                dArr[4] = (d26 * d6) + (d27 * d10) + (d28 * d14) + (d29 * d18);
                dArr[5] = (d26 * d7) + (d27 * d11) + (d28 * d15) + (d29 * d19);
                dArr[6] = (d26 * d8) + (d27 * d12) + (d28 * d16) + (d29 * d20);
                dArr[7] = (d26 * d9) + (d27 * d13) + (d28 * d17) + (d29 * d21);
                double d30 = dArr2[8];
                double d31 = dArr2[9];
                double d32 = dArr2[10];
                double d33 = dArr2[11];
                dArr[8] = (d30 * d6) + (d31 * d10) + (d32 * d14) + (d33 * d18);
                dArr[9] = (d30 * d7) + (d31 * d11) + (d32 * d15) + (d33 * d19);
                dArr[10] = (d30 * d8) + (d31 * d12) + (d32 * d16) + (d33 * d20);
                dArr[11] = (d30 * d9) + (d31 * d13) + (d32 * d17) + (d33 * d21);
                double d34 = dArr2[12];
                double d35 = dArr2[13];
                double d36 = dArr2[14];
                double d37 = dArr2[15];
                dArr[12] = (d6 * d34) + (d10 * d35) + (d14 * d36) + (d18 * d37);
                dArr[13] = (d7 * d34) + (d11 * d35) + (d15 * d36) + (d19 * d37);
                dArr[14] = (d8 * d34) + (d12 * d35) + (d16 * d36) + (d20 * d37);
                dArr[15] = (d34 * d9) + (d35 * d13) + (d36 * d17) + (d37 * d21);
            }
        }
    }
}
