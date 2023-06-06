package com.speech.vadsdk.utils;

import com.meituan.robust.common.CommonConstant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static String a(HashSet<Map<String, Integer>> hashSet) {
        StringBuilder sb = new StringBuilder();
        int size = hashSet.size();
        Iterator<Map<String, Integer>> it = hashSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            sb.append(it.next().keySet().iterator().next());
            if (i != size - 1) {
                sb.append(CommonConstant.Symbol.UNDERLINE);
            }
            i++;
        }
        return sb.toString();
    }

    public static String b(HashSet<Map<String, Integer>> hashSet) {
        StringBuilder sb = new StringBuilder();
        int size = hashSet.size();
        Iterator<Map<String, Integer>> it = hashSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map<String, Integer> next = it.next();
            sb.append(next.get(next.keySet().iterator().next()));
            if (i != size - 1) {
                sb.append(CommonConstant.Symbol.UNDERLINE);
            }
            i++;
        }
        return sb.toString();
    }
}
