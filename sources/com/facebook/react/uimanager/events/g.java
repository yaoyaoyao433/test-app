package com.facebook.react.uimanager.events;

import android.support.v4.internal.view.SupportMenu;
import android.util.SparseIntArray;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    private final SparseIntArray a = new SparseIntArray();

    public final void a(long j) {
        this.a.put((int) j, 0);
    }

    public final void b(long j) {
        int i = (int) j;
        int i2 = this.a.get(i, -1);
        if (i2 == -1) {
            throw new RuntimeException("Tried to increment non-existent cookie");
        }
        this.a.put(i, i2 + 1);
    }

    public final short c(long j) {
        int i = this.a.get((int) j, -1);
        if (i != -1) {
            return (short) (i & SupportMenu.USER_MASK);
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    public final void d(long j) {
        this.a.delete((int) j);
    }

    public final boolean e(long j) {
        return this.a.get((int) j, -1) != -1;
    }
}
