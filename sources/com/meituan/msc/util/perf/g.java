package com.meituan.msc.util.perf;

import android.os.Process;
import android.os.SystemClock;
import com.dianping.titans.utils.Constants;
import com.meituan.msc.common.utils.ad;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.Message;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final long g;
    public final long h;
    public final Map<String, Object> i;
    public JSONObject j;
    public String k;
    public boolean l;
    boolean m;

    public g(String str, String str2) {
        this(str, str2, d(), e());
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4881c7899cf5a5df4b38f781e5aff9f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4881c7899cf5a5df4b38f781e5aff9f3");
        }
    }

    public g(String str, String str2, long j) {
        this(str, str2, k.b(j), j);
        Object[] objArr = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef596a016646351aec6de15ec5eb9ed8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef596a016646351aec6de15ec5eb9ed8");
        }
    }

    public g(String str, String str2, long j, long j2) {
        this(str, str2, j, j2, Process.myTid(), Thread.currentThread().getName());
        Object[] objArr = {str, str2, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ab64cc78e11850441eaea4e63d7068d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ab64cc78e11850441eaea4e63d7068d");
        }
    }

    public g(String str, String str2, long j, long j2, int i, String str3) {
        Object[] objArr = {str, str2, new Long(j), new Long(j2), Integer.valueOf(i), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bfd9f4b1d511ab7c679d9f2f2c6cade", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bfd9f4b1d511ab7c679d9f2f2c6cade");
            return;
        }
        this.i = new ad();
        this.l = true;
        this.m = false;
        this.b = str;
        this.c = str2;
        this.d = Process.myPid();
        this.e = i;
        this.g = j;
        this.h = j2;
        this.f = str3;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e933e4dbb02c65d2dcde8146344506f6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e933e4dbb02c65d2dcde8146344506f6") : this.j == null ? "" : this.j.optString("domain", "");
    }

    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e09502d8a80c7f76d8e464c4ffbaf75d", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e09502d8a80c7f76d8e464c4ffbaf75d");
        }
        this.i.put("eventId", Integer.valueOf(i));
        return this;
    }

    public final g a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ab433af804371c73d53d0fcc2c7294f", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ab433af804371c73d53d0fcc2c7294f");
        }
        this.i.put("duration", Long.valueOf(j));
        return this;
    }

    public final long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0b19ec2c6d985ddc7ac6f68c429d591", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0b19ec2c6d985ddc7ac6f68c429d591")).longValue();
        }
        Long l = (Long) this.i.get("duration");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final g b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91803e150e97c85b6f34e9aa7bd33ba6", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91803e150e97c85b6f34e9aa7bd33ba6") : a(j * 1000000);
    }

    public final long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52786b42a00342af4f18a4aaba432ed1", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52786b42a00342af4f18a4aaba432ed1")).longValue() : b() / 1000000;
    }

    public static String a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47bbff4eedf92e2d87ba951dbfe8114a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47bbff4eedf92e2d87ba951dbfe8114a");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", gVar.b);
            jSONObject.put("ph", gVar.c);
            jSONObject.put(Constants.MULTI_PROCESS_PID, gVar.d);
            jSONObject.put("tid", gVar.e);
            jSONObject.put("ts", new BigDecimal(gVar.g).divide(new BigDecimal(1000000), RoundingMode.CEILING));
            jSONObject.put("unixTs", gVar.h);
            for (Map.Entry<String, Object> entry : gVar.i.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            long c = gVar.c();
            if (c > 0) {
                jSONObject.put("dur", c);
            }
            if ("i".equals(gVar.c)) {
                jSONObject.put("s", "p");
            }
            if (gVar.j != null) {
                jSONObject.put("args", gVar.j);
            }
            if (gVar.k != null) {
                jSONObject.put(Message.SID, gVar.k);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public static long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2254a8aabf095fe5cb21b115baf89fe4", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2254a8aabf095fe5cb21b115baf89fe4")).longValue() : SystemClock.elapsedRealtimeNanos();
    }

    public static long e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64f3bb17914b08c56e05feb38be8c7c7", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64f3bb17914b08c56e05feb38be8c7c7")).longValue() : System.currentTimeMillis();
    }
}
