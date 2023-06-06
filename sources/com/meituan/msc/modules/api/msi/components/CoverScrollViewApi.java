package com.meituan.msc.modules.api.msi.components;

import android.view.View;
import com.google.gson.JsonObject;
import com.meituan.msc.modules.api.msi.MSCNativeViewApi;
import com.meituan.msc.modules.api.msi.components.coverview.b;
import com.meituan.msc.modules.api.msi.components.coverview.f;
import com.meituan.msc.modules.api.msi.components.coverview.params.MSCCoverScrollParams;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiApiEnv(name = ContainerInfo.ENV_MSC)
/* loaded from: classes3.dex */
public class CoverScrollViewApi extends MSCNativeViewApi<f, MSCCoverScrollParams> {
    public static ChangeQuickRedirect c;

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ View a(MsiContext msiContext, JsonObject jsonObject, Object obj) {
        MSCCoverScrollParams mSCCoverScrollParams = (MSCCoverScrollParams) obj;
        Object[] objArr = {msiContext, jsonObject, mSCCoverScrollParams};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41ae4e213ad5543228f437c1b96f64fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41ae4e213ad5543228f437c1b96f64fc");
        }
        f fVar = new f(msiContext.getActivity());
        a(fVar, msiContext, jsonObject);
        fVar.setUpScroll(mSCCoverScrollParams);
        b.a(fVar);
        return fVar;
    }

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ boolean a(MsiContext msiContext, View view, int i, int i2, JsonObject jsonObject, Object obj) {
        f fVar = (f) view;
        MSCCoverScrollParams mSCCoverScrollParams = (MSCCoverScrollParams) obj;
        Object[] objArr = {msiContext, fVar, Integer.valueOf(i), Integer.valueOf(i2), jsonObject, mSCCoverScrollParams};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9395e3161ea2c96368552f783ff12a69", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9395e3161ea2c96368552f783ff12a69")).booleanValue();
        }
        fVar.setUpScroll(mSCCoverScrollParams);
        b.a(fVar);
        return true;
    }

    @MsiApiMethod(name = "coverScrollView", request = MSCCoverScrollParams.class)
    public void beforeOperation(MSCCoverScrollParams mSCCoverScrollParams, MsiContext msiContext) {
        Object[] objArr = {mSCCoverScrollParams, msiContext};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "488eba51e51159cae33b407abf48c4a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "488eba51e51159cae33b407abf48c4a4");
        } else {
            a(msiContext, (MsiContext) mSCCoverScrollParams);
        }
    }
}
