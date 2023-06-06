package com.meituan.android.quickpass.uptsm.manage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.huawei.nfc.sdk.service.IHwNFCOpenService;
import com.meituan.android.quickpass.uptsm.common.utils.e;
import com.meituan.android.quickpass.uptsm.common.utils.h;
import com.meituan.android.quickpass.uptsm.common.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.DateFormat;
import java.util.Date;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    String b;
    IHwNFCOpenService c;
    final Object d;
    private ServiceConnection e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface c {
        void a(int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface d {
        void a(int i);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3e921f4d130dbb19e2b84a4e0a00d8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3e921f4d130dbb19e2b84a4e0a00d8f");
            return;
        }
        this.b = "MIIEwAIBADANBgkqhkiG9w0BAQEFAASCBKowggSmAgEAAoIBAQDlFrpyyMEr95fLAZjZHvzf7WIt\n35ImN5BMQDh4UAq71Xg4RvTiRFZYoPgtnlfMDB6B++p3B3diDHLNTRmVpiHy5771HzNBe3i5cHjn\nlflrq9DtGpo7bBZlMyTNqtWfqbe80o1b8a1lZ0Jk6tThTNlFH/CnBA4mLFqPQpB/TOuQvAitwUvO\nEXB1660yWqkXdY7VhlBX/p/S3mqcE9+ZNuH8gqLpDpIisjt1qM7U3PxjBy7ao1mJfYmI8TwQAbNn\n+9arGevCw2dglx+lQhdILOKdHoT1VjeuQFQPoswyv+A/+/u+CwS0AJe8b1TXpcCQT7vkJgne0jMF\nvVwK9xwRz5eFAgMBAAECggEBAMHN94/xvFJI1Pad9EQCjiWWuo9aa1a/fOi1D9DgziPX1SuvA66D\n55R1IV/ebCIoQorupo1qGJovM9PxHOrYMDJB0e+nJIKKRTiEKRSqcOag5VAhSEdrCos0uDbyBmVb\nfCBW89XL4EhAEhA0BkJP9CMhgUKaEKpErZwy0PGRDlxSzRHj1I/Gi4c0JAMT20SvWeR7Q3jiaKiT\niYthkmCxfjYGq/bXe9TEoWBhgHVxNnMpkfmc/Blt2ItJ4wCCQS1ZD6M8UYzMK2mGjiBhx3jhYWUy\nY0cesEhqtNtkZUQI9ia0cJ4CYT9Bk48YK020MpSfLZ0HWeeqsIm2T0usCsRTp8ECgYEA+NzAOzDk\npGofSsepfI6GVqUV/I88ds8zh8DqdEXIkaF36UVee7PTuvyEr8UlSG3u3vuDKQ7apQX+6vVKqzWR\nAr7uBBjhpwl7tSkelHkglMkHSit/6NHEEaP8VhGjwrYW8CiS50Jh65oPBbFhlU3Fjs8aAt+XJd40\nJ6lfTSEXT5ECgYEA66jKxZ7mwUeSUfkt/RuIWMZQEhZ6chDI1qAG3AU8klJGKhaNPMK1fWXjJYtf\nMrAuTJjXLluW5scrrBjD6BqB7bMqdMFtUbNbfOwcKStFa19M5Rxuusz5ykuB9nw1jTFEN3hBVWJ/\nsNhy8Wdmp5n7/PpHxFhr3qa1NT15eGZv9rUCgYEAtJdNECcM5Jr2FkgJoA+1QM8Pw3UWBYma9Vpz\nSOkTAUtRPwBN7iqy7TAuAXdo9MSB4WJW7caPt81ADbTu+IsorftrsaF0rshc8zvhqxCzKgUvuw0S\nBxuh0sNTbAnk8nk88A4hfJxZfqUPXaw5CiWjxVxYndkvUBWNd3Kba9clmWECgYEAhmA3T7yuJCQl\noSyPNraOZuCeI9JBe+1qOEgD4U3zHhRgAfveCXmVd62zemMgo4ymufKlML/1Kh8EHhv5Cc6jq+Dw\nIqdxKJc3YeJYpHkSGom7FSHDWi0reljYAK8O8jXXijG+P2vtF/A0isbFWGiLsdMdPS6WQ92XkoY9\nT5RJ38kCgYEA9ldG5sd6wYBOCDf56WOxbuLl+YF/kKLmawy0daRsZtFtqcxuctX1XMLB0kWCQjNK\nTzzybzOPWsdfxhviwI0rttuQL4dJUVqZEWMWE0uZLWqgKF+w5RW9vCnCpxqfUuAlMIbQ5icXF5Lm\nsxrT9Prer6LHZehqY2PwDgY9WJWd7WM=";
        this.d = new Object();
        this.e = new ServiceConnection() { // from class: com.meituan.android.quickpass.uptsm.manage.a.1
            public static ChangeQuickRedirect a;

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
                Object[] objArr2 = {componentName};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "281dbbfad6521b00b875eec38d87ae4d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "281dbbfad6521b00b875eec38d87ae4d");
                    return;
                }
                synchronized (a.this.d) {
                    h.a("mNfcServiceConnection::onServiceDisconnected");
                    a.this.c = null;
                }
            }

            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Object[] objArr2 = {componentName, iBinder};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fb0d46a1214da91b503aca606865c2a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fb0d46a1214da91b503aca606865c2a");
                    return;
                }
                synchronized (a.this.d) {
                    h.a("mNfcServiceConnection::onServiceConnected");
                    a.this.c = IHwNFCOpenService.Stub.asInterface(iBinder);
                    a.this.d.notifyAll();
                }
            }
        };
    }

    public static /* synthetic */ void a(a aVar, Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "01fd72ccd9c0e89b30b2dfd8f6ea3c62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "01fd72ccd9c0e89b30b2dfd8f6ea3c62");
            return;
        }
        synchronized (aVar.d) {
            if (aVar.c == null) {
                h.a("开始绑定华为服务");
                Intent intent = new Intent("com.huawei.nfc.action.OPEN_API");
                intent.setPackage("com.huawei.wallet");
                context.bindService(intent, aVar.e, 1);
                try {
                    h.a("华为服务等待锁");
                    aVar.d.wait();
                    h.a("华为服务绑定成功，唤醒锁");
                } catch (InterruptedException e) {
                    h.b(Log.getStackTraceString(e));
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.quickpass.uptsm.manage.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0361a {
        public static a a = new a();

        public static a a() {
            return a;
        }
    }

    public final void a(Context context, boolean z, c cVar) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "796d9899c985ad2fe6f05f0ba1134243", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "796d9899c985ad2fe6f05f0ba1134243");
            return;
        }
        com.meituan.android.quickpass.uptsm.common.utils.b.a("开始创建安全域");
        boolean a2 = i.a(context, "huawei_ssd_create", false);
        h.a("Huawei Create SSD is created : " + a2);
        if (!z) {
            a(context, cVar);
        } else if (!a2) {
            a(context, cVar);
        } else {
            h.a("Huawei SSD is Created");
            cVar.a(0);
        }
    }

    public final void a(final Context context, final d dVar) {
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15d1fc483bb4e8ff68fca7391eb6d936", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15d1fc483bb4e8ff68fca7391eb6d936");
        } else {
            new Thread(new Runnable() { // from class: com.meituan.android.quickpass.uptsm.manage.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5229eb57bb3d5e1864834b247f37584", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5229eb57bb3d5e1864834b247f37584");
                        return;
                    }
                    com.meituan.android.quickpass.uptsm.common.utils.b.a("异步拉起银联进程");
                    synchronized (a.this.d) {
                        h.a("start prepare process");
                        a.a(a.this, context);
                        if (a.this.c != null) {
                            try {
                                dVar.a(a.this.c.prepareProcess());
                            } catch (RemoteException e) {
                                h.b(Log.getStackTraceString(e));
                                dVar.a(-10004);
                            }
                        } else {
                            dVar.a(-10005);
                        }
                    }
                }
            }).start();
        }
    }

    private void a(final Context context, final c cVar) {
        Object[] objArr = {context, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b2f48ba8fbf7f8f7168fd764201d7b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b2f48ba8fbf7f8f7168fd764201d7b4");
        } else {
            new Thread(new Runnable() { // from class: com.meituan.android.quickpass.uptsm.manage.a.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c96b5a647bcf6db33b8c18ac9aef887", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c96b5a647bcf6db33b8c18ac9aef887");
                        return;
                    }
                    com.meituan.android.quickpass.uptsm.common.utils.b.a("异步开始创建安全域");
                    synchronized (a.this.d) {
                        try {
                            h.a("Start Create Huawei SSD");
                            a.a(a.this, context);
                            if (a.this.c != null) {
                                try {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    a aVar = a.this;
                                    Object[] objArr3 = {new Long(currentTimeMillis)};
                                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                                    String format = PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "4f80d281465d8da2e14e6ce0da48c31a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "4f80d281465d8da2e14e6ce0da48c31a") : DateFormat.getDateTimeInstance().format(new Date(currentTimeMillis));
                                    a aVar2 = a.this;
                                    String str = "CREATESSDACTION|" + format;
                                    Object[] objArr4 = {str};
                                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                                    int createSSD = a.this.c.createSSD("MEITUAN", "A0000003330053440121561126241000", PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "8de92c4de663b03a80ef0ed2c2ad410f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "8de92c4de663b03a80ef0ed2c2ad410f") : e.a(e.a(aVar2.b), str), format);
                                    h.a("HuaweiSSDManager CreateSSD status = " + createSSD);
                                    if (createSSD == 0) {
                                        h.a("cache ssd created result");
                                        com.meituan.android.quickpass.uptsm.common.utils.a.a("b_7mursy7t", "c_ogr68a1g", System.currentTimeMillis() - currentTimeMillis);
                                        i.b(context, "huawei_ssd_create", true);
                                    }
                                    cVar.a(createSSD);
                                } catch (Throwable th) {
                                    com.meituan.android.quickpass.uptsm.common.utils.b.a(th, "mNFCOpenService.createSSD");
                                    h.b(Log.getStackTraceString(th));
                                    cVar.a(-10001);
                                }
                            } else {
                                h.b("HuaweiSSDManager createSSD() error, mNFCOpenService = null");
                                cVar.a(-10002);
                            }
                        }
                    }
                }
            }).start();
        }
    }
}
