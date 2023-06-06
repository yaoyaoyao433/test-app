package com.sankuai.waimai.lottie;

import android.content.Context;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.e;
import com.airbnb.lottie.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.lottie.b;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.utils.o;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SafeLottieAnimationView extends LottieAnimationView {
    public static ChangeQuickRedirect c;
    @Nullable
    private com.airbnb.lottie.a d;
    private b.a e;
    private c f;
    private String g;
    private boolean h;
    private final l i;

    public static /* synthetic */ com.airbnb.lottie.a a(SafeLottieAnimationView safeLottieAnimationView, com.airbnb.lottie.a aVar) {
        safeLottieAnimationView.d = null;
        return null;
    }

    public SafeLottieAnimationView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d5d938aab03015e919044e58625069c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d5d938aab03015e919044e58625069c");
            return;
        }
        this.h = true;
        this.i = new l() { // from class: com.sankuai.waimai.lottie.SafeLottieAnimationView.1
            public static ChangeQuickRedirect a;

            @Override // com.airbnb.lottie.l
            public final void a(@Nullable com.airbnb.lottie.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac02763388e8c8e48f59886118457453", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac02763388e8c8e48f59886118457453");
                    return;
                }
                if (eVar != null) {
                    if (SafeLottieAnimationView.this.f != null) {
                        SafeLottieAnimationView.this.f.a(eVar);
                    }
                    SafeLottieAnimationView.this.setComposition(eVar);
                    com.sankuai.waimai.platform.capacity.log.c.a().a(0, "lottie/play", SystemClock.elapsedRealtime());
                } else {
                    if (SafeLottieAnimationView.this.f != null) {
                        SafeLottieAnimationView.this.f.b();
                    }
                    SafeLottieAnimationView.this.a(3);
                }
                SafeLottieAnimationView.a(SafeLottieAnimationView.this, (com.airbnb.lottie.a) null);
            }
        };
    }

    public SafeLottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff99ed89253dde7577afcf5fa1d32aaa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff99ed89253dde7577afcf5fa1d32aaa");
            return;
        }
        this.h = true;
        this.i = new l() { // from class: com.sankuai.waimai.lottie.SafeLottieAnimationView.1
            public static ChangeQuickRedirect a;

            @Override // com.airbnb.lottie.l
            public final void a(@Nullable com.airbnb.lottie.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac02763388e8c8e48f59886118457453", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac02763388e8c8e48f59886118457453");
                    return;
                }
                if (eVar != null) {
                    if (SafeLottieAnimationView.this.f != null) {
                        SafeLottieAnimationView.this.f.a(eVar);
                    }
                    SafeLottieAnimationView.this.setComposition(eVar);
                    com.sankuai.waimai.platform.capacity.log.c.a().a(0, "lottie/play", SystemClock.elapsedRealtime());
                } else {
                    if (SafeLottieAnimationView.this.f != null) {
                        SafeLottieAnimationView.this.f.b();
                    }
                    SafeLottieAnimationView.this.a(3);
                }
                SafeLottieAnimationView.a(SafeLottieAnimationView.this, (com.airbnb.lottie.a) null);
            }
        };
    }

    public SafeLottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cb247e395276f2e2b3fe4b71219ce34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cb247e395276f2e2b3fe4b71219ce34");
            return;
        }
        this.h = true;
        this.i = new l() { // from class: com.sankuai.waimai.lottie.SafeLottieAnimationView.1
            public static ChangeQuickRedirect a;

            @Override // com.airbnb.lottie.l
            public final void a(@Nullable com.airbnb.lottie.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac02763388e8c8e48f59886118457453", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac02763388e8c8e48f59886118457453");
                    return;
                }
                if (eVar != null) {
                    if (SafeLottieAnimationView.this.f != null) {
                        SafeLottieAnimationView.this.f.a(eVar);
                    }
                    SafeLottieAnimationView.this.setComposition(eVar);
                    com.sankuai.waimai.platform.capacity.log.c.a().a(0, "lottie/play", SystemClock.elapsedRealtime());
                } else {
                    if (SafeLottieAnimationView.this.f != null) {
                        SafeLottieAnimationView.this.f.b();
                    }
                    SafeLottieAnimationView.this.a(3);
                }
                SafeLottieAnimationView.a(SafeLottieAnimationView.this, (com.airbnb.lottie.a) null);
            }
        };
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e99fb2ef756b4e628a1de8f3f1626b6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e99fb2ef756b4e628a1de8f3f1626b6a");
            return;
        }
        try {
            super.onDraw(canvas);
        } catch (Exception unused) {
            a(4);
        }
    }

    public final void a(b.a aVar, String str, c cVar) {
        Object[] objArr = {aVar, str, cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12567ad9650eedbcdbb68439ad18f2d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12567ad9650eedbcdbb68439ad18f2d3");
            return;
        }
        this.e = aVar;
        this.g = str;
        g();
        this.f = cVar;
        this.d = a(this.i);
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f57a97d4bb244645ef51c5a206ba0bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f57a97d4bb244645ef51c5a206ba0bf");
        } else if (this.d != null) {
            this.d.cancel();
            this.d = null;
        }
    }

    public void setPauseWhenDetach(boolean z) {
        this.h = z;
    }

    @Override // com.airbnb.lottie.LottieAnimationView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e631f1b7dc865b4149f85dfceef8023b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e631f1b7dc865b4149f85dfceef8023b");
        } else if (this.h) {
            super.onDetachedFromWindow();
        }
    }

    private com.airbnb.lottie.a a(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32b1515aa2c71b6ac6200091563d9a01", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.airbnb.lottie.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32b1515aa2c71b6ac6200091563d9a01");
        }
        a aVar = new a(lVar);
        com.sankuai.waimai.launcher.util.aop.b.a(aVar, o.a(), this.e);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public final class a extends AsyncTask<b.a, Void, com.airbnb.lottie.e> implements com.airbnb.lottie.a {
        public static ChangeQuickRedirect a;
        private final l c;

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(com.airbnb.lottie.e eVar) {
            com.airbnb.lottie.e eVar2 = eVar;
            Object[] objArr = {eVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a48600a017205f91100f96bcad1e2b0a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a48600a017205f91100f96bcad1e2b0a");
            } else {
                this.c.a(eVar2);
            }
        }

        public a(l lVar) {
            Object[] objArr = {SafeLottieAnimationView.this, lVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "924f6eeeecfb2574b391b3b0fd1ccf24", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "924f6eeeecfb2574b391b3b0fd1ccf24");
            } else {
                this.c = lVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public com.airbnb.lottie.e doInBackground(b.a... aVarArr) {
            String str;
            Object[] objArr = {aVarArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d23975aa32a9ef02aa0e609a7953a31c", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.airbnb.lottie.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d23975aa32a9ef02aa0e609a7953a31c");
            }
            try {
                b.a aVar = aVarArr[0];
                String str2 = SafeLottieAnimationView.this.g;
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = b.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "0d72965963e9409af5f63c1a89057a0b", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "0d72965963e9409af5f63c1a89057a0b");
                } else {
                    aVar.b = aVar.a(str2);
                    str = aVar.b;
                }
                if (aa.a(str)) {
                    return null;
                }
                try {
                    return e.a.a(str);
                } catch (Throwable unused) {
                    return null;
                }
            } catch (IOException unused2) {
                SafeLottieAnimationView.this.a(2);
                return null;
            }
        }

        @Override // com.airbnb.lottie.a
        public final void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "003b9c8367613b95b4d10df912d300b5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "003b9c8367613b95b4d10df912d300b5");
            } else {
                cancel(true);
            }
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d06a059c048c01bfc18933141115d93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d06a059c048c01bfc18933141115d93");
            return;
        }
        com.sankuai.waimai.platform.capacity.log.c.a().a(i, "lottie/play", SystemClock.elapsedRealtime());
        a.AbstractC1040a c2 = new f().a("lottie").b("lottie/play").c("lottie/play");
        i.d(c2.d("cause:" + i).b());
    }
}
