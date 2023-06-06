package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import android.text.TextUtils;
import java.util.List;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
import org.apache.flink.cep.pattern.conditions.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class p extends a<org.apache.flink.cep.mlink.ikexpression.datameta.b> {
    private String h;
    private String i;
    private String j;

    public p(JSONObject jSONObject) {
        super(jSONObject);
        this.h = jSONObject.optString("alias");
        this.i = jSONObject.optString("begin");
        this.j = jSONObject.optString("end");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // org.apache.flink.cep.mlink.ikexpression.expressionnode.a
    /* renamed from: b */
    public org.apache.flink.cep.mlink.ikexpression.datameta.b a(StreamData streamData, b.a aVar, org.apache.flink.cep.mlink.ikexpression.datameta.b bVar) throws org.apache.flink.cep.mlink.ikexpression.b {
        super.a(streamData, aVar, bVar);
        try {
            List a = this.g.a(this.h);
            if (a != null && a.size() > 0) {
                int a2 = a(this.i, a);
                int b = b(this.j, a);
                if (a2 < a.size() && b <= a.size()) {
                    if (a2 <= b) {
                        if (b != a.size()) {
                            b++;
                        }
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_LIST, a.subList(a2, b));
                    }
                    if (a2 != a.size()) {
                        a2++;
                    }
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_LIST, a.subList(b, a2));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
    }

    private static int a(String str, List list) {
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt > 0) {
                i = parseInt - 1;
            } else {
                i = parseInt < 0 ? list.size() + parseInt : parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        return i;
    }

    private static int b(String str, List list) {
        list.size();
        if (TextUtils.isEmpty(str)) {
            return list.size();
        }
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt > 0) {
                parseInt--;
            } else if (parseInt < 0) {
                parseInt += list.size();
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return list.size() - 1;
        }
    }
}
