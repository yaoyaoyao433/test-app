package com.sankuai.waimai.business.search.ui.mrn;

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
import com.sankuai.waimai.business.search.common.util.e;
import com.sankuai.waimai.business.search.common.util.g;
import com.sankuai.waimai.business.search.common.util.i;
import com.sankuai.waimai.business.search.model.HotLabel;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.business.search.ui.mrn.a;
import com.sankuai.waimai.platform.capacity.log.c;
import com.sankuai.waimai.platform.db.logic.PoiSearchHistoryLogic;
import com.tencent.smtt.sdk.TbsListener;
import io.agora.rtc.internal.RtcEngineEvent;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GuideRNFragment extends BaseSearchMrnFragment {
    public static ChangeQuickRedirect g;
    private long h;

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageReceive(com.sankuai.waimai.business.search.ui.guide.history.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6cc2dc6b785b42d2b3c3c0b46bfb2d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6cc2dc6b785b42d2b3c3c0b46bfb2d3");
        } else {
            a(aVar);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onClickHistoryItem(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bb7aa9782e9409f3898849acf589631", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bb7aa9782e9409f3898849acf589631");
        } else if (bVar == null || bVar.c == null || !this.c.W.equals(bVar.a)) {
        } else {
            if ((!TextUtils.isEmpty(bVar.c.c) || bVar.c.b > 0) && bVar.c.e) {
                if (this.b == null || this.b.isFinishing()) {
                    return;
                }
                i.a(this.b, bVar.c.b, bVar.c.c, bVar.c.d, TbsListener.ErrorCode.APK_VERSION_ERROR, 0L, bVar.c.f);
            } else if (bVar.b == 3) {
                if (this.b == null || this.b.isFinishing()) {
                    return;
                }
                a(new com.sankuai.waimai.business.search.ui.guide.history.a(bVar.c.b, bVar.c.c, bVar.c.d, false, null));
                com.sankuai.waimai.foundation.router.a.a(this.b, bVar.c.f);
            } else {
                a("11002");
                a(bVar.c.b, bVar.c.c, bVar.c.d, 2, 1);
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onClickHotSearchItem(a.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c29b74c719d511d803ea4d643d8fe9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c29b74c719d511d803ea4d643d8fe9a");
        } else if (dVar == null || this.b == null || this.b.isFinishing()) {
        } else {
            if (dVar.b == 3) {
                a(new com.sankuai.waimai.business.search.ui.guide.history.a(0L, "", dVar.c, false, dVar.d));
                com.sankuai.waimai.foundation.router.a.a(this.b, dVar.d);
                return;
            }
            a("11002");
            this.b.a(0L, "", dVar.c, "", dVar.e, 19, Integer.valueOf("11002").intValue(), false);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onClickSpecialRankItem(a.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66e1a0a7963e2083e25d69f5653e432b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66e1a0a7963e2083e25d69f5653e432b");
        } else if (fVar == null || this.b == null || this.b.isFinishing()) {
        } else {
            a("11002");
            SearchShareData.a(this.b).am = fVar.d;
            a(0L, "", fVar.c, 20, 1);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onRecommendClick(a.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d8a550ecaf724485a0174aa58cbf7f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d8a550ecaf724485a0174aa58cbf7f7");
        } else if (eVar == null || !this.c.W.equals(eVar.a) || this.b == null || this.b.isFinishing()) {
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("poiId", eVar.e);
            bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, eVar.f);
            bundle.putString("poiName", eVar.b);
            bundle.putString("from", "from poi search");
            bundle.putLong("foodId", 0L);
            i.a(this.b, eVar.d, bundle);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onClickHotLabelItem(a.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "502ea69184c3ae3e6247ed7b11ea5d23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "502ea69184c3ae3e6247ed7b11ea5d23");
        } else if (cVar == null || cVar.b == null || !this.c.W.equals(cVar.a)) {
        } else {
            HotLabel hotLabel = cVar.b;
            int i = hotLabel.labelType;
            if (i != 99999) {
                switch (i) {
                    case 12000:
                    case 12003:
                        if (this.b == null || this.b.isFinishing()) {
                            return;
                        }
                        i.a(this.b, hotLabel.poiId, hotLabel.poiIdStr, hotLabel.labelName, TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM, 0L, hotLabel.jumpScheme);
                        return;
                    case 12001:
                        a("11001");
                        a(hotLabel.searchKeyword, 1, hotLabel.labelType);
                        return;
                    case 12002:
                    case 12004:
                        a("11002");
                        a(hotLabel.searchKeyword, 1, hotLabel.labelType);
                        return;
                    case 12005:
                        if (this.b == null || this.b.isFinishing()) {
                            return;
                        }
                        com.sankuai.waimai.foundation.router.a.a(this.b, hotLabel.clickUrl);
                        return;
                    default:
                        if (this.b == null || this.b.isFinishing()) {
                            return;
                        }
                        this.c.I = cVar.c;
                        if (!TextUtils.isEmpty(hotLabel.clickUrl)) {
                            if (hotLabel.labelType != 7) {
                                a(new com.sankuai.waimai.business.search.ui.guide.history.a(hotLabel.poiId, hotLabel.poiIdStr, hotLabel.searchKeyword, false, null));
                            }
                            com.sankuai.waimai.foundation.router.a.a(this.b, hotLabel.clickUrl);
                            return;
                        }
                        this.c.H = hotLabel.wordSource;
                        a("11002");
                        a(hotLabel.searchKeyword, 15, hotLabel.labelType);
                        return;
                }
            } else if (this.b == null || this.b.isFinishing()) {
            } else {
                a(new com.sankuai.waimai.business.search.ui.guide.history.a(hotLabel.poiId, hotLabel.poiIdStr, hotLabel.searchKeyword, false, null));
                com.sankuai.waimai.foundation.router.a.a(this.b, hotLabel.clickUrl);
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onClearHistory(a.C0863a c0863a) {
        Object[] objArr = {c0863a};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff006e8d59398452cdcc6e0192441868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff006e8d59398452cdcc6e0192441868");
        } else {
            PoiSearchHistoryLogic.clearHistory();
        }
    }

    public final void a(com.sankuai.waimai.business.search.ui.guide.history.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d06966d9431165b90335aec25c18e3b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d06966d9431165b90335aec25c18e3b9");
        } else if (aVar == null) {
        } else {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("search_word", aVar.d);
            writableNativeMap.putString("poi_id", String.valueOf(aVar.b));
            writableNativeMap.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, aVar.c);
            writableNativeMap.putInt("type", 1 ^ (aVar.e ? 1 : 0));
            writableNativeMap.putString(NetLogConstants.Details.SCHEME, aVar.f);
            writableNativeMap.putString("uuid", this.c.W);
            k o = o();
            if (o != null) {
                n.a(o, "addNewHistory", writableNativeMap);
            }
        }
    }

    public static GuideRNFragment p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8a1cf3850b90bd0ca3c9c0fc4f75303", RobustBitConfig.DEFAULT_VALUE) ? (GuideRNFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8a1cf3850b90bd0ca3c9c0fc4f75303") : new GuideRNFragment();
    }

    @Override // com.sankuai.waimai.business.search.ui.mrn.BaseSearchMrnFragment, com.sankuai.waimai.business.search.ui.mrn.WMMrnBaseFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a68807874919d2da338b56df1f3022c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a68807874919d2da338b56df1f3022c0");
            return;
        }
        super.onCreate(bundle);
        this.h = System.currentTimeMillis();
        com.meituan.android.bus.a.a().a(this);
        c.a().a(RtcEngineEvent.EvtType.EVT_AUDIO_VOLUME_INDICATION, "mrn/ab/wmsearchguidepage", SystemClock.elapsedRealtime());
    }

    @Override // com.sankuai.waimai.business.search.ui.mrn.WMMrnBaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable @org.jetbrains.annotations.Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60ec13d9a9bd2a26e833802a490b3994", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60ec13d9a9bd2a26e833802a490b3994");
            return;
        }
        k o = o();
        if (o != null) {
            n.a(o, "didRecivePromotionWords", e.a());
            n.a(o, "didReciveHotlabelandhistory", g.a().b());
            n.a(o, "didReciveHotranksData", g.a().c());
        }
    }

    @Override // com.sankuai.waimai.business.search.ui.mrn.WMMrnBaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c0d35bf463395a7c8864cc6ea6de138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c0d35bf463395a7c8864cc6ea6de138");
            return;
        }
        com.meituan.android.bus.a.a().b(this);
        super.onDestroy();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final Uri m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b43ecd420fd055d598e2f239c2df19de", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b43ecd420fd055d598e2f239c2df19de");
        }
        return new Uri.Builder().appendQueryParameter("mrn_biz", "waimai").appendQueryParameter("mrn_entry", "search-guide").appendQueryParameter("mrn_component", "WMSearchGuidePage").appendQueryParameter("wm_rn_page_create_time", String.valueOf(this.h)).appendQueryParameter("entrance_id", String.valueOf(this.c.v)).appendQueryParameter("category_type", String.valueOf(this.c.w)).appendQueryParameter("sub_category_type", String.valueOf(this.c.x)).appendQueryParameter("uuid", this.c.W).appendQueryParameter("gaoda_id", String.valueOf(this.c.M)).appendQueryParameter("weien_id", String.valueOf(this.c.L)).appendQueryParameter("gaoda_param", String.valueOf(this.c.N)).appendQueryParameter("search_source", String.valueOf(this.c.K)).appendQueryParameter("app_model", this.b.b() ? "1" : "0").appendQueryParameter("rank_list_id", this.c.an).appendQueryParameter("rcmd_s_log_id", this.c.c).build();
    }
}
