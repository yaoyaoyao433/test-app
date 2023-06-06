package com.meituan.android.neohybrid.v2.neo.nsf;

import android.text.TextUtils;
import com.meituan.android.neohybrid.v2.neo.nsf.c;
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
public final class a implements c.InterfaceC0316c {
    public static ChangeQuickRedirect a;
    private static final Map<Object, a> c = new WeakHashMap();
    public List<b> b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d441077619c8872d764268c1b36fc717", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d441077619c8872d764268c1b36fc717");
        } else {
            this.b = Collections.synchronizedList(new ArrayList());
        }
    }

    public final void a(String str, Map<String, Object> map, c.b bVar, JSONObject jSONObject, boolean z) {
        Object[] objArr = {str, map, bVar, jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1748b2167a489f3f37f24d3babe3f9ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1748b2167a489f3f37f24d3babe3f9ea");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.b.add(b.a(str, map, bVar, this, jSONObject, z));
        }
    }

    public static a a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db9fc5405f78b541a049fb5c395b6702", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db9fc5405f78b541a049fb5c395b6702");
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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84a241a86813088915de80dffc970c6c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84a241a86813088915de80dffc970c6c") : c.get(obj);
    }

    public static boolean a(Object obj, String str, c.a aVar) {
        Object[] objArr = {obj, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c0fd03915cd9558f39a1e9fd9012005", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c0fd03915cd9558f39a1e9fd9012005")).booleanValue();
        }
        a c2 = c(obj);
        if (c2 != null) {
            Object[] objArr2 = {str, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, c2, changeQuickRedirect2, false, "6db14792d293da4c798b5a40cbb8115a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, c2, changeQuickRedirect2, false, "6db14792d293da4c798b5a40cbb8115a")).booleanValue();
            }
            if (TextUtils.isEmpty(str) || aVar == null) {
                return false;
            }
            for (b bVar : c2.b) {
                if (bVar != null && bVar.a(str)) {
                    Object[] objArr3 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "40b4b106a0dec0d2a75a9ddce7fdcf6d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "40b4b106a0dec0d2a75a9ddce7fdcf6d");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9be83b88cc8155a3d59d5b8c577d63d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9be83b88cc8155a3d59d5b8c577d63d7");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3735af31ff94360fd1840df21e74c5ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3735af31ff94360fd1840df21e74c5ba");
            return;
        }
        a c2 = c(obj);
        if (c2 != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, c2, changeQuickRedirect2, false, "1d0fbfd8c9c70e507203f81b5a86440e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c2, changeQuickRedirect2, false, "1d0fbfd8c9c70e507203f81b5a86440e");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aba6ef630d83d04645cff1993db2fe2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aba6ef630d83d04645cff1993db2fe2e");
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

    @Override // com.meituan.android.neohybrid.v2.neo.nsf.c.InterfaceC0316c
    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "861cf6a1783de92547e0b02e3c40335b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "861cf6a1783de92547e0b02e3c40335b");
        } else if (bVar.e) {
        } else {
            this.b.remove(bVar);
        }
    }
}
