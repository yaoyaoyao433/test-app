package com.tencent.mapsdk.core.components.protocol.jce.trafficevent;

import com.qq.taf.jce.a;
import com.tencent.mapsdk.internal.m;
import com.tencent.mapsdk.internal.n;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class Response extends a {
    static ArrayList<Detail> a = new ArrayList<>();
    public ArrayList<Detail> detail;
    public short error;
    public String msg;

    public Response() {
        this.error = (short) 0;
        this.msg = "";
        this.detail = null;
    }

    public Response(short s, String str, ArrayList<Detail> arrayList) {
        this.error = (short) 0;
        this.msg = "";
        this.detail = null;
        this.error = s;
        this.msg = str;
        this.detail = arrayList;
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(n nVar) {
        nVar.a(this.error, 0);
        if (this.msg != null) {
            nVar.a(this.msg, 1);
        }
        if (this.detail != null) {
            nVar.a((Collection) this.detail, 2);
        }
    }

    static {
        a.add(new Detail());
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(m mVar) {
        this.error = mVar.a(this.error, 0, true);
        this.msg = mVar.b(1, false);
        this.detail = (ArrayList) mVar.a((m) a, 2, false);
    }
}
