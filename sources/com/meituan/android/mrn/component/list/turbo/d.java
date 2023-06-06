package com.meituan.android.mrn.component.list.turbo;

import android.support.annotation.NonNull;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.component.list.item.MListExpressionManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static final a<WritableMap, String> b = new a<WritableMap, String>() { // from class: com.meituan.android.mrn.component.list.turbo.d.1
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.meituan.android.mrn.component.list.turbo.d.a
        public WritableMap a(WritableMap writableMap, String str, Dynamic dynamic) {
            Object[] objArr = {writableMap, str, dynamic};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e1848815e6a3b75226a3df62e26b217", RobustBitConfig.DEFAULT_VALUE)) {
                return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e1848815e6a3b75226a3df62e26b217");
            }
            if (dynamic == null) {
                writableMap.putNull(str);
                return writableMap;
            }
            ReadableType readableType = ReadableType.Null;
            try {
                readableType = dynamic.getType();
            } catch (Exception unused) {
            }
            switch (AnonymousClass3.a[readableType.ordinal()]) {
                case 1:
                    writableMap.putString(str, dynamic.asString());
                    break;
                case 2:
                    writableMap.putMap(str, dynamic.asMap());
                    break;
                case 3:
                    writableMap.putArray(str, dynamic.asArray());
                    break;
                case 4:
                    writableMap.putBoolean(str, dynamic.asBoolean());
                    break;
                case 5:
                    if (dynamic.asDouble() == dynamic.asInt()) {
                        writableMap.putInt(str, dynamic.asInt());
                        break;
                    } else {
                        writableMap.putDouble(str, dynamic.asDouble());
                        break;
                    }
                case 6:
                    writableMap.putNull(str);
                    break;
            }
            return writableMap;
        }
    };
    public static final a<WritableArray, Integer> c = new a<WritableArray, Integer>() { // from class: com.meituan.android.mrn.component.list.turbo.d.2
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.meituan.android.mrn.component.list.turbo.d.a
        public WritableArray a(WritableArray writableArray, Integer num, Dynamic dynamic) {
            Object[] objArr = {writableArray, num, dynamic};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32f9997d0db90bf3cb3e1e21b908d638", RobustBitConfig.DEFAULT_VALUE)) {
                return (WritableArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32f9997d0db90bf3cb3e1e21b908d638");
            }
            ArrayList<Object> arrayList = writableArray.toArrayList();
            if (dynamic == null) {
                arrayList.remove(num);
                return JavaOnlyArray.from(arrayList);
            }
            ReadableType readableType = ReadableType.Null;
            try {
                readableType = dynamic.getType();
            } catch (Exception unused) {
            }
            switch (AnonymousClass3.a[readableType.ordinal()]) {
                case 1:
                    arrayList.set(num.intValue(), dynamic.asString());
                    break;
                case 2:
                    arrayList.set(num.intValue(), dynamic.asMap());
                    break;
                case 3:
                    arrayList.set(num.intValue(), dynamic.asArray());
                    break;
                case 4:
                    arrayList.set(num.intValue(), Boolean.valueOf(dynamic.asBoolean()));
                    break;
                case 5:
                    if (dynamic.asDouble() == dynamic.asInt()) {
                        arrayList.set(num.intValue(), Integer.valueOf(dynamic.asInt()));
                        break;
                    } else {
                        arrayList.set(num.intValue(), Double.valueOf(dynamic.asDouble()));
                        break;
                    }
                case 6:
                    arrayList.remove(num);
                    break;
            }
            return JavaOnlyArray.from(arrayList);
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a<T, K> {
        T a(T t, K k, Dynamic dynamic);
    }

    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Nullable
    public static TurboNode a(@NonNull com.meituan.android.mrn.component.list.turbo.a aVar, @NonNull TurboNode turboNode, TurboNode turboNode2) {
        JavaOnlyMap javaOnlyMap;
        boolean z;
        ?? r10;
        ArrayList<TurboNode> arrayList;
        Object[] objArr = {aVar, turboNode, turboNode2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96ab26e7d345a644207fee69cdab9ea7", RobustBitConfig.DEFAULT_VALUE)) {
            return (TurboNode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96ab26e7d345a644207fee69cdab9ea7");
        }
        if (turboNode.rawProps != null) {
            JavaOnlyMap deepClone = JavaOnlyMap.deepClone(turboNode.rawProps);
            a(aVar, deepClone, turboNode.rawProps);
            javaOnlyMap = deepClone;
        } else {
            javaOnlyMap = turboNode.mProps;
        }
        boolean equals = MListExpressionManager.COMPONENT_NAME.equals(turboNode.mModuleName);
        boolean z2 = javaOnlyMap != null;
        boolean z3 = equals && z2 && javaOnlyMap.hasKey("lfor");
        boolean z4 = equals && !z3;
        if (equals) {
            if (!z2) {
                return null;
            }
            if (javaOnlyMap.hasKey("lif") && !MListExpressionManager.converseDynamicToBoolean(javaOnlyMap.getDynamic("lif"))) {
                return null;
            }
            if (javaOnlyMap.hasKey("lnotif") && MListExpressionManager.converseDynamicToBoolean(javaOnlyMap.getDynamic("lnotif"))) {
                return null;
            }
        }
        TurboNode turboNode3 = new TurboNode(turboNode);
        if (turboNode3.mReactTag == -1) {
            turboNode3.mReactTag = com.meituan.android.mrn.component.list.common.b.a();
        }
        turboNode3.mParentNode = turboNode2;
        turboNode3.mProps = javaOnlyMap;
        if (turboNode3.rawProps == null || z4) {
            z = z3;
            r10 = 0;
        } else {
            Object[] objArr2 = {turboNode3};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.component.list.turbo.a.a;
            z = z3;
            r10 = 0;
            r10 = 0;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f714da6eb655e840eb31f979f3706b12", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f714da6eb655e840eb31f979f3706b12");
            } else {
                aVar.d.add(turboNode3);
            }
        }
        if (turboNode.mChildren != null && turboNode.mChildren.size() > 0) {
            turboNode3.mChildren = new ArrayList<>();
            Iterator<TurboNode> it = turboNode.mChildren.iterator();
            while (it.hasNext()) {
                a(aVar, it.next(), turboNode3);
            }
        }
        if (z4) {
            arrayList = turboNode3.mChildren;
        } else {
            arrayList = new ArrayList<>();
            arrayList.add(turboNode3);
        }
        if (turboNode2 != null) {
            Iterator<TurboNode> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                TurboNode next = it2.next();
                turboNode2.mChildren.add(next);
                next.mParentNode = turboNode2;
                next.mParentTag = turboNode2.mReactTag;
            }
            if (z) {
                Object[] objArr3 = new Object[1];
                objArr3[r10] = turboNode2;
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.mrn.component.list.turbo.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "7feba80cbf25c1057e9b7baf2aa3b1d8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, r10, "7feba80cbf25c1057e9b7baf2aa3b1d8");
                    return turboNode3;
                }
                aVar.c.add(turboNode2);
                return turboNode3;
            }
            return turboNode3;
        } else if (arrayList.size() != 1) {
            throw new RuntimeException("ElementIf分支语义节点的子节点个数超过一个，且作为树根节点或者ElementMap直接子节点，请增加一个View节点兼容");
        } else {
            TurboNode turboNode4 = arrayList.get(r10);
            turboNode4.dynamicNodes = aVar.d;
            turboNode4.forContainers = new ArrayList(aVar.c);
            return turboNode4;
        }
    }

    public static void a(com.meituan.android.mrn.component.list.turbo.a aVar, TurboNode turboNode, j jVar) {
        Object[] objArr = {aVar, turboNode, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab1e9ef918ddd8f568fe42544ec1d2c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab1e9ef918ddd8f568fe42544ec1d2c2");
            return;
        }
        List<TurboNode> list = turboNode.dynamicNodes;
        if (list != null) {
            for (TurboNode turboNode2 : list) {
                if (!(turboNode2.mProps instanceof WritableMap)) {
                    turboNode2.mProps = JavaOnlyMap.deepClone(turboNode2.rawProps);
                }
                a(aVar, (WritableMap) turboNode2.mProps, turboNode2.rawProps);
                jVar.a(turboNode2);
            }
        }
        List<TurboNode> list2 = turboNode.forContainers;
        if (list2 != null) {
            for (TurboNode turboNode3 : list2) {
                ArrayList<TurboNode> arrayList = turboNode3.mChildren;
                if (arrayList != null) {
                    for (TurboNode turboNode4 : arrayList) {
                        if ((MListExpressionManager.COMPONENT_NAME.equals(turboNode4.mModuleName) && turboNode4.mProps.hasKey("lfor")) && turboNode4.rawProps != null) {
                            if (!(turboNode4.mProps instanceof WritableMap)) {
                                turboNode4.mProps = JavaOnlyMap.deepClone(turboNode4.rawProps);
                            }
                            a(aVar, (WritableMap) turboNode4.mProps, turboNode4.rawProps);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v7 */
    public static void a(com.meituan.android.mrn.component.list.turbo.a aVar, TurboNode turboNode) {
        ArrayList<TurboNode> arrayList;
        TurboNode turboNode2;
        TurboNode turboNode3;
        com.meituan.android.mrn.component.list.turbo.a aVar2;
        int i;
        HashMap hashMap;
        String str;
        String str2;
        ReadableArray readableArray;
        TurboNode turboNode4;
        ArrayList<TurboNode> arrayList2;
        TurboNode turboNode5;
        TurboNode turboNode6;
        com.meituan.android.mrn.component.list.turbo.a aVar3;
        TurboNode turboNode7;
        com.meituan.android.mrn.component.list.turbo.a aVar4;
        TurboNode turboNode8;
        TurboNode pollFirst;
        j kVar;
        com.meituan.android.mrn.component.list.turbo.a aVar5 = aVar;
        int i2 = 2;
        char c2 = 0;
        boolean z = true;
        Object[] objArr = {aVar5, turboNode};
        ChangeQuickRedirect changeQuickRedirect = a;
        TurboNode turboNode9 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3134176116a8fa7db3f48f9f083a9928", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3134176116a8fa7db3f48f9f083a9928");
            return;
        }
        List<TurboNode> list = turboNode.forContainers;
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<TurboNode> it = list.iterator();
        while (it.hasNext()) {
            TurboNode next = it.next();
            ArrayList<TurboNode> arrayList3 = next.mChildren;
            if (arrayList3 != null && arrayList3.size() != 0) {
                int i3 = 0;
                z = z;
                while (i3 < arrayList3.size()) {
                    TurboNode turboNode10 = arrayList3.get(i3);
                    if (MListExpressionManager.COMPONENT_NAME.equals(turboNode10.mModuleName) && turboNode10.mProps.hasKey("lfor")) {
                        ReadableArray array = turboNode10.mProps.getArray("lfor");
                        String string = turboNode10.mProps.getString("item");
                        String string2 = turboNode10.mProps.getString("index");
                        HashMap hashMap2 = new HashMap();
                        arrayList3.remove(i3);
                        int i4 = i3 - 1;
                        int i5 = 0;
                        ?? r15 = z;
                        while (i5 < array.size()) {
                            hashMap2.put(string, array.getDynamic(i5));
                            hashMap2.put(string2, new DynamicFromObject(Double.valueOf(i5)));
                            Object[] objArr2 = new Object[i2];
                            objArr2[c2] = aVar5;
                            objArr2[r15] = hashMap2;
                            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.component.list.turbo.a.a;
                            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6ddb874b02d3c53fd062201095d60991", RobustBitConfig.DEFAULT_VALUE)) {
                                i = i5;
                                hashMap = hashMap2;
                                str = string2;
                                str2 = string;
                                readableArray = array;
                                turboNode4 = turboNode10;
                                arrayList2 = arrayList3;
                                turboNode5 = next;
                                turboNode6 = turboNode9;
                                aVar3 = (com.meituan.android.mrn.component.list.turbo.a) PatchProxy.accessDispatch(objArr2, turboNode9, changeQuickRedirect2, r15, "6ddb874b02d3c53fd062201095d60991");
                            } else {
                                n nVar = aVar5.b;
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList4 = new ArrayList();
                                l lVar = aVar5.e;
                                ao aoVar = aVar5.f;
                                Map<String, TurboNode> map = aVar5.g;
                                i iVar = aVar5.h;
                                com.meituan.android.mrn.component.list.event.f fVar = aVar5.j;
                                o oVar = aVar5.i;
                                i = i5;
                                hashMap = hashMap2;
                                str = string2;
                                str2 = string;
                                readableArray = array;
                                turboNode4 = turboNode10;
                                arrayList2 = arrayList3;
                                turboNode5 = next;
                                turboNode6 = null;
                                aVar3 = new com.meituan.android.mrn.component.list.turbo.a(aVar, hashMap2, nVar, hashSet, arrayList4, lVar, aoVar, map, iVar, fVar, oVar);
                            }
                            String str3 = turboNode4.mTemplateId;
                            Object[] objArr3 = {str3};
                            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.mrn.component.list.turbo.a.a;
                            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "1279fb6f3717090e0e18689743834de3", RobustBitConfig.DEFAULT_VALUE)) {
                                turboNode7 = turboNode4;
                                aVar4 = aVar;
                                turboNode8 = (TurboNode) PatchProxy.accessDispatch(objArr3, aVar4, changeQuickRedirect3, false, "1279fb6f3717090e0e18689743834de3");
                            } else {
                                turboNode7 = turboNode4;
                                aVar4 = aVar;
                                turboNode8 = aVar4.g.get(str3);
                            }
                            int a2 = aVar3.i.a(aVar3, turboNode8);
                            i iVar2 = aVar3.h;
                            Object[] objArr4 = {Integer.valueOf(a2)};
                            ChangeQuickRedirect changeQuickRedirect4 = i.a;
                            if (PatchProxy.isSupport(objArr4, iVar2, changeQuickRedirect4, false, "d9b6052972381578fd9b99287558759f", RobustBitConfig.DEFAULT_VALUE)) {
                                pollFirst = (TurboNode) PatchProxy.accessDispatch(objArr4, iVar2, changeQuickRedirect4, false, "d9b6052972381578fd9b99287558759f");
                            } else {
                                LinkedList<TurboNode> linkedList = iVar2.b.get(a2);
                                pollFirst = (linkedList == null || linkedList.size() == 0) ? turboNode6 : linkedList.pollFirst();
                            }
                            if (pollFirst != null) {
                                j jVar = pollFirst.helper;
                                a(aVar3, pollFirst, jVar);
                                kVar = jVar;
                            } else {
                                kVar = new k(aVar4.f, aVar4.e, aVar4.j);
                                pollFirst = a(aVar3, turboNode8, turboNode6);
                                if (pollFirst == null) {
                                    throw new NullPointerException("bindFromDsl result null");
                                }
                                pollFirst.helper = kVar;
                                pollFirst.viewType = a2;
                                kVar.a(pollFirst, false);
                            }
                            a(aVar3, pollFirst);
                            pollFirst.forParent = turboNode7;
                            pollFirst.mParentNode = turboNode5;
                            pollFirst.mParentTag = turboNode5.mReactTag;
                            int i6 = i4 + 1;
                            kVar.a(turboNode5, pollFirst, i6);
                            turboNode10 = turboNode7;
                            aVar5 = aVar4;
                            i4 = i6;
                            i5 = i + 1;
                            next = turboNode5;
                            turboNode9 = turboNode6;
                            string2 = str;
                            string = str2;
                            arrayList3 = arrayList2;
                            array = readableArray;
                            hashMap2 = hashMap;
                            i2 = 2;
                            c2 = 0;
                            r15 = 1;
                        }
                        arrayList = arrayList3;
                        turboNode2 = next;
                        turboNode3 = turboNode9;
                        aVar2 = aVar5;
                        i3 = i4;
                    } else {
                        arrayList = arrayList3;
                        turboNode2 = next;
                        turboNode3 = turboNode9;
                        aVar2 = aVar5;
                    }
                    i3++;
                    aVar5 = aVar2;
                    next = turboNode2;
                    turboNode9 = turboNode3;
                    arrayList3 = arrayList;
                    i2 = 2;
                    c2 = 0;
                    z = true;
                }
                continue;
            }
            c2 = 0;
            z = z;
        }
    }

    public static void a(TurboNode turboNode, i iVar) {
        int i;
        char c2 = 0;
        int i2 = 1;
        Object[] objArr = {turboNode, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        TurboNode turboNode2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "614a087b4f7fe3119a9fd24f94ec11f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "614a087b4f7fe3119a9fd24f94ec11f1");
            return;
        }
        List<TurboNode> list = turboNode.forContainers;
        if (list == null || list.size() == 0) {
            return;
        }
        for (TurboNode turboNode3 : list) {
            ArrayList<TurboNode> arrayList = turboNode3.mChildren;
            if (arrayList != null && arrayList.size() != 0) {
                TurboNode turboNode4 = turboNode2;
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    TurboNode turboNode5 = arrayList.get(i3);
                    if (turboNode5.forParent != null) {
                        a(turboNode5, iVar);
                        turboNode5.helper.a(turboNode3, turboNode5);
                        i = i3 - 1;
                        Object[] objArr2 = new Object[i2];
                        objArr2[c2] = turboNode5;
                        ChangeQuickRedirect changeQuickRedirect2 = i.a;
                        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "55108f1e45e50162e78cb11ebe83d8d5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "55108f1e45e50162e78cb11ebe83d8d5");
                        } else {
                            int i4 = turboNode5.viewType;
                            LinkedList<TurboNode> linkedList = iVar.b.get(i4);
                            if (linkedList == null) {
                                linkedList = new LinkedList<>();
                                iVar.b.put(i4, linkedList);
                            }
                            if (linkedList.size() < iVar.c) {
                                linkedList.addLast(turboNode5);
                            }
                        }
                        turboNode5.mParentTag = -1;
                        turboNode5.mParentNode = null;
                    } else {
                        i = i3;
                    }
                    if (turboNode4 == null) {
                        turboNode4 = turboNode5.forParent;
                    }
                    if (turboNode5.forParent != turboNode4) {
                        i++;
                        arrayList.add(i, turboNode4);
                        turboNode4.mParentNode = turboNode3;
                        turboNode4.mParentTag = turboNode3.mReactTag;
                        turboNode4 = turboNode5.forParent;
                    }
                    turboNode5.forParent = null;
                    turboNode2 = null;
                    i3 = i + 1;
                    i2 = 1;
                    c2 = 0;
                }
                TurboNode turboNode6 = turboNode2;
                if (turboNode4 != null) {
                    arrayList.add(turboNode4);
                }
                turboNode2 = turboNode6;
                i2 = 1;
                c2 = 0;
            }
        }
    }

    private static void a(@NonNull com.meituan.android.mrn.component.list.turbo.a aVar, @NonNull WritableMap writableMap, @NonNull ReadableMap readableMap) {
        Object[] objArr = {aVar, writableMap, readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea910f75e7176ee0bf9a8805ebeff0b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea910f75e7176ee0bf9a8805ebeff0b3");
            return;
        }
        Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
        while (entryIterator.hasNext()) {
            String key = entryIterator.next().getKey();
            switch (readableMap.getType(key)) {
                case String:
                    writableMap = (WritableMap) a(aVar, readableMap.getString(key), b, writableMap, key);
                    break;
                case Map:
                    a(aVar, (WritableMap) writableMap.getMap(key), readableMap.getMap(key));
                    break;
                case Array:
                    WritableArray writableArray = (WritableArray) writableMap.getArray(key);
                    WritableArray a2 = a(aVar, writableArray, readableMap.getArray(key));
                    if (writableArray == a2) {
                        break;
                    } else {
                        writableMap.putArray(key, (ReadableArray) a2);
                        break;
                    }
            }
        }
    }

    public static Dynamic a(@NonNull com.meituan.android.mrn.component.list.turbo.a aVar, @NonNull String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9e8169cbcd5af6cc0bf2bce7c6faf10", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dynamic) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9e8169cbcd5af6cc0bf2bce7c6faf10");
        }
        String substring = str.substring(2);
        String substring2 = substring.substring(0, substring.length() - 2);
        String[] split = substring2.split("\\.");
        String str2 = split[0];
        return aVar.a(str2, split.length > 1 ? substring2.substring(str2.length()) : null);
    }

    private static WritableArray a(com.meituan.android.mrn.component.list.turbo.a aVar, WritableArray writableArray, ReadableArray readableArray) {
        Object[] objArr = {aVar, writableArray, readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "055ba8a56ca127369118cefc98b64de5", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "055ba8a56ca127369118cefc98b64de5");
        }
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            switch (readableArray.getType(i)) {
                case String:
                    writableArray = (WritableArray) a(aVar, readableArray.getString(i), c, writableArray, Integer.valueOf(i));
                    break;
                case Map:
                    a(aVar, (WritableMap) writableArray.getMap(i), readableArray.getMap(i));
                    break;
                case Array:
                    WritableArray writableArray2 = (WritableArray) writableArray.getMap(i);
                    WritableArray a2 = a(aVar, writableArray2, readableArray.getArray(i));
                    if (writableArray2 != a2) {
                        ArrayList<Object> arrayList = writableArray.toArrayList();
                        arrayList.set(i, a2);
                        writableArray = JavaOnlyArray.from(arrayList);
                        break;
                    } else {
                        break;
                    }
            }
        }
        return writableArray;
    }

    private static <T, K> T a(@NonNull com.meituan.android.mrn.component.list.turbo.a aVar, @NonNull String str, @NonNull a<T, K> aVar2, @NonNull T t, @NonNull K k) {
        String str2 = str;
        Object[] objArr = {aVar, str2, aVar2, t, k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21c6ce4c56de2fedf1638d6bd336085e", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21c6ce4c56de2fedf1638d6bd336085e");
        }
        Matcher matcher = g.b.matcher(str2);
        if (matcher.matches()) {
            return aVar2.a(t, k, a(aVar, str));
        }
        boolean z = false;
        while (matcher.find()) {
            String group = matcher.group();
            str2 = str2.replace(group, String.valueOf(n.a(a(aVar, group))));
            z = true;
        }
        return z ? aVar2.a(t, k, new DynamicFromObject(str2)) : t;
    }
}
