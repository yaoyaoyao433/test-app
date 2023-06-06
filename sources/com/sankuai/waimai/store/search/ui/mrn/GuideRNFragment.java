package com.sankuai.waimai.store.search.ui.mrn;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.engine.n;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.platform.capacity.log.c;
import com.sankuai.waimai.platform.db.logic.PoiSearchHistoryLogic;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.common.util.f;
import com.sankuai.waimai.store.search.model.HotLabel;
import com.sankuai.waimai.store.search.model.e;
import com.sankuai.waimai.store.search.ui.mrn.a;
import com.sankuai.waimai.store.util.i;
import com.tencent.smtt.sdk.TbsListener;
import io.agora.rtc.internal.RtcEngineEvent;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class GuideRNFragment extends BaseSearchMrnFragment {
    public static ChangeQuickRedirect l;
    private long m;
    private String n;

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageReceive(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15cceabf3a8bd1fca4b71f414294e12e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15cceabf3a8bd1fca4b71f414294e12e");
        } else {
            a(eVar);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onClickHistoryItem(a.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c8faa0c9d3fff99f72fc922dc82eab6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c8faa0c9d3fff99f72fc922dc82eab6");
        } else if (cVar == null || cVar.b == null || !this.k.bh.equals(cVar.a)) {
        } else {
            if (cVar.b.b > 0 && cVar.b.e) {
                if (this.b == null || this.b.isFinishing()) {
                    return;
                }
                f.a(this.b, cVar.b.b, cVar.b.c, cVar.b.d, TbsListener.ErrorCode.APK_VERSION_ERROR, 0L, cVar.b.f, this.k.y);
            } else if (!TextUtils.isEmpty(cVar.b.c) && !"0".equals(cVar.b.c) && cVar.b.e) {
                if (this.b == null || this.b.isFinishing()) {
                    return;
                }
                f.a(this.b, cVar.b.b, cVar.b.c, cVar.b.d, TbsListener.ErrorCode.APK_VERSION_ERROR, 0L, cVar.b.f, this.k.y);
            } else {
                c("11002");
                a(cVar.b.b, cVar.b.c, cVar.b.d, 2, 1);
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onRecommendClick(a.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "397ca96306081692d777aa1ee35764c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "397ca96306081692d777aa1ee35764c9");
        } else if (eVar == null || !this.k.bh.equals(eVar.a) || this.b == null || this.b.isFinishing()) {
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("poiId", eVar.f);
            bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, eVar.e);
            bundle.putString("poiName", eVar.b);
            bundle.putString("from", "from poi search");
            bundle.putLong("foodId", 0L);
            f.a(this.b, eVar.d, bundle);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onClickHotLabelItem(a.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e21fd8e0546add86ba1f7227476921", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e21fd8e0546add86ba1f7227476921");
        } else if (dVar == null || dVar.b == null || !this.k.bh.equals(dVar.a)) {
        } else {
            HotLabel hotLabel = dVar.b;
            int i = hotLabel.labelType;
            if (i == 7) {
                if (this.b == null || this.b.isFinishing()) {
                    return;
                }
                com.sankuai.waimai.foundation.router.a.a(this.b, hotLabel.clickUrl);
            } else if (i != 99999) {
                switch (i) {
                    case 12000:
                    case 12003:
                        if (this.b == null || this.b.isFinishing()) {
                            return;
                        }
                        f.a(this.b, hotLabel.poiId, hotLabel.poiIdStr, hotLabel.labelName, TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM, 0L, hotLabel.jumpScheme, this.k.y);
                        return;
                    case 12001:
                        c("11001");
                        a(hotLabel.searchKeyword, 1, hotLabel.labelType);
                        return;
                    case 12002:
                    case 12004:
                        c("11002");
                        a(hotLabel.searchKeyword, 1, hotLabel.labelType);
                        return;
                    case 12005:
                        if (this.b == null || this.b.isFinishing()) {
                            return;
                        }
                        com.sankuai.waimai.foundation.router.a.a(this.b, hotLabel.clickUrl);
                        return;
                    default:
                        return;
                }
            } else if (this.b == null || this.b.isFinishing()) {
            } else {
                a(new e(hotLabel.poiId, hotLabel.poiIdStr, hotLabel.searchKeyword, false, null, this.k.y));
                com.sankuai.waimai.foundation.router.a.a(this.b, hotLabel.clickUrl);
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onClearHistory(a.C1321a c1321a) {
        Object[] objArr = {c1321a};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "707cbbe3c8c89fdcf863b59c46d1176d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "707cbbe3c8c89fdcf863b59c46d1176d");
        } else {
            PoiSearchHistoryLogic.clearHistory();
        }
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12456b849bc6952f8af9bdbf5cad91dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12456b849bc6952f8af9bdbf5cad91dd");
        } else if (eVar == null || i.a(eVar.d)) {
        } else {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("search_word", eVar.d);
            writableNativeMap.putString("poi_id", String.valueOf(eVar.b));
            writableNativeMap.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, eVar.c);
            writableNativeMap.putInt("type", 1 ^ (eVar.e ? 1 : 0));
            writableNativeMap.putString(NetLogConstants.Details.SCHEME, eVar.f);
            writableNativeMap.putString("biz_source", String.valueOf(eVar.g));
            writableNativeMap.putString("uuid", this.k.bh);
            k o = o();
            if (o != null) {
                n.a(o, "addNewHistory", writableNativeMap);
            }
        }
    }

    public static GuideRNFragment s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44e6983ca5144be15c5214d74f3282ce", RobustBitConfig.DEFAULT_VALUE) ? (GuideRNFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44e6983ca5144be15c5214d74f3282ce") : new GuideRNFragment();
    }

    @Override // com.sankuai.waimai.store.search.ui.mrn.BaseSearchMrnFragment, com.sankuai.waimai.store.base.SGCommonRNFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0803286a1a8e547c638d9e144c53931", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0803286a1a8e547c638d9e144c53931");
            return;
        }
        super.onCreate(bundle);
        this.m = System.currentTimeMillis();
        com.meituan.android.bus.a.a().a(this);
        c.a().a(RtcEngineEvent.EvtType.EVT_AUDIO_VOLUME_INDICATION, "mrn/ab/wmsearchguidepage", SystemClock.elapsedRealtime());
        if (this.b != null) {
            this.n = d.a(this.b.getIntent(), "guideSchema", "");
        }
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable @org.jetbrains.annotations.Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9267f7c46fd769300b3e0d40aa3dacc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9267f7c46fd769300b3e0d40aa3dacc");
            return;
        }
        k o = o();
        if (o != null) {
            n.a(o, "didRecivePromotionWords", com.sankuai.waimai.store.search.common.util.e.a());
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c50fa2a33eb50a0de028d47a9940157f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c50fa2a33eb50a0de028d47a9940157f");
            return;
        }
        com.meituan.android.bus.a.a().b(this);
        super.onDestroy();
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, com.meituan.android.mrn.container.MRNBaseFragment
    public final Uri m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8208e45efc867046572247cbd67091dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8208e45efc867046572247cbd67091dc");
        }
        Uri.Builder builder = new Uri.Builder();
        String str = "supermarket";
        String str2 = "flashbuy-search-guide";
        String str3 = "flashbuy-search-guide";
        if (!TextUtils.isEmpty(this.n)) {
            Uri parse = Uri.parse(this.n);
            String b = af.b(parse, "mrn_biz", "");
            String b2 = af.b(parse, "mrn_entry", "");
            str3 = af.b(parse, "mrn_component", "");
            str = b;
            str2 = b2;
        }
        builder.appendQueryParameter("mrn_biz", str).appendQueryParameter("mrn_entry", str2).appendQueryParameter("mrn_component", str3).appendQueryParameter("wm_rn_page_create_time", String.valueOf(this.m)).appendQueryParameter("entrance_id", String.valueOf(this.k.y)).appendQueryParameter("category_type", String.valueOf(this.k.z)).appendQueryParameter("category_text", this.k.A).appendQueryParameter("sub_category_type", String.valueOf(this.k.B)).appendQueryParameter("uuid", this.k.bh);
        if (this.k.bg && this.k.C > 0) {
            builder.appendQueryParameter("sec_cat_id", String.valueOf(this.k.C));
        }
        return builder.build();
    }
}
