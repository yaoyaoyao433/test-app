package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import java.util.regex.Pattern;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
import org.apache.flink.cep.pattern.conditions.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class s extends a<org.apache.flink.cep.mlink.ikexpression.datameta.b> {
    public a<org.apache.flink.cep.mlink.ikexpression.datameta.b> h;

    public s(JSONObject jSONObject) {
        super(jSONObject);
        if (jSONObject == null || !jSONObject.has("regexpExpr")) {
            return;
        }
        this.h = f.a(jSONObject.optJSONObject("regexpExpr"));
    }

    @Override // org.apache.flink.cep.mlink.ikexpression.expressionnode.a
    public final /* synthetic */ org.apache.flink.cep.mlink.ikexpression.datameta.b a(StreamData streamData, b.a aVar, org.apache.flink.cep.mlink.ikexpression.datameta.b bVar) throws org.apache.flink.cep.mlink.ikexpression.b {
        super.a(streamData, aVar, bVar);
        if (this.d != null && this.h != null) {
            org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.d.a(streamData, aVar, bVar);
            org.apache.flink.cep.mlink.ikexpression.datameta.b a = this.h.a(streamData, aVar, bVar);
            if (bVar2 != null && a != null) {
                String b = bVar2.b();
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.valueOf(Pattern.matches(a.b(), b)));
            }
        }
        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
    }
}
