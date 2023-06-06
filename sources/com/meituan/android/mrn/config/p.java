package com.meituan.android.mrn.config;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class p {
    public static ChangeQuickRedirect a;
    private static Map<String, String> c;
    private static Map<String, List<IMRNConfigProvider>> b = new HashMap();
    private static Map<String, List<com.facebook.react.i>> d = new HashMap();
    private static List<com.facebook.react.i> e = new ArrayList();

    public static synchronized void a() {
        List<IMRNConfigProvider> arrayList;
        List<com.facebook.react.i> list;
        synchronized (p.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "747a92d91918b7df899ad529f621b708", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "747a92d91918b7df899ad529f621b708");
            } else if (com.sankuai.meituan.serviceloader.b.a()) {
                if (c == null) {
                    Map<String, Map<String, String>> b2 = com.sankuai.meituan.serviceloader.b.b();
                    if (b2 != null) {
                        c = b2.get(IMRNConfigProvider.class.getName());
                    }
                    if (c == null) {
                        c = new HashMap();
                    }
                }
                if (c.size() <= 0) {
                    return;
                }
                HashSet<String> hashSet = new HashSet();
                for (Map.Entry<String, String> entry : c.entrySet()) {
                    List a2 = com.sankuai.meituan.serviceloader.b.a(IMRNConfigProvider.class, entry.getKey());
                    if (a2 != null && a2.size() > 0) {
                        IMRNConfigProvider iMRNConfigProvider = (IMRNConfigProvider) a2.get(0);
                        String bizName = iMRNConfigProvider.getBizName();
                        if (b.containsKey(bizName)) {
                            arrayList = b.get(bizName);
                        } else {
                            arrayList = new ArrayList<>();
                            b.put(bizName, arrayList);
                        }
                        arrayList.add(iMRNConfigProvider);
                        if (d.containsKey(bizName)) {
                            list = d.get(bizName);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            d.put(bizName, arrayList2);
                            list = arrayList2;
                        }
                        List<com.facebook.react.i> businessReactPackage = iMRNConfigProvider.getBusinessReactPackage();
                        if (businessReactPackage != null) {
                            list.addAll(businessReactPackage);
                        }
                        if (iMRNConfigProvider.getGlobalReactPackage() != null) {
                            e.addAll(iMRNConfigProvider.getGlobalReactPackage());
                        }
                        hashSet.add(entry.getKey());
                    }
                }
                for (String str : hashSet) {
                    c.remove(str);
                }
            }
        }
    }

    public static synchronized List<com.facebook.react.i> a(String str, String str2) {
        List arrayList;
        synchronized (p.class) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea9307a97f59a07dbb13c40e3b9aa3cb", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea9307a97f59a07dbb13c40e3b9aa3cb");
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                List<IMRNConfigProvider> list = b.get(str);
                if (list != null && list.size() > 0) {
                    ArrayList<ae> arrayList2 = new ArrayList();
                    for (IMRNConfigProvider iMRNConfigProvider : list) {
                        List<ae> reactPackageKeyList = iMRNConfigProvider.getReactPackageKeyList(str2);
                        if (reactPackageKeyList != null) {
                            arrayList2.addAll(reactPackageKeyList);
                        }
                    }
                    if (arrayList2.size() <= 0) {
                        return null;
                    }
                    HashSet<String> hashSet = new HashSet();
                    HashMap hashMap = new HashMap();
                    for (ae aeVar : arrayList2) {
                        if (TextUtils.isEmpty(aeVar.c)) {
                            hashSet.add(aeVar.b);
                        } else {
                            if (hashMap.containsKey(aeVar.b)) {
                                arrayList = (List) hashMap.get(aeVar.b);
                            } else {
                                arrayList = new ArrayList();
                                hashMap.put(aeVar.b, arrayList);
                            }
                            arrayList.add(aeVar.c);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (String str3 : hashSet) {
                        hashMap.remove(str3);
                        List<com.facebook.react.i> list2 = d.get(str);
                        if (list2 != null) {
                            arrayList3.addAll(list2);
                        }
                    }
                    for (Map.Entry entry : hashMap.entrySet()) {
                        List<com.facebook.react.i> list3 = d.get(str);
                        if (list3 != null) {
                            for (com.facebook.react.i iVar : list3) {
                                if (iVar instanceof IMRNReactPackage) {
                                    IMRNReactPackage iMRNReactPackage = (IMRNReactPackage) iVar;
                                    Iterator it = ((List) entry.getValue()).iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (TextUtils.equals((String) it.next(), iMRNReactPackage.a())) {
                                                arrayList3.add(iVar);
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return arrayList3;
                }
                return null;
            }
            return null;
        }
    }

    public static synchronized List<com.facebook.react.i> b() {
        List<com.facebook.react.i> list;
        synchronized (p.class) {
            list = e;
        }
        return list;
    }

    private static synchronized Map<String, String> b(String str, String str2) {
        Map<String, String> businessMetricsTag;
        synchronized (p.class) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6900339f95f4bbd1643ba97a31cecc0a", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6900339f95f4bbd1643ba97a31cecc0a");
            }
            if (b != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                List<IMRNConfigProvider> list = b.get(str);
                if (list != null && list.size() > 0) {
                    HashMap hashMap = new HashMap();
                    for (IMRNConfigProvider iMRNConfigProvider : list) {
                        if (iMRNConfigProvider != null && (businessMetricsTag = iMRNConfigProvider.getBusinessMetricsTag(str2)) != null) {
                            hashMap.putAll(businessMetricsTag);
                        }
                    }
                    return hashMap;
                }
                return null;
            }
            return null;
        }
    }

    public static synchronized Map<String, String> a(String str) {
        synchronized (p.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7884c59d87a5086b9064869a421a750d", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7884c59d87a5086b9064869a421a750d");
            } else if (TextUtils.isEmpty(str)) {
                return null;
            } else {
                String[] split = str.split(CommonConstant.Symbol.UNDERLINE);
                if (split.length != 3) {
                    return null;
                }
                return b(split[1], split[2]);
            }
        }
    }
}
