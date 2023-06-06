package com.dianping.nvnetwork.tnold.zip.hpack;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private static final IOException b = new IOException("EOS Decoded");
    private static final IOException c = new IOException("Invalid Padding");
    private final a d;

    public j(int[] iArr, byte[] bArr) {
        Object[] objArr = {iArr, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "937b470ebe6b778ae3a6b729a2538063", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "937b470ebe6b778ae3a6b729a2538063");
        } else if (iArr.length != 257 || iArr.length != bArr.length) {
            throw new IllegalArgumentException("invalid Huffman coding");
        } else {
            this.d = a(iArr, bArr);
        }
    }

    public final byte[] a(byte[] bArr) throws IOException {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95d170b1f7d39b555b942098737a3917", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95d170b1f7d39b555b942098737a3917");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a aVar = this.d;
        int i = 0;
        int i2 = 0;
        for (byte b2 : bArr) {
            i = (i << 8) | (b2 & 255);
            i2 += 8;
            while (i2 >= 8) {
                aVar = aVar.e[(i >>> (i2 - 8)) & 255];
                i2 -= aVar.d;
                if (a.c(aVar)) {
                    if (aVar.c == 256) {
                        throw b;
                    }
                    byteArrayOutputStream.write(aVar.c);
                    aVar = this.d;
                }
            }
        }
        while (i2 > 0) {
            a aVar2 = aVar.e[(i << (8 - i2)) & 255];
            if (!a.c(aVar2) || aVar2.d > i2) {
                break;
            }
            i2 -= aVar2.d;
            byteArrayOutputStream.write(aVar2.c);
            aVar = this.d;
        }
        int i3 = (1 << i2) - 1;
        if ((i & i3) != i3) {
            throw c;
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public static final /* synthetic */ boolean b = !j.class.desiredAssertionStatus();
        private final int c;
        private final int d;
        private final a[] e;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a957f79b600b9c6993d09d09ddfff561", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a957f79b600b9c6993d09d09ddfff561");
                return;
            }
            this.c = 0;
            this.d = 8;
            this.e = new a[256];
        }

        private a(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4dfd9995a68a968411c9961a7c5f7b1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4dfd9995a68a968411c9961a7c5f7b1");
            } else if (!b && (i2 <= 0 || i2 > 8)) {
                throw new AssertionError();
            } else {
                this.c = i;
                this.d = i2;
                this.e = null;
            }
        }

        public static /* synthetic */ boolean c(a aVar) {
            return aVar.e == null;
        }
    }

    private static a a(int[] iArr, byte[] bArr) {
        Object[] objArr = {iArr, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80edb751104a05b73061e922705632a8", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80edb751104a05b73061e922705632a8");
        }
        a aVar = new a();
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            byte b2 = bArr[i];
            Object[] objArr2 = {aVar, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(b2)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4b296d7eeaeecb7657b1bf22666675d5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4b296d7eeaeecb7657b1bf22666675d5");
            } else {
                a aVar2 = aVar;
                while (b2 > 8) {
                    if (!a.c(aVar2)) {
                        b2 = (byte) (b2 - 8);
                        int i3 = (i2 >>> b2) & 255;
                        if (aVar2.e[i3] == null) {
                            aVar2.e[i3] = new a();
                        }
                        aVar2 = aVar2.e[i3];
                    } else {
                        throw new IllegalStateException("invalid Huffman code: prefix not unique");
                    }
                }
                a aVar3 = new a(i, b2);
                int i4 = 8 - b2;
                int i5 = (i2 << i4) & 255;
                int i6 = 1 << i4;
                for (int i7 = i5; i7 < i5 + i6; i7++) {
                    aVar2.e[i7] = aVar3;
                }
            }
        }
        return aVar;
    }
}
