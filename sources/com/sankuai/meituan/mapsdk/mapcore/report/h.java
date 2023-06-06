package com.sankuai.meituan.mapsdk.mapcore.report;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.mapcore.report.d;
import com.sankuai.meituan.mapsdk.maps.MapsInitializer;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private b b;

    public /* synthetic */ h(AnonymousClass1 anonymousClass1) {
        this();
    }

    public h() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        private static final h a = new h(null);
    }

    public static h a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06da5a98007c177233e2fa5e005bc7f8", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06da5a98007c177233e2fa5e005bc7f8") : a.a;
    }

    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13bdb7b7e718f24ff3d67b0b61a991bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13bdb7b7e718f24ff3d67b0b61a991bc");
        } else {
            a("", cVar);
        }
    }

    public final void a(String str, c cVar) {
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf39d7e3724bd336f8ffb287a4a7dd44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf39d7e3724bd336f8ffb287a4a7dd44");
        } else if (cVar == null) {
        } else {
            try {
                b(str, cVar);
                b(cVar);
                if (this.b != null) {
                    cVar.a();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void b(String str, @NonNull c cVar) {
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83b11e4e4d5534813369843a3d7a5870", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83b11e4e4d5534813369843a3d7a5870");
        } else if (cVar.b == null) {
        } else {
            d dVar = cVar.b;
            if (TextUtils.isEmpty(dVar.c) || TextUtils.isEmpty(dVar.d) || TextUtils.isEmpty(dVar.e)) {
                return;
            }
            com.sankuai.meituan.mapsdk.mapcore.utils.c.c("reportOcean: channel:" + dVar.c + ", cid:" + dVar.d + ", bid:" + dVar.e + ", extras:" + dVar.f.toString());
            if (AnonymousClass1.a[dVar.b.ordinal()] == 1) {
                com.sankuai.meituan.mapfoundation.datacollector.a.b(new com.sankuai.meituan.mapfoundation.datacollector.b(dVar.c, str, dVar.e, dVar.d, dVar.f));
            }
            com.sankuai.meituan.mapfoundation.datacollector.a.a(new com.sankuai.meituan.mapfoundation.datacollector.b(dVar.c, str, dVar.e, dVar.d, dVar.f));
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.mapsdk.mapcore.report.h$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[d.a.valuesCustom().length];

        static {
            try {
                a[d.a.Type_MC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.a.Type_MV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void b(@NonNull c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcd559e785c8338a58be272e29204726", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcd559e785c8338a58be272e29204726");
        } else if (cVar.c == null) {
        } else {
            if (cVar.c.b == null) {
                cVar.c.b = new ArrayMap();
            }
            if (!cVar.c.b.containsKey("mapVer")) {
                cVar.c.b.put("mapVer", b());
            }
            if (!cVar.c.b.containsKey("mapID")) {
                int catAppId = MapsInitializer.getCatAppId();
                String str = cVar.c.b.get("mapKey");
                if (TextUtils.isEmpty(str)) {
                    str = com.sankuai.meituan.mapsdk.mapcore.utils.a.a(com.sankuai.meituan.mapsdk.mapcore.a.a());
                }
                Map<String, String> map = cVar.c.b;
                map.put("mapID", catAppId + CommonConstant.Symbol.UNDERLINE + str);
            }
            com.sankuai.meituan.mapfoundation.datacollector.a.a(TbsListener.ErrorCode.INFO_SDKINIT_IS_SYS_FORCED, new com.sankuai.meituan.mapfoundation.datacollector.c(cVar.c.b, cVar.c.c));
        }
    }

    private String b() {
        int indexOf;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ac914742530c0d940753015db2b6e6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ac914742530c0d940753015db2b6e6b");
        }
        if ("4.1207.11".isEmpty()) {
            return "0.0";
        }
        int indexOf2 = "4.1207.11".indexOf(CommonConstant.Symbol.DOT);
        return (indexOf2 == -1 || (indexOf = "4.1207.11".indexOf(CommonConstant.Symbol.DOT, indexOf2 + 1)) == -1) ? "4.1207.11" : "4.1207.11".substring(0, indexOf);
    }
}
