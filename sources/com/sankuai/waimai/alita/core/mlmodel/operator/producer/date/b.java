package com.sankuai.waimai.alita.core.mlmodel.operator.producer.date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.mlmodel.operator.d;
import com.sankuai.waimai.alita.core.mlmodel.operator.f;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements f {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    enum a {
        OPERATOR_UNKNOWN,
        date_encoder,
        year,
        year_array,
        month,
        month_array,
        day,
        day_array,
        hour,
        hour_array,
        minute,
        minute_array,
        second,
        second_array,
        weekday,
        weekday_array,
        past,
        past_array;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "776ba62278de8f048705ca06ea886847", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "776ba62278de8f048705ca06ea886847");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc8d031f9db400e8695caa5165eb4ffb", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc8d031f9db400e8695caa5165eb4ffb") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0190a71f0b063c03cfcef8592e0b85e", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0190a71f0b063c03cfcef8592e0b85e") : (a[]) values().clone();
        }
    }

    @Override // com.sankuai.waimai.alita.core.mlmodel.operator.f
    @Nullable
    public final List<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81f1635fdbf28d010e2a11b1083a61a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81f1635fdbf28d010e2a11b1083a61a1");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15baf9f2088d5bdc969ae285bfe0d33c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15baf9f2088d5bdc969ae285bfe0d33c");
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
            switch (aVar2) {
                case OPERATOR_UNKNOWN:
                    return;
                case date_encoder:
                    Object[] objArr2 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e37c43bbe5054e57ee108e0530fc0b9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e37c43bbe5054e57ee108e0530fc0b9");
                        return;
                    } else if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, Number.class, arrayList, 11, Number.class) && arrayList != null) {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.date.a.a(((Number) obj).doubleValue(), ((Number) arrayList.get(0)).doubleValue(), ((Number) arrayList.get(1)).doubleValue(), ((Number) arrayList.get(2)).doubleValue(), ((Number) arrayList.get(3)).doubleValue(), ((Number) arrayList.get(4)).doubleValue(), ((Number) arrayList.get(5)).doubleValue(), ((Number) arrayList.get(6)).doubleValue(), ((Number) arrayList.get(7)).doubleValue(), ((Number) arrayList.get(8)).doubleValue(), ((Number) arrayList.get(9)).doubleValue(), ((Number) arrayList.get(10)).doubleValue()));
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case year:
                    Object[] objArr3 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4ba6f952d62f23ff486c604fdfcb4222", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4ba6f952d62f23ff486c604fdfcb4222");
                        return;
                    } else if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, Number.class, arrayList, 0, Number.class) && arrayList != null) {
                        Double valueOf = Double.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.date.a.a(((Number) obj).doubleValue()));
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(valueOf);
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, arrayList2);
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case year_array:
                    Object[] objArr4 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6d373c9d6962942aa583efbb698023ae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6d373c9d6962942aa583efbb698023ae");
                        return;
                    }
                    boolean a2 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, arrayList, 0, Number.class);
                    boolean a3 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, Number.class);
                    if (a2 && a3 && arrayList != null) {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.date.a.a((List) obj));
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case month:
                    Object[] objArr5 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "78eed90c1e321a80fabd47d4a3a985ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "78eed90c1e321a80fabd47d4a3a985ba");
                        return;
                    } else if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, Number.class, arrayList, 0, Number.class) && arrayList != null) {
                        Double valueOf2 = Double.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.date.a.b(((Number) obj).doubleValue()));
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(valueOf2);
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, arrayList3);
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case month_array:
                    Object[] objArr6 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e0b108932c25d8439bf91d86c0916bad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e0b108932c25d8439bf91d86c0916bad");
                        return;
                    }
                    boolean a4 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, arrayList, 0, Number.class);
                    boolean a5 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, Number.class);
                    if (a4 && a5 && arrayList != null) {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.date.a.b((List) obj));
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case day:
                    Object[] objArr7 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "6d4333ee02af9817e85b5aa80f3c99c1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "6d4333ee02af9817e85b5aa80f3c99c1");
                        return;
                    } else if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, Number.class, arrayList, 0, Number.class) && arrayList != null) {
                        Double valueOf3 = Double.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.date.a.c(((Number) obj).doubleValue()));
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(valueOf3);
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, arrayList4);
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case day_array:
                    Object[] objArr8 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "fffd78029851885c4b824a91c368ad13", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "fffd78029851885c4b824a91c368ad13");
                        return;
                    }
                    boolean a6 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, arrayList, 0, Number.class);
                    boolean a7 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, Number.class);
                    if (a6 && a7 && arrayList != null) {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.date.a.c((List) obj));
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case hour:
                    Object[] objArr9 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "3d722a3be4c8906b2fe09e99fe7b8478", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "3d722a3be4c8906b2fe09e99fe7b8478");
                        return;
                    } else if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, Number.class, arrayList, 0, Number.class) && arrayList != null) {
                        Double valueOf4 = Double.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.date.a.d(((Number) obj).doubleValue()));
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(valueOf4);
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, arrayList5);
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case hour_array:
                    Object[] objArr10 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "1b3e0f85c241ddf9846f15af5eddb990", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "1b3e0f85c241ddf9846f15af5eddb990");
                        return;
                    }
                    boolean a8 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, arrayList, 0, Number.class);
                    boolean a9 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, Number.class);
                    if (a8 && a9 && arrayList != null) {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.date.a.d((List) obj));
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case minute:
                    Object[] objArr11 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect11 = a;
                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "12ffaa4fe5ab95db29f6b82928435d85", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "12ffaa4fe5ab95db29f6b82928435d85");
                        return;
                    } else if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, Number.class, arrayList, 0, Number.class) && arrayList != null) {
                        Double valueOf5 = Double.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.date.a.e(((Number) obj).doubleValue()));
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(valueOf5);
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, arrayList6);
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case minute_array:
                    Object[] objArr12 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect12 = a;
                    if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "92eaf4074b10a50574c14f3b85e4fa74", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "92eaf4074b10a50574c14f3b85e4fa74");
                        return;
                    }
                    boolean a10 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, arrayList, 0, Number.class);
                    boolean a11 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, Number.class);
                    if (a10 && a11 && arrayList != null) {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.date.a.e((List) obj));
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case second:
                    Object[] objArr13 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect13 = a;
                    if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "9de3d0b33e7f95c74ac2ae287310aff7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "9de3d0b33e7f95c74ac2ae287310aff7");
                        return;
                    } else if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, Number.class, arrayList, 0, Number.class) && arrayList != null) {
                        Double valueOf6 = Double.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.date.a.f(((Number) obj).doubleValue()));
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(valueOf6);
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, arrayList7);
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case second_array:
                    Object[] objArr14 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect14 = a;
                    if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "1f52209114fef40434baf702f7fc91ca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "1f52209114fef40434baf702f7fc91ca");
                        return;
                    }
                    boolean a12 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, arrayList, 0, Number.class);
                    boolean a13 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, Number.class);
                    if (a12 && a13 && arrayList != null) {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.date.a.f((List) obj));
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case weekday:
                    Object[] objArr15 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect15 = a;
                    if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "f834d71ac92df6f7925479b0935a9596", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "f834d71ac92df6f7925479b0935a9596");
                        return;
                    } else if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, Number.class, arrayList, 0, Number.class) && arrayList != null) {
                        Double valueOf7 = Double.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.date.a.g(((Number) obj).doubleValue()));
                        ArrayList arrayList8 = new ArrayList();
                        arrayList8.add(valueOf7);
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, arrayList8);
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case weekday_array:
                    Object[] objArr16 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect16 = a;
                    if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "950cc7ed3d9d4ac9b51dfb8c6534369e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "950cc7ed3d9d4ac9b51dfb8c6534369e");
                        return;
                    }
                    boolean a14 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, arrayList, 0, Number.class);
                    boolean a15 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, Number.class);
                    if (a14 && a15 && arrayList != null) {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.date.a.g((List) obj));
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case past:
                    Object[] objArr17 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect17 = a;
                    if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "8a70596818c4c85f20d05071308cbc47", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "8a70596818c4c85f20d05071308cbc47");
                        return;
                    } else if (com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, Number.class, arrayList, 0, Number.class) && arrayList != null) {
                        Double valueOf8 = Double.valueOf(com.sankuai.waimai.alita.core.mlmodel.operator.producer.date.a.h(((Number) obj).doubleValue()));
                        ArrayList arrayList9 = new ArrayList();
                        arrayList9.add(valueOf8);
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, arrayList9);
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                case past_array:
                    Object[] objArr18 = {obj, arrayList, dVar};
                    ChangeQuickRedirect changeQuickRedirect18 = a;
                    if (PatchProxy.isSupport(objArr18, this, changeQuickRedirect18, false, "2cd919470c317994dea04564a081c6e4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr18, this, changeQuickRedirect18, false, "2cd919470c317994dea04564a081c6e4");
                        return;
                    }
                    boolean a16 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, arrayList, -1, Number.class);
                    boolean a17 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(obj, List.class, Number.class);
                    if (a16 && a17 && arrayList != null) {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, com.sankuai.waimai.alita.core.mlmodel.operator.producer.date.a.h((List) obj));
                        return;
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.a("param is not valid"));
                        return;
                    }
                default:
                    com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.b(str, "operator name not found"));
                    return;
            }
        }
        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.b("operator name is empty"));
    }
}
