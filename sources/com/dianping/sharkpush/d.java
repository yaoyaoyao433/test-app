package com.dianping.sharkpush;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import dianping.com.nvlinker.stub.ISharkPushReceiver;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    String b;
    boolean c;
    boolean d;
    a e;
    private int f;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a extends ISharkPushReceiver {
        @Override // dianping.com.nvlinker.stub.ISharkPushReceiver
        void onReceive(String str, byte[] bArr);
    }

    public d(String str, int i, boolean z, boolean z2, a aVar) {
        Object[] objArr = {str, 0, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e040b6bf7a7e90c6f8f6bf817a29aad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e040b6bf7a7e90c6f8f6bf817a29aad");
            return;
        }
        this.b = str;
        this.f = 0;
        this.e = aVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0c47715a9d7aafa68f8a3295b46f826", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0c47715a9d7aafa68f8a3295b46f826")).booleanValue();
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.e == dVar.e && this.b != null && this.b.equals(dVar.b) && this.f == dVar.f;
    }
}
