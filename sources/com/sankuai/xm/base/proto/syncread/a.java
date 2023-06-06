package com.sankuai.xm.base.proto.syncread;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protobase.a;
import com.sankuai.xm.base.proto.protobase.h;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a<T extends com.sankuai.xm.base.proto.protobase.a> extends h<T> {
    public static ChangeQuickRedirect a;
    protected long b;
    protected byte c;
    protected byte[][] d;
    protected String e;

    public abstract int d();

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cf778882103db5071ff87e8ba5fb191", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cf778882103db5071ff87e8ba5fb191");
        } else {
            this.b = j;
        }
    }

    public final void a(byte b) {
        this.c = (byte) 1;
    }

    public final byte[][] b() {
        return this.d;
    }

    public final void a(byte[][] bArr) {
        this.d = bArr;
    }

    public final String c() {
        return this.e;
    }

    public final void a(String str) {
        this.e = str;
    }
}
