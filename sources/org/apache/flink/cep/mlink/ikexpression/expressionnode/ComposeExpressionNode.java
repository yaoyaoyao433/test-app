package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
import org.apache.flink.cep.pattern.conditions.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class ComposeExpressionNode extends a<org.apache.flink.cep.mlink.ikexpression.datameta.b> {
    public String h;
    public List<a> i;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface ComposeDataType {
    }

    public ComposeExpressionNode(JSONObject jSONObject) {
        super(jSONObject);
        this.i = new ArrayList();
        this.h = jSONObject.optString("dataType");
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.i.add(f.a(optJSONArray.optJSONObject(i)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // org.apache.flink.cep.mlink.ikexpression.expressionnode.a
    /* renamed from: b */
    public org.apache.flink.cep.mlink.ikexpression.datameta.b a(StreamData streamData, b.a aVar, org.apache.flink.cep.mlink.ikexpression.datameta.b bVar) throws org.apache.flink.cep.mlink.ikexpression.b {
        Object obj;
        super.a(streamData, aVar, bVar);
        if ("jsonObject".equals(this.h)) {
            JSONObject jSONObject = new JSONObject();
            for (a aVar2 : this.i) {
                org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) aVar2.a(streamData, aVar, bVar);
                if (bVar2 != null && (obj = bVar2.b) != null) {
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            try {
                                jSONObject.put(next, jSONObject2.opt(next));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    } else if (obj instanceof Map) {
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            try {
                                Object value = entry.getValue();
                                String str = (String) entry.getKey();
                                if (value == null) {
                                    value = JSONObject.NULL;
                                }
                                jSONObject.put(str, value);
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                }
            }
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_OBJECT, jSONObject);
        } else if ("jsonArray".equals(this.h)) {
            JSONArray jSONArray = new JSONArray();
            for (a aVar3 : this.i) {
                org.apache.flink.cep.mlink.ikexpression.datameta.b bVar3 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) aVar3.a(streamData, aVar, bVar);
                if (bVar3 == null || bVar3.b == null) {
                    jSONArray.put((Object) null);
                } else {
                    jSONArray.put(g.b(bVar3.b));
                }
            }
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_OBJECT, jSONArray);
        } else {
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
        }
    }
}
