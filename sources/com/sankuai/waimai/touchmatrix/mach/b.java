package com.sankuai.waimai.touchmatrix.mach;

import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.touchmatrix.dialog.e;
import com.sankuai.waimai.touchmatrix.mach.BaseUserManager;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends BaseUserManager.a {
    public static ChangeQuickRedirect a;
    private WeakReference<Mach> b;

    public b(Mach mach) {
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "596bb42e01f94c008a16d3fcbc730c5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "596bb42e01f94c008a16d3fcbc730c5f");
        } else {
            this.b = new WeakReference<>(mach);
        }
    }

    @Override // com.sankuai.waimai.touchmatrix.mach.BaseUserManager.a, com.sankuai.waimai.foundation.core.service.user.b
    public final void onChanged(b.a aVar) {
        Mach mach;
        String str;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef73164e11d1965e1fa03d056eaf865f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef73164e11d1965e1fa03d056eaf865f");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3cba6f6906d4d1f66031f48ce919d771", RobustBitConfig.DEFAULT_VALUE)) {
            mach = (Mach) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3cba6f6906d4d1f66031f48ce919d771");
        } else {
            mach = this.b != null ? this.b.get() : null;
        }
        if (mach == null || mach.getUserLoginListener() == null) {
            return;
        }
        if (aVar == b.a.LOGOUT) {
            mach.getUserLoginListener().M();
        } else if (aVar == b.a.LOGIN) {
            long c = e.a().c();
            e a2 = e.a();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = BaseUserManager.b;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "6776898cfc8d697f14dc6518cd6ce65b", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "6776898cfc8d697f14dc6518cd6ce65b");
            } else {
                User user = BaseUserManager.d().getUser();
                str = user != null ? user.username : "";
            }
            mach.getUserLoginListener().a(String.valueOf(c), str);
        }
    }
}
