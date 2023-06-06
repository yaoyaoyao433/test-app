package com.sankuai.waimai.ad.interact;

import android.app.Activity;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.Context;
import android.graphics.Rect;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.dianping.titans.js.jshandler.CaptureJsHandler;
import com.meituan.android.ptcommonim.protocol.message.PTIMMessageBeanEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.component.base.a;
import com.sankuai.waimai.mach.node.a;
import com.sankuai.waimai.pouch.monitor.d;
import com.sankuai.waimai.pouch.monitor.e;
import com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin;
import com.sankuai.waimai.pouch.viewmodel.PouchViewModel;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a<T extends com.sankuai.waimai.mach.component.base.a> extends AbsWMPouchInteractPlugin {
    public static ChangeQuickRedirect a;
    private List<a<T>.AbstractC0678a<T>> b;
    private PouchViewModel c;
    private Context d;
    private View e;
    private boolean f;
    private Mach g;
    private l<Void> h;

    public abstract a<T>.AbstractC0678a<T> a(T t);

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void a() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void a(String str, int i, Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void b() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onReceiveJSEvent(String str, Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onRenderFailed() {
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3082a474808ef650b21dbf8cba3ae4da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3082a474808ef650b21dbf8cba3ae4da");
            return;
        }
        this.b = new ArrayList();
        this.f = false;
        this.h = new l<Void>() { // from class: com.sankuai.waimai.ad.interact.a.1
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(Void r12) {
                Object[] objArr2 = {r12};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "968fa15a06755eb3806f44b489a25d3c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "968fa15a06755eb3806f44b489a25d3c");
                } else if (a.this.d != null) {
                    if (a.b(a.this)) {
                        if (!a.this.f) {
                            a.this.f = true;
                        }
                        a.this.h();
                    } else if (a.this.f) {
                        a.this.g();
                        a.this.f = false;
                    }
                }
            }
        };
    }

    public static /* synthetic */ boolean b(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "f2047fbe442f48cd6c3cf83a140bdfbc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "f2047fbe442f48cd6c3cf83a140bdfbc")).booleanValue();
        }
        if (aVar.e == null || aVar.e.getHeight() == 0) {
            return false;
        }
        return ah.b(aVar.e);
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onViewAttached(View view, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d79bf520807554327e3e97ea9597b43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d79bf520807554327e3e97ea9597b43");
        } else if (aVar == null) {
            com.sankuai.waimai.foundation.utils.log.a.b("ZoneCheckPlugin", "rootNode is null !", new Object[0]);
        } else {
            if (this.g == null) {
                this.g = aVar.f;
            }
            this.e = view;
            this.d = aVar.b;
            if (this.c == null) {
                Activity activity = this.g != null ? this.g.getActivity() : null;
                if (activity instanceof FragmentActivity) {
                    this.c = (PouchViewModel) q.a((FragmentActivity) activity).a(PouchViewModel.class);
                }
                if (this.c != null) {
                    this.c.c().a(this.h);
                }
            }
            if (this.b != null) {
                this.b.clear();
            }
            final Class<T> i = i();
            if (i == null) {
                return;
            }
            com.sankuai.waimai.mach.node.a.a(aVar, new a.InterfaceC1019a() { // from class: com.sankuai.waimai.ad.interact.a.2
                public static ChangeQuickRedirect a;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
                public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                    AbstractC0678a a2;
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70d0ab43a0957504e3b431e19252e483", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70d0ab43a0957504e3b431e19252e483");
                    } else if (aVar2 == null || !i.isInstance(aVar2.h) || (a2 = a.this.a((a) ((com.sankuai.waimai.mach.component.base.a) i.cast(aVar2.h)))) == null) {
                    } else {
                        a.this.b.add(a2);
                        if (a.b(a.this)) {
                            a2.b();
                        }
                    }
                }
            });
            if (ah.b(this.e)) {
                this.f = true;
            }
            if (this.e == null || !this.e.isLayoutRequested()) {
                return;
            }
            this.e.post(new Runnable() { // from class: com.sankuai.waimai.ad.interact.a.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e525de9e30ff8f16c39dd29c5561c2d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e525de9e30ff8f16c39dd29c5561c2d");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b("ZoneCheckPlugin", "check size: " + a.this.e.getHeight(), new Object[0]);
                    a.this.h();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c06c35b688656347156f700160759b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c06c35b688656347156f700160759b7");
        } else if (this.b != null && !this.b.isEmpty()) {
            for (int i = 0; i < this.b.size(); i++) {
                this.b.get(i).a(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "291120ebd50376f91754efe6bb4e1fa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "291120ebd50376f91754efe6bb4e1fa8");
        } else if (this.e != null && this.d != null) {
            for (int i = 0; i < this.b.size(); i++) {
                this.b.get(i).b();
            }
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe91f724eb99db5afaa1df4124eaf4b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe91f724eb99db5afaa1df4124eaf4b7");
            return;
        }
        g();
        if (this.c != null) {
            this.c.c().b(this.h);
        }
        if (this.b != null) {
            this.b.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f3506df4e9a3477db9b9b423f7167d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f3506df4e9a3477db9b9b423f7167d0");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_info", str);
            HashMap hashMap = new HashMap();
            hashMap.put("error_info", str);
            if (this.g != null && this.g.getMachBundle() != null) {
                jSONObject.put(PTIMMessageBeanEntity.DATA_KEY_TEMPLATE, this.g.getMachBundle().j + ", " + this.g.getMachBundle().a());
                hashMap.put(PTIMMessageBeanEntity.DATA_KEY_TEMPLATE, this.g.getMachBundle().j + ", " + this.g.getMachBundle().a());
            }
            e.a(new d().a(!TextUtils.isEmpty(this.capabilityID) ? this.capabilityID : "zone_check_plugin").b("data_parse_error").d(jSONObject.toString()).a(true).b(), hashMap);
            com.sankuai.waimai.foundation.utils.log.a.e("ZoneCheckPlugin", str, new Object[0]);
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56c6167fffdc2de39c0bcab8d6978b6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56c6167fffdc2de39c0bcab8d6978b6f");
            return;
        }
        g();
        if (this.c != null) {
            this.c.c().b(this.h);
        }
        if (this.b != null) {
            this.b.clear();
        }
    }

    private Class<T> i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cefb971d62c5485b28392ac36b5cb261", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cefb971d62c5485b28392ac36b5cb261");
        }
        try {
            return (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        } catch (Error | Exception e) {
            a(e.toString());
            return null;
        }
    }

    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "378c787504e427b32e11dea3180d0167", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "378c787504e427b32e11dea3180d0167");
        } else if (this.g == null) {
            com.sankuai.waimai.foundation.utils.log.a.b("ZoneCheckPlugin", "mach is null!!", new Object[0]);
        } else if (TextUtils.isEmpty(str)) {
            com.sankuai.waimai.foundation.utils.log.a.b("ZoneCheckPlugin", "eventKey is null!!", new Object[0]);
        } else {
            com.sankuai.waimai.foundation.utils.log.a.b("ZoneCheckPlugin", "event: " + str, new Object[0]);
            this.g.sendJsEvent(str, map);
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43f635f4283c07dce06b6f892c79e0d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43f635f4283c07dce06b6f892c79e0d6");
        } else {
            g();
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchInteractPlugin
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09aeed93f7cbf454472018dee66ad164", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09aeed93f7cbf454472018dee66ad164");
        } else {
            h();
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onDetachedFromContainer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca2479141bf79f9d03685d16fb81f9e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca2479141bf79f9d03685d16fb81f9e1");
            return;
        }
        super.onDetachedFromContainer();
        com.sankuai.waimai.foundation.utils.log.a.b("ZoneCheckPlugin", "onDetachedFromContainer", new Object[0]);
        g();
        if (this.c != null) {
            this.c.c().b(this.h);
        }
        if (this.b != null) {
            this.b.clear();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.ad.interact.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public abstract class AbstractC0678a<K> {
        public static ChangeQuickRedirect a;
        protected K b;
        protected boolean c;
        protected float d;
        protected String e;
        protected String f;
        private float h;
        private int i;
        private boolean j;
        private boolean k;

        public abstract Map a();

        public abstract void c();

        public AbstractC0678a(K k) {
            Object[] objArr = {a.this, k};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f28bd7c8df78018d0540659691f33c8b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f28bd7c8df78018d0540659691f33c8b");
                return;
            }
            this.c = false;
            this.d = 1.0f;
            this.f = CaptureJsHandler.CAPTURE_TYPE_DEFAULT;
            this.j = false;
            this.k = false;
            this.b = k;
            d();
        }

        private void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a88bc70a7a14d606f818e19a5ab1c37a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a88bc70a7a14d606f818e19a5ab1c37a");
                return;
            }
            Map a2 = a();
            if (a2 != null) {
                this.j = true;
                if (a2.containsKey("triggerConditionPercent")) {
                    Object obj = a2.get("triggerConditionPercent");
                    if (!(obj instanceof String)) {
                        a.this.a("triggerConditionPercent type error");
                    } else {
                        try {
                            this.d = Float.parseFloat((String) obj);
                        } catch (Exception e) {
                            a.this.a(e.getMessage());
                        }
                    }
                }
                if (a2.containsKey("conditionMode")) {
                    Object obj2 = a2.get("conditionMode");
                    if (!(obj2 instanceof String)) {
                        a.this.a("conditionMode type error");
                    } else {
                        try {
                            this.f = (String) obj2;
                        } catch (Exception e2) {
                            a.this.a(e2.getMessage());
                        }
                    }
                }
                if (a2.containsKey("viewId")) {
                    Object obj3 = a2.get("viewId");
                    if (!(obj3 instanceof String)) {
                        a.this.a("viewId type error");
                    } else {
                        try {
                            this.e = (String) obj3;
                        } catch (Exception e3) {
                            a.this.a(e3.getMessage());
                        }
                    }
                }
            }
            e();
        }

        private void e() {
            Rect rect;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f50a135dc2f8b528a7cd97c2a254d9e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f50a135dc2f8b528a7cd97c2a254d9e9");
            } else if (a.this.e == null || a.this.e.getHeight() == 0) {
                com.sankuai.waimai.foundation.utils.log.a.b("ZoneCheckPlugin", "can not check size", new Object[0]);
            } else {
                this.k = true;
                this.i = a.this.e.getHeight() / 2;
                this.h = g.b(a.this.d);
                if (!"expose".equals(this.f) || a.this.pluginParams == null || ((com.sankuai.waimai.pouch.plugin.params.a) a.this.pluginParams).c == null || a.this.c == null || (rect = ((com.sankuai.waimai.pouch.plugin.params.a) a.this.pluginParams).c.i) == null) {
                    return;
                }
                if (rect.top <= 0) {
                    this.i -= a.this.c.g;
                    this.h = rect.height() - a.this.c.g;
                    return;
                }
                this.i -= rect.top;
                this.h = rect.height();
            }
        }

        public final void b() {
            float f;
            boolean z = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27c2f9f22c366ca15df32aced6ab06ab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27c2f9f22c366ca15df32aced6ab06ab");
                return;
            }
            if (!this.j) {
                d();
            }
            if (TextUtils.isEmpty(this.e)) {
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c153a4aed38f51843363393e6db82847", RobustBitConfig.DEFAULT_VALUE)) {
                f = ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c153a4aed38f51843363393e6db82847")).floatValue();
            } else if (a.this.e == null || a.this.e.getHeight() == 0) {
                f = 0.0f;
            } else {
                if (!this.k) {
                    e();
                }
                int[] iArr = new int[2];
                a.this.e.getLocationOnScreen(iArr);
                f = (iArr[1] + this.i) / this.h;
            }
            if (f > 0.0f && f <= this.d) {
                z = true;
            }
            if (this.c == z) {
                return;
            }
            this.c = z;
            c();
        }

        public final void a(boolean z) {
            Object[] objArr = {(byte) 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcd76521a6690728a055fa1088ec25c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcd76521a6690728a055fa1088ec25c6");
                return;
            }
            if (!this.j) {
                d();
            }
            if (!TextUtils.isEmpty(this.e) && this.c) {
                this.c = false;
                c();
            }
        }
    }
}
