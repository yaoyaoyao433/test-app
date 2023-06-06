package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.provider.scheme.handler.b;
import com.sankuai.meituan.takeoutnew.provider.scheme.handler.d;
import com.sankuai.waimai.router.common.IUriAnnotationInit;
import com.sankuai.waimai.router.common.h;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterUri_fe8ae569de45dcc42826190ce9e3bb47 implements IUriAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c76f0b3ce65861c47e18e19ca15a053", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c76f0b3ce65861c47e18e19ca15a053");
            return;
        }
        hVar.a("", "", "/welcome", "com.sankuai.meituan.takeoutnew.ui.page.boot.WelcomeActivity", false, new i[0]);
        hVar.a("", "", "/chat/1001", new d(), false, new i[0]);
        hVar.a("", "", "/b2cimmessage", new d(), false, new i[0]);
        hVar.a("", "", "/immessage", new d(), false, new i[0]);
        hVar.a("", "", "/chat/1025", new d(), false, new i[0]);
        hVar.a("", "", "/account/bindphone", new d(), false, new i[0]);
        hVar.a("", "", "/goodscollections", new d(), false, new i[0]);
        hVar.a("", "", "/chat/1036", new d(), false, new i[0]);
        hVar.a("", "", "/chat/1050", new d(), false, new i[0]);
        hVar.a("", "", "/locatemanuallymmp", new d(), false, new i[0]);
        hVar.a("", "", "/browser", new com.sankuai.meituan.takeoutnew.provider.scheme.handler.a(), true, new i[0]);
        hVar.a("", "", "/login", new b(), false, new i[0]);
    }
}
