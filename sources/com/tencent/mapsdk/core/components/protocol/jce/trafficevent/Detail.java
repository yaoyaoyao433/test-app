package com.tencent.mapsdk.core.components.protocol.jce.trafficevent;

import com.qq.taf.jce.a;
import com.tencent.mapsdk.internal.m;
import com.tencent.mapsdk.internal.n;
import com.tencent.mapsdk.internal.p;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class Detail extends a {
    static Basic a = new Basic();
    static ArrayList<Float> b = new ArrayList<>();
    public Basic basic;
    public ArrayList<Float> coord;

    public Detail() {
        this.basic = null;
        this.coord = null;
    }

    public Detail(Basic basic, ArrayList<Float> arrayList) {
        this.basic = null;
        this.coord = null;
        this.basic = basic;
        this.coord = arrayList;
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(n nVar) {
        nVar.a((p) this.basic, 0);
        if (this.coord != null) {
            nVar.a((Collection) this.coord, 1);
        }
    }

    static {
        b.add(Float.valueOf(0.0f));
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(m mVar) {
        this.basic = (Basic) mVar.a((p) a, 0, true);
        this.coord = (ArrayList) mVar.a((m) b, 1, false);
    }
}
