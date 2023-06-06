package android.support.v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.support.v4.content.PermissionChecker;
import android.util.Log;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import java.util.Calendar;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m {
    private static m a;
    private final Context b;
    private final LocationManager c;
    private final a d = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m a(@NonNull Context context) {
        if (a == null) {
            Context applicationContext = context.getApplicationContext();
            a = new m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return a;
    }

    @VisibleForTesting
    private m(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.b = context;
        this.c = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        a aVar = this.d;
        if (c()) {
            return aVar.a;
        }
        Location b = b();
        if (b != null) {
            a(b);
            return aVar.a;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    private Location b() {
        Location a2 = PermissionChecker.checkSelfPermission(this.b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? a("network") : null;
        Location a3 = PermissionChecker.checkSelfPermission(this.b, "android.permission.ACCESS_FINE_LOCATION") == 0 ? a("gps") : null;
        return (a3 == null || a2 == null) ? a3 != null ? a3 : a2 : a3.getTime() > a2.getTime() ? a3 : a2;
    }

    private Location a(String str) {
        if (this.c != null) {
            try {
                if (com.sankuai.meituan.takeoutnew.util.aop.g.a(this.c, str)) {
                    return com.meituan.android.privacy.aop.c.a(this.c, str);
                }
                return null;
            } catch (Exception e) {
                Log.d("TwilightManager", "Failed to get last known location", e);
                return null;
            }
        }
        return null;
    }

    private boolean c() {
        return this.d != null && this.d.f > System.currentTimeMillis();
    }

    private void a(@NonNull Location location) {
        long j;
        a aVar = this.d;
        long currentTimeMillis = System.currentTimeMillis();
        l a2 = l.a();
        a2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a2.a;
        a2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a2.c == 1;
        long j3 = a2.b;
        long j4 = a2.a;
        boolean z2 = z;
        a2.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = a2.b;
        if (j3 == -1 || j4 == -1) {
            j = DDLoadConstants.CACHE_MULTIPLE_PROCESS_PROCTECT_TIME + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + LocationStrategy.LOCATION_TIMEOUT;
        }
        aVar.a = z2;
        aVar.b = j2;
        aVar.c = j3;
        aVar.d = j4;
        aVar.e = j5;
        aVar.f = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        boolean a;
        long b;
        long c;
        long d;
        long e;
        long f;

        a() {
        }
    }
}
