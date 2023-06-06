package com.sankuai.meituan.mtlive.pusher.library;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.pusher.library.i;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class e implements b {
    public static ChangeQuickRedirect f;
    private b a;

    public e(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cabaefe65a943162040c27dc88e6ed67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cabaefe65a943162040c27dc88e6ed67");
        } else {
            this.a = bVar;
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public void a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9a766282320e627afd3a894b01be7b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9a766282320e627afd3a894b01be7b9");
        } else if (this.a != null) {
            this.a.a((b) fVar);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97176ee5812bf014f73fc847c36630df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97176ee5812bf014f73fc847c36630df");
        } else if (this.a != null) {
            this.a.a(cVar);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public void a(MTLivePusherView mTLivePusherView) {
        Object[] objArr = {mTLivePusherView};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef726e14ff4c33b95f23d06c63fdfd1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef726e14ff4c33b95f23d06c63fdfd1c");
        } else if (this.a != null) {
            this.a.a(mTLivePusherView);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "885fffcb217ea1cd0f740ca980560d9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "885fffcb217ea1cd0f740ca980560d9e");
        } else if (this.a != null) {
            this.a.a(z);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec9b41f2fc816f86472c65da9aae8a3e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec9b41f2fc816f86472c65da9aae8a3e")).intValue();
        }
        if (this.a != null) {
            return this.a.a(str);
        }
        return -100;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef42263f4051c1bb24674613666e714c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef42263f4051c1bb24674613666e714c");
        } else if (this.a != null) {
            this.a.c(str);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0784070209110d4a4bd26b53900204f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0784070209110d4a4bd26b53900204f");
        } else if (this.a != null) {
            this.a.f();
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e2f8f6266c6860f6c3362b73791b182", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e2f8f6266c6860f6c3362b73791b182");
        } else if (this.a != null) {
            this.a.g();
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce86ca1ca8652819efd5a5181c05010e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce86ca1ca8652819efd5a5181c05010e");
        } else if (this.a != null) {
            this.a.h();
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d8d19c6798891018d96b975e3767f53", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d8d19c6798891018d96b975e3767f53")).booleanValue();
        }
        if (this.a != null) {
            return this.a.e();
        }
        return false;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void a(int i, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d51bd047dc8e2df01ff32f526e6474c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d51bd047dc8e2df01ff32f526e6474c8");
        } else if (this.a != null) {
            this.a.a(i, z, z2);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65e2fa2fce5490fcfa6ae8bd1a45e256", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65e2fa2fce5490fcfa6ae8bd1a45e256");
        } else if (this.a != null) {
            this.a.c();
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public boolean b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6669b68fd47ccca39f12144565c1aea0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6669b68fd47ccca39f12144565c1aea0")).booleanValue();
        }
        if (this.a != null) {
            return this.a.b(z);
        }
        return false;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20b7be1d3fbe22a350d142fb1754e9e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20b7be1d3fbe22a350d142fb1754e9e1");
        } else if (this.a != null) {
            this.a.c(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public boolean d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19f01101abef128c0145f72f959af985", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19f01101abef128c0145f72f959af985")).booleanValue();
        }
        if (this.a != null) {
            return this.a.d(z);
        }
        return false;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a6f9e40cea49fab6e030093f6583c5e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a6f9e40cea49fab6e030093f6583c5e")).intValue();
        }
        if (this.a != null) {
            return this.a.d();
        }
        return 0;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3280135b3aefa13841f66382d389bb8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3280135b3aefa13841f66382d389bb8")).booleanValue();
        }
        if (this.a != null) {
            return this.a.a(i);
        }
        return false;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final a l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69c4e394c36cd322c6bc3af1fbc3ae0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69c4e394c36cd322c6bc3af1fbc3ae0a");
        }
        if (this.a != null) {
            return this.a.l();
        }
        return null;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public boolean a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d8f160961796b7896a55134fca3e71a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d8f160961796b7896a55134fca3e71a")).booleanValue();
        }
        if (this.a != null) {
            return this.a.a(i, i2, i3, i4);
        }
        return false;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1cd279bd1de92fa3e65cc5cb448bb9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1cd279bd1de92fa3e65cc5cb448bb9d");
        } else if (this.a != null) {
            this.a.c(z);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public void a(i.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adf054a54ee92766c79fe74031f40798", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adf054a54ee92766c79fe74031f40798");
        } else if (this.a != null) {
            this.a.a(cVar);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "699f374c2caa627beb1a44198579bbda", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "699f374c2caa627beb1a44198579bbda")).booleanValue();
        }
        if (this.a != null) {
            return this.a.b(str);
        }
        return false;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8d7da1eacb2b01c61888cd8e2b668a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8d7da1eacb2b01c61888cd8e2b668a5")).booleanValue();
        }
        if (this.a != null) {
            return this.a.i();
        }
        return false;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56a26202d49afa84ee9dd2c790bea6a3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56a26202d49afa84ee9dd2c790bea6a3")).booleanValue();
        }
        if (this.a != null) {
            return this.a.j();
        }
        return false;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d8f18f2a6af195967ae0a4354454a71", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d8f18f2a6af195967ae0a4354454a71")).booleanValue();
        }
        if (this.a != null) {
            return this.a.k();
        }
        return false;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public boolean a(float f2) {
        Object[] objArr = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30fc62c3dfe18235128a254f71ccd909", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30fc62c3dfe18235128a254f71ccd909")).booleanValue();
        }
        if (this.a != null) {
            return this.a.a(f2);
        }
        return false;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public boolean b(float f2) {
        Object[] objArr = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f3ae53610f47d48f185fcca32dc1d9f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f3ae53610f47d48f185fcca32dc1d9f")).booleanValue();
        }
        if (this.a != null) {
            return this.a.b(f2);
        }
        return false;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac10e3ddad24a978a629062b0269ffb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac10e3ddad24a978a629062b0269ffb9");
        } else if (this.a != null) {
            this.a.b(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public void a(i.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5450657f9ffd353f41877eba1fa2738", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5450657f9ffd353f41877eba1fa2738");
        } else if (this.a != null) {
            this.a.a(bVar);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public boolean a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f39f54759af0d6fbc786c8ba9c64b9ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f39f54759af0d6fbc786c8ba9c64b9ef")).booleanValue();
        }
        if (this.a != null) {
            return this.a.a(bArr);
        }
        return false;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void a(i.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c426962c562bd494f4bf790f55bd3e4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c426962c562bd494f4bf790f55bd3e4c");
        } else if (this.a != null) {
            this.a.a(aVar);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dae31470e8d944049f59b52b147a3524", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dae31470e8d944049f59b52b147a3524");
        } else if (this.a != null) {
            this.a.d(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45d27b762ce0476963307193aed6a377", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45d27b762ce0476963307193aed6a377");
        } else if (this.a != null) {
            this.a.m();
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f4d4e1dfefe0326cf015382f6cc59ab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f4d4e1dfefe0326cf015382f6cc59ab")).booleanValue();
        }
        if (this.a != null) {
            return this.a.n();
        }
        return false;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.b
    public final void e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "760d2e5f25678a5d78b23f3ffdbaa704", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "760d2e5f25678a5d78b23f3ffdbaa704");
        } else if (this.a != null) {
            this.a.e(z);
        }
    }
}
