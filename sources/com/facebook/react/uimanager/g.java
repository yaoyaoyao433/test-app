package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.a;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class g extends a.AbstractC0145a {
    private final ReactContext a;

    protected abstract void a(long j);

    /* JADX INFO: Access modifiers changed from: protected */
    public g(ReactContext reactContext) {
        this.a = reactContext;
    }

    @Override // com.facebook.react.modules.core.a.AbstractC0145a
    public final void doFrame(long j) {
        try {
            a(j);
        } catch (RuntimeException e) {
            this.a.handleException(e);
        }
    }
}
