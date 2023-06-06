package com.sankuai.waimai.business.page.home.list.feed;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.mrn.container.g;
import com.meituan.android.mrn.engine.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.a;
import com.sankuai.waimai.business.page.home.utils.k;
import com.sankuai.waimai.business.page.homepage.bubble.b;
import com.sankuai.waimai.foundation.router.interfaces.c;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.preload.e;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment;
import com.sankuai.waimai.router.core.j;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ContentFeedRNFragment extends WMRNBaseFragment {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42c8ad13b380afbd824bb8d91a5d3985", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42c8ad13b380afbd824bb8d91a5d3985");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "43085dc09c0a568194cd895d60118fb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "43085dc09c0a568194cd895d60118fb2");
            return;
        }
        j jVar = new j(getContext(), c.ap);
        Bundle bundle2 = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra", null);
        if (bundle2 == null) {
            bundle2 = new Bundle();
            jVar.a("com.sankuai.waimai.router.activity.intent_extra", (String) bundle2);
        }
        for (Map.Entry<String, String> entry : q().entrySet()) {
            bundle2.putString(ContentFeedPreLoader.EXTRA_DATA_TAG + entry.getKey(), entry.getValue());
        }
        a aVar = b.a().c;
        if (aVar != null) {
            bundle2.putString("content_feed_content_param", aVar.g);
        }
        e.a().a(jVar);
        if (((WMRNBaseFragment) this).j != null) {
            ((WMRNBaseFragment) this).j.getIntent().putExtras(bundle2);
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6589418d38588588fe896b4cac7ade93", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6589418d38588588fe896b4cac7ade93") : super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final void e() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69c9bfd5acfb59e1783e4ee4b155d9bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69c9bfd5acfb59e1783e4ee4b155d9bd");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c971705ddaea596a6707dc41b4f27b8b", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c971705ddaea596a6707dc41b4f27b8b");
        } else {
            g n = n();
            if (!p.a(com.meituan.android.singleton.b.a)) {
                str = "N_10000";
            } else if (n == null || n.d() == null) {
                str = "M_10011";
            } else {
                str = "M_" + n.d().a();
            }
        }
        i.d(new com.sankuai.waimai.business.page.home.list.feed.log.a().a("content_feed_rn_fragment").b(str).c("内容Feed MRN页面加载失败").d(str).b(true).b());
        super.e();
    }

    @Override // com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "033395c4fee5c99c9a19a07f3db35c58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "033395c4fee5c99c9a19a07f3db35c58");
        } else {
            super.onResume();
        }
    }

    @Override // com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfd47814557a564d86b84ed7af0b4167", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfd47814557a564d86b84ed7af0b4167");
        } else {
            super.onPause();
        }
    }

    @Override // com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a49117ac0331b2e99eab193448054d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a49117ac0331b2e99eab193448054d0");
        } else {
            super.onDestroy();
        }
    }

    @Override // com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba1837f639e1046d907ac6fd9955ef68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba1837f639e1046d907ac6fd9955ef68");
        } else {
            super.a(z);
        }
    }

    @Override // com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87dbc99cc63afbcd399668c8f2b01be6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87dbc99cc63afbcd399668c8f2b01be6");
        } else {
            super.onHiddenChanged(z);
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final Uri m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4faf62a37f895c133e95725c18b5a48d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4faf62a37f895c133e95725c18b5a48d");
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("mrn_biz", "waimai").appendQueryParameter("mrn_entry", "content-feed-list").appendQueryParameter("mrn_component", "contentFeedList");
        for (Map.Entry<String, String> entry : q().entrySet()) {
            appendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return appendQueryParameter.build();
    }

    private HashMap<String, String> q() {
        Uri data;
        Set<String> queryParameterNames;
        String a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c52661bb9d74bf425b903c7608fd72", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c52661bb9d74bf425b903c7608fd72");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (getArguments() != null) {
            hashMap.put("page_scene", String.valueOf(getArguments().getInt("page_scene")));
            hashMap.put("ref_list_id", getArguments().getString("ref_list_id"));
            hashMap.put("preview_item_str", getArguments().getString("preview_item_str"));
            hashMap.put("click_id", getArguments().getString("click_id"));
            Object[] objArr2 = {(byte) 0};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5386083f69f65ce6d8ce6ff68dc9b422", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5386083f69f65ce6d8ce6ff68dc9b422");
            } else {
                a2 = ListIDHelper.a.a.a("page", k.e);
                if (TextUtils.isEmpty(a2)) {
                    a2 = ListIDHelper.a.a.a();
                    ListIDHelper.a.a.a("page", k.e, a2);
                }
            }
            hashMap.put("rank_list_id", a2);
        }
        if (((WMRNBaseFragment) this).j != null && (data = ((WMRNBaseFragment) this).j.getIntent().getData()) != null && (queryParameterNames = data.getQueryParameterNames()) != null && queryParameterNames.size() > 0) {
            for (String str : queryParameterNames) {
                hashMap.put(str, data.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2b0c453631680f71c6162d3f042b170", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2b0c453631680f71c6162d3f042b170");
            return;
        }
        try {
            a.AbstractC1040a c = new com.sankuai.waimai.business.page.home.list.feed.log.a().a("content_feed_rn_fragment").c("内容Feed 发送消息到RN侧");
            i.b(c.d("eventId:" + str + ", writableMap:" + writableMap).b(true).b());
            n.a(o(), str, writableMap);
        } catch (Exception unused) {
        }
    }

    public final void p() {
        Set<String> queryParameterNames;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a865f644a6b100af59c38a235736e37e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a865f644a6b100af59c38a235736e37e");
        } else if (((WMRNBaseFragment) this).j == null) {
            i.d(new com.sankuai.waimai.business.page.home.list.feed.log.a().a("content_feed_refresh").c("not_attached_to_activity").b());
        } else {
            WritableMap createMap = Arguments.createMap();
            Uri data = ((WMRNBaseFragment) this).j.getIntent().getData();
            if (data != null && (queryParameterNames = data.getQueryParameterNames()) != null && queryParameterNames.size() > 0) {
                for (String str : queryParameterNames) {
                    createMap.putString(str, data.getQueryParameter(str));
                }
            }
            a("refreshContentFeed", createMap);
        }
    }
}
