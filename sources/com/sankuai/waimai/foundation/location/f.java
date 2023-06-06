package com.sankuai.waimai.foundation.location;

import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static f b;

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dab07033bdedaaed67c71271f7a41b1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dab07033bdedaaed67c71271f7a41b1b");
        }
        if (b == null) {
            synchronized (f.class) {
                if (b == null) {
                    b = new f();
                }
            }
        }
        return b;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be39f2d30a1ab4ac3d8a91ce7c74decb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be39f2d30a1ab4ac3d8a91ce7c74decb")).booleanValue() : d().isLogin();
    }

    public final long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed94b80d11737adcded9a6efae2b8488", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed94b80d11737adcded9a6efae2b8488")).longValue();
        }
        User user = d().getUser();
        if (user != null) {
            return user.id;
        }
        return 0L;
    }

    private static UserCenter d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0bc6a4c2a66f903f85802f36853eba46", RobustBitConfig.DEFAULT_VALUE) ? (UserCenter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0bc6a4c2a66f903f85802f36853eba46") : UserCenter.getInstance(com.meituan.android.singleton.b.a);
    }
}
