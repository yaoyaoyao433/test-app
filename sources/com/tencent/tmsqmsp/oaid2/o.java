package com.tencent.tmsqmsp.oaid2;

import android.content.Context;
import com.meituan.robust.common.StringUtil;
import com.tencent.tmsqmsp.oaid2.p;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class o implements b, p.b {
    public p a;
    public IVendorCallback b;

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.b = iVendorCallback;
        this.a = new p(context, this);
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public String d() {
        String c;
        return (e() && (c = this.a.c()) != null) ? c : "";
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean e() {
        p pVar = this.a;
        if (pVar != null) {
            return pVar.b();
        }
        return false;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void j() {
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean k() {
        return false;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void l() {
        p pVar = this.a;
        if (pVar != null) {
            pVar.d();
        }
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public String a() {
        String a;
        return (e() && (a = this.a.a()) != null) ? a : "";
    }

    @Override // com.tencent.tmsqmsp.oaid2.p.b
    public void a(p pVar) {
        try {
            if (this.b != null) {
                this.b.onResult(e(), d(), a());
            }
        } catch (Exception unused) {
            IVendorCallback iVendorCallback = this.b;
            if (iVendorCallback != null) {
                iVendorCallback.onResult(false, StringUtil.NULL, StringUtil.NULL);
            }
        }
    }
}
