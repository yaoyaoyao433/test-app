package com.meituan.android.mrn.config.horn;

import com.google.gson.reflect.TypeToken;
import com.meituan.android.mrn.config.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public static f b = new f();

    public f() {
        com.meituan.android.mrn.utils.config.b a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cf96c553ce5cbc41949120034379636", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cf96c553ce5cbc41949120034379636");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d8e92d310338a78d89c018e3f1eae6d7", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (com.meituan.android.mrn.utils.config.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d8e92d310338a78d89c018e3f1eae6d7");
        } else {
            a2 = com.meituan.android.mrn.utils.config.a.a();
            String e = com.meituan.android.mrn.config.c.a().e();
            if (a.a.equals(e)) {
                a2.c = "";
            } else if (a.b.equals(e)) {
                a2.c = a.d;
            }
        }
        com.meituan.android.mrn.utils.config.b bVar = a2;
        a("evaUpdateTimeInterval", Integer.TYPE, 600, "bundle配置轮询时间（s）", bVar);
        a("createPrepareBridgeDelay", Integer.TYPE, 10000, "创建引擎时间间隔（s）", bVar);
        a("enableV8GCWhenPageExit", Boolean.TYPE, Boolean.FALSE, "页面退出时是否进行主动GC", bVar);
        a("enableDestroyInstanceWhenJSEOOM", Boolean.TYPE, Boolean.FALSE, "是否在JS内存过大时销毁引擎", bVar);
        a("destroyInstanceJSESize", Integer.TYPE, 300, "JS内存过大时销毁引擎 -- JS内存阈值", bVar);
        a("CodeCacheAllowList", new TypeToken<List<String>>() { // from class: com.meituan.android.mrn.config.horn.f.1
        }.getType(), null, "CodeCache一期白名单", bVar);
        a("useNewCreateInstance", Boolean.TYPE, Boolean.FALSE, "是否使用新的引擎新建逻辑", bVar);
    }

    private void a(String str, Type type, Object obj, String str2, com.meituan.android.mrn.utils.config.b bVar) {
        Object[] objArr = {str, type, obj, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "391e0e340ddd9539f20ca61a04da0627", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "391e0e340ddd9539f20ca61a04da0627");
        } else {
            t.a(str, type, obj, "mrn_feature_config_android", str2, bVar);
        }
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf445b79b29fde74aaaecbcc1187dc54", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf445b79b29fde74aaaecbcc1187dc54")).intValue();
        }
        int intValue = ((Integer) t.b.a("evaUpdateTimeInterval")).intValue();
        if (intValue <= 120) {
            intValue = 120;
        }
        return intValue * 1000;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be36479b5ffa12b35f1ca6ca97297af1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be36479b5ffa12b35f1ca6ca97297af1")).booleanValue() : ((Boolean) t.b.a("enableV8GCWhenPageExit")).booleanValue();
    }
}
