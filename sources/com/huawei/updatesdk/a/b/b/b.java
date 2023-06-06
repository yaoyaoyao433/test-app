package com.huawei.updatesdk.a.b.b;

import android.content.Intent;
import android.os.Bundle;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    private Intent a;

    private b(Intent intent) {
        this.a = intent;
    }

    public static b a(Intent intent) {
        return new b(intent);
    }

    public final int a(String str, int i) {
        if (d()) {
            try {
                return f.a(this.a, str, i);
            } catch (Exception unused) {
                com.huawei.updatesdk.a.a.a.a("SecureIntent", "getIntExtra exception!");
            }
        }
        return i;
    }

    public final String a() {
        String action;
        return (!d() || (action = this.a.getAction()) == null) ? "" : action;
    }

    public final String a(String str) {
        if (d()) {
            try {
                return f.a(this.a, str);
            } catch (Exception unused) {
                com.huawei.updatesdk.a.a.a.a("SecureIntent", "getStringExtra exception!");
                return "";
            }
        }
        return "";
    }

    public final boolean a(String str, boolean z) {
        if (d()) {
            try {
                return f.a(this.a, str, z);
            } catch (Exception unused) {
                com.huawei.updatesdk.a.a.a.a("SecureIntent", "getBooleanExtra exception!");
            }
        }
        return z;
    }

    public final long b(String str, int i) {
        if (d()) {
            try {
                return f.a(this.a, str, i);
            } catch (Exception unused) {
                com.huawei.updatesdk.a.a.a.a("SecureIntent", "getIntExtra exception!");
            }
        }
        return i;
    }

    public final Bundle b() {
        if (d()) {
            return this.a.getExtras();
        }
        return null;
    }

    public final Intent c() {
        return this.a;
    }

    public final boolean d() {
        return this.a != null;
    }
}
