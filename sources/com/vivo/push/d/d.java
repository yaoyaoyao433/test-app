package com.vivo.push.d;

import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends z {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(com.vivo.push.o oVar) {
        super(oVar);
    }

    @Override // com.vivo.push.l
    public final void a(com.vivo.push.o oVar) {
        com.vivo.push.b.i iVar = (com.vivo.push.b.i) oVar;
        String e = iVar.e();
        com.vivo.push.e.a().a(iVar.g(), iVar.h(), e);
        if (TextUtils.isEmpty(iVar.g()) && !TextUtils.isEmpty(e)) {
            com.vivo.push.e.a().a(e);
        }
        com.vivo.push.m.b(new e(this, e, iVar));
    }
}
