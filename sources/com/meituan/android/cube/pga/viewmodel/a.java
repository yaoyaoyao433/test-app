package com.meituan.android.cube.pga.viewmodel;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import com.meituan.android.cube.pga.action.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a<DataType> {
    public static ChangeQuickRedirect a;
    public boolean b;
    @Nullable
    protected DataType c;
    @Nullable
    protected Context d;
    protected com.meituan.android.cube.pga.type.a e;
    public c<Object, DataType> f;
    public Map<String, Object> g;
    public int h;
    protected String i;
    protected Map<String, String> j;
    protected String k;
    protected com.meituan.android.cube.pga.common.c l;
    protected String m;
    protected String n;

    public void a() {
    }

    public void b() {
    }

    public void d() {
    }

    @Nullable
    public String m() {
        return null;
    }

    public a() {
        this(null, null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57ca41dc1d5b33a5a9c3b11d8864c89e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57ca41dc1d5b33a5a9c3b11d8864c89e");
        }
    }

    public a(DataType datatype) {
        this(datatype, null);
        Object[] objArr = {datatype};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "447d9247291fd3541110eb742bd8a294", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "447d9247291fd3541110eb742bd8a294");
        }
    }

    public a(Context context) {
        this(null, context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d463302771bb54237f4b87333408f1dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d463302771bb54237f4b87333408f1dd");
        }
    }

    public a(DataType datatype, Context context) {
        Object[] objArr = {datatype, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9bb3004fa2b41a6d4e954354c39d623", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9bb3004fa2b41a6d4e954354c39d623");
            return;
        }
        this.g = new HashMap();
        this.h = -1;
        this.m = "";
        this.n = "";
        this.d = context;
        if (datatype != null) {
            a((a<DataType>) datatype);
        }
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2290c47320aaaae2e79771b896673b5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2290c47320aaaae2e79771b896673b5a");
            return;
        }
        this.d = context;
        a();
    }

    public final void a(com.meituan.android.cube.pga.type.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc2ed0a84f6cff978f4ce8be95fe718f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc2ed0a84f6cff978f4ce8be95fe718f");
            return;
        }
        this.e = aVar;
        b();
    }

    public Boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89c11fa7e285f1d13e49b00c50dcd7cb", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89c11fa7e285f1d13e49b00c50dcd7cb") : Boolean.TRUE;
    }

    @CallSuper
    public void a(DataType datatype) {
        Object[] objArr = {datatype};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28f7e4a86f84f1609fef3184f4497826", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28f7e4a86f84f1609fef3184f4497826");
            return;
        }
        this.c = datatype;
        d();
    }

    public DataType e() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, DataType] */
    public <T> T f() {
        return this.c;
    }

    public final void b_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e19abc2104ef21e9d2e4e0b495cf110", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e19abc2104ef21e9d2e4e0b495cf110");
        } else if (this.h == i) {
        } else {
            this.h = i;
        }
    }

    public final void a(String str) {
        this.i = str;
    }

    public final String g() {
        if (this.i == null) {
            this.i = "";
        }
        return this.i;
    }

    public final void a(Map<String, String> map) {
        this.j = map;
    }

    public final Map<String, String> h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c77dd41000cfc87044065e7ae30a35ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c77dd41000cfc87044065e7ae30a35ff");
        }
        if (this.j == null) {
            this.j = new HashMap();
        }
        return this.j;
    }

    public final String i() {
        return this.k == null ? "" : this.k;
    }

    public final void b(String str) {
        this.k = str;
    }

    @Nullable
    public final com.meituan.android.cube.pga.common.c j() {
        return this.l;
    }

    public final void a(com.meituan.android.cube.pga.common.c cVar) {
        this.l = cVar;
    }

    @Nullable
    public final String k() {
        return this.m;
    }

    public final void c(String str) {
        this.m = str;
    }

    @Nullable
    public final String l() {
        return this.n;
    }

    public final void d(String str) {
        this.n = str;
    }
}
