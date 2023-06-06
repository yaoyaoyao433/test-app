package com.midas.ad.feedback.event;

import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    private String a;
    private C0532a b;

    /* compiled from: ProGuard */
    /* renamed from: com.midas.ad.feedback.event.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0532a {
        public int a;
        public List<String> b;
        public Map<String, String> c;
        public int d;
    }

    public a(String str) {
        this.a = str;
    }

    public a(String str, C0532a c0532a) {
        this.a = str;
        this.b = c0532a;
    }
}
