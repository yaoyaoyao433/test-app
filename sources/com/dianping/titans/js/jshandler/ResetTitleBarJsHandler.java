package com.dianping.titans.js.jshandler;

import android.util.Pair;
import android.view.ViewGroup;
import com.dianping.titans.js.JsHost;
import com.dianping.titans.js.KNBJsHost;
import com.dianping.titans.widget.DynamicTitleParser;
import com.dianping.titans.widget.LineTitleLayout;
import com.dianping.titans.widget.ZIndexFrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.JsHostResourceProvider;
import com.sankuai.meituan.android.knb.KNBConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ResetTitleBarJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e61f2857039eafe341e63fe1181788b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e61f2857039eafe341e63fe1181788b");
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) KNBConfig.getConfig(KNBConfig.CONFIG_DESIGN_TITLE_BAR, JSONObject.class, null);
            if (jSONObject == null) {
                jsCallbackErrorMsg("no default config");
                return;
            }
            JsHost jsHost = jsHost();
            if (!(jsHost instanceof KNBJsHost)) {
                jsCallbackErrorMsg("knb only");
                return;
            }
            KNBJsHost kNBJsHost = (KNBJsHost) jsHost;
            Pair<LineTitleLayout, ZIndexFrameLayout.LayoutParams> parse = DynamicTitleParser.parse(jsHost.getContext(), jSONObject, new JsHostResourceProvider(jsHost));
            if (parse != null && parse.first != null) {
                if (kNBJsHost.setDynamicTitleBar((LineTitleLayout) parse.first, (ViewGroup.LayoutParams) parse.second)) {
                    jsCallback();
                    return;
                } else {
                    jsCallbackErrorMsg("set error");
                    return;
                }
            }
            jsCallbackErrorMsg("parse error");
        } catch (Throwable th) {
            jsCallbackErrorMsg(th.getMessage());
        }
    }
}
