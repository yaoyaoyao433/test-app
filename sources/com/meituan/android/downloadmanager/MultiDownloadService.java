package com.meituan.android.downloadmanager;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.support.constraint.R;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.downloadmanager.IMultiDownloadService;
import com.meituan.android.downloadmanager.model.DownloadException;
import com.meituan.android.downloadmanager.model.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NetWorkUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MultiDownloadService extends Service {
    public static ChangeQuickRedirect a;
    public IMultiDownloadService.Stub b;
    private Map<String, Request> c;
    private Map<String, com.meituan.android.downloadmanager.a> d;
    private Map<String, RemoteCallbackList<ICallbackService>> e;
    private String f;
    private NotificationCompat.Builder g;
    private NotificationManager h;
    private NetBroadcastReceiver i;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(ICallbackService iCallbackService) throws RemoteException;
    }

    @Override // android.app.Service
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbf4ee04dde0a59440b62629ddf5f4f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbf4ee04dde0a59440b62629ddf5f4f8");
            return;
        }
        com.sankuai.waimai.foundation.core.lifecycle.c.a(this);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ead4502d0d41c55d090de071916d0952", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ead4502d0d41c55d090de071916d0952");
            return;
        }
        com.sankuai.waimai.foundation.core.lifecycle.c.b(this);
        super.onDestroy();
    }

    public MultiDownloadService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "387a211113e57f0d8db364d04cf90430", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "387a211113e57f0d8db364d04cf90430");
            return;
        }
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.b = new IMultiDownloadService.Stub() { // from class: com.meituan.android.downloadmanager.MultiDownloadService.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.downloadmanager.IMultiDownloadService
            public void setCallFactoryType(int i) {
            }

            @Override // com.meituan.android.downloadmanager.IMultiDownloadService
            public int getPid() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48202d423556aa43d30977338e79e39b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48202d423556aa43d30977338e79e39b")).intValue() : Process.myPid();
            }

            @Override // com.meituan.android.downloadmanager.IMultiDownloadService
            public int getDownloadState(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b91b66badc7c5eeae02e7b68457f2b7", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b91b66badc7c5eeae02e7b68457f2b7")).intValue();
                }
                Request request = (Request) MultiDownloadService.this.c.get(str);
                if (request == null) {
                    return 0;
                }
                return request.e;
            }

            @Override // com.meituan.android.downloadmanager.IMultiDownloadService
            public void cancel(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6f194965ff88d66c80ea55a4ca67252", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6f194965ff88d66c80ea55a4ca67252");
                } else if (TextUtils.isEmpty(str)) {
                } else {
                    MultiDownloadService.this.a(str);
                }
            }

            @Override // com.meituan.android.downloadmanager.IMultiDownloadService
            public void download(Request request) {
                Object[] objArr2 = {request};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62b9a64bcdc2060e8d91a5548b66c53c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62b9a64bcdc2060e8d91a5548b66c53c");
                    return;
                }
                MultiDownloadService.this.f = request.b;
                String str = request.d;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                Request request2 = (Request) MultiDownloadService.this.c.get(str);
                if (request2 == null || request2.e != 3) {
                    request.e = 1;
                    MultiDownloadService.this.a(request, (String) null);
                    MultiDownloadService.this.c.put(str, request);
                    int i = request.e;
                    if (i == 1 || i == 2 || i == 6 || i == 4 || i == 5) {
                        com.meituan.android.downloadmanager.a aVar = (com.meituan.android.downloadmanager.a) MultiDownloadService.this.d.get(str);
                        if (aVar == null) {
                            aVar = new com.meituan.android.downloadmanager.a(request, MultiDownloadService.this);
                            MultiDownloadService.this.d.put(str, aVar);
                        }
                        if (c.a().b(aVar)) {
                            return;
                        }
                        c.a().a(aVar);
                    }
                }
            }

            @Override // com.meituan.android.downloadmanager.IMultiDownloadService
            public void registerCallback(String str, ICallbackService iCallbackService) {
                Object[] objArr2 = {str, iCallbackService};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa2f631327108bbbfc95742ddb7f8765", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa2f631327108bbbfc95742ddb7f8765");
                } else if (TextUtils.isEmpty(str) || iCallbackService == null) {
                } else {
                    RemoteCallbackList remoteCallbackList = (RemoteCallbackList) MultiDownloadService.this.e.get(str);
                    if (remoteCallbackList == null) {
                        remoteCallbackList = new RemoteCallbackList();
                        MultiDownloadService.this.e.put(str, remoteCallbackList);
                    }
                    remoteCallbackList.register(iCallbackService);
                }
            }

            @Override // com.meituan.android.downloadmanager.IMultiDownloadService
            public void unregisterCallback(String str, ICallbackService iCallbackService) {
                RemoteCallbackList remoteCallbackList;
                Object[] objArr2 = {str, iCallbackService};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ca58015ace1e0152e0d7649076a351a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ca58015ace1e0152e0d7649076a351a");
                } else if (iCallbackService == null || (remoteCallbackList = (RemoteCallbackList) MultiDownloadService.this.e.get(str)) == null) {
                } else {
                    remoteCallbackList.unregister(iCallbackService);
                }
            }
        };
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "043b10afef121c5321a92bab2aea3800", RobustBitConfig.DEFAULT_VALUE)) {
            return (IBinder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "043b10afef121c5321a92bab2aea3800");
        }
        this.i = new NetBroadcastReceiver();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2763162ce811071f04a860f19d4514f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2763162ce811071f04a860f19d4514f");
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            registerReceiver(this.i, intentFilter);
        }
        return this.b;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cf56f8732ce13ef2f947ce01ee6d9e5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cf56f8732ce13ef2f947ce01ee6d9e5")).booleanValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5212d2e2d3223f7765e16ddf833e45a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5212d2e2d3223f7765e16ddf833e45a");
        } else {
            unregisterReceiver(this.i);
        }
        return super.onUnbind(intent);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfdd3cb32266542231ef46346c47c7d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfdd3cb32266542231ef46346c47c7d4");
            return;
        }
        com.meituan.android.downloadmanager.a remove = this.d.remove(str);
        if (remove != null) {
            c.a().cancel(remove);
            try {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.downloadmanager.a.a;
                if (PatchProxy.isSupport(objArr2, remove, changeQuickRedirect2, false, "ca64e956fe15b749c0d5f1b7b3c6b523", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, remove, changeQuickRedirect2, false, "ca64e956fe15b749c0d5f1b7b3c6b523");
                    return;
                }
                remove.c = true;
                if (remove.b != null) {
                    remove.b.cancel();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f853a5e599dcc8c98bf531f962c52ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f853a5e599dcc8c98bf531f962c52ec");
            return;
        }
        a(str);
        this.c.remove(str);
    }

    public final void a(String str, final long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7e9b5a279646c4cadf9ae7797a66461", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7e9b5a279646c4cadf9ae7797a66461");
        } else {
            a(str, new a() { // from class: com.meituan.android.downloadmanager.MultiDownloadService.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.downloadmanager.MultiDownloadService.a
                public final void a(ICallbackService iCallbackService) throws RemoteException {
                    Object[] objArr2 = {iCallbackService};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c35058b5c7e8b4ac888ca5f6d45520dc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c35058b5c7e8b4ac888ca5f6d45520dc");
                    } else {
                        iCallbackService.onLoadStart(j);
                    }
                }
            });
        }
    }

    public final void a(String str, final long j, final long j2) {
        Object[] objArr = {str, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b07170e495bec68ac6c47d06d486529b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b07170e495bec68ac6c47d06d486529b");
        } else {
            a(str, new a() { // from class: com.meituan.android.downloadmanager.MultiDownloadService.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.downloadmanager.MultiDownloadService.a
                public final void a(ICallbackService iCallbackService) throws RemoteException {
                    Object[] objArr2 = {iCallbackService};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ca7a657a1db6bce2e77a6a352a33751", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ca7a657a1db6bce2e77a6a352a33751");
                    } else {
                        iCallbackService.onLoadProgress(j, j2);
                    }
                }
            });
        }
    }

    public final void a(String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "810298c17c3b784796945e3b1b943863", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "810298c17c3b784796945e3b1b943863");
        } else {
            a(str, new a() { // from class: com.meituan.android.downloadmanager.MultiDownloadService.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.downloadmanager.MultiDownloadService.a
                public final void a(ICallbackService iCallbackService) throws RemoteException {
                    Object[] objArr2 = {iCallbackService};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e061953f4ca727179e940eeb1b69503e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e061953f4ca727179e940eeb1b69503e");
                    } else {
                        iCallbackService.onLoadComplete(str2);
                    }
                }
            });
        }
    }

    public final void a(String str, final Exception exc) {
        Object[] objArr = {str, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad5515d0d3109681b691a7ed277a29d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad5515d0d3109681b691a7ed277a29d1");
        } else {
            a(str, new a() { // from class: com.meituan.android.downloadmanager.MultiDownloadService.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.downloadmanager.MultiDownloadService.a
                public final void a(ICallbackService iCallbackService) throws RemoteException {
                    Object[] objArr2 = {iCallbackService};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12763a9feb777b5d6491e48dbb7d9e2c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12763a9feb777b5d6491e48dbb7d9e2c");
                    } else {
                        iCallbackService.onLoadFailure(new DownloadException(exc));
                    }
                }
            });
        }
    }

    public final synchronized void a(String str, a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4b11c651923d1a0aa7b3c021023b743", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4b11c651923d1a0aa7b3c021023b743");
            return;
        }
        RemoteCallbackList<ICallbackService> remoteCallbackList = this.e.get(str);
        if (remoteCallbackList == null) {
            return;
        }
        int beginBroadcast = remoteCallbackList.beginBroadcast();
        for (int i = 0; i < beginBroadcast; i++) {
            try {
                aVar.a(remoteCallbackList.getBroadcastItem(i));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            remoteCallbackList.finishBroadcast();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class NetBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public NetBroadcastReceiver() {
            Object[] objArr = {MultiDownloadService.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "390191d2f0d7207a0e81130ee08afbde", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "390191d2f0d7207a0e81130ee08afbde");
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "247997655f3ac9b99c078b70d4ebcf8d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "247997655f3ac9b99c078b70d4ebcf8d");
            } else if (NetWorkUtils.getNetworkType("pt-11c77473fa787786", MultiDownloadService.this.getApplicationContext()) == 0) {
                for (Request request : MultiDownloadService.this.c.values()) {
                    if (request.e == 2 || request.e == 6) {
                        b a2 = b.a(MultiDownloadService.this.getApplicationContext());
                        Object[] objArr2 = {request};
                        ChangeQuickRedirect changeQuickRedirect2 = b.a;
                        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "b09c347f1153c4ea1d69fb27cc25dd88", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "b09c347f1153c4ea1d69fb27cc25dd88");
                        } else {
                            a2.a(request, (com.meituan.android.downloadmanager.callback.b) null);
                        }
                    }
                }
            } else {
                for (Request request2 : MultiDownloadService.this.c.values()) {
                    if (request2.h == 0 && request2.e == 3) {
                        request2.e = 2;
                        MultiDownloadService.this.a(request2, (String) null);
                        MultiDownloadService.this.a(request2.d);
                    }
                }
            }
        }
    }

    public final void a(Request request, String str) {
        Object[] objArr = {request, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f36ffa246262afa0b678a8ed21f2aa07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f36ffa246262afa0b678a8ed21f2aa07");
        } else if (request.i) {
            if (this.h == null) {
                this.h = (NotificationManager) getSystemService(RemoteMessageConst.NOTIFICATION);
                if (Build.VERSION.SDK_INT >= 26) {
                    NotificationChannel notificationChannel = new NotificationChannel("download", "downloadmanager", 2);
                    notificationChannel.enableVibration(false);
                    this.h.createNotificationChannel(notificationChannel);
                }
            }
            if (this.g == null) {
                this.g = new NotificationCompat.Builder(this, "download");
            }
            String str2 = request.k;
            int i = request.m;
            String a2 = com.meituan.android.downloadmanager.util.a.a(this);
            NotificationCompat.Builder builder = this.g;
            if (TextUtils.isEmpty(str2)) {
                str2 = a2;
            }
            NotificationCompat.Builder autoCancel = builder.setContentTitle(str2).setAutoCancel(true);
            if (i == 0) {
                i = 17301659;
            }
            autoCancel.setSmallIcon(i);
            switch (request.e) {
                case 1:
                    this.g.setContentText(TextUtils.isEmpty(request.l) ? getString(R.string.download_waiting) : request.l);
                    break;
                case 2:
                    this.g.setContentText(getString(R.string.download_waiting_wifi));
                    break;
                case 3:
                    this.g.setContentText(str);
                    break;
                case 4:
                    this.g.setContentText(getString(R.string.download_pause));
                    break;
                case 5:
                    this.g.setContentText(getString(R.string.download_success));
                    break;
                case 6:
                    this.g.setContentText(getString(R.string.download_failed));
                    break;
            }
            if (request.j != null) {
                this.g.setContentIntent(request.j);
            }
            this.h.notify(request.d.hashCode(), this.g.build());
        }
    }
}
