package com.sankuai.waimai.business.search.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.mrn.engine.n;
import com.meituan.android.mrn.utils.g;
import com.meituan.metrics.MetricsNameProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.ai.uat.context.a;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.business.search.common.util.e;
import com.sankuai.waimai.business.search.common.util.j;
import com.sankuai.waimai.business.search.model.PromotionWordsResponse;
import com.sankuai.waimai.business.search.monitor.horn.WMSearchHornConfigModel;
import com.sankuai.waimai.business.search.ui.mrn.GuideRNFragment;
import com.sankuai.waimai.business.search.ui.mrn.SuggestRNFragment;
import com.sankuai.waimai.business.search.ui.result.ResultFragment;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.k;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.db.dao.PoiSearchHistory;
import com.sankuai.waimai.platform.db.logic.PoiSearchHistoryLogic;
import com.sankuai.waimai.platform.model.c;
import com.sankuai.waimai.platform.monitor.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GlobalSearchActivity extends BaseActivity implements MetricsNameProvider, b {
    public static ChangeQuickRedirect a = null;
    public static ViewGroup i = null;
    private static String t = "";
    private static long u;
    private int D;
    private Handler E;
    private boolean F;
    private boolean G;
    private boolean H;
    public int b;
    public FragmentManager c;
    public GuideRNFragment d;
    public SuggestRNFragment e;
    public ResultFragment f;
    String g;
    public SearchShareData h;
    public EditText j;
    public com.sankuai.waimai.business.search.ui.actionbar.b k;
    private int l;
    private LinearLayout m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private com.sankuai.waimai.ai.uat.a r;
    private Boolean s;
    private boolean v;

    public GlobalSearchActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e379b73a4ac4edaa43de227c0c6ddae7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e379b73a4ac4edaa43de227c0c6ddae7");
            return;
        }
        this.b = 1;
        this.H = true;
    }

    public static /* synthetic */ boolean b(GlobalSearchActivity globalSearchActivity, boolean z) {
        globalSearchActivity.p = false;
        return false;
    }

    public static /* synthetic */ void e(GlobalSearchActivity globalSearchActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, globalSearchActivity, changeQuickRedirect, false, "cbce6baed6b5cfbd9a8765ba9eae0169", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, globalSearchActivity, changeQuickRedirect, false, "cbce6baed6b5cfbd9a8765ba9eae0169");
            return;
        }
        globalSearchActivity.j.setFocusable(true);
        globalSearchActivity.j.setFocusableInTouchMode(true);
        globalSearchActivity.j.requestFocus();
        if (globalSearchActivity.k != null) {
            globalSearchActivity.k.n();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x036c  */
    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r48) {
        /*
            Method dump skipped, instructions count: 2222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.search.ui.GlobalSearchActivity.onCreate(android.os.Bundle):void");
    }

    private String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f86234793f38daf81c6a7753d8d84d1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f86234793f38daf81c6a7753d8d84d1a");
        }
        if (f.a(this)) {
            return g.a(Collections.emptyList());
        }
        if (this.h == null) {
            return g.a(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        if (d.a(this.h.r)) {
            return g.a(arrayList);
        }
        Iterator<RecommendedSearchKeyword> it = this.h.r.iterator();
        while (it.hasNext()) {
            RecommendedSearchKeyword next = it.next();
            HashMap hashMap = new HashMap();
            hashMap.put("keyWord", !TextUtils.isEmpty(next.scheme) ? next.scheme : next.searchKeyword);
            hashMap.put("showWord", next.viewKeyword);
            hashMap.put("index", Integer.valueOf(next.exposedIndex));
            hashMap.put("exposure", Boolean.valueOf(next.isExposed));
            hashMap.put("wordType", Integer.valueOf(next.wordType));
            arrayList.add(hashMap);
        }
        return g.a(arrayList);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements HornCallback {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.common.horn.HornCallback
        public final void onChanged(boolean z, String str) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61ffa924b94f87c68387a909aafe6ee4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61ffa924b94f87c68387a909aafe6ee4");
            } else if (!z) {
                com.sankuai.waimai.business.search.monitor.horn.a.a().a((WMSearchHornConfigModel) null);
            } else if (TextUtils.isEmpty(str)) {
                com.sankuai.waimai.business.search.monitor.horn.a.a().a((WMSearchHornConfigModel) null);
            } else {
                WMSearchHornConfigModel deserialize = WMSearchHornConfigModel.deserialize(str);
                if (deserialize == null) {
                    deserialize = new WMSearchHornConfigModel();
                }
                com.sankuai.waimai.business.search.monitor.horn.a.a().a(deserialize);
            }
        }
    }

    private void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00d7af08fa997bdb08c49c92188f208a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00d7af08fa997bdb08c49c92188f208a");
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("url");
                    b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a2.b = context;
                    a2.c = optString;
                    a2.a(new b.a() { // from class: com.sankuai.waimai.business.search.ui.GlobalSearchActivity.6
                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a() {
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a(Bitmap bitmap) {
                        }
                    });
                }
            }
        } catch (JSONException unused) {
        }
    }

    public final void a(String str, long j, String str2, boolean z, String str3) {
        Object[] objArr = {str, new Long(j), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37caba271030237d78c957aa5b55381b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37caba271030237d78c957aa5b55381b");
        } else if (this.d != null) {
            this.d.a(new com.sankuai.waimai.business.search.ui.guide.history.a(j, str2, str, z, str3));
        }
    }

    public final void a(String str, long j, boolean z, String str2) {
        Object[] objArr = {str, 0L, (byte) 0, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a71cf35aed4b1f5831f45bad8a77249a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a71cf35aed4b1f5831f45bad8a77249a");
        } else {
            a(str, 0L, "", false, null);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfc7d69e1b050d447a7b7fab14ae9e77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfc7d69e1b050d447a7b7fab14ae9e77");
            return;
        }
        super.onSaveInstanceState(bundle);
        this.f.f();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38bdb9670d54c98e27a2c7ea2a1c1386", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38bdb9670d54c98e27a2c7ea2a1c1386");
        } else {
            super.onRestoreInstanceState(bundle);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21fc9aed887cd8df77bf77ed5e17d9f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21fc9aed887cd8df77bf77ed5e17d9f1");
            return;
        }
        com.sankuai.waimai.ai.uat.b.a().a(a.b.WMUATPageSearch, this.r);
        String a2 = com.sankuai.waimai.foundation.router.a.a(getIntent(), "dpSource", (String) null);
        if (!TextUtils.isEmpty(a2)) {
            try {
                HashMap hashMap = new HashMap();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dp_source", a2);
                hashMap.put("custom", jSONObject);
                Statistics.setValLab(AppUtil.generatePageInfoKey(this), hashMap);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        JudasManualManager.a("c_nfqbfvw", this);
        super.onResume();
        if (this.H && this.G && !this.v && !this.q) {
            Handler handler = this.E;
            Runnable runnable = new Runnable() { // from class: com.sankuai.waimai.business.search.ui.GlobalSearchActivity.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b5652d0998fec798d4c4f0f96e86dd0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b5652d0998fec798d4c4f0f96e86dd0");
                    } else {
                        GlobalSearchActivity.e(GlobalSearchActivity.this);
                    }
                }
            };
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            handler.postDelayed(runnable, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6836fe85ca73a8cec8624a128a5329e3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6836fe85ca73a8cec8624a128a5329e3")).booleanValue() : "oppo".equals(Build.BRAND.toLowerCase()) ? 200L : 100L);
        }
        if (this.H && this.v) {
            if (!TextUtils.isEmpty(this.h.g)) {
                if (com.sankuai.waimai.foundation.core.a.f()) {
                    if (com.sankuai.waimai.foundation.location.v2.g.a().i() == null) {
                        com.sankuai.waimai.foundation.location.v2.g.a().a(new com.sankuai.waimai.foundation.location.v2.callback.a() { // from class: com.sankuai.waimai.business.search.ui.GlobalSearchActivity.11
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.foundation.location.v2.callback.a
                            public final void a(@Nullable WmAddress wmAddress) {
                                Object[] objArr3 = {wmAddress};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0acbb09569aef93c6bc767c533343e3c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0acbb09569aef93c6bc767c533343e3c");
                                } else {
                                    GlobalSearchActivity.this.l();
                                }
                            }
                        }, false, "waimai-search", new k((FragmentActivity) this, "dj-d4647881c8ba212a"));
                        return;
                    } else {
                        l();
                        return;
                    }
                }
                l();
                return;
            }
            this.v = false;
            j.a(this, getResources().getString(R.string.wm_nox_search_global_hint));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c610950a0b9f2fcd22dc5693ffca542c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c610950a0b9f2fcd22dc5693ffca542c");
            return;
        }
        a("11002");
        a(this.h.g, 14, 0, true);
        PoiSearchHistoryLogic.saveDistinctObject(new PoiSearchHistory(null, this.h.g, Long.valueOf(System.currentTimeMillis()), 0L));
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0058997632f1422082c4333a1ad7f4b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0058997632f1422082c4333a1ad7f4b0");
        } else if (this.v && this.b == 3) {
            finish();
            overridePendingTransition(17432576, 17432577);
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "936f84a73b12ef03fe45e28aaf86db23", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "936f84a73b12ef03fe45e28aaf86db23");
            } else if (this.b == 3) {
                this.j.setText("");
                this.k.n();
                this.k.g();
                this.p = false;
            } else if (this.p) {
                this.F = true;
                this.k.e();
                this.k.y();
                m();
            } else {
                this.k.m();
                finishAfterTransition();
                overridePendingTransition(17432576, 17432577);
            }
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fad48e87b993cf897925833292b8989f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fad48e87b993cf897925833292b8989f");
            return;
        }
        super.onUserLeaveHint();
        this.H = false;
        if (this.k != null) {
            this.k.m();
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bc01582f3debc1cf9f19084edf5453e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bc01582f3debc1cf9f19084edf5453e")).booleanValue() : c.a().b() == 1;
    }

    public final void a(String str) {
        this.h.e = str;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c5630ec2983bf6e2d1ae6b3ebfce9b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c5630ec2983bf6e2d1ae6b3ebfce9b5");
        } else {
            this.k.m();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, com.sankuai.waimai.foundation.core.base.activity.c
    public final Map<String, String> Z_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6238862fa4a20bc47863e4ef7583beb0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6238862fa4a20bc47863e4ef7583beb0");
        }
        HashMap hashMap = new HashMap();
        if (this.f != null && this.f.isVisible()) {
            hashMap.put("page_id", "waimai_search_result");
        }
        return hashMap;
    }

    public final void a(long j, String str, String str2, String str3, String str4, int i2, int i3, boolean z) {
        String str5;
        PromotionWordsResponse.a b;
        Object[] objArr = {new Long(j), str, str2, str3, str4, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c883a8ed913683b0ccdab5600d085f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c883a8ed913683b0ccdab5600d085f0");
        } else if (TextUtils.isEmpty(str2)) {
            j.a(this, getResources().getString(R.string.wm_nox_search_global_hint));
        } else if (this.h.o != null && ((str2.equals(this.h.o.viewKeyword) || str2.equals(this.h.o.searchKeyword)) && !TextUtils.isEmpty(this.h.o.scheme) && i3 == 0)) {
            if (this.h.B) {
                s().recordStep("save_history");
            }
            a(str2, j, str, false, null);
            com.sankuai.waimai.foundation.router.a.a(this, this.h.o.scheme);
        } else if (i2 == 0 && (b = e.b(str2, e.b.SEARCH)) != null) {
            if (this.h.B) {
                s().recordStep("save_history");
            }
            a(str2, j, str, false, null);
            com.sankuai.waimai.foundation.router.a.a(this, b.b, (Bundle) null, 300);
        } else {
            if (z) {
                s().recordStep("resume_result_page");
            }
            m();
            this.F = true;
            if (i2 == 4) {
                str5 = this.k.k;
                this.h.g = str5;
            } else {
                str5 = str2;
            }
            if (i2 != 4 && i2 != 12) {
                this.j.setText(!TextUtils.isEmpty(str3) ? str3 : str5);
            }
            this.h.B = z;
            this.f.a(j, str, str5, str4, i2, i3);
        }
    }

    public final void a(long j, String str, String str2, int i2, int i3, boolean z) {
        Object[] objArr = {new Long(j), str, str2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad77be79e267a81f9d5f6aea05772d20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad77be79e267a81f9d5f6aea05772d20");
        } else {
            a(j, str, str2, "", "", i2, i3, z);
        }
    }

    public final void a(String str, int i2, int i3, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d63698d9f8cedb0a200f48079d0c4229", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d63698d9f8cedb0a200f48079d0c4229");
        } else {
            a(0L, "", str, i2, i3, z);
        }
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "148fc7a92ed4390b74fb829a5b6fd41d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "148fc7a92ed4390b74fb829a5b6fd41d");
            return;
        }
        if (this.e != null) {
            this.e.i = "";
        }
        if (this.f != null && !this.f.isVisible()) {
            FragmentTransaction beginTransaction = this.c.beginTransaction();
            beginTransaction.hide(this.d);
            beginTransaction.hide(this.e);
            beginTransaction.show(this.f);
            beginTransaction.commitAllowingStateLoss();
            this.b = 3;
            this.p = true;
        }
        if (this.k == null) {
            return;
        }
        this.k.m();
        this.k.h();
        this.k.l();
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "581c12de646c390a0e7d45dee5b606f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "581c12de646c390a0e7d45dee5b606f8");
            return;
        }
        if (this.d != null && !this.d.isVisible()) {
            FragmentTransaction beginTransaction = this.c.beginTransaction();
            beginTransaction.hide(this.e);
            beginTransaction.hide(this.f);
            beginTransaction.show(this.d);
            beginTransaction.commitAllowingStateLoss();
            this.b = 1;
        }
        if (this.k != null) {
            this.k.i();
            this.k.j();
            this.k.x();
        }
        if (i != null) {
            i.removeAllViews();
            i.setVisibility(8);
        }
        if (this.d == null || this.h.aq == null) {
            return;
        }
        com.meituan.android.mrn.engine.k o = this.d.o();
        if (o != null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("expKey", this.h.aq.a);
            createMap.putString("realFeature", com.sankuai.waimai.business.search.alita.a.a());
            n.a(o, "didAlitaRefreshGuessYouWant", createMap);
        }
        this.h.aq = null;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b49231aa027d4b6387b6a458f5f3279f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b49231aa027d4b6387b6a458f5f3279f");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        if (i2 == 300) {
            this.E.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.GlobalSearchActivity.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96117a0d6319d53725c0635c37f0a227", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96117a0d6319d53725c0635c37f0a227");
                        return;
                    }
                    GlobalSearchActivity.this.j.setText("");
                    GlobalSearchActivity.this.k.n();
                    GlobalSearchActivity.this.k.g();
                    GlobalSearchActivity.b(GlobalSearchActivity.this, false);
                }
            }, 100L);
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.meituan.metrics.MetricsNameProvider
    public String getName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb95eef3619999ec83ada0dd08ccc0a1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb95eef3619999ec83ada0dd08ccc0a1") : getClass().getName();
    }

    @Override // com.sankuai.waimai.platform.monitor.b
    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "356879cd22cccea9a8c99e6ccb54b5de", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "356879cd22cccea9a8c99e6ccb54b5de")).booleanValue() : this.j != null && this.j.isCursorVisible();
    }

    public static ViewGroup h() {
        return i;
    }
}
