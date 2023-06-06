package com.sankuai.waimai.mach.manager.cache;

import android.text.TextUtils;
import android.util.Log;
import com.google.gson.Gson;
import com.meituan.android.ptcommonim.protocol.message.PTIMMessageBeanEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.mach.MachMetaData;
import com.sankuai.waimai.mach.common.i;
import com.sankuai.waimai.mach.m;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e {
    public static ChangeQuickRedirect i;
    private String a;
    private boolean b;
    public String j;
    public String k;
    public String l;
    public Map<String, Object> m;
    public boolean n;
    public boolean o;
    public boolean p;
    public a q;

    public e() {
    }

    public e(a aVar, String str, boolean z) {
        Object[] objArr = {aVar, str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad2723c79186f79f8e2887c8724ed664", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad2723c79186f79f8e2887c8724ed664");
            return;
        }
        this.j = str;
        if (aVar != null) {
            this.q = aVar;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = i;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78f41faa3e351b2eba53814b2455797c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78f41faa3e351b2eba53814b2455797c");
            } else {
                this.k = com.sankuai.waimai.mach.manager_new.common.a.c(this.q.e);
                this.l = com.sankuai.waimai.mach.manager_new.common.a.c(this.q.g);
            }
            b();
        }
        this.n = false;
    }

    public e(a aVar, String str, String str2, String str3, boolean z) {
        Object[] objArr = {aVar, str, str2, str3, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccda02dceb0084ae874325c13ce289f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccda02dceb0084ae874325c13ce289f8");
            return;
        }
        this.k = str2;
        this.l = str3;
        this.j = str;
        if (aVar != null) {
            this.q = aVar;
            b();
        }
        this.n = false;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "649f05cdd92074c8bf914c4643a66022", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "649f05cdd92074c8bf914c4643a66022");
            return;
        }
        this.a = com.sankuai.waimai.mach.manager_new.common.a.c(this.q.j);
        if (!TextUtils.isEmpty(this.l)) {
            this.l = this.l.trim();
        }
        String c = com.sankuai.waimai.mach.manager_new.common.a.c(this.q.i);
        if (TextUtils.isEmpty(c)) {
            return;
        }
        try {
            this.m = com.sankuai.waimai.mach.utils.b.a(c);
        } catch (Exception e) {
            com.sankuai.waimai.mach.log.b.b("MachBundle", "解析Data失败::" + Log.getStackTraceString(e));
        }
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aada75bb726ee7e38d24593c6fbe7287", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aada75bb726ee7e38d24593c6fbe7287")).booleanValue();
        }
        if (this.q == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("templateId", this.j);
        hashMap.put("jsContent", this.l);
        com.sankuai.waimai.mach.e e = i.a().e();
        if (!TextUtils.isEmpty(this.l) && !this.l.endsWith("this.default=null;")) {
            com.sankuai.waimai.mach.log.b.b("MachBundle", "解析jsContent失败::machId -> " + this.j + " | jsContent --> " + this.l);
            if (e != null) {
                e.a("mach_bundle_js_file_error", "js文件错误", "js文件错误", hashMap);
            }
            return false;
        }
        if (!TextUtils.isEmpty(this.a)) {
            try {
                MachMetaData machMetaData = (MachMetaData) new Gson().fromJson(this.a, (Class<Object>) MachMetaData.class);
                this.b = machMetaData.getSkipInitProps();
                if (!TextUtils.isEmpty(this.l) && machMetaData != null && machMetaData.getMd5Info() != null) {
                    MachMetaData.Md5Info md5Info = machMetaData.getMd5Info();
                    if (!TextUtils.isEmpty(md5Info.getJsMd5()) && !com.sankuai.waimai.mach.utils.a.a(this.l.trim()).equals(md5Info.getJsMd5())) {
                        com.sankuai.waimai.mach.log.b.b("MachBundle", "jsContent的md5校检失败::machId -> " + this.j + " | jsContent --> " + this.l);
                        if (e != null) {
                            e.a("mach_bundle_js_file_md5_invalidate_error", "js文件md5校检失败", "js文件md5校检失败", hashMap);
                        }
                        return false;
                    } else if (!TextUtils.isEmpty(this.k) && !TextUtils.isEmpty(md5Info.getTemplateMd5()) && !com.sankuai.waimai.mach.utils.a.a(this.k.trim()).equals(md5Info.getTemplateMd5())) {
                        com.sankuai.waimai.mach.log.b.b("MachBundle", "templateJson的md5校检失败::machId -> " + this.j + " | jsContent --> " + this.l);
                        if (e != null) {
                            e.a("mach_bundle_template_file_md5_invalidate_error", "templateJson文件md5校检失败", "templateJson文件md5校检失败", hashMap);
                        }
                        return false;
                    }
                }
                if (machMetaData != null && machMetaData.getMd5Info() != null && !TextUtils.isEmpty(machMetaData.getMd5Info().getJsMd5()) && TextUtils.isEmpty(this.l)) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(PTIMMessageBeanEntity.DATA_KEY_TEMPLATE, this.j);
                    if (this.q != null) {
                        hashMap2.put("version", this.q.c);
                    }
                    if (i.a().g() != null) {
                        hashMap2.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, i.a().g().c);
                    }
                    String str = "JS_" + this.j;
                    com.dianping.codelog.b.b(e.class, str.substring(0, Math.min(50, str.length())), com.sankuai.waimai.mach.utils.e.b(hashMap2));
                    com.sankuai.waimai.mach.log.b.b("MachBundle", "app.js丢失::machId -> " + this.j);
                    return false;
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    public final a d() {
        return this.q;
    }

    public String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2a61c7a26a48cca558437e8c9c9c411", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2a61c7a26a48cca558437e8c9c9c411") : this.q == null ? "" : this.q.c;
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e38d2bd17ec8b5f8ccf5ed4b71ab25d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e38d2bd17ec8b5f8ccf5ed4b71ab25d")).booleanValue() : this.b && m.f();
    }
}
