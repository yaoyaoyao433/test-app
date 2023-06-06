package com.sankuai.xm.im.session;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Base64;
import android.util.Pair;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.resource.APKStructure;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.component.anno.Component;
import com.sankuai.xm.base.component.e;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.c;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.cache.bean.DBMessage;
import com.sankuai.xm.im.cache.bean.DBSession;
import com.sankuai.xm.im.cache.f;
import com.sankuai.xm.im.cache.o;
import com.sankuai.xm.im.message.bean.CancelMessage;
import com.sankuai.xm.im.message.bean.ForceCancelMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.sankuai.xm.im.message.d;
import com.sankuai.xm.im.message.history.HistoryController;
import com.sankuai.xm.im.session.a;
import com.sankuai.xm.im.session.entry.SessionStamp;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.imextra.impl.sessionpresent.db.DBSessionMsgSpecialTag;
import com.sankuai.xm.monitor.report.sample.h;
import com.sankuai.xm.network.httpurlconnection.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Component
/* loaded from: classes6.dex */
public class c implements com.sankuai.xm.base.component.a, com.sankuai.xm.base.component.d, com.sankuai.xm.base.feedback.c {
    public static ChangeQuickRedirect a;
    public AtomicReference<SessionId> b;
    private com.sankuai.xm.im.session.a c;
    private e d;
    private boolean e;
    private e f;
    private final ConcurrentHashMap<String, Object> g;
    private final Object h;

    private static String a(int i) {
        return i == 1 ? "SESSION_LIST_VERSION_IM" : "SESSION_LIST_VERSION_PUB";
    }

    private e k() {
        if (this.f == null) {
            synchronized (this.h) {
                if (this.f == null) {
                    this.f = new e(l.class, "mListenerSvc", this);
                }
            }
        }
        return this.f;
    }

    @Override // com.sankuai.xm.base.component.d
    public final <T> T a(String str, Class<T> cls, com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {str, cls, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "629766c41066b8e6fe420315fadfded5", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "629766c41066b8e6fe420315fadfded5");
        }
        b bVar2 = ("mSessionInfoController".equals(str) && cls == b.class) ? new b((c) ((Object[]) this.g.remove("mSessionInfoController"))[0]) : null;
        if (bVar2 instanceof com.sankuai.xm.base.component.a) {
            ((com.sankuai.xm.base.component.a) bVar2).a(bVar);
        }
        if (cls.isInstance(bVar2)) {
            return cls.cast(bVar2);
        }
        return null;
    }

    @Override // com.sankuai.xm.base.component.a
    public final void a(com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "545445113501673047de95b04d672753", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "545445113501673047de95b04d672753");
        } else if (bVar != null) {
            f().a(bVar);
            k().a(bVar);
        }
    }

    public final e f() {
        if (this.d == null) {
            synchronized (this.h) {
                if (this.d == null) {
                    this.d = new e(b.class, "mSessionInfoController", this);
                }
            }
        }
        return this.d;
    }

    public static /* synthetic */ b a(c cVar) {
        return (b) cVar.f().a();
    }

    public static /* synthetic */ List a(c cVar, List list, boolean z) {
        Integer valueOf;
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "1fb4c84d260d0ca3241782c1d5c084f1", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "1fb4c84d260d0ca3241782c1d5c084f1");
        }
        if (list == null || list.isEmpty()) {
            com.sankuai.xm.im.utils.a.b("SessionProcessor::processDBResult, result == null", new Object[0]);
            return null;
        }
        com.sankuai.xm.im.utils.c.a((List<? extends Message>) list, true);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DBSession dBSession = (DBSession) it.next();
            com.sankuai.xm.im.session.entry.a dbSessionToSession = MessageUtils.dbSessionToSession(dBSession);
            if (!z || IMClient.a().a(dBSession.getChannel())) {
                arrayList.add(dbSessionToSession);
                Integer num = (Integer) hashMap.get(Short.valueOf(dBSession.getChannel()));
                if (num != null) {
                    valueOf = Integer.valueOf(num.intValue() + dbSessionToSession.d);
                } else {
                    valueOf = Integer.valueOf(dbSessionToSession.d);
                }
                hashMap.put(Short.valueOf(dBSession.getChannel()), valueOf);
            }
        }
        com.sankuai.xm.im.utils.a.b("SessionProcessor::processDBResult, result / query size count = %d/%d, unreadsD<channel=unread>:%s", Integer.valueOf(arrayList.size()), Integer.valueOf(list.size()), hashMap);
        return arrayList;
    }

    public static /* synthetic */ void a(c cVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "8a7aec5d9c262e05baf54c72f18fdcd9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "8a7aec5d9c262e05baf54c72f18fdcd9");
            return;
        }
        long a2 = com.sankuai.xm.login.c.a().a(System.currentTimeMillis());
        switch (i) {
            case 1:
                com.sankuai.xm.im.utils.b.a(com.sankuai.xm.im.utils.b.a().a("SESSION_LIST_VERSION_IM", Long.toString(a2)));
                return;
            case 2:
                com.sankuai.xm.im.utils.b.a(com.sankuai.xm.im.utils.b.a().a("SESSION_LIST_VERSION_PUB", Long.toString(a2)));
                return;
            default:
                return;
        }
    }

    public static /* synthetic */ void a(c cVar, final com.sankuai.xm.im.session.entry.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "ca3c49dd5b3f652f2f21fe8ae8c1716d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "ca3c49dd5b3f652f2f21fe8ae8c1716d");
        } else if (aVar != null) {
            DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.session.c.16
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30952708eff407eaf7747ce7a696ebbd", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30952708eff407eaf7747ce7a696ebbd");
                        return;
                    }
                    SessionId a2 = SessionId.a(aVar.b);
                    DBSession a3 = DBProxy.l().m.a(a2.f());
                    if (a3 == null) {
                        IMClient.a().a(a2, aVar.b.getMsgId(), (HistoryController.HistoryMessageCallback) null);
                        return;
                    }
                    DBMessage c = DBProxy.l().k.c(a2);
                    if (c == null) {
                        DBProxy.l().m.a(a2);
                        IMClient.a().a(a2, aVar.b.getMsgId(), (HistoryController.HistoryMessageCallback) null);
                        o.b.a.a(a2);
                        com.sankuai.xm.im.session.entry.a dbSessionToSession = MessageUtils.dbSessionToSession(a3);
                        dbSessionToSession.e = -1;
                        c.this.f(com.sankuai.xm.im.utils.c.a(dbSessionToSession));
                        return;
                    }
                    DBSession dBSession = new DBSession(c);
                    com.sankuai.xm.im.utils.a.b("updateSessionByForceCancelMessage, newSession = " + dBSession.getMsgId() + ",content:" + dBSession.getContent(), new Object[0]);
                    if (aVar.d < 0) {
                        dBSession.setUnRead(aVar.d);
                        dBSession.setUnRead(c.this.a(dBSession, a2, c.this.b(a2), a3));
                    } else {
                        dBSession.setUnRead(a3.getUnRead());
                    }
                    if (dBSession.equals(a3)) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(dBSession);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(MessageUtils.dbSessionToSession(dBSession));
                    c.a(c.this, arrayList, arrayList2);
                }
            }), (Callback) null);
        }
    }

    public static /* synthetic */ void a(c cVar, List list, int i, int i2) {
        Object[] objArr = {list, 1, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "216dec1451daab7fb2a8717597078d2a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "216dec1451daab7fb2a8717597078d2a");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cVar.a((SessionId) it.next(), 1, i2);
        }
    }

    public static /* synthetic */ void a(c cVar, final List list, final int i, final int i2, final boolean z) {
        Object[] objArr = {list, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "bbb43d860339f04610db6250ab67848d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "bbb43d860339f04610db6250ab67848d");
            return;
        }
        StringBuilder sb = new StringBuilder("SessionProcessor::onIMMessageList => msg list size: ");
        sb.append(list == null ? 0 : list.size());
        sb.append(CommonConstant.Symbol.COLON);
        sb.append(z);
        sb.append(", sessionType = ");
        sb.append(i);
        com.sankuai.xm.im.utils.a.b(sb.toString(), new Object[0]);
        if (list != null && !list.isEmpty()) {
            MessageUtils.checkAndSupplyChannel(list, (short) -1);
            com.sankuai.xm.threadpool.scheduler.a.b().a(11, j.a(new Runnable() { // from class: com.sankuai.xm.im.session.c.20
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f56d4adc1d85339c774e1ce2d002de26", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f56d4adc1d85339c774e1ce2d002de26");
                        return;
                    }
                    com.sankuai.xm.im.utils.c.a((List<? extends Message>) list, true);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        IMMessage iMMessage = (IMMessage) it.next();
                        SessionId a2 = SessionId.a(iMMessage);
                        if (hashSet.contains(a2)) {
                            it.remove();
                        } else {
                            if (iMMessage instanceof CancelMessage) {
                                it.remove();
                                arrayList.add(iMMessage);
                            }
                            hashSet.add(a2);
                        }
                    }
                    List<IMMessage> a3 = IMClient.a().i().a(list, 6);
                    if (!com.sankuai.xm.base.util.b.a(a3)) {
                        com.sankuai.xm.im.utils.a.b("%s onIMMessageList notify message:%d, category:%d", "SessionProcessor::", Integer.valueOf(a3.size()), Integer.valueOf(i));
                        IMClient.a().i().a(a3, true);
                    }
                    IMClient.a().i().b(arrayList, 1);
                    if (z) {
                        return;
                    }
                    c.this.a(i, i2);
                }
            }));
        } else if (z) {
        } else {
            cVar.a(i, i2);
        }
    }

    public static /* synthetic */ void a(c cVar, List list, long j) {
        Object[] objArr = {list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "fec991aa2e16abba4aae4c49535fa860", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "fec991aa2e16abba4aae4c49535fa860");
        } else if (com.sankuai.xm.base.util.b.a((Collection<?>) list)) {
        } else {
            List<SessionId> arrayList = new ArrayList<>(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DBSession dBSession = (DBSession) it.next();
                if (dBSession != null) {
                    arrayList.add(SessionId.a(dBSession));
                }
            }
            cVar.a(arrayList, j);
            cVar.a((Collection<SessionId>) arrayList, j);
        }
    }

    public static /* synthetic */ void a(c cVar, List list, final List list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "89baf448fe709957a94d99f6cd7240a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "89baf448fe709957a94d99f6cd7240a8");
        } else if (list == null || list.isEmpty()) {
            com.sankuai.xm.im.utils.a.a("SessionProcessor::saveAndNotifySessionChange message:0", new Object[0]);
        } else {
            DBProxy.l().m.a((com.sankuai.xm.base.db.c) null, list, new Callback<List<DBSession>>() { // from class: com.sankuai.xm.im.session.c.21
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(List<DBSession> list3) {
                    List<DBSession> list4 = list3;
                    Object[] objArr2 = {list4};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff7b8ae263de3a3114f8cbf0c5551559", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff7b8ae263de3a3114f8cbf0c5551559");
                    } else if (com.sankuai.xm.base.util.b.a(list4)) {
                    } else {
                        com.sankuai.xm.im.utils.a.b("SessionProcessor::saveAndNotifySessionChange=>dbSessionList.get(0):key:%s,status:%s,uuid:%s", list4.get(0).getKey(), Integer.valueOf(list4.get(0).getMsgStatus()), list4.get(0).getMsgUuid());
                        c.this.e(list2);
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60fcdfcfcfd497f0090a476c395a0ab6", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60fcdfcfcfd497f0090a476c395a0ab6");
                    } else {
                        com.sankuai.xm.im.utils.a.d("SessionProcessor::saveAndNotifySessionChange onFailure code:%d, message:%s", Integer.valueOf(i), str);
                    }
                }
            });
        }
    }

    public static /* synthetic */ void a(c cVar, List list, int[] iArr) {
        Object[] objArr = {list, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "16f62f06ab16b2869814c5baf70dd617", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "16f62f06ab16b2869814c5baf70dd617");
        } else if (com.sankuai.xm.base.util.b.a((Collection<?>) list)) {
            com.sankuai.xm.im.utils.a.b("SessionProcessor::updateMaxSessionCache, sessions=null", new Object[0]);
        } else {
            com.sankuai.xm.im.utils.c.a((List<? extends Message>) list, true);
            Set<Integer> allService = MessageUtils.getAllService(iArr);
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DBSession dBSession = (DBSession) it.next();
                if (hashMap.size() == allService.size()) {
                    break;
                }
                int serviceForCategory = MessageUtils.getServiceForCategory(dBSession.getCategory());
                if (serviceForCategory != -1 && dBSession.getMsgId() > 0) {
                    hashMap.put(Integer.valueOf(serviceForCategory), Long.valueOf(dBSession.getSts()));
                    IMClient.a().i().c().a(serviceForCategory, dBSession.getSts());
                }
            }
            com.sankuai.xm.im.utils.a.b("SessionProcessor::updateMaxSessionCache, ret=%s,sessions=%d, categorys=%s", hashMap, Integer.valueOf(list.size()), allService);
        }
    }

    public static /* synthetic */ void a(c cVar, short[] sArr, int[] iArr, long j, int i) {
        Object[] objArr = {sArr, iArr, new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "d0275386c479b92c5480b3fcecd7dd2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "d0275386c479b92c5480b3fcecd7dd2c");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", 3);
        hashMap.put("ids", Arrays.toString(sArr));
        hashMap.put("msg", Arrays.toString(iArr));
        hashMap.put("time", Long.valueOf(j));
        hashMap.put("result", Integer.valueOf(i));
        com.sankuai.xm.monitor.c.a("delete_chat", hashMap);
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf6c26cb3110537219c51dc4507867c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf6c26cb3110537219c51dc4507867c6");
            return;
        }
        this.g = new ConcurrentHashMap<>();
        this.h = new Object();
        this.b = new AtomicReference<>();
        this.e = false;
        this.g.put("mSessionInfoController", com.sankuai.xm.base.component.c.a(this));
        this.d = null;
        ((l) k().a()).a(com.sankuai.xm.base.feedback.c.class).a((l.a) this);
        this.f = null;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b076062669e150e5866d553cea8736e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b076062669e150e5866d553cea8736e");
        } else {
            this.b.set(null);
        }
    }

    public final SessionId c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56eddb09b31c299787b026385221b4a8", 6917529027641081856L) ? (SessionId) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56eddb09b31c299787b026385221b4a8") : this.b.get();
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3842eaf09ad6fd04de130e27dac693b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3842eaf09ad6fd04de130e27dac693b3");
            return;
        }
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = new com.sankuai.xm.im.session.a();
                }
            }
        }
        this.c.a(new Callback<List<DBSession>>() { // from class: com.sankuai.xm.im.session.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.callback.Callback
            public final void onFailure(int i, String str) {
            }

            @Override // com.sankuai.xm.base.callback.Callback
            public final /* synthetic */ void onSuccess(List<DBSession> list) {
                List<DBSession> list2 = list;
                Object[] objArr2 = {list2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ebc4574d2585a65d818504d4b5f37f4", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ebc4574d2585a65d818504d4b5f37f4");
                } else if (list2 != null && !list2.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (DBSession dBSession : list2) {
                        arrayList.add(MessageUtils.dbSessionToSession(dBSession));
                    }
                    c.this.f(arrayList);
                }
            }
        });
    }

    public final void a(final short s, final boolean z, final Callback<List<com.sankuai.xm.im.session.entry.a>> callback) {
        Object[] objArr = {Short.valueOf(s), Byte.valueOf(z ? (byte) 1 : (byte) 0), callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6da31fea100b0615942555090da5148", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6da31fea100b0615942555090da5148");
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        DBProxy.l().b(j.a(new Runnable() { // from class: com.sankuai.xm.im.session.c.25
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                int i;
                com.sankuai.xm.monitor.report.sample.b bVar;
                char c;
                h hVar;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b057c502f3c842ee9649eded6ae5c6e6", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b057c502f3c842ee9649eded6ae5c6e6");
                    return;
                }
                List<DBSession> a2 = DBProxy.l().m.a(new short[]{s}, (int[]) null, 0L);
                if (callback != null) {
                    List a3 = c.a(c.this, a2, z);
                    int size = a3 == null ? 0 : a3.size();
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    short s2 = s;
                    Object[] objArr3 = {new Long(currentTimeMillis2), Integer.valueOf(size), Short.valueOf(s2)};
                    ChangeQuickRedirect changeQuickRedirect3 = d.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f4b98a48473d89d5ed5c593361f45596", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f4b98a48473d89d5ed5c593361f45596");
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("time", Long.valueOf(currentTimeMillis2));
                        hashMap.put("count", Integer.valueOf(size));
                        hashMap.put(MessageStatisticsEntry.PARAM_CHANNEL, Short.valueOf(s2));
                        com.sankuai.xm.monitor.report.sample.d[] dVarArr = new com.sankuai.xm.monitor.report.sample.d[2];
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.monitor.report.sample.b.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "ee9ce1fad785b5b49771274da47670dd", 6917529027641081856L)) {
                            i = 1;
                            bVar = (com.sankuai.xm.monitor.report.sample.b) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "ee9ce1fad785b5b49771274da47670dd");
                        } else {
                            i = 1;
                            bVar = new com.sankuai.xm.monitor.report.sample.b();
                        }
                        dVarArr[0] = bVar;
                        Object[] objArr5 = new Object[i];
                        objArr5[0] = Long.valueOf((long) LocationStrategy.LOCATION_TIMEOUT);
                        ChangeQuickRedirect changeQuickRedirect5 = h.a;
                        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "b7014368ca3423a9e5f82abad5a310d6", 6917529027641081856L)) {
                            c = 1;
                            hVar = (h) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "b7014368ca3423a9e5f82abad5a310d6");
                        } else {
                            c = 1;
                            hVar = new h();
                            hVar.b = LocationStrategy.LOCATION_TIMEOUT;
                        }
                        dVarArr[c] = hVar;
                        com.sankuai.xm.monitor.report.sample.e.a("get_all_session", "get_all_session", (HashMap<String, Object>) hashMap, false, dVarArr);
                    }
                    callback.onSuccess(a3);
                }
            }
        }), callback);
    }

    public final void a(DBMessage dBMessage) {
        Object[] objArr = {dBMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d71cb079c21988a0504a241617ccda2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d71cb079c21988a0504a241617ccda2");
        } else if (dBMessage == null) {
            com.sankuai.xm.im.utils.a.b("SessionProcessor::updateSession:null", new Object[0]);
        } else {
            com.sankuai.xm.im.utils.a.b("SessionProcessor::updateSession:DBMessage:chatId:%s,status:%s,uuid:%s", Long.valueOf(dBMessage.getChatId()), Integer.valueOf(dBMessage.getMsgStatus()), dBMessage.getMsgUuid());
            DBSession dBSession = new DBSession(dBMessage);
            if (dBMessage.getMsgStatus() == 7) {
                dBSession.setUnRead(1);
            }
            a(dBSession);
        }
    }

    public final void a(List<IMMessage> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "172402f6bc8d2ce466ddca1d57116889", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "172402f6bc8d2ce466ddca1d57116889");
        } else if (list == null || list.isEmpty()) {
        } else {
            final List<DBSession> h = h(list);
            DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.session.c.26
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a91f88c90feb59617b6d7529581c7c1", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a91f88c90feb59617b6d7529581c7c1");
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (DBSession dBSession : h) {
                        DBSession b = c.this.b(dBSession);
                        if (b != null) {
                            com.sankuai.xm.im.session.entry.a dbSessionToSession = MessageUtils.dbSessionToSession(b);
                            arrayList.add(b);
                            arrayList2.add(dbSessionToSession);
                        }
                    }
                    c.a(c.this, arrayList, arrayList2);
                    com.sankuai.xm.im.cache.c.a("updateSessions", System.currentTimeMillis() - currentTimeMillis, arrayList.size(), -1);
                }
            }), (Callback) null);
        }
    }

    @Trace(name = "update_session", type = i.normal)
    public final void b(final List<d.a> list) {
        com.sankuai.xm.im.session.entry.a aVar;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9593975af804ae281ee442ccdc909d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9593975af804ae281ee442ccdc909d2");
            return;
        }
        try {
            j.a(i.normal, "update_session", (String[]) null, new Object[]{list});
            if (com.sankuai.xm.base.util.b.a(list)) {
                j.a((Object) null);
                return;
            }
            final HashMap hashMap = new HashMap();
            final HashMap hashMap2 = new HashMap();
            for (d.a aVar2 : list) {
                String f = SessionId.a(aVar2.a).f();
                if (aVar2.a instanceof ForceCancelMessage) {
                    aVar = (com.sankuai.xm.im.session.entry.a) hashMap.get(f);
                    if (aVar == null) {
                        aVar = new com.sankuai.xm.im.session.entry.a();
                        aVar.c = f;
                        aVar.b = aVar2.a;
                        hashMap.put(f, aVar);
                    } else if (aVar.b.getSts() >= aVar2.a.getSts()) {
                        aVar.b = aVar2.a;
                    }
                } else {
                    aVar = (com.sankuai.xm.im.session.entry.a) hashMap2.get(f);
                    if (aVar == null) {
                        aVar = new com.sankuai.xm.im.session.entry.a();
                        aVar.c = f;
                        aVar.b = aVar2.a;
                        hashMap2.put(f, aVar);
                    } else if (aVar.b.getSts() <= aVar2.a.getSts()) {
                        aVar.b = aVar2.a;
                    }
                }
                if (aVar2.c == 7) {
                    aVar.d--;
                }
            }
            DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.session.c.27
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61cb1ac740906e035a62e85115e91927", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61cb1ac740906e035a62e85115e91927");
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    DBProxy.l().a(DBProxy.l().bR_());
                    try {
                        for (Map.Entry entry : hashMap.entrySet()) {
                            c.a(c.this, (com.sankuai.xm.im.session.entry.a) entry.getValue());
                        }
                        for (Map.Entry entry2 : hashMap2.entrySet()) {
                            c.this.a((com.sankuai.xm.im.session.entry.a) entry2.getValue());
                        }
                        DBProxy.l().b(DBProxy.l().bR_());
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        com.sankuai.xm.im.utils.a.a("SessionProcessor::updateSessionByCancelMsgs, time = " + currentTimeMillis2 + ",normal session size = " + hashMap2.size() + ", force session size = " + hashMap.size() + ", message size = " + list.size(), new Object[0]);
                    } finally {
                        DBProxy.l().c(DBProxy.l().bR_());
                    }
                }
            }), (Callback) null);
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    public final int a(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98a8ba13c7766b201094b75ae889a167", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98a8ba13c7766b201094b75ae889a167")).intValue() : DBProxy.l().m.a(s);
    }

    public final void a(final String str, final Callback<com.sankuai.xm.im.session.entry.a> callback) {
        Object[] objArr = {str, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb1e47ef777c4096ccda99988c5d8d07", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb1e47ef777c4096ccda99988c5d8d07");
        } else {
            DBProxy.l().b(j.a(new Runnable() { // from class: com.sankuai.xm.im.session.c.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5aabc691499a277b4bca68c30aa69a08", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5aabc691499a277b4bca68c30aa69a08");
                        return;
                    }
                    DBSession a2 = DBProxy.l().m.a(str);
                    callback.onSuccess(a2 != null ? MessageUtils.dbSessionToSession(a2) : null);
                }
            }), callback);
        }
    }

    public final com.sankuai.xm.im.session.entry.a a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33817ece58092fa57f285123606f1eca", 6917529027641081856L)) {
            return (com.sankuai.xm.im.session.entry.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33817ece58092fa57f285123606f1eca");
        }
        DBSession a2 = DBProxy.l().m.a(str, z);
        if (a2 == null) {
            return null;
        }
        return MessageUtils.dbSessionToSession(a2);
    }

    public final void c(List<IMMessage> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bed14da87bc3a2f4490cde39a9eb901", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bed14da87bc3a2f4490cde39a9eb901");
        } else if (!com.sankuai.xm.base.util.b.a(list)) {
            List<DBSession> h = h(list);
            if (com.sankuai.xm.base.util.b.a(h)) {
                return;
            }
            for (int i = 0; i < h.size(); i++) {
                d(SessionId.a(h.get(i)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(SessionId sessionId) {
        DBSession a2;
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f185a73979744371e82508419dec8e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f185a73979744371e82508419dec8e1");
        } else if (sessionId == null || (a2 = DBProxy.l().m.a(sessionId.f())) == null || IMClient.a().i() == null || a2.getMsgId() <= 0) {
        } else {
            IMClient.a().i().c().a(a2.getCategory(), a2.getSts());
        }
    }

    public final void a(List<SessionId> list, long j) {
        Object[] objArr = {list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eab621e090a04cdca14265c8971d918", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eab621e090a04cdca14265c8971d918");
        } else if (!com.sankuai.xm.base.util.b.a(list)) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i < 0) {
                return;
            }
            com.sankuai.xm.im.utils.a.b("SessionProcessor::updateEarliestMsg, sessionId:%s, sts:%s", list, Long.valueOf(j));
            long min = i > 0 ? Math.min(IMClient.a().h().a(System.currentTimeMillis()), j) : 0L;
            ArrayList arrayList = new ArrayList(list.size());
            for (SessionId sessionId : list) {
                SessionStamp a2 = DBProxy.l().m().a(sessionId.f());
                if (a2 != null && min > a2.getEarliestSts()) {
                    a2.setEarliestSts(min);
                    arrayList.add(a2);
                }
            }
            DBProxy.l().m().a(arrayList, SessionStamp.EARLIEST_STS);
        }
    }

    public final long a(SessionId sessionId) {
        SessionStamp a2;
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b836067ed55bfcd17bd248b42ec5cff", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b836067ed55bfcd17bd248b42ec5cff")).longValue();
        }
        if (sessionId == null || !sessionId.i() || (a2 = DBProxy.l().m().a(sessionId.f())) == null) {
            return -1L;
        }
        return a2.getEarliestSts();
    }

    public final void a(final SessionId sessionId, final boolean z, final Callback<Void> callback) {
        Object[] objArr = {sessionId, Byte.valueOf(z ? (byte) 1 : (byte) 0), callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b668846eac3f787498cf5af7211f45a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b668846eac3f787498cf5af7211f45a");
            return;
        }
        com.sankuai.xm.im.utils.a.b("SessionProcessor::deleteSessionSync, sessionId:%s, delMsg:%s", sessionId, Boolean.valueOf(z));
        if (sessionId == null) {
            com.sankuai.xm.base.callback.a.a(callback, 10011, "sessionId is null");
            return;
        }
        if (!sessionId.i()) {
            com.sankuai.xm.im.utils.a.c("SessionProcessor::deleteSessionSync, sessionId may be error:" + sessionId, new Object[0]);
        }
        DBProxy.l().m.a(sessionId.f(), new Callback<DBSession>() { // from class: com.sankuai.xm.im.session.c.5
            public static ChangeQuickRedirect a;

            /* JADX WARN: Removed duplicated region for block: B:28:0x00e1 A[Catch: JSONException -> 0x010e, TryCatch #0 {JSONException -> 0x010e, blocks: (B:15:0x005c, B:17:0x0062, B:19:0x006b, B:21:0x007f, B:24:0x008a, B:26:0x00c7, B:28:0x00e1, B:29:0x00ec, B:31:0x00f3, B:25:0x00a4, B:18:0x0067), top: B:36:0x005c }] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00f3 A[Catch: JSONException -> 0x010e, TRY_LEAVE, TryCatch #0 {JSONException -> 0x010e, blocks: (B:15:0x005c, B:17:0x0062, B:19:0x006b, B:21:0x007f, B:24:0x008a, B:26:0x00c7, B:28:0x00e1, B:29:0x00ec, B:31:0x00f3, B:25:0x00a4, B:18:0x0067), top: B:36:0x005c }] */
            @Override // com.sankuai.xm.base.callback.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* synthetic */ void onSuccess(com.sankuai.xm.im.cache.bean.DBSession r15) {
                /*
                    Method dump skipped, instructions count: 318
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.session.c.AnonymousClass5.onSuccess(java.lang.Object):void");
            }

            @Override // com.sankuai.xm.base.callback.Callback
            public final void onFailure(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "965470dab70d79135695dacfa25c3732", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "965470dab70d79135695dacfa25c3732");
                    return;
                }
                c.this.a(sessionId, 2, i);
                com.sankuai.xm.base.callback.a.a(callback, i, str);
            }
        });
    }

    public final void a(final short[] sArr, final int[] iArr, boolean z, final long j, boolean z2, final boolean z3, final Callback<Void> callback) {
        Object[] objArr = {sArr, iArr, (byte) 1, new Long(j), (byte) 1, Byte.valueOf(z3 ? (byte) 1 : (byte) 0), callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec81e6bb8dbc6c9641ae3816e611f0b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec81e6bb8dbc6c9641ae3816e611f0b9");
            return;
        }
        final Callback<Void> callback2 = new Callback<Void>() { // from class: com.sankuai.xm.im.session.c.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.callback.Callback
            public final /* synthetic */ void onSuccess(Void r11) {
                Object[] objArr2 = {r11};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24ae18419f0a4360e14231a16add97ec", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24ae18419f0a4360e14231a16add97ec");
                    return;
                }
                c.a(c.this, sArr, iArr, j, 0);
                com.sankuai.xm.base.callback.a.a(callback, null);
            }

            @Override // com.sankuai.xm.base.callback.Callback
            public final void onFailure(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2e056752cbc4337ac2a190f96ceff05", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2e056752cbc4337ac2a190f96ceff05");
                    return;
                }
                c.a(c.this, sArr, iArr, j, i);
                com.sankuai.xm.base.callback.a.a(callback, i, str);
            }
        };
        DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.session.c.7
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object obj;
                int intValue;
                List<DBSession> list;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04f5a362e9cc9621fa6c4a6eac961135", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04f5a362e9cc9621fa6c4a6eac961135");
                    return;
                }
                final com.sankuai.xm.im.cache.l lVar = DBProxy.l().m;
                List<DBSession> a2 = lVar.a(sArr, iArr, j);
                final short[] sArr2 = sArr;
                final int[] iArr2 = iArr;
                final long j2 = j;
                Object[] objArr3 = {sArr2, iArr2, new Long(j2)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.cache.l.a;
                if (PatchProxy.isSupport(objArr3, lVar, changeQuickRedirect3, false, "0b50d289827c3eccb5bf29a88d73e30e", 6917529027641081856L)) {
                    intValue = ((Integer) PatchProxy.accessDispatch(objArr3, lVar, changeQuickRedirect3, false, "0b50d289827c3eccb5bf29a88d73e30e")).intValue();
                    obj = null;
                } else {
                    final HashSet hashSet = new HashSet();
                    final HashSet hashSet2 = new HashSet();
                    if (sArr2 != null || iArr2 != null) {
                        hashSet2.addAll(com.sankuai.xm.im.cache.e.a(iArr2));
                        hashSet.addAll(com.sankuai.xm.im.cache.e.a(sArr2));
                    }
                    final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
                    DBProxy dBProxy = lVar.c;
                    obj = null;
                    dBProxy.a(j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.l.9
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Integer] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7f1b79909fe338cf138e2732105420c1", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7f1b79909fe338cf138e2732105420c1");
                                return;
                            }
                            com.sankuai.xm.base.db.c bR_ = l.this.c.bR_();
                            bVar.c = Integer.valueOf(l.a(l.this, bR_, hashSet, hashSet2, j2));
                            l.a(l.this, sArr2, iArr2, j2);
                        }
                    }), true, (Callback) null);
                    intValue = ((Integer) bVar.c).intValue();
                }
                if (r6) {
                    if (z3) {
                        list = a2;
                        c.a(c.this, (List) list, j);
                    } else {
                        list = a2;
                    }
                    DBProxy.l().k.a(sArr, iArr, j);
                } else {
                    list = a2;
                }
                c.a(c.this, list, iArr);
                if ((r8 || callback == null) && intValue > 0 && !com.sankuai.xm.base.util.b.a(list)) {
                    c.this.f(c.a(c.this, (List) list, true));
                }
                callback2.onSuccess(obj);
            }
        }), callback2);
    }

    public final void a(final Map<SessionId, Long[]> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffa127ebb79a74f6d163bc052a727248", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffa127ebb79a74f6d163bc052a727248");
        } else if (map == null || map.isEmpty()) {
        } else {
            DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.session.c.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    SessionId sessionId;
                    char c = 0;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45aa84c9c5de2833f1757cb2885d7fad", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45aa84c9c5de2833f1757cb2885d7fad");
                        return;
                    }
                    List<DBSession> b = DBProxy.l().m.b(map.keySet());
                    if (com.sankuai.xm.base.util.b.a(b)) {
                        return;
                    }
                    long a2 = com.sankuai.xm.login.c.a().a(System.currentTimeMillis());
                    HashMap hashMap = new HashMap();
                    final ArrayList arrayList = new ArrayList();
                    for (DBSession dBSession : b) {
                        SessionId a3 = SessionId.a(dBSession);
                        Long[] lArr = (Long[]) map.get(a3);
                        if (lArr != null && lArr.length >= 2) {
                            long longValue = lArr[c].longValue();
                            long longValue2 = lArr[1].longValue() <= 0 ? a2 : lArr[1].longValue();
                            long msgId = dBSession.getMsgId();
                            long msgIdToStamp = MessageUtils.msgIdToStamp(longValue);
                            int i = (msgId > 0L ? 1 : (msgId == 0L ? 0 : -1));
                            if ((i <= 0 && msgIdToStamp >= dBSession.getSts()) || (i > 0 && longValue >= msgId)) {
                                sessionId = a3;
                                arrayList.add(sessionId);
                            } else {
                                sessionId = a3;
                                DBProxy.l().k.a(sessionId, msgIdToStamp, false);
                            }
                            c.this.a(Collections.singletonList(sessionId), msgIdToStamp);
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("extTs", longValue2);
                                hashMap.put(sessionId, jSONObject);
                            } catch (JSONException unused) {
                            }
                            c = 0;
                        }
                    }
                    c.this.b(hashMap);
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    final c cVar = c.this;
                    final Callback<Void> callback = new Callback<Void>() { // from class: com.sankuai.xm.im.session.c.8.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.base.callback.Callback
                        public final /* synthetic */ void onSuccess(Void r12) {
                            Object[] objArr3 = {r12};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3822e127d022f18bc496936f0df76e6e", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3822e127d022f18bc496936f0df76e6e");
                            } else {
                                com.sankuai.xm.im.utils.a.b("SessionProcessor::cleanSessionsWithMidByRemote, sessions=%s", arrayList);
                            }
                        }

                        @Override // com.sankuai.xm.base.callback.Callback
                        public final void onFailure(int i2, String str) {
                            Object[] objArr3 = {Integer.valueOf(i2), str};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cbff153fbdd0891b048a0000ab146ecb", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cbff153fbdd0891b048a0000ab146ecb");
                            } else {
                                com.sankuai.xm.im.utils.a.c("SessionProcessor::cleanSessionsWithMidByRemote, code:%s, msg:%s, sessions:%s", Integer.valueOf(i2), str, arrayList);
                            }
                        }
                    };
                    Object[] objArr3 = {arrayList, (byte) 1, (byte) 1, callback};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "cf9b737e94c8b14862625bf060388f12", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "cf9b737e94c8b14862625bf060388f12");
                    } else if (com.sankuai.xm.base.util.b.a((Collection<?>) arrayList)) {
                        com.sankuai.xm.base.callback.a.a(callback, null);
                    } else {
                        DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.session.c.4
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2d15a5a51e32a97563d2941d5a01b9b0", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2d15a5a51e32a97563d2941d5a01b9b0");
                                    return;
                                }
                                DBProxy l = DBProxy.l();
                                com.sankuai.xm.base.tinyorm.b<List<DBSession>> a4 = l.m.a(arrayList);
                                if (a4.a()) {
                                    com.sankuai.xm.base.db.c bR_ = l.bR_();
                                    l.a(bR_);
                                    for (SessionId sessionId2 : arrayList) {
                                        c.this.d(sessionId2);
                                        if (r3) {
                                            l.k.a(sessionId2, Long.MAX_VALUE, false);
                                        }
                                    }
                                    l.b(bR_);
                                    l.c(bR_);
                                    com.sankuai.xm.im.utils.a.b("SessionProcessor::deleteLocalSession success session:%s", arrayList);
                                    c.a(c.this, arrayList, 1, 0);
                                    com.sankuai.xm.base.callback.a.a(callback, null);
                                    if (r5) {
                                        c.this.f(MessageUtils.dbSessionToSession(a4.c));
                                        return;
                                    }
                                    return;
                                }
                                com.sankuai.xm.im.utils.a.d("SessionProcessor::deleteLocalSession fail session:%s", arrayList);
                                c.a(c.this, arrayList, 1, 10019);
                                com.sankuai.xm.base.callback.a.a(callback, 10019, "数据库操作失败");
                            }
                        }), callback);
                    }
                }
            }), (Callback) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SessionId sessionId, int i, int i2) {
        Object[] objArr = {sessionId, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf40a89fe97ed9e1d4ce666720560ca8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf40a89fe97ed9e1d4ce666720560ca8");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(i));
        if (sessionId != null) {
            hashMap.put(MessageStatisticsEntry.PARAM_CHAT, sessionId.f());
            hashMap.put(MessageStatisticsEntry.PARAM_CHANNEL, Short.valueOf(sessionId.g));
            hashMap.put(MessageStatisticsEntry.PARAM_MSG_CATEGORY, Integer.valueOf(sessionId.e));
        }
        hashMap.put("result", Integer.valueOf(i2));
        com.sankuai.xm.monitor.c.a("delete_chat", hashMap);
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f083b2c687a53b40303a4f6bc53ae2d4", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f083b2c687a53b40303a4f6bc53ae2d4")).booleanValue();
        }
        return com.sankuai.xm.im.utils.b.a().getString("SESSION_LIST_VERSION_IM", null) == null && com.sankuai.xm.im.utils.b.a().getString("SESSION_LIST_VERSION_PUB", null) == null;
    }

    public final void a(int i, short s) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eee8d435ea13f5d7b8f300a5c8167819", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eee8d435ea13f5d7b8f300a5c8167819");
            return;
        }
        short b = b(1, s);
        boolean z2 = (b == 3 || b == -1) ? false : true;
        if (b != -1) {
            z2 &= a(1, i, b);
        }
        short b2 = b(2, s);
        boolean z3 = (b2 == 3 || b2 == -1) ? false : true;
        if (b2 != -1) {
            z3 &= a(2, i, b2);
        }
        b((z2 || z3) ? true : true);
    }

    private short b(int i, short s) {
        Object[] objArr = {Integer.valueOf(i), Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2f2b2166e4bad911351bb17ed88b1a7", 6917529027641081856L)) {
            return ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2f2b2166e4bad911351bb17ed88b1a7")).shortValue();
        }
        if (com.sankuai.xm.im.utils.b.a().getString(a(i), null) == null) {
            return (short) 1;
        }
        if (s == 3) {
            if (g() && b(i)) {
                return s;
            }
            return (short) -1;
        }
        return s;
    }

    private boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3e822c79d545b6af035da520cb80319", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3e822c79d545b6af035da520cb80319")).booleanValue();
        }
        String a2 = com.sankuai.xm.base.hornconfig.a.a().a("open_session_list_repair");
        if (ac.a(a2)) {
            return true;
        }
        return ac.a(a2, "1");
    }

    private boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "283f8dfa73b4a4f6e545f513792a2f99", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "283f8dfa73b4a4f6e545f513792a2f99")).booleanValue() : com.sankuai.xm.login.c.a().a(System.currentTimeMillis()) - c(i) > 86400000;
    }

    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36083538f133b7bc3815f23bf681bc25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36083538f133b7bc3815f23bf681bc25");
        } else if (z || z2) {
            com.sankuai.xm.im.utils.a.b("SessionProcessor::msgSeqIDProcessor::deviceChange = " + z + ",offlineOverLimit = " + z2, new Object[0]);
            if (z) {
                com.sankuai.xm.im.message.e.a();
            }
            if (z2) {
                com.sankuai.xm.im.message.e.b();
            }
            if (this.e) {
                return;
            }
            this.e = true;
            j();
        }
    }

    public void a(@NonNull com.sankuai.xm.im.session.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f983a936e36a7b61d4732e68ed8696aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f983a936e36a7b61d4732e68ed8696aa");
        } else {
            ((com.sankuai.xm.base.service.c) m.a(com.sankuai.xm.base.service.c.class)).a(aVar.getClass().getName()).a(aVar);
        }
    }

    @Trace(name = "update_msg_read", type = i.normal)
    public final void a(final List<SessionId> list, final Callback<Integer> callback) {
        Object[] objArr = {list, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2ddd0627739cc0f7ecb18a8d7fbd683", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2ddd0627739cc0f7ecb18a8d7fbd683");
            return;
        }
        try {
            j.a(i.normal, "update_msg_read", (String[]) null, new Object[]{list, callback});
            if (com.sankuai.xm.base.util.b.a(list)) {
                com.sankuai.xm.base.callback.a.a(callback, 0);
                j.a((Object) null);
                return;
            }
            DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.session.c.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    int i2 = 0;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac810c28b4f9b8232a24ffb32879512a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac810c28b4f9b8232a24ffb32879512a");
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    List<DBSession> b = DBProxy.l().m.b(list);
                    if (com.sankuai.xm.base.util.b.a(b)) {
                        com.sankuai.xm.base.callback.a.a(callback, 10019, "db no session data");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<DBSession> it = b.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        DBSession next = it.next();
                        if (next.getUnRead() > 0) {
                            i3 += next.getUnRead();
                            SessionId a2 = SessionId.a(next);
                            next.setUnRead(i2);
                            f fVar = DBProxy.l().k;
                            Object[] objArr3 = new Object[1];
                            objArr3[i2] = a2;
                            ChangeQuickRedirect changeQuickRedirect3 = f.a;
                            Iterator<DBSession> it2 = it;
                            if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "ffff93ec2f2393d406d0039ee64656f3", 6917529027641081856L)) {
                                i = 0;
                                PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "ffff93ec2f2393d406d0039ee64656f3");
                            } else {
                                i = 0;
                                fVar.b(a2, Long.MAX_VALUE);
                            }
                            o.b.a.a(a2);
                            DBProxy.l().m.b(a2.f(), i, (Callback<Void>) null);
                            if (next.getMsgStatus() == 7) {
                                next.setMsgStatus(9);
                                DBProxy.l().m.a(a2.f(), 9, (Callback<Void>) null);
                            }
                            next.setFlag(4);
                            arrayList.add(MessageUtils.dbSessionToSession(next));
                            it = it2;
                            i2 = 0;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        c.this.e(arrayList);
                    }
                    com.sankuai.xm.im.cache.c.a("processMessageReadStatus", System.currentTimeMillis() - currentTimeMillis, arrayList.size(), -1);
                    com.sankuai.xm.base.callback.a.a(callback, Integer.valueOf(i3));
                }
            }), callback);
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Collection<SessionId> collection, long j) {
        Object[] objArr = {collection, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67552646134791d7cdc66969cada76f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67552646134791d7cdc66969cada76f3");
        } else if (!com.sankuai.xm.base.util.b.a(collection)) {
            if (j <= 0) {
                j = com.sankuai.xm.login.c.a().a(System.currentTimeMillis());
            }
            HashMap hashMap = new HashMap();
            try {
                for (SessionId sessionId : collection) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("extTs", j);
                    hashMap.put(sessionId, jSONObject);
                }
            } catch (JSONException unused) {
            }
            b(hashMap);
        }
    }

    public final void b(final Map<SessionId, JSONObject> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ab06e4e96f33404cf1bc8853190cccc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ab06e4e96f33404cf1bc8853190cccc");
        } else if (map == null || map.isEmpty()) {
        } else {
            com.sankuai.xm.im.utils.a.b("%s updateSessionExtension, ext tags:%s", "SessionProcessor::", map.keySet());
            DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.session.c.11
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0142e07a24d9f779bb77f3e60752bfa3", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0142e07a24d9f779bb77f3e60752bfa3");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : map.entrySet()) {
                        SessionStamp a2 = DBProxy.l().m().a(((SessionId) entry.getKey()).f());
                        JSONObject jSONObject = (JSONObject) entry.getValue();
                        long optLong = jSONObject == null ? 0L : jSONObject.optLong("extTs");
                        if (a2 != null && a2.getExtensionUts() < optLong) {
                            com.sankuai.xm.im.utils.a.a("%s updateSessionExtension, old tags:%s, new:%s", "SessionProcessor::", a2.getExtension(), jSONObject);
                            if (jSONObject == null) {
                                a2.setExtension("");
                            } else {
                                a2.setExtension(jSONObject.toString());
                            }
                            arrayList.add(a2);
                            hashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    DBProxy.l().m().a((com.sankuai.xm.base.db.c) null, arrayList);
                    if (com.sankuai.xm.base.util.b.a((Collection<?>) arrayList)) {
                        return;
                    }
                    com.sankuai.xm.im.session.listener.b bVar = new com.sankuai.xm.im.session.listener.b(hashMap);
                    ((com.sankuai.xm.base.service.c) m.a(com.sankuai.xm.base.service.c.class)).a(bVar.getClass().getName()).a(bVar);
                }
            }), (Callback) null);
        }
    }

    public final void d(final List<? extends Message> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d01316b60f457ae4752020796610b30c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d01316b60f457ae4752020796610b30c");
        } else if (list == null || list.isEmpty() || DBProxy.l().m() == null) {
        } else {
            DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.session.c.12
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06c13c2113485b7a8d2fe851eb9974e8", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06c13c2113485b7a8d2fe851eb9974e8");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Message message : list) {
                        String f = SessionId.a(message).f();
                        SessionStamp a2 = DBProxy.l().m().a(f);
                        if (a2 == null) {
                            a2 = new SessionStamp();
                            a2.setChatKey(f);
                        }
                        boolean z2 = true;
                        if (message.getSts() > a2.getMaxSts()) {
                            a2.setMaxSts(message.getSts());
                            z = true;
                        } else {
                            z = false;
                        }
                        if (message.getMsgId() > a2.getMaxMsgId()) {
                            a2.setMaxMsgId(message.getMsgId());
                            z = true;
                        }
                        if (message.getFromUid() == IMClient.a().k()) {
                            if (message.getCts() > a2.getMaxMyCts()) {
                                a2.setMaxMyCts(message.getCts());
                            }
                            z2 = z;
                        } else {
                            if (message.getCts() > a2.getMaxOthCts()) {
                                a2.setMaxOthCts(message.getCts());
                            }
                            z2 = z;
                        }
                        if (z2) {
                            arrayList.add(a2);
                        }
                    }
                    DBProxy.l().m().a((com.sankuai.xm.base.db.c) null, arrayList);
                }
            }), (Callback) null);
        }
    }

    @Trace(name = "notify_session", type = i.end)
    public final void e(List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95d18d91127dce50095f05202844c9c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95d18d91127dce50095f05202844c9c7");
            return;
        }
        try {
            j.a(i.end, "notify_session", (String[]) null, new Object[]{list});
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<Short, List<com.sankuai.xm.im.session.entry.a>> entry : g(list).entrySet()) {
                b(entry.getKey().shortValue(), entry.getValue());
                a(entry.getKey().shortValue(), entry.getValue());
                if (IMClient.a().a(entry.getKey().shortValue())) {
                    arrayList.addAll(entry.getValue());
                }
            }
            b((short) -1, (List<com.sankuai.xm.im.session.entry.a>) arrayList);
            a((short) -1, (List<com.sankuai.xm.im.session.entry.a>) arrayList);
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    public final boolean b(SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70e0b8be42c448327a18d433ff5a5dd9", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70e0b8be42c448327a18d433ff5a5dd9")).booleanValue();
        }
        SessionId sessionId2 = this.b.get();
        if (sessionId2 == null) {
            return false;
        }
        return sessionId.equals(sessionId2);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88d41f0ff9e2acf9d305e29c3b64916f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88d41f0ff9e2acf9d305e29c3b64916f");
            return;
        }
        if (z) {
            h();
        }
        i();
    }

    public final void f(List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5d29c5e750ebaf665b84d86955b043d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5d29c5e750ebaf665b84d86955b043d");
        } else if (!com.sankuai.xm.base.util.b.a(list)) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<Short, List<com.sankuai.xm.im.session.entry.a>> entry : g(list).entrySet()) {
                c(entry.getKey().shortValue(), entry.getValue());
                a(entry.getKey().shortValue(), entry.getValue());
                if (IMClient.a().a(entry.getKey().shortValue())) {
                    arrayList.addAll(entry.getValue());
                }
            }
            c((short) -1, arrayList);
            a((short) -1, (List<com.sankuai.xm.im.session.entry.a>) arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final DBSession dBSession) {
        Object[] objArr = {dBSession};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b60bcc9cb02a712813edd97be2d8d4a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b60bcc9cb02a712813edd97be2d8d4a6");
        } else if (dBSession == null) {
            com.sankuai.xm.im.utils.a.b("SessionProcessor::updateSession=>newSession:null", new Object[0]);
        } else {
            DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.session.c.14
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d8f694037a265d36adedd41b45d9c729", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d8f694037a265d36adedd41b45d9c729");
                        return;
                    }
                    DBSession b = c.this.b(dBSession);
                    if (b != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(b);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(MessageUtils.dbSessionToSession(b));
                        c.a(c.this, arrayList, arrayList2);
                    }
                }
            }), (Callback) null);
        }
    }

    private HashMap<Short, List<com.sankuai.xm.im.session.entry.a>> g(List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f0a9c573dd15d93681bf54904af64fb", 6917529027641081856L)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f0a9c573dd15d93681bf54904af64fb");
        }
        HashMap<Short, List<com.sankuai.xm.im.session.entry.a>> hashMap = new HashMap<>();
        for (com.sankuai.xm.im.session.entry.a aVar : list) {
            if (hashMap.containsKey(Short.valueOf(aVar.b.getChannel()))) {
                hashMap.get(Short.valueOf(aVar.b.getChannel())).add(aVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar);
                hashMap.put(Short.valueOf(aVar.b.getChannel()), arrayList);
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public DBSession b(DBSession dBSession) {
        DBSession dBSession2;
        int i;
        DBSession dBSession3;
        DBMessage a2;
        Object[] objArr = {dBSession};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15cb65fce4fbf83a17c0695ac5730a15", 6917529027641081856L)) {
            return (DBSession) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15cb65fce4fbf83a17c0695ac5730a15");
        }
        if (dBSession == null) {
            com.sankuai.xm.im.utils.a.b("SessionProcessor::checkSessionChanged=>newSession null", new Object[0]);
            return null;
        }
        SessionId a3 = SessionId.a(dBSession);
        boolean b = b(a3);
        DBSession a4 = DBProxy.l().m.a(a3.f());
        int a5 = a(dBSession, a3, b, a4);
        if (a4 != null && !MessageUtils.shouldMessageStatusChange(a4, dBSession) && a4.getUnRead() == a5) {
            com.sankuai.xm.im.utils.a.c("SessionProcessor::checkSessionChanged=>session status is final", new Object[0]);
            return null;
        }
        long j = 0;
        long cts = dBSession.getSts() == 0 ? dBSession.getCts() : dBSession.getSts();
        if (a4 != null) {
            j = a4.getSts() == 0 ? a4.getCts() : a4.getSts();
        }
        if (a4 == null || cts > j || (i == 0 && dBSession.getMsgId() >= a4.getMsgId())) {
            dBSession2 = dBSession;
        } else if (ac.a(dBSession.getMsgUuid(), a4.getMsgUuid())) {
            SessionStamp a6 = DBProxy.l().m().a(a3.f());
            if (a6 == null || a6.getMaxMsgId() <= dBSession.getMsgId() || (a2 = DBProxy.l().k.a(a3.e, a6.getMaxMsgId(), true)) == null) {
                dBSession3 = null;
            } else {
                com.sankuai.xm.im.utils.a.b("SessionProcessor::checkSessionChanged=>latest:key:%s,status:%s,uuid:%s", Long.valueOf(a2.getChatId()), Integer.valueOf(a2.getMsgStatus()), a2.getMsgUuid());
                dBSession3 = new DBSession(a2);
            }
            if (dBSession3 == null) {
                dBSession3 = dBSession;
            }
            dBSession2 = dBSession3;
        } else if (a4.getMsgSeqid() < dBSession.getMsgSeqid()) {
            dBSession2 = a4.m27clone();
            dBSession2.setMsgSeqid(dBSession.getMsgSeqid());
        } else {
            dBSession2 = a4.m27clone();
        }
        dBSession2.setUnRead(a5);
        if (a4 != null) {
            dBSession2.setMsgSeqid(MessageUtils.getSessionMsgSeqid(dBSession, a4));
        }
        if (dBSession2.allEquals(a4)) {
            com.sankuai.xm.im.utils.a.b("SessionProcessor::checkSessionChanged=>updatedSession.equals(oldSession), key:%s", dBSession2.getKey());
            return null;
        }
        com.sankuai.xm.im.utils.a.b("SessionProcessor::checkSessionChanged=>updatedSession:key:%s,status:%s,uuid:%s", dBSession2.getKey(), Integer.valueOf(dBSession2.getMsgStatus()), dBSession2.getMsgUuid());
        if (!b(a3)) {
            DBProxy.l().k.d(a3);
        }
        return dBSession2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(DBSession dBSession, SessionId sessionId, boolean z, DBSession dBSession2) {
        Object[] objArr = {dBSession, sessionId, Byte.valueOf(z ? (byte) 1 : (byte) 0), dBSession2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef6feabd14000b270662a1b3c05fbbc0", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef6feabd14000b270662a1b3c05fbbc0")).intValue();
        }
        if (!z && (dBSession.getUnRead() != 0 || dBSession2 == null)) {
            return o.b.a.a(sessionId, dBSession2 == null ? 0 : dBSession2.getUnRead(), dBSession2 == null);
        } else if (z) {
            o.b.a.a(sessionId);
            return 0;
        } else {
            return dBSession2.getUnRead();
        }
    }

    public void a(final com.sankuai.xm.im.session.entry.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26aecaa7481e926c339f6f3eb44e2ebe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26aecaa7481e926c339f6f3eb44e2ebe");
        } else if (aVar == null) {
        } else {
            DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.session.c.15
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    DBMessage c;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45e145483efe840855f52c6e53b3fb10", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45e145483efe840855f52c6e53b3fb10");
                    } else if (DBProxy.l().m.a(aVar.c) != null || (c = DBProxy.l().k.c(aVar.c())) == null) {
                        c.this.a(MessageUtils.sessionToDBSession(aVar));
                    } else {
                        c.this.a(new DBSession(c));
                    }
                }
            }), (Callback) null);
        }
    }

    private void a(short s, List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {Short.valueOf(s), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49a0bd4f281d39db9bac621d339d8e0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49a0bd4f281d39db9bac621d339d8e0f");
            return;
        }
        final List<com.sankuai.xm.im.session.entry.b> sessionListToUnreadEventList = MessageUtils.sessionListToUnreadEventList(list);
        ((l) m.a(l.class)).b(IMClient.o.class).a(s).a(new b.a<IMClient.o>() { // from class: com.sankuai.xm.im.session.c.17
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.util.b.a
            public final /* synthetic */ boolean a(IMClient.o oVar) {
                IMClient.o oVar2 = oVar;
                Object[] objArr2 = {oVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59d7020d78c24b487290c44a94944c1c", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59d7020d78c24b487290c44a94944c1c")).booleanValue();
                }
                oVar2.c(sessionListToUnreadEventList);
                return false;
            }
        });
    }

    private void b(short s, final List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {Short.valueOf(s), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "412fb8c50c2422bbfe38a985bfe0f9e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "412fb8c50c2422bbfe38a985bfe0f9e3");
        } else {
            ((l) m.a(l.class)).b(IMClient.f.class).a(s).a(new b.a<IMClient.f>() { // from class: com.sankuai.xm.im.session.c.18
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(IMClient.f fVar) {
                    IMClient.f fVar2 = fVar;
                    Object[] objArr2 = {fVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9cb65dfdcfaf4a1e3b07e586df3581f", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9cb65dfdcfaf4a1e3b07e586df3581f")).booleanValue();
                    }
                    fVar2.a(list);
                    return false;
                }
            });
        }
    }

    private void c(short s, final List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {Short.valueOf(s), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eccf75eca919f66b7190db8e7c95fe2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eccf75eca919f66b7190db8e7c95fe2");
        } else {
            ((l) m.a(l.class)).b(IMClient.f.class).a(s).a(new b.a<IMClient.f>() { // from class: com.sankuai.xm.im.session.c.19
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(IMClient.f fVar) {
                    IMClient.f fVar2 = fVar;
                    Object[] objArr2 = {fVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc201500c0deeb2d52049a47e9d1dbed", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc201500c0deeb2d52049a47e9d1dbed")).booleanValue();
                    }
                    fVar2.b(list);
                    return false;
                }
            });
        }
    }

    public final void a(SessionId sessionId, int i) {
        Object[] objArr = {sessionId, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63a900ca9f791f18a00d67b49afe1fea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63a900ca9f791f18a00d67b49afe1fea");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(MessageStatisticsEntry.PARAM_CHAT, sessionId.b + CommonConstant.Symbol.UNDERLINE + sessionId.c);
        hashMap.put(MessageStatisticsEntry.PARAM_CHANNEL, Short.valueOf(sessionId.g));
        hashMap.put(MessageStatisticsEntry.PARAM_MSG_CATEGORY, Integer.valueOf(sessionId.e));
        hashMap.put("count", Integer.valueOf(i));
        com.sankuai.xm.monitor.c.a("ijc", hashMap);
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f5ff3b2aae79dd0a363b7a4c5423645", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f5ff3b2aae79dd0a363b7a4c5423645");
            return;
        }
        DBProxy.l().m.b();
        DBProxy.l().m().a();
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a003497f5d8fcf2e7666e51d284879", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a003497f5d8fcf2e7666e51d284879");
            return;
        }
        SharedPreferences.Editor edit = com.sankuai.xm.im.utils.b.a().edit();
        if (edit == null) {
            com.sankuai.xm.im.utils.a.d("cleanVersion, SharedPreferences.Editor == null", new Object[0]);
            return;
        }
        edit.remove("SESSION_LIST_VERSION_IM");
        edit.remove("SESSION_LIST_VERSION_PUB");
        com.sankuai.xm.im.utils.b.a(edit);
    }

    private long c(int i) {
        long parseLong;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4cf03ef8d6899a39231457c8cd4589f", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4cf03ef8d6899a39231457c8cd4589f")).longValue();
        }
        if (i == 1) {
            String string = com.sankuai.xm.im.utils.b.a().getString("SESSION_LIST_VERSION_IM", null);
            if (!ac.a(string)) {
                parseLong = Long.parseLong(string) - DDLoadConstants.TIME_HOURS_MILLIS;
            }
            parseLong = 0;
        } else {
            if (i == 2) {
                String string2 = com.sankuai.xm.im.utils.b.a().getString("SESSION_LIST_VERSION_PUB", null);
                parseLong = ac.a(string2) ? 0L : Long.parseLong(string2) - DDLoadConstants.TIME_HOURS_MILLIS;
            }
            parseLong = 0;
        }
        if (parseLong > 0) {
            return parseLong;
        }
        return 0L;
    }

    private boolean a(int i, int i2, short s) {
        String a2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fe193293e476d3f012dbd1ebb8ee617", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fe193293e476d3f012dbd1ebb8ee617")).booleanValue();
        }
        if (i != 2 || com.sankuai.xm.im.c.a(c.b.PUB_CHAT)) {
            if (i != 1 || com.sankuai.xm.im.c.a(c.b.PEER_CHAT) || com.sankuai.xm.im.c.a(c.b.GROUP_CHAT)) {
                com.sankuai.xm.im.utils.a.b("SessionProcessor::querySessions, type = " + i + ", reason = " + ((int) s), new Object[0]);
                if (i == 2) {
                    a2 = com.sankuai.xm.im.http.a.a("/msg/api/pub/v1/chatlist");
                } else {
                    a2 = com.sankuai.xm.im.http.a.a("/msg/api/chat/v3/chatlist/appid");
                }
                HashMap hashMap = new HashMap();
                hashMap.put("ai", Short.valueOf(IMClient.a().g()));
                hashMap.put("lm", 100);
                hashMap.put("pl", Short.valueOf(s));
                hashMap.put("st", Long.valueOf(c(i)));
                hashMap.put("et", Long.valueOf(com.sankuai.xm.login.c.a().a(System.currentTimeMillis())));
                hashMap.put("type", (short) 1);
                if (s == 1) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put("ext");
                    hashMap.put("fields", jSONArray);
                }
                com.sankuai.xm.base.d dVar = new com.sankuai.xm.base.d(a2, hashMap, (com.sankuai.xm.network.httpurlconnection.d) null);
                dVar.a(new a(dVar, i, i2));
                dVar.a(new com.sankuai.xm.network.httpurlconnection.retry.b(new long[]{1000, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE}));
                dVar.b(2);
                dVar.a(true);
                g.a().a((com.sankuai.xm.network.httpurlconnection.e) dVar, 0L);
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<IMMessage> a(byte[][] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f245f5c6b8974a981a168a79cc0b54b7", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f245f5c6b8974a981a168a79cc0b54b7");
        }
        ArrayList arrayList = new ArrayList();
        if (bArr == null || bArr.length == 0) {
            return arrayList;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 != null && bArr2.length != 0) {
                try {
                    int d = com.sankuai.xm.base.proto.protobase.f.d(bArr2);
                    IMMessage msgProtoToIMMessage = MessageUtils.msgProtoToIMMessage(bArr2, d);
                    if (msgProtoToIMMessage == null) {
                        msgProtoToIMMessage = MessageUtils.cancelProtoToIMMessage(bArr2, d);
                    }
                    if (msgProtoToIMMessage != null) {
                        arrayList.add(msgProtoToIMMessage);
                    }
                } catch (Exception e) {
                    com.sankuai.xm.im.utils.a.a(e, "SessionProcessor::parseIMMessageList => exception=" + e.getMessage(), new Object[0]);
                }
            }
        }
        return arrayList;
    }

    @NonNull
    private List<DBSession> h(@NonNull List<IMMessage> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4e7caee0789b99fe630a231ee5c6d84", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4e7caee0789b99fe630a231ee5c6d84");
        }
        HashMap hashMap = new HashMap();
        for (IMMessage iMMessage : list) {
            SessionId a2 = SessionId.a(iMMessage);
            com.sankuai.xm.im.session.entry.a aVar = new com.sankuai.xm.im.session.entry.a();
            aVar.c = a2.f();
            aVar.b = iMMessage;
            if (iMMessage.getMsgStatus() == 7) {
                aVar.d = 1;
            }
            com.sankuai.xm.im.session.entry.a aVar2 = (com.sankuai.xm.im.session.entry.a) hashMap.get(a2);
            if (aVar2 == null) {
                hashMap.put(a2, aVar);
            } else {
                aVar2.d = aVar.d + aVar2.d;
                if (iMMessage.getSts() > aVar2.b.getSts() || (iMMessage.getSts() == aVar2.b.getSts() && iMMessage.getMsgId() > aVar2.b.getMsgId())) {
                    aVar.d = aVar2.d;
                    hashMap.put(a2, aVar);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            arrayList.add(MessageUtils.sessionToDBSession((com.sankuai.xm.im.session.entry.a) entry.getValue()));
        }
        return arrayList;
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "227c323bceb57ce1ad1e94c209b5967c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "227c323bceb57ce1ad1e94c209b5967c");
        } else {
            DBProxy.l().m.a(Long.MAX_VALUE, (Callback<Void>) null);
        }
    }

    private void b(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c75700b964081e910ae9a44ffbbfa3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c75700b964081e910ae9a44ffbbfa3a");
            return;
        }
        com.sankuai.xm.im.utils.a.b("SessionProcessor::notifyRemoteSyncStart, sync:" + z, new Object[0]);
        ((l) m.a(l.class)).b(IMClient.l.class).a(new b.a<IMClient.l>() { // from class: com.sankuai.xm.im.session.c.22
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.util.b.a
            public final /* synthetic */ boolean a(IMClient.l lVar) {
                Object[] objArr2 = {lVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "547a05bb7c9bab9ca97e11b16bb2bb09", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "547a05bb7c9bab9ca97e11b16bb2bb09")).booleanValue();
                }
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29cfb845dc27da77148faa6be72a1fcb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29cfb845dc27da77148faa6be72a1fcb");
            return;
        }
        com.sankuai.xm.im.utils.a.b("SessionProcessor::notifyRemoteSyncFinish, " + i + CommonConstant.Symbol.COLON + i2, new Object[0]);
        ((l) m.a(l.class)).b(IMClient.l.class).a(new b.a<IMClient.l>() { // from class: com.sankuai.xm.im.session.c.23
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.util.b.a
            public final /* synthetic */ boolean a(IMClient.l lVar) {
                Object[] objArr2 = {lVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c1437a5f1f79cad497621b8b09d697c", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c1437a5f1f79cad497621b8b09d697c")).booleanValue();
                }
                return false;
            }
        });
    }

    public void c(final SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44da6a2df9ad91220b0b1a9769658509", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44da6a2df9ad91220b0b1a9769658509");
        } else {
            DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.session.c.24
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ecd48036836fd38bf35b340f4c24f9b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ecd48036836fd38bf35b340f4c24f9b");
                        return;
                    }
                    DBMessage c = DBProxy.l().k.c(sessionId);
                    if (c != null) {
                        DBSession a2 = DBProxy.l().m.a(sessionId.f());
                        if (a2 == null || !ac.a(a2.getMsgUuid(), c.getMsgUuid())) {
                            c.this.a(c);
                            com.sankuai.xm.im.utils.a.c("SessionProcessor::checkAndModifySession => sid = " + sessionId + ", lastMsg = " + c.keyParamToString() + ", currSession = " + a2, new Object[0]);
                            HashMap hashMap = new HashMap();
                            hashMap.put(MessageStatisticsEntry.PARAM_CHAT, sessionId.f());
                            hashMap.put(MessageStatisticsEntry.PARAM_MSG_ID, c.getMsgUuid());
                            hashMap.put("cmid", a2 == null ? "" : a2.getMsgUuid());
                            com.sankuai.xm.monitor.c.a("chat_err", hashMap);
                        }
                    }
                }
            }), (Callback) null);
        }
    }

    @Override // com.sankuai.xm.base.feedback.c
    public final void a() {
        DBSession dBSession;
        StringBuilder sb;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42cfb431242c84591a61fb920e18d351", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42cfb431242c84591a61fb920e18d351");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ids", IMClient.a().k);
        SessionId sessionId = this.b.get();
        List<DBSession> a2 = DBProxy.l().m.a((short[]) null, (int[]) null, Long.MAX_VALUE);
        if (com.sankuai.xm.base.util.b.a(a2)) {
            dBSession = null;
        } else {
            com.sankuai.xm.im.utils.c.a((List<? extends Message>) a2, true);
            ArrayList arrayList = new ArrayList(Math.min(20, a2.size()));
            StringBuilder sb2 = new StringBuilder("---------------------------feedback:recent session------------------------------");
            sb2.append("\n");
            DBSession dBSession2 = null;
            int i = 0;
            for (DBSession dBSession3 : a2) {
                SessionId a3 = SessionId.a(dBSession3);
                if (a3.equals(sessionId)) {
                    dBSession2 = dBSession3;
                }
                sb2.append("[");
                sb2.append(a3.f());
                sb2.append(",unread:");
                sb2.append(dBSession3.getUnRead());
                sb2.append(",msg:");
                sb2.append(dBSession3.getMsgUuid());
                sb2.append("/");
                sb2.append(dBSession3.getMsgId());
                sb2.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                if (sb2.length() > 2000) {
                    com.sankuai.xm.im.utils.a.b(sb2.toString(), new Object[0]);
                    sb2 = new StringBuilder();
                }
                int i2 = i + 1;
                if (i < 20) {
                    String str = ac.a(a3.g()) ? "" : "&sid=" + a3.g();
                    Object[] objArr2 = new Object[7];
                    sb = sb2;
                    objArr2[0] = Long.valueOf(a3.b);
                    objArr2[1] = Long.valueOf(a3.c);
                    objArr2[2] = Short.valueOf(a3.g);
                    objArr2[3] = a3.h();
                    objArr2[4] = str;
                    objArr2[5] = Integer.valueOf(dBSession3.getUnRead());
                    objArr2[6] = dBSession3.getMsgId() == 0 ? dBSession3.getMsgUuid() : Long.valueOf(dBSession3.getMsgId());
                    arrayList.add(String.format("chatid=%d&peeruid=%d&channel=%d&type=%s%s&unread=%d&msg=%s", objArr2));
                } else {
                    sb = sb2;
                }
                i = i2;
                sb2 = sb;
            }
            com.sankuai.xm.im.utils.a.b(sb2.toString(), new Object[0]);
            hashMap.put("chats", arrayList);
            dBSession = dBSession2;
        }
        if (dBSession != null) {
            StringBuilder sb3 = new StringBuilder("---------------------------feedback:current session------------------------------");
            sb3.append("\n");
            String format = String.format("chatid=%d&peeruid=%d&channel=%d&type=%s&sid=%s", Long.valueOf(sessionId.b), Long.valueOf(sessionId.c), Short.valueOf(sessionId.g), sessionId.h(), sessionId.g());
            sb3.append(format);
            hashMap.put(MessageStatisticsEntry.PARAM_CHAT, format);
            com.sankuai.xm.im.utils.a.b(sb3.toString(), new Object[0]);
            List<DBMessage> e = DBProxy.l().k.e(sessionId);
            if (!com.sankuai.xm.base.util.b.a(e)) {
                com.sankuai.xm.im.utils.c.a((List<? extends Message>) e, true);
                MessageUtils.printMsgIds(e);
                hashMap.put(MessageStatisticsEntry.PARAM_MSG_ID, dBSession.getMsgId() == 0 ? dBSession.getMsgUuid() : Long.valueOf(dBSession.getMsgId()));
                hashMap.put("count", Integer.valueOf(e.size()));
            }
        }
        com.sankuai.xm.monitor.c.a(DMKeys.KEY_MIDAS_FEEDBACK, hashMap);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends com.sankuai.xm.network.httpurlconnection.d {
        public static ChangeQuickRedirect a;
        private com.sankuai.xm.base.d c;
        private int d;
        private int e;
        private int f;
        private long g;
        private boolean m;

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
            if (r14 <= 0) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(com.sankuai.xm.base.d r13, int r14, int r15) {
            /*
                r11 = this;
                com.sankuai.xm.im.session.c.this = r12
                r11.<init>()
                r0 = 4
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r8 = 0
                r0[r8] = r12
                r12 = 1
                r0[r12] = r13
                java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
                r2 = 2
                r0[r2] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
                r2 = 3
                r0[r2] = r1
                com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.im.session.c.a.a
                java.lang.String r10 = "2ed2a5035d05324cd515e26d2c95c95b"
                r4 = 0
                r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
                r1 = r0
                r2 = r11
                r3 = r9
                r5 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L31
                com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
                return
            L31:
                r11.c = r13
                r11.d = r14
                r11.e = r8
                if (r15 > 0) goto L3c
                r15 = 2147483647(0x7fffffff, float:NaN)
            L3c:
                r11.f = r15
                java.lang.String r14 = "st"
                java.lang.Object r14 = r13.c(r14)
                java.lang.Long r14 = (java.lang.Long) r14
                long r14 = r14.longValue()
                java.lang.String r0 = "et"
                java.lang.Object r0 = r13.c(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                long r0 = r0.longValue()
                r2 = 0
                int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
                if (r4 == 0) goto L62
                long r14 = r0 - r14
                int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
                if (r0 > 0) goto L63
            L62:
                r14 = r2
            L63:
                r11.g = r14
                java.lang.String r14 = "fields"
                java.lang.Object r13 = r13.c(r14)
                if (r13 == 0) goto L6e
                goto L6f
            L6e:
                r12 = 0
            L6f:
                r11.m = r12
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.session.c.a.<init>(com.sankuai.xm.im.session.c, com.sankuai.xm.base.d, int, int):void");
        }

        @Override // com.sankuai.xm.network.httpurlconnection.c
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bd50d13421c640c40e0b5df60562524", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bd50d13421c640c40e0b5df60562524");
                return;
            }
            super.a();
            StringBuilder sb = new StringBuilder();
            sb.append(this.d);
            com.sankuai.xm.monitor.c.a("chatss", sb.toString());
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(JSONObject jSONObject) throws Exception {
            int min;
            Map<SessionId, JSONObject> a2;
            boolean z = true;
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b33af9b95806b006b5914603d04176d1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b33af9b95806b006b5914603d04176d1");
                return;
            }
            c.a(c.this, this.d);
            com.sankuai.xm.base.util.net.c a3 = new com.sankuai.xm.base.util.net.c(jSONObject).a("data");
            JSONArray f = a3.f(APKStructure.Res_Type);
            if (f == null || f.length() == 0) {
                com.sankuai.xm.im.utils.a.c("SessionProcessor::SessionCallback::onSuccess => querySession, session list is null, type = " + this.d, new Object[0]);
                a(0, this.c.a());
                c.this.a(this.d, this.e);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < f.length(); i++) {
                byte[] decode = Base64.decode(f.getString(i), 0);
                if (decode != null && decode.length != 0) {
                    try {
                        com.sankuai.xm.base.proto.a aVar = new com.sankuai.xm.base.proto.a();
                        aVar.a(decode);
                        List a4 = c.this.a(aVar.a());
                        if (a4 != null && !a4.isEmpty()) {
                            arrayList.addAll(a4);
                        }
                    } catch (Exception e) {
                        com.sankuai.xm.im.utils.a.a(e, "SessionProcessor::SessionCallback::onSuccess => querySession, marshall e, e=" + e.toString(), new Object[0]);
                    }
                }
            }
            this.e += arrayList.size();
            a(arrayList.size(), this.c.a());
            long d = a3.d("next");
            if (this.d == 2) {
                min = Math.min(a.C1395a.b(3), this.f);
            } else {
                min = this.d == 1 ? Math.min(a.C1395a.a(1, 2), this.f) : 0;
            }
            com.sankuai.xm.im.utils.a.a("SessionProcessor::SessionCallback.onSuccess = " + d + ",type " + this.d, new Object[0]);
            z = (d <= 0 || this.e >= min) ? false : false;
            c.a(c.this, arrayList, this.d, this.e, z);
            if (this.m && (a2 = a(a3.f(DBSessionMsgSpecialTag.CHAT))) != null && !a2.isEmpty()) {
                c.this.b(a2);
            }
            if (z) {
                com.sankuai.xm.im.utils.a.b("SessionProcessor::SessionCallback.onComplete querySession, next=" + d + ", type=" + this.d, new Object[0]);
                this.c.a("et", Long.valueOf(d));
                this.c.a(new com.sankuai.xm.network.httpurlconnection.retry.b(new long[]{1000, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE}));
                g.a().a((com.sankuai.xm.network.c) this.c, 0);
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e16f3521c49e24837246f5b0ce8dc4b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e16f3521c49e24837246f5b0ce8dc4b");
            } else if (i == 19 || i == 1000 || i == 20 || i == 24 || i == 1) {
                b(i, this.c.a());
                c.this.a(this.d, this.e);
            } else if (this.c.G().b()) {
                g.a().a(this.c, this.c.G().c());
            } else {
                b(i, this.c.a());
                c.this.a(this.d, this.e);
            }
        }

        private void a(int i, boolean z) {
            Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd697481b93374dbfdd5990cf62277e1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd697481b93374dbfdd5990cf62277e1");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("count", Integer.valueOf(i));
            hashMap.put("net", Integer.valueOf(com.sankuai.xm.base.util.net.d.c(IMClient.a().f())));
            hashMap.put(MessageStatisticsEntry.PARAM_MSG_CATEGORY, Integer.valueOf(this.d));
            hashMap.put("interval", Long.valueOf(this.g));
            hashMap.put("seqId", this.c.y());
            hashMap.put("msg", this.c.l());
            if (z) {
                hashMap.put("type", 1);
            }
            com.sankuai.xm.monitor.c.a("chatss", this.c.y(), (Map<String, Object>) hashMap);
        }

        private void b(int i, boolean z) {
            Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "965421cb0e2142663d958225851ccdaf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "965421cb0e2142663d958225851ccdaf");
                return;
            }
            com.sankuai.xm.monitor.c.b("chatss", this.c.y());
            HashMap hashMap = new HashMap();
            hashMap.put("reason", Integer.valueOf(i));
            hashMap.put("net", Integer.valueOf(com.sankuai.xm.base.util.net.d.c(IMClient.a().f())));
            hashMap.put(MessageStatisticsEntry.PARAM_MSG_CATEGORY, Integer.valueOf(this.d));
            hashMap.put("seqId", this.c.y());
            hashMap.put("msg", this.c.l());
            if (z) {
                hashMap.put("type", 1);
            }
            com.sankuai.xm.monitor.c.a("chater", hashMap);
        }

        private Map<SessionId, JSONObject> a(JSONArray jSONArray) {
            Object[] objArr = {jSONArray};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e084675caf06099868604dc9c731fbcf", 6917529027641081856L)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e084675caf06099868604dc9c731fbcf");
            }
            if (jSONArray == null || jSONArray.length() <= 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                Pair<SessionId, JSONObject> a2 = c.a(c.this).a(this.d, jSONArray.optJSONObject(i));
                if (a2 != null) {
                    hashMap.put(a2.first, a2.second);
                }
            }
            return hashMap;
        }
    }
}
