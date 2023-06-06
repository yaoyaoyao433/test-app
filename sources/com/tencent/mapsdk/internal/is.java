package com.tencent.mapsdk.internal;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class is extends iv {
    private a b;
    private long q;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    @Override // com.tencent.mapsdk.internal.iv
    protected final void a(float f) {
    }

    public is() {
        super(null);
        this.q = -1L;
    }

    @Override // com.tencent.mapsdk.internal.iv
    protected final boolean c(long j) {
        if (this.j == 0) {
            this.j = 1;
            if (this.i < 0) {
                this.h = j;
            } else {
                this.h = j - this.i;
                this.i = -1L;
            }
        }
        if (this.b != null) {
            this.q = j;
            return false;
        }
        return false;
    }

    private void a(a aVar) {
        this.b = aVar;
    }
}
