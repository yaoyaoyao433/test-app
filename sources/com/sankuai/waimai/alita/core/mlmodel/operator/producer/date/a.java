package com.sankuai.waimai.alita.core.mlmodel.operator.producer.date;

import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static String b = "AlitaDateOperatorImpl";

    public static List<Number> a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.a(a(d), d2, d3)));
        arrayList.add(Double.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.a(b(d), d4, d5)));
        arrayList.add(Double.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.a(c(d), d6, d7)));
        arrayList.add(Double.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.a(d(d), d8, d9)));
        arrayList.add(Double.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.a(e(d), d10, d11)));
        List<Number> d13 = com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.d(g(d), d12);
        for (int i = 0; i < d13.size(); i++) {
            arrayList.add(d13.get(i));
        }
        return arrayList;
    }

    public static double a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2102f679ec83f146601f9b7a0830e64d", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2102f679ec83f146601f9b7a0830e64d")).doubleValue() : a(d, Constants.GestureMoveEvent.KEY_Y);
    }

    public static List<Number> a(List<Number> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(Double.valueOf(a(list.get(i).doubleValue())));
        }
        return arrayList;
    }

    public static double b(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "340bc9baba9feb97bbf03752eb5cb230", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "340bc9baba9feb97bbf03752eb5cb230")).doubleValue() : a(d, ErrorCode.ERROR_TYPE_M);
    }

    public static List<Number> b(List<Number> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(Double.valueOf(b(list.get(i).doubleValue())));
        }
        return arrayList;
    }

    public static double c(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97d37f665cbdfc1da1f0936c0591db2a", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97d37f665cbdfc1da1f0936c0591db2a")).doubleValue() : a(d, "d");
    }

    public static List<Number> c(List<Number> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(Double.valueOf(c(list.get(i).doubleValue())));
        }
        return arrayList;
    }

    public static double d(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "166eeecc50e06b9b30eef473e5add1bc", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "166eeecc50e06b9b30eef473e5add1bc")).doubleValue() : a(d, ErrorCode.ERROR_TYPE_H);
    }

    public static List<Number> d(List<Number> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(Double.valueOf(d(list.get(i).doubleValue())));
        }
        return arrayList;
    }

    public static double e(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77acc4c832e0e140f048b2cb1c049ccf", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77acc4c832e0e140f048b2cb1c049ccf")).doubleValue() : a(d, "m") + (d(d) * 60.0d);
    }

    public static List<Number> e(List<Number> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(Double.valueOf(e(list.get(i).doubleValue())));
        }
        return arrayList;
    }

    public static double f(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8cd1e6c99dfb5c18af925e04db245da", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8cd1e6c99dfb5c18af925e04db245da")).doubleValue() : a(d, "s") + (e(d) * 60.0d);
    }

    private static double a(double d, String str) {
        Object[] objArr = {Double.valueOf(d), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75941655c06214ef8e317062d159d069", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75941655c06214ef8e317062d159d069")).doubleValue();
        }
        try {
            return Double.parseDouble(new SimpleDateFormat(str, Locale.CHINA).format(Double.valueOf(d)));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public static List<Number> f(List<Number> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(Double.valueOf(f(list.get(i).doubleValue())));
        }
        return arrayList;
    }

    public static double g(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa1e332248cf407ca23fbe90f6b2dfbe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa1e332248cf407ca23fbe90f6b2dfbe")).doubleValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(Math.round(d)));
        return new double[]{6.0d, 0.0d, 1.0d, 2.0d, 3.0d, 4.0d, 5.0d}[calendar.get(7) - 1];
    }

    public static List<Number> g(List<Number> list) {
        int[] iArr = {6, 0, 1, 2, 3, 4, 5};
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            calendar.setTime(new Date(Math.round(list.get(i).doubleValue())));
            arrayList.add(Double.valueOf(iArr[calendar.get(7) - 1]));
        }
        return arrayList;
    }

    public static double h(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38c9f01be09580f62a1862b127659cef", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38c9f01be09580f62a1862b127659cef")).doubleValue() : new Date().getTime() - d;
    }

    public static List<Number> h(List<Number> list) {
        ArrayList arrayList = new ArrayList();
        double time = new Date().getTime();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(Double.valueOf(time - list.get(i).doubleValue()));
        }
        return arrayList;
    }
}
