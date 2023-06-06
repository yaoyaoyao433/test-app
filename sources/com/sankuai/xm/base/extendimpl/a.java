package com.sankuai.xm.base.extendimpl;

import android.content.Context;
import android.os.SystemClock;
import android.util.Base64;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.service.i;
import com.sankuai.xm.base.util.net.d;
import com.sankuai.xm.base.util.w;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements i {
    public static ChangeQuickRedirect a;
    private volatile boolean b;
    private Context c;

    @Override // com.sankuai.xm.base.service.i
    public final String e() {
        return "4.46.113";
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2fb2f7f0234d15952ca3d8d1954df61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2fb2f7f0234d15952ca3d8d1954df61");
            return;
        }
        this.b = false;
        this.c = f.m().g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.base.extendimpl.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1370a {
        private static a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9214c930e71c08cc49ecd9cebf916f36", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9214c930e71c08cc49ecd9cebf916f36") : C1370a.a;
    }

    @Override // com.sankuai.xm.base.service.i
    public final String a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d91c49bb17ab2b49cf1c51000e32ada", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d91c49bb17ab2b49cf1c51000e32ada") : w.a(this.c, "REAL_DEVICE_ID", z);
    }

    @Override // com.sankuai.xm.base.service.i
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b92d22f26441d584af027d90d2ab6cf", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b92d22f26441d584af027d90d2ab6cf") : w.a(this.c, f.m().c());
    }

    @Override // com.sankuai.xm.base.service.i
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00d73723b8a7c7218f928ea37d7b0f76", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00d73723b8a7c7218f928ea37d7b0f76") : w.a();
    }

    @Override // com.sankuai.xm.base.service.i
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0828ce8beeaaf3d6f7f797d8d30a83b6", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0828ce8beeaaf3d6f7f797d8d30a83b6") : this.c.getPackageName();
    }

    @Override // com.sankuai.xm.base.service.i
    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a25f3d6d29135fddcab3389dc364697", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a25f3d6d29135fddcab3389dc364697")).intValue() : com.sankuai.xm.base.util.a.a.intValue();
    }

    @Override // com.sankuai.xm.base.service.i
    public final String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7a5122938c79b1aa6bb29cfaf5dae2f", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7a5122938c79b1aa6bb29cfaf5dae2f") : w.b(this.c);
    }

    @Override // com.sankuai.xm.base.service.i
    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0165f38eeed67f31205634391ea21abd", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0165f38eeed67f31205634391ea21abd") : w.b();
    }

    @Override // com.sankuai.xm.base.service.i
    public final int i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e633cedfa96d7a4f00613add1045acbb", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e633cedfa96d7a4f00613add1045acbb")).intValue() : w.f(this.c);
    }

    @Override // com.sankuai.xm.base.service.i
    public final int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4045092b7be75dbe4fe9d06630877785", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4045092b7be75dbe4fe9d06630877785")).intValue() : d.a();
    }

    @Override // com.sankuai.xm.base.service.i
    public final boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "211edcacd2f19ad43c38d12ee8c2937b", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "211edcacd2f19ad43c38d12ee8c2937b")).booleanValue() : d.d(this.c);
    }

    @Override // com.sankuai.xm.base.service.i
    public final int l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "396f3ec67b7947bab5767fd57cd4fcf5", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "396f3ec67b7947bab5767fd57cd4fcf5")).intValue() : d.c(this.c);
    }

    @Override // com.sankuai.xm.base.service.i
    public final boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f688bbaa81020dafdaea56b1f7ca19b", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f688bbaa81020dafdaea56b1f7ca19b")).booleanValue() : d.b();
    }

    @Override // com.sankuai.xm.base.service.i
    public final boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c756d35f8f9e48beacaddbeb2e2561", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c756d35f8f9e48beacaddbeb2e2561")).booleanValue() : d.d();
    }

    @Override // com.sankuai.xm.base.service.i
    public final String b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d9b09c4d5c14efc526977b962c0e9a5", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d9b09c4d5c14efc526977b962c0e9a5") : d.a(this.c, z);
    }

    @Override // com.sankuai.xm.base.service.i
    public final String o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5d523616bed92fe1985bed3c287266c", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5d523616bed92fe1985bed3c287266c") : d.c();
    }

    @Override // com.sankuai.xm.base.service.i
    public final void a(i.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30b2c647cdb69b20c43504abe8efcbb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30b2c647cdb69b20c43504abe8efcbb2");
        } else {
            d.a(aVar);
        }
    }

    @Override // com.sankuai.xm.base.service.i
    public final String p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28297ba8dcf7b4aea7a846e97f77a9d3", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28297ba8dcf7b4aea7a846e97f77a9d3");
        }
        File a2 = q.a(com.sankuai.xm.base.lifecycle.d.d().a(), "xm", (String) null);
        a2.mkdirs();
        return a2.getAbsolutePath();
    }

    @Override // com.sankuai.xm.base.service.i
    public final String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3db5549e8cbf51a5bd25a29b80076d69", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3db5549e8cbf51a5bd25a29b80076d69") : Base64.encodeToString(bArr, 0);
    }

    @Override // com.sankuai.xm.base.service.i
    public final byte[] a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b30a201440358793db358c707fea5877", 6917529027641081856L) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b30a201440358793db358c707fea5877") : Base64.decode(str, 0);
    }

    @Override // com.sankuai.xm.base.service.i
    public final long q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6548e7981054e57dc18c893991ebbaba", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6548e7981054e57dc18c893991ebbaba")).longValue() : SystemClock.currentThreadTimeMillis();
    }
}
