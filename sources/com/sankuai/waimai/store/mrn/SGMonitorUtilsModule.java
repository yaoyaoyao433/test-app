package com.sankuai.waimai.store.mrn;

import android.app.Activity;
import android.text.TextUtils;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.cache.ApiCache;
import com.sankuai.waimai.store.util.monitor.cache.SchemeCache;
import com.sankuai.waimai.store.util.monitor.monitor.MRNMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.SGCommonScheme;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGMonitorUtilsModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "SGMonitorModule";
    }

    public SGMonitorUtilsModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49cbec492832633459f85a898c3fa748", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49cbec492832633459f85a898c3fa748");
        }
    }

    @ReactMethod
    public void saveApiCacheToMonitor(String str, String str2, String str3, int i, Promise promise) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a23859c1b139f1f6461837554cd9b442", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a23859c1b139f1f6461837554cd9b442");
        } else {
            com.sankuai.waimai.store.util.monitor.cache.b.a(ApiCache.create(str, str2, str3, i));
        }
    }

    @ReactMethod
    public void saveSchemeCacheToMonitor(String str, int i, Promise promise) {
        Object[] objArr = {str, Integer.valueOf(i), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bc00f11c106edefadcfc07cad6bc603", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bc00f11c106edefadcfc07cad6bc603");
        } else {
            com.sankuai.waimai.store.util.monitor.cache.b.a(SchemeCache.create(str, i == 0 ? "success" : "failed"));
        }
    }

    @ReactMethod
    public void onStartSchemeFailedMonitor(int i, String str, String str2, Promise promise) {
        Object[] objArr = {Integer.valueOf(i), str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9e2bf92d9f13947ea505052e3a8499b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9e2bf92d9f13947ea505052e3a8499b");
        } else if (i == -1 && "登陆取消".equals(str2)) {
        } else {
            SGCommonScheme sGCommonScheme = SGCommonScheme.OpenError;
            com.sankuai.waimai.store.util.monitor.c.a(sGCommonScheme, "url=" + str + "###" + str2, String.valueOf(i));
        }
    }

    @ReactMethod
    public void reportFail(String str, String str2, String str3, Promise promise) {
        Object[] objArr = {str, str2, str3, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "698920ce1b1d90ac464417e5140786b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "698920ce1b1d90ac464417e5140786b9");
        } else {
            com.sankuai.waimai.store.util.monitor.c.a(new MRNMonitor(str, str2), str3, "");
        }
    }

    private String getLastPageInfo() {
        Activity activity;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee3bb5705b09506166c4fdd4afa87009", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee3bb5705b09506166c4fdd4afa87009");
        }
        List<Activity> b = com.sankuai.waimai.store.util.b.b();
        StringBuffer stringBuffer = new StringBuffer();
        int size = b.size() - 1;
        if (size >= 0 && (activity = b.get(size)) != getCurrentActivity() && activity.getIntent() != null) {
            stringBuffer.append(activity.getIntent().getData());
        }
        return stringBuffer.toString();
    }

    @ReactMethod
    public void reportNormal(String str, String str2, Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06fe732b14451b6364f8628bd496b6a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06fe732b14451b6364f8628bd496b6a7");
            return;
        }
        if (TextUtils.equals(str, "ProductPolymeric")) {
            str2 = getLastPageInfo();
        }
        com.sankuai.waimai.store.util.monitor.c.b(new MRNMonitor(str, ""), str2, "");
    }

    @ReactMethod
    public void reportFailWithTags(String str, String str2, String str3, ReadableMap readableMap, Promise promise) {
        Object[] objArr = {str, str2, str3, readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce45b92d6c03b9672cad2d0318854f3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce45b92d6c03b9672cad2d0318854f3c");
        } else {
            com.sankuai.waimai.store.util.monitor.c.a(new MRNMonitor(str, str2), str3, "", toStringMap(readableMap));
        }
    }

    @ReactMethod
    public void reportNormalWithTags(String str, String str2, ReadableMap readableMap, Promise promise) {
        Object[] objArr = {str, str2, readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae36eb9dbcc41b6a5fb65e198b380f28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae36eb9dbcc41b6a5fb65e198b380f28");
        } else {
            com.sankuai.waimai.store.util.monitor.c.b(new MRNMonitor(str, ""), str2, "", toStringMap(readableMap));
        }
    }

    private Map<String, String> toStringMap(ReadableMap readableMap) {
        HashMap<String, Object> hashMap;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09ad83bdda98b8e55b98c37662069716", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09ad83bdda98b8e55b98c37662069716");
        }
        if (readableMap != null) {
            hashMap = readableMap.toHashMap();
        } else {
            hashMap = new HashMap<>();
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            hashMap2.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap2;
    }
}
