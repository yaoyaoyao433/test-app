package com.dianping.titans.js.jshandler;

import com.dianping.titans.js.KNBJsHost;
import com.dianping.titans.widget.SearchTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SetSearchBarJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        SearchTitleBar searchTitleBar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ffeae97b1f2c9efef26b251926d6dbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ffeae97b1f2c9efef26b251926d6dbe");
            return;
        }
        if (!(jsHost().getTitleBarHost() instanceof SearchTitleBar)) {
            searchTitleBar = new SearchTitleBar(jsHost().getContext());
            jsHost().replaceTitleBar(searchTitleBar);
        } else {
            searchTitleBar = (SearchTitleBar) jsHost().getTitleBarHost();
        }
        jsHost().getTitleBarHost().setTitleContentParams(jsBean().argsJson);
        searchTitleBar.setSearchIcon(((KNBJsHost) jsHost()).getUIManager().getSearchBarIconId());
        jsCallback();
    }
}
