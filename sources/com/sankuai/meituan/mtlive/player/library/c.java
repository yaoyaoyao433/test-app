package com.sankuai.meituan.mtlive.player.library;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.g;
import com.sankuai.meituan.mtlive.player.library.a;
import com.tencent.avroom.TXCAVRoomConstants;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements a {
    public static ChangeQuickRedirect a;
    private int b;
    private a c;
    private b d;

    public c(a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d7cc15713fcf64d1078b405e38baef1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d7cc15713fcf64d1078b405e38baef1");
            return;
        }
        this.c = aVar;
        this.b = i;
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19050af0916b3ace66fffb4acd52e9d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19050af0916b3ace66fffb4acd52e9d0");
        } else {
            this.c.a(dVar);
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ca791f64500213cec653fdd3e0ec9b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ca791f64500213cec653fdd3e0ec9b6");
            return;
        }
        this.d = bVar;
        this.c.a(bVar);
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(com.sankuai.meituan.mtlive.player.library.view.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fab3fc6a81fac84bec28a2ce4e14db0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fab3fc6a81fac84bec28a2ce4e14db0c");
        } else {
            this.c.a(aVar);
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9d5b73fd9e05a9ae0160ee3d91d6a76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9d5b73fd9e05a9ae0160ee3d91d6a76");
        } else {
            this.c.a(z);
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbcaa908dad3fe29cecab4b9fad0d4bc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbcaa908dad3fe29cecab4b9fad0d4bc")).intValue();
        }
        if (g.b == this.b && 5 == i) {
            return -3;
        }
        if (this.d != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("EVT_TIME", System.currentTimeMillis());
            bundle.putInt(TXCAVRoomConstants.EVT_ID, 2000);
            bundle.putString("EVT_MSG", "开始拉流");
            this.d.a(2000, bundle);
        }
        return this.c.a(str, i);
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final int b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "576c079c8c33e01e2a7e1bd4117ad7cf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "576c079c8c33e01e2a7e1bd4117ad7cf")).intValue() : this.c.b(z);
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a71e888db83c7dc0deb2de9b1416de", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a71e888db83c7dc0deb2de9b1416de")).intValue() : this.c.a();
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aa7292141e2707ca9a5715fea63d688", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aa7292141e2707ca9a5715fea63d688")).booleanValue() : this.c.b();
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "485cb5fde5e15db4d6ff43f17e6367e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "485cb5fde5e15db4d6ff43f17e6367e3");
        } else {
            this.c.c();
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4ac7094829ed2f0cd96d087eaa30a81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4ac7094829ed2f0cd96d087eaa30a81");
        } else {
            this.c.d();
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8154893a63d89ef2946a2b96588e695c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8154893a63d89ef2946a2b96588e695c");
        } else {
            this.c.a(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "409b1df64eaa89cce02eed459456d9c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "409b1df64eaa89cce02eed459456d9c5");
        } else {
            this.c.b(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final boolean c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e397143e548481a0fe2b97622d96bef", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e397143e548481a0fe2b97622d96bef")).booleanValue() : this.c.c(z);
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c798ed96129d4929c03fed08c14e1bfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c798ed96129d4929c03fed08c14e1bfd");
        } else {
            this.c.d(z);
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9d5b149c50de31c4fefe6818ef582d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9d5b149c50de31c4fefe6818ef582d6");
        } else {
            this.c.c(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61cadd96588951a5da49e10a9101620d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61cadd96588951a5da49e10a9101620d");
        } else {
            this.c.a(bVar);
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab8f43dd81caae8ca89923ce6ab6f63a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab8f43dd81caae8ca89923ce6ab6f63a");
        } else {
            this.c.d(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void a(a.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f739dbbc54a486ca99d4dd20d3f6e49c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f739dbbc54a486ca99d4dd20d3f6e49c");
        } else {
            this.c.a(cVar);
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31d968ada7a06146383d68997efe4ed6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31d968ada7a06146383d68997efe4ed6");
        } else {
            this.c.e(i);
        }
    }

    @Override // com.sankuai.meituan.mtlive.player.library.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86deb696a9306dcbd20c9be393070934", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86deb696a9306dcbd20c9be393070934");
            return;
        }
        this.c.e();
        this.c = null;
    }
}
