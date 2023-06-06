package com.meituan.android.common.locate.fusionlocation.featues;

import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes2.dex */
public class b {
    public static final List<Double> a = new ArrayList();
    public static final List<Double> b = new ArrayList();
    public static final HashMap<Integer, Pair<Integer, Integer>> c = new HashMap<>();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        b.add(Double.valueOf(20.5d));
        b.add(Double.valueOf(20.5d));
        b.add(Double.valueOf(20.5d));
        b.add(Double.valueOf(20.5d));
        b.add(Double.valueOf(20.5d));
        b.add(Double.valueOf(20.5d));
        b.add(Double.valueOf(300.5d));
        b.add(Double.valueOf(500.5d));
        b.add(Double.valueOf(500.0d));
        b.add(Double.valueOf(550.5d));
        b.add(Double.valueOf(1200.5d));
        b.add(Double.valueOf(1500.0d));
        b.add(Double.valueOf(1500.5d));
        b.add(Double.valueOf(1500.0d));
        b.add(Double.valueOf(1500.5d));
        b.add(Double.valueOf(1200.0d));
        b.add(Double.valueOf(1000.0d));
        b.add(Double.valueOf(825.0d));
        b.add(Double.valueOf(625.0d));
        b.add(Double.valueOf(200.0d));
        b.add(Double.valueOf(30.5d));
        b.add(Double.valueOf(20.5d));
        b.add(Double.valueOf(20.5d));
        b.add(Double.valueOf(20.5d));
        a.add(Double.valueOf(20.5d));
        a.add(Double.valueOf(20.5d));
        a.add(Double.valueOf(20.5d));
        a.add(Double.valueOf(20.5d));
        a.add(Double.valueOf(20.5d));
        a.add(Double.valueOf(20.5d));
        a.add(Double.valueOf(20.5d));
        a.add(Double.valueOf(30.5d));
        a.add(Double.valueOf(500.0d));
        a.add(Double.valueOf(550.5d));
        a.add(Double.valueOf(1200.5d));
        a.add(Double.valueOf(1500.0d));
        a.add(Double.valueOf(1500.5d));
        a.add(Double.valueOf(1500.0d));
        a.add(Double.valueOf(1500.5d));
        a.add(Double.valueOf(1000.0d));
        a.add(Double.valueOf(625.0d));
        a.add(Double.valueOf(20.5d));
        a.add(Double.valueOf(20.5d));
        a.add(Double.valueOf(20.5d));
        a.add(Double.valueOf(20.5d));
        a.add(Double.valueOf(20.5d));
        a.add(Double.valueOf(20.5d));
        a.add(Double.valueOf(20.5d));
        c.put(0, new Pair<>(0, 0));
        c.put(1, new Pair<>(6, 17));
        c.put(2, new Pair<>(6, 18));
        c.put(3, new Pair<>(6, 18));
        c.put(4, new Pair<>(5, 19));
        c.put(5, new Pair<>(4, 19));
        c.put(6, new Pair<>(4, 20));
        c.put(7, new Pair<>(4, 20));
        c.put(8, new Pair<>(4, 19));
        c.put(9, new Pair<>(5, 19));
        c.put(10, new Pair<>(5, 18));
        c.put(11, new Pair<>(6, 17));
        c.put(12, new Pair<>(6, 17));
    }

    private static int a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "416fee1cfb6f4b0ed474d126976484d9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "416fee1cfb6f4b0ed474d126976484d9")).intValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return calendar.get(11);
    }

    public static int a(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e754113d446d6e1e788c69a550812d7d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e754113d446d6e1e788c69a550812d7d")).intValue();
        }
        if (hashMap == null || hashMap.size() <= 0 || !com.meituan.android.common.locate.fusionlocation.utils.a.a(hashMap.get("isContainLightSensor"), false)) {
            return -1;
        }
        int a2 = com.meituan.android.common.locate.fusionlocation.utils.a.a(hashMap.get("lightSensorTimeHour"), -1);
        int a3 = com.meituan.android.common.locate.fusionlocation.utils.a.a(hashMap.get("lightSensorTimeMonth"), 0);
        int intValue = ((Integer) c.get(Integer.valueOf(a3)).first).intValue();
        int intValue2 = ((Integer) c.get(Integer.valueOf(a3)).second).intValue();
        if (a2 == -1) {
            return -1;
        }
        double a4 = com.meituan.android.common.locate.fusionlocation.utils.a.a(hashMap.get("lightSensorValueMean"), 0.0d);
        if (a2 <= intValue || a2 >= intValue2) {
            if (a4 < ((4 >= a3 || a3 >= 10) ? a : b).get(a2).doubleValue()) {
                return 0;
            }
        } else {
            if (a4 >= ((4 >= a3 || a3 >= 10) ? a : b).get(a2).doubleValue()) {
                return 0;
            }
        }
        return 1;
    }

    public static HashMap<String, Object> a() {
        int i;
        int i2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1cd4400adf1a0ffe1c7bda5e3e2f365c", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1cd4400adf1a0ffe1c7bda5e3e2f365c");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        double d = 0.0d;
        List<Pair<Long, Integer>> c2 = com.meituan.android.common.locate.fusionlocation.a.a().c();
        int i3 = -1;
        if (c2 == null || c2.size() == 0) {
            hashMap.put("isContainLightSensor", Boolean.FALSE);
            i = -1;
        } else {
            hashMap.put("isContainLightSensor", Boolean.TRUE);
            List arrayList = new ArrayList();
            for (Pair<Long, Integer> pair : c2) {
                arrayList.add(pair.second);
            }
            if (arrayList.size() >= 5) {
                arrayList = arrayList.subList(arrayList.size() - 5, arrayList.size());
            }
            Pair<Long, Integer> pair2 = c2.get(c2.size() - 1);
            i3 = a(((Long) pair2.first).longValue());
            int b2 = b(((Long) pair2.first).longValue());
            i = ((Integer) pair2.second).intValue();
            double a2 = com.meituan.android.common.locate.fusionlocation.utils.b.a(a(arrayList));
            i2 = b2;
            d = a2;
        }
        hashMap.put("mLastLightSensorValue", Integer.valueOf(i));
        hashMap.put("lightSensorTimeHour", Integer.valueOf(i3));
        hashMap.put("lightSensorTimeMonth", Integer.valueOf(i2));
        hashMap.put("lightSensorValueMean", Double.valueOf(d));
        return hashMap;
    }

    private static List<Double> a(List<Integer> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9bc1b2c692e6d76f7c3283b54b711ea4", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9bc1b2c692e6d76f7c3283b54b711ea4");
        }
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(Double.valueOf(list.get(i) != null ? list.get(i).doubleValue() : 0.0d));
        }
        return arrayList;
    }

    private static int b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "75a304be2c0e95dc56283fb31facbeda", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "75a304be2c0e95dc56283fb31facbeda")).intValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return calendar.get(2) + 1;
    }
}
