package com.sankuai.xm.im.message.opposite;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.v4.util.LruCache;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.proto.opposite.j;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.annotation.TraceStatus;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.c;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.cache.bean.DBPubOpposite;
import com.sankuai.xm.im.cache.h;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.network.httpurlconnection.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class PubOppositeController extends com.sankuai.xm.im.message.opposite.a {
    public static ChangeQuickRedirect b;
    public LruCache<SessionId, Long> c;
    private HashMap<Short, b> d;
    private f e;
    private volatile boolean f;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes6.dex */
    public interface OnPubOppositeChangeListener {
        void onOppositeChanged(long j, long j2, long j3, long j4);

        void onOppositeConfigChanged();
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes6.dex */
    public interface PubOppositeChangeListener {
        void onOppositeChanged(SessionId sessionId, long j, long j2);

        void onOppositeConfigChanged();
    }

    public static /* synthetic */ void a(PubOppositeController pubOppositeController) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, pubOppositeController, changeQuickRedirect, false, "a1cdc232de26e82e3eb2191abfcd0482", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, pubOppositeController, changeQuickRedirect, false, "a1cdc232de26e82e3eb2191abfcd0482");
        } else {
            com.sankuai.xm.base.e.a().edit().putLong(pubOppositeController.e(), System.currentTimeMillis()).apply();
        }
    }

    public static /* synthetic */ void a(PubOppositeController pubOppositeController, long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, pubOppositeController, changeQuickRedirect, false, "7168e7d14029eedf99a09e0b738edd9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, pubOppositeController, changeQuickRedirect, false, "7168e7d14029eedf99a09e0b738edd9b");
        } else {
            com.sankuai.xm.base.e.a().edit().putLong(pubOppositeController.j(), j).apply();
        }
    }

    public static /* synthetic */ void a(PubOppositeController pubOppositeController, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, pubOppositeController, changeQuickRedirect, false, "0050ace7415a086e1c87fd130f35d7ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, pubOppositeController, changeQuickRedirect, false, "0050ace7415a086e1c87fd130f35d7ea");
        } else {
            com.sankuai.xm.base.e.a().edit().putString(pubOppositeController.l(), str).apply();
        }
    }

    public static /* synthetic */ void a(PubOppositeController pubOppositeController, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, pubOppositeController, changeQuickRedirect, false, "60e9716798b752cc65870262948db459", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, pubOppositeController, changeQuickRedirect, false, "60e9716798b752cc65870262948db459");
        } else if (list == null) {
            com.sankuai.xm.im.utils.a.d("PubOppositeController::queryOppositeResult param error", new Object[0]);
        } else {
            com.sankuai.xm.im.utils.a.b("PubOppositeController::queryOppositeResult count:%d", Integer.valueOf(list.size()));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                com.sankuai.xm.im.utils.a.b("PubOppositeController::queryOppositeResult data:%s", cVar);
                pubOppositeController.b(cVar.b, cVar.c);
            }
        }
    }

    public static /* synthetic */ void a(PubOppositeController pubOppositeController, short s, long j) {
        Object[] objArr = {Short.valueOf(s), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, pubOppositeController, changeQuickRedirect, false, "1009ceab8bb16e5c4839e7942cc5ffd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, pubOppositeController, changeQuickRedirect, false, "1009ceab8bb16e5c4839e7942cc5ffd0");
        } else {
            com.sankuai.xm.base.e.a().edit().putLong(pubOppositeController.d(s), j).apply();
        }
    }

    public static /* synthetic */ void c(PubOppositeController pubOppositeController) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, pubOppositeController, changeQuickRedirect, false, "1ca25afd6f7f8d50210693d84aa1e36b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, pubOppositeController, changeQuickRedirect, false, "1ca25afd6f7f8d50210693d84aa1e36b");
            return;
        }
        ((l) m.a(l.class)).b(PubOppositeChangeListener.class).b().a(new b.a<PubOppositeChangeListener>() { // from class: com.sankuai.xm.im.message.opposite.PubOppositeController.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.util.b.a
            public final /* synthetic */ boolean a(PubOppositeChangeListener pubOppositeChangeListener) {
                PubOppositeChangeListener pubOppositeChangeListener2 = pubOppositeChangeListener;
                Object[] objArr2 = {pubOppositeChangeListener2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ccbe460a89068f34da2239c80dc14ed6", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ccbe460a89068f34da2239c80dc14ed6")).booleanValue();
                }
                pubOppositeChangeListener2.onOppositeConfigChanged();
                return false;
            }
        });
        ((l) m.a(l.class)).b(OnPubOppositeChangeListener.class).b().a(new b.a<OnPubOppositeChangeListener>() { // from class: com.sankuai.xm.im.message.opposite.PubOppositeController.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.util.b.a
            public final /* synthetic */ boolean a(OnPubOppositeChangeListener onPubOppositeChangeListener) {
                OnPubOppositeChangeListener onPubOppositeChangeListener2 = onPubOppositeChangeListener;
                Object[] objArr2 = {onPubOppositeChangeListener2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11e8505b05ffb4de61b9d920b3b4f0de", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11e8505b05ffb4de61b9d920b3b4f0de")).booleanValue();
                }
                onPubOppositeChangeListener2.onOppositeConfigChanged();
                return false;
            }
        });
    }

    public PubOppositeController() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b796a1b3da51847ae774c377f72ba821", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b796a1b3da51847ae774c377f72ba821");
            return;
        }
        this.c = new LruCache<>(200);
        this.d = new HashMap<>();
        this.e = new f();
        this.f = false;
    }

    public final synchronized boolean a(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d33a65c58bd000d0f5a348e3c2d6a132", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d33a65c58bd000d0f5a348e3c2d6a132")).booleanValue();
        }
        b bVar = this.d.get(Short.valueOf(s));
        return bVar != null && bVar.c;
    }

    private synchronized long c(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b4f77e409a91816244d5aae167e07e6", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b4f77e409a91816244d5aae167e07e6")).longValue();
        }
        b bVar = this.d.get(Short.valueOf(s));
        if (bVar == null) {
            return 0L;
        }
        return bVar.b;
    }

    private synchronized HashMap<Short, b> i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f197d946f723fb9aa06ed0106838e0a7", 6917529027641081856L)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f197d946f723fb9aa06ed0106838e0a7");
        }
        HashMap<Short, b> hashMap = new HashMap<>();
        hashMap.putAll(this.d);
        return hashMap;
    }

    public boolean b(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fd19f8fbc34ff8fa46c5076e26ec7d1", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fd19f8fbc34ff8fa46c5076e26ec7d1")).booleanValue() : com.sankuai.xm.im.c.a(c.b.PUB_CHAT) && a(s) && IMClient.a().k() > 0;
    }

    public boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5dc6d0edbdef2fef0189c518f9f235e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5dc6d0edbdef2fef0189c518f9f235e")).booleanValue();
        }
        if (com.sankuai.xm.im.c.a(c.b.PUB_CHAT) && IMClient.a().k() > 0) {
            HashMap<Short, b> i = i();
            for (Short sh : i.keySet()) {
                if (i.get(Short.valueOf(sh.shortValue())).c) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be1223b7053284297fa0602f8ad41dad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be1223b7053284297fa0602f8ad41dad");
        } else if (c()) {
            String a2 = com.sankuai.xm.im.http.a.a("/pubread/v1/user/chat/opposite/getReadListByAppId");
            HashMap hashMap = new HashMap();
            hashMap.put("svid", (short) 410);
            hashMap.put("appid", Short.valueOf(IMClient.a().g()));
            hashMap.put("startTime", Long.valueOf(k()));
            hashMap.put("type", (short) 1);
            com.sankuai.xm.im.utils.a.b("PubOppositeController::queryOpposite by AppId:%d startTime:%d", Short.valueOf(IMClient.a().g()), Long.valueOf(k()));
            com.sankuai.xm.base.d dVar = new com.sankuai.xm.base.d(a2, hashMap, new d());
            dVar.a(new com.sankuai.xm.network.httpurlconnection.retry.a());
            g.a().a((com.sankuai.xm.network.httpurlconnection.e) dVar, 0L);
        }
    }

    private String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dd58279782ede41ba55625f894805e9", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dd58279782ede41ba55625f894805e9");
        }
        return "opposite_config_pub_last_query_opposite_time_" + com.sankuai.xm.network.setting.f.a().e();
    }

    private long k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e1206336fb16c0675859b3cab3632ed", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e1206336fb16c0675859b3cab3632ed")).longValue() : com.sankuai.xm.base.e.a().getLong(j(), 0L);
    }

    public final void a(@NonNull SessionId sessionId, long j) {
        Object[] objArr = {sessionId, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3aa016d4aab01f7c5e0298d7c4f4c73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3aa016d4aab01f7c5e0298d7c4f4c73");
        } else if (!sessionId.i()) {
            com.sankuai.xm.im.utils.a.d("PubOppositeController::opposite param error, " + sessionId, new Object[0]);
        } else if (!b(sessionId.g)) {
            com.sankuai.xm.im.utils.a.c("PubOppositeController::sendOpposite opposite func not open, channel = %d", Short.valueOf(sessionId.g));
        } else {
            DBProxy.l().n().a(sessionId, j);
            this.e.a(sessionId, j);
        }
    }

    public final void a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "815b459f4a711bd45b2f3ce17584ec38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "815b459f4a711bd45b2f3ce17584ec38");
            return;
        }
        com.sankuai.xm.im.utils.a.b("PubOppositeController::onSendOppositeRes %s", jVar.toString());
        HashMap<SessionId, Long> a2 = this.e.a(jVar.b());
        if (a2 == null || a2.size() <= 0) {
            com.sankuai.xm.im.utils.a.d("PubOppositeController::opposite param error", new Object[0]);
            return;
        }
        for (final SessionId sessionId : a2.keySet()) {
            final long longValue = a2.get(sessionId).longValue();
            DBProxy.l().n().a(sessionId, new Callback<DBPubOpposite>() { // from class: com.sankuai.xm.im.message.opposite.PubOppositeController.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(DBPubOpposite dBPubOpposite) {
                    DBPubOpposite dBPubOpposite2 = dBPubOpposite;
                    Object[] objArr2 = {dBPubOpposite2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f56b81c8286c79a3dd718518822fa84", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f56b81c8286c79a3dd718518822fa84");
                        return;
                    }
                    DBProxy.l().k.a(sessionId, dBPubOpposite2 == null ? 0L : dBPubOpposite2.getSendOppositeTime(), longValue, true, 1);
                    h n = DBProxy.l().n();
                    SessionId sessionId2 = sessionId;
                    long j = longValue;
                    Object[] objArr3 = {sessionId2, 0L, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = h.a;
                    if (PatchProxy.isSupport(objArr3, n, changeQuickRedirect3, false, "696ff3acca52325a8e0d67b06cbd9ac4", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, n, changeQuickRedirect3, false, "696ff3acca52325a8e0d67b06cbd9ac4");
                    } else if (sessionId2 != null) {
                        DBPubOpposite dBPubOpposite3 = new DBPubOpposite();
                        dBPubOpposite3.setKey(sessionId2.f());
                        dBPubOpposite3.setSendingTime(0L);
                        dBPubOpposite3.setSendOppositeTime(j);
                        n.a(dBPubOpposite3, new String[]{DBPubOpposite.SENDING_TIME, DBPubOpposite.SEND_OPPOSITE_TIME});
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20ab7c1575e336c8fa78e3c5518328f9", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20ab7c1575e336c8fa78e3c5518328f9");
                    } else {
                        com.sankuai.xm.im.utils.a.d("PubOppositeController::onSendOppositeRes fail code:%d message:%s", Integer.valueOf(i), str);
                    }
                }
            });
            a(sessionId, longValue, 0L);
        }
    }

    public void b(final SessionId sessionId, final long j) {
        Object[] objArr = {sessionId, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08b18caa380ee4688be373ee113a0be4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08b18caa380ee4688be373ee113a0be4");
        } else if (sessionId == null || !sessionId.i()) {
            com.sankuai.xm.im.utils.a.d("PubOppositeController::opposite param error, " + sessionId, new Object[0]);
        } else {
            DBProxy.l().n().a(sessionId, new Callback<DBPubOpposite>() { // from class: com.sankuai.xm.im.message.opposite.PubOppositeController.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                @Trace(belong = {"opposite_msg"}, name = "handle_opposite", type = i.normal)
                public final /* synthetic */ void onSuccess(DBPubOpposite dBPubOpposite) {
                    DBPubOpposite dBPubOpposite2 = dBPubOpposite;
                    Object[] objArr2 = {dBPubOpposite2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4cbb58eb546fb79f1ceee0f22b81d03c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4cbb58eb546fb79f1ceee0f22b81d03c");
                        return;
                    }
                    try {
                        com.sankuai.xm.base.trace.j.a(i.normal, "handle_opposite", new String[]{"opposite_msg"}, new Object[]{dBPubOpposite2});
                        DBProxy.l().k.a(sessionId, dBPubOpposite2 == null ? 0L : dBPubOpposite2.getRecvOppositeTime(), j, false, 1);
                        h n = DBProxy.l().n();
                        SessionId sessionId2 = sessionId;
                        long j2 = j;
                        Object[] objArr3 = {sessionId2, new Long(j2)};
                        ChangeQuickRedirect changeQuickRedirect3 = h.a;
                        if (PatchProxy.isSupport(objArr3, n, changeQuickRedirect3, false, "47786b04f22d440cb261ad16817372a2", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, n, changeQuickRedirect3, false, "47786b04f22d440cb261ad16817372a2");
                        } else if (sessionId2 != null) {
                            DBPubOpposite dBPubOpposite3 = new DBPubOpposite();
                            dBPubOpposite3.setKey(sessionId2.f());
                            dBPubOpposite3.setRecvOppositeTime(j2);
                            n.a(dBPubOpposite3, new String[]{DBPubOpposite.RECV_OPPOSITE_TIME});
                        }
                        PubOppositeController.this.a(sessionId, 0L, j);
                        com.sankuai.xm.base.trace.j.a((Object) null);
                    } catch (Throwable th) {
                        com.sankuai.xm.base.trace.j.a(th);
                        throw th;
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(@TraceStatus int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8d552fcf2de7b6067b84764570b4a53", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8d552fcf2de7b6067b84764570b4a53");
                        return;
                    }
                    com.sankuai.xm.base.trace.j.a(new Integer(i), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                    com.sankuai.xm.im.utils.a.d("PubOppositeController::dealReceiveOpposite fail code:%d message:%s", Integer.valueOf(i), str);
                    PubOppositeController.this.a(sessionId, 0L, j);
                }
            });
        }
    }

    public void a(List<IMMessage> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cca8b8721daf2e56a3dc22e3dc7d6e67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cca8b8721daf2e56a3dc22e3dc7d6e67");
        } else if (list != null && list.size() > 0) {
            com.sankuai.xm.im.utils.a.b("PubOppositeController::updateToReadByConfig message count:%d", Integer.valueOf(list.size()));
            long a2 = com.sankuai.xm.login.c.a().a(System.currentTimeMillis());
            com.sankuai.xm.im.utils.a.b("PubOppositeController::updateToReadByConfig max config time:%d", Long.valueOf(a2));
            for (IMMessage iMMessage : list) {
                if (MessageUtils.isPubService(iMMessage.getCategory()) && a(iMMessage.getChannel()) && iMMessage.getSts() < a2 - c(iMMessage.getChannel()) && iMMessage.getMsgOppositeStatus() != 1) {
                    com.sankuai.xm.im.utils.a.b("PubOppositeController::updateToReadByConfig config update status OPPOSITE_STATE_READ message:%s", iMMessage.keyParamToString());
                    iMMessage.setMsgOppositeStatus(1);
                }
            }
        }
    }

    public void b(List<IMMessage> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff6f52585ebe165b35616cde183176fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff6f52585ebe165b35616cde183176fb");
            return;
        }
        HashMap hashMap = new HashMap();
        for (IMMessage iMMessage : list) {
            if (MessageUtils.isPubService(iMMessage.getCategory()) && a(iMMessage.getChannel())) {
                SessionId a2 = SessionId.a(iMMessage);
                if (!hashMap.containsKey(a2)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(iMMessage);
                    hashMap.put(a2, arrayList);
                } else {
                    ((List) hashMap.get(a2)).add(iMMessage);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            DBPubOpposite a3 = DBProxy.l().n().a((SessionId) entry.getKey());
            if (a3 != null) {
                com.sankuai.xm.im.utils.a.b("PubOppositeController::updateToReadByConfig DBPubOpposite:%s", a3.toString());
                for (IMMessage iMMessage2 : (List) entry.getValue()) {
                    if (iMMessage2.getFromUid() == IMClient.a().k()) {
                        if (a3.getRecvOppositeTime() > 0 && iMMessage2.getSts() <= a3.getRecvOppositeTime()) {
                            com.sankuai.xm.im.utils.a.b("PubOppositeController::updateToReadByConfig db update status OPPOSITE_STATE_READ message:%s", iMMessage2.keyParamToString());
                            iMMessage2.setMsgOppositeStatus(1);
                        }
                    } else if (a3.getSendOppositeTime() > 0 && iMMessage2.getSts() <= a3.getSendOppositeTime()) {
                        com.sankuai.xm.im.utils.a.b("PubOppositeController::updateToReadByConfig db update status OPPOSITE_STATE_READ message:%s", iMMessage2.keyParamToString());
                        iMMessage2.setMsgOppositeStatus(1);
                    }
                }
            }
        }
    }

    public String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a48bb358145b4f519b68270c4bdf9fcc", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a48bb358145b4f519b68270c4bdf9fcc");
        }
        return "pub_opposite_config_last_request_time_" + com.sankuai.xm.network.setting.f.a().e();
    }

    private String d(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d7d66e7635dffea59cdf6e4b596089a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d7d66e7635dffea59cdf6e4b596089a");
        }
        return "opposite_config_pub_last_auto_read_time_" + String.valueOf((int) s);
    }

    private long e(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8607adf80d75b59b38321047cd15204a", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8607adf80d75b59b38321047cd15204a")).longValue() : com.sankuai.xm.base.e.a().getLong(d(s), 0L);
    }

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88cfcb169c932708e2633cf02d336885", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88cfcb169c932708e2633cf02d336885");
        } else if (com.sankuai.xm.im.c.a(c.b.PUB_CHAT)) {
            HashMap<Short, b> i = i();
            for (Short sh : i.keySet()) {
                final short shortValue = sh.shortValue();
                b bVar = i.get(Short.valueOf(shortValue));
                if (bVar.c) {
                    final long a2 = com.sankuai.xm.login.c.a().a(System.currentTimeMillis()) - bVar.b;
                    DBProxy.l().k.a(shortValue, Long.valueOf(a2), Long.valueOf(e(shortValue)), new Callback<Void>() { // from class: com.sankuai.xm.im.message.opposite.PubOppositeController.7
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.base.callback.Callback
                        public final /* synthetic */ void onSuccess(Void r11) {
                            Object[] objArr2 = {r11};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a3abe41c03839e14628e75a8b07fbba", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a3abe41c03839e14628e75a8b07fbba");
                            } else {
                                PubOppositeController.a(PubOppositeController.this, shortValue, a2);
                            }
                        }

                        @Override // com.sankuai.xm.base.callback.Callback
                        public final void onFailure(int i2, String str) {
                            Object[] objArr2 = {Integer.valueOf(i2), str};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90eedd92130183c032e28850ca611a74", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90eedd92130183c032e28850ca611a74");
                            } else {
                                com.sankuai.xm.im.utils.a.d("PubOppositeController::autoReadLocalDataByConfig fail code:%d message:%s", Integer.valueOf(i2), str);
                            }
                        }
                    });
                }
            }
        }
    }

    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "454352601420d58c984aa23749ed9589", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "454352601420d58c984aa23749ed9589");
        } else if (com.sankuai.xm.im.c.a(c.b.PUB_CHAT)) {
            HashMap<Short, b> i = i();
            for (Short sh : i.keySet()) {
                b bVar = i.get(Short.valueOf(sh.shortValue()));
                if (bVar.c) {
                    DBProxy.l().n().a(Long.valueOf(bVar.b), 1000, new Callback<List<DBPubOpposite>>() { // from class: com.sankuai.xm.im.message.opposite.PubOppositeController.8
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.base.callback.Callback
                        public final /* synthetic */ void onSuccess(List<DBPubOpposite> list) {
                            List<DBPubOpposite> list2 = list;
                            Object[] objArr2 = {list2};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19097407e01f7a651f4f7385488fa419", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19097407e01f7a651f4f7385488fa419");
                            } else if (list2 != null && list2.size() > 0) {
                                for (DBPubOpposite dBPubOpposite : list2) {
                                    com.sankuai.xm.im.utils.a.b("PubOppositeController::resendLocalData %s", dBPubOpposite.toString());
                                    PubOppositeController.this.a(SessionId.a(dBPubOpposite.getKey()), dBPubOpposite.getSendingTime());
                                }
                            }
                        }

                        @Override // com.sankuai.xm.base.callback.Callback
                        public final void onFailure(int i2, String str) {
                            Object[] objArr2 = {Integer.valueOf(i2), str};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "233e3fd68f13f6f9afde128db5094933", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "233e3fd68f13f6f9afde128db5094933");
                            } else {
                                com.sankuai.xm.im.utils.a.d("PubOppositeController::resendLocalData::queryPubOppositeSending error code:%d message:%s", Integer.valueOf(i2), str);
                            }
                        }
                    });
                }
            }
        }
    }

    private String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7f8564fad3713a938b87740255ee82d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7f8564fad3713a938b87740255ee82d");
        }
        return "opposite_config_key_pub_" + com.sankuai.xm.network.setting.f.a().e();
    }

    private String m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26984a04bcdd5aa29496f4ed6f7a95fb", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26984a04bcdd5aa29496f4ed6f7a95fb") : com.sankuai.xm.base.e.a().getString(l(), "");
    }

    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e04b8b0b3f93e3a2fe7bb3e2da1015f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e04b8b0b3f93e3a2fe7bb3e2da1015f");
        } else if (com.sankuai.xm.im.c.a(c.b.PUB_CHAT)) {
            try {
                if (this.f) {
                    return;
                }
                n();
                this.f = true;
            } catch (Exception e2) {
                com.sankuai.xm.im.utils.a.a(e2, "PubOppositeController::loadOppositeConfig", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceee1b2ef35c9a62258061bf92861d6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceee1b2ef35c9a62258061bf92861d6a");
            return;
        }
        try {
            synchronized (this) {
                this.d.clear();
                if (TextUtils.isEmpty(m())) {
                    return;
                }
                JSONArray jSONArray = new JSONArray(m());
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject.optInt("svid") == 410) {
                        short optInt = (short) jSONObject.optInt("channel", -888);
                        if (!this.d.containsKey(Short.valueOf(optInt))) {
                            bVar = new b();
                            this.d.put(Short.valueOf(optInt), bVar);
                        } else {
                            bVar = this.d.get(Short.valueOf(optInt));
                        }
                        long optLong = jSONObject.optLong(RemoteMessageConst.TTL);
                        Object[] objArr2 = {new Long(optLong)};
                        ChangeQuickRedirect changeQuickRedirect2 = b.a;
                        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "e57a43a84617aff8dd1092acd1e36f15", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "e57a43a84617aff8dd1092acd1e36f15");
                        } else if (optLong > 0) {
                            bVar.b = optLong;
                        }
                        boolean z = true;
                        if (jSONObject.optInt("isopen") != 1) {
                            z = false;
                        }
                        bVar.c = z;
                    }
                }
            }
        } catch (Exception e2) {
            com.sankuai.xm.im.utils.a.a(e2, "PubOppositeController::loadConfigData", new Object[0]);
        }
    }

    @Override // com.sankuai.xm.im.message.opposite.a
    public final void a(List<IMMessage> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf160d2e06495ea0cf8569870529ba77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf160d2e06495ea0cf8569870529ba77");
        } else if (!com.sankuai.xm.base.util.b.a(list) && this.c.size() != 0 && !z) {
            HashMap hashMap = new HashMap();
            for (IMMessage iMMessage : list) {
                if (iMMessage != null && iMMessage.getMsgId() != 0 && iMMessage.getDirection() == 1 && iMMessage.getCategory() == 3) {
                    SessionId a2 = SessionId.a(iMMessage);
                    Long l = (Long) hashMap.get(a2);
                    if (l == null || l.longValue() > iMMessage.getSts()) {
                        hashMap.put(a2, Long.valueOf(iMMessage.getSts()));
                    }
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                SessionId sessionId = (SessionId) entry.getKey();
                Long l2 = this.c.get(sessionId);
                if (l2 != null && l2.longValue() >= ((Long) entry.getValue()).longValue()) {
                    b(sessionId, l2.longValue());
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends com.sankuai.xm.network.httpurlconnection.d {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // com.sankuai.xm.network.httpurlconnection.c
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f48d1ad8bce3d0a448671ef98bd4b57e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f48d1ad8bce3d0a448671ef98bd4b57e");
            } else {
                super.a();
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(JSONObject jSONObject) throws Exception {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2be4594114f0f0f6c4d3b30e427d8c8d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2be4594114f0f0f6c4d3b30e427d8c8d");
                return;
            }
            try {
                com.sankuai.xm.im.utils.a.b("PubOppositeController::OppositeConfigCallback %s", jSONObject.toString());
                JSONArray f = new com.sankuai.xm.base.util.net.c(jSONObject).f("data");
                PubOppositeController.a(PubOppositeController.this);
                PubOppositeController.a(PubOppositeController.this, f.toString());
                PubOppositeController.this.n();
                PubOppositeController.c(PubOppositeController.this);
                PubOppositeController.this.d();
            } catch (Exception e) {
                com.sankuai.xm.im.utils.a.a(e, "PubOppositeController::OppositeConfigCallback", new Object[0]);
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2017e2c2d854a99c9209ab967c24e101", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2017e2c2d854a99c9209ab967c24e101");
            } else {
                com.sankuai.xm.im.utils.a.d("PubOppositeController::OppositeConfigCallback onFailure query config fail code:%d message:%s", Integer.valueOf(i), str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class b {
        public static ChangeQuickRedirect a;
        long b;
        boolean c;

        private b() {
            Object[] objArr = {PubOppositeController.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65417b0edb0257cfbca0384bc95e87e8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65417b0edb0257cfbca0384bc95e87e8");
                return;
            }
            this.b = 604800000L;
            this.c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<c> a(com.sankuai.xm.base.util.net.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "432aeed35692140e0f4d34c328dfce55", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "432aeed35692140e0f4d34c328dfce55");
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray f2 = cVar.f("data");
            if (f2 != null) {
                for (int i = 0; i < f2.length(); i++) {
                    JSONObject jSONObject = f2.getJSONObject(i);
                    c cVar2 = new c();
                    long parseLong = Long.parseLong(jSONObject.optString(Message.CHAT_ID, "0"));
                    long parseLong2 = Long.parseLong(jSONObject.optString(Message.PEER_UID, "0"));
                    String optString = jSONObject.optString(Message.SID, "");
                    cVar2.b = SessionId.a(parseLong, parseLong2, MessageUtils.confirmProto2Category(optString, parseLong2, 3), (short) 0, (short) jSONObject.optInt("channel", 0), optString);
                    cVar2.c = jSONObject.optLong("sts", 0L);
                    arrayList.add(cVar2);
                }
            }
        } catch (Exception e2) {
            com.sankuai.xm.im.utils.a.a(e2, "PubOppositeController::parseChatItems", new Object[0]);
        }
        return arrayList;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class e extends com.sankuai.xm.network.httpurlconnection.d {
        public static ChangeQuickRedirect a;

        public e() {
        }

        @Override // com.sankuai.xm.network.httpurlconnection.c
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6dfca89279e84149a9211e4903dfef4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6dfca89279e84149a9211e4903dfef4");
            } else {
                super.a();
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(JSONObject jSONObject) throws Exception {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbde4970adfd7d5ff01f8628f787702f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbde4970adfd7d5ff01f8628f787702f");
                return;
            }
            try {
                PubOppositeController.a(PubOppositeController.this, PubOppositeController.this.a(new com.sankuai.xm.base.util.net.c(jSONObject)));
            } catch (Exception e) {
                com.sankuai.xm.im.utils.a.a(e, "PubOppositeController::QueryOppositeBySessionCallback", new Object[0]);
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbaa932cbf70009cb0ce83fd0f63a67f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbaa932cbf70009cb0ce83fd0f63a67f");
            } else {
                com.sankuai.xm.im.utils.a.d("PubOppositeController::QueryOppositeBySessionCallback onFailure query unread fail code:%d message:%s", Integer.valueOf(i), str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class d extends com.sankuai.xm.network.httpurlconnection.d {
        public static ChangeQuickRedirect a;
        private long c;

        public d() {
            Object[] objArr = {PubOppositeController.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bda04218e3ba40eac8575ef56091c566", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bda04218e3ba40eac8575ef56091c566");
            } else {
                this.c = com.sankuai.xm.login.c.a().a(System.currentTimeMillis());
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.c
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36099046ffa225f0c88c11ad3b893687", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36099046ffa225f0c88c11ad3b893687");
            } else {
                super.a();
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(JSONObject jSONObject) throws Exception {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1317354b217fd68979d77f1712fac8c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1317354b217fd68979d77f1712fac8c");
                return;
            }
            try {
                PubOppositeController.a(PubOppositeController.this, this.c);
                PubOppositeController.a(PubOppositeController.this, PubOppositeController.this.a(new com.sankuai.xm.base.util.net.c(jSONObject)));
            } catch (Exception e) {
                com.sankuai.xm.im.utils.a.a(e, "PubOppositeController::QueryOppositeByAppCallback", new Object[0]);
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac0c84a2258651b268811337dc752988", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac0c84a2258651b268811337dc752988");
            } else {
                com.sankuai.xm.im.utils.a.d("PubOppositeController::QueryOppositeByAppCallback onFailure query unread fail code:%d message:%s", Integer.valueOf(i), str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class c {
        public static ChangeQuickRedirect a;
        public SessionId b;
        public long c;

        private c() {
            Object[] objArr = {PubOppositeController.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea909cc922705e07c0dac2a2201d23a1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea909cc922705e07c0dac2a2201d23a1");
            }
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0432d8cac5063bb40a97ce3201d07432", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0432d8cac5063bb40a97ce3201d07432");
            }
            return "QueryChatItem {, chatId=" + this.b.f() + ", sts=" + this.c + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class f {
        public static ChangeQuickRedirect a;
        private HashMap<SessionId, Long> c;
        private List<a> d;
        private com.sankuai.xm.base.trace.a e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes6.dex */
        public class a {
            public boolean a;
            public String b;
            public HashMap<SessionId, Long> c;

            private a() {
                this.b = "";
                this.c = new HashMap<>();
            }
        }

        public f() {
            Object[] objArr = {PubOppositeController.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0c03905e84c84387e27bb061795fea4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0c03905e84c84387e27bb061795fea4");
                return;
            }
            this.c = new HashMap<>();
            this.d = new ArrayList();
            this.e = null;
        }

        public final void a(SessionId sessionId, long j) {
            Object[] objArr = {sessionId, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "525aea9e7bda20d93ee0117331712c5a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "525aea9e7bda20d93ee0117331712c5a");
                return;
            }
            b(sessionId, j);
            c();
        }

        public final synchronized HashMap<SessionId, Long> a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d3920835a617ec14e879bb292e63a20", 6917529027641081856L)) {
                return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d3920835a617ec14e879bb292e63a20");
            }
            HashMap<SessionId, Long> hashMap = new HashMap<>();
            Iterator<a> it = this.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a next = it.next();
                if (TextUtils.equals(str, next.b)) {
                    hashMap.putAll(next.c);
                    this.d.remove(next);
                    break;
                }
            }
            return hashMap;
        }

        private synchronized void b(SessionId sessionId, long j) {
            Object[] objArr = {sessionId, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f51f890ed905246e2dfe354cb24fec62", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f51f890ed905246e2dfe354cb24fec62");
            } else if (sessionId == null) {
            } else {
                if (this.c.containsKey(sessionId)) {
                    if (this.c.get(sessionId).longValue() < j) {
                        this.c.put(sessionId, Long.valueOf(j));
                    }
                } else {
                    this.c.put(sessionId, Long.valueOf(j));
                }
            }
        }

        private String e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f31b8c0e5f0eff0d02dce9b7219e6085", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f31b8c0e5f0eff0d02dce9b7219e6085") : UUID.randomUUID().toString();
        }

        synchronized List<a> a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "619b1ca1560a2bbf603f54ccad3a8490", 6917529027641081856L)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "619b1ca1560a2bbf603f54ccad3a8490");
            }
            ArrayList arrayList = new ArrayList();
            Iterator<SessionId> it = this.c.keySet().iterator();
            while (it.hasNext()) {
                HashMap<SessionId, Long> hashMap = new HashMap<>();
                HashMap<SessionId, Long> hashMap2 = new HashMap<>();
                while (it.hasNext() && hashMap.size() < 50 && hashMap2.size() < 50) {
                    SessionId next = it.next();
                    long longValue = this.c.get(next).longValue();
                    if (next.e == 3) {
                        hashMap.put(next, Long.valueOf(longValue));
                    } else {
                        hashMap2.put(next, Long.valueOf(longValue));
                    }
                }
                if (!hashMap.isEmpty()) {
                    a aVar = new a();
                    aVar.a = false;
                    aVar.b = e();
                    aVar.c = hashMap;
                    arrayList.add(aVar);
                }
                if (!hashMap2.isEmpty()) {
                    a aVar2 = new a();
                    aVar2.a = true;
                    aVar2.b = e();
                    aVar2.c = hashMap2;
                    arrayList.add(aVar2);
                }
            }
            if (!arrayList.isEmpty()) {
                this.d.addAll(arrayList);
            }
            this.c.clear();
            return arrayList;
        }

        synchronized boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ed44785c0c1c4da8874bde227d61999", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ed44785c0c1c4da8874bde227d61999")).booleanValue();
            }
            return this.c.size() > 0;
        }

        synchronized void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae2f82c550585217823d4362c0f21f31", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae2f82c550585217823d4362c0f21f31");
            } else if (this.e != null) {
                this.e.a();
            } else {
                this.e = new com.sankuai.xm.base.trace.a() { // from class: com.sankuai.xm.im.message.opposite.PubOppositeController.f.1
                    public static ChangeQuickRedirect c;
                    private com.sankuai.xm.base.trace.g e = com.sankuai.xm.base.trace.j.a();

                    @Override // com.sankuai.xm.base.trace.a
                    public final void b() {
                        byte[] bS_;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = c;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dcc104950f2d566929d30892f40902c0", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dcc104950f2d566929d30892f40902c0");
                            return;
                        }
                        f fVar = f.this;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = f.a;
                        if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "5a4b1e5f1472e3193557a8bb3a37d05f", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "5a4b1e5f1472e3193557a8bb3a37d05f");
                            return;
                        }
                        fVar.d();
                        List<a> a2 = fVar.a();
                        Object[] objArr4 = {a2};
                        ChangeQuickRedirect changeQuickRedirect4 = f.a;
                        if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect4, false, "85fe903b7ab9ac7524148cfe566d2b1e", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect4, false, "85fe903b7ab9ac7524148cfe566d2b1e");
                        } else {
                            try {
                                Object obj = null;
                                com.sankuai.xm.base.trace.j.a(i.send, "send_opposite", (String[]) null, new Object[]{a2});
                                if (a2 != null && a2.size() > 0) {
                                    for (a aVar : a2) {
                                        if (aVar.c.size() > 0 && !TextUtils.isEmpty(aVar.b)) {
                                            com.sankuai.xm.im.utils.a.b("PubOppositeController::sendOpposite count:%d", Integer.valueOf(aVar.c.size()));
                                            if (aVar.a) {
                                                com.sankuai.xm.base.proto.opposite.v2.c cVar = new com.sankuai.xm.base.proto.opposite.v2.c();
                                                cVar.a(IMClient.a().k());
                                                cVar.a(aVar.b);
                                                cVar.a((byte) 1);
                                                cVar.c(com.sankuai.xm.login.a.a().m());
                                                byte[][] bArr = new byte[aVar.c.size()];
                                                int i = 0;
                                                for (SessionId sessionId : aVar.c.keySet()) {
                                                    long longValue = aVar.c.get(sessionId).longValue();
                                                    com.sankuai.xm.base.proto.opposite.v2.d dVar = new com.sankuai.xm.base.proto.opposite.v2.d();
                                                    dVar.a(sessionId.b);
                                                    dVar.a((byte) sessionId.e);
                                                    dVar.b(sessionId.c);
                                                    dVar.a(sessionId.d);
                                                    dVar.b(sessionId.g);
                                                    dVar.c(longValue);
                                                    dVar.c(com.sankuai.xm.login.a.a().m());
                                                    dVar.a(sessionId.g());
                                                    com.sankuai.xm.im.utils.a.b("PubOppositeController::sendOpposite data:%s", dVar);
                                                    bArr[i] = dVar.bS_();
                                                    i++;
                                                }
                                                cVar.a(bArr);
                                                bS_ = cVar.bS_();
                                            } else {
                                                com.sankuai.xm.base.proto.opposite.h hVar = new com.sankuai.xm.base.proto.opposite.h();
                                                hVar.a(IMClient.a().k());
                                                hVar.a(aVar.b);
                                                hVar.a((byte) 1);
                                                hVar.c(com.sankuai.xm.login.a.a().m());
                                                byte[][] bArr2 = new byte[aVar.c.size()];
                                                int i2 = 0;
                                                for (SessionId sessionId2 : aVar.c.keySet()) {
                                                    long longValue2 = aVar.c.get(sessionId2).longValue();
                                                    com.sankuai.xm.base.proto.opposite.i iVar = new com.sankuai.xm.base.proto.opposite.i();
                                                    iVar.a(sessionId2.b);
                                                    iVar.a((byte) sessionId2.e);
                                                    iVar.b(sessionId2.c);
                                                    iVar.a(sessionId2.d);
                                                    iVar.b(sessionId2.g);
                                                    iVar.c(longValue2);
                                                    iVar.c(com.sankuai.xm.login.a.a().m());
                                                    com.sankuai.xm.im.utils.a.b("PubOppositeController::sendOpposite data:%s", iVar);
                                                    bArr2[i2] = iVar.bS_();
                                                    i2++;
                                                }
                                                hVar.a(bArr2);
                                                bS_ = hVar.bS_();
                                            }
                                            if (bS_ != null) {
                                                com.sankuai.xm.im.connection.c.a((short) 410, bS_);
                                            }
                                            obj = null;
                                        }
                                        com.sankuai.xm.im.utils.a.d("PubOppositeController::opposite param error", new Object[0]);
                                        obj = null;
                                    }
                                    com.sankuai.xm.base.trace.j.a(obj);
                                }
                                com.sankuai.xm.base.trace.j.a((Object) null);
                            } catch (Throwable th) {
                                com.sankuai.xm.base.trace.j.a(th);
                                throw th;
                            }
                        }
                        if (fVar.b()) {
                            fVar.c();
                        }
                    }
                };
                com.sankuai.xm.threadpool.scheduler.a.b().a(25, this.e, 300L);
            }
        }

        synchronized void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f04ac917c8ab8a4a969f553359e35fc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f04ac917c8ab8a4a969f553359e35fc");
                return;
            }
            if (this.e != null) {
                this.e.cancel();
                this.e = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Trace(name = "notify_opposite", type = i.end)
    public void a(final SessionId sessionId, final long j, final long j2) {
        Object[] objArr = {sessionId, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cccf12103356892a1d558832f99088ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cccf12103356892a1d558832f99088ed");
            return;
        }
        try {
            com.sankuai.xm.base.trace.j.a(i.end, "notify_opposite", new String[]{"opposite_msg"}, new Object[]{sessionId, new Long(j), new Long(j2)});
            if (sessionId != null && a(sessionId.g)) {
                ((l) m.a(l.class)).b(PubOppositeChangeListener.class).a(sessionId.g).a(new b.a<PubOppositeChangeListener>() { // from class: com.sankuai.xm.im.message.opposite.PubOppositeController.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.util.b.a
                    public final /* synthetic */ boolean a(PubOppositeChangeListener pubOppositeChangeListener) {
                        PubOppositeChangeListener pubOppositeChangeListener2 = pubOppositeChangeListener;
                        Object[] objArr2 = {pubOppositeChangeListener2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b3af4eab6b1de63c8527517584152d1f", 6917529027641081856L)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b3af4eab6b1de63c8527517584152d1f")).booleanValue();
                        }
                        pubOppositeChangeListener2.onOppositeChanged(sessionId, j, j2);
                        return false;
                    }
                });
                ((l) m.a(l.class)).b(OnPubOppositeChangeListener.class).a(sessionId.g).a(new b.a<OnPubOppositeChangeListener>() { // from class: com.sankuai.xm.im.message.opposite.PubOppositeController.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.util.b.a
                    public final /* synthetic */ boolean a(OnPubOppositeChangeListener onPubOppositeChangeListener) {
                        OnPubOppositeChangeListener onPubOppositeChangeListener2 = onPubOppositeChangeListener;
                        Object[] objArr2 = {onPubOppositeChangeListener2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d1c353dab4cc95c0ca38f34ba9d49fc", 6917529027641081856L)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d1c353dab4cc95c0ca38f34ba9d49fc")).booleanValue();
                        }
                        onPubOppositeChangeListener2.onOppositeChanged(sessionId.b, sessionId.c, j, j2);
                        return false;
                    }
                });
                com.sankuai.xm.base.trace.j.a((Object) null);
                return;
            }
            com.sankuai.xm.im.utils.a.d("PubOppositeController::notifySendOppositeRes opposite param error", new Object[0]);
            com.sankuai.xm.base.trace.j.a((Object) null);
        } catch (Throwable th) {
            com.sankuai.xm.base.trace.j.a(th);
            throw th;
        }
    }
}
