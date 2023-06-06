package rx.internal.producers;

import rx.f;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a implements f {
    static final f g = new f() { // from class: rx.internal.producers.a.1
        @Override // rx.f
        public final void a(long j) {
        }
    };
    long a;
    f b;
    boolean c;
    long d;
    long e;
    f f;

    @Override // rx.f
    public final void a(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (i == 0) {
            return;
        }
        synchronized (this) {
            if (this.c) {
                this.d += j;
                return;
            }
            this.c = true;
            try {
                long j2 = this.a + j;
                if (j2 < 0) {
                    j2 = Long.MAX_VALUE;
                }
                this.a = j2;
                f fVar = this.b;
                if (fVar != null) {
                    fVar.a(j);
                }
                a();
            } catch (Throwable th) {
                synchronized (this) {
                    this.c = false;
                    throw th;
                }
            }
        }
    }

    public final void b(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("n > 0 required");
        }
        synchronized (this) {
            if (this.c) {
                this.e += j;
                return;
            }
            this.c = true;
            try {
                long j2 = this.a;
                if (j2 != Long.MAX_VALUE) {
                    long j3 = j2 - j;
                    if (j3 < 0) {
                        throw new IllegalStateException("more items arrived than were requested");
                    }
                    this.a = j3;
                }
                a();
            } catch (Throwable th) {
                synchronized (this) {
                    this.c = false;
                    throw th;
                }
            }
        }
    }

    public final void a(f fVar) {
        synchronized (this) {
            if (this.c) {
                if (fVar == null) {
                    fVar = g;
                }
                this.f = fVar;
                return;
            }
            this.c = true;
            try {
                this.b = fVar;
                if (fVar != null) {
                    fVar.a(this.a);
                }
                a();
            } catch (Throwable th) {
                synchronized (this) {
                    this.c = false;
                    throw th;
                }
            }
        }
    }

    private void a() {
        while (true) {
            synchronized (this) {
                long j = this.d;
                long j2 = this.e;
                f fVar = this.f;
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i == 0 && j2 == 0 && fVar == null) {
                    this.c = false;
                    return;
                }
                this.d = 0L;
                this.e = 0L;
                this.f = null;
                long j3 = this.a;
                if (j3 != Long.MAX_VALUE) {
                    long j4 = j3 + j;
                    if (j4 < 0 || j4 == Long.MAX_VALUE) {
                        this.a = Long.MAX_VALUE;
                        j3 = Long.MAX_VALUE;
                    } else {
                        j3 = j4 - j2;
                        if (j3 < 0) {
                            throw new IllegalStateException("more produced than requested");
                        }
                        this.a = j3;
                    }
                }
                if (fVar != null) {
                    if (fVar == g) {
                        this.b = null;
                    } else {
                        this.b = fVar;
                        fVar.a(j3);
                    }
                } else {
                    f fVar2 = this.b;
                    if (fVar2 != null && i != 0) {
                        fVar2.a(j);
                    }
                }
            }
        }
    }
}
