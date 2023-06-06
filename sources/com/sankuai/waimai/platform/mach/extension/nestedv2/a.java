package com.sankuai.waimai.platform.mach.extension.nestedv2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.platform.mach.extension.nestedv2.b;
import com.sankuai.waimai.platform.mach.extension.nestedv2.f;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.mach.component.base.a<FrameLayout> {
    public static ChangeQuickRedirect a;
    b.a b;
    e c;
    private String d;
    private String e;
    private String f;
    private String g;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c89c75ffc10e67ec06203e3e0f5a00f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c89c75ffc10e67ec06203e3e0f5a00f0");
        } else {
            this.b = new b.a() { // from class: com.sankuai.waimai.platform.mach.extension.nestedv2.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.mach.extension.nestedv2.b.a
                public final void a(Rect rect) {
                    Object[] objArr2 = {rect};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f300bd96fa8239029145a0768cad36e9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f300bd96fa8239029145a0768cad36e9");
                    } else if (a.this.c != null) {
                        a.this.c.a_(rect);
                    }
                }

                @Override // com.sankuai.waimai.platform.mach.extension.nestedv2.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5e71f0b2f83c63b95c96972fdff29d7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5e71f0b2f83c63b95c96972fdff29d7");
                    } else if (a.this.c != null) {
                        a.this.c.e();
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = frameLayout;
        Object[] objArr = {frameLayout2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12f4ba16495f5fe0845a8a018840c99a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12f4ba16495f5fe0845a8a018840c99a");
            return;
        }
        super.a((a) frameLayout2);
        if (i(this.d) && i(this.e) && i(this.f)) {
            d a2 = f.a().a(this.d);
            com.sankuai.waimai.mach.manager.cache.e eVar = null;
            this.c = null;
            if (a2 != null) {
                Activity activity = this.n.f.getActivity();
                String w = activity instanceof BaseActivity ? ((BaseActivity) activity).w() : "";
                if (activity != null) {
                    this.c = a2.a(activity, w);
                }
            }
            if (this.c == null) {
                frameLayout2.setVisibility(8);
                return;
            }
            f a3 = f.a();
            f.a a4 = f.a.a(this.e, "", "");
            Object[] objArr2 = {a4};
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "c74d0d6756dbba62f3503ca2899f3e3a", RobustBitConfig.DEFAULT_VALUE)) {
                eVar = (com.sankuai.waimai.mach.manager.cache.e) PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "c74d0d6756dbba62f3503ca2899f3e3a");
            } else if (a4 != null) {
                eVar = a3.b.get(a4);
            }
            Map<String, Object> a5 = com.sankuai.waimai.mach.utils.b.a(this.f);
            Map<String, Object> a6 = com.sankuai.waimai.mach.utils.b.a(this.g);
            if (eVar == null || com.sankuai.waimai.mach.utils.e.a(a5)) {
                return;
            }
            this.c.a(frameLayout2, eVar, a5, a6);
            return;
        }
        frameLayout2.setVisibility(8);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ FrameLayout b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3152d8eb8fa62ca14c10fa4c8f90afab", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3152d8eb8fa62ca14c10fa4c8f90afab");
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sankuai.waimai.platform.mach.extension.nestedv2.a.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8094f4543c9ba842947d844f0df44baf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8094f4543c9ba842947d844f0df44baf");
                } else {
                    b.a().a(a.this.m, a.this.b);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92e4a73783d0164b4724e326a3b0abd6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92e4a73783d0164b4724e326a3b0abd6");
                } else {
                    b.a().b(a.this.m, a.this.b);
                }
            }
        });
        return frameLayout;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d99b2c9ca19de58b88039cb578ae6527", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d99b2c9ca19de58b88039cb578ae6527");
            return;
        }
        this.d = a("native-id");
        this.e = a("template-id");
        this.f = a("template-data");
        this.g = a("context");
        com.sankuai.waimai.foundation.utils.log.a.b("MachEmbed", "EmbedComponent#onBind::mNativeId=" + this.d + ",mTemplateId=" + this.e + ",mTemplateData=" + this.f, new Object[0]);
    }
}
