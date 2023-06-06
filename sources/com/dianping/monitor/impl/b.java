package com.dianping.monitor.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    protected static final Comparator<byte[]> b = new Comparator<byte[]>() { // from class: com.dianping.monitor.impl.b.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };
    private List<byte[]> c;
    private List<byte[]> d;
    private int e;
    private final int f;

    public b(int i) {
        Object[] objArr = {4096};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "794db4bcb6ecbc00994570614fa8a4fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "794db4bcb6ecbc00994570614fa8a4fe");
            return;
        }
        this.c = new LinkedList();
        this.d = new ArrayList(64);
        this.e = 0;
        this.f = 4096;
    }

    public final synchronized byte[] a(int i) {
        Object[] objArr = {4096};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a75e2dcd70859f8f4b612370cb26d727", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a75e2dcd70859f8f4b612370cb26d727");
        }
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            byte[] bArr = this.d.get(i2);
            if (bArr.length >= 4096) {
                this.e -= bArr.length;
                this.d.remove(i2);
                this.c.remove(bArr);
                return bArr;
            }
        }
        return new byte[4096];
    }

    public final synchronized void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd8535946fe2b011031e26b74b48c3b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd8535946fe2b011031e26b74b48c3b3");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "842221b70ec4e01074fb8615ff696db5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "842221b70ec4e01074fb8615ff696db5");
            return;
        }
        while (this.e > this.f) {
            byte[] remove = this.c.remove(0);
            this.d.remove(remove);
            this.e -= remove.length;
        }
    }
}
