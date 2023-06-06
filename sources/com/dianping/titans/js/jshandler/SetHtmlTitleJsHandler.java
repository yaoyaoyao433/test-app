package com.dianping.titans.js.jshandler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SetHtmlTitleJsHandler extends SetTitleJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.SetTitleJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a96c9984a1039165e4df33ca0a567df4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a96c9984a1039165e4df33ca0a567df4");
        } else {
            super.exec();
        }
    }
}
