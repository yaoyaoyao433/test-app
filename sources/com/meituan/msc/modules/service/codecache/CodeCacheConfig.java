package com.meituan.msc.modules.service.codecache;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class CodeCacheConfig extends com.meituan.msc.common.config.a<Config> {
    public static ChangeQuickRedirect c;
    public static final CodeCacheConfig d = new CodeCacheConfig();

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class Config {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean enableCodeCache = true;
        public Set<String> appBlackList = null;
        public int minJSFileSize = 0;
        public int createDelayTimesInSeconds = 2;
        public boolean enableUsageReport = true;
        public int minUsageReportIntervalInHour = 24;
        public boolean attachDirectoryAsync = false;
        public boolean writeRecordInTemporary = true;
        public boolean enableLru = true;
        public int lruCacheLimit = 80;
    }

    public CodeCacheConfig() {
        super("msc_code_cache", Config.class);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3892bcd3a41d62be03418fe23b54f6d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3892bcd3a41d62be03418fe23b54f6d0");
        }
    }

    public static boolean d() {
        return ((Config) d.b).enableCodeCache;
    }

    public static boolean e() {
        return ((Config) d.b).enableUsageReport;
    }

    public static int f() {
        return ((Config) d.b).minUsageReportIntervalInHour;
    }

    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0f93f504c1137ea1beb872bc7b34288", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0f93f504c1137ea1beb872bc7b34288")).booleanValue();
        }
        if (d()) {
            return ((Config) this.b).appBlackList == null || !((Config) this.b).appBlackList.contains(str);
        }
        return false;
    }

    public static int g() {
        return ((Config) d.b).createDelayTimesInSeconds;
    }

    public static boolean h() {
        return ((Config) d.b).attachDirectoryAsync;
    }

    public static boolean i() {
        return ((Config) d.b).writeRecordInTemporary;
    }

    public static boolean j() {
        return ((Config) d.b).enableLru;
    }

    public static int k() {
        return ((Config) d.b).lruCacheLimit;
    }
}
