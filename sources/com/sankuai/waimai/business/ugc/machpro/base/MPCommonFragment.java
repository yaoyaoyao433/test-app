package com.sankuai.waimai.business.ugc.machpro.base;

import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.machpro.WMMachProActivityDelegate;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.util.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPCommonFragment extends MPCustomBaseFragment {
    public static ChangeQuickRedirect a;

    public static MPCommonFragment a(String str, String str2, String str3, Uri uri) {
        Object[] objArr = {str, str2, str3, uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf9b285634d5f79cc183d184bf46b0be", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPCommonFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf9b285634d5f79cc183d184bf46b0be");
        }
        MPCommonFragment mPCommonFragment = new MPCommonFragment();
        Bundle bundle = new Bundle();
        bundle.putString("bundle_name", str2);
        bundle.putString("biz", str);
        bundle.putString(WMMachProActivityDelegate.MP_EXTRA_DATA, str3);
        if (uri != null) {
            bundle.putParcelable("mp_scheme_params", uri);
        }
        mPCommonFragment.setArguments(bundle);
        return mPCommonFragment;
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment
    public final MachMap a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3578d395753602e36238ffaacd6e31b", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3578d395753602e36238ffaacd6e31b");
        }
        try {
            return b.a(new JSONObject(getArguments().getString(WMMachProActivityDelegate.MP_EXTRA_DATA)));
        } catch (Exception e) {
            a.b(e);
            return new MachMap();
        }
    }

    @Override // com.sankuai.waimai.business.ugc.machpro.base.MPCustomBaseFragment, com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Uri uri;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8422651176bb3e37235605d3ec4e0d3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8422651176bb3e37235605d3ec4e0d3f");
            return;
        }
        super.onCreate(bundle);
        this.g.a(new com.sankuai.waimai.machpro.adapter.b() { // from class: com.sankuai.waimai.business.ugc.machpro.base.MPCommonFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.machpro.adapter.b
            public final void a(Dialog dialog) {
                Object[] objArr2 = {dialog};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "21dccfcc79eaed818a8fcf14e12429f7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "21dccfcc79eaed818a8fcf14e12429f7");
                } else if (dialog != null) {
                    ae.a(dialog.getWindow());
                }
            }

            @Override // com.sankuai.waimai.machpro.adapter.b
            public final void b(Dialog dialog) {
                Object[] objArr2 = {dialog};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d8c5d6697a0fb47f6b760ebd3df8c91", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d8c5d6697a0fb47f6b760ebd3df8c91");
                } else {
                    ae.a();
                }
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3af8db06ad5affbcab8fb3e8d710f0cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3af8db06ad5affbcab8fb3e8d710f0cf");
            return;
        }
        MachMap machMap = new MachMap();
        MachMap machMap2 = new MachMap();
        Bundle arguments = getArguments();
        if (arguments != null && (uri = (Uri) arguments.getParcelable("mp_scheme_params")) != null) {
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    String queryParameter = uri.getQueryParameter(str);
                    if (!TextUtils.isEmpty(queryParameter)) {
                        machMap2.put(str, queryParameter);
                    }
                }
            }
        }
        machMap.put("schemeParams", machMap2);
        a(machMap);
    }
}
