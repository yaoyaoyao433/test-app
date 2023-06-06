package com.tencent.mapsdk.core.components.protocol.jce.sso;

import com.dianping.picasso.PicassoBounceOnTouchListener;
import com.qq.taf.jce.a;
import com.tencent.mapsdk.internal.k;
import com.tencent.mapsdk.internal.m;
import com.tencent.mapsdk.internal.n;
import com.tencent.mapsdk.internal.q;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class Package extends a implements Cloneable {
    static int a;
    static byte[] b;
    static byte[] c;
    static ArrayList<Tag> d;
    static final /* synthetic */ boolean e = !Package.class.desiredAssertionStatus();
    public byte[] busiBuff;
    public byte cEncodeType;
    public int eCmd;
    public byte[] head;
    public int iSeqNo;
    public String sAppId;
    public short shVer;
    public String strSubCmd;
    public String uin;
    public ArrayList<Tag> vTag;

    @Override // com.tencent.mapsdk.internal.p
    public final String className() {
        return "sosomap.Package";
    }

    public final byte[] getHead() {
        return this.head;
    }

    public final byte[] getBusiBuff() {
        return this.busiBuff;
    }

    public Package() {
        this.shVer = (short) 0;
        this.eCmd = 0;
        this.strSubCmd = "";
        this.iSeqNo = 0;
        this.cEncodeType = (byte) 0;
        this.sAppId = "";
        this.uin = "";
        this.head = null;
        this.busiBuff = null;
        this.vTag = null;
    }

    public Package(short s, int i, String str, int i2, byte b2, String str2, String str3, byte[] bArr, byte[] bArr2, ArrayList<Tag> arrayList) {
        this.shVer = (short) 0;
        this.eCmd = 0;
        this.strSubCmd = "";
        this.iSeqNo = 0;
        this.cEncodeType = (byte) 0;
        this.sAppId = "";
        this.uin = "";
        this.head = null;
        this.busiBuff = null;
        this.vTag = null;
        this.shVer = s;
        this.eCmd = i;
        this.strSubCmd = str;
        this.iSeqNo = i2;
        this.cEncodeType = b2;
        this.sAppId = str2;
        this.uin = str3;
        this.head = bArr;
        this.busiBuff = bArr2;
        this.vTag = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Package r4 = (Package) obj;
        return q.a(this.shVer, r4.shVer) && q.a(this.eCmd, r4.eCmd) && q.a((Object) this.strSubCmd, (Object) r4.strSubCmd) && q.a(this.iSeqNo, r4.iSeqNo) && q.a(this.cEncodeType, r4.cEncodeType) && q.a((Object) this.sAppId, (Object) r4.sAppId) && q.a((Object) this.uin, (Object) r4.uin) && q.a((Object) this.head, (Object) r4.head) && q.a((Object) this.busiBuff, (Object) r4.busiBuff) && q.a((Object) this.vTag, (Object) r4.vTag);
    }

    public final int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (e) {
                return null;
            }
            throw new AssertionError();
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(n nVar) {
        nVar.a(this.shVer, 0);
        nVar.a(this.eCmd, 1);
        nVar.a(this.strSubCmd, 2);
        nVar.a(this.iSeqNo, 3);
        nVar.a(this.cEncodeType, 4);
        if (this.sAppId != null) {
            nVar.a(this.sAppId, 5);
        }
        if (this.uin != null) {
            nVar.a(this.uin, 6);
        }
        if (this.head != null) {
            nVar.a(this.head, 7);
        }
        if (this.busiBuff != null) {
            nVar.a(this.busiBuff, 8);
        }
        if (this.vTag != null) {
            nVar.a((Collection) this.vTag, 9);
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(m mVar) {
        this.shVer = mVar.a(this.shVer, 0, true);
        this.eCmd = mVar.a(this.eCmd, 1, true);
        this.strSubCmd = mVar.b(2, true);
        this.iSeqNo = mVar.a(this.iSeqNo, 3, false);
        this.cEncodeType = mVar.a(this.cEncodeType, 4, false);
        this.sAppId = mVar.b(5, false);
        this.uin = mVar.b(6, false);
        if (b == null) {
            b = r0;
            byte[] bArr = {0};
        }
        this.head = mVar.c(7, false);
        if (c == null) {
            c = r0;
            byte[] bArr2 = {0};
        }
        this.busiBuff = mVar.c(8, false);
        if (d == null) {
            d = new ArrayList<>();
            d.add(new Tag());
        }
        this.vTag = (ArrayList) mVar.a((m) d, 9, false);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void display(StringBuilder sb, int i) {
        k kVar = new k(sb, i);
        kVar.a(this.shVer, "shVer");
        kVar.a(this.eCmd, "eCmd");
        kVar.a(this.strSubCmd, "strSubCmd");
        kVar.a(this.iSeqNo, "iSeqNo");
        kVar.a(this.cEncodeType, "cEncodeType");
        kVar.a(this.sAppId, "sAppId");
        kVar.a(this.uin, "uin");
        kVar.a(this.head, PicassoBounceOnTouchListener.HEAD_BOUNCE);
        kVar.a(this.busiBuff, "busiBuff");
        kVar.a((Collection) this.vTag, "vTag");
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void displaySimple(StringBuilder sb, int i) {
        k kVar = new k(sb, i);
        kVar.a(this.shVer, true);
        kVar.a(this.eCmd, true);
        kVar.a(this.strSubCmd, true);
        kVar.a(this.iSeqNo, true);
        kVar.a(this.cEncodeType, true);
        kVar.a(this.sAppId, true);
        kVar.a(this.uin, true);
        kVar.a(this.head, true);
        kVar.a(this.busiBuff, true);
        kVar.a((Collection) this.vTag, false);
    }
}
