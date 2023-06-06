package com.dianping.nvtunnelkit.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.LinkedHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe4b314eafd3b18d6c4c5856f1475eb3", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe4b314eafd3b18d6c4c5856f1475eb3")).longValue() : System.nanoTime() / 1000000;
    }

    public static int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "734d049ef62cadb25a7ba350c231c2f3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "734d049ef62cadb25a7ba350c231c2f3")).intValue();
        }
        if (i <= 0) {
            return 0;
        }
        if (i == 1 || i == 2) {
            return 1;
        }
        return a(i - 1) + a(i - 2);
    }

    public static String a(SocketAddress socketAddress) {
        InetAddress address;
        Object[] objArr = {socketAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61e0dc020fac4ebc95c10a0699a3fc76", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61e0dc020fac4ebc95c10a0699a3fc76") : (!(socketAddress instanceof InetSocketAddress) || (address = ((InetSocketAddress) socketAddress).getAddress()) == null) ? "" : address.getHostAddress();
    }

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f26bfd17d9f538c57f4b802c6a33817f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f26bfd17d9f538c57f4b802c6a33817f")).intValue();
        }
        if (f.a(str)) {
            return 1000;
        }
        long j = 0;
        for (int i = 0; i < str.length(); i++) {
            j = (j * 131) + str.charAt(i);
        }
        return (int) (j & 2147483647L);
    }

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7541cbf3a66ce10ce924565bbd73aaa6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7541cbf3a66ce10ce924565bbd73aaa6");
        }
        if (f.a(str)) {
            return "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("f", "ab");
        linkedHashMap.put("d", str2);
        return new JSONObject(linkedHashMap).toString();
    }
}
