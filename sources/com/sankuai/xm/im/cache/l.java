package com.sankuai.xm.im.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.cache.bean.DBSession;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.session.SessionId;
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
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class l {
    public static ChangeQuickRedirect a;
    final Object b;
    public DBProxy c;
    HashMap<String, DBSession> d;
    AtomicBoolean e;
    private volatile ConcurrentHashMap<Integer, List<CountDownLatch>> f;
    private final Object g;

    public static /* synthetic */ int a(l lVar, com.sankuai.xm.base.db.c cVar, Set set, Set set2, long j) {
        Object[] objArr = {cVar, set, set2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, lVar, changeQuickRedirect, false, "26b7ed3b63e1c747c7c7d2b76c1b6ab5", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, lVar, changeQuickRedirect, false, "26b7ed3b63e1c747c7c7d2b76c1b6ab5")).intValue();
        }
        String str = "";
        if (!com.sankuai.xm.base.util.b.a(set) || !com.sankuai.xm.base.util.b.a(set2)) {
            if (!com.sankuai.xm.base.util.b.a(set2)) {
                str = "category in (" + ac.a(set2, CommonConstant.Symbol.COMMA, false) + CommonConstant.Symbol.BRACKET_RIGHT;
            }
            if (!com.sankuai.xm.base.util.b.a(set)) {
                if (!ac.a(str)) {
                    str = str + " AND ";
                }
                str = str + "channel in (" + ac.a(set, CommonConstant.Symbol.COMMA, false) + CommonConstant.Symbol.BRACKET_RIGHT;
            }
        }
        if (j > 0) {
            if (!ac.a(str)) {
                str = str + " AND ";
            }
            str = str + "sts < " + j;
        }
        return cVar.a(DBSession.TABLE_NAME, str, null);
    }

    public static /* synthetic */ void a(l lVar, long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, lVar, changeQuickRedirect, false, "2f1b36fe5349aa93929621775975f8b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, lVar, changeQuickRedirect, false, "2f1b36fe5349aa93929621775975f8b5");
        } else if (IMClient.a().d() && lVar.c()) {
            synchronized (lVar.b) {
                for (Map.Entry<String, DBSession> entry : lVar.d.entrySet()) {
                    entry.getValue().setMsgSeqid(j);
                }
            }
        }
    }

    public static /* synthetic */ void a(l lVar, short[] sArr, int[] iArr, long j) {
        Object[] objArr = {sArr, iArr, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, lVar, changeQuickRedirect, false, "d5866a374470808fccef42900c12d2cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, lVar, changeQuickRedirect, false, "d5866a374470808fccef42900c12d2cd");
            return;
        }
        synchronized (lVar.b) {
            try {
                if (sArr == null && iArr == null && j <= 0) {
                    lVar.d.clear();
                } else {
                    if (sArr != null) {
                        Arrays.sort(sArr);
                        if (Arrays.binarySearch(sArr, (short) -1) != -1) {
                            sArr = null;
                        }
                    }
                    if (iArr != null) {
                        Arrays.sort(iArr);
                    }
                    if (j <= 0) {
                        j = Long.MAX_VALUE;
                    }
                    Iterator<Map.Entry<String, DBSession>> it = lVar.d.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, DBSession> next = it.next();
                        if (sArr == null || Arrays.binarySearch(sArr, next.getValue().getChannel()) >= 0) {
                            if (iArr == null || Arrays.binarySearch(iArr, next.getValue().getCategory()) >= 0) {
                                if (next.getValue().getSts() < j) {
                                    it.remove();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ boolean a(l lVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, lVar, changeQuickRedirect, false, "36699313f4bac4214b525e193868687b", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, lVar, changeQuickRedirect, false, "36699313f4bac4214b525e193868687b")).booleanValue() : lVar.e.compareAndSet(false, lVar.e.get());
    }

    public l(DBProxy dBProxy) {
        Object[] objArr = {dBProxy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3e91f0f90032603eaf2fa1c9762d41b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3e91f0f90032603eaf2fa1c9762d41b");
            return;
        }
        this.f = new ConcurrentHashMap<>();
        this.g = new Object();
        this.c = dBProxy;
        this.b = new Object();
        this.d = new HashMap<>();
        this.e = new AtomicBoolean(false);
    }

    public final boolean a(com.sankuai.xm.base.db.c cVar) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "694ce79533c14d27fae0bbe0cd4b1803", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "694ce79533c14d27fae0bbe0cd4b1803")).booleanValue();
        }
        if (IMClient.a().d()) {
            if (d()) {
                return true;
            }
            this.c.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.l.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e3549bb2198db58866b69940cf734cf9", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e3549bb2198db58866b69940cf734cf9");
                    } else if (l.a(l.this)) {
                        l.this.b(r2);
                    }
                }
            }));
            return d();
        }
        return false;
    }

    public final void a(final DBSession dBSession, Callback<DBSession> callback) {
        Object[] objArr = {dBSession, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e1b35e87c0999316af78b62eb04278e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e1b35e87c0999316af78b62eb04278e");
        } else if (dBSession == null) {
        } else {
            this.c.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.l.14
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b763332a27339af225e9890d1276a4f0", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b763332a27339af225e9890d1276a4f0");
                        return;
                    }
                    if (l.this.a(l.this.c.bR_(), dBSession)) {
                        if (r3 != null) {
                            r3.onSuccess(dBSession);
                        }
                    } else if (r3 != null) {
                        r3.onFailure(10019, "insert failed.");
                    }
                }
            }), (Callback) null);
        }
    }

    public final void a(long j, Callback<Void> callback) {
        Object[] objArr = {Long.MAX_VALUE, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4722085d90d3fdd5fc509297ea214c3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4722085d90d3fdd5fc509297ea214c3e");
        } else {
            this.c.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.l.15
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3cb3e8e7daf33c681d47012d4dd94f6", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3cb3e8e7daf33c681d47012d4dd94f6");
                        return;
                    }
                    com.sankuai.xm.base.db.c bR_ = l.this.c.bR_();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("seqid", Long.valueOf(r2));
                    bR_.a(DBSession.TABLE_NAME, contentValues, (String) null, (String[]) null);
                    l.a(l.this, r2);
                }
            }), (Callback) null);
        }
    }

    public final void a(com.sankuai.xm.base.db.c cVar, final List<DBSession> list, final Callback<List<DBSession>> callback) {
        Object[] objArr = {null, list, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dee8128db7096eccb15b3d7687d8561", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dee8128db7096eccb15b3d7687d8561");
        } else if (list != null && !list.isEmpty()) {
            this.c.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.l.16
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85e4b1c368a54595ca84032e06643281", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85e4b1c368a54595ca84032e06643281");
                        return;
                    }
                    com.sankuai.xm.base.db.c bR_ = r2 == null ? l.this.c.bR_() : r2;
                    try {
                        l.this.c.a(bR_);
                        for (DBSession dBSession : list) {
                            l.this.a(bR_, dBSession);
                        }
                        l.this.c.b(bR_);
                        l.this.c.c(bR_);
                        if (callback != null) {
                            callback.onSuccess(list);
                        }
                    } catch (Throwable th) {
                        l.this.c.c(bR_);
                        if (callback != null) {
                            callback.onFailure(10019, "数据库操作失败");
                        }
                        throw th;
                    }
                }
            }), callback);
        } else if (callback != null) {
            callback.onSuccess(list);
        }
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [T, java.lang.Object] */
    @NonNull
    public final com.sankuai.xm.base.tinyorm.b<DBSession> a(SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e2392f5da1bcecaa7dc9b431ec138bc", 6917529027641081856L)) {
            return (com.sankuai.xm.base.tinyorm.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e2392f5da1bcecaa7dc9b431ec138bc");
        }
        com.sankuai.xm.base.tinyorm.b<DBSession> bVar = new com.sankuai.xm.base.tinyorm.b<>();
        if (sessionId == null) {
            return bVar;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(sessionId);
        com.sankuai.xm.base.tinyorm.b<List<DBSession>> a2 = a(hashSet);
        bVar.b = a2.b;
        if (!com.sankuai.xm.base.util.b.a(a2.c)) {
            bVar.c = a2.c.get(0);
        }
        return bVar;
    }

    @NonNull
    public final com.sankuai.xm.base.tinyorm.b<List<DBSession>> a(Collection<SessionId> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92ca3beadfb79b678b963574bf8ede7c", 6917529027641081856L)) {
            return (com.sankuai.xm.base.tinyorm.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92ca3beadfb79b678b963574bf8ede7c");
        }
        final com.sankuai.xm.base.tinyorm.b<List<DBSession>> bVar = new com.sankuai.xm.base.tinyorm.b<>();
        if (com.sankuai.xm.base.util.b.a(collection)) {
            return bVar;
        }
        final HashSet hashSet = new HashSet(collection.size());
        for (SessionId sessionId : collection) {
            hashSet.add(sessionId.f());
        }
        this.c.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.l.17
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, T] */
            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74d8c9ac8984fd570609af9aca731f3b", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74d8c9ac8984fd570609af9aca731f3b");
                    return;
                }
                try {
                    com.sankuai.xm.base.db.c bR_ = l.this.c.bR_();
                    j a2 = j.a("key", (Set<String>) hashSet, "in", true);
                    ?? a3 = l.this.a(a2);
                    if (bR_.a(DBSession.TABLE_NAME, a2.a(), null) > 0) {
                        synchronized (l.this.b) {
                            for (String str : hashSet) {
                                l.this.d.remove(str);
                            }
                        }
                        bVar.c = a3;
                    }
                    bVar.b = 0;
                } catch (Throwable th) {
                    bVar.b = 10019;
                    throw th;
                }
            }
        }));
        return bVar;
    }

    public final void a(final String str, final int i, Callback<Void> callback) {
        Object[] objArr = {str, Integer.valueOf(i), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c03ed7bce69e521fc82158f08084b68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c03ed7bce69e521fc82158f08084b68");
        } else if (ac.a(str)) {
        } else {
            this.c.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.l.18
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7c110477a083c7e60683447deb4f0c1", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7c110477a083c7e60683447deb4f0c1");
                        return;
                    }
                    com.sankuai.xm.base.db.c bR_ = l.this.c.bR_();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(Message.MSG_STATUS, Integer.valueOf(i));
                    if (bR_.a(DBSession.TABLE_NAME, contentValues, "key=?", new String[]{str}) <= 0) {
                        if (r4 != null) {
                            r4.onFailure(10019, "db update failed.");
                            return;
                        }
                        return;
                    }
                    synchronized (l.this.b) {
                        DBSession dBSession = l.this.d.get(str);
                        if (dBSession != null) {
                            dBSession.setMsgStatus(i);
                        }
                    }
                    if (r4 != null) {
                        r4.onSuccess(null);
                    }
                }
            }), (Callback) null);
        }
    }

    public final void b(final String str, final int i, Callback<Void> callback) {
        Object[] objArr = {str, Integer.valueOf(i), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4d367715d8b499c4cf10d01c75db7fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4d367715d8b499c4cf10d01c75db7fe");
        } else if (ac.a(str)) {
        } else {
            this.c.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.l.19
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c50135e9e42975cff750c8d51ecdc685", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c50135e9e42975cff750c8d51ecdc685");
                        return;
                    }
                    com.sankuai.xm.base.db.c bR_ = l.this.c.bR_();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(DBSession.UN_READ, Integer.valueOf(i));
                    if (bR_.a(DBSession.TABLE_NAME, contentValues, "key=?", new String[]{str}) <= 0) {
                        if (r4 != null) {
                            r4.onFailure(10019, "db update failed.");
                            return;
                        }
                        return;
                    }
                    synchronized (l.this.b) {
                        DBSession dBSession = l.this.d.get(str);
                        if (dBSession != null) {
                            dBSession.setUnRead(i);
                        }
                    }
                    if (r4 != null) {
                        r4.onSuccess(null);
                    }
                }
            }), (Callback) null);
        }
    }

    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.List, T] */
    public final List<DBSession> a(short[] sArr, int[] iArr, final long j) {
        Object[] objArr = {sArr, iArr, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8acdb4c2dd1783009c0de91a4f2cfb70", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8acdb4c2dd1783009c0de91a4f2cfb70");
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        if (!c()) {
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            if (sArr != null) {
                hashSet.addAll(e.a(sArr));
                hashSet2.addAll(e.a(iArr));
            }
            this.c.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.l.2
                public static ChangeQuickRedirect a;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    T t;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68a42726458814d552043a8b1140e0b3", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68a42726458814d552043a8b1140e0b3");
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(j);
                    j.a("sts", sb.toString(), "<", false);
                    j jVar = (j <= 0 || j == Long.MAX_VALUE) ? null : null;
                    if (!hashSet.isEmpty() || !hashSet2.isEmpty()) {
                        j a2 = j.a("category", (Set<String>) hashSet2, "in", false);
                        j a3 = j.a("channel", (Set<String>) hashSet, "in", false);
                        if (!hashSet.isEmpty()) {
                            if (hashSet2.isEmpty()) {
                                t = l.this.a(a3, jVar);
                            } else {
                                t = l.this.a(a3, a2, jVar);
                            }
                        } else {
                            t = l.this.a(a2, jVar);
                        }
                    } else {
                        t = l.this.a(jVar);
                    }
                    bVar.c = t;
                }
            }));
        } else {
            bVar.c = b(sArr, iArr, j);
        }
        return (List) bVar.c;
    }

    public final DBSession a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d32ec6dd0ec6909baf468699c7ec0e41", 6917529027641081856L)) {
            return (DBSession) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d32ec6dd0ec6909baf468699c7ec0e41");
        }
        if (c()) {
            DBSession dBSession = null;
            synchronized (this.b) {
                long j = 0;
                for (Map.Entry<String, DBSession> entry : this.d.entrySet()) {
                    long cts = entry.getValue().getSts() <= 0 ? entry.getValue().getCts() : entry.getValue().getSts();
                    if (cts > j) {
                        dBSession = entry.getValue();
                        j = cts;
                    }
                }
            }
            return dBSession;
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.c.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.l.3
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r1v3, types: [T, com.sankuai.xm.im.cache.bean.DBSession] */
            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "584d597e208e7825587cef8f29cdc085", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "584d597e208e7825587cef8f29cdc085");
                    return;
                }
                bVar.c = l.this.c(null);
            }
        }));
        return (DBSession) bVar.c;
    }

    public final DBSession a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e68d148d2e90d52de455855ab6ce149", 6917529027641081856L) ? (DBSession) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e68d148d2e90d52de455855ab6ce149") : a(str, true);
    }

    public final void a(final String str, final Callback<DBSession> callback) {
        Object[] objArr = {str, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b4affba5cf88d12bcd73b54b550b466", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b4affba5cf88d12bcd73b54b550b466");
        } else {
            this.c.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.l.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26a7c7839a5b9c74bf7bf5be8fc7bd7d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26a7c7839a5b9c74bf7bf5be8fc7bd7d");
                    } else {
                        callback.onSuccess(l.this.a(str, true));
                    }
                }
            }), callback);
        }
    }

    public final DBSession a(final String str, final boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e30d5cb4016ffddb2b7341dd833215bf", 6917529027641081856L)) {
            return (DBSession) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e30d5cb4016ffddb2b7341dd833215bf");
        }
        if (ac.a(str)) {
            return null;
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.c.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.l.5
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r0v13, types: [T, com.sankuai.xm.im.cache.bean.DBSession] */
            /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v13, types: [T, com.sankuai.xm.im.cache.bean.DBSession] */
            /* JADX WARN: Type inference failed for: r2v4, types: [T, com.sankuai.xm.im.cache.bean.DBSession] */
            @Override // java.lang.Runnable
            public final void run() {
                DBSession dBSession;
                DBSession dBSession2;
                List<DBSession> a2;
                DBSession dBSession3;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00ce6a04cf0a02a54386c5f7831e53c4", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00ce6a04cf0a02a54386c5f7831e53c4");
                    return;
                }
                synchronized (l.this.b) {
                    dBSession = l.this.d.get(str);
                }
                if (dBSession == 0) {
                    if (!z) {
                        if (l.a(l.this)) {
                            if (DBProxy.l().r()) {
                                com.sankuai.xm.im.utils.a.c("SessionDBProxy::getDBSession Async Error, loadCache on UI thread", new Object[0]);
                                return;
                            }
                            l.this.c();
                            synchronized (l.this.b) {
                                dBSession2 = l.this.d.get(str);
                            }
                            bVar.c = dBSession2;
                            return;
                        }
                        return;
                    } else if (l.this.c()) {
                        synchronized (l.this.b) {
                            dBSession3 = l.this.d.get(str);
                        }
                        bVar.c = dBSession3;
                        return;
                    } else {
                        l lVar = l.this;
                        String str2 = str;
                        Object[] objArr3 = {"key", str2, (byte) 1};
                        ChangeQuickRedirect changeQuickRedirect3 = l.a;
                        if (PatchProxy.isSupport(objArr3, lVar, changeQuickRedirect3, false, "3ea9b30847da0c43fe867ac520c7f6be", 6917529027641081856L)) {
                            a2 = (List) PatchProxy.accessDispatch(objArr3, lVar, changeQuickRedirect3, false, "3ea9b30847da0c43fe867ac520c7f6be");
                        } else if (ac.a("key")) {
                            a2 = lVar.a(new j[0]);
                        } else {
                            a2 = ac.a("key", "category") ? lVar.a(j.a("key", e.a(Integer.valueOf(str2).intValue()), "in", false)) : lVar.a(j.a("key", str2, true));
                        }
                        if (a2 == null || a2.isEmpty()) {
                            return;
                        }
                        bVar.c = a2.get(0);
                        return;
                    }
                }
                bVar.c = dBSession;
            }
        }));
        return (DBSession) bVar.c;
    }

    public final List<DBSession> b(Collection<SessionId> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c041a393eb3dacb0a283f190ce042a66", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c041a393eb3dacb0a283f190ce042a66");
        }
        if (collection == null || collection.isEmpty()) {
            return Collections.emptyList();
        }
        final HashSet<String> hashSet = new HashSet(collection.size());
        for (SessionId sessionId : collection) {
            hashSet.add(sessionId.f());
        }
        if (c()) {
            ArrayList arrayList = new ArrayList();
            synchronized (this.b) {
                for (String str : hashSet) {
                    DBSession dBSession = this.d.get(str);
                    if (dBSession != null) {
                        arrayList.add(dBSession);
                    }
                }
            }
            return arrayList;
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.c.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.l.6
            public static ChangeQuickRedirect a;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List, java.util.ArrayList] */
            @Override // java.lang.Runnable
            public final void run() {
                com.sankuai.xm.base.db.c cVar;
                T arrayList2;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b115b5d7dcbb2b8f1a73859645a75e2c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b115b5d7dcbb2b8f1a73859645a75e2c");
                    return;
                }
                try {
                    cVar = l.this.c.bR_();
                    try {
                        l.this.c.a(cVar);
                        com.sankuai.xm.base.tinyorm.b bVar2 = bVar;
                        l lVar = l.this;
                        Set set = hashSet;
                        Object[] objArr3 = {"key", set};
                        ChangeQuickRedirect changeQuickRedirect3 = l.a;
                        if (PatchProxy.isSupport(objArr3, lVar, changeQuickRedirect3, false, "185d77c88396682c9117afa20dd45abd", 6917529027641081856L)) {
                            arrayList2 = (List) PatchProxy.accessDispatch(objArr3, lVar, changeQuickRedirect3, false, "185d77c88396682c9117afa20dd45abd");
                        } else {
                            if (!ac.a("key") && !com.sankuai.xm.base.util.b.a(set)) {
                                arrayList2 = new ArrayList();
                                Iterator it = set.iterator();
                                HashSet hashSet2 = new HashSet();
                                while (it.hasNext()) {
                                    hashSet2.add((String) it.next());
                                    if (hashSet2.size() >= 100 || !it.hasNext()) {
                                        hashSet2.toArray(new String[hashSet2.size()]);
                                        List<DBSession> a2 = lVar.a("key", hashSet2);
                                        if (a2 != null) {
                                            arrayList2.addAll(a2);
                                        }
                                        hashSet2.clear();
                                    }
                                }
                            }
                            arrayList2 = new ArrayList();
                        }
                        bVar2.c = arrayList2;
                        l.this.c.b(cVar);
                        l.this.c.c(cVar);
                    } catch (Throwable th) {
                        th = th;
                        l.this.c.c(cVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cVar = null;
                }
            }
        }));
        return (List) bVar.c;
    }

    public final int a(final short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68560cf2537f9ba64489a2bcb3812ccf", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68560cf2537f9ba64489a2bcb3812ccf")).intValue();
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b(0);
        this.c.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.l.7
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Integer] */
            @Override // java.lang.Runnable
            public final void run() {
                int i = 0;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12ed8d3c2422ac8a08366322325cdb2b", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12ed8d3c2422ac8a08366322325cdb2b");
                } else if (l.this.c()) {
                    synchronized (l.this.b) {
                        for (Map.Entry<String, DBSession> entry : l.this.d.entrySet()) {
                            DBSession value = entry.getValue();
                            if (s == -1 || s == value.getChannel()) {
                                i += entry.getValue().getUnRead();
                            }
                        }
                    }
                    bVar.c = Integer.valueOf(i);
                } else {
                    bVar.c = Integer.valueOf(l.this.b(s != -1 ? "channel=" + ((int) s) : null));
                }
            }
        }));
        return ((Integer) bVar.c).intValue();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e990b1e797dfbc63edf09492f24eeb40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e990b1e797dfbc63edf09492f24eeb40");
        } else {
            this.c.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.l.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "acc50c0cf49cd0b46a39078bbd8fbe4c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "acc50c0cf49cd0b46a39078bbd8fbe4c");
                        return;
                    }
                    l.this.e.set(false);
                    l.a(l.this, l.this.c.bR_(), (Set) null, (Set) null, 0L);
                    l.a(l.this, null, null, 0L);
                }
            }), true, (Callback) null);
        }
    }

    public final List<DBSession> a(final long j, boolean z, int[] iArr) {
        Object[] objArr = {new Long(j), (byte) 1, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9a476968a6ec4d926d01776a821de09", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9a476968a6ec4d926d01776a821de09");
        }
        final HashSet hashSet = new HashSet();
        final StringBuilder sb = new StringBuilder();
        if (iArr != null && iArr.length > 0) {
            for (int i = 0; i < iArr.length; i++) {
                int i2 = iArr[i];
                hashSet.add(Integer.valueOf(i2));
                sb.append(i2);
                if (i < iArr.length - 1) {
                    sb.append(CommonConstant.Symbol.COMMA);
                }
            }
        }
        if (c()) {
            ArrayList arrayList = new ArrayList();
            synchronized (this.b) {
                for (Map.Entry<String, DBSession> entry : this.d.entrySet()) {
                    DBSession value = entry.getValue();
                    if (hashSet.contains(Integer.valueOf(value.getCategory())) || hashSet.isEmpty()) {
                        if (value.getSts() <= j && value.getUnRead() > 0) {
                            arrayList.add(value);
                        }
                    }
                }
            }
            return arrayList;
        }
        com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.c.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.l.12
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                String str;
                Cursor cursor;
                Throwable th;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49de50bae07c438a5f9dfb7bf3e4631e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49de50bae07c438a5f9dfb7bf3e4631e");
                    return;
                }
                String str2 = r2 ? "<=" : ">=";
                if (hashSet.isEmpty()) {
                    str = "";
                } else {
                    str = " AND category in (" + sb.toString() + CommonConstant.Symbol.BRACKET_RIGHT;
                }
                try {
                    cursor = l.this.c.bR_().a(DBSession.TABLE_NAME, null, "sts" + str2 + j + " AND unread>0" + str, null, null, null, null);
                    if (cursor != null) {
                        try {
                            if (cursor.getCount() > 0) {
                                ArrayList arrayList2 = new ArrayList();
                                while (cursor.moveToNext()) {
                                    arrayList2.add((DBSession) com.sankuai.xm.base.tinyorm.f.a().a(DBSession.class, cursor));
                                }
                                com.sankuai.xm.base.util.m.a(cursor);
                                return;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            com.sankuai.xm.base.util.m.a(cursor);
                            throw th;
                        }
                    }
                    com.sankuai.xm.base.util.m.a(cursor);
                } catch (Throwable th3) {
                    cursor = null;
                    th = th3;
                }
            }
        }));
        return (List) bVar.c;
    }

    private List<DBSession> b(short[] sArr, int[] iArr, long j) {
        Object[] objArr = {sArr, iArr, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84efd4448debcf705b382d3c450b9e60", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84efd4448debcf705b382d3c450b9e60");
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.b) {
            try {
                if (sArr == null && iArr == null && (j <= 0 || j == Long.MAX_VALUE)) {
                    arrayList.addAll(this.d.values());
                } else {
                    if (sArr != null) {
                        Arrays.sort(sArr);
                        if (Arrays.binarySearch(sArr, (short) -1) != -1) {
                            sArr = null;
                        }
                    }
                    if (iArr != null) {
                        Arrays.sort(iArr);
                    }
                    if (j <= 0) {
                        j = Long.MAX_VALUE;
                    }
                    for (Map.Entry<String, DBSession> entry : this.d.entrySet()) {
                        if (sArr == null || Arrays.binarySearch(sArr, entry.getValue().getChannel()) >= 0) {
                            if (iArr == null || Arrays.binarySearch(iArr, entry.getValue().getCategory()) >= 0) {
                                if (entry.getValue().getSts() < j) {
                                    arrayList.add(entry.getValue());
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    boolean a(com.sankuai.xm.base.db.c cVar, DBSession dBSession) {
        Object[] objArr = {cVar, dBSession};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b21498a12de696ff9b70ede75c6029d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b21498a12de696ff9b70ede75c6029d")).booleanValue();
        }
        if (dBSession == null || com.sankuai.xm.base.tinyorm.f.a().a(cVar, dBSession) == -1) {
            return false;
        }
        Object[] objArr2 = {dBSession};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c0f0214eebff91dc09eb3ed73493e687", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c0f0214eebff91dc09eb3ed73493e687");
        } else if (dBSession != null && IMClient.a().d() && c()) {
            synchronized (this.b) {
                this.d.put(dBSession.getKey(), dBSession);
            }
        }
        return true;
    }

    boolean b(com.sankuai.xm.base.db.c cVar) {
        Cursor cursor;
        com.sankuai.xm.base.db.c bR_;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dadde72dd69ed33f4d56ea24462f91a5", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dadde72dd69ed33f4d56ea24462f91a5")).booleanValue();
        }
        Cursor cursor2 = null;
        try {
            if (cVar == null) {
                try {
                    bR_ = this.c.bR_();
                } catch (Exception e) {
                    e = e;
                    this.e.getAndSet(false);
                    com.sankuai.xm.im.utils.a.a(e, "SessionDBProxy::loadOnQueue = > exception", new Object[0]);
                    this.c.a("SessionDBProxy.loadOnQueue", e.toString());
                    throw new com.sankuai.xm.base.db.f(e);
                }
            } else {
                bR_ = cVar;
            }
            if (bR_ != null) {
                this.e.getAndSet(false);
                long currentTimeMillis = System.currentTimeMillis();
                cursor = bR_.a(DBSession.TABLE_NAME, null, null, null, null, null, "sts desc", null);
                if (cursor != null) {
                    try {
                        int count = cursor.getCount();
                        if (count > 0) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            com.sankuai.xm.im.utils.a.b("SessionDBProxy::loadOnQueue SessionDBLoad start. should load : " + count, new Object[0]);
                            HashMap hashMap = new HashMap();
                            while (cursor.moveToNext()) {
                                DBSession dBSession = (DBSession) com.sankuai.xm.base.tinyorm.f.a().a(DBSession.class, cursor);
                                if (dBSession != null) {
                                    hashMap.put(dBSession.getKey(), dBSession);
                                    if (hashMap.size() >= 100) {
                                        synchronized (this.b) {
                                            this.d.putAll(hashMap);
                                        }
                                        hashMap.clear();
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            synchronized (this.b) {
                                this.d.putAll(hashMap);
                            }
                            com.sankuai.xm.im.utils.a.b("SessionDBProxy::loadOnQueue SessionDBLoad done cursor count time %d, time %d ms, size = %d.", Long.valueOf(currentTimeMillis2 - currentTimeMillis), Long.valueOf(System.currentTimeMillis() - currentTimeMillis2), Integer.valueOf(this.d.size()));
                            this.e.getAndSet(true);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        this.e.getAndSet(false);
                        com.sankuai.xm.im.utils.a.a(e, "SessionDBProxy::loadOnQueue = > exception", new Object[0]);
                        this.c.a("SessionDBProxy.loadOnQueue", e.toString());
                        throw new com.sankuai.xm.base.db.f(e);
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                cursor2 = cursor;
            }
            if (cursor2 != null) {
                cursor2.close();
            }
            return d();
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    List<DBSession> a(j... jVarArr) {
        Object[] objArr = {jVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77441ada7e05c0c9227807764ba91cd8", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77441ada7e05c0c9227807764ba91cd8");
        }
        Cursor cursor = null;
        try {
            com.sankuai.xm.base.db.c bR_ = this.c.bR_();
            if (bR_ == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            if (!com.sankuai.xm.base.util.b.b(jVarArr)) {
                for (j jVar : jVarArr) {
                    if (jVar != null) {
                        String a2 = jVar.a();
                        if (!ac.a(a2)) {
                            if (!sb.toString().isEmpty()) {
                                sb.append(" AND ");
                            }
                            sb.append(a2);
                        }
                    }
                }
            }
            com.sankuai.xm.im.utils.a.a("getListConditionsOnQueue, where sql:%s", sb);
            Cursor a3 = bR_.a(DBSession.TABLE_NAME, null, sb.toString(), null, null, null, null);
            if (a3 != null) {
                try {
                    if (a3.getCount() > 0) {
                        ArrayList arrayList = new ArrayList();
                        while (a3.moveToNext()) {
                            DBSession dBSession = (DBSession) com.sankuai.xm.base.tinyorm.f.a().a(DBSession.class, a3);
                            if (dBSession != null) {
                                arrayList.add(dBSession);
                            }
                        }
                        if (a3 != null) {
                            a3.close();
                        }
                        return arrayList;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = a3;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (a3 != null) {
                a3.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    List<DBSession> a(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c548dcc101d05865cb1f51317329656", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c548dcc101d05865cb1f51317329656");
        }
        Cursor cursor = null;
        try {
            com.sankuai.xm.base.db.c bR_ = this.c.bR_();
            if (bR_ != null && !ac.a(str) && !com.sankuai.xm.base.util.b.a(set)) {
                Cursor a2 = bR_.a("select * from session where " + (str + " in (" + ac.a(set, CommonConstant.Symbol.COMMA, true) + CommonConstant.Symbol.BRACKET_RIGHT), null);
                if (a2 != null) {
                    try {
                        if (a2.getCount() > 0) {
                            ArrayList arrayList = new ArrayList();
                            while (a2.moveToNext()) {
                                DBSession dBSession = (DBSession) com.sankuai.xm.base.tinyorm.f.a().a(DBSession.class, a2);
                                if (dBSession != null) {
                                    arrayList.add(dBSession);
                                }
                            }
                            if (a2 != null) {
                                a2.close();
                            }
                            return arrayList;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = a2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                if (a2 != null) {
                    a2.close();
                }
                return arrayList2;
            }
            return new ArrayList();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5067e5a27a9b99f9b25887fc312b2a7", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5067e5a27a9b99f9b25887fc312b2a7")).intValue();
        }
        Cursor cursor = null;
        try {
            com.sankuai.xm.base.db.c bR_ = this.c.bR_();
            String str2 = "select sum(unread) from session";
            if (!ac.a(str)) {
                str2 = "select sum(unread) from session where " + str;
            }
            Cursor a2 = bR_.a(str2, null);
            if (a2 != null) {
                try {
                    if (a2.getCount() > 0) {
                        a2.moveToFirst();
                        int i = a2.getInt(0);
                        if (a2 != null) {
                            a2.close();
                        }
                        return i;
                    }
                } catch (Throwable th) {
                    cursor = a2;
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (a2 != null) {
                a2.close();
            }
            return 0;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public DBSession c(com.sankuai.xm.base.db.c cVar) {
        Throwable th;
        Cursor cursor;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d84b0a63b03e7720b33242d3a0c0b559", 6917529027641081856L)) {
            return (DBSession) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d84b0a63b03e7720b33242d3a0c0b559");
        }
        if (cVar == null) {
            try {
                cVar = this.c.bR_();
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                throw th;
            }
        }
        cursor = cVar.a(DBSession.TABLE_NAME, null, null, null, null, null, "sts desc");
        if (cursor != null) {
            try {
                if (cursor.getCount() > 0) {
                    cursor.moveToNext();
                    DBSession dBSession = (DBSession) com.sankuai.xm.base.tinyorm.f.a().a(DBSession.class, cursor);
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    return dBSession;
                }
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0113, code lost:
        if (r2.isClosed() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0115, code lost:
        r2.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.util.List<com.sankuai.xm.im.cache.bean.DBSession> a(int r13) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.l.a(int):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0177 A[Catch: all -> 0x0183, TryCatch #4 {all -> 0x0183, blocks: (B:30:0x015e, B:32:0x0164, B:39:0x0177, B:45:0x0187, B:53:0x019b), top: B:104:0x015e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019b A[Catch: all -> 0x0183, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0183, blocks: (B:30:0x015e, B:32:0x0164, B:39:0x0177, B:45:0x0187, B:53:0x019b), top: B:104:0x015e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.sankuai.xm.im.cache.bean.DBSession> a(long r22, int r24, java.util.List<java.lang.Integer> r25, boolean r26, java.lang.Short... r27) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.l.a(long, int, java.util.List, boolean, java.lang.Short[]):java.util.List");
    }

    boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "378c686b1d5915a2781af8468a4c0ac9", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "378c686b1d5915a2781af8468a4c0ac9")).booleanValue() : a((com.sankuai.xm.base.db.c) null);
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dea8051b7354071ea81a118f99859f55", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dea8051b7354071ea81a118f99859f55")).booleanValue() : this.e.compareAndSet(true, this.e.get());
    }

    public final long a(boolean z, final int... iArr) {
        long j;
        Object[] objArr = {(byte) 1, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5648eeb146c460d57793d4e0ee568cd2", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5648eeb146c460d57793d4e0ee568cd2")).longValue();
        }
        if (c()) {
            synchronized (this.b) {
                j = 0;
                for (Map.Entry<String, DBSession> entry : this.d.entrySet()) {
                    DBSession value = entry.getValue();
                    int length = iArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            int i2 = iArr[i];
                            if (value.getMsgId() > 0 && value.getCategory() == i2 && value.getSts() > j) {
                                j = value.getSts();
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return j;
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.c.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.l.13
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Long] */
            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "627fbc3bbf58533d11343a0ac893675a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "627fbc3bbf58533d11343a0ac893675a");
                    return;
                }
                bVar.c = Long.valueOf(l.this.b(r3, iArr));
            }
        }));
        return ((Long) bVar.c).longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
        r2 = r0.getSts();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    long b(boolean r21, int... r22) {
        /*
            r20 = this;
            r8 = r20
            r0 = r22
            r1 = 2
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r21)
            r10 = 0
            r9[r10] = r1
            r1 = 1
            r9[r1] = r0
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.xm.im.cache.l.a
            java.lang.String r12 = "cf887a1bc7d86300664bb6585620cfb2"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r9
            r2 = r20
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2e
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r8, r11, r10, r12)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L2e:
            r1 = 0
            com.sankuai.xm.im.cache.DBProxy r2 = r8.c     // Catch: java.lang.Throwable -> Lbc
            com.sankuai.xm.base.db.c r11 = r2.bR_()     // Catch: java.lang.Throwable -> Lbc
            r2 = 0
            if (r11 != 0) goto L3a
            return r2
        L3a:
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lbc
            int r5 = r0.length     // Catch: java.lang.Throwable -> Lbc
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lbc
            int r5 = r0.length     // Catch: java.lang.Throwable -> Lbc
            r6 = 0
        L42:
            if (r6 >= r5) goto L58
            r7 = r0[r6]     // Catch: java.lang.Throwable -> Lbc
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbc
            r9.<init>()     // Catch: java.lang.Throwable -> Lbc
            r9.append(r7)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> Lbc
            r4.add(r7)     // Catch: java.lang.Throwable -> Lbc
            int r6 = r6 + 1
            goto L42
        L58:
            java.lang.String r0 = "category"
            com.sankuai.xm.im.cache.j r0 = com.sankuai.xm.im.cache.j.a(r0, r4, r10)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = r0.a()     // Catch: java.lang.Throwable -> Lbc
            boolean r4 = com.sankuai.xm.base.util.ac.a(r0)     // Catch: java.lang.Throwable -> Lbc
            if (r4 != 0) goto L7b
            if (r21 == 0) goto L7b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbc
            r4.<init>()     // Catch: java.lang.Throwable -> Lbc
            r4.append(r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = " AND msgId > 0"
            r4.append(r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Lbc
        L7b:
            r14 = r0
            java.lang.String r12 = "session"
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            java.lang.String r18 = "sts desc"
            java.lang.String r19 = "1"
            android.database.Cursor r4 = r11.a(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> Lbc
            if (r4 == 0) goto Lb6
            int r0 = r4.getCount()     // Catch: java.lang.Throwable -> Lb3
            if (r0 > 0) goto L95
            goto Lb6
        L95:
            boolean r0 = r4.moveToNext()     // Catch: java.lang.Throwable -> Lb3
            if (r0 == 0) goto Lad
            com.sankuai.xm.base.tinyorm.f r0 = com.sankuai.xm.base.tinyorm.f.a()     // Catch: java.lang.Throwable -> Lb3
            java.lang.Class<com.sankuai.xm.im.cache.bean.DBSession> r1 = com.sankuai.xm.im.cache.bean.DBSession.class
            java.lang.Object r0 = r0.a(r1, r4)     // Catch: java.lang.Throwable -> Lb3
            com.sankuai.xm.im.cache.bean.DBSession r0 = (com.sankuai.xm.im.cache.bean.DBSession) r0     // Catch: java.lang.Throwable -> Lb3
            if (r0 == 0) goto L95
            long r2 = r0.getSts()     // Catch: java.lang.Throwable -> Lb3
        Lad:
            if (r4 == 0) goto Lb2
            r4.close()
        Lb2:
            return r2
        Lb3:
            r0 = move-exception
            r1 = r4
            goto Lbd
        Lb6:
            if (r4 == 0) goto Lbb
            r4.close()
        Lbb:
            return r2
        Lbc:
            r0 = move-exception
        Lbd:
            if (r1 == 0) goto Lc2
            r1.close()
        Lc2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.l.b(boolean, int[]):long");
    }
}
