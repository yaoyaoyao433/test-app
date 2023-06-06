package com.sankuai.meituan.kernel.net.msi;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.SystemClock;
import com.dianping.shield.entity.ExposeAction;
import com.dianping.titans.utils.NetworkUtil;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.msi.bean.EventHandler;
import com.meituan.msi.bean.MsiContext;
import com.meituan.network.request.NetworkPerformanceEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.common.utils.NetWorkUtils;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.q;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static long b;
    private static long c;
    private static int d;
    private static long e;

    private static int a(List<q> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2df22aeb398dddd9087ced9c8868dba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2df22aeb398dddd9087ced9c8868dba")).intValue();
        }
        if (list == null || list.size() == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(list.get(i).b);
            sb.append(list.get(i).c);
        }
        return sb.toString().getBytes().length;
    }

    public static void a(MsiContext msiContext, NetworkPerformanceEvent networkPerformanceEvent, aj ajVar, Response<ap> response, long j, String str) {
        Object[] objArr = {msiContext, networkPerformanceEvent, ajVar, response, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "841653c16926483d9a2e694236340c0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "841653c16926483d9a2e694236340c0a");
            return;
        }
        b(ajVar, response, networkPerformanceEvent);
        networkPerformanceEvent.apiName = str;
        networkPerformanceEvent.value = SystemClock.elapsedRealtime() - j;
        msiContext.getEventDispatcher().a(EventHandler.EVENT_DOWNLOAD_OR_UPLOAD_PERFORMANCE_INNER, JsonHelper.toJsonString(networkPerformanceEvent));
    }

    public static NetworkPerformanceEvent a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0baa13d3de19f032fb43dc37d8d24adf", RobustBitConfig.DEFAULT_VALUE)) {
            return (NetworkPerformanceEvent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0baa13d3de19f032fb43dc37d8d24adf");
        }
        NetworkPerformanceEvent networkPerformanceEvent = new NetworkPerformanceEvent();
        networkPerformanceEvent.fullUrl = str;
        int indexOf = str.indexOf(CommonConstant.Symbol.QUESTION_MARK);
        if (indexOf <= 0) {
            indexOf = str.length();
        }
        networkPerformanceEvent.url = str.substring(0, indexOf);
        return networkPerformanceEvent;
    }

    public static Map<String, Object> b(String str) {
        int i;
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff87b48227fde168d20042fecc733b40", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff87b48227fde168d20042fecc733b40");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        try {
            Uri parse = Uri.parse(str);
            hashMap.put("urlhost", parse.getHost());
            hashMap.put("urlpath", parse.getPath());
            Context f = com.meituan.msi.a.f();
            Object[] objArr2 = {f};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c1ae45b9d76cd104d12e25f7e428ff77", RobustBitConfig.DEFAULT_VALUE)) {
                Object[] objArr3 = {f};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "18cbbdf01d7e00769c0614e7b25d7228", RobustBitConfig.DEFAULT_VALUE)) {
                    i = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "18cbbdf01d7e00769c0614e7b25d7228")).intValue();
                } else {
                    if (e == 0 || SystemClock.elapsedRealtime() - e > ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE) {
                        e = SystemClock.elapsedRealtime();
                        d = NetWorkUtils.getNetworkType("pt-9f1ef3f5277a86db", f);
                    }
                    i = d;
                }
                switch (i) {
                    case -1:
                        str2 = "none";
                        break;
                    case 0:
                        str2 = "wifi";
                        break;
                    case 1:
                        str2 = "wap";
                        break;
                    case 2:
                        str2 = "2g";
                        break;
                    case 3:
                        str2 = "3g";
                        break;
                    case 4:
                        str2 = "4g";
                        break;
                    case 5:
                        str2 = NetworkUtil.NAME_NETWORK_5G;
                        break;
                    default:
                        str2 = "unknown";
                        break;
                }
            } else {
                str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c1ae45b9d76cd104d12e25f7e428ff77");
            }
            hashMap.put("type", str2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef5fcd9a4fa4bf3f9340bd03e0019853", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef5fcd9a4fa4bf3f9340bd03e0019853")).longValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - c >= LocationStrategy.LOCATION_TIMEOUT) {
            c = elapsedRealtime;
            try {
                b = TrafficStats.getTotalRxBytes();
            } catch (RuntimeException unused) {
            }
        }
        return b;
    }

    public static void a(aj ajVar, Response<ap> response, NetworkPerformanceEvent networkPerformanceEvent) {
        Object[] objArr = {ajVar, response, networkPerformanceEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c52533f9334f6f44c5a4bcabc7652291", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c52533f9334f6f44c5a4bcabc7652291");
            return;
        }
        String str = ajVar.e;
        networkPerformanceEvent.requestSize = (ajVar.h == null ? 0L : ajVar.h.contentLength()) + str.getBytes().length + a(ajVar.g);
        networkPerformanceEvent.requestMethod = ajVar.f;
        networkPerformanceEvent.protocol = Uri.parse(str).getScheme();
        if (response == null) {
            return;
        }
        networkPerformanceEvent.responseSize = (response.e != null ? response.e.contentLength() : 0L) + a(response.g);
        networkPerformanceEvent.statusCode = response.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(com.sankuai.meituan.retrofit2.aj r11, com.sankuai.meituan.retrofit2.Response<com.sankuai.meituan.retrofit2.ap> r12, com.meituan.network.request.NetworkPerformanceEvent r13) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r11
            r8 = 1
            r0[r8] = r12
            r1 = 2
            r0[r1] = r13
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.meituan.kernel.net.msi.d.a
            java.lang.String r10 = "0a7ee9c0b5aad47051624a81cd431fcd"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            r11 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L22:
            java.lang.String r0 = r11.e
            r1 = 0
            com.sankuai.meituan.retrofit2.ak r3 = r11.h     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L2b
            goto L36
        L2b:
            com.sankuai.meituan.retrofit2.ak r3 = r11.h     // Catch: java.lang.Throwable -> L32
            long r3 = r3.contentLength()     // Catch: java.lang.Throwable -> L32
            goto L37
        L32:
            r3 = move-exception
            r3.printStackTrace()
        L36:
            r3 = r1
        L37:
            byte[] r5 = r0.getBytes()
            int r5 = r5.length
            long r5 = (long) r5
            long r3 = r3 + r5
            java.util.List<com.sankuai.meituan.retrofit2.q> r5 = r11.g
            int r5 = a(r5)
            long r5 = (long) r5
            long r3 = r3 + r5
            r13.requestSize = r3
            java.lang.String r11 = r11.f
            r13.requestMethod = r11
            android.net.Uri r11 = android.net.Uri.parse(r0)
            java.lang.String r11 = r11.getScheme()
            r13.protocol = r11
            if (r12 != 0) goto L59
            return
        L59:
            T r11 = r12.e
            if (r11 != 0) goto L5e
            goto L66
        L5e:
            T r11 = r12.e
            com.sankuai.meituan.retrofit2.ap r11 = (com.sankuai.meituan.retrofit2.ap) r11
            long r1 = r11.contentLength()
        L66:
            java.util.List<com.sankuai.meituan.retrofit2.q> r11 = r12.g
            int r11 = a(r11)
            long r3 = (long) r11
            long r1 = r1 + r3
            r13.responseSize = r1
            int r11 = r12.c
            r13.statusCode = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.kernel.net.msi.d.b(com.sankuai.meituan.retrofit2.aj, com.sankuai.meituan.retrofit2.Response, com.meituan.network.request.NetworkPerformanceEvent):void");
    }
}
