package com.dianping.networklog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public final class m {
    public static ChangeQuickRedirect a;
    protected static final Comparator<byte[]> b = new Comparator<byte[]>() { // from class: com.dianping.networklog.m.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };
    private List<byte[]> c;
    private List<byte[]> d;
    private int e;
    private final int f;

    public m(int i) {
        Object[] objArr = {1024};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cff100ea9f663e469bad0f85ab8ecfd1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cff100ea9f663e469bad0f85ab8ecfd1");
            return;
        }
        this.c = new LinkedList();
        this.d = new ArrayList(64);
        this.e = 0;
        this.f = 1024;
    }

    private synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dd037388905186bd65db969fa0f5d37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dd037388905186bd65db969fa0f5d37");
            return;
        }
        while (this.e > this.f) {
            byte[] remove = this.c.remove(0);
            this.d.remove(remove);
            this.e -= remove.length;
        }
    }

    public final synchronized void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14f9466f2d8a4561c6e8ee3d4f8ed4d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14f9466f2d8a4561c6e8ee3d4f8ed4d3");
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

    public final synchronized byte[] a(int i) {
        Object[] objArr = {1024};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95c4d60d30c5e022ebef6271446cec4a", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95c4d60d30c5e022ebef6271446cec4a");
        }
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            byte[] bArr = this.d.get(i2);
            if (bArr.length >= 1024) {
                this.e -= bArr.length;
                this.d.remove(i2);
                this.c.remove(bArr);
                return bArr;
            }
        }
        return new byte[1024];
    }
}
