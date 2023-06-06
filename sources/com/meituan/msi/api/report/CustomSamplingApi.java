package com.meituan.msi.api.report;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.report.SamplingParam;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.context.c;
import com.meituan.msi.defaultcontext.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CustomSamplingApi implements IMsiApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "customSampling", request = SamplingParam.class)
    public void customSampling(SamplingParam samplingParam, MsiContext msiContext) {
        SamplingParam.ApiSampling[] apiSamplingArr;
        Object[] objArr = {samplingParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7044a97204f94b3f046b94f63e69e91a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7044a97204f94b3f046b94f63e69e91a");
            return;
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        if (samplingParam.apiSampling != null) {
            for (SamplingParam.ApiSampling apiSampling : samplingParam.apiSampling) {
                hashMap.put(a.b(apiSampling.scope, apiSampling.name), Integer.valueOf(apiSampling.sampleRate));
            }
        }
        ApiRequest apiRequest = msiContext.request;
        if (apiRequest != null) {
            c cVar = apiRequest.getContainerContext().e;
            if (cVar instanceof a) {
                a aVar = (a) cVar;
                aVar.e = samplingParam.generalRate;
                aVar.f = hashMap;
            }
            msiContext.onSuccess(null);
        }
    }
}
