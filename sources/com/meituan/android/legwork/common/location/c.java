package com.meituan.android.legwork.common.location;

import android.support.annotation.NonNull;
import com.meituan.android.common.locate.MasterLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.manager.location.d;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends BaseLocationManager {
    public static ChangeQuickRedirect i;
    private static final c j = new c();

    public static c l() {
        return j;
    }

    @Override // com.meituan.android.legwork.common.location.b
    public final double h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "441aab4b221df45d14cfcbdfde004665", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "441aab4b221df45d14cfcbdfde004665")).doubleValue() : com.sankuai.waimai.kit.b.a().d();
    }

    @Override // com.meituan.android.legwork.common.location.b
    public final double i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6fffbe79bffefd094f27f3dbf500a17", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6fffbe79bffefd094f27f3dbf500a17")).doubleValue() : com.sankuai.waimai.kit.b.a().c();
    }

    @Override // com.meituan.android.legwork.common.location.b
    @NonNull
    public final String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "282023e777b6eb168efd59b905909868", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "282023e777b6eb168efd59b905909868") : com.sankuai.waimai.kit.b.a().b() == null ? "" : com.sankuai.waimai.kit.b.a().b();
    }

    @Override // com.meituan.android.legwork.common.location.b
    public final MasterLocator k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a08c185e035732963549e5988d7ddf5", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a08c185e035732963549e5988d7ddf5") : d.a();
    }
}
