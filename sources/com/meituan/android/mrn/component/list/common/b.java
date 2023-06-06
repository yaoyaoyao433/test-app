package com.meituan.android.mrn.component.list.common;

import android.support.v7.widget.RecyclerView;
import com.meituan.android.mrn.component.list.node.ListItemNode;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static RecyclerView.l b = null;
    private static int c = Integer.MAX_VALUE;

    public static synchronized int a() {
        synchronized (b.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "154996481897c728088becc4c8360341", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "154996481897c728088becc4c8360341")).intValue();
            }
            int i = c - 2;
            c = i;
            if (i % 10 == 1) {
                c -= 2;
            }
            if (c <= 0) {
                c = Integer.MAX_VALUE;
            }
            return c;
        }
    }

    public static synchronized int b() {
        int i;
        synchronized (b.class) {
            i = c;
        }
        return i;
    }

    public static int a(ListItemNode listItemNode) {
        Object[] objArr = {listItemNode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48fdcdf6ddd517d013e02866718e0f68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48fdcdf6ddd517d013e02866718e0f68")).intValue();
        }
        int hashCode = a((com.meituan.android.mrn.component.list.node.a) listItemNode).hashCode();
        listItemNode.m = hashCode;
        return hashCode;
    }

    public static boolean a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8821e1da6a625fc5fb2ec4e7399a6c6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8821e1da6a625fc5fb2ec4e7399a6c6")).booleanValue();
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    private static String a(com.meituan.android.mrn.component.list.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5d6d9fc18dade5541893e2c62a53cae", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5d6d9fc18dade5541893e2c62a53cae");
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{moduleName:");
        stringBuffer.append(aVar.e);
        stringBuffer.append(", children:");
        stringBuffer.append(a(aVar.i));
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    private static String a(ArrayList<com.meituan.android.mrn.component.list.node.a> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d415e71a8858d470ee611396d0f470f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d415e71a8858d470ee611396d0f470f");
        }
        Iterator<com.meituan.android.mrn.component.list.node.a> it = arrayList.iterator();
        if (!it.hasNext()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        while (true) {
            com.meituan.android.mrn.component.list.node.a next = it.next();
            if (!next.e.equals("RCTRawText")) {
                sb.append(a(next));
                if (!it.hasNext()) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(',');
                sb.append(Constants.SPACE);
            } else if (!it.hasNext()) {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
