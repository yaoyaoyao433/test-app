package com.facebook.react.modules.debug;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.b;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements NotThreadSafeBridgeIdleDebugListener, com.facebook.react.uimanager.debug.a {
    private final b a = b.a(20);
    private final b b = b.a(20);
    private final b c = b.a(20);
    private final b d = b.a(20);
    private volatile boolean e = true;

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public final synchronized void onTransitionToBridgeIdle() {
        this.a.a(System.nanoTime());
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public final synchronized void onTransitionToBridgeBusy() {
        this.b.a(System.nanoTime());
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public final synchronized void onBridgeDestroyed() {
    }

    @Override // com.facebook.react.uimanager.debug.a
    public final synchronized void onViewHierarchyUpdateEnqueued() {
        this.c.a(System.nanoTime());
    }

    @Override // com.facebook.react.uimanager.debug.a
    public final synchronized void onViewHierarchyUpdateFinished() {
        this.d.a(System.nanoTime());
    }

    public final synchronized boolean a(long j, long j2) {
        boolean z;
        boolean z2;
        boolean a = a(this.d, j, j2);
        long b = b(this.a, j, j2);
        long b2 = b(this.b, j, j2);
        z = true;
        if (b == -1 && b2 == -1) {
            z2 = this.e;
        } else {
            z2 = b > b2;
        }
        if (!a && (!z2 || a(this.c, j, j2))) {
            z = false;
        }
        a(this.a, j2);
        a(this.b, j2);
        a(this.c, j2);
        a(this.d, j2);
        this.e = z2;
        return z;
    }

    private static boolean a(b bVar, long j, long j2) {
        for (int i = 0; i < bVar.a; i++) {
            long b = bVar.b(i);
            if (b >= j && b < j2) {
                return true;
            }
        }
        return false;
    }

    private static long b(b bVar, long j, long j2) {
        long j3 = -1;
        for (int i = 0; i < bVar.a; i++) {
            long b = bVar.b(i);
            if (b >= j && b < j2) {
                j3 = b;
            } else if (b >= j2) {
                break;
            }
        }
        return j3;
    }

    private static void a(b bVar, long j) {
        int i = bVar.a;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (bVar.b(i3) < j) {
                i2++;
            }
        }
        if (i2 > 0) {
            for (int i4 = 0; i4 < i - i2; i4++) {
                bVar.a(i4, bVar.b(i4 + i2));
            }
            bVar.c(i2);
        }
    }
}
