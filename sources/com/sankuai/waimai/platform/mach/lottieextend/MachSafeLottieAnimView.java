package com.sankuai.waimai.platform.mach.lottieextend;

import android.content.Context;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.e;
import com.airbnb.lottie.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.mach.lottieextend.a;
import com.sankuai.waimai.platform.utils.o;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MachSafeLottieAnimView extends LottieAnimationView {
    public static ChangeQuickRedirect c;
    @Nullable
    private com.airbnb.lottie.a d;
    private a.C1055a e;
    private com.sankuai.waimai.lottie.c f;
    private String g;
    private boolean h;
    private String i;
    private String j;
    private final l k;

    public static /* synthetic */ com.airbnb.lottie.a a(MachSafeLottieAnimView machSafeLottieAnimView, com.airbnb.lottie.a aVar) {
        machSafeLottieAnimView.d = null;
        return null;
    }

    public MachSafeLottieAnimView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32eccceea04cd6bcaed5bae1641e508a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32eccceea04cd6bcaed5bae1641e508a");
            return;
        }
        this.h = true;
        this.k = new l() { // from class: com.sankuai.waimai.platform.mach.lottieextend.MachSafeLottieAnimView.1
            public static ChangeQuickRedirect a;

            @Override // com.airbnb.lottie.l
            public final void a(@Nullable com.airbnb.lottie.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc54fb6301ff281ca19b1560731dee85", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc54fb6301ff281ca19b1560731dee85");
                    return;
                }
                if (eVar != null) {
                    if (MachSafeLottieAnimView.this.f != null) {
                        MachSafeLottieAnimView.this.f.a(eVar);
                    }
                    MachSafeLottieAnimView.this.setComposition(eVar);
                } else {
                    if (MachSafeLottieAnimView.this.f != null) {
                        MachSafeLottieAnimView.this.f.b();
                    }
                    MachSafeLottieAnimView.this.a(3);
                    h.a(MachSafeLottieAnimView.this.j, MachSafeLottieAnimView.this.i);
                }
                MachSafeLottieAnimView.a(MachSafeLottieAnimView.this, (com.airbnb.lottie.a) null);
            }
        };
    }

    public MachSafeLottieAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58b31e9c8e6f0cd1449e48e376fda2a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58b31e9c8e6f0cd1449e48e376fda2a8");
            return;
        }
        this.h = true;
        this.k = new l() { // from class: com.sankuai.waimai.platform.mach.lottieextend.MachSafeLottieAnimView.1
            public static ChangeQuickRedirect a;

            @Override // com.airbnb.lottie.l
            public final void a(@Nullable com.airbnb.lottie.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc54fb6301ff281ca19b1560731dee85", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc54fb6301ff281ca19b1560731dee85");
                    return;
                }
                if (eVar != null) {
                    if (MachSafeLottieAnimView.this.f != null) {
                        MachSafeLottieAnimView.this.f.a(eVar);
                    }
                    MachSafeLottieAnimView.this.setComposition(eVar);
                } else {
                    if (MachSafeLottieAnimView.this.f != null) {
                        MachSafeLottieAnimView.this.f.b();
                    }
                    MachSafeLottieAnimView.this.a(3);
                    h.a(MachSafeLottieAnimView.this.j, MachSafeLottieAnimView.this.i);
                }
                MachSafeLottieAnimView.a(MachSafeLottieAnimView.this, (com.airbnb.lottie.a) null);
            }
        };
    }

    public MachSafeLottieAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4abd721ae77de0fb4f6fa28c37b7834a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4abd721ae77de0fb4f6fa28c37b7834a");
            return;
        }
        this.h = true;
        this.k = new l() { // from class: com.sankuai.waimai.platform.mach.lottieextend.MachSafeLottieAnimView.1
            public static ChangeQuickRedirect a;

            @Override // com.airbnb.lottie.l
            public final void a(@Nullable com.airbnb.lottie.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc54fb6301ff281ca19b1560731dee85", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc54fb6301ff281ca19b1560731dee85");
                    return;
                }
                if (eVar != null) {
                    if (MachSafeLottieAnimView.this.f != null) {
                        MachSafeLottieAnimView.this.f.a(eVar);
                    }
                    MachSafeLottieAnimView.this.setComposition(eVar);
                } else {
                    if (MachSafeLottieAnimView.this.f != null) {
                        MachSafeLottieAnimView.this.f.b();
                    }
                    MachSafeLottieAnimView.this.a(3);
                    h.a(MachSafeLottieAnimView.this.j, MachSafeLottieAnimView.this.i);
                }
                MachSafeLottieAnimView.a(MachSafeLottieAnimView.this, (com.airbnb.lottie.a) null);
            }
        };
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f64280556341931fd50ae3f59d28519a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f64280556341931fd50ae3f59d28519a");
            return;
        }
        try {
            super.onDraw(canvas);
        } catch (Exception unused) {
            String str = this.j;
            String str2 = this.i;
            Object[] objArr2 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0c4ed5b680993a49b32bbfd455d935f0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0c4ed5b680993a49b32bbfd455d935f0");
            } else {
                h.a("MachLottieDrawException", 1, str, str2);
            }
            a(4);
        }
    }

    public final void a(a.C1055a c1055a, com.sankuai.waimai.lottie.c cVar) {
        Object[] objArr = {c1055a, cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dd474dc794dbce74d47d3c8e36845d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dd474dc794dbce74d47d3c8e36845d4");
            return;
        }
        this.e = c1055a;
        g();
        this.f = cVar;
        this.d = a(this.k);
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16b75ce841c58d4966b190d536f90fbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16b75ce841c58d4966b190d536f90fbf");
        } else if (this.d != null) {
            this.d.cancel();
            this.d = null;
        }
    }

    private com.airbnb.lottie.a a(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e4e29eebb7dbdb30d2a87fca929b9c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.airbnb.lottie.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e4e29eebb7dbdb30d2a87fca929b9c8");
        }
        a aVar = new a(lVar);
        com.sankuai.waimai.launcher.util.aop.b.a(aVar, o.a(), this.e);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public final class a extends AsyncTask<a.C1055a, Void, com.airbnb.lottie.e> implements com.airbnb.lottie.a {
        public static ChangeQuickRedirect a;
        private final l c;

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(com.airbnb.lottie.e eVar) {
            com.airbnb.lottie.e eVar2 = eVar;
            Object[] objArr = {eVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "062bcd68e857586194a0baa6f3852d40", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "062bcd68e857586194a0baa6f3852d40");
            } else {
                this.c.a(eVar2);
            }
        }

        public a(l lVar) {
            Object[] objArr = {MachSafeLottieAnimView.this, lVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc6f85cb67c6d3cc02235d01967dc116", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc6f85cb67c6d3cc02235d01967dc116");
            } else {
                this.c = lVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public com.airbnb.lottie.e doInBackground(a.C1055a... c1055aArr) {
            Object[] objArr = {c1055aArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9891a175a1b2b982b03ffabfb29d0583", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.airbnb.lottie.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9891a175a1b2b982b03ffabfb29d0583");
            }
            try {
                a.C1055a c1055a = c1055aArr[0];
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a.C1055a.a;
                if (PatchProxy.isSupport(objArr2, c1055a, changeQuickRedirect2, false, "fe3cf985eb028145023048c6a5b795ab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, c1055a, changeQuickRedirect2, false, "fe3cf985eb028145023048c6a5b795ab");
                } else {
                    c1055a.b = c1055a.b();
                }
                if (aa.a(c1055aArr[0].b)) {
                    return null;
                }
                try {
                    return e.a.a(c1055aArr[0].b);
                } catch (Exception unused) {
                    h.a(MachSafeLottieAnimView.this.j, MachSafeLottieAnimView.this.i);
                    return null;
                }
            } catch (Exception unused2) {
                MachSafeLottieAnimView.this.a(2);
                h.a(MachSafeLottieAnimView.this.j, MachSafeLottieAnimView.this.i);
                return null;
            }
        }

        @Override // com.airbnb.lottie.a
        public final void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66d4e246cf430fd70dcbae4291ab8a5a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66d4e246cf430fd70dcbae4291ab8a5a");
            } else {
                cancel(true);
            }
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7068f7b71ac8726d7645d424da6167d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7068f7b71ac8726d7645d424da6167d9");
            return;
        }
        a.AbstractC1040a c2 = new com.sankuai.waimai.lottie.f().a("mach-lottie").b("mach-lottie/play").c("mach-lottie/play");
        i.d(c2.d("cause:" + i).b());
    }

    public String getAnimStatus() {
        return this.g;
    }

    public void setAnimStatus(String str) {
        this.g = str;
    }

    public String getTemplateId() {
        return this.i;
    }

    public void setTemplateId(String str) {
        this.i = str;
    }

    public String getLottieUrl() {
        return this.j;
    }

    public void setLottieUrl(String str) {
        this.j = str;
    }

    @Override // com.airbnb.lottie.LottieAnimationView, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b63b260346117d0d18d2332ab7b49286", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b63b260346117d0d18d2332ab7b49286");
            return;
        }
        super.onAttachedToWindow();
        if (this.h) {
            a();
        }
    }

    public void setIsAutoPlay(boolean z) {
        this.h = z;
    }
}
