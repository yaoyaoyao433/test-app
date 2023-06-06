package com.dianping.imagemanager.utils.downloadphoto;

import com.dianping.imagemanager.utils.j;
import com.dianping.imagemanager.utils.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h extends com.dianping.imagemanager.utils.downloadphoto.a {
    public static ChangeQuickRedirect q;
    public String r;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public final h b;

        public a(String str) {
            this(new j(str));
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c1b522bc8a4cd0c0b0ba5b8d94d9dcd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c1b522bc8a4cd0c0b0ba5b8d94d9dcd");
            }
        }

        public a(j jVar) {
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e02556ffefb796369ae114a34f100cd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e02556ffefb796369ae114a34f100cd");
                return;
            }
            this.b = new h(jVar);
            this.b.a(1296000000L);
            this.b.p = -433;
        }

        public final a a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8352c85e3782d415a74f431b483c5b1", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8352c85e3782d415a74f431b483c5b1");
            }
            this.b.b(i);
            return this;
        }

        public final a b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b903298e883b61e29505d6db8baf317", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b903298e883b61e29505d6db8baf317");
            }
            this.b.a(i);
            return this;
        }

        public final a c(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ec0e741b4abb19bb6930ce6dea4bc62", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ec0e741b4abb19bb6930ce6dea4bc62");
            }
            this.b.c(i);
            return this;
        }

        @Deprecated
        public final a a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "921b5979334de7c7f6b9e0f9195a48c4", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "921b5979334de7c7f6b9e0f9195a48c4");
            }
            this.b.a(j);
            return this;
        }

        public final a d(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35a7815056b0c46ddcdf1e3e9c3e0123", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35a7815056b0c46ddcdf1e3e9c3e0123");
            }
            this.b.p = i;
            return this;
        }

        public final a a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "557f20284434890848ca17254f566e07", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "557f20284434890848ca17254f566e07");
            }
            this.b.a(z);
            return this;
        }

        public final a a(com.dianping.imagemanager.image.cache.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e593c7762a9ee494e56c8a0fec77418", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e593c7762a9ee494e56c8a0fec77418");
            }
            this.b.a(aVar);
            return this;
        }

        public final a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "706a57d23c0a3949be291fb2caf7cf09", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "706a57d23c0a3949be291fb2caf7cf09");
            }
            this.b.r = str;
            return this;
        }

        public final a a(com.dianping.imagemanager.utils.h hVar) {
            Object[] objArr = {hVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cf9262e5420559a8378f45bbf6e6989", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cf9262e5420559a8378f45bbf6e6989");
            }
            this.b.a(hVar);
            return this;
        }

        public final a b(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b548981be87d385889102a08338d7643", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b548981be87d385889102a08338d7643");
            }
            this.b.n = z;
            return this;
        }

        public final a c(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0958cfc13a000a5c623dfdfde873319", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0958cfc13a000a5c623dfdfde873319");
            }
            this.b.o = z;
            return this;
        }

        public final a d(boolean z) {
            this.b.l = z;
            return this;
        }
    }

    private h(j jVar) {
        super(jVar);
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42d7d84d296d1905e16063520e0df93e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42d7d84d296d1905e16063520e0df93e");
        }
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.a
    public final void k() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00c4bbdfd68426b44028c059b849274d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00c4bbdfd68426b44028c059b849274d");
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
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82dcd67a0520696abb5b085d6ca13aa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82dcd67a0520696abb5b085d6ca13aa8");
        } else {
            this.i = g() == null ? null : l.a(g());
        }
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.a
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ced98d1a91517f5a1a3bedbfd47fc515", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ced98d1a91517f5a1a3bedbfd47fc515");
            return;
        }
        this.g = g() + e();
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28c351170ea5e4901ae88b3710e4c70b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28c351170ea5e4901ae88b3710e4c70b");
        } else {
            this.d = j;
        }
    }

    public final boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ba7b783e0718f59a292bbbd0db819a8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ba7b783e0718f59a292bbbd0db819a8")).booleanValue() : d(4);
    }
}
