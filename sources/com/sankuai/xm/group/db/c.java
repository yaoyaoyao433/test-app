package com.sankuai.xm.group.db;

import android.database.Cursor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.imui.controller.group.bean.GroupAnnouncement;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;
    PersonalDBProxy b;

    public c(PersonalDBProxy personalDBProxy) {
        Object[] objArr = {personalDBProxy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4dd55f90d49e91f96fa0217b648725e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4dd55f90d49e91f96fa0217b648725e");
        } else {
            this.b = personalDBProxy;
        }
    }

    public final GroupAnnouncement a(final long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "103f704744fffce8bfb2853b8179b7c8", 6917529027641081856L)) {
            return (GroupAnnouncement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "103f704744fffce8bfb2853b8179b7c8");
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.b.a(new Runnable() { // from class: com.sankuai.xm.group.db.c.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r0v10, types: [T, com.sankuai.xm.imui.controller.group.bean.GroupAnnouncement] */
            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f57616f90f7fad25bca9eca14259b52", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f57616f90f7fad25bca9eca14259b52");
                    return;
                }
                c cVar = c.this;
                long j2 = j;
                com.sankuai.xm.base.tinyorm.b bVar2 = bVar;
                Object[] objArr3 = {new Long(j2), bVar2};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "0ceca96f655620f795a62015452d5065", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "0ceca96f655620f795a62015452d5065");
                    return;
                }
                com.sankuai.xm.base.db.c bR_ = cVar.b.bR_();
                Cursor cursor = null;
                try {
                    try {
                        Cursor a2 = bR_.a(GroupAnnouncement.TABLE_NAME, null, "gid=?", new String[]{String.valueOf(j2)}, null, null, null);
                        if (a2 != null) {
                            try {
                                if (a2.getCount() > 0) {
                                    a2.moveToFirst();
                                    bVar2.c = (GroupAnnouncement) com.sankuai.xm.base.tinyorm.f.a().a(GroupAnnouncement.class, a2);
                                    if (a2 != null) {
                                        a2.close();
                                        return;
                                    }
                                    return;
                                }
                            } catch (Exception e) {
                                e = e;
                                cursor = a2;
                                com.sankuai.xm.monitor.statistics.a.a("imui", "GAnnouncementDBProxy::getOnQueue", e);
                                if (cursor != null) {
                                    cursor.close();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                th = th;
                                cursor = a2;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                        if (a2 != null) {
                            a2.close();
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }, true, null);
        return (GroupAnnouncement) bVar.c;
    }

    public final void a(final GroupAnnouncement groupAnnouncement, final String[] strArr) {
        Object[] objArr = {groupAnnouncement, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afc189dd10b3ff2b88dc5039d3a7d4f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afc189dd10b3ff2b88dc5039d3a7d4f6");
        } else if (groupAnnouncement == null) {
        } else {
            this.b.a(new Runnable() { // from class: com.sankuai.xm.group.db.c.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3110c07e34aab50f050ebb9c58c14ea", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3110c07e34aab50f050ebb9c58c14ea");
                        return;
                    }
                    com.sankuai.xm.base.tinyorm.f.a().b(c.this.b.bR_(), groupAnnouncement, strArr, null);
                }
            }, (Callback) null);
        }
    }

    public final void b(final long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea4b0456790baa779e1fbeacbf0d3e9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea4b0456790baa779e1fbeacbf0d3e9b");
        } else {
            this.b.a(new Runnable() { // from class: com.sankuai.xm.group.db.c.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40ea20676588c0141c76b66376132cb1", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40ea20676588c0141c76b66376132cb1");
                    } else {
                        c.this.b.bR_().a(GroupAnnouncement.TABLE_NAME, "gid=?", new String[]{String.valueOf(j)});
                    }
                }
            }, (Callback) null);
        }
    }
}
