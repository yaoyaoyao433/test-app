package org.apache.flink.cep.mlink.condition;

import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.ikexpression.expressionnode.g;
import org.apache.flink.cep.pattern.conditions.b;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a extends b<StreamData> {
    public org.apache.flink.cep.mlink.ikexpression.expressionnode.a<org.apache.flink.cep.mlink.ikexpression.datameta.b> a;

    @Override // org.apache.flink.cep.pattern.conditions.b
    public final /* synthetic */ boolean filter(StreamData streamData, b.a<StreamData> aVar) throws Exception {
        StreamData streamData2 = streamData;
        if (this.a != null) {
            return g.a(this.a.a(streamData2, aVar, null));
        }
        return false;
    }

    public a(org.apache.flink.cep.mlink.ikexpression.expressionnode.a aVar) {
        this.a = aVar;
    }
}
