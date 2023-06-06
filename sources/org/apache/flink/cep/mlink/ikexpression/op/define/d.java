package org.apache.flink.cep.mlink.ikexpression.op.define;

import org.apache.flink.cep.mlink.ikexpression.datameta.a;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class d implements org.apache.flink.cep.mlink.ikexpression.op.a {
    public static final org.apache.flink.cep.mlink.ikexpression.op.b a = org.apache.flink.cep.mlink.ikexpression.op.b.DIV;

    @Override // org.apache.flink.cep.mlink.ikexpression.op.a
    public final org.apache.flink.cep.mlink.ikexpression.datameta.b a(org.apache.flink.cep.mlink.ikexpression.datameta.b[] bVarArr) throws org.apache.flink.cep.mlink.ikexpression.b {
        if (bVarArr == null || bVarArr.length != 2) {
            throw new IllegalArgumentException("操作符\"" + a.u + "参数个数不匹配");
        }
        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar = bVarArr[0];
        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2 = bVarArr[1];
        if (bVar == null || bVar.b == null || bVar2 == null || bVar2.b == null) {
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
        }
        if (bVar.c) {
            bVar = ((org.apache.flink.cep.mlink.ikexpression.datameta.c) bVar.b).a();
        }
        if (bVar2.c) {
            bVar2 = ((org.apache.flink.cep.mlink.ikexpression.datameta.c) bVar2.b).a();
        }
        if (a.EnumC1538a.DATATYPE_NULL == bVar.a() || a.EnumC1538a.DATATYPE_NULL == bVar2.a() || a.EnumC1538a.DATATYPE_BOOLEAN == bVar.a() || a.EnumC1538a.DATATYPE_BOOLEAN == bVar2.a() || a.EnumC1538a.DATATYPE_DATE == bVar.a() || a.EnumC1538a.DATATYPE_DATE == bVar2.a() || a.EnumC1538a.DATATYPE_STRING == bVar.a() || a.EnumC1538a.DATATYPE_STRING == bVar2.a() || a.EnumC1538a.DATATYPE_LIST == bVar.a() || a.EnumC1538a.DATATYPE_LIST == bVar2.a()) {
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
        }
        if (Double.compare(bVar2.h().doubleValue(), 0.0d) == 0) {
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
        }
        if (a.EnumC1538a.DATATYPE_DOUBLE == bVar.a() || a.EnumC1538a.DATATYPE_DOUBLE == bVar2.a()) {
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_DOUBLE, Double.valueOf(bVar.h().doubleValue() / bVar2.h().doubleValue()));
        } else if (a.EnumC1538a.DATATYPE_FLOAT == bVar.a() || a.EnumC1538a.DATATYPE_FLOAT == bVar2.a()) {
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_FLOAT, Float.valueOf(bVar.g().floatValue() / bVar2.g().floatValue()));
        } else if (a.EnumC1538a.DATATYPE_LONG == bVar.a() || a.EnumC1538a.DATATYPE_LONG == bVar2.a()) {
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_LONG, Long.valueOf(bVar.f().longValue() / bVar2.f().longValue()));
        } else {
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_INT, Integer.valueOf(bVar.e().intValue() / bVar2.e().intValue()));
        }
    }
}
