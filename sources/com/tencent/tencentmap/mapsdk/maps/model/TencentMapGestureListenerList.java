package com.tencent.tencentmap.mapsdk.maps.model;

import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TencentMapGestureListenerList implements TencentMapGestureListener {
    private ArrayList<TencentMapGestureListener> mListeners = new ArrayList<>();

    public synchronized void addListener(TencentMapGestureListener tencentMapGestureListener) {
        if (tencentMapGestureListener != null) {
            if (!this.mListeners.contains(tencentMapGestureListener)) {
                this.mListeners.add(tencentMapGestureListener);
            }
        }
    }

    public synchronized void removeListener(TencentMapGestureListener tencentMapGestureListener) {
        this.mListeners.remove(tencentMapGestureListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public synchronized boolean onDoubleTap(float f, float f2) {
        for (int size = this.mListeners.size() - 1; size >= 0; size--) {
            this.mListeners.get(size).onDoubleTap(f, f2);
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public synchronized boolean onSingleTap(float f, float f2) {
        for (int size = this.mListeners.size() - 1; size >= 0; size--) {
            this.mListeners.get(size).onSingleTap(f, f2);
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public synchronized boolean onFling(float f, float f2) {
        for (int size = this.mListeners.size() - 1; size >= 0; size--) {
            this.mListeners.get(size).onFling(f, f2);
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public synchronized boolean onScroll(float f, float f2) {
        for (int size = this.mListeners.size() - 1; size >= 0; size--) {
            this.mListeners.get(size).onScroll(f, f2);
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public synchronized boolean onLongPress(float f, float f2) {
        for (int size = this.mListeners.size() - 1; size >= 0; size--) {
            this.mListeners.get(size).onLongPress(f, f2);
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public synchronized boolean onDown(float f, float f2) {
        for (int size = this.mListeners.size() - 1; size >= 0; size--) {
            this.mListeners.get(size).onDown(f, f2);
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public synchronized boolean onUp(float f, float f2) {
        for (int size = this.mListeners.size() - 1; size >= 0; size--) {
            this.mListeners.get(size).onUp(f, f2);
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
    public synchronized void onMapStable() {
        for (int size = this.mListeners.size() - 1; size >= 0; size--) {
            this.mListeners.get(size).onMapStable();
        }
    }
}
