package com.sankuai.xm.im.cache;

import android.database.Cursor;
import android.support.v4.util.LruCache;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.im.cache.bean.DBPubOpposite;
import com.sankuai.xm.im.session.SessionId;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h {
    public static ChangeQuickRedirect a;
    LruCache<String, DBPubOpposite> b;
    final Object c;
    DBProxy d;

    public h(DBProxy dBProxy) {
        Object[] objArr = {dBProxy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "388c9a0029e724485318fbd7bd02eb7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "388c9a0029e724485318fbd7bd02eb7a");
            return;
        }
        this.b = new LruCache<>(100);
        this.c = new Object();
        this.d = dBProxy;
    }

    public final void a(final SessionId sessionId, final Callback<DBPubOpposite> callback) {
        Object[] objArr = {sessionId, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47b424874c6be6af93eeb529939a76c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47b424874c6be6af93eeb529939a76c4");
        } else {
            this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.h.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8254437da018105c939b1993d77e377e", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8254437da018105c939b1993d77e377e");
                        return;
                    }
                    try {
                        callback.onSuccess(h.this.a(sessionId));
                    } catch (Throwable th) {
                        callback.onSuccess(null);
                        throw th;
                    }
                }
            }), callback);
        }
    }

    public final DBPubOpposite a(SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f973851074da15370934f27e829760e3", 6917529027641081856L)) {
            return (DBPubOpposite) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f973851074da15370934f27e829760e3");
        }
        Cursor cursor = null;
        try {
            DBPubOpposite b = b(sessionId);
            if (b != null) {
                return b;
            }
            Cursor a2 = this.d.bR_().a(DBPubOpposite.TABLE_NAME, null, "key=?", new String[]{sessionId.f()}, null, null, null, null);
            if (a2 == null) {
                if (a2 != null) {
                    a2.close();
                }
                return null;
            }
            while (a2.moveToNext()) {
                try {
                    b = (DBPubOpposite) com.sankuai.xm.base.tinyorm.f.a().a(DBPubOpposite.class, a2);
                } catch (Throwable th) {
                    th = th;
                    cursor = a2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            b(b, null);
            if (a2 != null) {
                a2.close();
            }
            return b;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void a(final Long l, int i, final Callback<List<DBPubOpposite>> callback) {
        Object[] objArr = {l, 1000, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8adfb1c2c5561a81097de7d6a47a97ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8adfb1c2c5561a81097de7d6a47a97ae");
        } else {
            this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.h.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9aa11a30c3e51d1a28009294ee5b106", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9aa11a30c3e51d1a28009294ee5b106");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    Cursor cursor = null;
                    try {
                        com.sankuai.xm.base.db.c bR_ = h.this.d.bR_();
                        long currentTimeMillis = System.currentTimeMillis() - l.longValue();
                        if (currentTimeMillis < 0) {
                            currentTimeMillis = 0;
                        }
                        Cursor a2 = bR_.a(DBPubOpposite.TABLE_NAME, null, "sendingTime>?", new String[]{String.valueOf(currentTimeMillis)}, null, null, "sendingTime DESC", String.valueOf(r3));
                        if (a2 != null) {
                            while (a2.moveToNext()) {
                                try {
                                    arrayList.add((DBPubOpposite) com.sankuai.xm.base.tinyorm.f.a().a(DBPubOpposite.class, a2));
                                } catch (Throwable th) {
                                    cursor = a2;
                                    th = th;
                                    callback.onSuccess(arrayList);
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                            h.this.a(arrayList, (String[]) null);
                            callback.onSuccess(arrayList);
                            if (a2 != null) {
                                a2.close();
                                return;
                            }
                            return;
                        }
                        callback.onSuccess(arrayList);
                        if (a2 != null) {
                            a2.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }), callback);
        }
    }

    public final void a(SessionId sessionId, long j) {
        Object[] objArr = {sessionId, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8fbc4e50a0d4c235992dda3c220468b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8fbc4e50a0d4c235992dda3c220468b");
        } else if (sessionId == null) {
        } else {
            DBPubOpposite dBPubOpposite = new DBPubOpposite();
            dBPubOpposite.setKey(sessionId.f());
            dBPubOpposite.setSendingTime(j);
            a(dBPubOpposite, new String[]{DBPubOpposite.SENDING_TIME});
        }
    }

    public final void a(final DBPubOpposite dBPubOpposite, final String[] strArr) {
        Object[] objArr = {dBPubOpposite, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91bcce1f4e65d619c3c3a3e02341e760", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91bcce1f4e65d619c3c3a3e02341e760");
        } else {
            this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.h.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58e63eb4c2f561aa8a8a72430a4a9ce1", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58e63eb4c2f561aa8a8a72430a4a9ce1");
                        return;
                    }
                    com.sankuai.xm.base.tinyorm.f.a().b(h.this.d.bR_(), dBPubOpposite, strArr, null);
                    h.this.b(dBPubOpposite, strArr);
                }
            }), (Callback) null);
        }
    }

    public final void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ee84914d1edec8e5b4d3a1c3efd6569", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ee84914d1edec8e5b4d3a1c3efd6569");
        } else {
            this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.h.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31571be18a86a7e2d2d976d0dc45b04b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31571be18a86a7e2d2d976d0dc45b04b");
                        return;
                    }
                    h.this.d.bR_().a(DBPubOpposite.TABLE_NAME, "key=?", new String[]{str});
                    h hVar = h.this;
                    String str2 = str;
                    Object[] objArr3 = {str2};
                    ChangeQuickRedirect changeQuickRedirect3 = h.a;
                    if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "c0456ed19ba2910d802e768eccc6c4a6", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "c0456ed19ba2910d802e768eccc6c4a6");
                    } else if (TextUtils.isEmpty(str2)) {
                    } else {
                        synchronized (hVar.c) {
                            hVar.b.remove(str2);
                        }
                    }
                }
            }), (Callback) null);
        }
    }

    private DBPubOpposite b(SessionId sessionId) {
        DBPubOpposite dBPubOpposite;
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8537499e468f4a0d4fadcc0385e6ee76", 6917529027641081856L)) {
            return (DBPubOpposite) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8537499e468f4a0d4fadcc0385e6ee76");
        }
        if (sessionId == null) {
            return null;
        }
        synchronized (this.c) {
            dBPubOpposite = this.b.get(sessionId.f());
        }
        return dBPubOpposite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
        r13.b.put(r2.getKey(), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.List<com.sankuai.xm.im.cache.bean.DBPubOpposite> r14, java.lang.String[] r15) {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r14
            r10 = 1
            r8[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.xm.im.cache.h.a
            java.lang.String r12 = "480294a2030be2f780b9e242670076d6"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r2 = r13
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
            return
        L1e:
            boolean r1 = com.sankuai.xm.base.util.b.a(r14)
            if (r1 == 0) goto L25
            return
        L25:
            java.lang.Object r1 = r13.c
            monitor-enter(r1)
            java.util.Iterator r14 = r14.iterator()     // Catch: java.lang.Throwable -> La0
        L2c:
            boolean r2 = r14.hasNext()     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r14.next()     // Catch: java.lang.Throwable -> La0
            com.sankuai.xm.im.cache.bean.DBPubOpposite r2 = (com.sankuai.xm.im.cache.bean.DBPubOpposite) r2     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto L2c
            android.support.v4.util.LruCache<java.lang.String, com.sankuai.xm.im.cache.bean.DBPubOpposite> r3 = r13.b     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = r2.getKey()     // Catch: java.lang.Throwable -> La0
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> La0
            com.sankuai.xm.im.cache.bean.DBPubOpposite r3 = (com.sankuai.xm.im.cache.bean.DBPubOpposite) r3     // Catch: java.lang.Throwable -> La0
            if (r15 == 0) goto L92
            if (r3 != 0) goto L4b
            goto L92
        L4b:
            int r4 = r15.length     // Catch: java.lang.Throwable -> La0
            r5 = 0
        L4d:
            if (r5 >= r4) goto L91
            r6 = r15[r5]     // Catch: java.lang.Throwable -> La0
            java.lang.String r7 = "sendingTime"
            boolean r7 = android.text.TextUtils.equals(r6, r7)     // Catch: java.lang.Throwable -> La0
            if (r7 == 0) goto L61
            long r6 = r2.getSendingTime()     // Catch: java.lang.Throwable -> La0
            r3.setSendingTime(r6)     // Catch: java.lang.Throwable -> La0
            goto L8e
        L61:
            java.lang.String r7 = "sendOppositeTime"
            boolean r7 = android.text.TextUtils.equals(r6, r7)     // Catch: java.lang.Throwable -> La0
            if (r7 == 0) goto L71
            long r6 = r2.getSendOppositeTime()     // Catch: java.lang.Throwable -> La0
            r3.setSendOppositeTime(r6)     // Catch: java.lang.Throwable -> La0
            goto L8e
        L71:
            java.lang.String r7 = "recvOppositeTime"
            boolean r7 = android.text.TextUtils.equals(r6, r7)     // Catch: java.lang.Throwable -> La0
            if (r7 == 0) goto L81
            long r6 = r2.getRecvOppositeTime()     // Catch: java.lang.Throwable -> La0
            r3.setRecvOppositeTime(r6)     // Catch: java.lang.Throwable -> La0
            goto L8e
        L81:
            java.lang.String r7 = "%s::putCache: fail column:%s"
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> La0
            java.lang.String r11 = "PubOppositeDBProxy"
            r8[r9] = r11     // Catch: java.lang.Throwable -> La0
            r8[r10] = r6     // Catch: java.lang.Throwable -> La0
            com.sankuai.xm.im.utils.a.b(r7, r8)     // Catch: java.lang.Throwable -> La0
        L8e:
            int r5 = r5 + 1
            goto L4d
        L91:
            r2 = r3
        L92:
            if (r2 == 0) goto L2c
            android.support.v4.util.LruCache<java.lang.String, com.sankuai.xm.im.cache.bean.DBPubOpposite> r3 = r13.b     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = r2.getKey()     // Catch: java.lang.Throwable -> La0
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> La0
            goto L2c
        L9e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La0
            return
        La0:
            r14 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La0
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.h.a(java.util.List, java.lang.String[]):void");
    }

    void b(DBPubOpposite dBPubOpposite, String[] strArr) {
        Object[] objArr = {dBPubOpposite, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6239730f0262f7520907d0ed49b6f463", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6239730f0262f7520907d0ed49b6f463");
        } else if (dBPubOpposite == null) {
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(dBPubOpposite);
            a(arrayList, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6841fe6ccb07fb944a89adb67305579", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6841fe6ccb07fb944a89adb67305579");
            return;
        }
        synchronized (this.c) {
            this.b.evictAll();
        }
    }
}
