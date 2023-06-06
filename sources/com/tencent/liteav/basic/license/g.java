package com.tencent.liteav.basic.license;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class g implements e {
    private Context a;

    public g(Context context) {
        this.a = context;
    }

    @Override // com.tencent.liteav.basic.license.e
    public boolean a() {
        if (this.a != null) {
            LicenceCheck.a().b((f) null, this.a);
        }
        return LicenceCheck.a().c() >= 2;
    }
}
