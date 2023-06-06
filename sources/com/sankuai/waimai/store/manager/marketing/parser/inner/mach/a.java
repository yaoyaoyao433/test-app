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
public final class a extends com.sankuai.waimai.store.manager.marketing.parser.b<View> implements e, com.sankuai.waimai.store.manager.sequence.popup.a {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a40a8a9f6f7b7a4a5dce28ca5d2dee91", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a40a8a9f6f7b7a4a5dce28ca5d2dee91");
        }
        if (t.a(aVar.b) || t.a(aVar.c) || !(activity instanceof FragmentActivity) || ((FragmentActivity) activity).getSupportFragmentManager() == null) {
            return null;
        }
        this.b = String.valueOf(hashCode());
        this.c = new FrameLayout(activity);
        this.c.setClickable(true);
        this.c.setVisibility(4);
        this.c.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sankuai.waimai.store.manager.marketing.parser.inner.mach.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c0ba80d91130d5db4734d4d5d6da4de", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c0ba80d91130d5db4734d4d5d6da4de");
                    return;
                }
                if (aVar2 != null) {
                    aVar2.a(aVar.b, a.this.b);
                }
                try {
                    a.this.d = new MachContainerFragment();
                    FragmentTransaction beginTransaction = ((FragmentActivity) activity).getSupportFragmentManager().beginTransaction();
                    a.this.d.c = a.this.c;
                    a.this.d.a(aVar);
                    a.this.d.d = a.this.b;
                    a.this.d.g = a.this.e();
                    a.this.d.e = aVar2;
                    a.this.d.f = a.this;
                    beginTransaction.add(a.this.d, "store.manager.marketing.parser.inner.mach").commitAllowingStateLoss();
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60a2315e564cc6cf1cc07e0c3482f961", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60a2315e564cc6cf1cc07e0c3482f961");
                    return;
                }
                try {
                    ((FragmentActivity) activity).getSupportFragmentManager().beginTransaction().remove(a.this.d).commitAllowingStateLoss();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7f299f34d9734dbd225263a166cb1ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7f299f34d9734dbd225263a166cb1ab");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "423428d3ed4b1172da3bb07753cfb3be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "423428d3ed4b1172da3bb07753cfb3be");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4316380fb654d5e1e9f620e677a4c554", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4316380fb654d5e1e9f620e677a4c554");
        } else if (this.d != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("close_type", 3);
            String e = e();
            if (e == null) {
                e = "";
            }
            hashMap.put("cid", e);
            this.d.a("dismiss", hashMap);
        }
    }

    @Override // com.sankuai.waimai.store.manager.sequence.popup.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d05646431663df5f3b2e484e74e09ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d05646431663df5f3b2e484e74e09ed");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72befcda43067be7b15e6e51364e887b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72befcda43067be7b15e6e51364e887b") : this.f != null ? this.f.d() : "";
    }
}
