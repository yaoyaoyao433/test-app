package com.sankuai.xm.login.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.channels.Selector;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d {
    public static ChangeQuickRedirect a;
    protected int b;
    protected Selector c;
    protected com.sankuai.xm.login.net.a d;

    public void a() {
    }

    public void a(String str, int i) {
    }

    public void a(String str, byte[] bArr, int i, int i2) {
    }

    public void a(boolean z, int i) {
    }

    public void b() {
    }

    public void c() {
    }

    public void cancel(String str) {
    }

    public d(int i, Selector selector, com.sankuai.xm.login.net.a aVar) {
        Object[] objArr = {Integer.valueOf(i), selector, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b98d32a23d495b21f9099a379f1d5715", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b98d32a23d495b21f9099a379f1d5715");
            return;
        }
        this.b = -1;
        this.c = null;
        this.d = null;
        this.b = i;
        this.c = selector;
        this.d = aVar;
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51e7f8ceb924496c5d9b71c8da2c8bc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51e7f8ceb924496c5d9b71c8da2c8bc4");
        } else {
            this.d.d(i, i2);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a {
        public String a;
        public byte[] b;
        public int c;
        public int d;

        public a(String str, byte[] bArr, int i, int i2) {
            this.a = str;
            this.b = bArr;
            this.c = i;
            this.d = i2;
        }
    }
}
