package com.sankuai.waimai.business.ugc.machpro.components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.cache.c;
import com.sankuai.waimai.machpro.adapter.a;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.f;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.util.b;
import java.io.File;
import java.lang.ref.WeakReference;
import uk.co.senab.photoview.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPZoomImageComponent extends MPComponent<MPPhotoView> implements a.InterfaceC1022a {
    public static ChangeQuickRedirect a;
    boolean b;
    final Handler c;
    int d;
    int e;
    private final a.b f;
    private com.sankuai.waimai.machpro.component.image.a g;
    private boolean h;
    private int[] i;
    private String j;
    private String k;
    private String l;
    private boolean m;
    private String n;
    private boolean o;
    private String p;
    private String q;

    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
    public final int a(Bitmap bitmap) {
        return 0;
    }

    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
    public final MachMap b(Bitmap bitmap) {
        return null;
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ MPPhotoView createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1739068dea226d06237aaaecd6b68a5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPPhotoView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1739068dea226d06237aaaecd6b68a5c");
        }
        MPPhotoView mPPhotoView = new MPPhotoView(this.mMachContext.getContext());
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = MPPhotoView.a;
        if (PatchProxy.isSupport(objArr2, mPPhotoView, changeQuickRedirect2, false, "7b048cb4a8dd2ddac2a0e14e4fe1940a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mPPhotoView, changeQuickRedirect2, false, "7b048cb4a8dd2ddac2a0e14e4fe1940a");
        } else {
            mPPhotoView.b = new WeakReference<>(this);
        }
        mPPhotoView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        mPPhotoView.setOnViewTapListener(new d.f() { // from class: com.sankuai.waimai.business.ugc.machpro.components.MPZoomImageComponent.1
            public static ChangeQuickRedirect a;

            @Override // uk.co.senab.photoview.d.f
            public final void a(View view, float f, float f2) {
                Object[] objArr3 = {view, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "217d634c19504d5a3aa43944ae731bc4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "217d634c19504d5a3aa43944ae731bc4");
                } else if (TextUtils.isEmpty(MPZoomImageComponent.this.l)) {
                } else {
                    MPZoomImageComponent.this.dispatchEvent(MPZoomImageComponent.this.l, null);
                }
            }
        });
        this.p = this.mMachContext.getBundle() != null ? this.mMachContext.getBundle().d : StringUtil.NULL;
        return mPPhotoView;
    }

    public MPZoomImageComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71f82ef783d66205254ba93c33eab6a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71f82ef783d66205254ba93c33eab6a7");
            return;
        }
        this.h = true;
        this.n = "center";
        this.c = new Handler(Looper.getMainLooper());
        this.d = -1;
        this.e = -1;
        this.f = new a.b();
        this.f.b = (ImageView) this.mView;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateAttribute(String str, Object obj) {
        char c;
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2006d229f77b4bdbdb679879d2ae4feb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2006d229f77b4bdbdb679879d2ae4feb");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.o = true;
            switch (str.hashCode()) {
                case -1936641701:
                    if (str.equals("cdnOptimizationSize")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -68488654:
                    if (str.equals("disableCdnOptimization")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 114148:
                    if (str.equals(RaptorUploaderImpl.SRC)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 96784904:
                    if (str.equals("error")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 598246771:
                    if (str.equals(ReactTextInputShadowNode.PROP_PLACEHOLDER)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    String a2 = b.a(obj, "");
                    if (a2.startsWith("http")) {
                        this.f.c = a2;
                        this.f.d = 1;
                    } else if (a2.startsWith("assets://")) {
                        this.f.d = 2;
                        String substring = a2.substring(9);
                        a.b bVar = this.f;
                        bVar.c = b() + substring;
                    } else {
                        this.f.c = a2;
                        this.f.d = 0;
                    }
                    if (this.o && this.e >= 0 && this.d >= 0) {
                        c();
                        return;
                    }
                    this.b = true;
                    requestLayout();
                    return;
                case 1:
                    String a3 = b.a(obj, "");
                    if (a3.startsWith("assets://")) {
                        String substring2 = a3.substring(9);
                        a.b bVar2 = this.f;
                        bVar2.g = b() + substring2;
                        requestLayout();
                        return;
                    }
                    return;
                case 2:
                    String a4 = b.a(obj, "");
                    if (a4.startsWith("assets://")) {
                        String substring3 = a4.substring(9);
                        a.b bVar3 = this.f;
                        bVar3.h = b() + substring3;
                        requestLayout();
                        return;
                    }
                    return;
                case 3:
                    this.h = b.d(obj);
                    this.b = true;
                    requestLayout();
                    return;
                case 4:
                    String[] split = b.a(obj, "").split("\\.");
                    if (split.length == 3) {
                        this.i = new int[2];
                        this.i[0] = b.c((Object) split[0]);
                        this.i[1] = b.c((Object) split[1]);
                        this.f.f = b.c((Object) split[2]);
                    } else {
                        this.i = null;
                        this.f.f = -1;
                    }
                    this.b = true;
                    requestLayout();
                    return;
                default:
                    super.updateAttribute(str, obj);
                    return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r13.equals("loadError") != false) goto L18;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addEventListener(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.business.ugc.machpro.components.MPZoomImageComponent.a
            java.lang.String r11 = "44b54797c1c6c6ee327b9004bdc195c7"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 == 0) goto L22
            return
        L22:
            r1 = -1
            int r2 = r13.hashCode()
            r3 = -1494548933(0xffffffffa6eafe3b, float:-1.6305921E-15)
            if (r2 == r3) goto L4c
            r3 = 1365523650(0x51643cc2, float:6.1266993E10)
            if (r2 == r3) goto L42
            r0 = 1915020349(0x7224e43d, float:3.2660137E30)
            if (r2 == r0) goto L37
            goto L57
        L37:
            java.lang.String r0 = "loadSuccess"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L57
            r0 = 0
            goto L58
        L42:
            java.lang.String r2 = "loadError"
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L57
            goto L58
        L4c:
            java.lang.String r0 = "singleTap"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L57
            r0 = 2
            goto L58
        L57:
            r0 = -1
        L58:
            switch(r0) {
                case 0: goto L71;
                case 1: goto L68;
                case 2: goto L5f;
                default: goto L5b;
            }
        L5b:
            super.addEventListener(r13)
            return
        L5f:
            java.lang.String r0 = ""
            java.lang.String r13 = com.sankuai.waimai.machpro.util.b.a(r13, r0)
            r12.l = r13
            return
        L68:
            java.lang.String r0 = ""
            java.lang.String r13 = com.sankuai.waimai.machpro.util.b.a(r13, r0)
            r12.k = r13
            return
        L71:
            java.lang.String r0 = ""
            java.lang.String r13 = com.sankuai.waimai.machpro.util.b.a(r13, r0)
            r12.j = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.ugc.machpro.components.MPZoomImageComponent.addEventListener(java.lang.String):void");
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4017375386d4f27b37797bb00e0a5a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4017375386d4f27b37797bb00e0a5a1");
        }
        c bundle = this.mMachContext.getBundle();
        if (bundle == null) {
            return "";
        }
        return bundle.g + File.separator + APKStructure.Assets_Type + File.separator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b58fb4f76ac047aa80027df59ce83941", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b58fb4f76ac047aa80027df59ce83941");
            return;
        }
        if (!this.h) {
            if (this.i != null) {
                this.f.e = this.i;
            } else {
                int i = this.d;
                int i2 = this.e;
                if (i >= i2) {
                    this.f.e = new int[]{i, 0};
                } else {
                    this.f.e = new int[]{0, i2};
                }
            }
        } else {
            this.f.e = null;
            this.f.f = -1;
        }
        this.f.i = getBorderRadii();
        this.f.j = this.n;
        this.f.l = this.e;
        this.f.k = this.d;
        a aVar = f.a().b;
        if (aVar != null) {
            this.m = false;
            this.q = this.f.c;
            a((Drawable) null);
            aVar.a(this.f, this);
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public com.sankuai.waimai.machpro.view.decoration.b getBackgroundDrawable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e630da2582bcc9d14171a5d501aa36d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.machpro.view.decoration.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e630da2582bcc9d14171a5d501aa36d9");
        }
        com.sankuai.waimai.machpro.view.decoration.b backgroundDrawable = super.getBackgroundDrawable();
        backgroundDrawable.d = false;
        return backgroundDrawable;
    }

    private void a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bc99a3b95dc089056a9ed8fb8e0f58b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bc99a3b95dc089056a9ed8fb8e0f58b");
            return;
        }
        if (drawable != null) {
            if (drawable.getIntrinsicWidth() >= drawable.getIntrinsicHeight()) {
                ((MPPhotoView) this.mView).setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else {
                ((MPPhotoView) this.mView).setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
        ((MPPhotoView) this.mView).setImageDrawable(drawable);
    }

    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
    public final void a(com.sankuai.waimai.machpro.component.image.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bae021770f2f898ffe7b14788a130fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bae021770f2f898ffe7b14788a130fb");
            return;
        }
        this.g = aVar;
        if (this.g == null || this.g.b() == null) {
            return;
        }
        if (!this.q.equals(aVar.e())) {
            com.sankuai.waimai.machpro.util.a.c("MachPro 图片不匹配 当前URI = " + aVar.e() + " 期望URI = " + this.q);
            return;
        }
        this.m = true;
        a(this.g.b());
        if (TextUtils.isEmpty(this.j)) {
            return;
        }
        MachMap machMap = new MachMap();
        machMap.put("width", Integer.valueOf(this.g.b().getIntrinsicWidth()));
        machMap.put("height", Integer.valueOf(this.g.b().getIntrinsicHeight()));
        MachArray machArray = new MachArray();
        machArray.add(machMap);
        dispatchEvent(this.j, machArray);
    }

    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8861304fbd1447570ff1b17c88c69829", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8861304fbd1447570ff1b17c88c69829");
            return;
        }
        com.sankuai.waimai.machpro.util.a.c("MachPro 图片加载失败 当前URI = " + this.q);
        if (TextUtils.isEmpty(this.k)) {
            return;
        }
        dispatchEvent(this.k, null);
    }

    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
    public final void b(com.sankuai.waimai.machpro.component.image.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b612408f658a9a793fefbdbbbc239ea6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b612408f658a9a793fefbdbbbc239ea6");
        } else if (this.m || aVar == null) {
        } else {
            a(aVar.b());
        }
    }

    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
    public final void c(com.sankuai.waimai.machpro.component.image.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01c1d2699ed4b17aa968e8e52b6a23ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01c1d2699ed4b17aa968e8e52b6a23ef");
        } else if (aVar != null) {
            this.m = true;
            a(aVar.b());
        }
    }
}
