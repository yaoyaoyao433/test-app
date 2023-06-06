package com.huawei.updatesdk.a.a.d.h;

import android.car.Car;
import android.car.CarInfoManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    private static Car a = null;
    private static String b = null;
    private static String c = null;
    private static boolean d = false;

    /* compiled from: ProGuard */
    /* renamed from: com.huawei.updatesdk.a.a.d.h.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class ServiceConnectionC0175a implements ServiceConnection {
        ServiceConnectionC0175a() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                CarInfoManager carInfoManager = (CarInfoManager) a.a.getCarManager("info");
                String unused = a.c = carInfoManager.getManufacturer();
                String unused2 = a.b = carInfoManager.getModel();
                com.huawei.updatesdk.a.a.a.b("CarInfoUtil", "car getManufacturer = " + a.c + "  getModel = " + a.b);
            } catch (Throwable th) {
                com.huawei.updatesdk.a.a.a.a("CarInfoUtil", "Car not connected in onServiceConnected" + th.toString());
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            com.huawei.updatesdk.a.a.a.b("CarInfoUtil", "onServiceDisconnected");
        }
    }

    private static void a(Context context) {
        if (context == null || d) {
            return;
        }
        try {
            d = true;
            Car createCar = Car.createCar(context.getApplicationContext(), new ServiceConnectionC0175a());
            a = createCar;
            if (createCar != null) {
                a.connect();
            }
        } catch (Throwable th) {
            com.huawei.updatesdk.a.a.a.a("CarInfoUtil", "Car Service Connect Error" + th.toString());
        }
    }

    public static void b(Context context) {
        a(context);
    }

    public static String d() {
        return c;
    }

    public static String e() {
        return b;
    }
}
