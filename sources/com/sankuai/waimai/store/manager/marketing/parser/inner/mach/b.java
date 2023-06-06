package com.sankuai.waimai.store.manager.marketing.parser.inner.mach;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.manager.marketing.parser.b<View> implements e, com.sankuai.waimai.store.manager.sequence.popup.a {
    public static ChangeQuickRedirect a;
    String b;
    ViewGroup c;
    MachContainerFragment d;

    @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.e
    public final void b() {
    }

    @Override // com.sankuai.waimai.store.manager.marketing.parser.a
    public final /* synthetic */ Object a(@NonNull final Activity activity, @NonNull final com.sankuai.waimai.store.platform.marketing.a aVar, final com.sankuai.waimai.store.manager.sequence.a aVar2) {
        Object[] objArr = {activity, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c39750e7cd023a8ceab5b916c94c5611", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c39750e7cd023a8ceab5b916c94c5611");
        }
        if (t.a(aVar.b) || t.a(aVar.c) || !(activity instanceof FragmentActivity) || ((FragmentActivity) activity).getSupportFragmentManager() == null) {
            return null;
        }
        this.b = String.valueOf(hashCode());
        this.c = new FrameLayout(activity);
        this.c.setClickable(true);
        this.c.setVisibility(4);
        this.c.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sankuai.waimai.store.manager.marketing.parser.inner.mach.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ef87d14d1e92eb4f41ad679a09ef166", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ef87d14d1e92eb4f41ad679a09ef166");
                    return;
                }
                if (aVar2 != null) {
                    aVar2.a(aVar.b, b.this.b);
                }
                try {
                    b.this.d = new MachContainerFragment();
                    FragmentTransaction beginTransaction = ((FragmentActivity) activity).getSupportFragmentManager().beginTransaction();
                    b.this.d.c = b.this.c;
                    b.this.d.a(aVar);
                    b.this.d.d = b.this.b;
                    b.this.d.g = b.this.e();
                    b.this.d.e = aVar2;
                    b.this.d.f = b.this;
                    beginTransaction.add(b.this.d, "store.manager.marketing.parser.inner.mach.search").commitAllowingStateLoss();
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a423670db5c9f294329733b287d0970e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a423670db5c9f294329733b287d0970e");
                    return;
                }
                try {
                    ((FragmentActivity) activity).getSupportFragmentManager().beginTransaction().remove(b.this.d).commitAllowingStateLoss();
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }
        });
        this.c.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.c.setTag(this);
        return this.c;
    }

    @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6835982be5f05483a42a05d0e4b07228", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6835982be5f05483a42a05d0e4b07228");
        } else if (this.c != null) {
            this.c.setVisibility(8);
            if (this.c.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.c.getParent()).removeView(this.c);
            }
        }
    }

    @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.e
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85b3af86d2a6fc97ac2cfdbdd0dfb3e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85b3af86d2a6fc97ac2cfdbdd0dfb3e6");
        } else if (this.f != null) {
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("key_parser_type", 2);
            this.f.a(aVar, str, map);
        }
    }

    @Override // com.sankuai.waimai.store.manager.sequence.popup.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c6559b3e4dfbc54e7eb5a476c62d313", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c6559b3e4dfbc54e7eb5a476c62d313");
        } else {
            a();
        }
    }

    @Override // com.sankuai.waimai.store.manager.sequence.popup.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd2b7913ef8e2234199d8fb7b5e400d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd2b7913ef8e2234199d8fb7b5e400d6");
        } else if (this.d != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("close_type", 2);
            String e = e();
            if (e == null) {
                e = "";
            }
            hashMap.put("cid", e);
            this.d.a("dismiss", hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "776057b41557fef21863aa874807e585", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "776057b41557fef21863aa874807e585") : this.f != null ? this.f.d() : "";
    }
}
