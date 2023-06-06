package com.sankuai.xm.base.util.net;

import android.text.TextUtils;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static List<String> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d2f2e5e5a76f23f3b89be2e318abdd8", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d2f2e5e5a76f23f3b89be2e318abdd8");
        }
        a aVar = new a(str);
        Thread a2 = com.sankuai.xm.threadpool.scheduler.a.b().a("net_get_host", aVar);
        a2.start();
        try {
            a2.join(MetricsAnrManager.ANR_THRESHOLD);
        } catch (InterruptedException e) {
            com.sankuai.xm.log.c.d("NetUtils", "getAllByHostName, exception=" + e.getMessage(), new Object[0]);
        }
        InetAddress[] a3 = aVar.a();
        if (a3 != null && a3.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (InetAddress inetAddress : a3) {
                arrayList.add(inetAddress.getHostAddress());
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a95d622eb636781aa9c381fa39dad0e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a95d622eb636781aa9c381fa39dad0e")).booleanValue();
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                Iterator it = Collections.list(networkInterfaces).iterator();
                while (it.hasNext()) {
                    NetworkInterface networkInterface = (NetworkInterface) it.next();
                    if (networkInterface.isUp() && networkInterface.getInterfaceAddresses().size() != 0) {
                        com.sankuai.xm.log.c.b("NetUtils", "isVpnUsed() NetworkInterface Name: " + networkInterface.getName(), new Object[0]);
                        if ("tun0".equals(networkInterface.getName()) || "ppp0".equals(networkInterface.getName())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.sankuai.xm.log.c.d("NetUtils", "NetUtils::isVpnUsed error:" + th.getMessage(), new Object[0]);
        }
        return false;
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "693d1cd32a76d600bf930d4ec74c1d0c", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "693d1cd32a76d600bf930d4ec74c1d0c");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new URL(str).getHost();
        } catch (Exception e) {
            com.sankuai.xm.log.c.d("NetUtils", "NetUtils::getRootDomainByUrl error url:" + str + StringUtil.SPACE + e.getMessage(), new Object[0]);
            return "";
        }
    }
}
