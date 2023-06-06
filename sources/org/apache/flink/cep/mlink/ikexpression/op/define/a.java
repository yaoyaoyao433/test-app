package org.apache.flink.cep.mlink.ikexpression.op.define;

import org.apache.flink.cep.mlink.ikexpression.datameta.a;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a implements org.apache.flink.cep.mlink.ikexpression.op.a {
    public static final org.apache.flink.cep.mlink.ikexpression.op.b a = org.apache.flink.cep.mlink.ikexpression.op.b.AND;

    @Override // org.apache.flink.cep.mlink.ikexpression.op.a
    public final org.apache.flink.cep.mlink.ikexpression.datameta.b a(org.apache.flink.cep.mlink.ikexpression.datameta.b[] bVarArr) throws org.apache.flink.cep.mlink.ikexpression.b {
        if (bVarArr == null || bVarArr.length != 2) {
            throw new IllegalArgumentException("操作符\"" + a.u + "操作缺少参数");
        }
        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar = bVarArr[0];
        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2 = bVarArr[1];
        if (bVar == null || bVar.b == null) {
            if (bVar2 == null || bVar2.b == null) {
                return org.apache.flink.cep.mlink.ikexpression.datameta.b.e;
            }
            org.apache.flink.cep.mlink.ikexpression.datameta.b bVar3 = new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.valueOf(org.apache.flink.cep.mlink.ikexpression.expressionnode.g.a(bVar2)));
            return bVar3.d().booleanValue() ? org.apache.flink.cep.mlink.ikexpression.datameta.b.e : bVar3;
        }
        if (bVar.c) {
            bVar = ((org.apache.flink.cep.mlink.ikexpression.datameta.c) bVar.b).a();
        }
        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar4 = new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.valueOf(org.apache.flink.cep.mlink.ikexpression.expressionnode.g.a(bVar)));
        if (bVar2 == null || bVar2.b == null) {
            return bVar4.d().booleanValue() ? org.apache.flink.cep.mlink.ikexpression.datameta.b.e : bVar4;
        }
        org.apache.flink.cep.mlink.ikexpression.datameta.b bVar5 = new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.valueOf(org.apache.flink.cep.mlink.ikexpression.expressionnode.g.a(bVar2)));
        if (a.EnumC1538a.DATATYPE_BOOLEAN == bVar4.a()) {
            if (bVar4.d().booleanValue()) {
                if (bVar5.c) {
                    bVar5 = ((org.apache.flink.cep.mlink.ikexpression.datameta.c) bVar5.b).a();
                }
                return a.EnumC1538a.DATATYPE_BOOLEAN == bVar5.a() ? bVar5 : new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
            }
            return bVar4;
        }
        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
    }
}
