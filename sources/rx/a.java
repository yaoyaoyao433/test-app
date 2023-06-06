package rx;

import rx.annotations.Experimental;
/* compiled from: ProGuard */
@Experimental
/* loaded from: classes7.dex */
public final class a {
    public static final d a = c.a;
    public static final d b = c.a;
    public static final d c = b.a;
    public static final d d = C1541a.a;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface d {
        boolean a() throws rx.exceptions.c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class b implements d {
        static final b a = new b();

        @Override // rx.a.d
        public final boolean a() {
            return true;
        }

        private b() {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: rx.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C1541a implements d {
        static final C1541a a = new C1541a();

        @Override // rx.a.d
        public final boolean a() {
            return false;
        }

        private C1541a() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class c implements d {
        static final c a = new c();

        private c() {
        }

        @Override // rx.a.d
        public final boolean a() throws rx.exceptions.c {
            throw new rx.exceptions.c("Overflowed buffer");
        }
    }
}
