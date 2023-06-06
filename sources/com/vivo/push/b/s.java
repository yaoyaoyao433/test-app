package com.vivo.push.b;

import com.meituan.android.common.statistics.Constants;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class s extends com.vivo.push.o {
    private String a;
    private int b;

    @Override // com.vivo.push.o
    public String toString() {
        return "OnReceiveCommand";
    }

    public s(int i) {
        super(i);
        this.a = null;
        this.b = 0;
    }

    public final String g() {
        return this.a;
    }

    public final int h() {
        return this.b;
    }

    @Override // com.vivo.push.o
    public void c(com.vivo.push.a aVar) {
        aVar.a(Constants.EventInfoConsts.KEY_REQ_ID, this.a);
        aVar.a("status_msg_code", this.b);
    }

    @Override // com.vivo.push.o
    public void d(com.vivo.push.a aVar) {
        this.a = aVar.a(Constants.EventInfoConsts.KEY_REQ_ID);
        this.b = aVar.b("status_msg_code", this.b);
    }
}
