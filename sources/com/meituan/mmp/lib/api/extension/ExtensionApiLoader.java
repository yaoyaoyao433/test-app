package com.meituan.mmp.lib.api.extension;

import android.text.TextUtils;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ExtensionApiLoader {
    public static ChangeQuickRedirect a = null;
    private static boolean c = false;
    public static final List<String> b = Arrays.asList("getNativeShopCartData", "getShopCartData", "updateNativeShopCartData", "submitOrder", "collectPoi", "jumpToPoiChatPage", "purchaseNow", "notifyTrackAuth", "sendBLECommand", "Alita_LX");
    private static Set<String> d = new HashSet();

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ApiType {
    }

    public static synchronized void a() {
        synchronized (ExtensionApiLoader.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b38846c79c819f976339c7cd36eae2f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b38846c79c819f976339c7cd36eae2f");
                return;
            }
            if (!c) {
                d.addAll(b);
                List<String> I = com.meituan.mmp.lib.config.b.I();
                if (I != null) {
                    d.removeAll(I);
                }
                a(com.sankuai.meituan.serviceloader.b.a(b.class, (String) null), 0);
                a(com.sankuai.meituan.serviceloader.b.a(ExtensionPrivateApiFactory.class, (String) null), 1);
            }
        }
    }

    private static void a(List<? extends a> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7fa705894b7a4a16ffcc526fc6dcd01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7fa705894b7a4a16ffcc526fc6dcd01");
        } else if (list != null) {
            for (a aVar : list) {
                if (!TextUtils.isEmpty(aVar.b())) {
                    if (i == 1 && d.contains(aVar.b())) {
                        MMPEnvHelper.registerPrivateApi(aVar.b(), aVar.c(), aVar);
                    }
                    MMPEnvHelper.registerWXApi(aVar.b(), aVar.c(), aVar);
                }
            }
        }
    }
}
