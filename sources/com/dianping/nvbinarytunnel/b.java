package com.dianping.nvbinarytunnel;

import com.dianping.nvtunnelkit.kit.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends r implements com.dianping.nvtunnelkit.core.b<r> {
    public static ChangeQuickRedirect a;
    private final byte d;
    private ByteBuffer e;

    private b(ByteBuffer byteBuffer) {
        super(byteBuffer);
        Object[] objArr = {byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "833e127bffe29018bc86c632a341b2c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "833e127bffe29018bc86c632a341b2c1");
            return;
        }
        this.d = (byte) 2;
        this.e = byteBuffer;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.dianping.nvtunnelkit.kit.r, com.dianping.nvtunnelkit.core.b
    public final void a(r rVar) {
        this.e = rVar.a();
    }

    @Override // com.dianping.nvtunnelkit.kit.r
    public final ByteBuffer a() {
        return this.e;
    }

    public static b a(ByteBuffer byteBuffer) {
        Object[] objArr = {byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aafae49e0da65d30dc5af676f544b080", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aafae49e0da65d30dc5af676f544b080") : new b(byteBuffer);
    }
}
