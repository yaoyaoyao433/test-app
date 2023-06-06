package com.facebook.react.uimanager.events;

import android.os.SystemClock;
import com.facebook.react.uimanager.events.b;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class b<T extends b> {
    private static int a;
    private int b;
    boolean d;
    public int e;
    public long f;

    public abstract String a();

    public abstract void a(RCTEventEmitter rCTEventEmitter);

    public boolean b() {
        return true;
    }

    public void c() {
    }

    public short d() {
        return (short) 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b() {
        int i = a;
        a = i + 1;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(int i) {
        int i2 = a;
        a = i2 + 1;
        this.b = i2;
        a(i);
    }

    public final void a(int i) {
        this.e = i;
        this.f = SystemClock.uptimeMillis();
        this.d = true;
    }

    public final int e() {
        return this.e;
    }

    public final long f() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.d = false;
        c();
    }
}
