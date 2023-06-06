package com.dianping.archive;

import com.meituan.android.recce.props.gens.BorderTopColor;
import com.meituan.android.recce.props.gens.BorderTopEndRadius;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.android.recce.props.gens.BorderTopStartRadius;
import com.meituan.android.recce.props.gens.Elevation;
import com.meituan.android.recce.props.gens.Opacity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.smtt.export.external.interfaces.ISelectionInterface;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public static ChangeQuickRedirect a;
    protected ByteBuffer b;
    private byte[] c;

    public e(ByteBuffer byteBuffer) {
        Object[] objArr = {byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cd30912336fcccdf2048150ae8b87f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cd30912336fcccdf2048150ae8b87f6");
            return;
        }
        this.b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public e(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a28c36048c65956934efd6083745ab0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a28c36048c65956934efd6083745ab0e");
            return;
        }
        this.b = ByteBuffer.wrap(bArr);
        this.b.order(ByteOrder.BIG_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
        r1.append("(EOF)");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.archive.e.a
            java.lang.String r10 = "9472464b7efbb2f76b25f830985cdc5c"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r2 = r12
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r9, r0, r10)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1b:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r2 = 20
            r1.<init>(r2)
            java.nio.ByteBuffer r2 = r12.b
            r2.mark()
            java.lang.String r2 = "@"
            r1.append(r2)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            java.nio.ByteBuffer r2 = r12.b     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            int r2 = r2.position()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            r1.append(r2)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            java.lang.String r2 = "(x"
            r1.append(r2)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            java.nio.ByteBuffer r2 = r12.b     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            int r2 = r2.position()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            java.lang.String r2 = java.lang.Integer.toHexString(r2)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            r1.append(r2)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            java.lang.String r2 = "): "
            r1.append(r2)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            r2 = 0
        L4d:
            r3 = 6
            if (r2 >= r3) goto La0
            java.nio.ByteBuffer r3 = r12.b     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            boolean r3 = r3.hasRemaining()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            if (r3 == 0) goto L6a
            java.nio.ByteBuffer r3 = r12.b     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            byte r3 = r3.get()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            r1.append(r3)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            int r2 = r2 + 1
            goto L4d
        L6a:
            java.lang.String r2 = "(EOF)"
            r1.append(r2)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            goto La0
        L70:
            r0 = move-exception
            goto Laa
        L72:
            java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L70
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.archive.e.a     // Catch: java.lang.Throwable -> L70
            java.lang.String r11 = "a24ffd9c1f9711450e9b7d43d7b45a38"
            r5 = 0
            r7 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r2 = r9
            r3 = r12
            r4 = r10
            r6 = r11
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L90
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r12, r10, r0, r11)     // Catch: java.lang.Throwable -> L70
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L70
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L70
            goto L99
        L90:
            java.nio.ByteBuffer r2 = r12.b     // Catch: java.lang.Throwable -> L70
            boolean r2 = r2.hasRemaining()     // Catch: java.lang.Throwable -> L70
            if (r2 != 0) goto L99
            r0 = 1
        L99:
            if (r0 == 0) goto La0
            java.lang.String r0 = "EOF"
            r1.append(r0)     // Catch: java.lang.Throwable -> L70
        La0:
            java.nio.ByteBuffer r0 = r12.b
            r0.reset()
            java.lang.String r0 = r1.toString()
            return r0
        Laa:
            java.nio.ByteBuffer r1 = r12.b
            r1.reset()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.archive.e.toString():java.lang.String");
    }

    public final boolean a() throws a {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9bc9d4d212b5e35f0f14e632cd53486", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9bc9d4d212b5e35f0f14e632cd53486")).booleanValue();
        }
        byte b = this.b.get();
        if (b == 84) {
            return true;
        }
        if (b == 70 || b == 78) {
            return false;
        }
        throw new a("unable to read boolean: " + this);
    }

    public final int b() throws a {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff2d72f0aa615186148e6305be80c0d0", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff2d72f0aa615186148e6305be80c0d0")).intValue();
        }
        byte b = this.b.get();
        if (b == 73) {
            return this.b.getInt();
        }
        if (b == 78) {
            return 0;
        }
        throw new a("unable to read int: " + this);
    }

    public final long c() throws a {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc5336792d8c3f67d6d03f7a954864d4", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc5336792d8c3f67d6d03f7a954864d4")).longValue();
        }
        byte b = this.b.get();
        if (b == 76) {
            return this.b.getLong();
        }
        if (b == 78) {
            return 0L;
        }
        throw new a("unable to read long: " + this);
    }

    public final String d() throws a {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29e8b8c87bb80a75bc592bf3ba428398", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29e8b8c87bb80a75bc592bf3ba428398");
        }
        byte b = this.b.get();
        if (b == 83) {
            int i = this.b.getShort() & ISelectionInterface.HELD_NOTHING;
            int i2 = ((i / 4096) + 1) * 4096;
            if (this.c == null || this.c.length < i2) {
                this.c = new byte[i2];
            }
            this.b.get(this.c, 0, i);
            try {
                return new String(this.c, 0, i, "utf-8");
            } catch (UnsupportedEncodingException unused) {
                throw new a("unable to encode string");
            }
        } else if (b != 66) {
            if (b == 78) {
                return "";
            }
            throw new a("unable to read string: " + this);
        } else {
            int i3 = this.b.getInt();
            int i4 = ((i3 / 4096) + 1) * 4096;
            if (this.c == null || this.c.length < i4) {
                this.c = new byte[i4];
            }
            this.b.get(this.c, 0, i3);
            try {
                return new String(this.c, 0, i3, "utf-8");
            } catch (UnsupportedEncodingException unused2) {
                throw new a("unable to encode string");
            }
        }
    }

    public final <T> T a(c<T> cVar) throws a {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b55d1fd5cdb12b4241cddf1cb03647c", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b55d1fd5cdb12b4241cddf1cb03647c");
        }
        byte b = this.b.get();
        if (b == 78) {
            return cVar.a(0);
        }
        if (b == 79) {
            int i = this.b.getShort() & ISelectionInterface.HELD_NOTHING;
            T a2 = cVar.a(i);
            if (a2 == null) {
                throw new a("unable to create instance: " + Integer.toHexString(i));
            } else if (a2 instanceof b) {
                ((b) a2).decode(this);
                return a2;
            } else {
                throw new a("unable to decode class: " + a2.getClass().getSimpleName());
            }
        } else if (b == 81) {
            int i2 = this.b.getInt();
            T a3 = cVar.a(i2);
            if (a3 == null) {
                throw new a("unable to create instance: " + Integer.toHexString(i2));
            } else if (a3 instanceof b) {
                ((b) a3).decode(this);
                return a3;
            } else {
                throw new a("unable to decode class: " + a3.getClass().getSimpleName());
            }
        } else {
            throw new a("unable to read object: " + this);
        }
    }

    public final DPObject e() throws a {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32237e55f8df44be2f52591b1eb89ea0", 6917529027641081856L)) {
            return (DPObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32237e55f8df44be2f52591b1eb89ea0");
        }
        int position = this.b.position();
        byte b = this.b.get(position);
        if (b == 78) {
            this.b.get();
            return null;
        } else if (b == 79 || b == 81) {
            f();
            return new DPObject(this.b.array(), position, this.b.position() - position);
        } else {
            throw new a("unable to read dpobject: " + this);
        }
    }

    public final void f() throws a {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8be92d75306f8429cc3534b772e078c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8be92d75306f8429cc3534b772e078c");
            return;
        }
        switch (this.b.get()) {
            case 65:
                int i = this.b.getShort() & ISelectionInterface.HELD_NOTHING;
                for (int i2 = 0; i2 < i; i2++) {
                    f();
                }
                return;
            case 66:
                this.b.position(this.b.position() + this.b.getInt());
                return;
            case 67:
            case 69:
            case 71:
            case 72:
            case 74:
            case 75:
            case 77:
            case 80:
            case BorderTopEndRadius.INDEX_ID /* 82 */:
            case Elevation.INDEX_ID /* 86 */:
            case Opacity.INDEX_ID /* 87 */:
            default:
                throw new a("unable to skip object: " + this);
            case 68:
                this.b.getDouble();
                return;
            case 70:
            case 78:
            case 84:
                return;
            case 73:
                this.b.getInt();
                return;
            case 76:
                this.b.getLong();
                return;
            case 79:
                this.b.getShort();
                while (g() > 0) {
                    f();
                }
                return;
            case BorderTopColor.INDEX_ID /* 81 */:
                this.b.getInt();
                while (g() > 0) {
                    f();
                }
                return;
            case BorderTopLeftRadius.INDEX_ID /* 83 */:
                this.b.position(this.b.position() + (this.b.getShort() & ISelectionInterface.HELD_NOTHING));
                return;
            case BorderTopStartRadius.INDEX_ID /* 85 */:
                this.b.getInt();
                return;
            case 88:
                this.b.getLong();
                return;
        }
    }

    public final int g() throws a {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fe0795feb4c186e7b6cb07ac7c0ec9c", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fe0795feb4c186e7b6cb07ac7c0ec9c")).intValue();
        }
        byte b = this.b.get();
        if (b == 77) {
            return this.b.getShort() & ISelectionInterface.HELD_NOTHING;
        }
        if (b == 90) {
            return 0;
        }
        throw new a("unable to read member hash 16: " + this);
    }

    public final <T> T[] b(c<T> cVar) throws a {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea69b7c2b33c0191f9a623f460cd40ce", 6917529027641081856L)) {
            return (T[]) ((Object[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea69b7c2b33c0191f9a623f460cd40ce"));
        }
        byte b = this.b.get();
        if (b == 78) {
            return cVar.b(0);
        }
        if (b == 65) {
            int i = this.b.getShort() & ISelectionInterface.HELD_NOTHING;
            T[] b2 = cVar.b(i);
            for (int i2 = 0; i2 < i; i2++) {
                b2[i2] = a(cVar);
            }
            return b2;
        }
        throw new a("unable to read array (object): " + this);
    }
}
