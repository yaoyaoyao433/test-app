package com.sankuai.waimai.mach.component.swiper;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.d;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.component.swiper.SwiperContainer;
import com.sankuai.waimai.mach.component.swiper.recyclerview.ScaleLayoutManager;
import com.sankuai.waimai.mach.component.swiper.recyclerview.SwiperRecyclerView;
import com.sankuai.waimai.mach.utils.i;
import java.util.ArrayList;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b extends com.sankuai.waimai.mach.component.base.a<SwiperContainer> implements com.sankuai.waimai.mach.component.b, SwiperContainer.a, com.sankuai.waimai.mach.lifecycle.c {
    public static ChangeQuickRedirect a;
    public int b;
    private c c;
    private SwiperContainer d;

    @Override // com.sankuai.waimai.mach.lifecycle.c
    public final void a(boolean z) {
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final boolean ad_() {
        return false;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa7e577e31e994125b31af72377399a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa7e577e31e994125b31af72377399a7");
        } else {
            this.c = new c();
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(SwiperContainer swiperContainer) {
        boolean z;
        int i;
        int i2;
        int i3;
        float c;
        float c2;
        final SwiperContainer swiperContainer2 = swiperContainer;
        Object[] objArr = {swiperContainer2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63b177b69992585cccc6ce6d85745fb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63b177b69992585cccc6ce6d85745fb4");
            return;
        }
        super.a((b) swiperContainer2);
        this.d = swiperContainer2;
        String str = this.n.x;
        if (Constants.FPS_TYPE_SCROLL.equals(str) || "hidden".equals(str)) {
            swiperContainer2.setClipChildren(true);
        } else {
            swiperContainer2.setClipChildren(false);
        }
        swiperContainer2.setIndexChangedListener(this);
        c cVar = this.c;
        com.sankuai.waimai.mach.node.a<V> aVar = this.n;
        Object[] objArr2 = {cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = SwiperContainer.a;
        if (PatchProxy.isSupport(objArr2, swiperContainer2, changeQuickRedirect2, false, "4dab6d354166aa7844756e756fcdc523", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, swiperContainer2, changeQuickRedirect2, false, "4dab6d354166aa7844756e756fcdc523");
            return;
        }
        Object[] objArr3 = {aVar};
        ChangeQuickRedirect changeQuickRedirect3 = SwiperContainer.a;
        if (PatchProxy.isSupport(objArr3, swiperContainer2, changeQuickRedirect3, false, "c74a81b9684b5377afa3c854dd01d32b", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr3, swiperContainer2, changeQuickRedirect3, false, "c74a81b9684b5377afa3c854dd01d32b")).booleanValue();
        } else {
            z = (aVar == 0 || aVar.b() == null || aVar.b().size() <= 0) ? false : true;
        }
        if (!z || cVar == null) {
            return;
        }
        swiperContainer2.d = cVar;
        swiperContainer2.e = aVar;
        ArrayList arrayList = new ArrayList(aVar.b());
        d dVar = aVar.c;
        String str2 = swiperContainer2.d.b;
        if ("horizontal".equals(str2)) {
            if (dVar == null || dVar.c(YogaEdge.LEFT) == null) {
                i = 0;
                i2 = 0;
            } else {
                i2 = (int) dVar.c(YogaEdge.LEFT).d;
                i = (int) dVar.c(YogaEdge.RIGHT).d;
            }
            i3 = 0;
        } else {
            if (dVar == null || dVar.c(YogaEdge.TOP) == null) {
                i = 0;
                i2 = 0;
            } else {
                i2 = (int) dVar.c(YogaEdge.TOP).d;
                i = (int) dVar.c(YogaEdge.BOTTOM).d;
            }
            i3 = 1;
        }
        String str3 = aVar.b().get(0).w;
        c cVar2 = swiperContainer2.d;
        Object[] objArr4 = {str3};
        ChangeQuickRedirect changeQuickRedirect4 = c.a;
        if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "739372487a23fa42d71a361acbaeeca8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "739372487a23fa42d71a361acbaeeca8");
        } else if (!TextUtils.isEmpty(str3)) {
            int indexOf = str3.indexOf(StringUtil.SPACE);
            if (indexOf == -1) {
                cVar2.n = 0.5f;
            } else {
                String substring = str3.substring(0, indexOf);
                if (!"horizontal".equals(cVar2.b)) {
                    Object[] objArr5 = {substring};
                    ChangeQuickRedirect changeQuickRedirect5 = c.a;
                    char c3 = 65535;
                    if (PatchProxy.isSupport(objArr5, cVar2, changeQuickRedirect5, false, "0657b45db531ae64242106f270e5f87b", RobustBitConfig.DEFAULT_VALUE)) {
                        c2 = ((Float) PatchProxy.accessDispatch(objArr5, cVar2, changeQuickRedirect5, false, "0657b45db531ae64242106f270e5f87b")).floatValue();
                    } else if (!substring.contains("%")) {
                        int hashCode = substring.hashCode();
                        if (hashCode != 3317767) {
                            if (hashCode == 108511772 && substring.equals("right")) {
                                c3 = 1;
                            }
                        } else if (substring.equals("left")) {
                            c3 = 0;
                        }
                        switch (c3) {
                            case 0:
                                c2 = 0.0f;
                                break;
                            case 1:
                                c2 = 1.0f;
                                break;
                            default:
                                c2 = 0.5f;
                                break;
                        }
                    } else {
                        c2 = cVar2.c(substring);
                    }
                    cVar2.n = c2;
                } else {
                    char c4 = 65535;
                    cVar2.n = 0.5f;
                    String trim = str3.substring(indexOf + 1).trim();
                    if (!TextUtils.isEmpty(trim)) {
                        Object[] objArr6 = {trim};
                        ChangeQuickRedirect changeQuickRedirect6 = c.a;
                        if (PatchProxy.isSupport(objArr6, cVar2, changeQuickRedirect6, false, "dc62b165f438926e6be2986b147e9eda", RobustBitConfig.DEFAULT_VALUE)) {
                            c = ((Float) PatchProxy.accessDispatch(objArr6, cVar2, changeQuickRedirect6, false, "dc62b165f438926e6be2986b147e9eda")).floatValue();
                        } else if (!trim.contains("%")) {
                            int hashCode2 = trim.hashCode();
                            if (hashCode2 != -1383228885) {
                                if (hashCode2 == 115029 && trim.equals("top")) {
                                    c4 = 0;
                                }
                            } else if (trim.equals("bottom")) {
                                c4 = 1;
                            }
                            switch (c4) {
                                case 0:
                                    c = 0.0f;
                                    break;
                                case 1:
                                    c = 1.0f;
                                    break;
                                default:
                                    c = 0.5f;
                                    break;
                            }
                        } else {
                            c = cVar2.c(trim);
                        }
                        cVar2.o = c;
                    }
                }
            }
            cVar2.o = 0.5f;
        }
        ScaleLayoutManager.a aVar2 = new ScaleLayoutManager.a(swiperContainer2.getContext(), (int) aVar.b().get(0).c.a(YogaEdge.LEFT).d);
        aVar2.b = i3;
        aVar2.c = swiperContainer2.d.j;
        aVar2.d = swiperContainer2.d.k;
        aVar2.e = swiperContainer2.d.l;
        aVar2.f = swiperContainer2.d.m;
        aVar2.g = swiperContainer2.d.n;
        aVar2.h = swiperContainer2.d.o;
        aVar2.j = i2;
        aVar2.k = i;
        swiperContainer2.f = new ScaleLayoutManager(aVar2);
        boolean z2 = true;
        swiperContainer2.f.a((arrayList.size() == 1 || !swiperContainer2.d.g) ? false : false);
        swiperContainer2.f.m = new com.sankuai.waimai.mach.component.swiper.recyclerview.c() { // from class: com.sankuai.waimai.mach.component.swiper.SwiperContainer.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.component.swiper.recyclerview.c, com.sankuai.waimai.mach.component.swiper.recyclerview.ViewPagerLayoutManager.a
            public final void a(int i4) {
                Object[] objArr7 = {Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "926e2d118e292dd9351ca2610d2621e4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "926e2d118e292dd9351ca2610d2621e4");
                    return;
                }
                SwiperContainer.this.a(i4);
                if (!SwiperContainer.this.i) {
                    if (SwiperContainer.this.h != null) {
                        SwiperContainer.this.h.a(i4);
                        return;
                    }
                    return;
                }
                final int i5 = SwiperContainer.this.d.f;
                if (i5 != 0) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        SwiperContainer.this.b.scrollToPosition(i5);
                    } else {
                        SwiperContainer.this.b.post(new Runnable() { // from class: com.sankuai.waimai.mach.component.swiper.SwiperContainer.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr8 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "257b7624794a336e60d494ef75bce81b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "257b7624794a336e60d494ef75bce81b");
                                } else if (SwiperContainer.this.b != null) {
                                    SwiperContainer.this.b.scrollToPosition(i5);
                                }
                            }
                        });
                    }
                }
                SwiperContainer.a(SwiperContainer.this, false);
            }
        };
        int i4 = cVar.d <= 0 ? 2000 : cVar.d;
        swiperContainer2.b.setTimeInterval(i4);
        if (cVar.e > 0) {
            i4 = cVar.e;
        }
        swiperContainer2.b.setFirstInterval(i4);
        if (cVar.i > 0.0f) {
            swiperContainer2.b.setMinScrollOffset(cVar.i);
        }
        swiperContainer2.b.setDirection(str2);
        if (swiperContainer2.c == null) {
            swiperContainer2.c = new a(arrayList, aVar.f.getRenderEngine());
            swiperContainer2.b.setAdapter(swiperContainer2.c);
        } else {
            swiperContainer2.c.a(arrayList);
        }
        swiperContainer2.b.setScrollable(swiperContainer2.d.h);
        swiperContainer2.b.setIsAutoPlay(swiperContainer2.d.c);
        swiperContainer2.b.setLayoutManager(swiperContainer2.f);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    @NonNull
    public final /* synthetic */ SwiperContainer b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "799469a9a7f6ac315e428e787aadf7f6", RobustBitConfig.DEFAULT_VALUE) ? (SwiperContainer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "799469a9a7f6ac315e428e787aadf7f6") : new SwiperContainer(context);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b18bf70510a395e37eb073697fe01924", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b18bf70510a395e37eb073697fe01924");
            return;
        }
        c cVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "37db5f9878add4e9fb97f0006206d3a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "37db5f9878add4e9fb97f0006206d3a3");
        } else {
            cVar.b = "horizontal";
            cVar.c = true;
            cVar.d = 0;
            cVar.e = 0;
            cVar.f = 0;
            cVar.g = false;
            cVar.h = false;
            cVar.i = -1.0f;
            cVar.j = 1.0f;
            cVar.k = 1.0f;
            cVar.l = 0.0f;
            cVar.m = 0.0f;
            cVar.n = 0.5f;
            cVar.o = 0.5f;
        }
        String a2 = a("direction");
        String a3 = a("auto-play");
        String a4 = a("interval");
        String a5 = a("first-interval");
        String a6 = a("index");
        String a7 = a("infinite");
        String a8 = a("scrollable");
        String a9 = a(RemoteMessageConst.NOTIFICATION);
        String a10 = a("min-scroll-offset");
        String a11 = a("unselected-scale");
        String a12 = a("unselected-translate");
        this.c.b = a2;
        this.c.c = g(a3);
        c cVar2 = this.c;
        Object[] objArr3 = {a6};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "ecbe5e799c7b540913e4d6208ddd68ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "ecbe5e799c7b540913e4d6208ddd68ff");
        } else if (TextUtils.isEmpty(a6)) {
            cVar2.f = 0;
        } else {
            if (a6.contains(CommonConstant.Symbol.DOT)) {
                a6 = a6.substring(0, a6.indexOf(CommonConstant.Symbol.DOT));
            }
            try {
                cVar2.f = Integer.parseInt(a6);
            } catch (Exception unused) {
                cVar2.f = 0;
            }
        }
        this.c.g = g(a7);
        this.c.d = (int) e(a4);
        this.c.e = (int) e(a5);
        if (TextUtils.isEmpty(a8)) {
            this.c.h = true;
        } else {
            this.c.h = g(a8);
        }
        this.c.q = a9;
        this.c.i = i.c(a10);
        c cVar3 = this.c;
        Object[] objArr4 = {a11};
        ChangeQuickRedirect changeQuickRedirect4 = c.a;
        if (PatchProxy.isSupport(objArr4, cVar3, changeQuickRedirect4, false, "a4f7431593e60c5bb605d0cb2016dc2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, cVar3, changeQuickRedirect4, false, "a4f7431593e60c5bb605d0cb2016dc2f");
        } else if (!TextUtils.isEmpty(a11) && a11.contains("%")) {
            int indexOf = a11.indexOf("%");
            String substring = a11.substring(0, indexOf);
            cVar3.j = cVar3.a(substring);
            String trim = a11.substring(indexOf + 1).trim();
            if (!TextUtils.isEmpty(trim) && trim.contains("%")) {
                cVar3.k = cVar3.a(trim.substring(0, trim.indexOf("%")));
            } else {
                cVar3.k = cVar3.a(substring);
            }
        }
        c cVar4 = this.c;
        Object[] objArr5 = {a12};
        ChangeQuickRedirect changeQuickRedirect5 = c.a;
        if (PatchProxy.isSupport(objArr5, cVar4, changeQuickRedirect5, false, "90ac57f5c750e221d7ee59fc1638945f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, cVar4, changeQuickRedirect5, false, "90ac57f5c750e221d7ee59fc1638945f");
        } else if (!TextUtils.isEmpty(a12)) {
            int indexOf2 = a12.indexOf(StringUtil.SPACE);
            if (indexOf2 == -1) {
                float b = cVar4.b(a12);
                cVar4.l = b;
                cVar4.m = b;
            } else {
                String substring2 = a12.substring(0, indexOf2);
                cVar4.l = cVar4.b(substring2);
                String trim2 = a12.substring(indexOf2 + 1).trim();
                if (!TextUtils.isEmpty(trim2)) {
                    cVar4.m = cVar4.b(trim2);
                } else {
                    cVar4.m = cVar4.b(substring2);
                }
            }
        }
        if (k() == null || !(k().get("@index-change") instanceof com.sankuai.waimai.mach.parser.d)) {
            return;
        }
        this.c.p = (com.sankuai.waimai.mach.parser.d) k().get("@index-change");
    }

    @Override // com.sankuai.waimai.mach.component.swiper.SwiperContainer.a
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e052e98ea7ba9df50f64037b0f08d9e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e052e98ea7ba9df50f64037b0f08d9e0");
            return;
        }
        this.b = i;
        com.sankuai.waimai.mach.parser.d dVar = this.c.p;
        if (this.m == null || dVar == null) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(Integer.valueOf(i));
        this.m.asyncCallJSMethod(dVar.b, linkedList);
    }

    @Override // com.sankuai.waimai.mach.lifecycle.c
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88e5107e30800835ab3bac4f2aaac4fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88e5107e30800835ab3bac4f2aaac4fe");
        } else if (this.d != null) {
            if (z) {
                SwiperContainer swiperContainer = this.d;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = SwiperContainer.a;
                if (PatchProxy.isSupport(objArr2, swiperContainer, changeQuickRedirect2, false, "2beb96f135d0f0a94346007712434f80", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, swiperContainer, changeQuickRedirect2, false, "2beb96f135d0f0a94346007712434f80");
                    return;
                } else if (swiperContainer.b != null) {
                    SwiperRecyclerView swiperRecyclerView = swiperContainer.b;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = SwiperRecyclerView.a;
                    if (PatchProxy.isSupport(objArr3, swiperRecyclerView, changeQuickRedirect3, false, "e40fa0e6f811acad5716f6501716d891", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, swiperRecyclerView, changeQuickRedirect3, false, "e40fa0e6f811acad5716f6501716d891");
                        return;
                    } else if (swiperRecyclerView.b == null || !swiperRecyclerView.c) {
                        return;
                    } else {
                        swiperRecyclerView.b.a(true);
                        return;
                    }
                } else {
                    return;
                }
            }
            SwiperContainer swiperContainer2 = this.d;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = SwiperContainer.a;
            if (PatchProxy.isSupport(objArr4, swiperContainer2, changeQuickRedirect4, false, "b158f15b72eae217cdf65c7daf2e5221", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, swiperContainer2, changeQuickRedirect4, false, "b158f15b72eae217cdf65c7daf2e5221");
            } else if (swiperContainer2.b != null) {
                SwiperRecyclerView swiperRecyclerView2 = swiperContainer2.b;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = SwiperRecyclerView.a;
                if (PatchProxy.isSupport(objArr5, swiperRecyclerView2, changeQuickRedirect5, false, "6be29a301d9e94f28ffd1015347120bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, swiperRecyclerView2, changeQuickRedirect5, false, "6be29a301d9e94f28ffd1015347120bf");
                } else if (swiperRecyclerView2.b == null || !swiperRecyclerView2.c) {
                } else {
                    swiperRecyclerView2.b.c();
                }
            }
        }
    }

    @Override // com.sankuai.waimai.mach.component.b
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14cf29d102d31b02e700da5ea1721e4f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14cf29d102d31b02e700da5ea1721e4f")).intValue();
        }
        SwiperContainer swiperContainer = (SwiperContainer) this.o;
        if (swiperContainer == null) {
            return 0;
        }
        return swiperContainer.getItemCount();
    }
}
