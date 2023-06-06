package com.sankuai.waimai.alita.core.jsexecutor;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.init.j;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static f b;
    private final Map<String, Map<String, com.sankuai.waimai.alita.core.jsexecutor.modules.a>> c;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd295ec6ac46b6a2d47cd7e21b994cea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd295ec6ac46b6a2d47cd7e21b994cea");
        } else {
            this.c = new HashMap();
        }
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fdba7455af7f7f8ae87189e5dc983276", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fdba7455af7f7f8ae87189e5dc983276");
        }
        if (b == null) {
            synchronized (f.class) {
                if (b == null) {
                    b = new f();
                }
            }
        }
        return b;
    }

    public final synchronized Map<String, com.sankuai.waimai.alita.core.jsexecutor.modules.a> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74b4780ff1c299fb06db150243dd6cf8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74b4780ff1c299fb06db150243dd6cf8");
        }
        return this.c.get(str);
    }

    public final synchronized void a(List<j> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c1a46c009c16d7616e175fd07762898", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c1a46c009c16d7616e175fd07762898");
            return;
        }
        if (!com.sankuai.waimai.alita.core.utils.h.a(list)) {
            for (j jVar : list) {
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e04b2210697927af6c1c76d96e0902c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e04b2210697927af6c1c76d96e0902c");
                } else if (jVar != null && !com.sankuai.waimai.alita.core.utils.h.a(jVar.a())) {
                    for (com.sankuai.waimai.alita.core.jsexecutor.modules.b bVar : jVar.a()) {
                        if (bVar != null) {
                            String a2 = bVar.a();
                            if (!TextUtils.isEmpty(a2)) {
                                if (this.c.containsKey(a2)) {
                                    this.c.get(a2).putAll(bVar.b);
                                } else {
                                    this.c.put(a2, bVar.b);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
