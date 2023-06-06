package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
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
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SetTitleBarJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79b2eab33ce4356d7187cd58e122a750", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79b2eab33ce4356d7187cd58e122a750");
            return;
        }
        try {
            String optString = jsBean().argsJson.optString("model");
            if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("no model");
                return;
            }
            JsHost jsHost = jsHost();
            if (!(jsHost instanceof KNBJsHost)) {
                jsCallbackErrorMsg("knb only");
                return;
            }
            KNBJsHost kNBJsHost = (KNBJsHost) jsHost;
            LineTitleLayout dynamicTitleBar = kNBJsHost.getDynamicTitleBar();
            if (dynamicTitleBar == null) {
                jsCallbackErrorMsg("no dynamic title bar");
                return;
            }
            Pair<LineTitleLayout, ZIndexFrameLayout.LayoutParams> parse = DynamicTitleParser.parse(kNBJsHost.getContext(), dynamicTitleBar, new JSONObject(optString), new JsHostResourceProvider(jsHost));
            if (parse != null && parse.first != null) {
                boolean z = true;
                if (dynamicTitleBar == parse.first && dynamicTitleBar.getParent() != null) {
                    dynamicTitleBar.setLayoutParams((ViewGroup.LayoutParams) parse.second);
                } else {
                    z = kNBJsHost.setDynamicTitleBar((LineTitleLayout) parse.first, (ViewGroup.LayoutParams) parse.second);
                }
                if (z) {
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
