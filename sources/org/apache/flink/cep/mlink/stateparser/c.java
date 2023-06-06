package org.apache.flink.cep.mlink.stateparser;

import org.apache.flink.cep.mlink.ikexpression.expressionnode.f;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c<T> {
    String a;
    int b;
    org.apache.flink.cep.pattern.conditions.b<T> c;
    org.apache.flink.cep.pattern.conditions.b<T> d;
    org.apache.flink.cep.pattern.conditions.b<T> e;
    org.apache.flink.cep.pattern.conditions.b<T> f;
    org.apache.flink.cep.pattern.conditions.b<T> g;
    org.apache.flink.cep.pattern.conditions.b<T> h;
    public String i;
    public long j;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        private static final /* synthetic */ int[] e = {a, b, c, d};
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0102, code lost:
        if (r0.equals("PairRest") == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(org.json.JSONObject r9) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.flink.cep.mlink.stateparser.c.<init>(org.json.JSONObject):void");
    }

    private static org.apache.flink.cep.pattern.conditions.b a(JSONObject jSONObject) {
        org.apache.flink.cep.mlink.ikexpression.expressionnode.a a2;
        if (jSONObject == null || (a2 = f.a(jSONObject)) == null) {
            return null;
        }
        return new org.apache.flink.cep.mlink.condition.a(a2);
    }
}
