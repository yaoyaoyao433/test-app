package org.apache.flink.cep.mlink.ikexpression.op.define;

import org.apache.flink.cep.mlink.ikexpression.datameta.a;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class g implements org.apache.flink.cep.mlink.ikexpression.op.a {
    public static final org.apache.flink.cep.mlink.ikexpression.op.b a = org.apache.flink.cep.mlink.ikexpression.op.b.GT;

    @Override // org.apache.flink.cep.mlink.ikexpression.op.a
    public final org.apache.flink.cep.mlink.ikexpression.datameta.b a(org.apache.flink.cep.mlink.ikexpression.datameta.b[] bVarArr) throws org.apache.flink.cep.mlink.ikexpression.b {
        if (bVarArr == null || bVarArr.length != 2) {
            throw new IllegalArgumentException("操作符\"" + a.u + "参数个数不匹配");
        }
        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar = bVarArr[0];
        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2 = bVarArr[1];
        if (bVar == null || bVar.b == null || bVar2 == null || bVar2.b == null) {
            return org.apache.flink.cep.mlink.ikexpression.datameta.b.e;
        }
        if (bVar.c) {
            bVar = ((org.apache.flink.cep.mlink.ikexpression.datameta.c) bVar.b).a();
        }
        if (bVar2.c) {
            bVar2 = ((org.apache.flink.cep.mlink.ikexpression.datameta.c) bVar2.b).a();
        }
        if (a.EnumC1538a.DATATYPE_DATE == bVar.a() && a.EnumC1538a.DATATYPE_DATE == bVar2.a()) {
            if (bVar.i().compareTo(bVar2.i()) > 0) {
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
            }
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
        } else if (a.EnumC1538a.DATATYPE_STRING == bVar.a() && a.EnumC1538a.DATATYPE_STRING == bVar2.a()) {
            if (bVar.c().compareTo(bVar2.c()) > 0) {
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
            }
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
        } else if ((a.EnumC1538a.DATATYPE_DOUBLE == bVar.a() || a.EnumC1538a.DATATYPE_FLOAT == bVar.a() || a.EnumC1538a.DATATYPE_LONG == bVar.a() || a.EnumC1538a.DATATYPE_INT == bVar.a()) && (a.EnumC1538a.DATATYPE_DOUBLE == bVar2.a() || a.EnumC1538a.DATATYPE_FLOAT == bVar2.a() || a.EnumC1538a.DATATYPE_LONG == bVar2.a() || a.EnumC1538a.DATATYPE_INT == bVar2.a())) {
            if (Double.compare(bVar.h().doubleValue(), bVar2.h().doubleValue()) > 0) {
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
            }
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
        } else {
            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
        }
    }
}
