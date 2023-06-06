package com.tencent.mapsdk.core.components.protocol.jce.rtt;

import com.qq.taf.jce.a;
import com.tencent.mapsdk.internal.k;
import com.tencent.mapsdk.internal.m;
import com.tencent.mapsdk.internal.n;
import com.tencent.mapsdk.internal.q;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class RttRequest extends a implements Cloneable {
    public ArrayList<Integer> bounds;
    public short zip;
    public short zoom;
    static final /* synthetic */ boolean b = !RttRequest.class.desiredAssertionStatus();
    static ArrayList<Integer> a = new ArrayList<>();

    @Override // com.tencent.mapsdk.internal.p
    public final String className() {
        return "navsns.RttRequest";
    }

    static {
        a.add(0);
    }

    public final ArrayList<Integer> getBounds() {
        return this.bounds;
    }

    public final void setBounds(ArrayList<Integer> arrayList) {
        this.bounds = arrayList;
    }

    public final short getZoom() {
        return this.zoom;
    }

    public final void setZoom(short s) {
        this.zoom = s;
    }

    public final short getZip() {
        return this.zip;
    }

    public final void setZip(short s) {
        this.zip = s;
    }

    public RttRequest() {
        this.bounds = null;
        this.zoom = (short) 0;
        this.zip = (short) 0;
    }

    public RttRequest(ArrayList<Integer> arrayList, short s, short s2) {
        this.bounds = null;
        this.zoom = (short) 0;
        this.zip = (short) 0;
        this.bounds = arrayList;
        this.zoom = s;
        this.zip = s2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        RttRequest rttRequest = (RttRequest) obj;
        return q.a((Object) this.bounds, (Object) rttRequest.bounds) && q.a(this.zoom, rttRequest.zoom) && q.a(this.zip, rttRequest.zip);
    }

    public final int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (b) {
                return null;
            }
            throw new AssertionError();
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(n nVar) {
        nVar.a((Collection) this.bounds, 0);
        nVar.a(this.zoom, 1);
        nVar.a(this.zip, 2);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(m mVar) {
        this.bounds = (ArrayList) mVar.a((m) a, 0, true);
        this.zoom = mVar.a(this.zoom, 1, true);
        this.zip = mVar.a(this.zip, 2, true);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void display(StringBuilder sb, int i) {
        k kVar = new k(sb, i);
        kVar.a((Collection) this.bounds, "bounds");
        kVar.a(this.zoom, "zoom");
        kVar.a(this.zip, "zip");
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void displaySimple(StringBuilder sb, int i) {
        k kVar = new k(sb, i);
        kVar.a((Collection) this.bounds, true);
        kVar.a(this.zoom, true);
        kVar.a(this.zip, false);
    }
}
