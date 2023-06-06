package com.alibaba.android.bindingx.core.internal;

import android.support.v4.view.animation.PathInterpolatorCompat;
import android.view.animation.Interpolator;
import com.meituan.msc.modules.api.msi.components.coverview.CoverViewAnimateUtil;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class s {
    private static Object a = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.1
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            return Double.valueOf((doubleValue3 * (Math.min(doubleValue, doubleValue4) / doubleValue4)) + doubleValue2);
        }
    };
    private static Object b = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.12
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double doubleValue5 = ((Double) arrayList.get(4)).doubleValue();
            double doubleValue6 = ((Double) arrayList.get(5)).doubleValue();
            double doubleValue7 = ((Double) arrayList.get(6)).doubleValue();
            double doubleValue8 = ((Double) arrayList.get(7)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4);
            if (min == doubleValue4) {
                return Double.valueOf(doubleValue2 + doubleValue3);
            }
            float f2 = (float) doubleValue5;
            float f3 = (float) doubleValue6;
            float f4 = (float) doubleValue7;
            float f5 = (float) doubleValue8;
            a a2 = s.a(f2, f3, f4, f5);
            if (a2 == null) {
                a2 = new a(f2, f3, f4, f5);
                b bVar = s.c;
                if (bVar.a.size() >= 4) {
                    bVar.a.removeFirst();
                }
                bVar.a.addLast(a2);
            }
            return Double.valueOf((doubleValue3 * a2.getInterpolation((float) (min / doubleValue4))) + doubleValue2);
        }
    };
    private static final b<a> c = new b<>(4);
    private static Object d = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.23
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
            return Double.valueOf((doubleValue3 * min * min) + doubleValue2);
        }
    };
    private static Object e = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.27
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
            return Double.valueOf(((-doubleValue3) * min * (min - 2.0d)) + doubleValue2);
        }
    };
    private static Object f = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.28
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / (doubleValue4 / 2.0d);
            if (min < 1.0d) {
                return Double.valueOf(((doubleValue3 / 2.0d) * min * min) + doubleValue2);
            }
            double d2 = min - 1.0d;
            return Double.valueOf((((-doubleValue3) / 2.0d) * ((d2 * (d2 - 2.0d)) - 1.0d)) + doubleValue2);
        }
    };
    private static Object g = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.29
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
            return Double.valueOf((doubleValue3 * min * min * min) + doubleValue2);
        }
    };
    private static Object h = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.30
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = (Math.min(doubleValue, doubleValue4) / doubleValue4) - 1.0d;
            return Double.valueOf((doubleValue3 * ((min * min * min) + 1.0d)) + doubleValue2);
        }
    };
    private static Object i = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.31
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / (doubleValue4 / 2.0d);
            if (min < 1.0d) {
                return Double.valueOf(((doubleValue3 / 2.0d) * min * min * min) + doubleValue2);
            }
            double d2 = min - 2.0d;
            return Double.valueOf(((doubleValue3 / 2.0d) * ((d2 * d2 * d2) + 2.0d)) + doubleValue2);
        }
    };
    private static Object j = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.32
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
            return Double.valueOf((doubleValue3 * min * min * min * min) + doubleValue2);
        }
    };
    private static Object k = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.2
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = (Math.min(doubleValue, doubleValue4) / doubleValue4) - 1.0d;
            return Double.valueOf(((-doubleValue3) * ((((min * min) * min) * min) - 1.0d)) + doubleValue2);
        }
    };
    private static Object l = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.3
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / (doubleValue4 / 2.0d);
            if (min < 1.0d) {
                return Double.valueOf(((doubleValue3 / 2.0d) * min * min * min * min) + doubleValue2);
            }
            double d2 = min - 2.0d;
            return Double.valueOf((((-doubleValue3) / 2.0d) * ((((d2 * d2) * d2) * d2) - 2.0d)) + doubleValue2);
        }
    };
    private static Object m = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.4
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
            return Double.valueOf((doubleValue3 * min * min * min * min * min) + doubleValue2);
        }
    };
    private static Object n = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.5
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = (Math.min(doubleValue, doubleValue4) / doubleValue4) - 1.0d;
            return Double.valueOf((doubleValue3 * ((min * min * min * min * min) + 1.0d)) + doubleValue2);
        }
    };
    private static Object o = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.6
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / (doubleValue4 / 2.0d);
            if (min < 1.0d) {
                return Double.valueOf(((doubleValue3 / 2.0d) * min * min * min * min * min) + doubleValue2);
            }
            double d2 = min - 2.0d;
            return Double.valueOf(((doubleValue3 / 2.0d) * ((d2 * d2 * d2 * d2 * d2) + 2.0d)) + doubleValue2);
        }
    };
    private static Object p = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.7
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            return Double.valueOf(((-doubleValue3) * Math.cos((Math.min(doubleValue, doubleValue4) / doubleValue4) * 1.5707963267948966d)) + doubleValue3 + doubleValue2);
        }
    };
    private static Object q = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.8
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            return Double.valueOf((doubleValue3 * Math.sin((Math.min(doubleValue, doubleValue4) / doubleValue4) * 1.5707963267948966d)) + doubleValue2);
        }
    };
    private static Object r = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.9
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            return Double.valueOf((((-doubleValue3) / 2.0d) * (Math.cos((Math.min(doubleValue, doubleValue4) * 3.141592653589793d) / doubleValue4) - 1.0d)) + doubleValue2);
        }
    };
    private static Object s = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.10
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4);
            if (min != 0.0d) {
                doubleValue2 += doubleValue3 * Math.pow(2.0d, ((min / doubleValue4) - 1.0d) * 10.0d);
            }
            return Double.valueOf(doubleValue2);
        }
    };
    private static Object t = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.11
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4);
            return Double.valueOf(min == doubleValue4 ? doubleValue2 + doubleValue3 : doubleValue2 + (doubleValue3 * ((-Math.pow(2.0d, (min * (-10.0d)) / doubleValue4)) + 1.0d)));
        }
    };
    private static Object u = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.13
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4);
            if (min == 0.0d) {
                return Double.valueOf(doubleValue2);
            }
            if (min == doubleValue4) {
                return Double.valueOf(doubleValue2 + doubleValue3);
            }
            double d2 = min / (doubleValue4 / 2.0d);
            if (d2 < 1.0d) {
                return Double.valueOf(((doubleValue3 / 2.0d) * Math.pow(2.0d, (d2 - 1.0d) * 10.0d)) + doubleValue2);
            }
            return Double.valueOf(((doubleValue3 / 2.0d) * ((-Math.pow(2.0d, (d2 - 1.0d) * (-10.0d))) + 2.0d)) + doubleValue2);
        }
    };
    private static Object v = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.14
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
            return Double.valueOf(((-doubleValue3) * (Math.sqrt(1.0d - (min * min)) - 1.0d)) + doubleValue2);
        }
    };
    private static Object w = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.15
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = (Math.min(doubleValue, doubleValue4) / doubleValue4) - 1.0d;
            return Double.valueOf((doubleValue3 * Math.sqrt(1.0d - (min * min))) + doubleValue2);
        }
    };
    private static Object x = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.16
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / (doubleValue4 / 2.0d);
            if (min < 1.0d) {
                return Double.valueOf((((-doubleValue3) / 2.0d) * (Math.sqrt(1.0d - (min * min)) - 1.0d)) + doubleValue2);
            }
            double d2 = min - 2.0d;
            return Double.valueOf(((doubleValue3 / 2.0d) * (Math.sqrt(1.0d - (d2 * d2)) + 1.0d)) + doubleValue2);
        }
    };
    private static Object y = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.17
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4);
            if (min == 0.0d) {
                return Double.valueOf(doubleValue2);
            }
            double d2 = min / doubleValue4;
            if (d2 == 1.0d) {
                return Double.valueOf(doubleValue2 + doubleValue3);
            }
            double d3 = 0.3d * doubleValue4;
            double d4 = d2 - 1.0d;
            return Double.valueOf((-(doubleValue3 * Math.pow(2.0d, d4 * 10.0d) * Math.sin((((d4 * doubleValue4) - (doubleValue3 < Math.abs(doubleValue3) ? d3 / 4.0d : (d3 / 6.283185307179586d) * Math.asin(doubleValue3 / doubleValue3))) * 6.283185307179586d) / d3))) + doubleValue2);
        }
    };
    private static Object z = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.18
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4);
            if (min == 0.0d) {
                return Double.valueOf(doubleValue2);
            }
            double d2 = min / doubleValue4;
            if (d2 == 1.0d) {
                return Double.valueOf(doubleValue2 + doubleValue3);
            }
            double d3 = 0.3d * doubleValue4;
            return Double.valueOf((Math.pow(2.0d, d2 * (-10.0d)) * doubleValue3 * Math.sin((((d2 * doubleValue4) - (doubleValue3 < Math.abs(doubleValue3) ? d3 / 4.0d : (d3 / 6.283185307179586d) * Math.asin(doubleValue3 / doubleValue3))) * 6.283185307179586d) / d3)) + doubleValue3 + doubleValue2);
        }
    };
    private static Object A = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.19
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4);
            if (min == 0.0d) {
                return Double.valueOf(doubleValue2);
            }
            double d2 = min / (doubleValue4 / 2.0d);
            if (d2 == 2.0d) {
                return Double.valueOf(doubleValue2 + doubleValue3);
            }
            double d3 = 0.44999999999999996d * doubleValue4;
            double asin = doubleValue3 < Math.abs(doubleValue3) ? d3 / 4.0d : (d3 / 6.283185307179586d) * Math.asin(doubleValue3 / doubleValue3);
            if (d2 < 1.0d) {
                double d4 = d2 - 1.0d;
                return Double.valueOf((doubleValue3 * Math.pow(2.0d, d4 * 10.0d) * Math.sin((((d4 * doubleValue4) - asin) * 6.283185307179586d) / d3) * (-0.5d)) + doubleValue2);
            }
            double d5 = d2 - 1.0d;
            return Double.valueOf((Math.pow(2.0d, (-10.0d) * d5) * doubleValue3 * Math.sin((((d5 * doubleValue4) - asin) * 6.283185307179586d) / d3) * 0.5d) + doubleValue3 + doubleValue2);
        }
    };
    private static Object B = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.20
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
            return Double.valueOf((doubleValue3 * min * min * ((min * 2.70158d) - 1.70158d)) + doubleValue2);
        }
    };
    private static Object C = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.21
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = (Math.min(doubleValue, doubleValue4) / doubleValue4) - 1.0d;
            return Double.valueOf((doubleValue3 * ((min * min * ((min * 2.70158d) + 1.70158d)) + 1.0d)) + doubleValue2);
        }
    };
    private static Object D = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.22
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4) / (doubleValue4 / 2.0d);
            if (min < 1.0d) {
                return Double.valueOf(((doubleValue3 / 2.0d) * min * min * ((min * 3.5949095d) - 2.5949095d)) + doubleValue2);
            }
            double d2 = min - 2.0d;
            return Double.valueOf(((doubleValue3 / 2.0d) * ((d2 * d2 * ((d2 * 3.5949095d) + 2.5949095d)) + 2.0d)) + doubleValue2);
        }
    };
    private static Object E = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.24
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            return Double.valueOf(s.a(Math.min(doubleValue, doubleValue4), doubleValue2, doubleValue3, doubleValue4));
        }
    };
    private static Object F = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.25
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            return Double.valueOf(s.c(Math.min(doubleValue, doubleValue4), doubleValue2, doubleValue3, doubleValue4));
        }
    };
    private static Object G = new k() { // from class: com.alibaba.android.bindingx.core.internal.s.26
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
            double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
            double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
            double min = Math.min(doubleValue, doubleValue4);
            if (min >= doubleValue4 / 2.0d) {
                return Double.valueOf((s.c((min * 2.0d) - doubleValue4, 0.0d, doubleValue3, doubleValue4) * 0.5d) + (doubleValue3 * 0.5d) + doubleValue2);
            }
            return Double.valueOf((s.a(min * 2.0d, 0.0d, doubleValue3, doubleValue4) * 0.5d) + doubleValue2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static double c(double d2, double d3, double d4, double d5) {
        double d6 = d2 / d5;
        if (d6 < 0.36363636363636365d) {
            return (d4 * 7.5625d * d6 * d6) + d3;
        }
        if (d6 < 0.7272727272727273d) {
            double d7 = d6 - 0.5454545454545454d;
            return (d4 * ((7.5625d * d7 * d7) + 0.75d)) + d3;
        } else if (d6 < 0.9090909090909091d) {
            double d8 = d6 - 0.8181818181818182d;
            return (d4 * ((7.5625d * d8 * d8) + 0.9375d)) + d3;
        } else {
            double d9 = d6 - 0.9545454545454546d;
            return (d4 * ((7.5625d * d9 * d9) + 0.984375d)) + d3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Map<String, Object> map) {
        map.put(CoverViewAnimateUtil.MSCAnimatedParams.EASING_LINEAR, a);
        map.put("easeInQuad", d);
        map.put("easeOutQuad", e);
        map.put("easeInOutQuad", f);
        map.put("easeInCubic", g);
        map.put("easeOutCubic", h);
        map.put("easeInOutCubic", i);
        map.put("easeInQuart", j);
        map.put("easeOutQuart", k);
        map.put("easeInOutQuart", l);
        map.put("easeInQuint", m);
        map.put("easeOutQuint", n);
        map.put("easeInOutQuint", o);
        map.put("easeInSine", p);
        map.put("easeOutSine", q);
        map.put("easeInOutSine", r);
        map.put("easeInExpo", s);
        map.put("easeOutExpo", t);
        map.put("easeInOutExpo", u);
        map.put("easeInCirc", v);
        map.put("easeOutCirc", w);
        map.put("easeInOutCirc", x);
        map.put("easeInElastic", y);
        map.put("easeOutElastic", z);
        map.put("easeInOutElastic", A);
        map.put("easeInBack", B);
        map.put("easeOutBack", C);
        map.put("easeInOutBack", D);
        map.put("easeInBounce", E);
        map.put("easeOutBounce", F);
        map.put("easeInOutBounce", G);
        map.put("cubicBezier", b);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b<T> {
        final ArrayDeque<T> a = new ArrayDeque<>(4);

        b(int i) {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements Interpolator {
        float a;
        float b;
        float c;
        float d;
        private Interpolator e;

        a(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = PathInterpolatorCompat.create(f, f2, f3, f4);
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return this.e.getInterpolation(f);
        }
    }

    static /* synthetic */ a a(float f2, float f3, float f4, float f5) {
        for (a aVar : c.a) {
            if (Float.compare(aVar.a, f2) == 0 && Float.compare(aVar.c, f4) == 0 && Float.compare(aVar.b, f3) == 0 && Float.compare(aVar.d, f5) == 0) {
                return aVar;
            }
        }
        return null;
    }

    static /* synthetic */ double a(double d2, double d3, double d4, double d5) {
        return (d4 - c(d5 - d2, 0.0d, d4, d5)) + d3;
    }
}
