package com.tencent.mapsdk.internal;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class qg extends le {
    private qh a;

    public qg(qh qhVar) {
        this.a = qhVar;
    }

    @Override // com.tencent.mapsdk.internal.le
    public final byte[] f(String str) {
        if (hb.a(str) || !str.startsWith(qh.a) || this.a == null) {
            return null;
        }
        return this.a.a(str);
    }
}
