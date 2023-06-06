package com.vivo.identifier;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.common.CommonConstant;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    public static Context a;
    private final int t;
    private static Object e = new Object();
    private static boolean f = false;
    private static int g = 13;
    public static c b = null;
    private static c h = null;
    private static c i = null;
    private static c j = null;
    private static HandlerThread k = null;
    private static Handler l = null;
    public static String c = null;
    private static String m = null;
    private static String n = null;
    private static String o = null;
    public static String d = null;
    private static String p = null;
    private static String q = null;
    private static volatile b r = null;
    private static volatile a s = null;
    private static int u = 0;
    private static int v = 0;
    private static int w = 0;
    private static int x = 0;
    private static int y = 0;
    private static int z = 0;
    private static int A = 0;
    private static int B = 0;
    private static int C = 0;
    private static int D = 0;
    private static int E = 0;
    private static int F = 0;

    static /* synthetic */ int f(int i2) {
        z = 0;
        return 0;
    }

    static /* synthetic */ int l(int i2) {
        F = 0;
        return 0;
    }

    private b() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        k = handlerThread;
        handlerThread.start();
        l = new Handler(k.getLooper()) { // from class: com.vivo.identifier.b.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what == 11) {
                    int i2 = message.getData().getInt("type");
                    try {
                        String a2 = b.s.a(i2, message.getData().getString("appid"));
                        switch (i2) {
                            case 0:
                                String unused = b.c = a2;
                                b.a(8, b.c);
                                break;
                            case 1:
                                if (a2 != null) {
                                    String unused2 = b.m = a2;
                                } else {
                                    Log.e("VMS_SDK_Client", "get vaid failed");
                                }
                                b.a(9, b.m);
                                break;
                            case 2:
                                if (a2 != null) {
                                    String unused3 = b.n = a2;
                                } else {
                                    Log.e("VMS_SDK_Client", "get aaid failed");
                                }
                                b.a(10, b.n);
                                break;
                            case 3:
                                if (a2 != null) {
                                    String unused4 = b.o = a2;
                                    break;
                                } else {
                                    Log.e("VMS_SDK_Client", "get udid failed");
                                    break;
                                }
                            case 4:
                                String unused5 = b.d = a2;
                                break;
                            case 5:
                                if (a2 != null) {
                                    String unused6 = b.p = a2;
                                    break;
                                } else {
                                    Log.e("VMS_SDK_Client", "get guid failed");
                                    break;
                                }
                        }
                    } catch (Exception e2) {
                        Log.e("VMS_SDK_Client", "readException:" + e2.toString());
                    }
                    synchronized (b.e) {
                        b.e.notify();
                    }
                    return;
                }
                Log.e("VMS_SDK_Client", "message type valid");
            }
        };
        s = new a(a);
        this.t = b(a);
    }

    private static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.vivo.vms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    private static b c(Context context) {
        if (a == null) {
            if (context == null) {
                return null;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            a = context;
        }
        if (r == null) {
            synchronized (b.class) {
                if (r == null) {
                    b bVar = new b();
                    r = bVar;
                    Executors.newScheduledThreadPool(1).scheduleWithFixedDelay(new Runnable() { // from class: com.vivo.identifier.b.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (b.u + b.v + b.A + b.D + b.w + b.x + b.C + b.D + b.y + b.z + b.E + b.F > 0) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("oaid", b.a(b.this, b.u, b.v, b.A, b.B));
                                contentValues.put("vaid", b.a(b.this, b.w, b.x, b.C, b.D));
                                contentValues.put("aaid", b.a(b.this, b.y, b.z, b.E, b.F));
                                b.s.a(7, "vivo", new ContentValues[]{contentValues});
                                int unused = b.u = b.v = b.w = b.x = b.y = b.f(0);
                                int unused2 = b.A = b.B = b.C = b.D = b.E = b.l(0);
                            }
                        }
                    }, 600L, 600L, TimeUnit.SECONDS);
                }
            }
        }
        return r;
    }

    public static b a(Context context) {
        if (a()) {
            return c(context);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        if (!f) {
            s();
        }
        return f;
    }

    public static void a(int i2, String str) {
        switch (i2) {
            case 0:
                if (str == null) {
                    v++;
                    return;
                } else {
                    u++;
                    return;
                }
            case 1:
                if (str == null) {
                    x++;
                    return;
                } else {
                    w++;
                    return;
                }
            case 2:
                if (str == null) {
                    z++;
                    return;
                } else {
                    y++;
                    return;
                }
            default:
                switch (i2) {
                    case 8:
                        if (str == null) {
                            B++;
                            return;
                        } else {
                            A++;
                            return;
                        }
                    case 9:
                        if (str == null) {
                            D++;
                            return;
                        } else {
                            C++;
                            return;
                        }
                    case 10:
                        if (str == null) {
                            F++;
                            return;
                        } else {
                            E++;
                            return;
                        }
                    default:
                        return;
                }
        }
    }

    public void b(int i2, String str) {
        synchronized (e) {
            c(i2, null);
            SystemClock.uptimeMillis();
            try {
                e.wait(ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
            } catch (InterruptedException unused) {
                Log.e("VMS_SDK_Client", "queryId: lock error");
            }
            SystemClock.uptimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(int i2, String str) {
        Message obtainMessage = l.obtainMessage();
        obtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i2);
        if (i2 == 1 || i2 == 2 || i2 == 6) {
            bundle.putString("appid", str);
        }
        obtainMessage.setData(bundle);
        l.sendMessage(obtainMessage);
    }

    private static void s() {
        f = "1".equals(a("persist.sys.identifierid.supported", "0")) || "1".equals(a("persist.sys.identifierid", "0"));
    }

    private static String a(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "0");
            } catch (Exception e2) {
                Log.e("VMS_SDK_Client", "getProperty: invoke is error" + e2.getMessage());
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static synchronized void a(Context context, int i2, String str) {
        synchronized (b.class) {
            if (b == null) {
                b = new c(r, 0, null);
                context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, b);
            }
        }
    }

    static /* synthetic */ String a(b bVar, int i2, int i3, int i4, int i5) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i2);
        stringBuffer.append(CommonConstant.Symbol.COMMA);
        stringBuffer.append(i3);
        stringBuffer.append(";");
        stringBuffer.append(i4);
        stringBuffer.append(CommonConstant.Symbol.COMMA);
        stringBuffer.append(i5);
        return stringBuffer.toString();
    }
}
