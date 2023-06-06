package com.meituan.android.edfu.mbar.camera.decode.impl;

import android.content.Context;
import android.graphics.Rect;
import android.os.Message;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g implements com.meituan.android.edfu.mbar.camera.decode.b {
    public static ChangeQuickRedirect a;
    private com.meituan.android.edfu.mbar.camera.decode.a b;
    private Context c;
    private boolean d;
    private e e;

    public g(Context context, com.meituan.android.edfu.mbar.camera.decode.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c9cd5a12e52e989e916ccc0e374abed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c9cd5a12e52e989e916ccc0e374abed");
            return;
        }
        this.d = false;
        this.c = context;
        this.b = aVar;
    }

    @Override // com.meituan.android.edfu.mbar.camera.decode.b
    public final boolean a() {
        return this.d;
    }

    @Override // com.meituan.android.edfu.mbar.camera.decode.b
    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c7a76583eb2f02457d7ba930b63eefc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c7a76583eb2f02457d7ba930b63eefc");
            return;
        }
        this.d = true;
        this.e = e.a(this.c);
        if (this.e != null) {
            e eVar = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "03cb7df3defa852232161fb44f6b8c07", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "03cb7df3defa852232161fb44f6b8c07");
                return;
            }
            e.e = false;
            eVar.f = 0.0f;
            com.meituan.android.edfu.mbar.camera.decode.f fVar = eVar.c;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.edfu.mbar.camera.decode.f.a;
            if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "61e98b44ba88743ba14db9227976e6d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "61e98b44ba88743ba14db9227976e6d8");
            } else {
                com.meituan.android.edfu.mbar.camera.decode.c cVar = fVar.c;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.edfu.mbar.camera.decode.c.a;
                if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "052987d47139008c3ba6ba20fe2b4e67", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "052987d47139008c3ba6ba20fe2b4e67");
                } else {
                    cVar.j = 0L;
                    cVar.i = 0L;
                }
            }
            eVar.g.d = false;
        }
    }

    @Override // com.meituan.android.edfu.mbar.camera.decode.b
    public final synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e4a7eced64262303fb62799b2a3cf19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e4a7eced64262303fb62799b2a3cf19");
            return;
        }
        if (this.e != null) {
            e eVar = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "46d523192070440bf7bea811104e5325", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "46d523192070440bf7bea811104e5325");
            } else {
                Message.obtain(eVar.d, 3, null).sendToTarget();
            }
        }
        this.d = false;
        this.e = null;
    }

    @Override // com.meituan.android.edfu.mbar.camera.decode.b
    public final synchronized void a(@NonNull byte[] bArr, int i, int i2, boolean z, Rect rect, com.meituan.android.edfu.edfucamera.argorithm.e eVar) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), rect, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24e8fa4675733b1e44cc72a5d0242ff0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24e8fa4675733b1e44cc72a5d0242ff0");
            return;
        }
        if (this.e != null) {
            e eVar2 = this.e;
            h hVar = new h(bArr, i, i2, z, rect, eVar, this.b);
            Object[] objArr2 = {hVar};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar2, changeQuickRedirect2, false, "051d66530275dc51d053e1ca13861a14", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar2, changeQuickRedirect2, false, "051d66530275dc51d053e1ca13861a14");
                return;
            }
            Message.obtain(eVar2.d, 2, hVar).sendToTarget();
        }
    }
}
