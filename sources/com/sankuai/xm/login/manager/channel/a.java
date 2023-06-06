package com.sankuai.xm.login.manager.channel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.p;
import java.util.HashMap;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static volatile int b;

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1942fad74e4c69bc97956b4e638fed5", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1942fad74e4c69bc97956b4e638fed5")).intValue();
        }
        if (b == 0) {
            b = com.sankuai.xm.base.util.c.b(UUID.randomUUID().toString().getBytes());
        }
        return b;
    }

    public static void a(com.sankuai.xm.base.proto.protobase.d dVar, int i) {
        Object[] objArr = {dVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43407e8ad9c88da3cafc7ebad2888a39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43407e8ad9c88da3cafc7ebad2888a39");
        } else if (dVar == null) {
        } else {
            try {
                String dVar2 = dVar.toString();
                com.sankuai.xm.login.d.d("ConnectionChannel::reportCRC32CheckFail:: " + dVar2 + "stack: " + p.a(new Throwable()), new Object[0]);
                HashMap hashMap = new HashMap();
                hashMap.put("seqId", Integer.valueOf(dVar.g));
                hashMap.put("id", Integer.valueOf(dVar.f));
                hashMap.put("msg", dVar2);
                hashMap.put("sessionId", Integer.valueOf(a()));
                hashMap.put("cmid", Integer.valueOf(i));
                m.d().a("crc32_check", hashMap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void a(com.sankuai.xm.base.proto.protobase.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9fe11a3a87ec82149f75f84e2285d832", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9fe11a3a87ec82149f75f84e2285d832");
        } else if (dVar == null) {
        } else {
            try {
                String dVar2 = dVar.toString();
                com.sankuai.xm.login.d.d("ConnectionChannel::reportCRC32CheckFailResend:: " + dVar2 + "stack: " + p.a(new Throwable()), new Object[0]);
                HashMap hashMap = new HashMap();
                hashMap.put("seqId", Integer.valueOf(dVar.g));
                hashMap.put("id", Integer.valueOf(dVar.f));
                hashMap.put("msg", dVar2);
                hashMap.put("sessionId", Integer.valueOf(a()));
                m.d().a("crc32_resend", hashMap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void b(com.sankuai.xm.base.proto.protobase.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95f3f634629b89db7d9b532eac5785d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95f3f634629b89db7d9b532eac5785d7");
        } else if (dVar == null) {
        } else {
            try {
                String dVar2 = dVar.toString();
                com.sankuai.xm.login.d.d("ConnectionChannel::reportTransUpACK:: " + dVar2 + "stack: " + p.a(new Throwable()), new Object[0]);
                HashMap hashMap = new HashMap();
                hashMap.put("seqId", Integer.valueOf(dVar.g));
                hashMap.put("id", Integer.valueOf(dVar.f));
                hashMap.put("msg", dVar2);
                hashMap.put("sessionId", Integer.valueOf(a()));
                m.d().a("crc32_trans_up_ack", hashMap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void c(com.sankuai.xm.base.proto.protobase.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0df627cb45ed5b9ade236d952419850", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0df627cb45ed5b9ade236d952419850");
        } else if (dVar == null) {
        } else {
            try {
                String dVar2 = dVar.toString();
                com.sankuai.xm.login.d.d("ConnectionChannel::reportTransDownACK:: " + dVar2 + "stack: " + p.a(new Throwable()), new Object[0]);
                HashMap hashMap = new HashMap();
                hashMap.put("seqId", Integer.valueOf(dVar.g));
                hashMap.put("id", Integer.valueOf(dVar.f));
                hashMap.put("msg", dVar2);
                hashMap.put("sessionId", Integer.valueOf(a()));
                m.d().a("crc32_trans_down_ack", hashMap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
