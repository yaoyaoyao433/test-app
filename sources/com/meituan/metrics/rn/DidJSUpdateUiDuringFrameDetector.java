package com.meituan.metrics.rn;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.b;
import com.facebook.react.uimanager.debug.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DidJSUpdateUiDuringFrameDetector implements NotThreadSafeBridgeIdleDebugListener, a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final b mTransitionToBusyEvents;
    private final b mTransitionToIdleEvents;
    private final b mViewHierarchyUpdateEnqueuedEvents;
    private final b mViewHierarchyUpdateFinishedEvents;
    private volatile boolean mWasIdleAtEndOfLastFrame;

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public void onBridgeDestroyed() {
    }

    public DidJSUpdateUiDuringFrameDetector() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30164d00671bc8879c86293207805827", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30164d00671bc8879c86293207805827");
            return;
        }
        this.mTransitionToIdleEvents = b.a(20);
        this.mTransitionToBusyEvents = b.a(20);
        this.mViewHierarchyUpdateEnqueuedEvents = b.a(20);
        this.mViewHierarchyUpdateFinishedEvents = b.a(20);
        this.mWasIdleAtEndOfLastFrame = true;
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeIdle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4de54bdddd8c996be52efa1d05ee671e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4de54bdddd8c996be52efa1d05ee671e");
        } else {
            this.mTransitionToIdleEvents.a(System.nanoTime());
        }
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeBusy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56b37757050313827e96184114d6fd27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56b37757050313827e96184114d6fd27");
        } else {
            this.mTransitionToBusyEvents.a(System.nanoTime());
        }
    }

    @Override // com.facebook.react.uimanager.debug.a
    public synchronized void onViewHierarchyUpdateEnqueued() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c659ae54b6b53013c93f48a81c1d6781", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c659ae54b6b53013c93f48a81c1d6781");
        } else {
            this.mViewHierarchyUpdateEnqueuedEvents.a(System.nanoTime());
        }
    }

    @Override // com.facebook.react.uimanager.debug.a
    public synchronized void onViewHierarchyUpdateFinished() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96d9ae28a44926436062726294d948cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96d9ae28a44926436062726294d948cf");
        } else {
            this.mViewHierarchyUpdateFinishedEvents.a(System.nanoTime());
        }
    }

    public synchronized boolean getDidJSHitFrameAndCleanup(long j, long j2) {
        boolean z;
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63d16e2bfbb119dc3fe936cefdaa8e2d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63d16e2bfbb119dc3fe936cefdaa8e2d")).booleanValue();
        }
        boolean hasEventBetweenTimestamps = hasEventBetweenTimestamps(this.mViewHierarchyUpdateFinishedEvents, j, j2);
        boolean didEndFrameIdle = didEndFrameIdle(j, j2);
        if (!hasEventBetweenTimestamps && (!didEndFrameIdle || hasEventBetweenTimestamps(this.mViewHierarchyUpdateEnqueuedEvents, j, j2))) {
            z = false;
            cleanUp(this.mTransitionToIdleEvents, j2);
            cleanUp(this.mTransitionToBusyEvents, j2);
            cleanUp(this.mViewHierarchyUpdateEnqueuedEvents, j2);
            cleanUp(this.mViewHierarchyUpdateFinishedEvents, j2);
            this.mWasIdleAtEndOfLastFrame = didEndFrameIdle;
            return z;
        }
        z = true;
        cleanUp(this.mTransitionToIdleEvents, j2);
        cleanUp(this.mTransitionToBusyEvents, j2);
        cleanUp(this.mViewHierarchyUpdateEnqueuedEvents, j2);
        cleanUp(this.mViewHierarchyUpdateFinishedEvents, j2);
        this.mWasIdleAtEndOfLastFrame = didEndFrameIdle;
        return z;
    }

    private static boolean hasEventBetweenTimestamps(b bVar, long j, long j2) {
        Object[] objArr = {bVar, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "85e44ca770a7bfc0d027375c1ce984a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "85e44ca770a7bfc0d027375c1ce984a2")).booleanValue();
        }
        for (int i = 0; i < bVar.a(); i++) {
            long b = bVar.b(i);
            if (b >= j && b < j2) {
                return true;
            }
        }
        return false;
    }

    private static long getLastEventBetweenTimestamps(b bVar, long j, long j2) {
        Object[] objArr = {bVar, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f4265d4ff0163922535c6d354ee45560", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f4265d4ff0163922535c6d354ee45560")).longValue();
        }
        long j3 = -1;
        for (int i = 0; i < bVar.a(); i++) {
            long b = bVar.b(i);
            if (b >= j && b < j2) {
                j3 = b;
            } else if (b >= j2) {
                break;
            }
        }
        return j3;
    }

    private boolean didEndFrameIdle(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8df4b501f5cbaac38ef8c1250f8afea6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8df4b501f5cbaac38ef8c1250f8afea6")).booleanValue();
        }
        long lastEventBetweenTimestamps = getLastEventBetweenTimestamps(this.mTransitionToIdleEvents, j, j2);
        long lastEventBetweenTimestamps2 = getLastEventBetweenTimestamps(this.mTransitionToBusyEvents, j, j2);
        if (lastEventBetweenTimestamps == -1 && lastEventBetweenTimestamps2 == -1) {
            return this.mWasIdleAtEndOfLastFrame;
        }
        return lastEventBetweenTimestamps > lastEventBetweenTimestamps2;
    }

    private static void cleanUp(b bVar, long j) {
        Object[] objArr = {bVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cbe77c7b1bc30c88477523388f219e79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cbe77c7b1bc30c88477523388f219e79");
            return;
        }
        int a = bVar.a();
        int i = 0;
        for (int i2 = 0; i2 < a; i2++) {
            if (bVar.b(i2) < j) {
                i++;
            }
        }
        if (i > 0) {
            for (int i3 = 0; i3 < a - i; i3++) {
                bVar.a(i3, bVar.b(i3 + i));
            }
            bVar.c(i);
        }
    }
}
