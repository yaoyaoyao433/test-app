package com.meituan.android.legwork.ui.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public static ChangeQuickRedirect a;
    private final LegworkWeatherView b;

    private d(LegworkWeatherView legworkWeatherView) {
        this.b = legworkWeatherView;
    }

    public static Runnable a(LegworkWeatherView legworkWeatherView) {
        Object[] objArr = {legworkWeatherView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f526673ec365dc92d473289f970f68bd", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f526673ec365dc92d473289f970f68bd") : new d(legworkWeatherView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e71c4064a5db43be1cc2aba9150821f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e71c4064a5db43be1cc2aba9150821f");
        } else {
            LegworkWeatherView.b(this.b);
        }
    }
}
