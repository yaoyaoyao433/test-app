package com.vivo.push.b;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c extends com.vivo.push.o {
    private String a;
    private String b;
    private long c;
    private int d;
    private int e;
    private String f;

    @Override // com.vivo.push.o
    public String toString() {
        return "BaseAppCommand";
    }

    public c(int i, String str) {
        super(i);
        this.c = -1L;
        this.d = -1;
        this.a = null;
        this.b = str;
    }

    public final int f() {
        return this.e;
    }

    public final void a(int i) {
        this.e = i;
    }

    public final void g() {
        this.f = null;
    }

    public final int a(Context context) {
        if (this.d == -1) {
            String str = this.b;
            if (TextUtils.isEmpty(str)) {
                com.vivo.push.util.p.a("BaseAppCommand", "pkg name is null");
                str = a();
                if (TextUtils.isEmpty(str)) {
                    com.vivo.push.util.p.a("BaseAppCommand", "src is null");
                    return -1;
                }
            }
            this.d = com.vivo.push.util.t.b(context, str);
            if (!TextUtils.isEmpty(this.f)) {
                this.d = 2;
            }
        }
        return this.d;
    }

    public final String h() {
        return this.a;
    }

    public final void b(String str) {
        this.a = str;
    }

    @Override // com.vivo.push.o
    public void c(com.vivo.push.a aVar) {
        aVar.a(Constants.EventInfoConsts.KEY_REQ_ID, this.a);
        aVar.a("package_name", this.b);
        aVar.a("sdk_version", 323L);
        aVar.a("PUSH_APP_STATUS", this.d);
        if (TextUtils.isEmpty(this.f)) {
            return;
        }
        aVar.a("BaseAppCommand.EXTRA__HYBRIDVERSION", this.f);
    }

    @Override // com.vivo.push.o
    public void d(com.vivo.push.a aVar) {
        this.a = aVar.a(Constants.EventInfoConsts.KEY_REQ_ID);
        this.b = aVar.a("package_name");
        this.c = aVar.b("sdk_version", 0L);
        this.d = aVar.b("PUSH_APP_STATUS", 0);
        this.f = aVar.a("BaseAppCommand.EXTRA__HYBRIDVERSION");
    }
}
