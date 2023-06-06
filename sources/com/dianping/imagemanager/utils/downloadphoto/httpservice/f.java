package com.dianping.imagemanager.utils.downloadphoto.httpservice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    public static ChangeQuickRedirect a;
    protected static final Comparator<byte[]> b = new Comparator<byte[]>() { // from class: com.dianping.imagemanager.utils.downloadphoto.httpservice.f.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };
    private List<byte[]> c;
    private List<byte[]> d;
    private int e;
    private final int f;

    public f(int i) {
        Object[] objArr = {4096};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "851f90b3b2d754733b465be3e76cca07", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "851f90b3b2d754733b465be3e76cca07");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73940ace9210ac5b557f0e6c5654ff5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73940ace9210ac5b557f0e6c5654ff5b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2116b31f4766e2ad1ac2f8903a2ea7c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2116b31f4766e2ad1ac2f8903a2ea7c9");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dd68846650630c0e75420360b7c146d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dd68846650630c0e75420360b7c146d");
            return;
        }
        while (this.e > this.f) {
            byte[] remove = this.c.remove(0);
            this.d.remove(remove);
            this.e -= remove.length;
        }
    }
}
