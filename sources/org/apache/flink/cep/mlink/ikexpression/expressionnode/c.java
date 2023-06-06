package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import com.meituan.robust.Constants;
import java.util.List;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
import org.apache.flink.cep.pattern.conditions.b;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c extends a<org.apache.flink.cep.mlink.ikexpression.datameta.b> {
    public String h;

    public c(JSONObject jSONObject) {
        super(jSONObject);
        if (jSONObject == null || !jSONObject.has("dataType")) {
            return;
        }
        this.h = jSONObject.optString("dataType");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // org.apache.flink.cep.mlink.ikexpression.expressionnode.a
    /* renamed from: b */
    public org.apache.flink.cep.mlink.ikexpression.datameta.b a(StreamData streamData, b.a aVar, org.apache.flink.cep.mlink.ikexpression.datameta.b bVar) throws org.apache.flink.cep.mlink.ikexpression.b {
        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2;
        super.a(streamData, aVar, bVar);
        if (this.d != null && (bVar2 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.d.a(streamData, aVar, bVar)) != null && bVar2.a() != a.EnumC1538a.DATATYPE_NULL && bVar2.b() != null) {
            a.EnumC1538a a = bVar2.a();
            try {
                String str = this.h;
                char c = 65535;
                switch (str.hashCode()) {
                    case -1325958191:
                        if (str.equals(Constants.DOUBLE)) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1110481327:
                        if (str.equals("jsonArray")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -891985903:
                        if (str.equals("string")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3327612:
                        if (str.equals(Constants.LONG)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 64711720:
                        if (str.equals(Constants.BOOLEAN)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 320613959:
                        if (str.equals("jsonObject")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        Boolean b = g.b(bVar2);
                        if (b == null) {
                            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
                        }
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.valueOf(b.booleanValue()));
                    case 1:
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_DOUBLE, Double.valueOf(Double.parseDouble(bVar2.c())));
                    case 2:
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_LONG, Long.valueOf(Long.parseLong(bVar2.c())));
                    case 3:
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_STRING, bVar2.c());
                    case 4:
                        if (a == a.EnumC1538a.DATATYPE_STRING) {
                            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_OBJECT, new JSONArray(bVar2.c()));
                        }
                        if (bVar2.b != null) {
                            Object obj = bVar2.b;
                            if (obj instanceof List) {
                                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_OBJECT, g.a((List) obj));
                            }
                            if (obj instanceof JSONArray) {
                                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_OBJECT, obj);
                            }
                        }
                        break;
                    case 5:
                        if (a == a.EnumC1538a.DATATYPE_STRING) {
                            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_OBJECT, new JSONObject(bVar2.c()));
                        }
                        if (bVar2.b != null) {
                            Object obj2 = bVar2.b;
                            if (obj2 instanceof StreamData) {
                                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_OBJECT, ((StreamData) obj2).toJson());
                            }
                            if (obj2 instanceof JSONObject) {
                                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_OBJECT, obj2);
                            }
                        }
                        break;
                }
            } catch (Exception unused) {
            }
        }
        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
    }
}
