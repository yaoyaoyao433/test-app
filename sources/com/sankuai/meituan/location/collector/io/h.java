package com.sankuai.meituan.location.collector.io;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;
    Context b;
    long c;
    long d;
    long e;
    long f;
    Handler g;
    Handler h;
    e i;
    int j;
    private SharedPreferences k;
    private boolean l;
    private long m;

    public h(Context context, Handler handler, e eVar) {
        Object[] objArr = {context, handler, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abfb309eaa059c8dbaa22cb0de66b652", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abfb309eaa059c8dbaa22cb0de66b652");
            return;
        }
        this.l = false;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.m = 0L;
        this.j = 0;
        this.b = context;
        this.h = handler;
        this.i = eVar;
        this.g = new Handler();
        this.k = com.meituan.android.common.locate.reporter.f.b();
        this.c = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
        this.m = this.k.getLong("Collector_PREF_KEY_LAST_RESET_COUNTER_TIME", 0L);
        this.d = this.k.getLong("Collector_locate_alog_last_report_stample", 0L);
        this.f = this.k.getLong("Collector_PREF_KEY_HAS_REPORT_FILE_NUMBER_COUNT", 0L);
        this.e = this.k.getLong("Collector_PREF_KEY_HAS_REPORT_DATA", 0L);
        a();
        LogUtils.a("collector strategy init result:" + toString());
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "556f7f1452bd63302ff29427f0d837af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "556f7f1452bd63302ff29427f0d837af");
        } else if (this.b == null || this.k == null || System.currentTimeMillis() - this.m < com.meituan.android.common.locate.reporter.f.b().getLong("coll_interval_upload_time", DDLoadConstants.CACHE_MULTIPLE_PROCESS_PROCTECT_TIME)) {
        } else {
            LogUtils.a("collector strategy over 6 hours default, reset counter ");
            this.e = 0L;
            this.f = 0L;
            this.m = System.currentTimeMillis();
            this.k.edit().putLong("Collector_PREF_KEY_HAS_REPORT_DATA", this.e).putLong("Collector_PREF_KEY_HAS_REPORT_FILE_NUMBER_COUNT", this.f).putLong("Collector_PREF_KEY_LAST_RESET_COUNTER_TIME", this.m).apply();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a23227f686a23d57d17a5e807c5ef0f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a23227f686a23d57d17a5e807c5ef0f4");
            return;
        }
        LogUtils.a("collector strategy onReportBatchFilesOK" + toString());
        this.k.edit().putLong("Collector_PREF_KEY_HAS_REPORT_DATA", this.e).putLong("Collector_PREF_KEY_HAS_REPORT_FILE_NUMBER_COUNT", this.f).putLong("Collector_locate_alog_last_report_stample", this.d).apply();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c235a79f453114f559415bceb47e6330", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c235a79f453114f559415bceb47e6330");
        }
        return "StrategyCenter{mLastReportTimeStample=" + this.d + ", mHasConsumeMobileDataSize=" + this.e + ", mHasReportFileNumber=" + this.f + ", mLastTimeResetCounter=" + this.m + '}';
    }
}
