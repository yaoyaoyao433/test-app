package com.dianping.networklog.a;

import android.support.annotation.VisibleForTesting;
import com.meituan.android.common.metricx.koom.KoomDebugger;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dianping.com.nvlinker.NVLinker;
import dianping.com.nvlinker.stub.IMonitorService;
import java.util.Map;
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;

    @VisibleForTesting
    private static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f12085629bb2773b6e2902e99b953d3", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f12085629bb2773b6e2902e99b953d3");
        }
        if (i != 20) {
            switch (i) {
                case 1:
                    return "logan";
                case 2:
                    return "judas";
                case 3:
                    return "code";
                case 4:
                    return TrafficRecord.Detail.TUNNEL_SHARK;
                case 5:
                    return "cat";
                case 6:
                    return "push";
                case 7:
                    return KoomDebugger.CRASH;
                case 8:
                    return "lingxi";
                case 9:
                    return "fatCat";
                case 10:
                    return "TA";
                case 11:
                    return "sharkPush";
                case 12:
                    return "Luban";
                default:
                    switch (i) {
                        case 23:
                            return "event";
                        case 24:
                            return "transaction";
                        default:
                            switch (i) {
                                case 26:
                                    return "userInteraction";
                                case 27:
                                    return "MIDAS";
                                case 28:
                                    return "BBox";
                                case 29:
                                    return "Overwatch";
                                default:
                                    return "";
                            }
                    }
            }
        }
        return "DXSDK";
    }

    public static void a(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0adb6a0414bc9680fa9eee1a22f20075", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0adb6a0414bc9680fa9eee1a22f20075");
            return;
        }
        IMonitorService monitor = NVLinker.getMonitor();
        if (monitor == null) {
            return;
        }
        monitor.pv4(0L, str, 0, 0, i2, i, 0, 0, "", "", 100);
    }

    public static void a(Map<Integer, Integer> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "236aaebb953d9784163638ef147e36d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "236aaebb953d9784163638ef147e36d9");
        } else {
            a(map, "logan/v2/type/%s/count");
        }
    }

    private static void a(Map<Integer, Integer> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b58318998875e84c04e7f4c5ec66921", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b58318998875e84c04e7f4c5ec66921");
            return;
        }
        IMonitorService monitor = NVLinker.getMonitor();
        if (monitor == null || map == null) {
            return;
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (key != null && value != null) {
                monitor.pv4(0L, String.format(str, a(key.intValue())), 0, 0, 0, value.intValue(), 0, 0, "", "", 100);
            }
        }
    }

    public static void b(Map<Integer, Integer> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e6fd0993c92394474a7bfff94b034e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e6fd0993c92394474a7bfff94b034e7");
        } else {
            a(map, "logan/v2/type/%s/size");
        }
    }
}
