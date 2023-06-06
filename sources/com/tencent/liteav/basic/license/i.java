package com.tencent.liteav.basic.license;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class i implements e {
    private Context a;

    public i(Context context) {
        this.a = context;
    }

    @Override // com.tencent.liteav.basic.license.e
    public boolean a() {
        if (this.a != null) {
            LicenceCheck.a().a((f) null, this.a);
        }
        return LicenceCheck.a().b() >= 5;
    }
}
