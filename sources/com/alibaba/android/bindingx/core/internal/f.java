package com.alibaba.android.bindingx.core.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.alibaba.android.bindingx.core.a;
import com.meituan.robust.common.CommonConstant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends a implements GestureDetector.OnGestureListener, View.OnTouchListener {
    private float m;
    private float n;
    private double o;
    private double p;
    private GestureDetector q;
    private boolean r;
    private boolean s;

    @Override // com.alibaba.android.bindingx.core.c
    public final void b() {
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final void c() {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public f(Context context, com.alibaba.android.bindingx.core.e eVar, Object... objArr) {
        super(context, eVar, objArr);
        this.q = new GestureDetector(context, this);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        try {
            switch (motionEvent.getActionMasked()) {
                case 0:
                    this.m = motionEvent.getRawX();
                    this.n = motionEvent.getRawY();
                    a("start", 0.0d, 0.0d);
                    break;
                case 1:
                    this.m = 0.0f;
                    this.n = 0.0f;
                    n_();
                    a("end", this.o, this.p);
                    this.o = 0.0d;
                    this.p = 0.0d;
                    break;
                case 2:
                    if (this.m == 0.0f && this.n == 0.0f) {
                        this.m = motionEvent.getRawX();
                        this.n = motionEvent.getRawY();
                        a("start", 0.0d, 0.0d);
                        break;
                    } else {
                        this.o = motionEvent.getRawX() - this.m;
                        this.p = motionEvent.getRawY() - this.n;
                        break;
                    }
                    break;
                case 3:
                    this.m = 0.0f;
                    this.n = 0.0f;
                    e();
                    a("cancel", this.o, this.p);
                    break;
            }
        } catch (Exception e) {
            com.alibaba.android.bindingx.core.d.a("runtime error ", e);
        }
        return this.q.onTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        com.alibaba.android.bindingx.core.d.c("come to onScroll function");
        if (!this.r) {
            com.alibaba.android.bindingx.core.d.a("pan gesture is not enabled");
            return false;
        }
        float f3 = this.m;
        float f4 = this.n;
        if (motionEvent2 == null) {
            return false;
        }
        float rawX = motionEvent2.getRawX() - f3;
        float rawY = motionEvent2.getRawY() - f4;
        com.alibaba.android.bindingx.core.d.c("deltaY=" + rawY);
        try {
            l.a(this.c, rawX, rawY, this.h.a);
            if (!a(this.k, this.c)) {
                a(this.a, this.c, "pan");
            }
        } catch (Exception e) {
            com.alibaba.android.bindingx.core.d.a("runtime error", e);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return !this.s ? false : false;
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final boolean a(@NonNull String str, @NonNull String str2) {
        View a = this.h.b.a(str, Boolean.TRUE, TextUtils.isEmpty(this.e) ? this.d : this.e);
        if (a == null) {
            com.alibaba.android.bindingx.core.d.c("[ExpressionTouchHandler] onCreate failed. sourceView not found:" + str);
            return false;
        }
        a.setOnTouchListener(this);
        com.alibaba.android.bindingx.core.d.a("[ExpressionTouchHandler] onCreate success. {source:" + str + ",type:" + str2 + CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final void b(@NonNull String str, @NonNull String str2) {
        char c;
        int hashCode = str2.hashCode();
        if (hashCode != 110749) {
            if (hashCode == 97520651 && str2.equals("flick")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str2.equals("pan")) {
                c = 0;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                this.r = true;
                return;
            case 1:
                this.s = true;
                return;
            default:
                return;
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.a, com.alibaba.android.bindingx.core.c
    public final void a(@NonNull String str, @Nullable Map<String, Object> map, @Nullable j jVar, @NonNull List<Map<String, Object>> list, @Nullable a.InterfaceC0017a interfaceC0017a) {
        super.a(str, map, jVar, list, interfaceC0017a);
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final boolean c(@NonNull String str, @NonNull String str2) {
        char c;
        int hashCode = str2.hashCode();
        if (hashCode != 110749) {
            if (hashCode == 97520651 && str2.equals("flick")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str2.equals("pan")) {
                c = 0;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                this.r = false;
                break;
            case 1:
                this.s = false;
                break;
        }
        if (this.r || this.s) {
            return false;
        }
        View a = this.h.b.a(str, TextUtils.isEmpty(this.e) ? this.d : this.e);
        if (a != null) {
            a.setOnTouchListener(null);
        }
        com.alibaba.android.bindingx.core.d.a("remove touch listener success.[" + str + CommonConstant.Symbol.COMMA + str2 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.internal.a, com.alibaba.android.bindingx.core.c
    public final void a() {
        super.a();
        if (this.a != null) {
            this.a.clear();
            this.a = null;
        }
        this.k = null;
        this.b = null;
        this.s = false;
        this.r = false;
    }

    @Override // com.alibaba.android.bindingx.core.internal.a
    protected final void a(@NonNull Map<String, Object> map) {
        a("exit", ((Double) map.get("internal_x")).doubleValue(), ((Double) map.get("internal_y")).doubleValue());
    }

    private void a(String str, double d, double d2) {
        if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            double b = this.h.a.b(d, new Object[0]);
            double b2 = this.h.a.b(d2, new Object[0]);
            hashMap.put("deltaX", Double.valueOf(b));
            hashMap.put("deltaY", Double.valueOf(b2));
            hashMap.put("source", this.f);
            this.b.a(hashMap);
            com.alibaba.android.bindingx.core.d.a(">>>>>>>>>>>fire event:(" + str + CommonConstant.Symbol.COMMA + b + CommonConstant.Symbol.COMMA + b2 + CommonConstant.Symbol.BRACKET_RIGHT);
        }
    }
}
