package com.dianping.nvnetwork.tnold.zip.hpack;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b implements Comparable<b> {
    public static ChangeQuickRedirect a;
    public final byte[] b;
    public final byte[] c;

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(b bVar) {
        b bVar2 = bVar;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab02063bbfee9a5abf058380a15c2739", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab02063bbfee9a5abf058380a15c2739")).intValue();
        }
        int b = b(this.b, bVar2.b);
        return b == 0 ? b(this.c, bVar2.c) : b;
    }

    public static int a(byte[] bArr, byte[] bArr2) {
        return bArr.length + bArr2.length + 32;
    }

    public b(String str, String str2) {
        this(str.getBytes(h.b), str2.getBytes(h.b));
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eb8a3b227ce8b11a891439f4aebc9d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eb8a3b227ce8b11a891439f4aebc9d6");
        }
    }

    public b(byte[] bArr, byte[] bArr2) {
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0672e07f579811639837782de405e0b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0672e07f579811639837782de405e0b2");
            return;
        }
        this.b = (byte[]) h.a(bArr);
        this.c = (byte[]) h.a(bArr2);
    }

    public final int a() {
        return this.b.length + this.c.length + 32;
    }

    private int b(byte[] bArr, byte[] bArr2) {
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d7d9c9f9c5361c16d077070b7877e2a", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d7d9c9f9c5361c16d077070b7877e2a")).intValue();
        }
        int length = bArr.length;
        int length2 = bArr2.length;
        int min = Math.min(length, length2);
        for (int i = 0; i < min; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return length - length2;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "616ead20a461254e0a31242fcfb9e636", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "616ead20a461254e0a31242fcfb9e636")).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return h.a(this.b, bVar.b) && h.a(this.c, bVar.c);
        }
        return false;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea02a20e2bc4a42756d17cf87def9762", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea02a20e2bc4a42756d17cf87def9762");
        }
        String str = new String(this.b);
        String str2 = new String(this.c);
        return str + ": " + str2;
    }
}
