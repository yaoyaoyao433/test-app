package com.dianping.titans.js.jshandler;

import android.animation.ObjectAnimator;
import android.os.Build;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.titans.ui.ITitleBar;
import com.dianping.titans.ui.ITitleBarV2;
import com.dianping.titans.widget.BaseTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.util.WebUtil;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SetNavigationBarJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c387aece620312579e33eb0ef4186686", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c387aece620312579e33eb0ef4186686");
        } else if (jsHost() == null || jsHost().getActivity() == null) {
            jsCallbackErrorMsg("no host");
        } else {
            JSONObject jSONObject = jsBean().argsJson;
            boolean has = jSONObject.has("backgroundColor");
            boolean has2 = jSONObject.has("color");
            String optString = has ? jSONObject.optString("backgroundColor") : "#FFFFFF";
            String optString2 = has2 ? jSONObject.optString("color") : "#222222";
            boolean optBoolean = jSONObject.optBoolean(DMKeys.KEY_SHARE_INFO_ANIMATED, false);
            ITitleBar titleBarHost = jsHost().getTitleBarHost();
            if (titleBarHost instanceof ITitleBarV2) {
                try {
                    int rGBAColor = WebUtil.getRGBAColor(optString);
                    int rGBAColor2 = WebUtil.getRGBAColor(optString2);
                    if (optBoolean && Build.VERSION.SDK_INT >= 21) {
                        ObjectAnimator.ofArgb(new BackGroundColorHolder((ITitleBarV2) titleBarHost), "color", ((ITitleBarV2) titleBarHost).getBackgroundColor(), rGBAColor).setDuration(500L).start();
                    } else {
                        titleBarHost.setBackgroundColor(rGBAColor);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("color", rGBAColor2);
                    ((BaseTitleBar) titleBarHost).getTitleContentV2().setTitleContentParams(jSONObject2);
                    jsCallback();
                    return;
                } catch (Exception e) {
                    jsCallbackErrorMsg(e.getMessage());
                    return;
                }
            }
            jsCallbackErrorMsg("no support");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class BackGroundColorHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public ITitleBarV2 bar;

        public BackGroundColorHolder(ITitleBarV2 iTitleBarV2) {
            Object[] objArr = {SetNavigationBarJsHandler.this, iTitleBarV2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0768e00cc7a8e75ffc93fc99c83733cd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0768e00cc7a8e75ffc93fc99c83733cd");
                return;
            }
            this.bar = null;
            this.bar = iTitleBarV2;
        }

        public void setColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa108f71a0bfdfd3492e5746d30801e5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa108f71a0bfdfd3492e5746d30801e5");
            } else if (this.bar != null) {
                this.bar.setBackgroundColor(i);
            }
        }
    }
}
