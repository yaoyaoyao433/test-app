package com.huawei.hms.framework.network.grs.local.model;

import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {
    private String a;
    private String b;
    private Set<String> c;
    private String d;

    public Set<String> a() {
        return this.c;
    }

    public void a(String str) {
        this.d = str;
    }

    public void a(Set<String> set) {
        this.c = set;
    }

    public String b() {
        return this.a;
    }

    public void b(String str) {
        this.a = str;
    }

    public void c(String str) {
        this.b = str;
    }
}
