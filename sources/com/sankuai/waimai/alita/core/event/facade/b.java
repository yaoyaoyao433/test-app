package com.sankuai.waimai.alita.core.event.facade;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends h {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public JSONObject b;
        private String c;
        private String d;
        private String e;
        private long f;

        public static a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "268763c9fe5aff05a2322151ea8b704f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "268763c9fe5aff05a2322151ea8b704f") : new a(str);
        }

        private a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a04e3e48b584c9344a2eac4440bad073", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a04e3e48b584c9344a2eac4440bad073");
            } else {
                this.c = str;
            }
        }

        public final com.sankuai.waimai.alita.core.event.a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc5362dad9589d4d7c60415aed66d63b", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.alita.core.event.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc5362dad9589d4d7c60415aed66d63b");
            }
            com.sankuai.waimai.alita.core.event.a aVar = new com.sankuai.waimai.alita.core.event.a();
            aVar.b = "feature_table_update";
            if (this.c != null) {
                aVar.c = this.c;
            }
            if (this.d != null) {
                aVar.d = this.d;
            }
            if (this.e != null) {
                aVar.h = this.e;
            }
            if (this.f != 0) {
                aVar.a(this.f);
            }
            if (this.b != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("key_alita_table_data", this.b);
                aVar.f = hashMap;
            }
            return aVar;
        }
    }
}
