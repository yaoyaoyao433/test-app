package com.meituan.android.legwork.ui.abactivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.legwork.ui.abbase.ABBaseActivity;
import com.meituan.android.legwork.ui.abfragment.LegworkMRNBaseFragment;
import com.meituan.android.legwork.ui.abfragment.LegworkMainBFragment;
import com.meituan.android.legwork.utils.a;
import com.meituan.android.legwork.utils.b;
import com.meituan.android.legwork.utils.x;
import com.meituan.android.mrn.engine.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LegworkMainActivity extends ABBaseActivity {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.legwork.ui.abbase.ABBaseActivity
    public final String a() {
        return b.c;
    }

    @Override // com.meituan.android.legwork.ui.abbase.ABBaseActivity
    @NonNull
    public final Fragment b() {
        String json;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f061760d794a735309e9d180cfa33464", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f061760d794a735309e9d180cfa33464");
        }
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("one_more_order_id")) {
            a aVar = new a();
            Object[] objArr2 = {this, intent};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "efbb7973243e782f73c90279273263c6", RobustBitConfig.DEFAULT_VALUE)) {
                return (Fragment) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "efbb7973243e782f73c90279273263c6");
            }
            String b = com.meituan.android.legwork.mrn.b.a().b("legwork-send", "legwork-send", null);
            Object[] objArr3 = {intent};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "b3a7d60b1e354ac92b72ce3aa0997900", RobustBitConfig.DEFAULT_VALUE)) {
                json = (String) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "b3a7d60b1e354ac92b72ce3aa0997900");
            } else {
                HashMap hashMap = new HashMap(4);
                if (intent.hasExtra("one_more_order_id")) {
                    hashMap.put("one_more_order_id", String.valueOf(f.a(intent, "one_more_order_id", 0L)));
                    if (intent.hasExtra("order_source")) {
                        hashMap.put("order_source", f.a(intent, "order_source"));
                    }
                }
                if (intent.getData() == null) {
                    json = com.meituan.android.legwork.net.util.b.a().toJson(hashMap);
                } else {
                    Uri data = intent.getData();
                    String queryParameter = data.getQueryParameter("one_more_order_id");
                    if (TextUtils.isEmpty(queryParameter)) {
                        json = com.meituan.android.legwork.net.util.b.a().toJson(hashMap);
                    } else {
                        hashMap.put("one_more_order_id", queryParameter);
                        hashMap.put("order_source", data.getQueryParameter("order_source"));
                        json = com.meituan.android.legwork.net.util.b.a().toJson(hashMap);
                    }
                }
            }
            Uri build = Uri.parse(b).buildUpon().appendQueryParameter("sendOneMoreOrder", json).build();
            Bundle bundle = new Bundle();
            bundle.putParcelable("mrn_arg", build);
            bundle.putString("eventType", "event_type_one_more_order");
            x.d("ABTestPageUtils.getHomeSendFragment()", "使用MRN的帮送下单页（再来一单）");
            return Fragment.instantiate(this, LegworkMRNBaseFragment.class.getName(), bundle);
        }
        return new LegworkMainBFragment();
    }

    @Override // com.meituan.android.legwork.ui.abbase.ABBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36c8adad874b33ea0e5228e01964377e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36c8adad874b33ea0e5228e01964377e");
            return;
        }
        super.onCreate(bundle);
        Statistics.disableAutoPV(AppUtil.generatePageInfoKey(this));
        Statistics.disableAutoPD(AppUtil.generatePageInfoKey(this));
        Statistics.disablePageIdentify(AppUtil.generatePageInfoKey(this));
        u.a(this, "legwork_homepage");
    }

    public String a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a17ae75150646e182ab74ece1aec105", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a17ae75150646e182ab74ece1aec105");
        }
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("mrn_entry");
            String queryParameter2 = uri.getQueryParameter("mrn_component");
            if (TextUtils.isEmpty(queryParameter)) {
                return null;
            }
            return queryParameter + CommonConstant.Symbol.UNDERLINE + queryParameter2;
        }
        return null;
    }
}
