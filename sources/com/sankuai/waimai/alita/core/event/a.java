package com.sankuai.waimai.alita.core.event;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.entity.EventData;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.controller.group.bean.AtMeInfo;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Map<String, Object> f;
    Map<String, Object> g;
    public String h;
    int i;
    private long j;
    private EventData k;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccaf783c226c82f70839ad81914d0626", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccaf783c226c82f70839ad81914d0626");
            return;
        }
        this.i = 0;
        this.h = Statistics.getSession();
        a(System.currentTimeMillis());
    }

    public a(EventData eventData) {
        this();
        Object[] objArr = {eventData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "088ca4a513b93e91a06b7055f907809b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "088ca4a513b93e91a06b7055f907809b");
        } else {
            this.k = eventData;
        }
    }

    @Nullable
    public final String a() {
        if (this.k != null) {
            return this.k.nm;
        }
        return this.b;
    }

    public final String b() {
        if (this.k != null) {
            return this.k.category;
        }
        return this.c;
    }

    @Nullable
    public final String c() {
        if (this.k != null) {
            return this.k.val_cid;
        }
        return this.d;
    }

    @Nullable
    public final String d() {
        if (this.k != null) {
            return this.k.val_bid;
        }
        return this.e;
    }

    @Nullable
    public final Map<String, Object> e() {
        if (this.k != null) {
            return this.k.val_lab;
        }
        return this.f;
    }

    @Nullable
    private Map<String, Object> m() {
        if (this.k != null) {
            return this.k.tag;
        }
        return this.g;
    }

    public final long f() {
        if (this.k != null) {
            return this.k.tm;
        }
        return this.j;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d8264e2d2f5be412309a287b199359e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d8264e2d2f5be412309a287b199359e");
        } else {
            this.j = j;
        }
    }

    public final int g() {
        if (this.k != null) {
            return this.k.nt;
        }
        return this.i;
    }

    @Nullable
    public final String h() {
        if (this.k != null) {
            return this.k.msid;
        }
        return this.h;
    }

    @Nullable
    public final String i() {
        return this.k != null ? this.k.val_ref : "";
    }

    public final long j() {
        if (this.k != null) {
            return this.k.duration;
        }
        return 0L;
    }

    public final long k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a08d7fefb10eab5e6929c3a619b1a5eb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a08d7fefb10eab5e6929c3a619b1a5eb")).longValue();
        }
        if (this.k == null || this.k.val_lab == null || !"pn".equals(this.k.nm)) {
            return 0L;
        }
        Object obj = this.k.val_lab.get("life_time");
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        return 0L;
    }

    @NonNull
    public final JSONObject l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d10a61b13b932e2c3e9ea690523e39ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d10a61b13b932e2c3e9ea690523e39ed");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event_type", a());
            jSONObject.put("cid", c());
            jSONObject.put("bid", d());
            jSONObject.put("ref_cid", i());
            jSONObject.put("session_id", h());
            jSONObject.put(AtMeInfo.TIME_STAMP, f());
            jSONObject.put("report_source", g());
            jSONObject.put("duration", j());
            jSONObject.put("category", b());
            if (e() != null) {
                jSONObject.put("val_lab", new JSONObject(e()));
            }
            if (m() != null) {
                jSONObject.put("tag", new JSONObject(m()));
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.core.event.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0701a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public Map<String, Object> e;
        public Map<String, Object> f;
        private String g;
        private String h;
        private long i;
        private int j;

        public static C0701a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f24b218a372894b735b086a78a18ee31", RobustBitConfig.DEFAULT_VALUE) ? (C0701a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f24b218a372894b735b086a78a18ee31") : new C0701a(str);
        }

        private C0701a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff6f2a90606797395689e43449d4366b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff6f2a90606797395689e43449d4366b");
            } else {
                this.g = str;
            }
        }

        public final a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdc9913145cb5ff415825bbc89aab07a", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdc9913145cb5ff415825bbc89aab07a");
            }
            a aVar = new a();
            if (this.g != null) {
                aVar.b = this.g;
            }
            if (this.b != null) {
                aVar.c = this.b;
            }
            if (this.c != null) {
                aVar.d = this.c;
            }
            if (this.d != null) {
                aVar.e = this.d;
            }
            if (this.e != null) {
                aVar.f = this.e;
            }
            if (this.f != null) {
                aVar.g = this.f;
            }
            if (this.h != null) {
                aVar.h = this.h;
            }
            if (this.i != 0) {
                aVar.a(this.i);
            }
            if (this.j != 0) {
                aVar.i = this.j;
            }
            return aVar;
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36529f9abe7a425a6dda46f4af9bab7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36529f9abe7a425a6dda46f4af9bab7e");
        }
        return "catogory=" + b() + " type=" + a() + " bid=" + d() + " cid=" + c() + " session=" + h();
    }
}
