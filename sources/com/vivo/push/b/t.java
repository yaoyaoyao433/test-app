package com.vivo.push.b;

import com.meituan.metrics.traffic.report.NetLogConstants;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class t extends s {
    private ArrayList<String> a;
    private ArrayList<String> b;

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnSetTagsCommand";
    }

    public t(int i) {
        super(i);
        this.a = null;
        this.b = null;
    }

    public final ArrayList<String> d() {
        return this.a;
    }

    public final List<String> e() {
        return this.b;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("content", this.a);
        aVar.a(NetLogConstants.Details.ERROR_MSG, this.b);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.a = aVar.c("content");
        this.b = aVar.c(NetLogConstants.Details.ERROR_MSG);
    }
}
