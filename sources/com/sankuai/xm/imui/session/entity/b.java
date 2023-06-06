package com.sankuai.xm.imui.session.entity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.MsgAddition;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b<M extends IMMessage> implements Comparable<b> {
    public static ChangeQuickRedirect a;
    public M b;
    public String c;
    public String d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public Set<Long> k;
    public Set<Long> l;
    public boolean m;
    public MsgAddition n;
    public final Bundle o;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3663b0021e1094bbaf1e12a581477af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3663b0021e1094bbaf1e12a581477af");
            return;
        }
        this.m = false;
        this.o = new Bundle();
    }

    public final M a() {
        return this.b;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd2756a7be1ef6aed9a9b66fd84338b6", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd2756a7be1ef6aed9a9b66fd84338b6") : this.b != null ? this.b.getMsgUuid() : "";
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "887f1b02a66dcf6e6d57cbec5957dd3f", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "887f1b02a66dcf6e6d57cbec5957dd3f")).intValue();
        }
        if (this.b != null) {
            return this.b.getMsgStatus();
        }
        return 0;
    }

    public final String d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final int f() {
        return this.g;
    }

    public final int g() {
        return this.i;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "244e73795dd20dde02270d21e2cc8e7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "244e73795dd20dde02270d21e2cc8e7c");
            return;
        }
        this.i = i;
        if (this.b != null) {
            this.b.setMsgOppositeStatus(i > 0 ? 0 : 1);
        }
    }

    public final int h() {
        return this.j;
    }

    public final long i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cc59ab5eac8c86cc0de430dd52ccf46", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cc59ab5eac8c86cc0de430dd52ccf46")).longValue() : this.b.getSts();
    }

    public final MsgAddition j() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42823461e6408dd81abce1daa6f5838d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42823461e6408dd81abce1daa6f5838d")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            if (this.b == null) {
                return ((b) obj).b == null;
            }
            return this.b.equals(((b) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ec71493db8bf3719b7fe9acae0da2f7", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ec71493db8bf3719b7fe9acae0da2f7")).intValue();
        }
        if (this.b != null) {
            return this.b.hashCode();
        }
        return 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(@NonNull b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "776c6bfd4c65c909c789da33d5a8a88d", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "776c6bfd4c65c909c789da33d5a8a88d")).intValue();
        }
        if (this.b.getSts() <= 0) {
            this.b.setSts(this.b.getCts());
        }
        if (bVar.b.getSts() <= 0) {
            bVar.b.setSts(bVar.b.getCts());
        }
        if (this.b.getMsgId() == 0 || bVar.b.getMsgId() == 0) {
            if (i() > bVar.i()) {
                return 1;
            }
            return i() == bVar.i() ? 0 : -1;
        } else if (this.b.getMsgId() > bVar.b.getMsgId()) {
            return 1;
        } else {
            return this.b.getMsgId() == bVar.b.getMsgId() ? 0 : -1;
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd45bc54404c32739f2ae5a8e0e3f68f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd45bc54404c32739f2ae5a8e0e3f68f");
        }
        StringBuilder sb = new StringBuilder("UIMessage{mRawMsg=");
        sb.append(this.b == null ? "" : this.b.keyParamToString());
        sb.append(", mAvatarUrl='");
        sb.append(this.c);
        sb.append('\'');
        sb.append(", mSenderName='");
        sb.append(this.d);
        sb.append('\'');
        sb.append(", mState=");
        sb.append(this.e);
        sb.append(", mOppositeUnreadCount=");
        sb.append(this.i);
        sb.append(", mOppositeStatus=");
        sb.append(this.j);
        sb.append('}');
        return sb.toString();
    }
}
