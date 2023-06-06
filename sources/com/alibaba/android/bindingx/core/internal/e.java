package com.alibaba.android.bindingx.core.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.animation.AnimationUtils;
import com.alibaba.android.bindingx.core.a;
import com.alibaba.android.bindingx.core.internal.c;
import com.meituan.robust.common.CommonConstant;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e extends a implements c.a {
    private long m;
    private c n;
    private boolean o;

    @Override // com.alibaba.android.bindingx.core.c
    public final boolean a(@NonNull String str, @NonNull String str2) {
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final void b() {
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final void b(@NonNull String str, @NonNull String str2) {
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final void c() {
    }

    public e(Context context, com.alibaba.android.bindingx.core.e eVar, Object... objArr) {
        super(context, eVar, objArr);
        this.m = 0L;
        this.o = false;
        if (this.n == null) {
            this.n = c.a();
        } else {
            this.n.b();
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.a, com.alibaba.android.bindingx.core.c
    public final void a(@NonNull String str, @Nullable Map<String, Object> map, @Nullable j jVar, @NonNull List<Map<String, Object>> list, @Nullable a.InterfaceC0017a interfaceC0017a) {
        super.a(str, map, jVar, list, interfaceC0017a);
        if (this.n == null) {
            this.n = c.a();
        }
        a("start", 0L);
        this.n.b();
        this.n.a(this);
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final boolean c(@NonNull String str, @NonNull String str2) {
        a("end", System.currentTimeMillis() - this.m);
        e();
        if (this.n != null) {
            this.n.b();
        }
        this.m = 0L;
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.internal.a, com.alibaba.android.bindingx.core.c
    public final void a() {
        super.a();
        e();
        if (this.n != null) {
            this.n.c();
            this.n = null;
        }
        this.m = 0L;
    }

    @Override // com.alibaba.android.bindingx.core.internal.a
    protected final void a(@NonNull Map<String, Object> map) {
        a("exit", (long) ((Double) map.get("t")).doubleValue());
        if (this.n != null) {
            this.n.b();
        }
        this.m = 0L;
    }

    private void a(String str, long j) {
        if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            hashMap.put("t", Long.valueOf(j));
            hashMap.put("source", this.f);
            this.b.a(hashMap);
            com.alibaba.android.bindingx.core.d.a(">>>>>>>>>>>fire event:(" + str + CommonConstant.Symbol.COMMA + j + CommonConstant.Symbol.BRACKET_RIGHT);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.c.a
    public final void d() {
        long j = 0;
        if (this.m == 0) {
            this.m = AnimationUtils.currentAnimationTimeMillis();
            this.o = false;
        } else {
            j = AnimationUtils.currentAnimationTimeMillis() - this.m;
        }
        try {
            if (com.alibaba.android.bindingx.core.d.a) {
                com.alibaba.android.bindingx.core.d.a(String.format(Locale.getDefault(), "[TimingHandler] timing elapsed. (t:%d)", Long.valueOf(j)));
            }
            l.a(this.c, j);
            if (!this.o) {
                a(this.a, this.c, "timing");
            }
            this.o = a(this.k, this.c);
        } catch (Exception e) {
            com.alibaba.android.bindingx.core.d.a("runtime error", e);
        }
    }
}
