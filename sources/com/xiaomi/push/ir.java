package com.xiaomi.push;

import com.xiaomi.push.is;
import java.io.ByteArrayOutputStream;
/* loaded from: classes6.dex */
public final class ir {
    final ByteArrayOutputStream a;
    iw b;
    private final jd c;

    public ir() {
        this(new is.a());
    }

    public ir(iy iyVar) {
        this.a = new ByteArrayOutputStream();
        this.c = new jd(this.a);
        this.b = iyVar.a(this.c);
    }
}
