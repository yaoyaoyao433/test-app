package com.dianping.titans.js.jshandler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.util.WebUtil;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SetBackgroundColorJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a5609714c251f3e080bbaacbecbf5bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a5609714c251f3e080bbaacbecbf5bd");
            return;
        }
        try {
            jsHost().setBackgroundColor(WebUtil.getRGBAColor(jsBean().argsJson.optString("color")));
            jsCallback();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
