package com.alibaba.android.bindingx.core.internal;

import android.animation.ArgbEvaluator;
import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.android.bindingx.core.e;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l {
    public static Object a = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.1
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            return Double.valueOf(Math.sin(((Double) arrayList.get(0)).doubleValue()));
        }
    };
    public static Object b = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.12
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            return Double.valueOf(Math.cos(((Double) arrayList.get(0)).doubleValue()));
        }
    };
    public static Object c = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.21
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            return Double.valueOf(Math.tan(((Double) arrayList.get(0)).doubleValue()));
        }
    };
    public static Object d = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.22
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            return Double.valueOf(Math.asin(((Double) arrayList.get(0)).doubleValue()));
        }
    };
    public static Object e = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.23
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            return Double.valueOf(Math.acos(((Double) arrayList.get(0)).doubleValue()));
        }
    };
    public static Object f = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.24
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            return Double.valueOf(Math.atan(((Double) arrayList.get(0)).doubleValue()));
        }
    };
    public static Object g = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.25
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            return Double.valueOf(Math.atan2(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue()));
        }
    };
    public static Object h = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.26
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            return Double.valueOf(Math.pow(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue()));
        }
    };
    public static Object i = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.27
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            return Double.valueOf(Math.exp(((Double) arrayList.get(0)).doubleValue()));
        }
    };
    public static Object j = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.2
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            return Double.valueOf(Math.sqrt(((Double) arrayList.get(0)).doubleValue()));
        }
    };
    public static Object k = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.3
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            return Double.valueOf(Math.cbrt(((Double) arrayList.get(0)).doubleValue()));
        }
    };
    public static Object l = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.4
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            return Double.valueOf(Math.log(((Double) arrayList.get(0)).doubleValue()));
        }
    };
    public static Object m = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.5
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            return Double.valueOf(Math.abs(((Double) arrayList.get(0)).doubleValue()));
        }
    };
    public static Object n = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.6
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            double doubleValue = ((Double) arrayList.get(0)).doubleValue();
            int i2 = (doubleValue > 0.0d ? 1 : (doubleValue == 0.0d ? 0 : -1));
            if (i2 > 0) {
                return 1;
            }
            if (i2 == 0) {
                return 0;
            }
            if (doubleValue < 0.0d) {
                return -1;
            }
            return Double.valueOf(Double.NaN);
        }
    };
    public static Object o = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.7
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            return Double.valueOf(Math.ceil(((Double) arrayList.get(0)).doubleValue()));
        }
    };
    public static Object p = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.8
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            return Double.valueOf(Math.floor(((Double) arrayList.get(0)).doubleValue()));
        }
    };
    public static Object q = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.9
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            return Long.valueOf(Math.round(((Double) arrayList.get(0)).doubleValue()));
        }
    };
    public static Object r = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.10
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            if (arrayList.size() > 0) {
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                int size = arrayList.size();
                for (int i2 = 1; i2 < size; i2++) {
                    double doubleValue2 = ((Double) arrayList.get(i2)).doubleValue();
                    if (doubleValue2 > doubleValue) {
                        doubleValue = doubleValue2;
                    }
                }
                return Double.valueOf(doubleValue);
            }
            return null;
        }
    };
    public static Object s = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.11
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) {
            if (arrayList.size() > 0) {
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                int size = arrayList.size();
                for (int i2 = 1; i2 < size; i2++) {
                    double doubleValue2 = ((Double) arrayList.get(i2)).doubleValue();
                    if (doubleValue2 < doubleValue) {
                        doubleValue = doubleValue2;
                    }
                }
                return Double.valueOf(doubleValue);
            }
            return null;
        }
    };
    public static Object t = Double.valueOf(3.141592653589793d);
    public static Object u = Double.valueOf(2.718281828459045d);
    public static Object v = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.13
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            if (arrayList.size() < 2) {
                return null;
            }
            return arrayList;
        }
    };
    public static Object w = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.14
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            if (arrayList.size() < 2) {
                return null;
            }
            return arrayList;
        }
    };
    public static Object x = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.15
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            if (arrayList.size() < 6) {
                return null;
            }
            return arrayList;
        }
    };
    public static Object y = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.16
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            if (arrayList.size() < 3) {
                return null;
            }
            return Integer.valueOf(Color.rgb((int) ((Double) arrayList.get(0)).doubleValue(), (int) ((Double) arrayList.get(1)).doubleValue(), (int) ((Double) arrayList.get(2)).doubleValue()));
        }
    };
    public static Object z = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.17
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            if (arrayList.size() < 4) {
                return null;
            }
            return Integer.valueOf(Color.argb((int) (((Double) arrayList.get(3)).doubleValue() * 255.0d), (int) ((Double) arrayList.get(0)).doubleValue(), (int) ((Double) arrayList.get(1)).doubleValue(), (int) ((Double) arrayList.get(2)).doubleValue()));
        }
    };
    public static ArgbEvaluator A = new ArgbEvaluator();
    public static Object B = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.18
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            int a2 = l.a((String) arrayList.get(0));
            int a3 = l.a((String) arrayList.get(1));
            return l.A.evaluate((float) Math.min(1.0d, Math.max(0.0d, ((Double) arrayList.get(2)).doubleValue())), Integer.valueOf(a2), Integer.valueOf(a3));
        }
    };
    public static Object C = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.19
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            return arrayList;
        }
    };
    public static Object D = new k() { // from class: com.alibaba.android.bindingx.core.internal.l.20
        @Override // com.alibaba.android.bindingx.core.internal.k
        public final Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
            if (arrayList.size() == 1) {
                Object obj = arrayList.get(0);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.startsWith(CommonConstant.Symbol.DOUBLE_QUOTES) && str.endsWith(CommonConstant.Symbol.DOUBLE_QUOTES)) {
                        return str.substring(str.indexOf(CommonConstant.Symbol.DOUBLE_QUOTES) + 1, str.lastIndexOf(CommonConstant.Symbol.DOUBLE_QUOTES));
                    }
                    if (str.startsWith(CommonConstant.Symbol.SINGLE_QUOTES) && str.endsWith(CommonConstant.Symbol.SINGLE_QUOTES)) {
                        return str.substring(str.indexOf(CommonConstant.Symbol.SINGLE_QUOTES) + 1, str.lastIndexOf(CommonConstant.Symbol.SINGLE_QUOTES));
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
    };

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Unknown color");
        }
        if (str.startsWith(CommonConstant.Symbol.SINGLE_QUOTES) || str.startsWith(CommonConstant.Symbol.DOUBLE_QUOTES)) {
            str = str.substring(1, str.length() - 1);
        }
        int parseColor = Color.parseColor(str);
        return Color.argb(255, Color.red(parseColor), Color.green(parseColor), Color.blue(parseColor));
    }

    public static void a(Map<String, Object> map, double d2, double d3, e.b bVar) {
        map.put(Constants.GestureMoveEvent.KEY_X, Double.valueOf(bVar.b(d2, new Object[0])));
        map.put(Constants.GestureMoveEvent.KEY_Y, Double.valueOf(bVar.b(d3, new Object[0])));
        map.put("internal_x", Double.valueOf(d2));
        map.put("internal_y", Double.valueOf(d3));
    }

    public static void a(Map<String, Object> map, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        map.put("alpha", Double.valueOf(d2));
        map.put("beta", Double.valueOf(d3));
        map.put("gamma", Double.valueOf(d4));
        map.put("dalpha", Double.valueOf(d2 - d5));
        map.put("dbeta", Double.valueOf(d3 - d6));
        map.put("dgamma", Double.valueOf(d4 - d7));
        map.put(Constants.GestureMoveEvent.KEY_X, Double.valueOf(d8));
        map.put(Constants.GestureMoveEvent.KEY_Y, Double.valueOf(d9));
        map.put("z", Double.valueOf(d10));
    }

    public static void a(Map<String, Object> map, double d2) {
        map.put("t", Double.valueOf(d2));
    }

    public static void a(Map<String, Object> map, double d2, double d3, double d4, double d5, double d6, double d7, e.b bVar) {
        map.put(Constants.GestureMoveEvent.KEY_X, Double.valueOf(bVar.b(d2, new Object[0])));
        map.put(Constants.GestureMoveEvent.KEY_Y, Double.valueOf(bVar.b(d3, new Object[0])));
        map.put("dx", Double.valueOf(bVar.b(d4, new Object[0])));
        map.put("dy", Double.valueOf(bVar.b(d5, new Object[0])));
        map.put("tdx", Double.valueOf(bVar.b(d6, new Object[0])));
        map.put("tdy", Double.valueOf(bVar.b(d7, new Object[0])));
        map.put("internal_x", Double.valueOf(d2));
        map.put("internal_y", Double.valueOf(d3));
    }

    public static void a(Map<String, Object> map) {
        map.put("sin", a);
        map.put("cos", b);
        map.put("tan", c);
        map.put("asin", d);
        map.put("acos", e);
        map.put("atan", f);
        map.put("atan2", g);
        map.put("pow", h);
        map.put("exp", i);
        map.put("sqrt", j);
        map.put("cbrt", k);
        map.put(SnifferDBHelper.COLUMN_LOG, l);
        map.put("abs", m);
        map.put(DeviceInfo.SIGN, n);
        map.put("ceil", o);
        map.put(GearsLocator.MALL_FLOOR, p);
        map.put("round", q);
        map.put("max", r);
        map.put("min", s);
        map.put("PI", t);
        map.put("E", u);
        map.put("translate", v);
        map.put("scale", w);
        map.put("matrix", x);
        map.put("rgb", y);
        map.put("rgba", z);
        map.put("evaluateColor", B);
        map.put("asArray", C);
        map.put("asString", D);
    }
}
