package com.sankuai.waimai.mach.recycler;

import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.manager.monitor.MonitorManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public Map<String, Mach> b;
    public com.sankuai.waimai.mach.model.data.a c;
    private Set<g> d;
    private boolean e;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60a7f9859735bcd45b6b322f29a7cef1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60a7f9859735bcd45b6b322f29a7cef1");
            return;
        }
        this.b = new HashMap();
        this.d = new HashSet();
    }

    public final void a(Mach mach, com.sankuai.waimai.mach.manager.cache.e eVar, String str) {
        Object[] objArr = {mach, eVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a160eb9242ef450c77cdb971d4081886", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a160eb9242ef450c77cdb971d4081886");
        } else if (mach == null || TextUtils.isEmpty(str) || this.b.get(str) != null || !TextUtils.isEmpty(eVar.l)) {
        } else {
            mach.bindPreRenderBundle(eVar);
            this.b.put(str, mach);
            this.e = false;
        }
    }

    public final g a(String str, Map<String, Object> map, int i, int i2, String str2, String str3) {
        Mach mach;
        com.sankuai.waimai.mach.node.a aVar;
        String str4;
        Object[] objArr = {str, map, Integer.valueOf(i), Integer.valueOf(i2), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41f8fe6e87b607b438225f5bd644e4ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41f8fe6e87b607b438225f5bd644e4ae");
        }
        if (TextUtils.isEmpty(str) || com.sankuai.waimai.mach.utils.e.a(map) || (mach = this.b.get(str)) == null) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.sankuai.waimai.mach.node.a preRenderNodeTreeSync = mach.preRenderNodeTreeSync(map, i, i2, new com.sankuai.waimai.mach.model.data.a(MonitorManager.RECORD_START(this.e, str)), null);
        this.e = true;
        int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
        String a2 = mach.getMachBundle() != null ? mach.getMachBundle().a() : "";
        if (preRenderNodeTreeSync != null) {
            com.sankuai.waimai.mach.manager.a.a().b().renderSuccess(str2, str3, str, a2, map, elapsedRealtime2);
            aVar = preRenderNodeTreeSync;
            str4 = str;
        } else {
            aVar = preRenderNodeTreeSync;
            str4 = str;
            com.sankuai.waimai.mach.manager.a.a().b().renderFailure(str2, str3, str, a2, map, new Exception("列表渲染失败"), elapsedRealtime2);
        }
        return new g(str4, aVar);
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d95325e1c09984fc6cb60437060152e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d95325e1c09984fc6cb60437060152e")).booleanValue() : this.b.get(str) != null;
    }
}
