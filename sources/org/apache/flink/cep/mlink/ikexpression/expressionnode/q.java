package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
import org.apache.flink.cep.pattern.conditions.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class q extends a<org.apache.flink.cep.mlink.ikexpression.datameta.b> {
    public q(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // org.apache.flink.cep.mlink.ikexpression.expressionnode.a
    public final /* synthetic */ org.apache.flink.cep.mlink.ikexpression.datameta.b a(StreamData streamData, b.a aVar, org.apache.flink.cep.mlink.ikexpression.datameta.b bVar) throws org.apache.flink.cep.mlink.ikexpression.b {
        if (this.d != null) {
            org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.d.a(streamData, aVar, bVar);
            String str = this.a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -2096394767) {
                if (hashCode != -742217136) {
                    if (hashCode == 78515 && str.equals("Not")) {
                        c = 2;
                    }
                } else if (str.equals("IsNotNull")) {
                    c = 0;
                }
            } else if (str.equals("IsNull")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    if (bVar2.a() == a.EnumC1538a.DATATYPE_NULL) {
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
                    }
                    if (bVar2.b == null) {
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
                    }
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
                case 1:
                    if (bVar2.a() == a.EnumC1538a.DATATYPE_NULL) {
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
                    }
                    if (bVar2.b == null) {
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
                    }
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
                case 2:
                    this.e = new org.apache.flink.cep.mlink.ikexpression.op.define.o();
                    return this.e.a(new org.apache.flink.cep.mlink.ikexpression.datameta.b[]{bVar2});
                default:
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
            }
        }
        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
    }
}
