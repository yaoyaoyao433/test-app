package com.airbnb.lottie.model;

import android.support.annotation.CheckResult;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    @Nullable
    public f a;
    private final List<String> b;

    public e(String... strArr) {
        this.b = Arrays.asList(strArr);
    }

    private e(e eVar) {
        this.b = new ArrayList(eVar.b);
        this.a = eVar.a;
    }

    @CheckResult
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final e a(String str) {
        e eVar = new e(this);
        eVar.b.add(str);
        return eVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final e a(f fVar) {
        e eVar = new e(this);
        eVar.a = fVar;
        return eVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean c(String str, int i) {
        if (i >= this.b.size()) {
            return false;
        }
        boolean z = i == this.b.size() - 1;
        String str2 = this.b.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.b.size() + (-2) && a())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.b.get(i + 1).equals(str)) {
            return i == this.b.size() + (-2) || (i == this.b.size() + (-3) && a());
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.b.size() - 1) {
                return false;
            }
            return this.b.get(i2).equals(str);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean d(String str, int i) {
        return str.equals("__container") || i < this.b.size() - 1 || this.b.get(i).equals("**");
    }

    private boolean a() {
        return this.b.get(this.b.size() - 1).equals("**");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.b);
        sb.append(",resolved=");
        sb.append(this.a != null);
        sb.append('}');
        return sb.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean a(String str, int i) {
        if (str.equals("__container")) {
            return true;
        }
        if (i >= this.b.size()) {
            return false;
        }
        return this.b.get(i).equals(str) || this.b.get(i).equals("**") || this.b.get(i).equals("*");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final int b(String str, int i) {
        if (str.equals("__container")) {
            return 0;
        }
        if (this.b.get(i).equals("**")) {
            return (i != this.b.size() - 1 && this.b.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }
}
