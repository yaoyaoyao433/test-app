package com.sankuai.eh.component.web.bridge;

import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EHShowModalJsHandler extends EHBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.eh.component.web.bridge.EHBaseJsHandler
    public void innerExec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cad95402a86346ec8532172a1c9e8b59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cad95402a86346ec8532172a1c9e8b59");
        } else {
            jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, "not implemented");
        }
    }
}
