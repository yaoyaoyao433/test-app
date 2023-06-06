package com.sankuai.meituan.common.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static a b;
    private Map<String, String> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77920385fe673eaff774db61c7cddfec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77920385fe673eaff774db61c7cddfec");
        } else {
            this.c = new ConcurrentHashMap();
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac58e3eba1a9c74f0f32a9c53dbb41c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac58e3eba1a9c74f0f32a9c53dbb41c2");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    private static boolean a(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4351a191f55bc8dd35b80548754cbd4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4351a191f55bc8dd35b80548754cbd4")).booleanValue() : charSequence == null || charSequence.length() == 0;
    }

    public final void a(SocketAddress socketAddress) {
        Object[] objArr = {socketAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc113b394224b1859a547a15fe622c03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc113b394224b1859a547a15fe622c03");
        } else if (socketAddress instanceof InetSocketAddress) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
            if (inetSocketAddress.getAddress() != null) {
                String hostName = inetSocketAddress.getHostName();
                String hostAddress = inetSocketAddress.getAddress().getHostAddress();
                Object[] objArr2 = {hostName, hostAddress};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d2f90a6b1bfdc4f82df46d0a284722d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d2f90a6b1bfdc4f82df46d0a284722d");
                } else if (a((CharSequence) hostName) || a((CharSequence) hostAddress)) {
                } else {
                    this.c.put(hostName, hostAddress);
                }
            }
        }
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0537454bec13d1b9feeff706c4e3cde5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0537454bec13d1b9feeff706c4e3cde5");
        }
        if (a((CharSequence) str) || !this.c.containsKey(str)) {
            return null;
        }
        return this.c.get(str);
    }

    public static List<String> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a92efaff8a7610b7a6d049d7eef74f92", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a92efaff8a7610b7a6d049d7eef74f92");
        }
        if (a((CharSequence) str)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (InetAddress inetAddress : InetAddress.getAllByName(str)) {
                String hostAddress = inetAddress.getHostAddress();
                if (!a((CharSequence) hostAddress)) {
                    arrayList.add(hostAddress);
                }
            }
            return arrayList;
        } catch (UnknownHostException unused) {
            return null;
        }
    }
}
