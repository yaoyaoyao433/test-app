package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.common.IUriAnnotationInit;
import com.sankuai.waimai.router.common.h;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterUri_330d531674493ce6932ab698c94966c5 implements IUriAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a172f977aa257f99589f2ffa5e588df3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a172f977aa257f99589f2ffa5e588df3");
            return;
        }
        hVar.a("", "", "/takeout/assistantinject", "com.sankuai.waimai.sa.activity.SmartAssistantActivity", false, new i[0]);
        hVar.a("", "", "/assistantinject", "com.sankuai.waimai.sa.activity.SmartAssistantActivity", false, new i[0]);
        hVar.a("", "", "/takeout/smartassistant", "com.sankuai.waimai.sa.activity.SmartAssistanInjectActivity", false, new i[0]);
        hVar.a("", "", "/smartassistant", "com.sankuai.waimai.sa.activity.SmartAssistanInjectActivity", false, new i[0]);
    }
}
