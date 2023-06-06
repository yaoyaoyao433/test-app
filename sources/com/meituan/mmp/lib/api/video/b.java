package com.meituan.mmp.lib.api.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(b bVar, int i);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mmp.lib.api.video.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0400b {
        void a(b bVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface c {
        boolean a(b bVar, int i, int i2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface d {
        boolean a(b bVar, int i, int i2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface e {
        void a(b bVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface f {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface g {
        void a(b bVar, int i, int i2, int i3, int i4);
    }

    void a() throws IllegalStateException;

    void a(int i);

    void a(long j) throws IllegalStateException;

    @TargetApi(14)
    void a(Context context, Uri uri, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    void a(Surface surface);

    void a(a aVar);

    void a(InterfaceC0400b interfaceC0400b);

    void a(c cVar);

    void a(d dVar);

    void a(e eVar);

    void a(g gVar);

    void a(boolean z);

    void b() throws IllegalStateException;

    void b(boolean z);

    void c() throws IllegalStateException;

    long d();

    long e();

    void f();

    void g();
}
