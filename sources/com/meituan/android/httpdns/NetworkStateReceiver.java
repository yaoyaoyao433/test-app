package com.meituan.android.httpdns;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NetworkStateReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static NetworkStateReceiver instance;
    private static List<WeakReference<u>> networkStateChangeListeners;

    public static synchronized void initNetworkStateReceiver(Context context) {
        synchronized (NetworkStateReceiver.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "99eb2bf5c98d018e307f1e77e1241fcb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "99eb2bf5c98d018e307f1e77e1241fcb");
            } else if (instance != null) {
            } else {
                if (context == null) {
                    return;
                }
                instance = new NetworkStateReceiver();
                try {
                    context.getApplicationContext().registerReceiver(instance, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void addListener(u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a1099a5b9949632f83ca8502d9d63cdf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a1099a5b9949632f83ca8502d9d63cdf");
            return;
        }
        if (networkStateChangeListeners == null) {
            networkStateChangeListeners = new CopyOnWriteArrayList();
        }
        networkStateChangeListeners.add(new WeakReference<>(uVar));
    }

    public static void removeAllListener(u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cadb2b3833449b7a50a2de4da4f49a1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cadb2b3833449b7a50a2de4da4f49a1c");
        } else {
            networkStateChangeListeners.clear();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eea04afe7a0bdcc9f34ccdd8490f402f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eea04afe7a0bdcc9f34ccdd8490f402f");
        } else {
            z.a(new Runnable() { // from class: com.meituan.android.httpdns.NetworkStateReceiver.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ed0c09571543673c8cbef29915a2f04c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ed0c09571543673c8cbef29915a2f04c");
                        return;
                    }
                    NetworkStateReceiver.this.notifyNetworkStateChanged(t.a(context), t.b(context));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyNetworkStateChanged(s sVar, boolean z) {
        u uVar;
        Object[] objArr = {sVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87ea5e3312c6cbd900d711ec0a41a09f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87ea5e3312c6cbd900d711ec0a41a09f");
        } else if (networkStateChangeListeners != null && !networkStateChangeListeners.isEmpty()) {
            for (WeakReference<u> weakReference : networkStateChangeListeners) {
                if (weakReference != null && (uVar = weakReference.get()) != null) {
                    uVar.a(sVar, z);
                }
            }
        }
    }
}
