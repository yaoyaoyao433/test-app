package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.pattern.conditions.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class n extends a<org.apache.flink.cep.mlink.ikexpression.datameta.b> {
    public n(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // org.apache.flink.cep.mlink.ikexpression.expressionnode.a
    public final /* bridge */ /* synthetic */ org.apache.flink.cep.mlink.ikexpression.datameta.b a(StreamData streamData, b.a aVar, org.apache.flink.cep.mlink.ikexpression.datameta.b bVar) throws org.apache.flink.cep.mlink.ikexpression.b {
        super.a(streamData, aVar, bVar);
        return bVar;
    }
}
