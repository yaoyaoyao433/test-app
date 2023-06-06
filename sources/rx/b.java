package rx;

import rx.annotations.Experimental;
/* compiled from: ProGuard */
@Experimental
/* loaded from: classes7.dex */
public class b {
    static final rx.plugins.b a = rx.plugins.e.a().b();
    static rx.plugins.a b;
    static final b c;
    static final b d;
    private final a e;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface a extends rx.functions.b<InterfaceC1543b> {
    }

    /* compiled from: ProGuard */
    /* renamed from: rx.b$b  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public interface InterfaceC1543b {
    }

    static {
        final rx.plugins.e a2 = rx.plugins.e.a();
        if (a2.b.get() == null) {
            Object a3 = rx.plugins.e.a(rx.plugins.a.class, System.getProperties());
            if (a3 == null) {
                a2.b.compareAndSet(null, new rx.plugins.a() { // from class: rx.plugins.e.2
                });
            } else {
                a2.b.compareAndSet(null, (rx.plugins.a) a3);
            }
        }
        b = a2.b.get();
        c = a(new a() { // from class: rx.b.1
            @Override // rx.functions.b
            public final /* synthetic */ void call(InterfaceC1543b interfaceC1543b) {
                rx.subscriptions.e.b();
            }
        });
        d = a(new a() { // from class: rx.b.3
            @Override // rx.functions.b
            public final /* synthetic */ void call(InterfaceC1543b interfaceC1543b) {
                rx.subscriptions.e.b();
            }
        });
    }

    private static b a(a aVar) {
        a(aVar);
        try {
            return new b(aVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public static b a(final d<?> dVar) {
        a(dVar);
        return a(new a() { // from class: rx.b.2
            @Override // rx.functions.b
            public final /* synthetic */ void call(InterfaceC1543b interfaceC1543b) {
                final InterfaceC1543b interfaceC1543b2 = interfaceC1543b;
                d.this.a((j) new j<Object>() { // from class: rx.b.2.1
                    @Override // rx.e
                    public final void onCompleted() {
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                    }

                    @Override // rx.e
                    public final void onNext(Object obj) {
                    }
                });
            }
        });
    }

    private static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    private b(a aVar) {
        this.e = rx.plugins.a.a(aVar);
    }
}
