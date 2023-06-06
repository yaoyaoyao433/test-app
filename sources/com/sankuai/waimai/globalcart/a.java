package com.sankuai.waimai.globalcart;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
import java.text.SimpleDateFormat;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    private static a l;
    public boolean b;
    public boolean c;
    public Context d;
    public AlarmManager e;
    public Intent f;
    public SimpleDateFormat g;
    public long h;
    public int i;
    public long j;
    public BroadcastReceiver k;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98da48ba1bd585fdde8861b180a640c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98da48ba1bd585fdde8861b180a640c2");
        }
        if (l == null) {
            l = new a();
        }
        return l;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5a9b3d285ad6e66ad73c90e7842c4c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5a9b3d285ad6e66ad73c90e7842c4c8");
            return;
        }
        this.c = true;
        this.k = new BroadcastReceiver() { // from class: com.sankuai.waimai.globalcart.PoiIdGuardManager$1
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Object[] objArr2 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e8c6422a6e4f4d6a4a79c51425b3566", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e8c6422a6e4f4d6a4a79c51425b3566");
                } else if (intent == null || !"com.sankuai.waimai.business.restaurant.poiid.refresh".equals(intent.getAction())) {
                } else {
                    if (a.this.b) {
                        com.sankuai.waimai.globalcart.biz.a.a().a(1);
                    }
                    a.this.a(86400000L);
                }
            }
        };
        this.d = b.a.getApplicationContext();
        this.f = new Intent("com.sankuai.waimai.business.restaurant.poiid.refresh");
        this.g = new SimpleDateFormat("yyyyMMddHH", Locale.CHINA);
        this.i = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.d, "poi_id_need_refresh_time_hour", 3);
        this.j = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.d, "poi_id_need_refresh_time_millis_delay", 0L);
        if (this.d.getSystemService(NotificationCompat.CATEGORY_ALARM) == null) {
            return;
        }
        this.e = (AlarmManager) this.d.getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    public void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef63cf8eac4b933ec4ec2692a44c19d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef63cf8eac4b933ec4ec2692a44c19d3");
            return;
        }
        try {
            PendingIntent broadcast = PendingIntent.getBroadcast(this.d, 0, this.f, y.a);
            if (Build.VERSION.SDK_INT >= 23) {
                this.e.setExactAndAllowWhileIdle(1, System.currentTimeMillis() + j, broadcast);
            } else if (Build.VERSION.SDK_INT >= 19) {
                this.e.setExact(1, System.currentTimeMillis() + j, broadcast);
            } else {
                this.e.set(1, System.currentTimeMillis() + j, broadcast);
            }
        } catch (Exception unused) {
        }
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56545755d92b185e39b05630764c869c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56545755d92b185e39b05630764c869c");
        } else {
            this.h = j;
        }
    }
}
