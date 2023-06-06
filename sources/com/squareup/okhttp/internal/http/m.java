package com.squareup.okhttp.internal.http;

import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class m extends Exception {
    public final IOException a() {
        return (IOException) super.getCause();
    }

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable getCause() {
        return (IOException) super.getCause();
    }
}
