package com.meituan.android.privacy.interfaces;

import android.media.MediaRecorder;
import android.view.Surface;
import java.io.IOException;
/* compiled from: ProGuard */
@RequiresPermission(PermissionGuard.PERMISSION_MICROPHONE)
/* loaded from: classes3.dex */
public interface v {
    void a() throws IllegalStateException;

    void a(int i) throws IllegalStateException;

    void a(int i, int i2) throws IllegalStateException;

    void a(MediaRecorder.OnErrorListener onErrorListener);

    void a(MediaRecorder.OnInfoListener onInfoListener);

    void a(Surface surface);

    void a(p pVar);

    void a(String str) throws IllegalStateException;

    void b() throws IllegalStateException;

    void b(int i);

    void c();

    void c(int i) throws IllegalStateException;

    void d() throws IllegalStateException, IOException;

    void d(int i);

    void e();

    void e(int i) throws IllegalStateException;

    int f() throws IllegalStateException;

    void f(int i) throws IllegalStateException;

    void g(int i);

    void h(int i) throws IllegalStateException;

    void i(int i) throws IllegalStateException;

    void j(int i) throws IllegalArgumentException;
}
