package com.meituan.android.common.aidata.ai.mlmodel.operator.producer.date;

import com.meituan.android.common.aidata.ai.mlmodel.operator.producer.common.CommonOperatorImpl;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DateOperatorImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static JSONArray date_encoder(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12) {
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(CommonOperatorImpl.min_max(year(d), d2, d3));
            jSONArray.put(CommonOperatorImpl.min_max(month(d), d4, d5));
            jSONArray.put(CommonOperatorImpl.min_max(day(d), d6, d7));
            jSONArray.put(CommonOperatorImpl.min_max(hour(d), d8, d9));
            jSONArray.put(CommonOperatorImpl.min_max(minute(d), d10, d11));
            JSONArray one_hot_encoder = CommonOperatorImpl.one_hot_encoder(weekday(d), d12);
            int length = one_hot_encoder.length();
            for (int i = 0; i < length; i++) {
                jSONArray.put(one_hot_encoder.get(i));
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public static double year(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7d468b14fc2364ccf00b101d64c39b00", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7d468b14fc2364ccf00b101d64c39b00")).doubleValue() : dateDoubleFormat(d, Constants.GestureMoveEvent.KEY_Y);
    }

    public static JSONArray year_array(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                jSONArray2.put(year(jSONArray.optDouble(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray2;
    }

    public static double month(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2208e6c0c91f22d97cf1607b52846897", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2208e6c0c91f22d97cf1607b52846897")).doubleValue() : dateDoubleFormat(d, ErrorCode.ERROR_TYPE_M);
    }

    public static JSONArray month_array(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                jSONArray2.put(month(jSONArray.optDouble(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray2;
    }

    public static double day(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b405404bac5296f7cb142c21e6cfff97", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b405404bac5296f7cb142c21e6cfff97")).doubleValue() : dateDoubleFormat(d, "d");
    }

    public static JSONArray day_array(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                jSONArray2.put(day(jSONArray.optDouble(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray2;
    }

    public static double hour(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a0d803307c48c2522d0f51c2673a7803", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a0d803307c48c2522d0f51c2673a7803")).doubleValue() : dateDoubleFormat(d, ErrorCode.ERROR_TYPE_H);
    }

    public static JSONArray hour_array(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                jSONArray2.put(hour(jSONArray.optDouble(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray2;
    }

    public static double minute(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eca98b6c73ddf23f48db54041a1b2e80", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eca98b6c73ddf23f48db54041a1b2e80")).doubleValue() : dateDoubleFormat(d, "m") + (hour(d) * 60.0d);
    }

    public static JSONArray minute_array(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                jSONArray2.put(minute(jSONArray.optDouble(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray2;
    }

    public static double second(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "82b26e98748bbce3fd8b83ff153d7d0c", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "82b26e98748bbce3fd8b83ff153d7d0c")).doubleValue() : dateDoubleFormat(d, "s") + (minute(d) * 60.0d);
    }

    private static double dateDoubleFormat(double d, String str) {
        Object[] objArr = {Double.valueOf(d), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "476680a7f7f8dc8ddd9bed991769ccc0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "476680a7f7f8dc8ddd9bed991769ccc0")).doubleValue();
        }
        try {
            return Double.parseDouble(new SimpleDateFormat(str, Locale.CHINA).format(Double.valueOf(d)));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public static JSONArray second_array(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                jSONArray2.put(second(jSONArray.optDouble(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray2;
    }

    public static double weekday(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "185c9d0087fbecc9903cb20566b226b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "185c9d0087fbecc9903cb20566b226b5")).doubleValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(Math.round(d)));
        return new double[]{6.0d, 0.0d, 1.0d, 2.0d, 3.0d, 4.0d, 5.0d}[calendar.get(7) - 1];
    }

    public static JSONArray weekday_array(JSONArray jSONArray) {
        int[] iArr = {6, 0, 1, 2, 3, 4, 5};
        Calendar calendar = Calendar.getInstance();
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            calendar.setTime(new Date(Math.round(jSONArray.optDouble(i))));
            try {
                jSONArray2.put(iArr[calendar.get(7) - 1]);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray2;
    }

    public static double past(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4a90c71f5a507023397a8a9a7db9044c", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4a90c71f5a507023397a8a9a7db9044c")).doubleValue() : new Date().getTime() - d;
    }

    public static JSONArray past_array(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        double time = new Date().getTime();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                jSONArray2.put(time - jSONArray.optDouble(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray2;
    }
}
