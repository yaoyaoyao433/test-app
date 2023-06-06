package com.dianping.titans.js.jshandler;

import android.support.constraint.R;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.titans.js.JsHost;
import com.dianping.titans.js.KNBJsHost;
import com.dianping.titans.widget.DynamicTitleParser;
import com.dianping.titans.widget.LineTitleLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.JsHostResourceProvider;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AddTitleBarElementJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee5d3ebf631fde2617c0f9c07306772f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee5d3ebf631fde2617c0f9c07306772f");
            return;
        }
        try {
            JSONObject jSONObject = jsBean().argsJson;
            String optString = jSONObject.optString("name", "");
            JsHost jsHost = jsHost();
            if (!(jsHost instanceof KNBJsHost)) {
                jsCallbackErrorMsg("knb only");
                return;
            }
            LineTitleLayout dynamicTitleBar = ((KNBJsHost) jsHost).getDynamicTitleBar();
            if (dynamicTitleBar == null) {
                jsCallbackErrorMsg("no dynamic title bar");
                return;
            }
            int childIndex = dynamicTitleBar.getChildIndex(optString);
            String optString2 = jSONObject.optString("model");
            if (TextUtils.isEmpty(optString2)) {
                jsCallbackErrorMsg("no model");
                return;
            }
            JSONObject jSONObject2 = new JSONObject(optString2);
            String optString3 = jSONObject2.optString("name", "");
            if (TextUtils.isEmpty(optString3)) {
                jsCallbackErrorMsg("no name");
            } else if (dynamicTitleBar.getChildIndex(optString3) >= 0) {
                jsCallbackErrorMsg("exist " + optString3);
            } else {
                String optString4 = jSONObject2.optString("type");
                if (TextUtils.isEmpty(optString4)) {
                    jsCallbackErrorMsg("no type");
                    return;
                }
                DynamicTitleParser.ElementParser elementParser = DynamicTitleParser.getElementParser(optString4);
                if (elementParser == null) {
                    jsCallbackErrorMsg("not support: " + optString4);
                    return;
                }
                Object tag = dynamicTitleBar.getTag(R.id.dynamicBaseStyleTag);
                Pair<View, LineTitleLayout.LayoutParams> parse = elementParser.parse(jsHost.getContext(), null, tag instanceof DynamicTitleParser.BaseStyle ? (DynamicTitleParser.BaseStyle) tag : null, jSONObject2, new JsHostResourceProvider(jsHost));
                if (parse != null && parse.first != null) {
                    dynamicTitleBar.addView((View) parse.first, childIndex, (ViewGroup.LayoutParams) parse.second);
                    jsCallback();
                    return;
                }
                jsCallbackErrorMsg("parse error");
            }
        } catch (Throwable th) {
            jsCallbackErrorMsg(th.getMessage());
        }
    }
}
