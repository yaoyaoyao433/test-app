package com.sankuai.meituan.trafficcontroller.exception;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends RuntimeException {
    public a() {
        this("Requests are too frequent");
    }

    private a(String str) {
        super(str);
    }
}
