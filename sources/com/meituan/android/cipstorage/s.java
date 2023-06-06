package com.meituan.android.cipstorage;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class s {
    public static ChangeQuickRedirect a;
    private static final ConcurrentHashMap<String, q> b = new ConcurrentHashMap<>();

    private static void b(String str, int i) {
        String b2;
        boolean z = false;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "131fba5895d81dd00c0074ea020cf4d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "131fba5895d81dd00c0074ea020cf4d9");
        } else if (!"cips-inner-info".equals(str)) {
            String a2 = y.a();
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            k a3 = k.a();
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = k.a;
            if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "d4ddfcd89466150abb66b81f7da6109c", RobustBitConfig.DEFAULT_VALUE)) {
                b2 = (String) PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "d4ddfcd89466150abb66b81f7da6109c");
            } else {
                q b3 = a3.b();
                b2 = b3.b("cmu#" + str, "");
            }
            if (TextUtils.isEmpty(b2)) {
                a3.a(str, a2 + "#" + i);
                return;
            }
            String[] split = b2.split("#");
            HashMap hashMap = new HashMap();
            int length = split.length;
            for (int i2 = 0; i2 < length / 2; i2++) {
                int i3 = i2 * 2;
                String str2 = split[i3];
                int parseInt = Integer.parseInt(split[i3 + 1]);
                hashMap.put(str2, Integer.valueOf(parseInt));
                if (!a2.equals(str2) && (i != parseInt || i != 2)) {
                    MMKV.a((short) -1, "illegal mode use, channel: " + str + " mode:<" + a2 + CommonConstant.Symbol.COMMA + i + "> <" + str2 + CommonConstant.Symbol.COMMA + parseInt + ">\n\tplease read：https://km.sankuai.com/page/230668383");
                }
            }
            hashMap.put(a2, Integer.valueOf(i));
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (z) {
                    sb.append("#");
                } else {
                    z = true;
                }
                sb.append((String) entry.getKey());
                sb.append("#");
                sb.append(entry.getValue());
            }
            a3.a(str, sb.toString());
        }
    }

    public static q a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e86274ab8085d913c14cebba3be5f9e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e86274ab8085d913c14cebba3be5f9e9");
        }
        q qVar = b.get(str);
        if (qVar != null) {
            return qVar;
        }
        if (v.b) {
            try {
                b(str, i);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        q qVar2 = new q(str, i);
        q putIfAbsent = b.putIfAbsent(str, qVar2);
        return putIfAbsent == null ? qVar2 : putIfAbsent;
    }
}
