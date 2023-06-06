package com.meituan.android.hybridcashier.bridge.result;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.android.neohybrid.base.jshandler.NeoBaseJsHandler;
import com.meituan.android.paybase.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NotifyHybridProcessResultJSHandler extends NeoBaseJsHandler<PayResultBean> {
    private static final String ACTION_FINISH = "finish";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.neohybrid.base.jshandler.NeoWrapperJsHandler
    public String getName() {
        return "pay.notifyHybridProcessResult";
    }

    @Override // com.meituan.android.neohybrid.base.jshandler.NeoFormatDataJsHandler
    public void onExecute(String str, PayResultBean payResultBean) {
        Object[] objArr = {str, payResultBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77e0a7f30dc0ceb8f814ad0ff9b93fff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77e0a7f30dc0ceb8f814ad0ff9b93fff");
            return;
        }
        if (payResultBean != null) {
            payResultBean.setAction(str);
        }
        handlePayFinish(str, payResultBean);
    }

    private void handlePayFinish(String str, PayResultBean payResultBean) {
        Object[] objArr = {str, payResultBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae4bc693d0d47dab2776180cd771473f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae4bc693d0d47dab2776180cd771473f");
        } else if (payResultBean == null) {
            formatJsCallbackDataError();
        } else if (ACTION_FINISH.equals(str) && TextUtils.equals(payResultBean.getStatus(), "success")) {
            Activity activity = jsHost().getActivity();
            Object[] objArr2 = {this, payResultBean};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            f.a(activity, PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "879063ca199896e301a381a2ae164743", RobustBitConfig.DEFAULT_VALUE) ? (f.InterfaceC0337f) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "879063ca199896e301a381a2ae164743") : new b(this, payResultBean));
        } else {
            handlePayResultBean(payResultBean);
        }
    }

    public static /* synthetic */ void lambda$handlePayFinish$1(NotifyHybridProcessResultJSHandler notifyHybridProcessResultJSHandler, PayResultBean payResultBean, boolean z) {
        Object[] objArr = {notifyHybridProcessResultJSHandler, payResultBean, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a7ed1edaea51b6636e62e8a348cf6a19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a7ed1edaea51b6636e62e8a348cf6a19");
        } else {
            notifyHybridProcessResultJSHandler.handlePayResultBean(payResultBean);
        }
    }

    private void handlePayResultBean(PayResultBean payResultBean) {
        Object[] objArr = {payResultBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b13f4a1d1a32321bed491a2643634741", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b13f4a1d1a32321bed491a2643634741");
        } else if (getNeoCompat() == null) {
        } else {
            com.meituan.android.neohybrid.core.listener.a aVar = getNeoCompat().b;
            if ((aVar instanceof c) && ((c) aVar).a(payResultBean)) {
                formatJsCallbackSucc();
            } else {
                formatJsCallbackError(-1, "异常流程");
            }
        }
    }
}
