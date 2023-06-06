package com.sankuai.xm.im.cache;

import android.os.SystemClock;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.db.DBCorruptException;
import com.sankuai.xm.im.cache.bean.DBGroupOpposite;
import com.sankuai.xm.im.cache.bean.DBPubOpposite;
import com.sankuai.xm.im.cache.bean.DBReceipt;
import com.sankuai.xm.im.cache.bean.DBSession;
import com.sankuai.xm.im.cache.bean.DBSyncRead;
import com.sankuai.xm.im.cache.bean.GroupDBMessage;
import com.sankuai.xm.im.cache.bean.PersonalDBMessage;
import com.sankuai.xm.im.cache.bean.PubDBMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.message.bean.MsgAddition;
import com.sankuai.xm.im.session.entry.SessionStamp;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class k implements com.sankuai.xm.base.db.i {
    public static ChangeQuickRedirect a;
    public static a b;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(com.sankuai.xm.base.db.c cVar, int i, int i2);
    }

    @Override // com.sankuai.xm.base.db.i
    public final void b(com.sankuai.xm.base.db.c cVar, int i, int i2) {
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd00f5a67bd49249014537560bcb69ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd00f5a67bd49249014537560bcb69ba");
        }
    }

    @Override // com.sankuai.xm.base.db.i
    public final void a(com.sankuai.xm.base.db.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29e296a82ed5e7f8607a46a9ed0c035e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29e296a82ed5e7f8607a46a9ed0c035e");
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        com.sankuai.xm.base.tinyorm.f.a().a(cVar, PersonalDBMessage.class);
        com.sankuai.xm.base.tinyorm.f.a().a(cVar, GroupDBMessage.class);
        com.sankuai.xm.base.tinyorm.f.a().a(cVar, PubDBMessage.class);
        com.sankuai.xm.base.tinyorm.f.a().a(cVar, DBSyncRead.class);
        com.sankuai.xm.base.tinyorm.f.a().a(cVar, SessionStamp.class);
        com.sankuai.xm.base.tinyorm.f.a().a(cVar, DBSession.class);
        com.sankuai.xm.base.tinyorm.f.a().a(cVar, DBReceipt.class);
        com.sankuai.xm.base.tinyorm.f.a().a(cVar, DBPubOpposite.class);
        com.sankuai.xm.base.tinyorm.f.a().a(cVar, DBGroupOpposite.class);
        com.sankuai.xm.base.tinyorm.f.a().a(cVar, MsgAddition.class);
        c.a("upgrade_time", SystemClock.uptimeMillis() - uptimeMillis);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.xm.base.db.i
    public final void a(com.sankuai.xm.base.db.c cVar, int i, int i2) {
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d7f5fb3d74e53ba37bcd799fbdb7009", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d7f5fb3d74e53ba37bcd799fbdb7009");
            return;
        }
        try {
            com.sankuai.xm.im.utils.a.b("SQLiteHelper::onUpgrade, oldVersion:" + i + ",newVersion:" + i2 + " ,path:" + cVar.h(), new Object[0]);
            long currentTimeMillis = System.currentTimeMillis();
            if (i < 17) {
                Object[] objArr2 = {cVar, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "634744507319729fcfb9624e255f935b", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "634744507319729fcfb9624e255f935b");
                } else {
                    cVar.a("drop table msg_info");
                    cVar.a("drop table grp_msg_info");
                    cVar.a("drop table pub_msg_info");
                    cVar.a("drop table msg_sync_read");
                    cVar.a("drop table session");
                    cVar.a("drop table receipt_info");
                    if (i >= 2) {
                        cVar.a("drop table kf_msg_info");
                    }
                    if (i >= 11) {
                        cVar.a("drop table msg_pub_opposite");
                    }
                    if (i >= 15) {
                        cVar.a("drop table msg_group_opposite");
                    }
                    if (i >= 21) {
                        cVar.a("drop table addition");
                    }
                }
                a(cVar);
            } else {
                switch (i) {
                    case 17:
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", PersonalDBMessage.TABLE_NAME, Message.SID, "text", "''"));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", PubDBMessage.TABLE_NAME, Message.SID, "text", "''"));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", DBSession.TABLE_NAME, Message.SID, "text", "''"));
                        cVar.a(DBSession.TABLE_NAME, "category=?", new String[]{"5"});
                        cVar.a("drop table kf_msg_info");
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", GroupDBMessage.TABLE_NAME, Message.FROM_PUB_ID, DataConstants.TYPE.INTEGER, 0));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", GroupDBMessage.TABLE_NAME, Message.FROM_PUB_NAME, "text", 0));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", GroupDBMessage.TABLE_NAME, Message.MSG_SOURCE, DataConstants.TYPE.INTEGER, 0));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", DBSession.TABLE_NAME, Message.FROM_PUB_ID, DataConstants.TYPE.INTEGER, 0));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", DBSession.TABLE_NAME, Message.FROM_PUB_NAME, "text", "''"));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", DBSession.TABLE_NAME, Message.MSG_SOURCE, DataConstants.TYPE.INTEGER, 0));
                        com.sankuai.xm.base.tinyorm.f.a().a(cVar, MsgAddition.class);
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", SessionStamp.TABLE_NAME, SessionStamp.EARLIEST_STS, DataConstants.TYPE.INTEGER, -1));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", SessionStamp.TABLE_NAME, "extension", "text", "''"));
                        break;
                    case 18:
                        cVar.a(DBSession.TABLE_NAME, "category=?", new String[]{"5"});
                        cVar.a("drop table kf_msg_info");
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", GroupDBMessage.TABLE_NAME, Message.FROM_PUB_ID, DataConstants.TYPE.INTEGER, 0));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", GroupDBMessage.TABLE_NAME, Message.FROM_PUB_NAME, "text", 0));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", GroupDBMessage.TABLE_NAME, Message.MSG_SOURCE, DataConstants.TYPE.INTEGER, 0));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", DBSession.TABLE_NAME, Message.FROM_PUB_ID, DataConstants.TYPE.INTEGER, 0));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", DBSession.TABLE_NAME, Message.FROM_PUB_NAME, "text", "''"));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", DBSession.TABLE_NAME, Message.MSG_SOURCE, DataConstants.TYPE.INTEGER, 0));
                        com.sankuai.xm.base.tinyorm.f.a().a(cVar, MsgAddition.class);
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", SessionStamp.TABLE_NAME, SessionStamp.EARLIEST_STS, DataConstants.TYPE.INTEGER, -1));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", SessionStamp.TABLE_NAME, "extension", "text", "''"));
                        break;
                    case 19:
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", GroupDBMessage.TABLE_NAME, Message.FROM_PUB_ID, DataConstants.TYPE.INTEGER, 0));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", GroupDBMessage.TABLE_NAME, Message.FROM_PUB_NAME, "text", 0));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", GroupDBMessage.TABLE_NAME, Message.MSG_SOURCE, DataConstants.TYPE.INTEGER, 0));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", DBSession.TABLE_NAME, Message.FROM_PUB_ID, DataConstants.TYPE.INTEGER, 0));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", DBSession.TABLE_NAME, Message.FROM_PUB_NAME, "text", "''"));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", DBSession.TABLE_NAME, Message.MSG_SOURCE, DataConstants.TYPE.INTEGER, 0));
                        com.sankuai.xm.base.tinyorm.f.a().a(cVar, MsgAddition.class);
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", SessionStamp.TABLE_NAME, SessionStamp.EARLIEST_STS, DataConstants.TYPE.INTEGER, -1));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", SessionStamp.TABLE_NAME, "extension", "text", "''"));
                        break;
                    case 20:
                        com.sankuai.xm.base.tinyorm.f.a().a(cVar, MsgAddition.class);
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", SessionStamp.TABLE_NAME, SessionStamp.EARLIEST_STS, DataConstants.TYPE.INTEGER, -1));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", SessionStamp.TABLE_NAME, "extension", "text", "''"));
                        break;
                    case 21:
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", SessionStamp.TABLE_NAME, SessionStamp.EARLIEST_STS, DataConstants.TYPE.INTEGER, -1));
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", SessionStamp.TABLE_NAME, "extension", "text", "''"));
                        break;
                    case 23:
                        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", SessionStamp.TABLE_NAME, "extension", "text", "''"));
                        break;
                }
            }
            if (b != null) {
                b.a(cVar, i, i2);
            }
            c.a("upgrade_time", System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            if (e instanceof com.sankuai.xm.base.db.f) {
                throw new DBCorruptException(e);
            }
            throw e;
        }
    }
}
