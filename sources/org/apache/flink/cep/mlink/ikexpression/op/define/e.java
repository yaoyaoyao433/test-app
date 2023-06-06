package org.apache.flink.cep.mlink.ikexpression.op.define;

import org.apache.flink.cep.mlink.ikexpression.datameta.a;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class e implements org.apache.flink.cep.mlink.ikexpression.op.a {
    public static final org.apache.flink.cep.mlink.ikexpression.op.b a = org.apache.flink.cep.mlink.ikexpression.op.b.EQ;

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
        if (a.EnumC1538a.DATATYPE_LIST == bVar.a() || a.EnumC1538a.DATATYPE_LIST == bVar2.a()) {
            throw new IllegalArgumentException("操作符\"" + a.u + "\"参数类型错误");
        } else if (a.EnumC1538a.DATATYPE_NULL == bVar.a()) {
            return org.apache.flink.cep.mlink.ikexpression.datameta.b.e;
        } else {
            if (a.EnumC1538a.DATATYPE_NULL == bVar2.a()) {
                return org.apache.flink.cep.mlink.ikexpression.datameta.b.e;
            }
            if (a.EnumC1538a.DATATYPE_BOOLEAN == bVar.a() && a.EnumC1538a.DATATYPE_BOOLEAN == bVar2.a()) {
                Boolean d = bVar.d();
                Boolean d2 = bVar2.d();
                if (d != null) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.valueOf(d.equals(d2)));
                }
                if (d2 == null) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
                }
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
            } else if (a.EnumC1538a.DATATYPE_DATE == bVar.a() && a.EnumC1538a.DATATYPE_DATE == bVar2.a()) {
                String b = bVar.b();
                String b2 = bVar2.b();
                if (b != null) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.valueOf(b.equals(b2)));
                }
                if (b2 == null) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
                }
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
            } else if (a.EnumC1538a.DATATYPE_STRING == bVar.a() && a.EnumC1538a.DATATYPE_STRING == bVar2.a()) {
                String c = bVar.c();
                String c2 = bVar2.c();
                if (c != null) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.valueOf(c.equals(c2)));
                }
                if (c2 == null) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
                }
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
            } else if ((a.EnumC1538a.DATATYPE_DOUBLE == bVar.a() || a.EnumC1538a.DATATYPE_FLOAT == bVar.a() || a.EnumC1538a.DATATYPE_LONG == bVar.a() || a.EnumC1538a.DATATYPE_INT == bVar.a()) && (a.EnumC1538a.DATATYPE_DOUBLE == bVar2.a() || a.EnumC1538a.DATATYPE_FLOAT == bVar2.a() || a.EnumC1538a.DATATYPE_LONG == bVar2.a() || a.EnumC1538a.DATATYPE_INT == bVar2.a())) {
                Double h = bVar.h();
                Double h2 = bVar2.h();
                if (h != null && h2 != null) {
                    if (Double.compare(h.doubleValue(), h2.doubleValue()) == 0) {
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
                    }
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
                } else if (h == null && h2 == null) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
                } else {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
                }
            } else if (a.EnumC1538a.DATATYPE_STRING == bVar.a() && (a.EnumC1538a.DATATYPE_INT == bVar2.a() || a.EnumC1538a.DATATYPE_DOUBLE == bVar2.a() || a.EnumC1538a.DATATYPE_FLOAT == bVar2.a() || a.EnumC1538a.DATATYPE_LONG == bVar2.a())) {
                if (bVar.c() != null) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.valueOf(bVar.c().equals(bVar2.b())));
                }
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
            } else if (a.EnumC1538a.DATATYPE_STRING == bVar2.a() && (a.EnumC1538a.DATATYPE_INT == bVar.a() || a.EnumC1538a.DATATYPE_FLOAT == bVar.a() || a.EnumC1538a.DATATYPE_DOUBLE == bVar.a() || a.EnumC1538a.DATATYPE_LONG == bVar.a())) {
                if (bVar2.c() != null) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.valueOf(bVar2.c().equals(bVar.b())));
                }
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
            } else if (a.EnumC1538a.DATATYPE_OBJECT != bVar.a() || a.EnumC1538a.DATATYPE_OBJECT != bVar2.a()) {
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
            } else {
                Object obj = bVar.b;
                Object obj2 = bVar2.b;
                if (obj != null) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.valueOf(obj.equals(obj2)));
                }
                if (obj2 == null) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
                }
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
            }
        }
    }
}
