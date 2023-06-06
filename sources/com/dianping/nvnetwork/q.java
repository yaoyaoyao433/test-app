package com.dianping.nvnetwork;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import dianping.com.nvlinker.stub.IResponse;
import dianping.com.nvlinker.stub.IResponseBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class q implements IResponse {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public String d;
    int e;
    public boolean f;
    public long g;
    public byte[] h;
    public long i;
    public Object j;
    public String k;
    public String l;
    public Map<String, String> m;
    f n;
    private byte[] o;
    private Object p;
    private int q;
    private HashMap<String, String> r;
    private boolean s;
    private List<Object> t;
    private String u;
    private String v;

    @Override // dianping.com.nvlinker.stub.IResponse
    public final int statusCode() {
        return this.q;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d32f00d48f0c6030f3cd46e1542b497", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d32f00d48f0c6030f3cd46e1542b497");
        } else {
            this.i = j;
        }
    }

    @Override // dianping.com.nvlinker.stub.IResponse
    public final HashMap<String, String> headers() {
        return this.r;
    }

    @Override // dianping.com.nvlinker.stub.IResponse
    public final boolean isSuccess() {
        return this.s;
    }

    @Override // dianping.com.nvlinker.stub.IResponse
    public final byte[] result() {
        return this.o;
    }

    @Override // dianping.com.nvlinker.stub.IResponse
    public final Object error() {
        return this.p;
    }

    public final void a(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f891086501acd35a98a551e93d5f0afd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f891086501acd35a98a551e93d5f0afd");
        } else if (map != null) {
            this.m = new HashMap(map);
        }
    }

    public q(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec6029573467b6c26a73c56563de582d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec6029573467b6c26a73c56563de582d");
            return;
        }
        this.c = 2;
        this.t = null;
        this.u = null;
        this.v = null;
        this.o = aVar.b;
        this.q = aVar.c;
        this.r = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.s = aVar.i;
        this.p = aVar.j;
        this.j = aVar.k;
        this.e = aVar.d;
        this.c = aVar.m;
        this.b = aVar.l;
        this.d = aVar.n;
        this.k = aVar.o;
        this.m = aVar.q;
    }

    public final a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31c444b620d350756e402e4c0509af57", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31c444b620d350756e402e4c0509af57") : new a(this);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a implements IResponseBuilder {
        public static ChangeQuickRedirect a;
        public byte[] b;
        public int c;
        public int d;
        public HashMap<String, String> e;
        public boolean f;
        public long g;
        public byte[] h;
        public boolean i;
        public Object j;
        public Object k;
        public int l;
        public int m;
        public String n;
        public String o;
        public String p;
        public Map<String, String> q;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ed50f85d84b87a5b29ca1df3e591ffc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ed50f85d84b87a5b29ca1df3e591ffc");
                return;
            }
            this.l = 1;
            this.m = 2;
        }

        public a(q qVar) {
            Object[] objArr = {qVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42d19745ad46272ab1f26f07373477cf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42d19745ad46272ab1f26f07373477cf");
                return;
            }
            this.l = 1;
            this.m = 2;
            this.b = qVar.o;
            this.c = qVar.q;
            this.e = qVar.r;
            this.f = qVar.f;
            this.g = qVar.g;
            this.h = qVar.h;
            this.i = qVar.s;
            this.j = qVar.p;
            this.k = qVar.j;
            this.d = qVar.e;
            this.l = qVar.b;
            this.m = qVar.c;
            this.n = qVar.d;
            this.o = qVar.k;
            this.p = qVar.l;
            this.q = qVar.m;
        }

        public final a a(int i) {
            this.c = i;
            return this;
        }

        public final a a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb69bdbfce18df79031cb8faa466056f", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb69bdbfce18df79031cb8faa466056f");
            }
            this.g = j;
            return this;
        }

        public final a a(Object obj) {
            this.j = obj;
            return this;
        }

        @Override // dianping.com.nvlinker.stub.IResponseBuilder
        /* renamed from: a */
        public final q build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67d9abc3a1afb84e6586f8785a5f1269", 6917529027641081856L) ? (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67d9abc3a1afb84e6586f8785a5f1269") : new q(this);
        }
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b414ffd6b1bb0f9402828c14edc5074", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b414ffd6b1bb0f9402828c14edc5074");
        }
        switch (this.b) {
            case 0:
                return "http";
            case 1:
                return "tunnel";
            case 2:
            case 5:
            case 6:
            case 7:
            default:
                return CommonConstant.Symbol.QUESTION_MARK;
            case 3:
                return "utn";
            case 4:
                return "wns";
            case 8:
                return "https";
        }
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c9a0fd38471e5533fdd210d6a6413b8", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c9a0fd38471e5533fdd210d6a6413b8");
        }
        switch (this.c) {
            case 2:
                return "cip";
            case 3:
                return "http(shark)";
            case 4:
                return "wns";
            case 5:
                return "quic";
            default:
                return CommonConstant.Symbol.QUESTION_MARK;
        }
    }
}
