package com.sankuai.xm.im.cache;

import android.database.Cursor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.cache.bean.DBSyncRead;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class n {
    public static ChangeQuickRedirect a;
    final Object b;
    public DBProxy c;
    HashMap<String, DBSyncRead> d;
    AtomicBoolean e;

    public n(DBProxy dBProxy) {
        Object[] objArr = {dBProxy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14ecc0290fe30d041337c695230157d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14ecc0290fe30d041337c695230157d9");
            return;
        }
        this.b = new Object();
        this.d = new HashMap<>();
        this.e = new AtomicBoolean(false);
        this.c = dBProxy;
    }

    public final boolean a(final com.sankuai.xm.base.db.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc227b7386a6fd14057ec13074db380e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc227b7386a6fd14057ec13074db380e")).booleanValue();
        }
        if (IMClient.a().d()) {
            if (this.e.get()) {
                return true;
            }
            this.c.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.n.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r19 = this;
                        r8 = r19
                        r0 = 0
                        java.lang.Object[] r9 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.xm.im.cache.n.AnonymousClass1.a
                        java.lang.String r11 = "a1669068e51a79071bdd835a821a2c03"
                        r4 = 0
                        r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
                        r1 = r9
                        r2 = r19
                        r3 = r10
                        r5 = r11
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                        if (r1 == 0) goto L1b
                        com.meituan.robust.PatchProxy.accessDispatch(r9, r8, r10, r0, r11)
                        return
                    L1b:
                        com.sankuai.xm.im.cache.n r1 = com.sankuai.xm.im.cache.n.this
                        com.sankuai.xm.base.db.c r2 = r2
                        r3 = 1
                        java.lang.Object[] r4 = new java.lang.Object[r3]
                        r4[r0] = r2
                        com.meituan.robust.ChangeQuickRedirect r5 = com.sankuai.xm.im.cache.n.a
                        java.lang.String r6 = "e7fb5536e60c9c3418ca932718d038a6"
                        r15 = 0
                        r17 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
                        r12 = r4
                        r13 = r1
                        r14 = r5
                        r16 = r6
                        boolean r7 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17)
                        if (r7 == 0) goto L3a
                        com.meituan.robust.PatchProxy.accessDispatch(r4, r1, r5, r0, r6)
                        return
                    L3a:
                        long r4 = java.lang.System.currentTimeMillis()
                        java.util.concurrent.atomic.AtomicBoolean r6 = r1.e
                        r6.set(r0)
                        r6 = -1
                        r7 = 0
                        if (r2 != 0) goto L52
                        com.sankuai.xm.im.cache.DBProxy r0 = r1.c     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
                        com.sankuai.xm.base.db.c r2 = r0.bR_()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
                        goto L52
                    L4e:
                        r0 = move-exception
                        goto L9b
                    L50:
                        r0 = move-exception
                        goto L8a
                    L52:
                        r9 = r2
                        if (r9 == 0) goto L6f
                        java.lang.String r10 = "msg_sync_read"
                        r11 = 0
                        r12 = 0
                        r13 = 0
                        r14 = 0
                        r15 = 0
                        r16 = 0
                        r17 = 0
                        android.database.Cursor r2 = r9.a(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
                        r1.a(r2, r7, r3)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
                        r7 = r2
                        goto L6f
                    L69:
                        r0 = move-exception
                        r7 = r2
                        goto L9b
                    L6c:
                        r0 = move-exception
                        r7 = r2
                        goto L8a
                    L6f:
                        java.util.concurrent.atomic.AtomicBoolean r0 = r1.e     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
                        r0.set(r3)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
                        if (r7 == 0) goto L79
                        r7.close()
                    L79:
                        java.lang.String r0 = "SyncReadDBProxyLoad"
                        long r2 = java.lang.System.currentTimeMillis()
                        long r2 = r2 - r4
                        java.util.HashMap<java.lang.String, com.sankuai.xm.im.cache.bean.DBSyncRead> r1 = r1.d
                        int r1 = r1.size()
                        com.sankuai.xm.im.cache.c.a(r0, r2, r1, r6)
                        return
                    L8a:
                        com.sankuai.xm.im.cache.DBProxy r2 = r1.c     // Catch: java.lang.Throwable -> L4e
                        java.lang.String r3 = "SyncReadDBProxy:loadOnQueue"
                        java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L4e
                        r2.a(r3, r9)     // Catch: java.lang.Throwable -> L4e
                        com.sankuai.xm.base.db.f r2 = new com.sankuai.xm.base.db.f     // Catch: java.lang.Throwable -> L4e
                        r2.<init>(r0)     // Catch: java.lang.Throwable -> L4e
                        throw r2     // Catch: java.lang.Throwable -> L4e
                    L9b:
                        if (r7 == 0) goto La0
                        r7.close()
                    La0:
                        long r2 = java.lang.System.currentTimeMillis()
                        long r2 = r2 - r4
                        java.util.HashMap<java.lang.String, com.sankuai.xm.im.cache.bean.DBSyncRead> r1 = r1.d
                        int r1 = r1.size()
                        java.lang.String r4 = "SyncReadDBProxyLoad"
                        com.sankuai.xm.im.cache.c.a(r4, r2, r1, r6)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.n.AnonymousClass1.run():void");
                }
            }), true, (Callback) null);
            return this.e.get();
        }
        return false;
    }

    public final HashMap<String, DBSyncRead> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ed554712c83337bdeb2e127a57ad3ef", 6917529027641081856L)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ed554712c83337bdeb2e127a57ad3ef");
        }
        a((com.sankuai.xm.base.db.c) null);
        HashMap<String, DBSyncRead> hashMap = new HashMap<>();
        synchronized (this.b) {
            hashMap.putAll(this.d);
        }
        return hashMap;
    }

    public final DBSyncRead a(final String str) {
        DBSyncRead dBSyncRead;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91a471b19d3bf8dfb753858a3f72504f", 6917529027641081856L)) {
            return (DBSyncRead) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91a471b19d3bf8dfb753858a3f72504f");
        }
        if (a((com.sankuai.xm.base.db.c) null)) {
            synchronized (this.b) {
                dBSyncRead = this.d.containsKey(str) ? this.d.get(str) : null;
            }
            return dBSyncRead;
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.c.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.n.2
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e65bd90e30736b2055537021f3208a3", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e65bd90e30736b2055537021f3208a3");
                    return;
                }
                List<DBSyncRead> a2 = n.this.a("chat_key=?", new String[]{str}, (com.sankuai.xm.base.db.c) null);
                if (a2 == null || a2.isEmpty()) {
                    return;
                }
                bVar.c = a2.get(0);
            }
        }));
        return (DBSyncRead) bVar.c;
    }

    public final List<DBSyncRead> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d29ab4dbc224b8a409c2d045b6100574", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d29ab4dbc224b8a409c2d045b6100574");
        }
        ArrayList arrayList = new ArrayList();
        if (a((com.sankuai.xm.base.db.c) null)) {
            synchronized (this.b) {
                for (Map.Entry<String, DBSyncRead> entry : this.d.entrySet()) {
                    DBSyncRead value = entry.getValue();
                    if (value != null && value.getUpdateStamp() < 1) {
                        arrayList.add(value);
                    }
                }
            }
            return arrayList;
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.c.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.n.3
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, T] */
            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69f98098f7b1421e87ee579ae004c435", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69f98098f7b1421e87ee579ae004c435");
                    return;
                }
                bVar.c = n.this.a("uts<?", new String[]{"1"}, (com.sankuai.xm.base.db.c) null);
            }
        }));
        return (List) bVar.c;
    }

    public final Map<String, DBSyncRead> a(final Collection<String> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b04643921460fd10a9d1a0f2b5bb95d8", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b04643921460fd10a9d1a0f2b5bb95d8");
        }
        if (com.sankuai.xm.base.util.b.a(collection)) {
            return null;
        }
        if (a((com.sankuai.xm.base.db.c) null)) {
            HashMap hashMap = new HashMap();
            synchronized (this.b) {
                for (String str : collection) {
                    DBSyncRead dBSyncRead = this.d.get(str);
                    if (dBSyncRead != null) {
                        hashMap.put(str, dBSyncRead);
                    }
                }
            }
            return hashMap;
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.c.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.n.4
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.Map] */
            /* JADX WARN: Type inference failed for: r0v6, types: [T, java.util.HashMap] */
            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72217a47cd91976f7fe6f648a1a27e2f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72217a47cd91976f7fe6f648a1a27e2f");
                } else if (collection.size() > 100) {
                    ?? hashMap2 = new HashMap();
                    Iterator it = collection.iterator();
                    ArrayList arrayList = new ArrayList();
                    while (it.hasNext()) {
                        arrayList.add((String) it.next());
                        if (arrayList.size() >= 100 || !it.hasNext()) {
                            Map<String, DBSyncRead> c = n.this.c("chat_key in (" + ac.a(arrayList, CommonConstant.Symbol.COMMA, true) + CommonConstant.Symbol.BRACKET_RIGHT);
                            if (c != null) {
                                hashMap2.putAll(c);
                            }
                            arrayList.clear();
                        }
                    }
                    bVar.c = hashMap2;
                } else {
                    bVar.c = n.this.c("chat_key in (" + ac.a(collection, CommonConstant.Symbol.COMMA, true) + CommonConstant.Symbol.BRACKET_RIGHT);
                }
            }
        }));
        return (Map) bVar.c;
    }

    public final void a(com.sankuai.xm.base.db.c cVar, List<DBSyncRead> list, final Callback<List<DBSyncRead>> callback) {
        Object[] objArr = {null, list, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f9643febd236a78b695a4754c4ee303", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f9643febd236a78b695a4754c4ee303");
        } else if (!list.isEmpty()) {
            final ArrayList arrayList = new ArrayList(list);
            this.c.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.n.5
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x0117  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 307
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.n.AnonymousClass5.run():void");
                }
            }), callback);
        } else if (callback != null) {
            callback.onSuccess(null);
        }
    }

    public final void b(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0edb67d69b49ee296d8a9e914578ac24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0edb67d69b49ee296d8a9e914578ac24");
        } else {
            this.c.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.n.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40964eccae2495f247f708248629882a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40964eccae2495f247f708248629882a");
                        return;
                    }
                    n.this.c.bR_().a(DBSyncRead.TABLE_NAME, "chat_key=?", new String[]{str});
                    synchronized (n.this.b) {
                        n.this.d.remove(str);
                    }
                }
            }), (Callback) null);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.im.cache.n$8  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass8 implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ com.sankuai.xm.base.db.c b;

        public AnonymousClass8(com.sankuai.xm.base.db.c cVar) {
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aa212224dbbe46b55b055bfb60dc2fa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aa212224dbbe46b55b055bfb60dc2fa");
                return;
            }
            n.this.e.set(false);
            (this.b == null ? n.this.c.bR_() : this.b).a(DBSyncRead.TABLE_NAME, null, null);
            synchronized (n.this.b) {
                n.this.d.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.util.List<com.sankuai.xm.im.cache.bean.DBSyncRead> a(java.lang.String r21, java.lang.String[] r22, com.sankuai.xm.base.db.c r23) {
        /*
            r20 = this;
            r8 = r20
            r1 = 3
            java.lang.Object[] r9 = new java.lang.Object[r1]
            r10 = 0
            r9[r10] = r21
            r1 = 1
            r9[r1] = r22
            r1 = 2
            r9[r1] = r23
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.xm.im.cache.n.a
            java.lang.String r12 = "913fe6e508b1ac78f00457d85209ea89"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r9
            r2 = r20
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L27
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r8, r11, r10, r12)
            java.util.List r0 = (java.util.List) r0
            return r0
        L27:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r2 = 0
            if (r23 != 0) goto L3b
            com.sankuai.xm.im.cache.DBProxy r0 = r8.c     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            com.sankuai.xm.base.db.c r0 = r0.bR_()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            r11 = r0
            goto L3d
        L37:
            r0 = move-exception
            goto L6d
        L39:
            r0 = move-exception
            goto L5c
        L3b:
            r11 = r23
        L3d:
            if (r11 == 0) goto L73
            java.lang.String r12 = "msg_sync_read"
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r14 = r21
            r15 = r22
            android.database.Cursor r3 = r11.a(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            r8.a(r3, r1, r10)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5a
            r2 = r3
            goto L73
        L57:
            r0 = move-exception
            r2 = r3
            goto L6d
        L5a:
            r0 = move-exception
            r2 = r3
        L5c:
            com.sankuai.xm.im.cache.DBProxy r1 = r8.c     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = "SyncReadDBProxy:load"
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L37
            r1.a(r3, r4)     // Catch: java.lang.Throwable -> L37
            com.sankuai.xm.base.db.f r1 = new com.sankuai.xm.base.db.f     // Catch: java.lang.Throwable -> L37
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L37
            throw r1     // Catch: java.lang.Throwable -> L37
        L6d:
            if (r2 == 0) goto L72
            r2.close()
        L72:
            throw r0
        L73:
            if (r2 == 0) goto L78
            r2.close()
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.n.a(java.lang.String, java.lang.String[], com.sankuai.xm.base.db.c):java.util.List");
    }

    Map<String, DBSyncRead> c(String str) {
        Cursor cursor;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "123bb9bff94673478681f4911936a85c", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "123bb9bff94673478681f4911936a85c");
        }
        Cursor cursor2 = null;
        if (ac.a(str)) {
            return null;
        }
        try {
            try {
                com.sankuai.xm.base.db.c bR_ = this.c.bR_();
                if (bR_ != null) {
                    cursor = bR_.a("select * from msg_sync_read where " + str, null);
                    try {
                        ArrayList arrayList = new ArrayList();
                        a(cursor, (List<DBSyncRead>) arrayList, false);
                        if (!arrayList.isEmpty()) {
                            HashMap hashMap = new HashMap();
                            for (DBSyncRead dBSyncRead : arrayList) {
                                hashMap.put(dBSyncRead.getChatKey(), dBSyncRead);
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return hashMap;
                        }
                    } catch (Exception e) {
                        e = e;
                        cursor2 = cursor;
                        this.c.a("SyncReadDBProxy:load", e.toString());
                        throw new com.sankuai.xm.base.db.f(e);
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                } else {
                    cursor = null;
                }
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    void a(Cursor cursor, List<DBSyncRead> list, boolean z) {
        Object[] objArr = {cursor, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6b5c99c7d4126c7133e94bda8425471", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6b5c99c7d4126c7133e94bda8425471");
        } else if (cursor == null) {
        } else {
            while (cursor.moveToNext()) {
                DBSyncRead dBSyncRead = (DBSyncRead) com.sankuai.xm.base.tinyorm.f.a().a(DBSyncRead.class, cursor);
                if (dBSyncRead != null) {
                    dBSyncRead.parseSessionId();
                    if (z) {
                        synchronized (this.b) {
                            this.d.put(dBSyncRead.getChatKey(), dBSyncRead);
                        }
                    }
                    if (list != null) {
                        list.add(dBSyncRead);
                    }
                }
            }
        }
    }
}
