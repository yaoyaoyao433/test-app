package com.meituan.android.yoda.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebCompactFactory;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import com.sankuai.meituan.takeoutnew.util.aop.f;
import com.sankuai.titans.base.Titans;
import com.sankuai.titans.base.TitansFragment;
import com.sankuai.titans.protocol.services.IContainerAdapter;
import com.sankuai.titans.protocol.services.IContainerProvider;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class YodaKNBActivity extends AppCompatActivity implements IContainerProvider {
    public static ChangeQuickRedirect a;
    public WebView b;
    private final KNBWebCompat c;
    private TitansFragment d;
    private IContainerAdapter e;

    public YodaKNBActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4da8762f9027cc2b11b0842a1503a308", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4da8762f9027cc2b11b0842a1503a308");
        } else {
            this.c = KNBWebCompactFactory.getKNBCompact(0);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b5e00db44445b756aa46292b8413afa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b5e00db44445b756aa46292b8413afa");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaKNBActivity", "onCreate.", true);
        super.onCreate(bundle);
        if (!Titans.hasInit()) {
            Object[] objArr2 = {bundle};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "593923d0791f4b0394ce4c80c03b2498", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "593923d0791f4b0394ce4c80c03b2498");
                return;
            }
            com.meituan.android.yoda.monitor.log.a.a("YodaKNBActivity", "initializeOldKNBCompat.", true);
            this.c.onCreate(getApplicationContext(), getIntent().getExtras());
            View onCreateView = this.c.onCreateView(getLayoutInflater(), null);
            this.b = this.c.getWebView();
            setContentView(onCreateView);
            this.c.onActivityCreated(bundle);
            this.c.setLLButtonClickListener(new View.OnClickListener() { // from class: com.meituan.android.yoda.activity.YodaKNBActivity.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bacae60ff1cf63108c9672a530f533a0", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bacae60ff1cf63108c9672a530f533a0");
                    } else if (YodaKNBActivity.this.b != null && YodaKNBActivity.this.b.canGoBack()) {
                        YodaKNBActivity.this.b.goBack();
                    } else {
                        YodaKNBActivity.this.finish();
                    }
                }
            });
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f5f6345b30f80db16b54529ef87ce8c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f5f6345b30f80db16b54529ef87ce8c2");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaKNBActivity", "initializeNewKNBCompat.", true);
        setContentView(R.layout.yoda_knb_activity_layout);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("titans_fragment");
        if (findFragmentByTag instanceof TitansFragment) {
            this.d = (TitansFragment) findFragmentByTag;
            return;
        }
        this.d = new TitansFragment();
        beginTransaction.replace(R.id.fragment_container, this.d, "titans_fragment");
        beginTransaction.commitAllowingStateLoss();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c554ab8fd56e9e1552b9688d870c7228", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c554ab8fd56e9e1552b9688d870c7228");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaKNBActivity", "onStart.", true);
        super.onStart();
        if (Titans.hasInit()) {
            return;
        }
        this.c.onStart();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f93554926cefeeb553b0545664d3017", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f93554926cefeeb553b0545664d3017");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaKNBActivity", "onResume.", true);
        super.onResume();
        if (Titans.hasInit()) {
            return;
        }
        this.c.onResume();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee06b91a088edaf83cef7b706211f329", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee06b91a088edaf83cef7b706211f329");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaKNBActivity", "onPause.", true);
        super.onPause();
        if (Titans.hasInit()) {
            return;
        }
        this.c.onPause();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a1679d8c846cee4c51863acac1bbae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a1679d8c846cee4c51863acac1bbae");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaKNBActivity", "onStop.", true);
        super.onStop();
        if (Titans.hasInit()) {
            return;
        }
        this.c.onStop();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f029b18e83b8b6038be46f29923f75eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f029b18e83b8b6038be46f29923f75eb");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("YodaKNBActivity", "onDestroy.", true);
        super.onDestroy();
        if (Titans.hasInit()) {
            return;
        }
        this.c.onDestroy();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2522dc9d7e28f424661e6168c7c64e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2522dc9d7e28f424661e6168c7c64e4");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (!Titans.hasInit()) {
            this.c.onActivityResult(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f229c22ab7340b906bdbfa5953628e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f229c22ab7340b906bdbfa5953628e8");
        } else if (f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (Titans.hasInit()) {
                return;
            }
            this.c.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // com.sankuai.titans.protocol.services.IContainerProvider
    @NonNull
    public final IContainerAdapter getIContainerAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aab9bc4231d9a5f0da9a30356c8da2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (IContainerAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aab9bc4231d9a5f0da9a30356c8da2d");
        }
        this.e = new IContainerAdapter() { // from class: com.meituan.android.yoda.activity.YodaKNBActivity.1
            @Override // com.sankuai.titans.protocol.services.IContainerAdapter
            public final String h5UrlParameterName() {
                return "url";
            }

            @Override // com.sankuai.titans.protocol.services.IContainerAdapter
            public final String scheme() {
                return "yoda://www.meituan.com/knbview";
            }
        };
        return this.e;
    }
}
