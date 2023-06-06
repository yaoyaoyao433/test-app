package com.sankuai.xm.im.message.opposite;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.v4.util.LruCache;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.annotation.TraceStatus;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.c;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.cache.bean.DBGroupOpposite;
import com.sankuai.xm.im.cache.bean.DBMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.network.httpurlconnection.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class GroupOppositeController extends com.sankuai.xm.im.message.opposite.a {
    public static ChangeQuickRedirect b;
    public f c;
    private HashMap<Short, c> d;
    private d e;
    private volatile boolean f;
    private final LruCache<Long, a> g;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes6.dex */
    public interface OnGroupOppositeChangeListener {
        void onOppositeConfigChanged();

        void onReceiveOppositeInfo(List<a> list);

        void onSendOppositeRes(int i, List<Long> list);
    }

    public static /* synthetic */ DBGroupOpposite a(GroupOppositeController groupOppositeController, List list, long j) {
        Object[] objArr = {list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, groupOppositeController, changeQuickRedirect, false, "532e2915b9a7c5d691aa9b7cb76c627e", 6917529027641081856L)) {
            return (DBGroupOpposite) PatchProxy.accessDispatch(objArr, groupOppositeController, changeQuickRedirect, false, "532e2915b9a7c5d691aa9b7cb76c627e");
        }
        if (com.sankuai.xm.base.util.b.a((Collection<?>) list) || j <= 0) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DBGroupOpposite dBGroupOpposite = (DBGroupOpposite) it.next();
            if (dBGroupOpposite.getMsgId() == j) {
                return dBGroupOpposite;
            }
        }
        return null;
    }

    public static /* synthetic */ void a(GroupOppositeController groupOppositeController, Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, groupOppositeController, changeQuickRedirect, false, "961f9b12e74d6aca24878061a68055c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, groupOppositeController, changeQuickRedirect, false, "961f9b12e74d6aca24878061a68055c1");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(message);
        groupOppositeController.a(SessionId.a(message), (List<Message>) arrayList, false);
    }

    public static /* synthetic */ void a(GroupOppositeController groupOppositeController, a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, groupOppositeController, changeQuickRedirect, false, "86fd3c170b78156a6f15499fb81869ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, groupOppositeController, changeQuickRedirect, false, "86fd3c170b78156a6f15499fb81869ac");
            return;
        }
        final DBGroupOpposite dBGroupOpposite = new DBGroupOpposite();
        dBGroupOpposite.setMsgId(aVar.b);
        dBGroupOpposite.setReadUids(groupOppositeController.a(aVar.d));
        dBGroupOpposite.setUnreadUids(groupOppositeController.a(aVar.e));
        dBGroupOpposite.setUpdateTime(com.sankuai.xm.login.c.a().a(System.currentTimeMillis()));
        final com.sankuai.xm.im.cache.d o = DBProxy.l().o();
        Object[] objArr2 = {dBGroupOpposite, null};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.cache.d.a;
        if (PatchProxy.isSupport(objArr2, o, changeQuickRedirect2, false, "72c9beee7dc7aa01937d88f0c2adb581", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, o, changeQuickRedirect2, false, "72c9beee7dc7aa01937d88f0c2adb581");
        } else {
            o.d.a(j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "de76c380e01783b49bb56a2259d597a9", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "de76c380e01783b49bb56a2259d597a9");
                        return;
                    }
                    com.sankuai.xm.base.tinyorm.f.a().b(o.d.bR_(), dBGroupOpposite, r3, null);
                    o.a(dBGroupOpposite, r3);
                }
            }), (Callback) null);
        }
        DBProxy.l().k.c(com.sankuai.xm.base.util.b.a(Long.valueOf(aVar.b)), aVar.c);
    }

    public static /* synthetic */ void a(GroupOppositeController groupOppositeController, HashMap hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, groupOppositeController, changeQuickRedirect, false, "97a2e10c78c43a13c4b4b02473073865", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, groupOppositeController, changeQuickRedirect, false, "97a2e10c78c43a13c4b4b02473073865");
            return;
        }
        try {
            j.a(i.end, "notify_opposite", new String[]{"opposite_msg"}, new Object[]{hashMap});
            if (hashMap != null && hashMap.size() > 0) {
                for (Short sh : hashMap.keySet()) {
                    short shortValue = sh.shortValue();
                    groupOppositeController.a(shortValue, (List) hashMap.get(Short.valueOf(shortValue)));
                }
                j.a((Object) null);
                return;
            }
            com.sankuai.xm.im.utils.a.d("%s::notifyReceiveOppositeInfo opposite param error", "GroupOppositeController");
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    public static /* synthetic */ void a(GroupOppositeController groupOppositeController, HashMap hashMap, short s, a aVar) {
        Object[] objArr = {hashMap, Short.valueOf(s), aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, groupOppositeController, changeQuickRedirect, false, "e01666e54de8d834425205f8b9207584", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, groupOppositeController, changeQuickRedirect, false, "e01666e54de8d834425205f8b9207584");
            return;
        }
        try {
            List list = (List) hashMap.get(Short.valueOf(s));
            if (list == null) {
                list = new ArrayList();
                hashMap.put(Short.valueOf(s), list);
            }
            list.add(aVar);
        } catch (Exception e2) {
            com.sankuai.xm.im.utils.a.a(e2, "%s::addNotifyItem", "GroupOppositeController");
        }
    }

    public static /* synthetic */ void a(GroupOppositeController groupOppositeController, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, groupOppositeController, changeQuickRedirect, false, "6e03a823299e83e86cd2d84c8a02e990", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, groupOppositeController, changeQuickRedirect, false, "6e03a823299e83e86cd2d84c8a02e990");
        } else if (list == null) {
            com.sankuai.xm.im.utils.a.d("%s::onQueryOppositeResult param error", "GroupOppositeController");
        } else {
            com.sankuai.xm.im.utils.a.b("%s::onQueryOppositeResult count:%d", "GroupOppositeController", Integer.valueOf(list.size()));
            groupOppositeController.a(false, (List<a>) list);
        }
    }

    public static /* synthetic */ void b(GroupOppositeController groupOppositeController) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, groupOppositeController, changeQuickRedirect, false, "f2e2ec60ee0cbd75fa01a663be287efb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, groupOppositeController, changeQuickRedirect, false, "f2e2ec60ee0cbd75fa01a663be287efb");
        } else {
            com.sankuai.xm.base.e.a().edit().putLong(groupOppositeController.e(), System.currentTimeMillis()).apply();
        }
    }

    public static /* synthetic */ void b(GroupOppositeController groupOppositeController, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, groupOppositeController, changeQuickRedirect, false, "a98bb936c29935c14fc1b9d029eeba6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, groupOppositeController, changeQuickRedirect, false, "a98bb936c29935c14fc1b9d029eeba6f");
        } else {
            com.sankuai.xm.base.e.a().edit().putString(groupOppositeController.h(), str).apply();
        }
    }

    public static /* synthetic */ void d(GroupOppositeController groupOppositeController) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, groupOppositeController, changeQuickRedirect, false, "d5e4510b826516a7b56e47c560849fce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, groupOppositeController, changeQuickRedirect, false, "d5e4510b826516a7b56e47c560849fce");
        } else {
            ((l) m.a(l.class)).b(OnGroupOppositeChangeListener.class).b().a(new b.a<OnGroupOppositeChangeListener>() { // from class: com.sankuai.xm.im.message.opposite.GroupOppositeController.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(OnGroupOppositeChangeListener onGroupOppositeChangeListener) {
                    OnGroupOppositeChangeListener onGroupOppositeChangeListener2 = onGroupOppositeChangeListener;
                    Object[] objArr2 = {onGroupOppositeChangeListener2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69aca255320cc96814963f7e9da2d6ee", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69aca255320cc96814963f7e9da2d6ee")).booleanValue();
                    }
                    com.sankuai.xm.im.utils.a.b("%s::notifyOppositeConfigChange listener:%s", "GroupOppositeController", onGroupOppositeChangeListener2);
                    onGroupOppositeChangeListener2.onOppositeConfigChanged();
                    return false;
                }
            });
        }
    }

    public GroupOppositeController() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2e4e2e16fb769132f50c9bd9beb4a27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2e4e2e16fb769132f50c9bd9beb4a27");
            return;
        }
        this.g = new LruCache<>(500);
        this.d = new HashMap<>();
        this.c = new f();
        this.e = new d();
        this.f = false;
    }

    public final boolean a(short s) {
        boolean z = true;
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79ff898bdd454e9589892db808ddefeb", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79ff898bdd454e9589892db808ddefeb")).booleanValue();
        }
        synchronized (this) {
            c cVar = this.d.get(Short.valueOf(s));
            if (cVar == null || !cVar.b) {
                z = false;
            }
        }
        return z;
    }

    private HashMap<Short, c> f() {
        HashMap<Short, c> hashMap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87f2f72863b09483870bdbce8809acdf", 6917529027641081856L)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87f2f72863b09483870bdbce8809acdf");
        }
        synchronized (this) {
            hashMap = new HashMap<>();
            hashMap.putAll(this.d);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(short s, final List<a> list) {
        Object[] objArr = {Short.valueOf(s), list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ccef3159f60f11719ffb41ac47a2fdb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ccef3159f60f11719ffb41ac47a2fdb");
        } else if (!b(s) || com.sankuai.xm.base.util.b.a(list)) {
            com.sankuai.xm.im.utils.a.d("%s::notifyReceiveOppositeInfo opposite param error", "GroupOppositeController");
        } else {
            ((l) m.a(l.class)).b(OnGroupOppositeChangeListener.class).a(s).a(new b.a<OnGroupOppositeChangeListener>() { // from class: com.sankuai.xm.im.message.opposite.GroupOppositeController.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(OnGroupOppositeChangeListener onGroupOppositeChangeListener) {
                    OnGroupOppositeChangeListener onGroupOppositeChangeListener2 = onGroupOppositeChangeListener;
                    Object[] objArr2 = {onGroupOppositeChangeListener2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "acc316e9b79dac99c635fa9c1f05bd1a", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "acc316e9b79dac99c635fa9c1f05bd1a")).booleanValue();
                    }
                    com.sankuai.xm.im.utils.a.b("%s::notifyReceiveOppositeInfo  listener:%s size:%d", "GroupOppositeController", onGroupOppositeChangeListener2, Integer.valueOf(list.size()));
                    onGroupOppositeChangeListener2.onReceiveOppositeInfo(list);
                    return false;
                }
            });
        }
    }

    @Trace(name = "notify_opposite", type = i.end)
    public void a(short s, final int i, final List<Long> list) {
        Object[] objArr = {Short.valueOf(s), Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35a3b077cad95f356b9bbe8f5db6dda6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35a3b077cad95f356b9bbe8f5db6dda6");
            return;
        }
        try {
            j.a(i.end, "notify_opposite", new String[]{"opposite_msg"}, new Object[]{new Short(s), new Integer(i), list});
            if (b(s) && !com.sankuai.xm.base.util.b.a(list)) {
                ((l) m.a(l.class)).b(OnGroupOppositeChangeListener.class).a(s).a(new b.a<OnGroupOppositeChangeListener>() { // from class: com.sankuai.xm.im.message.opposite.GroupOppositeController.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.util.b.a
                    public final /* synthetic */ boolean a(OnGroupOppositeChangeListener onGroupOppositeChangeListener) {
                        OnGroupOppositeChangeListener onGroupOppositeChangeListener2 = onGroupOppositeChangeListener;
                        Object[] objArr2 = {onGroupOppositeChangeListener2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fc2136533ba83bbfc0d724085350390", 6917529027641081856L)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fc2136533ba83bbfc0d724085350390")).booleanValue();
                        }
                        com.sankuai.xm.im.utils.a.b("%s::notifySendOppositeRes listener:%s status:%d size:%d", "GroupOppositeController", onGroupOppositeChangeListener2, Integer.valueOf(i), Integer.valueOf(list.size()));
                        onGroupOppositeChangeListener2.onSendOppositeRes(i, list);
                        return false;
                    }
                });
                j.a((Object) null);
                return;
            }
            com.sankuai.xm.im.utils.a.d("%s::notifySendOppositeRes opposite param error", "GroupOppositeController");
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    @Override // com.sankuai.xm.im.message.opposite.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a1dfc131fe7070bdba2839c5df23e37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a1dfc131fe7070bdba2839c5df23e37");
            return;
        }
        this.g.evictAll();
        super.a();
    }

    public final void a(@NonNull SessionId sessionId, @NonNull List<Message> list) {
        Object[] objArr = {sessionId, list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1474fc752f9cfd689b0cdb5bfdaabc7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1474fc752f9cfd689b0cdb5bfdaabc7e");
        } else if (sessionId == null || !sessionId.i() || com.sankuai.xm.base.util.b.a(list)) {
            com.sankuai.xm.im.utils.a.d("%s::sendOpposite opposite param error", "GroupOppositeController");
        } else if (!b(sessionId.g)) {
            com.sankuai.xm.im.utils.a.c("%s::sendOpposite opposite func not open, channel = %d", "GroupOppositeController", Short.valueOf(sessionId.g));
        } else {
            List<Message> b2 = this.c.b(sessionId, list);
            DBProxy.l().k.c(MessageUtils.messagesToMsgIds(b2), 2);
            if (!com.sankuai.xm.base.util.b.a(b2)) {
                a(sessionId.g, 2, MessageUtils.messagesToMsgIds(b2));
            }
            this.c.a(sessionId, b2);
        }
    }

    private void b(final SessionId sessionId, List<Message> list) {
        Object[] objArr = {sessionId, list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "724b0086339bb56b5bdf8a6cc6fca3d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "724b0086339bb56b5bdf8a6cc6fca3d3");
        } else if (sessionId == null || com.sankuai.xm.base.util.b.a(list)) {
            com.sankuai.xm.im.utils.a.d("%s::notifyLocalOppositeData param error", "GroupOppositeController");
        } else {
            DBProxy.l().o().a(MessageUtils.messagesToMsgIds(list), new Callback<List<DBGroupOpposite>>() { // from class: com.sankuai.xm.im.message.opposite.GroupOppositeController.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(List<DBGroupOpposite> list2) {
                    List<DBGroupOpposite> list3 = list2;
                    Object[] objArr2 = {list3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1670bbc3ef3143dd27606c4e5b1f8ae", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1670bbc3ef3143dd27606c4e5b1f8ae");
                    } else if (!com.sankuai.xm.base.util.b.a(list3)) {
                        ArrayList arrayList = new ArrayList();
                        for (DBGroupOpposite dBGroupOpposite : list3) {
                            DBMessage a2 = DBProxy.l().k.a(2, dBGroupOpposite.getMsgId(), true);
                            if (a2 == null) {
                                com.sankuai.xm.im.utils.a.d("%s::notifyLocalOppositeData not found msgId:%d", "GroupOppositeController", Long.valueOf(dBGroupOpposite.getMsgId()));
                            } else {
                                com.sankuai.xm.im.utils.a.b("%s::notifyLocalOppositeData msgid:%d", "GroupOppositeController", Long.valueOf(dBGroupOpposite.getMsgId()));
                                a aVar = new a();
                                aVar.a(dBGroupOpposite.getMsgId());
                                aVar.c = a2.getMsgOppositeStatus();
                                aVar.a(GroupOppositeController.this.a(dBGroupOpposite.getReadUids()));
                                aVar.b(GroupOppositeController.this.a(dBGroupOpposite.getUnreadUids()));
                                arrayList.add(aVar);
                            }
                        }
                        if (com.sankuai.xm.base.util.b.a((Collection<?>) arrayList)) {
                            return;
                        }
                        GroupOppositeController.this.a(sessionId.g, arrayList);
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50fcfd533815cea4c6aa0fcc2d7c4566", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50fcfd533815cea4c6aa0fcc2d7c4566");
                    } else {
                        com.sankuai.xm.im.utils.a.d("%s::notifyLocalOppositeData fail code:%d message:%s", "GroupOppositeController", Integer.valueOf(i), str);
                    }
                }
            });
        }
    }

    public final void a(com.sankuai.xm.base.proto.opposite.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "906d6d4e56592bf8e98981530c3226f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "906d6d4e56592bf8e98981530c3226f2");
            return;
        }
        com.sankuai.xm.im.utils.a.b("%s::onReceiveOpposite %s", "GroupOppositeController", cVar.toString());
        byte[][] d2 = cVar.d();
        if (d2 == null) {
            com.sankuai.xm.im.utils.a.d("%s::onSendOppositeRes not found item uuid:%s", "GroupOppositeController", cVar.c());
            return;
        }
        for (byte[] bArr : d2) {
            com.sankuai.xm.base.proto.opposite.b bVar = new com.sankuai.xm.base.proto.opposite.b();
            bVar.a(bArr);
            com.sankuai.xm.im.utils.a.b("%s::onReceiveOpposite item:%s", "GroupOppositeController", bVar.toString());
            HashSet hashSet = new HashSet();
            hashSet.add(Long.valueOf(cVar.b()));
            a(true, bVar.b(), (Set<Long>) hashSet, (Set<Long>) new HashSet());
        }
    }

    @Trace(name = "handle_opposite", type = i.normal)
    private void a(boolean z, long j, Set<Long> set, Set<Long> set2) {
        Object[] objArr = {(byte) 1, new Long(j), set, set2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6fd32ed93996ef29f4024f1cbee1480", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6fd32ed93996ef29f4024f1cbee1480");
            return;
        }
        try {
            j.a(i.normal, "handle_opposite", new String[]{"opposite_msg"}, new Object[]{new Boolean(true), new Long(j), set, set2});
            a aVar = new a();
            aVar.a(j);
            aVar.a(set);
            aVar.b(set2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar);
            a(true, (List<a>) arrayList);
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    private void a(final boolean z, final List<a> list) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c28677abe936b14e7e765690ea7dc73d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c28677abe936b14e7e765690ea7dc73d");
        } else if (com.sankuai.xm.base.util.b.a(list)) {
            com.sankuai.xm.im.utils.a.d("%s::dealReceiveOpposite param error", "GroupOppositeController");
        } else {
            DBProxy.l().o().a(a(list), new Callback<List<DBGroupOpposite>>() { // from class: com.sankuai.xm.im.message.opposite.GroupOppositeController.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(List<DBGroupOpposite> list2) {
                    List<DBGroupOpposite> list3 = list2;
                    Object[] objArr2 = {list3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01ad8d4003b7393be5fef11a78c2f0b6", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01ad8d4003b7393be5fef11a78c2f0b6");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    for (a aVar : list) {
                        long j = aVar.b;
                        if (j <= 0) {
                            com.sankuai.xm.im.utils.a.b("%s::dealReceiveOpposite message not send success", "GroupOppositeController");
                        } else {
                            DBMessage a2 = DBProxy.l().k.a(2, j, true);
                            if (a2 == null) {
                                com.sankuai.xm.im.utils.a.b("%s::dealReceiveOpposite db message table not found msgId:%d", "GroupOppositeController", Long.valueOf(j));
                                GroupOppositeController.this.g.put(Long.valueOf(j), aVar);
                            } else if (a2.getFromUid() != IMClient.a().k()) {
                                com.sankuai.xm.im.utils.a.d("%s::dealReceiveOpposite not send message msgId:%d", "GroupOppositeController", Long.valueOf(j));
                            } else {
                                DBGroupOpposite a3 = GroupOppositeController.a(GroupOppositeController.this, list3, j);
                                Object[] objArr3 = new Object[3];
                                objArr3[0] = "GroupOppositeController";
                                objArr3[1] = aVar.toString();
                                objArr3[2] = a3 == null ? "" : a3.toString();
                                com.sankuai.xm.im.utils.a.b("%s::dealReceiveOpposite dealInfo:%s DBInfo:%s", objArr3);
                                if (!z || a3 != null) {
                                    a a4 = GroupOppositeController.this.a(j, a3, aVar.d, aVar.e);
                                    if (a4 == null) {
                                        com.sankuai.xm.im.utils.a.d("%s::dealReceiveOpposite not merge opposite info msgId:%d", "GroupOppositeController", Long.valueOf(j));
                                    } else {
                                        GroupOppositeController.a(GroupOppositeController.this, a4);
                                        GroupOppositeController.a(GroupOppositeController.this, hashMap, a2.getChannel(), a4);
                                    }
                                } else {
                                    com.sankuai.xm.im.utils.a.b("%s::dealReceiveOpposite online first receive msgid:%d need query opposite info", "GroupOppositeController", Long.valueOf(j));
                                    GroupOppositeController.a(GroupOppositeController.this, a2);
                                }
                            }
                        }
                    }
                    if (hashMap.size() > 0) {
                        GroupOppositeController.a(GroupOppositeController.this, hashMap);
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(@TraceStatus int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24b9f0f47ee3a83230939c0dd831ade1", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24b9f0f47ee3a83230939c0dd831ade1");
                        return;
                    }
                    j.a(new Integer(i), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                    com.sankuai.xm.im.utils.a.d("%s::dealReceiveOpposite fail code:%d message:%s", "GroupOppositeController", Integer.valueOf(i), str);
                }
            });
        }
    }

    private List<Long> a(List<a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4363a02dd6167de09250e2d1c79e120c", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4363a02dd6167de09250e2d1c79e120c");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.xm.base.util.b.a(list)) {
            return arrayList;
        }
        for (a aVar : list) {
            arrayList.add(Long.valueOf(aVar.b));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af A[Catch: Exception -> 0x00de, TryCatch #0 {Exception -> 0x00de, blocks: (B:6:0x003b, B:8:0x004c, B:10:0x0056, B:13:0x0061, B:15:0x0067, B:17:0x006d, B:28:0x00a9, B:30:0x00af, B:43:0x00d2, B:32:0x00b5, B:34:0x00bb, B:37:0x00c3, B:39:0x00c9, B:18:0x0074, B:20:0x0082, B:22:0x008c, B:25:0x009b, B:21:0x0086, B:26:0x00a2), top: B:48:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9 A[Catch: Exception -> 0x00de, TryCatch #0 {Exception -> 0x00de, blocks: (B:6:0x003b, B:8:0x004c, B:10:0x0056, B:13:0x0061, B:15:0x0067, B:17:0x006d, B:28:0x00a9, B:30:0x00af, B:43:0x00d2, B:32:0x00b5, B:34:0x00bb, B:37:0x00c3, B:39:0x00c9, B:18:0x0074, B:20:0x0082, B:22:0x008c, B:25:0x009b, B:21:0x0086, B:26:0x00a2), top: B:48:0x003b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.sankuai.xm.im.message.opposite.GroupOppositeController.a a(long r20, com.sankuai.xm.im.cache.bean.DBGroupOpposite r22, java.util.Set<java.lang.Long> r23, java.util.Set<java.lang.Long> r24) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.message.opposite.GroupOppositeController.a(long, com.sankuai.xm.im.cache.bean.DBGroupOpposite, java.util.Set, java.util.Set):com.sankuai.xm.im.message.opposite.GroupOppositeController$a");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<Long> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6c8d5de0bf88b82162627e8cfd6d9c1", 6917529027641081856L)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6c8d5de0bf88b82162627e8cfd6d9c1");
        }
        HashSet hashSet = new HashSet();
        try {
            if (!TextUtils.isEmpty(str)) {
                for (String str2 : com.sankuai.xm.base.util.b.a(str.split(CommonConstant.Symbol.COMMA))) {
                    if (!TextUtils.isEmpty(str2)) {
                        hashSet.add(Long.valueOf(Long.parseLong(str2)));
                    }
                }
            }
        } catch (Exception e2) {
            com.sankuai.xm.im.utils.a.a(e2, "%s::getUidsByDBString", "GroupOppositeController");
        }
        return hashSet;
    }

    private String a(Set<Long> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9418dfa75ab96460c3a5fc48be09f22", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9418dfa75ab96460c3a5fc48be09f22");
        }
        StringBuilder sb = new StringBuilder("");
        try {
            if (!com.sankuai.xm.base.util.b.a(set)) {
                for (Long l : set) {
                    sb.append(l);
                    sb.append(CommonConstant.Symbol.COMMA);
                }
                int lastIndexOf = sb.lastIndexOf(CommonConstant.Symbol.COMMA);
                if (lastIndexOf >= 0) {
                    sb.deleteCharAt(lastIndexOf);
                }
            }
        } catch (Exception e2) {
            com.sankuai.xm.im.utils.a.a(e2, "%s::getDBStringByUids", "GroupOppositeController");
        }
        return sb.toString();
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84d7ed9967ac77d835c3e5d728fef26a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84d7ed9967ac77d835c3e5d728fef26a");
        } else if (com.sankuai.xm.im.c.a(c.b.GROUP_CHAT)) {
            try {
                if (this.f) {
                    return;
                }
                g();
                this.f = true;
            } catch (Exception e2) {
                com.sankuai.xm.im.utils.a.a(e2, "%s::loadOppositeConfig", "GroupOppositeController");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        c cVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "132db20d1e2f99cbdab37e2347e67d31", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "132db20d1e2f99cbdab37e2347e67d31");
            return;
        }
        try {
            synchronized (this) {
                this.d.clear();
                if (TextUtils.isEmpty(i())) {
                    return;
                }
                JSONArray jSONArray = new JSONArray(i());
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    short optInt = (short) jSONObject.optInt("channel", -888);
                    if (!this.d.containsKey(Short.valueOf(optInt))) {
                        cVar = new c();
                        this.d.put(Short.valueOf(optInt), cVar);
                    } else {
                        cVar = this.d.get(Short.valueOf(optInt));
                    }
                    cVar.b = jSONObject.optInt("isopen") == 1;
                }
            }
        } catch (Exception e2) {
            com.sankuai.xm.im.utils.a.a(e2, "%s::loadConfigData", "GroupOppositeController");
        }
    }

    private String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e9de4566d453f93325de1e38a833f75", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e9de4566d453f93325de1e38a833f75");
        }
        return "opposite_config_key_group_" + com.sankuai.xm.network.setting.f.a().e();
    }

    private String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7f8b0f8c6d1e005385b202290e16b08", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7f8b0f8c6d1e005385b202290e16b08") : com.sankuai.xm.base.e.a().getString(h(), "");
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1b3e523b38493c5b38afc7d2977db27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1b3e523b38493c5b38afc7d2977db27");
        } else if (com.sankuai.xm.im.c.a(c.b.GROUP_CHAT)) {
            HashMap<Short, c> f2 = f();
            for (Short sh : f2.keySet()) {
                short shortValue = sh.shortValue();
                if (f2.get(Short.valueOf(shortValue)).b) {
                    DBProxy.l().k.a(shortValue, 1000, 2, new Callback<List<DBMessage>>() { // from class: com.sankuai.xm.im.message.opposite.GroupOppositeController.6
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.base.callback.Callback
                        public final /* synthetic */ void onSuccess(List<DBMessage> list) {
                            List<DBMessage> list2 = list;
                            Object[] objArr2 = {list2};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a6033b52481a61f0cab733813193104", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a6033b52481a61f0cab733813193104");
                            } else if (list2 != null && list2.size() > 0) {
                                for (DBMessage dBMessage : list2) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(dBMessage);
                                    com.sankuai.xm.im.utils.a.b("%s::resendLocalSendingData info:%s", "GroupOppositeController", dBMessage.toString());
                                    GroupOppositeController.this.a(SessionId.a(dBMessage), arrayList);
                                }
                            }
                        }

                        @Override // com.sankuai.xm.base.callback.Callback
                        public final void onFailure(int i, String str) {
                            Object[] objArr2 = {Integer.valueOf(i), str};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ac745d74cf03c6f3ccc5e296983be73", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ac745d74cf03c6f3ccc5e296983be73");
                            } else {
                                com.sankuai.xm.im.utils.a.d("%s::resendLocalData::queryOppositeMsg error code:%d message:%s", "GroupOppositeController", Integer.valueOf(i), str);
                            }
                        }
                    });
                }
            }
        }
    }

    public String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "376d6e7f1fe438b18745ed404f221c12", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "376d6e7f1fe438b18745ed404f221c12");
        }
        return "group_opposite_config_last_request_time_" + com.sankuai.xm.network.setting.f.a().e();
    }

    private boolean b(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f37904a9499e9e7c6fddbe46667787a", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f37904a9499e9e7c6fddbe46667787a")).booleanValue() : com.sankuai.xm.im.c.a(c.b.GROUP_CHAT) && a(s) && IMClient.a().k() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<a> a(com.sankuai.xm.base.util.net.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4d9e8ae7a0ae50ccb82d94d3b5d7a2c", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4d9e8ae7a0ae50ccb82d94d3b5d7a2c");
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray f2 = cVar.f("data");
            if (f2 != null) {
                for (int i = 0; i < f2.length(); i++) {
                    JSONObject jSONObject = f2.getJSONObject(i);
                    a aVar = new a();
                    aVar.a(jSONObject.optLong("msgid", 0L));
                    JSONArray jSONArray = jSONObject.getJSONArray("receipt_uid");
                    if (jSONArray != null) {
                        HashSet hashSet = new HashSet();
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            hashSet.add(Long.valueOf(jSONArray.getLong(i2)));
                        }
                        aVar.a(hashSet);
                    }
                    JSONArray jSONArray2 = jSONObject.getJSONArray("unreceipt_uid");
                    if (jSONArray2 != null) {
                        HashSet hashSet2 = new HashSet();
                        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                            hashSet2.add(Long.valueOf(jSONArray2.getLong(i3)));
                        }
                        aVar.b(hashSet2);
                    }
                    arrayList.add(aVar);
                }
            }
        } catch (Exception e2) {
            com.sankuai.xm.im.utils.a.a(e2, "%s::parseChatItems", "GroupOppositeController");
        }
        return arrayList;
    }

    @Override // com.sankuai.xm.im.message.opposite.a
    public final void a(List<IMMessage> list, boolean z) {
        a remove;
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "388e07c3b829147793d6a2b33fbac316", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "388e07c3b829147793d6a2b33fbac316");
        } else if (!com.sankuai.xm.base.util.b.a(list) && this.g.size() != 0 && !z) {
            ArrayList arrayList = new ArrayList();
            for (IMMessage iMMessage : list) {
                if (iMMessage != null && iMMessage.getMsgId() != 0 && iMMessage.getDirection() == 1 && iMMessage.getCategory() == 2 && (remove = this.g.remove(Long.valueOf(iMMessage.getMsgId()))) != null) {
                    arrayList.add(remove);
                }
            }
            com.sankuai.xm.im.utils.a.b("GroupOppositeController::onReceiveMessages:: deal for the delay messages, items: " + arrayList.size() + ", cache: " + this.g.size(), new Object[0]);
            a(true, (List<a>) arrayList);
        }
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86c2711e9cd9ebf4b358b370b6d03d07", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86c2711e9cd9ebf4b358b370b6d03d07");
            } else {
                super.a();
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(JSONObject jSONObject) throws Exception {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e49b11048ca40860dc63ae3dcd04928", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e49b11048ca40860dc63ae3dcd04928");
                return;
            }
            try {
                com.sankuai.xm.im.utils.a.b("%s::QueryOppositeCallback result = %s", "GroupOppositeController", jSONObject.toString());
                GroupOppositeController.a(GroupOppositeController.this, GroupOppositeController.this.a(new com.sankuai.xm.base.util.net.c(jSONObject)));
            } catch (Exception e) {
                com.sankuai.xm.im.utils.a.a(e, "%s::QueryOppositeBySessionCallback", "GroupOppositeController");
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78a8458e96f2f54a9e1ab1f1e290115d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78a8458e96f2f54a9e1ab1f1e290115d");
            } else {
                com.sankuai.xm.im.utils.a.d("%s::QueryOppositeCallback onFailure fail code:%d message:%s", "GroupOppositeController", Integer.valueOf(i), str);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class f extends com.sankuai.xm.im.message.opposite.util.a<Message> {
        public static ChangeQuickRedirect a;
        private List<a> d;

        /* compiled from: ProGuard */
        /* loaded from: classes6.dex */
        public class a {
            public String a;
            public SessionId b;
            public List<Message> c;

            private a() {
                this.a = "";
                this.b = null;
                this.c = new ArrayList();
            }
        }

        public f() {
            super(300L);
            Object[] objArr = {GroupOppositeController.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c32a08d0f54155bd9a5961b6d3b4d4a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c32a08d0f54155bd9a5961b6d3b4d4a");
            } else {
                this.d = new ArrayList();
            }
        }

        @Override // com.sankuai.xm.im.message.opposite.util.a
        public final void a(Map<SessionId, List<Message>> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "867eb8ae7e4f7c7bc987eca85c3201a0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "867eb8ae7e4f7c7bc987eca85c3201a0");
                return;
            }
            List<a> b = b(map);
            Object[] objArr2 = {b};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95e27657ad20b3a829fecf02a6ac53d3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95e27657ad20b3a829fecf02a6ac53d3");
                return;
            }
            try {
                j.a(i.send, "send_opposite", (String[]) null, new Object[]{b});
                if (b != null && b.size() > 0) {
                    for (a aVar : b) {
                        if (aVar.c.size() > 0 && !TextUtils.isEmpty(aVar.a)) {
                            com.sankuai.xm.base.proto.opposite.a aVar2 = new com.sankuai.xm.base.proto.opposite.a();
                            aVar2.a(aVar.a);
                            aVar2.a(com.sankuai.xm.login.a.a().e());
                            aVar2.b(aVar.b.b);
                            aVar2.c(IMClient.a().m());
                            aVar2.a((byte) 1);
                            aVar2.a(aVar.b.g);
                            aVar2.c(com.sankuai.xm.login.a.a().m());
                            com.sankuai.xm.im.utils.a.b("%s::sendOpposite count:%d", "GroupOppositeController", Integer.valueOf(aVar.c.size()));
                            byte[][] bArr = new byte[aVar.c.size()];
                            for (int i = 0; i < aVar.c.size(); i++) {
                                Message message = aVar.c.get(i);
                                com.sankuai.xm.base.proto.opposite.b bVar = new com.sankuai.xm.base.proto.opposite.b();
                                bVar.b(message.getMsgId());
                                bVar.a(message.getMsgUuid());
                                bVar.a(message.getFromUid());
                                com.sankuai.xm.im.utils.a.b("%s::sendOpposite data:%s", "GroupOppositeController", bVar.toString());
                                bArr[i] = bVar.bS_();
                            }
                            aVar2.a(bArr);
                            byte[] bS_ = aVar2.bS_();
                            if (bS_ != null) {
                                com.sankuai.xm.im.connection.c.a((short) 401, bS_);
                            }
                        }
                        com.sankuai.xm.im.utils.a.d("%s::sendProtocolData opposite param error", "GroupOppositeController");
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

        private synchronized List<a> b(Map<SessionId, List<Message>> map) {
            Map<SessionId, List<Message>> map2 = map;
            synchronized (this) {
                int i = 0;
                Object[] objArr = {map2};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f7738426c6124ff82beb5395d9891ad", 6917529027641081856L)) {
                    return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f7738426c6124ff82beb5395d9891ad");
                }
                ArrayList arrayList = new ArrayList();
                Iterator<SessionId> it = map.keySet().iterator();
                while (it.hasNext()) {
                    SessionId next = it.next();
                    List<Message> list = map2.get(next);
                    if (list != null && list.size() > 0) {
                        int i2 = 0;
                        while (i2 < list.size()) {
                            ArrayList arrayList2 = new ArrayList();
                            int i3 = i2;
                            while (i3 < list.size() && arrayList2.size() < 50) {
                                arrayList2.add(list.get(i3));
                                i3++;
                            }
                            a aVar = new a();
                            aVar.b = next;
                            Object[] objArr2 = new Object[i];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            Iterator<SessionId> it2 = it;
                            aVar.a = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d952bfd187bb77ca6102259132f7f7e7", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d952bfd187bb77ca6102259132f7f7e7") : UUID.randomUUID().toString();
                            aVar.c.addAll(arrayList2);
                            this.d.add(aVar);
                            arrayList.add(aVar);
                            i2 = i3;
                            it = it2;
                            i = 0;
                        }
                    }
                    map2 = map;
                }
                return arrayList;
            }
        }

        public final synchronized short a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b03632685bd48a4b6cceb5150485cd6", 6917529027641081856L)) {
                return ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b03632685bd48a4b6cceb5150485cd6")).shortValue();
            }
            short s = -888;
            Iterator<a> it = this.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a next = it.next();
                if (TextUtils.equals(str, next.a)) {
                    s = next.b.g;
                    break;
                }
            }
            return s;
        }

        public final synchronized List<Message> b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ce0f3f6f1df3bdf16a1ea477f5e11e1", 6917529027641081856L)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ce0f3f6f1df3bdf16a1ea477f5e11e1");
            }
            ArrayList arrayList = new ArrayList();
            Iterator<a> it = this.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a next = it.next();
                if (TextUtils.equals(str, next.a)) {
                    arrayList.addAll(next.c);
                    this.d.remove(next);
                    break;
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class d extends com.sankuai.xm.im.message.opposite.util.a<Message> {
        public static ChangeQuickRedirect a;

        public d() {
            super(300L);
            Object[] objArr = {GroupOppositeController.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5684fa327304a697a7ada37fd98c93f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5684fa327304a697a7ada37fd98c93f");
            }
        }

        @Override // com.sankuai.xm.im.message.opposite.util.a
        public final void a(Map<SessionId, List<Message>> map) {
            char c = 1;
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "614526ff7fc221ee731ed7b7464594a7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "614526ff7fc221ee731ed7b7464594a7");
                return;
            }
            for (SessionId sessionId : map.keySet()) {
                List<Message> list = map.get(sessionId);
                if (list != null && list.size() > 0) {
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = sessionId;
                    objArr2[c] = list;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82950d1d6c3e50ec3fa5a5dafaebcb50", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82950d1d6c3e50ec3fa5a5dafaebcb50");
                    } else if (sessionId == null || com.sankuai.xm.base.util.b.a(list)) {
                        com.sankuai.xm.im.utils.a.d("%s::queryOppositeData param error", "GroupOppositeController");
                    } else {
                        String a2 = com.sankuai.xm.im.http.a.a("/receipt/api/v1/group/list");
                        HashMap hashMap = new HashMap();
                        List<Long> messagesToMsgIds = MessageUtils.messagesToMsgIds(list);
                        if (messagesToMsgIds != null) {
                            hashMap.put("mids", new JSONArray((Collection) messagesToMsgIds));
                        }
                        com.sankuai.xm.im.utils.a.b("%s::queryOppositeData url = %s session = %s size = %d msgIds = %s", "GroupOppositeController", a2, sessionId.toString(), Integer.valueOf(messagesToMsgIds.size()), messagesToMsgIds);
                        com.sankuai.xm.base.d dVar = new com.sankuai.xm.base.d(a2, hashMap, new e());
                        dVar.a(new com.sankuai.xm.network.httpurlconnection.retry.a());
                        g.a().a((com.sankuai.xm.network.httpurlconnection.e) dVar, 0L);
                    }
                    c = 1;
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class b extends com.sankuai.xm.network.httpurlconnection.d {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // com.sankuai.xm.network.httpurlconnection.c
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f063cc89800deff1702ea5778cb2cb1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f063cc89800deff1702ea5778cb2cb1");
            } else {
                super.a();
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(JSONObject jSONObject) throws Exception {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d597149ada449325aea031cf7aa9a4d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d597149ada449325aea031cf7aa9a4d");
                return;
            }
            try {
                com.sankuai.xm.im.utils.a.b("%s::OppositeConfigCallback %s", "GroupOppositeController", jSONObject.toString());
                JSONArray f = new com.sankuai.xm.base.util.net.c(jSONObject).f("data");
                GroupOppositeController.b(GroupOppositeController.this);
                GroupOppositeController.b(GroupOppositeController.this, f.toString());
                GroupOppositeController.this.g();
                GroupOppositeController.d(GroupOppositeController.this);
            } catch (Exception e) {
                com.sankuai.xm.im.utils.a.a(e, "%s::OppositeConfigCallback", "GroupOppositeController");
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a64528fbc1ad6b7b6358c112b5288f8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a64528fbc1ad6b7b6358c112b5288f8");
            } else {
                com.sankuai.xm.im.utils.a.d("%s::OppositeConfigCallback onFailure query config fail code:%d message:%s", "GroupOppositeController", Integer.valueOf(i), str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class c {
        public static ChangeQuickRedirect a;
        boolean b;

        private c() {
            Object[] objArr = {GroupOppositeController.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d878af86a0d3e6f2501abf0f73ca68bb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d878af86a0d3e6f2501abf0f73ca68bb");
            } else {
                this.b = false;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public long b;
        public int c;
        public Set<Long> d;
        public Set<Long> e;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9252b8b3fe3d5ae64a5fbf772ee50a4f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9252b8b3fe3d5ae64a5fbf772ee50a4f");
                return;
            }
            this.c = 0;
            this.d = new HashSet();
            this.e = new HashSet();
        }

        public final void a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5705f152bb3cabfd6302a1ca97059d5b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5705f152bb3cabfd6302a1ca97059d5b");
            } else {
                this.b = j;
            }
        }

        public final void a(Set<Long> set) {
            Object[] objArr = {set};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5f8fc05526a13e6ef3ae9d1974a2948", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5f8fc05526a13e6ef3ae9d1974a2948");
            } else if (set == null) {
                this.d = new HashSet();
            } else {
                this.d = set;
            }
        }

        public final void b(Set<Long> set) {
            Object[] objArr = {set};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0af72fc22f11019cbda1946cf4f1ae40", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0af72fc22f11019cbda1946cf4f1ae40");
            } else if (set == null) {
                this.e = new HashSet();
            } else {
                this.e = set;
            }
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afb5094751df65a8a477df79f96989f5", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afb5094751df65a8a477df79f96989f5");
            }
            StringBuilder sb = new StringBuilder("GroupOppositeMsgStatus{");
            sb.append("msgId=");
            sb.append(this.b);
            sb.append(", status=");
            sb.append(this.c);
            if (this.d != null) {
                sb.append(", mOppositeReaUids=");
                sb.append(this.d.toString());
            }
            if (this.e != null) {
                sb.append(", mOppositeUnreadMsgIds=");
                sb.append(this.e.toString());
            }
            sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
            return sb.toString();
        }
    }

    public void a(SessionId sessionId, List<Message> list, boolean z) {
        Object[] objArr = {sessionId, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94114a6d211c8e0b78d4380d76f7bcb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94114a6d211c8e0b78d4380d76f7bcb9");
        } else if (sessionId == null || !b(sessionId.g) || com.sankuai.xm.base.util.b.a(list)) {
            com.sankuai.xm.im.utils.a.d("%s::queryOpposite param error", "GroupOppositeController");
        } else {
            List<Message> b2 = this.e.b(sessionId, list);
            if (!com.sankuai.xm.base.util.b.a(b2) && z) {
                b(sessionId, b2);
            }
            this.e.a(sessionId, b2);
        }
    }
}
