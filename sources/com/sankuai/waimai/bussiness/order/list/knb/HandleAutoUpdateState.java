package com.sankuai.waimai.bussiness.order.list.knb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.persistent.sp.a;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HandleAutoUpdateState extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "Vo+pkQ2kA/MDTTjGIz4+zdGGQQ75EJA0AINh0WbX8ctffoaqgtH5HZe8jNPMVRGdq0Pv86JwX1it7zOCd4LydQ==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88ec2c596541d0991e6599477585990b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88ec2c596541d0991e6599477585990b");
        } else if (validateArgs()) {
            try {
                JSONObject jSONObject = jsBean().argsJson;
                int optInt = jSONObject.optInt("type");
                boolean optBoolean = jSONObject.optBoolean("isAuto");
                Activity activity = jsHost().getActivity();
                if (activity != null && !activity.isFinishing()) {
                    if (optInt == 1) {
                        getSwitchState(activity);
                    } else if (optInt == 2) {
                        setAutoUpdateState(activity, optBoolean);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setAutoUpdateState(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aec94184c4acaca1a2b7679ede8cf8dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aec94184c4acaca1a2b7679ede8cf8dd");
        } else {
            a.a(activity, "auto_update_switch", z);
        }
    }

    public void getSwitchState(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "057ac23af331ed31b60f5ab4672e07fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "057ac23af331ed31b60f5ab4672e07fa");
            return;
        }
        boolean b = a.b((Context) activity, "auto_update_switch", true);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isAuto", b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        jsCallback(jSONObject);
    }

    public boolean validateArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "058fc73962a33ac8cce377d4b0b821af", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "058fc73962a33ac8cce377d4b0b821af")).booleanValue();
        }
        JsBean jsBean = jsBean();
        return (jsBean == null || TextUtils.isEmpty(jsBean.args) || jsBean.argsJson == null) ? false : true;
    }
}
