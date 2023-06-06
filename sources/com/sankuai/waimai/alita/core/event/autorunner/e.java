package com.sankuai.waimai.alita.core.event.autorunner;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.utils.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public List<c> b;
    public List<c> c;
    public C0702e d;
    public List<c> e;
    public b f;
    public List<c> g;
    public b h;
    public a i;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public long c;
        public int d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface d<T> {
        @Nullable
        T a(@Nullable JSONObject jSONObject);
    }

    @Nullable
    public static <T> List<T> a(@Nullable JSONArray jSONArray, @Nullable d<T> dVar) {
        Object[] objArr = {jSONArray, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        ArrayList arrayList = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "489cba51cfb31e39be07470377725498", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "489cba51cfb31e39be07470377725498");
        }
        if (jSONArray != null) {
            arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                T a2 = dVar.a(jSONArray.optJSONObject(i));
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public int b;

        @Nullable
        public static b a(@Nullable JSONObject jSONObject) {
            int i;
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            b bVar = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1e7eb980725841b901fa890e8a881ae", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1e7eb980725841b901fa890e8a881ae");
            }
            if (jSONObject != null) {
                bVar = new b();
                int optInt = jSONObject.optInt("times", -1);
                if (optInt < 0) {
                    try {
                        i = Integer.parseInt(jSONObject.optString("times"));
                    } catch (Exception unused) {
                        i = 0;
                    }
                } else {
                    i = optInt;
                }
                bVar.b = i;
            }
            return bVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public long g;
        public int h;
        public String i;
        public long j;
        public long k;
        public long l;
        public long m;
        public long n;
        public String o;
        public long p;
        public long q;

        public c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96792f546f1d697230746ba2c7029a33", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96792f546f1d697230746ba2c7029a33");
            } else {
                this.q = 0L;
            }
        }

        public final boolean a(com.sankuai.waimai.alita.core.event.a aVar) {
            boolean z;
            boolean z2 = true;
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bd3b6134b41ca3ebf248ef3033b8ab4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bd3b6134b41ca3ebf248ef3033b8ab4")).booleanValue();
            }
            if (TextUtils.isEmpty(this.e)) {
                z = true;
            } else {
                List<String> a2 = i.a(aVar.d());
                List<String> a3 = i.a(this.e);
                if (a2 == null || a3 == null) {
                    z = false;
                } else {
                    z = false;
                    for (String str : a2) {
                        if (!TextUtils.isEmpty(str)) {
                            Iterator<String> it = a3.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (str.equals(it.next())) {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (z) {
                                break;
                            }
                        }
                    }
                }
            }
            boolean z3 = z && (TextUtils.isEmpty(this.b) || this.b.equals(aVar.a())) && ((TextUtils.isEmpty(this.c) || this.c.equals(aVar.c())) && ((TextUtils.isEmpty(this.d) || this.d.equals(aVar.i())) && ((TextUtils.isEmpty(this.f) || this.f.equals(aVar.h())) && ((TextUtils.isEmpty(this.i) || this.i.equals(aVar.b())) && ((this.h <= 0 || aVar.g() == this.h) && ((this.k <= 0 || aVar.j() > this.k) && ((this.l <= 0 || aVar.j() < this.l) && ((this.m <= 0 || aVar.k() > this.m) && (this.n <= 0 || aVar.k() < this.n)))))))));
            z2 = (!z3 || (z3 && (this.p > 0L ? 1 : (this.p == 0L ? 0 : -1)) > 0 && (aVar.f() > this.q ? 1 : (aVar.f() == this.q ? 0 : -1)) > 0 && (aVar.f() > (this.q + this.p) ? 1 : (aVar.f() == (this.q + this.p) ? 0 : -1)) < 0)) ? false : false;
            if (z2) {
                this.q = aVar.f();
            }
            return z2;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.core.event.autorunner.e$e  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0702e {
        public static ChangeQuickRedirect a;
        public long b;

        @Nullable
        public static C0702e a(@Nullable JSONObject jSONObject) {
            int i;
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            C0702e c0702e = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c64b61b4f26dcf0cfc3d112bff5c7ef", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0702e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c64b61b4f26dcf0cfc3d112bff5c7ef");
            }
            if (jSONObject != null) {
                c0702e = new C0702e();
                int optInt = jSONObject.optInt("time", -1);
                if (optInt < 0) {
                    try {
                        i = Integer.parseInt(jSONObject.optString("time"));
                    } catch (Exception unused) {
                        i = 0;
                    }
                } else {
                    i = optInt;
                }
                c0702e.b = i;
            }
            return c0702e;
        }

        public final boolean a() {
            return this.b > 0;
        }
    }
}
