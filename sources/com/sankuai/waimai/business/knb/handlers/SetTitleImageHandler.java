package com.sankuai.waimai.business.knb.handlers;

import com.dianping.titans.ui.ITitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SetTitleImageHandler extends TakeoutBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5246d44d7f8b6242dcde4e4d0ea5a2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5246d44d7f8b6242dcde4e4d0ea5a2f");
        } else if (validateArgs()) {
            String optString = jsBean().argsJson.optString("titleImageUrl");
            ITitleBar titleBarHost = jsHost().getTitleBarHost();
            if (titleBarHost instanceof g) {
                ((g) titleBarHost).setTitleImg(optString);
            }
        }
    }
}
