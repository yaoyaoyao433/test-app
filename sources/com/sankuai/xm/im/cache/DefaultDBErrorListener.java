package com.sankuai.xm.im.cache;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.db.DBCorruptException;
import com.sankuai.xm.im.IMClient;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DefaultDBErrorListener implements com.sankuai.xm.base.db.e {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.base.db.e
    public final void a(com.sankuai.xm.base.db.f fVar) {
        long e;
        String i;
        boolean d;
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b200610910dfbe1c61e9d0bc47c41b3c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b200610910dfbe1c61e9d0bc47c41b3c");
        } else if (fVar instanceof DBCorruptException) {
            synchronized (com.sankuai.xm.login.a.a()) {
                e = com.sankuai.xm.login.a.a().e();
                i = com.sankuai.xm.login.a.a().i();
                d = com.sankuai.xm.login.a.a().d();
            }
            IMClient.a().t();
            IMClient.a().a(-1);
            com.sankuai.xm.im.utils.a.b("DefaultDBErrorListener::onError, 修复数据库完成，重新同步数据", new Object[0]);
            if (e == 0 || TextUtils.isEmpty(i)) {
                return;
            }
            if (d) {
                com.sankuai.xm.login.c.a().e();
            } else {
                IMClient.a().a(e, i);
            }
        }
    }
}
