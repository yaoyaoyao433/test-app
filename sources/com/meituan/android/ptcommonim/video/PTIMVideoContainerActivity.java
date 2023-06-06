package com.meituan.android.ptcommonim.video;

import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.android.ptcommonim.video.model.PicPreviewParam;
import com.meituan.android.ptcommonim.video.model.VideoBaseParam;
import com.meituan.android.ptcommonim.video.model.VideoPreviewParam;
import com.meituan.android.ptcommonim.video.model.VideoRecordParam;
import com.meituan.android.ptcommonim.video.play.PTIMPicPreviewFragment;
import com.meituan.android.ptcommonim.video.play.PTIMPreviewFragment;
import com.meituan.android.ptcommonim.video.record.PTIMRecordFragment;
import com.meituan.android.ptcommonim.video.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.spawn.base.BaseActivity;
import com.sankuai.meituan.mtlive.core.k;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTIMVideoContainerActivity extends BaseActivity {
    public static ChangeQuickRedirect a;
    private b c;

    @Override // com.sankuai.android.spawn.base.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14acbd8967a9406e6851b6f569c44d8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14acbd8967a9406e6851b6f569c44d8a");
            return;
        }
        this.c = new b();
        b bVar = this.c;
        Object[] objArr2 = {this, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "e7913862cd05fc51817063dd27b0a77a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "e7913862cd05fc51817063dd27b0a77a");
        } else if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        super.onCreate(bundle);
        final b bVar2 = this.c;
        Object[] objArr3 = {this, bundle};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "c5323cdf7a574db9617ac7a64cefbf60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "c5323cdf7a574db9617ac7a64cefbf60");
            return;
        }
        setContentView(R.layout.ptim_commonbus_video_container);
        f.a(getApplicationContext());
        f.a(new k.a() { // from class: com.meituan.android.ptcommonim.video.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtlive.core.k.a
            public final void onInitialSucceed() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ced901847e1b03ad0bc6c3fdbf513f4e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ced901847e1b03ad0bc6c3fdbf513f4e");
                    return;
                }
                VideoBaseParam a2 = bVar2.a(this);
                PTIMCommonBean b = bVar2.b(this);
                if (b == null || !b.isValid()) {
                    com.meituan.android.ptcommonim.video.utils.a.b(this);
                } else if (!(this instanceof BaseActivity)) {
                    com.meituan.android.ptcommonim.video.utils.a.b(this);
                } else if (a2 instanceof VideoRecordParam) {
                    bVar2.a((BaseActivity) this).beginTransaction().replace(R.id.ptim_video_container, PTIMRecordFragment.a((VideoRecordParam) a2, b)).commitAllowingStateLoss();
                } else if (a2 instanceof VideoPreviewParam) {
                    bVar2.a((BaseActivity) this).beginTransaction().replace(R.id.ptim_video_container, PTIMPreviewFragment.a((VideoPreviewParam) a2, b)).commitAllowingStateLoss();
                } else if (a2 instanceof PicPreviewParam) {
                    bVar2.a((BaseActivity) this).beginTransaction().replace(R.id.ptim_video_container, PTIMPicPreviewFragment.a((PicPreviewParam) a2, b)).commitAllowingStateLoss();
                } else {
                    com.meituan.android.ptcommonim.video.utils.a.b(this);
                }
            }

            @Override // com.sankuai.meituan.mtlive.core.k.a
            public final void onInitialFailed() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "55d9f421f53e8bdca26d27504c4c3a99", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "55d9f421f53e8bdca26d27504c4c3a99");
                } else {
                    com.meituan.android.ptcommonim.video.utils.a.b(this);
                }
            }
        });
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe0406796202428fc0cb15f055cbaa61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe0406796202428fc0cb15f055cbaa61");
            return;
        }
        if (this.c != null) {
            b bVar = this.c;
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "1d21df29dc66349f515c321ab6af5437", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "1d21df29dc66349f515c321ab6af5437")).booleanValue();
            } else {
                List<Fragment> fragments = bVar.a((BaseActivity) this).getFragments();
                if (fragments != null && !fragments.isEmpty()) {
                    Fragment fragment = fragments.get(fragments.size() - 1);
                    if ((fragment instanceof PTIMVideoBaseFragment) && ((PTIMVideoBaseFragment) fragment).a()) {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            return;
        }
        super.onBackPressed();
    }
}
