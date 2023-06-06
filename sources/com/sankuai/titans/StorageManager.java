package com.sankuai.titans;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class StorageManager {
    private static String CHANNEL_NAME = "jsbridge_storage";
    public static final int LEVEL_CLOUD = 2;
    public static final int LEVEL_DISK = 1;
    public static final int LEVEL_MEMORY = 0;
    public static final int LEVEL_UNKNOWN = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Context localContext;
    protected static final Map<String, String> memoryCache = new ConcurrentHashMap();
    private q diskStorage;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Holder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final StorageManager instance = new StorageManager();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public @interface Level {
    }

    public StorageManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1c1861f83eeb0bf0ae741196271b8ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1c1861f83eeb0bf0ae741196271b8ba");
        } else {
            this.diskStorage = q.a(localContext, CHANNEL_NAME, 2);
        }
    }

    public static StorageManager getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cc3d770d89d31f3877a04ba99dbddd5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (StorageManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cc3d770d89d31f3877a04ba99dbddd5d");
        }
        localContext = context != null ? context.getApplicationContext() : localContext;
        return Holder.instance;
    }

    public final void setValue(String str, String str2, @Level int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfa899ce1cd5dfdd5646ce99c25388a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfa899ce1cd5dfdd5646ce99c25388a7");
            return;
        }
        switch (i) {
            case 0:
                EventReporter.getInstance().setStorageReport(1, 0, str, str2);
                memoryCache.put(str, str2);
                this.diskStorage.b(str, u.b);
                this.diskStorage.b(str, u.e);
                return;
            case 1:
                EventReporter.getInstance().setStorageReport(1, 1, str, str2);
                this.diskStorage.a(str, str2, u.e);
                memoryCache.put(str, str2);
                return;
            case 2:
                EventReporter.getInstance().setStorageReport(1, 2, str, str2);
                throw new IllegalArgumentException("Only Support LEVEL_DISK and LEVEL_MEMORY Storage");
            default:
                EventReporter.getInstance().setStorageReport(1, -1, str, str2);
                throw new IllegalArgumentException("Only Support LEVEL_DISK and LEVEL_MEMORY Storage");
        }
    }

    public final String getValue(String str) {
        String b;
        int i = 1;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "562eaba0f997fa48e326a4ed6622512d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "562eaba0f997fa48e326a4ed6622512d");
        }
        if (memoryCache.containsKey(str)) {
            b = memoryCache.get(str);
            i = 0;
        } else {
            b = this.diskStorage.b(str, "KNB_#DEFAULT#_VALUE", u.e);
            if ("KNB_#DEFAULT#_VALUE".equals(b)) {
                b = this.diskStorage.b(str, "KNB_#DEFAULT#_VALUE", u.b);
                if ("KNB_#DEFAULT#_VALUE".equals(b)) {
                    b = "";
                }
            }
        }
        EventReporter.getInstance().getStorageReport(0, i, str, b);
        return b;
    }

    public final void removeValue(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffdab7a4c045bf0be53627ca1f9a55d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffdab7a4c045bf0be53627ca1f9a55d2");
            return;
        }
        EventReporter.getInstance().removeStorageReport(2, -1, str, "");
        memoryCache.remove(str);
        this.diskStorage.b(str, u.b);
        this.diskStorage.b(str, u.e);
    }
}
