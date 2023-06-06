package com.meituan.msi.api.extension.medicine;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IDrugPoi implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, DrugPoiDataParam drugPoiDataParam, i<DrugPoiResponse> iVar);

    @MsiApiMethod(name = "getDrugPoiData", request = DrugPoiDataParam.class, response = DrugPoiResponse.class, scope = "medicine")
    public void msiGetDrugPoiData(DrugPoiDataParam drugPoiDataParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {drugPoiDataParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76e7aba4a50ee5bb5c0d8ba073cd589a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76e7aba4a50ee5bb5c0d8ba073cd589a");
        } else {
            a(msiCustomContext, drugPoiDataParam, new i<DrugPoiResponse>() { // from class: com.meituan.msi.api.extension.medicine.IDrugPoi.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(DrugPoiResponse drugPoiResponse) {
                    DrugPoiResponse drugPoiResponse2 = drugPoiResponse;
                    Object[] objArr2 = {drugPoiResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0612364870559f0109a163f9cafa24a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0612364870559f0109a163f9cafa24a");
                    } else {
                        msiCustomContext.onSuccess(drugPoiResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6492bc64a3cfc2194cd314d7aeb13593", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6492bc64a3cfc2194cd314d7aeb13593");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
