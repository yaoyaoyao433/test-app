package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
import org.apache.flink.cep.pattern.conditions.b;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class i extends a<org.apache.flink.cep.mlink.ikexpression.datameta.b> {
    public List<a> h;
    public String i;

    public i(JSONObject jSONObject) {
        super(jSONObject);
        this.h = new ArrayList();
        this.i = jSONObject.optString("functionName");
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.h.add(f.a(optJSONArray.optJSONObject(i)));
            }
        }
    }

    @Override // org.apache.flink.cep.mlink.ikexpression.expressionnode.a
    public final /* synthetic */ org.apache.flink.cep.mlink.ikexpression.datameta.b a(StreamData streamData, b.a aVar, org.apache.flink.cep.mlink.ikexpression.datameta.b bVar) throws org.apache.flink.cep.mlink.ikexpression.b {
        if (!TextUtils.isEmpty(this.i) && j.a(this.i) && this.h != null) {
            String str = this.i;
            char c = 65535;
            switch (str.hashCode()) {
                case -946884697:
                    if (str.equals("coalesce")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -229832662:
                    if (str.equals("json_extract")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3357:
                    if (str.equals("if")) {
                        c = 7;
                        break;
                    }
                    break;
                case 96978:
                    if (str.equals("avg")) {
                        c = 0;
                        break;
                    }
                    break;
                case 107876:
                    if (str.equals("max")) {
                        c = 2;
                        break;
                    }
                    break;
                case 108114:
                    if (str.equals("min")) {
                        c = 3;
                        break;
                    }
                    break;
                case 114251:
                    if (str.equals("sum")) {
                        c = 1;
                        break;
                    }
                    break;
                case 30462676:
                    if (str.equals("string_length")) {
                        c = 5;
                        break;
                    }
                    break;
                case 94851343:
                    if (str.equals("count")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (this.h.size() > 0) {
                        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.h.get(0).a(streamData, aVar, bVar);
                        if (this.h.size() > 1) {
                            a aVar2 = this.h.get(1);
                            if ("LambdaFunction".equals(aVar2.a)) {
                                return j.b(g.a(bVar2, aVar2, streamData, aVar, false).b);
                            }
                        }
                        return j.b(bVar2.b);
                    }
                    return org.apache.flink.cep.mlink.ikexpression.datameta.b.d;
                case 1:
                    if (this.h.size() > 0) {
                        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar3 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.h.get(0).a(streamData, aVar, bVar);
                        if (this.h.size() > 1) {
                            a aVar3 = this.h.get(1);
                            if ("LambdaFunction".equals(aVar3.a)) {
                                return j.a(g.a(bVar3, aVar3, streamData, aVar, false).b);
                            }
                        }
                        return j.a(bVar3.b);
                    }
                    return org.apache.flink.cep.mlink.ikexpression.datameta.b.d;
                case 2:
                    if (this.h.size() > 0) {
                        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar4 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.h.get(0).a(streamData, aVar, bVar);
                        if (this.h.size() > 1) {
                            a aVar4 = this.h.get(1);
                            if ("LambdaFunction".equals(aVar4.a)) {
                                return j.c(g.a(bVar4, aVar4, streamData, aVar, false).b);
                            }
                        }
                        return j.c(bVar4.b);
                    }
                    return org.apache.flink.cep.mlink.ikexpression.datameta.b.d;
                case 3:
                    if (this.h.size() > 0) {
                        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar5 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.h.get(0).a(streamData, aVar, bVar);
                        if (this.h.size() > 1) {
                            a aVar5 = this.h.get(1);
                            if ("LambdaFunction".equals(aVar5.a)) {
                                return j.d(g.a(bVar5, aVar5, streamData, aVar, false).b);
                            }
                        }
                        return j.d(bVar5.b);
                    }
                    return org.apache.flink.cep.mlink.ikexpression.datameta.b.d;
                case 4:
                    if (this.h.size() > 0) {
                        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar6 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.h.get(0).a(streamData, aVar, bVar);
                        if (this.h.size() > 1) {
                            a aVar6 = this.h.get(1);
                            if ("LambdaFunction".equals(aVar6.a)) {
                                return j.e(g.a(bVar6, aVar6, streamData, aVar, false).b);
                            }
                        }
                        return j.e(bVar6.b);
                    }
                    return org.apache.flink.cep.mlink.ikexpression.datameta.b.d;
                case 5:
                    if (this.h.size() > 0) {
                        return j.a((org.apache.flink.cep.mlink.ikexpression.datameta.b) this.h.get(0).a(streamData, aVar, bVar));
                    }
                    return org.apache.flink.cep.mlink.ikexpression.datameta.b.d;
                case 6:
                    if (this.h.size() == 2) {
                        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar7 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.h.get(0).a(streamData, aVar, bVar);
                        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar8 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.h.get(1).a(streamData, aVar, bVar);
                        if (bVar8.a() == a.EnumC1538a.DATATYPE_STRING) {
                            return j.a(bVar7.b, bVar8.b());
                        }
                    }
                    return org.apache.flink.cep.mlink.ikexpression.datameta.b.d;
                case 7:
                    if (this.h.size() == 3) {
                        return j.a((org.apache.flink.cep.mlink.ikexpression.datameta.b) this.h.get(0).a(streamData, aVar, bVar), (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.h.get(1).a(streamData, aVar, bVar), (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.h.get(2).a(streamData, aVar, bVar));
                    }
                    return org.apache.flink.cep.mlink.ikexpression.datameta.b.e;
                case '\b':
                    if (this.h.size() > 0) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<a> it = this.h.iterator();
                        while (it.hasNext()) {
                            a next = it.next();
                            arrayList.add(next == null ? new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null) : next.a(streamData, aVar, bVar));
                        }
                        return j.a((List<Object>) arrayList);
                    }
                    return org.apache.flink.cep.mlink.ikexpression.datameta.b.e;
            }
        }
        return org.apache.flink.cep.mlink.ikexpression.datameta.b.e;
    }
}
