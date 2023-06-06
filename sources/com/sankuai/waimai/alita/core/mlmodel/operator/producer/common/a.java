package com.sankuai.waimai.alita.core.mlmodel.operator.producer.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static double a(double d, double d2, double d3) {
        if (d2 < d3) {
            double d4 = d3 - d2;
            if (Math.abs(d4) >= 1.0E-6d) {
                if (d < d2) {
                    return 0.0d;
                }
                if (d > d3) {
                    return 1.0d;
                }
                return (d - d2) / d4;
            }
        }
        return d;
    }

    public static List<Number> a(List<Number> list, double d, double d2) {
        ArrayList arrayList = new ArrayList();
        for (Number number : list) {
            arrayList.add(Double.valueOf(a(number.doubleValue(), d, d2)));
        }
        return arrayList;
    }

    public static double b(double d, double d2, double d3) {
        return Math.abs(d3) < 1.0E-6d ? d : (d - d2) / d3;
    }

    public static List<Number> b(List<Number> list, double d, double d2) {
        ArrayList arrayList = new ArrayList();
        for (Number number : list) {
            arrayList.add(Double.valueOf(b(number.doubleValue(), d, d2)));
        }
        return arrayList;
    }

    public static Object a(Object obj, Object obj2) {
        return (obj == null || (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, String.class) && "".equals(obj)) || (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class) && ((List) obj).isEmpty())) ? obj2 : obj;
    }

    public static double a(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6935f890511ef78fbd44887faee25b46", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6935f890511ef78fbd44887faee25b46")).doubleValue();
        }
        Double valueOf = Double.valueOf(new BigDecimal(Double.toString(d)).add(new BigDecimal(Double.toString(d2))).doubleValue());
        if (valueOf.isInfinite()) {
            return valueOf.doubleValue() < 0.0d ? -1.7976931348623157E308d : Double.MAX_VALUE;
        }
        if (valueOf.isNaN()) {
            if (valueOf.doubleValue() < 0.0d) {
                valueOf = Double.valueOf(-4.9E-324d);
            } else {
                valueOf = Double.valueOf(Double.MIN_VALUE);
            }
        }
        return valueOf.doubleValue();
    }

    public static List<Number> a(List<Number> list, double d) {
        ArrayList arrayList = new ArrayList();
        for (Number number : list) {
            arrayList.add(Double.valueOf(a(number.doubleValue(), d)));
        }
        return arrayList;
    }

    public static double b(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3675b4391856328cf4e23ae46d45653a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3675b4391856328cf4e23ae46d45653a")).doubleValue();
        }
        Double valueOf = Double.valueOf(new BigDecimal(Double.toString(d)).multiply(new BigDecimal(Double.toString(d2))).doubleValue());
        if (valueOf.isInfinite()) {
            return valueOf.doubleValue() < 0.0d ? -1.7976931348623157E308d : Double.MAX_VALUE;
        }
        if (valueOf.isNaN()) {
            if (valueOf.doubleValue() < 0.0d) {
                valueOf = Double.valueOf(-4.9E-324d);
            } else {
                valueOf = Double.valueOf(Double.MIN_VALUE);
            }
        }
        return valueOf.doubleValue();
    }

    public static List<Number> b(List<Number> list, double d) {
        ArrayList arrayList = new ArrayList();
        for (Number number : list) {
            arrayList.add(Double.valueOf(b(number.doubleValue(), d)));
        }
        return arrayList;
    }

    public static double c(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58f8e5703f25c9674221fbc08fb7a703", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58f8e5703f25c9674221fbc08fb7a703")).doubleValue();
        }
        if (Math.abs(d2) < 1.0E-6d) {
            return d;
        }
        Double valueOf = Double.valueOf(new BigDecimal(Double.toString(d)).divide(new BigDecimal(Double.toString(d2))).doubleValue());
        if (valueOf.isInfinite()) {
            return valueOf.doubleValue() < 0.0d ? -1.7976931348623157E308d : Double.MAX_VALUE;
        }
        if (valueOf.isNaN()) {
            if (valueOf.doubleValue() < 0.0d) {
                valueOf = Double.valueOf(-4.9E-324d);
            } else {
                valueOf = Double.valueOf(Double.MIN_VALUE);
            }
        }
        return valueOf.doubleValue();
    }

    public static List<Number> c(List<Number> list, double d) {
        ArrayList arrayList = new ArrayList();
        for (Number number : list) {
            arrayList.add(Double.valueOf(c(number.doubleValue(), d)));
        }
        return arrayList;
    }

    public static List<Number> a(List<Number> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0cf2aba6e191a732915a4b599c4efea", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0cf2aba6e191a732915a4b599c4efea");
        }
        double d = 0.0d;
        for (Number number : list) {
            d += number.doubleValue();
        }
        return Collections.singletonList(Double.valueOf(d));
    }

    public static List<Number> d(double d, double d2) {
        ArrayList arrayList = new ArrayList();
        int i = (int) (d % d2);
        for (int i2 = 0; i2 < d2; i2++) {
            if (i2 == i) {
                arrayList.add(Double.valueOf(1.0d));
            } else {
                arrayList.add(Double.valueOf(0.0d));
            }
        }
        return arrayList;
    }

    public static double a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5495aea75e003e62511146914279dd27", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5495aea75e003e62511146914279dd27")).doubleValue();
        }
        if (jSONObject.has(str)) {
            return jSONObject.optDouble(str);
        }
        return 0.0d;
    }

    public static List<Number> a(List<String> list, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(Double.valueOf(a(str, jSONObject)));
        }
        return arrayList;
    }

    public static int a(Number number, List<Number> list) {
        Object[] objArr = {number, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb58ba58f9c4fa6ae113e2adf1970af2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb58ba58f9c4fa6ae113e2adf1970af2")).intValue();
        }
        for (int i = 0; i < list.size(); i++) {
            if (number.doubleValue() <= list.get(i).doubleValue()) {
                return i;
            }
        }
        return list.size();
    }

    public static List<Number> a(List<Number> list, List<Number> list2) {
        ArrayList arrayList = new ArrayList();
        for (Number number : list) {
            arrayList.add(Integer.valueOf(a(number, list2)));
        }
        return arrayList;
    }

    public static List<Number> b(List<Number> list, List<Number> list2) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            arrayList.add(Integer.valueOf(a((Number) Double.valueOf(list.get(0).doubleValue() - 0.0d), list2)));
            for (int i = 1; i < list.size(); i++) {
                arrayList.add(Integer.valueOf(a((Number) Double.valueOf(list.get(i).doubleValue() - list.get(i - 1).doubleValue()), list2)));
            }
        }
        return arrayList;
    }

    public static List<Number> a(List<Object> list, int i) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < size) {
                arrayList.add(1);
            } else {
                arrayList.add(0);
            }
        }
        return arrayList;
    }
}
