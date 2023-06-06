package com.sankuai.eh.component.web.bridge;

import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.e;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class EHBaseJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected com.sankuai.eh.component.web.module.c cContext;

    public abstract void innerExec();

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7eddf3837d0ae30bf41be91ab647cd2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7eddf3837d0ae30bf41be91ab647cd2e");
            return;
        }
        try {
            d.a("js_handler", jsBean().method + " : " + e.b(jsHost().getUrl()));
            this.cContext = getComponentContext();
            innerExec();
        } catch (Exception e) {
            jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, e.getMessage());
        }
    }

    private com.sankuai.eh.component.web.module.c getComponentContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95a5a3f1f4b7b322ae91d11a2718244f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.eh.component.web.module.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95a5a3f1f4b7b322ae91d11a2718244f");
        }
        if (jsHost().getWebView() != null && (jsHost().getWebView().getTag() instanceof com.sankuai.eh.component.web.module.c)) {
            return (com.sankuai.eh.component.web.module.c) jsHost().getWebView().getTag();
        }
        if (com.sankuai.eh.component.web.plugins.core.b.a(jsHost().getActivity()) != null) {
            return com.sankuai.eh.component.web.plugins.core.b.a(jsHost().getActivity());
        }
        return null;
    }
}
