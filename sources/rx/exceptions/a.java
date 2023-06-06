package rx.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import rx.annotations.Experimental;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    public final List<Throwable> a;
    private final String b;
    private Throwable c;

    @Deprecated
    private a(String str, Collection<? extends Throwable> collection) {
        this.c = null;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            for (Throwable th : collection) {
                if (th instanceof a) {
                    linkedHashSet.addAll(((a) th).a);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        this.a = Collections.unmodifiableList(arrayList);
        this.b = this.a.size() + " exceptions occurred. ";
    }

    public a(Collection<? extends Throwable> collection) {
        this(null, collection);
    }

    @Experimental
    public a(Throwable... thArr) {
        this.c = null;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Throwable th = thArr[i];
            if (th instanceof a) {
                linkedHashSet.addAll(((a) th).a);
            } else if (th != null) {
                linkedHashSet.add(th);
            } else {
                linkedHashSet.add(new NullPointerException());
            }
        }
        arrayList.addAll(linkedHashSet);
        this.a = Collections.unmodifiableList(arrayList);
        this.b = this.a.size() + " exceptions occurred. ";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        if (this.c == null) {
            Throwable c1544a = new C1544a();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.a.iterator();
            Throwable th = c1544a;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    for (Throwable th2 : a(next)) {
                        if (hashSet.contains(th2)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th2);
                        }
                    }
                    try {
                        th.initCause(next);
                    } catch (Throwable unused) {
                    }
                    th = b(th);
                }
            }
            this.c = c1544a;
        }
        return this.c;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        a(new c(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        a(new d(printWriter));
    }

    private void a(b bVar) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append("\n");
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append("\n");
        }
        int i = 1;
        for (Throwable th : this.a) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            a(sb, th, "\t");
            i++;
        }
        synchronized (bVar.a()) {
            bVar.a(sb.toString());
        }
    }

    private void a(StringBuilder sb, Throwable th, String str) {
        StackTraceElement[] stackTrace;
        while (true) {
            sb.append(str);
            sb.append(th);
            sb.append("\n");
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb.append("\t\tat ");
                sb.append(stackTraceElement);
                sb.append("\n");
            }
            if (th.getCause() == null) {
                return;
            }
            sb.append("\tCaused by: ");
            th = th.getCause();
            str = "";
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static abstract class b {
        abstract Object a();

        abstract void a(Object obj);

        private b() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class c extends b {
        private final PrintStream a;

        c(PrintStream printStream) {
            super();
            this.a = printStream;
        }

        @Override // rx.exceptions.a.b
        final Object a() {
            return this.a;
        }

        @Override // rx.exceptions.a.b
        final void a(Object obj) {
            this.a.println(obj);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class d extends b {
        private final PrintWriter a;

        d(PrintWriter printWriter) {
            super();
            this.a = printWriter;
        }

        @Override // rx.exceptions.a.b
        final Object a() {
            return this.a;
        }

        @Override // rx.exceptions.a.b
        final void a(Object obj) {
            this.a.println(obj);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: rx.exceptions.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C1544a extends RuntimeException {
        static String a = "Chain of Causes for CompositeException In Order Received =>";
        private static final long serialVersionUID = 3875212506787802066L;

        C1544a() {
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return a;
        }
    }

    private static List<Throwable> a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause == null || cause == th) {
            return arrayList;
        }
        while (true) {
            arrayList.add(cause);
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause.getCause();
        }
        return arrayList;
    }

    private static Throwable b(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || cause == th) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause.getCause();
        }
        return cause;
    }
}
