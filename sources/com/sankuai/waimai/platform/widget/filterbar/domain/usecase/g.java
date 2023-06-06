package com.sankuai.waimai.platform.widget.filterbar.domain.usecase;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g<T> extends com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<a<T>, b<T>> {
    public static ChangeQuickRedirect d;

    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c
    public final /* synthetic */ void a(c.a aVar) {
        Object obj;
        a aVar2 = (a) aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3297a567da64477b80c44b0bdc05f2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3297a567da64477b80c44b0bdc05f2c");
            return;
        }
        List<WeakReference<T>> list = aVar2.b;
        LinkedList<WeakReference> linkedList = new LinkedList();
        if (list != null) {
            synchronized (list) {
                for (WeakReference<T> weakReference : list) {
                    if (weakReference != null && weakReference.get() != null) {
                        linkedList.add(weakReference);
                    }
                }
            }
            for (WeakReference weakReference2 : linkedList) {
                if (weakReference2 != null && (obj = weakReference2.get()) != null) {
                    this.c.a((c.InterfaceC1084c<P>) new b(obj));
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a<T> extends c.a {
        public static ChangeQuickRedirect a;
        List<WeakReference<T>> b;

        public a(List<WeakReference<T>> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90a04a0cd2dbb33fae180bf10fdd3655", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90a04a0cd2dbb33fae180bf10fdd3655");
            } else {
                this.b = list;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b<T> extends c.b {
        public static ChangeQuickRedirect a;
        public T b;

        public b(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "856b14563f0796d892e348c8f31b6111", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "856b14563f0796d892e348c8f31b6111");
            } else {
                this.b = t;
            }
        }
    }
}
