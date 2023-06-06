package com.sankuai.waimai.store.im.base;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.IMClient;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class k {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static final k a = new k();
    }

    public k() {
    }

    public final boolean a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2388973c70a3af23e1b3118496a99e67", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2388973c70a3af23e1b3118496a99e67")).booleanValue();
        }
        if (a()) {
            com.sankuai.waimai.store.im.base.log.b.a(activity, str);
            if (activity == null || activity.getApplication() == null) {
                return false;
            }
            com.sankuai.waimai.imbase.manager.b.a().a(activity.getApplication());
            return true;
        }
        return true;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07554f263e0eab5b440ec4af24127064", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07554f263e0eab5b440ec4af24127064")).booleanValue() : !IMClient.a().p();
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e29c595e3d66b0cce1801fc2ee7abaea", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e29c595e3d66b0cce1801fc2ee7abaea")).booleanValue() : com.sankuai.waimai.imbase.manager.b.a().a();
    }
}
