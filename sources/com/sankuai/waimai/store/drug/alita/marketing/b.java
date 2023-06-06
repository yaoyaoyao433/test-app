package com.sankuai.waimai.store.drug.alita.marketing;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.manager.marketing.parser.inner.mach.MachContainerFragment;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.manager.marketing.parser.b<View> implements com.sankuai.waimai.store.manager.marketing.parser.inner.mach.e, com.sankuai.waimai.store.manager.sequence.popup.a {
    public static ChangeQuickRedirect a;
    String b;
    com.sankuai.waimai.store.drug.alita.marketing.guesture.b c;
    MachContainerFragment d;
    boolean e;

    @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.e
    public final void b() {
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90f8e6e293ef21e582f68e480ddb3b51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90f8e6e293ef21e582f68e480ddb3b51");
        } else {
            this.e = true;
        }
    }

    @Override // com.sankuai.waimai.store.manager.marketing.parser.a
    public final /* synthetic */ Object a(@NonNull final Activity activity, @NonNull final com.sankuai.waimai.store.platform.marketing.a aVar, final com.sankuai.waimai.store.manager.sequence.a aVar2) {
        Object[] objArr = {activity, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "059fa1161583b32e76db5ffde0c0f7b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "059fa1161583b32e76db5ffde0c0f7b7");
        }
        if (t.a(aVar.b) || t.a(aVar.c) || !(activity instanceof FragmentActivity) || ((FragmentActivity) activity).getSupportFragmentManager() == null) {
            return null;
        }
        this.b = String.valueOf(hashCode());
        this.c = new com.sankuai.waimai.store.drug.alita.marketing.guesture.b(activity);
        this.c.setClickable(true);
        this.c.setVisibility(4);
        com.sankuai.waimai.store.drug.alita.marketing.guesture.a aVar3 = new com.sankuai.waimai.store.drug.alita.marketing.guesture.a(this.c, true);
        aVar3.i = new Runnable() { // from class: com.sankuai.waimai.store.drug.alita.marketing.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "622712e14a148ee8f9b777f73863f3cb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "622712e14a148ee8f9b777f73863f3cb");
                } else {
                    b.this.a();
                }
            }
        };
        if (this.e) {
            this.c.setGestureDelegate(aVar3);
        }
        this.c.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sankuai.waimai.store.drug.alita.marketing.b.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "913d49f5909d8fb61ac8e58fc365e369", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "913d49f5909d8fb61ac8e58fc365e369");
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
                    beginTransaction.add(b.this.d, "store.drug.alita.marketing").commitAllowingStateLoss();
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff4879acad8ac48abfb0fe4b2eb0b251", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff4879acad8ac48abfb0fe4b2eb0b251");
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
        this.c.setPadding(0, u.a(activity), 0, 0);
        this.c.setTag(this);
        return this.c;
    }

    @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aa4eb9a7f35ae96e6f7dd1f1975a186", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aa4eb9a7f35ae96e6f7dd1f1975a186");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae68cfb501d06c5d35c8914da019f25b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae68cfb501d06c5d35c8914da019f25b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74013c83734924bc12c0f2adc346688e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74013c83734924bc12c0f2adc346688e");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7960e702ca7bd164a48b612e7b19b7a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7960e702ca7bd164a48b612e7b19b7a7");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dae01f01fb6d7671c6a27056d0a47be", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dae01f01fb6d7671c6a27056d0a47be") : this.f != null ? this.f.d() : "";
    }
}
