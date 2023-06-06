package com.sankuai.waimai.imbase.listener.model;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public boolean b;
    public C0962a c;
    public b d;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c {
        void a();

        void b();
    }

    public a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbd44275055e6b51a86c2624ab2060c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbd44275055e6b51a86c2624ab2060c5");
        } else {
            this.b = z;
        }
    }

    public a(C0962a c0962a, b bVar) {
        Object[] objArr = {c0962a, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d1158528c22cae6baac6ad8ecc43e10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d1158528c22cae6baac6ad8ecc43e10");
            return;
        }
        this.b = true;
        this.c = c0962a;
        this.d = bVar;
    }

    public final void a(C0962a c0962a) {
        this.b = true;
        this.c = c0962a;
    }

    public final void a(b bVar) {
        this.b = true;
        this.d = bVar;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.imbase.listener.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0962a {
        public static ChangeQuickRedirect a;
        public String b;
        public int c;
        public String d;
        public String e;
        public long f;
        public Map<String, String> g;
        public c h;

        public C0962a(String str, String str2, String str3, int i, long j, Map<String, String> map, c cVar) {
            Object[] objArr = {str, str2, str3, Integer.valueOf(i), new Long(j), map, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "297bdb47f81b9b2cbe68d2314cf7297e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "297bdb47f81b9b2cbe68d2314cf7297e");
                return;
            }
            this.b = str2;
            this.e = str;
            this.d = str3;
            this.c = i;
            this.f = j;
            this.g = map;
            this.h = cVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public Context b;
        public String c;
        public int d;
        public Map<String, Object> e;
        public Map<String, String> f;

        @Deprecated
        public b(Context context, String str, Map<String, String> map, int i) {
            Object[] objArr = {context, str, map, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1610e5d8f9cccd018b5ef7e305dcf272", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1610e5d8f9cccd018b5ef7e305dcf272");
                return;
            }
            this.b = context;
            this.c = str;
            this.f = map;
            this.d = i;
        }

        public b(Context context, String str, Map<String, String> map, Map<String, Object> map2) {
            Object[] objArr = {context, str, map, map2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50426feeea8fe729984fcc5889b713f8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50426feeea8fe729984fcc5889b713f8");
                return;
            }
            this.b = context;
            this.c = str;
            this.f = map;
            this.e = map2;
        }
    }
}
