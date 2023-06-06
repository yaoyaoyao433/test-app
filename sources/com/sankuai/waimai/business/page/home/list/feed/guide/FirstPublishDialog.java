package com.sankuai.waimai.business.page.home.list.feed.guide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.page.home.list.feed.UGCFullScreenDialog;
import com.sankuai.waimai.platform.capacity.imageloader.image.RoundAndCenterCropTransform;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FirstPublishDialog extends UGCFullScreenDialog {
    public static ChangeQuickRedirect d;
    public String e;
    public String f;
    public String g;
    public String h;
    public b i;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public String e;
        public b f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b extends UGCFullScreenDialog.a {
        void b();
    }

    public FirstPublishDialog(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ef582ce1505e6dc36f6ba234a24f9da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ef582ce1505e6dc36f6ba234a24f9da");
        }
    }

    @Override // com.sankuai.waimai.business.page.home.list.feed.UGCFullScreenDialog
    public final View a(Context context, FrameLayout frameLayout, int[] iArr) {
        Object[] objArr = {context, frameLayout, iArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70cacb4ce0de37f200beb09c02ed25fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70cacb4ce0de37f200beb09c02ed25fe");
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_page_home_ugc_fisrt_publish_dialog, (ViewGroup) frameLayout, false);
        ((FrameLayout.LayoutParams) inflate.getLayoutParams()).gravity = 17;
        View findViewById = inflate.findViewById(R.id.tv_cancel_btn);
        b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
        c.b = context;
        c.c = this.h;
        c.e = 1;
        c.a((ImageView) inflate.findViewById(R.id.iv_media_icon));
        ((TextView) inflate.findViewById(R.id.tv_title)).setText(this.e);
        ((TextView) inflate.findViewById(R.id.tv_sub_title)).setText(this.f);
        b.C0608b c2 = com.sankuai.meituan.mtimageloader.loader.a.c();
        c2.b = context;
        c2.i = R.drawable.waimai_c_4_3;
        c2.j = R.drawable.waimai_c_4_3;
        c2.c = this.g;
        c2.e = 1;
        c2.a(new RoundAndCenterCropTransform(context, 6)).a((ImageView) inflate.findViewById(R.id.tv_note_img));
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.feed.guide.FirstPublishDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49e1b7708b08828eadc344c3306889fb", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49e1b7708b08828eadc344c3306889fb");
                    return;
                }
                if (FirstPublishDialog.this.i != null) {
                    FirstPublishDialog.this.i.b();
                }
                FirstPublishDialog.this.dismiss();
            }
        });
        return inflate;
    }
}
