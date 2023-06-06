package com.alibaba.android.bindingx.core.internal;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.common.CommonConstant;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class b extends a {
    protected int m;
    protected int n;
    private boolean o;

    public b(Context context, com.alibaba.android.bindingx.core.e eVar, Object... objArr) {
        super(context, eVar, objArr);
        this.o = false;
    }

    @Override // com.alibaba.android.bindingx.core.c
    @CallSuper
    public boolean c(@NonNull String str, @NonNull String str2) {
        e();
        this.o = false;
        a("end", this.m, this.n, 0.0f, 0.0f, 0.0f, 0.0f);
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.internal.a
    protected final void a(@NonNull Map<String, Object> map) {
        a("exit", ((Float) map.get("internal_x")).floatValue(), ((Float) map.get("internal_y")).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.alibaba.android.bindingx.core.internal.a, com.alibaba.android.bindingx.core.c
    @CallSuper
    public void a() {
        super.a();
        this.o = false;
    }

    public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (com.alibaba.android.bindingx.core.d.a) {
            com.alibaba.android.bindingx.core.d.a(String.format(Locale.getDefault(), "[ScrollHandler] scroll changed. (contentOffsetX:%d,contentOffsetY:%d,dx:%d,dy:%d,tdx:%d,tdy:%d)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
        }
        this.m = i;
        this.n = i2;
        if (!this.o) {
            this.o = true;
            a("start", i, i2, i3, i4, i5, i6);
        }
        try {
            l.a(this.c, i, i2, i3, i4, i5, i6, this.h.a);
            if (a(this.k, this.c)) {
                return;
            }
            a(this.a, this.c, Constants.FPS_TYPE_SCROLL);
        } catch (Exception e) {
            com.alibaba.android.bindingx.core.d.a("runtime error", e);
        }
    }

    public final void a(String str, float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            double b = this.h.a.b(f, new Object[0]);
            double b2 = this.h.a.b(f2, new Object[0]);
            hashMap.put(Constants.GestureMoveEvent.KEY_X, Double.valueOf(b));
            hashMap.put(Constants.GestureMoveEvent.KEY_Y, Double.valueOf(b2));
            double b3 = this.h.a.b(f3, new Object[0]);
            double b4 = this.h.a.b(f4, new Object[0]);
            hashMap.put("dx", Double.valueOf(b3));
            hashMap.put("dy", Double.valueOf(b4));
            double b5 = this.h.a.b(f5, new Object[0]);
            double b6 = this.h.a.b(f6, new Object[0]);
            hashMap.put("tdx", Double.valueOf(b5));
            hashMap.put("tdy", Double.valueOf(b6));
            hashMap.put("source", this.f);
            this.b.a(hashMap);
            com.alibaba.android.bindingx.core.d.a(">>>>>>>>>>>fire event:(" + str + CommonConstant.Symbol.COMMA + b + CommonConstant.Symbol.COMMA + b2 + CommonConstant.Symbol.COMMA + b3 + CommonConstant.Symbol.COMMA + b4 + CommonConstant.Symbol.COMMA + b5 + CommonConstant.Symbol.COMMA + b6 + CommonConstant.Symbol.BRACKET_RIGHT);
        }
    }
}
