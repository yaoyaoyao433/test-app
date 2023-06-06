package com.meituan.msc.modules.api.msi.api;

import com.meituan.msc.lib.interfaces.IFileModule;
import com.meituan.msc.modules.api.msi.MSCApi;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiApiEnv(name = ContainerInfo.ENV_MSC)
/* loaded from: classes3.dex */
public class FileApi extends MSCApi {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class FileProtocolResponse {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String fileProtocol;
    }

    @MsiApiMethod(name = "getFileProtocol", response = FileProtocolResponse.class)
    public FileProtocolResponse getFileProtocol(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1610244f9f71793de68f247e6060cbe8", RobustBitConfig.DEFAULT_VALUE)) {
            return (FileProtocolResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1610244f9f71793de68f247e6060cbe8");
        }
        if (this.c == null) {
            msiContext.onError("runtime is null");
            return null;
        }
        FileProtocolResponse fileProtocolResponse = new FileProtocolResponse();
        fileProtocolResponse.fileProtocol = ((IFileModule) a(IFileModule.class)).e();
        msiContext.onSuccess(fileProtocolResponse);
        return fileProtocolResponse;
    }
}
