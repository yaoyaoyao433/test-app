package com.meituan.android.privacy.interfaces.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements b {
    public static ChangeQuickRedirect a;
    public boolean b;
    public boolean c;
    public boolean d;
    public long e;
    public boolean f;
    public boolean g;
    public String h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public transient int m;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ad868ba4f47d2b6e7c2d58c20c01c34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ad868ba4f47d2b6e7c2d58c20c01c34");
            return;
        }
        this.b = true;
        this.c = false;
        this.d = true;
        this.f = false;
        this.g = false;
        this.h = "USER_TRIGGER";
        this.k = 0;
        this.l = false;
        this.m = -1;
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3678051271269701debb608e13e8342c", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3678051271269701debb608e13e8342c") : new c();
    }

    @Override // com.meituan.android.privacy.interfaces.config.b
    public final void a(DataOutput dataOutput, ByteBuffer byteBuffer) throws IOException {
        Object[] objArr = {dataOutput, byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51305316f33c506776e9a247c3fa13df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51305316f33c506776e9a247c3fa13df");
            return;
        }
        dataOutput.writeBoolean(this.b);
        dataOutput.writeBoolean(this.c);
        dataOutput.writeBoolean(this.d);
        dataOutput.writeLong(this.e);
        dataOutput.writeBoolean(this.f);
        dataOutput.writeBoolean(this.g);
        dataOutput.writeBoolean(c());
        dataOutput.writeBoolean(this.i);
        dataOutput.writeBoolean(this.j);
        dataOutput.writeInt(this.k);
        dataOutput.writeBoolean(this.l);
    }

    public final boolean b() {
        return this.b && this.d;
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bb930485b6f9c1eb38f27123eb99d6a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bb930485b6f9c1eb38f27123eb99d6a")).booleanValue() : "AUTO_TRIGGER".equals(this.h);
    }

    public final c d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41ac0350a0f5ec1d04ef24858fdd7d26", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41ac0350a0f5ec1d04ef24858fdd7d26") : a(new c());
    }

    private <T extends c> T a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78c7b8d3357b409bb36e1c582fba1f5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78c7b8d3357b409bb36e1c582fba1f5d");
        }
        t.b = this.b;
        t.d = this.d;
        t.e = this.e;
        t.f = this.f;
        t.g = this.g;
        t.h = this.h;
        t.k = this.k;
        t.j = this.j;
        t.i = this.i;
        t.l = this.l;
        return t;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31ee37247e897d238148e7ac40660dc4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31ee37247e897d238148e7ac40660dc4");
        }
        return "PrivacyPolicy{enable=" + this.b + ", enableOnBackground=" + this.d + ", threshold=" + this.e + ", enableShowAppAlert=" + this.f + ", needScenePermission=" + this.g + ", perceptionType='" + this.h + "', enableFirstPass=" + this.i + ", onlyCache=" + this.j + ", intervalShowAppAlert=" + this.k + ", mnCheckHijack=" + this.l + '}';
    }

    public static void a(DataOutput dataOutput, ByteBuffer byteBuffer, String str) throws IOException {
        Object[] objArr = {dataOutput, byteBuffer, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b70de6b681d334b586c721e90bd9d9db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b70de6b681d334b586c721e90bd9d9db");
        } else if (str == null) {
            dataOutput.writeInt(-1);
        } else if (str.length() == 0) {
            dataOutput.writeInt(0);
        } else {
            byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
            dataOutput.writeInt(bytes.length);
            dataOutput.write(bytes);
        }
    }

    public static String a(DataInput dataInput, ByteBuffer byteBuffer) throws IOException {
        Object[] objArr = {dataInput, byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b043f598db39a39eca3861142528f89", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b043f598db39a39eca3861142528f89");
        }
        int readInt = dataInput.readInt();
        if (readInt < 0) {
            return null;
        }
        if (readInt == 0) {
            return "";
        }
        if (readInt > 3000000) {
            throw new IOException("size too large");
        }
        byte[] bArr = new byte[readInt];
        dataInput.readFully(bArr);
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
