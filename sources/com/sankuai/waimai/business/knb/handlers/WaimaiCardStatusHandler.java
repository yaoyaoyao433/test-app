package com.sankuai.waimai.business.knb.handlers;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.manager.observers.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WaimaiCardStatusHandler extends TakeoutBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdfd79b7fef5d3d0ab8faa39441e9ed1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdfd79b7fef5d3d0ab8faa39441e9ed1");
        } else if (validateArgs()) {
            a.a().a(jsBean().argsJson.optInt("status"));
        }
    }
}
