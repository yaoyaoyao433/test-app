package com.meituan.android.common.mtguard.collect;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.meituan.android.common.dfingerprint.DFPTask;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class a extends BroadcastReceiver implements c {
    public static String a = "1";
    public static String b = "0.0";
    public static String c = "[0,0]";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static String d = "";
    private static final int e = 24;
    private static final int f = 29;
    private static final int g = 138;
    private static final int h = 202;
    private e i;
    private boolean j;

    public a(@NonNull e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd8ecb88ddadf8c9bf32e47d1f0070fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd8ecb88ddadf8c9bf32e47d1f0070fc");
            return;
        }
        this.j = false;
        this.i = eVar;
        this.i.a(24, this);
        this.i.a(29, this);
        this.i.a(138, this);
        this.i.a(202, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8dc43bc850300006f11bf012ebba6e48", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8dc43bc850300006f11bf012ebba6e48");
        }
        long lastBattery = this.i.e.getLastBattery();
        long j = i;
        this.i.e.setLastBattery(j);
        if (lastBattery == -1) {
            return "1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(lastBattery - j);
        return sb.toString();
    }

    private void b() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf3b8543375634879868938fe517a4a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf3b8543375634879868938fe517a4a0");
            return;
        }
        try {
            if (this.j) {
                return;
            }
            Object[] main3 = NBridge.main3(53, new Object[]{24});
            boolean booleanValue = main3 == null ? false : ((Boolean) main3[0]).booleanValue();
            Object[] main32 = NBridge.main3(53, new Object[]{29});
            boolean booleanValue2 = main32 == null ? false : ((Boolean) main32[0]).booleanValue();
            Object[] main33 = NBridge.main3(53, new Object[]{138});
            boolean booleanValue3 = main33 == null ? false : ((Boolean) main33[0]).booleanValue();
            Object[] main34 = NBridge.main3(53, new Object[]{202});
            if (main34 != null) {
                z = ((Boolean) main34[0]).booleanValue();
            }
            if (!booleanValue && !booleanValue2 && !booleanValue3 && !z) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                onReceive(this.i.b, this.i.b.registerReceiver(this, intentFilter));
                this.j = true;
            }
        } catch (Throwable unused) {
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6103dcfd1d9ac2f188e308a36aeed9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6103dcfd1d9ac2f188e308a36aeed9e");
            return;
        }
        try {
            if (this.j) {
                this.i.b.unregisterReceiver(this);
                this.j = false;
            }
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5519f93e879876b4ccc138eca4a41c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5519f93e879876b4ccc138eca4a41c2");
            return;
        }
        try {
            b();
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
    }

    @Override // com.meituan.android.common.mtguard.collect.c
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c833912028bfe8962eff30fd3ef488f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c833912028bfe8962eff30fd3ef488f");
        } else if (!z) {
            b();
        } else {
            try {
                if (this.j) {
                    this.i.b.unregisterReceiver(this);
                    this.j = false;
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7cb603b3061eb62ddd331a9b2ec6b51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7cb603b3061eb62ddd331a9b2ec6b51");
        } else if (intent != null) {
            try {
                float a2 = com.sankuai.waimai.platform.utils.f.a(intent, "temperature", 0) / 10.0f;
                final int a3 = com.sankuai.waimai.platform.utils.f.a(intent, "level", 0);
                int a4 = com.sankuai.waimai.platform.utils.f.a(intent, "scale", 100);
                int a5 = com.sankuai.waimai.platform.utils.f.a(intent, "status", -1);
                int a6 = com.sankuai.waimai.platform.utils.f.a(intent, "plugged", 0);
                int a7 = com.sankuai.waimai.platform.utils.f.a(intent, "health", 0);
                boolean a8 = com.sankuai.waimai.platform.utils.f.a(intent, "present", false);
                String a9 = com.sankuai.waimai.platform.utils.f.a(intent, "technology");
                int a10 = com.sankuai.waimai.platform.utils.f.a(intent, "voltage", 0);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    com.sankuai.waimai.launcher.util.aop.b.a(DFPTask.obtainExecutor(), new Runnable() { // from class: com.meituan.android.common.mtguard.collect.a.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aaae914307689fac5947483596aee888", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aaae914307689fac5947483596aee888");
                                return;
                            }
                            try {
                                a.a = a.this.a(a3);
                            } catch (Throwable th) {
                                MTGuardLog.setErrorLogan(th);
                            }
                        }
                    });
                } else {
                    a = a(a3);
                }
                b = String.valueOf(a2);
                c = "[" + a5 + CommonConstant.Symbol.COMMA + a3 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT.replace("=", "").replace("&", "");
                d = new JSONObject().put("health", a7).put("level", a3).put("plugged", a6).put("present", a8).put("scale", a4).put("status", a5).put("telephony", a9).put("temperature", a7).put("voltage", a10).toString();
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
            }
        }
    }
}
