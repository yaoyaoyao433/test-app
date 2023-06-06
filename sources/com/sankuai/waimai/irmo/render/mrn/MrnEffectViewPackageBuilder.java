package com.sankuai.waimai.irmo.render.mrn;

import com.facebook.react.i;
import com.meituan.android.mrn.IMRNPackageBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MrnEffectViewPackageBuilder implements IMRNPackageBuilder {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.IMRNPackageBuilder
    public final List<i> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "170e574800da21e6ae3dbe20d82a2963", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "170e574800da21e6ae3dbe20d82a2963");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a());
        return arrayList;
    }
}
