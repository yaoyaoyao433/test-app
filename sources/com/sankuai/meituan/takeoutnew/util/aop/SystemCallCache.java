package com.sankuai.meituan.takeoutnew.util.aop;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.util.ProcessUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.app.config.WaimaiSP;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
import com.sankuai.waimai.foundation.utils.ad;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SystemCallCache extends Lifecycle implements Application.ActivityLifecycleCallbacks, com.sankuai.waimai.foundation.core.lifecycle.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static boolean inForeground = ProcessUtil.isMainProcess(com.meituan.android.singleton.b.a);
    private static final SparseArray<List> installedAppListCache = new SparseArray<>();
    private static SystemCallCacheScope installedAppListCacheScope = SystemCallCacheScope.safeValue(WaimaiSP.c());

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "511248796227ad3c1cd7112f9379a51f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "511248796227ad3c1cd7112f9379a51f");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "SystemCallCache";
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    enum SystemCallCacheScope {
        app,
        session,
        page;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static SystemCallCacheScope valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a89a2cc09349b9136f90f4545ad282d1", RobustBitConfig.DEFAULT_VALUE) ? (SystemCallCacheScope) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a89a2cc09349b9136f90f4545ad282d1") : (SystemCallCacheScope) Enum.valueOf(SystemCallCacheScope.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static SystemCallCacheScope[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb402f2d14cb89e4e15cb0e019a5da2d", RobustBitConfig.DEFAULT_VALUE) ? (SystemCallCacheScope[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb402f2d14cb89e4e15cb0e019a5da2d") : (SystemCallCacheScope[]) values().clone();
        }

        SystemCallCacheScope() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dfc03179089376ba63bf9759e4a2845", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dfc03179089376ba63bf9759e4a2845");
            }
        }

        public static SystemCallCacheScope safeValue(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3d6f095b18545d44862d25482419aceb", RobustBitConfig.DEFAULT_VALUE)) {
                return (SystemCallCacheScope) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3d6f095b18545d44862d25482419aceb");
            }
            try {
                return valueOf(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static void updateConfig(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "96bbd1d848c7760fe74099a591e26143", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "96bbd1d848c7760fe74099a591e26143");
        } else if (map == null) {
        } else {
            String str = map.get("PackageManager.getInstalledApplications");
            SystemCallCacheScope safeValue = SystemCallCacheScope.safeValue(str);
            installedAppListCacheScope = safeValue;
            if (safeValue == null) {
                str = null;
            }
            WaimaiSP.a(str);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public void onAppToForeground(@Nullable Activity activity) {
        inForeground = true;
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public void onAppToBackground(@Nullable Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de3f7456327e541eee09f2e5a07c8d18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de3f7456327e541eee09f2e5a07c8d18");
            return;
        }
        inForeground = false;
        if (SystemCallCacheScope.session == installedAppListCacheScope) {
            ad.a(new Runnable() { // from class: com.sankuai.meituan.takeoutnew.util.aop.SystemCallCache.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cf07de800359516d33e76eaa561c7fab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cf07de800359516d33e76eaa561c7fab");
                        return;
                    }
                    synchronized (SystemCallCache.installedAppListCache) {
                        SystemCallCache.installedAppListCache.clear();
                    }
                }
            }, 100L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bcbd7e95699c52e46036dede19f27c0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bcbd7e95699c52e46036dede19f27c0e");
        } else if (SystemCallCacheScope.page == installedAppListCacheScope) {
            synchronized (installedAppListCache) {
                installedAppListCache.clear();
            }
        }
    }
}
