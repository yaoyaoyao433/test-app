package com.meituan.network.download;

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
public abstract class IDownloadFileApi implements IMsiApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiContext msiContext, DownloadFileParam downloadFileParam);

    public abstract void a(MsiContext msiContext, String str);

    @MsiApiMethod(isCallback = true, name = "DownloadTask.offHeadersReceived")
    public void msiOffHeadersReceived(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "DownloadTask.offProgressUpdate")
    public void msiOffProgressUpdate(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "DownloadTask.onHeadersReceived", response = HeaderReceivedEvent.class)
    public void msiOnHeadersReceived(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "DownloadTask.onProgressUpdate", response = NetworkProgressUpdateEvent.class)
    public void onUploadFileProgressUpdate(MsiContext msiContext) {
    }

    @MsiApiMethod(name = "downloadFile", request = DownloadFileParam.class, response = DownloadFileResult.class)
    public void msiDownloadFile(DownloadFileParam downloadFileParam, MsiContext msiContext) {
        Object[] objArr = {downloadFileParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cdf892714bbf74c76923132c190c4d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cdf892714bbf74c76923132c190c4d2");
        } else {
            a(msiContext, downloadFileParam);
        }
    }

    @MsiApiMethod(name = "DownloadTask.abort")
    public void msiAbortDownloadFile(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65c41780592146d41b620f5c55c58362", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65c41780592146d41b620f5c55c58362");
        } else {
            a(msiContext, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
        }
    }

    @MsiApiMethod(name = "DownloadTask")
    public EmptyResponse msiDownloadTask(MsiContext msiContext) {
        return EmptyResponse.INSTANCE;
    }
}
