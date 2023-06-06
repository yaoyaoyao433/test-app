package com.sankuai.waimai.alita.core.datadownload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public boolean b;
    public String c;
    public d d;

    public static a a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eec9234894057818303d4fc95a5c899f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eec9234894057818303d4fc95a5c899f") : new a(z);
    }

    public c() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public d b;
        private boolean c;
        private Map<String, String> d;

        private a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e30d9d4bc4fda48d416867c539b3a988", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e30d9d4bc4fda48d416867c539b3a988");
                return;
            }
            this.c = z;
            this.d = new HashMap();
        }

        public final a a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6bc6f3eadc4b6e18b97c73b474b52ff", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6bc6f3eadc4b6e18b97c73b474b52ff");
            }
            this.d.put(str, str2);
            return this;
        }

        public final c a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d3f9c80e915efe7613e769d215827c6", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d3f9c80e915efe7613e769d215827c6");
            }
            c cVar = new c();
            cVar.b = this.c;
            cVar.d = this.b;
            cVar.c = "";
            if (!this.d.isEmpty()) {
                try {
                    cVar.c = new JSONObject(this.d).toString();
                } catch (Exception unused) {
                }
            }
            return cVar;
        }
    }
}
