package com.sankuai.android.share.keymodule.shareChannel.weixin.template;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.MiniProgramBaseBean;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    protected Context b;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a();

        void a(Bitmap bitmap);
    }

    public abstract void a();

    public abstract void a(MiniProgramBaseBean miniProgramBaseBean, Bitmap bitmap, b bVar);

    public abstract void a(MiniProgramBaseBean miniProgramBaseBean, b bVar);

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0726e9f1f436cfaf30ca1d1ccb6385f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0726e9f1f436cfaf30ca1d1ccb6385f2");
            return;
        }
        this.b = context;
        a();
    }

    public final Bitmap a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "317912d982eb5ccaa764384c88b8ba1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "317912d982eb5ccaa764384c88b8ba1a");
        }
        view.setDrawingCacheEnabled(true);
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.buildDrawingCache();
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_4444);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.android.share.keymodule.shareChannel.weixin.template.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0543a implements Target {
        public static ChangeQuickRedirect a;
        private MiniProgramBaseBean c;
        private b d;

        @Override // com.squareup.picasso.Target
        public final void onPrepareLoad(Drawable drawable) {
        }

        public C0543a(MiniProgramBaseBean miniProgramBaseBean, b bVar) {
            Object[] objArr = {a.this, miniProgramBaseBean, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74df1ec7e132d8add855a19960c5984a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74df1ec7e132d8add855a19960c5984a");
                return;
            }
            this.c = miniProgramBaseBean;
            this.d = bVar;
        }

        @Override // com.squareup.picasso.Target
        public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            Object[] objArr = {bitmap, loadedFrom};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fcd76d307143618fd78fb8bef156f35", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fcd76d307143618fd78fb8bef156f35");
            } else if (a.this.b == null || !(a.this.b instanceof Activity) || ((Activity) a.this.b).isFinishing()) {
            } else {
                a.this.a(this.c, bitmap, this.d);
            }
        }

        @Override // com.squareup.picasso.Target
        public final void onBitmapFailed(Drawable drawable) {
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "431dde0734d80d8c6a5010ddba945647", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "431dde0734d80d8c6a5010ddba945647");
            } else if (a.this.b == null || !(a.this.b instanceof Activity) || ((Activity) a.this.b).isFinishing()) {
            } else {
                this.d.a();
            }
        }
    }
}
