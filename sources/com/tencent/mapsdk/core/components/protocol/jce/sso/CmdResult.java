package com.tencent.mapsdk.core.components.protocol.jce.sso;

import com.qq.taf.jce.a;
import com.tencent.mapsdk.internal.k;
import com.tencent.mapsdk.internal.m;
import com.tencent.mapsdk.internal.n;
import com.tencent.mapsdk.internal.q;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class CmdResult extends a implements Cloneable {
    static final /* synthetic */ boolean a = !CmdResult.class.desiredAssertionStatus();
    public int iErrCode;
    public int iSubErrCode;
    public String strErrDesc;

    @Override // com.tencent.mapsdk.internal.p
    public final String className() {
        return "sosomap.CmdResult";
    }

    public CmdResult() {
        this.iErrCode = 0;
        this.strErrDesc = "";
        this.iSubErrCode = 0;
    }

    public CmdResult(int i, String str, int i2) {
        this.iErrCode = 0;
        this.strErrDesc = "";
        this.iSubErrCode = 0;
        this.iErrCode = i;
        this.strErrDesc = str;
        this.iSubErrCode = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        CmdResult cmdResult = (CmdResult) obj;
        return q.a(this.iErrCode, cmdResult.iErrCode) && q.a((Object) this.strErrDesc, (Object) cmdResult.strErrDesc) && q.a(this.iSubErrCode, cmdResult.iSubErrCode);
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
            if (a) {
                return null;
            }
            throw new AssertionError();
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(n nVar) {
        nVar.a(this.iErrCode, 0);
        nVar.a(this.strErrDesc, 1);
        nVar.a(this.iSubErrCode, 2);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(m mVar) {
        this.iErrCode = mVar.a(this.iErrCode, 0, true);
        this.strErrDesc = mVar.b(1, true);
        this.iSubErrCode = mVar.a(this.iSubErrCode, 2, false);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void display(StringBuilder sb, int i) {
        k kVar = new k(sb, i);
        kVar.a(this.iErrCode, "iErrCode");
        kVar.a(this.strErrDesc, "strErrDesc");
        kVar.a(this.iSubErrCode, "iSubErrCode");
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void displaySimple(StringBuilder sb, int i) {
        k kVar = new k(sb, i);
        kVar.a(this.iErrCode, true);
        kVar.a(this.strErrDesc, true);
        kVar.a(this.iSubErrCode, false);
    }
}
