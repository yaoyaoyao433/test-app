package com.meituan.msc.modules.update;

import android.os.Build;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCHornBasePackageReloadConfig extends com.meituan.msc.common.config.a<Config> {
    public static ChangeQuickRedirect c;
    private static MSCHornBasePackageReloadConfig e;
    public final List<a> d;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class Config {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("sdkReloadVersions")
        public String[] sdkReloadVersions;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(String[] strArr);
    }

    public final String[] d() {
        return ((Config) this.b).sdkReloadVersions;
    }

    public final boolean a(String str, String[] strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "567d0b3b8d3298c94583b314b76c0988", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "567d0b3b8d3298c94583b314b76c0988")).booleanValue();
        }
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35967531eb90673a554c468ebc2e2d3e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35967531eb90673a554c468ebc2e2d3e")).booleanValue() : a(str, ((Config) this.b).sdkReloadVersions);
    }

    public static MSCHornBasePackageReloadConfig e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bebdbdb7faf31b998fa3a930f099c20f", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCHornBasePackageReloadConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bebdbdb7faf31b998fa3a930f099c20f");
        }
        if (e == null) {
            synchronized (MSCHornBasePackageReloadConfig.class) {
                if (e == null) {
                    e = new MSCHornBasePackageReloadConfig();
                }
            }
        }
        return e;
    }

    public MSCHornBasePackageReloadConfig() {
        super("msc_base_package_reload", Config.class);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "243f8c5198c65c14a098e569f9903dae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "243f8c5198c65c14a098e569f9903dae");
        } else {
            this.d = new ArrayList();
        }
    }

    @Override // com.meituan.msc.common.config.a
    public final Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "505a3b71ce5366f00ed4ffa8902544da", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "505a3b71ce5366f00ed4ffa8902544da");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cityId", Long.valueOf(com.meituan.android.singleton.a.a().b()));
        hashMap.put("chromeVersion", com.meituan.msc.modules.api.web.a.a(MSCEnvHelper.getContext()));
        hashMap.put("deviceLevel", Integer.valueOf(DeviceUtil.getDeviceLevel(MSCEnvHelper.getContext()).getValue()));
        hashMap.put("deviceScore", Double.valueOf(DeviceUtil.getDeviceScore(MSCEnvHelper.getContext())));
        try {
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("manufacturer", str);
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [Config, java.lang.Object] */
    @Override // com.meituan.msc.common.config.a
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d178ce6c0b65e915b25e0c7afce09e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d178ce6c0b65e915b25e0c7afce09e1");
            return;
        }
        super.b(str);
        this.b = a(str);
        if (this.b == 0) {
            com.meituan.msc.modules.reporter.g.d("MSCHornBasePackageReloadConfig", "sdkReloadVersions is null");
            return;
        }
        String[] strArr = ((Config) this.b).sdkReloadVersions;
        Object[] objArr2 = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72af7b57f44e3cc5fd546e15d692e31b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72af7b57f44e3cc5fd546e15d692e31b");
        } else if (strArr == null || strArr.length == 0) {
            com.meituan.msc.modules.reporter.g.d("MSCHornBasePackageReloadConfig", "sdkReloadVersions is empty");
        } else {
            for (a aVar : this.d) {
                aVar.a(strArr);
            }
        }
    }
}
