package com.sankuai.waimai.reactnative.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a;
    static f b;
    private static com.sankuai.waimai.ugc.image.a c;
    private static d d;

    public static synchronized com.sankuai.waimai.ugc.image.a a() {
        synchronized (g.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e11e786fb1463237a80f191da748aa6f", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.ugc.image.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e11e786fb1463237a80f191da748aa6f");
            }
            if (c == null && b != null) {
                c = b.a();
            }
            return c;
        }
    }

    public static synchronized void b() {
        synchronized (g.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65c7f1435709d50c55cb16b98b552215", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65c7f1435709d50c55cb16b98b552215");
                return;
            }
            if (c != null) {
                c = null;
            }
            d = null;
        }
    }

    public static boolean c() {
        return b != null;
    }
}
