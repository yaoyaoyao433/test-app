package com.meituan.android.common.aidata.ai.mlmodel.operator.producer.common;

import com.meituan.android.common.aidata.ai.mlmodel.operator.util.OperatorParamUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CommonOperatorImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static double min_max(double d, double d2, double d3) {
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

    public static JSONArray min_max_array(JSONArray jSONArray, double d, double d2) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                jSONArray2.put(min_max(jSONArray.optDouble(i), d, d2));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray2;
    }

    public static double standard_scaler(double d, double d2, double d3) {
        return Math.abs(d3) < 1.0E-6d ? d : (d - d2) / d3;
    }

    public static JSONArray standard_scaler_array(JSONArray jSONArray, double d, double d2) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                jSONArray2.put(standard_scaler(jSONArray.optDouble(i), d, d2));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray2;
    }

    public static Object na_filler(Object obj, Object obj2) {
        return (obj == null || (OperatorParamUtil.isInstanceOf(obj, String.class) && "".equals(obj)) || (OperatorParamUtil.isInstanceOf(obj, List.class) && ((List) obj).isEmpty())) ? obj2 : obj;
    }

    public static double add(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c0f5c09f14ec8acb01e2be620436f527", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c0f5c09f14ec8acb01e2be620436f527")).doubleValue();
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

    public static JSONArray add_array(JSONArray jSONArray, double d) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                jSONArray2.put(add(jSONArray.optDouble(i), d));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray2;
    }

    public static double multiply(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3daceb91794f61e792cc63f208a12fbd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3daceb91794f61e792cc63f208a12fbd")).doubleValue();
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

    public static JSONArray multiply_array(JSONArray jSONArray, double d) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                jSONArray2.put(multiply(jSONArray.optDouble(i), d));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray2;
    }

    public static double divide(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "24b84f79839d309c2864e8a1d1507ba8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "24b84f79839d309c2864e8a1d1507ba8")).doubleValue();
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

    public static JSONArray divide_array(JSONArray jSONArray, double d) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                jSONArray2.put(divide(jSONArray.optDouble(i), d));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray2;
    }

    public static JSONArray one_hot_encoder(double d, double d2) {
        JSONArray jSONArray = new JSONArray();
        int i = (int) (d % d2);
        for (int i2 = 0; i2 < d2; i2++) {
            if (i2 == i) {
                try {
                    jSONArray.put(1.0d);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    jSONArray.put(0.0d);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return jSONArray;
    }

    public static double map(String str, Map<String, Number> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1a67cefc44fb9dfe6452d43268bdb278", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1a67cefc44fb9dfe6452d43268bdb278")).doubleValue();
        }
        if (map.containsKey(str)) {
            return map.get(str).doubleValue();
        }
        return Double.MIN_VALUE;
    }

    public static JSONArray map_array(JSONArray jSONArray, Map<String, Number> map) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                jSONArray2.put(map(jSONArray.optString(i), map));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray2;
    }

    public static int discretize(Number number, List<Number> list) {
        Object[] objArr = {number, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9695b9de4ec581e7ffff03a6d1a8d856", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9695b9de4ec581e7ffff03a6d1a8d856")).intValue();
        }
        for (int i = 0; i < list.size(); i++) {
            if (number.doubleValue() <= list.get(i).doubleValue()) {
                return i;
            }
        }
        return list.size();
    }

    public static JSONArray discretize_array(JSONArray jSONArray, List<Number> list) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            jSONArray2.put(discretize(Double.valueOf(jSONArray.optDouble(i)), list));
        }
        return jSONArray2;
    }

    public static JSONArray discretize_custom_array(JSONArray jSONArray, List<Number> list) {
        JSONArray jSONArray2 = new JSONArray();
        if (jSONArray.length() > 0) {
            jSONArray2.put(discretize(Double.valueOf(jSONArray.optDouble(0) - 0.0d), list));
            int length = jSONArray.length();
            for (int i = 1; i < length; i++) {
                jSONArray2.put(discretize(Double.valueOf(jSONArray.optDouble(i) - jSONArray.optDouble(i - 1)), list));
            }
        }
        return jSONArray2;
    }

    public static JSONArray mask_array(JSONArray jSONArray, int i) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < length) {
                jSONArray2.put(1);
            } else {
                jSONArray2.put(0);
            }
        }
        return jSONArray2;
    }
}
