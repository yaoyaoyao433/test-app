package com.sankuai.waimai.platform.mach.extension;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.platform.domain.manager.user.BaseUserManager;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends BaseUserManager.b {
    public static ChangeQuickRedirect a;
    private WeakReference<Mach> b;

    public a(Mach mach) {
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fa45387de8731763d1ee255f43d0004", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fa45387de8731763d1ee255f43d0004");
        } else {
            this.b = new WeakReference<>(mach);
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.user.BaseUserManager.b, com.sankuai.waimai.foundation.core.service.user.b
    public final void onChanged(b.a aVar) {
        Mach mach;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94a9d2d149819302831112181ffdbc9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94a9d2d149819302831112181ffdbc9f");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c015bf200bb27a237e89b8cca30e1043", RobustBitConfig.DEFAULT_VALUE)) {
            mach = (Mach) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c015bf200bb27a237e89b8cca30e1043");
        } else {
            mach = this.b != null ? this.b.get() : null;
        }
        if (mach == null || mach.getUserLoginListener() == null) {
            return;
        }
        if (aVar == b.a.LOGOUT) {
            mach.getUserLoginListener().M();
        } else if (aVar == b.a.LOGIN) {
            mach.getUserLoginListener().a(String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d()), com.sankuai.waimai.platform.domain.manager.user.a.i().g());
        }
    }
}
