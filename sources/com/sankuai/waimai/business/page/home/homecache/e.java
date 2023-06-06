package com.sankuai.waimai.business.page.home.homecache;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e<T> implements Serializable {
    public static ChangeQuickRedirect a;
    public T b;
    public int c;
    public String d;
    public long e;
    public Double f;
    public double g;

    public e(T t, int i, String str, long j, Double d, double d2) {
        Object[] objArr = {t, Integer.valueOf(i), str, new Long(j), d, Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6730861f252e00adcea6e715e7bfc054", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6730861f252e00adcea6e715e7bfc054");
            return;
        }
        this.b = t;
        this.c = i;
        this.d = str;
        this.e = j;
        this.f = d;
        this.g = d2;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68c691f647283e919ac277e0c0439a5c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68c691f647283e919ac277e0c0439a5c")).booleanValue() : this.b != null && d() && c() && b();
    }

    private boolean b() {
        int f;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8142018be9c25535d9e5e75e7a0730ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8142018be9c25535d9e5e75e7a0730ef")).booleanValue();
        }
        if (this.c == 0) {
            f = b.a().e();
        } else {
            f = this.c == 1 ? b.a().f() : 0;
        }
        return System.currentTimeMillis() - this.e < ((long) f);
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae221bcc64962e442a37e4185e25f7ca", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae221bcc64962e442a37e4185e25f7ca")).booleanValue() : !TextUtils.isEmpty(this.d) && TextUtils.equals(com.sankuai.waimai.platform.b.A().i(), this.d);
    }

    private boolean d() {
        WMLocation p;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "484212781df1fe4ee51f4bfec129ebf7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "484212781df1fe4ee51f4bfec129ebf7")).booleanValue();
        }
        if (this.f.doubleValue() <= 0.0d || this.g <= 0.0d) {
            return false;
        }
        try {
            p = g.a().p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (p != null && p.getLongitude() > 0.0d && p.getLatitude() > 0.0d) {
            if (TextUtils.equals(String.valueOf(this.f), String.valueOf(p.getLatitude())) && TextUtils.equals(String.valueOf(this.g), String.valueOf(p.getLongitude()))) {
                return true;
            }
            float a2 = com.sankuai.waimai.foundation.location.utils.a.a(new com.sankuai.waimai.foundation.location.model.a(this.f.doubleValue(), this.g), new com.sankuai.waimai.foundation.location.model.a(p.getLatitude(), p.getLongitude()));
            com.sankuai.waimai.foundation.utils.log.a.b("HomeCacheModel", "distance: " + a2, new Object[0]);
            if (a2 <= 0.0f) {
                return false;
            }
            if (this.c == 0) {
                if (a2 <= 100000.0f) {
                    return true;
                }
            } else if (this.c == 1 && a2 <= 1000.0f) {
                return true;
            }
            return false;
        }
        return false;
    }
}
