package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.pattern.conditions.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class a<E> {
    public String a;
    public a b;
    public a c;
    public a d;
    public org.apache.flink.cep.mlink.ikexpression.op.a e;
    public StreamData f;
    public b.a g;

    public E a(StreamData streamData, b.a aVar, org.apache.flink.cep.mlink.ikexpression.datameta.b bVar) throws org.apache.flink.cep.mlink.ikexpression.b {
        this.f = streamData;
        this.g = aVar;
        return null;
    }

    public a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.a = jSONObject.optString("type");
        }
    }
}
