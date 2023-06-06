package com.meituan.android.mrn.component.list.node;

import android.util.Log;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    public ReadableMap c;

    private b(String str, ReadableMap readableMap) {
        Object[] objArr = {str, readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2c1aba425cfe75a93b2f9f23322c5f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2c1aba425cfe75a93b2f9f23322c5f9");
            return;
        }
        this.b = "";
        this.b = str;
        this.c = readableMap;
    }

    public static HashMap<String, b> a(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "976d4c7c83508fabecd69f2288055fe1", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "976d4c7c83508fabecd69f2288055fe1");
        }
        HashMap<String, b> hashMap = new HashMap<>();
        if (readableArray == null) {
            return hashMap;
        }
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            if (map != null) {
                String string = map.getString("tplId");
                b bVar = new b(string, map.getMap("dsl"));
                if (hashMap.containsKey(string)) {
                    Log.e("ListItemTemplate", "[ListItemTemplate@handleTemplates] reiterated templateId: " + string);
                }
                hashMap.put(string, bVar);
            }
        }
        return hashMap;
    }
}
