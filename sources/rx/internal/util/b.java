package rx.internal.util;

import java.util.concurrent.atomic.AtomicLong;
import rx.annotations.Experimental;
/* compiled from: ProGuard */
@Experimental
/* loaded from: classes7.dex */
public final class b extends AtomicLong implements rx.f {
    private static final long serialVersionUID = 2826241102729529449L;
    protected boolean a;
    protected volatile boolean b;
    protected Throwable c;
    protected final a d;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface a {
        Object a();

        void a(Throwable th);

        boolean a(Object obj);

        Object b();
    }

    public b(a aVar) {
        this.d = aVar;
    }

    public final void a() {
        this.b = true;
        b();
    }

    public final void a(Throwable th) {
        if (this.b) {
            return;
        }
        this.c = th;
        this.b = true;
        b();
    }

    @Override // rx.f
    public final void a(long j) {
        long j2;
        boolean z;
        long j3;
        if (j == 0) {
            return;
        }
        do {
            j2 = get();
            z = j2 == 0;
            j3 = Long.MAX_VALUE;
            if (j2 == Long.MAX_VALUE) {
                break;
            } else if (j == Long.MAX_VALUE) {
                j3 = j;
                z = true;
            } else if (j2 <= Long.MAX_VALUE - j) {
                j3 = j2 + j;
            }
        } while (!compareAndSet(j2, j3));
        if (z) {
            b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
        if (r9 != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0043, code lost:
        r1 = r13.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
        if (r5.a() == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004b, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
        if (get() != Long.MAX_VALUE) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
        if (r2 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:
        if (r1 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005f, code lost:
        r13.a = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0061, code lost:
        monitor-exit(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0062, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0063, code lost:
        r2 = Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0067, code lost:
        r9 = addAndGet(-r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006d, code lost:
        if (r9 == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006f, code lost:
        if (r2 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0071, code lost:
        if (r1 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0073, code lost:
        if (r2 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0076, code lost:
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0079, code lost:
        r13.a = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007b, code lost:
        monitor-exit(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x007d, code lost:
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007f, code lost:
        monitor-exit(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0080, code lost:
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r13 = this;
            monitor-enter(r13)
            boolean r0 = r13.a     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto L7
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L90
            return
        L7:
            r0 = 1
            r13.a = r0     // Catch: java.lang.Throwable -> L90
            boolean r1 = r13.b     // Catch: java.lang.Throwable -> L90
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L90
            long r2 = r13.get()
            r4 = 0
            rx.internal.util.b$a r5 = r13.d     // Catch: java.lang.Throwable -> L83
        L14:
            r6 = 0
        L15:
            r7 = 0
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 > 0) goto L1d
            if (r1 == 0) goto L42
        L1d:
            if (r1 == 0) goto L2f
            java.lang.Object r10 = r5.a()     // Catch: java.lang.Throwable -> L83
            if (r10 != 0) goto L2d
            java.lang.Throwable r1 = r13.c     // Catch: java.lang.Throwable -> L2b
            r5.a(r1)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r1 = move-exception
            goto L85
        L2d:
            if (r9 == 0) goto L42
        L2f:
            java.lang.Object r9 = r5.b()     // Catch: java.lang.Throwable -> L83
            if (r9 == 0) goto L42
            boolean r7 = r5.a(r9)     // Catch: java.lang.Throwable -> L83
            if (r7 == 0) goto L3c
            return
        L3c:
            r7 = 1
            long r2 = r2 - r7
            int r6 = r6 + 1
            goto L15
        L42:
            monitor-enter(r13)     // Catch: java.lang.Throwable -> L83
            boolean r1 = r13.b     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r2 = r5.a()     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto L4d
            r2 = 1
            goto L4e
        L4d:
            r2 = 0
        L4e:
            long r9 = r13.get()     // Catch: java.lang.Throwable -> L7d
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 != 0) goto L65
            if (r2 != 0) goto L63
            if (r1 != 0) goto L63
            r13.a = r4     // Catch: java.lang.Throwable -> L81
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L81
            return
        L63:
            r2 = r11
            goto L77
        L65:
            int r3 = -r6
            long r9 = (long) r3
            long r9 = r13.addAndGet(r9)     // Catch: java.lang.Throwable -> L7d
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 == 0) goto L71
            if (r2 != 0) goto L76
        L71:
            if (r1 == 0) goto L79
            if (r2 == 0) goto L76
            goto L79
        L76:
            r2 = r9
        L77:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L7d
            goto L14
        L79:
            r13.a = r4     // Catch: java.lang.Throwable -> L81
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L81
            return
        L7d:
            r1 = move-exception
            r0 = 0
        L7f:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L81
            throw r1     // Catch: java.lang.Throwable -> L2b
        L81:
            r1 = move-exception
            goto L7f
        L83:
            r1 = move-exception
            r0 = 0
        L85:
            if (r0 != 0) goto L8f
            monitor-enter(r13)
            r13.a = r4     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L8c
            goto L8f
        L8c:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L8c
            throw r0
        L8f:
            throw r1
        L90:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L90
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.util.b.b():void");
    }
}
