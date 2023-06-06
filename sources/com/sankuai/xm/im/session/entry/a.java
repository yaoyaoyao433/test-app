package com.sankuai.xm.im.session.entry;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.p;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.session.SessionId;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static final IMMessage f = new IMMessage();
    public IMMessage b;
    public String c;
    public int d;
    public int e;

    public final IMMessage a() {
        return this.b;
    }

    public final int b() {
        return this.d;
    }

    public final SessionId c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06d2acc407ee1cfdeb1e0507c8a6fddb", 6917529027641081856L)) {
            return (SessionId) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06d2acc407ee1cfdeb1e0507c8a6fddb");
        }
        if (this.b == null) {
            return SessionId.a(this.c);
        }
        return SessionId.a(this.b);
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7d4eedf54dca21d45b2cb411c560a45", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7d4eedf54dca21d45b2cb411c560a45");
        }
        return "ChatInfo{mKey='" + this.c + "', mUnRead=" + this.d + ", mIMMessage=" + this.b.getMsgUuid() + '}';
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57f4175e1037a91f1f61276cdd5cd3dc", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57f4175e1037a91f1f61276cdd5cd3dc")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ac.a(this.c, ((a) obj).c);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d2b1e842d076b78b6123c02b409ec80", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d2b1e842d076b78b6123c02b409ec80")).intValue() : p.a(this.c);
    }

    public final boolean d() {
        return (this.e & 4) != 0;
    }
}
