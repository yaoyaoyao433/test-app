package com.sankuai.waimai.business.knb.api;

import android.content.Context;
import android.support.v4.app.Fragment;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IVIPCardFragmentDelegate {
    String addCommonParam(Context context, String str);

    Class getKNBFragmentClass();

    void loadUrl(Fragment fragment, String str);

    void refresh(Fragment fragment);

    void setTitle(Fragment fragment, String str);

    boolean supportPreload(Context context, String str);
}
