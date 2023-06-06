package org.apache.flink.cep.mlink.ikexpression.function;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b {
    public static org.apache.flink.cep.mlink.ikexpression.datameta.b a(String str, int i, org.apache.flink.cep.mlink.ikexpression.datameta.b[] bVarArr) throws org.apache.flink.cep.mlink.ikexpression.b {
        if (str != null) {
            if (bVarArr == null) {
                throw new IllegalArgumentException("函数参数列表为空");
            }
            for (int i2 = 0; i2 < bVarArr.length; i2++) {
                if (bVarArr[i2].c) {
                    bVarArr[i2] = ((org.apache.flink.cep.mlink.ikexpression.datameta.c) bVarArr[i2].b).a();
                }
            }
            try {
                try {
                    Object a = c.a(str, b(str, i, bVarArr));
                    if (a instanceof Boolean) {
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, a);
                    }
                    if (a instanceof Date) {
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_DATE, a);
                    }
                    if (a instanceof Double) {
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_DOUBLE, a);
                    }
                    if (a instanceof Float) {
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_FLOAT, a);
                    }
                    if (a instanceof Integer) {
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_INT, a);
                    }
                    if (a instanceof Long) {
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_LONG, a);
                    }
                    if (a instanceof String) {
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_STRING, a);
                    }
                    if (a instanceof List) {
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_LIST, a);
                    }
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_OBJECT, a);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                    throw new IllegalStateException("函数\"" + str + "\"参数类型不匹配");
                } catch (NoSuchMethodException e2) {
                    e2.printStackTrace();
                    throw new IllegalStateException("函数\"" + str + "\"不存在或参数类型不匹配");
                } catch (Exception e3) {
                    e3.printStackTrace();
                    throw new IllegalStateException("函数\"" + str + "\"访问异常:" + e3.getMessage());
                }
            } catch (org.apache.flink.cep.mlink.ikexpression.b unused) {
                throw new IllegalArgumentException("函数\"" + str + "\"运行时参数类型错误");
            }
        }
        throw new IllegalArgumentException("函数名为空");
    }

    private static Object[] b(String str, int i, org.apache.flink.cep.mlink.ikexpression.datameta.b[] bVarArr) throws org.apache.flink.cep.mlink.ikexpression.b {
        if (bVarArr == null) {
            return new Object[0];
        }
        Object[] objArr = new Object[bVarArr.length];
        for (int length = bVarArr.length - 1; length >= 0; length--) {
            try {
                objArr[(bVarArr.length - 1) - length] = bVarArr[length].k();
            } catch (ParseException unused) {
                throw new org.apache.flink.cep.mlink.ikexpression.b("函数\"" + str + "\"参数转化Java对象错误");
            }
        }
        return objArr;
    }
}
