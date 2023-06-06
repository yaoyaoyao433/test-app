package com.sankuai.waimai.platform.machpro.module;

import android.content.Context;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPJSCallBack;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.platform.domain.manager.user.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMLoginModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    public WMLoginModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b65b4416f6d88e96dbfeadbfa81369f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b65b4416f6d88e96dbfeadbfa81369f8");
        }
    }

    @JSMethod(methodName = "login")
    public void login(final MPJSCallBack mPJSCallBack) {
        Context context;
        Object[] objArr = {mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbbbe467555532b3476d723c544a3c62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbbbe467555532b3476d723c544a3c62");
            return;
        }
        if (getMachContext() != null && getMachContext().getContext() != null) {
            context = getMachContext().getContext();
        } else {
            context = b.a;
        }
        a.a(context, new Runnable() { // from class: com.sankuai.waimai.platform.machpro.module.WMLoginModule.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "de685b80fb26939f58fa5036799681bd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "de685b80fb26939f58fa5036799681bd");
                    return;
                }
                MachMap machMap = new MachMap();
                machMap.put("success", Boolean.TRUE);
                mPJSCallBack.invoke(machMap);
            }
        }, new Runnable() { // from class: com.sankuai.waimai.platform.machpro.module.WMLoginModule.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "885eb6f5abed551368ebcd1d77bf9a93", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "885eb6f5abed551368ebcd1d77bf9a93");
                    return;
                }
                MachMap machMap = new MachMap();
                machMap.put("success", Boolean.FALSE);
                mPJSCallBack.invoke(machMap);
            }
        });
    }

    @JSMethod(methodName = "isLogin")
    public boolean isLogin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bfd1ebdacca8f3e15792032b2db63a5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bfd1ebdacca8f3e15792032b2db63a5")).booleanValue() : a.i().a();
    }

    @JSMethod(methodName = "getUserInfo")
    public MachMap getUserInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e75e2f0cf116ccaed65b0ae8bda92d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e75e2f0cf116ccaed65b0ae8bda92d9");
        }
        MachMap machMap = new MachMap();
        long d = a.i().d();
        String g = a.i().g();
        machMap.put(DeviceInfo.USER_ID, d == 0 ? "-1" : String.valueOf(d));
        if ("".equals(g)) {
            g = null;
        }
        machMap.put("userName", g);
        return machMap;
    }
}
