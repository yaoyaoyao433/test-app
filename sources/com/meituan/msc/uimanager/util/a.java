package com.meituan.msc.uimanager.util;

import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final List<InterfaceC0488a> b = new ArrayList();
    private static final Map<Object, Set<String>> c = new HashMap();

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.uimanager.util.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0488a {
        String a();
    }

    public static void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e23f6e74a6284bfb91dd01cdab4b88d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e23f6e74a6284bfb91dd01cdab4b88d");
            return;
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "826f5e77a513c033a824957680fb81a9", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "826f5e77a513c033a824957680fb81a9");
        } else {
            Object tag = view.getTag(R.id.view_tag_native_id);
            if (tag instanceof String) {
                str = (String) tag;
            }
        }
        if (str == null) {
            return;
        }
        Iterator<InterfaceC0488a> it = b.iterator();
        while (it.hasNext()) {
            InterfaceC0488a next = it.next();
            if (str != null && str.equals(next.a())) {
                it.remove();
            }
        }
        for (Map.Entry<Object, Set<String>> entry : c.entrySet()) {
            Set<String> value = entry.getValue();
            if (value != null && value.contains(str)) {
                entry.getKey();
            }
        }
    }
}
