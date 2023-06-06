package com.sankuai.xm.group.db;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.db.i;
import com.sankuai.xm.imui.controller.group.bean.AtMeInfo;
import com.sankuai.xm.imui.controller.group.bean.GroupAnnouncement;
import com.sankuai.xm.imui.controller.group.bean.GroupMember;
import com.sankuai.xm.imui.controller.group.bean.GroupPermit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f implements i {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.base.db.i
    public final void b(com.sankuai.xm.base.db.c cVar, int i, int i2) {
    }

    @Override // com.sankuai.xm.base.db.i
    public final void a(com.sankuai.xm.base.db.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e9b6a59a9b9be311f0e506c7d0bc7a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e9b6a59a9b9be311f0e506c7d0bc7a6");
            return;
        }
        cVar.b();
        com.sankuai.xm.base.tinyorm.f.a().a(cVar, GroupMember.class);
        com.sankuai.xm.base.tinyorm.f.a().a(cVar, GroupAnnouncement.class);
        com.sankuai.xm.base.tinyorm.f.a().a(cVar, GroupPermit.class);
        com.sankuai.xm.base.tinyorm.f.a().a(cVar, AtMeInfo.class);
        cVar.d();
        cVar.c();
    }

    @Override // com.sankuai.xm.base.db.i
    public final void a(com.sankuai.xm.base.db.c cVar, int i, int i2) {
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42651d83be66be2c8db37d0b4e8c9558", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42651d83be66be2c8db37d0b4e8c9558");
            return;
        }
        com.sankuai.xm.log.c.b("PersonalSQLiteHelper", "PersonalSQLiteHelper::onUpgrade, oldVersion:" + i + ",newVersion:" + i2 + " ,path:" + cVar.h(), new Object[0]);
        switch (i) {
            case 1:
                com.sankuai.xm.base.tinyorm.f.a().a(cVar, GroupPermit.class);
            case 2:
            case 3:
                com.sankuai.xm.base.tinyorm.f.a().a(cVar, AtMeInfo.class);
                break;
            case 4:
            case 5:
                break;
            default:
                return;
        }
        cVar.a("alter table group_announcement add COLUMN unreadCount integer default 0");
    }
}
