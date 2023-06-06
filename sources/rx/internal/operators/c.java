package rx.internal.operators;

import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c<T> {
    private static final c a = new c();
    private static final Object b = new Serializable() { // from class: rx.internal.operators.c.1
        private static final long serialVersionUID = 1;

        public final String toString() {
            return "Notification=>Completed";
        }
    };
    private static final Object c = new Serializable() { // from class: rx.internal.operators.c.2
        private static final long serialVersionUID = 2;

        public final String toString() {
            return "Notification=>NULL";
        }
    };

    private c() {
    }

    public static <T> c<T> a() {
        return a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static class a implements Serializable {
        private static final long serialVersionUID = 3;
        final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public String toString() {
            return "Notification=>Error:" + this.a;
        }
    }

    public static Object a(T t) {
        return t == null ? c : t;
    }

    public static Object b() {
        return b;
    }

    public static Object a(Throwable th) {
        return new a(th);
    }

    public static boolean a(rx.e<? super T> eVar, Object obj) {
        if (obj == b) {
            eVar.onCompleted();
            return true;
        } else if (obj == c) {
            eVar.onNext(null);
            return false;
        } else if (obj != null) {
            if (obj.getClass() == a.class) {
                eVar.onError(((a) obj).a);
                return true;
            }
            eVar.onNext(obj);
            return false;
        } else {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
    }

    public static boolean b(Object obj) {
        return obj == b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static T c(Object obj) {
        if (obj == c) {
            return null;
        }
        return obj;
    }
}
