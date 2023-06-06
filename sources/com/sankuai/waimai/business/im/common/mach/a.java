package com.sankuai.waimai.business.im.common.mach;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.c;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.model.value.k;
import com.sankuai.waimai.mach.parser.d;
import com.sankuai.waimai.mach.text.SizeSpec;
import com.sankuai.waimai.mach.utils.g;
import com.sankuai.xm.imui.common.processors.LinkProcessor;
import com.sankuai.xm.imui.common.view.LinkTextView;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.mach.component.base.a<LinkTextView> implements YogaMeasureFunction {
    public static ChangeQuickRedirect a;
    private d b;
    private LinkTextView c;
    private C0731a d;

    public static /* synthetic */ void a(a aVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "5e159d66f19caaa4fa012d8a8a521286", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "5e159d66f19caaa4fa012d8a8a521286");
        } else if (aVar.m == null || aVar.b == null) {
        } else {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            aVar.m.asyncCallJSMethod(aVar.b.b, linkedList);
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e20ccb70ded9ca65fe1dcb15782bb5ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e20ccb70ded9ca65fe1dcb15782bb5ff");
            return;
        }
        ac_().a((YogaMeasureFunction) this);
        if (k() != null && (k().get("@rich-text-click") instanceof d)) {
            this.b = (d) k().get("@rich-text-click");
        }
        this.d = new C0731a();
        this.d.a = a("content");
        this.d.b = a("link-color");
        this.d.c = a("text-color");
        this.d.d = (int) g.a(a("width"));
        this.d.e = g.a(a("text-size"));
        this.d.f = k.a(a(TextAlign.NAME));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.mach.component.base.a
    @NonNull
    /* renamed from: a */
    public LinkTextView b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feff3d389796db270b079340a64d1bc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinkTextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feff3d389796db270b079340a64d1bc5");
        }
        this.c = new LinkTextView(context);
        com.sankuai.xm.imui.common.processors.d dVar = new com.sankuai.xm.imui.common.processors.d();
        LinkProcessor linkProcessor = new LinkProcessor();
        linkProcessor.c = false;
        try {
            linkProcessor.b = Color.parseColor(this.d.b);
        } catch (Exception unused) {
        }
        dVar.a(linkProcessor);
        try {
            this.c.setTextColor(Color.parseColor(this.d.c));
        } catch (Exception unused2) {
        }
        this.c.setTextSize(this.d.e);
        this.c.setText(dVar.a(this.d.a));
        this.c.setWidth(com.sankuai.waimai.foundation.utils.g.a(context, this.d.d));
        int i = this.d.f != null ? 0 | this.d.f.i : 0;
        if (i != 0) {
            this.c.setGravity(i);
        } else {
            this.c.setGravity(16);
        }
        this.c.setOnLinkClickListener(new LinkTextView.b() { // from class: com.sankuai.waimai.business.im.common.mach.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.imui.common.view.LinkTextView.b
            public final boolean a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82c924a958afe47b7fc71e7742e29605", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82c924a958afe47b7fc71e7742e29605")).booleanValue();
                }
                a.a(a.this, str);
                return true;
            }
        });
        return this.c;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.im.common.mach.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0731a {
        String a;
        String b;
        String c;
        int d;
        float e;
        k f;

        public C0731a() {
        }
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public final long measure(com.facebook.yoga.d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        Object[] objArr = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af282307525fa865eb4df974c9ea9604", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af282307525fa865eb4df974c9ea9604")).longValue();
        }
        Activity activity = this.m.getActivity();
        int a2 = SizeSpec.a(f, yogaMeasureMode);
        int a3 = SizeSpec.a(f2, yogaMeasureMode2);
        LinkTextView linkTextView = new LinkTextView(activity);
        com.sankuai.xm.imui.common.processors.d dVar2 = new com.sankuai.xm.imui.common.processors.d();
        LinkProcessor linkProcessor = new LinkProcessor();
        linkProcessor.c = false;
        dVar2.a(linkProcessor);
        linkTextView.setText(dVar2.a(this.d.a));
        linkTextView.setTextSize(this.d.e);
        linkTextView.measure(a2, a3);
        return c.a(com.sankuai.waimai.foundation.utils.g.a(activity, this.d.d), linkTextView.getMeasuredHeight());
    }
}
