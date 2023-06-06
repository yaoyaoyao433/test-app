package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.provider.scheme.handler.c;
import com.sankuai.meituan.takeoutnew.provider.scheme.handler.d;
import com.sankuai.waimai.router.common.IPageAnnotationInit;
import com.sankuai.waimai.router.common.e;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterPage_a212a282d75a14c433c25f5da65717a2 implements IPageAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd7016a3a7a326c862fb19dbe79d5a9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd7016a3a7a326c862fb19dbe79d5a9c");
            return;
        }
        eVar.a("/shareshadow", "com.sankuai.meituan.takeoutnew.manager.share.ShareShadowActivity", new i[0]);
        eVar.a("/welcome", "com.sankuai.meituan.takeoutnew.ui.page.boot.WelcomeActivity", new i[0]);
        eVar.a("/scanqrcode", "com.sankuai.meituan.takeoutnew.scan.WMScanQRCodeActivity", new i[0]);
        eVar.a("/mainpageactivity", new c(), new i[0]);
        eVar.a("/bindphone", new d(), new i[0]);
        eVar.a("/takeouttip", new d(), new i[0]);
        eVar.a("/wmverification", new d(), new i[0]);
        eVar.a("/goodscollection", new d(), new i[0]);
        eVar.a("/couponContainer", new d(), new i[0]);
        eVar.a("/locatemanuallymmp", new d(), new i[0]);
    }
}
