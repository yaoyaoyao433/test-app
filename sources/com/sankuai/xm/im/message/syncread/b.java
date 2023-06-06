package com.sankuai.xm.im.message.syncread;

import android.content.SharedPreferences;
import android.util.Base64;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.d;
import com.sankuai.xm.base.proto.protobase.e;
import com.sankuai.xm.base.proto.protobase.g;
import com.sankuai.xm.base.proto.syncread.f;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.annotation.TraceStatus;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.c;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.cache.bean.DBSession;
import com.sankuai.xm.im.cache.bean.DBSyncRead;
import com.sankuai.xm.im.cache.n;
import com.sankuai.xm.im.cache.o;
import com.sankuai.xm.im.message.a;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.sankuai.xm.im.message.bean.SyncRead;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.session.a;
import com.sankuai.xm.im.utils.MessageUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    public static ChangeQuickRedirect a;
    private final Object b;
    private Map<String, com.sankuai.xm.base.proto.syncread.a> c;
    private C1392b d;
    private long e;
    private long f;

    public static /* synthetic */ Map a(b bVar, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "6531dff0dffd05d65a134b9f8000095b", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "6531dff0dffd05d65a134b9f8000095b");
        }
        if (com.sankuai.xm.base.util.b.a((Collection<?>) list)) {
            return new HashMap();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(SessionId.a((DBSession) it.next()).f());
        }
        Map<String, DBSyncRead> a2 = DBProxy.l().l.a(arrayList);
        return a2 != null ? a2 : new HashMap();
    }

    public static /* synthetic */ void a(b bVar, Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "f429e129d6e2a144fd1ec7ff273e4b65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "f429e129d6e2a144fd1ec7ff273e4b65");
        } else if (DBProxy.l().l == null) {
            com.sankuai.xm.im.utils.a.d("SyncReadController::syncToServer, DBProxy.getInstance().getSyncReadDBProxy() == null", new Object[0]);
            if (callback != null) {
                callback.onFailure(1, "DB not ready!");
            }
        } else {
            List<DBSyncRead> b = DBProxy.l().l.b();
            if (b == null || b.isEmpty()) {
                if (callback != null) {
                    callback.onSuccess("no data need sync to server");
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int i = 0;
            for (DBSyncRead dBSyncRead : b) {
                if (dBSyncRead.getRsts() <= dBSyncRead.getLsts() && dBSyncRead.getLsts() != 0) {
                    e dbSyncRead2PSyncRead = MessageUtils.dbSyncRead2PSyncRead(dBSyncRead);
                    if (dbSyncRead2PSyncRead == null) {
                        g dbSyncRead2PSyncRead2 = MessageUtils.dbSyncRead2PSyncRead2(dBSyncRead);
                        if (dbSyncRead2PSyncRead2 != null) {
                            if (dBSyncRead.getChatType() == 9) {
                                arrayList3.add((com.sankuai.xm.base.proto.syncread.v2.a) dbSyncRead2PSyncRead2);
                            } else {
                                arrayList4.add((com.sankuai.xm.base.proto.syncread.v2.b) dbSyncRead2PSyncRead2);
                            }
                        }
                    } else if (dBSyncRead.getChatType() == 3) {
                        arrayList2.add((com.sankuai.xm.base.proto.syncread.c) dbSyncRead2PSyncRead);
                    } else {
                        arrayList.add((com.sankuai.xm.base.proto.syncread.b) dbSyncRead2PSyncRead);
                    }
                    if (i == 0) {
                        com.sankuai.xm.im.utils.a.b("SyncReadController::syncToServer:" + dBSyncRead.toString(), new Object[0]);
                    } else {
                        com.sankuai.xm.im.utils.a.a("SyncReadController::syncToServer:" + dBSyncRead.toString(), new Object[0]);
                    }
                    i++;
                }
            }
            b.clear();
            if (i <= 0) {
                com.sankuai.xm.im.utils.a.b("SyncReadController::syncToServer:no data need sync to server", new Object[0]);
                if (callback != null) {
                    callback.onSuccess("no data need sync to server");
                }
            } else if (!IMClient.a().h().l()) {
                com.sankuai.xm.im.utils.a.d("SyncReadController::syncToServer::local update success, but remote fail, has not login", new Object[0]);
                com.sankuai.xm.base.callback.a.a(callback, "local update success, but remote fail, has not login");
            } else {
                bVar.a(callback, MessageUtils.obtainPSyncRead(arrayList, 100), MessageUtils.obtainPSyncRead(arrayList2, 100), MessageUtils.obtainPSyncRead2(arrayList3, 100), MessageUtils.obtainPSyncRead2(arrayList4, 100));
            }
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fabc93fb1c4aff1c7311f342dd36468d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fabc93fb1c4aff1c7311f342dd36468d");
            return;
        }
        this.b = new Object();
        this.c = new HashMap();
        this.d = new C1392b();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70ad1b59573e530d476ddbba6a7382c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70ad1b59573e530d476ddbba6a7382c3");
            return;
        }
        synchronized (this.b) {
            this.c.clear();
        }
        this.d.b();
    }

    public final void a(com.sankuai.xm.network.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d4806f7e3d8e0fbb84c0b14fa74082f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d4806f7e3d8e0fbb84c0b14fa74082f");
        } else {
            a(aVar, 1, 2);
        }
    }

    public final int a(com.sankuai.xm.base.proto.syncread.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ba41d51aa096f8fe640a55a652ee547", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ba41d51aa096f8fe640a55a652ee547")).intValue();
        }
        List<SyncRead> b = b(aVar);
        if (b == null || b.isEmpty()) {
            return 0;
        }
        c(b, null);
        return b.size();
    }

    public final void a(f fVar) {
        com.sankuai.xm.base.proto.syncread.a remove;
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fab826d32abb8965efa32afa8ebdb681", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fab826d32abb8965efa32afa8ebdb681");
        } else if (fVar == null) {
            com.sankuai.xm.im.utils.a.d("SyncReadController::onSyncServerRead, items = null", new Object[0]);
        } else {
            C1392b c1392b = this.d;
            c1392b.a(a.b.SYNC + CommonConstant.Symbol.COLON + fVar.b);
            synchronized (this.b) {
                remove = this.c.remove(fVar.b);
            }
            if (remove == null) {
                com.sankuai.xm.im.utils.a.b("SyncReadController::onSyncServerReadRes, syncReadRes not find valid PSyncRead, uuid = " + fVar.b, new Object[0]);
                return;
            }
            a(remove, 0);
            a(0, b(remove));
        }
    }

    public final void a(List<SessionId> list, final Callback<String> callback) {
        Object[] objArr = {list, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26839605809da294b78c58ca99b4b50b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26839605809da294b78c58ca99b4b50b");
        } else {
            b(list, new Callback<List<DBSyncRead>>() { // from class: com.sankuai.xm.im.message.syncread.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                @Trace(name = "update_session", type = i.end)
                public final /* synthetic */ void onSuccess(List<DBSyncRead> list2) {
                    List<DBSyncRead> list3 = list2;
                    Object[] objArr2 = {list3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6fa34565fddce511d303f85e195df38", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6fa34565fddce511d303f85e195df38");
                        return;
                    }
                    try {
                        j.a(i.end, "update_session", (String[]) null, new Object[]{list3});
                        b.a(b.this, callback);
                        j.a((Object) null);
                    } catch (Throwable th) {
                        j.a(th);
                        throw th;
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                @Trace(name = "update_session", type = i.end)
                public final void onFailure(@TraceStatus int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "257c94f813bc05dcdbdc0423812781f0", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "257c94f813bc05dcdbdc0423812781f0");
                        return;
                    }
                    try {
                        j.a(i.end, "update_session", (String[]) null, new Object[]{new Integer(i), str});
                        j.a(new Integer(i), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                        if (callback != null) {
                            callback.onFailure(i, str);
                        }
                        j.a((Object) null);
                    } catch (Throwable th) {
                        j.a(th);
                        throw th;
                    }
                }
            });
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8955ff39ff06f2dd1423558af9e229c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8955ff39ff06f2dd1423558af9e229c2");
            return;
        }
        synchronized (this.b) {
            this.c.clear();
        }
        SharedPreferences.Editor edit = com.sankuai.xm.im.utils.b.a().edit();
        if (edit == null) {
            com.sankuai.xm.im.utils.a.d("SyncReadController::cleanVersion, SharedPreferences.Editor == null", new Object[0]);
            return;
        }
        edit.remove("imlib_sync_read_stamp");
        com.sankuai.xm.im.utils.b.a(edit);
    }

    private void a(com.sankuai.xm.network.a aVar, int... iArr) {
        String a2;
        Object[] objArr = {aVar, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f34ba846cce2d4bb7628fd72e6eed4f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f34ba846cce2d4bb7628fd72e6eed4f6");
            return;
        }
        for (int i = 0; i < 2; i++) {
            int i2 = iArr[i];
            if (!a(i2)) {
                a((com.sankuai.xm.network.c) null, i2, 0);
                com.sankuai.xm.im.utils.a.b("SyncReadController::remoteSync: checkCondition false, category: %s", Integer.valueOf(i2));
            } else {
                long j = com.sankuai.xm.im.utils.b.a().getLong("imlib_sync_read_stamp", 1L);
                boolean z = j == 1;
                long a3 = !z ? j - DDLoadConstants.CACHE_INVALID_TIME : com.sankuai.xm.login.c.a().a(System.currentTimeMillis()) - 2592000000L;
                HashMap hashMap = new HashMap();
                switch (i2) {
                    case 1:
                        a2 = com.sankuai.xm.im.http.a.a("/read/api/v2/list");
                        hashMap.put("ts", Long.valueOf(a3));
                        hashMap.put("type", (short) 1);
                        break;
                    case 2:
                        a2 = com.sankuai.xm.im.http.a.a("/pubread/v3/user/chat/getUnread/byAppId");
                        hashMap.put("ts", Long.valueOf(a3));
                        hashMap.put("type", (short) 1);
                        hashMap.put("od", "desc");
                        break;
                    default:
                        a2 = null;
                        break;
                }
                d dVar = new d(a2, hashMap, (com.sankuai.xm.network.httpurlconnection.d) null);
                dVar.a(new a(dVar, i2, z));
                dVar.a(new com.sankuai.xm.network.httpurlconnection.retry.a());
                dVar.b(2);
                dVar.a(true);
                aVar.a(dVar);
            }
        }
    }

    private boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e825e333c3f85969ea0d4bbad5270c69", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e825e333c3f85969ea0d4bbad5270c69")).booleanValue();
        }
        switch (i) {
            case 1:
                return com.sankuai.xm.im.c.a(c.b.GROUP_CHAT) || com.sankuai.xm.im.c.a(c.b.PEER_CHAT);
            case 2:
                return com.sankuai.xm.im.c.a(c.b.PUB_CHAT);
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<SyncRead> b(com.sankuai.xm.base.proto.syncread.a aVar) {
        byte b = 1;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a70cbb2ebb75c248df973430fcbc7c5", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a70cbb2ebb75c248df973430fcbc7c5");
        }
        if (aVar == null || aVar.b() == null || aVar.b().length <= 0) {
            com.sankuai.xm.im.utils.a.c("SyncReadController::calculateSync,unknown SyncRead " + aVar, new Object[0]);
            return null;
        }
        byte[][] b2 = aVar.b();
        int d = aVar.d();
        if (d != 26279960) {
            if (d == 26279993) {
                b = 5;
            } else if (d == 26869803) {
                b = 2;
            } else if (d != 26869827) {
                com.sankuai.xm.im.utils.a.c("SyncReadController::calculateSync,unknown SyncRead : " + aVar, new Object[0]);
                return null;
            } else {
                b = 6;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : b2) {
            SyncRead obtainSyncRead = MessageUtils.obtainSyncRead(bArr, b);
            if (!obtainSyncRead.isValid()) {
                com.sankuai.xm.im.utils.a.c("SyncReadController::calculateSync,invalid SyncRead : " + obtainSyncRead.toString(), new Object[0]);
            } else if (arrayList.contains(obtainSyncRead)) {
                SyncRead syncRead = (SyncRead) arrayList.get(arrayList.indexOf(obtainSyncRead));
                if (syncRead == null) {
                    arrayList.add(obtainSyncRead);
                } else {
                    com.sankuai.xm.im.utils.a.c("SyncReadController::calculateSync,duplcate info, old/new rstamp=" + syncRead.getRsts() + "/" + obtainSyncRead.getRsts() + ",tmp=" + obtainSyncRead.toString(), new Object[0]);
                    if (syncRead.getRsts() < obtainSyncRead.getRsts()) {
                        syncRead.setRsts(obtainSyncRead.getRsts());
                    }
                }
            } else {
                arrayList.add(obtainSyncRead);
            }
        }
        return arrayList;
    }

    @Trace(name = "send_read", type = i.send)
    private void a(Callback<String> callback, List<com.sankuai.xm.base.proto.syncread.d> list, List<com.sankuai.xm.base.proto.syncread.d> list2, List<com.sankuai.xm.base.proto.syncread.v2.c> list3, List<com.sankuai.xm.base.proto.syncread.v2.c> list4) {
        int i;
        Object[] objArr = {callback, list, list2, list3, list4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0c7e9bf976c1a1ca3518c40a6bfde9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0c7e9bf976c1a1ca3518c40a6bfde9c");
            return;
        }
        try {
            j.a(i.send, "send_read", (String[]) null, new Object[]{callback, list, list2, list3, list4});
            if (list != null) {
                a(list);
                for (com.sankuai.xm.base.proto.syncread.d dVar : list) {
                    com.sankuai.xm.im.connection.c.a((short) 401, dVar.bS_());
                }
                i = list.size() + 0;
            } else {
                i = 0;
            }
            if (list2 != null) {
                a(list2);
                for (com.sankuai.xm.base.proto.syncread.d dVar2 : list2) {
                    com.sankuai.xm.im.connection.c.a((short) 410, dVar2.bS_());
                }
                i += list2.size();
            }
            if (list3 != null) {
                a(list3);
                for (com.sankuai.xm.base.proto.syncread.v2.c cVar : list3) {
                    com.sankuai.xm.im.connection.c.a((short) 401, cVar.bS_());
                }
                i += list3.size();
            }
            if (list4 != null) {
                a(list4);
                for (com.sankuai.xm.base.proto.syncread.v2.c cVar2 : list4) {
                    com.sankuai.xm.im.connection.c.a((short) 410, cVar2.bS_());
                }
                i += list4.size();
            }
            j.a("count", Integer.valueOf(i));
            com.sankuai.xm.base.callback.a.a(callback, "success");
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    private void a(List<? extends com.sankuai.xm.base.proto.syncread.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "082eb88b7503f04d1eb0f3a5e8c577df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "082eb88b7503f04d1eb0f3a5e8c577df");
        } else if (!com.sankuai.xm.base.util.b.a(list)) {
            synchronized (this.b) {
                for (com.sankuai.xm.base.proto.syncread.a aVar : list) {
                    this.c.put(aVar.c(), aVar);
                }
            }
            C1392b c1392b = this.d;
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = C1392b.c;
            if (PatchProxy.isSupport(objArr2, c1392b, changeQuickRedirect2, false, "cb07b61d4649595737fc0bba4cbc0d6f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, c1392b, changeQuickRedirect2, false, "cb07b61d4649595737fc0bba4cbc0d6f");
            } else if (!com.sankuai.xm.base.util.b.a(list)) {
                for (com.sankuai.xm.base.proto.syncread.a aVar2 : list) {
                    com.sankuai.xm.monitor.c.a("send_sync_read", aVar2.c());
                    a.C1389a c1389a = new a.C1389a();
                    c1389a.b = a.b.SYNC + CommonConstant.Symbol.COLON + aVar2.c();
                    c1389a.d = 15000L;
                    c1389a.e = 1;
                    c1389a.c = aVar2;
                    c1392b.a(c1389a);
                }
            }
        }
    }

    private void b(final List<SessionId> list, final Callback<List<DBSyncRead>> callback) {
        Object[] objArr = {list, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf77f87be88fa1aea44131b529956e6d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf77f87be88fa1aea44131b529956e6d");
        } else if (com.sankuai.xm.base.util.b.a(list)) {
            com.sankuai.xm.base.callback.a.a(callback, null);
        } else {
            DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.message.syncread.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eea736836aa98d566e5a49d8c119bd1b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eea736836aa98d566e5a49d8c119bd1b");
                        return;
                    }
                    List<DBSession> b = DBProxy.l().m.b(list);
                    if (com.sankuai.xm.base.util.b.a(b)) {
                        com.sankuai.xm.base.callback.a.a(callback, null);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    Map a2 = b.a(b.this, b);
                    for (DBSession dBSession : b) {
                        SessionId a3 = SessionId.a(dBSession);
                        SyncRead syncRead = new SyncRead(a3);
                        syncRead.setLsts(dBSession.getSts());
                        DBSyncRead dBSyncRead = (DBSyncRead) a2.get(a3.f());
                        if (dBSyncRead != null) {
                            if (dBSyncRead.getLsts() < syncRead.getLsts()) {
                                syncRead.setRsts(dBSyncRead.getRsts() < syncRead.getLsts() ? syncRead.getLsts() : dBSyncRead.getRsts());
                            }
                        }
                        arrayList.add(syncRead.transfer2DBObj());
                        o.b.a.a(syncRead.getSessionId());
                    }
                    DBProxy.l().l.a((com.sankuai.xm.base.db.c) null, arrayList, callback);
                }
            }), callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<SyncRead> list, final Callback<Void> callback) {
        Object[] objArr = {list, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8332fc918fbb87734dec9bc267f0d65e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8332fc918fbb87734dec9bc267f0d65e");
        } else if (com.sankuai.xm.base.util.b.a(list)) {
            com.sankuai.xm.base.callback.a.a(callback, null);
        } else {
            DBProxy.l().a(new com.sankuai.xm.im.message.syncread.a(list, new Callback<List<com.sankuai.xm.im.session.entry.a>>() { // from class: com.sankuai.xm.im.message.syncread.b.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(List<com.sankuai.xm.im.session.entry.a> list2) {
                    List<com.sankuai.xm.im.session.entry.a> list3 = list2;
                    Object[] objArr2 = {list3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc823abf75f80ea96086a6d25fd8b7ff", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc823abf75f80ea96086a6d25fd8b7ff");
                        return;
                    }
                    if (!com.sankuai.xm.base.util.b.a(list3)) {
                        IMClient.a().j().e(list3);
                    }
                    com.sankuai.xm.base.callback.a.a(callback, null);
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "073ad572d44662a9d61b1aba7e68a26a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "073ad572d44662a9d61b1aba7e68a26a");
                    } else {
                        com.sankuai.xm.base.callback.a.a(callback, i, str);
                    }
                }
            }), callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@TraceStatus int i, final List<? extends SyncRead> list) {
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d4a177c0e3ea4fc9dc54b293a299753", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d4a177c0e3ea4fc9dc54b293a299753");
            return;
        }
        j.a(new Integer(i), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
        if (i != 0 || list == null) {
            com.sankuai.xm.im.utils.a.d("SyncReadController::onSendRes, res = " + i, new Object[0]);
            return;
        }
        com.sankuai.xm.im.utils.a.b("SyncReadController::onSendRes, size = " + com.sankuai.xm.base.util.b.b(list), new Object[0]);
        DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.message.syncread.b.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11cc0de50cdd3f7e2c14643efaa1f7a7", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11cc0de50cdd3f7e2c14643efaa1f7a7");
                    return;
                }
                final ArrayList arrayList = new ArrayList();
                for (SyncRead syncRead : list) {
                    DBSyncRead a2 = DBProxy.l().l.a(syncRead.getChatKey());
                    if (a2 == null || a2.getLsts() > syncRead.getRsts() || a2.getRsts() > syncRead.getRsts()) {
                        com.sankuai.xm.im.utils.a.c("SyncReadController::onSendRes, sync记录已更新, " + syncRead.toString(), new Object[0]);
                    } else {
                        DBSyncRead transfer2DBObj = syncRead.transfer2DBObj();
                        transfer2DBObj.setLsts(a2.getLsts());
                        transfer2DBObj.setUpdateStamp(System.currentTimeMillis());
                        arrayList.add(transfer2DBObj);
                        com.sankuai.xm.im.utils.a.a("SyncReadController::onSendRes, " + transfer2DBObj.toString(), new Object[0]);
                    }
                }
                final n nVar = DBProxy.l().l;
                final String[] strArr = {SyncRead.REMOTE_SERVER_STAMP, "uts"};
                Object[] objArr3 = {arrayList, strArr, null};
                ChangeQuickRedirect changeQuickRedirect3 = n.a;
                if (PatchProxy.isSupport(objArr3, nVar, changeQuickRedirect3, false, "d177f86090e105f884b5a009ca7b2f59", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, nVar, changeQuickRedirect3, false, "d177f86090e105f884b5a009ca7b2f59");
                } else if (!arrayList.isEmpty()) {
                    nVar.c.a(j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.n.6
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            com.sankuai.xm.base.db.c cVar;
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "02eb587a9481bb55d48e4ab86889cdfe", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "02eb587a9481bb55d48e4ab86889cdfe");
                                return;
                            }
                            com.sankuai.xm.base.db.c cVar2 = null;
                            try {
                                try {
                                    cVar = nVar.c.bR_();
                                } catch (Exception e) {
                                    e = e;
                                }
                            } catch (Throwable th) {
                                th = th;
                                cVar = cVar2;
                            }
                            try {
                                nVar.c.a(cVar);
                                for (DBSyncRead dBSyncRead : arrayList) {
                                    cVar.a(DBSyncRead.TABLE_NAME, com.sankuai.xm.base.tinyorm.f.a().c.a(dBSyncRead, strArr), "chat_key=?", new String[]{dBSyncRead.getChatKey()});
                                }
                                nVar.c.b(cVar);
                                nVar.c.c(cVar);
                                if (r4 != null) {
                                    r4.onSuccess(arrayList);
                                }
                                if (IMClient.a().d()) {
                                    synchronized (nVar.b) {
                                        for (DBSyncRead dBSyncRead2 : arrayList) {
                                            nVar.d.put(dBSyncRead2.getChatKey(), dBSyncRead2);
                                        }
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                cVar2 = cVar;
                                nVar.c.a("SyncReadDBProxy:updateBySessionKey", e.toString());
                                throw new com.sankuai.xm.base.db.f(e);
                            } catch (Throwable th2) {
                                th = th2;
                                nVar.c.c(cVar);
                                if (r4 != null) {
                                    r4.onFailure(10019, "updateBySessionKey db error");
                                }
                                throw th;
                            }
                        }
                    }), (Callback) null);
                }
                arrayList.clear();
            }
        }), (Callback) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.sankuai.xm.base.proto.syncread.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deab2cddd8def90308adfd4956a49189", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deab2cddd8def90308adfd4956a49189");
        } else if (aVar == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("result", Integer.valueOf(i));
            hashMap.put("net", Integer.valueOf(com.sankuai.xm.base.util.net.d.a(IMClient.a().f())));
            hashMap.put(MessageStatisticsEntry.PARAM_RETRY, 0);
            if (aVar.d() == 26279960 || aVar.d() == 26279993) {
                hashMap.put("type", (short) 401);
            } else if (aVar.d() != 26869803 && aVar.d() != 26869827) {
                return;
            } else {
                hashMap.put("type", (short) 410);
            }
            com.sankuai.xm.monitor.c.a("send_sync_read", aVar.c(), (Map<String, Object>) hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Trace(name = "sync_read_end", type = i.normal)
    public void a(com.sankuai.xm.network.c cVar, int i, @TraceStatus int i2) {
        com.sankuai.xm.network.a h;
        int i3 = 1;
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43e7f2a397581d177e3a2dd7bbee85b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43e7f2a397581d177e3a2dd7bbee85b4");
            return;
        }
        try {
            j.a(i.normal, "sync_read_end", (String[]) null, new Object[]{cVar, new Integer(i), new Integer(i2)});
            j.a(new Integer(i2), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
            if (i2 != 0) {
                i3 = 16;
            }
            com.sankuai.xm.base.init.b.a(i3);
            j.a("type", Integer.valueOf(i));
            if (cVar != null && (h = cVar.h()) != null) {
                h.b(cVar);
            }
            com.sankuai.xm.im.utils.a.b("SyncReadController::remoteSyncFinished: category:" + i + ", code = " + i2, new Object[0]);
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    public final boolean a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44f790c5dce776c4ad65afbb379bf333", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44f790c5dce776c4ad65afbb379bf333")).booleanValue() : com.sankuai.xm.login.c.a().a(System.currentTimeMillis()) - j > b(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5b2943ba092f5a18a241c3c2faa98be", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5b2943ba092f5a18a241c3c2faa98be")).longValue();
        }
        switch (i) {
            case 1:
            case 5:
                this.e = this.e != 0 ? this.e : com.sankuai.xm.im.utils.b.a().getLong("im_expire", 2592000000L);
                return this.e;
            case 2:
            case 6:
                this.f = this.f != 0 ? this.f : com.sankuai.xm.im.utils.b.a().getLong("pub_expire", 2592000000L);
                return this.f;
            case 3:
            case 4:
            default:
                return 2592000000L;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends com.sankuai.xm.network.httpurlconnection.d {
        public static ChangeQuickRedirect a;
        d b;
        int c;
        long d;
        private int f;
        private boolean g;

        public a(d dVar, int i, boolean z) {
            Object[] objArr = {b.this, dVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "285601ca5f8da4997cfcdbbaf003d0c0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "285601ca5f8da4997cfcdbbaf003d0c0");
                return;
            }
            this.b = dVar;
            this.c = i;
            this.f = 0;
            this.g = z;
        }

        @Override // com.sankuai.xm.network.httpurlconnection.c
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "116ff60a3e30a8b2e6cab3803ea97952", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "116ff60a3e30a8b2e6cab3803ea97952");
                return;
            }
            super.a();
            int i = this.c;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5343d9792b7bab8e544d1dbd5427cf1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5343d9792b7bab8e544d1dbd5427cf1");
                return;
            }
            switch (i) {
                case 1:
                    com.sankuai.xm.im.utils.a.b("SyncReadController::pullStartEventReport IM", new Object[0]);
                    com.sankuai.xm.monitor.c.a("imscss", this.b.y());
                    return;
                case 2:
                    com.sankuai.xm.im.utils.a.b("SyncReadController::pullStartEventReport Pub", new Object[0]);
                    com.sankuai.xm.monitor.c.a("pbscss", this.b.y());
                    return;
                default:
                    return;
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(JSONObject jSONObject) throws Exception {
            long j;
            int a2;
            boolean z = true;
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "461dbbbb5b368f96622dfd27519702de", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "461dbbbb5b368f96622dfd27519702de");
                return;
            }
            com.sankuai.xm.base.util.net.c a3 = new com.sankuai.xm.base.util.net.c(jSONObject).a("data");
            ArrayList<com.sankuai.xm.base.proto.syncread.a> arrayList = new ArrayList();
            com.sankuai.xm.base.proto.syncread.a a4 = a(a3.b("sync_data"), false);
            if (a4 != null) {
                arrayList.add(a4);
            }
            com.sankuai.xm.base.proto.syncread.a a5 = a(a3.b("sync_data2"), true);
            if (a5 != null) {
                arrayList.add(a5);
            }
            if (this.c == 2 || this.c == 1) {
                long d = a3.d("nextTs");
                this.d = a3.d("expire");
                j = d;
            } else {
                j = 0;
            }
            final long a6 = IMClient.a().h().a(System.currentTimeMillis());
            final ArrayList arrayList2 = new ArrayList();
            if (!com.sankuai.xm.base.util.b.a((Collection<?>) arrayList)) {
                for (com.sankuai.xm.base.proto.syncread.a aVar : arrayList) {
                    List b = b.this.b(aVar);
                    if (b != null) {
                        arrayList2.addAll(b);
                    }
                }
                if (a(this.c)) {
                    a(arrayList2, this.d, a6);
                }
                this.f += arrayList2.size();
            }
            if (this.c == 2) {
                a2 = a.C1395a.b(3);
            } else {
                a2 = a.C1395a.a(2, 1);
            }
            if (j > 0 && this.f < a2) {
                z = false;
            }
            final boolean z2 = z;
            b.this.c(arrayList2, new Callback<Void>() { // from class: com.sankuai.xm.im.message.syncread.b.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Void r21) {
                    Object[] objArr2 = {r21};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8d7df068a69c025d5fc96dd7f9a19e7", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8d7df068a69c025d5fc96dd7f9a19e7");
                        return;
                    }
                    final a aVar2 = a.this;
                    int i = a.this.c;
                    long j2 = a.this.d;
                    Object[] objArr3 = {Integer.valueOf(i), new Long(j2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (!PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "034ebc5fd58b728be01c02ffe435ead4", 6917529027641081856L)) {
                        com.sankuai.xm.im.utils.a.b("SyncReadController::updateExpire: type" + i + ", expire:" + j2, new Object[0]);
                        if (j2 > 0) {
                            if (aVar2.a(i)) {
                                DBProxy.l().b(new c(i, 2592000000L, j2, new Callback<List<com.sankuai.xm.im.session.entry.a>>() { // from class: com.sankuai.xm.im.message.syncread.b.a.2
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.xm.base.callback.Callback
                                    public final void onFailure(int i2, String str) {
                                    }

                                    @Override // com.sankuai.xm.base.callback.Callback
                                    public final /* synthetic */ void onSuccess(List<com.sankuai.xm.im.session.entry.a> list) {
                                        List<com.sankuai.xm.im.session.entry.a> list2 = list;
                                        Object[] objArr4 = {list2};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6b6c78f5d9e01f182d79226bac8d0981", 6917529027641081856L)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6b6c78f5d9e01f182d79226bac8d0981");
                                        } else if (com.sankuai.xm.base.util.b.a(list2)) {
                                        } else {
                                            IMClient.a().j().e(list2);
                                        }
                                    }
                                }));
                            }
                            switch (i) {
                                case 1:
                                case 5:
                                    if (j2 != b.this.b(i) || j2 == 2592000000L) {
                                        b.this.e = Math.min(b.this.e, j2);
                                        com.sankuai.xm.im.utils.b.a(com.sankuai.xm.im.utils.b.a().a("im_expire", b.this.e));
                                        break;
                                    }
                                    break;
                                case 2:
                                case 6:
                                    if (j2 != b.this.b(i) || j2 == 2592000000L) {
                                        b.this.f = Math.min(b.this.f, j2);
                                        com.sankuai.xm.im.utils.b.a(com.sankuai.xm.im.utils.b.a().a("pub_expire", b.this.f));
                                        break;
                                    }
                                    break;
                            }
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "034ebc5fd58b728be01c02ffe435ead4");
                    }
                    if (z2) {
                        b.this.a(a.this.b, a.this.c, 0);
                    }
                    com.sankuai.xm.im.utils.b.a(com.sankuai.xm.im.utils.b.a().a("imlib_sync_read_stamp", a6));
                    a aVar3 = a.this;
                    int size = arrayList2.size();
                    int i2 = a.this.c;
                    boolean a7 = a.this.b.a();
                    Object[] objArr4 = {Integer.valueOf(size), Integer.valueOf(i2), Byte.valueOf(a7 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr4, aVar3, changeQuickRedirect4, false, "bc7b5567a4a1febf1e87e4f6438947ac", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, aVar3, changeQuickRedirect4, false, "bc7b5567a4a1febf1e87e4f6438947ac");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("count", Integer.valueOf(size));
                    hashMap.put("net", Integer.valueOf(com.sankuai.xm.base.util.net.d.c(IMClient.a().f())));
                    hashMap.put("msg", aVar3.b.l());
                    hashMap.put("seqId", aVar3.b.y());
                    if (a7) {
                        hashMap.put("type", 1);
                    }
                    switch (i2) {
                        case 1:
                            com.sankuai.xm.monitor.c.a("imscss", aVar3.b.y(), (Map<String, Object>) hashMap);
                            return;
                        case 2:
                            com.sankuai.xm.monitor.c.a("pbscss", aVar3.b.y(), (Map<String, Object>) hashMap);
                            return;
                        default:
                            return;
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4955b4558aafe2792ef2b71193bfbdb3", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4955b4558aafe2792ef2b71193bfbdb3");
                        return;
                    }
                    if (z2) {
                        b.this.a(a.this.b, a.this.c, i);
                    }
                    a aVar2 = a.this;
                    aVar2.a(i, aVar2.c, a.this.b.a());
                }
            });
            if (z) {
                return;
            }
            com.sankuai.xm.im.utils.a.b("SyncReadController::onSuccess,nextTs = " + j + CommonConstant.Symbol.COMMA + this.f, new Object[0]);
            this.b.a("nextTs", Long.valueOf(j));
            com.sankuai.xm.network.httpurlconnection.g.a().a((com.sankuai.xm.network.httpurlconnection.e) this.b, 0L);
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c221f1f9b4b8bdc7d471de80c8657621", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c221f1f9b4b8bdc7d471de80c8657621");
                return;
            }
            com.sankuai.xm.im.utils.a.d("SyncReadController::SyncReadCallback::onFailure, rescode=" + i, new Object[0]);
            a(i, this.c, this.b.a());
            b.this.a(this.b, this.c, i);
        }

        void a(int i, int i2, boolean z) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b597e51e2814701f0a3072fa7d972bf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b597e51e2814701f0a3072fa7d972bf");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("reason", Integer.valueOf(i));
            hashMap.put("net", Integer.valueOf(com.sankuai.xm.base.util.net.d.c(IMClient.a().f())));
            hashMap.put("msg", this.b.l());
            hashMap.put("seqId", this.b.y());
            if (z) {
                hashMap.put("type", 1);
            }
            switch (i2) {
                case 1:
                    com.sankuai.xm.monitor.c.a("imscer", hashMap);
                    com.sankuai.xm.monitor.c.b("imscss", this.b.y());
                    break;
                case 2:
                    com.sankuai.xm.monitor.c.a("pbscer", hashMap);
                    com.sankuai.xm.monitor.c.b("pbscss", this.b.y());
                    break;
            }
            com.sankuai.xm.im.utils.a.d("SyncReadController::SYNC_ERROR, " + hashMap.toString(), new Object[0]);
        }

        private com.sankuai.xm.base.proto.syncread.a a(String str, boolean z) {
            byte[] decode;
            Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85a7cb803853c1faf04c94340621d1d2", 6917529027641081856L)) {
                return (com.sankuai.xm.base.proto.syncread.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85a7cb803853c1faf04c94340621d1d2");
            }
            if (ac.a(str) || (decode = Base64.decode(str, 0)) == null) {
                return null;
            }
            if (z) {
                com.sankuai.xm.base.proto.syncread.v2.c cVar = new com.sankuai.xm.base.proto.syncread.v2.c();
                cVar.a(decode);
                return cVar;
            }
            com.sankuai.xm.base.proto.syncread.d dVar = new com.sankuai.xm.base.proto.syncread.d();
            dVar.a(decode);
            return dVar;
        }

        private void a(List<SyncRead> list, long j, long j2) {
            Object[] objArr = {list, new Long(j), new Long(j2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4df7c80b05b13d72ef5aaf8245254603", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4df7c80b05b13d72ef5aaf8245254603");
            } else if (!com.sankuai.xm.base.util.b.a(list) && j > 0) {
                long j3 = j2 - j;
                int i = 0;
                for (SyncRead syncRead : list) {
                    if (syncRead.getRsts() < j3) {
                        syncRead.setRsts(j3);
                        i++;
                    }
                }
                com.sankuai.xm.im.utils.a.b("SyncReadController::filterExpireData::filter size = " + i + "，type = " + this.c, new Object[0]);
            }
        }

        boolean a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cc6e54c3bb1f9683c0a53e82e8a72d5", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cc6e54c3bb1f9683c0a53e82e8a72d5")).booleanValue();
            }
            switch (i) {
                case 1:
                case 5:
                    if (com.sankuai.xm.im.utils.b.a().getLong("im_expire", 0L) != 0 || !this.g) {
                        return false;
                    }
                    break;
                case 2:
                case 6:
                    if (com.sankuai.xm.im.utils.b.a().getLong("pub_expire", 0L) != 0 || !this.g) {
                        return false;
                    }
                    break;
                case 3:
                case 4:
                default:
                    return false;
            }
            return true;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.im.message.syncread.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class C1392b extends com.sankuai.xm.im.message.a {
        public static ChangeQuickRedirect c;

        private C1392b() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71c27c7fde6d4585134c7f51a69ac140", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71c27c7fde6d4585134c7f51a69ac140");
            }
        }

        @Override // com.sankuai.xm.im.message.a
        public final void b(a.C1389a c1389a) {
            com.sankuai.xm.base.proto.syncread.a aVar;
            Object[] objArr = {c1389a};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c5968cf33c340ccee0be5ac37343d57", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c5968cf33c340ccee0be5ac37343d57");
            } else if (c1389a == null || !(c1389a.c instanceof com.sankuai.xm.base.proto.syncread.a)) {
            } else {
                com.sankuai.xm.base.proto.syncread.a aVar2 = (com.sankuai.xm.base.proto.syncread.a) c1389a.c;
                a(c1389a.b);
                synchronized (b.this.b) {
                    aVar = (com.sankuai.xm.base.proto.syncread.a) b.this.c.remove(aVar2.c());
                }
                if (aVar != null) {
                    b.this.a(aVar, 10020);
                    b.this.a(10020, b.this.b(aVar));
                    return;
                }
                com.sankuai.xm.im.utils.a.b("SyncReadController::onSyncServerReadRes, syncReadRes not find valid PSyncRead，" + c1389a, new Object[0]);
            }
        }
    }
}
