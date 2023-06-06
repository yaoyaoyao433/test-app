package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
import org.apache.flink.cep.pattern.conditions.b;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class h extends a<org.apache.flink.cep.mlink.ikexpression.datameta.b> {
    private String h;
    private String i;

    public h(JSONObject jSONObject) {
        super(jSONObject);
        this.h = jSONObject.optString("fieldName");
        this.i = jSONObject.optString("index");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // org.apache.flink.cep.mlink.ikexpression.expressionnode.a
    /* renamed from: b */
    public org.apache.flink.cep.mlink.ikexpression.datameta.b a(StreamData streamData, b.a aVar, org.apache.flink.cep.mlink.ikexpression.datameta.b bVar) throws org.apache.flink.cep.mlink.ikexpression.b {
        if (this.d != null) {
            org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.d.a(streamData, aVar, bVar);
            if ("ExtractField".equals(this.a)) {
                if (bVar2 != null) {
                    if (bVar2.b == null) {
                        return bVar2;
                    }
                    if (bVar2.a() != a.EnumC1538a.DATATYPE_LIST) {
                        return g.a(g.a(bVar2.b, this.h));
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : (List) bVar2.b) {
                        arrayList.add(g.a(obj, this.h));
                    }
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_LIST, arrayList);
                }
            } else if ("ExtractItem".equals(this.a) && bVar2 != null) {
                if (bVar2.a() == a.EnumC1538a.DATATYPE_NULL || bVar2.b == null) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
                }
                if (bVar2.a() == a.EnumC1538a.DATATYPE_LIST) {
                    List list = (List) bVar2.b;
                    if (list == null && list.isEmpty()) {
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
                    }
                    int size = list.size() - 1;
                    if (!TextUtils.isEmpty(this.i)) {
                        try {
                            size = Integer.parseInt(this.i);
                            if (size < 0) {
                                size = list.size() + size;
                            } else if (size > 0) {
                                size--;
                            }
                            if (size >= list.size()) {
                                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
                            }
                        } catch (NumberFormatException unused) {
                            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
                        }
                    }
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_OBJECT, list.get(size));
                } else if (bVar2.b instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) bVar2.b;
                    if (jSONArray.length() > 0) {
                        int length = jSONArray.length() - 1;
                        if (!TextUtils.isEmpty(this.i)) {
                            try {
                                length = Integer.parseInt(this.i);
                                if (length < 0) {
                                    length = jSONArray.length() + length;
                                } else if (length > 0) {
                                    length--;
                                }
                                if (length > jSONArray.length()) {
                                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
                                }
                            } catch (NumberFormatException unused2) {
                                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
                            }
                        }
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_OBJECT, jSONArray.optJSONObject(length));
                    }
                }
            }
        }
        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
    }
}
