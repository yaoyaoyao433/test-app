package com.sankuai.waimai.platform.domain.manager.location;

import android.content.Context;
import com.dianping.nvnetwork.NVDefaultNetworkService;
import com.meituan.android.common.locate.MasterLocator;
import com.meituan.android.common.locate.MasterLocatorFactoryImpl;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.metrics.traffic.reflection.SharkWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static volatile d b;
    private static volatile MasterLocator c;

    public static MasterLocator a() {
        com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a aVar;
        String b2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ecfd13929b632f716c61c70a1b1f84c", RobustBitConfig.DEFAULT_VALUE)) {
            return (MasterLocator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ecfd13929b632f716c61c70a1b1f84c");
        }
        if (b == null) {
            synchronized (d.class) {
                if (b == null) {
                    f fVar = new f();
                    if (com.dianping.nvnetwork.g.u()) {
                        NVDefaultNetworkService.a aVar2 = new NVDefaultNetworkService.a(com.meituan.android.singleton.b.a);
                        SharkWrapper.addInterceptorToBuilder(aVar2);
                        aVar = com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a.a(aVar2.a());
                    } else {
                        aVar = null;
                    }
                    OkHttpClient build = new OkHttpClient().newBuilder().addInterceptor(new c()).build();
                    MasterLocatorFactoryImpl masterLocatorFactoryImpl = new MasterLocatorFactoryImpl();
                    Context context = com.meituan.android.singleton.b.a;
                    com.sankuai.waimai.config.a a2 = com.sankuai.waimai.config.a.a();
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.config.a.a;
                    if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "0c50b4a333e9649b834391cf34c5b84b", RobustBitConfig.DEFAULT_VALUE)) {
                        b2 = (String) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "0c50b4a333e9649b834391cf34c5b84b");
                    } else {
                        b2 = a2.b != null ? a2.b.b() : "";
                    }
                    String str = b2;
                    Context context2 = com.meituan.android.singleton.b.a;
                    Object[] objArr3 = {context2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    MasterLocator createMasterLocator = masterLocatorFactoryImpl.createMasterLocator(context, build, aVar, fVar, str, 1, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "09645a2a628ea2f1698aac95fccd1d5c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "09645a2a628ea2f1698aac95fccd1d5c")).booleanValue() : ProcessUtils.isMainProcess(context2) ? 0 : 1);
                    if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                        LocationUtils.setUserid(com.sankuai.waimai.platform.b.A().B());
                    } else {
                        LocationUtils.setUserid("0");
                    }
                    b = new d();
                    c = createMasterLocator;
                }
            }
        }
        return c;
    }
}
