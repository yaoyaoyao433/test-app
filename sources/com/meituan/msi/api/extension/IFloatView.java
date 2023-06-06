package com.meituan.msi.api.extension;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IFloatView implements IMsiCustomApi {
    public static ChangeQuickRedirect c;

    public abstract void a(FloatViewParam floatViewParam, MsiCustomContext msiCustomContext);

    public abstract void a(MsiCustomContext msiCustomContext, i<FloatLiveViewStatus> iVar);

    @MsiApiMethod(name = "isFloatLiveViewExist", response = FloatLiveViewStatus.class, scope = "live")
    public void msiIsFloatLiveViewExist(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05320bebe58e5bacf2810d8efc0c055e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05320bebe58e5bacf2810d8efc0c055e");
        } else {
            a(msiCustomContext, new i<FloatLiveViewStatus>() { // from class: com.meituan.msi.api.extension.IFloatView.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(FloatLiveViewStatus floatLiveViewStatus) {
                    FloatLiveViewStatus floatLiveViewStatus2 = floatLiveViewStatus;
                    Object[] objArr2 = {floatLiveViewStatus2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4ed2687d20910c5361de8db0b12e743", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4ed2687d20910c5361de8db0b12e743");
                    } else {
                        msiCustomContext.onSuccess(floatLiveViewStatus2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f52adc2598a8142df68cf97f2a9b6187", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f52adc2598a8142df68cf97f2a9b6187");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "dismissFloatView", request = FloatViewParam.class, scope = "live")
    public void msiDismissFloatView(FloatViewParam floatViewParam, MsiCustomContext msiCustomContext) {
        Object[] objArr = {floatViewParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "489048deec69afee0bf455a3a4107984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "489048deec69afee0bf455a3a4107984");
        } else {
            a(floatViewParam, msiCustomContext);
        }
    }
}
