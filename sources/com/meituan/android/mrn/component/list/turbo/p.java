package com.meituan.android.mrn.component.list.turbo;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.android.mrn.component.list.item.MListExpressionManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class p {
    public static ChangeQuickRedirect a;
    public List<String> b;

    public final String a(a aVar, TurboNode turboNode) {
        boolean z = true;
        Object[] objArr = {aVar, turboNode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d05b51d78ce39a00c74ee8655437a68", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d05b51d78ce39a00c74ee8655437a68");
        }
        if (this.b == null) {
            this.b = a(turboNode);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(CommonConstant.Symbol.BIG_BRACKET_LEFT);
        for (String str : this.b) {
            if (z) {
                z = false;
            } else {
                sb.append(CommonConstant.Symbol.COMMA);
            }
            boolean a2 = a(n.a(d.a(aVar, str)));
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
            sb.append(str);
            sb.append("\":");
            sb.append(a2 ? "true" : "false");
        }
        sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        return sb.toString();
    }

    private static boolean a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42851b827894d873bafe0e3b2a95ac78", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42851b827894d873bafe0e3b2a95ac78")).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if ((obj instanceof Map) || (obj instanceof Collection) || (obj instanceof ReadableArray) || (obj instanceof ReadableMap)) {
            return true;
        }
        if (obj instanceof String) {
            return ((String) obj).length() > 0;
        } else if (obj instanceof Number) {
            return ((Number) obj).doubleValue() != 0.0d;
        } else if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        } else {
            return false;
        }
    }

    private List<String> a(TurboNode turboNode) {
        Object[] objArr = {turboNode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7363fe45e40c87d42a09e353daac015", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7363fe45e40c87d42a09e353daac015");
        }
        final ArrayList arrayList = new ArrayList();
        a(turboNode, new rx.functions.g<String, Void>() { // from class: com.meituan.android.mrn.component.list.turbo.p.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ Void call(String str) {
                String str2 = str;
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0918a4f8790338aca94175784b9a899", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0918a4f8790338aca94175784b9a899");
                }
                arrayList.add(str2);
                return null;
            }
        });
        return arrayList;
    }

    private void a(TurboNode turboNode, rx.functions.g<String, Void> gVar) {
        ReadableMap readableMap;
        Object[] objArr = {turboNode, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91e270d0beb7cc791bcbcd25cd9a8833", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91e270d0beb7cc791bcbcd25cd9a8833");
            return;
        }
        if (MListExpressionManager.COMPONENT_NAME.equals(turboNode.mModuleName) && (readableMap = turboNode.rawProps) != null) {
            if (readableMap.hasKey("lif")) {
                gVar.call(readableMap.getString("lif"));
            } else if (!readableMap.hasKey("lnotif")) {
                return;
            } else {
                gVar.call(readableMap.getString("lnotif"));
            }
        }
        ArrayList<TurboNode> arrayList = turboNode.mChildren;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a(arrayList.get(i), gVar);
        }
    }
}
