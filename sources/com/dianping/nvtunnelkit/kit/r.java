package com.dianping.nvtunnelkit.kit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class r implements com.dianping.nvtunnelkit.core.b<r> {
    public static ChangeQuickRedirect b;
    private ByteBuffer a;
    public boolean c;

    public static r b(ByteBuffer byteBuffer) {
        Object[] objArr = {byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff2c7d525d9f32f987bb36714fcd1cf8", RobustBitConfig.DEFAULT_VALUE) ? (r) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff2c7d525d9f32f987bb36714fcd1cf8") : new r(byteBuffer);
    }

    public r(ByteBuffer byteBuffer) {
        Object[] objArr = {byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f1b7f3d062fc7d8159e8c0720b57ce0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f1b7f3d062fc7d8159e8c0720b57ce0");
            return;
        }
        this.c = false;
        this.a = byteBuffer;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.dianping.nvtunnelkit.core.b
    public void a(r rVar) {
        this.a = rVar.a;
    }

    public ByteBuffer a() {
        return this.a;
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0fe6228875a351d5e46db828e7f1730", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0fe6228875a351d5e46db828e7f1730")).intValue();
        }
        if (this.a == null) {
            return 0;
        }
        return this.a.array().length;
    }
}
