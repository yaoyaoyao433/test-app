package com.sankuai.waimai.pouch.mach.swiper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.mach.parser.d;
import com.sankuai.waimai.mach.utils.i;
import com.sankuai.waimai.pouch.mach.swiper.PouchSwiperContainer;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.mach.component.a<PouchSwiperContainer> implements com.sankuai.waimai.mach.component.b, PouchSwiperContainer.a {
    public static ChangeQuickRedirect a = null;
    public static String c = "pouch_swiper_indexchange";
    private b d;
    private int e;
    private PouchSwiperContainer f;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final boolean ad_() {
        return false;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b5669a0ee3875fab2c1f29f7cb2f898", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b5669a0ee3875fab2c1f29f7cb2f898");
        } else {
            this.d = new b();
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    @NonNull
    public final /* synthetic */ View b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40aab14ad45a871dbc7b89a0a7952c10", RobustBitConfig.DEFAULT_VALUE) ? (PouchSwiperContainer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40aab14ad45a871dbc7b89a0a7952c10") : new PouchSwiperContainer(context);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3e9dc0c6c32d4a1593ec24a38806687", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3e9dc0c6c32d4a1593ec24a38806687");
        } else if (this.f != null) {
            this.f.a(i);
        }
    }

    @Override // com.sankuai.waimai.mach.component.a, com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e13da0d300c1c4bf16b100dc8e56451", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e13da0d300c1c4bf16b100dc8e56451");
            return;
        }
        super.a();
        b bVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "0e91d729d05d6308fd4f85963652beb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "0e91d729d05d6308fd4f85963652beb3");
        } else {
            bVar.b = "vertical";
            bVar.c = true;
            bVar.d = 0;
            bVar.e = 0;
            bVar.g = 0;
            bVar.h = false;
            bVar.i = false;
            bVar.j = -1.0f;
            bVar.k = 1.0f;
            bVar.l = 1.0f;
            bVar.m = 0.0f;
            bVar.n = 0.0f;
            bVar.o = 0.5f;
            bVar.p = 0.5f;
        }
        String a2 = a("direction");
        String a3 = a("auto-play");
        String a4 = a("interval");
        String a5 = a("scroll-duration");
        String a6 = a("first-interval");
        String a7 = a("index");
        String a8 = a("infinite");
        String a9 = a("scrollable");
        String a10 = a("min-scroll-offset");
        String a11 = a("unselected-scale");
        String a12 = a("unselected-translate");
        a(a("v-gradient-ratio"), true);
        a(a("h-gradient-ratio"), false);
        this.d.f = f(a5);
        this.d.b = a2;
        this.d.c = g(a3);
        b bVar2 = this.d;
        Object[] objArr3 = {a7};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "af2bb93ca5e106018a35ad173c0564c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "af2bb93ca5e106018a35ad173c0564c8");
        } else if (TextUtils.isEmpty(a7)) {
            bVar2.g = 0;
        } else {
            if (a7.contains(CommonConstant.Symbol.DOT)) {
                a7 = a7.substring(0, a7.indexOf(CommonConstant.Symbol.DOT));
            }
            try {
                bVar2.g = Integer.parseInt(a7);
            } catch (Exception unused) {
                bVar2.g = 0;
            }
        }
        this.d.h = g(a8);
        this.d.d = (int) e(a4);
        this.d.e = (int) e(a6);
        if (TextUtils.isEmpty(a9)) {
            this.d.i = true;
        } else {
            this.d.i = g(a9);
        }
        this.d.j = i.c(a10);
        b bVar3 = this.d;
        Object[] objArr4 = {a11};
        ChangeQuickRedirect changeQuickRedirect4 = b.a;
        if (PatchProxy.isSupport(objArr4, bVar3, changeQuickRedirect4, false, "2bae1f4a90010f01a3681d7a6195afe2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, bVar3, changeQuickRedirect4, false, "2bae1f4a90010f01a3681d7a6195afe2");
        } else if (!TextUtils.isEmpty(a11) && a11.contains("%")) {
            int indexOf = a11.indexOf("%");
            String substring = a11.substring(0, indexOf);
            bVar3.k = bVar3.a(substring);
            String trim = a11.substring(indexOf + 1).trim();
            if (!TextUtils.isEmpty(trim) && trim.contains("%")) {
                bVar3.l = bVar3.a(trim.substring(0, trim.indexOf("%")));
            } else {
                bVar3.l = bVar3.a(substring);
            }
        }
        b bVar4 = this.d;
        Object[] objArr5 = {a12};
        ChangeQuickRedirect changeQuickRedirect5 = b.a;
        if (PatchProxy.isSupport(objArr5, bVar4, changeQuickRedirect5, false, "1c54d8774a74d09e0cb4501a5ca73d5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, bVar4, changeQuickRedirect5, false, "1c54d8774a74d09e0cb4501a5ca73d5a");
        } else if (!TextUtils.isEmpty(a12)) {
            int indexOf2 = a12.indexOf(StringUtil.SPACE);
            if (indexOf2 == -1) {
                float b = bVar4.b(a12);
                bVar4.m = b;
                bVar4.n = b;
            } else {
                String substring2 = a12.substring(0, indexOf2);
                bVar4.m = bVar4.b(substring2);
                String trim2 = a12.substring(indexOf2 + 1).trim();
                if (!TextUtils.isEmpty(trim2)) {
                    bVar4.n = bVar4.b(trim2);
                } else {
                    bVar4.n = bVar4.b(substring2);
                }
            }
        }
        if (k() == null || !(k().get("@index-change") instanceof d)) {
            return;
        }
        this.d.u = (d) k().get("@index-change");
    }

    private void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89960237ab42fe80d6cca96c7075e7d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89960237ab42fe80d6cca96c7075e7d0");
        } else if (aa.a(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("start");
                if (z) {
                    this.d.q = Float.parseFloat(optString);
                } else {
                    this.d.s = Float.parseFloat(optString);
                }
                String optString2 = jSONObject.optString("end");
                if (z) {
                    this.d.r = Float.parseFloat(optString2);
                } else {
                    this.d.t = Float.parseFloat(optString2);
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0289  */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.sankuai.waimai.pouch.mach.swiper.PouchSwiperView] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.sankuai.waimai.pouch.mach.fading.FadingEdgeLayout] */
    @Override // com.sankuai.waimai.mach.component.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.sankuai.waimai.pouch.mach.swiper.PouchSwiperContainer r27) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.pouch.mach.swiper.a.a(com.sankuai.waimai.pouch.mach.swiper.PouchSwiperContainer):void");
    }

    @Override // com.sankuai.waimai.pouch.mach.swiper.PouchSwiperContainer.a
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ead08b715b4bd5dde6d3f4638fd1cacd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ead08b715b4bd5dde6d3f4638fd1cacd");
            return;
        }
        this.e = i;
        d dVar = this.d.u;
        if (this.m == null || dVar == null) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(Integer.valueOf(i));
        this.m.asyncCallJSMethod(dVar.b, linkedList);
    }

    @Override // com.sankuai.waimai.mach.component.b
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f97d20abaf5104b9e92739795b9e527", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f97d20abaf5104b9e92739795b9e527")).intValue();
        }
        PouchSwiperContainer pouchSwiperContainer = (PouchSwiperContainer) this.o;
        if (pouchSwiperContainer == null) {
            return 0;
        }
        return pouchSwiperContainer.getItemCount();
    }
}
