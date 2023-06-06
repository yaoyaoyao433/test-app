package com.sankuai.waimai.store.mach.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.store.i.user.a;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements com.sankuai.waimai.store.i.user.a {
    public static ChangeQuickRedirect a;
    private WeakReference<Mach> b;

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.b bVar) {
    }

    public a(Mach mach) {
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "756fac44bd005ac3fdbfa12b35c52248", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "756fac44bd005ac3fdbfa12b35c52248");
        } else {
            this.b = new WeakReference<>(mach);
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.EnumC1205a enumC1205a) {
        Mach mach;
        Object[] objArr = {enumC1205a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c5c4bb9632a8aa65d53d13ad7e11070", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c5c4bb9632a8aa65d53d13ad7e11070");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ec0cbd94fae41a2c1c4926784c63cd6", RobustBitConfig.DEFAULT_VALUE)) {
            mach = (Mach) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ec0cbd94fae41a2c1c4926784c63cd6");
        } else {
            mach = this.b != null ? this.b.get() : null;
        }
        if (mach == null || mach.getUserLoginListener() == null) {
            return;
        }
        if (enumC1205a == a.EnumC1205a.LOGOUT) {
            mach.getUserLoginListener().M();
        } else if (enumC1205a == a.EnumC1205a.LOGIN) {
            long c = com.sankuai.waimai.store.manager.user.a.a().c();
            com.sankuai.waimai.store.manager.user.a a2 = com.sankuai.waimai.store.manager.user.a.a();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.manager.user.a.c;
            mach.getUserLoginListener().a(String.valueOf(c), PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "b4e890ee842de9b2004a69a8ce45640d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "b4e890ee842de9b2004a69a8ce45640d") : com.sankuai.waimai.platform.domain.manager.user.a.i().g());
        }
    }
}
