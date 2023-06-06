package com.huawei.hms.hatool;

import android.content.Context;
import android.util.Pair;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class k0 implements m0 {
    public Context a = b.f();
    public String b;
    public String c;
    public String d;

    public k0(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final void a(String str, List<q> list) {
        Pair<String, String> a = s0.a(str);
        new t(list, (String) a.first, (String) a.second, this.d).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.k0.run():void");
    }
}
