package com.meituan.passport.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.raw.a;
/* loaded from: classes3.dex */
public final /* synthetic */ class AbsApiFactory$$Lambda$2 implements a.InterfaceC0637a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final AbsApiFactory arg$1;
    private final a.InterfaceC0637a arg$2;

    public AbsApiFactory$$Lambda$2(AbsApiFactory absApiFactory, a.InterfaceC0637a interfaceC0637a) {
        this.arg$1 = absApiFactory;
        this.arg$2 = interfaceC0637a;
    }

    public static a.InterfaceC0637a lambdaFactory$(AbsApiFactory absApiFactory, a.InterfaceC0637a interfaceC0637a) {
        Object[] objArr = {absApiFactory, interfaceC0637a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "edfd81e8f62613d8f72f99d9aebdda85", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "edfd81e8f62613d8f72f99d9aebdda85") : new AbsApiFactory$$Lambda$2(absApiFactory, interfaceC0637a);
    }

    @Override // com.sankuai.meituan.retrofit2.raw.a.InterfaceC0637a
    public final a get(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb06bc98744781b1a82be5fc7e68b7d8", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb06bc98744781b1a82be5fc7e68b7d8") : AbsApiFactory.lambda$wrapCall$10(this.arg$1, this.arg$2, ajVar);
    }
}
