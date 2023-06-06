package com.sankuai.waimai.machpro.container;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.machpro.base.MachMap;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements b {
    public static ChangeQuickRedirect a;
    public Activity b;
    public String c;
    public a d;
    public FrameLayout e;
    public FrameLayout f;
    public JSONObject g;
    public d h;
    public MachMap i;
    public MachMap j;
    public final FFPReportListener k;
    private View l;
    private View m;
    private com.sankuai.waimai.mach.manager.cache.c n;
    private HashMap<String, com.sankuai.waimai.mach.manager.cache.c> o;

    @Override // com.sankuai.waimai.machpro.container.b
    public final void a(CacheException cacheException) {
    }

    public static /* synthetic */ a a(c cVar, a aVar) {
        cVar.d = null;
        return null;
    }

    public c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca2d0134b86a3b252a34809bd8229af7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca2d0134b86a3b252a34809bd8229af7");
            return;
        }
        this.k = new FFPReportListener() { // from class: com.sankuai.waimai.machpro.container.c.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener
            public final void onFFPReport(@NonNull FFPReportListener.IReportEvent iReportEvent) {
                Object[] objArr2 = {iReportEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54fce753f1902bb21e8854c561a8c772", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54fce753f1902bb21e8854c561a8c772");
                } else if (c.this.d != null) {
                    c.this.d.a(iReportEvent);
                }
            }
        };
        this.b = activity;
    }

    public Intent e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5711b6c240b423d1a648b9ff448913ab", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5711b6c240b423d1a648b9ff448913ab") : this.b.getIntent();
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final Context aA_() {
        return this.b;
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b8749954351212f19737603ba836e15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b8749954351212f19737603ba836e15");
            return;
        }
        if (this.l == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            this.l = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "763f20750cdd72d22dc708bdcaddcdc6", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "763f20750cdd72d22dc708bdcaddcdc6") : this.h.a(this.b);
        }
        if (this.h != null) {
            this.h.a();
        }
        if (this.l != null) {
            if (this.l.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.l.getParent()).removeView(this.l);
            }
            this.e.addView(this.l, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2910ef46fea2106055a8e4e223b442d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2910ef46fea2106055a8e4e223b442d");
            return;
        }
        if (this.h != null) {
            this.h.b();
        }
        if (this.l != null && (this.l.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.l.getParent()).removeView(this.l);
        }
        this.l = null;
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final void h() {
        View view;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "853fe7d4672ff3ad95aebf5369ca2043", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "853fe7d4672ff3ad95aebf5369ca2043");
            return;
        }
        if (this.m == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0fcc806c05e6b950079532383e34d1dc", RobustBitConfig.DEFAULT_VALUE)) {
                view = (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0fcc806c05e6b950079532383e34d1dc");
            } else {
                com.sankuai.waimai.machpro.adapter.d dVar = com.sankuai.waimai.machpro.f.a().e;
                int b = (int) com.sankuai.waimai.machpro.util.b.b(dVar != null ? dVar.a(this.b) : 0);
                FrameLayout frameLayout = new FrameLayout(this.b);
                frameLayout.setBackgroundColor(-1);
                TextView textView = new TextView(this.b);
                textView.setText("出错了");
                textView.setGravity(17);
                textView.setTextColor(-16777216);
                TextPaint paint = textView.getPaint();
                if (paint != null) {
                    paint.setFakeBoldText(true);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.topMargin = b;
                frameLayout.addView(textView, layoutParams);
                View view2 = new View(this.b);
                view2.setBackgroundColor(com.sankuai.waimai.machpro.util.b.b("#333333"));
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, 1);
                layoutParams2.gravity = 80;
                frameLayout.addView(view2, layoutParams2);
                ImageView imageView = new ImageView(this.b);
                imageView.setImageResource(R.drawable.machpro_back_icon);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.machpro.container.c.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        Object[] objArr3 = {view3};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f0b717d469ffeb527f30f966c84cee26", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f0b717d469ffeb527f30f966c84cee26");
                        } else {
                            c.this.b.finish();
                        }
                    }
                });
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.sankuai.waimai.machpro.util.b.b(20.0f), (int) com.sankuai.waimai.machpro.util.b.b(20.0f));
                layoutParams3.topMargin = ((int) com.sankuai.waimai.machpro.util.b.b(14.0f)) + b;
                layoutParams3.gravity = 3;
                layoutParams3.leftMargin = (int) com.sankuai.waimai.machpro.util.b.b(12.0f);
                frameLayout.addView(imageView, layoutParams3);
                LinearLayout linearLayout = new LinearLayout(this.b);
                linearLayout.setOrientation(1);
                linearLayout.addView(frameLayout, new FrameLayout.LayoutParams(-1, ((int) com.sankuai.waimai.machpro.util.b.b(48.0f)) + b));
                View a2 = this.h.a(this.b, this.d);
                if (a2 != null) {
                    if (a2.getParent() instanceof ViewGroup) {
                        ((ViewGroup) a2.getParent()).removeView(a2);
                    }
                    linearLayout.addView(a2, new FrameLayout.LayoutParams(-1, -1));
                }
                view = linearLayout;
            }
            this.m = view;
        }
        if (this.h != null) {
            this.h.c();
        }
        if (this.m != null) {
            if (this.m.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.m.getParent()).removeView(this.m);
            }
            this.e.addView(this.m, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30a455350f80a8a4e4f9830bc18fc59f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30a455350f80a8a4e4f9830bc18fc59f");
            return;
        }
        if (this.h != null) {
            this.h.d();
        }
        if (this.m != null && (this.m.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.m.getParent()).removeView(this.m);
        }
        this.m = null;
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final String j() {
        return this.c;
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final MachMap d() {
        return this.j;
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final FrameLayout ay_() {
        return this.f;
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final String az_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39d3140706ef090faf1dff87dbe20b2e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39d3140706ef090faf1dff87dbe20b2e") : com.sankuai.waimai.machpro.util.b.f(this.c);
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final void a(com.sankuai.waimai.mach.manager.cache.c cVar) {
        this.n = cVar;
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c40a5cf505b8b9b1f00b713e33d8e2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c40a5cf505b8b9b1f00b713e33d8e2a");
        } else if (com.sankuai.waimai.machpro.f.a().i.i) {
            com.sankuai.waimai.machpro.debug.a.a(this.e, th, this.n, this.o);
        }
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final void b(com.sankuai.waimai.mach.manager.cache.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8802af71d959bc34e40ca98baccabbea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8802af71d959bc34e40ca98baccabbea");
        } else if (cVar == null) {
        } else {
            if (this.o == null) {
                this.o = new HashMap<>();
            }
            this.o.put(cVar.d, cVar);
        }
    }
}
