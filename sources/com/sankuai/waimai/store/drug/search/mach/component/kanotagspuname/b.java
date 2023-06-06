package com.sankuai.waimai.store.drug.search.mach.component.kanotagspuname;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.c;
import com.facebook.yoga.d;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.recce.props.gens.FontSize;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.text.SizeSpec;
import com.sankuai.waimai.store.search.model.BaseProductPoi;
import com.sankuai.waimai.store.search.ui.result.dynamictag.SGSearchTagInfo;
import com.sankuai.waimai.store.util.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.mach.component.base.a<KanoTagSpuNameView> implements YogaMeasureFunction {
    public static ChangeQuickRedirect a;
    private a b;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(KanoTagSpuNameView kanoTagSpuNameView) {
        KanoTagSpuNameView kanoTagSpuNameView2 = kanoTagSpuNameView;
        Object[] objArr = {kanoTagSpuNameView2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "807b791bed64a5f15285ec66277578e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "807b791bed64a5f15285ec66277578e1");
            return;
        }
        super.a((b) kanoTagSpuNameView2);
        kanoTagSpuNameView2.setData(this.b);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ KanoTagSpuNameView b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d65f5f52cb8cf151e75b5f2f1186c08", RobustBitConfig.DEFAULT_VALUE) ? (KanoTagSpuNameView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d65f5f52cb8cf151e75b5f2f1186c08") : new KanoTagSpuNameView(context);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41f288ecf3d45aaad5218dab1ace5fb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41f288ecf3d45aaad5218dab1ace5fb1");
            return;
        }
        ac_().a((YogaMeasureFunction) this);
        this.b = new a();
        this.b.b = a("text");
        a aVar = this.b;
        String a2 = a("text-color");
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "a1e9065dc9c509acb61744b914d67d4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "a1e9065dc9c509acb61744b914d67d4c");
        } else if (TextUtils.isEmpty(a2)) {
            aVar.c = "#33312E";
        } else {
            aVar.c = a2;
        }
        a aVar2 = this.b;
        String a3 = a(FontSize.NAME);
        Object[] objArr3 = {a3};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "b02b52fd848927dc6db76472322453ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "b02b52fd848927dc6db76472322453ec");
        } else if (TextUtils.isEmpty(a3)) {
            aVar2.d = 14.0f;
        } else {
            aVar2.d = Float.valueOf(a3).floatValue();
        }
        a aVar3 = this.b;
        String a4 = a("highlight-color");
        Object[] objArr4 = {a4};
        ChangeQuickRedirect changeQuickRedirect4 = a.a;
        if (PatchProxy.isSupport(objArr4, aVar3, changeQuickRedirect4, false, "bbc057526aa18dd9462ac4b8476d1018", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aVar3, changeQuickRedirect4, false, "bbc057526aa18dd9462ac4b8476d1018");
        } else if (TextUtils.isEmpty(a4)) {
            aVar3.f = "#FF8000";
        } else {
            aVar3.f = a4;
        }
        a aVar4 = this.b;
        String a5 = a("number-lines");
        Object[] objArr5 = {a5};
        ChangeQuickRedirect changeQuickRedirect5 = a.a;
        if (PatchProxy.isSupport(objArr5, aVar4, changeQuickRedirect5, false, "33b67170eb1da8f03c8001d7da951e13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, aVar4, changeQuickRedirect5, false, "33b67170eb1da8f03c8001d7da951e13");
        } else if (TextUtils.isEmpty(a5)) {
            aVar4.e = 0;
        } else {
            aVar4.e = Integer.valueOf(a5).intValue();
        }
        Map<String, Object> k = k();
        a aVar5 = this.b;
        Object[] objArr6 = {k, aVar5};
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "ab27b3d287c6da8800a847849eacd2f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "ab27b3d287c6da8800a847849eacd2f1");
        } else if (k != null) {
            if (k.containsKey("highlight-data")) {
                if (aVar5.g == null) {
                    aVar5.g = new ArrayList();
                }
                for (Object obj : (List) k.get("highlight-data")) {
                    if (obj instanceof BaseProductPoi.RedWord) {
                        aVar5.g.add((BaseProductPoi.RedWord) obj);
                    } else if (obj instanceof Map) {
                        aVar5.g.add((BaseProductPoi.RedWord) i.a(i.a(obj), new TypeToken<BaseProductPoi.RedWord>() { // from class: com.sankuai.waimai.store.drug.search.mach.component.kanotagspuname.b.1
                        }.getType()));
                    }
                }
            }
            if (k.containsKey("kano-tag-data")) {
                if (aVar5.h == null) {
                    aVar5.h = new ArrayList();
                }
                for (Object obj2 : (List) k.get("kano-tag-data")) {
                    if (obj2 instanceof SGSearchTagInfo) {
                        aVar5.h.add((SGSearchTagInfo) obj2);
                    } else if (obj2 instanceof Map) {
                        aVar5.h.add((SGSearchTagInfo) i.a(i.a(obj2), new TypeToken<SGSearchTagInfo>() { // from class: com.sankuai.waimai.store.drug.search.mach.component.kanotagspuname.b.2
                        }.getType()));
                    }
                }
            }
        }
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public final long measure(d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        Object[] objArr = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff8730ca407b609995c3f0543ed3a9f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff8730ca407b609995c3f0543ed3a9f5")).longValue();
        }
        Activity activity = this.m.getActivity();
        if (activity == null) {
            return 0L;
        }
        KanoTagSpuNameView kanoTagSpuNameView = new KanoTagSpuNameView(activity);
        kanoTagSpuNameView.setData(this.b);
        kanoTagSpuNameView.measure(SizeSpec.a(f, yogaMeasureMode), SizeSpec.a(f2, yogaMeasureMode2));
        return c.a(kanoTagSpuNameView.getMeasuredWidth(), kanoTagSpuNameView.getMeasuredHeight());
    }
}
