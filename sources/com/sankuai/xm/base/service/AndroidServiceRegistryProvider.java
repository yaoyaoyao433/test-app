package com.sankuai.xm.base.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.AbstractServiceRegistry;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.keep.KeepClassName;
import com.sankuai.xm.base.util.w;
import com.sankuai.xm.base.util.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class AndroidServiceRegistryProvider implements m.a, KeepClassName {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.base.service.m.a
    public final List<IServiceRegistry> a() {
        final Class<?> a2;
        Class<?>[] interfaces;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "501ad2fc18d4ec36a0e2c15d03d9b2ff", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "501ad2fc18d4ec36a0e2c15d03d9b2ff");
        }
        Map<String, String> a3 = w.a(com.sankuai.xm.base.lifecycle.d.d().a(), "xm_sdk_service_registry", "xm_sdk_integration_");
        if (a3 == null || a3.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : a3.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && entry.getValue().startsWith("com.sankuai.xm")) {
                if (entry.getKey().startsWith("xm_sdk_service_registry")) {
                    com.sankuai.xm.log.c.b("IMToolsInstaller", "installServiceRegistry::class:%s", entry.getValue());
                    IServiceRegistry iServiceRegistry = (IServiceRegistry) x.a(IServiceRegistry.class, entry.getValue());
                    if (iServiceRegistry != null) {
                        arrayList.add(iServiceRegistry);
                    }
                } else if (entry.getKey().startsWith("xm_sdk_integration_") && (a2 = x.a(entry.getValue())) != null) {
                    for (Class<?> cls : a2.getInterfaces()) {
                        if (IIntegrable.class.isAssignableFrom(cls)) {
                            m.a(cls, new AbstractServiceRegistry.b<IIntegrable>() { // from class: com.sankuai.xm.base.service.AndroidServiceRegistryProvider.1
                                public static ChangeQuickRedirect c;

                                @Override // com.sankuai.xm.base.service.k
                                public final /* synthetic */ Object d() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = c;
                                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "140d2a23d669758f6ad4a4a3652b1fc3", 6917529027641081856L) ? (IIntegrable) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "140d2a23d669758f6ad4a4a3652b1fc3") : (IIntegrable) x.a(a2);
                                }
                            });
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.sankuai.xm.base.service.m.a
    public final List<IServiceRegistry> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2150f50b9b2f1fc8b2f543f77cee063d", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2150f50b9b2f1fc8b2f543f77cee063d") : Collections.singletonList(new CommonServiceRegistry());
    }
}
