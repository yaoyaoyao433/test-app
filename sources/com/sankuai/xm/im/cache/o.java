package com.sankuai.xm.im.cache;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.cache.bean.DBSyncRead;
import com.sankuai.xm.im.message.bean.CancelMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.message.bean.SyncRead;
import com.sankuai.xm.im.session.SessionId;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class o {
    public static ChangeQuickRedirect a;
    private Set<String> b;
    private Map<String, a> c;
    private Map<String, CancelMessage> d;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b {
        public static o a = new o();
    }

    public o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40a54293d0c3c19cd8cd8248397047b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40a54293d0c3c19cd8cd8248397047b9");
            return;
        }
        this.b = new HashSet();
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public final void a(@NonNull Message message) {
        a aVar;
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59fc2d0acb769d86b3bf8859e89762c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59fc2d0acb769d86b3bf8859e89762c0");
            return;
        }
        SessionId a2 = SessionId.a(message);
        synchronized (this) {
            a aVar2 = this.c.get(a2.f());
            if (aVar2 == null) {
                aVar2 = new a(a2);
                this.c.put(a2.f(), aVar2);
            }
            aVar = aVar2;
        }
        Object[] objArr2 = {message};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "051ff9ea3fe462c844339b2464f45c02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "051ff9ea3fe462c844339b2464f45c02");
        } else if (message.getMsgStatus() == 7) {
            synchronized (aVar) {
                c cVar = new c(message);
                if (!aVar.b.contains(cVar)) {
                    aVar.b.add(cVar);
                }
            }
        }
    }

    public final void a(@NonNull IMMessage iMMessage) {
        a aVar;
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "326475f2ce00b80274650751ed63f464", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "326475f2ce00b80274650751ed63f464");
            return;
        }
        SessionId a2 = SessionId.a(iMMessage);
        synchronized (this) {
            aVar = this.c.get(a2.f());
            if (aVar == null) {
                aVar = new a(a2);
                this.c.put(a2.f(), aVar);
            }
        }
        aVar.a(iMMessage);
    }

    public final synchronized void a(CancelMessage cancelMessage) {
        Object[] objArr = {cancelMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f253aa44af24565d2052e69233a332ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f253aa44af24565d2052e69233a332ef");
        } else if (cancelMessage == null) {
        } else {
            this.d.put(cancelMessage.getMsgUuid(), cancelMessage);
        }
    }

    public final synchronized CancelMessage a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "585e95420d0cff9f0e134042c45e64be", 6917529027641081856L)) {
            return (CancelMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "585e95420d0cff9f0e134042c45e64be");
        } else if (str == null) {
            return null;
        } else {
            return this.d.remove(str);
        }
    }

    public final void a(@NonNull SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77c3805ceabae9eb8d0cd845680042ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77c3805ceabae9eb8d0cd845680042ca");
            return;
        }
        synchronized (this) {
            this.c.remove(sessionId.f());
        }
    }

    public final void a(@NonNull SessionId sessionId, long j) {
        a aVar;
        Object[] objArr = {sessionId, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87cb9b11e63eff13fd6008655d48725f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87cb9b11e63eff13fd6008655d48725f");
            return;
        }
        synchronized (this) {
            aVar = this.c.get(sessionId.f());
        }
        if (aVar == null || !aVar.a(j)) {
            return;
        }
        a(sessionId);
    }

    public final int a(@NonNull SessionId sessionId, int i, boolean z) {
        int a2;
        int a3;
        Object[] objArr = {sessionId, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b838a1c2de271ba0d4318da3e2e23136", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b838a1c2de271ba0d4318da3e2e23136")).intValue();
        }
        synchronized (this) {
            a remove = this.c.remove(sessionId.f());
            a2 = remove == null ? 0 : remove.a();
        }
        if (b.a.b(sessionId) || z) {
            DBSyncRead a4 = DBProxy.l().l.a(sessionId.f());
            long rsts = a4 == null ? 0L : a4.getRsts() + 1;
            a3 = DBProxy.l().k.a(sessionId, rsts);
            com.sankuai.xm.im.utils.a.b("getUnread: " + sessionId.f() + ", unread = " + a3 + ", oldUnread = " + i + ", earliestUnreadTime = " + rsts, new Object[0]);
        } else {
            int i2 = a2 + i;
            com.sankuai.xm.im.utils.a.b("getUnread: " + sessionId.f() + ", unread = " + i2 + ", oldUnread = " + i, new Object[0]);
            a3 = i2;
        }
        if (a3 < 0) {
            return 0;
        }
        return a3;
    }

    public final int a(SyncRead syncRead) {
        Object[] objArr = {syncRead};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea0714ab06e47488a084695cf8555d5b", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea0714ab06e47488a084695cf8555d5b")).intValue();
        }
        if (syncRead == null) {
            return 0;
        }
        a(syncRead.getSessionId(), syncRead.getRsts());
        int a2 = DBProxy.l().k.a(syncRead.getSessionId(), syncRead.getRsts() + 1);
        if (a2 < 0) {
            return 0;
        }
        return a2;
    }

    private synchronized boolean b(@NonNull SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1517e6114ec3558e82ff9d6b1c4ff6f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1517e6114ec3558e82ff9d6b1c4ff6f")).booleanValue();
        }
        boolean contains = true ^ this.b.contains(sessionId.f());
        if (contains) {
            this.b.add(sessionId.f());
        }
        return contains;
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8600b7710cb2a77e069389ff149d467", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8600b7710cb2a77e069389ff149d467");
            return;
        }
        this.c.clear();
        this.b.clear();
        this.d.clear();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a {
        public static ChangeQuickRedirect a;
        List<c> b;
        private SessionId d;
        private List<c> e;

        public a(SessionId sessionId) {
            Object[] objArr = {o.this, sessionId};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd73b33244f1d891600c10d4308bfdfc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd73b33244f1d891600c10d4308bfdfc");
                return;
            }
            this.b = new LinkedList();
            this.e = new LinkedList();
            this.d = sessionId;
        }

        public final boolean a(Message message) {
            boolean z = false;
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0592c39a3accdf0293c5826365f9893", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0592c39a3accdf0293c5826365f9893")).booleanValue();
            }
            if (message instanceof CancelMessage) {
                synchronized (this) {
                    c cVar = new c(message);
                    if (!this.e.contains(cVar)) {
                        this.e.add(cVar);
                        z = true;
                    }
                }
            }
            synchronized (this) {
                this.b.remove(new c(message.getMsgUuid()));
            }
            return z;
        }

        public final synchronized int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aee0ff34116880a908d87cf1c4ad16a0", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aee0ff34116880a908d87cf1c4ad16a0")).intValue();
            }
            int size = this.b.size();
            int size2 = this.e.size();
            this.b.clear();
            this.e.clear();
            return size - size2;
        }

        public final synchronized boolean a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68dba8a04258f43636d9f647f0d323ad", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68dba8a04258f43636d9f647f0d323ad")).booleanValue();
            } else if (this.b.isEmpty() && this.e.isEmpty()) {
                return true;
            } else {
                if (!this.b.isEmpty()) {
                    Iterator<c> it = this.b.iterator();
                    while (it.hasNext()) {
                        if (it.next().d <= j) {
                            it.remove();
                        }
                    }
                }
                if (!this.e.isEmpty()) {
                    Iterator<c> it2 = this.e.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().d <= j) {
                            it2.remove();
                        }
                    }
                }
                return this.b.isEmpty() && this.e.isEmpty();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class c {
        public static ChangeQuickRedirect a;
        public String b;
        public long c;
        public long d;

        public c(Message message) {
            Object[] objArr = {o.this, message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e76189476af85c5a5f18ca92ec80e23", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e76189476af85c5a5f18ca92ec80e23");
                return;
            }
            this.b = message.getMsgUuid();
            this.c = message.getMsgId();
            this.d = message.getSts();
        }

        public c(String str) {
            Object[] objArr = {o.this, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "203e50161aa8eedb308405e4a782f019", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "203e50161aa8eedb308405e4a782f019");
            } else {
                this.b = str;
            }
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1537ef1b7d879405b8f9c3b88462d486", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1537ef1b7d879405b8f9c3b88462d486")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.b != null ? this.b.equals(cVar.b) : cVar.b == null;
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aba358719b640894d1909f86a18baf9d", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aba358719b640894d1909f86a18baf9d")).intValue();
            }
            if (this.b != null) {
                return this.b.hashCode();
            }
            return 0;
        }
    }
}
