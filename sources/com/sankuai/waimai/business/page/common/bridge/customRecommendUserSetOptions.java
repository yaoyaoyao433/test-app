package com.sankuai.waimai.business.page.common.bridge;

import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.settings.PersonalizedSetting;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class customRecommendUserSetOptions extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "qs7awtVYBqTNR28QikI9Ligv4FQSYjDnF+ErOkPjhcVcSz8JBoGbjelQXm/t7RmyEpSxhZS9YzmXp8eTVHpLGw==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d4de0386c01c6faa26c8a979b9a4e98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d4de0386c01c6faa26c8a979b9a4e98");
        } else {
            PersonalizedSetting.a().c();
        }
    }
}
