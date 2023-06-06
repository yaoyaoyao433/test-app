package com.android.meituan.multiprocess;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.android.meituan.multiprocess.IIPCBrige;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b {
    private static b a;
    private Map<String, a> b;

    private b() {
        this.b = null;
        this.b = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b a() {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new b();
                }
            }
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final IIPCBrige a(String str) {
        IBinder a2 = a(str, IPCBaseContentProvider.METHOD_BINDER_INVOKER, null, e.a());
        if (a2 != null) {
            return IIPCBrige.Stub.asInterface(a2);
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public volatile IBinder a;

        public a(IBinder iBinder) {
            this.a = iBinder;
            if (this.a != null) {
                try {
                    this.a.linkToDeath(new IBinder.DeathRecipient() { // from class: com.android.meituan.multiprocess.b.a.1
                        @Override // android.os.IBinder.DeathRecipient
                        public final void binderDied() {
                            a.this.a = null;
                        }
                    }, 0);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static Bundle a(@NonNull Context context, Uri uri, String str, String str2, Bundle bundle) {
        ContentProviderClient contentProviderClient;
        try {
            contentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (Throwable th) {
            th = th;
            contentProviderClient = null;
        }
        try {
            if (contentProviderClient == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("extra", "fail to get content provider client: " + uri.toString());
                d.a("provider_error", hashMap);
                return null;
            }
            Bundle call = contentProviderClient.call(str, str2, null);
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
            return call;
        } catch (Throwable th2) {
            th = th2;
            try {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("extra", "error: " + th.getMessage() + " when call method: " + str + "for provider: " + uri.toString());
                d.a("provider_error", hashMap2);
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                }
                return null;
            } finally {
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                }
            }
        }
    }

    final IBinder a(String str, String str2, String str3, Context context) {
        IBinder iBinder = null;
        String format = (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? null : String.format("%s_%s", str, str2);
        if (TextUtils.isEmpty(format)) {
            return null;
        }
        synchronized (this.b) {
            a aVar = this.b.get(format);
            if (aVar != null && aVar.a != null && aVar.a.isBinderAlive()) {
                return aVar.a;
            }
            if (aVar != null) {
                this.b.remove(format);
            }
            String str4 = TextUtils.isEmpty(str) ? null : f.a().a.get(str);
            if (TextUtils.isEmpty(str4) || context == null) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("authorities", str4);
            hashMap.put("process", str);
            Bundle a2 = a(context, Uri.parse(str4), str2, null, null);
            if (a2 != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    iBinder = a2.getBinder(IPCBaseContentProvider.BUNDLE_BINDER_TYPE);
                } else {
                    a2.setClassLoader(BinderParcelable.class.getClassLoader());
                    BinderParcelable binderParcelable = (BinderParcelable) a2.getParcelable(IPCBaseContentProvider.BUNDLE_BINDER_TYPE);
                    if (binderParcelable != null) {
                        iBinder = binderParcelable.a;
                    }
                }
                if (iBinder != null) {
                    synchronized (this.b) {
                        this.b.put(format, new a(iBinder));
                    }
                }
            }
            if (iBinder == null) {
                hashMap.put("result", "false");
            } else {
                hashMap.put("result", "true");
            }
            hashMap.put("time", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
            d.a(IPCBaseContentProvider.BUNDLE_BINDER_TYPE, hashMap);
            return iBinder;
        }
    }
}
