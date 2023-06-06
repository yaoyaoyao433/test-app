package com.meituan.mmp.lib.api.live.push;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.pusher.library.MTLivePusherView;
import com.sankuai.meituan.mtlive.pusher.library.d;
import com.sankuai.meituan.mtlive.pusher.library.e;
import com.sankuai.meituan.mtlive.pusher.library.f;
import com.sankuai.meituan.mtlive.pusher.library.h;
import com.sankuai.meituan.mtlive.pusher.library.i;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends e {
    public static ChangeQuickRedirect a;
    public WeakReference<i.c> b;
    public boolean c;
    public WeakReference<com.sankuai.meituan.mtlive.pusher.library.c> d;
    protected boolean e;
    private HashMap<String, String> g;
    private HashMap<String, String> h;
    private d i;
    private boolean j;
    private boolean k;
    private int l;

    public b(Context context, int i) {
        super(h.a(context, i));
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38463f4a190ca1723cf5956ed3c775a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38463f4a190ca1723cf5956ed3c775a2");
            return;
        }
        this.e = false;
        this.l = i;
        this.k = false;
        this.j = false;
        this.c = false;
        this.d = null;
        this.b = null;
        this.i = new d(i);
        this.g = new HashMap<>();
        this.h = new HashMap<>();
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final void a(com.sankuai.meituan.mtlive.pusher.library.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2446f01ed55737a293336673fb088278", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2446f01ed55737a293336673fb088278");
            return;
        }
        super.a(cVar);
        this.d = new WeakReference<>(cVar);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final void a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f73b152f07221ca114d55c2d4ff7acf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f73b152f07221ca114d55c2d4ff7acf");
            return;
        }
        super.a(fVar);
        d dVar = this.i;
        Object[] objArr2 = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "bea5bd67ae2d03d193e6f369478850e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "bea5bd67ae2d03d193e6f369478850e8");
            return;
        }
        dVar.a(fVar.I);
        dVar.h(fVar.C);
        dVar.a(fVar.G);
        dVar.b(fVar.H);
        dVar.i(fVar.k);
        dVar.h(fVar.j);
        dVar.g(fVar.i);
        dVar.e(fVar.g);
        dVar.d(fVar.h);
        dVar.f(fVar.y);
        dVar.d(fVar.z);
        dVar.m(fVar.F);
        dVar.j(fVar.e);
        dVar.k(fVar.f);
        dVar.e(fVar.N);
        dVar.g(fVar.P);
        dVar.f(fVar.O);
        dVar.l(fVar.U);
        dVar.c(fVar.M);
        dVar.a(fVar.I);
        dVar.b(fVar.V);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71af168db02a90156130110bc906dc5e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71af168db02a90156130110bc906dc5e")).booleanValue() : super.a(i, i2, i3, i4);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final void a(MTLivePusherView mTLivePusherView) {
        Object[] objArr = {mTLivePusherView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d8bda8ada32bae5b3f43c69d3d1c096", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d8bda8ada32bae5b3f43c69d3d1c096");
            return;
        }
        super.a(mTLivePusherView);
        this.k = true;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1d17b1f7fe0502226a97a012282552d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1d17b1f7fe0502226a97a012282552d");
            return;
        }
        super.a(true);
        this.k = false;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "183ef1e977d931de19e54acf1292a365", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "183ef1e977d931de19e54acf1292a365");
        } else {
            this.j = true;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "127e543574bad75f0f9f4c467c0ebc0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "127e543574bad75f0f9f4c467c0ebc0d");
        } else {
            this.j = false;
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25113d03cf9b855f13cb91f32727034a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25113d03cf9b855f13cb91f32727034a");
            return;
        }
        this.i.h(!this.i.C);
        super.c();
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b53a7f3a81d5c1b11314ba58909f8a37", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b53a7f3a81d5c1b11314ba58909f8a37")).booleanValue();
        }
        super.b(z);
        return true;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1e0bbdbe6c43bb8cf365ebf81aaa3e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1e0bbdbe6c43bb8cf365ebf81aaa3e3");
        } else {
            super.c(z);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01e347d351b330ae0b66e4291b0b9d3e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01e347d351b330ae0b66e4291b0b9d3e")).booleanValue() : super.d(z);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37ec625033fbf1804e47565bfc95610e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37ec625033fbf1804e47565bfc95610e")).intValue() : super.d();
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9bad0e7486e9d585f553495a9573888", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9bad0e7486e9d585f553495a9573888")).booleanValue();
        }
        super.a(i);
        return true;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68ef755c6cb9d7240a3fe4ebd1443a12", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68ef755c6cb9d7240a3fe4ebd1443a12")).booleanValue() : super.e();
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88699674c561de8e405b6141247310aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88699674c561de8e405b6141247310aa")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int a2 = super.a(str);
        this.e = true;
        return a2;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9933394fc7c116185ceb1ac34871e01b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9933394fc7c116185ceb1ac34871e01b");
            return;
        }
        super.f();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12a6c72851259a9c27b79287d0cbf829", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12a6c72851259a9c27b79287d0cbf829");
        } else {
            this.k = false;
            this.j = false;
            this.c = false;
            o();
            p();
        }
        this.e = false;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a676c92c15263b4d68e5339d7adc034c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a676c92c15263b4d68e5339d7adc034c");
            return;
        }
        super.g();
        this.e = false;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1cb432683ae56659be14132827235e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1cb432683ae56659be14132827235e2");
            return;
        }
        super.h();
        this.e = true;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final void a(i.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed8db09cc7da4ca353da6ded62d1c8e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed8db09cc7da4ca353da6ded62d1c8e1");
        } else {
            super.a(bVar);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final void a(i.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b38a865ed54f0c67481c5aedf27cd9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b38a865ed54f0c67481c5aedf27cd9c");
            return;
        }
        super.a(cVar);
        this.b = new WeakReference<>(cVar);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df74699a2a77ecfdb5672ddd2bef886c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df74699a2a77ecfdb5672ddd2bef886c")).booleanValue() : super.b(str);
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4831c4c92d10052c56acfb4d49cc0e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4831c4c92d10052c56acfb4d49cc0e2")).booleanValue();
        }
        super.i();
        return true;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6787d8812919378952c173ecddabfe46", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6787d8812919378952c173ecddabfe46")).booleanValue();
        }
        super.j();
        return true;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a585ab9a4808e0b3d4a331caaf1973c4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a585ab9a4808e0b3d4a331caaf1973c4")).booleanValue();
        }
        super.k();
        return true;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6aacb086c378cb66cb9f00dc6adf4f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6aacb086c378cb66cb9f00dc6adf4f9")).booleanValue();
        }
        super.a(f);
        return true;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f56ffd3ef8e83a010c4677d2535111e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f56ffd3ef8e83a010c4677d2535111e")).booleanValue();
        }
        super.b(f);
        return true;
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3209411a9ea403db5f48c4cbaed336a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3209411a9ea403db5f48c4cbaed336a1");
        } else {
            super.b(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.pusher.library.e, com.sankuai.meituan.mtlive.pusher.library.b
    public final boolean a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "805cbe6e5358ba7632d2c560a04e63cf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "805cbe6e5358ba7632d2c560a04e63cf")).booleanValue() : super.a(bArr);
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2e8d8daa23ad576bcfa314bd1f20e94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2e8d8daa23ad576bcfa314bd1f20e94");
            return;
        }
        synchronized (this) {
            this.g.clear();
        }
    }

    private void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "724cb40dc34fc8b0809e872fef8bb51a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "724cb40dc34fc8b0809e872fef8bb51a");
            return;
        }
        synchronized (this) {
            this.h.clear();
        }
    }
}
