package com.meituan.android.common.unionid.oneid.oaid;

import com.meituan.android.common.unionid.oneid.oaid.provider.AbstractProvider;
import com.meituan.android.common.unionid.oneid.oaid.provider.HwOaidProvider;
import com.meituan.android.common.unionid.oneid.oaid.provider.MiOaidProvider;
import com.meituan.android.common.unionid.oneid.oaid.provider.OppoOaidProvider;
import com.meituan.android.common.unionid.oneid.oaid.provider.SamsungOaidProvider;
import com.meituan.android.common.unionid.oneid.oaid.provider.VivoOaidProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OaidProviderFactory {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum ProviderEnum {
        NULL("NULL"),
        HUAWEI("HUAWEI"),
        XIAOMI("XIAOMI"),
        OPPO(RouteSelector.ROM_OPPO),
        VIVO(RouteSelector.ROM_VIVO),
        SAMSUNG(RouteSelector.ROM_SAMSUNG);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private String name;

        public static ProviderEnum valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "59517e42f3f98a9f252573c14ff27c52", RobustBitConfig.DEFAULT_VALUE) ? (ProviderEnum) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "59517e42f3f98a9f252573c14ff27c52") : (ProviderEnum) Enum.valueOf(ProviderEnum.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ProviderEnum[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "43578d77f002a5cb9413a9ff1e23716d", RobustBitConfig.DEFAULT_VALUE) ? (ProviderEnum[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "43578d77f002a5cb9413a9ff1e23716d") : (ProviderEnum[]) values().clone();
        }

        ProviderEnum(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4c46f7cc14e232c90367c74fa92a1af", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4c46f7cc14e232c90367c74fa92a1af");
            } else {
                this.name = str;
            }
        }

        public final String getName() {
            return this.name;
        }

        public final void setName(String str) {
            this.name = str;
        }
    }

    public static AbstractProvider getProvider(ProviderEnum providerEnum) {
        Object[] objArr = {providerEnum};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fd5a50c24c376687de1d7e266a54bd1f", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbstractProvider) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fd5a50c24c376687de1d7e266a54bd1f");
        }
        if (providerEnum == null || providerEnum.equals(ProviderEnum.NULL)) {
            return null;
        }
        switch (providerEnum) {
            case HUAWEI:
                return HwOaidProvider.getSingleton();
            case XIAOMI:
                return MiOaidProvider.getSingleton();
            case OPPO:
                return OppoOaidProvider.getSingleton();
            case VIVO:
                return VivoOaidProvider.getSingleton();
            case SAMSUNG:
                return SamsungOaidProvider.getSingleton();
            default:
                return null;
        }
    }
}
