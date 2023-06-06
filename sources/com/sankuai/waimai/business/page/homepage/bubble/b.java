package com.sankuai.waimai.business.page.homepage.bubble;

import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.utils.p;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.platform.utils.l;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b f;
    public com.sankuai.waimai.business.page.home.model.c b;
    public com.sankuai.waimai.business.page.home.model.a c;
    public Map<String, String> d;
    public boolean e;
    private final q g;

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3b0020f9fb36be17047abff209f0d3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3b0020f9fb36be17047abff209f0d3f");
        }
        if (f == null) {
            synchronized (b.class) {
                if (f == null) {
                    f = new b();
                }
            }
        }
        return f;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03ff5f3c57e52f059dadf731fa4fdb37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03ff5f3c57e52f059dadf731fa4fdb37");
            return;
        }
        this.e = false;
        this.g = q.a(com.meituan.android.singleton.b.a, "waimai_tab_content_bubble", 1);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "270aac340532d3e3650b8289209ae07c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "270aac340532d3e3650b8289209ae07c");
            return;
        }
        l.cancel("dismiss-content-big-bubble");
        this.e = z;
        if (!z || this.c == null) {
            return;
        }
        this.g.a("sp_const_content_bubble_last_click_content_id", this.c.b);
        if (TextUtils.isEmpty(this.c.j)) {
            return;
        }
        this.e = false;
        l.b(new Runnable() { // from class: com.sankuai.waimai.business.page.homepage.bubble.b.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2ca4062c04a3a6d3ae41f8071641562", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2ca4062c04a3a6d3ae41f8071641562");
                } else {
                    com.sankuai.waimai.foundation.router.a.a(com.sankuai.waimai.foundation.utils.activity.a.a().b(), b.this.c.j);
                }
            }
        }, "content-bubble-click-jump");
    }

    public final String b() {
        return this.c != null ? this.c.a : "";
    }

    public final long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7fc49e1d6d7a1976ab888ae6eaf0a31", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7fc49e1d6d7a1976ab888ae6eaf0a31")).longValue();
        }
        if (this.g != null) {
            return this.g.b("sp_const_content_bubble_last_click_content_id", 0L);
        }
        return 0L;
    }

    public final void a(String str, String str2) {
        String cityName;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fba1dc691aaef3efbd8492808492200", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fba1dc691aaef3efbd8492808492200");
            return;
        }
        this.d = p.a();
        this.d.put("last_time_actual_latitude", str);
        this.d.put("last_time_actual_longitude", str2);
        this.d.put("request_timestamp", String.valueOf(System.currentTimeMillis()));
        try {
            WmAddress k = com.sankuai.waimai.foundation.location.v2.g.a().k();
            WmAddress j = com.sankuai.waimai.foundation.location.v2.g.a().j();
            this.d.put("ext_address", k == null ? "" : k.getAddress());
            Map<String, String> map = this.d;
            if (k == null) {
                cityName = "";
            } else {
                cityName = k.getMeitaunCity() == null ? "" : k.getMeitaunCity().getCityName();
            }
            map.put("ext_cityName", cityName);
            this.d.put("ext_actualAddress", j == null ? "" : j.getAddress());
        } catch (Exception unused) {
        }
    }
}
