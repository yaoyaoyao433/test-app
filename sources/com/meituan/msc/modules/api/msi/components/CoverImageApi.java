package com.meituan.msc.modules.api.msi.components;

import android.view.View;
import com.google.gson.JsonObject;
import com.meituan.msc.modules.api.msi.MSCNativeViewApi;
import com.meituan.msc.modules.api.msi.components.coverview.b;
import com.meituan.msc.modules.api.msi.components.coverview.e;
import com.meituan.msc.modules.api.msi.components.coverview.params.MSCCoverImageViewParams;
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
public class CoverImageApi extends MSCNativeViewApi<e, MSCCoverImageViewParams> {
    public static ChangeQuickRedirect c;

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ View a(MsiContext msiContext, JsonObject jsonObject, Object obj) {
        MSCCoverImageViewParams mSCCoverImageViewParams = (MSCCoverImageViewParams) obj;
        Object[] objArr = {msiContext, jsonObject, mSCCoverImageViewParams};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4e6b0f56c75560964d9fd458947782e", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4e6b0f56c75560964d9fd458947782e");
        }
        e eVar = new e(msiContext.getActivity());
        a(eVar, msiContext, jsonObject);
        eVar.a(mSCCoverImageViewParams, jsonObject);
        b.a(eVar);
        return eVar;
    }

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ void a(MsiContext msiContext, View view, int i, JsonObject jsonObject, Object obj) {
        MSCCoverImageViewParams mSCCoverImageViewParams = (MSCCoverImageViewParams) obj;
        Object[] objArr = {msiContext, view, Integer.valueOf(i), jsonObject, mSCCoverImageViewParams};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c308067b16f8b7b23c313bde92b12fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c308067b16f8b7b23c313bde92b12fe");
            return;
        }
        super.a(msiContext, view, i, jsonObject, mSCCoverImageViewParams);
        b.a(view);
    }

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ boolean a(MsiContext msiContext, View view, int i, int i2, JsonObject jsonObject, Object obj) {
        e eVar = (e) view;
        MSCCoverImageViewParams mSCCoverImageViewParams = (MSCCoverImageViewParams) obj;
        Object[] objArr = {msiContext, eVar, Integer.valueOf(i), Integer.valueOf(i2), jsonObject, mSCCoverImageViewParams};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31036c3cd091f5713f4e7bcc0c2c8c76", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31036c3cd091f5713f4e7bcc0c2c8c76")).booleanValue();
        }
        eVar.a(mSCCoverImageViewParams, jsonObject);
        b.a(eVar);
        return true;
    }

    @MsiApiMethod(name = "coverImageView", request = MSCCoverImageViewParams.class)
    public void beforeOperation(MSCCoverImageViewParams mSCCoverImageViewParams, MsiContext msiContext) {
        Object[] objArr = {mSCCoverImageViewParams, msiContext};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59885f8688e175aaa5bca4e9cc2488de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59885f8688e175aaa5bca4e9cc2488de");
        } else {
            a(msiContext, (MsiContext) mSCCoverImageViewParams);
        }
    }
}
