package com.meituan.msi.metrics.base;

import com.meituan.metrics.common.Constants;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IBaseAdaptor implements IMsiCustomApi {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract void ffpAddCustomTags(MsiCustomContext msiCustomContext, FfpAddCustomTagsParam ffpAddCustomTagsParam, i<EmptyResponse> iVar);

    public abstract void fspRecord(MsiCustomContext msiCustomContext, FspRecordParam fspRecordParam, i<EmptyResponse> iVar);

    @MsiApiMethod(name = "ffpAddCustomTags", request = FfpAddCustomTagsParam.class, scope = Constants.METRICS)
    public void msiFfpAddCustomTags(FfpAddCustomTagsParam ffpAddCustomTagsParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {ffpAddCustomTagsParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdab76b252add58d7f04fa6d8be3e484", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdab76b252add58d7f04fa6d8be3e484");
        } else {
            ffpAddCustomTags(msiCustomContext, ffpAddCustomTagsParam, new i<EmptyResponse>() { // from class: com.meituan.msi.metrics.base.IBaseAdaptor.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "019cf1bd9f073631ae083593b17538b9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "019cf1bd9f073631ae083593b17538b9");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1d29259527c8c78ec210ca0e4c1077e8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1d29259527c8c78ec210ca0e4c1077e8");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "fspRecord", request = FspRecordParam.class, scope = Constants.METRICS)
    public void msiFspRecord(FspRecordParam fspRecordParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {fspRecordParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a12085490d62ee1063c2967abf8ee184", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a12085490d62ee1063c2967abf8ee184");
        } else {
            fspRecord(msiCustomContext, fspRecordParam, new i<EmptyResponse>() { // from class: com.meituan.msi.metrics.base.IBaseAdaptor.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "040a099643ebcc76cb44646a949fde6a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "040a099643ebcc76cb44646a949fde6a");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "42e21b6bb1fcfe6405f9b17e99dd07d9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "42e21b6bb1fcfe6405f9b17e99dd07d9");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
