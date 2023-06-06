package com.meituan.android.common.statistics.gesture;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GestureUtils {
    private static final int INIT_VALUE = -1;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static int seq = -1;

    public static synchronized int getSeq() {
        int i;
        synchronized (GestureUtils.class) {
            if (seq < Integer.MAX_VALUE) {
                seq++;
            } else {
                seq = 0;
            }
            i = seq;
        }
        return i;
    }

    public static synchronized void reset() {
        synchronized (GestureUtils.class) {
            seq = -1;
        }
    }

    public static List<GestureMoveEvent> DouglasPeucker(List<GestureMoveEvent> list, int i) {
        int i2;
        int i3 = 1;
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ca64a94d755f626089650896f6e6aa18", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ca64a94d755f626089650896f6e6aa18");
        }
        double d = 0.0d;
        int size = list.size();
        int i4 = 0;
        while (true) {
            i2 = size - 1;
            if (i3 >= i2) {
                break;
            }
            double H = H(list.get(i3), list.get(0), list.get(i2));
            if (H > d) {
                d = H;
                i4 = i3;
            }
            i3++;
        }
        ArrayList arrayList = new ArrayList();
        if (d > i) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i5 = 0; i5 < size; i5++) {
                if (i5 < i4) {
                    arrayList2.add(list.get(i5));
                } else {
                    arrayList3.add(list.get(i5));
                }
            }
            new ArrayList();
            new ArrayList();
            List<GestureMoveEvent> DouglasPeucker = DouglasPeucker(arrayList2, i);
            List<GestureMoveEvent> DouglasPeucker2 = DouglasPeucker(arrayList3, i);
            DouglasPeucker2.remove(0);
            DouglasPeucker.addAll(DouglasPeucker2);
            return DouglasPeucker;
        }
        arrayList.add(list.get(0));
        arrayList.add(list.get(i2));
        return arrayList;
    }

    private static double H(GestureMoveEvent gestureMoveEvent, GestureMoveEvent gestureMoveEvent2, GestureMoveEvent gestureMoveEvent3) {
        Object[] objArr = {gestureMoveEvent, gestureMoveEvent2, gestureMoveEvent3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2463a70dde6a2579394573cf1fbbb42f", 6917529027641081856L)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2463a70dde6a2579394573cf1fbbb42f")).doubleValue();
        }
        double distance = distance(gestureMoveEvent2, gestureMoveEvent3);
        return (helen(distance(gestureMoveEvent, gestureMoveEvent2), distance(gestureMoveEvent, gestureMoveEvent3), distance) * 2.0d) / distance;
    }

    private static double distance(GestureMoveEvent gestureMoveEvent, GestureMoveEvent gestureMoveEvent2) {
        Object[] objArr = {gestureMoveEvent, gestureMoveEvent2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "30824d6918b3cf3e620f24a758f7fa04", 6917529027641081856L)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "30824d6918b3cf3e620f24a758f7fa04")).doubleValue();
        }
        double d = gestureMoveEvent.x - gestureMoveEvent2.x;
        double d2 = gestureMoveEvent.y - gestureMoveEvent2.y;
        return Math.sqrt((d * d) + (d2 * d2));
    }

    private static double helen(double d, double d2, double d3) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "208f77642bb168999bb2618d9877c5b2", 6917529027641081856L)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "208f77642bb168999bb2618d9877c5b2")).doubleValue();
        }
        double d4 = ((d + d2) + d3) / 2.0d;
        return Math.sqrt((d4 - d) * d4 * (d4 - d2) * (d4 - d3));
    }
}
