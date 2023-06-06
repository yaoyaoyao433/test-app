package com.sankuai.xm.imextra.db;

import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.db.BaseDBProxy;
import com.sankuai.xm.base.db.c;
import com.sankuai.xm.base.db.i;
import com.sankuai.xm.base.db.l;
import com.sankuai.xm.base.g;
import com.sankuai.xm.base.k;
import com.sankuai.xm.base.tinyorm.f;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.im.cache.j;
import com.sankuai.xm.imextra.impl.sessionpresent.db.DBSessionMsgSpecialTag;
import com.sankuai.xm.imextra.impl.sessionpresent.db.a;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class IMExtraDBProxy extends BaseDBProxy {
    public static ChangeQuickRedirect j;
    public a k;
    private volatile long l;
    private final g m;
    private i n;

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final int b(String str) {
        return 2;
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final String c() {
        return "0_im_extra.db";
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final void e(c cVar) {
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final i i() {
        return null;
    }

    public IMExtraDBProxy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5494f51820067aae0d001d4986e26d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5494f51820067aae0d001d4986e26d2");
            return;
        }
        this.m = new k();
        this.n = new i() { // from class: com.sankuai.xm.imextra.db.IMExtraDBProxy.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.db.i
            public final void b(c cVar, int i, int i2) {
            }

            @Override // com.sankuai.xm.base.db.i
            public final void a(c cVar) {
                Object[] objArr2 = {cVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4bd50a32f75592bb885aaf38fe6bd5a8", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4bd50a32f75592bb885aaf38fe6bd5a8");
                } else {
                    f.a().a(cVar, DBSessionMsgSpecialTag.class);
                }
            }

            @Override // com.sankuai.xm.base.db.i
            public final void a(c cVar, int i, int i2) {
                Object[] objArr2 = {cVar, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe8927892b5bffaa0a24093d85f13179", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe8927892b5bffaa0a24093d85f13179");
                } else if (i != 1) {
                } else {
                    cVar.a(String.format("alter table %s add COLUMN %s %s default %s", DBSessionMsgSpecialTag.TABLE, "source", DataConstants.TYPE.INTEGER, 0));
                }
            }
        };
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c358913aaec295861a5c21631d0589ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c358913aaec295861a5c21631d0589ed");
        } else {
            this.k = new a(this);
        }
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final void d(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7349b1a0f04da62fb117df9f2eff160", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7349b1a0f04da62fb117df9f2eff160");
            return;
        }
        final a aVar = this.k;
        final long a = com.sankuai.xm.login.a.a().c().a();
        Object[] objArr2 = {new Long(a)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "3a463f982d5e46b8c76acd0c60c8d594", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "3a463f982d5e46b8c76acd0c60c8d594");
        } else {
            aVar.b.a(new Runnable() { // from class: com.sankuai.xm.imextra.impl.sessionpresent.db.a.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "937628cad90ef7b60990f4cc13be6b3b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "937628cad90ef7b60990f4cc13be6b3b");
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(a);
                    com.sankuai.xm.log.c.b("SessionMsgSpecialTagTableProxy", "clear before %d, deleted %d", Long.valueOf(a), Integer.valueOf(b.b(a.a(a.this, new j[]{j.a(com.sankuai.xm.imextra.service.chatpresent.a.TERMINAL, sb.toString(), "<", false)}))));
                }
            }, (com.sankuai.xm.im.a<Void>) null);
        }
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19239b0b6996dd649629f24be7aae319", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19239b0b6996dd649629f24be7aae319");
        }
        return this.l + "_im_extra.db";
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac06fb4166dff91c529e45eeb09cc1f1", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac06fb4166dff91c529e45eeb09cc1f1") : !com.sankuai.xm.base.db.g.a().f() ? "" : l.b(this.c, "im_extra.db");
    }

    @Override // com.sankuai.xm.base.service.a
    public final void a(final long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeaed9d89890cc7cd5e586d6323ad3b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeaed9d89890cc7cd5e586d6323ad3b1");
            return;
        }
        super.a(j2);
        if (j2 == 0) {
            this.l = 0L;
            a((Callback<Void>) null);
        } else if (this.l == j2 || !this.m.b(-1)) {
        } else {
            a(j2 + "_im_extra.db", new com.sankuai.xm.im.a<Boolean>() { // from class: com.sankuai.xm.imextra.db.IMExtraDBProxy.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj) {
                    Object[] objArr2 = {(Boolean) obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60815524f07b4abc41801876ca4e8464", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60815524f07b4abc41801876ca4e8464");
                    } else {
                        IMExtraDBProxy.this.l = j2;
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee5d78e222fb7d21cc46ac0b40f4e27b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee5d78e222fb7d21cc46ac0b40f4e27b");
                    } else {
                        IMExtraDBProxy.this.l = 0L;
                    }
                }
            });
        }
    }

    @Override // com.sankuai.xm.base.service.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0940356e200df7cb11b2ffa9334939c9", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0940356e200df7cb11b2ffa9334939c9")).intValue();
        }
        d();
        com.sankuai.xm.base.db.a aVar = new com.sankuai.xm.base.db.a(2, this.n);
        aVar.d = 15;
        a(com.sankuai.xm.base.f.m().g(), aVar, "", false);
        return super.a();
    }

    public final void a(Runnable runnable, com.sankuai.xm.im.a<Void> aVar) {
        Object[] objArr = {runnable, null};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fca5bab3ebd88ba5a81ee460536e1c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fca5bab3ebd88ba5a81ee460536e1c8");
        } else {
            a(runnable, true, null);
        }
    }
}
