package com.sankuai.xm.imui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.g;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.session.entity.SessionParams;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static b c = new b();
    public com.sankuai.xm.imui.session.b b;
    private a d;
    private g e;

    public static b a() {
        return c;
    }

    public final void a(com.sankuai.xm.imui.session.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39a7a91168e75b5305cedf726516dd19", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39a7a91168e75b5305cedf726516dd19");
            return;
        }
        this.b = bVar;
        if (bVar != null) {
            if (this.d == null || this.d.c == null || !this.d.c.equals(bVar.b)) {
                a(bVar.b);
            }
            if (this.e == null) {
                this.e = j.a();
            }
            bVar.g = this.e;
        }
    }

    public final com.sankuai.xm.imui.session.b b() {
        return this.b;
    }

    public final SessionParams c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d21db6553051f0ac5695cf5a8301e4ef", 6917529027641081856L)) {
            return (SessionParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d21db6553051f0ac5695cf5a8301e4ef");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.c;
    }

    public final void a(SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34c3c9f21ad005b15acd418d1918dd70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34c3c9f21ad005b15acd418d1918dd70");
            return;
        }
        this.d = new a(this, sessionId);
        d.b("SessionCenter::setSessionInfo %s", this.d.toString());
    }

    public final long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e012e9b08058e01323d7c2ac63cfedea", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e012e9b08058e01323d7c2ac63cfedea")).longValue();
        }
        if (this.d == null) {
            return 0L;
        }
        return this.d.c.b;
    }

    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70cc8fac480a10e8edc8a904614f1863", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70cc8fac480a10e8edc8a904614f1863")).intValue();
        }
        if (this.d == null) {
            return 1;
        }
        return this.d.c.e;
    }

    public final SessionId f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f8ab81fc0cfcc783c5cd9843bc549dc", 6917529027641081856L) ? (SessionId) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f8ab81fc0cfcc783c5cd9843bc549dc") : this.d == null ? new SessionId() : this.d.c;
    }

    private boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18587dee84d3adb5fdaedcae24278f38", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18587dee84d3adb5fdaedcae24278f38")).booleanValue() : MessageUtils.isPubService(e());
    }

    public final short g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5613dc4793d5183c3a904ce5946dd105", 6917529027641081856L)) {
            return ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5613dc4793d5183c3a904ce5946dd105")).shortValue();
        }
        if (this.d == null || i()) {
            return (short) 0;
        }
        return this.d.c.d;
    }

    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29eded97f45dd6a6afd3c8a2a1836ab0", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29eded97f45dd6a6afd3c8a2a1836ab0") : this.d == null ? "xm" : this.d.b;
    }

    public final void a(SessionId sessionId, String str) {
        Object[] objArr = {sessionId, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eab649169b5770d2bb37ddee98921132", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eab649169b5770d2bb37ddee98921132");
        } else if (new a(sessionId, str).equals(this.d)) {
            this.d = null;
            this.e = null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a {
        public static ChangeQuickRedirect a;
        String b;
        SessionId c;

        public a(b bVar, SessionId sessionId) {
            this(sessionId, UUID.randomUUID().toString());
            Object[] objArr = {bVar, sessionId};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ed2ce6c16eab5ffa3c1b3da05862be3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ed2ce6c16eab5ffa3c1b3da05862be3");
            }
        }

        public a(SessionId sessionId, String str) {
            Object[] objArr = {b.this, sessionId, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b47021d7963742566dc7df1d502f8c2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b47021d7963742566dc7df1d502f8c2");
                return;
            }
            this.b = str;
            this.c = sessionId == null ? new SessionId() : sessionId;
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e179c5c98774af68343e3d4bfe326165", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e179c5c98774af68343e3d4bfe326165")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b == null ? aVar.b == null : this.b.equals(aVar.b)) {
                return this.c != null ? this.c.equals(aVar.c) : aVar.c == null;
            }
            return false;
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7e8f533ee6937fefa9248d5682175fc", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7e8f533ee6937fefa9248d5682175fc")).intValue();
            }
            return ((this.b != null ? this.b.hashCode() : 0) * 31) + (this.c != null ? this.c.hashCode() : 0);
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4e244f58ba4f2550ae70f92be6eaa62", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4e244f58ba4f2550ae70f92be6eaa62");
            }
            return "Chat{mId='" + this.b + "', mSessionId=" + this.c.f() + '}';
        }
    }
}
