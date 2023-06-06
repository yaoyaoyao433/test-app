package com.sankuai.waimai.business.knb.handlers;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.manager.crawler.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PassCrawlerVerificationHandler extends TakeoutBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e94bf6956cc5fbc807baec86c7d9737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e94bf6956cc5fbc807baec86c7d9737");
            return;
        }
        a.a().b();
        jsHost().finish();
    }
}
