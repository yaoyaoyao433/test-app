package com.dianping.picassocontroller.module;

import android.support.annotation.Keep;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.jscore.Value;
import com.dianping.picassocontroller.annotation.PCSBMethod;
import com.dianping.picassocontroller.annotation.PCSBModule;
import com.dianping.picassocontroller.annotation.PCSModel;
import com.dianping.picassocontroller.vc.b;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
/* compiled from: ProGuard */
@Keep
@PCSBModule(name = "storage")
/* loaded from: classes.dex */
public class StorageModule {
    public static final String PREF_NAME = "picasso_pref";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class KVStore {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int configType;
        public String key;
        public String value;
        public String zone;
    }

    public u getStorageConfig(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a19a7999f04b6432e9891d4f7329ff1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (u) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a19a7999f04b6432e9891d4f7329ff1c");
        }
        switch (i) {
            case 1:
                return u.b;
            case 2:
                return u.c;
            case 3:
                return u.d;
            default:
                return u.e;
        }
    }

    @Keep
    @PCSBMethod(name = DefaultHeaderService.KEY_STORE)
    public Value store(b bVar, KVStore kVStore) {
        Object[] objArr = {bVar, kVStore};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "499cc2b70816f65f0f45e5bba61d9f03", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "499cc2b70816f65f0f45e5bba61d9f03");
        }
        if (TextUtils.isEmpty(kVStore.zone) || TextUtils.isEmpty(kVStore.key) || TextUtils.isEmpty(kVStore.value)) {
            Log.e("StorageModule", "the parameter is invalid");
            return new Value(false);
        }
        q.a(bVar.b(), "picasso_pref_" + kVStore.zone).a(kVStore.key, kVStore.value, getStorageConfig(kVStore.configType));
        return new Value(true);
    }

    @Keep
    @PCSBMethod(name = "retrieve")
    public Value retrieve(b bVar, KVStore kVStore) {
        Object[] objArr = {bVar, kVStore};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3815024f2926e1db27a8210001f1b8e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3815024f2926e1db27a8210001f1b8e");
        }
        if (TextUtils.isEmpty(kVStore.zone) || TextUtils.isEmpty(kVStore.key)) {
            Log.e("StorageModule", "the parameter is invalid");
            return new Value("");
        }
        String str = "picasso_pref_" + kVStore.zone;
        String b = q.a(bVar.b(), str).b(kVStore.key, "", getStorageConfig(kVStore.configType));
        if (TextUtils.isEmpty(b)) {
            b = bVar.b().getSharedPreferences(str, 0).getString(kVStore.key, "");
        }
        return new Value(b);
    }

    @Keep
    @PCSBMethod(name = "remove")
    public Value remove(b bVar, KVStore kVStore) {
        Object[] objArr = {bVar, kVStore};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f51ac8bd14a03c608930739adb21f130", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f51ac8bd14a03c608930739adb21f130");
        }
        if (TextUtils.isEmpty(kVStore.zone) || TextUtils.isEmpty(kVStore.key)) {
            Log.e("StorageModule", "the parameter is invalid");
            return new Value(false);
        }
        String str = "picasso_pref_" + kVStore.zone;
        q.a(bVar.b(), str).b(kVStore.key, getStorageConfig(kVStore.configType));
        bVar.b().getSharedPreferences(str, 0).edit().remove(kVStore.key).apply();
        return new Value(true);
    }

    @Keep
    @PCSBMethod(name = KNBConfig.CONFIG_CLEAR_CACHE)
    public Value clear(b bVar, KVStore kVStore) {
        Object[] objArr = {bVar, kVStore};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65852c9a644c80530534aa972f5c8c53", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65852c9a644c80530534aa972f5c8c53");
        }
        if (TextUtils.isEmpty(kVStore.zone)) {
            Log.e("StorageModule", "the parameter is invalid");
            return new Value(false);
        }
        String str = "picasso_pref_" + kVStore.zone;
        q.a(bVar.b(), str).h();
        bVar.b().getSharedPreferences(str, 0).edit().clear().apply();
        return new Value(true);
    }
}
