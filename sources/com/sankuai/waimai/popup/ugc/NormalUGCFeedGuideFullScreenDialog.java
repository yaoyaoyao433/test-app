package com.sankuai.waimai.popup.ugc;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.resfetcher.widgets.RooImageView;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.meituan.mtimageloader.loader.a;
import com.sankuai.waimai.business.page.home.model.c;
import com.sankuai.waimai.business.page.home.widget.HollowView;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NormalUGCFeedGuideFullScreenDialog extends UGCFeedGuideFullScreenDialog {
    public static ChangeQuickRedirect a;
    private HollowView e;
    private float f;
    private float g;
    private float h;
    private float i;
    private final int j;
    private final int k;
    private View l;
    private View m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;

    public NormalUGCFeedGuideFullScreenDialog(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88d924e1d7ba7ad3b010ea3b7b3238af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88d924e1d7ba7ad3b010ea3b7b3238af");
            return;
        }
        this.n = g.d(context);
        this.o = g.a(context);
        this.j = g.a(context, 265.0f);
        this.k = g.a(context, 233.0f);
        this.p = g.a(context, 10.0f);
        this.q = g.a(context, 3.3f);
        this.r = g.a(context, 13.0f);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be0b27241da664271ea9750699927cc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be0b27241da664271ea9750699927cc4");
        } else if (getWindow() != null) {
            getWindow().addFlags(512);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 0;
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            setCancelable(false);
        }
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bf026a19fad4463e1a384989212bd4aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bf026a19fad4463e1a384989212bd4aa");
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = new HollowView(context);
        this.e.setBackgroundColor(-1308622848);
        this.e.setClickThroughPoiCircle(true);
        frameLayout.addView(this.e, -1, -1);
        this.l = LayoutInflater.from(context).inflate(R.layout.wm_page_home_tab_ugc_feed_guide, (ViewGroup) frameLayout, false);
        this.m = this.l.findViewById(R.id.guide_triangle);
        frameLayout.addView(this.l);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setContentView(frameLayout);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7310cce6d3ebbbd1dc344ce53a68a66", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7310cce6d3ebbbd1dc344ce53a68a66")).booleanValue();
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        Object[] objArr2 = {Float.valueOf(x), Float.valueOf(y)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27302c093868def0cdaff88532da5049", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27302c093868def0cdaff88532da5049")).booleanValue() : this.e.getHollowRegion().contains(x, y)) || this.c == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (action == 1) {
            Object[] objArr3 = {(byte) 1};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d2d10249383b002589acc772d392485c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d2d10249383b002589acc772d392485c");
            } else {
                dismiss();
                if (this.d != null) {
                    this.d.a(true);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // com.sankuai.waimai.popup.ugc.UGCFeedGuideFullScreenDialog
    public final void a(float f, float f2, float f3, float f4, @ColorInt int i) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), -13236};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c1d8b93cb04376a9dc3b79196539ff5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c1d8b93cb04376a9dc3b79196539ff5");
            return;
        }
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
        this.e.a(f, f2, f3, f4, -13236);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.l.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.m.getLayoutParams();
        float f5 = this.j / 2.0f;
        layoutParams.bottomMargin = (int) ((this.n - f2) + this.h + f4 + this.q);
        if (this.p + f5 >= f) {
            layoutParams.gravity = 83;
            layoutParams.leftMargin = this.p;
            layoutParams.rightMargin = 0;
            layoutParams2.gravity = 3;
            layoutParams2.leftMargin = (int) ((f - this.p) - (this.r * 0.5f));
            layoutParams2.rightMargin = 0;
        } else if (this.p + f5 >= this.o - f) {
            layoutParams.gravity = 85;
            layoutParams.rightMargin = this.p;
            layoutParams.leftMargin = 0;
            layoutParams2.gravity = 5;
            layoutParams2.rightMargin = (int) (((this.o - f) - this.p) - (this.r * 0.5f));
            layoutParams2.leftMargin = 0;
        } else {
            layoutParams.gravity = 83;
            layoutParams.leftMargin = (int) (f - f5);
            layoutParams.rightMargin = 0;
            layoutParams2.gravity = 3;
            layoutParams2.leftMargin = (int) (f5 - (this.r * 0.5f));
            layoutParams2.rightMargin = 0;
        }
        this.l.setLayoutParams(layoutParams);
        this.m.setLayoutParams(layoutParams2);
    }

    @Override // com.sankuai.waimai.popup.ugc.UGCFeedGuideFullScreenDialog
    public final void a(Activity activity, final c cVar) {
        Object[] objArr = {activity, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9775dcab7c17745213d293239041b495", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9775dcab7c17745213d293239041b495");
        } else if (cVar == null) {
        } else {
            TextView textView = (TextView) this.l.findViewById(R.id.tv_guide_title);
            TextView textView2 = (TextView) this.l.findViewById(R.id.tv_guide_subtitle);
            final ImageView imageView = (ImageView) this.l.findViewById(R.id.iv_guide_pic);
            final RooImageView rooImageView = (RooImageView) this.l.findViewById(R.id.default_guide_pic_new_user);
            final RooImageView rooImageView2 = (RooImageView) this.l.findViewById(R.id.default_guide_pic_old_user);
            ImageView imageView2 = (ImageView) this.l.findViewById(R.id.iv_close);
            if (cVar.g) {
                if (aa.a(cVar.a)) {
                    textView.setText(R.string.wm_page_home_tab_ugc_feed_guide_new_user_title);
                } else {
                    textView.setText(cVar.a);
                }
                textView2.setVisibility(0);
                if (aa.a(cVar.b)) {
                    textView2.setText(R.string.wm_page_home_tab_ugc_feed_guide_new_user_subtitle);
                } else {
                    textView2.setText(cVar.b);
                }
                rooImageView.setVisibility(0);
                rooImageView2.setVisibility(8);
            } else {
                if (aa.a(cVar.d)) {
                    textView.setText(R.string.wm_page_home_tab_ugc_feed_guide_old_user_title);
                } else {
                    textView.setText(cVar.d);
                }
                textView2.setVisibility(8);
                rooImageView.setVisibility(8);
                rooImageView2.setVisibility(0);
            }
            String str = cVar.g ? cVar.c : cVar.f;
            b.C0608b c = a.c();
            c.b = activity;
            c.c = str;
            c.b(this.k).a(new b.d() { // from class: com.sankuai.waimai.popup.ugc.NormalUGCFeedGuideFullScreenDialog.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa801a888f4393c08a7b808fbb3cd979", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa801a888f4393c08a7b808fbb3cd979");
                        return;
                    }
                    imageView.setVisibility(0);
                    rooImageView.setVisibility(8);
                    rooImageView2.setVisibility(8);
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a(int i, Exception exc) {
                    Object[] objArr2 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0faaa109e353a86cca5ecc1358a1fc39", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0faaa109e353a86cca5ecc1358a1fc39");
                        return;
                    }
                    imageView.setVisibility(8);
                    if (cVar.g) {
                        rooImageView.setVisibility(0);
                        rooImageView2.setVisibility(8);
                        return;
                    }
                    rooImageView.setVisibility(8);
                    rooImageView2.setVisibility(0);
                }
            }).a(imageView);
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.popup.ugc.NormalUGCFeedGuideFullScreenDialog.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed7edcd82166b41b4176ce2b2e60a59d", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed7edcd82166b41b4176ce2b2e60a59d");
                    } else {
                        NormalUGCFeedGuideFullScreenDialog.this.dismiss();
                    }
                }
            });
        }
    }
}
