package com.sankuai.waimai.mach.widget;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.jsv8.b;
import com.sankuai.waimai.mach.utils.i;
import com.tencent.mapsdk.internal.y;
import java.util.Map;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f implements View.OnClickListener, View.OnLongClickListener {
    public static ChangeQuickRedirect a;
    @NonNull
    private final View b;
    private String c;
    private com.sankuai.waimai.mach.parser.d d;
    private String e;
    private com.sankuai.waimai.mach.parser.d f;
    private com.sankuai.waimai.mach.parser.d g;
    private com.sankuai.waimai.mach.parser.d h;
    private com.sankuai.waimai.mach.parser.d i;
    private com.sankuai.waimai.mach.parser.d j;
    private com.sankuai.waimai.mach.parser.d k;
    private d l;
    private boolean m;

    public f(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "397be31b3947f2f3672bee2c178b9080", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "397be31b3947f2f3672bee2c178b9080");
        } else {
            this.b = view;
        }
    }

    public final void a(@NonNull d dVar) {
        boolean z = true;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fecb43bdcd876cf52a6e4d6ea490bf8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fecb43bdcd876cf52a6e4d6ea490bf8e");
            return;
        }
        if ((dVar.p == null || dVar.p.isEmpty()) && (dVar.q == null || dVar.q.isEmpty())) {
            z = false;
        }
        this.m = z;
        if (!TextUtils.isEmpty(dVar.c) || this.m || dVar.d != null || dVar.j != null || dVar.k != null) {
            this.b.setOnClickListener(this);
            this.c = dVar.c;
            this.d = dVar.d;
            this.j = dVar.j;
            this.k = dVar.k;
        }
        if (dVar.g != null || dVar.h != null || dVar.i != null) {
            this.b.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.mach.widget.f.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnTouchListener
                @SuppressLint({"ClickableViewAccessibility"})
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    Object[] objArr2 = {view, motionEvent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59793329d505e910ab6d8aafbed03ef4", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59793329d505e910ab6d8aafbed03ef4")).booleanValue();
                    }
                    int action = motionEvent.getAction();
                    if (action != 3) {
                        switch (action) {
                            case 0:
                                if (f.this.g != null) {
                                    f.this.l.r.asyncCallJSMethod(f.this.g.b, f.this.g.c);
                                    break;
                                }
                                break;
                            case 1:
                                if (f.this.h != null) {
                                    f.this.l.r.asyncCallJSMethod(f.this.h.b, f.this.h.c);
                                    break;
                                }
                                break;
                        }
                    } else if (f.this.i != null) {
                        f.this.l.r.asyncCallJSMethod(f.this.i.b, f.this.i.c);
                    }
                    return false;
                }
            });
        }
        if (!TextUtils.isEmpty(dVar.e) || dVar.f != null) {
            this.b.setOnLongClickListener(this);
            this.e = dVar.e;
            this.f = dVar.f;
        }
        if (dVar.g != null) {
            this.g = dVar.g;
        }
        if (dVar.h != null) {
            this.i = dVar.h;
        }
        if (dVar.i != null) {
            this.h = dVar.i;
        }
        if (dVar.u != null && i.a()) {
            this.b.setElevation(dVar.u.floatValue());
        }
        this.l = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "075118f71a9c10518fdde0e7d9d192b0", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "075118f71a9c10518fdde0e7d9d192b0");
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(UUID.randomUUID());
            final String sb2 = sb.toString();
            if (this.m) {
                com.sankuai.waimai.mach.d dVar = this.l.s;
                if (dVar != null && this.l.p != null && !this.l.p.isEmpty()) {
                    dVar.a(sb2, "lx", 1, this.l.p, this.l.w);
                }
                if (dVar != null && this.l.q != null && !this.l.q.isEmpty()) {
                    dVar.a(sb2, "sh", 1, this.l.q, this.l.w);
                }
            }
            Mach mach = this.l.r;
            if (mach != null) {
                if (this.d != null) {
                    mach.asyncCallJSMethod(this.d.b, this.d.c);
                }
                if (this.j != null) {
                    com.sankuai.waimai.mach.d dVar2 = this.l.s;
                    if (dVar2 instanceof a) {
                        mach.bindDataToJS("env", ((a) dVar2).a());
                    }
                    mach.asyncCallJSMethod(this.j.b, this.j.c, new b.InterfaceC1011b() { // from class: com.sankuai.waimai.mach.widget.f.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.mach.jsv8.b.InterfaceC1011b
                        public final void a(Object obj) {
                            Object[] objArr2 = {obj};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f3146cc567cdb8db1769f3012ff637f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f3146cc567cdb8db1769f3012ff637f");
                            } else if (obj instanceof Map) {
                                Map<String, Object> map = (Map) obj;
                                com.sankuai.waimai.mach.d dVar3 = f.this.l.s;
                                if (dVar3 != null) {
                                    dVar3.a(sb2, "lx", 1, map, f.this.l.w);
                                }
                            }
                        }
                    });
                }
                if (this.k != null) {
                    com.sankuai.waimai.mach.d dVar3 = this.l.s;
                    if (dVar3 instanceof a) {
                        mach.bindDataToJS("env", ((a) dVar3).a());
                    }
                    mach.asyncCallJSMethod(this.k.b, this.k.c, new b.InterfaceC1011b() { // from class: com.sankuai.waimai.mach.widget.f.3
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.mach.jsv8.b.InterfaceC1011b
                        public final void a(Object obj) {
                            Object[] objArr2 = {obj};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "055150581a7ad6b2915ce6d6b8e3ffa4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "055150581a7ad6b2915ce6d6b8e3ffa4");
                            } else if (obj instanceof Map) {
                                Map<String, Object> map = (Map) obj;
                                com.sankuai.waimai.mach.d dVar4 = f.this.l.s;
                                if (dVar4 != null) {
                                    dVar4.a(sb2, "sh", 1, map, f.this.l.w);
                                }
                            }
                        }
                    });
                }
            }
            if (TextUtils.isEmpty(this.c)) {
                return;
            }
            com.sankuai.waimai.mach.b bVar = this.l.v;
            if (bVar != null) {
                if (bVar.a(this.c, view, this.l.w)) {
                    return;
                }
                a(view);
                return;
            }
            a(view);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0f00309a11384f9c6333f7d53f5b4d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0f00309a11384f9c6333f7d53f5b4d7");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(this.c));
        a(view.getContext(), intent).startActivity(intent);
    }

    private Context a(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7be2e0053cffbfe048d5bad049701226", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7be2e0053cffbfe048d5bad049701226");
        }
        if (this.l != null && this.l.w != null && this.l.w.f != null) {
            Activity activity = this.l.w.f.getActivity();
            if (activity != null) {
                return activity;
            }
            intent.addFlags(y.a);
            return context;
        }
        intent.addFlags(y.a);
        return context;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        com.sankuai.waimai.mach.b bVar;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bd726b313dad1c4f07072e171f16082", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bd726b313dad1c4f07072e171f16082")).booleanValue();
        }
        try {
            if (this.l.r != null && this.f != null) {
                this.l.r.asyncCallJSMethod(this.f.b, this.f.c);
            }
            if (!TextUtils.isEmpty(this.e) && (bVar = this.l.v) != null) {
                bVar.b(this.e, view, this.l.w);
            }
        } catch (Exception unused) {
        }
        return true;
    }
}
