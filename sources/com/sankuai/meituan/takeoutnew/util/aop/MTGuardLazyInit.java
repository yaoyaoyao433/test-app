package com.sankuai.meituan.takeoutnew.util.aop;

import android.content.Context;
import com.meituan.android.common.dfingerprint.MTGlibInterface;
import com.meituan.android.common.dfingerprint.raptor.RaptorImpl;
import com.meituan.android.common.mtguard.LifecycleManager;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.waimai.router.method.Func0;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTGuardLazyInit implements Func0<Void> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static com.meituan.android.singleton.e<Void> provider = new com.meituan.android.singleton.e<Void>() { // from class: com.sankuai.meituan.takeoutnew.util.aop.MTGuardLazyInit.1
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.singleton.e
        public final /* synthetic */ Void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74be3a08b1960ee793fb52ec69d37873", RobustBitConfig.DEFAULT_VALUE)) {
                return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74be3a08b1960ee793fb52ec69d37873");
            }
            Context context = com.meituan.android.singleton.b.a;
            MTGlibInterface.initRaptor(new RaptorImpl(context));
            if (com.sankuai.waimai.platform.privacy.a.a().b()) {
                MTGuard.initInT1(context);
                return null;
            }
            if (ProcessUtils.isMainProcess(context)) {
                LifecycleManager.register(context);
            }
            MTGuard.init(context);
            return null;
        }
    };

    public static void initMTGuardBeforeCheck() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "252cd5df3a108b3cd286ef60a42508a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "252cd5df3a108b3cd286ef60a42508a1");
        } else {
            provider.b();
        }
    }

    @Override // com.sankuai.waimai.router.method.Func0
    public Void call() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74747e006d021b43bae05a012c302c50", RobustBitConfig.DEFAULT_VALUE) ? (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74747e006d021b43bae05a012c302c50") : provider.b();
    }
}
