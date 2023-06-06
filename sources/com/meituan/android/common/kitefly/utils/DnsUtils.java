package com.meituan.android.common.kitefly.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DnsUtils {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static Map<String, Boolean> map = new ConcurrentHashMap();

    public static boolean isHostNameEnable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "295128401987bb4e7222a555d0d41856", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "295128401987bb4e7222a555d0d41856")).booleanValue();
        }
        try {
            return InetAddress.getAllByName(str).length > 0;
        } catch (UnknownHostException unused) {
            return false;
        }
    }

    public static String getHostNameWithDnsCheck(String str, String str2) {
        boolean z = true;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2d66d31c1904be20337118f12c70a2cd", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2d66d31c1904be20337118f12c70a2cd");
        }
        if (!map.containsKey(str)) {
            z = isHostNameEnable(str);
            if (z) {
                map.put(str, Boolean.valueOf(z));
            } else if (isHostNameEnable(str2)) {
                z = isHostNameEnable(str);
            }
        }
        return z ? str : str2;
    }
}
