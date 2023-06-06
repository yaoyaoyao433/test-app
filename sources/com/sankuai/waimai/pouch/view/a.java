package com.sankuai.waimai.pouch.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.f;
import com.sankuai.waimai.mach.g;
import com.sankuai.waimai.mach.manager.cache.e;
import com.sankuai.waimai.mach.manager.load.a;
import com.sankuai.waimai.mach.recycler.h;
import com.sankuai.waimai.pouch.mach.container.a;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import com.sankuai.waimai.pouch.view.PouchAdView;
import com.tencent.rtmp.TXLiveConstants;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T extends com.sankuai.waimai.pouch.mach.container.a> implements PouchAdView {
    public static ChangeQuickRedirect b;
    private PouchDynamicAd a;
    protected ViewGroup c;
    protected T d;
    protected com.sankuai.waimai.pouch.model.c e;
    protected boolean f;
    protected PouchAdView.a g;
    protected PouchAdView.b h;
    protected String i;
    private long j;
    private long k;
    private Context l;
    private Rect m;
    private com.sankuai.waimai.mach.recycler.b n;
    private com.sankuai.waimai.mach.recycler.c o;

    public abstract void a(int i, String str);

    public abstract void a(int i, String str, boolean z);

    public abstract void a(Context context, com.sankuai.waimai.pouch.model.c cVar, PouchDynamicAd pouchDynamicAd, com.sankuai.waimai.pouch.a aVar);

    public abstract void a(String str, String str2, boolean z);

    public abstract void a(String str, Map<String, Object> map);

    public abstract void b(int i, String str, boolean z);

    public abstract int d();

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfec4b4cb2d5ae736a2f0bd229e097bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfec4b4cb2d5ae736a2f0bd229e097bf");
        } else {
            this.f = false;
        }
    }

    public static /* synthetic */ ViewGroup.LayoutParams c(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "71fc9b2572d9b32c125c6fd8a29aa5c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "71fc9b2572d9b32c125c6fd8a29aa5c0");
        }
        if (aVar.c instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (((LinearLayout) aVar.c).getOrientation() == 0) {
                layoutParams.leftMargin = aVar.c.getWidth() * (-1);
                return layoutParams;
            }
            layoutParams.topMargin = aVar.c.getHeight() * (-1);
            return layoutParams;
        }
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void a(Context context, ViewGroup viewGroup, com.sankuai.waimai.pouch.model.c cVar, PouchDynamicAd pouchDynamicAd, com.sankuai.waimai.pouch.a aVar, String str) {
        Object[] objArr = {context, viewGroup, cVar, pouchDynamicAd, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afcd5df954ba3a1296be1ab660b3ecc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afcd5df954ba3a1296be1ab660b3ecc4");
            return;
        }
        this.l = context;
        this.c = viewGroup;
        this.e = cVar;
        a(context, cVar, pouchDynamicAd, aVar);
        this.i = str;
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void a(Context context, com.sankuai.waimai.pouch.model.c cVar, PouchDynamicAd pouchDynamicAd, com.sankuai.waimai.pouch.a aVar, String str) {
        Object[] objArr = {context, cVar, pouchDynamicAd, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8076e965433833da9e1b03ad53b5f622", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8076e965433833da9e1b03ad53b5f622");
            return;
        }
        this.l = context;
        this.e = cVar;
        a(context, cVar, pouchDynamicAd, aVar);
        this.i = str;
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void a(Activity activity, com.sankuai.waimai.mach.recycler.b bVar, final PouchDynamicAd pouchDynamicAd) {
        Object[] objArr = {activity, bVar, pouchDynamicAd};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "562c421f9b7296ac42f23a870ffcdba9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "562c421f9b7296ac42f23a870ffcdba9");
            return;
        }
        this.n = bVar;
        String c = c(pouchDynamicAd);
        long currentTimeMillis = System.currentTimeMillis();
        com.sankuai.waimai.pouch.monitor.c.a(c, "dataParse_start");
        Map<String, Object> a = com.sankuai.waimai.mach.utils.b.a(pouchDynamicAd.stringData);
        if (a != null && !a.isEmpty()) {
            a.put("use_pouch", "1");
            a.put("index", Integer.valueOf(pouchDynamicAd.index));
        }
        com.sankuai.waimai.pouch.monitor.c.a(c, "dataParse_end");
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        Object[] objArr2 = {"WMPouchDataParsePerformanceTime", pouchDynamicAd, new Long(currentTimeMillis2)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.pouch.monitor.c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "71b55315db3d8ece581ab58bb7fde43a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "71b55315db3d8ece581ab58bb7fde43a");
        } else {
            com.sankuai.waimai.pouch.monitor.c.a("WMPouchDataParsePerformanceTime", pouchDynamicAd, currentTimeMillis2, false);
        }
        Mach.a aVar = new Mach.a();
        aVar.b = this.l;
        aVar.f = new g() { // from class: com.sankuai.waimai.pouch.view.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.g
            public final void a(int i) {
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(com.sankuai.waimai.mach.node.a aVar2) {
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(String str, String str2) {
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "caf43303a52914c91d9af340d8b0c8a7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "caf43303a52914c91d9af340d8b0c8a7");
                    return;
                }
                if (a.this.l()) {
                    a.this.d.F.e();
                }
                if (a.this.g != null) {
                    a.this.g.a();
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void b() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8eb548fcc89ca142997f9cbc5fc886f4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8eb548fcc89ca142997f9cbc5fc886f4");
                    return;
                }
                a.this.a(pouchDynamicAd, true);
                if (a.this.l()) {
                    a.this.d.F.d();
                }
                if (a.this.g != null) {
                    a.this.g.c();
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(int i, Throwable th) {
                Object[] objArr3 = {Integer.valueOf(i), th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1738a529596c5371c7a804c38cb710cc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1738a529596c5371c7a804c38cb710cc");
                    return;
                }
                if (a.this.l()) {
                    a.this.d.F.a();
                }
                if (a.this.g != null) {
                    a.this.g.b();
                }
                if (th != null) {
                    com.sankuai.waimai.foundation.utils.log.a.e("AbsWMPouchAdMachView", "pre render fail, msg:" + th.getMessage(), new Object[0]);
                    com.sankuai.waimai.pouch.monitor.c.a(th.getMessage(), pouchDynamicAd);
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.e("AbsWMPouchAdMachView", "pre render fail, code:" + i, new Object[0]);
                com.sankuai.waimai.pouch.monitor.c.a("failed code:" + i, pouchDynamicAd);
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(Throwable th) {
                Object[] objArr3 = {th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "afa4eb03da4e126d0972e181db8ecf1e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "afa4eb03da4e126d0972e181db8ecf1e");
                } else if (a.this.l()) {
                    a.this.d.F.a();
                }
            }
        };
        this.d.a(aVar);
        String str = this.e != null ? this.e.e : "";
        String str2 = (this.e == null || this.e.f == null) ? "waimai" : this.e.f;
        if (l()) {
            this.d.F.g();
        }
        h a2 = bVar.a(pouchDynamicAd.adTemplateId, pouchDynamicAd.defaultAdContainerId, str, null, 5000);
        if (a2 != null) {
            this.o = new com.sankuai.waimai.mach.recycler.c(pouchDynamicAd.adTemplateId, a2, aVar, str, str2);
            if (l()) {
                this.d.F.f();
            }
            this.o.h = new f() { // from class: com.sankuai.waimai.pouch.view.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.f
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "895cdd0f6d699f524f70654a7e0ecd76", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "895cdd0f6d699f524f70654a7e0ecd76");
                    } else if (a.this.l()) {
                        a.this.d.F.e();
                    }
                }
            };
            this.n.a(activity, this.o, com.sankuai.waimai.foundation.utils.g.a((Context) activity), 0, a, str);
            Mach l = this.o.l();
            if (l != null) {
                l.registerJsEventCallback(new Mach.d() { // from class: com.sankuai.waimai.pouch.view.a.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.Mach.d
                    public final void a(@NonNull String str3, @Nullable Map<String, Object> map) {
                        Object[] objArr3 = {str3, map};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f55feef5ab26cd30848f56b7754286c0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f55feef5ab26cd30848f56b7754286c0");
                        } else {
                            a.this.d.a(str3, map);
                        }
                    }
                });
                l.registerLifecycleObserver(this.d);
            }
            a(l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa4d3bc50aca148e61fb2e7eb4d5d239", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa4d3bc50aca148e61fb2e7eb4d5d239")).booleanValue() : (this.d == null || this.d.F == null) ? false : true;
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void a(ViewGroup viewGroup, PouchDynamicAd pouchDynamicAd) {
        boolean z;
        Object[] objArr = {viewGroup, pouchDynamicAd};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77035760bc3e3a46598b23cffd102141", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77035760bc3e3a46598b23cffd102141");
        } else if (viewGroup == null || pouchDynamicAd == null) {
        } else {
            this.c = viewGroup;
            this.d.a(viewGroup);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.pouch.c.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d55aefd35492df8064544805e4fe2405", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d55aefd35492df8064544805e4fe2405")).booleanValue();
            } else {
                z = com.sankuai.waimai.pouch.c.b != null && com.sankuai.waimai.pouch.c.a() && com.sankuai.waimai.pouch.c.b.d;
            }
            if (z) {
                com.sankuai.waimai.foundation.utils.log.a.b("AbsWMPouchAdMachView", "force pre render fail", new Object[0]);
                this.o = null;
            }
            if (this.o == null || this.n == null || this.o.b() == null) {
                if (this.o == null || this.n == null) {
                    com.sankuai.waimai.foundation.utils.log.a.e("AbsWMPouchAdMachView", "pre render fail, mMachLogicListItem or mMachRecycler is null", new Object[0]);
                    com.sankuai.waimai.pouch.monitor.c.a("mMachLogicListItem or mMachRecycler is null", pouchDynamicAd);
                } else if (this.o.b() == null) {
                    com.sankuai.waimai.foundation.utils.log.a.e("AbsWMPouchAdMachView", "pre render fail, rootNode is null", new Object[0]);
                    com.sankuai.waimai.pouch.monitor.c.a("RootNode is null", pouchDynamicAd);
                }
                this.f = false;
                a(pouchDynamicAd, (com.sankuai.waimai.pouch.model.b<e>) null, true, false);
                return;
            }
            String c = c(pouchDynamicAd);
            long currentTimeMillis = System.currentTimeMillis();
            com.sankuai.waimai.mach.recycler.c cVar = this.o;
            this.n.a(cVar);
            com.sankuai.waimai.mach.recycler.c a = this.n.a(cVar.a());
            com.sankuai.waimai.pouch.monitor.c.a(c, "machTemplateRender_start");
            this.n.a(viewGroup, cVar, a);
            a(pouchDynamicAd.adType, pouchDynamicAd.adTemplateId, true);
            com.sankuai.waimai.pouch.monitor.c.a(c, "machTemplateRender_end");
            long currentTimeMillis2 = System.currentTimeMillis();
            long j = currentTimeMillis2 - currentTimeMillis;
            com.sankuai.waimai.pouch.monitor.c.a("WMPouchTemplateLoadPerformanceTime", pouchDynamicAd, System.currentTimeMillis() - currentTimeMillis2, true);
            com.sankuai.waimai.pouch.monitor.c.a("WMPouchPerformanceTime", pouchDynamicAd, j, true);
            com.sankuai.waimai.pouch.monitor.c.a("WMPouchTemplateRenderPerformanceTime", pouchDynamicAd, j, true);
            if (this.c != null) {
                this.c.post(new Runnable() { // from class: com.sankuai.waimai.pouch.view.a.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "53ec02f70a82c0ee7ecc2bfe35261960", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "53ec02f70a82c0ee7ecc2bfe35261960");
                            return;
                        }
                        if (a.this.l()) {
                            a.this.d.F.d();
                        }
                        if (a.this.g != null) {
                            a.this.g.c();
                        }
                    }
                });
            }
            a(pouchDynamicAd, true);
        }
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8d11250655cfeed45fc7adad63d801f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8d11250655cfeed45fc7adad63d801f");
        } else if (this.n == null || this.o == null) {
        } else {
            this.n.b(this.o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull final PouchDynamicAd pouchDynamicAd, final boolean z) {
        Object[] objArr = {pouchDynamicAd, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54d4e2dc4655528b7bd83dd148df0616", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54d4e2dc4655528b7bd83dd148df0616");
        } else if (this.l == null || !com.sankuai.waimai.pouch.c.b()) {
        } else {
            this.c.post(new Runnable() { // from class: com.sankuai.waimai.pouch.view.a.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "444694ce3bf7802ef1baf30ffde20133", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "444694ce3bf7802ef1baf30ffde20133");
                        return;
                    }
                    final TextView textView = new TextView(a.this.l);
                    textView.setTextSize(10.0f);
                    textView.setTextColor(Color.rgb(5, 27, 101));
                    textView.setBackgroundColor(Color.argb((int) TXLiveConstants.RENDER_ROTATION_180, 42, 125, 193));
                    textView.setMaxLines(1);
                    int a2 = com.sankuai.waimai.foundation.utils.g.a(a.this.l, 3.0f);
                    textView.setPadding(a2, 0, a2, 0);
                    String str = pouchDynamicAd.adContainerId != null ? pouchDynamicAd.adContainerId : pouchDynamicAd.defaultAdContainerId;
                    StringBuilder sb = new StringBuilder("[Pouch] ");
                    if (str == null) {
                        str = "";
                    }
                    sb.append(str);
                    String sb2 = sb.toString();
                    if (z) {
                        sb2 = sb2 + " | by pre-render";
                    }
                    textView.setText(sb2);
                    a.this.c.addView(textView, a.c(a.this));
                    textView.post(new Runnable() { // from class: com.sankuai.waimai.pouch.view.a.5.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "07c8dd66373633bc51d3156fb14559ef", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "07c8dd66373633bc51d3156fb14559ef");
                                return;
                            }
                            TextView textView2 = textView;
                            int height = a.this.c.getHeight() - textView.getHeight();
                            Object[] objArr4 = {Float.valueOf(10.0f)};
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.pouch.util.b.a;
                            textView2.setTranslationY(height - (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "4313a638f0f899e3d6f86040aafca6b4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "4313a638f0f899e3d6f86040aafca6b4")).intValue() : (int) ((Resources.getSystem().getDisplayMetrics().density * 10.0f) + 0.5f)));
                        }
                    });
                }
            });
        }
    }

    private void a(@Nullable Mach mach) {
        String str;
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "332855876af7a34dcf89f375f9dd1f10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "332855876af7a34dcf89f375f9dd1f10");
        } else if (this.f || this.d == null) {
        } else {
            this.f = true;
            str = "default";
            String str2 = "waimai";
            if (this.e != null) {
                str = this.e.e != null ? this.e.e : "default";
                if (this.e.f != null) {
                    str2 = this.e.f;
                }
            }
            this.d.a(this.a);
            if (mach == null) {
                this.d.a(this.c, str, str2);
            } else {
                this.d.a(mach, str, str2);
            }
        }
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void a(PouchDynamicAd pouchDynamicAd, @Nullable com.sankuai.waimai.pouch.model.b bVar) {
        Object[] objArr = {pouchDynamicAd, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7372708f3e9af95c64f1b1c5aa448763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7372708f3e9af95c64f1b1c5aa448763");
        } else {
            a(pouchDynamicAd, (com.sankuai.waimai.pouch.model.b<e>) bVar, false, false);
        }
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void a(PouchDynamicAd pouchDynamicAd) {
        Object[] objArr = {pouchDynamicAd};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a66b44c4f3b85afa36a888b07622bbe9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a66b44c4f3b85afa36a888b07622bbe9");
        } else {
            a(pouchDynamicAd, (com.sankuai.waimai.pouch.model.b<e>) null, false, true);
        }
    }

    private void a(final PouchDynamicAd pouchDynamicAd, @Nullable com.sankuai.waimai.pouch.model.b<e> bVar, final boolean z, boolean z2) {
        Object[] objArr = {pouchDynamicAd, bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3e6a12f3020967d1186fce4d0d81d15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3e6a12f3020967d1186fce4d0d81d15");
        } else if (pouchDynamicAd == null) {
            a(4, "ad data is null");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            this.k = currentTimeMillis;
            this.j = currentTimeMillis;
            final String c = c(pouchDynamicAd);
            com.sankuai.waimai.pouch.monitor.c.a(c, "dataParse_start");
            this.a = pouchDynamicAd;
            a((Mach) null);
            String str = pouchDynamicAd.stringData;
            final Map<String, Object> b2 = TextUtils.isEmpty(str) ? null : com.sankuai.waimai.pouch.util.c.b(str);
            com.sankuai.waimai.pouch.monitor.c.a(c, "dataParse_end");
            long currentTimeMillis2 = System.currentTimeMillis();
            this.k = currentTimeMillis2;
            com.sankuai.waimai.pouch.monitor.c.a("WMPouchDataParsePerformanceTime", pouchDynamicAd, currentTimeMillis2 - this.k, z);
            final String str2 = pouchDynamicAd.adTemplateId;
            if ((!TextUtils.isEmpty(str2) || (bVar != null && bVar.a() != null)) && b2 != null && !b2.isEmpty()) {
                b2.put("index", Integer.valueOf(pouchDynamicAd.index));
                b2.put("use_pouch", "1");
                if (this.c != null) {
                    this.c.setVisibility(0);
                }
                a(str2, b2);
                if (bVar == null || bVar.a() == null) {
                    int d = d();
                    if (d <= 0) {
                        com.sankuai.waimai.mach.manager.a.a();
                        d = 5000;
                    }
                    String str3 = "waimai";
                    if (this.e != null && !TextUtils.isEmpty(this.e.f)) {
                        str3 = this.e.f;
                    }
                    a.C1015a c1015a = new a.C1015a();
                    c1015a.b = str2;
                    c1015a.d = this.e == null ? "" : this.e.e;
                    c1015a.e = str3;
                    com.sankuai.waimai.mach.manager.load.a a = c1015a.a(d).a();
                    com.sankuai.waimai.pouch.monitor.c.a(c, "machTemplateLoad_start");
                    if (z2) {
                        this.d.a(str2, pouchDynamicAd.defaultID, b2, 0, 0);
                        com.sankuai.waimai.pouch.monitor.c.a(c, "machTemplateLoad_end");
                        long currentTimeMillis3 = System.currentTimeMillis();
                        this.k = currentTimeMillis3;
                        com.sankuai.waimai.pouch.monitor.c.a("WMPouchTemplateLoadPerformanceTime", pouchDynamicAd, currentTimeMillis3 - this.k, z);
                        com.sankuai.waimai.pouch.monitor.c.a(c, "machTemplateRender_start");
                    } else {
                        this.d.a(a, new com.sankuai.waimai.mach.container.c() { // from class: com.sankuai.waimai.pouch.view.a.6
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.mach.container.c
                            public final void a(@NonNull e eVar) {
                                Object[] objArr2 = {eVar};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fb8bb07222757fabc7b9b21a6e05292", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fb8bb07222757fabc7b9b21a6e05292");
                                    return;
                                }
                                com.sankuai.waimai.pouch.monitor.c.a(c, "machTemplateLoad_end");
                                long currentTimeMillis4 = System.currentTimeMillis();
                                a.this.k = currentTimeMillis4;
                                com.sankuai.waimai.pouch.monitor.c.a("WMPouchTemplateLoadPerformanceTime", pouchDynamicAd, currentTimeMillis4 - a.this.k, z);
                                com.sankuai.waimai.pouch.monitor.c.a(c, "machTemplateRender_start");
                                if (a.this.h != null) {
                                    a.this.h.a();
                                }
                                a.this.d.a(eVar, b2);
                            }

                            @Override // com.sankuai.waimai.mach.container.c
                            public final void a(@NonNull com.sankuai.waimai.mach.manager.load.b bVar2) {
                                Object[] objArr2 = {bVar2};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22c0a3e773f606241258aa9dd5934c81", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22c0a3e773f606241258aa9dd5934c81");
                                    return;
                                }
                                com.sankuai.waimai.pouch.monitor.c.a(c);
                                if (bVar2 != null) {
                                    a.this.a(str2, bVar2.a(), z);
                                    if (a.this.h != null) {
                                        a.this.h.a(bVar2.a());
                                    }
                                }
                                if (a.this.c != null) {
                                    a.this.c.post(new Runnable() { // from class: com.sankuai.waimai.pouch.view.a.6.1
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr3 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect3 = a;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "be23805132ac0bc01389624cc3d80255", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "be23805132ac0bc01389624cc3d80255");
                                            } else {
                                                a.this.c.removeAllViews();
                                            }
                                        }
                                    });
                                }
                            }
                        });
                    }
                } else {
                    com.sankuai.waimai.pouch.monitor.c.a(c, "machTemplateRender_start");
                    this.d.a(bVar.a(), b2);
                }
                this.d.a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.pouch.view.a.7
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                    public final void e() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc5d3bd39db00b2d1cfd1536c98e181a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc5d3bd39db00b2d1cfd1536c98e181a");
                            return;
                        }
                        super.e();
                        String str4 = c;
                        Object[] objArr3 = {str4, "machTemplateRender_end", (byte) 1};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.pouch.monitor.c.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "0f9ff0d3c3f7abd31da3cc993b4aed90", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "0f9ff0d3c3f7abd31da3cc993b4aed90");
                        } else if (!TextUtils.isEmpty(str4)) {
                            MetricsSpeedMeterTask customSpeedMeterTask = MetricsSpeedMeterTask.getCustomSpeedMeterTask(str4);
                            if (customSpeedMeterTask == null) {
                                customSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask(str4, true);
                            }
                            if (customSpeedMeterTask != null) {
                                customSpeedMeterTask.recordStep("machTemplateRender_end");
                                com.sankuai.meituan.takeoutnew.util.aop.h.a(customSpeedMeterTask);
                                MetricsSpeedMeterTask.removeCustomSpeedMeterTask(str4);
                            }
                        }
                        long currentTimeMillis4 = System.currentTimeMillis();
                        a.this.k = currentTimeMillis4;
                        com.sankuai.waimai.pouch.monitor.c.a("WMPouchTemplateRenderPerformanceTime", pouchDynamicAd, currentTimeMillis4 - a.this.k, z);
                        com.sankuai.waimai.pouch.monitor.c.a("WMPouchPerformanceTime", pouchDynamicAd, System.currentTimeMillis() - a.this.j, z);
                        if (a.this.g != null) {
                            a.this.g.a();
                        }
                        if (a.this.a != null) {
                            a.this.a(a.this.a.adType, str2, z);
                        }
                    }

                    @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                    public final void d() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3214972161c261d105c72e7073d0e5b7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3214972161c261d105c72e7073d0e5b7");
                            return;
                        }
                        if (a.this.g != null) {
                            a.this.g.c();
                        }
                        a.this.a(a.this.a, false);
                    }

                    @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ff3f9808fd95819a7d3d25fbba8a1a2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ff3f9808fd95819a7d3d25fbba8a1a2");
                            return;
                        }
                        super.a();
                        com.sankuai.waimai.pouch.monitor.c.a(c);
                        if (a.this.c != null) {
                            a.this.c.post(new Runnable() { // from class: com.sankuai.waimai.pouch.view.a.7.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "552d37a84194dfffa73f94b93bdf66fd", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "552d37a84194dfffa73f94b93bdf66fd");
                                    } else {
                                        a.this.c.removeAllViews();
                                    }
                                }
                            });
                        }
                        if (a.this.g != null) {
                            a.this.g.b();
                        }
                        if (a.this.a != null) {
                            a.this.b(a.this.a.adType, str2, z);
                        }
                    }

                    @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                    public final void c() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe96285756187ec4e004944d4821292d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe96285756187ec4e004944d4821292d");
                        } else if (a.this.g != null) {
                            a.this.g.b();
                        }
                    }

                    @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                    public final void b() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c376234312d7e1c4a64061f8569d5030", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c376234312d7e1c4a64061f8569d5030");
                        } else if (a.this.g != null) {
                            a.this.g.b();
                        }
                    }
                });
                return;
            }
            if (this.c != null) {
                this.c.setVisibility(8);
            }
            if (TextUtils.isEmpty(str2) && this.a != null) {
                a(this.a.adType, "template id is empty");
            }
            if (b2 != null || this.a == null) {
                return;
            }
            a(this.a.adType, "ad data is empty");
        }
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void b(PouchDynamicAd pouchDynamicAd) {
        Object[] objArr = {pouchDynamicAd};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68549031b4300025e9b6929cf9905f53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68549031b4300025e9b6929cf9905f53");
        } else {
            a(pouchDynamicAd, (com.sankuai.waimai.pouch.model.b) null);
        }
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void a(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39736228a13b50330ca336b4773259cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39736228a13b50330ca336b4773259cb");
            return;
        }
        this.m = rect;
        if (this.d != null) {
            this.d.a(rect);
        }
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de0fca3a514636d9d5fa1e0d8fdd7356", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de0fca3a514636d9d5fa1e0d8fdd7356");
        } else if (this.f) {
            this.d.a(true);
        }
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46d7fb7340b9a7d0b3634101cd88d662", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46d7fb7340b9a7d0b3634101cd88d662");
        } else if (this.f) {
            this.d.a(false);
        }
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void h() {
        this.a = null;
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "978b97e7d815dcbe01b2b0676ee8055f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "978b97e7d815dcbe01b2b0676ee8055f");
        } else if (this.d != null) {
            this.d.d();
        }
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c33482e4c9bd6cdec0f534529703ac32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c33482e4c9bd6cdec0f534529703ac32");
        } else if (this.o != null) {
            this.o.e();
        }
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void a(Set set, String str) {
        Object[] objArr = {set, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd23688118f17d19b85851bf95312753", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd23688118f17d19b85851bf95312753");
        } else if (this.d != null) {
            this.d.a(set, str);
        }
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void a(com.sankuai.waimai.pouch.model.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22e034007738d9fbd57beae6caa57bef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22e034007738d9fbd57beae6caa57bef");
            return;
        }
        this.e = cVar;
        if (this.d != null) {
            this.d.a(cVar);
        }
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void a(com.sankuai.waimai.mach.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5c402c6773512153bd8910233cb555f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5c402c6773512153bd8910233cb555f");
        } else if (this.d != null) {
            this.d.a(bVar);
        }
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void a(com.sankuai.waimai.pouch.plugin.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "192b73cc0abcfb2190e15431693e8700", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "192b73cc0abcfb2190e15431693e8700");
        } else if (this.d != null) {
            this.d.a(bVar);
        }
    }

    private String c(PouchDynamicAd pouchDynamicAd) {
        Object[] objArr = {pouchDynamicAd};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0daa5028bb58c6b92416ca4d9c7b3f87", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0daa5028bb58c6b92416ca4d9c7b3f87");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("pouch_");
        if (pouchDynamicAd != null) {
            if (!TextUtils.isEmpty(pouchDynamicAd.adContainerId)) {
                sb.append(pouchDynamicAd.adContainerId);
                sb.append(CommonConstant.Symbol.UNDERLINE);
            } else if (!TextUtils.isEmpty(pouchDynamicAd.defaultAdContainerId)) {
                sb.append(pouchDynamicAd.defaultAdContainerId);
                sb.append(CommonConstant.Symbol.UNDERLINE);
            }
            sb.append(pouchDynamicAd.adTemplateId);
            sb.append(CommonConstant.Symbol.UNDERLINE);
            sb.append(pouchDynamicAd.businessName);
        }
        return sb.toString();
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    @CallSuper
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8d4d75185258e16d25647df2ee53068", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8d4d75185258e16d25647df2ee53068");
        } else if (this.o != null) {
            this.o.f();
        }
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final com.sankuai.waimai.pouch.mach.container.a k() {
        return this.d;
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public void a(PouchAdView.a aVar) {
        this.g = aVar;
    }

    @Override // com.sankuai.waimai.pouch.view.PouchAdView
    public final void a(PouchAdView.b bVar) {
        this.h = bVar;
    }
}
