package com.meituan.android.qianbao.mmpwidget2rn.rn;

import com.facebook.react.i;
import com.meituan.android.mrn.IMRNPackageBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class QBRNPackageBuilder implements IMRNPackageBuilder {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.IMRNPackageBuilder
    public final List<i> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8b9c3c17bfbd388fff432776b2bfa07", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8b9c3c17bfbd388fff432776b2bfa07") : Arrays.asList(new a());
    }
}
