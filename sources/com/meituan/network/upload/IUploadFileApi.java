package com.meituan.network.upload;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.meituan.network.HeaderReceivedEvent;
import com.meituan.network.NetworkProgressUpdateEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IUploadFileApi implements IMsiApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiContext msiContext, UploadFileParam uploadFileParam);

    public abstract void a(MsiContext msiContext, String str);

    @MsiApiMethod(isCallback = true, name = "UploadTask.offHeadersReceived")
    public void msiOffHeadersReceived(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "UploadTask.offProgressUpdate")
    public void msiOffProgressUpdate(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "UploadTask.onHeadersReceived", response = HeaderReceivedEvent.class)
    public void msiOnHeadersReceived(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "UploadTask.onProgressUpdate", response = NetworkProgressUpdateEvent.class)
    public void msiOnUploadFileProgressUpdate(MsiContext msiContext) {
    }

    @MsiApiMethod(name = "uploadFile", request = UploadFileParam.class, response = UploadFileResult.class)
    public void msiUploadFile(UploadFileParam uploadFileParam, MsiContext msiContext) {
        Object[] objArr = {uploadFileParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee190d9b84022ad6d66d926593e6d064", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee190d9b84022ad6d66d926593e6d064");
        } else {
            a(msiContext, uploadFileParam);
        }
    }

    @MsiApiMethod(name = "UploadTask.abort")
    public void msiAbortUploadFile(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8873211f90998632c84a17be62898359", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8873211f90998632c84a17be62898359");
        } else {
            a(msiContext, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
        }
    }

    @MsiApiMethod(name = "UploadTask")
    public EmptyResponse uploadTask(MsiContext msiContext) {
        return EmptyResponse.INSTANCE;
    }
}
