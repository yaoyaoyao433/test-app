package org.apache.flink.cep.mlink.ikexpression.datameta;

import com.meituan.robust.common.CommonConstant;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class a {
    EnumC1538a a;
    public Object b;
    public boolean c;

    /* compiled from: ProGuard */
    /* renamed from: org.apache.flink.cep.mlink.ikexpression.datameta.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public enum EnumC1538a {
        DATATYPE_NULL,
        DATATYPE_STRING,
        DATATYPE_BOOLEAN,
        DATATYPE_INT,
        DATATYPE_LONG,
        DATATYPE_FLOAT,
        DATATYPE_DOUBLE,
        DATATYPE_DATE,
        DATATYPE_LIST,
        DATATYPE_OBJECT
    }

    public a(EnumC1538a enumC1538a, Object obj) {
        this.a = enumC1538a;
        this.b = obj;
        if (this.a == null || this.b == null) {
            return;
        }
        if (EnumC1538a.DATATYPE_NULL == this.a && this.b != null) {
            throw new IllegalArgumentException("数据类型不匹配; 类型：" + this.a + ",值不为空");
        } else if (EnumC1538a.DATATYPE_BOOLEAN == this.a) {
            try {
                d();
            } catch (UnsupportedOperationException unused) {
                throw new IllegalArgumentException("数据类型不匹配; 类型：" + this.a + ",值:" + this.b);
            }
        } else if (EnumC1538a.DATATYPE_DATE == this.a) {
            try {
                i();
            } catch (UnsupportedOperationException unused2) {
                throw new IllegalArgumentException("数据类型不匹配; 类型：" + this.a + ",值:" + this.b);
            }
        } else if (EnumC1538a.DATATYPE_DOUBLE == this.a) {
            try {
                h();
            } catch (UnsupportedOperationException unused3) {
                throw new IllegalArgumentException("数据类型不匹配; 类型：" + this.a + ",值:" + this.b);
            }
        } else if (EnumC1538a.DATATYPE_FLOAT == this.a) {
            try {
                g();
            } catch (UnsupportedOperationException unused4) {
                throw new IllegalArgumentException("数据类型不匹配; 类型：" + this.a + ",值:" + this.b);
            }
        } else if (EnumC1538a.DATATYPE_INT == this.a) {
            try {
                e();
            } catch (UnsupportedOperationException unused5) {
                throw new IllegalArgumentException("数据类型不匹配; 类型：" + this.a + ",值:" + this.b);
            }
        } else if (EnumC1538a.DATATYPE_LONG == this.a) {
            try {
                f();
            } catch (UnsupportedOperationException unused6) {
                throw new IllegalArgumentException("数据类型不匹配; 类型：" + this.a + ",值:" + this.b);
            }
        } else if (EnumC1538a.DATATYPE_STRING == this.a) {
            try {
                c();
            } catch (UnsupportedOperationException unused7) {
                throw new IllegalArgumentException("数据类型不匹配; 类型：" + this.a + ",值:" + this.b);
            }
        } else if (EnumC1538a.DATATYPE_LIST == this.a) {
            try {
                j();
            } catch (UnsupportedOperationException unused8) {
                throw new IllegalArgumentException("数据类型不匹配; 类型：" + this.a + ",值:" + this.b);
            }
        } else if (this.c) {
            try {
                l();
            } catch (UnsupportedOperationException unused9) {
                throw new IllegalArgumentException("数据类型不匹配; 类型：" + this.a + ",值:" + this.b);
            }
        } else if (EnumC1538a.DATATYPE_OBJECT == this.a) {
        }
    }

    public final EnumC1538a a() {
        if (!this.c) {
            return this.a;
        }
        return l().a;
    }

    public final String b() {
        if (this.b == null) {
            return null;
        }
        if (EnumC1538a.DATATYPE_DATE == this.a) {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format((Date) this.b);
        }
        if (EnumC1538a.DATATYPE_LIST == this.a) {
            StringBuffer stringBuffer = new StringBuffer("[");
            for (Object obj : (List) this.b) {
                if (obj == null) {
                    stringBuffer.append("null, ");
                } else if (obj instanceof Date) {
                    stringBuffer.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format((Date) obj));
                    stringBuffer.append(", ");
                } else {
                    stringBuffer.append(obj.toString());
                    stringBuffer.append(", ");
                }
            }
            stringBuffer.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            if (stringBuffer.length() > 2) {
                stringBuffer.delete(stringBuffer.length() - 3, stringBuffer.length() - 1);
            }
            return stringBuffer.toString();
        }
        return this.b.toString();
    }

    public final String c() {
        return b();
    }

    public final Boolean d() {
        if (EnumC1538a.DATATYPE_BOOLEAN != this.a) {
            throw new UnsupportedOperationException("当前常量类型不支持此操作");
        }
        return (Boolean) this.b;
    }

    public final Integer e() {
        if (EnumC1538a.DATATYPE_INT != this.a) {
            throw new UnsupportedOperationException("当前常量类型不支持此操作");
        }
        return (Integer) this.b;
    }

    public final Long f() {
        if (EnumC1538a.DATATYPE_INT != this.a && EnumC1538a.DATATYPE_LONG != this.a) {
            throw new UnsupportedOperationException("当前常量类型不支持此操作");
        }
        if (this.b == null) {
            return null;
        }
        return Long.valueOf(this.b.toString());
    }

    public final Float g() {
        if (EnumC1538a.DATATYPE_INT != this.a && EnumC1538a.DATATYPE_FLOAT != this.a && EnumC1538a.DATATYPE_LONG != this.a) {
            throw new UnsupportedOperationException("当前常量类型不支持此操作");
        }
        if (this.b == null) {
            return null;
        }
        return Float.valueOf(this.b.toString());
    }

    public final Double h() {
        if (EnumC1538a.DATATYPE_INT != this.a && EnumC1538a.DATATYPE_LONG != this.a && EnumC1538a.DATATYPE_FLOAT != this.a && EnumC1538a.DATATYPE_DOUBLE != this.a) {
            throw new UnsupportedOperationException("当前常量类型不支持此操作");
        }
        if (this.b == null) {
            return null;
        }
        return Double.valueOf(this.b.toString());
    }

    public final Date i() {
        if (EnumC1538a.DATATYPE_DATE != this.a) {
            throw new UnsupportedOperationException("当前常量类型不支持此操作");
        }
        return (Date) this.b;
    }

    public final List<Object> j() {
        if (EnumC1538a.DATATYPE_LIST != this.a) {
            throw new UnsupportedOperationException("当前常量类型不支持此操作");
        }
        return (List) this.b;
    }

    private c l() {
        if (!this.c) {
            throw new UnsupportedOperationException("当前常量类型不支持此操作");
        }
        return (c) this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.c && aVar.c) {
                return l() == aVar.l();
            } else if (aVar.a == this.a) {
                if (aVar.b == null || !aVar.b.equals(this.b)) {
                    return aVar.b == null && this.b == null;
                }
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final Object k() throws ParseException {
        if (this.b == null) {
            return null;
        }
        if (EnumC1538a.DATATYPE_BOOLEAN == a()) {
            return d();
        }
        if (EnumC1538a.DATATYPE_DATE == a()) {
            return i();
        }
        if (EnumC1538a.DATATYPE_DOUBLE == a()) {
            return h();
        }
        if (EnumC1538a.DATATYPE_FLOAT == a()) {
            return g();
        }
        if (EnumC1538a.DATATYPE_INT == a()) {
            return e();
        }
        if (EnumC1538a.DATATYPE_LONG == a()) {
            return f();
        }
        if (EnumC1538a.DATATYPE_STRING != a()) {
            if (EnumC1538a.DATATYPE_LIST == a()) {
                return j();
            }
            if (EnumC1538a.DATATYPE_OBJECT != a()) {
                throw new RuntimeException("映射Java类型失败：无法识别的数据类型");
            }
            return this.b;
        }
        return b();
    }
}
