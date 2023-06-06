package com.meituan.android.common.locate.fusionlocation.strategy;

import android.util.Pair;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.platform.logs.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {
    private static int a = 5;
    private static List<Double> b = new LinkedList();
    private static List<Double> c = new LinkedList();
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int a(List<Pair<Long, MtLocation>> list, JSONObject jSONObject) {
        List<Pair<Long, MtLocation>> list2 = list;
        Object[] objArr = {list2, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5b6a9f4bb902696d0a2d715d89e79078", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5b6a9f4bb902696d0a2d715d89e79078")).intValue();
        }
        if (list2 != null) {
            try {
                if (list.size() >= a) {
                    if (list.size() > a) {
                        list2 = list2.subList(list.size() - a, list.size());
                    }
                    Pair<Long, MtLocation> pair = list2.get(0);
                    LinkedList linkedList = new LinkedList();
                    LinkedList linkedList2 = new LinkedList();
                    for (Pair<Long, MtLocation> pair2 : list2.subList(1, a)) {
                        double a2 = com.meituan.android.common.locate.fusionlocation.utils.b.a(((MtLocation) pair.second).getLatitude(), ((MtLocation) pair.second).getLongitude(), ((MtLocation) pair2.second).getLatitude(), ((MtLocation) pair2.second).getLongitude());
                        linkedList.add(Double.valueOf(com.meituan.android.common.locate.fusionlocation.utils.b.b(((MtLocation) pair.second).getLatitude(), ((MtLocation) pair.second).getLongitude(), ((MtLocation) pair2.second).getLatitude(), ((MtLocation) pair2.second).getLongitude())));
                        linkedList2.add(Double.valueOf(a2 / ((((Long) pair2.first).longValue() - ((Long) pair.first).longValue()) / 1000.0d)));
                        pair = pair2;
                    }
                    double b2 = com.meituan.android.common.locate.fusionlocation.utils.b.b(linkedList);
                    double a3 = com.meituan.android.common.locate.fusionlocation.utils.b.a(linkedList2);
                    jSONObject.put("angleRange", com.meituan.android.common.locate.fusionlocation.utils.a.b(Double.valueOf(b2)));
                    jSONObject.put("speedMean", com.meituan.android.common.locate.fusionlocation.utils.a.b(Double.valueOf(a3)));
                    b.add(Double.valueOf(b2));
                    c.add(Double.valueOf(a3));
                    if (b.size() >= a && c.size() >= a) {
                        List<Double> list3 = b;
                        b = list3.subList(list3.size() - a, b.size());
                        List<Double> list4 = c;
                        c = list4.subList(list4.size() - a, c.size());
                        int i = 0;
                        int i2 = 0;
                        for (int i3 = 0; i3 < a; i3++) {
                            if (b.get(i3).doubleValue() <= 20.0d && c.get(i3).doubleValue() >= 6.0d) {
                                i++;
                            }
                            if (b.get(i3).doubleValue() <= 50.0d && b.get(i3).doubleValue() >= 0.01d && c.get(i3).doubleValue() <= 3.0d) {
                                i2++;
                            }
                        }
                        if (i == a) {
                            return 1;
                        }
                        return i2 == a ? 2 : -1;
                    }
                }
            } catch (Exception e) {
                c.a("GpsStabilityDetection\n" + e.getMessage());
            }
        }
        return -1;
    }
}
