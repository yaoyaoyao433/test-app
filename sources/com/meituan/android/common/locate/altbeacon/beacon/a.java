package com.meituan.android.common.locate.altbeacon.beacon;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected List<Identifier> b;
    protected List<Long> c;
    protected List<Long> d;
    protected int e;
    protected int f;
    protected int g;
    protected byte[] h;
    protected boolean i;
    protected long j;
    protected long k;
    private int n;
    private int o;
    private Double p;
    private static final List<Long> l = Collections.unmodifiableList(new ArrayList());
    private static final List<Identifier> m = Collections.unmodifiableList(new ArrayList());
    protected static boolean a = false;

    /* renamed from: com.meituan.android.common.locate.altbeacon.beacon.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0206a {
        public static ChangeQuickRedirect changeQuickRedirect;
        protected final a a;
        private Identifier b;
        private Identifier c;
        private Identifier d;

        public C0206a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25f14c82dd5b016816fdc247daf14edf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25f14c82dd5b016816fdc247daf14edf");
            } else {
                this.a = new a();
            }
        }

        public C0206a a(int i) {
            this.a.e = i;
            return this;
        }

        public C0206a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5536871630c3d99bcc310c0fa60a1837", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0206a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5536871630c3d99bcc310c0fa60a1837");
            }
            this.b = Identifier.parse(str);
            return this;
        }

        public C0206a a(List<Long> list) {
            this.a.c = list;
            return this;
        }

        public a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90bdcc5dbc1f137516d4338a3b690611", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90bdcc5dbc1f137516d4338a3b690611");
            }
            if (this.b != null) {
                this.a.b.add(this.b);
                if (this.c != null) {
                    this.a.b.add(this.c);
                    if (this.d != null) {
                        this.a.b.add(this.d);
                    }
                }
            }
            return this.a;
        }

        public C0206a b(int i) {
            this.a.f = i;
            return this;
        }

        public C0206a b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc4c51e2fc4f0c81201613771afadb79", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0206a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc4c51e2fc4f0c81201613771afadb79");
            }
            this.c = Identifier.parse(str);
            return this;
        }

        public C0206a c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ffcd270520c090342f943c90ef4dbc4", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0206a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ffcd270520c090342f943c90ef4dbc4");
            }
            this.d = Identifier.parse(str);
            return this;
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5300419516bf75747c43e3138a64f845", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5300419516bf75747c43e3138a64f845");
            return;
        }
        this.n = 0;
        this.o = 0;
        this.p = null;
        this.g = -1;
        this.h = new byte[0];
        this.i = false;
        this.j = 0L;
        this.k = 0L;
        this.b = new ArrayList(1);
        this.c = new ArrayList(1);
        this.d = new ArrayList(1);
    }

    public int a() {
        return this.f;
    }

    public Identifier a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (Identifier) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "313c67fa328acb373101123b883d9619", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "313c67fa328acb373101123b883d9619") : this.b.get(i));
    }

    public Identifier b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (Identifier) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43bddb64a27ecf3f2a1d79e740f2bafc", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43bddb64a27ecf3f2a1d79e740f2bafc") : this.b.get(0));
    }

    public Identifier c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (Identifier) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d591e903617f6812e32c695bf4b15fda", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d591e903617f6812e32c695bf4b15fda") : this.b.get(1));
    }

    public Identifier d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (Identifier) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fe1f7682ba1828d676cf9e86f52dc20", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fe1f7682ba1828d676cf9e86f52dc20") : this.b.get(2));
    }

    public List<Long> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "876f772ceeff78876558e25d2dd45475", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "876f772ceeff78876558e25d2dd45475") : this.c.getClass().isInstance(l) ? this.c : Collections.unmodifiableList(this.c);
    }

    public List<Identifier> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2408002c71729d5670bc8e3ab276f86", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2408002c71729d5670bc8e3ab276f86") : this.b.getClass().isInstance(m) ? this.b : Collections.unmodifiableList(this.b);
    }

    public int g() {
        return this.e;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a89c6843bb1c2f11c6ac4bbc80d858d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a89c6843bb1c2f11c6ac4bbc80d858d");
        }
        if (this.b == null || this.b.size() < 3) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (b() != null) {
            sb.append("uuid:");
            sb.append(b().toString());
        }
        if (c() != null) {
            sb.append(" major:");
            sb.append(c().toString());
        }
        if (d() != null) {
            sb.append(" minor:");
            sb.append(d().toString());
        }
        return sb.toString();
    }
}
