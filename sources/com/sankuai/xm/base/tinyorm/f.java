package com.sankuai.xm.base.tinyorm;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.LinkedHashMap;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static f d;
    public e b;
    public c c;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7324cdab36179f2a8ad49d43a508328", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7324cdab36179f2a8ad49d43a508328");
            return;
        }
        this.b = new e();
        this.c = new c(this.b);
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52b65ee44c63e4818381d654b71eb191", 6917529027641081856L)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52b65ee44c63e4818381d654b71eb191");
        }
        if (d == null) {
            synchronized (e.class) {
                if (d == null) {
                    d = new f();
                }
            }
        }
        return d;
    }

    public final boolean a(com.sankuai.xm.base.db.c cVar, Class cls) {
        int i;
        String str;
        char c = 0;
        Object[] objArr = {cVar, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef15eedb46f45c0c6f80b281f1304aaa", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef15eedb46f45c0c6f80b281f1304aaa")).booleanValue();
        }
        if (cVar == null) {
            return false;
        }
        try {
            c cVar2 = this.c;
            Object[] objArr2 = {cls};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            String str2 = null;
            if (PatchProxy.isSupport(objArr2, cVar2, changeQuickRedirect2, false, "ef2cff70269d79e3a534f9795efd8592", 6917529027641081856L)) {
                str2 = (String) PatchProxy.accessDispatch(objArr2, cVar2, changeQuickRedirect2, false, "ef2cff70269d79e3a534f9795efd8592");
            } else {
                d a2 = cVar2.b.a(cls);
                if (a2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CREATE TABLE IF NOT EXISTS ");
                    sb.append(a2.b);
                    sb.append(CommonConstant.Symbol.BRACKET_LEFT);
                    boolean z = a2.d.size() == 1;
                    LinkedHashMap<String, a> linkedHashMap = a2.e;
                    for (String str3 : linkedHashMap.keySet()) {
                        a aVar = linkedHashMap.get(str3);
                        sb.append(aVar.b);
                        int i2 = aVar.c;
                        Object[] objArr3 = new Object[1];
                        objArr3[c] = Integer.valueOf(i2);
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.tinyormapt.entity.a.a;
                        if (!PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f18e5c7533f11afda0c3d8f2b36d6d03", 6917529027641081856L)) {
                            Object[] objArr4 = {Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.tinyormapt.entity.a.a;
                            if (!PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "4c2472d3f48948c3a656ca9e48e5f95e", 6917529027641081856L)) {
                                switch (i2) {
                                    case 1:
                                    case 10:
                                        i = 2;
                                        break;
                                    case 2:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 11:
                                        i = 0;
                                        break;
                                    case 3:
                                    case 4:
                                        i = 1;
                                        break;
                                    case 9:
                                    default:
                                        i = 3;
                                        break;
                                }
                            } else {
                                i = ((Integer) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "4c2472d3f48948c3a656ca9e48e5f95e")).intValue();
                            }
                            switch (i) {
                                case 0:
                                    str = " INTEGER ";
                                    break;
                                case 1:
                                    str = " REAL ";
                                    break;
                                case 2:
                                    str = " TEXT ";
                                    break;
                                default:
                                    str = " BLOB ";
                                    break;
                            }
                        } else {
                            str = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f18e5c7533f11afda0c3d8f2b36d6d03");
                        }
                        sb.append(str);
                        if (aVar.d != null && z) {
                            sb.append("PRIMARY KEY ");
                            if (aVar.d.a) {
                                sb.append("AUTOINCREMENT ");
                            }
                        }
                        if (!aVar.e) {
                            sb.append("NOT NULL ");
                        }
                        if (aVar.f) {
                            sb.append("UNIQUE ");
                        }
                        sb.append(", ");
                        c = 0;
                    }
                    if (a2.d.size() > 1) {
                        sb.append("PRIMARY KEY ");
                        sb.append(CommonConstant.Symbol.BRACKET_LEFT);
                        for (a aVar2 : a2.d) {
                            sb.append(aVar2.b);
                            sb.append(", ");
                        }
                        sb.deleteCharAt(sb.lastIndexOf(", "));
                        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
                    } else {
                        sb.deleteCharAt(sb.lastIndexOf(", "));
                    }
                    sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
                    str2 = sb.toString();
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                cVar.a(str2);
            }
            String[] a3 = this.c.a(cls);
            if (a3 != null && a3.length > 0) {
                for (String str4 : a3) {
                    if (!TextUtils.isEmpty(str4)) {
                        cVar.a(str4);
                    }
                }
            }
            return true;
        } catch (com.sankuai.xm.base.db.f unused) {
            com.sankuai.xm.log.c.c("TinyORM", "create error, %s", cls);
            return false;
        }
    }

    public final long a(com.sankuai.xm.base.db.c cVar, Object obj) {
        d a2;
        ContentValues insert;
        Object[] objArr = {cVar, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "121a660a380265d957331d913da2ff26", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "121a660a380265d957331d913da2ff26")).longValue();
        }
        if (cVar == null || (a2 = this.b.a(obj)) == null) {
            return -1L;
        }
        c cVar2 = this.c;
        Object[] objArr2 = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar2, changeQuickRedirect2, false, "72bd4cd960f33a3d4913200f4dece48b", 6917529027641081856L)) {
            insert = (ContentValues) PatchProxy.accessDispatch(objArr2, cVar2, changeQuickRedirect2, false, "72bd4cd960f33a3d4913200f4dece48b");
        } else {
            TableProxy b = cVar2.b.b(obj);
            insert = b == null ? null : b.insert(obj);
        }
        long a3 = insert != null ? cVar.a(a2.b, (String) null, insert, 5) : -1L;
        if (a3 <= 0) {
            Log.e("TinyORM", "insert row = " + a3 + " , object:" + obj);
        }
        return a3;
    }

    public final boolean b(com.sankuai.xm.base.db.c cVar, Object obj) {
        d a2;
        Object[] objArr = {cVar, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c18cd161b7be4ecf30917dc23b4f17e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c18cd161b7be4ecf30917dc23b4f17e")).booleanValue();
        }
        if (cVar == null || (a2 = this.b.a(obj)) == null) {
            return false;
        }
        String a3 = this.c.a(obj);
        return (!TextUtils.isEmpty(a3) ? cVar.a(a2.b, a3, null) : 0) > 0;
    }

    public final boolean c(com.sankuai.xm.base.db.c cVar, Object obj) {
        d a2;
        LinkedList<a> linkedList;
        boolean z;
        int i;
        Object[] objArr = {cVar, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "618857e9ed314104c71918d77dcba869", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "618857e9ed314104c71918d77dcba869")).booleanValue();
        }
        if (cVar == null || (a2 = this.b.a(obj)) == null || (linkedList = a2.d) == null || linkedList.isEmpty()) {
            return false;
        }
        String a3 = this.c.a(obj);
        if (TextUtils.isEmpty(a3)) {
            z = false;
            i = 0;
        } else {
            String str = a2.b;
            Cursor cursor = null;
            try {
                z = false;
                Cursor a4 = cVar.a(str, null, a3, null, null, null, null, "1");
                try {
                    i = a4.getCount();
                    if (a4 != null) {
                        a4.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = a4;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (i > 0) {
            return true;
        }
        return z;
    }

    private Object e(com.sankuai.xm.base.db.c cVar, Object obj) {
        d a2;
        Object[] objArr = {cVar, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f8272aa5665d9d965459e05d9cd052c", 6917529027641081856L)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f8272aa5665d9d965459e05d9cd052c");
        }
        Cursor cursor = null;
        if (cVar == null || (a2 = this.b.a(obj)) == null) {
            return null;
        }
        try {
            String a3 = this.c.a(obj);
            Cursor a4 = !TextUtils.isEmpty(a3) ? cVar.a(a2.b, null, a3, null, null, null, null) : null;
            if (a4 == null) {
                if (a4 != null) {
                    a4.close();
                }
                return null;
            }
            try {
                if (a4.getCount() <= 0) {
                    if (a4 != null) {
                        a4.close();
                    }
                    return null;
                }
                a4.moveToFirst();
                Object a5 = a(a2.c, a4);
                if (a4 != null) {
                    a4.close();
                }
                return a5;
            } catch (Throwable th) {
                cursor = a4;
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final Object a(Class cls, Cursor cursor) {
        Object[] objArr = {cls, cursor};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "106f318cc4bf2809b05fadd424341504", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "106f318cc4bf2809b05fadd424341504") : this.c.a(cls, cursor);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [T, java.lang.Object] */
    public final int a(com.sankuai.xm.base.db.c cVar, Object obj, String[] strArr, b<Object> bVar) {
        d a2;
        int i = 0;
        Object[] objArr = {cVar, obj, strArr, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b8d27b329761b9532b5469b1787db2a", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b8d27b329761b9532b5469b1787db2a")).intValue();
        }
        if (cVar == null || (a2 = this.b.a(obj)) == null) {
            return -1;
        }
        ContentValues a3 = this.c.a(obj, strArr);
        String a4 = this.c.a(obj);
        if (!TextUtils.isEmpty(a4) && a3 != null) {
            i = cVar.a(a2.b, a3, a4, (String[]) null);
        }
        if (i > 0 && bVar != null) {
            if (strArr == null) {
                bVar.c = obj;
            } else {
                bVar.c = e(cVar, obj);
            }
        }
        return i;
    }

    public final boolean d(com.sankuai.xm.base.db.c cVar, Object obj) {
        Object[] objArr = {cVar, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "073b69222e71e337c45e0c8ecbfc7a80", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "073b69222e71e337c45e0c8ecbfc7a80")).booleanValue() : b(cVar, obj, null, null);
    }

    public final boolean b(com.sankuai.xm.base.db.c cVar, Object obj, String[] strArr, b<Object> bVar) {
        Object[] objArr = {cVar, obj, strArr, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d8ccc17d68c93c5657f36f38b9864b8", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d8ccc17d68c93c5657f36f38b9864b8")).booleanValue();
        }
        if (cVar == null || this.b.a(obj) == null) {
            return false;
        }
        if (c(cVar, obj)) {
            return a(cVar, obj, strArr, bVar) > 0;
        }
        int i = (a(cVar, obj) > (-1L) ? 1 : (a(cVar, obj) == (-1L) ? 0 : -1));
        if (i != 0 && bVar != null) {
            bVar.c = obj;
        }
        return i != 0;
    }
}
