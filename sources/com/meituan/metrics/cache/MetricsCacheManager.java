package com.meituan.metrics.cache;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.metrics.cache.db.PageReportCountDao;
import com.meituan.metrics.config.MetricsRemoteConfigManager;
import com.meituan.metrics.config.MetricsRemoteConfigV2;
import com.meituan.metrics.model.AbstractEvent;
import com.meituan.metrics.net.report.MetricsReportManager;
import com.meituan.metrics.util.thread.Task;
import com.meituan.metrics.util.thread.ThreadManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsCacheManager implements AppBus.OnForegroundListener, AppBus.OnStopListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static MetricsCacheManager sInstance;
    private q cacheStorage;
    private int currentDayReportCountV2;
    private boolean needCheck;
    private Map<String, Integer> pageCountCacheV2;

    public static MetricsCacheManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dbe3a3aa48506bcabec8e26731c91b2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsCacheManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dbe3a3aa48506bcabec8e26731c91b2c");
        }
        if (sInstance == null) {
            synchronized (MetricsCacheManager.class) {
                if (sInstance == null) {
                    sInstance = new MetricsCacheManager();
                }
            }
        }
        return sInstance;
    }

    public void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12da9b018de43d7c1135c19a8a8e4623", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12da9b018de43d7c1135c19a8a8e4623");
            return;
        }
        this.cacheStorage = q.a(context, "metrics_cache", 2);
        ThreadManager.getInstance().postIO(new Task() { // from class: com.meituan.metrics.cache.MetricsCacheManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.metrics.util.thread.Task
            public void schedule() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "545f1c1e2305d5a3397f5ca6f56a2251", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "545f1c1e2305d5a3397f5ca6f56a2251");
                    return;
                }
                MetricsCacheManager.this.getPageCountCache();
                PageReportCountDao.removeInvalidPageCountRecord(MetricsCacheManager.this.cacheStorage);
            }
        });
    }

    public void setConfig(MetricsRemoteConfigV2 metricsRemoteConfigV2) {
        boolean z = true;
        Object[] objArr = {metricsRemoteConfigV2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a75ef4f4c215e2850320986855705612", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a75ef4f4c215e2850320986855705612");
            return;
        }
        if (metricsRemoteConfigV2 == null || (metricsRemoteConfigV2.dayLimitPerPage <= 0 && metricsRemoteConfigV2.dayLimit <= 0)) {
            z = false;
        }
        this.needCheck = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getPageCountCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb5754780a3009d27c163173b8a9591d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb5754780a3009d27c163173b8a9591d");
        } else {
            ThreadManager.getInstance().postIO(new Task() { // from class: com.meituan.metrics.cache.MetricsCacheManager.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.metrics.util.thread.Task
                public void schedule() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "731fe266b083b0672a86eeb7f8c91d1d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "731fe266b083b0672a86eeb7f8c91d1d");
                        return;
                    }
                    MetricsCacheManager.this.pageCountCacheV2 = PageReportCountDao.getCurrentDayReportCount(PageReportCountDao.REPORT_RECORD_V2, MetricsCacheManager.this.cacheStorage, MetricsCacheManager.this.pageCountCacheV2);
                    MetricsCacheManager.this.currentDayReportCountV2 = PageReportCountDao.getCurrentDayCount(PageReportCountDao.REPORT_COUNT_V2, MetricsCacheManager.this.cacheStorage);
                }
            });
        }
    }

    public MetricsCacheManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da779eb3fc500d95f0080b2d0ca8883b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da779eb3fc500d95f0080b2d0ca8883b");
            return;
        }
        this.pageCountCacheV2 = new ConcurrentHashMap();
        this.currentDayReportCountV2 = 0;
        this.needCheck = false;
        AppBus.getInstance().register((AppBus.OnForegroundListener) this);
        AppBus.getInstance().register((AppBus.OnStopListener) this);
    }

    public void addToCache(AbstractEvent abstractEvent) {
        Object[] objArr = {abstractEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31ca26388654f6c4b254fff81f70765a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31ca26388654f6c4b254fff81f70765a");
        } else if (abstractEvent != null && abstractEvent.isValid() && abstractEvent.configFrom == 2) {
            if (!this.needCheck) {
                addCache(abstractEvent);
            } else {
                addCacheWithLimit(abstractEvent);
            }
        }
    }

    private void addCache(AbstractEvent abstractEvent) {
        Object[] objArr = {abstractEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "933ba291b8db25ec7e97da3332e1eb55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "933ba291b8db25ec7e97da3332e1eb55");
        } else {
            MetricsReportManager.getInstance().reportByBabel(abstractEvent);
        }
    }

    private void addCacheWithLimit(AbstractEvent abstractEvent) {
        boolean z = false;
        Object[] objArr = {abstractEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7b5453a52ce5a5c69b9fd3e6eab03b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7b5453a52ce5a5c69b9fd3e6eab03b9");
            return;
        }
        MetricsRemoteConfigV2 remoteConfigV2 = MetricsRemoteConfigManager.getInstance().getRemoteConfigV2();
        if (remoteConfigV2 != null && checkConfigLimit(abstractEvent, remoteConfigV2.dayLimit, remoteConfigV2.dayLimitPerPage, this.currentDayReportCountV2, this.pageCountCacheV2)) {
            z = true;
        }
        if (z) {
            MetricsReportManager.getInstance().reportByBabel(abstractEvent);
            this.currentDayReportCountV2++;
            upDatePageCountCache(this.pageCountCacheV2, abstractEvent.getPageName());
        }
    }

    private void upDatePageCountCache(Map<String, Integer> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8925209ca8a7a436b0700244d12299b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8925209ca8a7a436b0700244d12299b4");
        } else if (TextUtils.isEmpty(str) || map == null) {
        } else {
            int pageReportCount = getPageReportCount(map, str);
            if (pageReportCount >= 0) {
                map.put(str, Integer.valueOf(pageReportCount + 1));
            } else {
                map.put(str, 1);
            }
        }
    }

    private boolean checkConfigLimit(AbstractEvent abstractEvent, int i, int i2, int i3, Map<String, Integer> map) {
        Object[] objArr = {abstractEvent, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d23dfa96988c61d8e0b23dfa9ba65e1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d23dfa96988c61d8e0b23dfa9ba65e1")).booleanValue();
        }
        String pageName = abstractEvent.getPageName();
        if (TextUtils.isEmpty(pageName) || TextUtils.equals(pageName, "default") || i2 == 0 || map == null || map.size() <= 0) {
            return i <= 0 || i3 < i;
        }
        int pageReportCount = getPageReportCount(map, pageName);
        boolean z = pageReportCount < 0 || pageReportCount < i2;
        return i > 0 ? z && i3 < i : z;
    }

    private int getPageReportCount(Map<String, Integer> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87fec43ab1382b57a9ad9b914043eaea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87fec43ab1382b57a9ad9b914043eaea")).intValue();
        }
        Integer num = map.get(str);
        if (num instanceof Number) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.meituan.android.common.metricx.helpers.AppBus.OnStopListener
    public void onStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6f0f0d8da672372bae5ea3a04a92fdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6f0f0d8da672372bae5ea3a04a92fdc");
        } else if (this.needCheck && this.pageCountCacheV2 != null && this.pageCountCacheV2.size() > 0) {
            ThreadManager.getInstance().postIO(new Task() { // from class: com.meituan.metrics.cache.MetricsCacheManager.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.metrics.util.thread.Task
                public void schedule() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0bdd4711d3cac9ba6bc16c8c49112612", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0bdd4711d3cac9ba6bc16c8c49112612");
                        return;
                    }
                    PageReportCountDao.addPageCountRecord(PageReportCountDao.REPORT_RECORD_V2, MetricsCacheManager.this.pageCountCacheV2, MetricsCacheManager.this.cacheStorage);
                    PageReportCountDao.setCurrentDayLimit(PageReportCountDao.REPORT_COUNT_V2, MetricsCacheManager.this.currentDayReportCountV2, MetricsCacheManager.this.cacheStorage);
                }
            });
        }
    }

    @Override // com.meituan.android.common.metricx.helpers.AppBus.OnForegroundListener
    public void onForeground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2ca9304d423b02aaafa126c840e0d65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2ca9304d423b02aaafa126c840e0d65");
        } else if (this.needCheck) {
            if (this.pageCountCacheV2 == null || this.pageCountCacheV2.size() == 0) {
                getPageCountCache();
            }
        }
    }
}
