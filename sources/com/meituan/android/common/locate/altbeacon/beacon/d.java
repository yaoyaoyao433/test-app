package com.meituan.android.common.locate.altbeacon.beacon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import com.meituan.android.common.locate.altbeacon.beacon.e;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.provider.g;
import com.meituan.android.common.locate.provider.s;
import com.meituan.android.common.locate.util.FakeMainThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class d implements Handler.Callback {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected Context a;
    protected com.meituan.android.common.locate.remote.c b;
    protected b c;
    protected e.a d;
    protected e.a e;
    protected e.a f;
    protected int g;
    protected final Handler h;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4dee6cba7ff2a98da810c88775d4b69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4dee6cba7ff2a98da810c88775d4b69");
            return;
        }
        this.g = 0;
        this.h = new Handler(this);
        this.a = g.a();
        if (this.a == null || !com.meituan.android.common.locate.altbeacon.beacon.config.a.a().a) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        this.a.registerReceiver(new BroadcastReceiver() { // from class: com.meituan.android.common.locate.altbeacon.beacon.d.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, final Intent intent) {
                Object[] objArr2 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a30dd1932d932e593c2e008a9de37a95", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a30dd1932d932e593c2e008a9de37a95");
                } else if (intent == null || !"android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                } else {
                    FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.altbeacon.beacon.d.1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "0a907e545b9c47d7b135441cd96621af", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "0a907e545b9c47d7b135441cd96621af");
                                return;
                            }
                            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
                            if (intExtra == 12) {
                                d.this.a(com.meituan.android.common.locate.altbeacon.beacon.util.a.c);
                            } else if (intExtra == 10) {
                                d.this.b(com.meituan.android.common.locate.altbeacon.beacon.util.a.d);
                            }
                        }
                    });
                }
            }
        }, intentFilter);
    }

    public boolean a(String str) {
        c.a aVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "766d5173b9464b7803f699d28e7ea5c3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "766d5173b9464b7803f699d28e7ea5c3")).booleanValue();
        }
        if (this.a == null) {
            return false;
        }
        if (!s.a(g.a()).a()) {
            aVar = new c.a("sniffer_module_beacon_check", "sub_process");
        } else if (!com.meituan.android.common.locate.altbeacon.beacon.config.a.a().a) {
            aVar = new c.a("sniffer_module_beacon_check", "switch_close");
        } else if (this.g != 0) {
            aVar = new c.a("sniffer_module_beacon_check", "init_ok");
        } else if (!com.meituan.android.common.locate.lifecycle.c.a().c() || com.meituan.android.common.locate.altbeacon.beacon.config.a.a().c) {
            com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_beacon_check", "start"));
            return true;
        } else {
            aVar = new c.a("sniffer_module_beacon_check", "bg_close");
        }
        com.meituan.android.common.locate.platform.sniffer.b.b(aVar);
        return false;
    }

    public boolean b(String str) {
        c.a aVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9b1441eb1ed6a3794e926a039be09bf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9b1441eb1ed6a3794e926a039be09bf")).booleanValue();
        }
        this.h.removeCallbacksAndMessages(null);
        if (this.g == 0 || this.c == null || !this.c.a()) {
            aVar = new c.a("sniffer_module_beacon_stop", "stop_all");
        } else {
            this.c.b();
            aVar = new c.a("sniffer_module_beacon_stop", "stop_suc");
        }
        com.meituan.android.common.locate.platform.sniffer.b.a(aVar);
        this.g = 0;
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        e.a aVar;
        e.a aVar2;
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "146fc5f205f67f587ee350337b3eda92", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "146fc5f205f67f587ee350337b3eda92")).booleanValue();
        }
        switch (message.what) {
            case 1:
                aVar = this.d;
                aVar2 = null;
                aVar.a(aVar2, 0);
                break;
            case 2:
                aVar = this.e;
                aVar2 = this.d;
                aVar.a(aVar2, 0);
                break;
            case 3:
                this.f.a(this.e, message.obj);
                break;
        }
        return false;
    }
}
