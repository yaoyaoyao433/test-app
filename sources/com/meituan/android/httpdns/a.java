package com.meituan.android.httpdns;

import com.meituan.android.httpdns.DnsRecord;
import com.meituan.android.httpdns.e;
import com.meituan.android.httpdns.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect a;
    protected r b;
    public n c;
    private w e;
    private IDnsListener f;
    protected c f_;
    private e g;

    public a(r rVar, w wVar, n nVar, c cVar, IDnsListener iDnsListener) {
        Object[] objArr = {rVar, wVar, nVar, cVar, iDnsListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbce01a2ca47fe6338baea5beb66e29a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbce01a2ca47fe6338baea5beb66e29a");
            return;
        }
        this.g = new e();
        this.b = rVar;
        this.c = nVar;
        this.e = wVar;
        this.f_ = cVar;
        this.f = iDnsListener;
    }

    /* JADX WARN: Type inference failed for: r3v15, types: [S, java.lang.Integer] */
    public final List<InetAddress> a(String str) throws UnknownHostException {
        boolean z;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0c1198ba2b53de6c5d2d30fca6f6a8d", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0c1198ba2b53de6c5d2d30fca6f6a8d");
        }
        d dVar = new d();
        dVar.k = this.c.c;
        dVar.c = h.a().d > 0;
        if (x.a(str)) {
            throw new UnknownHostException("hostname == null");
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = h.a().b.b;
        byte b = n.a() == 1 ? (byte) 1 : (byte) 0;
        boolean a2 = this.f_.a(str);
        e eVar = this.g;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "2d25a5371f4d183616d6862494e07653", 6917529027641081856L)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "2d25a5371f4d183616d6862494e07653")).booleanValue();
        } else {
            e.a<String, Integer> a3 = eVar.a(str);
            z = a3 != null && a3.b.intValue() < 3;
        }
        byte b2 = !z ? (byte) 1 : (byte) 0;
        boolean a4 = h.a().a(str);
        boolean b3 = h.a().b(str);
        boolean a5 = this.c.j.a(str);
        if (!z2 || b != 0 || !a2 || b2 != 0 || !a4 || b3 || a5) {
            dVar.d = str;
            if (z2 && b2 != 0) {
                dVar.i = "demote";
                dVar.f = 4;
            } else {
                Object[] objArr3 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(b), Byte.valueOf(a2 ? (byte) 1 : (byte) 0), Byte.valueOf(b2), Byte.valueOf(a4 ? (byte) 1 : (byte) 0), Byte.valueOf(b3 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "afe2080e4ec4a6150b1b86f89639a8f4", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "afe2080e4ec4a6150b1b86f89639a8f4");
                } else {
                    dVar.j = new HashMap();
                    if (!z2) {
                        dVar.j.put("enable", Boolean.FALSE);
                    }
                    if (b != 0) {
                        dVar.j.put("isOnlyIpv6", Boolean.TRUE);
                    }
                    if (!a2) {
                        dVar.j.put("inCustomList", Boolean.FALSE);
                    }
                    if (b2 != 0) {
                        dVar.j.put("failLimit", Boolean.TRUE);
                    }
                    if (!a4) {
                        dVar.j.put("inWhiteList", Boolean.FALSE);
                    }
                    if (b3) {
                        dVar.j.put("inBlackList", Boolean.TRUE);
                    }
                }
                dVar.f = 5;
            }
            if (a5) {
                dVar.i = "optimizeFailure";
            }
            try {
                List<InetAddress> a6 = this.e.a(str);
                r rVar = this.b;
                rVar.a("[httpdns]从localDns 得到 host 地址:" + str + " 耗时:" + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                dVar.e = a6;
                return a6;
            } finally {
            }
        }
        DnsResult a7 = this.c.a(str, dVar);
        DnsRecord dnsRecord = a7 != null ? a7.getDnsRecord() : null;
        if (dnsRecord != null) {
            List<InetAddress> a8 = a(dnsRecord);
            if (a8 != null && !a8.isEmpty()) {
                r rVar2 = this.b;
                rVar2.a("[httpdns]从httpDns 服务得到 host 地址:" + str + " 耗时:" + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                dVar.d = str;
                dVar.e = a8;
                dVar.g = System.currentTimeMillis() - currentTimeMillis;
                if (a7.getResultCode() == n.g) {
                    dVar.f = 1;
                } else if (a7.getResultCode() == n.h) {
                    dVar.f = 2;
                }
                a(dVar);
                return a8;
            }
            n nVar = this.c;
            Object[] objArr4 = {str};
            ChangeQuickRedirect changeQuickRedirect4 = n.a;
            if (PatchProxy.isSupport(objArr4, nVar, changeQuickRedirect4, false, "4843adf592cef341c9b4885a23f9e56e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr4, nVar, changeQuickRedirect4, false, "4843adf592cef341c9b4885a23f9e56e");
            } else if (nVar.b != null) {
                nVar.b.b(str);
            }
        }
        if (dnsRecord == null) {
            e eVar2 = this.g;
            Object[] objArr5 = {str, 2};
            ChangeQuickRedirect changeQuickRedirect5 = e.a;
            if (PatchProxy.isSupport(objArr5, eVar2, changeQuickRedirect5, false, "d9a76de003f9325a700048e314d0a3f2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr5, eVar2, changeQuickRedirect5, false, "d9a76de003f9325a700048e314d0a3f2");
            } else {
                e.a<String, Integer> a9 = eVar2.a(str);
                if (a9 != null) {
                    a9.b = Integer.valueOf(a9.b.intValue() + 1);
                }
            }
        }
        dVar.d = str;
        dVar.f = 3;
        try {
            List<InetAddress> a10 = this.e.a(str);
            r rVar3 = this.b;
            rVar3.a("[httpdns]从localDns 得到 host 地址:" + str + " 耗时:" + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            dVar.e = a10;
            return a10;
        } finally {
        }
    }

    private void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f04aa3a814537e84e5e2ae882c7bffd1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f04aa3a814537e84e5e2ae882c7bffd1");
            return;
        }
        d.b.set(dVar);
        if (this.f != null) {
            this.f.a(dVar);
        }
    }

    private List<InetAddress> a(DnsRecord dnsRecord) {
        int i;
        List<DnsRecord.a> optimizeMergeIpList;
        Object[] objArr = {dnsRecord};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f40174546b929a526caf19ba2ee9104a", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f40174546b929a526caf19ba2ee9104a");
        }
        if (this.c != null) {
            i = n.a();
            q qVar = this.c.j;
            Object[] objArr2 = {Integer.valueOf(i), dnsRecord};
            ChangeQuickRedirect changeQuickRedirect2 = q.a;
            List list = null;
            if (PatchProxy.isSupport(objArr2, qVar, changeQuickRedirect2, false, "c2969cc68739413a721ff837f3ea9e1e", 6917529027641081856L)) {
                list = (List) PatchProxy.accessDispatch(objArr2, qVar, changeQuickRedirect2, false, "c2969cc68739413a721ff837f3ea9e1e");
            } else {
                h.a aVar = h.a().b;
                if (aVar != null && aVar.h && (optimizeMergeIpList = dnsRecord.getOptimizeMergeIpList()) != null && optimizeMergeIpList.size() != 0) {
                    list = new ArrayList();
                    for (DnsRecord.a aVar2 : optimizeMergeIpList) {
                        if (aVar2 != null && aVar2.a() && (!aVar2.d || i != 1)) {
                            if (aVar2.d || i != 0) {
                                list.add(a(dnsRecord.getDomain(), aVar2.b, aVar2.d));
                            }
                        }
                    }
                    z.a("目标域名:", dnsRecord.getDomain(), " 正在使用ip上次优选后的ip，数量:", Integer.valueOf(list.size()), " 当前距离上次探测时间：", Long.valueOf(System.currentTimeMillis() - dnsRecord.getOptimizeHostTime()), "毫秒");
                }
            }
            if (list != null && list.size() > 0) {
                return a(list, dnsRecord.getLocalDnsCacheList());
            }
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList();
        List<String> ipv4 = dnsRecord.getIpv4();
        List<String> ipv6 = dnsRecord.getIpv6();
        if (ipv6 != null && ipv6.size() > 0 && i != 0) {
            for (String str : ipv6) {
                InetAddress a2 = a(dnsRecord.getDomain(), str, false);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        if (ipv4 != null && ipv4.size() > 0 && i != 1) {
            for (String str2 : ipv4) {
                InetAddress a3 = a(dnsRecord.getDomain(), str2, true);
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
        }
        return a(arrayList, dnsRecord.getLocalDnsCacheList());
    }

    private static List<InetAddress> a(List<InetAddress> list, List<InetAddress> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af0385a0dfb3fee097d6b0aeb58f7d27", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af0385a0dfb3fee097d6b0aeb58f7d27");
        }
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        if (list2 == null || list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList.addAll(list.subList(0, 2));
        } else {
            arrayList.addAll(list);
        }
        arrayList.addAll(list2);
        return arrayList;
    }

    public static InetAddress a(String str, String str2, boolean z) {
        byte[] b;
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e6c6f5ceb84737a78cb8239ab59cd59a", 6917529027641081856L)) {
            return (InetAddress) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e6c6f5ceb84737a78cb8239ab59cd59a");
        }
        if (x.a(str2)) {
            return null;
        }
        if (z) {
            b = p.a(str2);
        } else {
            b = p.b(str2);
        }
        if (b == null) {
            return null;
        }
        try {
            return InetAddress.getByAddress(str, b);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }
}
