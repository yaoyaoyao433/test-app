package com.meituan.android.customerservice.kit.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class HeadSetChangedManager {
    public static ChangeQuickRedirect a;
    List<a> b;
    private BroadcastReceiver c;
    private AtomicBoolean d;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str, int i);
    }

    public HeadSetChangedManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb87a438ba05050d69257d03a6fc7ba7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb87a438ba05050d69257d03a6fc7ba7");
            return;
        }
        this.b = new CopyOnWriteArrayList();
        this.d = new AtomicBoolean(false);
        this.c = new HeadSetBroadcastReceiver();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        private static HeadSetChangedManager a = new HeadSetChangedManager();
    }

    public static HeadSetChangedManager a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "650ac89366d0dfe31f1e844207fe01b8", RobustBitConfig.DEFAULT_VALUE) ? (HeadSetChangedManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "650ac89366d0dfe31f1e844207fe01b8") : b.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class HeadSetBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public HeadSetBroadcastReceiver() {
            Object[] objArr = {HeadSetChangedManager.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2651420d626ea85630bf54d149d52fa6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2651420d626ea85630bf54d149d52fa6");
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06f52024b678099cdcfd59ebc83ada6d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06f52024b678099cdcfd59ebc83ada6d");
            } else if (intent != null) {
                String action = intent.getAction();
                if (TextUtils.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED", action)) {
                    int profileConnectionState = Privacy.createBluetoothAdapter("pt-07e05fed3b674cf2").getProfileConnectionState(1);
                    for (a aVar : HeadSetChangedManager.this.b) {
                        try {
                            aVar.a("bluetooth", profileConnectionState);
                        } catch (Exception unused) {
                        }
                    }
                } else if (TextUtils.equals("android.intent.action.HEADSET_PLUG", action) && intent.hasExtra("state")) {
                    int a2 = com.sankuai.waimai.platform.utils.f.a(intent, "state", 0);
                    for (a aVar2 : HeadSetChangedManager.this.b) {
                        try {
                            aVar2.a("wired", a2);
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
        }
    }

    public final synchronized void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9840359a0afabff600f7b49a0e800701", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9840359a0afabff600f7b49a0e800701");
        } else if (this.b.contains(aVar)) {
        } else {
            this.b.add(aVar);
        }
    }

    public final synchronized void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2e9d31b77efe2e7e52dbcbccd9b4c5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2e9d31b77efe2e7e52dbcbccd9b4c5a");
        } else {
            this.b.remove(aVar);
        }
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42ffcf40ab8557ed1e087d9d420c40c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42ffcf40ab8557ed1e087d9d420c40c0");
        } else if (this.d.get()) {
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            context.registerReceiver(this.c, intentFilter);
            this.d.set(true);
        }
    }

    public final void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a625047c546761758246fa7b4581cd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a625047c546761758246fa7b4581cd0");
        } else if (this.c == null || !this.d.get()) {
        } else {
            context.unregisterReceiver(this.c);
            this.d.set(false);
        }
    }
}
