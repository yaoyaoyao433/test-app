package org.apache.flink.cep.mlink.ikexpression.datameta;

import org.apache.flink.cep.mlink.ikexpression.a;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c {
    a.EnumC1538a a;
    private org.apache.flink.cep.mlink.ikexpression.a b;
    private b[] c;

    public final b a() throws org.apache.flink.cep.mlink.ikexpression.b {
        if (a.EnumC1537a.c == this.b.a) {
            org.apache.flink.cep.mlink.ikexpression.op.b bVar = this.b.b;
            b[] bVarArr = this.c;
            org.apache.flink.cep.mlink.ikexpression.op.a aVar = org.apache.flink.cep.mlink.ikexpression.op.b.t.get(bVar);
            if (aVar == null) {
                throw new IllegalStateException("系统内部错误：找不到操作符对应的执行定义");
            }
            return aVar.a(bVarArr);
        } else if (a.EnumC1537a.d == this.b.a) {
            return org.apache.flink.cep.mlink.ikexpression.function.b.a(this.b.c, this.b.d, this.c);
        } else {
            throw new org.apache.flink.cep.mlink.ikexpression.b("不支持的Reference执行异常");
        }
    }
}
