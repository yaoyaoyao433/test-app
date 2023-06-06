package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes6.dex */
public final class cz {

    /* loaded from: classes6.dex */
    public static final class a extends de {
        private boolean c;
        private boolean d;
        private boolean f;
        private boolean h;
        public int a = 0;
        private boolean e = false;
        private int g = 0;
        private boolean i = false;
        public List<String> b = Collections.emptyList();
        private int j = -1;

        public static a a(ac acVar) {
            return new a().b(acVar);
        }

        @Override // com.xiaomi.push.de
        public final int a() {
            if (this.j < 0) {
                b();
            }
            return this.j;
        }

        @Override // com.xiaomi.push.de
        public final void a(bd bdVar) {
            if (this.c) {
                bdVar.b(1, this.a);
            }
            if (this.d) {
                bdVar.a(2, this.e);
            }
            if (this.f) {
                bdVar.a(3, this.g);
            }
            if (this.h) {
                bdVar.a(4, this.i);
            }
            for (String str : this.b) {
                bdVar.a(5, str);
            }
        }

        @Override // com.xiaomi.push.de
        public final int b() {
            int i = 0;
            int d = this.c ? bd.d(1, this.a) + 0 : 0;
            if (this.d) {
                boolean z = this.e;
                d += bd.a(2) + 1;
            }
            if (this.f) {
                d += bd.c(3, this.g);
            }
            if (this.h) {
                boolean z2 = this.i;
                d += bd.a(4) + 1;
            }
            for (String str : this.b) {
                i += bd.a(str);
            }
            int size = d + i + (this.b.size() * 1);
            this.j = size;
            return size;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.xiaomi.push.de
        /* renamed from: c */
        public a b(ac acVar) {
            while (true) {
                int a = acVar.a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    int e = acVar.e();
                    this.c = true;
                    this.a = e;
                } else if (a == 16) {
                    boolean b = acVar.b();
                    this.d = true;
                    this.e = b;
                } else if (a == 24) {
                    int e2 = acVar.e();
                    this.f = true;
                    this.g = e2;
                } else if (a == 32) {
                    boolean b2 = acVar.b();
                    this.h = true;
                    this.i = b2;
                } else if (a != 42) {
                    if (!acVar.b(a)) {
                        return this;
                    }
                } else {
                    String c = acVar.c();
                    if (c == null) {
                        throw new NullPointerException();
                    }
                    if (this.b.isEmpty()) {
                        this.b = new ArrayList();
                    }
                    this.b.add(c);
                }
            }
        }
    }
}
