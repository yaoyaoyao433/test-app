package com.meituan.android.common.mrn.analytics.library;

import com.facebook.react.i;
import com.meituan.android.mrn.config.IMRNConfigProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RNStasticsConfigProvider extends IMRNConfigProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.mrn.config.IMRNConfigProvider
    public String getBizName() {
        return "rnstastics";
    }

    @Override // com.meituan.android.mrn.config.IMRNConfigProvider
    public List<i> getGlobalReactPackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db9e05a66d1f10e268a2a2cad0d5f5d6", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db9e05a66d1f10e268a2a2cad0d5f5d6") : Arrays.asList(new RNStasticsPackage());
    }
}
