package com.airbnb.lottie.model;

import android.support.annotation.RestrictTo;
import com.airbnb.lottie.model.content.n;
import java.util.List;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class d {
    public final List<n> a;
    public final double b;
    private final char c;
    private final double d;
    private final String e;
    private final String f;

    public static int a(char c, String str, String str2) {
        return ((((c + 0) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public d(List<n> list, char c, double d, double d2, String str, String str2) {
        this.a = list;
        this.c = c;
        this.d = d;
        this.b = d2;
        this.e = str;
        this.f = str2;
    }

    public final int hashCode() {
        return a(this.c, this.f, this.e);
    }
}
