package com.tencent.mapsdk.core.components.protocol.jce.sso;

import com.qq.taf.jce.a;
import com.tencent.mapsdk.internal.k;
import com.tencent.mapsdk.internal.m;
import com.tencent.mapsdk.internal.n;
import com.tencent.mapsdk.internal.q;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class Tag extends a implements Cloneable {
    static byte[] a;
    static final /* synthetic */ boolean b = !Tag.class.desiredAssertionStatus();
    public String strId;
    public byte[] value;

    @Override // com.tencent.mapsdk.internal.p
    public final String className() {
        return "sosomap.Tag";
    }

    public final byte[] getValue() {
        return this.value;
    }

    public Tag() {
        this.strId = "";
        this.value = null;
    }

    public Tag(String str, byte[] bArr) {
        this.strId = "";
        this.value = null;
        this.strId = str;
        this.value = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Tag tag = (Tag) obj;
        return q.a((Object) this.strId, (Object) tag.strId) && q.a((Object) this.value, (Object) tag.value);
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
        nVar.a(this.strId, 0);
        nVar.a(this.value, 1);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(m mVar) {
        this.strId = mVar.b(0, true);
        if (a == null) {
            a = r2;
            byte[] bArr = {0};
        }
        this.value = mVar.c(1, true);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void display(StringBuilder sb, int i) {
        k kVar = new k(sb, i);
        kVar.a(this.strId, "strId");
        kVar.a(this.value, "value");
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void displaySimple(StringBuilder sb, int i) {
        k kVar = new k(sb, i);
        kVar.a(this.strId, true);
        kVar.a(this.value, false);
    }
}
