package com.sankuai.eh.component.web.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.b;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public long b;
    String c;
    private long d;

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6843c97e88e3d4d7027d694222c733e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6843c97e88e3d4d7027d694222c733e4");
        } else {
            this.d = j;
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2e26be6666d9d2a902e4b3a3d6a1dd4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2e26be6666d9d2a902e4b3a3d6a1dd4") : new b.a().a("pattern", this.c).a("duration", this.d).b.toString();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.eh.component.web.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0554a {
        public static ChangeQuickRedirect a;
        public a b;

        public C0554a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "949a9e406e6dc8a3fa3d02114cf2d0c6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "949a9e406e6dc8a3fa3d02114cf2d0c6");
            } else {
                this.b = new a();
            }
        }

        public final C0554a a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1d3a48402557e9cf640805ad28a7420", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0554a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1d3a48402557e9cf640805ad28a7420");
            }
            this.b.b = j;
            return this;
        }

        public final C0554a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "596b11eaf6494adab9a89a3bb64ce2b6", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0554a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "596b11eaf6494adab9a89a3bb64ce2b6");
            }
            this.b.c = str;
            return this;
        }
    }
}
