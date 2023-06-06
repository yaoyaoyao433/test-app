package com.sankuai.xm.group.db;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.imui.controller.group.bean.GroupMember;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends b {
    public static ChangeQuickRedirect b;
    public PersonalDBProxy c;

    public d(PersonalDBProxy personalDBProxy) {
        Object[] objArr = {personalDBProxy};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c54ede88b47bad10ad71bf0d716edd02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c54ede88b47bad10ad71bf0d716edd02");
        } else {
            this.c = personalDBProxy;
        }
    }

    public final void a(final long j, final Callback<List<GroupMember>> callback) {
        Object[] objArr = {new Long(j), callback};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae41da06613fc0322e35e348bedbfc69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae41da06613fc0322e35e348bedbfc69");
        } else {
            this.c.a(new Runnable() { // from class: com.sankuai.xm.group.db.d.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
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
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.group.db.d.AnonymousClass1.run():void");
                }
            }, callback);
        }
    }

    public final void a(final List<GroupMember> list, final String[] strArr) {
        Object[] objArr = {list, strArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f03dc39de433f2719d60d5d9d99e352", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f03dc39de433f2719d60d5d9d99e352");
        } else if (list == null || list.isEmpty()) {
        } else {
            this.c.a(new Runnable() { // from class: com.sankuai.xm.group.db.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c8d5d1fe850de49e77b9aaf2b2dc5ab", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c8d5d1fe850de49e77b9aaf2b2dc5ab");
                        return;
                    }
                    com.sankuai.xm.base.db.c bR_ = d.this.c.bR_();
                    try {
                        try {
                            bR_.b();
                            for (GroupMember groupMember : list) {
                                com.sankuai.xm.base.tinyorm.f.a().b(bR_, groupMember, strArr, null);
                            }
                            bR_.d();
                            if (bR_.g() && bR_.e()) {
                                bR_.c();
                            }
                        } catch (Exception e) {
                            com.sankuai.xm.monitor.statistics.a.a("imui", "GMemberDBProxy::addOrUpdate", e);
                            if (bR_.g() && bR_.e()) {
                                bR_.c();
                            }
                        }
                    } catch (Throwable th) {
                        if (bR_.g() && bR_.e()) {
                            bR_.c();
                        }
                        throw th;
                    }
                }
            }, (Callback) null);
        }
    }

    public final void a(final List<GroupMember> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5a5f73f4d2c22bb02b76643de9d3ca2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5a5f73f4d2c22bb02b76643de9d3ca2");
        } else if (list == null || list.isEmpty()) {
        } else {
            this.c.a(new Runnable() { // from class: com.sankuai.xm.group.db.d.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58a4cc8b6d7230f8eb1237037d4e5794", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58a4cc8b6d7230f8eb1237037d4e5794");
                        return;
                    }
                    com.sankuai.xm.base.db.c bR_ = d.this.c.bR_();
                    try {
                        try {
                            bR_.b();
                            for (GroupMember groupMember : list) {
                                bR_.a(GroupMember.TABLE_NAME, "gid=? AND uid=?", new String[]{String.valueOf(groupMember.getGid()), String.valueOf(groupMember.getUid())});
                            }
                            bR_.d();
                            if (bR_.g() && bR_.e()) {
                                bR_.c();
                            }
                        } catch (Exception e) {
                            com.sankuai.xm.monitor.statistics.a.a("imui", "GMemberDBProxy::remove", e);
                            if (bR_.g() && bR_.e()) {
                                bR_.c();
                            }
                        }
                    } catch (Throwable th) {
                        if (bR_.g() && bR_.e()) {
                            bR_.c();
                        }
                        throw th;
                    }
                }
            }, (Callback) null);
        }
    }
}
