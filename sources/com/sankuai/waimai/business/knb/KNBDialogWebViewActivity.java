package com.sankuai.waimai.business.knb;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBDialogWebViewActivity extends KNBWebViewActivity {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.business.knb.KNBWebViewActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "571ab87ae2997675db4e3368aa0880b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "571ab87ae2997675db4e3368aa0880b1");
            return;
        }
        Intent intent = new Intent(context, KNBDialogWebViewActivity.class);
        intent.putExtra("url", str);
        if (!(context instanceof Activity)) {
            intent.addFlags(y.a);
        }
        try {
            context.startActivity(intent);
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(0, 0);
            }
        } catch (ActivityNotFoundException | SecurityException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    @Override // com.sankuai.waimai.business.knb.KNBWebViewActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "505e5a703624f814f0984d45f40767da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "505e5a703624f814f0984d45f40767da");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3cc8134cead8019f0954816f9fe8cfea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3cc8134cead8019f0954816f9fe8cfea");
        } else if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        ((ImageView) findViewById(R.id.image_close)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.knb.KNBDialogWebViewActivity.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0b647582e71d45748a60be0863df2a74", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0b647582e71d45748a60be0863df2a74");
                    return;
                }
                com.sankuai.waimai.platform.domain.manager.crawler.a.a().c();
                KNBDialogWebViewActivity.this.finish();
            }
        });
    }

    @Override // com.sankuai.waimai.business.knb.KNBWebViewActivity
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18582d6605787ab99301228604983cd9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18582d6605787ab99301228604983cd9")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            setContentView(R.layout.wm_knb_crawler_webview_activity_for_android_p);
            return true;
        }
        setContentView(R.layout.wm_knb_crawler_webview_activity);
        return true;
    }

    @Override // com.sankuai.waimai.business.knb.KNBWebViewActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4abee1dc8b43fe5ada5c31a2a5c005d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4abee1dc8b43fe5ada5c31a2a5c005d");
            return;
        }
        super.onStart();
        a(false);
    }

    @Override // android.app.Activity
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8a468171ce4409f31d11f5c9f3d148f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8a468171ce4409f31d11f5c9f3d148f");
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }
}
