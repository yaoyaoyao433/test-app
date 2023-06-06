package com.sankuai.xm.group.db;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.db.BaseDBProxy;
import com.sankuai.xm.base.db.i;
import com.sankuai.xm.base.db.j;
import com.sankuai.xm.base.db.l;
import com.sankuai.xm.base.g;
import com.sankuai.xm.base.k;
import com.sankuai.xm.base.service.m;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class PersonalDBProxy extends BaseDBProxy {
    public static ChangeQuickRedirect j;
    public com.sankuai.xm.group.db.a k;
    private d l;
    private e m;
    private c n;
    private volatile long o;
    private g p;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static class a {
        public static final PersonalDBProxy a = (PersonalDBProxy) m.a(PersonalDBProxy.class);
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final String c() {
        return "0_imkit_personal_db.db";
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final void d(com.sankuai.xm.base.db.c cVar) {
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final void e(com.sankuai.xm.base.db.c cVar) {
    }

    public PersonalDBProxy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c096a7df55bd4640cdf4df3630c02a2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c096a7df55bd4640cdf4df3630c02a2c");
        } else {
            this.p = new k();
        }
    }

    public static PersonalDBProxy l() {
        return a.a;
    }

    @Override // com.sankuai.xm.base.service.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82a63f7edcbf36cc1e2aaef9a8b5643c", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82a63f7edcbf36cc1e2aaef9a8b5643c")).intValue();
        }
        this.o = com.sankuai.xm.base.f.m().b();
        com.sankuai.xm.base.db.a aVar = new com.sankuai.xm.base.db.a(6, new f());
        aVar.g = this;
        aVar.d = 15;
        Context g = com.sankuai.xm.base.f.m().g();
        a(g, aVar, this.o + "_imkit_personal_db.db", this.o > 0);
        return super.a();
    }

    @Override // com.sankuai.xm.base.service.a
    public final void a(final long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "337f81921e26a31f42922397c9925e98", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "337f81921e26a31f42922397c9925e98");
            return;
        }
        com.sankuai.xm.im.utils.a.b("PersonalDBProxy bindUser = " + j2, new Object[0]);
        super.a(j2);
        if (!this.p.b(-1)) {
            com.sankuai.xm.im.utils.a.c("PersonalDBProxy db is not accessible for visitor.", new Object[0]);
            j2 = 0;
        }
        if (this.o != j2) {
            Object[] objArr2 = {new Long(j2), (byte) 0, null};
            ChangeQuickRedirect changeQuickRedirect2 = j;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "afd9010aeecdec7508f56b7c724cb0f7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "afd9010aeecdec7508f56b7c724cb0f7");
                return;
            }
            BaseDBProxy.a aVar = new BaseDBProxy.a() { // from class: com.sankuai.xm.group.db.PersonalDBProxy.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a5c21c8daa9d2aa6896d5a9b89c4fc7b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a5c21c8daa9d2aa6896d5a9b89c4fc7b");
                        return;
                    }
                    PersonalDBProxy.this.o = j2;
                    PersonalDBProxy.this.a(PersonalDBProxy.this.b(j2), r4);
                }
            };
            aVar.i = false;
            aVar.l = null;
            a((j) aVar);
        }
    }

    public final d m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e94ee9197f0306fdf5efc15c3163330", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e94ee9197f0306fdf5efc15c3163330");
        }
        if (this.l == null) {
            this.l = new d(this);
        }
        return this.l;
    }

    public final e n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6801d6c4199996a56b4186cb15c33d4b", 6917529027641081856L)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6801d6c4199996a56b4186cb15c33d4b");
        }
        if (this.m == null) {
            this.m = new e(this);
        }
        return this.m;
    }

    public final c o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a46dd76148e4b13c598936421d91245a", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a46dd76148e4b13c598936421d91245a");
        }
        if (this.n == null) {
            this.n = new c(this);
        }
        return this.n;
    }

    public final String b(long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f1dd1d525434b9674426f8af469a21d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f1dd1d525434b9674426f8af469a21d");
        }
        if (j2 <= 0) {
            return "0_imkit_personal_db.db";
        }
        return j2 + "_imkit_personal_db.db";
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59ebefcf7f666a9085b7dbef31dc3d7b", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59ebefcf7f666a9085b7dbef31dc3d7b") : b(this.o);
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d71c0e72125351d879fcea660c7a4dc", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d71c0e72125351d879fcea660c7a4dc");
        }
        if (com.sankuai.xm.base.db.g.a().f()) {
            if (TextUtils.equals(b(0L), str)) {
                return l.b(this.c, "0");
            }
            return l.b(this.c, String.valueOf(this.o));
        }
        return "";
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb6d37f1a86fd21b325e06837d67c894", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb6d37f1a86fd21b325e06837d67c894");
        } else {
            this.k = new com.sankuai.xm.group.db.a(this);
        }
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "793c7c178b1327ba2cca3a2af24962e5", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "793c7c178b1327ba2cca3a2af24962e5")).booleanValue();
        }
        if (com.sankuai.xm.login.a.a().e() > 0 || !super.e()) {
            return super.e() && !TextUtils.equals("0_imkit_personal_db.db", d()) && d().contains(Long.toString(com.sankuai.xm.login.a.a().e()));
        }
        return true;
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0ae4a82b071df04ad3e962898f111a3", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0ae4a82b071df04ad3e962898f111a3")).intValue() : (str == null || !str.contains("imkit_personal_db.db")) ? -1 : 6;
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final i i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cae58f62ec3aac0a8aa52ad6e0633ed", 6917529027641081856L) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cae58f62ec3aac0a8aa52ad6e0633ed") : new f();
    }
}
