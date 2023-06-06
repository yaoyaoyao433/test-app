package com.meituan.android.common.mtguard.wtscore.plugin.detection.uiautomator;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static int a() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a6fb1c5f9b2603b1a4a0328d57b5242b", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a6fb1c5f9b2603b1a4a0328d57b5242b");
        } else {
            Object[] main3 = NBridge.main3(11, new Object[0]);
            if (main3 == null) {
                return 0;
            }
            obj = main3[0];
        }
        return ((Integer) obj).intValue();
    }

    public static List<View> a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "81dffd4e3158df422c2279ae9270d594", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "81dffd4e3158df422c2279ae9270d594");
        }
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                arrayList.add(view);
            }
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                arrayList.add(childAt);
                arrayList.addAll(a(childAt));
            }
        } else {
            arrayList.add(view);
        }
        return arrayList;
    }

    private static void a(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3c3e49dd246f8c2addc0bad9babae7d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3c3e49dd246f8c2addc0bad9babae7d8");
            return;
        }
        Object[] main3 = NBridge.main3(13, new Object[]{view});
        if (main3 == null) {
            return;
        }
        a aVar = new a(true);
        View.OnTouchListener onTouchListener = (View.OnTouchListener) main3[0];
        if (onTouchListener != null) {
            aVar.a = onTouchListener;
        }
        NBridge.main3(14, new Object[]{view, aVar});
    }

    private static void b(@NonNull View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "960f42f53fb3893fb934744f284e757f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "960f42f53fb3893fb934744f284e757f");
            return;
        }
        MTGuardLog.setLogan("addToWatch: true");
        List<View> a = a(view);
        HashSet hashSet = new HashSet(a);
        a.clear();
        a.addAll(hashSet);
        for (View view2 : a) {
            Object[] main3 = NBridge.main3(13, new Object[]{view2});
            if (main3 != null) {
                a aVar = new a(true);
                View.OnTouchListener onTouchListener = (View.OnTouchListener) main3[0];
                if (onTouchListener != null) {
                    aVar.a = onTouchListener;
                }
                NBridge.main3(14, new Object[]{view2, aVar});
            }
        }
    }
}
