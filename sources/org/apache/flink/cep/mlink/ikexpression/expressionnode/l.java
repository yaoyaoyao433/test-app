package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import com.meituan.android.common.statistics.Constants;
import java.util.ArrayList;
import java.util.List;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
import org.apache.flink.cep.pattern.conditions.b;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class l extends a<org.apache.flink.cep.mlink.ikexpression.datameta.b> {
    public List<a<org.apache.flink.cep.mlink.ikexpression.datameta.b>> h;

    public l(JSONObject jSONObject) {
        super(jSONObject);
        this.h = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST);
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.h.add(f.a(optJSONArray.optJSONObject(i)));
            }
        }
    }

    @Override // org.apache.flink.cep.mlink.ikexpression.expressionnode.a
    public final /* synthetic */ org.apache.flink.cep.mlink.ikexpression.datameta.b a(StreamData streamData, b.a aVar, org.apache.flink.cep.mlink.ikexpression.datameta.b bVar) throws org.apache.flink.cep.mlink.ikexpression.b {
        if (this.d != null) {
            org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2 = (org.apache.flink.cep.mlink.ikexpression.datameta.b) this.d.a(streamData, aVar, bVar);
            if (bVar2 == null || bVar2.b == null) {
                return org.apache.flink.cep.mlink.ikexpression.datameta.b.e;
            }
            if (this.h != null) {
                ArrayList arrayList = new ArrayList();
                for (a<org.apache.flink.cep.mlink.ikexpression.datameta.b> aVar2 : this.h) {
                    arrayList.add(aVar2.a(streamData, aVar, bVar));
                }
                if (arrayList.contains(this.d.a(streamData, aVar, bVar))) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
                }
            }
        }
        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
    }
}
