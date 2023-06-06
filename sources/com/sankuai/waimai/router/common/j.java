package com.sankuai.waimai.router.common;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class j extends com.sankuai.waimai.router.core.h {
    public static ChangeQuickRedirect a;
    private final com.sankuai.waimai.router.core.h b;

    @Override // com.sankuai.waimai.router.core.h
    public boolean a(@NonNull com.sankuai.waimai.router.core.j jVar) {
        return true;
    }

    public j(com.sankuai.waimai.router.core.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c2a6882c3c86613f6b861901414345c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c2a6882c3c86613f6b861901414345c");
        } else {
            this.b = hVar;
        }
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void a(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull com.sankuai.waimai.router.core.g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66ee77361d58f8d7cfa89d2d873f10dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66ee77361d58f8d7cfa89d2d873f10dd");
        } else {
            this.b.b(jVar, gVar);
        }
    }

    @Override // com.sankuai.waimai.router.core.h
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00739610c16d37ac3d7a950ce149eeed", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00739610c16d37ac3d7a950ce149eeed");
        }
        return "Delegate(" + this.b.toString() + CommonConstant.Symbol.BRACKET_RIGHT;
    }
}
