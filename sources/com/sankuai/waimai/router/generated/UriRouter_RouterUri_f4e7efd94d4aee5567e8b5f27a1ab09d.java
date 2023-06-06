package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.common.IUriAnnotationInit;
import com.sankuai.waimai.router.common.h;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterUri_f4e7efd94d4aee5567e8b5f27a1ab09d implements IUriAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4330cdb4520f3c809506e0448daa910", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4330cdb4520f3c809506e0448daa910");
        } else {
            hVar.a("meituanwaimai", "waimai.meituan.com", "/chat/1057", "com.meituan.android.ptcommonim.transform.PTIMTransformActivity", false, new i[0]);
        }
    }
}
