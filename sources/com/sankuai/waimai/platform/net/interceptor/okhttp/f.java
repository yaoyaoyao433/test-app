package com.sankuai.waimai.platform.net.interceptor.okhttp;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static f b;
    private Map<String, String> c;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94dbb9dd3d805e46103d2787640d37ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94dbb9dd3d805e46103d2787640d37ed");
        } else {
            this.c = new ConcurrentHashMap();
        }
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44f848cf6f0dac9c361932cc02c828df", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44f848cf6f0dac9c361932cc02c828df");
        }
        if (b == null) {
            synchronized (f.class) {
                if (b == null) {
                    b = new f();
                }
            }
        }
        return b;
    }

    public final void a(SocketAddress socketAddress) {
        Object[] objArr = {socketAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3ec4c464b0cc59b1cb688a2727d6f47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3ec4c464b0cc59b1cb688a2727d6f47");
        } else if (socketAddress instanceof InetSocketAddress) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
            if (inetSocketAddress.getAddress() != null) {
                String hostName = inetSocketAddress.getHostName();
                String hostAddress = inetSocketAddress.getAddress().getHostAddress();
                Object[] objArr2 = {hostName, hostAddress};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ada45f87599919e03616eb2a7a65bfd8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ada45f87599919e03616eb2a7a65bfd8");
                } else if (TextUtils.isEmpty(hostName) || TextUtils.isEmpty(hostAddress)) {
                } else {
                    this.c.put(hostName, hostAddress);
                }
            }
        }
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ca24626974e8117dc676bd59777232b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ca24626974e8117dc676bd59777232b");
        }
        if (TextUtils.isEmpty(str) || !this.c.containsKey(str)) {
            return null;
        }
        return this.c.get(str);
    }
}
