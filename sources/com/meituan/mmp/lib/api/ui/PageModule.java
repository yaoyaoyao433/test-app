package com.meituan.mmp.lib.api.ui;

import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.ab;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.lib.api.d;
import com.meituan.mmp.lib.api.s;
import com.meituan.mmp.lib.executor.b;
import com.meituan.mmp.lib.utils.h;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.TitansBundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PageModule extends ActivityApi {
    public static ChangeQuickRedirect h;
    private static final List<String> i = Arrays.asList("switchTab", "redirectTo", "reLaunch", "navigateBack", "navigateTo");
    private static final List<String> j = Arrays.asList("showToast", "hideToast", TitansBundle.PARAM_SHOW_LOADING, "hideLoading", "disableScrollBounce", "setBackgroundColor", "setBackgroundTextStyle", "enableBeforeUnload", "disableBeforeUnload", "pageNotFoundCallback", "startPullDownRefresh", "stopPullDownRefresh");
    private static final List<String> k = Arrays.asList("setNavigationBarTitle", "setNavigationBarColor", "showNavigationBarLoading", "hideNavigationBarLoading", "setTabBarBadge", "removeTabBarBadge", "showTabBarRedDot", "hideTabBarRedDot", "setTabBarStyle", "setTabBarItem", "showTabBar", "hideTabBar");
    private static final String[] l;

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        return l;
    }

    static {
        List list;
        Collection[] collectionArr = {i, j, k};
        Object[] objArr = {collectionArr};
        ChangeQuickRedirect changeQuickRedirect = h.a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d475750eaa646348e93918b988947951", RobustBitConfig.DEFAULT_VALUE)) {
            list = (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d475750eaa646348e93918b988947951");
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 3; i2++) {
                arrayList.addAll(collectionArr[i2]);
            }
            list = arrayList;
        }
        l = (String[]) list.toArray(new String[0]);
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, final IApiCallback iApiCallback) throws d {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a3b5f0a8c3c88a9db5783fc3f1195a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a3b5f0a8c3c88a9db5783fc3f1195a2");
            return;
        }
        com.meituan.mmp.lib.a containerByPageIdOrCurContainer = getContainerByPageIdOrCurContainer(a(jSONObject));
        if (containerByPageIdOrCurContainer == null) {
            iApiCallback.onFail(codeJson(-1, "no available controller"));
        } else if (containerByPageIdOrCurContainer.a() && !DebugHelper.p && k.contains(str)) {
            throw new s();
        } else {
            try {
                ab y = containerByPageIdOrCurContainer.y();
                if (y != null) {
                    y.a(str, jSONObject, iApiCallback);
                } else {
                    iApiCallback.onFail(codeJson(-1, "no pageManager avaliable"));
                }
                if (i.contains(str)) {
                    com.meituan.mmp.lib.executor.a.a((Runnable) new b() { // from class: com.meituan.mmp.lib.api.ui.PageModule.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cee5d684408ec1e1a76f236dcd90dfa3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cee5d684408ec1e1a76f236dcd90dfa3");
                            } else {
                                iApiCallback.onSuccess(null);
                            }
                        }
                    });
                } else {
                    iApiCallback.onSuccess(null);
                }
            } catch (d e) {
                com.meituan.mmp.lib.trace.b.c("PageModule", str + " failed, " + e.getMessage());
                iApiCallback.onFail(codeJson(-1, e.getMessage()));
            }
        }
    }
}
