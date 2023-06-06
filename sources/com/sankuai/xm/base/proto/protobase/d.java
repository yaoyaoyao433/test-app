package com.sankuai.xm.base.proto.protobase;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends c {
    public static ChangeQuickRedirect d;
    public short e;
    public int f;
    public int g;
    public int h;

    @Override // com.sankuai.xm.base.proto.protobase.c, com.sankuai.xm.base.proto.protobase.a
    public final int a() {
        return 24;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba28517eb9144e9fb1cbbaf45bc91b53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba28517eb9144e9fb1cbbaf45bc91b53");
        } else {
            this.e = (short) 0;
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1530101839e9a1b02685ff2f8d51bf8b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1530101839e9a1b02685ff2f8d51bf8b");
        }
        try {
            return String.format("len:%d uri:%d appid:%d version:%d crc32:%d requestseq=%d extra=%d", Integer.valueOf(this.a), Integer.valueOf(this.b), Short.valueOf(this.c), Short.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h));
        } catch (Exception unused) {
            return "";
        }
    }
}
