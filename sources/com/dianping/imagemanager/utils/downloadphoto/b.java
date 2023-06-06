package com.dianping.imagemanager.utils.downloadphoto;

import com.dianping.imagemanager.utils.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends com.dianping.imagemanager.utils.downloadphoto.a {
    public static ChangeQuickRedirect q;
    public int r;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public final b b;

        public a(String str) {
            this(new j(str));
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0858053f61647f6ac66bc8026806f81", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0858053f61647f6ac66bc8026806f81");
            }
        }

        public a(j jVar) {
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef83d190ee52a6f20a24ab85e2087ccd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef83d190ee52a6f20a24ab85e2087ccd");
                return;
            }
            this.b = new b(jVar);
            this.b.p = -433;
            this.b.o = true;
        }

        public final a a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c0869d548378faa0228a5309e8e83a6", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c0869d548378faa0228a5309e8e83a6");
            }
            this.b.b(i);
            return this;
        }

        public final a b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "506501d2ebf0e79b66b56dbcf94975d6", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "506501d2ebf0e79b66b56dbcf94975d6");
            }
            this.b.r = i;
            return this;
        }

        public final a c(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7a927cefcebf062cb512c5cc1dc09f7", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7a927cefcebf062cb512c5cc1dc09f7");
            }
            this.b.a(i);
            return this;
        }

        public final a d(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cfa1deffde6f4fda7dff550e66dc239", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cfa1deffde6f4fda7dff550e66dc239");
            }
            this.b.c(i);
            return this;
        }

        public final a a(com.dianping.imagemanager.utils.h hVar) {
            Object[] objArr = {hVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89d14fc9040d194457fd01f65bbf088c", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89d14fc9040d194457fd01f65bbf088c");
            }
            this.b.a(hVar);
            return this;
        }

        public final a e(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d2195ba9e5d4e02d2a745c0741f7633", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d2195ba9e5d4e02d2a745c0741f7633");
            }
            this.b.p = i;
            return this;
        }
    }

    private b(j jVar) {
        super(jVar);
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25e79427ca6348b3612aeb0b8aa11f4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25e79427ca6348b3612aeb0b8aa11f4e");
        }
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.a
    public final void k() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9710ae41246499a469c55dc33223698b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9710ae41246499a469c55dc33223698b");
            return;
        }
        if (this.c == null) {
            str = g();
        } else {
            str = g() + CommonConstant.Symbol.UNDERLINE + this.c.a();
        }
        this.h = str;
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.a
    public final void l() {
        this.i = null;
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.a
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "106c0191a075a138379921d1a420897b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "106c0191a075a138379921d1a420897b");
            return;
        }
        this.g = g() + CommonConstant.Symbol.UNDERLINE + this.j + CommonConstant.Symbol.UNDERLINE + q();
    }
}
