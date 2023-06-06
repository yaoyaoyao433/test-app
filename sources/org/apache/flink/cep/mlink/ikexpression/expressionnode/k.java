package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
import org.apache.flink.cep.pattern.conditions.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class k extends a<org.apache.flink.cep.mlink.ikexpression.datameta.b> {
    public a h;
    public a i;
    public a j;

    public k(JSONObject jSONObject) {
        super(jSONObject);
        if (jSONObject.has("predicate")) {
            this.h = f.a(jSONObject.optJSONObject("predicate"));
        }
        if (jSONObject.has("trueExpr")) {
            this.i = f.a(jSONObject.optJSONObject("trueExpr"));
        }
        if (jSONObject.has(" falseExpr")) {
            this.j = f.a(jSONObject.optJSONObject("falseExpr"));
        }
    }

    @Override // org.apache.flink.cep.mlink.ikexpression.expressionnode.a
    public final /* synthetic */ org.apache.flink.cep.mlink.ikexpression.datameta.b a(StreamData streamData, b.a aVar, org.apache.flink.cep.mlink.ikexpression.datameta.b bVar) throws org.apache.flink.cep.mlink.ikexpression.b {
        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2;
        if (this.h != null) {
            bVar2 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.h.a(streamData, aVar, bVar);
        } else {
            bVar2 = new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
        }
        return (bVar2 == null || !bVar2.d().booleanValue()) ? this.j != null ? (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.j.a(streamData, aVar, bVar) : new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null) : this.i != null ? (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.i.a(streamData, aVar, bVar) : new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
    }
}
