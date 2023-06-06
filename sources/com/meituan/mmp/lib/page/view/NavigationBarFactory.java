package com.meituan.mmp.lib.page.view;

import android.content.Context;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public abstract class NavigationBarFactory {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract CustomNavigationBar onCreateCustomNavigationBar(Context context, com.meituan.mmp.lib.config.a aVar, boolean z, boolean z2);

    public final CustomNavigationBar getNavigationBar(Context context, boolean z, com.meituan.mmp.lib.config.a aVar, boolean z2) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "410157b4ba60eb824202b293b1e2c661", RobustBitConfig.DEFAULT_VALUE) ? (CustomNavigationBar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "410157b4ba60eb824202b293b1e2c661") : onCreateCustomNavigationBar(context, aVar, z, z2);
    }
}
