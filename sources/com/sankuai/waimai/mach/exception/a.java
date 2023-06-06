package com.sankuai.waimai.mach.exception;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends RuntimeException {
    public int a;

    public a(String str, int i) {
        super(str);
        this.a = i;
    }

    public a(String str, Throwable th, int i) {
        super(str, th);
        this.a = 1;
    }
}
