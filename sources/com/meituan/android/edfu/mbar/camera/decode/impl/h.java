package com.meituan.android.edfu.mbar.camera.decode.impl;

import android.graphics.Rect;
import com.meituan.android.edfu.mbar.camera.decode.MBarResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public byte[] b;
    public int c;
    public int d;
    public boolean e;
    public Rect f;
    public com.meituan.android.edfu.mbar.camera.decode.a g;
    public String h;
    public int i;
    public List<MBarResult> j;
    public com.meituan.android.edfu.edfucamera.argorithm.e k;

    public h(byte[] bArr, int i, int i2, boolean z, Rect rect, com.meituan.android.edfu.edfucamera.argorithm.e eVar, com.meituan.android.edfu.mbar.camera.decode.a aVar) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), rect, eVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be18b7633b9c8578dbf539498dba106e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be18b7633b9c8578dbf539498dba106e");
            return;
        }
        this.b = bArr;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.g = aVar;
        this.k = eVar;
        if (rect == null) {
            this.f = new Rect(0, 0, i, i2);
        } else {
            this.f = rect;
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7804f2a2b5aec2e2ad7f44ba17a3e973", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7804f2a2b5aec2e2ad7f44ba17a3e973");
        }
        return "[data.length:" + this.b.length + ", width:" + this.c + ", height:" + this.d + ", rotate:" + this.e + ", crop:" + this.f + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
    }
}
