package com.sankuai.xm.im.message.newmsg;

import android.os.SystemClock;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.annotation.TraceStatus;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.e;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.d;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.network.c;
import com.sankuai.xm.network.httpurlconnection.g;
import com.sankuai.xm.network.setting.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    public static ChangeQuickRedirect a;
    private d b;
    private long c;
    private long d;
    private long e;

    public static /* synthetic */ void a(b bVar, c cVar, int i, int i2, List list, List list2) {
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2), list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "629040eedbf3e32ca8a6877d97500a4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "629040eedbf3e32ca8a6877d97500a4d");
            return;
        }
        boolean z = i == 0;
        bVar.a(i2, z ? 1 : 2);
        if (z) {
            Object[] objArr2 = {Integer.valueOf(i2), list, list2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "4ab3c8901d3e46f2748099c80f29118e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "4ab3c8901d3e46f2748099c80f29118e");
            } else if (!com.sankuai.xm.base.util.b.a((Collection<?>) list) || !com.sankuai.xm.base.util.b.a((Collection<?>) list2)) {
                bVar.b(i2, Math.max(bVar.a(list), bVar.a(list2)));
            }
        }
        bVar.a(cVar, i2, i);
    }

    public static /* synthetic */ void a(b bVar, final c cVar, final com.sankuai.xm.im.message.newmsg.a aVar) {
        Object[] objArr = {cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "013aa945000357a89d927ec7fad66dbf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "013aa945000357a89d927ec7fad66dbf");
        } else {
            com.sankuai.xm.threadpool.scheduler.a.b().a(11, j.a(new Runnable() { // from class: com.sankuai.xm.im.message.newmsg.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7c7d72a048f2ed3641185de557e0d17", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7c7d72a048f2ed3641185de557e0d17");
                        return;
                    }
                    e.a(aVar.a);
                    if (!com.sankuai.xm.base.util.b.a(aVar.e)) {
                        MessageUtils.printMsgIds(aVar.e);
                        MessageUtils.checkAndSupplyChannel(aVar.e, (short) -1);
                        List<IMMessage> a2 = b.this.b.a(aVar.e, 1);
                        StringBuilder sb = new StringBuilder("RecentMsgController::onPullNewMsg, ");
                        sb.append(aVar.b);
                        sb.append(",notifyMessage=");
                        sb.append(a2 == null ? 0 : a2.size());
                        com.sankuai.xm.im.utils.a.b(sb.toString(), new Object[0]);
                        if (a2 != null && !a2.isEmpty()) {
                            b.this.b.a(a2, true);
                        }
                    }
                    if (aVar.f != null && !aVar.f.isEmpty()) {
                        MessageUtils.printMsgIds(aVar.f);
                        com.sankuai.xm.im.utils.a.b("RecentMsgController::onPullNewMsg, " + aVar.b + ",notifyCancelMessages=" + aVar.f.size(), new Object[0]);
                        MessageUtils.checkAndSupplyChannel(aVar.f, (short) -1);
                        b.this.b.b(aVar.f, 2);
                    }
                    e.b(aVar.a);
                    if (aVar.c != null) {
                        com.sankuai.xm.im.utils.a.b("RecentMsgController::onPullNewMsg end , " + aVar.b + ",mAllMessages=" + aVar.c.size(), new Object[0]);
                        b.a(b.this, cVar, 0, aVar.b, aVar.c, aVar.d);
                    }
                }
            }));
        }
    }

    public b(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c2a592e233f3cfbb7bb8902c5b01082", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c2a592e233f3cfbb7bb8902c5b01082");
        } else {
            this.b = dVar;
        }
    }

    public final void a(com.sankuai.xm.network.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d07957a833ed11dc87d078144eca1e1d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d07957a833ed11dc87d078144eca1e1d");
        } else {
            a(aVar, z, 1, 2, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0195  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.sankuai.xm.network.a r18, boolean r19, int... r20) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.message.newmsg.b.a(com.sankuai.xm.network.a, boolean, int[]):void");
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82084d4802f251e9ac37f0cfb9a88a23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82084d4802f251e9ac37f0cfb9a88a23");
            return;
        }
        this.c = Math.max(DBProxy.l().m.a(true, 1, 9), g(1));
        this.d = Math.max(DBProxy.l().m.a(true, 2), g(2));
        this.e = Math.max(DBProxy.l().m.a(true, 3, 10, 11), g(3));
    }

    private int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "211072ec05398ac1f8f1c1c5ce5ad879", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "211072ec05398ac1f8f1c1c5ce5ad879")).intValue() : d(i) == 1 ? 1 : 2;
    }

    private String c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2d9c9d71d339d5675695f59eb679096", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2d9c9d71d339d5675695f59eb679096");
        }
        return f.a().e() + "_new_msg_request_status_" + i;
    }

    private int d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "145af3c0d6088b6aaa24f1a7c7c2381b", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "145af3c0d6088b6aaa24f1a7c7c2381b")).intValue() : com.sankuai.xm.im.utils.b.a().getInt(c(i), 0);
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dfe4a324730066889ffa76fc68b0f5d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dfe4a324730066889ffa76fc68b0f5d");
        } else {
            com.sankuai.xm.im.utils.b.a().edit().putInt(c(i), i2).apply();
        }
    }

    public String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ba861f28de6cb18a0ef1b8a81eec00b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ba861f28de6cb18a0ef1b8a81eec00b");
        }
        return f.a().e() + "_new_msg_request_success_time_" + i;
    }

    private long e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee4bd57f0ac408e353a1eef739427451", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee4bd57f0ac408e353a1eef739427451")).longValue() : com.sankuai.xm.im.utils.b.a().getLong(a(i), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54b99e5ede13f5ae4f14ff73ae8a2e7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54b99e5ede13f5ae4f14ff73ae8a2e7f");
        } else {
            com.sankuai.xm.im.utils.b.a().edit().putLong(a(i), j).apply();
        }
    }

    private String f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d08a7c3a4e3bc8ef6638a5f5c36ca9f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d08a7c3a4e3bc8ef6638a5f5c36ca9f");
        }
        return f.a().e() + "_new_msg_last_db_operate_time_" + i;
    }

    private long g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19007b41081980b717508d527c77a043", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19007b41081980b717508d527c77a043")).longValue() : com.sankuai.xm.im.utils.b.a().getLong(f(i), 0L);
    }

    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62fae68f84ff749693288cae78e4e1af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62fae68f84ff749693288cae78e4e1af");
        } else if (j > g(i)) {
            com.sankuai.xm.im.utils.b.a().edit().putLong(f(i), j).apply();
        }
    }

    private long a(List<IMMessage> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "744a771b4461b80448bf420a097787be", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "744a771b4461b80448bf420a097787be")).longValue();
        }
        if (com.sankuai.xm.base.util.b.a(list)) {
            return 0L;
        }
        if (list.size() > 1 && list.get(0).getSts() > list.get(1).getSts()) {
            return list.get(0).getSts();
        }
        long j = 0;
        for (IMMessage iMMessage : list) {
            if (iMMessage.getSts() > j) {
                j = iMMessage.getSts();
            }
        }
        return j;
    }

    @Trace(name = "sync_msg_end", type = i.normal)
    private void a(c cVar, int i, @TraceStatus int i2) {
        com.sankuai.xm.network.a h;
        int i3 = 1;
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f1a0f8af45fe02d7d32f25facf6b818", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f1a0f8af45fe02d7d32f25facf6b818");
            return;
        }
        try {
            j.a(i.normal, "sync_msg_end", (String[]) null, new Object[]{cVar, new Integer(i), new Integer(i2)});
            j.a(new Integer(i2), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
            if (i2 != 0) {
                i3 = 16;
            }
            com.sankuai.xm.base.init.b.a(i3);
            j.a("type", Integer.valueOf(i));
            if (cVar != null && (h = cVar.h()) != null) {
                h.b(cVar);
            }
            com.sankuai.xm.im.utils.a.b("RecentMsgController::remoteSyncFinished: category:" + i + ", ret = " + i2, new Object[0]);
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends com.sankuai.xm.network.httpurlconnection.d {
        public static ChangeQuickRedirect a;
        private int c;
        private com.sankuai.xm.base.d d;
        private long e;
        private int f;
        private long g;
        private List<IMMessage> m;
        private List<IMMessage> n;
        private boolean o;
        private long p;

        private a(com.sankuai.xm.base.d dVar, int i, long j, int i2) {
            Object[] objArr = {b.this, dVar, Integer.valueOf(i), new Long(j), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "381a1031d309981a63f758fdad1bddf6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "381a1031d309981a63f758fdad1bddf6");
                return;
            }
            this.d = dVar;
            this.c = i;
            this.m = new ArrayList();
            this.n = new ArrayList();
            this.e = j;
            this.f = i2;
            this.p = com.sankuai.xm.login.c.a().a(System.currentTimeMillis());
        }

        @Override // com.sankuai.xm.network.httpurlconnection.c
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3718d60e4ea8d33f6270b2f3db0b4b94", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3718d60e4ea8d33f6270b2f3db0b4b94");
                return;
            }
            super.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5798c383306d773093c4db3e60e0ba1d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5798c383306d773093c4db3e60e0ba1d");
                return;
            }
            this.g = SystemClock.uptimeMillis();
            e.a(this.d.y(), this.c, this.f, this.d.a(), this.d.l());
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(JSONObject jSONObject) throws Exception {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc0cf223180101ab276710ae2e5f2b59", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc0cf223180101ab276710ae2e5f2b59");
                return;
            }
            com.sankuai.xm.base.util.net.c a2 = new com.sankuai.xm.base.util.net.c(jSONObject).a("data");
            JSONArray f = a2.f(APKStructure.Res_Type);
            boolean e = a2.e("repair");
            Object[] objArr2 = {Byte.valueOf(e ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dba74de54e1912d29a7db9c3239e9d79", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dba74de54e1912d29a7db9c3239e9d79");
            } else if (!this.o) {
                this.o = e;
                if (this.o) {
                    IMClient.a().j().a(false, this.o);
                }
            }
            if (f == null || f.length() == 0) {
                com.sankuai.xm.im.utils.a.c("RecentMsgController::NewMsgJsonCallback, Res = 0", new Object[0]);
                b.a(b.this, this.d, 0, this.c, this.m, this.n);
                a(0, 0);
                b.this.b(this.c, this.p);
                return;
            }
            com.sankuai.xm.im.message.newmsg.a aVar = new com.sankuai.xm.im.message.newmsg.a(this.c);
            List<IMMessage> list = aVar.e;
            List<IMMessage> list2 = aVar.f;
            for (int i = 0; i < f.length(); i++) {
                byte[] decode = Base64.decode(f.getString(i), 0);
                if (decode != null && decode.length != 0) {
                    com.sankuai.xm.base.proto.a aVar2 = new com.sankuai.xm.base.proto.a();
                    aVar2.a(decode);
                    byte[][] a3 = aVar2.a();
                    if (a3 != null) {
                        a(a3, list, list2);
                    }
                }
            }
            int c = a2.c("next");
            if (!com.sankuai.xm.base.util.b.a(list)) {
                this.m.addAll(list);
            }
            if (!com.sankuai.xm.base.util.b.a(list2)) {
                this.n.addAll(list2);
            }
            if (c <= 0) {
                aVar.c = this.m;
                aVar.d = this.n;
            }
            a(c, list.size() + list2.size());
            b.a(b.this, this.d, aVar);
            if (c > 0) {
                com.sankuai.xm.im.utils.a.b("RecentMsgController::PullNewMsgTask.run, next > 0, next=" + c, new Object[0]);
                this.d.a("os", Integer.valueOf(c));
                this.d.a(new com.sankuai.xm.network.httpurlconnection.retry.a());
                g.a().a((com.sankuai.xm.network.httpurlconnection.e) this.d, 1000L);
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5173ea23688bfebbdf9d709c04959c41", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5173ea23688bfebbdf9d709c04959c41");
                return;
            }
            if (i == 400 || i == 17) {
                b.this.b(this.c, 0L);
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b46deea8f68f3e638cbd939f2d381013", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b46deea8f68f3e638cbd939f2d381013");
            } else {
                e.a(this.d.y(), false, 0, 0, this.m.size() + this.n.size(), this.g, this.c, this.e, this.f, this.d.a());
            }
            b.a(b.this, this.d, i, this.c, this.m, this.n);
        }

        private void a(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d04c689e5339dd1b144030d64dfef03", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d04c689e5339dd1b144030d64dfef03");
            } else {
                e.a(this.d.y(), true, i, i2, this.m.size() + this.n.size(), this.g, this.c, this.e, this.f, this.d.a());
            }
        }

        private void a(byte[][] bArr, List<IMMessage> list, List<IMMessage> list2) {
            Object[] objArr = {bArr, list, list2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b10a36165cf0ebcbde92d4016199b68f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b10a36165cf0ebcbde92d4016199b68f");
                return;
            }
            for (byte[] bArr2 : bArr) {
                if (bArr2 == null || bArr2.length == 0) {
                    com.sankuai.xm.im.utils.a.d("RecentMsgController::parseMessages => some thing wrong in server", new Object[0]);
                } else {
                    int d = com.sankuai.xm.base.proto.protobase.f.d(bArr2);
                    IMMessage msgProtoToIMMessage = MessageUtils.msgProtoToIMMessage(bArr2, d);
                    if (msgProtoToIMMessage != null) {
                        list.add(msgProtoToIMMessage);
                    } else {
                        IMMessage cancelProtoToIMMessage = MessageUtils.cancelProtoToIMMessage(bArr2, d);
                        if (cancelProtoToIMMessage != null) {
                            list2.add(cancelProtoToIMMessage);
                        } else {
                            com.sankuai.xm.im.utils.a.c("RecentMsgController::parseMessages => unknown uri:" + d, new Object[0]);
                        }
                    }
                }
            }
        }
    }
}
