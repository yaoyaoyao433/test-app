package com.sankuai.waimai.mach.expressionv3;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements Comparable<c> {
    public static ChangeQuickRedirect a;
    public static final c b;
    private static final NumberFormat e;
    public Object c;
    int d;

    static {
        NumberFormat decimalFormat = DecimalFormat.getInstance();
        e = decimalFormat;
        decimalFormat.setMaximumFractionDigits(300);
        e.setGroupingUsed(false);
        b = new c(null);
    }

    private c(Object obj) {
        int i = 1;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d340896a937f530fd599e5c3d4c5f78b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d340896a937f530fd599e5c3d4c5f78b");
            return;
        }
        this.c = obj;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2cc63f18f5e12a64af5957db43f60d2", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2cc63f18f5e12a64af5957db43f60d2")).intValue();
        } else if (this.c instanceof Number) {
            i = 0;
        } else if (!(this.c instanceof String)) {
            if (this.c instanceof Boolean) {
                i = 2;
            } else if (this.c instanceof List) {
                i = 3;
            } else if (this.c instanceof Map) {
                i = 4;
            } else {
                boolean z = this.c instanceof Void;
                i = 5;
            }
        }
        this.d = i;
    }

    public static c a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9d90189f5bf4c6eb5160449ee7bf3cc", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9d90189f5bf4c6eb5160449ee7bf3cc") : new c(obj);
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "728617e458f9018063bd8d08b9ce6773", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "728617e458f9018063bd8d08b9ce6773");
        }
        if (this.c instanceof String) {
            return (String) this.c;
        }
        if (this.c instanceof Boolean) {
            return ((Boolean) this.c).booleanValue() ? "1" : "0";
        } else if (this.c instanceof Number) {
            if (this.c instanceof Double) {
                return e.format(this.c);
            }
            return this.c.toString();
        } else {
            return StringUtil.NULL;
        }
    }

    public final Number b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "769216f8826f343f3aced209f0addffc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Number) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "769216f8826f343f3aced209f0addffc");
        }
        if (this.c instanceof Number) {
            return (Number) this.c;
        }
        if (this.c instanceof String) {
            return Double.valueOf((String) this.c);
        }
        if (this.c instanceof Boolean) {
            return Integer.valueOf(((Boolean) this.c).booleanValue() ? 1 : 0);
        }
        return Double.valueOf(0.0d);
    }

    public final List d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54702f80d13f5f742a2db1f9556b093c", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54702f80d13f5f742a2db1f9556b093c") : this.c instanceof List ? (List) this.c : Collections.emptyList();
    }

    public final Map e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99c96f00980e9d5e404c0c9a3bf211ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99c96f00980e9d5e404c0c9a3bf211ac");
        }
        if (this.c instanceof Map) {
            return (Map) this.c;
        }
        return Collections.emptyMap();
    }

    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3993476cfeeffa4a09b91c0b7c27bc92", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3993476cfeeffa4a09b91c0b7c27bc92") : this.c == null ? StringUtil.NULL : this.c.getClass().getName();
    }

    public final Boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04e1d187352c7666c28eccf4418bfa6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04e1d187352c7666c28eccf4418bfa6e");
        }
        if (this.d == 0) {
            return b().floatValue() != 0.0f ? Boolean.TRUE : Boolean.FALSE;
        } else if (this.d == 1) {
            return ((String) this.c).length() > 0 ? Boolean.TRUE : Boolean.FALSE;
        } else if (this.d == 2) {
            return (Boolean) this.c;
        } else {
            if (this.d == 3) {
                return Boolean.TRUE;
            }
            if (this.d == 4) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f192dffe7a19df0f1d173dc6bab5e48", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f192dffe7a19df0f1d173dc6bab5e48")).intValue();
        }
        if (cVar == null) {
            return 1;
        }
        if (this.d == 1 && cVar.d == 1) {
            return a().compareTo(cVar.a());
        }
        if ((this.d == 0 || this.d == 2) && (cVar.d == 0 || cVar.d == 2)) {
            return Double.compare(b().doubleValue(), cVar.b().doubleValue());
        }
        if (this.d == 1 && (cVar.d == 0 || cVar.d == 2)) {
            return a().compareTo(cVar.b().toString());
        }
        if ((this.d == 0 || this.d == 2) && cVar.d == 1) {
            return b().toString().compareTo(cVar.a());
        }
        return -1;
    }

    public static int a(c cVar, c cVar2, String str) throws b {
        Object[] objArr = {cVar, cVar2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d119513ce283257a1f473974d5bed336", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d119513ce283257a1f473974d5bed336")).intValue();
        }
        if (cVar.d == 5) {
            return cVar2.d == 5 ? 0 : -1;
        } else if (cVar2.d == 5) {
            return 1;
        } else {
            if ((cVar.d != 1 && cVar.d != 0 && cVar.d != 2) || (cVar2.d != 1 && cVar2.d != 0 && cVar2.d != 2)) {
                throw new b("二元表达式中 " + str + " 操作符的参数必须是字符串、数字或布尔值");
            }
            return cVar.compareTo(cVar2);
        }
    }
}
