package com.sankuai.waimai.platform.modular.network.error;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.exception.b;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends RuntimeException {
    public static ChangeQuickRedirect a;
    public int b;
    public String c;
    private String d;
    private int e;
    private Throwable f;

    public a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f3b69f9d3c5613cea77b13b6ba964e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f3b69f9d3c5613cea77b13b6ba964e2");
            return;
        }
        this.b = 0;
        if (th instanceof IOException) {
            this.b = 1;
        } else if (th instanceof b) {
            this.b = 2;
        } else {
            this.b = 0;
        }
        this.f = th;
    }

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecb5a5e7b1c5f93d8f070c158cbc720a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecb5a5e7b1c5f93d8f070c158cbc720a");
            return;
        }
        this.b = 0;
        this.d = str;
    }

    public a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d71d293f7f0496e4d61616f1177e559", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d71d293f7f0496e4d61616f1177e559");
            return;
        }
        this.b = 0;
        this.e = i;
        this.d = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.d;
    }

    public String a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public final boolean c() {
        return this.b == 1;
    }

    public Throwable d() {
        return this.f;
    }
}
