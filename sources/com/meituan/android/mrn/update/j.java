package com.meituan.android.mrn.update;

import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private static List<ResponseBundle> b;

    @WorkerThread
    public static synchronized void a(List<ResponseBundle> list) {
        List<String> list2;
        String[] split;
        synchronized (j.class) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b654a22a9fae3941ab6b77c68d0f2741", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b654a22a9fae3941ab6b77c68d0f2741");
                return;
            }
            if (list != null) {
                b = list;
            }
            List<ResponseBundle> list3 = b;
            Object[] objArr2 = {list3};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a305b48ff392b53d720c01ddc9d87c2e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a305b48ff392b53d720c01ddc9d87c2e");
                return;
            }
            if (list3 != null) {
                for (ResponseBundle responseBundle : list3) {
                    if (!TextUtils.isEmpty(responseBundle.tags)) {
                        String str = responseBundle.tags;
                        Object[] objArr3 = {str};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "fcb2382d45e78d20c11213bea2e3e1ab", RobustBitConfig.DEFAULT_VALUE)) {
                            list2 = (List) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "fcb2382d45e78d20c11213bea2e3e1ab");
                        } else {
                            ArrayList arrayList = new ArrayList();
                            if (!TextUtils.isEmpty(str)) {
                                for (String str2 : str.split(";")) {
                                    if (!TextUtils.isEmpty(str2)) {
                                        arrayList.add(str2);
                                    }
                                }
                            }
                            list2 = arrayList;
                        }
                        responseBundle.tagList = list2;
                    }
                }
            }
        }
    }

    public static synchronized List<ResponseBundle> b(List<String> list) {
        synchronized (j.class) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1528392ca98cfa8df4a2ba3236ebed34", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1528392ca98cfa8df4a2ba3236ebed34");
            }
            ArrayList arrayList = new ArrayList();
            if (b != null && b.size() > 0 && list != null && list.size() > 0) {
                for (String str : list) {
                    for (ResponseBundle responseBundle : b) {
                        if (responseBundle.tagList != null && responseBundle.tagList.contains(str) && !arrayList.contains(responseBundle)) {
                            arrayList.add(responseBundle);
                        }
                    }
                }
                return arrayList;
            }
            return arrayList;
        }
    }

    public static synchronized List<ResponseBundle> a(String str) {
        synchronized (j.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6cbffd6462c0feece44b253cf5cfe29b", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6cbffd6462c0feece44b253cf5cfe29b");
            }
            return b(Collections.singletonList(str));
        }
    }

    public static synchronized ResponseBundle b(String str) {
        synchronized (j.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6766b871e71e633b7a0bfd5d20c1a9c9", RobustBitConfig.DEFAULT_VALUE)) {
                return (ResponseBundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6766b871e71e633b7a0bfd5d20c1a9c9");
            }
            if (b != null && b.size() > 0 && !TextUtils.isEmpty(str)) {
                for (ResponseBundle responseBundle : b) {
                    if (TextUtils.equals(str, responseBundle.name)) {
                        return responseBundle;
                    }
                }
                return null;
            }
            return null;
        }
    }

    public static synchronized List<ResponseBundle> c(List<String> list) {
        synchronized (j.class) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a300332e567a013368bd808f5b96fe0", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a300332e567a013368bd808f5b96fe0");
            }
            ArrayList arrayList = new ArrayList();
            if (b != null && b.size() > 0 && list != null && list.size() != 0) {
                for (ResponseBundle responseBundle : b) {
                    if (list.contains(responseBundle.name)) {
                        arrayList.add(responseBundle);
                    }
                }
                return arrayList;
            }
            return arrayList;
        }
    }

    public static synchronized boolean a() {
        boolean z;
        synchronized (j.class) {
            z = b != null;
        }
        return z;
    }
}
