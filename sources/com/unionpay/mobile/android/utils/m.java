package com.unionpay.mobile.android.utils;

import android.os.Handler;
import android.os.Message;
/* loaded from: classes6.dex */
public final class m implements Handler.Callback {
    final /* synthetic */ l a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(l lVar) {
        this.a = lVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        com.unionpay.mobile.android.nocard.views.b bVar;
        com.unionpay.mobile.android.nocard.views.b bVar2;
        com.unionpay.mobile.android.nocard.views.b bVar3;
        switch (message.what) {
            case 1:
                bVar = this.a.b;
                if (bVar == null) {
                    return true;
                }
                break;
            case 2:
                bVar3 = this.a.b;
                if (bVar3 == null) {
                    return true;
                }
                break;
            default:
                return true;
        }
        bVar2 = this.a.b;
        ((com.unionpay.mobile.android.nocard.views.l) bVar2).r();
        return true;
    }
}
