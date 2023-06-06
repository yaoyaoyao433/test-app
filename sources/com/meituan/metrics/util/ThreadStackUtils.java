package com.meituan.metrics.util;

import com.meituan.metrics.common.Constants;
import com.meituan.metrics.laggy.ThreadStackEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ThreadStackUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String resolveUnionStack(List<StackTraceElement[]> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "848e30e4961f5e04e927b5f1107e2a1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "848e30e4961f5e04e927b5f1107e2a1e");
        }
        StringBuilder sb = new StringBuilder();
        if (CollectionUtils.isEmpty(list)) {
            return sb.toString();
        }
        if (list.size() <= 2) {
            StackTraceElement[] stackTraceElementArr = list.get(0);
            int length = stackTraceElementArr.length;
            while (i < length) {
                StackTraceElement stackTraceElement = stackTraceElementArr[i];
                sb.append("at ");
                sb.append(stackTraceElement.toString());
                sb.append('\n');
                i++;
            }
            return sb.toString();
        }
        int i2 = 0;
        for (StackTraceElement[] stackTraceElementArr2 : list) {
            if (stackTraceElementArr2.length > i2) {
                i2 = stackTraceElementArr2.length;
            }
        }
        int size = list.size();
        for (int i3 = 1; i3 <= i2; i3++) {
            HashMap hashMap = new HashMap();
            for (int i4 = 0; i4 < size; i4++) {
                StackTraceElement[] stackTraceElementArr3 = list.get(i4);
                if (i3 <= stackTraceElementArr3.length) {
                    String stackTraceElement2 = stackTraceElementArr3[stackTraceElementArr3.length - i3].toString();
                    List list2 = (List) hashMap.get(stackTraceElement2);
                    if (list2 == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(i4));
                        hashMap.put(stackTraceElement2, arrayList);
                    } else {
                        list2.add(Integer.valueOf(i4));
                    }
                }
            }
            List<Integer> list3 = null;
            int i5 = 0;
            for (List<Integer> list4 : hashMap.values()) {
                int size2 = list4.size();
                if (size2 > i5 || list3 == null) {
                    list3 = list4;
                    i5 = size2;
                } else if (size2 == i5) {
                    list3 = getIndexList(i3, i2, list3, list4, list);
                }
            }
            if (!CollectionUtils.isEmpty(list3)) {
                ArrayList arrayList2 = new ArrayList(list3.size());
                StackTraceElement[] stackTraceElementArr4 = null;
                for (Integer num : list3) {
                    StackTraceElement[] stackTraceElementArr5 = list.get(num.intValue());
                    if (i3 < stackTraceElementArr5.length) {
                        arrayList2.add(stackTraceElementArr5);
                    } else {
                        stackTraceElementArr4 = stackTraceElementArr5;
                    }
                }
                if (arrayList2.size() >= list3.size() * 0.5f) {
                    size = arrayList2.size();
                    list = arrayList2;
                } else if (stackTraceElementArr4 != null) {
                    int length2 = stackTraceElementArr4.length;
                    while (i < length2) {
                        StackTraceElement stackTraceElement3 = stackTraceElementArr4[i];
                        sb.append("at ");
                        sb.append(stackTraceElement3.toString());
                        sb.append('\n');
                        i++;
                    }
                    return sb.toString();
                }
            }
        }
        if (!CollectionUtils.isEmpty(list)) {
            StackTraceElement[] stackTraceElementArr6 = list.get(0);
            int length3 = stackTraceElementArr6.length;
            while (i < length3) {
                StackTraceElement stackTraceElement4 = stackTraceElementArr6[i];
                sb.append("at ");
                sb.append(stackTraceElement4.toString());
                sb.append('\n');
                i++;
            }
        }
        return sb.toString();
    }

    private static List<Integer> getIndexList(int i, int i2, List<Integer> list, List<Integer> list2, List<StackTraceElement[]> list3) {
        boolean z;
        boolean z2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), list, list2, list3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6fe2dd6b2fcff0e7c4bb09d02d080c63", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6fe2dd6b2fcff0e7c4bb09d02d080c63");
        }
        int i3 = i + 1;
        int i4 = i3;
        int i5 = 0;
        while (true) {
            if (i4 > i2) {
                break;
            }
            int i6 = i5;
            String str = null;
            for (Integer num : list) {
                StackTraceElement[] stackTraceElementArr = list3.get(num.intValue());
                if (i4 <= stackTraceElementArr.length) {
                    String stackTraceElement = stackTraceElementArr[stackTraceElementArr.length - i4].toString();
                    if (str == null) {
                        str = stackTraceElement;
                    } else if (str.equals(stackTraceElement)) {
                        i6++;
                    }
                }
                z2 = true;
            }
            z2 = false;
            if (z2) {
                i5 = i6;
                break;
            }
            i4++;
            i5 = i6;
        }
        int i7 = 0;
        while (true) {
            if (i3 > i2) {
                break;
            }
            int i8 = i7;
            String str2 = null;
            for (Integer num2 : list2) {
                StackTraceElement[] stackTraceElementArr2 = list3.get(num2.intValue());
                if (i3 <= stackTraceElementArr2.length) {
                    String stackTraceElement2 = stackTraceElementArr2[stackTraceElementArr2.length - i3].toString();
                    if (str2 == null) {
                        str2 = stackTraceElement2;
                    } else if (str2.equals(stackTraceElement2)) {
                        i8++;
                    }
                }
                z = true;
            }
            z = false;
            if (z) {
                i7 = i8;
                break;
            }
            i3++;
            i7 = i8;
        }
        if (i5 > i7) {
            return list;
        }
        if (i5 < i7) {
            return list2;
        }
        int i9 = Integer.MAX_VALUE;
        int i10 = Integer.MAX_VALUE;
        for (Integer num3 : list) {
            if (num3.intValue() < i10) {
                i10 = num3.intValue();
            }
        }
        for (Integer num4 : list2) {
            if (num4.intValue() < i9) {
                i9 = num4.intValue();
            }
        }
        return i9 < i10 ? list2 : list;
    }

    public static String getAllStackTrace(List<ThreadStackEntity> list) {
        StackTraceElement[] stackTraceElementArr;
        int i = 1;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5f97e3a7998b03da1d5b2f01262eb182", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5f97e3a7998b03da1d5b2f01262eb182");
        }
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (ThreadStackEntity threadStackEntity : list) {
            sb.append("ThreadStack");
            int i2 = i + 1;
            sb.append(i);
            sb.append(Constants.SPACE);
            sb.append("ts: ");
            sb.append(threadStackEntity.ts);
            sb.append('\n');
            for (StackTraceElement stackTraceElement : threadStackEntity.stackTraceElements) {
                if (stackTraceElement != null) {
                    sb.append("at ");
                    sb.append(stackTraceElement.toString());
                    sb.append('\n');
                }
            }
            i = i2;
        }
        return sb.toString();
    }

    public static String getStack(StackTraceElement[] stackTraceElementArr) {
        Object[] objArr = {stackTraceElementArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "db235c3c8b1b03e267a818678779036b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "db235c3c8b1b03e267a818678779036b");
        }
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        return sb.toString();
    }
}
