package org.apache.flink.cep.nfa.compiler;

import com.meituan.robust.common.CommonConstant;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a {
    private final Set<String> a = new HashSet();

    public final String a(String str) {
        String str2 = str;
        int i = 0;
        while (this.a.contains(str2)) {
            str2 = str + CommonConstant.Symbol.COLON + i;
            i++;
        }
        this.a.add(str2);
        return str2;
    }
}
