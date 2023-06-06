package com.sankuai.waimai.store.manager.user;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.core.service.user.c;
import com.sankuai.waimai.store.i.user.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends com.sankuai.waimai.store.a<com.sankuai.waimai.store.i.user.a, b> {
    public static ChangeQuickRedirect c;
    private static volatile a d;

    public static /* synthetic */ a.EnumC1205a a(a aVar, b.a aVar2) {
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "dee24b8bcdd0ece3e2b6f61c13c305fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.EnumC1205a) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "dee24b8bcdd0ece3e2b6f61c13c305fd");
        }
        switch (aVar2) {
            case LOGIN:
                return a.EnumC1205a.LOGIN;
            case CANCEL:
                return a.EnumC1205a.CANCEL;
            case LOGOUT:
                return a.EnumC1205a.LOGOUT;
            case BIND_FAILED:
                return a.EnumC1205a.BIND_FAILED;
            default:
                return null;
        }
    }

    public static /* synthetic */ a.b a(a aVar, b.EnumC0948b enumC0948b) {
        Object[] objArr = {enumC0948b};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "11c2ab4b0fbfb085d00f38c1ec17edf3", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.b) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "11c2ab4b0fbfb085d00f38c1ec17edf3");
        }
        switch (enumC0948b) {
            case INFO:
                return a.b.INFO;
            case PHONE:
                return a.b.PHONE;
            default:
                return null;
        }
    }

    @Override // com.sankuai.waimai.store.a
    @NonNull
    public final /* synthetic */ b c(com.sankuai.waimai.store.i.user.a aVar) {
        final com.sankuai.waimai.store.i.user.a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30c35375c0f33d2a05a14282057fccc6", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30c35375c0f33d2a05a14282057fccc6") : new b() { // from class: com.sankuai.waimai.store.manager.user.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.core.service.user.b
            public final void onChanged(b.a aVar3) {
                Object[] objArr2 = {aVar3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0ad0ee58de36079dce1db7ea57d1924", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0ad0ee58de36079dce1db7ea57d1924");
                } else if (aVar2 != null) {
                    aVar2.a(a.a(a.this, aVar3));
                }
            }

            @Override // com.sankuai.waimai.foundation.core.service.user.b
            public final void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
                Object[] objArr2 = {enumC0948b};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca299c32614108764b81ade484ca70dd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca299c32614108764b81ade484ca70dd");
                } else if (aVar2 != null) {
                    aVar2.a(a.a(a.this, enumC0948b));
                }
            }
        };
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d0af78688772503a9ef410c90f5eadb", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d0af78688772503a9ef410c90f5eadb");
        }
        if (d == null) {
            synchronized (a.class) {
                if (d == null) {
                    d = new a();
                }
            }
        }
        return d;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edb07ee1847d449fca7b712897830d81", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edb07ee1847d449fca7b712897830d81")).booleanValue() : c.a().isLogin();
    }

    public final void a(com.sankuai.waimai.store.i.user.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fba9c2b8ee2daa46d7ec21c292d12015", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fba9c2b8ee2daa46d7ec21c292d12015");
        } else if (aVar == null) {
        } else {
            c.a().unregisterObserver(a((a) aVar));
            b((a) aVar);
        }
    }

    public final void b(com.sankuai.waimai.store.i.user.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3953349a2646a9015bac7a328829b1a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3953349a2646a9015bac7a328829b1a2");
        } else if (aVar == null) {
        } else {
            c.a().registerObserver(a((a) aVar));
        }
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87999e94f03fcf84a528eec681d1bc64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87999e94f03fcf84a528eec681d1bc64");
        } else {
            c.a().startLoginPage(context);
        }
    }

    public static void a(Context context, Runnable runnable) {
        Object[] objArr = {context, runnable};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dab84b554e092a90102bc2c2b7b2b5eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dab84b554e092a90102bc2c2b7b2b5eb");
        } else {
            c.a().loginWithAction(context, runnable);
        }
    }

    public final long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "166ae1a78308142561ef8a1879dc8a0b", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "166ae1a78308142561ef8a1879dc8a0b")).longValue() : c.a().getUserId();
    }
}
