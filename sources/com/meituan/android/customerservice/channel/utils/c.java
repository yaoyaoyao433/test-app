package com.meituan.android.customerservice.channel.utils;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "464debe76c05667e5e2ea7dcb238c88c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "464debe76c05667e5e2ea7dcb238c88c");
        } else if (view != null) {
            if (view instanceof ViewGroup) {
                LinkedList linkedList = new LinkedList();
                linkedList.add((ViewGroup) view);
                while (!linkedList.isEmpty()) {
                    ViewGroup viewGroup = (ViewGroup) linkedList.removeFirst();
                    viewGroup.setEnabled(z);
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                            linkedList.addLast((ViewGroup) viewGroup.getChildAt(i));
                        } else {
                            viewGroup.getChildAt(i).setEnabled(z);
                        }
                    }
                }
                return;
            }
            view.setEnabled(z);
        }
    }
}
