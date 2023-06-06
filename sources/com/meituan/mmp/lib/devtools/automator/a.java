package com.meituan.mmp.lib.devtools.automator;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    public static volatile boolean b = true;
    private static volatile b c;

    @Nullable
    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        b bVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70eb5a97a0710905d44543599539512d", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70eb5a97a0710905d44543599539512d");
        }
        if (b) {
            if (c == null) {
                synchronized (a.class) {
                    if (c == null) {
                        List a2 = com.sankuai.meituan.serviceloader.b.a(b.class, "mmp_automator_provider");
                        if (a2 != null && a2.size() > 0) {
                            bVar = (b) a2.get(0);
                        }
                        c = bVar;
                    }
                }
            }
            if (c == null) {
                b = false;
            }
            return c;
        }
        return null;
    }
}
