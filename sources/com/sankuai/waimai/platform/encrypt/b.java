package com.sankuai.waimai.platform.encrypt;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c034c10f96f530186198e5c5f29c7c27", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c034c10f96f530186198e5c5f29c7c27") : new a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public HashMap<String, Object> b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62a493dc9b9a8019dd695e953b7e8c26", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62a493dc9b9a8019dd695e953b7e8c26");
            } else {
                this.b = new HashMap<>();
            }
        }

        public final a a(String str, long j) {
            Object[] objArr = {str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aa11d530f5d74accb4f68b8524e004a", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aa11d530f5d74accb4f68b8524e004a");
            }
            this.b.put(str, Long.valueOf(j));
            return this;
        }

        public final a a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "958719c3355aa85057032b46e02efe52", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "958719c3355aa85057032b46e02efe52");
            }
            this.b.put(str, str2);
            return this;
        }

        public final HashMap a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d53817f6dfec90bedce09728fe61b2a", RobustBitConfig.DEFAULT_VALUE)) {
                return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d53817f6dfec90bedce09728fe61b2a");
            }
            HashMap hashMap = new HashMap();
            hashMap.put(c.b, k.a().toJson(this.b));
            return hashMap;
        }
    }
}
