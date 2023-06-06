package com.dianping.archive;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.internal.view.SupportMenu;
import android.util.Log;
import com.meituan.android.recce.props.gens.BorderTopColor;
import com.meituan.android.recce.props.gens.BorderTopEndRadius;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.android.recce.props.gens.BorderTopStartRadius;
import com.meituan.android.recce.props.gens.Elevation;
import com.meituan.android.recce.props.gens.Opacity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.smtt.export.external.interfaces.ISelectionInterface;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DPObject implements Parcelable, Iterable<Map.Entry<Integer, Object>> {
    public static final Parcelable.Creator<DPObject> CREATOR = new Parcelable.Creator<DPObject>() { // from class: com.dianping.archive.DPObject.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DPObject createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bccadc098bfd23e8af2313a0f4be32f", 6917529027641081856L) ? (DPObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bccadc098bfd23e8af2313a0f4be32f") : new DPObject(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DPObject[] newArray(int i) {
            return new DPObject[i];
        }
    };
    public static ChangeQuickRedirect a;
    static final boolean b;
    public byte[] c;
    public int d;
    int e;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface e {
        e a(String str, int i);

        e a(String str, long j);

        e a(String str, DPObject dPObject);

        e a(String str, String str2);

        e a(String str, boolean z);

        e a(String str, DPObject[] dPObjectArr);

        DPObject a();
    }

    private static native boolean a();

    private static native boolean nativeArraySkip(byte[] bArr, int i, int i2, int i3, int[] iArr);

    static native int nativeSeekMember(byte[] bArr, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nativeSkipAny(byte[] bArr, int i, int i2);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        boolean z;
        try {
            if (!com.dianping.archive.d.a("dpobj", DPObject.class)) {
                System.loadLibrary("dpobj");
            }
            z = a();
        } catch (Throwable unused) {
            z = false;
        }
        b = z;
    }

    public DPObject(byte[] bArr, int i, int i2) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abe3c26ce8aaa440f490fb7f0e0a8de0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abe3c26ce8aaa440f490fb7f0e0a8de0");
            return;
        }
        this.c = bArr;
        this.d = i;
        this.e = i2;
        if (e()) {
            return;
        }
        this.d = 0;
        this.e = 0;
        this.c = new byte[0];
    }

    private boolean e() {
        return this.e >= 0 && this.d >= 0 && this.c != null;
    }

    private DPObject(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a2bd449b6287c00e3034aa0163c5ebf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a2bd449b6287c00e3034aa0163c5ebf");
            return;
        }
        this.c = new byte[]{79, (byte) (i >>> 8), (byte) i, 90};
        this.d = 0;
        this.e = 4;
    }

    public DPObject(String str) {
        this(a(str));
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "109138804856a6fdd2942c52ca8f5283", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "109138804856a6fdd2942c52ca8f5283");
        }
    }

    public DPObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10cbc70a2e489f74054d3cf22dc94dc3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10cbc70a2e489f74054d3cf22dc94dc3");
            return;
        }
        this.c = new byte[0];
        this.d = 0;
        this.e = 0;
    }

    public DPObject(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "019b577564e2194844052251951b2e6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "019b577564e2194844052251951b2e6f");
            return;
        }
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.c = parcel.createByteArray();
        if (e()) {
            return;
        }
        this.d = 0;
        this.e = 0;
        this.c = new byte[0];
    }

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "612e56fc94aecbba7b7d8a6070279fe2", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "612e56fc94aecbba7b7d8a6070279fe2")).intValue();
        }
        int hashCode = str.hashCode();
        return (hashCode >>> 16) ^ (65535 & hashCode);
    }

    public static DPObject a(byte[] bArr, int i, int i2) {
        Object[] objArr = {bArr, 0, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f1135c593ebb36bb152b0a90c8a5dbc", 6917529027641081856L)) {
            return (DPObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f1135c593ebb36bb152b0a90c8a5dbc");
        }
        if (i2 < 4) {
            return null;
        }
        byte b2 = bArr[0];
        if (b2 == 79) {
            return new DPObject(bArr, 0, i2);
        }
        if (b2 != 81 || i2 <= 5) {
            return null;
        }
        return new DPObject(bArr, 0, i2);
    }

    public static DPObject[] b(byte[] bArr, int i, int i2) {
        int i3 = 3;
        int i4 = 0;
        Object[] objArr = {bArr, 0, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1dd82673f063fd9c9f851fe3e30bf4f4", 6917529027641081856L)) {
            return (DPObject[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1dd82673f063fd9c9f851fe3e30bf4f4");
        }
        if (i2 >= 3 && bArr[0] == 65) {
            int i5 = ((bArr[1] & 255) << 8) | (bArr[2] & 255);
            if (i5 == 0) {
                return new DPObject[0];
            }
            if (b) {
                int[] iArr = new int[i5];
                if (nativeArraySkip(bArr, 3, i2 - 3, i5, iArr)) {
                    DPObject[] dPObjectArr = new DPObject[i5];
                    while (i4 < i5) {
                        int i6 = iArr[i4];
                        byte b2 = bArr[i3];
                        if (b2 == 78) {
                            dPObjectArr[i4] = null;
                        } else if (b2 != 79 && b2 != 81) {
                            return null;
                        } else {
                            dPObjectArr[i4] = new DPObject(bArr, i3, i6);
                        }
                        i3 += i6;
                        i4++;
                    }
                    return dPObjectArr;
                }
            } else {
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 3, i2 - 3);
                DPObject[] dPObjectArr2 = new DPObject[i5];
                int position = wrap.position();
                while (i4 < i5) {
                    if (b(wrap) != 0) {
                        return null;
                    }
                    switch (bArr[position]) {
                        case 78:
                            dPObjectArr2[i4] = null;
                            break;
                        case 79:
                        case BorderTopColor.INDEX_ID /* 81 */:
                            dPObjectArr2[i4] = new DPObject(bArr, position, wrap.position() - position);
                            break;
                        case 80:
                        default:
                            return null;
                    }
                    position = wrap.position();
                    i4++;
                }
                return dPObjectArr2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(ByteBuffer byteBuffer) {
        int i;
        int i2;
        Object[] objArr = {byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0c771224403c8ba8ec697df5321daf9", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0c771224403c8ba8ec697df5321daf9")).intValue();
        }
        if (byteBuffer.remaining() == 0) {
            return -1;
        }
        switch (byteBuffer.get()) {
            case 65:
                if (byteBuffer.remaining() < 2) {
                    return -1;
                }
                int i3 = byteBuffer.getShort() & ISelectionInterface.HELD_NOTHING;
                for (int i4 = 0; i4 < i3; i4++) {
                    int b2 = b(byteBuffer);
                    if (b2 != 0) {
                        return b2;
                    }
                }
                return 0;
            case 66:
                if (byteBuffer.remaining() >= 4 && byteBuffer.remaining() >= (i = byteBuffer.getInt())) {
                    byteBuffer.position(byteBuffer.position() + i);
                    return 0;
                }
                return -1;
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
                return -2;
            case 68:
                if (byteBuffer.remaining() < 8) {
                    return -1;
                }
                byteBuffer.getDouble();
                return 0;
            case 70:
            case 78:
            case 84:
                return 0;
            case 73:
                if (byteBuffer.remaining() < 4) {
                    return -1;
                }
                byteBuffer.getInt();
                return 0;
            case 76:
                if (byteBuffer.remaining() < 8) {
                    return -1;
                }
                byteBuffer.getLong();
                return 0;
            case 79:
                if (byteBuffer.remaining() < 2) {
                    return -1;
                }
                byteBuffer.getShort();
                while (byteBuffer.remaining() > 0) {
                    byte b3 = byteBuffer.get();
                    if (b3 != 77) {
                        return b3 == 90 ? 0 : -2;
                    } else if (byteBuffer.remaining() < 2) {
                        return -1;
                    } else {
                        byteBuffer.getShort();
                        int b4 = b(byteBuffer);
                        if (b4 != 0) {
                            return b4;
                        }
                    }
                }
                return -1;
            case BorderTopColor.INDEX_ID /* 81 */:
                if (byteBuffer.remaining() < 4) {
                    return -1;
                }
                byteBuffer.getInt();
                while (byteBuffer.remaining() > 0) {
                    byte b5 = byteBuffer.get();
                    if (b5 != 77) {
                        return b5 == 90 ? 0 : -2;
                    } else if (byteBuffer.remaining() < 2) {
                        return -1;
                    } else {
                        byteBuffer.getShort();
                        int b6 = b(byteBuffer);
                        if (b6 != 0) {
                            return b6;
                        }
                    }
                }
                return -1;
            case BorderTopLeftRadius.INDEX_ID /* 83 */:
                if (byteBuffer.remaining() >= 2 && byteBuffer.remaining() >= (i2 = byteBuffer.getShort() & ISelectionInterface.HELD_NOTHING)) {
                    byteBuffer.position(byteBuffer.position() + i2);
                    return 0;
                }
                return -1;
            case BorderTopStartRadius.INDEX_ID /* 85 */:
                if (byteBuffer.remaining() < 4) {
                    return -1;
                }
                byteBuffer.getInt();
                return 0;
            case 88:
                if (byteBuffer.remaining() < 8) {
                    return -1;
                }
                byteBuffer.getLong();
                return 0;
        }
    }

    static int a(ByteBuffer byteBuffer, int i) {
        Object[] objArr = {byteBuffer, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23e0f3feb1f37f4a0a7d131519ba09a1", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23e0f3feb1f37f4a0a7d131519ba09a1")).intValue();
        }
        if (byteBuffer.remaining() < 4) {
            return -1;
        }
        byteBuffer.position(byteBuffer.position() + 3);
        while (byteBuffer.remaining() != 0) {
            byte b2 = byteBuffer.get();
            if (b2 != 77) {
                return b2 != 90 ? -2 : -1;
            } else if (byteBuffer.remaining() < 3) {
                return -1;
            } else {
                if ((byteBuffer.getShort() & ISelectionInterface.HELD_NOTHING) == i) {
                    return 0;
                }
                int b3 = b(byteBuffer);
                if (b3 != 0) {
                    return b3;
                }
            }
        }
        return -1;
    }

    public final <T> T a(com.dianping.archive.c<T> cVar) throws com.dianping.archive.a {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86d038bddb8917058548b416da563ab7", 6917529027641081856L) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86d038bddb8917058548b416da563ab7") : (T) new com.dianping.archive.e(ByteBuffer.wrap(this.c, this.d, this.e)).a(cVar);
    }

    public final e b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efdcb9e9fd5ae84022c3cfd18146a88b", 6917529027641081856L) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efdcb9e9fd5ae84022c3cfd18146a88b") : new c();
    }

    public final boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6912b9dddf46cbe8274aa3eb6992be6", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6912b9dddf46cbe8274aa3eb6992be6")).booleanValue();
        }
        int a2 = a(str);
        Object[] objArr2 = {Integer.valueOf(a2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d661bd651797d79386595f68d905cdb", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d661bd651797d79386595f68d905cdb")).booleanValue();
        }
        if (b) {
            return nativeSeekMember(this.c, this.d, this.e, a2) > 0;
        }
        ByteBuffer wrap = ByteBuffer.wrap(this.c, this.d, this.e);
        wrap.order(ByteOrder.BIG_ENDIAN);
        return a(wrap, a2) == 0;
    }

    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05d17fa0952918c2b28d8666b25811eb", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05d17fa0952918c2b28d8666b25811eb")).booleanValue();
        }
        if (b) {
            int nativeSeekMember = nativeSeekMember(this.c, this.d, this.e, i);
            if (nativeSeekMember > 0 && nativeSeekMember < this.e) {
                byte b2 = this.c[this.d + nativeSeekMember];
                if (b2 == 84) {
                    return true;
                }
                if (b2 == 70) {
                    return false;
                }
            }
        } else {
            ByteBuffer wrap = ByteBuffer.wrap(this.c, this.d, this.e);
            wrap.order(ByteOrder.BIG_ENDIAN);
            return a(wrap, i) == 0 && wrap.remaining() > 0 && wrap.get() == 84;
        }
        return false;
    }

    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da0bb29dd3f230d2ad9fe149f662c578", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da0bb29dd3f230d2ad9fe149f662c578")).booleanValue() : a(a(str));
    }

    public final int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "460599fb0e079a5d91621137238611db", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "460599fb0e079a5d91621137238611db")).intValue();
        }
        if (b) {
            int nativeSeekMember = nativeSeekMember(this.c, this.d, this.e, i);
            if (nativeSeekMember > 0 && nativeSeekMember + 4 < this.e) {
                int i2 = this.d + nativeSeekMember;
                if (this.c[i2] == 73) {
                    return ((this.c[i2 + 1] & 255) << 24) | ((this.c[i2 + 2] & 255) << 16) | ((this.c[i2 + 3] & 255) << 8) | (this.c[i2 + 4] & 255);
                }
            }
        } else {
            ByteBuffer wrap = ByteBuffer.wrap(this.c, this.d, this.e);
            wrap.order(ByteOrder.BIG_ENDIAN);
            if (a(wrap, i) == 0 && wrap.remaining() > 4 && wrap.get() == 73) {
                return wrap.getInt();
            }
        }
        return 0;
    }

    public final int d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4aef2d08437d11880ef412c0e42d358", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4aef2d08437d11880ef412c0e42d358")).intValue() : b(a(str));
    }

    public final String c(int i) {
        int i2;
        int i3;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e83eada39621f9a5807186b77862266b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e83eada39621f9a5807186b77862266b");
        }
        if (b) {
            int nativeSeekMember = nativeSeekMember(this.c, this.d, this.e, i);
            if (nativeSeekMember > 0 && nativeSeekMember < this.e) {
                int i4 = this.d + nativeSeekMember;
                byte b2 = this.c[i4];
                try {
                    if (b2 == 83 && (i3 = nativeSeekMember + 2) < this.e) {
                        int i5 = ((this.c[i4 + 1] & 255) << 8) | (this.c[i4 + 2] & 255);
                        if (i5 == 0) {
                            return "";
                        }
                        if (i3 + i5 < this.e) {
                            return new String(this.c, i4 + 3, i5, "UTF-8");
                        }
                    } else if (b2 == 66 && (i2 = nativeSeekMember + 4) < this.e) {
                        int i6 = ((this.c[i4 + 1] & 255) << 24) | ((this.c[i4 + 2] & 255) << 16) | ((this.c[i4 + 3] & 255) << 8) | (this.c[i4 + 4] & 255);
                        if (i6 == 0) {
                            return "";
                        }
                        if (i2 + i6 < this.e) {
                            return new String(this.c, i4 + 5, i6, "UTF-8");
                        }
                    } else if (b2 == 78) {
                        return null;
                    }
                } catch (UnsupportedEncodingException unused) {
                }
            }
        } else {
            ByteBuffer wrap = ByteBuffer.wrap(this.c, this.d, this.e);
            wrap.order(ByteOrder.BIG_ENDIAN);
            if (a(wrap, i) == 0 && wrap.remaining() > 0) {
                byte b3 = wrap.get();
                if (b3 == 83 && wrap.remaining() > 1) {
                    int i7 = wrap.getShort() & ISelectionInterface.HELD_NOTHING;
                    if (i7 == 0) {
                        return "";
                    }
                    if (wrap.remaining() >= i7) {
                        try {
                            return new String(this.c, wrap.position(), i7, "UTF-8");
                        } catch (UnsupportedEncodingException e2) {
                            Log.e("dpobj", "unable to decode string", e2);
                        }
                    }
                } else if (b3 == 66 && wrap.remaining() > 3) {
                    int i8 = wrap.getInt();
                    if (i8 == 0) {
                        return "";
                    }
                    if (wrap.remaining() >= i8) {
                        try {
                            return new String(this.c, wrap.position(), i8, "UTF-8");
                        } catch (UnsupportedEncodingException e3) {
                            Log.e("dpobj", "unable to decode string", e3);
                        }
                    }
                } else if (b3 == 78) {
                    return null;
                }
            }
        }
        return null;
    }

    public final String e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65bcd7569dd4625a18f9ef37a63e3d81", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65bcd7569dd4625a18f9ef37a63e3d81") : c(a(str));
    }

    public final long d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e02f8619d596af02129f5d6e7fd1289", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e02f8619d596af02129f5d6e7fd1289")).longValue();
        }
        if (b) {
            int nativeSeekMember = nativeSeekMember(this.c, this.d, this.e, i);
            if (nativeSeekMember <= 0 || nativeSeekMember + 8 >= this.e) {
                return 0L;
            }
            int i2 = this.d + nativeSeekMember;
            if (this.c[i2] == 76) {
                return (this.c[i2 + 8] & 255) | ((this.c[i2 + 1] & 255) << 56) | ((this.c[i2 + 2] & 255) << 48) | ((this.c[i2 + 3] & 255) << 40) | ((this.c[i2 + 4] & 255) << 32) | ((this.c[i2 + 5] & 255) << 24) | ((this.c[i2 + 6] & 255) << 16) | ((this.c[i2 + 7] & 255) << 8);
            }
            return 0L;
        }
        ByteBuffer wrap = ByteBuffer.wrap(this.c, this.d, this.e);
        wrap.order(ByteOrder.BIG_ENDIAN);
        if (a(wrap, i) == 0 && wrap.remaining() > 8 && wrap.get() == 76) {
            return wrap.getLong();
        }
        return 0L;
    }

    public final long f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67e9e2f63f447b6c186031c541ae6c6c", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67e9e2f63f447b6c186031c541ae6c6c")).longValue() : d(a(str));
    }

    public final DPObject e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "580dd83dfeb7c716d2c8e7e754b28193", 6917529027641081856L)) {
            return (DPObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "580dd83dfeb7c716d2c8e7e754b28193");
        }
        if (b) {
            int nativeSeekMember = nativeSeekMember(this.c, this.d, this.e, i);
            if (nativeSeekMember > 0) {
                byte b2 = this.c[this.d + nativeSeekMember];
                if (b2 == 79 && nativeSeekMember + 2 < this.e) {
                    return new DPObject(this.c, this.d + nativeSeekMember, this.e - nativeSeekMember);
                }
                if (b2 == 78) {
                    return null;
                }
            }
        } else {
            ByteBuffer wrap = ByteBuffer.wrap(this.c, this.d, this.e);
            wrap.order(ByteOrder.BIG_ENDIAN);
            if (a(wrap, i) == 0 && wrap.remaining() > 0) {
                byte b3 = wrap.get();
                if (b3 == 79 && wrap.remaining() > 2) {
                    return new DPObject(this.c, wrap.position() - 1, (this.e - wrap.position()) + this.d + 1);
                }
                if (b3 == 78) {
                    return null;
                }
            }
        }
        return null;
    }

    public final DPObject g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bca762273139831a86ac3ed005ae549a", 6917529027641081856L) ? (DPObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bca762273139831a86ac3ed005ae549a") : e(a(str));
    }

    public final DPObject[] f(int i) {
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5701d67290923fe7714a3448dd84eaec", 6917529027641081856L)) {
            return (DPObject[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5701d67290923fe7714a3448dd84eaec");
        }
        if (b) {
            int nativeSeekMember = nativeSeekMember(this.c, this.d, this.e, i);
            if (nativeSeekMember > 0) {
                int i3 = this.d + nativeSeekMember;
                byte b2 = this.c[i3];
                if (b2 == 65 && nativeSeekMember + 2 < this.e) {
                    int i4 = (this.c[i3 + 2] & 255) | ((this.c[i3 + 1] & 255) << 8);
                    if (i4 == 0) {
                        return new DPObject[0];
                    }
                    int i5 = this.d + nativeSeekMember + 3;
                    int[] iArr = new int[i4];
                    if (nativeArraySkip(this.c, i5, (this.e - nativeSeekMember) - 3, i4, iArr)) {
                        DPObject[] dPObjectArr = new DPObject[i4];
                        while (i2 < i4) {
                            int i6 = iArr[i2];
                            byte b3 = this.c[i5];
                            if (b3 == 78) {
                                dPObjectArr[i2] = null;
                            } else if (b3 != 79) {
                                return null;
                            } else {
                                dPObjectArr[i2] = new DPObject(this.c, i5, i6);
                            }
                            i5 += i6;
                            i2++;
                        }
                        return dPObjectArr;
                    }
                } else if (b2 == 78) {
                    return null;
                }
            }
        } else {
            ByteBuffer wrap = ByteBuffer.wrap(this.c, this.d, this.e);
            wrap.order(ByteOrder.BIG_ENDIAN);
            if (a(wrap, i) == 0 && wrap.remaining() > 0 && wrap.get() == 65 && wrap.remaining() > 1) {
                int i7 = wrap.getShort() & ISelectionInterface.HELD_NOTHING;
                if (i7 == 0) {
                    return new DPObject[0];
                }
                DPObject[] dPObjectArr2 = new DPObject[i7];
                int position = wrap.position();
                while (i2 < i7) {
                    if (b(wrap) != 0) {
                        return null;
                    }
                    switch (this.c[position]) {
                        case 78:
                            dPObjectArr2[i2] = null;
                            break;
                        case 79:
                            dPObjectArr2[i2] = new DPObject(this.c, position, wrap.position() - position);
                            break;
                        default:
                            return null;
                    }
                    position = wrap.position();
                    i2++;
                }
                return dPObjectArr2;
            }
        }
        return null;
    }

    public final DPObject[] h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b620e969a67ec90caf1d0a4878dfb8b2", 6917529027641081856L) ? (DPObject[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b620e969a67ec90caf1d0a4878dfb8b2") : f(a(str));
    }

    public final String[] g(int i) {
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b1e2d3996176fc14136c85a541267b5", 6917529027641081856L)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b1e2d3996176fc14136c85a541267b5");
        }
        byte b2 = 66;
        if (b) {
            int nativeSeekMember = nativeSeekMember(this.c, this.d, this.e, i);
            if (nativeSeekMember > 0) {
                int i3 = this.d + nativeSeekMember;
                byte b3 = this.c[i3];
                if (b3 == 65 && nativeSeekMember + 2 < this.e) {
                    int i4 = (this.c[i3 + 2] & 255) | ((this.c[i3 + 1] & 255) << 8);
                    if (i4 == 0) {
                        return new String[0];
                    }
                    int i5 = this.d + nativeSeekMember + 3;
                    int[] iArr = new int[i4];
                    if (nativeArraySkip(this.c, i5, (this.e - nativeSeekMember) - 3, i4, iArr)) {
                        String[] strArr = new String[i4];
                        while (i2 < i4) {
                            int i6 = iArr[i2];
                            byte b4 = this.c[i5];
                            if (b4 == 78) {
                                strArr[i2] = null;
                            } else if (b4 == 83) {
                                strArr[i2] = new String(this.c, i5 + 3, ((this.c[i5 + 1] & 255) << 8) | (this.c[i5 + 2] & 255));
                            } else if (b4 != 66) {
                                return null;
                            } else {
                                strArr[i2] = new String(this.c, i5 + 5, ((this.c[i5 + 1] & 255) << 24) | ((this.c[i5 + 2] & 255) << 16) | ((this.c[i5 + 3] & 255) << 8) | (this.c[i5 + 4] & 255));
                            }
                            i5 += i6;
                            i2++;
                        }
                        return strArr;
                    }
                } else if (b3 == 78) {
                    return null;
                }
            }
        } else {
            ByteBuffer wrap = ByteBuffer.wrap(this.c, this.d, this.e);
            wrap.order(ByteOrder.BIG_ENDIAN);
            if (a(wrap, i) == 0 && wrap.remaining() > 0 && wrap.get() == 65 && wrap.remaining() > 1) {
                int i7 = wrap.getShort() & ISelectionInterface.HELD_NOTHING;
                if (i7 == 0) {
                    return new String[0];
                }
                String[] strArr2 = new String[i7];
                while (i2 < i7) {
                    if (wrap.remaining() == 0) {
                        return null;
                    }
                    byte b5 = wrap.get();
                    if (b5 != b2) {
                        if (b5 == 78) {
                            strArr2[i2] = null;
                        } else if (b5 != 83) {
                            return null;
                        } else {
                            if (wrap.remaining() > 1) {
                                int i8 = wrap.getShort() & ISelectionInterface.HELD_NOTHING;
                                if (i8 == 0) {
                                    strArr2[i2] = "";
                                } else if (wrap.remaining() >= i8) {
                                    try {
                                        strArr2[i2] = new String(this.c, wrap.position(), i8, "UTF-8");
                                    } catch (UnsupportedEncodingException unused) {
                                        strArr2[i2] = null;
                                    }
                                }
                                wrap.position(wrap.position() + i8);
                            }
                        }
                    } else if (wrap.remaining() > 3) {
                        int i9 = wrap.getInt();
                        if (i9 == 0) {
                            strArr2[i2] = "";
                        } else if (wrap.remaining() >= i9) {
                            try {
                                strArr2[i2] = new String(this.c, wrap.position(), i9, "UTF-8");
                            } catch (UnsupportedEncodingException e2) {
                                Log.e("dpobj", "unable to decode string", e2);
                                strArr2[i2] = null;
                            }
                        }
                        wrap.position(wrap.position() + i9);
                    }
                    i2++;
                    b2 = 66;
                }
                return strArr2;
            }
        }
        return null;
    }

    public int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6897273ead8cce0d2dd5be352cbb1d39", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6897273ead8cce0d2dd5be352cbb1d39")).intValue();
        }
        if (b) {
            return nativeSkipAny(this.c, this.d, this.e);
        }
        ByteBuffer wrap = ByteBuffer.wrap(this.c, this.d, this.e);
        wrap.order(ByteOrder.BIG_ENDIAN);
        int b2 = b(wrap);
        return b2 == 0 ? wrap.position() - this.d : b2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1b336ee98225dada12fc99976e9dc0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1b336ee98225dada12fc99976e9dc0a");
            return;
        }
        int c2 = c();
        if (c2 <= 0) {
            c2 = this.e;
        }
        parcel.writeInt(0);
        parcel.writeInt(c2);
        if (this.d == 0) {
            parcel.writeByteArray(this.c, 0, c2);
            return;
        }
        byte[] bArr = new byte[c2];
        System.arraycopy(this.c, this.d, bArr, 0, c2);
        parcel.writeByteArray(bArr);
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<Integer, Object>> iterator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "915431d1ba8ded21dca7512a8f0fbe6d", 6917529027641081856L) ? (Iterator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "915431d1ba8ded21dca7512a8f0fbe6d") : new b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class d {
        public static ChangeQuickRedirect a;
        public int b;
        public byte c;
        public int d;
        public long e;
        public double f;
        public long g;
        public String h;
        public DPObject i;
        public DPObject[] j;
        public int[] k;
        public String[] l;
        public double[] m;
        public boolean[] n;
        public long[] o;
        public long[] p;

        public d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(ByteArrayOutputStream byteArrayOutputStream) {
            int i = 0;
            Object[] objArr = {byteArrayOutputStream};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b651c772931e0fceed61348ab357cb98", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b651c772931e0fceed61348ab357cb98");
                return;
            }
            byte b = this.c;
            int i2 = SupportMenu.USER_MASK;
            switch (b) {
                case 65:
                    if (this.j == null) {
                        byteArrayOutputStream.write(78);
                        return;
                    }
                    int length = this.j.length;
                    if (length <= 65535) {
                        i2 = length;
                    }
                    byteArrayOutputStream.write(65);
                    byteArrayOutputStream.write((byte) (i2 >>> 8));
                    byteArrayOutputStream.write((byte) i2);
                    while (i < i2) {
                        a(byteArrayOutputStream, this.j[i]);
                        i++;
                    }
                    return;
                case 66:
                    if (this.k == null) {
                        byteArrayOutputStream.write(78);
                        return;
                    }
                    int length2 = this.k.length;
                    if (length2 <= 65535) {
                        i2 = length2;
                    }
                    byteArrayOutputStream.write(65);
                    byteArrayOutputStream.write((byte) (i2 >>> 8));
                    byteArrayOutputStream.write((byte) i2);
                    while (i < i2) {
                        int i3 = this.k[i];
                        byteArrayOutputStream.write(73);
                        byteArrayOutputStream.write((byte) (i3 >>> 24));
                        byteArrayOutputStream.write((byte) (i3 >>> 16));
                        byteArrayOutputStream.write((byte) (i3 >>> 8));
                        byteArrayOutputStream.write((byte) i3);
                        i++;
                    }
                    return;
                case 67:
                    if (this.l == null) {
                        byteArrayOutputStream.write(78);
                        return;
                    }
                    int length3 = this.l.length;
                    if (length3 <= 65535) {
                        i2 = length3;
                    }
                    byteArrayOutputStream.write(65);
                    byteArrayOutputStream.write((byte) (i2 >>> 8));
                    byteArrayOutputStream.write((byte) i2);
                    while (i < i2) {
                        a(byteArrayOutputStream, this.l[i]);
                        i++;
                    }
                    return;
                case 68:
                    byteArrayOutputStream.write(68);
                    long doubleToRawLongBits = Double.doubleToRawLongBits(this.f);
                    byteArrayOutputStream.write((byte) (doubleToRawLongBits >>> 56));
                    byteArrayOutputStream.write((byte) (doubleToRawLongBits >>> 48));
                    byteArrayOutputStream.write((byte) (doubleToRawLongBits >>> 40));
                    byteArrayOutputStream.write((byte) (doubleToRawLongBits >>> 32));
                    byteArrayOutputStream.write((byte) (doubleToRawLongBits >>> 24));
                    byteArrayOutputStream.write((byte) (doubleToRawLongBits >>> 16));
                    byteArrayOutputStream.write((byte) (doubleToRawLongBits >>> 8));
                    byteArrayOutputStream.write((byte) doubleToRawLongBits);
                    return;
                case 69:
                case 71:
                case 72:
                case 74:
                case 75:
                case 77:
                case 78:
                case 80:
                case BorderTopColor.INDEX_ID /* 81 */:
                case BorderTopEndRadius.INDEX_ID /* 82 */:
                case Elevation.INDEX_ID /* 86 */:
                default:
                    return;
                case 70:
                    byteArrayOutputStream.write(70);
                    return;
                case 73:
                    byteArrayOutputStream.write(73);
                    byteArrayOutputStream.write((byte) (this.d >>> 24));
                    byteArrayOutputStream.write((byte) (this.d >>> 16));
                    byteArrayOutputStream.write((byte) (this.d >>> 8));
                    byteArrayOutputStream.write((byte) this.d);
                    return;
                case 76:
                    byteArrayOutputStream.write(76);
                    byteArrayOutputStream.write((byte) (this.e >>> 56));
                    byteArrayOutputStream.write((byte) (this.e >>> 48));
                    byteArrayOutputStream.write((byte) (this.e >>> 40));
                    byteArrayOutputStream.write((byte) (this.e >>> 32));
                    byteArrayOutputStream.write((byte) (this.e >>> 24));
                    byteArrayOutputStream.write((byte) (this.e >>> 16));
                    byteArrayOutputStream.write((byte) (this.e >>> 8));
                    byteArrayOutputStream.write((byte) this.e);
                    return;
                case 79:
                    a(byteArrayOutputStream, this.i);
                    return;
                case BorderTopLeftRadius.INDEX_ID /* 83 */:
                    a(byteArrayOutputStream, this.h);
                    return;
                case 84:
                    byteArrayOutputStream.write(84);
                    return;
                case BorderTopStartRadius.INDEX_ID /* 85 */:
                    byteArrayOutputStream.write(88);
                    byteArrayOutputStream.write((byte) (this.g >>> 56));
                    byteArrayOutputStream.write((byte) (this.g >>> 48));
                    byteArrayOutputStream.write((byte) (this.g >>> 40));
                    byteArrayOutputStream.write((byte) (this.g >>> 32));
                    byteArrayOutputStream.write((byte) (this.g >>> 24));
                    byteArrayOutputStream.write((byte) (this.g >>> 16));
                    byteArrayOutputStream.write((byte) (this.g >>> 8));
                    byteArrayOutputStream.write((byte) this.g);
                    return;
                case Opacity.INDEX_ID /* 87 */:
                    if (this.p == null) {
                        byteArrayOutputStream.write(78);
                        return;
                    }
                    int length4 = this.p.length;
                    if (length4 <= 65535) {
                        i2 = length4;
                    }
                    byteArrayOutputStream.write(65);
                    byteArrayOutputStream.write((byte) (i2 >>> 8));
                    byteArrayOutputStream.write((byte) i2);
                    while (i < i2) {
                        long j = this.p[i];
                        byteArrayOutputStream.write(76);
                        byteArrayOutputStream.write((byte) (j >>> 56));
                        byteArrayOutputStream.write((byte) (j >>> 48));
                        byteArrayOutputStream.write((byte) (j >>> 40));
                        byteArrayOutputStream.write((byte) (j >>> 32));
                        byteArrayOutputStream.write((byte) (j >>> 24));
                        byteArrayOutputStream.write((byte) (j >>> 16));
                        byteArrayOutputStream.write((byte) (j >>> 8));
                        byteArrayOutputStream.write((byte) j);
                        i++;
                    }
                    return;
                case 88:
                    if (this.m == null) {
                        byteArrayOutputStream.write(78);
                        return;
                    }
                    int length5 = this.m.length;
                    if (length5 <= 65535) {
                        i2 = length5;
                    }
                    byteArrayOutputStream.write(65);
                    byteArrayOutputStream.write((byte) (i2 >>> 8));
                    byteArrayOutputStream.write((byte) i2);
                    while (i < i2) {
                        double d = this.m[i];
                        byteArrayOutputStream.write(68);
                        long doubleToRawLongBits2 = Double.doubleToRawLongBits(d);
                        byteArrayOutputStream.write((byte) (doubleToRawLongBits2 >>> 56));
                        byteArrayOutputStream.write((byte) (doubleToRawLongBits2 >>> 48));
                        byteArrayOutputStream.write((byte) (doubleToRawLongBits2 >>> 40));
                        byteArrayOutputStream.write((byte) (doubleToRawLongBits2 >>> 32));
                        byteArrayOutputStream.write((byte) (doubleToRawLongBits2 >>> 24));
                        byteArrayOutputStream.write((byte) (doubleToRawLongBits2 >>> 16));
                        byteArrayOutputStream.write((byte) (doubleToRawLongBits2 >>> 8));
                        byteArrayOutputStream.write((byte) doubleToRawLongBits2);
                        i++;
                    }
                    return;
                case 89:
                    if (this.n == null) {
                        byteArrayOutputStream.write(78);
                        return;
                    }
                    int length6 = this.n.length;
                    if (length6 <= 65535) {
                        i2 = length6;
                    }
                    byteArrayOutputStream.write(65);
                    byteArrayOutputStream.write((byte) (i2 >>> 8));
                    byteArrayOutputStream.write((byte) i2);
                    while (i < i2) {
                        byteArrayOutputStream.write((byte) (this.n[i] ? 84 : 70));
                        i++;
                    }
                    return;
                case 90:
                    if (this.o == null) {
                        byteArrayOutputStream.write(78);
                        return;
                    }
                    int length7 = this.o.length;
                    if (length7 <= 65535) {
                        i2 = length7;
                    }
                    byteArrayOutputStream.write(65);
                    byteArrayOutputStream.write((byte) (i2 >>> 8));
                    byteArrayOutputStream.write((byte) i2);
                    while (i < i2) {
                        long j2 = this.o[i];
                        byteArrayOutputStream.write(88);
                        byteArrayOutputStream.write((byte) (j2 >>> 56));
                        byteArrayOutputStream.write((byte) (j2 >>> 48));
                        byteArrayOutputStream.write((byte) (j2 >>> 40));
                        byteArrayOutputStream.write((byte) (j2 >>> 32));
                        byteArrayOutputStream.write((byte) (j2 >>> 24));
                        byteArrayOutputStream.write((byte) (j2 >>> 16));
                        byteArrayOutputStream.write((byte) (j2 >>> 8));
                        byteArrayOutputStream.write((byte) j2);
                        i++;
                    }
                    return;
            }
        }

        private void a(ByteArrayOutputStream byteArrayOutputStream, String str) {
            byte[] bArr;
            Object[] objArr = {byteArrayOutputStream, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3c4229bfd02e2b2ccb96fda133f34a2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3c4229bfd02e2b2ccb96fda133f34a2");
            } else if (str == null) {
                byteArrayOutputStream.write(78);
            } else {
                byteArrayOutputStream.write(66);
                try {
                    bArr = str.getBytes("UTF-8");
                } catch (Exception unused) {
                    bArr = new byte[0];
                }
                int length = bArr.length;
                byteArrayOutputStream.write((byte) (length >>> 24));
                byteArrayOutputStream.write((byte) (length >>> 16));
                byteArrayOutputStream.write((byte) (length >>> 8));
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bArr, 0, length);
            }
        }

        private void a(ByteArrayOutputStream byteArrayOutputStream, DPObject dPObject) {
            Object[] objArr = {byteArrayOutputStream, dPObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a5107e05fd13ff783471a5296fd6613", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a5107e05fd13ff783471a5296fd6613");
            } else if (dPObject != null) {
                int c = dPObject.c();
                if (c > 0) {
                    byteArrayOutputStream.write(dPObject.c, dPObject.d, c);
                    return;
                }
                byteArrayOutputStream.write(79);
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(90);
            } else {
                byteArrayOutputStream.write(78);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements Map.Entry<Integer, Object> {
        public static ChangeQuickRedirect a;
        private int c;

        @Override // java.util.Map.Entry
        public final /* synthetic */ Integer getKey() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68a2ed5cc9b18e8ec1bceca571a43d5c", 6917529027641081856L) ? (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68a2ed5cc9b18e8ec1bceca571a43d5c") : Integer.valueOf(this.c);
        }

        public a(int i) {
            Object[] objArr = {DPObject.this, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db71ceeb32d15920c627b73baa0adf40", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db71ceeb32d15920c627b73baa0adf40");
            } else {
                this.c = i;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        @Override // java.util.Map.Entry
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object getValue() {
            /*
                Method dump skipped, instructions count: 828
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.archive.DPObject.a.getValue():java.lang.Object");
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "749c89fccd640fdf0d8641a3c3271507", 6917529027641081856L)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "749c89fccd640fdf0d8641a3c3271507");
            }
            throw new UnsupportedOperationException();
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ac4efdc24c65608181cc3ee0340b285", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ac4efdc24c65608181cc3ee0340b285");
            }
            return "0x" + Integer.toHexString(this.c) + ": " + getValue();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class b implements Iterator<Map.Entry<Integer, Object>> {
        public static ChangeQuickRedirect a;
        public ByteBuffer b;
        public a c;

        @Override // java.util.Iterator
        public final /* synthetic */ Map.Entry<Integer, Object> next() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc763a363cb3048a634017a43fe132d6", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc763a363cb3048a634017a43fe132d6");
            }
            if (this.c == null) {
                throw new NoSuchElementException();
            }
            a aVar = this.c;
            a();
            return aVar;
        }

        public b() {
            Object[] objArr = {DPObject.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b3913171d115432413ec270ea899e74", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b3913171d115432413ec270ea899e74");
                return;
            }
            this.b = ByteBuffer.wrap(DPObject.this.c, DPObject.this.d, DPObject.this.e);
            this.b.order(ByteOrder.BIG_ENDIAN);
            if (this.b.remaining() > 3) {
                this.b.get();
                this.b.getShort();
                a();
            }
        }

        private void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "721a8f2f0236fde38f90593a8579e3b2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "721a8f2f0236fde38f90593a8579e3b2");
            } else if (this.b.remaining() > 0) {
                if (this.b.get() == 77) {
                    if (this.b.remaining() > 1) {
                        int i = this.b.getShort() & ISelectionInterface.HELD_NOTHING;
                        if (DPObject.b) {
                            int nativeSkipAny = DPObject.nativeSkipAny(DPObject.this.c, this.b.position(), (DPObject.this.d + DPObject.this.e) - this.b.position());
                            if (nativeSkipAny > 0) {
                                this.b.position(this.b.position() + nativeSkipAny);
                                this.c = new a(i);
                                return;
                            }
                            this.c = null;
                            return;
                        } else if (DPObject.b(this.b) == 0) {
                            this.c = new a(i);
                            return;
                        } else {
                            this.c = null;
                            return;
                        }
                    }
                    return;
                }
                this.c = null;
            } else {
                this.c = null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d24674daf3a21cfeedbfa8271d96425", 6917529027641081856L)) {
                throw new UnsupportedOperationException();
            }
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d24674daf3a21cfeedbfa8271d96425");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class c implements e {
        public static ChangeQuickRedirect a;
        private final ArrayList<d> c;

        private c() {
            Object[] objArr = {DPObject.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b952b640379b81c08a8bd160237234e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b952b640379b81c08a8bd160237234e");
            } else {
                this.c = new ArrayList<>();
            }
        }

        @Override // com.dianping.archive.DPObject.e
        public final /* synthetic */ e a(String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "223e86f28a04920fb8c1967e4cc43f2f", 6917529027641081856L)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "223e86f28a04920fb8c1967e4cc43f2f");
            }
            int a2 = DPObject.a(str);
            Object[] objArr2 = {Integer.valueOf(a2), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fef9b11d1952c20b65bbba91a00b8ca6", 6917529027641081856L)) {
                c cVar = (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fef9b11d1952c20b65bbba91a00b8ca6");
            } else {
                d dVar = new d();
                dVar.b = a2;
                dVar.c = (byte) 73;
                dVar.d = i;
                this.c.add(dVar);
            }
            return this;
        }

        @Override // com.dianping.archive.DPObject.e
        public final /* synthetic */ e a(String str, long j) {
            Object[] objArr = {str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe4487e3b9362824022cacc124c51f95", 6917529027641081856L)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe4487e3b9362824022cacc124c51f95");
            }
            int a2 = DPObject.a(str);
            Object[] objArr2 = {Integer.valueOf(a2), new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "507e9e945f381a39e096ce9ccdd3c3b1", 6917529027641081856L)) {
                c cVar = (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "507e9e945f381a39e096ce9ccdd3c3b1");
            } else {
                d dVar = new d();
                dVar.b = a2;
                dVar.c = (byte) 76;
                dVar.e = j;
                this.c.add(dVar);
            }
            return this;
        }

        @Override // com.dianping.archive.DPObject.e
        public final /* synthetic */ e a(String str, DPObject dPObject) {
            Object[] objArr = {str, dPObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "667b52c6c4ab75006add668f30447006", 6917529027641081856L)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "667b52c6c4ab75006add668f30447006");
            }
            int a2 = DPObject.a(str);
            Object[] objArr2 = {Integer.valueOf(a2), dPObject};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9831f8ed12b3f0e3b58ef0a8b17509f", 6917529027641081856L)) {
                c cVar = (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9831f8ed12b3f0e3b58ef0a8b17509f");
            } else {
                d dVar = new d();
                dVar.b = a2;
                dVar.c = (byte) 79;
                dVar.i = dPObject;
                this.c.add(dVar);
            }
            return this;
        }

        @Override // com.dianping.archive.DPObject.e
        public final /* synthetic */ e a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e04feb6b539e413df672c7658302d7fc", 6917529027641081856L)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e04feb6b539e413df672c7658302d7fc");
            }
            int a2 = DPObject.a(str);
            Object[] objArr2 = {Integer.valueOf(a2), str2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cfef5f06984ac97f0a21ed03c73dfc64", 6917529027641081856L)) {
                c cVar = (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cfef5f06984ac97f0a21ed03c73dfc64");
            } else {
                d dVar = new d();
                dVar.b = a2;
                dVar.c = (byte) 83;
                dVar.h = str2;
                this.c.add(dVar);
            }
            return this;
        }

        @Override // com.dianping.archive.DPObject.e
        public final /* synthetic */ e a(String str, boolean z) {
            Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75e75ebe391491a6bea6ee2d7e69f948", 6917529027641081856L)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75e75ebe391491a6bea6ee2d7e69f948");
            }
            int a2 = DPObject.a(str);
            Object[] objArr2 = {Integer.valueOf(a2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4218e6995ecba0dae83d0831cce5ef5", 6917529027641081856L)) {
                c cVar = (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4218e6995ecba0dae83d0831cce5ef5");
            } else {
                d dVar = new d();
                dVar.b = a2;
                dVar.c = (byte) (z ? 84 : 70);
                this.c.add(dVar);
            }
            return this;
        }

        @Override // com.dianping.archive.DPObject.e
        public final /* synthetic */ e a(String str, DPObject[] dPObjectArr) {
            Object[] objArr = {str, dPObjectArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f55a70a8e38318d28525a21576ec2b1b", 6917529027641081856L)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f55a70a8e38318d28525a21576ec2b1b");
            }
            int a2 = DPObject.a(str);
            Object[] objArr2 = {Integer.valueOf(a2), dPObjectArr};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "21fbb7a057528a85e986b4c479cb469a", 6917529027641081856L)) {
                c cVar = (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "21fbb7a057528a85e986b4c479cb469a");
            } else {
                d dVar = new d();
                dVar.b = a2;
                dVar.c = (byte) 65;
                dVar.j = dPObjectArr;
                this.c.add(dVar);
            }
            return this;
        }

        @Override // com.dianping.archive.DPObject.e
        public final DPObject a() {
            int i;
            int position;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ad167a9f2a329a18b13fbe861ae8b77", 6917529027641081856L)) {
                return (DPObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ad167a9f2a329a18b13fbe861ae8b77");
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            HashMap hashMap = new HashMap(this.c.size());
            Iterator<d> it = this.c.iterator();
            while (it.hasNext()) {
                d next = it.next();
                hashMap.put(Integer.valueOf(next.b), next);
            }
            int i2 = 3;
            if (DPObject.this.e <= 2 || DPObject.this.c[0] != 79) {
                if (DPObject.this.e > 4 && DPObject.this.c[0] == 81) {
                    byteArrayOutputStream.write(81);
                    byteArrayOutputStream.write(DPObject.this.c[DPObject.this.d + 1]);
                    byteArrayOutputStream.write(DPObject.this.c[DPObject.this.d + 2]);
                    byteArrayOutputStream.write(DPObject.this.c[DPObject.this.d + 3]);
                    byteArrayOutputStream.write(DPObject.this.c[DPObject.this.d + 4]);
                    i2 = 5;
                } else {
                    byteArrayOutputStream.write(79);
                    byteArrayOutputStream.write(0);
                    byteArrayOutputStream.write(0);
                }
            } else {
                byteArrayOutputStream.write(79);
                byteArrayOutputStream.write(DPObject.this.c[DPObject.this.d + 1]);
                byteArrayOutputStream.write(DPObject.this.c[DPObject.this.d + 2]);
            }
            while (i2 < DPObject.this.e) {
                byte b = DPObject.this.c[DPObject.this.d + i2];
                int i3 = i2 + 1;
                if (b != 77 || (i = i3 + 2) >= DPObject.this.e) {
                    break;
                }
                int i4 = (DPObject.this.c[DPObject.this.d + i3 + 1] & 255) | ((DPObject.this.c[DPObject.this.d + i3] & 255) << 8);
                d dVar = (d) hashMap.remove(Integer.valueOf(i4));
                if (DPObject.b) {
                    position = DPObject.nativeSkipAny(DPObject.this.c, DPObject.this.d + i, DPObject.this.e - i);
                } else {
                    ByteBuffer wrap = ByteBuffer.wrap(DPObject.this.c, DPObject.this.d + i, DPObject.this.e - i);
                    wrap.order(ByteOrder.BIG_ENDIAN);
                    int b2 = DPObject.b(wrap);
                    position = b2 == 0 ? (wrap.position() - DPObject.this.d) - i : b2;
                }
                if (dVar == null) {
                    if (position <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(77);
                    byteArrayOutputStream.write((byte) (i4 >>> 8));
                    byteArrayOutputStream.write((byte) i4);
                    byteArrayOutputStream.write(DPObject.this.c, DPObject.this.d + i, position);
                } else if (dVar.c != 82) {
                    byteArrayOutputStream.write(77);
                    byteArrayOutputStream.write((byte) (i4 >>> 8));
                    byteArrayOutputStream.write((byte) i4);
                    dVar.a(byteArrayOutputStream);
                }
                if (position <= 0) {
                    break;
                }
                i2 = i + position;
            }
            Iterator<d> it2 = this.c.iterator();
            while (it2.hasNext()) {
                d dVar2 = (d) hashMap.remove(Integer.valueOf(it2.next().b));
                if (dVar2 != null && dVar2.c != 82) {
                    byteArrayOutputStream.write(77);
                    byteArrayOutputStream.write((byte) (dVar2.b >>> 8));
                    byteArrayOutputStream.write((byte) dVar2.b);
                    dVar2.a(byteArrayOutputStream);
                }
            }
            byteArrayOutputStream.write(90);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            return new DPObject(byteArray, 0, byteArray.length);
        }
    }
}
