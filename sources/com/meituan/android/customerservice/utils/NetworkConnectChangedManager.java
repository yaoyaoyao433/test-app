package com.meituan.android.customerservice.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class NetworkConnectChangedManager {
    public static ChangeQuickRedirect a;
    public AtomicBoolean b;
    public NetworkConnectChangedBroadcastReceiver c;
    List<a> d;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z);
    }

    public NetworkConnectChangedManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96c2ee65b9e98fe3976272160fd07580", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96c2ee65b9e98fe3976272160fd07580");
            return;
        }
        this.d = new CopyOnWriteArrayList();
        this.b = new AtomicBoolean(false);
        this.c = new NetworkConnectChangedBroadcastReceiver();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class b {
        private static NetworkConnectChangedManager a = new NetworkConnectChangedManager();
    }

    public static NetworkConnectChangedManager a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c72cb89ddacf658f8551c7f075af70aa", RobustBitConfig.DEFAULT_VALUE) ? (NetworkConnectChangedManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c72cb89ddacf658f8551c7f075af70aa") : b.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class NetworkConnectChangedBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public NetworkConnectChangedBroadcastReceiver() {
            Object[] objArr = {NetworkConnectChangedManager.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7dfd234e07e9fa5d717fc49926ed78a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7dfd234e07e9fa5d717fc49926ed78a");
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetworkInfo networkInfo;
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6311b682c5c19528f332a72656fa413", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6311b682c5c19528f332a72656fa413");
            } else if (intent != null && TextUtils.equals("android.net.conn.CONNECTIVITY_CHANGE", intent.getAction()) && (networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo")) != null && NetworkInfo.State.CONNECTED == networkInfo.getState() && networkInfo.isAvailable()) {
                if (networkInfo.getType() == 1 || networkInfo.getType() == 0) {
                    c.a(getClass(), "CONNECTIVITY_ACTION onNetChange");
                    for (a aVar : NetworkConnectChangedManager.this.d) {
                        try {
                            aVar.a(true);
                        } catch (Exception e) {
                            Class<?> cls = getClass();
                            c.b(cls, "Listener threw exception:" + e);
                        }
                    }
                }
            }
        }
    }

    public final synchronized void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "724bd4569dcf24d9b8514e3f754a8bad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "724bd4569dcf24d9b8514e3f754a8bad");
            return;
        }
        if (aVar != null && !this.d.contains(aVar)) {
            this.d.add(aVar);
        }
    }

    public final synchronized void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "257feab67e1a66cbf8e27ecec2d0756a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "257feab67e1a66cbf8e27ecec2d0756a");
        } else if (aVar == null) {
        } else {
            this.d.remove(aVar);
        }
    }
}
