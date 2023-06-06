package com.sankuai.xm.login.manager.channel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.proto.protosingal.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.g;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.login.manager.channel.d;
import com.sankuai.xm.login.net.h;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.nio.channels.Selector;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b implements d.a, com.sankuai.xm.login.net.a {
    public static ChangeQuickRedirect a;
    public d b;
    public volatile int c;
    public com.sankuai.xm.base.c d;
    public volatile com.sankuai.xm.login.manager.lvs.b e;
    private com.sankuai.xm.login.manager.e f;
    private int g;
    private com.sankuai.xm.login.beans.a h;
    private volatile boolean i;
    private a j;
    private com.sankuai.xm.login.manager.lvs.a k;
    private g l;

    @Override // com.sankuai.xm.login.net.a
    public final void a(int i, String str, byte[] bArr, int i2, int i3) {
    }

    @Override // com.sankuai.xm.login.manager.channel.d.a
    public final void a(com.sankuai.xm.login.manager.lvs.a aVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e5 A[Catch: Exception -> 0x072f, TryCatch #2 {Exception -> 0x072f, blocks: (B:7:0x003d, B:9:0x005a, B:25:0x00e5, B:27:0x0101, B:35:0x0139, B:36:0x013c, B:166:0x0719, B:167:0x071c, B:169:0x0722, B:171:0x072b, B:37:0x0140, B:39:0x015a, B:40:0x015f, B:46:0x01ac, B:48:0x01c3, B:49:0x01c8, B:50:0x01ee, B:52:0x0205, B:53:0x020a, B:54:0x0236, B:56:0x0251, B:57:0x0256, B:59:0x025a, B:61:0x02a5, B:65:0x02ac, B:69:0x02b4, B:71:0x02b8, B:73:0x02be, B:79:0x02dc, B:75:0x02c2, B:77:0x02ce, B:78:0x02d4, B:87:0x0307, B:89:0x0313, B:92:0x0321, B:94:0x0344, B:95:0x0348, B:97:0x0369, B:98:0x036d, B:100:0x0372, B:101:0x0378, B:103:0x038c, B:144:0x0611, B:145:0x0619, B:147:0x061d, B:104:0x0398, B:106:0x039c, B:108:0x03a4, B:112:0x03c6, B:114:0x03ff, B:116:0x044c, B:119:0x0455, B:121:0x0480, B:122:0x0485, B:123:0x0494, B:126:0x04b0, B:128:0x0501, B:131:0x050a, B:133:0x053b, B:134:0x0540, B:135:0x0559, B:138:0x0588, B:140:0x05fc, B:141:0x0601, B:90:0x031a, B:148:0x0626, B:149:0x063b, B:151:0x0652, B:152:0x0657, B:153:0x0683, B:155:0x069a, B:156:0x069f, B:158:0x06e6, B:165:0x0707, B:159:0x06ea, B:164:0x06f7, B:30:0x0111, B:11:0x0067, B:13:0x006d, B:15:0x00a2, B:16:0x00a6, B:18:0x00ac, B:20:0x00b8, B:22:0x00db, B:81:0x02e8, B:41:0x018f), top: B:176:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.xm.login.manager.channel.b r28, int r29, byte[] r30) {
        /*
            Method dump skipped, instructions count: 1900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.login.manager.channel.b.a(com.sankuai.xm.login.manager.channel.b, int, byte[]):void");
    }

    public b(com.sankuai.xm.login.manager.e eVar, com.sankuai.xm.login.manager.lvs.b bVar) {
        Object[] objArr = {eVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21da2fd133bd33245faa9d2d8bb1ac01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21da2fd133bd33245faa9d2d8bb1ac01");
            return;
        }
        this.f = new c(eVar);
        this.b = new d(this, this, bVar);
        this.d = new com.sankuai.xm.base.c();
        this.c = 0;
        this.g = -1;
        this.h = null;
        this.j = new a();
        this.e = bVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63282ed86f7726c40e5eba411db214da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63282ed86f7726c40e5eba411db214da");
            return;
        }
        final com.sankuai.xm.login.net.g a2 = com.sankuai.xm.login.net.g.a();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = h.b;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "fc4fa67cfefdd2cd27649e4efc45d1c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "fc4fa67cfefdd2cd27649e4efc45d1c8");
        } else if (a2.d) {
        } else {
            a2.d = true;
            com.sankuai.xm.login.d.a("SocketQueue::start");
            a2.d();
            a2.a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.net.h.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.login.net.taskqueue.base.b
                public final void a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5a02ccb2a83c654c8a19713a9abe8ccb", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5a02ccb2a83c654c8a19713a9abe8ccb");
                        return;
                    }
                    try {
                        a2.m = Selector.open();
                        ((f) a2.f).b = a2.m;
                    } catch (Throwable th) {
                        com.sankuai.xm.login.d.a(th, "SocketQueue::start:: exception: " + th.getMessage(), new Object[0]);
                    }
                }
            });
        }
    }

    @Trace(name = "start", traceName = "login_im")
    public final synchronized boolean a(com.sankuai.xm.login.beans.a aVar) {
        String str;
        List<com.sankuai.xm.login.manager.lvs.a> c;
        boolean a2;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8f812ce33cbc39d5011f0900fc94920", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8f812ce33cbc39d5011f0900fc94920")).booleanValue();
        }
        j.a(i.begin, "start", "login_im", 0L, "single", new Object[]{aVar});
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b27cf789016da5e3bee54290879a686", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b27cf789016da5e3bee54290879a686");
        } else if (aVar != null) {
            j.a("type", Integer.valueOf(aVar.c));
            if (aVar instanceof com.sankuai.xm.login.beans.e) {
                StringBuilder sb = new StringBuilder();
                sb.append(((com.sankuai.xm.login.beans.e) aVar).g);
                str = sb.toString();
            } else if (!(aVar instanceof com.sankuai.xm.login.beans.b)) {
                if (aVar instanceof com.sankuai.xm.login.beans.d) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(((com.sankuai.xm.login.beans.d) aVar).g);
                    str = sb2.toString();
                } else {
                    str = null;
                }
            } else {
                str = ((com.sankuai.xm.login.beans.b) aVar).g;
            }
            if (!ac.a(str)) {
                j.a("userid", str);
            }
        }
        int i = this.c;
        com.sankuai.xm.login.d.a("ConnectionChannel::connect:: status: " + i + " link id =" + this.g);
        if (a()) {
            com.sankuai.xm.login.d.a("ConnectionChannel::connect:: do nothing for status " + i);
            j.a(new Boolean(false));
            return false;
        } else if (!m.a().k()) {
            a(-1, 12);
            com.sankuai.xm.login.d.d("ConnectionChannel::connect:: NET_NONE", new Object[0]);
            j.a(new Boolean(false));
            return false;
        } else {
            this.i = false;
            this.h = aVar;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fe8038ef6a0865ad159db1a5f0ee1d24", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fe8038ef6a0865ad159db1a5f0ee1d24");
            } else {
                j.a(i.normal, "login_start", (String[]) null, new Object[0]);
                if (!this.e.d()) {
                    com.sankuai.xm.login.d.d("Connector::doConnect:: hasAddressCandidates false", new Object[0]);
                    a(-1, 0);
                    j.a((Object) null);
                } else {
                    b(1);
                    a aVar2 = this.j;
                    Object[] objArr4 = {(byte) 1};
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "033b79b1c6c4f446b121a690cf567973", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "033b79b1c6c4f446b121a690cf567973");
                    } else {
                        com.sankuai.xm.login.d.a("ConnectionChannel::ProtoEncrypt::init");
                        aVar2.b.a((byte[]) null);
                        aVar2.a(true);
                        aVar2.c = 262144;
                        if (aVar2.d != null) {
                            aVar2.d.p();
                        }
                        aVar2.d = com.sankuai.xm.login.net.mempool.heap.c.a().a(aVar2.c);
                        aVar2.d.o();
                        aVar2.e = 0;
                        aVar2.f = 0;
                    }
                    d dVar = this.b;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = d.a;
                    if (PatchProxy.isSupport(objArr5, dVar, changeQuickRedirect5, false, "3efa3dee28a09d19dfde8af4cf97ba1e", 6917529027641081856L)) {
                        a2 = ((Boolean) PatchProxy.accessDispatch(objArr5, dVar, changeQuickRedirect5, false, "3efa3dee28a09d19dfde8af4cf97ba1e")).booleanValue();
                    } else if (dVar.c() > 0) {
                        com.sankuai.xm.login.d.a("Connector::startConnection:: connect count > 0");
                        a2 = true;
                    } else {
                        com.sankuai.xm.login.manager.lvs.b bVar = dVar.g;
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.xm.login.manager.lvs.b.a;
                        if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "08e529e46abe345b1b3c967760b77246", 6917529027641081856L)) {
                            c = (List) PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "08e529e46abe345b1b3c967760b77246");
                        } else {
                            Object[] objArr7 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.xm.login.manager.lvs.b.a;
                            c = PatchProxy.isSupport(objArr7, bVar, changeQuickRedirect7, false, "c694d98cd4abf8b7dc88d29c0e05bbba", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr7, bVar, changeQuickRedirect7, false, "c694d98cd4abf8b7dc88d29c0e05bbba") : bVar.c.c();
                        }
                        if (com.sankuai.xm.base.util.b.a(c)) {
                            com.sankuai.xm.login.d.a("Connector::startConnection:: createConnectIPList fail");
                            a2 = false;
                        } else {
                            dVar.d.a(c);
                            dVar.b.c();
                            a2 = dVar.a();
                        }
                    }
                    if (!a2) {
                        com.sankuai.xm.login.d.d("Connector::doConnect:: Connector.start failure", new Object[0]);
                        this.d.e = System.currentTimeMillis();
                        this.d.a(1, "113");
                        a(-1, 0);
                    }
                    j.a((Object) null);
                }
            }
            j.a(new Boolean(true));
            return true;
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "717b48d3a3de2d1fe74b5141358a5ea0", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "717b48d3a3de2d1fe74b5141358a5ea0")).booleanValue() : b() || this.c == 4;
    }

    public final synchronized void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "393fd65cdea1a2baae4a581329f9ec47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "393fd65cdea1a2baae4a581329f9ec47");
        } else {
            a(i, 6);
        }
    }

    public final synchronized void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38a5e99e54c0f92898172b1e311a4102", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38a5e99e54c0f92898172b1e311a4102");
            return;
        }
        com.sankuai.xm.login.d.d("ConnectionChannel::disconnect:: status: " + i + " reason: " + i2, new Object[0]);
        if (i == -3 || i == -2) {
            this.i = true;
        }
        this.g = -1;
        b(i);
        d dVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "21b9384188e402c4fb1681e3c6f6cc84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "21b9384188e402c4fb1681e3c6f6cc84");
        } else {
            com.sankuai.xm.login.d.a("Connector::stop:: mLinkId=" + dVar.c);
            dVar.b();
            dVar.d.c();
            dVar.e = false;
            dVar.f = false;
        }
        this.h = null;
        this.l = null;
        com.sankuai.xm.network.analyse.d.c().b = -3;
    }

    public final synchronized void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2212566c6d3ef3c16d3397ca7df9841a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2212566c6d3ef3c16d3397ca7df9841a");
            return;
        }
        com.sankuai.xm.login.d.a("ConnectionChannel::logoff:: linkid=" + this.g + " status=" + this.c);
        if (this.g != -1 && this.c == 4) {
            l lVar = new l();
            lVar.b = j;
            lVar.d = f.m().g;
            lVar.c = com.sankuai.xm.base.util.c.b();
            a(lVar.bS_());
            b(4, 3000);
            return;
        }
        a(-3, 13);
        this.f.b(true);
    }

    private synchronized boolean a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f82422516835b2388f9d5ed608216fee", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f82422516835b2388f9d5ed608216fee")).booleanValue();
        }
        return a((String) null, bArr, false);
    }

    public final synchronized boolean a(final String str, byte[] bArr, boolean z) {
        Object[] objArr = {str, bArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6867c5a17e72676a43ad79ff5fb03ffe", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6867c5a17e72676a43ad79ff5fb03ffe")).booleanValue();
        }
        if (this.g != -1 && bArr != null) {
            if (!z) {
                Object[] objArr2 = {bArr};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28465403c1bb4ae7e4180e743a159544", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28465403c1bb4ae7e4180e743a159544");
                } else if (com.sankuai.xm.base.proto.protobase.f.d(bArr) == 1966080026) {
                    com.sankuai.xm.login.manager.packetcheck.a.a().a(bArr);
                }
            }
            if (z) {
                com.sankuai.xm.login.manager.channel.a.a(com.sankuai.xm.base.proto.protobase.g.g(bArr));
            }
            a aVar = this.j;
            Object[] objArr3 = {bArr};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            final byte[] b = PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "38d61dd99505a3dff76e0aa9fe797644", 6917529027641081856L) ? (byte[]) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "38d61dd99505a3dff76e0aa9fe797644") : aVar.b.b(bArr);
            if (b == null) {
                com.sankuai.xm.login.d.c("ConnectionChannel::send:: encodeBuf is null.", new Object[0]);
                return false;
            } else if (b.length > 65536) {
                com.sankuai.xm.login.d.c("ConnectionChannel::send:: encodeBuf too big: %s", Integer.valueOf(b.length));
                return false;
            } else {
                final com.sankuai.xm.login.net.g a2 = com.sankuai.xm.login.net.g.a();
                final int i = this.g;
                final int length = b.length;
                Object[] objArr4 = {Integer.valueOf(i), str, b, 0, Integer.valueOf(length)};
                ChangeQuickRedirect changeQuickRedirect4 = h.b;
                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "f397cb5c623640e0170ee88c6866ecc6", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "f397cb5c623640e0170ee88c6866ecc6");
                } else {
                    a2.a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.net.h.5
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.login.net.taskqueue.base.b
                        public final void a() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f78dadeae47e88d83f8ff69d6fcd2412", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f78dadeae47e88d83f8ff69d6fcd2412");
                                return;
                            }
                            d dVar = (d) a2.c.get(Integer.valueOf(i));
                            if (dVar != null) {
                                dVar.a(str, b, r5, length);
                                return;
                            }
                            com.sankuai.xm.login.d.d("SocketQueue::Task::execute:: send invalid linkId = " + i, new Object[0]);
                        }
                    });
                }
                m.d().a(bArr.length, 0L);
                return true;
            }
        }
        com.sankuai.xm.login.d.c("ConnectionChannel::send:: link id is -1 or buf is null, link id = " + this.g, new Object[0]);
        return false;
    }

    public synchronized void cancel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93959c75c231d9dca6f18ff6dc141185", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93959c75c231d9dca6f18ff6dc141185");
            return;
        }
        if (this.g != -1 && str != null) {
            com.sankuai.xm.login.net.g.a().cancel(this.g, str);
            return;
        }
        com.sankuai.xm.login.d.c("ConnectionChannel::send:: link id is -1 or id is null, link id = " + this.g, new Object[0]);
    }

    public final synchronized void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c380fd9460d00fb868b1c88c1c5c0ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c380fd9460d00fb868b1c88c1c5c0ae");
            return;
        }
        this.c = i;
        this.f.d(i);
    }

    public final synchronized void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7e4927205db99a9d0208ae8af9d8b1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7e4927205db99a9d0208ae8af9d8b1a");
        } else if (this.g != -1) {
            com.sankuai.xm.login.net.g.a().a(this.g, i);
        } else {
            com.sankuai.xm.login.d.c("ConnectionChannel::removeTimeout:: link id is -1.", new Object[0]);
        }
    }

    public final synchronized void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b84ae8f04e5ac71aa92550cb962aa298", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b84ae8f04e5ac71aa92550cb962aa298");
        } else if (this.g != -1) {
            com.sankuai.xm.login.net.g.a().a(this.g, i, i2);
        } else {
            com.sankuai.xm.login.d.c("ConnectionChannel::addTimeout:: link id is -1.", new Object[0]);
        }
    }

    @Override // com.sankuai.xm.login.net.a
    public final synchronized void c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e56ea8e2fbd6ac91859ef4a0a6393e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e56ea8e2fbd6ac91859ef4a0a6393e2");
        } else if (this.h == null) {
            com.sankuai.xm.login.d.c("ConnectionChannel::onConnected:: mAuthContext is null.", new Object[0]);
        } else {
            if (!this.i) {
                this.g = i;
                this.k = this.b.a(i);
                this.h.b = this.k;
                this.d.q = i2;
                com.sankuai.xm.login.d.a("ConnectionChannel::onConnected:: mAddress=" + this.k);
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6a31d0eb814c4fe59230773a47959f9", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6a31d0eb814c4fe59230773a47959f9");
                } else {
                    int i3 = this.c;
                    if (i3 == 1) {
                        this.d.f = System.currentTimeMillis();
                        d();
                    } else {
                        com.sankuai.xm.login.d.c("ConnectionChannel::onConnected:: status is wrong, status = " + i3, new Object[0]);
                    }
                }
            } else {
                com.sankuai.xm.login.d.a("ConnectionChannel::onConnected:: mLogoffByExternal=" + this.i);
                if (this.c != -2 && this.c != -3) {
                    a(-1);
                }
                com.sankuai.xm.login.d.a("ConnectionChannel::onConnected:: stats=" + this.c);
            }
        }
    }

    @Override // com.sankuai.xm.login.net.a
    public final synchronized void a(int i, com.sankuai.xm.login.net.mempool.heap.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d7b46831bdc6ab91ec407fff6e56b73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d7b46831bdc6ab91ec407fff6e56b73");
        } else if (this.h == null) {
            com.sankuai.xm.login.d.c("ConnectionChannel::onData:: mAuthContext is null.", new Object[0]);
        } else if (this.g == i) {
            int a2 = this.j.a(bVar);
            if ((a2 == -2 || a2 == -3 || a2 == -4) && b() && this.h.b != null) {
                a(false);
            }
            int i2 = a2 == -3 ? 13 : a2 == -4 ? 14 : 0;
            if (i2 != 0) {
                if (this.c == 2) {
                    this.d.a(0, "", i2);
                } else if (this.c == 3) {
                    this.d.b(0, "", i2);
                }
            }
            if (a2 == -3 || a2 == -4) {
                a(-1, 8);
                this.j.b.b(false);
            }
        } else {
            com.sankuai.xm.login.d.c("ConnectionChannel::handleData:: linkId is wrong.", new Object[0]);
        }
    }

    @Override // com.sankuai.xm.login.net.a
    public final synchronized void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7d6afd7a92b260467b593cbdd44eb57", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7d6afd7a92b260467b593cbdd44eb57");
            return;
        }
        if (i == this.g) {
            if (a()) {
                if (b()) {
                    a(false);
                }
                if (this.c == 2) {
                    this.d.a(0, "", 11);
                } else if (this.c == 3) {
                    this.d.b(0, "", 11);
                }
                a(-1, i2);
            }
        } else {
            com.sankuai.xm.login.d.c("ConnectionChannel::handleDisconnected:: linkId is wrong.", new Object[0]);
        }
    }

    @Override // com.sankuai.xm.login.net.a
    public final synchronized void d(int i, int i2) {
        long f;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f0f4cde48ba0a6195cea206901903a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f0f4cde48ba0a6195cea206901903a0");
            return;
        }
        if (i == this.g) {
            Object[] objArr2 = {Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34cc67d3d5f32dac882fff12a7ca6b6c", 6917529027641081856L)) {
                try {
                    f = f();
                } catch (Exception e) {
                    com.sankuai.xm.login.d.a(e, "ConnectionChannel::onTimeout:: exception, msg:" + e.getMessage(), new Object[0]);
                }
                switch (i2) {
                    case 2:
                        com.sankuai.xm.login.d.a("ConnectionChannel::onTimeout:: mLogoffByExternal = " + this.i + ",TIMEOUT_EXCHANGE timeout! ");
                        if (this.c == 2 && !this.i) {
                            try {
                                j.a(f, this.l, "login_end", false);
                                j.a(this.l, 5, null, null, null);
                                a(false);
                                this.d.a(5, "", 0);
                                a(-1, 2);
                                j.b(f);
                            } catch (Throwable th) {
                                j.a(f, th);
                            }
                            return;
                        }
                        break;
                    case 3:
                        com.sankuai.xm.login.d.a("ConnectionChannel::onTimeout:: mLogoffByExternal = " + this.i + ",TIMEOUT_LOGIN timeout!");
                        if (this.c == 3 && !this.i) {
                            try {
                                j.a(f, this.l, "login_end", false);
                                j.a(this.l, 8, null, null, null);
                                a(false);
                                this.d.b(8, "", 0);
                                a(-1, 4);
                                j.b(f);
                            } catch (Throwable th2) {
                                j.a(f, th2);
                            }
                            return;
                        }
                        break;
                    case 4:
                        com.sankuai.xm.login.d.a("ConnectionChannel::onTimeout:: TIMEOUT_LOGOFF timeout! uid = " + com.sankuai.xm.login.a.a().b);
                        this.f.b(true);
                        a(-3, 13);
                        return;
                    default:
                        this.f.a(i2);
                        break;
                }
            } else {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34cc67d3d5f32dac882fff12a7ca6b6c");
            }
        } else {
            com.sankuai.xm.login.d.c("ConnectionChannel::handleTimeout:: linkId is wrong.", new Object[0]);
        }
    }

    @Override // com.sankuai.xm.login.manager.channel.d.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5ec7262e79dc579c04c0d5db829dc0d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5ec7262e79dc579c04c0d5db829dc0d");
            return;
        }
        this.d.a();
        this.d.e = System.currentTimeMillis();
        this.l = j.a();
    }

    @Override // com.sankuai.xm.login.manager.channel.d.a
    public final void a(com.sankuai.xm.login.manager.lvs.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cb4cd9001ff87fd4c607da35bb09e3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cb4cd9001ff87fd4c607da35bb09e3a");
        } else if (aVar == null) {
            com.sankuai.xm.login.d.c("ConnectionChannel::onAddressStop:: finish connect, result = " + z + ", address = null", new Object[0]);
        } else {
            int l = m.a().l();
            if (z) {
                com.sankuai.xm.base.c cVar = this.d;
                String a2 = com.sankuai.xm.login.manager.lvs.b.a(aVar);
                short s = aVar.c;
                boolean b = com.sankuai.xm.login.manager.lvs.b.b(aVar);
                Object[] objArr2 = {a2, Short.valueOf(s), Integer.valueOf(l), Byte.valueOf(b ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.base.c.d;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "e90b3f97e0000c98f9082d95b139c296", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "e90b3f97e0000c98f9082d95b139c296");
                    return;
                }
                cVar.k = a2;
                cVar.m = s;
                cVar.n = l;
                cVar.l = b;
                return;
            }
            this.e.a(aVar, false, false);
            this.d.p++;
            this.d.n = l;
            com.sankuai.xm.base.c cVar2 = this.d;
            Object[] objArr3 = {aVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.base.c.d;
            if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "6e0acde52f132ea5b48df7db7e4e09ac", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "6e0acde52f132ea5b48df7db7e4e09ac");
                return;
            }
            synchronized (cVar2) {
                cVar2.s.add(aVar);
            }
        }
    }

    @Override // com.sankuai.xm.login.manager.channel.d.a
    public final void a(boolean z, int i, int i2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0488eb8e2a84dad393d77980b9d6765c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0488eb8e2a84dad393d77980b9d6765c");
        } else if (this.i) {
            com.sankuai.xm.login.d.a("ConnectionChannel::onStop:: mLogoffByExternal = true, result = " + z);
        } else if (z) {
        } else {
            long f = f();
            try {
                j.a(f, this.l, "login_end", false);
                j.a(this.l, i, null, null, null);
                if (!f.m().i()) {
                    com.sankuai.xm.login.manager.lvs.b bVar = this.e;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.login.manager.lvs.b.a;
                    if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "9465e1a9a95175b861f2a5065defe154", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "9465e1a9a95175b861f2a5065defe154");
                    } else {
                        bVar.c.e();
                    }
                }
                this.e.f();
                this.d.a(i, i2);
                a(-1, 1);
                j.b(f);
            } catch (Throwable th) {
                j.a(f, th);
            }
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00f8fc7a109b88dae73fd3ac30a05117", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00f8fc7a109b88dae73fd3ac30a05117");
        } else if (this.k != null) {
            this.e.a(this.k, z);
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75bcc7b763678730aa5e3f7c7ec505b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75bcc7b763678730aa5e3f7c7ec505b6");
        } else if (this.i) {
            com.sankuai.xm.login.d.a("ConnectionChannel::doExchangeKey:: mLogoffByExternal => true");
        } else {
            com.sankuai.xm.login.d.a("ConnectionChannel::doExchangeKey");
            b(2);
            try {
                com.sankuai.xm.base.proto.protosingal.d dVar = new com.sankuai.xm.base.proto.protosingal.d();
                dVar.b = this.j.b();
                byte[] a2 = this.j.a();
                com.sankuai.xm.login.d.b("aes res len = " + a2.length + ", type = " + ((int) dVar.b));
                dVar.c = com.sankuai.xm.protobase.utils.d.a(a2, com.sankuai.xm.protobase.utils.d.a(com.sankuai.xm.protobase.utils.d.a()));
                String e = e();
                if (!ac.a(e)) {
                    com.sankuai.xm.login.d.a("ConnectionChannel::doExchangeKey, extern:" + e);
                    dVar.d = e.getBytes();
                }
                a(dVar.bS_());
                b(2, 10000);
                this.d.g = System.currentTimeMillis();
            } catch (Throwable th) {
                this.d.a(6, th.getMessage(), 0);
                a(-1, 3);
                com.sankuai.xm.login.d.a(th, "ConnectionChannel::doExchangeKey:: exception, msg =" + th.getMessage(), new Object[0]);
            }
        }
    }

    private String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24b17ccdc31c6da8e2820c1d6791fe92", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24b17ccdc31c6da8e2820c1d6791fe92");
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == null) {
            return "";
        }
        int i = this.h.c;
        if (i == 0) {
            sb.append("passport:");
            sb.append(((com.sankuai.xm.login.beans.b) this.h).g);
        } else if (i == 1) {
            sb.append("uid:");
            sb.append(((com.sankuai.xm.login.beans.d) this.h).g);
        } else if (i == 2) {
            sb.append("uid:");
            sb.append(((com.sankuai.xm.login.beans.e) this.h).g);
        }
        try {
            Date date = new Date(System.currentTimeMillis());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss:SSS");
            sb.append("_time:");
            sb.append(simpleDateFormat.format(date));
            sb.append("sessionID:");
            sb.append(com.sankuai.xm.login.manager.channel.a.a());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    private void a(int i, long j, String str, String str2, String str3, HashMap<Short, Integer> hashMap) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, str2, str3, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34e85fc43b7d12446575244702e2836d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34e85fc43b7d12446575244702e2836d");
            return;
        }
        g gVar = this.l;
        j.a(gVar);
        try {
            if (this.i) {
                com.sankuai.xm.login.d.a("ConnectionChannel::onAuthRes:: mLogoffByExternal => true");
                return;
            }
            int i2 = this.c;
            if (i2 == 3) {
                c(3);
                com.sankuai.xm.login.d.a("ConnectionChannel::onAuthRes:: code = " + i + " time = " + (System.currentTimeMillis() - this.d.i) + " uid = " + j);
                if (hashMap != null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (Short sh : hashMap.keySet()) {
                        short shortValue = sh.shortValue();
                        int intValue = hashMap.get(Short.valueOf(shortValue)).intValue();
                        stringBuffer.append(" appId=" + ((int) shortValue) + " channel=" + intValue);
                    }
                    com.sankuai.xm.login.d.a("ConnectionChannel::onAuthRes:: channelMap = " + stringBuffer.toString());
                }
                com.sankuai.xm.login.beans.a aVar = this.h;
                this.d.r = i;
                if (i == 0) {
                    a(true);
                    this.d.j = System.currentTimeMillis();
                    com.sankuai.xm.base.c cVar = this.d;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.base.c.d;
                    if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "9bca8ea5edca4e2a8d956146952009cb", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "9bca8ea5edca4e2a8d956146952009cb");
                    } else {
                        HashMap<String, Object> hashMap2 = new HashMap<>();
                        hashMap2.put("result", 0);
                        hashMap2.put("msg", "");
                        hashMap2.put("socket_result", 0);
                        hashMap2.put("exchange_result", 0);
                        hashMap2.put("login_result", 0);
                        hashMap2.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, cVar.k);
                        hashMap2.put("ids", cVar.b());
                        hashMap2.put("status", Integer.valueOf(cVar.l ? 1 : 0));
                        hashMap2.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Short.valueOf(cVar.m));
                        hashMap2.put("time", Long.valueOf(cVar.j - cVar.e));
                        hashMap2.put("socket_time", Long.valueOf(cVar.f - cVar.e));
                        hashMap2.put("exchange_time", Long.valueOf(cVar.h - cVar.g));
                        hashMap2.put("login_time", Long.valueOf(cVar.j - cVar.i));
                        hashMap2.put("net", Integer.valueOf(cVar.n));
                        hashMap2.put("detect", "");
                        hashMap2.put("count", Integer.valueOf(cVar.p));
                        hashMap2.put("appstate", Integer.valueOf(f.m().f));
                        if (cVar.c != 0) {
                            hashMap2.put("backtime", Long.valueOf(System.currentTimeMillis() - cVar.c));
                        }
                        hashMap2.put("type", Integer.valueOf(m.a().m() ? 1 : 0));
                        hashMap2.put("code", Integer.valueOf(cVar.r));
                        cVar.a(40, hashMap2, f.m().i());
                        cVar.a();
                    }
                    b(4);
                } else {
                    if (i != 2 && i != 14) {
                        a(true);
                    }
                    this.d.b(7, "", 0);
                    a(-4, 5);
                }
                com.sankuai.xm.login.beans.c a2 = com.sankuai.xm.login.beans.c.a(i, j, str, str2, str3, hashMap);
                a2.g = aVar;
                com.sankuai.xm.login.a a3 = com.sankuai.xm.login.a.a();
                Object[] objArr3 = {a2};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.login.a.a;
                if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "61d84e08efb59fa005a3cba32347551c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "61d84e08efb59fa005a3cba32347551c");
                } else if (a2 != null && a2.a() == 0) {
                    com.sankuai.xm.login.beans.a aVar2 = a2.g;
                    a3.c(a2.b);
                    if (aVar2 instanceof com.sankuai.xm.login.beans.e) {
                        a3.b(a2.b);
                    } else if (aVar2 instanceof com.sankuai.xm.login.beans.b) {
                        String str4 = ((com.sankuai.xm.login.beans.b) aVar2).g;
                        a3.g(str4);
                        long j2 = a2.b;
                        Object[] objArr4 = {new Long(j2), str4};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.login.a.a;
                        if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "3e30db49bdf56a9e82d327b5fcc6b4a4", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "3e30db49bdf56a9e82d327b5fcc6b4a4");
                        } else if (j2 != 0 && !ac.a(str4)) {
                            com.sankuai.xm.base.service.f b = m.b();
                            b.a("xm_sdk_thirdUserId_" + str4, j2);
                        }
                    }
                    a3.c(a2.c);
                    String str5 = a2.d;
                    Object[] objArr5 = {str5};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.xm.login.a.a;
                    if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "c65586ab7310a09ac45f9925d28ab89b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "c65586ab7310a09ac45f9925d28ab89b");
                    } else if (!ac.a(str5)) {
                        try {
                            JSONObject jSONObject = new JSONObject(str5);
                            ((com.sankuai.xm.base.a) a3.s().a()).i = str5;
                            ((com.sankuai.xm.base.a) a3.s().a()).h = jSONObject.optString("deviceId", a3.k());
                        } catch (JSONException e) {
                            com.sankuai.xm.login.d.a(e);
                        }
                    }
                    a3.a(a2.e);
                    HashMap<Short, Integer> hashMap3 = a2.f;
                    Object[] objArr6 = {hashMap3};
                    ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.xm.login.a.a;
                    if (PatchProxy.isSupport(objArr6, a3, changeQuickRedirect6, false, "332c5adc22ac7ed24977ede7f6653123", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr6, a3, changeQuickRedirect6, false, "332c5adc22ac7ed24977ede7f6653123");
                    } else if (hashMap3 != null) {
                        synchronized (a3) {
                            a3.e.clear();
                            a3.e.putAll(hashMap3);
                        }
                    }
                    a3.e(a2.b);
                    a3.a(a2.b, a2.e);
                }
                this.f.a_(a2);
            } else {
                com.sankuai.xm.login.d.c("ConnectionChannel::onAuthRes:: status is wrong, status = " + i2, new Object[0]);
            }
        } finally {
            j.c(gVar);
        }
    }

    private long f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "489efbed2bdf5d6fa85afbaf5590cea3", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "489efbed2bdf5d6fa85afbaf5590cea3")).longValue();
        }
        g gVar = this.l;
        if (gVar == null) {
            return 0L;
        }
        return gVar.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a {
        public static ChangeQuickRedirect a;
        e b;
        int c;
        com.sankuai.xm.login.net.mempool.heap.b d;
        int e;
        int f;
        private int h;

        public a() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56937704ef651c81f9d27d65640f690c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56937704ef651c81f9d27d65640f690c");
                return;
            }
            this.c = 0;
            this.d = null;
            this.e = 0;
            this.f = 0;
            this.h = 0;
            this.b = new e();
        }

        public final byte[] a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7bb690c0460b08ee8970e6a356273e9", 6917529027641081856L) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7bb690c0460b08ee8970e6a356273e9") : this.b.d;
        }

        public final short b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7349b26a83dc8ed882bc889b0ee9110a", 6917529027641081856L) ? ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7349b26a83dc8ed882bc889b0ee9110a")).shortValue() : this.b.c;
        }

        public final synchronized void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75eee942859c9f6030a7aaaac3dab28b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75eee942859c9f6030a7aaaac3dab28b");
            } else if (z) {
                this.h = 0;
            } else {
                this.h++;
            }
        }

        private boolean c() {
            boolean z;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56240fe3df69be1a5665b6b52898a8b1", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56240fe3df69be1a5665b6b52898a8b1")).booleanValue();
            }
            synchronized (this) {
                z = this.h >= 3;
            }
            return z && this.b.c();
        }

        public final int a(com.sankuai.xm.login.net.mempool.heap.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec958dc22523f4d251a6aedda5ad0663", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec958dc22523f4d251a6aedda5ad0663")).intValue();
            }
            try {
                if (this.b.c == 3) {
                    bVar = this.b.a(bVar);
                }
                int g = bVar.g();
                if ((this.d.b() - this.e) - this.f < bVar.d()) {
                    a(Math.max(this.d.b() * 2, this.d.b() + bVar.d()));
                }
                this.d.a(this.e + this.f);
                this.d.a(bVar);
                this.d.a(this.e);
                this.f += g;
                while (this.f > 8) {
                    int r = this.d.r();
                    int r2 = this.d.r();
                    com.sankuai.xm.login.d.b("ConnectionChannel::ProtoEncrypt::mLen/len=" + this.f + CommonConstant.Symbol.COMMA + r + ", uri = " + r2);
                    if (r <= 65536 && r >= 10) {
                        if (r > this.f) {
                            com.sankuai.xm.login.d.a("ConnectionChannel::ProtoEncrypt::decryptAndParseBuffer:: test len=" + r + " mLen=" + this.f);
                            this.d.a(this.e);
                            a(this.c);
                            return 0;
                        }
                        this.d.a(this.e);
                        byte[] bArr = new byte[r];
                        this.d.a(bArr);
                        if (this.b.c != 3) {
                            bArr = this.b.c(bArr);
                        }
                        if (this.b.b()) {
                            e.a();
                            this.d.e();
                            this.f = 0;
                            this.e = 0;
                            com.sankuai.xm.login.d.c("ConnectionChannel::ProtoEncrypt::checkDecryptError, uri = " + r2, new Object[0]);
                            return -3;
                        }
                        b.a(b.this, r2, bArr);
                        if (c()) {
                            e.a();
                            this.d.e();
                            this.f = 0;
                            this.e = 0;
                            com.sankuai.xm.login.d.c("ConnectionChannel::ProtoEncrypt::checkInconsistentError, uri = " + r2, new Object[0]);
                            return -4;
                        }
                        this.e += r;
                        this.f -= r;
                        if (this.f == 0) {
                            this.d.e();
                            this.e = 0;
                        } else if (this.e > 8192) {
                            a(Math.max(this.f, this.c));
                        }
                    }
                    com.sankuai.xm.login.d.d("ConnectionChannel::ProtoEncrypt::parseBuffer:: mLinkId=" + b.this.g + ", len=" + r + ", uri=" + r2, new Object[0]);
                    this.d.e();
                    this.f = 0;
                    this.e = 0;
                    return -2;
                }
                return 0;
            } catch (Throwable th) {
                com.sankuai.xm.login.d.a(th, "ConnectionChannel::decryptAndParseBuffer", new Object[0]);
                e.a(2, th.toString());
                return -2;
            }
        }

        public final void b(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8388a8f2e92de36168c4f42817fe0b99", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8388a8f2e92de36168c4f42817fe0b99");
                return;
            }
            com.sankuai.xm.login.d.a("ConnectionChannel::ProtoEncrypt::setUseCipher:: use=" + z);
            this.b.e = z;
        }

        private void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a425bb73b9d5f1c6fa5ef06b54aac640", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a425bb73b9d5f1c6fa5ef06b54aac640");
            } else if (i < 0) {
                String str = "ConnectionChannel::shuffle, error size = " + i;
                com.sankuai.xm.login.d.c(str, new Object[0]);
                throw new RuntimeException(str);
            } else {
                com.sankuai.xm.login.net.mempool.heap.b a2 = com.sankuai.xm.login.net.mempool.heap.c.a().a(i);
                a2.o();
                a2.a(this.d, this.e, this.f);
                a2.a(0);
                this.e = 0;
                this.d.p();
                this.d = a2;
                this.c = i;
            }
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09e8491e16427d0cccb479541e02aaff", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09e8491e16427d0cccb479541e02aaff")).booleanValue();
        }
        int i = this.c;
        return i == 1 || i == 2 || i == 3;
    }
}
