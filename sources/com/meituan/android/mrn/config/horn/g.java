package com.meituan.android.mrn.config.horn;

import com.google.gson.reflect.TypeToken;
import com.meituan.android.mrn.config.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public static g b = new g();

    public g() {
        com.meituan.android.mrn.utils.config.b a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4eecdd91d998edb060f14c4c62538e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4eecdd91d998edb060f14c4c62538e6");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1bdaf124ab933ec6bd2a5a2605c308b2", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (com.meituan.android.mrn.utils.config.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1bdaf124ab933ec6bd2a5a2605c308b2");
        } else {
            a2 = com.meituan.android.mrn.utils.config.a.a();
            String e = com.meituan.android.mrn.config.c.a().e();
            if (a.a.equals(e)) {
                a2.c = a.c;
            } else if (a.b.equals(e)) {
                a2.c = a.d;
            }
        }
        com.meituan.android.mrn.utils.config.b bVar = a2;
        a("sdkEnable", Boolean.TYPE, Boolean.FALSE, "是否开启秒开", bVar);
        a("pageBlacklist", new TypeToken<List<String>>() { // from class: com.meituan.android.mrn.config.horn.g.1
        }.getType(), null, "", bVar);
        a("defaultSamplingRate", Boolean.TYPE, Boolean.FALSE, "全局采样 MRN秒开支持分Bundle采样", bVar);
        a("specifySamplingRate", Boolean.TYPE, Boolean.FALSE, "特别采样率", bVar);
        a("enableAddCustomTag", Boolean.TYPE, Boolean.FALSE, "是否开启业务自定义的开关", bVar);
        a("enableSetStartTime", Boolean.TYPE, Boolean.FALSE, "秒开SDK增加设置开始时间的方法", bVar);
        a("specifySamplingList", new TypeToken<List<String>>() { // from class: com.meituan.android.mrn.config.horn.g.2
        }.getType(), null, "特别采样范围，内容为bundleName", bVar);
    }

    private void a(String str, Type type, Object obj, String str2, com.meituan.android.mrn.utils.config.b bVar) {
        Object[] objArr = {str, type, obj, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dc86eb8a0c9de11c603d29739c9243b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dc86eb8a0c9de11c603d29739c9243b");
        } else {
            t.a(str, type, obj, "mrn_fmp_android", str2, bVar);
        }
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99ea21fd7763907ddab79a55bb7d2198", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99ea21fd7763907ddab79a55bb7d2198")).booleanValue();
        }
        if (com.meituan.android.mrn.monitor.i.b) {
            return true;
        }
        if (((Boolean) t.b.a("sdkEnable")).booleanValue()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            List list = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c890c672d4288d5d5bdea30004837d7c", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c890c672d4288d5d5bdea30004837d7c") : (List) t.b.a("specifySamplingList");
            if (!CollectionUtils.isEmpty(list) && list.contains(str)) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f2d6737144f7cb1e4e9db40450817a5f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f2d6737144f7cb1e4e9db40450817a5f")).booleanValue() : ((Boolean) t.b.a("specifySamplingRate")).booleanValue();
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3f1083d8efdb3875db64afb78c18698d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3f1083d8efdb3875db64afb78c18698d")).booleanValue() : ((Boolean) t.b.a("defaultSamplingRate")).booleanValue();
        }
        return false;
    }

    public final List<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0626fe0b61001e863095d4fa3ee376d6", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0626fe0b61001e863095d4fa3ee376d6") : (List) t.b.a("pageBlacklist");
    }
}
