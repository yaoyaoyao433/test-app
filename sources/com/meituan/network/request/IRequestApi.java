package com.meituan.network.request;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.meituan.network.HeaderReceivedEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IRequestApi implements IMsiApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiContext msiContext, RequestParam requestParam);

    public abstract void a(MsiContext msiContext, String str);

    @MsiApiMethod(isCallback = true, name = "RequestTask.offHeadersReceived")
    public void offRequestHeadersReceived(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "RequestTask.onHeadersReceived", response = HeaderReceivedEvent.class)
    public void onRequestHeadersReceived(MsiContext msiContext) {
    }

    @MsiApiMethod(name = SocialConstants.TYPE_REQUEST, request = RequestParam.class, response = RequestResult.class)
    public void msiRequest(RequestParam requestParam, MsiContext msiContext) {
        Object[] objArr = {requestParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2d8108bc60ddce837311adf7d621ed5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2d8108bc60ddce837311adf7d621ed5");
        } else {
            a(msiContext, requestParam);
        }
    }

    @MsiApiMethod(name = "RequestTask.abort")
    public void abort(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ee822ba11e8ff6e1c5cf9dc8d250b3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ee822ba11e8ff6e1c5cf9dc8d250b3a");
        } else {
            a(msiContext, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
        }
    }

    @MsiApiMethod(name = "RequestTask")
    public EmptyResponse RequestTask(MsiContext msiContext) {
        return EmptyResponse.INSTANCE;
    }
}
