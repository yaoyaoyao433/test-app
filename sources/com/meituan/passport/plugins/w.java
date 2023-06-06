package com.meituan.passport.plugins;

import com.meituan.passport.api.UserCenterCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class w {
    public static ChangeQuickRedirect a;
    private static volatile w c;
    public UserCenterCallback b;

    public static w a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6703df2e3d02cd245d31390bb8cc902", RobustBitConfig.DEFAULT_VALUE)) {
            return (w) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6703df2e3d02cd245d31390bb8cc902");
        }
        if (c == null) {
            synchronized (w.class) {
                if (c == null) {
                    c = new w();
                }
            }
        }
        return c;
    }
}
