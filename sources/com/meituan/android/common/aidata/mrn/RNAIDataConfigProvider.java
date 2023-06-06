package com.meituan.android.common.aidata.mrn;

import com.facebook.react.i;
import com.meituan.android.mrn.config.IMRNConfigProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RNAIDataConfigProvider extends IMRNConfigProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.mrn.config.IMRNConfigProvider
    public String getBizName() {
        return com.meituan.android.common.aidata.utils.Constants.SDK_LOG_TAG;
    }

    @Override // com.meituan.android.mrn.config.IMRNConfigProvider
    public List<i> getGlobalReactPackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c00046dcb0ef250b9dedc5d47f2618b", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c00046dcb0ef250b9dedc5d47f2618b") : Arrays.asList(new RNAIDataPackage());
    }
}
