package com.facebook.react.uimanager;

import com.facebook.react.bridge.UiThreadUtil;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends o {
    protected Object[] a;
    private final o d;

    public f(o oVar, Object[] objArr) {
        super(oVar);
        this.a = objArr;
        this.d = oVar;
    }

    @Override // com.facebook.react.uimanager.o, com.facebook.react.uimanager.UIViewOperationQueue
    public final void a(int i, Object obj) {
        if (this.a != null) {
            this.a[0] = obj;
        }
        if (obj != null) {
            if (!UiThreadUtil.isOnUiThread()) {
                this.d.a(i, obj);
            } else {
                this.d.b.b(i, obj);
            }
        }
    }
}
