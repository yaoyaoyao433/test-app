package com.sankuai.waimai.platform.mach.monitor;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.platform.capacity.log.i;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "816b7a73c2d90c9b54101169b6617ed7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "816b7a73c2d90c9b54101169b6617ed7");
            return;
        }
        this.b = str;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04943fb4ab01948c53b385d43308b37d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04943fb4ab01948c53b385d43308b37d");
        } else {
            this.c = "mach/business/" + this.b;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e45a7704ad2c428d40c592d0087b1158", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e45a7704ad2c428d40c592d0087b1158");
            return;
        }
        this.d = "mach_load_" + this.b;
        this.e = "mach_render_" + this.b;
        this.f = "mach_js_" + this.b;
        this.g = "mach_cache_miss_" + this.b;
        this.h = "mach_expr_" + this.b;
    }

    public final void a(String str, String str2, CacheException cacheException) {
        Object[] objArr = {str, str2, cacheException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31d3f2b4af3c00258767bf0844c85c10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31d3f2b4af3c00258767bf0844c85c10");
            return;
        }
        com.sankuai.waimai.platform.capacity.log.c.a().a(cacheException.c, this.c, SystemClock.elapsedRealtime());
        String str3 = cacheException.c == 17807 ? this.g : this.d;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("template_id", str);
            jSONObject.put("data", str2);
            i.d(new com.sankuai.waimai.platform.mach.statistics.c().a(str3).b("template download failed").d(jSONObject.toString()).c(cacheException.getMessage()).b());
        } catch (Exception unused) {
        }
    }

    public final void a(int i, String str, String str2, String str3, Throwable th) {
        String str4;
        Object[] objArr = {Integer.valueOf(i), str, str2, str3, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfca71c4466b058f28bd12dbea054e31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfca71c4466b058f28bd12dbea054e31");
            return;
        }
        com.sankuai.waimai.platform.capacity.log.c.a().a(com.meituan.android.common.aidata.ai.bundle.cache.CacheException.LOAD_BUNDLE_SUCCESS_RENDER_FAILURE, this.c, SystemClock.elapsedRealtime());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", str3);
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3b8d0476f4c0f2220b81ce1bef7f2f16", RobustBitConfig.DEFAULT_VALUE)) {
                str4 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3b8d0476f4c0f2220b81ce1bef7f2f16");
            } else if (i != -1) {
                switch (i) {
                    case 1:
                        str4 = "解析模板异常";
                        break;
                    case 2:
                        str4 = "表达式异常";
                        break;
                    case 3:
                        str4 = "计算布局异常";
                        break;
                    case 4:
                        str4 = "创建视图异常";
                        break;
                    case 5:
                        str4 = "空数据异常";
                        break;
                    default:
                        str4 = "code值为" + i;
                        break;
                }
            } else {
                str4 = "未知异常";
            }
            jSONObject.put("code_desc", str4);
            jSONObject.put("template_url", str);
            jSONObject.put("template_id", str2);
            i.d(new com.sankuai.waimai.platform.mach.statistics.c().a(this.e).c(th.getMessage()).b("templateRenderFailed").d(jSONObject.toString()).b());
        } catch (Exception unused) {
        }
    }

    public final void a(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec1e77a64c93f25497a7ca1244ee4386", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec1e77a64c93f25497a7ca1244ee4386");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("template_url", str);
            jSONObject.put("template_id", str2);
            i.d(new com.sankuai.waimai.platform.mach.statistics.c().a(this.f).b(str2).c(th.getMessage()).d(jSONObject.toString()).b());
        } catch (Exception unused) {
        }
    }

    public final void a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08ac9f90262c9e893bcff25d31792c66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08ac9f90262c9e893bcff25d31792c66");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("template_url", str);
            jSONObject.put("template_id", str2);
            jSONObject.put("key", str3);
            jSONObject.put("value", str4);
            i.d(new com.sankuai.waimai.platform.mach.statistics.c().a(this.h).b(str2).c("表达式解析异常").b());
        } catch (Exception unused) {
        }
    }
}
