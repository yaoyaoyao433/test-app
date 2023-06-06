package com.meituan.android.mrn.codecache;

import com.google.gson.reflect.TypeToken;
import com.meituan.android.mrn.config.t;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static final b b = new b();

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09c8672667bc2a6354cff1367175849a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09c8672667bc2a6354cff1367175849a");
            return;
        }
        a("CodeCache.enableBaseBundle", Boolean.TYPE, Boolean.FALSE, "是否启用Base包的创建逻辑");
        a("CodeCache.minJSFileSize", Integer.TYPE, 400, "最小的生成CodeCache的JS文件大小(单位KB)");
        a("CodeCache.enableCodeCache", new TypeToken<List<String>>() { // from class: com.meituan.android.mrn.codecache.b.1
        }.getType(), Collections.emptyList(), "生成CodeCache的白名单");
        a("CodeCache.storageQuota", Integer.TYPE, 40, "获取CodeCache能占用的最大空间配额(单位MB)");
        a("CodeCache.minCodeCacheFileCount", Integer.TYPE, 10, "获取最少可生成的CodeCache文件的数量");
        a("CodeCache.executeDelayTimesInSeconds", Integer.TYPE, 1, "获取延迟执行的时间(单位S)");
        a("CodeCache.executeDelayTimesPage", Integer.TYPE, 500, "页面渲染完成后多久创建CodeCache");
        a("CodeCache.maxLiveDays", Integer.TYPE, 7, "CodeCache最多的存活天数(单位D)");
    }

    private void a(String str, Type type, Object obj, String str2) {
        Object[] objArr = {str, type, obj, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c738ff8d4364bf9c282f65604a75ba4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c738ff8d4364bf9c282f65604a75ba4");
        } else {
            t.a(str, type, obj, "mrn_codecache_config_android", str2);
        }
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c0471f68fd7a2464ac1044d68754be8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c0471f68fd7a2464ac1044d68754be8")).booleanValue();
        }
        if (MRNBundleManager.BASE_BUNDLE_NAME.equals(str)) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eaf567bf8046d37d3d16bff1d013c26c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eaf567bf8046d37d3d16bff1d013c26c")).booleanValue() : ((Boolean) t.b.a("CodeCache.enableBaseBundle")).booleanValue();
        }
        return ((List) t.b.a("CodeCache.enableCodeCache")).contains(str);
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ce249d35400cb51191a4f56b7287364", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ce249d35400cb51191a4f56b7287364")).intValue() : ((Integer) t.b.a("CodeCache.executeDelayTimesInSeconds")).intValue();
    }
}
