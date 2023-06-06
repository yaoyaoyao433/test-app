package com.meituan.msc.modules.api.msi.components;

import android.view.View;
import com.google.gson.JsonObject;
import com.meituan.msc.modules.api.msi.MSCNativeViewApi;
import com.meituan.msc.modules.api.msi.components.coverview.b;
import com.meituan.msc.modules.api.msi.components.coverview.g;
import com.meituan.msc.modules.api.msi.components.coverview.params.MSCCoverTextViewParams;
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
public class CoverTextViewApi extends MSCNativeViewApi<g, MSCCoverTextViewParams> {
    public static ChangeQuickRedirect c;

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ View a(MsiContext msiContext, JsonObject jsonObject, Object obj) {
        MSCCoverTextViewParams mSCCoverTextViewParams = (MSCCoverTextViewParams) obj;
        Object[] objArr = {msiContext, jsonObject, mSCCoverTextViewParams};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c691696aca9ae4f3bd96ce6dca9665c", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c691696aca9ae4f3bd96ce6dca9665c");
        }
        g gVar = new g(msiContext.getActivity());
        a(gVar, msiContext, jsonObject);
        gVar.a(mSCCoverTextViewParams);
        b.a(gVar);
        return gVar;
    }

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ void a(MsiContext msiContext, View view, int i, JsonObject jsonObject, Object obj) {
        MSCCoverTextViewParams mSCCoverTextViewParams = (MSCCoverTextViewParams) obj;
        Object[] objArr = {msiContext, view, Integer.valueOf(i), jsonObject, mSCCoverTextViewParams};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af22acfa29aebd4769ed09ff6e01d2c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af22acfa29aebd4769ed09ff6e01d2c6");
            return;
        }
        super.a(msiContext, view, i, jsonObject, mSCCoverTextViewParams);
        b.a(view);
    }

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ boolean a(MsiContext msiContext, View view, int i, int i2, JsonObject jsonObject, Object obj) {
        g gVar = (g) view;
        MSCCoverTextViewParams mSCCoverTextViewParams = (MSCCoverTextViewParams) obj;
        Object[] objArr = {msiContext, gVar, Integer.valueOf(i), Integer.valueOf(i2), jsonObject, mSCCoverTextViewParams};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32756039fb6c3352489d397993a06f9f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32756039fb6c3352489d397993a06f9f")).booleanValue();
        }
        gVar.a(mSCCoverTextViewParams);
        b.a(gVar);
        return true;
    }

    @MsiApiMethod(name = "coverTextView", request = MSCCoverTextViewParams.class)
    public void beforeOperation(MSCCoverTextViewParams mSCCoverTextViewParams, MsiContext msiContext) {
        Object[] objArr = {mSCCoverTextViewParams, msiContext};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ffd84b71d74b51a03a534669030cc2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ffd84b71d74b51a03a534669030cc2f");
        } else {
            a(msiContext, (MsiContext) mSCCoverTextViewParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x017f  */
    @com.meituan.msi.annotations.MsiApiMethod(isForeground = true, name = "animateCoverView", onUiThread = true, request = com.meituan.msc.modules.api.msi.components.coverview.CoverViewAnimateUtil.MSCAnimatedParams.class)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void animateCoverView(com.meituan.msc.modules.api.msi.components.coverview.CoverViewAnimateUtil.MSCAnimatedParams r22, final com.meituan.msi.bean.MsiContext r23) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.api.msi.components.CoverTextViewApi.animateCoverView(com.meituan.msc.modules.api.msi.components.coverview.CoverViewAnimateUtil$MSCAnimatedParams, com.meituan.msi.bean.MsiContext):void");
    }
}
