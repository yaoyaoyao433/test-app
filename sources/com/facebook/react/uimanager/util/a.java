package com.facebook.react.uimanager.util;

import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    private static final List<InterfaceC0150a> a = new ArrayList();
    private static final Map<Object, Set<String>> b = new HashMap();

    /* compiled from: ProGuard */
    /* renamed from: com.facebook.react.uimanager.util.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0150a {
        String a();
    }

    @Nullable
    public static View a(View view, String str) {
        String b2 = b(view);
        if (b2 == null || !b2.equals(str)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View a2 = a(viewGroup.getChildAt(i), str);
                    if (a2 != null) {
                        return a2;
                    }
                }
                return null;
            }
            return null;
        }
        return view;
    }

    public static void a(View view) {
        String b2 = b(view);
        if (b2 == null) {
            return;
        }
        Iterator<InterfaceC0150a> it = a.iterator();
        while (it.hasNext()) {
            InterfaceC0150a next = it.next();
            if (b2 != null && b2.equals(next.a())) {
                it.remove();
            }
        }
        for (Map.Entry<Object, Set<String>> entry : b.entrySet()) {
            Set<String> value = entry.getValue();
            if (value != null && value.contains(b2)) {
                entry.getKey();
            }
        }
    }

    @Nullable
    private static String b(View view) {
        Object tag = view.getTag(R.id.view_tag_native_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }
}
