package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import android.text.TextUtils;
import java.util.List;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
import org.apache.flink.cep.pattern.conditions.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class r extends a<org.apache.flink.cep.mlink.ikexpression.datameta.b> {
    private String h;
    private String i;

    public r(JSONObject jSONObject) {
        super(jSONObject);
        this.h = jSONObject.optString("alias");
        this.i = jSONObject.optString("index");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // org.apache.flink.cep.mlink.ikexpression.expressionnode.a
    /* renamed from: b */
    public org.apache.flink.cep.mlink.ikexpression.datameta.b a(StreamData streamData, b.a aVar, org.apache.flink.cep.mlink.ikexpression.datameta.b bVar) throws org.apache.flink.cep.mlink.ikexpression.b {
        char c;
        super.a(streamData, aVar, bVar);
        String str = this.a;
        int hashCode = str.hashCode();
        if (hashCode != -2062578806) {
            if (hashCode == -1030184871 && str.equals("SingleEventReference")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("CurrentEventReference")) {
                c = 0;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_OBJECT, this.f);
            case 1:
                try {
                    List a = this.g.a(this.h);
                    if (a != null && a.size() > 0) {
                        int size = a.size() - 1;
                        if (!TextUtils.isEmpty(this.i)) {
                            try {
                                size = Integer.parseInt(this.i);
                                if (size < 0) {
                                    size = a.size() + size;
                                } else if (size > 0) {
                                    size--;
                                }
                            } catch (NumberFormatException unused) {
                                size = a.size() - 1;
                            }
                            if (size >= a.size()) {
                                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
                            }
                        }
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_OBJECT, a.get(size));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
            default:
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
        }
    }
}
