package com.tencent.mapsdk.internal;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class js extends jj {
    public String a;

    public js() {
    }

    private js(String str) {
        this.a = str;
    }

    @Override // com.tencent.mapsdk.internal.jj
    public final int a() {
        return b().length;
    }

    @Override // com.tencent.mapsdk.internal.jj
    public final byte[] b() {
        if (this.a != null) {
            return this.a.getBytes();
        }
        return new byte[0];
    }

    @Override // com.tencent.mapsdk.internal.jj
    public final void a(byte[] bArr) {
        this.a = new String(bArr);
    }

    public final String toString() {
        return "StringData{strData='" + this.a + "'}";
    }
}
