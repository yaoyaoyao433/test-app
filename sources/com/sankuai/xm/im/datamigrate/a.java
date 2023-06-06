package com.sankuai.xm.im.datamigrate;

import android.content.ContentValues;
import android.text.TextUtils;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.db.c;
import com.sankuai.xm.base.db.g;
import com.sankuai.xm.base.db.j;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.cache.bean.DBSession;
import com.sankuai.xm.im.cache.bean.GroupDBMessage;
import com.sankuai.xm.im.cache.bean.PersonalDBMessage;
import com.sankuai.xm.im.cache.bean.PubDBMessage;
import com.sankuai.xm.im.cache.k;
import com.sankuai.xm.im.cache.l;
import com.sankuai.xm.im.utils.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a implements g.b, k.a {
    public static ChangeQuickRedirect a;
    private volatile boolean b;

    @Override // com.sankuai.xm.base.db.g.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce2e3e587cfaf788dab9176722a33726", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce2e3e587cfaf788dab9176722a33726");
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3a69245f680001ed549513d9d3ce01a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3a69245f680001ed549513d9d3ce01a");
            return;
        }
        this.b = false;
        k.b = this;
        g.a().a(this);
    }

    @Override // com.sankuai.xm.im.cache.k.a
    public final void a(c cVar, int i, int i2) {
        DBSession c;
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40ad84ef8704be9f16f6c2f6b2b21646", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40ad84ef8704be9f16f6c2f6b2b21646");
        } else if (i == i2 || TextUtils.isEmpty(cVar.h())) {
        } else {
            String h = cVar.h();
            DBProxy.l();
            if (!h.contains("0_message_db.db") && i >= 10) {
                switch (i) {
                    case 10:
                    case 11:
                        long j = DBProxy.l().n;
                        Object[] objArr2 = {cVar, new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb0119931656061abe08874aab25d81f", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb0119931656061abe08874aab25d81f");
                            return;
                        } else if (com.sankuai.xm.login.a.a().m() == 1 || cVar == null || j == 0) {
                            return;
                        } else {
                            b a2 = b.a();
                            long j2 = a2.getLong("xm_sdk_db_upgrade_12_init_" + j, 0L);
                            if (j2 <= 0) {
                                l lVar = DBProxy.l().m;
                                if (lVar == null) {
                                    c = null;
                                } else {
                                    Object[] objArr3 = {cVar};
                                    ChangeQuickRedirect changeQuickRedirect3 = l.a;
                                    c = PatchProxy.isSupport(objArr3, lVar, changeQuickRedirect3, false, "1cd3e532a9560aefb338444a3ccc5e6b", 6917529027641081856L) ? (DBSession) PatchProxy.accessDispatch(objArr3, lVar, changeQuickRedirect3, false, "1cd3e532a9560aefb338444a3ccc5e6b") : lVar.c(cVar);
                                }
                                if (c == null) {
                                    b a3 = b.a();
                                    b.a(a3.a("xm_sdk_db_upgrade_12_init_" + j, j2));
                                    b a4 = b.a();
                                    b.a(a4.a("xm_sdk_db_upgrade_12_" + j, (j2 - 2592000000L) - 1));
                                    return;
                                }
                                long sts = c.getSts();
                                b a5 = b.a();
                                b.a(a5.a("xm_sdk_db_upgrade_12_init_" + j, sts));
                                b a6 = b.a();
                                b.a(a6.a("xm_sdk_db_upgrade_12_" + j, sts));
                                return;
                            }
                            return;
                        }
                    default:
                        return;
                }
            }
        }
    }

    @Override // com.sankuai.xm.base.db.g.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0198ad297c0e46886e2323e311b713b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0198ad297c0e46886e2323e311b713b6");
            return;
        }
        com.sankuai.xm.im.cache.c.a();
        if (IMClient.a().h() != null && IMClient.a().h().l()) {
            com.sankuai.xm.im.utils.a.b("DataMigrateProcessor::onEnd login success", new Object[0]);
            if (g.a().c()) {
                com.sankuai.xm.im.utils.a.b("DataMigrateProcessor::onEnd migrate clear cache", new Object[0]);
                c();
                g.a().d();
            }
            IMClient.a().i().a(IMClient.a().k(), true, false);
            IMClient.a().j().a(0, (short) 1);
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "955e544db2b838011407e63db0de2ab7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "955e544db2b838011407e63db0de2ab7");
        } else if (this.b) {
        } else {
            this.b = d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x010d, code lost:
        if (r14.contains(r1.toString()) == false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean d() {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.datamigrate.a.d():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(c cVar, long j, long j2) {
        Object[] objArr = {cVar, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c7409421efcbe1211cdbeac55be5659", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c7409421efcbe1211cdbeac55be5659")).booleanValue();
        }
        try {
            try {
                cVar.b();
                a(cVar, PubDBMessage.TABLE_NAME, j2, j, "1", 2);
                a(cVar, PubDBMessage.TABLE_NAME, j2, j, "0", 1);
                a(cVar, GroupDBMessage.TABLE_NAME, j2, j, "1", 2);
                a(cVar, GroupDBMessage.TABLE_NAME, j2, j, "0", 1);
                a(cVar, PersonalDBMessage.TABLE_NAME, j2, j, "1", 2);
                a(cVar, PersonalDBMessage.TABLE_NAME, j2, j, "0", 1);
                cVar.d();
                if (cVar.e()) {
                    cVar.c();
                    return true;
                }
                return true;
            } catch (Exception e) {
                com.sankuai.xm.im.utils.a.c("DBUpgrade12Runnable::run::" + cVar.h() + ",error:" + e.toString(), new Object[0]);
                if (cVar.e()) {
                    cVar.c();
                }
                return false;
            }
        } catch (Throwable th) {
            if (cVar.e()) {
                cVar.c();
            }
            throw th;
        }
    }

    private void a(c cVar, String str, long j, long j2, String str2, int i) {
        Object[] objArr = {cVar, str, new Long(j), new Long(j2), str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0af6604b7593a98845777d18a17ee0b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0af6604b7593a98845777d18a17ee0b7");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("direction", Integer.valueOf(i));
        cVar.a(str, contentValues, "sts>? AND sts<=? AND direction=?", new String[]{String.valueOf(j2), String.valueOf(j), str2});
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.im.datamigrate.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class C1387a extends j {
        public static ChangeQuickRedirect a;
        private c c;
        private long d;
        private com.sankuai.xm.base.trace.g e;

        public C1387a(c cVar, long j) {
            Object[] objArr = {a.this, cVar, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1176b5ea8dd07fe45c4a9bd3e3a7a6d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1176b5ea8dd07fe45c4a9bd3e3a7a6d");
                return;
            }
            this.c = cVar;
            this.d = j;
            this.e = com.sankuai.xm.base.trace.j.a();
        }

        @Override // com.sankuai.xm.base.db.j
        public final j a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7211fa5692a4b355d21b954bdf68357", 6917529027641081856L) ? (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7211fa5692a4b355d21b954bdf68357") : super.a(false);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52a29055ff7cc60630e5915b49951676", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52a29055ff7cc60630e5915b49951676");
                return;
            }
            try {
                com.sankuai.xm.base.trace.j.a(this.e);
                long currentTimeMillis = System.currentTimeMillis();
                b a2 = b.a();
                long j = a2.getLong("xm_sdk_db_upgrade_12_" + this.d, currentTimeMillis);
                b a3 = b.a();
                long j2 = a3.getLong("xm_sdk_db_upgrade_12_init_" + this.d, currentTimeMillis);
                if (j2 >= 0 && j2 - 2592000000L <= j) {
                    a aVar = a.this;
                    c cVar = this.c;
                    long j3 = j - DDLoadConstants.TIME_HOURS_MILLIS;
                    if (aVar.a(cVar, j3, j)) {
                        b a4 = b.a();
                        b.a(a4.a("xm_sdk_db_upgrade_12_" + this.d, j3));
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        if (currentTimeMillis2 > 1000) {
                            com.sankuai.xm.im.cache.c.a(currentTimeMillis2, false, true);
                        }
                        com.sankuai.xm.im.utils.a.b("DBUpgrade12Runnable::run::" + j + CommonConstant.Symbol.COMMA + this.c.h() + ",time:" + currentTimeMillis2, new Object[0]);
                        DBProxy.l().a(new C1387a(this.c, this.d).a(30000L));
                    }
                    com.sankuai.xm.base.trace.j.c(this.e);
                    return;
                }
                com.sankuai.xm.im.cache.c.a(j2 - currentTimeMillis, true, true);
                b a5 = b.a();
                b.a(a5.a("xm_sdk_db_upgrade_12_init_" + this.d, -1L));
                b a6 = b.a();
                b.a(a6.a("xm_sdk_db_upgrade_12_" + this.d));
                com.sankuai.xm.base.trace.j.c(this.e);
            } catch (Throwable th) {
                com.sankuai.xm.base.trace.j.a(this.e, th);
                throw th;
            }
        }
    }
}
