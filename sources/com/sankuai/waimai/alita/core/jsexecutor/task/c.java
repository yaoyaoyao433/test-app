package com.sankuai.waimai.alita.core.jsexecutor.task;

import com.dianping.jscore.Value;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.base.util.AlitaBundleUtil;
import com.sankuai.waimai.alita.core.engine.j;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends a {
    public static ChangeQuickRedirect h;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.task.a
    public final boolean e() {
        return true;
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.task.a
    public final String f() {
        return "运行";
    }

    public c(g gVar) {
        super(gVar);
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff92c880b7468233e1268a562699722a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff92c880b7468233e1268a562699722a");
        }
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.task.a
    public final Runnable g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e96b5d68e8d500ad20ac705b993b6a6f", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e96b5d68e8d500ad20ac705b993b6a6f") : new Runnable() { // from class: com.sankuai.waimai.alita.core.jsexecutor.task.c.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5418249cd2cae53093ef8e7863a8bc7c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5418249cd2cae53093ef8e7863a8bc7c");
                    return;
                }
                List<JSONObject> list = c.this.b.e;
                if (list == null || list.size() == 0) {
                    c.this.a("main", new Value[]{new Value(0.0d)});
                    return;
                }
                int size = list.size();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(list.get(i));
                }
                c.this.a("main", new Value[]{new Value(size), new Value(jSONArray)});
            }
        };
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.task.a
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a113462d01cc5977aebbc25ac4aa75d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a113462d01cc5977aebbc25ac4aa75d");
            return;
        }
        super.i();
        j a = j.a();
        String a2 = a();
        d dVar = this.b.d;
        Object[] objArr2 = {a2, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = j.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "a4fcca6b9b0169e202e3ed44962da6ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "a4fcca6b9b0169e202e3ed44962da6ee");
        } else {
            a.b.put(a2, dVar);
        }
        com.sankuai.waimai.alita.core.engine.e.a().a(a(), d());
        com.sankuai.waimai.alita.core.engine.e.a().c(a(), d());
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.task.a
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bed5f42d3b90bca923e54891a6c0c4bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bed5f42d3b90bca923e54891a6c0c4bb");
            return;
        }
        super.b(str);
        c(str);
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.task.a
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45295d399f3e5d90fef58951d3748342", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45295d399f3e5d90fef58951d3748342");
            return;
        }
        String str2 = "-1473";
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("code")) {
                int i = jSONObject.getInt("code");
                str2 = i > 0 ? "非法返回码" : String.valueOf(i);
            }
        } catch (Exception unused) {
        }
        j.a().b(this.b.b);
        AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.JSCalculate.MONITOR_KEY, 1, AlitaBundleUtil.a(b())).errorCode(str2).bundleId(b()).addTags(AlitaMonitorCenter.AlitaMonitorConst.JSCalculate.TAG_KEY_JS_TYPE, String.valueOf(d())).addTags("bundle_version", c()).commit();
        com.sankuai.waimai.alita.core.engine.e.a().c(this.b.b, d(), true);
        com.sankuai.waimai.alita.core.engine.e.a().d(this.b.b, d(), true);
        super.c(str);
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.task.a
    public final void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3608f49487fbafb5eb34368488d2867f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3608f49487fbafb5eb34368488d2867f");
            return;
        }
        super.a(exc);
        j.a().b(this.b.b);
        AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.JSCalculate.MONITOR_KEY, 0, AlitaBundleUtil.a(b())).errorCode(AlitaMonitorCenter.AlitaMonitorConst.JSCalculate.TAG_VALUE_ERROR_CODE_FAILED_CALCULATE).bundleId(b()).addTags(AlitaMonitorCenter.AlitaMonitorConst.JSCalculate.TAG_KEY_JS_TYPE, String.valueOf(d())).addTags("bundle_version", c()).commit();
        com.sankuai.waimai.alita.core.engine.e.a().c(this.b.b, d(), false);
        com.sankuai.waimai.alita.core.engine.e.a().d(this.b.b, d(), false);
    }
}
