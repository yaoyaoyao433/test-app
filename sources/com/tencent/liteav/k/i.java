package com.tencent.liteav.k;

import com.tencent.liteav.k.n;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class i extends j {
    @Override // com.tencent.liteav.k.j
    public int a(int i) {
        if (this.b == null) {
            return i;
        }
        n.k kVar = (n.k) this.b;
        if (this.a != null) {
            this.a.a(kVar.a, kVar.b, kVar.c);
        }
        return super.a(i);
    }
}
