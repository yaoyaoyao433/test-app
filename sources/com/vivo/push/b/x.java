package com.vivo.push.b;

import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class x extends com.vivo.push.o {
    private HashMap<String, String> a;
    private long b;

    public x() {
        super(2012);
    }

    public x(long j) {
        this();
        this.b = j;
    }

    public final void a(HashMap<String, String> hashMap) {
        this.a = hashMap;
    }

    @Override // com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        aVar.a("ReporterCommand.EXTRA_PARAMS", this.a);
        aVar.a("ReporterCommand.EXTRA_REPORTER_TYPE", this.b);
    }

    @Override // com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        this.a = (HashMap) aVar.d("ReporterCommand.EXTRA_PARAMS");
        this.b = aVar.b("ReporterCommand.EXTRA_REPORTER_TYPE", this.b);
    }

    @Override // com.vivo.push.o
    public final String toString() {
        return "ReporterCommand（" + this.b + CommonConstant.Symbol.BRACKET_RIGHT;
    }

    public final void d() {
        if (this.a == null) {
            com.vivo.push.util.p.d("ReporterCommand", "reportParams is empty");
            return;
        }
        StringBuilder sb = new StringBuilder("report message reportType:");
        sb.append(this.b);
        sb.append(",msgId:");
        String str = this.a.get("messageID");
        if (TextUtils.isEmpty(str)) {
            str = this.a.get("message_id");
        }
        sb.append(str);
        com.vivo.push.util.p.d("ReporterCommand", sb.toString());
    }
}
