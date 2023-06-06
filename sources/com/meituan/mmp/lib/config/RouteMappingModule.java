package com.meituan.mmp.lib.config;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.mmp.lib.msi.MMPApi;
import com.meituan.mmp.lib.utils.v;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: ProGuard */
@MsiApiEnv(name = ContainerInfo.ENV_MMP)
/* loaded from: classes3.dex */
public class RouteMappingModule extends MMPApi {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class Mappings {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String __version;
        @MsiParamChecker(required = true)
        public Mapping[] mappings;

        /* compiled from: ProGuard */
        @MsiSupport
        /* loaded from: classes3.dex */
        public static class Mapping {
            public static ChangeQuickRedirect changeQuickRedirect;
            @MsiParamChecker(required = true)
            public String origin;
            @MsiParamChecker(required = true)
            public String target;
        }

        public boolean isValidVersion(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9018e94f8f3d5f3d62165ca48da4eb3e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9018e94f8f3d5f3d62165ca48da4eb3e")).booleanValue() : TextUtils.equals(this.__version, str);
        }

        public boolean checkIsValidVersionAndDeleteInvalidMappings(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74a71a94462103400427826699a1ea36", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74a71a94462103400427826699a1ea36")).booleanValue();
            }
            boolean isValidVersion = isValidVersion(str);
            if (!isValidVersion) {
                RouteMappingModule.a(str2);
            }
            return isValidVersion;
        }
    }

    private static SharedPreferences b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8025d62ef57095925221c7d3c798fa5", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8025d62ef57095925221c7d3c798fa5") : MMPEnvHelper.getSharedPreferences("mmpRouteMapping");
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c0c83e4948ce156c5dcdea2d028502b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c0c83e4948ce156c5dcdea2d028502b");
        } else {
            b().edit().remove(str).clear().apply();
        }
    }

    public static Mappings a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ecd09a2339bce0ee6fcbb3c391bbb34", RobustBitConfig.DEFAULT_VALUE)) {
            return (Mappings) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ecd09a2339bce0ee6fcbb3c391bbb34");
        }
        Mappings mappings = (Mappings) new Gson().fromJson(b().getString(str, null), new TypeToken<Mappings>() { // from class: com.meituan.mmp.lib.config.RouteMappingModule.1
        }.getType());
        if (mappings == null || !mappings.checkIsValidVersionAndDeleteInvalidMappings(str2, str)) {
            return null;
        }
        return mappings;
    }

    public static HashMap<String, String> a(Mappings mappings) {
        Mappings.Mapping[] mappingArr;
        Object[] objArr = {mappings};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6b2374f5b04296b19ec76773121faac", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6b2374f5b04296b19ec76773121faac");
        }
        if (mappings == null || mappings.mappings == null) {
            return new HashMap<>();
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (Mappings.Mapping mapping : mappings.mappings) {
            hashMap.put(mapping.origin, mapping.target);
        }
        return hashMap;
    }

    @MsiApiMethod(env = {ContainerInfo.ENV_MMP}, name = "setRouteMapping", request = Mappings.class)
    public void setRouteMapping(Mappings mappings, MsiContext msiContext) {
        Mappings.Mapping[] mappingArr;
        Object[] objArr = {mappings, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f841013973fb17e0ca0c9bfbc9b615e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f841013973fb17e0ca0c9bfbc9b615e");
            return;
        }
        for (Mappings.Mapping mapping : mappings.mappings) {
            if (mapping == null || TextUtils.isEmpty(mapping.origin) || TextUtils.isEmpty(mapping.target)) {
                msiContext.onError("setRouteMapping config error, there is mapping/origin/target null in appConfig");
                return;
            } else if (!this.d.d.c(mapping.origin)) {
                msiContext.onError("setRouteMapping config error, there is no originPath " + mapping.origin + " in appConfig");
                return;
            } else if (!this.d.d.c(mapping.target)) {
                msiContext.onError("setRouteMapping config error, there is no targetPath " + mapping.target + " in appConfig");
                return;
            }
        }
        mappings.__version = a();
        this.d.d.i = a(mappings);
        b().edit().putString(this.d.b, new Gson().toJson(mappings)).apply();
        msiContext.onSuccess(null);
    }

    @MsiApiMethod(env = {ContainerInfo.ENV_MMP}, name = "getRouteMapping", response = Mappings.class)
    public void getRouteMapping(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c44436250c60e4303f71c89260766056", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c44436250c60e4303f71c89260766056");
            return;
        }
        Object a2 = a(this.d.b, a());
        if (a2 == null) {
            a2 = v.a("mappings", Collections.emptyList());
        }
        msiContext.onSuccess(a2);
    }
}
