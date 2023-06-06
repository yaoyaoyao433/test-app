package com.meituan.android.neohybrid.neo.nsf;

import android.text.TextUtils;
import com.meituan.android.neohybrid.neo.nsf.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements c.InterfaceC0307c {
    public static ChangeQuickRedirect a;
    private static final Map<Object, a> c = new WeakHashMap();
    public List<b> b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d1fad05607f323031f1a9d579b8a328", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d1fad05607f323031f1a9d579b8a328");
        } else {
            this.b = Collections.synchronizedList(new ArrayList());
        }
    }

    public final void a(String str, Map<String, Object> map, c.b bVar, JSONObject jSONObject, boolean z) {
        Object[] objArr = {str, map, bVar, jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a177cd6c803c0fe22707cf4ef07757df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a177cd6c803c0fe22707cf4ef07757df");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.b.add(b.a(str, map, bVar, this, jSONObject, z));
        }
    }

    public static a a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcc16d9552e8c8301add201862237a8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcc16d9552e8c8301add201862237a8d");
        }
        a aVar = c.get(obj);
        if (aVar == null) {
            a aVar2 = new a();
            c.put(obj, aVar2);
            return aVar2;
        }
        return aVar;
    }

    private static a c(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88639b27b3e5b487275baa098dbfd17a", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88639b27b3e5b487275baa098dbfd17a") : c.get(obj);
    }

    public static boolean a(Object obj, String str, c.a aVar) {
        Object[] objArr = {obj, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7ae222a267e87f1feef8b01e51c527f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7ae222a267e87f1feef8b01e51c527f")).booleanValue();
        }
        a c2 = c(obj);
        if (c2 != null) {
            Object[] objArr2 = {str, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, c2, changeQuickRedirect2, false, "5da3ad70b6f56b65f9ba757a5abdc8dd", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, c2, changeQuickRedirect2, false, "5da3ad70b6f56b65f9ba757a5abdc8dd")).booleanValue();
            }
            if (TextUtils.isEmpty(str) || aVar == null) {
                return false;
            }
            for (b bVar : c2.b) {
                if (bVar != null && bVar.a(str)) {
                    Object[] objArr3 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "7e32a8befd557441fa63c6fa427b9255", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "7e32a8befd557441fa63c6fa427b9255");
                    } else if (aVar != null) {
                        switch (bVar.d) {
                            case -2:
                                if (bVar.e) {
                                    if (bVar.b != null) {
                                        bVar.a(aVar, bVar.b);
                                        break;
                                    } else {
                                        bVar.a(aVar, 2002, "请求的数据错误");
                                        break;
                                    }
                                } else {
                                    bVar.a(aVar, 2003, "重复获取数据");
                                    break;
                                }
                            case -1:
                                bVar.a(aVar, 2005, "请求已取消");
                                break;
                            case 0:
                            default:
                                bVar.a(aVar, 12001, "请求状态错误");
                                break;
                            case 1:
                                bVar.c = aVar;
                                break;
                            case 2:
                                if (bVar.b != null) {
                                    bVar.a(aVar, bVar.b);
                                    break;
                                } else {
                                    bVar.a(aVar, 2002, "请求的数据错误");
                                    break;
                                }
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static JSONObject a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fc9ac56ae4aa48b1f1f283cfaa142f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fc9ac56ae4aa48b1f1f283cfaa142f7");
        }
        a c2 = c(obj);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (b bVar : c2.b) {
            if (bVar != null && bVar.a(str)) {
                if (bVar.d != 2 || bVar.b == null) {
                    return null;
                }
                return bVar.b;
            }
        }
        return null;
    }

    public static void b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c20962b143566d9e2043961c39062c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c20962b143566d9e2043961c39062c7");
            return;
        }
        a c2 = c(obj);
        if (c2 != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, c2, changeQuickRedirect2, false, "1027fa0e535c8c545e744f85819e4525", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c2, changeQuickRedirect2, false, "1027fa0e535c8c545e744f85819e4525");
            } else {
                c2.b.clear();
            }
        }
    }

    public static void b(Object obj, String str) {
        a c2;
        List<b> list;
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "761fea69e37e1e043f22c467b20892cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "761fea69e37e1e043f22c467b20892cc");
        } else if (TextUtils.isEmpty(str) || (c2 = c(obj)) == null || (list = c2.b) == null) {
        } else {
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                b next = it.next();
                if (next != null && next.a(str)) {
                    it.remove();
                }
            }
        }
    }

    @Override // com.meituan.android.neohybrid.neo.nsf.c.InterfaceC0307c
    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74670b6b298982f5436c8082fb5f9ce3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74670b6b298982f5436c8082fb5f9ce3");
        } else if (bVar.e) {
        } else {
            this.b.remove(bVar);
        }
    }
}
