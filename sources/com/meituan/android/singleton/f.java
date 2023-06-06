package com.meituan.android.singleton;

import com.meituan.android.common.locate.MasterLocator;
import com.meituan.android.common.locate.MasterLocatorFactoryImpl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a = null;
    private static volatile String b = "BKZCHMBBHANGSU8GLUKHBB56CCFF78U";
    private static final e<MasterLocator> c = new e<MasterLocator>() { // from class: com.meituan.android.singleton.f.1
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.singleton.e
        public final /* synthetic */ MasterLocator a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a536ecb8eb757aab0ffadf97ea672ed", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a536ecb8eb757aab0ffadf97ea672ed") : new MasterLocatorFactoryImpl().createMasterLocator(b.a, new a.InterfaceC0637a() { // from class: com.meituan.android.singleton.f.1.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.raw.a.InterfaceC0637a
                public final com.sankuai.meituan.retrofit2.raw.a get(aj ajVar) {
                    Object[] objArr2 = {ajVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ffb31d5c758cfc877e790d26bff0338", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ffb31d5c758cfc877e790d26bff0338") : i.a("oknv").get(ajVar);
                }
            }, f.b, 1);
        }
    };

    public static MasterLocator a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ccc291b8301bf1b5e6d8df8994cd9f22", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ccc291b8301bf1b5e6d8df8994cd9f22") : c.b();
    }
}
