package com.sankuai.waimai.alita.core.event.facade;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends h {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        private String d;
        private String e;
        private long f;

        public static a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f9d1ceb5efc66fab2b0b1ade4eeaf7e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f9d1ceb5efc66fab2b0b1ade4eeaf7e") : new a(str);
        }

        private a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10f2f524b955b24ee3f4afb6543835ca", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10f2f524b955b24ee3f4afb6543835ca");
            } else {
                this.d = str;
            }
        }

        public final com.sankuai.waimai.alita.core.event.a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b71027eea986ba1a3691c855265506e", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.alita.core.event.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b71027eea986ba1a3691c855265506e");
            }
            com.sankuai.waimai.alita.core.event.a aVar = new com.sankuai.waimai.alita.core.event.a();
            aVar.b = "feature_update";
            if (this.d != null) {
                aVar.c = this.d;
            }
            if (this.b != null) {
                aVar.d = this.b;
            }
            if (this.c != null) {
                aVar.e = this.c;
            }
            if (this.e != null) {
                aVar.h = this.e;
            }
            if (this.f != 0) {
                aVar.a(this.f);
            }
            return aVar;
        }
    }
}
