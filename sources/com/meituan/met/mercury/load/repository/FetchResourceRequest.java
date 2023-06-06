package com.meituan.met.mercury.load.repository;

import android.support.annotation.Keep;
import com.meituan.met.mercury.load.core.DDLoadParams;
import com.meituan.met.mercury.load.core.DDLoadStrategy;
import com.meituan.met.mercury.load.core.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class FetchResourceRequest extends BaseLoadRequest {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String resourceName;
    private final String resourceVersion;

    public FetchResourceRequest(String str, DDLoadParams dDLoadParams, n nVar, String str2, String str3) {
        super(str, DDLoadStrategy.SPECIFIED, dDLoadParams, nVar);
        Object[] objArr = {str, dDLoadParams, nVar, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa43c1d097eeda7af41a538b4514fe58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa43c1d097eeda7af41a538b4514fe58");
            return;
        }
        this.resourceName = str2;
        this.resourceVersion = str3;
    }

    public String getResourceName() {
        return this.resourceName;
    }

    public String getResourceVersion() {
        return this.resourceVersion;
    }

    @Override // com.meituan.met.mercury.load.repository.BaseLoadRequest
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3894df135e0f55be4203890009e9985b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3894df135e0f55be4203890009e9985b");
        }
        return "FetchResourceRequest{resourceName='" + this.resourceName + "', resourceVersion='" + this.resourceVersion + "'}";
    }
}
