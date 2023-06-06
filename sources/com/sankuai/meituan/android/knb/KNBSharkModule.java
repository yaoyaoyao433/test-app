package com.sankuai.meituan.android.knb;

import com.dianping.nvnetwork.j;
import com.dianping.titans.shark.SharkManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBSharkModule implements SharkManager.ISharkModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private a nvNetworkCallFactory;
    private j nvNetworkService;

    public KNBSharkModule(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45bd472a6fcef038aef076430774677d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45bd472a6fcef038aef076430774677d");
        } else {
            this.nvNetworkService = jVar;
        }
    }

    @Override // com.dianping.titans.shark.SharkManager.ISharkModule
    public a.InterfaceC0637a getRawCallFactory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ee764f9e8be087eb6410c18c15637ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ee764f9e8be087eb6410c18c15637ef");
        }
        if (this.nvNetworkService != null && this.nvNetworkCallFactory == null) {
            this.nvNetworkCallFactory = com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a.a(this.nvNetworkService);
        }
        return this.nvNetworkCallFactory;
    }
}
