package com.meituan.android.mrn.engine;

import com.horcrux.svg.SvgPackage;
import com.meituan.android.mrn.IMRNPackageBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i implements IMRNPackageBuilder {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.IMRNPackageBuilder
    public final List<com.facebook.react.i> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1aff0f4102cb5f4103b28d9bc659802", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1aff0f4102cb5f4103b28d9bc659802");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.facebook.react.shell.a());
        arrayList.add(new com.meituan.android.mrn.shell.c());
        arrayList.add(new com.meituan.android.mrn.shell.b());
        arrayList.add(new SvgPackage());
        arrayList.add(new com.meituan.android.mrn.bindingx.a());
        arrayList.add(new com.meituan.android.mrn.component.d());
        arrayList.add(new com.reactnativecommunity.webview.a());
        arrayList.add(new com.BV.LinearGradient.a());
        arrayList.add(new com.swmansion.gesturehandler.react.e());
        arrayList.add(new com.reactnativecommunity.netinfo.c());
        return arrayList;
    }
}
