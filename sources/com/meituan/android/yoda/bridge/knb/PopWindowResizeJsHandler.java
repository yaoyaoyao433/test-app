package com.meituan.android.yoda.bridge.knb;

import android.app.Activity;
import android.graphics.Point;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.dianping.titans.js.DelegatedJsHandler;
import com.dianping.titansmodel.g;
import com.google.gson.Gson;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.android.yoda.bridge.knb.message.WindowResizeParam;
import com.meituan.android.yoda.fragment.YodaKNBDialogFragment;
import com.meituan.android.yoda.monitor.log.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PopWindowResizeJsHandler extends DelegatedJsHandler<WindowResizeParam, g> {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final String sTAG = "PopWindowResizeJsHandler";

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "Imx88IWhmPPEArev+sCV1YdO5Fv4GANaKr2NM3b27nsfa0ZYFrmFNI8KVCPUBpmoSlsJCW17jCB00G8m6OitIA==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22a8003e32bbf339b595a22c550ee545", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22a8003e32bbf339b595a22c550ee545");
            return;
        }
        a.a(sTAG, ", exec() start.", true);
        try {
            if (jsHost() != null) {
                Activity activity = jsHost().getActivity();
                if (activity instanceof FragmentActivity) {
                    Fragment findFragmentByTag = ((FragmentActivity) activity).getSupportFragmentManager().findFragmentByTag(YodaKNBDialogFragment.c());
                    if (findFragmentByTag != null && (findFragmentByTag instanceof YodaKNBDialogFragment)) {
                        if (findFragmentByTag.isVisible()) {
                            YodaKNBDialogFragment yodaKNBDialogFragment = (YodaKNBDialogFragment) findFragmentByTag;
                            if (jsBean() != null && jsBean().argsJson != null) {
                                a.a(sTAG, ", h5 bridge argsJson = " + jsBean().argsJson.toString(), true);
                                WindowResizeParam parseParams = parseParams(jsBean().argsJson.getJSONObject("params"));
                                a.a(sTAG, ", h5 bridge param.width = " + parseParams.width + ", param.height = " + parseParams.height, true);
                                Point point = new Point();
                                point.x = parseParams.width;
                                point.y = parseParams.height;
                                yodaKNBDialogFragment.a(point);
                                successCallback(null);
                                return;
                            }
                            a.a(sTAG, ", h5 bridge param = null", true);
                        } else {
                            a.a(sTAG, "fragment is not visible.", true);
                        }
                    } else {
                        a.a(sTAG, "fragment is not YodaKNBDialogFragment.", true);
                    }
                }
            }
        } catch (Exception e) {
            a.a(sTAG, ", exception = " + e.getMessage(), true);
            failCallback(makeExceptionResult(e));
        }
        failCallback(makeRejectResult());
    }

    private WindowResizeParam parseParams(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "146accf93a4334717ffbf4c586c5613d", RobustBitConfig.DEFAULT_VALUE)) {
            return (WindowResizeParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "146accf93a4334717ffbf4c586c5613d");
        }
        if (jSONObject != null) {
            return (WindowResizeParam) new Gson().fromJson(jSONObject.toString(), (Class<Object>) WindowResizeParam.class);
        }
        return null;
    }

    private g makeExceptionResult(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e16ef7dc2b5e51a9ade11c3ad00334c", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e16ef7dc2b5e51a9ade11c3ad00334c");
        }
        g gVar = new g();
        gVar.errorCode = 0;
        gVar.errorMsg = exc == null ? LogMonitor.EXCEPTION_TAG : exc.getMessage();
        gVar.status = "fail";
        return gVar;
    }

    private g makeRejectResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8254cd0d62924c595fbce0602327b97", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8254cd0d62924c595fbce0602327b97");
        }
        g gVar = new g();
        gVar.errorCode = 0;
        gVar.errorMsg = "reject";
        gVar.status = "fail";
        return gVar;
    }
}
