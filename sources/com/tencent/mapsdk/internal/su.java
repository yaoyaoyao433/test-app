package com.tencent.mapsdk.internal;

import android.content.Context;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class su implements nw {
    private Context a;
    private final mi b;
    private String c;

    @Override // com.tencent.mapsdk.internal.nw
    public final String f() {
        return null;
    }

    @Override // com.tencent.mapsdk.internal.nw
    public final String g() {
        return null;
    }

    @Override // com.tencent.mapsdk.internal.nw
    public final String h() {
        return null;
    }

    @Override // com.tencent.mapsdk.internal.nw
    public final String j() {
        return null;
    }

    public su(Context context, String str) {
        if (context != null) {
            this.a = context.getApplicationContext();
            this.b = mi.a(this.a, (TencentMapOptions) null);
            this.c = str;
            return;
        }
        this.b = null;
    }

    @Override // com.tencent.mapsdk.internal.nw
    public final String a() {
        if (this.b != null) {
            return this.b.d();
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.nw
    public final String b() {
        if (this.b != null) {
            mi miVar = this.b;
            kd.a(miVar.b);
            return miVar.b;
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.nw
    public final String c() {
        if (this.b != null) {
            return this.b.a(this.c);
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.nw
    public final String d() {
        if (this.b != null) {
            return this.b.c(this.c);
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.nw
    public final String e() {
        if (this.b != null) {
            return this.b.b(this.c);
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.nw
    public final String i() {
        if (this.b != null) {
            mi miVar = this.b;
            kd.a(miVar.c);
            return miVar.c;
        }
        return null;
    }
}
