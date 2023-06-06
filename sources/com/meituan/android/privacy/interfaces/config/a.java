package com.meituan.android.privacy.interfaces.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    public boolean b;
    public int c;
    public String d;
    public String e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22dfe5164ddd297ba8ddfd6b20866f1b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22dfe5164ddd297ba8ddfd6b20866f1b");
            return;
        }
        this.b = false;
        this.c = 0;
        this.d = "";
        this.e = "";
    }

    @Override // com.meituan.android.privacy.interfaces.config.b
    public final void a(DataOutput dataOutput, ByteBuffer byteBuffer) throws IOException {
        Object[] objArr = {dataOutput, byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81a6af5ae041c207f6a094296dce6c0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81a6af5ae041c207f6a094296dce6c0f");
            return;
        }
        dataOutput.writeBoolean(this.b);
        dataOutput.writeInt(this.c);
        c.a(dataOutput, byteBuffer, this.d);
        c.a(dataOutput, byteBuffer, this.e);
    }

    public final void a(DataInput dataInput, ByteBuffer byteBuffer) throws IOException {
        Object[] objArr = {dataInput, byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47f3d38022919a5ae54301b33444521c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47f3d38022919a5ae54301b33444521c");
            return;
        }
        this.b = dataInput.readBoolean();
        this.c = dataInput.readInt();
        this.d = c.a(dataInput, byteBuffer);
        this.e = c.a(dataInput, byteBuffer);
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72706aa46b0bc009fde507b7eb29f84a", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72706aa46b0bc009fde507b7eb29f84a") : new a();
    }
}
