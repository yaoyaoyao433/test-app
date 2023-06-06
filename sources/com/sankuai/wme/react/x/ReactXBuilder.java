package com.sankuai.wme.react.x;

import com.facebook.react.i;
import com.meituan.android.mrn.IMRNPackageBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ReactXBuilder implements IMRNPackageBuilder {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.IMRNPackageBuilder
    public final List<i> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6063d070958196a58bfaae78df06bcd2", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6063d070958196a58bfaae78df06bcd2");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b());
        return arrayList;
    }
}
