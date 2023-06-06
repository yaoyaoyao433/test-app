package com.meituan.android.mrn.module.jshandler.pageRouter;

import com.meituan.android.mrn.router.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ListContainersHandler extends PageRouterBaseJsHandler {
    public static final String KEY = "MRN.listContainers";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.mrn.module.jshandler.pageRouter.PageRouterBaseJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3b7f89be5095b93691bcee3cd6cb564", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3b7f89be5095b93691bcee3cd6cb564");
            return;
        }
        super.exec();
        try {
            List<a> c = this.mPageRouter.c();
            JSONArray jSONArray = new JSONArray();
            for (a aVar : c) {
                jSONArray.put(aVar.b());
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", jSONArray.toString());
            jsCallback(jSONObject);
        } catch (Throwable th) {
            jsCallbackError(th);
        }
    }
}
