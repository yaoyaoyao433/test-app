package com.sankuai.waimai.alita.core.event.facade;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends h {

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.core.event.facade.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0703a {
        public static ChangeQuickRedirect a;
        private String b;
        private String c;
        private long d;

        public static C0703a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4da2a4a5ef2129ffd07a9d96c7fd5a8", RobustBitConfig.DEFAULT_VALUE) ? (C0703a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4da2a4a5ef2129ffd07a9d96c7fd5a8") : new C0703a(str);
        }

        private C0703a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e490deba0a84526dd3eac7ef21d80ef5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e490deba0a84526dd3eac7ef21d80ef5");
            } else {
                this.b = str;
            }
        }

        public final com.sankuai.waimai.alita.core.event.a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a9d12af2dda0053c5c2d176763b74f4", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.alita.core.event.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a9d12af2dda0053c5c2d176763b74f4");
            }
            com.sankuai.waimai.alita.core.event.a aVar = new com.sankuai.waimai.alita.core.event.a();
            aVar.b = "alita_ar_init";
            if (this.b != null) {
                aVar.c = this.b;
            }
            if (this.c != null) {
                aVar.h = this.c;
            }
            if (this.d != 0) {
                aVar.a(this.d);
            }
            return aVar;
        }
    }
}
