package com.dianping.nvnetwork.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    protected static final Comparator<byte[]> b = new Comparator<byte[]>() { // from class: com.dianping.nvnetwork.util.a.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };
    private List<byte[]> c;
    private List<byte[]> d;
    private int e;
    private final int f;

    public a(int i) {
        Object[] objArr = {4096};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5823baaae08e711ad265e42c08834cf5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5823baaae08e711ad265e42c08834cf5");
            return;
        }
        this.c = new LinkedList();
        this.d = new ArrayList(64);
        this.e = 0;
        this.f = 4096;
    }

    public final synchronized byte[] a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54103bf436d33b5ef74e7a909e1c1aa6", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54103bf436d33b5ef74e7a909e1c1aa6");
        }
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            byte[] bArr = this.d.get(i2);
            if (bArr.length >= i) {
                this.e -= bArr.length;
                this.d.remove(i2);
                this.c.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public final synchronized void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e5f3fa27ff12e40ff217654c705a8fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e5f3fa27ff12e40ff217654c705a8fb");
            return;
        }
        if (bArr != null && bArr.length <= this.f) {
            this.c.add(bArr);
            int binarySearch = Collections.binarySearch(this.d, bArr, b);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            this.d.add(binarySearch, bArr);
            this.e += bArr.length;
            a();
        }
    }

    private synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d7e96c5f9afafb791cb97e8c8c470f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d7e96c5f9afafb791cb97e8c8c470f5");
            return;
        }
        while (this.e > this.f) {
            byte[] remove = this.c.remove(0);
            this.d.remove(remove);
            this.e -= remove.length;
        }
    }
}
