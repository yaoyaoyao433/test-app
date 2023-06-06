package com.sankuai.waimai.foundation.core.service.user;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c implements IUserManagerService {
    public static ChangeQuickRedirect a;
    private static volatile c b;
    private static final IUserManagerService d = new IUserManagerService() { // from class: com.sankuai.waimai.foundation.core.service.user.c.1
        @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
        public final long getUserId() {
            return 0L;
        }

        @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
        public final boolean isLogin() {
            return false;
        }

        @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
        public final void loginWithAction(Context context, Runnable runnable) {
        }

        @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
        public final void loginWithAction(Context context, Runnable runnable, Runnable runnable2) {
        }

        @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
        public final void loginWithAction(Context context, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        }

        @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
        public final void registerObserver(b bVar) {
        }

        @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
        public final void startLoginPage(Context context) {
        }

        @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
        public final void unregisterObserver(b bVar) {
        }
    };
    private IUserManagerService c;

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c02fdc09a45ca47da465e138cb78e66", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c02fdc09a45ca47da465e138cb78e66");
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
    public boolean isLogin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b3a9128200e3aa5c682a6e0e19b3687", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b3a9128200e3aa5c682a6e0e19b3687")).booleanValue() : b().isLogin();
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
    public void unregisterObserver(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59ccff879656036d549345f80f1c874a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59ccff879656036d549345f80f1c874a");
        } else {
            b().unregisterObserver(bVar);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
    public void registerObserver(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd7b9778dc3b13cf32a1186be549d7c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd7b9778dc3b13cf32a1186be549d7c3");
        } else {
            b().registerObserver(bVar);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
    public void startLoginPage(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "207a374b8d46927892bfcce780d5a6a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "207a374b8d46927892bfcce780d5a6a1");
        } else {
            b().startLoginPage(context);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
    public void loginWithAction(Context context, Runnable runnable) {
        Object[] objArr = {context, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70b619af479db8ab069f5d43bab20456", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70b619af479db8ab069f5d43bab20456");
        } else {
            b().loginWithAction(context, runnable);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
    public void loginWithAction(Context context, Runnable runnable, Runnable runnable2) {
        Object[] objArr = {context, runnable, runnable2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87de607612c2e98a7801ca7f34540d81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87de607612c2e98a7801ca7f34540d81");
        } else {
            b().loginWithAction(context, runnable, runnable2);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
    public void loginWithAction(Context context, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        Object[] objArr = {context, runnable, runnable2, runnable3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cc9fecff6d645356492792b4b9ff4cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cc9fecff6d645356492792b4b9ff4cd");
        } else {
            b().loginWithAction(context, runnable, runnable2, runnable3);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
    public long getUserId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e99dcc227de0de523b123814daf4bff", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e99dcc227de0de523b123814daf4bff")).longValue() : b().getUserId();
    }

    private IUserManagerService b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b196928f7f374df56b0ed9294a7212f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (IUserManagerService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b196928f7f374df56b0ed9294a7212f9");
        }
        if (this.c == null) {
            this.c = (IUserManagerService) com.sankuai.waimai.router.a.a(IUserManagerService.class, IUserManagerService.KEY);
        }
        return this.c == null ? d : this.c;
    }
}
