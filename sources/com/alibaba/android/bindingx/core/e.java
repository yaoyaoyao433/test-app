package com.alibaba.android.bindingx.core;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public b a;
    public c b;
    public d c;
    String d;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        double a(double d, Object... objArr);

        double b(double d, Object... objArr);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface c {
        @Nullable
        View a(String str, Object... objArr);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface d {
        void a(@NonNull View view, @NonNull String str, @NonNull Object obj, @NonNull b bVar, @NonNull Map<String, Object> map, Object... objArr);
    }

    private e() {
    }

    @NonNull
    public final c a() {
        return this.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public b a;
        public c b;
        public d c;
        private String d;

        public final e a() {
            e eVar = new e();
            eVar.b = this.b;
            eVar.a = this.a;
            eVar.c = this.c;
            eVar.d = this.d;
            return eVar;
        }

        public final a a(@NonNull b bVar) {
            this.a = bVar;
            return this;
        }

        public final a a(@NonNull c cVar) {
            this.b = cVar;
            return this;
        }

        public final a a(@NonNull d dVar) {
            this.c = dVar;
            return this;
        }
    }
}
