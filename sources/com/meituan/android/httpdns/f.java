package com.meituan.android.httpdns;

import com.meituan.android.httpdns.DnsRecord;
import com.meituan.android.httpdns.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static final Map<String, DnsRecord> b = new ConcurrentHashMap();
    private static final Map<String, Boolean> c = new ConcurrentHashMap();
    private n d;

    public final synchronized void a(String str, DnsRecord dnsRecord, final DnsRecord dnsRecord2) {
        List<String> ipv6;
        Object[] objArr = {str, dnsRecord, dnsRecord2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9293962f27e7aa0548a78e2efc654fad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9293962f27e7aa0548a78e2efc654fad");
            return;
        }
        b.put(str, dnsRecord2);
        final q qVar = this.d.j;
        String domain = dnsRecord2.getDomain();
        Object[] objArr2 = {domain, dnsRecord, dnsRecord2};
        ChangeQuickRedirect changeQuickRedirect2 = q.a;
        if (PatchProxy.isSupport(objArr2, qVar, changeQuickRedirect2, false, "8e5a08ebec22a1e5c3152674eba367d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, qVar, changeQuickRedirect2, false, "8e5a08ebec22a1e5c3152674eba367d5");
        } else if (qVar.a(domain)) {
            z.a("目标域名:", domain, " 处于失败期间，禁止优选");
            qVar.b = 1;
        } else {
            qVar.d = h.a().b;
            if (qVar.d != null && qVar.d.h) {
                if (!z.a(domain, qVar.d.i)) {
                    z.a("目标域名:", domain, " 未命中白名单");
                    qVar.b = 3;
                    return;
                }
                if (dnsRecord2 != null) {
                    if (dnsRecord != null) {
                        dnsRecord2.setOptimizeHostTime(dnsRecord.getOptimizeHostTime());
                        boolean a2 = qVar.a(dnsRecord.getIpv4(), dnsRecord2.getIpv4());
                        boolean a3 = qVar.a(dnsRecord.getIpv6(), dnsRecord2.getIpv6());
                        int b2 = n.b();
                        boolean z = (a2 && b2 != 1) || (a3 && b2 != 0);
                        long currentTimeMillis = dnsRecord.getOptimizeHostTime() > 0 ? System.currentTimeMillis() - dnsRecord.getOptimizeHostTime() : 0L;
                        if (z && currentTimeMillis > 0 && currentTimeMillis < q.c) {
                            z.a("目标域名：", domain, " 上次优选没过期，不进行优选，距离上次探测时间：", Long.valueOf(currentTimeMillis));
                            qVar.b = 4;
                            return;
                        }
                    }
                    Object[] objArr3 = {dnsRecord2};
                    ChangeQuickRedirect changeQuickRedirect3 = q.a;
                    if (PatchProxy.isSupport(objArr3, qVar, changeQuickRedirect3, false, "9e5b10b0bb0893f410baf9d59c88402b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, qVar, changeQuickRedirect3, false, "9e5b10b0bb0893f410baf9d59c88402b");
                        return;
                    } else if (dnsRecord2 != null) {
                        int b3 = n.b();
                        final boolean z2 = h.a().b.a;
                        final ArrayList arrayList = new ArrayList();
                        List<String> ipv4 = dnsRecord2.getIpv4();
                        if (b3 != 1 && ipv4 != null) {
                            int a4 = q.a(ipv4.size());
                            for (int i = 0; i < ipv4.size() && i < a4; i++) {
                                arrayList.add(new DnsRecord.a(ipv4.get(i), true));
                            }
                            z.a("目标域名:", dnsRecord2.getDomain(), " 根据环境确定 ipv4List.size:", Integer.valueOf(ipv4.size()));
                        }
                        if (b3 != 0 && (ipv6 = dnsRecord2.getIpv6()) != null) {
                            int a5 = q.a(ipv6.size());
                            for (int i2 = 0; i2 < ipv6.size() && i2 < a5; i2++) {
                                arrayList.add(new DnsRecord.a(ipv6.get(i2), false));
                            }
                            z.a("目标域名:", dnsRecord2.getDomain(), " 根据环境确定 ipv6List.size:", Integer.valueOf(ipv6.size()));
                        }
                        z.a("目标域名:", dnsRecord2.getDomain(), " 正在异步批量探测ip...数量：", Integer.valueOf(arrayList.size()));
                        if (arrayList.size() == 0) {
                            qVar.b = 5;
                            return;
                        } else {
                            dnsRecord2.setOptimizeHostTime(System.currentTimeMillis());
                            qVar.a(arrayList, new q.a() { // from class: com.meituan.android.httpdns.q.1
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.android.httpdns.q.a
                                public final void a(List<DnsRecord.a> list) {
                                    Object[] objArr4 = {list};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2bea6327c29f1261f409064c3115c018", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2bea6327c29f1261f409064c3115c018");
                                        return;
                                    }
                                    z.a("目标域名:", dnsRecord2.getDomain(), " ip探测完成,总数量：", Integer.valueOf(list.size()), " 耗时：", Long.valueOf(System.currentTimeMillis() - dnsRecord2.getOptimizeHostTime()));
                                    long j = qVar.d.l * 1000.0f;
                                    Iterator<DnsRecord.a> it = list.iterator();
                                    while (it.hasNext()) {
                                        DnsRecord.a next = it.next();
                                        if (next != null && next.a()) {
                                            if (!next.d && z2) {
                                                next.c += j;
                                            }
                                        } else {
                                            it.remove();
                                            Object[] objArr5 = new Object[4];
                                            objArr5[0] = "目标域名:";
                                            objArr5[1] = dnsRecord2.getDomain();
                                            objArr5[2] = " ip去无效ip，";
                                            objArr5[3] = next != null ? next.b : StringUtil.NULL;
                                            z.a(objArr5);
                                        }
                                    }
                                    Collections.sort(list, new Comparator<DnsRecord.a>() { // from class: com.meituan.android.httpdns.q.1.1
                                        public static ChangeQuickRedirect a;

                                        {
                                            AnonymousClass1.this = this;
                                        }

                                        @Override // java.util.Comparator
                                        public final /* synthetic */ int compare(DnsRecord.a aVar, DnsRecord.a aVar2) {
                                            DnsRecord.a aVar3 = aVar;
                                            DnsRecord.a aVar4 = aVar2;
                                            Object[] objArr6 = {aVar3, aVar4};
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            return PatchProxy.isSupport(objArr6, this, changeQuickRedirect5, false, "4787c7fa0e1d813cc34bc779770bb85a", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect5, false, "4787c7fa0e1d813cc34bc779770bb85a")).intValue() : (int) (aVar3.c - aVar4.c);
                                        }
                                    });
                                    dnsRecord2.setOptimizeMergeIpList(list);
                                    if (list.isEmpty()) {
                                        qVar.e.put(dnsRecord2.getDomain(), Long.valueOf(System.currentTimeMillis()));
                                    }
                                    qVar.b = 6;
                                    z.a("目标域名:", dnsRecord2.getDomain(), " 对探测后的ip，去除无效的ip并排序：", arrayList);
                                }
                            });
                        }
                    }
                }
                return;
            }
            z.a("目标域名:", domain, " 开关关闭");
            qVar.b = 2;
        }
    }

    public final synchronized void a(n nVar) {
        this.d = nVar;
    }

    public final synchronized DnsRecord a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f788c5cee35dfae6c8e9b269e931baf9", 6917529027641081856L)) {
            return (DnsRecord) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f788c5cee35dfae6c8e9b269e931baf9");
        }
        return b.get(str);
    }

    public final synchronized DnsRecord a(final String str, d dVar) {
        boolean z = false;
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a717626e377ccfef023d2f5be56d794a", 6917529027641081856L)) {
            return (DnsRecord) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a717626e377ccfef023d2f5be56d794a");
        } else if (b.get(str) == null) {
            d.b(dVar, "-0");
            return null;
        } else {
            long c2 = c(str);
            StringBuilder sb = new StringBuilder();
            sb.append(c2 / 1000);
            d.b(dVar, sb.toString());
            DnsRecord dnsRecord = b.get(str);
            if (dnsRecord == null) {
                return null;
            }
            Object[] objArr2 = {str, dnsRecord};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a3732afe8fdc418f54236a036025297", 6917529027641081856L)) {
                ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a3732afe8fdc418f54236a036025297")).booleanValue();
            } else if (!x.a(str) && dnsRecord != null && this.d != null) {
                long expireTime = dnsRecord.getExpireTime() - System.currentTimeMillis();
                long ttl = ((float) (dnsRecord.getTtl() * 1000)) * 0.25f;
                if (expireTime > 0 && expireTime <= ttl) {
                    z = true;
                }
                this.d.a("[tryPrefetch] 是否需要预取=" + z + StringUtil.SPACE + str + " remainTime:" + expireTime + ",prefetchTtlTime:" + ttl);
                if (z) {
                    if (c.containsKey(str)) {
                        this.d.a("[tryPrefetch] " + str + " 此域名已经在请求中 remainTime:" + expireTime + ",prefetchTtlTime:" + ttl);
                    } else {
                        c.put(str, Boolean.TRUE);
                        z.a(new Runnable() { // from class: com.meituan.android.httpdns.f.1
                            public static ChangeQuickRedirect a;

                            /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void run() {
                                /*
                                    r17 = this;
                                    r7 = r17
                                    r8 = 0
                                    java.lang.Object[] r9 = new java.lang.Object[r8]
                                    com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.httpdns.f.AnonymousClass1.a
                                    java.lang.String r11 = "e5d66966ba3d00040a4123ab7ad21244"
                                    r3 = 0
                                    r5 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
                                    r0 = r9
                                    r1 = r17
                                    r2 = r10
                                    r4 = r11
                                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
                                    if (r0 == 0) goto L1b
                                    com.meituan.robust.PatchProxy.accessDispatch(r9, r7, r10, r8, r11)
                                    return
                                L1b:
                                    com.meituan.android.httpdns.f r0 = com.meituan.android.httpdns.f.this
                                    com.meituan.android.httpdns.n r0 = com.meituan.android.httpdns.f.a(r0)
                                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                    java.lang.String r2 = "[tryPrefetch] 正在httpDns预取："
                                    r1.<init>(r2)
                                    java.lang.String r2 = r2
                                    r1.append(r2)
                                    java.lang.String r1 = r1.toString()
                                    r0.a(r1)
                                    com.meituan.android.httpdns.f r0 = com.meituan.android.httpdns.f.this
                                    com.meituan.android.httpdns.n r1 = com.meituan.android.httpdns.f.a(r0)
                                    java.lang.String r2 = r2
                                    r3 = 0
                                    com.meituan.android.httpdns.f r0 = com.meituan.android.httpdns.f.this
                                    com.meituan.android.httpdns.n r0 = com.meituan.android.httpdns.f.a(r0)
                                    java.lang.Object[] r5 = new java.lang.Object[r8]
                                    com.meituan.robust.ChangeQuickRedirect r6 = com.meituan.android.httpdns.n.a
                                    java.lang.String r14 = "f6971446a454e0c4ebfcf0df297ed4cc"
                                    r12 = 0
                                    r15 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
                                    r9 = r5
                                    r10 = r0
                                    r11 = r6
                                    r13 = r14
                                    r4 = r14
                                    r14 = r15
                                    boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14)
                                    if (r9 == 0) goto L64
                                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r5, r0, r6, r8, r4)
                                    java.lang.Integer r0 = (java.lang.Integer) r0
                                    int r0 = r0.intValue()
                                L62:
                                    r5 = r0
                                    goto L75
                                L64:
                                    com.meituan.android.httpdns.h r0 = com.meituan.android.httpdns.h.a()
                                    com.meituan.android.httpdns.h$a r0 = r0.b
                                    int r0 = r0.g
                                    int r0 = r0 * 1000
                                    if (r0 <= 0) goto L71
                                    goto L62
                                L71:
                                    r0 = 10000(0x2710, float:1.4013E-41)
                                    r5 = 10000(0x2710, float:1.4013E-41)
                                L75:
                                    r6 = 0
                                    r0 = 0
                                    r4 = r0
                                    com.meituan.android.httpdns.DnsRecord r0 = r1.a(r2, r3, r4, r5, r6)
                                    if (r0 == 0) goto L8d
                                    com.meituan.android.httpdns.f r1 = com.meituan.android.httpdns.f.this
                                    java.lang.String r2 = r2
                                    com.meituan.android.httpdns.DnsRecord r1 = r1.a(r2)
                                    com.meituan.android.httpdns.f r2 = com.meituan.android.httpdns.f.this
                                    java.lang.String r3 = r2
                                    r2.a(r3, r1, r0)
                                L8d:
                                    java.util.Map r0 = com.meituan.android.httpdns.f.b()
                                    java.lang.String r1 = r2
                                    r0.remove(r1)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.httpdns.f.AnonymousClass1.run():void");
                            }
                        });
                    }
                }
            }
            return dnsRecord;
        }
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27c7e8266e24a21c0401ed80d82a44c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27c7e8266e24a21c0401ed80d82a44c5");
        } else {
            b.clear();
        }
    }

    private synchronized long c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8209fa8545aff6972c18d9c87b7f316b", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8209fa8545aff6972c18d9c87b7f316b")).longValue();
        }
        DnsRecord dnsRecord = b.get(str);
        if (dnsRecord == null) {
            return 0L;
        }
        long expireTime = dnsRecord.getExpireTime() - System.currentTimeMillis();
        if (expireTime <= 0) {
            b.remove(str);
        }
        return expireTime;
    }

    public final synchronized void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e1c61ca189fda40acd7a0e32b31b37f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e1c61ca189fda40acd7a0e32b31b37f");
            return;
        }
        if (b.containsKey(str)) {
            b.remove(str);
        }
    }
}
