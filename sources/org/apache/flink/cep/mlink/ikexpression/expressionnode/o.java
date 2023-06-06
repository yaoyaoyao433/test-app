package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
import org.apache.flink.cep.pattern.conditions.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class o extends a<org.apache.flink.cep.mlink.ikexpression.datameta.b> {
    public o(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // org.apache.flink.cep.mlink.ikexpression.expressionnode.a
    public final /* synthetic */ org.apache.flink.cep.mlink.ikexpression.datameta.b a(StreamData streamData, b.a aVar, org.apache.flink.cep.mlink.ikexpression.datameta.b bVar) throws org.apache.flink.cep.mlink.ikexpression.b {
        if (this.b != null && this.c != null) {
            org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.b.a(streamData, aVar, bVar);
            org.apache.flink.cep.mlink.ikexpression.datameta.b bVar3 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.c.a(streamData, aVar, bVar);
            String str = this.a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 2563) {
                if (hashCode == 65975 && str.equals("And")) {
                    c = 0;
                }
            } else if (str.equals("Or")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    this.e = new org.apache.flink.cep.mlink.ikexpression.op.define.a();
                    break;
                case 1:
                    this.e = new org.apache.flink.cep.mlink.ikexpression.op.define.p();
                    break;
                default:
                    throw new org.apache.flink.cep.mlink.ikexpression.b();
            }
            return this.e.a(new org.apache.flink.cep.mlink.ikexpression.datameta.b[]{bVar2, bVar3});
        }
        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
    }
}
