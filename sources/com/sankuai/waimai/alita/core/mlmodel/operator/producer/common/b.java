package com.sankuai.waimai.alita.core.mlmodel.operator.producer.common;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.mlmodel.operator.d;
import com.sankuai.waimai.alita.core.mlmodel.operator.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements f {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        OPERATOR_UNKNOWN,
        min_max,
        min_max_array,
        standard_scaler,
        standard_scaler_array,
        na_filler,
        na_filler_array,
        add,
        add_array,
        multiply,
        multiply_array,
        divide,
        divide_array,
        sum,
        oneHotEncoder,
        map,
        map_array,
        discretize,
        discretize_array,
        mask_array,
        discretize_custom_array;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f9d1c68672995507011a1d1b9d32594", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f9d1c68672995507011a1d1b9d32594");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "577c5f0433778e6d566d81a8e53ca323", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "577c5f0433778e6d566d81a8e53ca323") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f0adc06e064f2a04c5e1a51290fec2d", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f0adc06e064f2a04c5e1a51290fec2d") : (a[]) values().clone();
        }
    }

    @Override // com.sankuai.waimai.alita.core.mlmodel.operator.f
    @Nullable
    public final List<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aa1907089bd08af4fae1026eaafe133", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aa1907089bd08af4fae1026eaafe133");
        }
        ArrayList arrayList = new ArrayList();
        for (a aVar : a.valuesCustom()) {
            arrayList.add(aVar.name());
        }
        return arrayList;
    }

    @Override // com.sankuai.waimai.alita.core.mlmodel.operator.f
    public final void a(@NonNull Object obj, @NonNull com.sankuai.waimai.alita.core.mlmodel.operator.a aVar, @Nullable d dVar) {
        Object[] objArr = {obj, aVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c33ff75977771151c4188d5a618ade86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c33ff75977771151c4188d5a618ade86");
            return;
        }
        String str = aVar.c;
        ArrayList<Object> arrayList = aVar.d;
        if (!TextUtils.isEmpty(str)) {
            a aVar2 = a.OPERATOR_UNKNOWN;
            try {
                aVar2 = a.valueOf(str);
            } catch (Exception unused) {
            }
            JSONObject jSONObject = null;
            switch (aVar2) {
                case OPERATOR_UNKNOWN:
                    return;
                case min_max:
                    Object[] objArr2 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "517db5ed3becba01fc99601f61946545", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "517db5ed3becba01fc99601f61946545");
                        return;
                    } else if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, Number.class, arrayList, 2, Number.class) && arrayList != null) {
                        Double valueOf = Double.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.a(((Number) obj).doubleValue(), ((Number) arrayList.get(0)).doubleValue(), ((Number) arrayList.get(1)).doubleValue()));
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(valueOf);
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, arrayList2);
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case min_max_array:
                    Object[] objArr3 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f1068cbb75a9d876d56229523886e624", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f1068cbb75a9d876d56229523886e624");
                        return;
                    }
                    boolean a2 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, arrayList, 2, Number.class);
                    boolean a3 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, Number.class);
                    if (a2 && a3 && arrayList != null) {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.a((List) obj, ((Number) arrayList.get(0)).doubleValue(), ((Number) arrayList.get(1)).doubleValue()));
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case standard_scaler:
                    Object[] objArr4 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "01c259e1928cfe2cf47a2d3f6cb92de4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "01c259e1928cfe2cf47a2d3f6cb92de4");
                        return;
                    } else if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, Number.class, arrayList, 2, Number.class) && arrayList != null) {
                        Double valueOf2 = Double.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.b(((Number) obj).doubleValue(), ((Number) arrayList.get(0)).doubleValue(), ((Number) arrayList.get(1)).doubleValue()));
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(valueOf2);
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, arrayList3);
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case standard_scaler_array:
                    Object[] objArr5 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ee6383032081f1b8593e0b46fb074820", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ee6383032081f1b8593e0b46fb074820");
                        return;
                    }
                    boolean a4 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, arrayList, 2, Number.class);
                    boolean a5 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, Number.class);
                    if (a4 && a5 && arrayList != null) {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.b((List) obj, ((Number) arrayList.get(0)).doubleValue(), ((Number) arrayList.get(1)).doubleValue()));
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case na_filler:
                    Object[] objArr6 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "0c7bfec60dfa2eced69066bcb6640b62", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "0c7bfec60dfa2eced69066bcb6640b62");
                        return;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    HashSet hashSet = new HashSet();
                    hashSet.add(null);
                    hashSet.add(Number.class);
                    hashSet.add(String.class);
                    hashSet.add(List.class);
                    HashSet hashSet2 = new HashSet();
                    hashSet2.add(Number.class);
                    hashSet2.add(String.class);
                    if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, hashSet, arrayList, 1, hashSet2)) {
                        arrayList4.add(com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.a(obj, arrayList.get(0)));
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, arrayList4);
                        return;
                    }
                    com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                    return;
                case na_filler_array:
                    a(obj, arrayList, dVar);
                    return;
                case add:
                    Object[] objArr7 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "180eabce0c2da21e4bf180f461350f0a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "180eabce0c2da21e4bf180f461350f0a");
                        return;
                    } else if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, Number.class, arrayList, 1, Number.class) && arrayList != null) {
                        Double valueOf3 = Double.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.a(((Number) obj).doubleValue(), ((Number) arrayList.get(0)).doubleValue()));
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(valueOf3);
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, arrayList5);
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case add_array:
                    Object[] objArr8 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "98bcd6fae7a3877b2753f62d7a2f581c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "98bcd6fae7a3877b2753f62d7a2f581c");
                        return;
                    }
                    boolean a6 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, arrayList, 1, Number.class);
                    boolean a7 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, Number.class);
                    if (a6 && a7 && arrayList != null) {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.a((List) obj, ((Number) arrayList.get(0)).doubleValue()));
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case multiply:
                    Object[] objArr9 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "041ee1ecd786eb2dc6bc273a3650090d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "041ee1ecd786eb2dc6bc273a3650090d");
                        return;
                    } else if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, Number.class, arrayList, 1, Number.class) && arrayList != null) {
                        Double valueOf4 = Double.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.b(((Number) obj).doubleValue(), ((Number) arrayList.get(0)).doubleValue()));
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(valueOf4);
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, arrayList6);
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case multiply_array:
                    Object[] objArr10 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "49befe724039a4261496f803a4a67c97", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "49befe724039a4261496f803a4a67c97");
                        return;
                    }
                    boolean a8 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, arrayList, 1, Number.class);
                    boolean a9 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, Number.class);
                    if (a8 && a9 && arrayList != null) {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.b((List) obj, ((Number) arrayList.get(0)).doubleValue()));
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case divide:
                    Object[] objArr11 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect11 = a;
                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "2b0b9b055195c93d71e2bde98dbc4311", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "2b0b9b055195c93d71e2bde98dbc4311");
                        return;
                    } else if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, Number.class, arrayList, 1, Number.class) && arrayList != null) {
                        Double valueOf5 = Double.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.c(((Number) obj).doubleValue(), ((Number) arrayList.get(0)).doubleValue()));
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(valueOf5);
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, arrayList7);
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case divide_array:
                    Object[] objArr12 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect12 = a;
                    if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "da168ebcbf1a9372f08bb514aa6cdaae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "da168ebcbf1a9372f08bb514aa6cdaae");
                        return;
                    }
                    boolean a10 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, arrayList, 1, Number.class);
                    boolean a11 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, Number.class);
                    if (a10 && a11 && arrayList != null) {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.c((List) obj, ((Number) arrayList.get(0)).doubleValue()));
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case sum:
                    Object[] objArr13 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect13 = a;
                    if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "0a6b7675627569f59147fd9c7b5f94a8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "0a6b7675627569f59147fd9c7b5f94a8");
                        return;
                    } else if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, arrayList, 0, Number.class) && arrayList != null) {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.a((List) obj));
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case oneHotEncoder:
                    Object[] objArr14 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect14 = a;
                    if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "8fd68e10e8e8dcae418b4c912a1a573d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "8fd68e10e8e8dcae418b4c912a1a573d");
                        return;
                    } else if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, Number.class, arrayList, 1, Number.class) && arrayList != null) {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.d(((Number) obj).doubleValue(), ((Number) arrayList.get(0)).doubleValue()));
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case map:
                    Object[] objArr15 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect15 = a;
                    if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "fd06a984ff9bdee2097248ee1ee21685", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "fd06a984ff9bdee2097248ee1ee21685");
                        return;
                    }
                    HashSet hashSet3 = new HashSet();
                    hashSet3.add(null);
                    hashSet3.add(Number.class);
                    hashSet3.add(String.class);
                    HashSet hashSet4 = new HashSet();
                    hashSet4.add(Map.class);
                    hashSet4.add(JSONObject.class);
                    hashSet4.add(String.class);
                    boolean a12 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, hashSet3, arrayList, 1, hashSet4);
                    if (a12 && arrayList != null) {
                        Object valueOf6 = obj instanceof Number ? String.valueOf(obj) : obj;
                        Object obj2 = arrayList.get(0);
                        if (obj2 instanceof JSONObject) {
                            jSONObject = (JSONObject) obj2;
                        } else if (obj2 instanceof Map) {
                            jSONObject = new JSONObject((Map) obj2);
                        } else if (obj2 instanceof String) {
                            try {
                                JSONObject jSONObject2 = new JSONObject((String) obj2);
                                try {
                                    arrayList.remove(0);
                                    arrayList.add(jSONObject2);
                                } catch (JSONException unused2) {
                                }
                                jSONObject = jSONObject2;
                            } catch (JSONException unused3) {
                            }
                        }
                        if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(jSONObject, JSONObject.class, String.class, Number.class)) {
                            Double valueOf7 = Double.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.a((String) valueOf6, (JSONObject) arrayList.get(0)));
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.add(valueOf7);
                            com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, arrayList8);
                            return;
                        }
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("paramMap is not valid"));
                        return;
                    }
                    com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid " + a12));
                    return;
                case map_array:
                    b(obj, arrayList, dVar);
                    return;
                case discretize:
                    Object[] objArr16 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect16 = a;
                    if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "2eaa6afc2c4fcca415f9ac981ab31fa8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "2eaa6afc2c4fcca415f9ac981ab31fa8");
                        return;
                    } else if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, Number.class, arrayList, -1, Number.class) && arrayList != null) {
                        Integer valueOf8 = Integer.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.a((Number) Double.valueOf(((Number) obj).doubleValue()), (List<Number>) arrayList));
                        ArrayList arrayList9 = new ArrayList();
                        arrayList9.add(valueOf8);
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, arrayList9);
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case discretize_array:
                    Object[] objArr17 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect17 = a;
                    if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "cea66d132e443fab2c975e929cea9b9b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "cea66d132e443fab2c975e929cea9b9b");
                        return;
                    }
                    boolean a13 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, arrayList, -1, Number.class);
                    boolean a14 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, Number.class);
                    if (a13 && a14 && arrayList != null) {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.a((List<Number>) obj, (List<Number>) arrayList));
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case mask_array:
                    Object[] objArr18 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect18 = a;
                    if (PatchProxy.isSupport(objArr18, this, changeQuickRedirect18, false, "01fc711aedc889864bd5530f684a30ca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr18, this, changeQuickRedirect18, false, "01fc711aedc889864bd5530f684a30ca");
                        return;
                    } else if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, arrayList, 1, Number.class) && arrayList != null) {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.a((List<Object>) obj, ((Number) arrayList.get(0)).intValue()));
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case discretize_custom_array:
                    Object[] objArr19 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect19 = a;
                    if (PatchProxy.isSupport(objArr19, this, changeQuickRedirect19, false, "cf81e5623c41dbee3a2f0a4034175e0b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr19, this, changeQuickRedirect19, false, "cf81e5623c41dbee3a2f0a4034175e0b");
                        return;
                    }
                    boolean a15 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, arrayList, -1, Number.class);
                    boolean a16 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, Number.class);
                    if (a15 && a16 && arrayList != null) {
                        if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(arrayList, List.class, Number.class)) {
                            com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.b((List) obj, arrayList));
                            return;
                        } else {
                            com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("paramArray is not valid"));
                            return;
                        }
                    }
                    com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid " + a15 + a16));
                    return;
                default:
                    com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.b(str, "operator name not found"));
                    return;
            }
        }
        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.b("operator name is empty"));
    }

    private void a(@Nullable Object obj, @Nullable List<Object> list, @Nullable d dVar) {
        boolean z = false;
        Object[] objArr = {obj, list, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb8895f235be5e5a5c0d47e0a196442f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb8895f235be5e5a5c0d47e0a196442f");
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        hashSet.add(Number.class);
        hashSet.add(String.class);
        if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, list, 1, hashSet)) {
            HashSet hashSet2 = new HashSet();
            hashSet2.add(null);
            hashSet2.add(Number.class);
            hashSet2.add(String.class);
            if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, hashSet2)) {
                Object obj2 = list.get(0);
                for (Object obj3 : (List) obj) {
                    arrayList.add(com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.a(obj3, obj2));
                }
                z = true;
            }
        }
        if (z) {
            com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, arrayList);
        } else {
            com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
        }
    }

    private void b(@NonNull Object obj, @Nullable List<Object> list, @Nullable d dVar) {
        Object[] objArr = {obj, list, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ca1143f6aa0afbaffc52693d08f474f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ca1143f6aa0afbaffc52693d08f474f");
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Number.class);
        hashSet.add(String.class);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(Map.class);
        hashSet2.add(JSONObject.class);
        hashSet2.add(String.class);
        boolean a2 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, list, 1, hashSet2);
        boolean a3 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, hashSet);
        if (a2 && a3 && list != null) {
            List list2 = (List) obj;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list2.get(i);
                if (obj2 instanceof Number) {
                    list2.set(i, String.valueOf(obj2));
                }
            }
            Object obj3 = list.get(0);
            JSONObject jSONObject = null;
            if (obj3 instanceof JSONObject) {
                jSONObject = (JSONObject) obj3;
            } else if (obj3 instanceof Map) {
                jSONObject = new JSONObject((Map) obj3);
            } else if (obj3 instanceof String) {
                try {
                    JSONObject jSONObject2 = new JSONObject((String) obj3);
                    try {
                        list.remove(0);
                        list.add(jSONObject2);
                    } catch (JSONException unused) {
                    }
                    jSONObject = jSONObject2;
                } catch (JSONException unused2) {
                }
            }
            if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(jSONObject, JSONObject.class, String.class, Number.class)) {
                com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.a.a((List<String>) list2, jSONObject));
                return;
            } else {
                com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("paramMap is not valid"));
                return;
            }
        }
        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
    }
}
