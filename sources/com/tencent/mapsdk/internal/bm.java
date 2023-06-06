package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.Bundle;
import com.tencent.tencentmap.mapsdk.maps.TencentMapComponent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class bm implements TencentMapComponent.Component {
    private final List<bn> a = new ArrayList();
    private volatile int b;

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Context context) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void a(bn bnVar) {
        if (bnVar != null) {
            this.a.add(bnVar);
        }
    }

    public synchronized void a(bn bnVar, Bundle bundle) {
        if (this.a.size() == 0) {
            return;
        }
        this.b = this.a.indexOf(bnVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void b(bn bnVar) {
        if (bnVar != null) {
            try {
                this.a.remove(bnVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.a.size() == 0) {
            b_();
        } else {
            this.b = this.a.size() - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void b_() {
        this.a.clear();
        this.b = 0;
    }

    public final Context b() {
        bn c_ = c_();
        if (c_ != null) {
            return c_.getContext();
        }
        return null;
    }

    public final synchronized bn c_() {
        if (this.b < 0 || this.b >= this.a.size()) {
            return null;
        }
        return this.a.get(this.b);
    }
}
