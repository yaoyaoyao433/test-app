package com.sankuai.waimai.platform.domain.manager.user;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.user.IUserManagerService;
import com.sankuai.waimai.foundation.core.service.user.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UserManagerServiceImpl implements IUserManagerService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
    public boolean isLogin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ed22dbc226f4a269f402ae8b6cd0d65", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ed22dbc226f4a269f402ae8b6cd0d65")).booleanValue() : a.i().a();
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
    public void unregisterObserver(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f14a9c1e173a2f48508e0d8b467cdea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f14a9c1e173a2f48508e0d8b467cdea");
        } else {
            a.i().b(bVar);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
    public void registerObserver(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5170b74d1695a487430919308bd476c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5170b74d1695a487430919308bd476c0");
        } else {
            a.i().a(bVar);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
    public void startLoginPage(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc535ed7336621d43c3065ecd6979226", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc535ed7336621d43c3065ecd6979226");
            return;
        }
        a.i();
        a.a(context);
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
    public void loginWithAction(Context context, Runnable runnable) {
        Object[] objArr = {context, runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e1ae82a29d61c6b757eef7476550f2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e1ae82a29d61c6b757eef7476550f2f");
            return;
        }
        a.i();
        a.a(context, runnable);
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
    public void loginWithAction(Context context, Runnable runnable, Runnable runnable2) {
        Object[] objArr = {context, runnable, runnable2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ac8430c9f6708848127c406a464728f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ac8430c9f6708848127c406a464728f");
            return;
        }
        a.i();
        a.a(context, runnable, runnable2);
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
    public void loginWithAction(Context context, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        Object[] objArr = {context, runnable, runnable2, runnable3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54f0fd6d5697269aa8e688f8eadee4a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54f0fd6d5697269aa8e688f8eadee4a8");
            return;
        }
        a.i();
        a.b(context, runnable, runnable2, runnable3);
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.IUserManagerService
    public long getUserId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a542c95ab1f72eeb4cefc981eec751cd", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a542c95ab1f72eeb4cefc981eec751cd")).longValue() : a.i().d();
    }
}
