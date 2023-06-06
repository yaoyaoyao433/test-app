package com.meituan.android.legwork.ui.abfragment;

import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Handler.Callback {
    public static ChangeQuickRedirect a;
    private final LegworkMRNBaseFragment b;

    private a(LegworkMRNBaseFragment legworkMRNBaseFragment) {
        this.b = legworkMRNBaseFragment;
    }

    public static Handler.Callback a(LegworkMRNBaseFragment legworkMRNBaseFragment) {
        Object[] objArr = {legworkMRNBaseFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc55e6d82cf55ff6faa07dd70f8fc501", RobustBitConfig.DEFAULT_VALUE) ? (Handler.Callback) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc55e6d82cf55ff6faa07dd70f8fc501") : new a(legworkMRNBaseFragment);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10086dedcde14654fb833e47d287557e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10086dedcde14654fb833e47d287557e")).booleanValue() : LegworkMRNBaseFragment.a(this.b, message);
    }
}
