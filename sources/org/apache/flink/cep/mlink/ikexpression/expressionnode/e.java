package org.apache.flink.cep.mlink.ikexpression.expressionnode;

import com.meituan.robust.common.CommonConstant;
import java.math.BigDecimal;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
import org.apache.flink.cep.pattern.conditions.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class e extends a<org.apache.flink.cep.mlink.ikexpression.datameta.b> {
    public String h;

    public e(JSONObject jSONObject) {
        super(jSONObject);
        this.h = jSONObject.optString("value");
    }

    private static org.apache.flink.cep.mlink.ikexpression.datameta.b a(String str) {
        try {
            BigDecimal bigDecimal = new BigDecimal(str);
            if (str.contains(CommonConstant.Symbol.DOT)) {
                if (bigDecimal.compareTo(new BigDecimal(1.401298464324817E-45d)) >= 0 && bigDecimal.compareTo(new BigDecimal(3.4028234663852886E38d)) <= 0) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_FLOAT, Float.valueOf(bigDecimal.floatValue()));
                }
                if (bigDecimal.compareTo(new BigDecimal(Double.MIN_VALUE)) >= 0 && bigDecimal.compareTo(new BigDecimal(Double.MAX_VALUE)) <= 0) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_DOUBLE, Double.valueOf(bigDecimal.doubleValue()));
                }
            } else if (bigDecimal.compareTo(new BigDecimal(Integer.MIN_VALUE)) >= 0 && bigDecimal.compareTo(new BigDecimal(Integer.MAX_VALUE)) <= 0) {
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_INT, Integer.valueOf(bigDecimal.intValue()));
            } else {
                if (bigDecimal.compareTo(new BigDecimal(Long.MIN_VALUE)) >= 0 && bigDecimal.compareTo(new BigDecimal(Long.MAX_VALUE)) <= 0) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_LONG, Long.valueOf(bigDecimal.longValue()));
                }
            }
        } catch (NumberFormatException unused) {
        }
        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
    }

    @Override // org.apache.flink.cep.mlink.ikexpression.expressionnode.a
    public final /* synthetic */ org.apache.flink.cep.mlink.ikexpression.datameta.b a(StreamData streamData, b.a aVar, org.apache.flink.cep.mlink.ikexpression.datameta.b bVar) throws org.apache.flink.cep.mlink.ikexpression.b {
        char c;
        String str = this.a;
        int hashCode = str.hashCode();
        if (hashCode == -780505664) {
            if (str.equals("LateralNumber")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == -655611759) {
            if (str.equals("LateralBoolean")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -638127480) {
            if (hashCode == 682985918 && str.equals("LateralNull")) {
                c = 3;
            }
            c = 65535;
        } else {
            if (str.equals("LateralString")) {
                c = 2;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.valueOf(this.h));
            case 1:
                return a(this.h);
            case 2:
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_STRING, this.h);
            case 3:
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
            default:
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
        }
    }
}
