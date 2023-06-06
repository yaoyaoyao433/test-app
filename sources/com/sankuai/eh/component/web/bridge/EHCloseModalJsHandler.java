package com.sankuai.eh.component.web.bridge;

import com.meituan.android.neohybrid.core.config.UIConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.web.plugins.e;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EHCloseModalJsHandler extends EHBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.eh.component.web.bridge.EHBaseJsHandler
    public void innerExec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4a646702ac28bce93f6f815a27bf06d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4a646702ac28bce93f6f815a27bf06d");
        } else if (this.cContext != null) {
            e b = this.cContext.b(UIConfig.MODAL);
            if (b instanceof com.sankuai.eh.component.web.modal.e) {
                ((com.sankuai.eh.component.web.modal.e) b).e();
            }
        }
    }
}
