package com.dianping.live.live.mrn;

import com.meituan.android.mrn.IMRNPackageBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MLivePackageBuilder implements IMRNPackageBuilder {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.IMRNPackageBuilder
    public final List<com.facebook.react.i> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7500c54b8fa6fbc2c3d65bae88903d50", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7500c54b8fa6fbc2c3d65bae88903d50") : Arrays.asList(new c());
    }
}
