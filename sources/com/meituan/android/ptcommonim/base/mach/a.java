package com.meituan.android.ptcommonim.base.mach;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.c;
import com.sankuai.waimai.mach.k;
import com.squareup.picasso.Picasso;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.c
    public final void a(c.a aVar, k kVar) {
        Object[] objArr = {aVar, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39ad93f4e24972b72e60ad34089c6094", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39ad93f4e24972b72e60ad34089c6094");
        } else {
            Picasso.g(kVar.c()).d(aVar.b.c).a(kVar.a());
        }
    }
}
