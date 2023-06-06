package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
import org.apache.flink.cep.pattern.conditions.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b extends a<org.apache.flink.cep.mlink.ikexpression.datameta.b> {
    public b(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // org.apache.flink.cep.mlink.ikexpression.expressionnode.a
    public final /* synthetic */ org.apache.flink.cep.mlink.ikexpression.datameta.b a(StreamData streamData, b.a aVar, org.apache.flink.cep.mlink.ikexpression.datameta.b bVar) throws org.apache.flink.cep.mlink.ikexpression.b {
        if (this.b != null && this.c != null) {
            org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.b.a(streamData, aVar, bVar);
            org.apache.flink.cep.mlink.ikexpression.datameta.b bVar3 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.c.a(streamData, aVar, bVar);
            String str = this.a;
            char c = 65535;
            switch (str.hashCode()) {
                case -1995604172:
                    if (str.equals("Subtract")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1421166075:
                    if (str.equals("Remainder")) {
                        c = 4;
                        break;
                    }
                    break;
                case 65665:
                    if (str.equals("Add")) {
                        c = 0;
                        break;
                    }
                    break;
                case 718473796:
                    if (str.equals("Multiply")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2047371417:
                    if (str.equals("Divide")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.e = new org.apache.flink.cep.mlink.ikexpression.op.define.q();
                    break;
                case 1:
                    this.e = new org.apache.flink.cep.mlink.ikexpression.op.define.j();
                    break;
                case 2:
                    this.e = new org.apache.flink.cep.mlink.ikexpression.op.define.l();
                    break;
                case 3:
                    this.e = new org.apache.flink.cep.mlink.ikexpression.op.define.d();
                    break;
                case 4:
                    this.e = new org.apache.flink.cep.mlink.ikexpression.op.define.k();
                    break;
            }
            return this.e.a(new org.apache.flink.cep.mlink.ikexpression.datameta.b[]{bVar2, bVar3});
        }
        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
    }
}
