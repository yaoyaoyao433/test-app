package com.meituan.met.mercury.load.utils;

import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.ag;
import com.meituan.android.cipstorage.q;
import com.meituan.met.mercury.load.bean.StoreThresholdInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static StoreThresholdInfo a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eef332ad23e8c3c722b58e3d3eb95e83", RobustBitConfig.DEFAULT_VALUE) ? (StoreThresholdInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eef332ad23e8c3c722b58e3d3eb95e83") : (StoreThresholdInfo) com.meituan.met.mercury.load.core.e.m().a("threshold_info", new a());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements ag<StoreThresholdInfo> {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // com.meituan.android.cipstorage.ag
        public final /* synthetic */ StoreThresholdInfo deserializeFromString(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82faf4b06f19e4dea69bfae436b57069", RobustBitConfig.DEFAULT_VALUE) ? (StoreThresholdInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82faf4b06f19e4dea69bfae436b57069") : (StoreThresholdInfo) com.meituan.met.mercury.load.utils.a.a(str, new TypeToken<StoreThresholdInfo>() { // from class: com.meituan.met.mercury.load.utils.f.a.1
            }.getType());
        }

        @Override // com.meituan.android.cipstorage.ag
        public final /* synthetic */ String serializeAsString(StoreThresholdInfo storeThresholdInfo) {
            StoreThresholdInfo storeThresholdInfo2 = storeThresholdInfo;
            Object[] objArr = {storeThresholdInfo2};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f81bf550f544eafe9184df922f91d5c9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f81bf550f544eafe9184df922f91d5c9") : com.meituan.met.mercury.load.utils.a.a(storeThresholdInfo2);
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51356f5dd8eb18e7e5f14dad708bd825", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51356f5dd8eb18e7e5f14dad708bd825");
            return;
        }
        q m = com.meituan.met.mercury.load.core.e.m();
        m.a("last_clear_time_" + str, System.currentTimeMillis());
    }

    public static Set<File> a(File file) {
        File[] listFiles;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c91d7bf06e19ffbf473f4445870a4f49", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c91d7bf06e19ffbf473f4445870a4f49");
        }
        if (file == null || !file.exists() || file.isFile() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (File file2 : listFiles) {
            if (file2 != null) {
                if (file2.isFile()) {
                    hashSet.add(file2);
                } else {
                    Set<File> a2 = a(file2);
                    if (a2 != null && !a2.isEmpty()) {
                        hashSet.addAll(a2);
                    }
                }
            }
        }
        return hashSet;
    }
}
