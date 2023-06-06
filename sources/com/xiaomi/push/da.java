package com.xiaomi.push;
/* loaded from: classes6.dex */
public final class da {

    /* loaded from: classes6.dex */
    public static final class a extends de {
        boolean b;
        boolean h;
        boolean k;
        private boolean n;
        private boolean o;
        private boolean p;
        private boolean q;
        private boolean r;
        private boolean s;
        private boolean u;
        private boolean v;
        int a = 0;
        long c = 0;
        String d = "";
        String e = "";
        String f = "";
        String g = "";
        String i = "";
        private int t = 1;
        int j = 0;
        int l = 0;
        String m = "";
        private int w = -1;

        @Override // com.xiaomi.push.de
        public final int a() {
            if (this.w < 0) {
                b();
            }
            return this.w;
        }

        public final a a(int i) {
            this.n = true;
            this.a = i;
            return this;
        }

        public final a a(long j) {
            this.b = true;
            this.c = j;
            return this;
        }

        public final a a(String str) {
            this.o = true;
            this.d = str;
            return this;
        }

        public final a b(int i) {
            this.u = true;
            this.j = i;
            return this;
        }

        public final a b(String str) {
            this.p = true;
            this.e = str;
            return this;
        }

        public final a c() {
            this.r = false;
            this.g = "";
            return this;
        }

        public final a c(String str) {
            this.q = true;
            this.f = str;
            return this;
        }

        public final a d(String str) {
            this.r = true;
            this.g = str;
            return this;
        }

        public final a e(String str) {
            this.h = true;
            this.i = str;
            return this;
        }

        @Override // com.xiaomi.push.de
        public final void a(bd bdVar) {
            if (this.n) {
                bdVar.a(1, this.a);
            }
            if (this.b) {
                long j = this.c;
                bdVar.e(2, 0);
                bdVar.a(j);
            }
            if (this.o) {
                bdVar.a(3, this.d);
            }
            if (this.p) {
                bdVar.a(4, this.e);
            }
            if (this.q) {
                bdVar.a(5, this.f);
            }
            if (this.r) {
                bdVar.a(6, this.g);
            }
            if (this.h) {
                bdVar.a(7, this.i);
            }
            if (this.s) {
                bdVar.a(8, this.t);
            }
            if (this.u) {
                bdVar.a(9, this.j);
            }
            if (this.k) {
                bdVar.a(10, this.l);
            }
            if (this.v) {
                bdVar.a(11, this.m);
            }
        }

        @Override // com.xiaomi.push.de
        public final int b() {
            int c = this.n ? 0 + bd.c(1, this.a) : 0;
            if (this.b) {
                c += bd.c(2, this.c);
            }
            if (this.o) {
                c += bd.b(3, this.d);
            }
            if (this.p) {
                c += bd.b(4, this.e);
            }
            if (this.q) {
                c += bd.b(5, this.f);
            }
            if (this.r) {
                c += bd.b(6, this.g);
            }
            if (this.h) {
                c += bd.b(7, this.i);
            }
            if (this.s) {
                c += bd.c(8, this.t);
            }
            if (this.u) {
                c += bd.c(9, this.j);
            }
            if (this.k) {
                c += bd.c(10, this.l);
            }
            if (this.v) {
                c += bd.b(11, this.m);
            }
            this.w = c;
            return c;
        }

        @Override // com.xiaomi.push.de
        public final /* synthetic */ de b(ac acVar) {
            while (true) {
                int a = acVar.a();
                switch (a) {
                    case 0:
                        return this;
                    case 8:
                        a(acVar.e());
                        break;
                    case 16:
                        a(acVar.f());
                        break;
                    case 26:
                        a(acVar.c());
                        break;
                    case 34:
                        b(acVar.c());
                        break;
                    case 42:
                        c(acVar.c());
                        break;
                    case 50:
                        d(acVar.c());
                        break;
                    case 58:
                        e(acVar.c());
                        break;
                    case 64:
                        int e = acVar.e();
                        this.s = true;
                        this.t = e;
                        break;
                    case 72:
                        b(acVar.e());
                        break;
                    case 80:
                        int e2 = acVar.e();
                        this.k = true;
                        this.l = e2;
                        break;
                    case 90:
                        String c = acVar.c();
                        this.v = true;
                        this.m = c;
                        break;
                    default:
                        if (acVar.b(a)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends de {
        public boolean a;
        public boolean c;
        boolean e;
        private boolean g;
        public boolean b = false;
        private int h = 0;
        public int d = 0;
        int f = 0;
        private int i = -1;

        public static b a(byte[] bArr) {
            return (b) new b().b(bArr);
        }

        @Override // com.xiaomi.push.de
        public final int a() {
            if (this.i < 0) {
                b();
            }
            return this.i;
        }

        public final b a(int i) {
            this.g = true;
            this.h = i;
            return this;
        }

        @Override // com.xiaomi.push.de
        public final void a(bd bdVar) {
            if (this.a) {
                bdVar.a(1, this.b);
            }
            if (this.g) {
                bdVar.a(3, this.h);
            }
            if (this.c) {
                bdVar.a(4, this.d);
            }
            if (this.e) {
                bdVar.a(5, this.f);
            }
        }

        @Override // com.xiaomi.push.de
        public final int b() {
            int i = 0;
            if (this.a) {
                boolean z = this.b;
                i = 0 + bd.a(1) + 1;
            }
            if (this.g) {
                i += bd.c(3, this.h);
            }
            if (this.c) {
                i += bd.c(4, this.d);
            }
            if (this.e) {
                i += bd.c(5, this.f);
            }
            this.i = i;
            return i;
        }

        @Override // com.xiaomi.push.de
        public final /* synthetic */ de b(ac acVar) {
            while (true) {
                int a = acVar.a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    boolean b = acVar.b();
                    this.a = true;
                    this.b = b;
                } else if (a == 24) {
                    a(acVar.e());
                } else if (a == 32) {
                    int e = acVar.e();
                    this.c = true;
                    this.d = e;
                } else if (a != 40) {
                    if (!acVar.b(a)) {
                        return this;
                    }
                } else {
                    int e2 = acVar.e();
                    this.e = true;
                    this.f = e2;
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends de {
        private boolean a;
        private boolean c;
        private boolean e;
        private boolean g;
        private boolean i;
        private boolean k;
        private String b = "";
        private String d = "";
        private String f = "";
        private String h = "";
        private String j = "";
        private String l = "";
        private int m = -1;

        @Override // com.xiaomi.push.de
        public final int a() {
            if (this.m < 0) {
                b();
            }
            return this.m;
        }

        public final c a(String str) {
            this.a = true;
            this.b = str;
            return this;
        }

        public final c b(String str) {
            this.c = true;
            this.d = str;
            return this;
        }

        public final c c(String str) {
            this.e = true;
            this.f = str;
            return this;
        }

        public final c d(String str) {
            this.g = true;
            this.h = str;
            return this;
        }

        public final c e(String str) {
            this.i = true;
            this.j = str;
            return this;
        }

        public final c f(String str) {
            this.k = true;
            this.l = str;
            return this;
        }

        @Override // com.xiaomi.push.de
        public final void a(bd bdVar) {
            if (this.a) {
                bdVar.a(1, this.b);
            }
            if (this.c) {
                bdVar.a(2, this.d);
            }
            if (this.e) {
                bdVar.a(3, this.f);
            }
            if (this.g) {
                bdVar.a(4, this.h);
            }
            if (this.i) {
                bdVar.a(5, this.j);
            }
            if (this.k) {
                bdVar.a(6, this.l);
            }
        }

        @Override // com.xiaomi.push.de
        public final int b() {
            int b = this.a ? 0 + bd.b(1, this.b) : 0;
            if (this.c) {
                b += bd.b(2, this.d);
            }
            if (this.e) {
                b += bd.b(3, this.f);
            }
            if (this.g) {
                b += bd.b(4, this.h);
            }
            if (this.i) {
                b += bd.b(5, this.j);
            }
            if (this.k) {
                b += bd.b(6, this.l);
            }
            this.m = b;
            return b;
        }

        @Override // com.xiaomi.push.de
        public final /* synthetic */ de b(ac acVar) {
            while (true) {
                int a = acVar.a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    a(acVar.c());
                } else if (a == 18) {
                    b(acVar.c());
                } else if (a == 26) {
                    c(acVar.c());
                } else if (a == 34) {
                    d(acVar.c());
                } else if (a == 42) {
                    e(acVar.c());
                } else if (a == 50) {
                    f(acVar.c());
                } else if (!acVar.b(a)) {
                    return this;
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends de {
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;
        public boolean a = false;
        public String b = "";
        public String c = "";
        private String h = "";
        private int i = -1;

        @Override // com.xiaomi.push.de
        public final int a() {
            if (this.i < 0) {
                b();
            }
            return this.i;
        }

        public final d a(String str) {
            this.e = true;
            this.b = str;
            return this;
        }

        public final d a(boolean z) {
            this.d = true;
            this.a = z;
            return this;
        }

        public final d b(String str) {
            this.f = true;
            this.c = str;
            return this;
        }

        public final d c(String str) {
            this.g = true;
            this.h = str;
            return this;
        }

        @Override // com.xiaomi.push.de
        public final void a(bd bdVar) {
            if (this.d) {
                bdVar.a(1, this.a);
            }
            if (this.e) {
                bdVar.a(2, this.b);
            }
            if (this.f) {
                bdVar.a(3, this.c);
            }
            if (this.g) {
                bdVar.a(4, this.h);
            }
        }

        @Override // com.xiaomi.push.de
        public final int b() {
            int i = 0;
            if (this.d) {
                boolean z = this.a;
                i = 0 + bd.a(1) + 1;
            }
            if (this.e) {
                i += bd.b(2, this.b);
            }
            if (this.f) {
                i += bd.b(3, this.c);
            }
            if (this.g) {
                i += bd.b(4, this.h);
            }
            this.i = i;
            return i;
        }

        @Override // com.xiaomi.push.de
        public final /* synthetic */ de b(ac acVar) {
            while (true) {
                int a = acVar.a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    a(acVar.b());
                } else if (a == 18) {
                    a(acVar.c());
                } else if (a == 26) {
                    b(acVar.c());
                } else if (a == 34) {
                    c(acVar.c());
                } else if (!acVar.b(a)) {
                    return this;
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class e extends de {
        private boolean a;
        private boolean c;
        private boolean e;
        private boolean g;
        private boolean i;
        private boolean k;
        private boolean m;
        private boolean o;
        private boolean q;
        private boolean s;
        private int b = 0;
        private String d = "";
        private String f = "";
        private String h = "";
        private int j = 0;
        private String l = "";
        private String n = "";
        private String p = "";
        private b r = null;
        private int t = 0;
        private int u = -1;

        @Override // com.xiaomi.push.de
        public final int a() {
            if (this.u < 0) {
                b();
            }
            return this.u;
        }

        public final e a(int i) {
            this.a = true;
            this.b = i;
            return this;
        }

        public final e a(b bVar) {
            if (bVar != null) {
                this.q = true;
                this.r = bVar;
                return this;
            }
            throw new NullPointerException();
        }

        public final e a(String str) {
            this.c = true;
            this.d = str;
            return this;
        }

        public final e b(int i) {
            this.i = true;
            this.j = i;
            return this;
        }

        public final e b(String str) {
            this.e = true;
            this.f = str;
            return this;
        }

        public final e c(int i) {
            this.s = true;
            this.t = i;
            return this;
        }

        public final e c(String str) {
            this.g = true;
            this.h = str;
            return this;
        }

        public final e d(String str) {
            this.k = true;
            this.l = str;
            return this;
        }

        public final e e(String str) {
            this.m = true;
            this.n = str;
            return this;
        }

        public final e f(String str) {
            this.o = true;
            this.p = str;
            return this;
        }

        @Override // com.xiaomi.push.de
        public final void a(bd bdVar) {
            if (this.a) {
                bdVar.b(1, this.b);
            }
            if (this.c) {
                bdVar.a(2, this.d);
            }
            if (this.e) {
                bdVar.a(3, this.f);
            }
            if (this.g) {
                bdVar.a(4, this.h);
            }
            if (this.i) {
                bdVar.a(5, this.j);
            }
            if (this.k) {
                bdVar.a(6, this.l);
            }
            if (this.m) {
                bdVar.a(7, this.n);
            }
            if (this.o) {
                bdVar.a(8, this.p);
            }
            if (this.q) {
                bdVar.a(9, this.r);
            }
            if (this.s) {
                bdVar.a(10, this.t);
            }
        }

        @Override // com.xiaomi.push.de
        public final int b() {
            int d = this.a ? 0 + bd.d(1, this.b) : 0;
            if (this.c) {
                d += bd.b(2, this.d);
            }
            if (this.e) {
                d += bd.b(3, this.f);
            }
            if (this.g) {
                d += bd.b(4, this.h);
            }
            if (this.i) {
                d += bd.c(5, this.j);
            }
            if (this.k) {
                d += bd.b(6, this.l);
            }
            if (this.m) {
                d += bd.b(7, this.n);
            }
            if (this.o) {
                d += bd.b(8, this.p);
            }
            if (this.q) {
                d += bd.b(9, this.r);
            }
            if (this.s) {
                d += bd.c(10, this.t);
            }
            this.u = d;
            return d;
        }

        @Override // com.xiaomi.push.de
        public final /* synthetic */ de b(ac acVar) {
            while (true) {
                int a = acVar.a();
                switch (a) {
                    case 0:
                        return this;
                    case 8:
                        a(acVar.e());
                        break;
                    case 18:
                        a(acVar.c());
                        break;
                    case 26:
                        b(acVar.c());
                        break;
                    case 34:
                        c(acVar.c());
                        break;
                    case 40:
                        b(acVar.e());
                        break;
                    case 50:
                        d(acVar.c());
                        break;
                    case 58:
                        e(acVar.c());
                        break;
                    case 66:
                        f(acVar.c());
                        break;
                    case 74:
                        b bVar = new b();
                        acVar.a(bVar);
                        a(bVar);
                        break;
                    case 80:
                        c(acVar.e());
                        break;
                    default:
                        if (acVar.b(a)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class f extends de {
        boolean a;
        boolean d;
        private boolean f;
        String b = "";
        String c = "";
        b e = null;
        private int g = -1;

        @Override // com.xiaomi.push.de
        public final int a() {
            if (this.g < 0) {
                b();
            }
            return this.g;
        }

        @Override // com.xiaomi.push.de
        public final void a(bd bdVar) {
            if (this.a) {
                bdVar.a(1, this.b);
            }
            if (this.f) {
                bdVar.a(2, this.c);
            }
            if (this.d) {
                bdVar.a(3, this.e);
            }
        }

        @Override // com.xiaomi.push.de
        public final int b() {
            int b = this.a ? 0 + bd.b(1, this.b) : 0;
            if (this.f) {
                b += bd.b(2, this.c);
            }
            if (this.d) {
                b += bd.b(3, this.e);
            }
            this.g = b;
            return b;
        }

        @Override // com.xiaomi.push.de
        public final /* synthetic */ de b(ac acVar) {
            while (true) {
                int a = acVar.a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    String c = acVar.c();
                    this.a = true;
                    this.b = c;
                } else if (a == 18) {
                    String c2 = acVar.c();
                    this.f = true;
                    this.c = c2;
                } else if (a == 26) {
                    b bVar = new b();
                    acVar.a(bVar);
                    this.d = true;
                    this.e = bVar;
                } else if (!acVar.b(a)) {
                    return this;
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class g extends de {
        private boolean c;
        private boolean d;
        private boolean e;
        public String a = "";
        public String b = "";
        private String f = "";
        private int g = -1;

        @Override // com.xiaomi.push.de
        public final int a() {
            if (this.g < 0) {
                b();
            }
            return this.g;
        }

        @Override // com.xiaomi.push.de
        public final void a(bd bdVar) {
            if (this.c) {
                bdVar.a(1, this.a);
            }
            if (this.d) {
                bdVar.a(2, this.b);
            }
            if (this.e) {
                bdVar.a(3, this.f);
            }
        }

        @Override // com.xiaomi.push.de
        public final int b() {
            int b = this.c ? 0 + bd.b(1, this.a) : 0;
            if (this.d) {
                b += bd.b(2, this.b);
            }
            if (this.e) {
                b += bd.b(3, this.f);
            }
            this.g = b;
            return b;
        }

        @Override // com.xiaomi.push.de
        public final /* synthetic */ de b(ac acVar) {
            while (true) {
                int a = acVar.a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    String c = acVar.c();
                    this.c = true;
                    this.a = c;
                } else if (a == 18) {
                    String c2 = acVar.c();
                    this.d = true;
                    this.b = c2;
                } else if (a == 26) {
                    String c3 = acVar.c();
                    this.e = true;
                    this.f = c3;
                } else if (!acVar.b(a)) {
                    return this;
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class h extends de {
        private boolean c;
        private boolean d;
        public int a = 0;
        public String b = "";
        private int e = -1;

        @Override // com.xiaomi.push.de
        public final int a() {
            if (this.e < 0) {
                b();
            }
            return this.e;
        }

        @Override // com.xiaomi.push.de
        public final void a(bd bdVar) {
            if (this.c) {
                bdVar.a(1, this.a);
            }
            if (this.d) {
                bdVar.a(2, this.b);
            }
        }

        @Override // com.xiaomi.push.de
        public final int b() {
            int c = this.c ? 0 + bd.c(1, this.a) : 0;
            if (this.d) {
                c += bd.b(2, this.b);
            }
            this.e = c;
            return c;
        }

        @Override // com.xiaomi.push.de
        public final /* synthetic */ de b(ac acVar) {
            while (true) {
                int a = acVar.a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    int e = acVar.e();
                    this.c = true;
                    this.a = e;
                } else if (a == 18) {
                    String c = acVar.c();
                    this.d = true;
                    this.b = c;
                } else if (!acVar.b(a)) {
                    return this;
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class i extends de {
        public boolean a;
        public com.xiaomi.push.a b = com.xiaomi.push.a.b;
        private int c = -1;

        @Override // com.xiaomi.push.de
        public final int a() {
            if (this.c < 0) {
                b();
            }
            return this.c;
        }

        public final i a(com.xiaomi.push.a aVar) {
            this.a = true;
            this.b = aVar;
            return this;
        }

        @Override // com.xiaomi.push.de
        public final void a(bd bdVar) {
            if (this.a) {
                bdVar.a(1, this.b);
            }
        }

        @Override // com.xiaomi.push.de
        public final int b() {
            int b = this.a ? 0 + bd.b(1, this.b) : 0;
            this.c = b;
            return b;
        }

        @Override // com.xiaomi.push.de
        public final /* synthetic */ de b(ac acVar) {
            while (true) {
                int a = acVar.a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    a(acVar.d());
                } else if (!acVar.b(a)) {
                    return this;
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class j extends de {
        public boolean a;
        private boolean c;
        private com.xiaomi.push.a d = com.xiaomi.push.a.b;
        public b b = null;
        private int e = -1;

        @Override // com.xiaomi.push.de
        public final int a() {
            if (this.e < 0) {
                b();
            }
            return this.e;
        }

        public final j a(com.xiaomi.push.a aVar) {
            this.c = true;
            this.d = aVar;
            return this;
        }

        @Override // com.xiaomi.push.de
        public final void a(bd bdVar) {
            if (this.c) {
                bdVar.a(1, this.d);
            }
            if (this.a) {
                bdVar.a(2, this.b);
            }
        }

        @Override // com.xiaomi.push.de
        public final int b() {
            int b = this.c ? 0 + bd.b(1, this.d) : 0;
            if (this.a) {
                b += bd.b(2, this.b);
            }
            this.e = b;
            return b;
        }

        @Override // com.xiaomi.push.de
        public final /* synthetic */ de b(ac acVar) {
            while (true) {
                int a = acVar.a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    a(acVar.d());
                } else if (a == 18) {
                    b bVar = new b();
                    acVar.a(bVar);
                    this.a = true;
                    this.b = bVar;
                } else if (!acVar.b(a)) {
                    return this;
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class k extends de {
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        public String a = "";
        public String b = "";
        public long c = 0;
        public long d = 0;
        public boolean e = false;
        public int f = 0;
        private int m = -1;

        @Override // com.xiaomi.push.de
        public final int a() {
            if (this.m < 0) {
                b();
            }
            return this.m;
        }

        @Override // com.xiaomi.push.de
        public final void a(bd bdVar) {
            if (this.g) {
                bdVar.a(1, this.a);
            }
            if (this.h) {
                bdVar.a(2, this.b);
            }
            if (this.i) {
                bdVar.a(3, this.c);
            }
            if (this.j) {
                bdVar.a(4, this.d);
            }
            if (this.k) {
                bdVar.a(5, this.e);
            }
            if (this.l) {
                bdVar.a(6, this.f);
            }
        }

        @Override // com.xiaomi.push.de
        public final int b() {
            int b = this.g ? 0 + bd.b(1, this.a) : 0;
            if (this.h) {
                b += bd.b(2, this.b);
            }
            if (this.i) {
                b += bd.b(3, this.c);
            }
            if (this.j) {
                b += bd.b(4, this.d);
            }
            if (this.k) {
                boolean z = this.e;
                b += bd.a(5) + 1;
            }
            if (this.l) {
                b += bd.c(6, this.f);
            }
            this.m = b;
            return b;
        }

        @Override // com.xiaomi.push.de
        public final /* synthetic */ de b(ac acVar) {
            while (true) {
                int a = acVar.a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    String c = acVar.c();
                    this.g = true;
                    this.a = c;
                } else if (a == 18) {
                    String c2 = acVar.c();
                    this.h = true;
                    this.b = c2;
                } else if (a == 24) {
                    long f = acVar.f();
                    this.i = true;
                    this.c = f;
                } else if (a == 32) {
                    long f2 = acVar.f();
                    this.j = true;
                    this.d = f2;
                } else if (a == 40) {
                    boolean b = acVar.b();
                    this.k = true;
                    this.e = b;
                } else if (a == 48) {
                    int e = acVar.e();
                    this.l = true;
                    this.f = e;
                } else if (!acVar.b(a)) {
                    return this;
                }
            }
        }
    }
}
