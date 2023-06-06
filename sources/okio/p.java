package okio;

import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class p {
    @Nullable
    static Segment a;
    static long b;

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Segment a() {
        synchronized (p.class) {
            if (a != null) {
                Segment segment = a;
                a = segment.next;
                segment.next = null;
                b -= 8192;
                return segment;
            }
            return new Segment();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Segment segment) {
        if (segment.next != null || segment.prev != null) {
            throw new IllegalArgumentException();
        }
        if (segment.shared) {
            return;
        }
        synchronized (p.class) {
            if (b + 8192 > 65536) {
                return;
            }
            b += 8192;
            segment.next = a;
            segment.limit = 0;
            segment.pos = 0;
            a = segment;
        }
    }
}
