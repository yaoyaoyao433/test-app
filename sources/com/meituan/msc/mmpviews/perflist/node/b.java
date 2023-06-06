package com.meituan.msc.mmpviews.perflist.node;

import com.meituan.msc.jse.bridge.MSCReadableMap;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.NativeViewHierarchyManager;
import com.meituan.msc.uimanager.UIViewOperationQueue;
import com.meituan.msc.uimanager.ab;
import com.meituan.msc.uimanager.aq;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public List<a> b;
    private List<Integer> c;
    private Map<Integer, Set<String>> d;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b2b48a177fd0449eeb01854782e14ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b2b48a177fd0449eeb01854782e14ab");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new HashMap();
    }

    public final com.meituan.msc.mmpviews.perflist.node.a a(int i, int i2, int i3, ArrayList<UIViewOperationQueue.u> arrayList) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "867841cbc0e5120a867c96938613a3cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.mmpviews.perflist.node.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "867841cbc0e5120a867c96938613a3cf");
        }
        a aVar = this.b.get(i);
        a aVar2 = this.b.get(i2);
        if (aVar == null || aVar2 == null) {
            throw new RuntimeException("data is null in curPosition or shadowPosition");
        }
        if (aVar2.d != null) {
            aVar.d = aVar2.d.a();
            aVar.e = new HashMap();
            a(aVar.d, aVar.e);
        }
        if (aVar.d == null) {
            aVar.e = new HashMap();
        }
        a(aVar.e, arrayList);
        com.meituan.msc.mmpviews.perflist.node.a aVar3 = aVar.e.get(Integer.valueOf(i3));
        aVar.d = aVar3;
        return aVar3;
    }

    private void a(Map<Integer, com.meituan.msc.mmpviews.perflist.node.a> map, ArrayList<UIViewOperationQueue.u> arrayList) {
        Object[] objArr = {map, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f272bc2829888f4c103390398604020", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f272bc2829888f4c103390398604020");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<UIViewOperationQueue.u> it = arrayList.iterator();
        while (it.hasNext()) {
            UIViewOperationQueue.u next = it.next();
            if (next instanceof UIViewOperationQueue.y) {
                if (next instanceof UIViewOperationQueue.c) {
                    com.meituan.msc.mmpviews.perflist.node.a aVar = new com.meituan.msc.mmpviews.perflist.node.a();
                    UIViewOperationQueue.c cVar = (UIViewOperationQueue.c) next;
                    aVar.c = cVar.i;
                    aVar.d = cVar.b;
                    aVar.e = cVar.c;
                    aVar.f = ((MSCReadableMap) cVar.d.b).getRealData();
                    map.put(Integer.valueOf(aVar.c), aVar);
                    arrayList2.add(Integer.valueOf(aVar.c));
                } else {
                    com.meituan.msc.mmpviews.perflist.node.a aVar2 = map.get(Integer.valueOf(((UIViewOperationQueue.y) next).i));
                    if (aVar2 == null) {
                        continue;
                    } else if (next instanceof UIViewOperationQueue.x) {
                        aVar2.g = ((UIViewOperationQueue.x) next).b;
                    } else if (next instanceof UIViewOperationQueue.v) {
                        UIViewOperationQueue.v vVar = (UIViewOperationQueue.v) next;
                        aVar2.b = vVar.g;
                        aVar2.i = vVar.b;
                        aVar2.j = vVar.c;
                        aVar2.k = vVar.d;
                        aVar2.l = vVar.e;
                        aVar2.m = vVar.f;
                    } else if (next instanceof UIViewOperationQueue.w) {
                        JSONObject realData = ((MSCReadableMap) ((UIViewOperationQueue.w) next).b.b).getRealData();
                        if (arrayList2.contains(Integer.valueOf(aVar2.c))) {
                            if (aVar2.f == null) {
                                aVar2.f = realData;
                            } else if (realData != null) {
                                aVar2.f = a(realData, aVar2.f);
                            }
                        } else {
                            Set<String> set = this.d.get(Integer.valueOf(aVar2.c));
                            if (set == null) {
                                set = new HashSet<>();
                                this.d.put(Integer.valueOf(aVar2.c), set);
                            }
                            Iterator<String> keys = realData.keys();
                            while (keys.hasNext()) {
                                set.add(keys.next());
                            }
                            if (aVar2.h == null) {
                                aVar2.h = realData;
                            } else {
                                aVar2.h = a(aVar2.h, realData);
                            }
                        }
                    } else if (next instanceof UIViewOperationQueue.k) {
                        UIViewOperationQueue.k kVar = (UIViewOperationQueue.k) next;
                        int[] iArr = kVar.b;
                        aq[] aqVarArr = kVar.c;
                        int[] iArr2 = kVar.d;
                        if (iArr != null && iArr.length > 0) {
                            int size = aVar2.n.size();
                            for (int length = iArr.length - 1; length >= 0; length--) {
                                int i = iArr[length];
                                if (i < 0) {
                                    g.c("");
                                } else if (i >= aVar2.n.size()) {
                                    g.c("");
                                } else if (i >= size) {
                                    g.c("");
                                } else {
                                    aVar2.n.remove(i);
                                    size = i;
                                }
                            }
                        }
                        if (aqVarArr != null) {
                            for (aq aqVar : aqVarArr) {
                                com.meituan.msc.mmpviews.perflist.node.a aVar3 = map.get(Integer.valueOf(aqVar.c));
                                if (aVar3 == null) {
                                    g.a("MSCLOG", "Trying to add unknown view tag: " + aqVar.c);
                                } else {
                                    aVar2.n.add(aqVar.d, aVar3);
                                }
                            }
                        }
                        if (iArr2 != null && iArr2.length > 0) {
                            for (int i2 = 0; i2 < iArr2.length; i2++) {
                                map.remove(Integer.valueOf(iArr2[i2]));
                                this.c.add(Integer.valueOf(iArr2[i2]));
                            }
                        }
                    } else {
                        throw new RuntimeException("unsupport Operation " + next.getClass().getSimpleName());
                    }
                }
            }
        }
        arrayList2.clear();
    }

    public final void a(com.meituan.msc.mmpviews.perflist.node.a aVar, com.meituan.msc.mmpviews.perflist.node.a aVar2, NativeViewHierarchyManager nativeViewHierarchyManager, boolean z) {
        int i;
        boolean z2;
        NativeViewHierarchyManager nativeViewHierarchyManager2;
        Object[] objArr = {aVar, aVar2, nativeViewHierarchyManager, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c682def5cb0878b72657a1ff428a463", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c682def5cb0878b72657a1ff428a463");
        } else if (aVar != null && aVar2 != null) {
            if (aVar.c != aVar2.c) {
                throw new RuntimeException("diffNode tag is not same!!!");
            }
            if (z) {
                if (aVar2.h != null) {
                    nativeViewHierarchyManager.a(aVar2.c, aVar2.e, new ab(new MSCReadableMap(aVar2.h)));
                }
                Set<String> set = this.d.get(Integer.valueOf(aVar2.c));
                if (set != null && set.size() > 0 && (aVar2.h == null || aVar2.h.length() != set.size())) {
                    if (aVar2.h == null) {
                        aVar2.h = new JSONObject();
                    }
                    if (aVar2.f != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (String str : set) {
                            if (!aVar2.h.has(str) && aVar2.f.has(str)) {
                                try {
                                    jSONObject.put(str, aVar2.f.opt(str));
                                    aVar2.h.put(str, aVar2.f.opt(str));
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        nativeViewHierarchyManager.a(aVar2.c, aVar2.e, new ab(new MSCReadableMap(jSONObject)));
                    }
                }
            } else if (aVar2.h != null) {
                nativeViewHierarchyManager.a(aVar2.c, aVar2.e, new ab(new MSCReadableMap(aVar2.h)));
            }
            if (aVar.g != aVar2.g && aVar2.g != null) {
                nativeViewHierarchyManager.a(aVar2.c, aVar2.g);
            }
            if (aVar.i == aVar2.i && aVar.j == aVar2.j && aVar.k == aVar2.k && aVar.l == aVar2.l && aVar.m == aVar2.m) {
                z2 = z ? 1 : 0;
                nativeViewHierarchyManager2 = nativeViewHierarchyManager;
                i = 0;
            } else {
                int i2 = aVar2.i;
                int i3 = aVar2.c;
                int i4 = aVar2.j;
                int i5 = aVar2.k;
                int i6 = aVar2.l;
                int i7 = aVar2.m;
                String str2 = aVar2.e;
                i = 0;
                z2 = z ? 1 : 0;
                nativeViewHierarchyManager2 = nativeViewHierarchyManager;
                nativeViewHierarchyManager.a(i2, i3, i4, i5, i6, i7, str2);
            }
            if (a(aVar) && a(aVar2)) {
                return;
            }
            if (a(aVar)) {
                if (aVar2.n == null || aVar2.n.size() <= 0) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                while (i < aVar2.n.size()) {
                    a(aVar2.n.get(i), nativeViewHierarchyManager2);
                    arrayList.add(new aq(aVar2.n.get(i).c, i));
                    i++;
                }
                nativeViewHierarchyManager2.a(aVar2.c, (int[]) null, (aq[]) arrayList.toArray(new aq[arrayList.size()]), (int[]) null);
            } else if (a(aVar2)) {
                int[] iArr = new int[aVar.n.size()];
                int[] iArr2 = new int[aVar.n.size()];
                while (i < aVar.n.size()) {
                    iArr[i] = i;
                    iArr2[i] = aVar.n.get(i).c;
                    i++;
                }
                nativeViewHierarchyManager2.a(aVar.c, iArr, (aq[]) null, iArr2);
            } else {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                int i8 = 0;
                int i9 = 0;
                while (i8 < aVar.n.size() && i9 < aVar2.n.size()) {
                    com.meituan.msc.mmpviews.perflist.node.a aVar3 = aVar.n.get(i8);
                    com.meituan.msc.mmpviews.perflist.node.a aVar4 = aVar2.n.get(i9);
                    if (aVar3.c == aVar4.c) {
                        linkedHashMap2.put(aVar3, aVar4);
                        i8++;
                        i9++;
                    } else {
                        arrayList2.add(Integer.valueOf(i8));
                        linkedHashMap.put(Integer.valueOf(aVar3.c), aVar3);
                        i8++;
                    }
                }
                while (i8 < aVar.n.size()) {
                    com.meituan.msc.mmpviews.perflist.node.a aVar5 = aVar.n.get(i8);
                    arrayList2.add(Integer.valueOf(i8));
                    linkedHashMap.put(Integer.valueOf(aVar5.c), aVar5);
                    i8++;
                }
                while (i9 < aVar2.n.size()) {
                    com.meituan.msc.mmpviews.perflist.node.a aVar6 = aVar2.n.get(i9);
                    if (!linkedHashMap.containsKey(Integer.valueOf(aVar6.c))) {
                        a(aVar6, nativeViewHierarchyManager2);
                    } else {
                        linkedHashMap2.put(linkedHashMap.get(Integer.valueOf(aVar6.c)), aVar6);
                        linkedHashMap.remove(Integer.valueOf(aVar6.c));
                    }
                    arrayList3.add(new aq(aVar6.c, i9));
                    i9++;
                }
                int[] iArr3 = new int[arrayList2.size()];
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    iArr3[i10] = ((Integer) arrayList2.get(i10)).intValue();
                }
                int[] iArr4 = new int[linkedHashMap.size()];
                Iterator it = linkedHashMap.keySet().iterator();
                while (i < linkedHashMap.size()) {
                    iArr4[i] = ((Integer) it.next()).intValue();
                    i++;
                }
                nativeViewHierarchyManager2.a(aVar2.c, iArr3, (aq[]) arrayList3.toArray(new aq[arrayList3.size()]), iArr4);
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    a((com.meituan.msc.mmpviews.perflist.node.a) entry.getKey(), (com.meituan.msc.mmpviews.perflist.node.a) entry.getValue(), nativeViewHierarchyManager2, z2);
                }
            }
        }
    }

    public void a(com.meituan.msc.mmpviews.perflist.node.a aVar, NativeViewHierarchyManager nativeViewHierarchyManager) {
        Object[] objArr = {aVar, nativeViewHierarchyManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad745b51399b4e74684e100c6bf68bbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad745b51399b4e74684e100c6bf68bbf");
        } else if (aVar != null) {
            if (!nativeViewHierarchyManager.c(aVar.c)) {
                nativeViewHierarchyManager.a(aVar.d, aVar.c, aVar.e, new ab(new MSCReadableMap(aVar.f)));
                if (aVar.h != null) {
                    nativeViewHierarchyManager.a(aVar.c, aVar.e, new ab(new MSCReadableMap(aVar.h)));
                }
            } else {
                if (aVar.h != null) {
                    nativeViewHierarchyManager.a(aVar.c, aVar.e, new ab(new MSCReadableMap(aVar.h)));
                }
                Set<String> set = this.d.get(Integer.valueOf(aVar.c));
                if (set != null && set.size() > 0) {
                    if (aVar.h == null) {
                        aVar.h = new JSONObject();
                    }
                    if (aVar.f != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (String str : set) {
                            if (!aVar.h.has(str) && aVar.f.has(str)) {
                                try {
                                    jSONObject.put(str, aVar.f.opt(str));
                                    aVar.h.put(str, aVar.f.opt(str));
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        nativeViewHierarchyManager.a(aVar.c, aVar.e, new ab(new MSCReadableMap(jSONObject)));
                    }
                }
            }
            if (aVar.g != null) {
                nativeViewHierarchyManager.a(aVar.c, aVar.g);
            }
            if (aVar.n != null && aVar.n.size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < aVar.n.size(); i++) {
                    a(aVar.n.get(i), nativeViewHierarchyManager);
                    arrayList.add(new aq(aVar.n.get(i).c, i));
                }
                nativeViewHierarchyManager.a(aVar.c, (int[]) null, (aq[]) arrayList.toArray(new aq[arrayList.size()]), (int[]) null);
            }
            nativeViewHierarchyManager.a(aVar.i, aVar.c, aVar.j, aVar.k, aVar.l, aVar.m, aVar.e);
        }
    }

    private void a(com.meituan.msc.mmpviews.perflist.node.a aVar, Map<Integer, com.meituan.msc.mmpviews.perflist.node.a> map) {
        Object[] objArr = {aVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "127e94a0c02dd00c60f579c9efb94968", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "127e94a0c02dd00c60f579c9efb94968");
            return;
        }
        map.put(Integer.valueOf(aVar.c), aVar);
        if (aVar.n == null || aVar.n.size() <= 0) {
            return;
        }
        for (com.meituan.msc.mmpviews.perflist.node.a aVar2 : aVar.n) {
            a(aVar2, map);
        }
    }

    public final com.meituan.msc.mmpviews.perflist.node.a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be94a05d588549f9c42c9d42df1c6e55", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.mmpviews.perflist.node.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be94a05d588549f9c42c9d42df1c6e55");
        }
        a aVar = this.b.get(i);
        if (aVar == null) {
            return null;
        }
        return aVar.d;
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        Object[] objArr = {jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b2f6f9d07f9d2b89ea631ab4ce845ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b2f6f9d07f9d2b89ea631ab4ce845ce");
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                if (!jSONObject2.has(next)) {
                    jSONObject2.put(next, jSONObject.opt(next));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject2;
    }

    private boolean a(com.meituan.msc.mmpviews.perflist.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e78993847057b5247497222f9329d75", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e78993847057b5247497222f9329d75")).booleanValue() : aVar.n == null || aVar.n.size() == 0;
    }

    public final com.meituan.msc.mmpviews.list.msclist.data.a a(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26df9917c4c7939de3b075b6f8550905", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.mmpviews.list.msclist.data.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26df9917c4c7939de3b075b6f8550905") : a(-1, jSONArray);
    }

    private com.meituan.msc.mmpviews.list.msclist.data.a a(int i, JSONArray jSONArray) {
        Object[] objArr = {Integer.valueOf(i), jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5449c5466dc36cb7da94ff2669b09f7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.mmpviews.list.msclist.data.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5449c5466dc36cb7da94ff2669b09f7b");
        }
        com.meituan.msc.mmpviews.list.msclist.data.a aVar = new com.meituan.msc.mmpviews.list.msclist.data.a();
        if (jSONArray == null || jSONArray.length() <= 0) {
            return aVar;
        }
        if (i < 0 || i > this.b.size()) {
            i = this.b.size();
        }
        aVar.b = i;
        aVar.c = jSONArray.length();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            this.b.add(aVar.b + i2, new a(optJSONObject.optBoolean("sticky"), optJSONObject.opt("stickyOffset"), optJSONObject.optString("itemType")));
        }
        return aVar;
    }

    public final com.meituan.msc.mmpviews.list.msclist.data.a a(int i, int i2, JSONArray jSONArray) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ec803e95d6e8e81f1b264d5386142d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.mmpviews.list.msclist.data.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ec803e95d6e8e81f1b264d5386142d6");
        }
        com.meituan.msc.mmpviews.list.msclist.data.a aVar = new com.meituan.msc.mmpviews.list.msclist.data.a();
        if (i < 0) {
            i = 0;
        }
        if (i > this.b.size()) {
            i = this.b.size();
        }
        aVar.b = i;
        aVar.c = jSONArray.length();
        a(i, i2);
        a(i, jSONArray);
        return aVar;
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63d066372f3ce3224f0c44364be37810", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63d066372f3ce3224f0c44364be37810");
        } else if (i2 > 0) {
            if (i < 0) {
                i = 0;
            }
            if (i > this.b.size()) {
                i = this.b.size();
            }
            if (i2 > this.b.size() - i) {
                i2 = this.b.size() - i;
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < this.b.size(); i3++) {
                if (i3 >= i && i3 < i + i2) {
                    arrayList.add(this.b.get(i3));
                }
            }
            this.b.removeAll(arrayList);
        }
    }

    public final void a(List<Integer> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "084da56ae163c5f99b57ea1fa7d1cd99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "084da56ae163c5f99b57ea1fa7d1cd99");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            int intValue = num.intValue();
            if (intValue >= 0 && intValue < this.b.size()) {
                arrayList.add(this.b.get(intValue));
            }
        }
        this.b.removeAll(arrayList);
    }

    public final a b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eba57b39fe9ff0005c908057bcc0cab", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eba57b39fe9ff0005c908057bcc0cab");
        }
        if (i < 0 || i >= this.b.size()) {
            return null;
        }
        return this.b.get(i);
    }

    public final int a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d343eb9101d820d8c733b7a4211118e4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d343eb9101d820d8c733b7a4211118e4")).intValue();
        }
        if (aVar == null) {
            return -1;
        }
        return this.b.indexOf(aVar);
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91c8b7b5e84bf6b92ca4fb494ef46c48", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91c8b7b5e84bf6b92ca4fb494ef46c48")).intValue() : this.b.size();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public boolean a;
        public Object b;
        public String c;
        public com.meituan.msc.mmpviews.perflist.node.a d;
        public Map<Integer, com.meituan.msc.mmpviews.perflist.node.a> e;
        public JSONObject f;

        public a(boolean z, Object obj, String str) {
            this.a = z;
            this.b = obj;
            this.c = str;
        }
    }
}
