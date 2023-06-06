package com.sankuai.waimai.platform.encrypt;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.dianping.titans.js.jshandler.GetAppInfoJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class Env {
    public static ChangeQuickRedirect a;

    public static EnvType a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dab8b56d7f0540e0d9fdd52b1ad54144", RobustBitConfig.DEFAULT_VALUE) ? (EnvType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dab8b56d7f0540e0d9fdd52b1ad54144") : a(EnvType.PROD);
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public enum EnvType {
        PROD,
        STAGE,
        RELEASE,
        TEST,
        BETA,
        DEV;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static EnvType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "daa86e16c1efeb0c20543310de3f217c", RobustBitConfig.DEFAULT_VALUE) ? (EnvType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "daa86e16c1efeb0c20543310de3f217c") : (EnvType) Enum.valueOf(EnvType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnvType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f7edcc2c39dc5a6531b2136ed9c97b6b", RobustBitConfig.DEFAULT_VALUE) ? (EnvType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f7edcc2c39dc5a6531b2136ed9c97b6b") : (EnvType[]) values().clone();
        }

        EnvType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6191e797009a641e1ef95be9e1e2c80f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6191e797009a641e1ef95be9e1e2c80f");
            }
        }
    }

    private static EnvType a(EnvType envType) {
        Object[] objArr = {envType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c68ce433312257311faa19a83cb88261", RobustBitConfig.DEFAULT_VALUE)) {
            return (EnvType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c68ce433312257311faa19a83cb88261");
        }
        Context context = com.meituan.android.singleton.b.a;
        String lowerCase = "".toLowerCase();
        if (TextUtils.isEmpty(lowerCase) || lowerCase.contains("prod")) {
            return EnvType.PROD;
        }
        if (lowerCase.contains("stage")) {
            return EnvType.STAGE;
        }
        if (lowerCase.contains("test")) {
            return EnvType.TEST;
        }
        if (lowerCase.contains("beta")) {
            return EnvType.BETA;
        }
        return lowerCase.contains(GetAppInfoJsHandler.PACKAGE_TYPE_DEV) ? EnvType.DEV : envType;
    }
}
