package com.meituan.android.ptcommonim.base.manager;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.n;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a b;
    private static C0356a c;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4671e5ae518125c0f08e8a980e6ac7fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4671e5ae518125c0f08e8a980e6ac7fa");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    @Deprecated
    public final void a(Context context, PTIMCommonBean.UserType userType) {
        Object[] objArr = {context, userType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "309f4fd712e2c61b8ba225d126bca6be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "309f4fd712e2c61b8ba225d126bca6be");
        } else if (context != null) {
            UserCenter userCenter = UserCenter.getInstance(context);
            C0356a c0356a = new C0356a(userCenter != null ? userCenter.getToken() : "", userType);
            Object[] objArr2 = {context, c0356a};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a47ac49360426fc174dfdcbe062b9454", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a47ac49360426fc174dfdcbe062b9454");
                return;
            }
            c = c0356a;
            b a2 = b.a();
            PTIMCommonBean.UserType userType2 = c0356a.b;
            Object[] objArr3 = {userType2};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "a10a7b287de26710ef2874b59a4f6162", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "a10a7b287de26710ef2874b59a4f6162");
            } else {
                if (userType2 == PTIMCommonBean.UserType.TYPE_B) {
                    b.b = "ptim_withdraw_config_merchant";
                } else {
                    b.b = "ptim_withdraw_config_user";
                }
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "53f622d86d13fddf01c701eb1e9b70f8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "53f622d86d13fddf01c701eb1e9b70f8");
                } else {
                    Horn.register(b.b, c.a(a2));
                }
            }
            Object[] objArr5 = {context};
            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.ptcommonim.message.recall.manager.a.a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "58d1040732399dc06780f4aeefe4b551", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "58d1040732399dc06780f4aeefe4b551");
            } else if (b.a().c() && context != null) {
                long b2 = q.a(context, "cip_pt_commonimbus_recall").b("cip_recall", 0L);
                if (b2 != 0 && com.meituan.android.ptcommonim.message.recall.manager.a.a(b2, "86400")) {
                    q.a(context, "cip_pt_commonimbus_recall").c();
                }
            }
            n.a();
            com.meituan.android.ptcommonim.base.util.a.a(context);
        }
    }

    public static C0356a b() {
        return c;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.ptcommonim.base.manager.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0356a {
        public final String a;
        public final PTIMCommonBean.UserType b;

        public C0356a(String str, PTIMCommonBean.UserType userType) {
            this.a = str;
            this.b = userType;
        }
    }
}
