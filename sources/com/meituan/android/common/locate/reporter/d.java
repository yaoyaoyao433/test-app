package com.meituan.android.common.locate.reporter;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.meituan.android.common.locate.api.BlurLocationManager;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.util.FakeMainThread;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.location.collector.provider.CollectorDataBuilder;
/* loaded from: classes2.dex */
public class d implements f.a {
    private static d a = null;
    private static String b = "";
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context c;
    private volatile boolean d;

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2e15a53384dd63dced7c8aef1107fca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2e15a53384dd63dced7c8aef1107fca");
            return;
        }
        this.d = false;
        this.c = context.getApplicationContext();
        f.a(this);
        c(context);
    }

    public static synchronized d a(Context context) {
        synchronized (d.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eb48d8c8001bd03b6ce91adc340d67e1", RobustBitConfig.DEFAULT_VALUE)) {
                return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eb48d8c8001bd03b6ce91adc340d67e1");
            }
            if (a == null) {
                a = new d(context);
            }
            return a;
        }
    }

    public static String a() {
        return CollectorDataBuilder.collectver;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59cf58eb0d8521bb8508c3f378870067", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59cf58eb0d8521bb8508c3f378870067");
            return;
        }
        com.meituan.android.common.locate.remote.c a2 = com.meituan.android.common.locate.remote.c.a();
        if (a2 != null) {
            try {
                boolean a3 = com.sankuai.meituan.location.collector.b.a(a2);
                LogUtils.a("CollectorJarManager setRetrofit:" + a3);
            } catch (Throwable unused) {
                LogUtils.a("CollectorJarManager invoke retrofit method failed");
            }
        }
    }

    private void c(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d241d3996fee51f852cc37526db3b6d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d241d3996fee51f852cc37526db3b6d4");
        } else {
            BlurLocationManager.a(context).a(new BlurLocationManager.a() { // from class: com.meituan.android.common.locate.reporter.d.1
                public static ChangeQuickRedirect changeQuickRedirect;
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6875d2abec74b339ad8ce2dacff97fcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6875d2abec74b339ad8ce2dacff97fcf");
        } else if (BlurLocationManager.a(context).a() == BlurLocationManager.BlurState.BLUR_STATE_OPEN || LocationUtils.k(context) || context == null || this.d) {
        } else {
            boolean a2 = com.meituan.android.common.locate.provider.s.a(context).a();
            if (a2 && !k.a().b) {
                com.meituan.android.common.locate.platform.logs.c.a("isMainProcess && Collection switch is close", 3);
            } else if (!a2 && !k.a().c) {
                com.meituan.android.common.locate.platform.logs.c.a("is not MainProcess && Collection switch is close", 3);
            } else {
                SharedPreferences b2 = f.b();
                if (!b2.getBoolean("enable_report", true)) {
                    LogUtils.a("CollectorJarManager need report" + b2.getBoolean("enable_report", true));
                    return;
                }
                try {
                    e(context);
                    this.d = true;
                } catch (Throwable th) {
                    LogUtils.a(d.class, th);
                }
            }
        }
    }

    private void e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd87131932fc91ff159ad36f4dd58a4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd87131932fc91ff159ad36f4dd58a4c");
        } else if (!m.a(context)) {
            LogUtils.a("CollectorJarManager user not allow report");
        } else {
            c();
            try {
                b = a();
                com.sankuai.meituan.location.collector.b.a(context);
            } catch (Exception e) {
                LogUtils.a(d.class, e);
            }
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "147bca76dcbc6a07d10ec15cdead78d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "147bca76dcbc6a07d10ec15cdead78d0");
        } else if (Looper.myLooper() != FakeMainThread.getInstance().getLooper()) {
            FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.reporter.d.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e49e5331ed31f26253e9057b72c22e98", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e49e5331ed31f26253e9057b72c22e98");
                        return;
                    }
                    com.sankuai.meituan.location.collector.b.d();
                    d.this.d = false;
                }
            });
        } else {
            com.sankuai.meituan.location.collector.b.d();
            this.d = false;
        }
    }

    public void b(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cf0f433393e2904f3697d4fa699b9ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cf0f433393e2904f3697d4fa699b9ae");
        } else if (Looper.myLooper() == FakeMainThread.getInstance().getLooper()) {
            d(context);
        } else {
            FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.reporter.d.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "962442938672f99868493ae113e9d8cd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "962442938672f99868493ae113e9d8cd");
                    } else {
                        d.this.d(context);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onCollectConfigChange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5ab0179cb4e7638fea5709aee9fa9f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5ab0179cb4e7638fea5709aee9fa9f0");
            return;
        }
        SharedPreferences b2 = f.b();
        if (this.d && !b2.getBoolean("enable_report", true)) {
            LogUtils.a("CollectorJarManager enable report has changed to false");
            b();
        }
        if (this.d && !this.d && b2.getBoolean("enable_report", true)) {
            LogUtils.a("CollectorJarManager enable report has changed to true");
            b(this.c);
        }
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onLocateConfigChange() {
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onTrackConfigChange() {
    }
}
