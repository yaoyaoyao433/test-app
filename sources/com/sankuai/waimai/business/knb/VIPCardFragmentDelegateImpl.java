package com.sankuai.waimai.business.knb;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.api.IVIPCardFragmentDelegate;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class VIPCardFragmentDelegateImpl implements IVIPCardFragmentDelegate {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.business.knb.api.IVIPCardFragmentDelegate
    public Class getKNBFragmentClass() {
        return VIPCardKNBFragment.class;
    }

    @Override // com.sankuai.waimai.business.knb.api.IVIPCardFragmentDelegate
    public void loadUrl(Fragment fragment, String str) {
        Object[] objArr = {fragment, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eab51fbd23b8e4baccfaba1f8b05e241", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eab51fbd23b8e4baccfaba1f8b05e241");
        } else if (fragment != null) {
            ((VIPCardKNBFragment) fragment).b(str);
        }
    }

    @Override // com.sankuai.waimai.business.knb.api.IVIPCardFragmentDelegate
    public void setTitle(Fragment fragment, String str) {
        Object[] objArr = {fragment, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1b2988038c2af399001e0a26dc0fbde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1b2988038c2af399001e0a26dc0fbde");
        } else if (fragment != null) {
            ((VIPCardKNBFragment) fragment).c(str);
        }
    }

    @Override // com.sankuai.waimai.business.knb.api.IVIPCardFragmentDelegate
    public void refresh(Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2ce6aebb2d30dff2d28014fc1eb54b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2ce6aebb2d30dff2d28014fc1eb54b3");
        } else if (fragment != null) {
            ((VIPCardKNBFragment) fragment).m();
        }
    }

    @Override // com.sankuai.waimai.business.knb.api.IVIPCardFragmentDelegate
    public boolean supportPreload(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d97bac97c8f8ce6e1121cbb944a616d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d97bac97c8f8ce6e1121cbb944a616d")).booleanValue() : f.a(context, str);
    }

    @Override // com.sankuai.waimai.business.knb.api.IVIPCardFragmentDelegate
    public String addCommonParam(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc1445075bd39669285ccc6145280393", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc1445075bd39669285ccc6145280393");
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        User user = UserCenter.getInstance(context).getUser();
        if (user != null && user.id != 0) {
            buildUpon.appendQueryParameter("token", user.token);
            buildUpon.appendQueryParameter("userid", String.valueOf(user.id));
        }
        String i = com.sankuai.waimai.foundation.location.g.i();
        if (!TextUtils.isEmpty(i)) {
            if (i.length() > 30) {
                i = i.substring(0, 30);
            }
            buildUpon.appendQueryParameter(GearsLocator.ADDRESS, i);
        }
        if (!"android".equals(parse.getQueryParameter("f"))) {
            buildUpon.appendQueryParameter("f", "android");
        }
        if (TextUtils.isEmpty(parse.getQueryParameter("version"))) {
            buildUpon.appendQueryParameter("version", String.valueOf(com.sankuai.waimai.platform.b.A().j()));
        }
        buildUpon.appendQueryParameter("no_back_button", "1");
        StringBuilder sb = new StringBuilder();
        sb.append(com.sankuai.waimai.foundation.utils.g.e(com.meituan.android.singleton.b.a));
        buildUpon.appendQueryParameter("statusbar_height", sb.toString());
        Uri build = buildUpon.build();
        Uri a = com.sankuai.waimai.router.utils.f.a(com.sankuai.waimai.router.utils.f.a(build, com.sankuai.waimai.platform.net.e.a(build.toString())), com.sankuai.waimai.platform.net.c.a().g());
        if (com.sankuai.waimai.business.knb.utils.c.a() != null) {
            a = com.sankuai.waimai.router.utils.f.a(a, com.sankuai.waimai.business.knb.utils.c.a());
        }
        return a.toString();
    }
}
