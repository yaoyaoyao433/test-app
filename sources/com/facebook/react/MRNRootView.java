package com.facebook.react;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MRNRootView extends ReactRootView {
    private WeakReference<com.meituan.android.mrn.container.b> a;
    private a b;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public a getCallback() {
        return this.b;
    }

    public void setViewAddedCallback(a aVar) {
        this.b = aVar;
    }

    public MRNRootView(Context context) {
        super(context);
    }

    public MRNRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.facebook.react.ReactRootView, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.b != null) {
            this.b.a();
        }
    }

    @Override // com.facebook.react.ReactRootView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        com.facebook.react.log.c fsTimeLogger = getFsTimeLogger();
        if (fsTimeLogger != null) {
            fsTimeLogger.a();
        }
        com.facebook.react.log.a fmpListener = getFmpListener();
        if (fmpListener != null) {
            fmpListener.a();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.ReactRootView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        com.facebook.react.log.a fmpListener = getFmpListener();
        if (fmpListener != null) {
            fmpListener.a(canvas);
        }
    }

    public void setMRNScene(com.meituan.android.mrn.container.b bVar) {
        if (bVar != null) {
            this.a = new WeakReference<>(bVar);
        }
    }

    public com.meituan.android.mrn.container.b getMRNScene() {
        if (this.a != null) {
            return this.a.get();
        }
        return null;
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.ad
    public void runApplication() {
        super.runApplication();
        ((UIManagerModule) this.mReactInstanceManager.getCurrentReactContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().b = false;
    }
}
