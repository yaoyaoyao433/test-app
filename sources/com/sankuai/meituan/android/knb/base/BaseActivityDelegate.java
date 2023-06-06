package com.sankuai.meituan.android.knb.base;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import com.sankuai.meituan.android.knb.KNBRouterManager;
import com.sankuai.meituan.android.knb.KNBWebCompactFactory;
import com.sankuai.meituan.android.knb.util.UriUtil;
import com.sankuai.waimai.platform.utils.f;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BaseActivityDelegate extends AbsActivityDelegate {
    private static final int ON_CREATE = 0;
    private static final int ON_DESTROY = 5;
    private static final int ON_PAUSE = 3;
    private static final int ON_RESUME = 1;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static boolean hasCreated = false;
    private static boolean hasFinished = false;
    private Bundle createBundle;
    private boolean hasResult;
    private Intent intent;
    private boolean isFirst;
    private int requestCode;
    private int resultCode;
    private int status;

    @LayoutRes
    public int getContentViewResId() {
        return R.layout.knb_base_activity;
    }

    @Override // com.sankuai.meituan.android.knb.base.AbsActivityDelegate
    public void onWebCompatCreated() {
    }

    @Override // com.sankuai.meituan.android.knb.base.AbsActivityDelegate
    public View onWebCompatViewCreated(View view) {
        return view;
    }

    public BaseActivityDelegate(Activity activity, ActionBar actionBar, IKNBWebCompat iKNBWebCompat) {
        super(activity, actionBar, iKNBWebCompat);
        Object[] objArr = {activity, actionBar, iKNBWebCompat};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "281df317db670d9a02d5d092ccd80f86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "281df317db670d9a02d5d092ccd80f86");
        } else {
            this.isFirst = false;
        }
    }

    @Override // com.sankuai.meituan.android.knb.base.AbsActivityDelegate
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77bed6ef7b8bd806901a0e221e8fb1a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77bed6ef7b8bd806901a0e221e8fb1a8");
        } else {
            onCreateSelf(bundle);
        }
    }

    @Override // com.sankuai.meituan.android.knb.base.AbsActivityDelegate
    public void onCreateSelf(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a02f8b2d5d611ca60340632eade8b89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a02f8b2d5d611ca60340632eade8b89");
            return;
        }
        this.impl.setContentView(getContentViewResId());
        if (this.supportActionBar != null) {
            this.supportActionBar.c();
        }
        this.status = 0;
        Intent intent = this.impl.getIntent();
        if (!hasCreated) {
            hasCreated = true;
            if (intent != null) {
                this.isFirst = f.a(intent, "first", false);
                KNBConfig.setFirstPageWeb(this.isFirst);
            }
        }
        if (!this.isFirst) {
            createCompat(bundle);
        } else {
            this.createBundle = bundle;
        }
    }

    @Override // com.sankuai.meituan.android.knb.base.AbsActivityDelegate
    public void createCompat(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d9f9610fc27bd160281edd56de2cf7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d9f9610fc27bd160281edd56de2cf7b");
            return;
        }
        onWebCompatCreate();
        handleCompatCreate(handleIntent(), bundle);
    }

    private void handleCompatCreate(Bundle bundle, Bundle bundle2) {
        Object[] objArr = {bundle, bundle2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9ac44820018ece573a0ef8667361691", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9ac44820018ece573a0ef8667361691");
            return;
        }
        this.mKnbWebCompat.onCreate(this.impl, bundle);
        if (this.iknbWebCompat != null) {
            this.iknbWebCompat.onWebCompatCreated();
        }
        onWebCompatCreated();
        View onCreateView = this.mKnbWebCompat.onCreateView(this.impl.getLayoutInflater(), null);
        View onWebCompatViewCreated = this.iknbWebCompat != null ? this.iknbWebCompat.onWebCompatViewCreated(onCreateView) : null;
        View onWebCompatViewCreated2 = onWebCompatViewCreated == null ? onWebCompatViewCreated(onCreateView) : onWebCompatViewCreated;
        if (onWebCompatViewCreated2 != null) {
            onCreateView = onWebCompatViewCreated2;
        }
        ((FrameLayout) this.impl.findViewById(R.id.content)).addView(onCreateView, new FrameLayout.LayoutParams(-1, -1));
        this.mKnbWebCompat.onActivityCreated(bundle2);
        if (this.iknbWebCompat != null) {
            this.iknbWebCompat.onWebCompatActivityCreated();
        }
        onWebCompatActivityCreated();
    }

    @Override // com.sankuai.meituan.android.knb.base.AbsActivityDelegate
    public void onWebCompatCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c687a25cde56eaf8575f89ecdefbec2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c687a25cde56eaf8575f89ecdefbec2");
        } else {
            this.mKnbWebCompat = KNBWebCompactFactory.getKNBCompact(0, this.impl);
        }
    }

    @Override // com.sankuai.meituan.android.knb.base.AbsActivityDelegate
    public void onWebCompatActivityCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fec1d83383843a5a2ded74bcc154c300", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fec1d83383843a5a2ded74bcc154c300");
        } else {
            KNBRouterManager.getInstance().pushActivity(this.mKnbWebCompat.getWebHandler().getUrl(), this.impl);
        }
    }

    @Override // com.sankuai.meituan.android.knb.base.AbsActivityDelegate
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52aa9af064a8f72ffbae7ecdffe80ec8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52aa9af064a8f72ffbae7ecdffe80ec8");
        } else if (this.mKnbWebCompat != null) {
            this.mKnbWebCompat.onStart();
        }
    }

    @Override // com.sankuai.meituan.android.knb.base.AbsActivityDelegate
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b2be8b7f1fddf0bdabb4e9422677fa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b2be8b7f1fddf0bdabb4e9422677fa4");
            return;
        }
        this.status = 1;
        if (this.isFirst) {
            new Handler(this.impl.getMainLooper()).postDelayed(new DelayRunnable(this), 200L);
            this.isFirst = false;
        } else if (this.mKnbWebCompat != null) {
            this.mKnbWebCompat.onResume();
        }
    }

    @Override // com.sankuai.meituan.android.knb.base.AbsActivityDelegate
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc6c35362987482236eda8fc41b389cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc6c35362987482236eda8fc41b389cc");
        } else if (this.mKnbWebCompat != null) {
            this.mKnbWebCompat.onSaveInstanceState(bundle);
        }
    }

    @Override // com.sankuai.meituan.android.knb.base.AbsActivityDelegate
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dd95271a44e70dc43c3a14fd53223da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dd95271a44e70dc43c3a14fd53223da");
            return;
        }
        this.status = 3;
        if (this.mKnbWebCompat != null) {
            this.mKnbWebCompat.onPause();
        }
    }

    @Override // com.sankuai.meituan.android.knb.base.AbsActivityDelegate
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e48fee3b9cf3626c5118f18aa8f55b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e48fee3b9cf3626c5118f18aa8f55b6");
        } else if (this.mKnbWebCompat != null) {
            this.mKnbWebCompat.onStop();
        }
    }

    @Override // com.sankuai.meituan.android.knb.base.AbsActivityDelegate
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d2c0609673eb804ecf338fa156e80ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d2c0609673eb804ecf338fa156e80ac");
            return;
        }
        this.status = 5;
        if (this.mKnbWebCompat != null) {
            this.mKnbWebCompat.onDestroy();
            KNBRouterManager.getInstance().popActivity(this.impl);
            this.mKnbWebCompat = null;
        }
    }

    @Override // com.sankuai.meituan.android.knb.base.AbsActivityDelegate
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "071ea76d5d79efb384f38152cce5f017", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "071ea76d5d79efb384f38152cce5f017");
        } else if (this.mKnbWebCompat != null) {
            this.mKnbWebCompat.onActivityResult(i, i2, intent);
            resetResult();
        } else {
            this.hasResult = true;
            this.requestCode = i;
            this.resultCode = i2;
            this.intent = intent;
        }
    }

    @Override // com.sankuai.meituan.android.knb.base.AbsActivityDelegate
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6eb9513eea3eb459bf8fa7f663e688d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6eb9513eea3eb459bf8fa7f663e688d");
        } else if (this.mKnbWebCompat != null) {
            this.mKnbWebCompat.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // com.sankuai.meituan.android.knb.base.AbsActivityDelegate
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62aff0e2507795bff2b5c7c0a22a1ce7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62aff0e2507795bff2b5c7c0a22a1ce7");
        } else if (this.mKnbWebCompat != null) {
            this.mKnbWebCompat.onBackPressed();
        }
    }

    @Override // com.sankuai.meituan.android.knb.base.AbsActivityDelegate
    public void onPostResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d52cd89b48493b3472d1c270c58a053", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d52cd89b48493b3472d1c270c58a053");
            return;
        }
        if (!hasFinished && this.impl.getTaskId() == -1) {
            this.impl.finish();
        }
        hasFinished = true;
    }

    public Bundle handleIntent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebc360c51a899a7d3d731fde8c43e68e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebc360c51a899a7d3d731fde8c43e68e");
        }
        Bundle bundle = new Bundle();
        Bundle extras = this.impl.getIntent().getExtras();
        if (extras != null) {
            try {
                bundle.putAll(extras);
            } catch (Exception unused) {
            }
        }
        Uri data = this.impl.getIntent().getData();
        if (data != null) {
            UriUtil.fillQueryParameterInBundle(data, bundle);
        }
        return bundle;
    }

    public void handleLifeCycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "434014862df4c413b70bd4353c17bb16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "434014862df4c413b70bd4353c17bb16");
        } else if (this.status == 5) {
        } else {
            createCompat(this.createBundle);
            if (this.status == 3) {
                this.mKnbWebCompat.onStart();
            } else if (this.status == 1) {
                this.mKnbWebCompat.onStart();
                this.mKnbWebCompat.onResume();
            }
            if (this.hasResult) {
                this.mKnbWebCompat.onActivityResult(this.requestCode, this.resultCode, this.intent);
                resetResult();
            }
        }
    }

    private void resetResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0283f16e02cc6bc8d9960f147c2c8f82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0283f16e02cc6bc8d9960f147c2c8f82");
            return;
        }
        this.hasResult = false;
        this.requestCode = -1;
        this.resultCode = -1;
        this.intent = null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class DelayRunnable implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public WeakReference<BaseActivityDelegate> reference;

        public DelayRunnable(BaseActivityDelegate baseActivityDelegate) {
            Object[] objArr = {baseActivityDelegate};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b58226691acc265f23cb06697622111a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b58226691acc265f23cb06697622111a");
            } else {
                this.reference = new WeakReference<>(baseActivityDelegate);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "869967eef1a7e745b6ca1cc0dc412821", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "869967eef1a7e745b6ca1cc0dc412821");
                return;
            }
            BaseActivityDelegate baseActivityDelegate = this.reference.get();
            if (baseActivityDelegate != null) {
                baseActivityDelegate.handleLifeCycle();
            }
        }
    }
}
