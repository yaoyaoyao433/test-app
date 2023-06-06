package com.sankuai.meituan.animplayer;

import android.content.res.AssetFileDescriptor;
import android.view.Surface;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface j {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(int i, int i2, String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c {
        boolean a(int i, int i2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface d {
        void a();
    }

    void a();

    void a(float f, float f2);

    void a(long j) throws IllegalStateException;

    void a(AssetFileDescriptor assetFileDescriptor) throws IOException;

    void a(Surface surface);

    void a(a aVar);

    void a(b bVar);

    void a(c cVar);

    void a(d dVar);

    void a(String str) throws IOException;

    void b();

    void c();

    void d();

    void e();

    void f();

    String g();

    boolean h();
}
