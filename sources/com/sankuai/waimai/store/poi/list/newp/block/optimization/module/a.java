package com.sankuai.waimai.store.poi.list.newp.block.optimization.module;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a<T> {
    public static ChangeQuickRedirect a;
    private final Map<String, InterfaceC1276a<T>> b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.poi.list.newp.block.optimization.module.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1276a<T> {
        void a(T t);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef1be2ea69b9458b4630cf530db07ff9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef1be2ea69b9458b4630cf530db07ff9");
        } else {
            this.b = new HashMap();
        }
    }

    public final a a(String str, InterfaceC1276a interfaceC1276a) {
        Object[] objArr = {str, interfaceC1276a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb99270c199042c037a4a3bec9bd8456", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb99270c199042c037a4a3bec9bd8456");
        }
        this.b.put(str, interfaceC1276a);
        return this;
    }

    public final InterfaceC1276a a(String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09f4dcc0c9aab66fb25462aab96ab9dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (InterfaceC1276a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09f4dcc0c9aab66fb25462aab96ab9dc");
        }
        InterfaceC1276a<T> interfaceC1276a = this.b.get(str);
        if (interfaceC1276a != null) {
            interfaceC1276a.a(t);
        }
        return interfaceC1276a;
    }
}
