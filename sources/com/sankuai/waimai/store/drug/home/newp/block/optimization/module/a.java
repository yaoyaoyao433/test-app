package com.sankuai.waimai.store.drug.home.newp.block.optimization.module;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a<T> {
    public static ChangeQuickRedirect a;
    public final Map<String, InterfaceC1154a<T>> b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.home.newp.block.optimization.module.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1154a<T> {
        void a(T t);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e301dca686a4b3a84c7ab981703c60a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e301dca686a4b3a84c7ab981703c60a2");
        } else {
            this.b = new HashMap();
        }
    }
}
