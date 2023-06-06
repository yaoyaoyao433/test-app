package com.sankuai.waimai.landing.state;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T> {
    public static ChangeQuickRedirect a;
    protected b b;
    protected T c;

    public abstract void b();

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ced865d713778d0c77ac73826c96ed8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ced865d713778d0c77ac73826c96ed8d");
            return;
        }
        this.b = b.IDLE;
        a();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca6bde8ce56433b71ac9792dd4e8b05b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca6bde8ce56433b71ac9792dd4e8b05b");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("AbsLandingStateMachine", "reset state", new Object[0]);
        a(b.IDLE, null);
    }

    public void a(b bVar, T t) {
        Object[] objArr = {bVar, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "142f005d22f17d3552f1bcff4ea4d918", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "142f005d22f17d3552f1bcff4ea4d918");
        } else if (bVar == null) {
        } else {
            this.b = bVar;
            this.c = t;
        }
    }

    public EnumC0985a b(b bVar, T t) {
        Object[] objArr = {bVar, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aca165cc0af7fa69c91ff1dabf5fa594", RobustBitConfig.DEFAULT_VALUE)) {
            return (EnumC0985a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aca165cc0af7fa69c91ff1dabf5fa594");
        }
        if (((bVar.k - 1) ^ this.b.k) == 0) {
            return EnumC0985a.OK;
        }
        return EnumC0985a.RESET;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.landing.state.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public enum EnumC0985a {
        OK,
        ABANDON,
        RESET;
        
        public static ChangeQuickRedirect a;

        EnumC0985a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5887fd45396b236c74358aed9038ba45", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5887fd45396b236c74358aed9038ba45");
            }
        }

        public static EnumC0985a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d51bfaf22759f9ab2689c89938cc2f6", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0985a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d51bfaf22759f9ab2689c89938cc2f6") : (EnumC0985a) Enum.valueOf(EnumC0985a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0985a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7aa01e0c4226c9429b196272822637c5", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0985a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7aa01e0c4226c9429b196272822637c5") : (EnumC0985a[]) values().clone();
        }
    }
}
