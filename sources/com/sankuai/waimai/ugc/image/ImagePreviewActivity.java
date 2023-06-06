package com.sankuai.waimai.ugc.image;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.u;
import com.sankuai.waimai.platform.widget.pager.SimplePageIndicator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class ImagePreviewActivity extends BaseActivity {
    public static ChangeQuickRedirect b;
    protected FrameLayout c;
    public ViewPager d;
    protected View e;
    protected View f;
    protected CheckBox g;
    protected TextView h;
    protected SimplePageIndicator i;
    protected u<String> j;
    protected int k;

    public abstract boolean a(@NonNull Intent intent);

    public abstract void b();

    public abstract void d();

    public ImagePreviewActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9e8a77d3680353780e78d707f0d4dd4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9e8a77d3680353780e78d707f0d4dd4");
            return;
        }
        this.j = new u<>();
        this.k = -100;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "360e5f5e2a0c8b491f90144737f6d571", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "360e5f5e2a0c8b491f90144737f6d571");
            return;
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) this, true);
        com.sankuai.waimai.platform.capacity.immersed.a.b(this, false);
        setContentView(R.layout.wm_comment_image_activity_preview);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9199df3277b07cf90f04055af1871a16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9199df3277b07cf90f04055af1871a16");
        } else {
            this.c = (FrameLayout) findViewById(R.id.root_view);
            this.e = findViewById(R.id.wm_action_bar);
            if (com.sankuai.waimai.platform.capacity.immersed.a.b(this)) {
                int e = g.e(this);
                ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
                ah.b(this.e, layoutParams.width, layoutParams.height + e);
                ah.b(this.e, 0, e, 0, 0);
            }
            this.d = (ViewPager) findViewById(R.id.view_pager);
            this.g = (CheckBox) findViewById(R.id.checkbox_image_preview);
            this.f = findViewById(R.id.view_delete_image_preview);
            this.h = (TextView) findViewById(R.id.txt_image_preview);
            this.i = (SimplePageIndicator) findViewById(R.id.indicator_image);
            this.i.a(3, false);
            this.d.setOffscreenPageLimit(1);
        }
        b();
        if (!a(intent)) {
            finish();
            return;
        }
        System.gc();
        d();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07a652823617976dc1c9f5c8c46f5618", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07a652823617976dc1c9f5c8c46f5618");
            return;
        }
        super.onDestroy();
        System.gc();
    }
}
