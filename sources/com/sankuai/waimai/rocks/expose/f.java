package com.sankuai.waimai.rocks.expose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public b a;
    public boolean b;
    public boolean c;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum b {
        EXPOSE,
        RESET_CACHE,
        REFRESH,
        SWITCH_TAB,
        ON_RESUME;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8b3063d88641428805bc1e4f8184863", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8b3063d88641428805bc1e4f8184863");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b798d533f36f67a6aa83c6d58d216d95", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b798d533f36f67a6aa83c6d58d216d95") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31f29a1d1d076086e30c4aeaa2d17483", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31f29a1d1d076086e30c4aeaa2d17483") : (b[]) values().clone();
        }
    }

    public f(a aVar) {
        this.a = aVar.b;
        this.c = aVar.d;
        this.b = aVar.c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public b b;
        public boolean c;
        public boolean d;

        public a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c668de7503b0ae8ad4b90fdacaf0eb82", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c668de7503b0ae8ad4b90fdacaf0eb82");
            } else {
                this.b = bVar;
            }
        }

        public final f a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ee3ba8edc7851fe96ee565a084a8fee", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ee3ba8edc7851fe96ee565a084a8fee") : new f(this);
        }
    }
}
