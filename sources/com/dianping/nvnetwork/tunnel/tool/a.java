package com.dianping.nvnetwork.tunnel.tool;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    protected static final Comparator<byte[]> b = new Comparator<byte[]>() { // from class: com.dianping.nvnetwork.tunnel.tool.a.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };
    private List<byte[]> c;
    private List<byte[]> d;
    private int e;
    private final int f;

    public a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e347796e775ddb1d72adc37a8ce1803c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e347796e775ddb1d72adc37a8ce1803c");
            return;
        }
        this.c = new LinkedList();
        this.d = new ArrayList(64);
        this.e = 0;
        this.f = i;
    }

    private synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "351ffbed6b55a86232190834597bf704", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "351ffbed6b55a86232190834597bf704");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a64d7ef9c579cdae7d73e01821cfcf0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a64d7ef9c579cdae7d73e01821cfcf0");
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
        Object[] objArr = {4096};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7b233febbfc04b54304a2af51562acb", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7b233febbfc04b54304a2af51562acb");
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
}
