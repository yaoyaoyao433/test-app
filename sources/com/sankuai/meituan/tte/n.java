package com.sankuai.meituan.tte;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.tte.e;
import com.sankuai.meituan.tte.w;
import com.sankuai.meituan.tte.x;
import com.tencent.mapsdk.internal.ki;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class n {
    public static ChangeQuickRedirect a;
    private final x.b b;
    private final m c;
    private final v d;

    public n(x.b bVar, m mVar) {
        Object[] objArr = {bVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed411144031191be4e42b7e963dc01d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed411144031191be4e42b7e963dc01d0");
            return;
        }
        this.b = bVar;
        this.c = mVar;
        this.d = new v(ki.m, this.b.a());
    }

    public final byte[] a(byte[] bArr) throws c {
        byte[] array;
        boolean z = true;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea8cdb04beb40bb4dbf4a64666a45efe", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea8cdb04beb40bb4dbf4a64666a45efe");
        }
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        e.a a2 = e.a(x.a()).a(this.b.c);
        if (!a2.b && !a2.c) {
            z = false;
        }
        if (z) {
            throw new c("encryption disabled", -10001);
        }
        w.a a3 = w.a("tte.encrypt", "encrypt");
        try {
            try {
                x.c cVar = this.b.c.d;
                a3.a("algo", cVar.e);
                a3.a("code", "0");
                a3.a("inputLen", y.a(bArr.length));
                a3.a("inputLen1KB", y.b(bArr.length));
                a3.a("isMainThread", y.a() ? "1" : "0");
                a3.a("biz", this.b.d);
                l a4 = this.c.a();
                byte[] bArr2 = a4.d;
                byte[] bArr3 = a4.e;
                a3.a("keyType", a4.g ? "embedded" : a4.h ? "issued-expired" : "issued");
                byte[] a5 = this.b.c.d.a().a(bArr, bArr2);
                d dVar = new d();
                dVar.c = (byte) 5;
                dVar.d = cVar.d;
                dVar.e = bArr3;
                dVar.f = a5;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d.a;
                if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "e0aea84db429fb4966743e3bc804a8b6", RobustBitConfig.DEFAULT_VALUE)) {
                    array = (byte[]) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "e0aea84db429fb4966743e3bc804a8b6");
                } else {
                    ByteBuffer order = ByteBuffer.allocate(dVar.e.length + 9 + 4 + dVar.f.length).order(ByteOrder.BIG_ENDIAN);
                    order.put(dVar.c);
                    order.put(d.b);
                    order.put((byte) dVar.d);
                    order.putInt(dVar.e.length);
                    order.put(dVar.e);
                    order.putInt(dVar.f.length);
                    order.put(dVar.f);
                    array = order.array();
                }
                return array;
            } catch (c e) {
                this.d.b("enc error", e);
                StringBuilder sb = new StringBuilder();
                sb.append(e.b);
                a3.a("code", sb.toString());
                throw e;
            }
        } finally {
            a3.b();
        }
    }
}
