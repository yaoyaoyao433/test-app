package com.tencent.mapsdk.core.components.protocol.jce.rtt;

import com.qq.taf.jce.a;
import com.tencent.mapsdk.internal.k;
import com.tencent.mapsdk.internal.m;
import com.tencent.mapsdk.internal.n;
import com.tencent.mapsdk.internal.q;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class RttResponse extends a implements Cloneable {
    static byte[] a;
    static final /* synthetic */ boolean b = !RttResponse.class.desiredAssertionStatus();
    public byte[] result;

    @Override // com.tencent.mapsdk.internal.p
    public final String className() {
        return "navsns.RttResponse";
    }

    static {
        a = r0;
        byte[] bArr = {0};
    }

    public final byte[] getResult() {
        return this.result;
    }

    public final void setResult(byte[] bArr) {
        this.result = bArr;
    }

    public RttResponse() {
        this.result = null;
    }

    public RttResponse(byte[] bArr) {
        this.result = null;
        this.result = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return q.a((Object) this.result, (Object) ((RttResponse) obj).result);
    }

    public final int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (b) {
                return null;
            }
            throw new AssertionError();
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(n nVar) {
        nVar.a(this.result, 0);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(m mVar) {
        this.result = mVar.c(0, true);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void display(StringBuilder sb, int i) {
        new k(sb, i).a(this.result, "result");
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void displaySimple(StringBuilder sb, int i) {
        new k(sb, i).a(this.result, false);
    }
}
