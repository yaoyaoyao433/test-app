package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import java.util.ArrayList;
import java.util.List;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
import org.apache.flink.cep.pattern.conditions.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class t extends a<org.apache.flink.cep.mlink.ikexpression.datameta.b> {
    public List<a> h;
    private String i;

    public t(JSONObject jSONObject) {
        super(jSONObject);
        this.h = new ArrayList();
        this.i = jSONObject.optString("alias");
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.h.add(f.a(optJSONArray.optJSONObject(i)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // org.apache.flink.cep.mlink.ikexpression.expressionnode.a
    /* renamed from: b */
    public org.apache.flink.cep.mlink.ikexpression.datameta.b a(StreamData streamData, b.a aVar, org.apache.flink.cep.mlink.ikexpression.datameta.b bVar) throws org.apache.flink.cep.mlink.ikexpression.b {
        Object obj;
        super.a(streamData, aVar, bVar);
        JSONObject jSONObject = new JSONObject();
        if (this.h.size() > 0) {
            org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.h.get(0).a(streamData, aVar, bVar);
            if (this.h.size() > 1) {
                a aVar2 = this.h.get(1);
                if ("LambdaFunction".equals(aVar2.a)) {
                    ArrayList arrayList = new ArrayList();
                    if (bVar2 == null || bVar2.b == null) {
                        arrayList.add(null);
                        bVar2 = new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_LIST, arrayList);
                    } else if (bVar2.a() != a.EnumC1538a.DATATYPE_LIST && !(bVar2.b instanceof JSONArray)) {
                        arrayList.add(bVar2.b);
                        bVar2 = new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_LIST, arrayList);
                    }
                    Object obj2 = g.a(bVar2, aVar2, streamData, aVar, true).b;
                    if (obj2 instanceof List) {
                        JSONArray jSONArray = new JSONArray();
                        for (Object obj3 : (List) obj2) {
                            if (obj3 instanceof org.apache.flink.cep.mlink.ikexpression.datameta.b) {
                                org.apache.flink.cep.mlink.ikexpression.datameta.b bVar3 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) obj3;
                                if (bVar3 == null || bVar3.b == null) {
                                    jSONArray.put((Object) null);
                                } else {
                                    jSONArray.put(g.b(bVar3.b));
                                }
                            } else {
                                jSONArray.put(g.b(obj3));
                            }
                        }
                        try {
                            jSONObject.put(this.i, jSONArray);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    try {
                        String str = this.i;
                        if (bVar2 == null) {
                            obj = JSONObject.NULL;
                        } else {
                            obj = bVar2.b;
                        }
                        jSONObject.put(str, obj);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            } else {
                if (bVar2 != null) {
                    try {
                        if (bVar2.b != null) {
                            jSONObject.put(this.i, g.b(bVar2.b));
                        }
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                }
                jSONObject.put(this.i, JSONObject.NULL);
            }
        }
        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_OBJECT, jSONObject);
    }
}
