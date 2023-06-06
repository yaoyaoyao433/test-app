package rx.exceptions;

import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class g extends RuntimeException {
    private static final long serialVersionUID = -569558213262703934L;

    public static Throwable a(Throwable th, Object obj) {
        if (th == null) {
            th = new NullPointerException();
        }
        Throwable c = b.c(th);
        if (c != null && (c instanceof a) && ((a) c).a == obj) {
            return th;
        }
        b.a(th, new a(obj));
        return th;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class a extends RuntimeException {
        private static final long serialVersionUID = -3454462756050397899L;
        final Object a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "OnError while emitting onNext value: "
                r0.<init>(r1)
                if (r4 != 0) goto Lc
                java.lang.String r1 = "null"
                goto L51
            Lc:
                java.util.Set<java.lang.Class<?>> r1 = rx.exceptions.g.a.C1545a.a
                java.lang.Class r2 = r4.getClass()
                boolean r1 = r1.contains(r2)
                if (r1 == 0) goto L1d
                java.lang.String r1 = r4.toString()
                goto L51
            L1d:
                boolean r1 = r4 instanceof java.lang.String
                if (r1 == 0) goto L25
                r1 = r4
                java.lang.String r1 = (java.lang.String) r1
                goto L51
            L25:
                boolean r1 = r4 instanceof java.lang.Enum
                if (r1 == 0) goto L31
                r1 = r4
                java.lang.Enum r1 = (java.lang.Enum) r1
                java.lang.String r1 = r1.name()
                goto L51
            L31:
                rx.plugins.e r1 = rx.plugins.e.a()
                r1.b()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.Class r2 = r4.getClass()
                java.lang.String r2 = r2.getName()
                r1.append(r2)
                java.lang.String r2 = ".class"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
            L51:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                r3.a = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.exceptions.g.a.<init>(java.lang.Object):void");
        }

        /* compiled from: ProGuard */
        /* renamed from: rx.exceptions.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C1545a {
            static final Set<Class<?>> a;

            static {
                HashSet hashSet = new HashSet();
                hashSet.add(Boolean.class);
                hashSet.add(Character.class);
                hashSet.add(Byte.class);
                hashSet.add(Short.class);
                hashSet.add(Integer.class);
                hashSet.add(Long.class);
                hashSet.add(Float.class);
                hashSet.add(Double.class);
                a = hashSet;
            }
        }
    }
}
