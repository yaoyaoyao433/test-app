package com.meituan.android.downloadmanager;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.meituan.android.downloadmanager.ICallbackService;
import com.meituan.android.downloadmanager.IMultiDownloadService;
import com.meituan.android.downloadmanager.model.DownloadException;
import com.meituan.android.downloadmanager.model.DownloadInfo;
import com.meituan.android.downloadmanager.model.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static b b;
    private Context c;
    private final List<Runnable> d;
    private Map<String, Map<com.meituan.android.downloadmanager.callback.a, ICallbackService>> e;
    private Map<String, Map<com.meituan.android.downloadmanager.callback.b, ICallbackService>> f;
    private IMultiDownloadService g;
    private a h;
    private Handler i;
    private ServiceConnection j;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.downloadmanager.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0250b {
        void a() throws RemoteException;
    }

    public static /* synthetic */ void b(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "16e65dacfe980b199d454fdda06e0130", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "16e65dacfe980b199d454fdda06e0130");
            return;
        }
        synchronized (bVar.d) {
            for (Runnable runnable : bVar.d) {
                runnable.run();
            }
            bVar.d.clear();
        }
    }

    public static b a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bc3855d48ed3d89673599d40dbfa0be", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bc3855d48ed3d89673599d40dbfa0be");
        }
        if (b == null) {
            synchronized (b.class) {
                b = new b(context);
            }
        }
        return b;
    }

    private b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d5dad815820800640a18cb7dfd2c7e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d5dad815820800640a18cb7dfd2c7e0");
            return;
        }
        this.d = Collections.synchronizedList(new ArrayList());
        this.e = new WeakHashMap();
        this.f = new WeakHashMap();
        this.i = new Handler(Looper.getMainLooper());
        this.j = new ServiceConnection() { // from class: com.meituan.android.downloadmanager.b.1
            public static ChangeQuickRedirect a;

            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Object[] objArr2 = {componentName, iBinder};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82d9bafb17f9f23d4596485b18ad9270", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82d9bafb17f9f23d4596485b18ad9270");
                    return;
                }
                b.this.g = IMultiDownloadService.Stub.asInterface(iBinder);
                if (b.this.h != null) {
                    a unused = b.this.h;
                }
                b.b(b.this);
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
                Object[] objArr2 = {componentName};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85f906240860b37b6a4a42c49bc36d2c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85f906240860b37b6a4a42c49bc36d2c");
                    return;
                }
                if (b.this.h != null) {
                    a unused = b.this.h;
                }
                b.this.g = null;
                b.this.d.clear();
                synchronized (b.this) {
                    for (Map.Entry entry : b.this.e.entrySet()) {
                        Map map = (Map) entry.getValue();
                        for (Map.Entry entry2 : map.entrySet()) {
                            ICallbackService iCallbackService = (ICallbackService) entry2.getValue();
                            try {
                                iCallbackService.onLoadFailure(new DownloadException(new IllegalStateException("onServiceDisconnected:" + componentName.toString())));
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }
                        map.clear();
                    }
                    b.this.e.clear();
                    for (Map.Entry entry3 : b.this.f.entrySet()) {
                        Map map2 = (Map) entry3.getValue();
                        for (Map.Entry entry4 : map2.entrySet()) {
                            ICallbackService iCallbackService2 = (ICallbackService) entry4.getValue();
                            try {
                                iCallbackService2.onLoadFailure(new DownloadException(new IllegalStateException("onServiceDisconnected:" + componentName.toString())));
                            } catch (RemoteException e2) {
                                e2.printStackTrace();
                            }
                        }
                        map2.clear();
                    }
                    b.this.f.clear();
                }
            }
        };
        this.c = context.getApplicationContext();
    }

    private synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17d5b15e9c997403d285e57c7f1ce701", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17d5b15e9c997403d285e57c7f1ce701");
            return;
        }
        if (this.g == null) {
            this.c.bindService(new Intent(this.c, MultiDownloadService.class), this.j, 1);
        }
    }

    @Deprecated
    public void cancel(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7460d80e77d1a011bed17d46c3c5de1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7460d80e77d1a011bed17d46c3c5de1");
        } else {
            a(new InterfaceC0250b() { // from class: com.meituan.android.downloadmanager.b.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.downloadmanager.b.InterfaceC0250b
                public final void a() throws RemoteException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e26c89f92227b37a8bcc9b4a5ba33be2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e26c89f92227b37a8bcc9b4a5ba33be2");
                        return;
                    }
                    if (b.this.g != null) {
                        b.this.g.cancel(str);
                    }
                    b.this.a(str);
                }
            });
        }
    }

    @Deprecated
    public void cancel(final String str, final com.meituan.android.downloadmanager.callback.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94125838d81202e048e8e2988a90faf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94125838d81202e048e8e2988a90faf1");
        } else {
            a(new InterfaceC0250b() { // from class: com.meituan.android.downloadmanager.b.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.downloadmanager.b.InterfaceC0250b
                public final void a() throws RemoteException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "685f03137894ea0ed33b4efb5d5f7562", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "685f03137894ea0ed33b4efb5d5f7562");
                        return;
                    }
                    if (b.this.g != null) {
                        b.this.g.cancel(str);
                    }
                    b.this.b(str, aVar);
                }
            });
        }
    }

    public void cancel(final String str, final com.meituan.android.downloadmanager.callback.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae878be7373b4bad8a5e26cb5a4a3a93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae878be7373b4bad8a5e26cb5a4a3a93");
        } else {
            a(new InterfaceC0250b() { // from class: com.meituan.android.downloadmanager.b.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.downloadmanager.b.InterfaceC0250b
                public final void a() throws RemoteException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8fb9b3f173c601078a6e955cc0965929", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8fb9b3f173c601078a6e955cc0965929");
                        return;
                    }
                    if (b.this.g != null) {
                        b.this.g.cancel(str);
                    }
                    b.this.b(str, bVar);
                }
            });
        }
    }

    public final void a(String str, String str2, String str3, String str4, com.meituan.android.downloadmanager.callback.b bVar) {
        Object[] objArr = {str, str2, str3, str4, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a021c3414c064f159e1830be04ddd3f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a021c3414c064f159e1830be04ddd3f3");
            return;
        }
        Request request = new Request(str);
        request.f = str2;
        request.b = str3;
        request.c = str4;
        a(request, bVar);
    }

    public final void a(final Request request, final com.meituan.android.downloadmanager.callback.b bVar) {
        Object[] objArr = {request, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ce79e1208b54c12bbdf39804b85c296", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ce79e1208b54c12bbdf39804b85c296");
        } else {
            a(new InterfaceC0250b() { // from class: com.meituan.android.downloadmanager.b.7
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.downloadmanager.b.InterfaceC0250b
                public final void a() throws RemoteException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f10d595eb1ff5e765a2aa7a03d9ae2d7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f10d595eb1ff5e765a2aa7a03d9ae2d7");
                        return;
                    }
                    b.this.a(request.d, bVar);
                    if (b.this.g != null) {
                        b.this.g.download(request);
                    }
                }
            });
        }
    }

    public final String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "114675b5966b4dcdc1a04ebfd982f9a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "114675b5966b4dcdc1a04ebfd982f9a8");
        }
        if (TextUtils.isEmpty(str)) {
            return com.meituan.android.downloadmanager.util.c.a(this.c, str2);
        }
        return com.meituan.android.downloadmanager.util.c.a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(final String str, final com.meituan.android.downloadmanager.callback.a aVar) throws RemoteException {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26810d21f7d84e00f98bc52420feea72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26810d21f7d84e00f98bc52420feea72");
            return;
        }
        if (!TextUtils.isEmpty(str) && aVar != null) {
            Map<com.meituan.android.downloadmanager.callback.a, ICallbackService> map = this.e.get(str);
            if (map == null) {
                map = new WeakHashMap<>();
                this.e.put(str, map);
            }
            ICallbackService iCallbackService = map.get(aVar);
            if (iCallbackService != null && this.g != null) {
                this.g.unregisterCallback(str, iCallbackService);
            }
            ICallbackService.Stub stub = new ICallbackService.Stub() { // from class: com.meituan.android.downloadmanager.MultiDownloadManager$8
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.downloadmanager.ICallbackService
                public void onLoadStart(final long j) throws RemoteException {
                    Handler handler;
                    Object[] objArr2 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6745ba2d5190811d027d752233fa1c6c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6745ba2d5190811d027d752233fa1c6c");
                        return;
                    }
                    handler = b.this.i;
                    handler.post(new Runnable() { // from class: com.meituan.android.downloadmanager.MultiDownloadManager$8.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "25c2a0ec24f8d293da06988a4bdc662c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "25c2a0ec24f8d293da06988a4bdc662c");
                            }
                        }
                    });
                }

                @Override // com.meituan.android.downloadmanager.ICallbackService
                public void onLoadProgress(final long j, final long j2) throws RemoteException {
                    Handler handler;
                    Object[] objArr2 = {new Long(j), new Long(j2)};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68ed6329dfa68a4d34f2fb8a4fc4c801", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68ed6329dfa68a4d34f2fb8a4fc4c801");
                        return;
                    }
                    handler = b.this.i;
                    handler.post(new Runnable() { // from class: com.meituan.android.downloadmanager.MultiDownloadManager$8.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e279a8ceb6cd13d57cca138dbea89c46", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e279a8ceb6cd13d57cca138dbea89c46");
                            } else {
                                aVar.a(j, j2);
                            }
                        }
                    });
                }

                @Override // com.meituan.android.downloadmanager.ICallbackService
                public void onLoadComplete(final String str2) throws RemoteException {
                    Handler handler;
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4fe3d7d5c2a54f51c0457876499bd26", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4fe3d7d5c2a54f51c0457876499bd26");
                        return;
                    }
                    handler = b.this.i;
                    handler.post(new Runnable() { // from class: com.meituan.android.downloadmanager.MultiDownloadManager$8.3
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "984ab58e40bf97a930863c0712e3fea8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "984ab58e40bf97a930863c0712e3fea8");
                                return;
                            }
                            aVar.a(str2);
                            try {
                                b.this.b(str, aVar);
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }

                @Override // com.meituan.android.downloadmanager.ICallbackService
                public void onLoadTimeOut(DownloadException downloadException) throws RemoteException {
                    Handler handler;
                    Object[] objArr2 = {downloadException};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bf62cabe356f301efdaa3d2b202ee0d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bf62cabe356f301efdaa3d2b202ee0d");
                        return;
                    }
                    handler = b.this.i;
                    handler.post(new Runnable() { // from class: com.meituan.android.downloadmanager.MultiDownloadManager$8.4
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6937293b999bdaedbabfccc18484b462", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6937293b999bdaedbabfccc18484b462");
                                return;
                            }
                            aVar.b();
                            try {
                                b.this.b(str, aVar);
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }

                @Override // com.meituan.android.downloadmanager.ICallbackService
                public void onLoadFailure(DownloadException downloadException) throws RemoteException {
                    Handler handler;
                    Object[] objArr2 = {downloadException};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef35a85509b993b027166f3cf76f0428", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef35a85509b993b027166f3cf76f0428");
                        return;
                    }
                    handler = b.this.i;
                    handler.post(new Runnable() { // from class: com.meituan.android.downloadmanager.MultiDownloadManager$8.5
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5f0c58afd1122226252787319ee5029d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5f0c58afd1122226252787319ee5029d");
                                return;
                            }
                            aVar.a();
                            try {
                                b.this.b(str, aVar);
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
            };
            map.put(aVar, stub);
            if (this.g != null) {
                this.g.registerCallback(str, stub);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(final String str, final com.meituan.android.downloadmanager.callback.b bVar) throws RemoteException {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "976c5d2ff8f4e9793eb54da6b6f0cfd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "976c5d2ff8f4e9793eb54da6b6f0cfd9");
            return;
        }
        if (!TextUtils.isEmpty(str) && bVar != null) {
            Map<com.meituan.android.downloadmanager.callback.b, ICallbackService> map = this.f.get(str);
            if (map == null) {
                map = new WeakHashMap<>();
                this.f.put(str, map);
            }
            ICallbackService iCallbackService = map.get(bVar);
            if (iCallbackService != null && this.g != null) {
                this.g.unregisterCallback(str, iCallbackService);
            }
            ICallbackService.Stub stub = new ICallbackService.Stub() { // from class: com.meituan.android.downloadmanager.MultiDownloadManager$9
                public static ChangeQuickRedirect changeQuickRedirect;
                private DownloadInfo info = new DownloadInfo();

                @Override // com.meituan.android.downloadmanager.ICallbackService
                public void onLoadStart(final long j) throws RemoteException {
                    Handler handler;
                    Object[] objArr2 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4a8a3cf1745d3fe1ae05f4c47f88e3d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4a8a3cf1745d3fe1ae05f4c47f88e3d");
                        return;
                    }
                    handler = b.this.i;
                    handler.post(new Runnable() { // from class: com.meituan.android.downloadmanager.MultiDownloadManager$9.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "541282dcf3f850791ef502bd5529a351", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "541282dcf3f850791ef502bd5529a351");
                                return;
                            }
                            MultiDownloadManager$9.this.info.b = j;
                            bVar.a(MultiDownloadManager$9.this.info);
                        }
                    });
                }

                @Override // com.meituan.android.downloadmanager.ICallbackService
                public void onLoadProgress(final long j, final long j2) throws RemoteException {
                    Handler handler;
                    Object[] objArr2 = {new Long(j), new Long(j2)};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04ecc4aafed9ed435e45556a620129f7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04ecc4aafed9ed435e45556a620129f7");
                        return;
                    }
                    handler = b.this.i;
                    handler.post(new Runnable() { // from class: com.meituan.android.downloadmanager.MultiDownloadManager$9.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8bb73b65c027bd54e23b53e69638f2d6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8bb73b65c027bd54e23b53e69638f2d6");
                                return;
                            }
                            MultiDownloadManager$9.this.info.c = j;
                            MultiDownloadManager$9.this.info.b = j2;
                            bVar.b(MultiDownloadManager$9.this.info);
                        }
                    });
                }

                @Override // com.meituan.android.downloadmanager.ICallbackService
                public void onLoadComplete(final String str2) throws RemoteException {
                    Handler handler;
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2e8519d92b2f67c016114229445ae62", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2e8519d92b2f67c016114229445ae62");
                        return;
                    }
                    handler = b.this.i;
                    handler.post(new Runnable() { // from class: com.meituan.android.downloadmanager.MultiDownloadManager$9.3
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "938219f324fdefc45c8edbdd5f0d458d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "938219f324fdefc45c8edbdd5f0d458d");
                                return;
                            }
                            MultiDownloadManager$9.this.info.d = str2;
                            bVar.c(MultiDownloadManager$9.this.info);
                            try {
                                b.this.b(str, bVar);
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }

                @Override // com.meituan.android.downloadmanager.ICallbackService
                public void onLoadTimeOut(final DownloadException downloadException) throws RemoteException {
                    Handler handler;
                    Object[] objArr2 = {downloadException};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7648796163cd5780c389cce9b837764b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7648796163cd5780c389cce9b837764b");
                        return;
                    }
                    handler = b.this.i;
                    handler.post(new Runnable() { // from class: com.meituan.android.downloadmanager.MultiDownloadManager$9.4
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "876af35f1cd36ce61b10308432e6752a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "876af35f1cd36ce61b10308432e6752a");
                                return;
                            }
                            bVar.b(downloadException.a());
                            try {
                                b.this.b(str, bVar);
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }

                @Override // com.meituan.android.downloadmanager.ICallbackService
                public void onLoadFailure(final DownloadException downloadException) throws RemoteException {
                    Handler handler;
                    Object[] objArr2 = {downloadException};
                    ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86dadf482273e5eb7a19f4b5cda2047d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86dadf482273e5eb7a19f4b5cda2047d");
                        return;
                    }
                    handler = b.this.i;
                    handler.post(new Runnable() { // from class: com.meituan.android.downloadmanager.MultiDownloadManager$9.5
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "90fbb3b251a073aeecd6ff608754ba2c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "90fbb3b251a073aeecd6ff608754ba2c");
                                return;
                            }
                            bVar.a(downloadException.a());
                            try {
                                b.this.b(str, bVar);
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
            };
            map.put(bVar, stub);
            if (this.g != null) {
                this.g.registerCallback(str, stub);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(String str, com.meituan.android.downloadmanager.callback.a aVar) throws RemoteException {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccedebc931ae5f062d30d17f4782a455", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccedebc931ae5f062d30d17f4782a455");
            return;
        }
        if (!TextUtils.isEmpty(str) && aVar != null) {
            Map<com.meituan.android.downloadmanager.callback.a, ICallbackService> map = this.e.get(str);
            if (map == null) {
                return;
            }
            ICallbackService remove = map.remove(aVar);
            if (remove == null) {
                return;
            }
            if (this.g != null) {
                this.g.unregisterCallback(str, remove);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(String str, com.meituan.android.downloadmanager.callback.b bVar) throws RemoteException {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2b540e2fbeb4c2bba36486034db385a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2b540e2fbeb4c2bba36486034db385a");
            return;
        }
        if (!TextUtils.isEmpty(str) && bVar != null) {
            Map<com.meituan.android.downloadmanager.callback.b, ICallbackService> map = this.f.get(str);
            if (map == null) {
                return;
            }
            ICallbackService remove = map.remove(bVar);
            if (remove == null) {
                return;
            }
            if (this.g != null) {
                this.g.unregisterCallback(str, remove);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str) throws RemoteException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ccf7dd62cbda0bbfa6b925af4e57768", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ccf7dd62cbda0bbfa6b925af4e57768");
        } else if (!TextUtils.isEmpty(str)) {
            Map<com.meituan.android.downloadmanager.callback.a, ICallbackService> remove = this.e.remove(str);
            if (remove == null) {
                return;
            }
            for (Map.Entry<com.meituan.android.downloadmanager.callback.a, ICallbackService> entry : remove.entrySet()) {
                ICallbackService value = entry.getValue();
                if (value != null && this.g != null) {
                    this.g.unregisterCallback(str, value);
                }
            }
            remove.clear();
            Map<com.meituan.android.downloadmanager.callback.b, ICallbackService> remove2 = this.f.remove(str);
            if (remove2 == null) {
                return;
            }
            for (Map.Entry<com.meituan.android.downloadmanager.callback.b, ICallbackService> entry2 : remove2.entrySet()) {
                ICallbackService value2 = entry2.getValue();
                if (value2 != null && this.g != null) {
                    this.g.unregisterCallback(str, value2);
                }
            }
            remove2.clear();
        }
    }

    public void a(final InterfaceC0250b interfaceC0250b) {
        Object[] objArr = {interfaceC0250b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "093230e20c1741d3a96d9c49142d9a3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "093230e20c1741d3a96d9c49142d9a3e");
        } else if (this.g == null) {
            this.d.add(new Runnable() { // from class: com.meituan.android.downloadmanager.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e5620b36f17d1cc9830a8e5d7d44bd0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e5620b36f17d1cc9830a8e5d7d44bd0");
                        return;
                    }
                    try {
                        interfaceC0250b.a();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            });
            a();
        } else {
            try {
                interfaceC0250b.a();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }
}
