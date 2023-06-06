package com.sankuai.xm.im.cache;

import android.database.Cursor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.session.entry.SessionStamp;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class m {
    public static ChangeQuickRedirect a;
    final Object b;
    DBProxy c;
    Map<String, SessionStamp> d;
    AtomicBoolean e;

    public m(DBProxy dBProxy) {
        Object[] objArr = {dBProxy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d5a20ce4730dc4de89eb9a8b6083ea9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d5a20ce4730dc4de89eb9a8b6083ea9");
            return;
        }
        this.c = dBProxy;
        this.d = new HashMap();
        this.e = new AtomicBoolean(false);
        this.b = new Object();
    }

    private boolean a(final com.sankuai.xm.base.db.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8398c86d5b329f286132069c28f3b5ce", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8398c86d5b329f286132069c28f3b5ce")).booleanValue();
        }
        if (IMClient.a().d()) {
            if (this.e.get()) {
                return true;
            }
            this.c.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.m.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "71d16762ba479b946701dacece0613c1", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "71d16762ba479b946701dacece0613c1");
                    } else if (m.this.e.get()) {
                    } else {
                        m mVar = m.this;
                        com.sankuai.xm.base.db.c cVar2 = cVar;
                        Object[] objArr3 = {cVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = m.a;
                        if (PatchProxy.isSupport(objArr3, mVar, changeQuickRedirect3, false, "860b2f72c489be1f96495babaf4e790d", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, mVar, changeQuickRedirect3, false, "860b2f72c489be1f96495babaf4e790d");
                            return;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        Cursor cursor = null;
                        try {
                            if (cVar2 == null) {
                                try {
                                    cVar2 = mVar.c.bR_();
                                } catch (Exception e) {
                                    e = e;
                                    com.sankuai.xm.im.utils.a.a(e, "SessionStampDBProxy::loadOnQueue => exception.", new Object[0]);
                                    mVar.c.a("SessionStampDBProxy.loadOnQueue", e.toString());
                                    throw new com.sankuai.xm.base.db.f(e);
                                }
                            }
                            com.sankuai.xm.base.db.c cVar3 = cVar2;
                            if (cVar3 == null) {
                                com.sankuai.xm.base.util.m.a(null);
                                c.a("SessionStampDBProxyLoad", System.currentTimeMillis() - currentTimeMillis, mVar.d.size(), -1);
                                return;
                            }
                            Cursor a2 = cVar3.a(SessionStamp.TABLE_NAME, null, null, null, null, null, null, null);
                            if (a2 == null) {
                                com.sankuai.xm.base.util.m.a(a2);
                                c.a("SessionStampDBProxyLoad", System.currentTimeMillis() - currentTimeMillis, mVar.d.size(), -1);
                                return;
                            }
                            try {
                                if (a2.getCount() <= 0) {
                                    mVar.e.set(true);
                                    com.sankuai.xm.base.util.m.a(a2);
                                    c.a("SessionStampDBProxyLoad", System.currentTimeMillis() - currentTimeMillis, mVar.d.size(), -1);
                                    return;
                                }
                                while (a2.moveToNext()) {
                                    SessionStamp sessionStamp = (SessionStamp) com.sankuai.xm.base.tinyorm.f.a().a(SessionStamp.class, a2);
                                    if (sessionStamp != null) {
                                        synchronized (mVar.b) {
                                            mVar.d.put(sessionStamp.getChatKey(), sessionStamp);
                                        }
                                    }
                                }
                                mVar.e.set(true);
                                com.sankuai.xm.base.util.m.a(a2);
                                c.a("SessionStampDBProxyLoad", System.currentTimeMillis() - currentTimeMillis, mVar.d.size(), -1);
                            } catch (Exception e2) {
                                e = e2;
                                com.sankuai.xm.im.utils.a.a(e, "SessionStampDBProxy::loadOnQueue => exception.", new Object[0]);
                                mVar.c.a("SessionStampDBProxy.loadOnQueue", e.toString());
                                throw new com.sankuai.xm.base.db.f(e);
                            } catch (Throwable th) {
                                th = th;
                                cursor = a2;
                                com.sankuai.xm.base.util.m.a(cursor);
                                c.a("SessionStampDBProxyLoad", System.currentTimeMillis() - currentTimeMillis, mVar.d.size(), -1);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            }));
            return this.e.get();
        }
        return false;
    }

    public final SessionStamp a(final String str) {
        SessionStamp sessionStamp;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "924b26b0c6b9ffc065d8302b8a7102fa", 6917529027641081856L)) {
            return (SessionStamp) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "924b26b0c6b9ffc065d8302b8a7102fa");
        }
        if (a((com.sankuai.xm.base.db.c) null)) {
            synchronized (this.b) {
                sessionStamp = this.d.containsKey(str) ? this.d.get(str) : null;
            }
            return sessionStamp;
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.c.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.m.2
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4090f1746767e3823a78d429f42bba8", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4090f1746767e3823a78d429f42bba8");
                    return;
                }
                List<SessionStamp> a2 = m.this.a(null, "chat_key=?", new String[]{str});
                if (a2 == null || a2.isEmpty()) {
                    return;
                }
                bVar.c = a2.get(0);
            }
        }));
        return (SessionStamp) bVar.c;
    }

    public final void a(com.sankuai.xm.base.db.c cVar, final List<SessionStamp> list) {
        Object[] objArr = {null, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f92e4cea017de52914a32e2f0c5c820e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f92e4cea017de52914a32e2f0c5c820e");
        } else if (list.isEmpty()) {
        } else {
            if (!this.e.get()) {
                a((com.sankuai.xm.base.db.c) null);
            }
            this.c.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.m.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "920669fe2e4fa31f4726e2c0b5fe8ae3", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "920669fe2e4fa31f4726e2c0b5fe8ae3");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    com.sankuai.xm.base.db.c bR_ = r2 == null ? m.this.c.bR_() : r2;
                    try {
                        m.this.c.a(bR_);
                        for (SessionStamp sessionStamp : list) {
                            if (com.sankuai.xm.base.tinyorm.f.a().a(bR_, sessionStamp) != -1) {
                                hashMap.put(sessionStamp.getChatKey(), sessionStamp);
                            }
                        }
                        m.this.c.b(bR_);
                        m.this.c.c(bR_);
                        if (hashMap.isEmpty() || !IMClient.a().d()) {
                            return;
                        }
                        synchronized (m.this.b) {
                            m.this.d.putAll(hashMap);
                        }
                    } catch (Throwable th) {
                        m.this.c.c(bR_);
                        if (!hashMap.isEmpty() && IMClient.a().d()) {
                            synchronized (m.this.b) {
                                m.this.d.putAll(hashMap);
                            }
                        }
                        throw th;
                    }
                }
            }), (Callback) null);
        }
    }

    public final void b(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ab3e76998dbfd3ff221ff2c672e350c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ab3e76998dbfd3ff221ff2c672e350c");
        } else {
            this.c.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.m.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16d770fed1bcfbf370455bf9af177511", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16d770fed1bcfbf370455bf9af177511");
                        return;
                    }
                    m.this.c.bR_().a(SessionStamp.TABLE_NAME, "chat_key=?", new String[]{str});
                    synchronized (m.this.b) {
                        m.this.d.remove(str);
                    }
                }
            }), (Callback) null);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39eb0d7d521e577e02a7d7d2b439df62", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39eb0d7d521e577e02a7d7d2b439df62");
        } else {
            this.c.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.m.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7149d4bc3b90e7bb91d6aa25696fd124", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7149d4bc3b90e7bb91d6aa25696fd124");
                        return;
                    }
                    m.this.e.set(false);
                    m.this.c.bR_().a(SessionStamp.TABLE_NAME, null, null);
                    synchronized (m.this.b) {
                        m.this.d.clear();
                    }
                }
            }), true, (Callback) null);
        }
    }

    public final void a(final List<SessionStamp> list, final String... strArr) {
        Object[] objArr = {list, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8902ef46c6991abefd6abe778288a219", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8902ef46c6991abefd6abe778288a219");
        } else if (com.sankuai.xm.base.util.b.a(list)) {
        } else {
            if (!this.e.get()) {
                a((com.sankuai.xm.base.db.c) null);
            }
            this.c.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.m.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db12bb2386767c85f725eb56392730d7", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db12bb2386767c85f725eb56392730d7");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    com.sankuai.xm.base.db.c bR_ = m.this.c.bR_();
                    try {
                        m.this.c.a(bR_);
                        com.sankuai.xm.base.tinyorm.b<Object> bVar = new com.sankuai.xm.base.tinyorm.b<>();
                        for (SessionStamp sessionStamp : list) {
                            com.sankuai.xm.base.tinyorm.f.a().b(m.this.c.bR_(), sessionStamp, strArr, bVar);
                            if (bVar.a()) {
                                hashMap.put(sessionStamp.getChatKey(), (SessionStamp) bVar.c);
                            } else {
                                com.sankuai.xm.im.utils.a.c("SessionStampDBProxy::update db action failed %s.", sessionStamp);
                            }
                        }
                        m.this.c.b(bR_);
                        m.this.c.c(bR_);
                        if (hashMap.isEmpty() || !IMClient.a().d()) {
                            return;
                        }
                        synchronized (m.this.b) {
                            m.this.d.putAll(hashMap);
                        }
                    } catch (Throwable th) {
                        m.this.c.c(bR_);
                        if (!hashMap.isEmpty() && IMClient.a().d()) {
                            synchronized (m.this.b) {
                                m.this.d.putAll(hashMap);
                            }
                        }
                        throw th;
                    }
                }
            }), (Callback) null);
        }
    }

    List<SessionStamp> a(com.sankuai.xm.base.db.c cVar, String str, String[] strArr) {
        Exception e;
        Cursor cursor;
        Object[] objArr = {cVar, str, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e52ffd947117a28451ba2080070e57c", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e52ffd947117a28451ba2080070e57c");
        }
        LinkedList linkedList = new LinkedList();
        Cursor cursor2 = null;
        try {
            if (cVar == null) {
                try {
                    cVar = this.c.bR_();
                } catch (Exception e2) {
                    e = e2;
                    this.c.a("SessionStampDBProxy::load", e.toString());
                    throw new com.sankuai.xm.base.db.f(e);
                }
            }
            com.sankuai.xm.base.db.c cVar2 = cVar;
            if (cVar2 != null) {
                cursor = cVar2.a(SessionStamp.TABLE_NAME, null, str, strArr, null, null, null, null);
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        try {
                            SessionStamp sessionStamp = (SessionStamp) com.sankuai.xm.base.tinyorm.f.a().a(SessionStamp.class, cursor);
                            if (sessionStamp != null) {
                                linkedList.add(sessionStamp);
                            }
                        } catch (Exception e3) {
                            e = e3;
                            this.c.a("SessionStampDBProxy::load", e.toString());
                            throw new com.sankuai.xm.base.db.f(e);
                        } catch (Throwable th) {
                            cursor2 = cursor;
                            th = th;
                            com.sankuai.xm.base.util.m.a(cursor2);
                            throw th;
                        }
                    }
                } else {
                    com.sankuai.xm.base.util.m.a(cursor);
                    return linkedList;
                }
            } else {
                cursor = null;
            }
            com.sankuai.xm.base.util.m.a(cursor);
            return linkedList;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
