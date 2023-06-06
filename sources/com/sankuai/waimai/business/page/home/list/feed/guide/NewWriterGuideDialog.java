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
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.capacity.imageloader.image.RoundAndCenterCropTransform;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NewWriterGuideDialog extends UGCFullScreenDialog {
    public static ChangeQuickRedirect d;
    public String e;
    public String f;
    public String g;
    public int[] h;
    public b i;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public String g;
        public String h;
        public String i;
        public b j;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b extends UGCFullScreenDialog.a {
        void b();
    }

    public NewWriterGuideDialog(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fba137660b4d91484feab77f8fa8c18f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fba137660b4d91484feab77f8fa8c18f");
        }
    }

    @Override // com.sankuai.waimai.business.page.home.list.feed.UGCFullScreenDialog
    public final View a(Context context, FrameLayout frameLayout, int[] iArr) {
        Object[] objArr = {context, frameLayout, iArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a690d541d416284350e5b322533c4513", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a690d541d416284350e5b322533c4513");
        }
        if (iArr == null || iArr.length != 5) {
            return null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_page_home_ugc_new_writer_guide, (ViewGroup) frameLayout, false);
        int a2 = (g.a(context) - iArr[0]) - g.a(context, 9.0f);
        int a3 = iArr[1] + iArr[2] + g.a(context, 19.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) inflate.getLayoutParams();
        layoutParams.rightMargin = a2;
        layoutParams.topMargin = a3;
        layoutParams.gravity = 53;
        ((TextView) inflate.findViewById(R.id.tv_guide_title)).setText(this.e);
        ((TextView) inflate.findViewById(R.id.tv_guide_subtitle)).setText(this.f);
        b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
        c.b = context;
        c.e = 1;
        c.i = R.drawable.waimai_c_4_3;
        c.j = R.drawable.waimai_c_4_3;
        b.C0608b a4 = c.a(new RoundAndCenterCropTransform(context, 15));
        a4.c = this.g;
        a4.a((ImageView) inflate.findViewById(R.id.tv_guide_img));
        ((TextView) inflate.findViewById(R.id.tv_guide_confirm_btn)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.feed.guide.NewWriterGuideDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "633145786163e7a5a71165c3ca88594a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "633145786163e7a5a71165c3ca88594a");
                    return;
                }
                if (NewWriterGuideDialog.this.i != null) {
                    NewWriterGuideDialog.this.i.b();
                }
                NewWriterGuideDialog.this.dismiss();
            }
        });
        return inflate;
    }

    @Override // com.sankuai.waimai.business.page.home.list.feed.UGCFullScreenDialog
    public final int[] a() {
        return this.h;
    }
}
