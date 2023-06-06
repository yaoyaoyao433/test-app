package com.meituan.android.legwork.ui.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public static ChangeQuickRedirect a;
    private final LegworkWeatherView b;

    private c(LegworkWeatherView legworkWeatherView) {
        this.b = legworkWeatherView;
    }

    public static Runnable a(LegworkWeatherView legworkWeatherView) {
        Object[] objArr = {legworkWeatherView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c224dd37838bf647cab9210bba467290", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c224dd37838bf647cab9210bba467290") : new c(legworkWeatherView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b656c308e5303e0fd13df73d1cf82a6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b656c308e5303e0fd13df73d1cf82a6a");
        } else {
            LegworkWeatherView.a(this.b);
        }
    }
}
