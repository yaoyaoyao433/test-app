package org.apache.flink.cep.mlink.ikexpression.op;

import com.meituan.robust.common.CommonConstant;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.apache.flink.cep.mlink.ikexpression.datameta.a;
import org.apache.flink.cep.mlink.ikexpression.op.define.d;
import org.apache.flink.cep.mlink.ikexpression.op.define.e;
import org.apache.flink.cep.mlink.ikexpression.op.define.f;
import org.apache.flink.cep.mlink.ikexpression.op.define.g;
import org.apache.flink.cep.mlink.ikexpression.op.define.h;
import org.apache.flink.cep.mlink.ikexpression.op.define.i;
import org.apache.flink.cep.mlink.ikexpression.op.define.j;
import org.apache.flink.cep.mlink.ikexpression.op.define.k;
import org.apache.flink.cep.mlink.ikexpression.op.define.l;
import org.apache.flink.cep.mlink.ikexpression.op.define.o;
import org.apache.flink.cep.mlink.ikexpression.op.define.p;
import org.apache.flink.cep.mlink.ikexpression.op.define.q;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public enum b {
    NOT("!", 80, 1),
    NG(CommonConstant.Symbol.MINUS, 80, 1),
    MUTI("*", 70, 2),
    DIV("/", 70, 2),
    MOD("%", 70, 2),
    PLUS("+", 60, 2),
    MINUS(CommonConstant.Symbol.MINUS, 60, 2),
    LT("<", 50, 2),
    LE("<=", 50, 2),
    GT(">", 50, 2),
    GE(">=", 50, 2),
    EQ("==", 40, 2),
    NEQ("!=", 40, 2),
    AND(CommonConstant.Symbol.LOGIC_AND, 30, 2),
    OR(CommonConstant.Symbol.LOGIC_OR, 20, 2),
    APPEND("#", 10, 2),
    QUES(CommonConstant.Symbol.QUESTION_MARK, 0, 0),
    COLON(CommonConstant.Symbol.COLON, 0, 0),
    SELECT("?:", 0, 3);
    
    public static final HashMap<b, a> t;
    private static final Set<String> v;
    public String u;
    private int w;
    private int x;

    static {
        HashSet hashSet = new HashSet();
        v = hashSet;
        hashSet.add(NOT.u);
        v.add(NG.u);
        v.add(MUTI.u);
        v.add(DIV.u);
        v.add(MOD.u);
        v.add(PLUS.u);
        v.add(MINUS.u);
        v.add(LT.u);
        v.add(LE.u);
        v.add(GT.u);
        v.add(GE.u);
        v.add(EQ.u);
        v.add(NEQ.u);
        v.add(AND.u);
        v.add(OR.u);
        v.add(APPEND.u);
        v.add(SELECT.u);
        v.add(QUES.u);
        v.add(COLON.u);
        HashMap<b, a> hashMap = new HashMap<>();
        t = hashMap;
        hashMap.put(NOT, new o());
        t.put(NG, new a() { // from class: org.apache.flink.cep.mlink.ikexpression.op.define.n
            public static final org.apache.flink.cep.mlink.ikexpression.op.b a = org.apache.flink.cep.mlink.ikexpression.op.b.NG;

            @Override // org.apache.flink.cep.mlink.ikexpression.op.a
            public final org.apache.flink.cep.mlink.ikexpression.datameta.b a(org.apache.flink.cep.mlink.ikexpression.datameta.b[] bVarArr) throws org.apache.flink.cep.mlink.ikexpression.b {
                if (bVarArr == null || bVarArr.length != 1) {
                    throw new IllegalArgumentException("操作符\"" + a.u + "参数个数不匹配");
                }
                org.apache.flink.cep.mlink.ikexpression.datameta.b bVar = bVarArr[0];
                if (bVar == null || bVar.b == null) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
                }
                if (bVar.c) {
                    bVar = ((org.apache.flink.cep.mlink.ikexpression.datameta.c) bVar.b).a();
                }
                if (a.EnumC1538a.DATATYPE_DOUBLE == bVar.a()) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_DOUBLE, Double.valueOf(0.0d - bVar.h().doubleValue()));
                } else if (a.EnumC1538a.DATATYPE_FLOAT == bVar.a()) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_FLOAT, Float.valueOf(0.0f - bVar.g().floatValue()));
                } else if (a.EnumC1538a.DATATYPE_LONG == bVar.a()) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_LONG, Long.valueOf(0 - bVar.f().longValue()));
                } else if (a.EnumC1538a.DATATYPE_INT == bVar.a()) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_INT, Integer.valueOf(0 - bVar.e().intValue()));
                } else {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
                }
            }
        });
        t.put(MUTI, new l());
        t.put(DIV, new d());
        t.put(MOD, new k());
        t.put(PLUS, new q());
        t.put(MINUS, new j());
        t.put(LT, new i());
        t.put(LE, new h());
        t.put(GT, new g());
        t.put(GE, new f());
        t.put(EQ, new e());
        t.put(NEQ, new a() { // from class: org.apache.flink.cep.mlink.ikexpression.op.define.m
            public static final org.apache.flink.cep.mlink.ikexpression.op.b a = org.apache.flink.cep.mlink.ikexpression.op.b.NEQ;

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
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_NULL, null);
                }
                if (a.EnumC1538a.DATATYPE_NULL != bVar.a()) {
                    if (a.EnumC1538a.DATATYPE_NULL != bVar2.a()) {
                        if (a.EnumC1538a.DATATYPE_BOOLEAN == bVar.a() && a.EnumC1538a.DATATYPE_BOOLEAN == bVar2.a()) {
                            Boolean d = bVar.d();
                            Boolean d2 = bVar2.d();
                            if (d != null) {
                                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.valueOf(!d.equals(d2)));
                            }
                            if (d2 == null) {
                                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
                            }
                            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
                        } else if (a.EnumC1538a.DATATYPE_DATE == bVar.a() && a.EnumC1538a.DATATYPE_DATE == bVar2.a()) {
                            String b = bVar.b();
                            String b2 = bVar2.b();
                            if (b != null) {
                                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.valueOf(!b.equals(b2)));
                            }
                            if (b2 == null) {
                                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
                            }
                            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
                        } else if (a.EnumC1538a.DATATYPE_STRING == bVar.a() && a.EnumC1538a.DATATYPE_STRING == bVar2.a()) {
                            String c = bVar.c();
                            String c2 = bVar2.c();
                            if (c != null) {
                                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.valueOf(!c.equals(c2)));
                            }
                            if (c2 == null) {
                                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
                            }
                            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
                        } else if ((a.EnumC1538a.DATATYPE_DOUBLE == bVar.a() || a.EnumC1538a.DATATYPE_FLOAT == bVar.a() || a.EnumC1538a.DATATYPE_LONG == bVar.a() || a.EnumC1538a.DATATYPE_INT == bVar.a()) && (a.EnumC1538a.DATATYPE_DOUBLE == bVar2.a() || a.EnumC1538a.DATATYPE_FLOAT == bVar2.a() || a.EnumC1538a.DATATYPE_LONG == bVar2.a() || a.EnumC1538a.DATATYPE_INT == bVar2.a())) {
                            Double h = bVar.h();
                            Double h2 = bVar2.h();
                            if (h != null && h2 != null) {
                                if (Double.compare(h.doubleValue(), h2.doubleValue()) != 0) {
                                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
                                }
                                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
                            } else if (h == null && h2 == null) {
                                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
                            } else {
                                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
                            }
                        } else if (a.EnumC1538a.DATATYPE_OBJECT != bVar.a() || a.EnumC1538a.DATATYPE_OBJECT != bVar2.a()) {
                            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
                        } else {
                            Object obj = bVar.b;
                            Object obj2 = bVar2.b;
                            if (obj != null) {
                                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.valueOf(!obj.equals(obj2)));
                            }
                            if (obj2 == null) {
                                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
                            }
                            return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
                        }
                    } else if (bVar.b != null) {
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
                    } else {
                        return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
                    }
                } else if (bVar2.b != null) {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.TRUE);
                } else {
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_BOOLEAN, Boolean.FALSE);
                }
            }
        });
        t.put(AND, new org.apache.flink.cep.mlink.ikexpression.op.define.a());
        t.put(OR, new p());
        t.put(APPEND, new a() { // from class: org.apache.flink.cep.mlink.ikexpression.op.define.b
            public static final org.apache.flink.cep.mlink.ikexpression.op.b a = org.apache.flink.cep.mlink.ikexpression.op.b.APPEND;

            @Override // org.apache.flink.cep.mlink.ikexpression.op.a
            public final org.apache.flink.cep.mlink.ikexpression.datameta.b a(org.apache.flink.cep.mlink.ikexpression.datameta.b[] bVarArr) throws org.apache.flink.cep.mlink.ikexpression.b {
                if (bVarArr == null || bVarArr.length != 2) {
                    throw new IllegalArgumentException("操作符\"" + a.u + "参数个数不匹配");
                }
                org.apache.flink.cep.mlink.ikexpression.datameta.b bVar = bVarArr[0];
                org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2 = bVarArr[1];
                if (bVar == null || bVar2 == null) {
                    throw new NullPointerException("操作符\"" + a.u + "\"参数为空");
                }
                if (bVar.c) {
                    bVar = ((org.apache.flink.cep.mlink.ikexpression.datameta.c) bVar.b).a();
                }
                if (bVar2.c) {
                    bVar2 = ((org.apache.flink.cep.mlink.ikexpression.datameta.c) bVar2.b).a();
                }
                return a(bVar, bVar2);
            }

            private static org.apache.flink.cep.mlink.ikexpression.datameta.b a(org.apache.flink.cep.mlink.ikexpression.datameta.b bVar, org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2) {
                if (bVar == null || bVar2 == null) {
                    throw new IllegalArgumentException("操作符\"" + a.u + "\"参数丢失");
                }
                ArrayList arrayList = new ArrayList();
                if (a.EnumC1538a.DATATYPE_LIST == bVar.a()) {
                    if (bVar.j() != null) {
                        arrayList.addAll(bVar.j());
                    }
                } else {
                    try {
                        arrayList.add(bVar.k());
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
                if (a.EnumC1538a.DATATYPE_LIST == bVar2.a()) {
                    if (bVar2.j() != null) {
                        arrayList.addAll(bVar2.j());
                    }
                } else {
                    try {
                        arrayList.add(bVar2.k());
                    } catch (ParseException e2) {
                        e2.printStackTrace();
                    }
                }
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(a.EnumC1538a.DATATYPE_LIST, arrayList);
            }
        });
        t.put(SELECT, new a() { // from class: org.apache.flink.cep.mlink.ikexpression.op.define.s
            public static final org.apache.flink.cep.mlink.ikexpression.op.b a = org.apache.flink.cep.mlink.ikexpression.op.b.SELECT;

            @Override // org.apache.flink.cep.mlink.ikexpression.op.a
            public final org.apache.flink.cep.mlink.ikexpression.datameta.b a(org.apache.flink.cep.mlink.ikexpression.datameta.b[] bVarArr) throws org.apache.flink.cep.mlink.ikexpression.b {
                a.EnumC1538a enumC1538a;
                if (bVarArr == null || bVarArr.length != 3) {
                    throw new IllegalArgumentException("操作符\"" + a.u + "操作缺少参数");
                }
                org.apache.flink.cep.mlink.ikexpression.datameta.b bVar = bVarArr[2];
                if (bVar == null || bVar.b == null) {
                    throw new NullPointerException("操作符\"" + a.u + "\"第一参数为空");
                }
                boolean z = true;
                org.apache.flink.cep.mlink.ikexpression.datameta.b bVar2 = bVarArr[1];
                if (bVar2 == null || bVar2.b == null) {
                    throw new NullPointerException("操作符\"" + a.u + "\"第二参数为空");
                }
                org.apache.flink.cep.mlink.ikexpression.datameta.b bVar3 = bVarArr[0];
                if (bVar3 == null || bVar3.b == null) {
                    throw new NullPointerException("操作符\"" + a.u + "\"第三参数为空");
                }
                if (bVar.c) {
                    bVar = ((org.apache.flink.cep.mlink.ikexpression.datameta.c) bVar.b).a();
                }
                if (a.EnumC1538a.DATATYPE_BOOLEAN != bVar.a()) {
                    throw new IllegalArgumentException("操作符\"" + a.u + "\"第一参数类型错误");
                }
                if (a.EnumC1538a.DATATYPE_NULL != bVar2.a() && a.EnumC1538a.DATATYPE_NULL != bVar3.a() && bVar2.a() != bVar3.a() && ((a.EnumC1538a.DATATYPE_INT != bVar2.a() && a.EnumC1538a.DATATYPE_LONG != bVar2.a() && a.EnumC1538a.DATATYPE_FLOAT != bVar2.a() && a.EnumC1538a.DATATYPE_DOUBLE != bVar2.a()) || (a.EnumC1538a.DATATYPE_INT != bVar3.a() && a.EnumC1538a.DATATYPE_LONG != bVar3.a() && a.EnumC1538a.DATATYPE_FLOAT != bVar3.a() && a.EnumC1538a.DATATYPE_DOUBLE != bVar3.a()))) {
                    z = false;
                }
                if (!z) {
                    enumC1538a = null;
                } else if (a.EnumC1538a.DATATYPE_NULL == bVar2.a()) {
                    enumC1538a = bVar3.a();
                } else if (a.EnumC1538a.DATATYPE_NULL == bVar3.a()) {
                    enumC1538a = bVar2.a();
                } else if (bVar2.a() == bVar3.a()) {
                    enumC1538a = bVar2.a();
                } else if (a.EnumC1538a.DATATYPE_DOUBLE == bVar2.a() || a.EnumC1538a.DATATYPE_DOUBLE == bVar3.a()) {
                    enumC1538a = a.EnumC1538a.DATATYPE_DOUBLE;
                } else if (a.EnumC1538a.DATATYPE_FLOAT == bVar2.a() || a.EnumC1538a.DATATYPE_FLOAT == bVar3.a()) {
                    enumC1538a = a.EnumC1538a.DATATYPE_FLOAT;
                } else if (a.EnumC1538a.DATATYPE_LONG == bVar2.a() || a.EnumC1538a.DATATYPE_LONG == bVar3.a()) {
                    enumC1538a = a.EnumC1538a.DATATYPE_LONG;
                } else {
                    enumC1538a = a.EnumC1538a.DATATYPE_INT;
                }
                if (bVar.d().booleanValue()) {
                    if (bVar2.c) {
                        bVar2 = ((org.apache.flink.cep.mlink.ikexpression.datameta.c) bVar2.b).a();
                    }
                    return new org.apache.flink.cep.mlink.ikexpression.datameta.b(enumC1538a, bVar2.b);
                }
                if (bVar3.c) {
                    bVar3 = ((org.apache.flink.cep.mlink.ikexpression.datameta.c) bVar3.b).a();
                }
                return new org.apache.flink.cep.mlink.ikexpression.datameta.b(enumC1538a, bVar3.b);
            }
        });
        t.put(QUES, new a() { // from class: org.apache.flink.cep.mlink.ikexpression.op.define.r
            public static final org.apache.flink.cep.mlink.ikexpression.op.b a = org.apache.flink.cep.mlink.ikexpression.op.b.QUES;

            @Override // org.apache.flink.cep.mlink.ikexpression.op.a
            public final org.apache.flink.cep.mlink.ikexpression.datameta.b a(org.apache.flink.cep.mlink.ikexpression.datameta.b[] bVarArr) {
                throw new UnsupportedOperationException("操作符\"" + a.u + "不支持该方法");
            }
        });
        t.put(COLON, new a() { // from class: org.apache.flink.cep.mlink.ikexpression.op.define.c
            public static final org.apache.flink.cep.mlink.ikexpression.op.b a = org.apache.flink.cep.mlink.ikexpression.op.b.COLON;

            @Override // org.apache.flink.cep.mlink.ikexpression.op.a
            public final org.apache.flink.cep.mlink.ikexpression.datameta.b a(org.apache.flink.cep.mlink.ikexpression.datameta.b[] bVarArr) {
                throw new UnsupportedOperationException("操作符\"" + a.u + "不支持该方法");
            }
        });
    }

    b(String str, int i, int i2) {
        this.u = str;
        this.w = i;
        this.x = i2;
    }
}
