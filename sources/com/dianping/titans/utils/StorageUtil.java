package com.dianping.titans.utils;

import android.content.Context;
import com.dianping.networklog.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.StorageManager;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class StorageUtil {
    public static final int LEVEL_CLOUD = 2;
    public static final int LEVEL_DEVICE = 1;
    public static final int LEVEL_MEMORY = 0;
    public static final String SHARED_LEVEL = "level";
    public static ChangeQuickRedirect changeQuickRedirect;
    protected static final HashMap<String, String> mMemoryCache = new HashMap<>();

    public static void putSharedValue(Context context, String str, String str2, int i) {
        Object[] objArr = {context, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9bf0e01dfaae8ce593949a7fa8929515", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9bf0e01dfaae8ce593949a7fa8929515");
            return;
        }
        c.a("StorageUtil@putSharedValue: level: " + i + ", key: " + str + ", value" + str2, 35, new String[]{"StorageUtil@putSharedValue"});
        StorageManager.getInstance(context).setValue(str, str2, i);
    }

    public static String getSharedValue(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0759f47f4602b0f21766545774965875", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0759f47f4602b0f21766545774965875");
        }
        String value = StorageManager.getInstance(context).getValue(str);
        c.a("StorageUtil@getSharedValue: key: " + str + ", value" + value, 35, new String[]{"StorageUtil@getSharedValue"});
        return value;
    }

    public static void clearShareValue(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ad6a0a8f079971c4e98a6c56bc83206", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ad6a0a8f079971c4e98a6c56bc83206");
            return;
        }
        StorageManager.getInstance(context).removeValue(str);
        c.a("StorageUtil@clearShareValue: key: " + str, 35, new String[]{"StorageUtil@clearShareValue"});
    }
}
