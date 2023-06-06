package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
import org.apache.flink.cep.pattern.conditions.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class d extends a<org.apache.flink.cep.mlink.ikexpression.datameta.b> {
    public d(JSONObject jSONObject) {
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
                case -2140646662:
                    if (str.equals("LessThan")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1701951333:
                    if (str.equals("GreaterThan")) {
                        c = 1;
                        break;
                    }
                    break;
                case 159386799:
                    if (str.equals("EqualTo")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1564285430:
                    if (str.equals("GreaterThanOrEqual")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1718843063:
                    if (str.equals("LessThanOrEqual")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.e = new org.apache.flink.cep.mlink.ikexpression.op.define.e();
                    break;
                case 1:
                    this.e = new org.apache.flink.cep.mlink.ikexpression.op.define.g();
                    break;
                case 2:
                    this.e = new org.apache.flink.cep.mlink.ikexpression.op.define.f();
                    break;
                case 3:
                    this.e = new org.apache.flink.cep.mlink.ikexpression.op.define.i();
                    break;
                case 4:
                    this.e = new org.apache.flink.cep.mlink.ikexpression.op.define.h();
                    break;
            }
            return this.e.a(new org.apache.flink.cep.mlink.ikexpression.datameta.b[]{bVar2, bVar3});
        }
        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
    }
}
