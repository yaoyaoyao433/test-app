package com.sankuai.waimai.store.search.ui.mrn;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.engine.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import com.sankuai.waimai.platform.capacity.log.c;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.common.util.e;
import com.sankuai.waimai.store.search.common.util.f;
import com.sankuai.waimai.store.search.ui.GlobalSearchActivity;
import com.sankuai.waimai.store.search.ui.mrn.a;
import io.agora.rtc.internal.RtcEngineEvent;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SuggestRNFragment extends BaseSearchMrnFragment {
    public static ChangeQuickRedirect l;
    public String m;
    public String n;
    private String o;
    private boolean p;

    public SuggestRNFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d249853fd07f1ffe79caa8de58463a52", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d249853fd07f1ffe79caa8de58463a52");
            return;
        }
        this.n = "";
        this.p = false;
    }

    @Override // com.sankuai.waimai.store.search.ui.mrn.BaseSearchMrnFragment, com.sankuai.waimai.store.base.SGCommonRNFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f669cec234035ed3ea3d8b2e473bc9da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f669cec234035ed3ea3d8b2e473bc9da");
            return;
        }
        super.onCreate(bundle);
        c.a().a(RtcEngineEvent.EvtType.EVT_AUDIO_VOLUME_INDICATION, "mrn/ab/wm-search-suggest", SystemClock.elapsedRealtime());
        com.meituan.android.bus.a.a().a(this);
        if (TextUtils.isEmpty(this.o) || this.k == null) {
            return;
        }
        this.k.v = this.o;
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc81da31eabb80a8fd6a88c5a825ab59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc81da31eabb80a8fd6a88c5a825ab59");
            return;
        }
        super.onViewCreated(view, bundle);
        view.post(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.mrn.SuggestRNFragment.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e54e8342f2cd59681d425d5307d3bcd4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e54e8342f2cd59681d425d5307d3bcd4");
                } else if (SuggestRNFragment.this.p) {
                    SuggestRNFragment.this.d(SuggestRNFragment.this.n);
                }
            }
        });
        k o = o();
        if (o != null) {
            n.a(o, "didRecivePromotionWords", e.a());
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61439320c6bd6465ed8f63a4601c7264", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61439320c6bd6465ed8f63a4601c7264");
            return;
        }
        super.onResume();
        if (this.b == null || this.b.isFinishing() || this.b.h() != 2) {
            return;
        }
        if (this.k.G) {
            this.k.G = false;
            d(this.k.d);
        }
        this.b.i();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b780fe47d009c1a200953c03f72aec65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b780fe47d009c1a200953c03f72aec65");
            return;
        }
        com.meituan.android.bus.a.a().b(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void showSuggest(a.i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1004c63cf3fa7a40524d9079a03ccce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1004c63cf3fa7a40524d9079a03ccce");
        } else if (iVar == null || !this.k.bh.equals(iVar.a)) {
        } else {
            this.k.bi = iVar.d == null ? "" : iVar.d;
            if (this.n.equals(iVar.b)) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = l;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44c86a709c5c9cb4afc944e09bcf4729", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44c86a709c5c9cb4afc944e09bcf4729");
                } else {
                    FragmentActivity activity = getActivity();
                    if (activity instanceof GlobalSearchActivity) {
                        ((GlobalSearchActivity) activity).j();
                    }
                }
                if (TextUtils.isEmpty(iVar.c)) {
                    return;
                }
                this.m = iVar.c;
                if (this.k != null) {
                    this.k.w = iVar.c;
                }
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void clickSugPoi(a.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f851deef7e4f924a4daa034c41cb097f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f851deef7e4f924a4daa034c41cb097f");
        } else if (gVar == null || !this.k.bh.equals(gVar.a) || this.b == null || this.b.isFinishing()) {
        } else {
            this.k.G = true;
            f.a(this.b, gVar.b, gVar.c, gVar.d, 202, 0L, gVar.e, this.k.y);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void clickSugQuery(a.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30b72c02c59affce60d592e010881568", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30b72c02c59affce60d592e010881568");
        } else if (hVar == null || !this.k.bh.equals(hVar.a)) {
        } else {
            if (TextUtils.isEmpty(hVar.d)) {
                a(hVar.b, 3, hVar.c);
                if (hVar.c == 11002) {
                    c("11002");
                } else if (hVar.c == 11001) {
                    c("11001");
                }
            } else if (this.b == null || this.b.isFinishing()) {
            } else {
                this.b.a(hVar.b, 0L, null, false, null);
                com.sankuai.waimai.foundation.router.a.a(this.b, hVar.d);
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void clickSugBottom(a.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0549bf122393199024a2a7d258792227", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0549bf122393199024a2a7d258792227");
        } else if (fVar == null || !this.k.bh.equals(fVar.a)) {
        } else {
            if (TextUtils.isEmpty(fVar.b)) {
                c("11002");
                a(this.k.d, 3, XPlayerConstants.FFP_MSG_RECEIVE_SEI_FRAME);
            } else if (this.b == null || this.b.isFinishing()) {
            } else {
                this.b.a(this.k.d, 0L, null, false, null);
                com.sankuai.waimai.foundation.router.a.a(this.b, fVar.b);
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void ClickAirPlane(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc5b75d82e9c2d935dae1516527ed813", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc5b75d82e9c2d935dae1516527ed813");
        } else if (bVar == null || !this.k.bh.equals(bVar.a) || TextUtils.isEmpty(bVar.b) || this.b == null || this.b.isFinishing()) {
        } else {
            this.k.G = true;
            d.a(this.b, bVar.b);
        }
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, com.meituan.android.mrn.container.MRNBaseFragment
    public final Uri m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d84fcfb07c42f16d858a9ecd0d2e6458", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d84fcfb07c42f16d858a9ecd0d2e6458");
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("mrn_biz", "supermarket").appendQueryParameter("entrance_id", String.valueOf(this.k.y)).appendQueryParameter("category_type", String.valueOf(this.k.z)).appendQueryParameter("category_text", this.k.A).appendQueryParameter("sub_category_type", String.valueOf(this.k.B)).appendQueryParameter("uuid", this.k.bh);
        if (this.k.bg) {
            if (this.k.C > 0) {
                appendQueryParameter.appendQueryParameter("sec_cat_id", String.valueOf(this.k.C));
            }
            return appendQueryParameter.appendQueryParameter("mrn_entry", "medicine-search-suggest").appendQueryParameter("is_drug", "1").appendQueryParameter("mrn_component", "medicine-search-suggest").build();
        }
        return appendQueryParameter.appendQueryParameter("mrn_entry", "flashbuy-search-suggest").appendQueryParameter("is_drug", "0").appendQueryParameter("mrn_component", "flashbuy-search-suggest").build();
    }

    public final void a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f976f0f9e88952cd1067b5978ad2d89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f976f0f9e88952cd1067b5978ad2d89");
            return;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        if (valueOf.length() > 4) {
            valueOf = valueOf.substring(4);
        }
        if (str == null) {
            str = j > 0 ? String.valueOf(j) : "";
        }
        this.o = valueOf + Math.abs(str.hashCode());
        if (this.k != null) {
            this.k.v = this.o;
        }
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1ac955b0090a92ea4bf777ae90b9937", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1ac955b0090a92ea4bf777ae90b9937");
        } else if (this.b == null) {
            this.p = true;
            this.n = str;
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.p = false;
            this.n = str;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("keyword", str);
            writableNativeMap.putString("globalId", this.o);
            writableNativeMap.putString("uuid", this.k.bh);
            n.a(o(), "didReceiveNewKeyword", writableNativeMap);
        }
    }

    public static SuggestRNFragment s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a44a827ccc627925328e8b6813916e24", RobustBitConfig.DEFAULT_VALUE) ? (SuggestRNFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a44a827ccc627925328e8b6813916e24") : new SuggestRNFragment();
    }
}
