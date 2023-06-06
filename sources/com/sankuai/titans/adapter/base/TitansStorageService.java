package com.sankuai.titans.adapter.base;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.services.IStorageService;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansStorageService implements IStorageService {
    private static final String CHANNEL_NAME = "jsbridge_storage";
    private static final int LEVEL_UNKNOWN = -1;
    private static final String REPORT_CHANNEL = "fe_knb_report";
    private static final String REPORT_TYPE_STORAGE = "titansx-storage";
    private static final int STORAGE_ACTION_READ = 0;
    private static final int STORAGE_ACTION_REMOVE = 2;
    private static final int STORAGE_ACTION_WRITE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean canStorageReport;
    private final q diskStorage;
    private boolean isGetStorageReport;
    private boolean isRemoveStorageReport;
    private boolean isSetStorageReport;
    private final Map<String, String> memoryCache;

    public void setStorageReport(boolean z) {
        this.isSetStorageReport = z;
    }

    public void getStorageReport(boolean z) {
        this.isGetStorageReport = z;
    }

    public void removeStorageReport(boolean z) {
        this.isRemoveStorageReport = z;
    }

    public void canStorageReport(boolean z) {
        this.canStorageReport = z;
    }

    public TitansStorageService(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea2cfae080916b500e61aa5509d381ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea2cfae080916b500e61aa5509d381ad");
            return;
        }
        this.memoryCache = new ConcurrentHashMap();
        this.isSetStorageReport = false;
        this.isGetStorageReport = false;
        this.isRemoveStorageReport = false;
        this.canStorageReport = false;
        this.diskStorage = q.a(context.getApplicationContext(), "jsbridge_storage");
    }

    @Override // com.sankuai.titans.protocol.services.IStorageService
    public void setValue(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44bd3480dc64112c5d08ed1c7f3c22e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44bd3480dc64112c5d08ed1c7f3c22e2");
            return;
        }
        switch (i) {
            case 0:
                setStorageReport(0, str, str2);
                this.memoryCache.put(str, str2);
                this.diskStorage.b(str, u.e);
                return;
            case 1:
                setStorageReport(1, str, str2);
                this.diskStorage.a(str, str2, u.e);
                this.memoryCache.put(str, str2);
                return;
            case 2:
                setStorageReport(2, str, str2);
                throw new IllegalArgumentException("Only Support LEVEL_DISK and LEVEL_MEMORY Storage");
            default:
                setStorageReport(-1, str, str2);
                throw new IllegalArgumentException("Only Support LEVEL_DISK and LEVEL_MEMORY Storage");
        }
    }

    @Override // com.sankuai.titans.protocol.services.IStorageService
    public String getValue(String str) {
        int i = 1;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1345d038f8b18baec6bec0f6979c2b05", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1345d038f8b18baec6bec0f6979c2b05");
        }
        String str2 = "KNB_#DEFAULT#_VALUE";
        if (this.memoryCache.containsKey(str)) {
            str2 = this.memoryCache.get(str);
            i = 0;
        } else {
            String b = this.diskStorage.b(str, "KNB_#DEFAULT#_VALUE", u.e);
            if (!"KNB_#DEFAULT#_VALUE".equals(b)) {
                str2 = b;
            }
        }
        getStorageReport(i, str, str2);
        return str2;
    }

    @Override // com.sankuai.titans.protocol.services.IStorageService
    public void removeValue(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "057d9245224173bdf63b372490d6b263", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "057d9245224173bdf63b372490d6b263");
            return;
        }
        removeStorageReport(-1, str, "");
        this.memoryCache.remove(str);
        this.diskStorage.b(str, u.b);
        this.diskStorage.b(str, u.e);
    }

    private void setStorageReport(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "949a613f92e469ea0cfdf4da0023b54d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "949a613f92e469ea0cfdf4da0023b54d");
        } else if (this.canStorageReport && this.isSetStorageReport) {
            reportStorage(1, i, str, str2);
        }
    }

    private void getStorageReport(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "041a50ac48abac0afd0f10f74ca33a31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "041a50ac48abac0afd0f10f74ca33a31");
        } else if (this.canStorageReport && this.isGetStorageReport) {
            reportStorage(0, i, str, str2);
        }
    }

    private void removeStorageReport(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c21eb73ada0fe66dd396ca801046a3c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c21eb73ada0fe66dd396ca801046a3c0");
        } else if (this.canStorageReport && this.isRemoveStorageReport) {
            reportStorage(2, i, str, str2);
        }
    }

    private void reportStorage(int i, int i2, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4218ab0592fdead0c31a63c3093e8b12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4218ab0592fdead0c31a63c3093e8b12");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", Integer.valueOf(i));
        hashMap.put("level", Integer.valueOf(i2));
        hashMap.put("key", str);
        hashMap.put("data", str2);
        Babel.logRT(new Log.Builder("").reportChannel(REPORT_CHANNEL).ts(System.currentTimeMillis()).tag("titansx-storage").optional(hashMap).build());
    }
}
