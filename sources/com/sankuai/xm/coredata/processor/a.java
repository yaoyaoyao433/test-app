package com.sankuai.xm.coredata.processor;

import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.d;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.proto.protobase.e;
import com.sankuai.xm.base.proto.protosingal.w;
import com.sankuai.xm.base.proto.send.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.annotation.TraceStatus;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.coredata.bean.BaseDataMsg;
import com.sankuai.xm.coredata.bean.DataMessage;
import com.sankuai.xm.coredata.bean.TTMessage;
import com.sankuai.xm.coredata.offline.a;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.sankuai.xm.im.message.bean.MsgAddition;
import com.sankuai.xm.login.manager.h;
import com.tencent.mapsdk.internal.ki;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends h {
    public static ChangeQuickRedirect a;
    public final List<InterfaceC1380a> b;
    public final List<b> c;
    public volatile boolean d;
    private com.sankuai.xm.coredata.processor.b g;
    private com.sankuai.xm.coredata.offline.a h;
    private volatile boolean i;
    private final List<Long> j;
    private com.sankuai.xm.coredata.processor.c k;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.coredata.processor.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC1380a {
        void a(int i, DataMessage dataMessage);

        void a(List<DataMessage> list, boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        void a(int i, TTMessage tTMessage);

        void a(List<TTMessage> list);
    }

    @Override // com.sankuai.xm.login.manager.a
    public final void a(long j, int i) {
    }

    @Override // com.sankuai.xm.login.manager.a
    public final void a(boolean z) {
    }

    @Override // com.sankuai.xm.login.manager.a
    public final void c(int i) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class c {
        private static a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3426bd08c54c33264297f61f11ed4ea", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3426bd08c54c33264297f61f11ed4ea") : c.a;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bd9d21974c60a51a7e26482c9708487", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bd9d21974c60a51a7e26482c9708487");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = true;
        this.i = false;
        this.j = new ArrayList();
        this.h = new com.sankuai.xm.coredata.offline.a(this);
        if (f.m().c != 1) {
            this.d = true;
        }
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a102793363dc385ea541347558f64ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a102793363dc385ea541347558f64ee");
        } else if (this.i) {
        } else {
            this.i = true;
            com.sankuai.xm.c a2 = com.sankuai.xm.c.a();
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.c.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "02a0df0ed3ff9dde392c7d02c5aa140f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "02a0df0ed3ff9dde392c7d02c5aa140f");
                return;
            }
            if (a2.p()) {
                ((com.sankuai.xm.login.manager.f) a2.n().a()).a(this);
            }
        }
    }

    public final void a(com.sankuai.xm.coredata.processor.c cVar) {
        this.k = cVar;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0d648955dfc87e4a1c493aeada2a6ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0d648955dfc87e4a1c493aeada2a6ad");
            return;
        }
        synchronized (this.j) {
            this.j.clear();
        }
        if ((f.m().j & 4) != 0) {
            com.sankuai.xm.coredata.offline.a aVar = this.h;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.coredata.offline.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d44e5f6ac26bf671dffcdca3db96591f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d44e5f6ac26bf671dffcdca3db96591f");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("u", Long.valueOf(com.sankuai.xm.c.a().l()));
            hashMap.put("ai", Short.valueOf(com.sankuai.xm.c.a().k()));
            hashMap.put(MsgAddition.DT, (byte) 1);
            hashMap.put("od", 0);
            hashMap.put("os", 0);
            hashMap.put("lm", 200);
            hashMap.put("ls", Long.valueOf(com.sankuai.xm.c.a().a(System.currentTimeMillis())));
            hashMap.put("svid", (short) 1101);
            d dVar = new d(com.sankuai.xm.network.setting.f.a().b().a(false) + "/msg/api/data/v1/offline", hashMap, (com.sankuai.xm.network.httpurlconnection.d) null);
            dVar.a(new a.C1379a(dVar));
            dVar.a(new com.sankuai.xm.network.httpurlconnection.retry.a());
            dVar.l = 1;
            m.f().b(dVar);
        }
    }

    @Trace(name = "send_data_start", type = i.send)
    public void a(DataMessage dataMessage) {
        Object[] objArr = {dataMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f139cb78ed30955aae0343f6fe2bf002", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f139cb78ed30955aae0343f6fe2bf002");
            return;
        }
        try {
            j.a(i.send, "send_data_start", (String[]) null, new Object[]{dataMessage});
            com.sankuai.xm.b.a("DataMessageProcessor::sendDataMessage message:" + dataMessage.toString(), new Object[0]);
            a((short) 1101, com.sankuai.xm.coredata.util.a.a(dataMessage).bS_());
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    public final int b(DataMessage dataMessage) {
        com.sankuai.xm.base.proto.protobase.f fVar;
        Object[] objArr = {dataMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2eae3a7c7e916f9e56355479de392bd", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2eae3a7c7e916f9e56355479de392bd")).intValue();
        }
        if (dataMessage == null || dataMessage.getMsgId() <= 0) {
            com.sankuai.xm.b.b("DataMessageProcessor::sendDataMessage ERR_PARAM", new Object[0]);
            return 10011;
        }
        synchronized (this.j) {
            if (this.j.contains(Long.valueOf(dataMessage.getMsgId()))) {
                com.sankuai.xm.b.a("DataMessageProcessor::sendDataMessageAck repeat message:" + dataMessage.toString(), new Object[0]);
                return 0;
            }
            this.j.add(Long.valueOf(dataMessage.getMsgId()));
            if (this.j.size() > 100) {
                this.j.remove(0);
            }
            Object[] objArr2 = {dataMessage};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.coredata.util.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fc8d7eb640fd093d44b0e22bde76f706", 6917529027641081856L)) {
                fVar = (e) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fc8d7eb640fd093d44b0e22bde76f706");
            } else {
                com.sankuai.xm.base.proto.data.a aVar = new com.sankuai.xm.base.proto.data.a();
                aVar.c(com.sankuai.xm.login.a.a().d);
                long j = com.sankuai.xm.login.a.a().b;
                Object[] objArr3 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.base.proto.data.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "c1a929d96ec5a6e29a7a7d51337ba81d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "c1a929d96ec5a6e29a7a7d51337ba81d");
                } else {
                    aVar.b = j;
                }
                aVar.e = (byte) 1;
                aVar.d = dataMessage.getType();
                aVar.c = new long[]{dataMessage.getMsgId()};
                aVar.f = dataMessage.getData();
                fVar = aVar;
            }
            com.sankuai.xm.b.a("DataMessageProcessor::sendDataMessageAck message:" + dataMessage.toString(), new Object[0]);
            a((short) 1101, fVar.bS_());
            return 0;
        }
    }

    public final int a(BaseDataMsg baseDataMsg) {
        com.sankuai.xm.base.proto.send.b bVar;
        Object[] objArr = {baseDataMsg};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d60e073f2a7756ff5ea3aafc3f0a8a81", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d60e073f2a7756ff5ea3aafc3f0a8a81")).intValue();
        }
        if (baseDataMsg instanceof DataMessage) {
            a((DataMessage) baseDataMsg);
            return RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT;
        } else if (baseDataMsg instanceof TTMessage) {
            TTMessage tTMessage = (TTMessage) baseDataMsg;
            tTMessage.setRetries(tTMessage.getRetries() + 1);
            Object[] objArr2 = {tTMessage};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c36c1477c8061f1038f677bb71ae245", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c36c1477c8061f1038f677bb71ae245");
                return RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT;
            }
            try {
                j.a(i.send, "send_data_start", (String[]) null, new Object[]{tTMessage});
                com.sankuai.xm.b.a("DataMessageProcessor::sendTTMessage message:" + tTMessage.toString(), new Object[0]);
                Object[] objArr3 = {tTMessage};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.coredata.util.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "aa2a766d6b8eb9e65b0f56385f912eea", 6917529027641081856L)) {
                    bVar = (com.sankuai.xm.base.proto.send.b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "aa2a766d6b8eb9e65b0f56385f912eea");
                } else {
                    l lVar = new l();
                    lVar.b(tTMessage.getData());
                    ((com.sankuai.xm.base.proto.protobase.c) lVar.x()).c = com.sankuai.xm.login.a.a().d;
                    lVar.a(tTMessage.getMsgUuid());
                    lVar.a((byte) 1);
                    lVar.a(com.sankuai.xm.login.a.a().b);
                    lVar.b(tTMessage.getToUid());
                    lVar.b((short) 0);
                    lVar.d(tTMessage.getCts());
                    lVar.e(0L);
                    lVar.b((byte) tTMessage.getRetries());
                    lVar.b(2);
                    bVar = lVar;
                }
                a((short) 410, bVar.bS_());
                j.a((Object) null);
                return RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT;
            } catch (Throwable th) {
                j.a(th);
                throw th;
            }
        } else {
            return RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT;
        }
    }

    @Trace(name = "notify_data", type = i.end)
    private void b(List<DataMessage> list, boolean z) {
        ArrayList<InterfaceC1380a> arrayList;
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a061bb6871448148dc650877f5a19c9a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a061bb6871448148dc650877f5a19c9a");
            return;
        }
        try {
            j.a(i.end, "notify_data", (String[]) null, new Object[]{list, new Boolean(z)});
            if (com.sankuai.xm.base.util.b.a(list)) {
                j.a((Object) null);
                return;
            }
            synchronized (this) {
                arrayList = new ArrayList(this.b);
            }
            for (InterfaceC1380a interfaceC1380a : arrayList) {
                interfaceC1380a.a(list, z);
            }
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    @Trace(name = "notify_data", type = i.end)
    private void a(int i, DataMessage dataMessage) {
        ArrayList<InterfaceC1380a> arrayList;
        Object[] objArr = {Integer.valueOf(i), dataMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80f703ac0b079bb5f4e043a760ec62bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80f703ac0b079bb5f4e043a760ec62bc");
            return;
        }
        try {
            j.a(i.end, "notify_data", (String[]) null, new Object[]{new Integer(i), dataMessage});
            synchronized (this) {
                arrayList = new ArrayList(this.b);
            }
            for (InterfaceC1380a interfaceC1380a : arrayList) {
                interfaceC1380a.a(i, dataMessage);
            }
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    @Trace(name = "notify_data", type = i.end)
    private void a(List<TTMessage> list) {
        ArrayList<b> arrayList;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa921a07b7727c83b1198d2f0c504da1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa921a07b7727c83b1198d2f0c504da1");
            return;
        }
        try {
            j.a(i.end, "notify_data", (String[]) null, new Object[]{list});
            if (com.sankuai.xm.base.util.b.a(list)) {
                j.a((Object) null);
                return;
            }
            synchronized (this) {
                arrayList = new ArrayList(this.c);
            }
            for (b bVar : arrayList) {
                bVar.a(list);
            }
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    private void a(int i, TTMessage tTMessage) {
        ArrayList<b> arrayList;
        Object[] objArr = {Integer.valueOf(i), tTMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2a3ee6c3518468b1582f8ef409a428e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2a3ee6c3518468b1582f8ef409a428e");
            return;
        }
        synchronized (this) {
            arrayList = new ArrayList(this.c);
        }
        for (b bVar : arrayList) {
            bVar.a(i, tTMessage);
        }
    }

    @Override // com.sankuai.xm.login.manager.a
    public final void a(int i, byte[] bArr) {
        TTMessage tTMessage;
        Object[] objArr = {Integer.valueOf(i), bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c3952a0bace460fe025e42e20508d2e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c3952a0bace460fe025e42e20508d2e");
            return;
        }
        try {
            switch (i) {
                case 26869769:
                    Object[] objArr2 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56392a1d2393ec43c86fa9ada07aae59", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56392a1d2393ec43c86fa9ada07aae59");
                        return;
                    }
                    j.a(i.recv, "recv_data", "data_msg", 0L, "recv", new Object[]{bArr});
                    l lVar = new l();
                    lVar.a(bArr);
                    j.a(MessageStatisticsEntry.PARAM_MSG_ID, Long.valueOf(lVar.k()));
                    j.a("category", ki.d);
                    Object[] objArr3 = {lVar};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.coredata.util.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b2fc2e4d72e7483c40dd262d9d31fd73", 6917529027641081856L)) {
                        tTMessage = (TTMessage) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b2fc2e4d72e7483c40dd262d9d31fd73");
                    } else {
                        tTMessage = new TTMessage();
                        tTMessage.setData(lVar.g());
                        tTMessage.setMsgId(lVar.k());
                        tTMessage.setFromUid(lVar.d());
                        tTMessage.setFromAppId(((com.sankuai.xm.base.proto.protobase.c) lVar.x()).c);
                        tTMessage.setToUid(lVar.e());
                        tTMessage.setCts(lVar.j());
                        tTMessage.setToAppId(lVar.q());
                        tTMessage.setMsgUuid(lVar.c());
                        tTMessage.setPushType(lVar.r());
                    }
                    a(com.sankuai.xm.base.util.b.a(tTMessage));
                    j.a((Object) null);
                    return;
                case 26869770:
                    Object[] objArr4 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c7fb4d548141d015fd3cc4a2191e7dde", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c7fb4d548141d015fd3cc4a2191e7dde");
                        return;
                    }
                    j.a(i.recv, "recv_data_ack", "data_msg", 0L, "send", new Object[]{bArr});
                    com.sankuai.xm.base.proto.send.m mVar = new com.sankuai.xm.base.proto.send.m();
                    mVar.a(bArr);
                    a(mVar.e(), mVar.b(), mVar.c(), mVar.d());
                    j.a((Object) null);
                    return;
                case 72155137:
                    Object[] objArr5 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "54ab30363f14ce8e36a149f6d406ab6d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "54ab30363f14ce8e36a149f6d406ab6d");
                        return;
                    }
                    j.a(i.recv, "recv_data", "data_msg", 0L, "recv", new Object[]{bArr});
                    com.sankuai.xm.base.proto.data.d dVar = new com.sankuai.xm.base.proto.data.d();
                    dVar.a(bArr);
                    j.a(MessageStatisticsEntry.PARAM_MSG_ID, Long.valueOf(dVar.c));
                    j.a("category", "data");
                    j.a("type", Integer.valueOf(dVar.b));
                    a(com.sankuai.xm.base.util.b.a(com.sankuai.xm.coredata.util.a.a(dVar)), false);
                    j.a((Object) null);
                    return;
                case 72155147:
                    Object[] objArr6 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "824c7e0b361ce4731544288f7b26af2a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "824c7e0b361ce4731544288f7b26af2a");
                        return;
                    }
                    j.a(i.recv, "recv_data_ack", "data_msg", 0L, "send", new Object[]{bArr});
                    com.sankuai.xm.base.proto.data.c cVar = new com.sankuai.xm.base.proto.data.c();
                    cVar.a(bArr);
                    a(cVar.d, cVar.e, cVar.b, cVar.c);
                    j.a((Object) null);
                    return;
                default:
                    return;
            }
        } catch (Exception e) {
            Object[] objArr7 = new Object[0];
            Object[] objArr8 = {e, "DataMessageProcessor::onData", objArr7};
            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.xm.b.a;
            if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect7, true, "c4d5bad89517285d696ab47ad9d91c35", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect7, true, "c4d5bad89517285d696ab47ad9d91c35");
            } else {
                com.sankuai.xm.log.a.a().a("imcoredata", e, "DataMessageProcessor::onData", objArr7);
            }
        }
    }

    @Override // com.sankuai.xm.login.manager.a
    public final void a(com.sankuai.xm.login.beans.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49528042530d6d781669cef38f9d61df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49528042530d6d781669cef38f9d61df");
        } else if (cVar.a() == 0 && b(0)) {
            c();
        }
    }

    private void a(short s, byte[] bArr) {
        Object[] objArr = {Short.valueOf(s), bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bec037e445381144d616e4db36cf952", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bec037e445381144d616e4db36cf952");
        } else if (!b(-2)) {
            com.sankuai.xm.b.a("DataMessageProcessor::sendTransUp not allowed", new Object[0]);
        } else {
            w wVar = new w();
            wVar.c(com.sankuai.xm.c.a().k());
            wVar.b = s;
            wVar.a(com.sankuai.xm.c.a().l());
            wVar.c = bArr;
            wVar.d = com.sankuai.xm.c.a().d();
            long b2 = com.sankuai.xm.base.util.c.b();
            com.sankuai.xm.b.a("DataMessageProcessor::sendTransUp svid=%s, traceId=%s", Short.valueOf(s), Long.valueOf(b2));
            wVar.b(b2);
            com.sankuai.xm.c.a().a(wVar.bS_());
        }
    }

    public final void a(@TraceStatus int i, String str, long j, long j2) {
        Object[] objArr = {Integer.valueOf(i), str, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6435d5a5a64ef6aae7564be4e2a6eab2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6435d5a5a64ef6aae7564be4e2a6eab2");
            return;
        }
        j.a(new Integer(i), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
        com.sankuai.xm.b.a("DataMessageProcessor::onSendDataMessageResult code:" + i + " msgUuid:" + str + " msgId:" + j + " cts:" + j2, new Object[0]);
        BaseDataMsg baseDataMsg = (BaseDataMsg) d().a(str);
        if (baseDataMsg == null) {
            com.sankuai.xm.b.b("DataMessageProcessor::onSendDataMessageResult get object fail msgUuid:" + str + " msgId" + j, new Object[0]);
            return;
        }
        baseDataMsg.setCts(j2);
        baseDataMsg.setMsgId(j);
        if (baseDataMsg instanceof DataMessage) {
            a(i, (DataMessage) baseDataMsg);
        } else if (baseDataMsg instanceof TTMessage) {
            a(i, (TTMessage) baseDataMsg);
        }
    }

    public final void a(List<DataMessage> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ece9f619cf0071e225ac5fd0db4596a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ece9f619cf0071e225ac5fd0db4596a9");
        } else if (com.sankuai.xm.base.util.b.a(list)) {
            com.sankuai.xm.b.b("DataMessageProcessor::onReceiveDataMessage isOffline:" + z, new Object[0]);
        } else {
            com.sankuai.xm.b.a("DataMessageProcessor::onReceiveDataMessage isOffline:" + z + " messages:" + list.toString(), new Object[0]);
            b(list);
            ArrayList arrayList = new ArrayList();
            if (this.k != null) {
                for (DataMessage dataMessage : list) {
                    if (!this.k.a(dataMessage, z)) {
                        arrayList.add(dataMessage);
                    }
                }
            } else {
                arrayList.addAll(list);
            }
            b(arrayList, z);
        }
    }

    @Trace(name = "send_data_ack", type = i.send)
    private void b(List<DataMessage> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58bdaf2a606b22e94662ed65ac822ffb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58bdaf2a606b22e94662ed65ac822ffb");
            return;
        }
        try {
            j.a(i.send, "send_data_ack", (String[]) null, new Object[]{list});
            if (!com.sankuai.xm.base.util.b.a(list) && this.d) {
                com.sankuai.xm.b.a("DataMessageProcessor::autoSendDataMessageAck size:" + list.size(), new Object[0]);
                j.a("count", Integer.valueOf(list.size()));
                for (DataMessage dataMessage : list) {
                    b(dataMessage);
                }
                j.a((Object) null);
                return;
            }
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    public com.sankuai.xm.coredata.processor.b d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ce4ffb0c8c83764d4bd608bca79adc0", 6917529027641081856L)) {
            return (com.sankuai.xm.coredata.processor.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ce4ffb0c8c83764d4bd608bca79adc0");
        }
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
                    this.g = new com.sankuai.xm.coredata.processor.b(this);
                }
            }
        }
        return this.g;
    }
}
