package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import com.dianping.titans.widget.BaseTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SetTitleJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "737e1cb038fb8000450f61c72ac04ae4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "737e1cb038fb8000450f61c72ac04ae4");
            return;
        }
        String optString = jsBean().argsJson.optString("title");
        if (!TextUtils.isEmpty(jsBean().argsJson.optString("subtitle"))) {
            jsHost().getTitleBarHost().setTitleContentParams(jsBean().argsJson);
        } else {
            jsHost().setTitle(optString);
        }
        if (jsHost().getTitleBarHost() instanceof BaseTitleBar) {
            ((BaseTitleBar) jsHost().getTitleBarHost()).setOnTitleBarEventListener(new BaseTitleBar.OnTitleBarEventListener() { // from class: com.dianping.titans.js.jshandler.SetTitleJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.titans.widget.BaseTitleBar.OnTitleBarEventListener
                public void onEvent(JSONObject jSONObject) {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4c6bbccbaf6ab23a55b1fd4c76b10afd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4c6bbccbaf6ab23a55b1fd4c76b10afd");
                    } else {
                        SetTitleJsHandler.this.jsCallback(jSONObject);
                    }
                }
            });
        }
        jsCallback();
    }
}
