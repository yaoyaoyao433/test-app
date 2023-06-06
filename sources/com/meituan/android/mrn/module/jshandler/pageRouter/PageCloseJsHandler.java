package com.meituan.android.mrn.module.jshandler.pageRouter;

import com.meituan.android.mrn.router.f;
import com.meituan.android.mrn.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PageCloseJsHandler extends PageRouterBaseJsHandler {
    public static final String KEY = "MRN.closePage";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.mrn.module.jshandler.pageRouter.PageRouterBaseJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31665a8e192ed6088488f2e9f7e0e365", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31665a8e192ed6088488f2e9f7e0e365");
            return;
        }
        super.exec();
        ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.jshandler.pageRouter.PageCloseJsHandler.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "94bccd370726e9beeaa7c3b2cc1a086e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "94bccd370726e9beeaa7c3b2cc1a086e");
                } else {
                    PageCloseJsHandler.this.execOnUiThread();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void execOnUiThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7e35ae16b6c9ff2a53dd67aaa22825e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7e35ae16b6c9ff2a53dd67aaa22825e");
            return;
        }
        JSONObject paramJSONObject = getParamJSONObject();
        try {
            this.mPageRouter.a(paramJSONObject != null ? paramJSONObject.optString("id") : null);
            jsCallback();
        } catch (f.a unused) {
        } catch (Exception e) {
            e.printStackTrace();
            jsCallbackError(e);
        }
    }
}
