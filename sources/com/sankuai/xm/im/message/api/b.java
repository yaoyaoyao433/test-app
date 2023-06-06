package com.sankuai.xm.im.message.api;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.v4.util.LruCache;
import android.util.Base64;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.android.neohybrid.neo.bridge.presenter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.base.util.p;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.message.api.a;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.sankuai.xm.im.message.bean.MsgAddition;
import com.sankuai.xm.im.utils.MessageUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends com.sankuai.xm.base.service.a implements com.sankuai.xm.base.lifecycle.a, com.sankuai.xm.im.message.api.a {
    public static ChangeQuickRedirect a;
    private static volatile Map<Integer, Map<Short, a>> b;
    private final LruCache<Long, c> c;

    private static String d(int i) {
        switch (i) {
            case 1:
                return "imCategories";
            case 2:
                return "gimCategories";
            default:
                return "categories";
        }
    }

    public static /* synthetic */ String a(b bVar, int i) {
        return d(i);
    }

    public static /* synthetic */ void a(b bVar, Collection collection, int i) {
        Object[] objArr = {collection, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "12e978799a0a6d0b6930eab2c504d10f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "12e978799a0a6d0b6930eab2c504d10f");
            return;
        }
        try {
            j.a(i.end, "notify_addition", (String[]) null, new Object[]{collection, new Integer(i)});
            HashMap hashMap = new HashMap();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                MsgAddition msgAddition = (MsgAddition) it.next();
                List list = (List) hashMap.get(Short.valueOf(msgAddition.getChannel()));
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(Short.valueOf(msgAddition.getChannel()), list);
                }
                list.add(msgAddition);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                bVar.a(((Short) entry.getKey()).shortValue(), (List) entry.getValue(), i);
                if (IMClient.a().a(((Short) entry.getKey()).shortValue())) {
                    arrayList.addAll((Collection) entry.getValue());
                }
            }
            bVar.a((short) -1, (List<MsgAddition>) arrayList, i);
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    public static /* synthetic */ void a(b bVar, Collection collection, long j) {
        Object[] objArr = {collection, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "fe6c7bbf647e9420d50b03e74230e85e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "fe6c7bbf647e9420d50b03e74230e85e");
        } else if (com.sankuai.xm.base.util.b.a(collection) || j <= 0) {
            com.sankuai.xm.im.utils.a.b("MsgAdditionService", "updateCacheInfo", "no data need update, %d", Long.valueOf(j));
        } else {
            synchronized (bVar.c) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    MsgAddition msgAddition = (MsgAddition) it.next();
                    long msgId = msgAddition.getMsgId();
                    c cVar = bVar.c.get(Long.valueOf(msgId));
                    if (cVar == null) {
                        cVar = new c();
                        cVar.a = msgId;
                        bVar.c.put(Long.valueOf(msgId), cVar);
                    }
                    if (cVar.b < j) {
                        cVar.b = j;
                        cVar.c = msgAddition.isFinal();
                    }
                }
            }
        }
    }

    public static /* synthetic */ void a(b bVar, Collection collection, Map map, int i, short s, com.sankuai.xm.im.a aVar) {
        Object[] objArr = {collection, map, Integer.valueOf(i), Short.valueOf(s), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "8d2f45bebdf949947783c62ba1c8ada7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "8d2f45bebdf949947783c62ba1c8ada7");
        } else if (com.sankuai.xm.base.util.b.a(collection)) {
            com.sankuai.xm.base.callback.a.a(aVar, bVar.a(map));
        } else {
            String a2 = MessageUtils.isPubService(i) ? com.sankuai.xm.im.http.a.a("/msg/api/pub/v1/addition/query") : com.sankuai.xm.im.http.a.a("/msg/api/chat/v1/addition/query");
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    MsgAddition msgAddition = (MsgAddition) map.get(l);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(MessageStatisticsEntry.PARAM_MSG_ID, l);
                    if (msgAddition != null) {
                        jSONObject2.put("sts", msgAddition.getSts());
                        jSONObject2.put("seqId", msgAddition.getSeqId());
                    }
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("additions", jSONArray);
                jSONObject.put(MessageStatisticsEntry.PARAM_CHANNEL, (int) s);
                if (MessageUtils.isIMPeerService(i)) {
                    jSONObject.put(g.n, 0);
                } else if (MessageUtils.isGroupService(i)) {
                    jSONObject.put(g.n, 1);
                }
                com.sankuai.xm.network.httpurlconnection.g.a().a((com.sankuai.xm.network.httpurlconnection.e) new com.sankuai.xm.base.d(a2, jSONObject, new AnonymousClass4(aVar, map, collection, s, i)), 0L);
            } catch (JSONException unused) {
                com.sankuai.xm.base.callback.a.a(aVar, bVar.a(map));
            }
        }
    }

    public static /* synthetic */ void a(b bVar, JSONArray jSONArray, int i) {
        Object[] objArr = {jSONArray, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "697a938a12db0798643e63e301f5f0da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "697a938a12db0798643e63e301f5f0da");
        } else if (jSONArray == null) {
            com.sankuai.xm.base.e a2 = com.sankuai.xm.base.e.a();
            a2.a(bVar.a("config_" + i));
        } else {
            com.sankuai.xm.base.e a3 = com.sankuai.xm.base.e.a();
            a3.a(bVar.a("config_" + i), jSONArray.toString());
        }
    }

    public static b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9e0d084d35e3f4ce0f562048224882a", 6917529027641081856L) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9e0d084d35e3f4ce0f562048224882a") : (b) m.a(com.sankuai.xm.im.message.api.a.class);
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47c263662cf8c7728db5e8cd70586b0b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47c263662cf8c7728db5e8cd70586b0b");
            return;
        }
        this.c = new LruCache<>(500);
        com.sankuai.xm.base.lifecycle.d.d().a(this);
    }

    @Override // com.sankuai.xm.base.service.a
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79cfb6b73e729b1848aca803770b5c0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79cfb6b73e729b1848aca803770b5c0f");
            return;
        }
        super.a(j);
        com.sankuai.xm.im.utils.a.a("MsgAdditionService", "bindUser", "new uid = %d", Long.valueOf(j));
        synchronized (this.c) {
            this.c.evictAll();
        }
    }

    @Override // com.sankuai.xm.base.service.a
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7519cef5fca2ca1ce49bef66aaaa4bdc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7519cef5fca2ca1ce49bef66aaaa4bdc");
            return;
        }
        super.k();
        c();
    }

    @Override // com.sankuai.xm.base.lifecycle.a
    public final void a(int i) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a158a5d3e7b54b90ef79afce0a67690b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a158a5d3e7b54b90ef79afce0a67690b");
        } else if (i == 1) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb3718ceaa2b8733307e9594e7c94cc4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb3718ceaa2b8733307e9594e7c94cc4");
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0a91ed1c529d8308b44ab4c379bcda84", 6917529027641081856L)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0a91ed1c529d8308b44ab4c379bcda84")).booleanValue();
            } else {
                c();
                if (b.isEmpty()) {
                    z = false;
                }
            }
            if (z) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                long longValue = PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7c555552341d46a1e1d7ec5f652f6068", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7c555552341d46a1e1d7ec5f652f6068")).longValue() : com.sankuai.xm.im.utils.b.a().getLong(e(), 0L);
                if (longValue == 0 || System.currentTimeMillis() - longValue >= 86400000) {
                    final com.sankuai.xm.im.cache.g p = DBProxy.l().p();
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.xm.im.cache.g.a;
                    if (PatchProxy.isSupport(objArr5, p, changeQuickRedirect5, false, "1fc228c7c6e57b979ba649581adf0903", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr5, p, changeQuickRedirect5, false, "1fc228c7c6e57b979ba649581adf0903");
                    } else {
                        p.b.a(j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.g.3
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Cursor cursor;
                                int count;
                                Object[] objArr6 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3af47d7a973d0c7c9bf514361ae550c7", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3af47d7a973d0c7c9bf514361ae550c7");
                                    return;
                                }
                                com.sankuai.xm.base.db.c bR_ = p.b.bR_();
                                try {
                                    cursor = bR_.a(MsgAddition.TABLE, null, null, null, null, null, null);
                                    if (cursor == null) {
                                        count = 0;
                                    } else {
                                        try {
                                            count = cursor.getCount();
                                        } catch (Throwable th) {
                                            th = th;
                                            com.sankuai.xm.base.util.m.a(cursor);
                                            throw th;
                                        }
                                    }
                                    if (count < 3000) {
                                        com.sankuai.xm.im.utils.a.a("MsgAdditionDBProxy", "cleanAsync", "no need clean, count=%d", Integer.valueOf(count));
                                        com.sankuai.xm.base.util.m.a(cursor);
                                        return;
                                    }
                                    com.sankuai.xm.im.utils.a.a("MsgAdditionDBProxy", "cleanAsync", "count=%d", Integer.valueOf(bR_.a(MsgAddition.TABLE, null, null)));
                                    com.sankuai.xm.base.util.m.a(cursor);
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = null;
                                }
                            }
                        }), (Callback) null);
                    }
                    this.c.evictAll();
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "875b2a92d9b52a009a50fde598fbd009", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "875b2a92d9b52a009a50fde598fbd009");
                    } else {
                        com.sankuai.xm.im.utils.b.a(com.sankuai.xm.im.utils.b.a().a(e(), System.currentTimeMillis()));
                    }
                }
            }
        }
    }

    @Override // com.sankuai.xm.im.message.api.a
    public final boolean a(int i, short s, int i2) {
        Map<Short, a> map;
        Object[] objArr = {Integer.valueOf(i), Short.valueOf(s), -1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc74dedeac44aae2ff3bdb2e15f0756a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc74dedeac44aae2ff3bdb2e15f0756a")).booleanValue();
        }
        c();
        return (b == null || (map = b.get(Integer.valueOf(MessageUtils.getServiceForCategory(i)))) == null || !map.containsKey(Short.valueOf(s))) ? false : true;
    }

    @Override // com.sankuai.xm.im.message.api.a
    public final void a(final List<Long> list, final short s, final int i, int i2, final com.sankuai.xm.im.a<List<MsgAddition>> aVar) {
        int i3;
        Object[] objArr = {list, Short.valueOf(s), Integer.valueOf(i), 0, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47ab9f52ed42a5e2ac1c617a95dea97f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47ab9f52ed42a5e2ac1c617a95dea97f");
            return;
        }
        Object[] objArr2 = {list, Short.valueOf(s), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f3c47767e1d6019806e41b6f7a6d735", 6917529027641081856L)) {
            i3 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f3c47767e1d6019806e41b6f7a6d735")).intValue();
        } else if (com.sankuai.xm.base.util.b.b(list) > 30) {
            i3 = 10011;
        } else {
            i3 = !a(i, s, -1) ? RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT : 0;
        }
        if (i3 != 0) {
            com.sankuai.xm.base.callback.a.a(aVar, i3, "query fail, msgids=" + com.sankuai.xm.base.util.b.b(list) + ",cateogry=" + i + ",channel=" + ((int) s));
        } else if (com.sankuai.xm.base.util.b.a(list)) {
            com.sankuai.xm.base.callback.a.a(aVar, null);
        } else {
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            a(list, hashSet2, hashSet);
            final com.sankuai.xm.im.a<Map<Long, MsgAddition>> aVar2 = new com.sankuai.xm.im.a<Map<Long, MsgAddition>>() { // from class: com.sankuai.xm.im.message.api.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj) {
                    Map map = (Map) obj;
                    Object[] objArr3 = {map};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f995a68d8e2b03bc46425e02594eb0b7", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f995a68d8e2b03bc46425e02594eb0b7");
                    } else if (r2 == 2) {
                        com.sankuai.xm.base.callback.a.a(aVar, b.this.a(map));
                    } else {
                        b.a(b.this, hashSet, map, i, s, aVar);
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i4, String str) {
                    Object[] objArr3 = {Integer.valueOf(i4), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a856f35c3ad07dd3d4612c81de9cfe8f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a856f35c3ad07dd3d4612c81de9cfe8f");
                        return;
                    }
                    com.sankuai.xm.im.a aVar3 = aVar;
                    com.sankuai.xm.base.callback.a.a(aVar3, i4, str + ", msgids=" + com.sankuai.xm.base.util.b.b(list) + ",cateogry=" + i + ",channel=" + ((int) s));
                }
            };
            Object[] objArr3 = {list, hashSet2, hashSet, aVar2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1e3e0e176cb9baafb23fec41a92af899", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1e3e0e176cb9baafb23fec41a92af899");
            } else if (com.sankuai.xm.base.util.b.a(list)) {
                com.sankuai.xm.base.callback.a.a(aVar2, null);
            } else {
                DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.message.api.b.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ea63ad26ec4fd5fec3cafec97d93aa18", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ea63ad26ec4fd5fec3cafec97d93aa18");
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        for (Long l : list) {
                            if (hashSet2.contains(l)) {
                                hashSet.add(l);
                            }
                            hashMap.put(l, null);
                        }
                        List<MsgAddition> b2 = DBProxy.l().p().b(list);
                        if (!com.sankuai.xm.base.util.b.a(b2)) {
                            for (MsgAddition msgAddition : b2) {
                                if (msgAddition.isFinal()) {
                                    hashSet.remove(Long.valueOf(msgAddition.getMsgId()));
                                }
                                hashMap.put(Long.valueOf(msgAddition.getMsgId()), msgAddition);
                            }
                        }
                        com.sankuai.xm.base.callback.a.a(aVar2, hashMap);
                    }
                }), aVar2);
            }
        }
    }

    @Override // com.sankuai.xm.im.message.api.a
    public final void a(short s, a.InterfaceC1390a interfaceC1390a) {
        Object[] objArr = {Short.valueOf(s), interfaceC1390a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "188b83b7c9d8e4a95abf8e7f44e27ad5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "188b83b7c9d8e4a95abf8e7f44e27ad5");
        } else {
            ((l) m.a(l.class)).a(a.InterfaceC1390a.class).a(s).a((l.a) interfaceC1390a);
        }
    }

    @Override // com.sankuai.xm.im.message.api.a
    public final void b(short s, a.InterfaceC1390a interfaceC1390a) {
        Object[] objArr = {Short.valueOf(s), interfaceC1390a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c69d9bad6ea65d7c861e74e8820bfaac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c69d9bad6ea65d7c861e74e8820bfaac");
        } else {
            ((l) m.a(l.class)).a(a.InterfaceC1390a.class).a(s).b(interfaceC1390a);
        }
    }

    public final void a(final com.sankuai.xm.base.proto.addition.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "157c6657e0cca9a7540b6c9ed8e753f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "157c6657e0cca9a7540b6c9ed8e753f5");
        } else {
            DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.message.api.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    MsgAddition msgAddition;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7ba9b1a96bf125b2b44639ab52bdd64", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7ba9b1a96bf125b2b44639ab52bdd64");
                        return;
                    }
                    MsgAddition pAdditionToMsgAddition = MessageUtils.pAdditionToMsgAddition(aVar);
                    com.sankuai.xm.im.cache.g p = DBProxy.l().p();
                    long d = aVar.d();
                    Object[] objArr3 = {new Long(d)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.cache.g.a;
                    if (PatchProxy.isSupport(objArr3, p, changeQuickRedirect3, false, "cc81a4b66b7983bc019c02b6d5562dca", 6917529027641081856L)) {
                        msgAddition = (MsgAddition) PatchProxy.accessDispatch(objArr3, p, changeQuickRedirect3, false, "cc81a4b66b7983bc019c02b6d5562dca");
                    } else {
                        List<MsgAddition> b2 = p.b(Collections.singletonList(Long.valueOf(d)));
                        msgAddition = !com.sankuai.xm.base.util.b.a(b2) ? b2.get(0) : null;
                    }
                    if (!pAdditionToMsgAddition.newThan(msgAddition)) {
                        com.sankuai.xm.im.utils.a.b("MsgAdditionService", "onReceive", "%s older than db cache", pAdditionToMsgAddition);
                        return;
                    }
                    com.sankuai.xm.im.cache.g p2 = DBProxy.l().p();
                    Object[] objArr4 = {pAdditionToMsgAddition};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.im.cache.g.a;
                    if (PatchProxy.isSupport(objArr4, p2, changeQuickRedirect4, false, "63cfb3c6a962db4f50135a95d68ca625", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, p2, changeQuickRedirect4, false, "63cfb3c6a962db4f50135a95d68ca625");
                    } else if (pAdditionToMsgAddition == null || !pAdditionToMsgAddition.valid()) {
                        com.sankuai.xm.im.utils.a.b("MsgAdditionDBProxy", "addOrUpdate", "addition invalid,%s", pAdditionToMsgAddition);
                    } else {
                        p2.a(Collections.singletonList(pAdditionToMsgAddition));
                    }
                    List singletonList = Collections.singletonList(pAdditionToMsgAddition);
                    b.a(b.this, singletonList, pAdditionToMsgAddition.getSts());
                    b.a(b.this, (Collection) singletonList, 0);
                }
            }), (Callback) null);
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93dd23ffd041fe92a7cfa41672c1c304", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93dd23ffd041fe92a7cfa41672c1c304");
        } else if (b != null) {
        } else {
            b(3);
            b(2);
            b(1);
            com.sankuai.xm.im.utils.a.a("MsgAdditionService", "loadConfig", "config.cache=%s", b);
        }
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f189437077c719f52c9aa7b30dd0065c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f189437077c719f52c9aa7b30dd0065c");
            return;
        }
        if (b == null) {
            b = new ConcurrentHashMap();
        }
        String c2 = c(i);
        if (ac.a(c2)) {
            com.sankuai.xm.im.utils.a.a("MsgAdditionService", "loadConfig", "no config, %d", Integer.valueOf(i));
            return;
        }
        try {
            Map<Short, a> a2 = a(new JSONArray(c2), i, d(i));
            if (a2 != null) {
                b.put(Integer.valueOf(i), a2);
            }
        } catch (JSONException e) {
            com.sankuai.xm.im.utils.a.d("MsgAdditionService", "loadConfig", e, "json parse fail, %d:%s", Integer.valueOf(i), c2);
        }
    }

    public void a(String str, long j, int... iArr) {
        Object[] objArr = {str, new Long(j), iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "191d3cfc746b9919e8c844cde68ea48b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "191d3cfc746b9919e8c844cde68ea48b");
        } else {
            com.sankuai.xm.network.httpurlconnection.g.a().a((com.sankuai.xm.network.httpurlconnection.e) new com.sankuai.xm.base.d(str, new C1391b(j, iArr)), 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Short, a> a(JSONArray jSONArray, int i, String str) throws JSONException {
        Object[] objArr = {jSONArray, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49dfbab47ec2dba466eb3454b70b5616", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49dfbab47ec2dba466eb3454b70b5616");
        }
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            short optInt = (short) optJSONObject.optInt("channel");
            JSONArray optJSONArray = optJSONObject.optJSONArray(str);
            if (optJSONArray != null && optJSONArray.length() > 0) {
                a aVar = new a(i, optInt);
                aVar.d = new HashMap();
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i3);
                    HashSet hashSet = new HashSet();
                    int optInt2 = optJSONObject2.optInt("type");
                    JSONArray optJSONArray2 = optJSONObject2.optJSONArray("messageTypes");
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                            hashSet.add(Integer.valueOf(optJSONArray2.getInt(i4)));
                        }
                    }
                    aVar.d.put(Short.valueOf((short) optInt2), hashSet);
                }
                hashMap.put(Short.valueOf(optInt), aVar);
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b1efba9c636e41cdd45834b64b04823", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b1efba9c636e41cdd45834b64b04823");
        }
        com.sankuai.xm.base.e a2 = com.sankuai.xm.base.e.a();
        return a2.getString(a("config_" + i), null);
    }

    public void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aadc6484763eda34efb8f039662f28a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aadc6484763eda34efb8f039662f28a");
        } else {
            com.sankuai.xm.base.e.a().a(a("time"), j);
        }
    }

    public String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbd1a7f70e4b425967c9a8b193f8d31e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbd1a7f70e4b425967c9a8b193f8d31e");
        }
        return "addition_last_req_" + str + CommonConstant.Symbol.UNDERLINE + f.m().f();
    }

    private String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6107a9a4d11a75dc29b1ff272c554f51", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6107a9a4d11a75dc29b1ff272c554f51");
        }
        return "addition_last_clean_" + f.m().f();
    }

    private void a(@NonNull List<Long> list, @NonNull Set<Long> set, @NonNull Set<Long> set2) {
        c cVar;
        boolean z;
        int i = 1;
        Object[] objArr = {list, set, set2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf993c4a2930d2f4d293e01345338a29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf993c4a2930d2f4d293e01345338a29");
            return;
        }
        synchronized (this.c) {
            for (Long l : list) {
                if (l.longValue() > 0) {
                    c cVar2 = this.c.get(l);
                    if (cVar2 == null || cVar2.c) {
                        cVar = cVar2;
                    } else {
                        long j = cVar2.b;
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = new Long(j);
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        cVar = cVar2;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d148eb88ba7f7408a815c2559003834", 6917529027641081856L)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d148eb88ba7f7408a815c2559003834")).booleanValue();
                        } else {
                            long a2 = com.sankuai.xm.login.a.a().c().a();
                            z = a2 > 0 && j < a2;
                        }
                        if (z) {
                            set2.add(l);
                            i = 1;
                        }
                    }
                    if (cVar == null) {
                        set.add(l);
                    }
                    i = 1;
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.im.message.api.b$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass4 extends com.sankuai.xm.network.httpurlconnection.d {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ com.sankuai.xm.im.a b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ Collection d;
        public final /* synthetic */ short e;
        public final /* synthetic */ int f;

        public AnonymousClass4(com.sankuai.xm.im.a aVar, Map map, Collection collection, short s, int i) {
            this.b = aVar;
            this.c = map;
            this.d = collection;
            this.e = s;
            this.f = i;
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(JSONObject jSONObject) throws Exception {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9221cd53e9557f676a6a33fe0a8452af", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9221cd53e9557f676a6a33fe0a8452af");
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                com.sankuai.xm.base.callback.a.a(this.b, b.this.a(this.c));
                return;
            }
            final JSONArray optJSONArray = optJSONObject.optJSONArray("additions");
            final long optLong = optJSONObject.optLong("queryTime");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.message.api.b.4.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        com.sankuai.xm.base.proto.addition.a aVar;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d179e103dbe633747d789d151affe058", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d179e103dbe633747d789d151affe058");
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        List<MsgAddition> b = DBProxy.l().p().b(AnonymousClass4.this.d);
                        if (!com.sankuai.xm.base.util.b.a(b)) {
                            for (MsgAddition msgAddition : b) {
                                AnonymousClass4.this.c.put(Long.valueOf(msgAddition.getMsgId()), msgAddition);
                            }
                        }
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            try {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                                long optLong2 = jSONObject2.optLong(MessageStatisticsEntry.PARAM_MSG_ID);
                                if (optLong2 <= 0) {
                                    com.sankuai.xm.im.utils.a.b("MsgAdditionService", "queryFromServer", "msgid < 0, item = %s", jSONObject2);
                                } else {
                                    MsgAddition msgAddition2 = new MsgAddition();
                                    msgAddition2.setSts(jSONObject2.optLong("sts"));
                                    msgAddition2.setSeqId(jSONObject2.optInt("seqId"));
                                    msgAddition2.setMsgId(optLong2);
                                    msgAddition2.setChannel(AnonymousClass4.this.e);
                                    if (msgAddition2.newThan((MsgAddition) AnonymousClass4.this.c.get(Long.valueOf(optLong2)))) {
                                        String optString = jSONObject2.optString("body");
                                        if (!ac.a(optString)) {
                                            AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                            Object[] objArr3 = {optString};
                                            ChangeQuickRedirect changeQuickRedirect3 = AnonymousClass4.a;
                                            MsgAddition msgAddition3 = null;
                                            if (PatchProxy.isSupport(objArr3, anonymousClass4, changeQuickRedirect3, false, "91709d7a4da880e1867096a6543113d3", 6917529027641081856L)) {
                                                msgAddition3 = (MsgAddition) PatchProxy.accessDispatch(objArr3, anonymousClass4, changeQuickRedirect3, false, "91709d7a4da880e1867096a6543113d3");
                                            } else {
                                                byte[] decode = Base64.decode(optString, 2);
                                                if (MessageUtils.isPubService(anonymousClass4.f)) {
                                                    aVar = new com.sankuai.xm.base.proto.addition.d();
                                                    aVar.a(decode);
                                                } else if (MessageUtils.isGroupService(anonymousClass4.f)) {
                                                    aVar = new com.sankuai.xm.base.proto.addition.c();
                                                    aVar.a(decode);
                                                } else if (MessageUtils.isIMPeerService(anonymousClass4.f)) {
                                                    aVar = new com.sankuai.xm.base.proto.addition.b();
                                                    aVar.a(decode);
                                                } else {
                                                    aVar = null;
                                                }
                                                if (aVar != null && !aVar.w()) {
                                                    msgAddition3 = MessageUtils.pAdditionToMsgAddition(aVar);
                                                }
                                            }
                                            if (msgAddition3 == null || !msgAddition3.valid()) {
                                                com.sankuai.xm.im.utils.a.b("MsgAdditionService", "queryFromServer", "addition invalid %s", msgAddition3);
                                            } else {
                                                arrayList.add(msgAddition3);
                                                AnonymousClass4.this.c.put(Long.valueOf(optLong2), msgAddition3);
                                            }
                                        }
                                    }
                                }
                            } catch (JSONException e) {
                                com.sankuai.xm.im.utils.a.a("MsgAdditionService", "queryFromServer", e, "json parse error", new Object[0]);
                            }
                        }
                        DBProxy.l().p().a(arrayList);
                        AnonymousClass4.this.a(AnonymousClass4.this.c, optLong);
                        b.a(b.this, (Collection) arrayList, 2);
                        com.sankuai.xm.base.callback.a.a(AnonymousClass4.this.b, b.this.a(AnonymousClass4.this.c));
                    }
                }), this.b);
                return;
            }
            a(this.c, optLong);
            com.sankuai.xm.base.callback.a.a(this.b, b.this.a(this.c));
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(int i, String str) throws Exception {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1befc28fb1a9f82a8153a9ab9786ae8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1befc28fb1a9f82a8153a9ab9786ae8");
            } else if (!this.c.isEmpty()) {
                com.sankuai.xm.base.callback.a.a(this.b, b.this.a(this.c));
            } else {
                com.sankuai.xm.base.callback.a.a(this.b, i, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Map<Long, MsgAddition> map, long j) {
            Object[] objArr = {map, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b80e85cd58ec495c0682e058affd644", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b80e85cd58ec495c0682e058affd644");
            } else if (map != null && !map.isEmpty()) {
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry<Long, MsgAddition> entry : map.entrySet()) {
                    if (entry.getValue() == null) {
                        MsgAddition msgAddition = new MsgAddition();
                        msgAddition.setChannel(this.e);
                        msgAddition.setMsgId(entry.getKey().longValue());
                        arrayList.add(msgAddition);
                    } else {
                        arrayList.add(entry.getValue());
                    }
                }
                b.a(b.this, arrayList, j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<MsgAddition> a(Map<Long, MsgAddition> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a25ebc896548559a609562850e28435d", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a25ebc896548559a609562850e28435d");
        }
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Long, MsgAddition> entry : map.entrySet()) {
            if (entry.getValue() != null && !entry.getValue().neverChange()) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    private void a(short s, final List<MsgAddition> list, final int i) {
        Object[] objArr = {Short.valueOf(s), list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f32286f55eb3c678b2d31ef3bc3b9654", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f32286f55eb3c678b2d31ef3bc3b9654");
        } else if (com.sankuai.xm.base.util.b.a(list)) {
        } else {
            ((l) m.a(l.class)).b(a.InterfaceC1390a.class).a(s).a(new b.a<a.InterfaceC1390a>() { // from class: com.sankuai.xm.im.message.api.b.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(a.InterfaceC1390a interfaceC1390a) {
                    a.InterfaceC1390a interfaceC1390a2 = interfaceC1390a;
                    Object[] objArr2 = {interfaceC1390a2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec09025d905d590f1554bfa93d3d6104", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec09025d905d590f1554bfa93d3d6104")).booleanValue();
                    }
                    interfaceC1390a2.a(i, list);
                    return false;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class c {
        public long a;
        public long b;
        public boolean c;

        private c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a {
        public static ChangeQuickRedirect a;
        public int b;
        public short c;
        public Map<Short, Set<Integer>> d;

        public a(int i, short s) {
            Object[] objArr = {b.this, Integer.valueOf(i), Short.valueOf(s)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c7443ce2dda78b881fffab4b190ce2f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c7443ce2dda78b881fffab4b190ce2f");
                return;
            }
            this.b = MessageUtils.getServiceForCategory(i);
            this.c = s;
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24f757e088d1c13cf16439391f37b1f4", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24f757e088d1c13cf16439391f37b1f4")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.b == aVar.b && this.c == aVar.c;
            }
            return false;
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa6cc9803a6ebefcc23d547205b2ccb5", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa6cc9803a6ebefcc23d547205b2ccb5")).intValue() : p.a(Integer.valueOf(this.b), Short.valueOf(this.c));
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7e2c2b9dcdacf3c22bdc89f1a6a6fa5", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7e2c2b9dcdacf3c22bdc89f1a6a6fa5");
            }
            return "Config{service=" + this.b + ", channel=" + ((int) this.c) + ", strategies=" + this.d + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.im.message.api.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class C1391b extends com.sankuai.xm.network.httpurlconnection.d {
        public static ChangeQuickRedirect a;
        private long c;
        private int[] d;

        public C1391b(long j, int... iArr) {
            Object[] objArr = {b.this, new Long(j), iArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e208eea82b3a8106359071e01316f65", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e208eea82b3a8106359071e01316f65");
                return;
            }
            this.c = j;
            this.d = iArr;
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(JSONObject jSONObject) throws Exception {
            char c = 1;
            char c2 = 0;
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "029d86c31d6a3b8efeae74a470e77ce4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "029d86c31d6a3b8efeae74a470e77ce4");
                return;
            }
            b.this.b(System.currentTimeMillis());
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            com.sankuai.xm.im.utils.a.a("MsgAdditionService", "ConfigReqCallback.onSuccess", "result=%s", jSONObject);
            int[] iArr = this.d;
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                String a2 = b.a(b.this, i2);
                Object[] objArr2 = new Object[3];
                objArr2[c2] = optJSONArray;
                objArr2[c] = Integer.valueOf(i2);
                objArr2[2] = a2;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15ea60a295d9ecd991f752352f4cf8ff", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15ea60a295d9ecd991f752352f4cf8ff");
                } else {
                    String c3 = b.this.c(i2);
                    if (!(optJSONArray == null && ac.a(c3)) && (optJSONArray == null || !ac.a(c3, optJSONArray.toString()))) {
                        Map a3 = b.this.a(optJSONArray, i2, a2);
                        if (a3 != null) {
                            b.b.put(Integer.valueOf(i2), a3);
                        } else {
                            b.b.remove(Integer.valueOf(i2));
                        }
                        b.a(b.this, optJSONArray, i2);
                    } else {
                        com.sankuai.xm.im.utils.a.a("MsgAdditionService", "requestConfig", "config no change, service=%d", Integer.valueOf(i2));
                    }
                }
                i++;
                c = 1;
                c2 = 0;
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(int i, String str) throws Exception {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d91377570e461e75c0424e11bf07918", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d91377570e461e75c0424e11bf07918");
                return;
            }
            Object[] objArr2 = {this.k, Integer.valueOf(i), str};
            Object[] objArr3 = {"MsgAdditionService", "requestConfig", "url=%s,code=%d,msg=%s", objArr2};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.utils.a.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect2, true, "e9ba04d47d2a63a90d04c29ab56a81be", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect2, true, "e9ba04d47d2a63a90d04c29ab56a81be");
            } else {
                com.sankuai.xm.im.utils.a.d(com.sankuai.xm.log.c.a("MsgAdditionService", "requestConfig", "url=%s,code=%d,msg=%s"), objArr2);
            }
            b.this.b(this.c);
        }
    }
}
