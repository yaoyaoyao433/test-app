package com.bumptech.glide.load.resource;

import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a<T> implements com.bumptech.glide.load.b<T> {
    private static final a<?> a = new a<>();

    @Override // com.bumptech.glide.load.b
    public final String a() {
        return "";
    }

    @Override // com.bumptech.glide.load.b
    public final boolean a(T t, OutputStream outputStream) {
        return false;
    }

    public static <T> com.bumptech.glide.load.b<T> b() {
        return a;
    }
}
