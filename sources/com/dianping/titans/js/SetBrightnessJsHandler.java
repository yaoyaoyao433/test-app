package com.dianping.titans.js;

import android.view.WindowManager;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SetBrightnessJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "774afe59a7f5d65248cfb12ef19739b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "774afe59a7f5d65248cfb12ef19739b2");
        } else if (jsBean().argsJson == null) {
            jsCallbackErrorMsg("no argsJson");
        } else {
            try {
                float optDouble = (float) jsBean().argsJson.optDouble("value", -2.0d);
                if (optDouble != -1.0f && (optDouble < 0.0f || optDouble > 1.0f)) {
                    jsCallbackErrorMsg("illegal value");
                    return;
                }
                WindowManager.LayoutParams attributes = jsHost().getActivity().getWindow().getAttributes();
                attributes.screenBrightness = optDouble;
                jsHost().getActivity().getWindow().setAttributes(attributes);
                jsCallback();
            } catch (Exception e) {
                jsCallbackErrorMsg(e.getMessage());
            }
        }
    }
}
