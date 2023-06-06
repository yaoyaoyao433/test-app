package com.sankuai.waimai.bussiness.order.base.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.CautionInfo;
import com.sankuai.waimai.business.order.submit.model.FieldInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static ArrayList<com.sankuai.waimai.bussiness.order.confirm.remark.a> a(ArrayList<com.sankuai.waimai.bussiness.order.confirm.remark.a> arrayList, List<String> list, List<CautionInfo> list2) {
        ArrayList arrayList2;
        Object[] objArr = {arrayList, list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1a5fa8d66551ecbc9ebc7aa0d5e65df", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1a5fa8d66551ecbc9ebc7aa0d5e65df");
        }
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6d9aa2be506f851b11cd7a4206b7cd7d", RobustBitConfig.DEFAULT_VALUE)) {
            arrayList2 = (ArrayList) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6d9aa2be506f851b11cd7a4206b7cd7d");
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
                for (int i = 0; i < 7 && i < list.size(); i++) {
                    if (!TextUtils.isEmpty(list.get(i))) {
                        arrayList3.add(new com.sankuai.waimai.bussiness.order.confirm.remark.a("default:", 0L, list.get(i), false));
                    }
                }
            }
            arrayList2 = arrayList3;
        }
        ArrayList<com.sankuai.waimai.bussiness.order.confirm.remark.a> a2 = a(arrayList2, a(list2));
        if (arrayList != null && a2 != null) {
            Iterator<com.sankuai.waimai.bussiness.order.confirm.remark.a> it = arrayList.iterator();
            while (it.hasNext()) {
                com.sankuai.waimai.bussiness.order.confirm.remark.a next = it.next();
                if (next != null) {
                    Iterator<com.sankuai.waimai.bussiness.order.confirm.remark.a> it2 = a2.iterator();
                    while (it2.hasNext()) {
                        com.sankuai.waimai.bussiness.order.confirm.remark.a next2 = it2.next();
                        if (next2 != null && com.sankuai.waimai.bussiness.order.confirm.remark.a.a(next, next2)) {
                            next2.b = next.b;
                        }
                    }
                }
            }
        }
        return a2;
    }

    public static ArrayList<com.sankuai.waimai.bussiness.order.confirm.remark.a> a(ArrayList<com.sankuai.waimai.bussiness.order.confirm.remark.a> arrayList, FieldInfo fieldInfo, List<CautionInfo> list) {
        ArrayList arrayList2;
        String[] strArr;
        Object[] objArr = {arrayList, fieldInfo, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "642dd45c0f6c56ba77b0e6d9e7a0cbae", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "642dd45c0f6c56ba77b0e6d9e7a0cbae");
        }
        Object[] objArr2 = {fieldInfo};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "06f37b547051d8b8813b4aeee2973e15", RobustBitConfig.DEFAULT_VALUE)) {
            arrayList2 = (ArrayList) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "06f37b547051d8b8813b4aeee2973e15");
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (fieldInfo != null && (strArr = fieldInfo.defaultValues) != null && strArr.length > 0) {
                for (int i = 0; i < 7 && i < strArr.length; i++) {
                    if (!TextUtils.isEmpty(strArr[i])) {
                        arrayList3.add(new com.sankuai.waimai.bussiness.order.confirm.remark.a("default:", 0L, strArr[i], false));
                    }
                }
            }
            arrayList2 = arrayList3;
        }
        ArrayList<com.sankuai.waimai.bussiness.order.confirm.remark.a> a2 = a(arrayList2, a((List<CautionInfo>) null));
        if (arrayList != null && a2 != null) {
            Iterator<com.sankuai.waimai.bussiness.order.confirm.remark.a> it = arrayList.iterator();
            while (it.hasNext()) {
                com.sankuai.waimai.bussiness.order.confirm.remark.a next = it.next();
                if (next != null) {
                    Iterator<com.sankuai.waimai.bussiness.order.confirm.remark.a> it2 = a2.iterator();
                    while (it2.hasNext()) {
                        com.sankuai.waimai.bussiness.order.confirm.remark.a next2 = it2.next();
                        if (next2 != null && com.sankuai.waimai.bussiness.order.confirm.remark.a.a(next, next2)) {
                            next2.b = next.b;
                        }
                    }
                }
            }
        }
        return a2;
    }

    private static ArrayList<com.sankuai.waimai.bussiness.order.confirm.remark.a> a(ArrayList<com.sankuai.waimai.bussiness.order.confirm.remark.a> arrayList, ArrayList<com.sankuai.waimai.bussiness.order.confirm.remark.a> arrayList2) {
        Object[] objArr = {arrayList, arrayList2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7de0ff8ab5f0b31df354bf73cf9d170e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7de0ff8ab5f0b31df354bf73cf9d170e");
        }
        if ((arrayList == null || arrayList.size() == 0) && (arrayList2 == null || arrayList2.size() == 0)) {
            return null;
        }
        ArrayList<com.sankuai.waimai.bussiness.order.confirm.remark.a> arrayList3 = new ArrayList<>();
        if (arrayList == null || arrayList.size() == 0) {
            arrayList3.addAll(arrayList2);
            return arrayList3;
        } else if (arrayList2 == null || arrayList2.size() == 0) {
            arrayList3.addAll(arrayList);
            return arrayList3;
        } else {
            if (arrayList2.size() <= 2) {
                arrayList3.addAll(arrayList2);
                arrayList3.addAll(arrayList);
            } else {
                Iterator<com.sankuai.waimai.bussiness.order.confirm.remark.a> it = arrayList2.iterator();
                for (int i = 0; i < 2 && it.hasNext(); i++) {
                    arrayList3.add(it.next());
                }
                arrayList3.addAll(arrayList);
                while (it.hasNext()) {
                    arrayList3.add(it.next());
                }
            }
            return arrayList3;
        }
    }

    public static String a(FieldInfo fieldInfo) {
        if (fieldInfo != null) {
            return fieldInfo.detailHint;
        }
        return null;
    }

    public static String b(FieldInfo fieldInfo) {
        if (fieldInfo != null) {
            return fieldInfo.hint;
        }
        return null;
    }

    private static ArrayList<com.sankuai.waimai.bussiness.order.confirm.remark.a> a(List<CautionInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86986a9e87f714ac35b0ca1eaf53c606", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86986a9e87f714ac35b0ca1eaf53c606");
        }
        ArrayList<com.sankuai.waimai.bussiness.order.confirm.remark.a> arrayList = new ArrayList<>();
        if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
            for (int i = 0; i < 6 && i < list.size(); i++) {
                CautionInfo cautionInfo = list.get(i);
                if (cautionInfo != null && cautionInfo.getCautionId() > 0 && !TextUtils.isEmpty(cautionInfo.getCaution())) {
                    arrayList.add(new com.sankuai.waimai.bussiness.order.confirm.remark.a("caution:", cautionInfo.getCautionId(), cautionInfo.getCaution(), false));
                }
            }
        }
        return arrayList;
    }
}
