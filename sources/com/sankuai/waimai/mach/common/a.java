package com.sankuai.waimai.mach.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ITagProcessor;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;
    private final ConcurrentHashMap<String, ITagProcessor> c;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.common.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1001a {
        private static final a a = new a();
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe9f16f093a7c1835bc45bdbe5285a9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe9f16f093a7c1835bc45bdbe5285a9e");
        } else {
            this.c = new ConcurrentHashMap<>();
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76c91cd533d29f342256e472b5b8dd60", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76c91cd533d29f342256e472b5b8dd60") : C1001a.a;
    }

    public final synchronized Map<String, ITagProcessor> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "971fe74d47fc1348759d30762649e70d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "971fe74d47fc1348759d30762649e70d");
        }
        if (!b || this.c.isEmpty()) {
            List<ITagProcessor> a2 = com.sankuai.meituan.serviceloader.b.a(ITagProcessor.class, (String) null);
            if (a2 != null) {
                Object[] objArr2 = {a2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba5adb9deff6a7d37d029f1048b0d928", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba5adb9deff6a7d37d029f1048b0d928");
                } else {
                    for (ITagProcessor iTagProcessor : a2) {
                        this.c.put(iTagProcessor.getTagName(), iTagProcessor);
                    }
                }
            }
            b = true;
        }
        return Collections.unmodifiableMap(this.c);
    }
}
