package com.sankuai.meituan.location.collector.provider;

import android.text.TextUtils;
import android.util.Log;
import com.google.gson.Gson;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a = null;
    public static String d = "CollectorFilter ";
    CollectorDataBuilder b;
    CollectorDataBuilder c;
    int e;
    private String f;
    private MtLocation g;
    private com.sankuai.meituan.location.collector.utils.c h;

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "594135e336fcedcdd07841af3372cfa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "594135e336fcedcdd07841af3372cfa2");
            return;
        }
        File a2 = this.h.a();
        if (a2 == null) {
            LogUtils.a(d + "initLastData fail");
            return;
        }
        try {
            this.f = new String(com.sankuai.meituan.location.collector.utils.d.a(a2));
            LogUtils.a("lastData str: " + this.f);
        } catch (Throwable th) {
            LogUtils.a(getClass(), th);
        }
        if (!TextUtils.isEmpty(this.f)) {
            try {
                this.b = (CollectorDataBuilder) new Gson().fromJson(this.f, (Class<Object>) CollectorDataBuilder.class);
                return;
            } catch (Exception e) {
                com.meituan.android.common.locate.platform.logs.c.a(Log.getStackTraceString(e), 3);
                return;
            }
        }
        LogUtils.a(d + "initLastData " + a2.getAbsolutePath() + " lastData null");
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e3a85dbc6ffb980688ee5f57e5114f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e3a85dbc6ffb980688ee5f57e5114f1");
        } else if (this.c == null) {
        } else {
            String a2 = this.c.a();
            try {
                com.sankuai.meituan.location.collector.utils.d.a(this.h.a(), a2.getBytes(), false);
            } catch (Throwable th) {
                LogUtils.a(getClass(), th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a55cd7ba65b28dce25ff3a51ee8b325", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a55cd7ba65b28dce25ff3a51ee8b325")).booleanValue();
        }
        try {
        } catch (Throwable th) {
            LogUtils.a(getClass(), th);
        }
        if (this.g == null) {
            LogUtils.a(d + "filteGps location is null");
            return true;
        }
        LogUtils.a(d + "filteGps Provider is " + this.g.getProvider());
        if (this.g.getProvider().equalsIgnoreCase("gps")) {
            if (((b) this.g.getExtras().getSerializable("gpsInfo")) == null) {
                LogUtils.a(d + "filteGps gpsInfo is null");
                return true;
            }
            return false;
        }
        return true;
    }

    public g(CollectorDataBuilder collectorDataBuilder, MtLocation mtLocation) {
        Object[] objArr = {collectorDataBuilder, mtLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06fe91623bb15659fe0af4b69ad07d23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06fe91623bb15659fe0af4b69ad07d23");
            return;
        }
        this.e = 3;
        this.c = collectorDataBuilder;
        this.g = mtLocation;
        this.e = com.meituan.android.common.locate.reporter.f.b().getInt("collector_filter_gps_distance", 3);
        if (this.e > 20 || this.e < 0) {
            this.e = 3;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06f12ee985feeafa4e30a7b46e126515", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06f12ee985feeafa4e30a7b46e126515");
            return;
        }
        this.h = new com.sankuai.meituan.location.collector.utils.c();
        b();
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
        if (r0.contentEquals(r1) == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double a(java.util.List<com.sankuai.meituan.location.collector.provider.l> r23, java.util.List<com.sankuai.meituan.location.collector.provider.l> r24) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.location.collector.provider.g.a(java.util.List, java.util.List):double");
    }
}
