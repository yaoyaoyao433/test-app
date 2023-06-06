package org.apache.flink.cep.mlink.ikexpression.datameta;

import java.util.ArrayList;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b extends a {
    public static final b d = new b(a.EnumC1538a.DATATYPE_INT, 0);
    public static final b e = new b(a.EnumC1538a.DATATYPE_NULL, null);

    public b(a.EnumC1538a enumC1538a, Object obj) {
        super(enumC1538a, obj);
        if (enumC1538a == null) {
            throw new IllegalArgumentException("非法参数：数据类型为空");
        }
        if (a.EnumC1538a.DATATYPE_LIST == enumC1538a && this.b == null) {
            this.b = new ArrayList(0);
        }
    }
}
