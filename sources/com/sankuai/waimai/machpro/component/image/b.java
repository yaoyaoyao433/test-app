package com.sankuai.waimai.machpro.component.image;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import com.dianping.titans.widget.DynamicTitleParser;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.facebook.yoga.YogaUnit;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.recce.props.gens.ResizeMode;
import com.meituan.android.recce.props.gens.TintColor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.cache.c;
import com.sankuai.waimai.machpro.adapter.a;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.f;
import com.sankuai.waimai.machpro.instance.MPContext;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b extends MPComponent<MPImageView> implements a.InterfaceC1022a {
    public static ChangeQuickRedirect a;
    a.b b;
    boolean c;
    public String d;
    Handler e;
    int f;
    int g;
    public a h;
    private com.sankuai.waimai.machpro.component.image.a i;
    private boolean j;
    private int[] k;
    private String l;
    private String m;
    private String n;
    private String o;
    private boolean p;
    private boolean q;
    private CountDownLatch r;
    private CountDownLatch s;
    private MachMap t;
    private int u;
    private String v;
    private String w;
    private boolean x;
    private int y;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ MPImageView createView() {
        MPImageView remove;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99211fb7e61fbd189533c5868c4c967a", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99211fb7e61fbd189533c5868c4c967a");
        }
        MPImageView mPImageView = null;
        if (this.mMachContext.getInstance().a() != null) {
            com.sankuai.waimai.machpro.view.pool.b a2 = this.mMachContext.getInstance().a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.view.pool.b.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "e65eb6bb4a8aba43eb4fe810f65fb689", RobustBitConfig.DEFAULT_VALUE)) {
                remove = (MPImageView) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "e65eb6bb4a8aba43eb4fe810f65fb689");
            } else if (a2.d.size() > 0) {
                remove = a2.d.remove(0);
            }
            mPImageView = remove;
        }
        if (mPImageView == null) {
            mPImageView = new MPImageView(this.mMachContext.getContext());
        }
        Object[] objArr3 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = MPImageView.a;
        if (PatchProxy.isSupport(objArr3, mPImageView, changeQuickRedirect3, false, "a875b4deb38fb92f0ca94382259293d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, mPImageView, changeQuickRedirect3, false, "a875b4deb38fb92f0ca94382259293d5");
        } else {
            mPImageView.b = new WeakReference<>(this);
        }
        mPImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.mMachContext.getInstance().r.b(1);
        return mPImageView;
    }

    public b(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b228be4eddf9463fb2f03ba659219299", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b228be4eddf9463fb2f03ba659219299");
            return;
        }
        this.d = "aspectFit";
        this.e = new Handler(Looper.getMainLooper());
        this.f = -1;
        this.g = -1;
        this.t = null;
        this.x = true;
        this.y = -1;
        this.b = new a.b();
        this.b.b = (ImageView) this.mView;
    }

    public final void a(com.sankuai.waimai.machpro.component.view.b bVar) {
        this.mParentComponent = bVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateAttribute(String str, Object obj) {
        char c;
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5a901f745853462611395d9c794bf04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5a901f745853462611395d9c794bf04");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            switch (str.hashCode()) {
                case -2138726588:
                    if (str.equals("syncUpdate")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1936641701:
                    if (str.equals("cdnOptimizationSize")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1092912869:
                    if (str.equals("cdnoptimizationsize")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -493563858:
                    if (str.equals("playing")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -68488654:
                    if (str.equals("disableCdnOptimization")) {
                        c = 4;
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
                case 764208690:
                    if (str.equals("disablecdnoptimization")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1247289547:
                    if (str.equals("loopCount")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1327599912:
                    if (str.equals(TintColor.LOWER_CASE_NAME)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1377046061:
                    if (str.equals(Constants.ModelBeanConstants.KEY_BUNDLE_NAME)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1515751784:
                    if (str.equals("capInsets")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 2049757303:
                    if (str.equals(ResizeMode.LOWER_CASE_NAME)) {
                        c = 11;
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
                    String a2 = com.sankuai.waimai.machpro.util.b.a(obj, "");
                    if (a2.startsWith("http")) {
                        this.b.c = a2;
                        this.b.d = 1;
                    } else if (a2.startsWith("assets://")) {
                        this.b.d = 2;
                        String substring = a2.substring(9);
                        a.b bVar = this.b;
                        bVar.c = b() + substring;
                    } else {
                        this.b.c = a2;
                        this.b.d = 0;
                    }
                    if (this.q && this.g >= 0 && this.f >= 0) {
                        c();
                        return;
                    }
                    this.c = true;
                    requestLayout();
                    return;
                case 1:
                    String a3 = com.sankuai.waimai.machpro.util.b.a(obj, "");
                    if (a3.startsWith("assets://")) {
                        String substring2 = a3.substring(9);
                        a.b bVar2 = this.b;
                        bVar2.g = b() + substring2;
                        requestLayout();
                        return;
                    }
                    return;
                case 2:
                    String a4 = com.sankuai.waimai.machpro.util.b.a(obj, "");
                    if (a4.startsWith("assets://")) {
                        String substring3 = a4.substring(9);
                        a.b bVar3 = this.b;
                        bVar3.h = b() + substring3;
                        requestLayout();
                        return;
                    }
                    return;
                case 3:
                case 4:
                    this.j = com.sankuai.waimai.machpro.util.b.d(obj);
                    this.c = true;
                    requestLayout();
                    return;
                case 5:
                case 6:
                    String[] split = com.sankuai.waimai.machpro.util.b.a(obj, "").split("\\.");
                    if (split.length == 3) {
                        this.k = new int[2];
                        this.k[0] = com.sankuai.waimai.machpro.util.b.c((Object) split[0]);
                        this.k[1] = com.sankuai.waimai.machpro.util.b.c((Object) split[1]);
                        this.b.f = com.sankuai.waimai.machpro.util.b.c((Object) split[2]);
                    } else {
                        this.k = null;
                        this.b.f = -1;
                    }
                    this.c = true;
                    requestLayout();
                    return;
                case 7:
                    this.q = com.sankuai.waimai.machpro.util.b.d(obj);
                    return;
                case '\b':
                    this.v = com.sankuai.waimai.machpro.util.b.a(obj, "");
                    return;
                case '\t':
                    int b = com.sankuai.waimai.machpro.util.b.b(com.sankuai.waimai.machpro.util.b.a(obj, ""));
                    if (b != -1) {
                        ((MPImageView) this.mView).setColorFilter(b);
                        return;
                    }
                    return;
                case '\n':
                    if (obj instanceof MachMap) {
                        MachMap machMap = (MachMap) obj;
                        this.b.m = new a.c();
                        this.b.m.a = com.sankuai.waimai.machpro.util.b.c(machMap.get("top"));
                        this.b.m.b = com.sankuai.waimai.machpro.util.b.c(machMap.get("left"));
                        this.b.m.c = com.sankuai.waimai.machpro.util.b.c(machMap.get("bottom"));
                        this.b.m.d = com.sankuai.waimai.machpro.util.b.c(machMap.get("right"));
                        return;
                    }
                    return;
                case 11:
                    a(com.sankuai.waimai.machpro.util.b.a(obj, ""));
                    return;
                case '\f':
                    boolean d = com.sankuai.waimai.machpro.util.b.d(obj);
                    if (this.x != d) {
                        this.x = d;
                        if (this.i == null || !this.i.a()) {
                            return;
                        }
                        this.i.a(this.y);
                        if (this.x) {
                            this.i.c();
                            return;
                        } else {
                            this.i.d();
                            return;
                        }
                    }
                    return;
                case '\r':
                    int c2 = com.sankuai.waimai.machpro.util.b.c(obj);
                    if (this.y != c2) {
                        this.y = c2;
                        if (this.i == null || !this.i.a()) {
                            return;
                        }
                        this.i.a(this.y);
                        return;
                    }
                    return;
                default:
                    super.updateAttribute(str, obj);
                    return;
            }
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void addEventListener(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb980283db567bd96fc579849bfa4f79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb980283db567bd96fc579849bfa4f79");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if ("loadSuccess".equals(str)) {
                this.l = com.sankuai.waimai.machpro.util.b.a((Object) str, "");
            } else if ("loadError".equals(str)) {
                this.m = com.sankuai.waimai.machpro.util.b.a((Object) str, "");
            } else if ("blurRadius".equals(str)) {
                this.o = com.sankuai.waimai.machpro.util.b.a((Object) str, "");
            } else if ("clipRect".equals(str)) {
                this.n = com.sankuai.waimai.machpro.util.b.a((Object) str, "");
            } else {
                super.addEventListener(str);
            }
        }
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e0d5eaf77e7c6c021952957e4a4fea6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e0d5eaf77e7c6c021952957e4a4fea6");
        }
        c bundle = this.mMachContext.getBundle();
        if (bundle == null) {
            return "";
        }
        if (!TextUtils.isEmpty(this.v)) {
            if (!TextUtils.equals(bundle.d, this.v)) {
                bundle = this.mMachContext.getSubBundle(this.v);
            }
            if (bundle == null) {
                return "";
            }
        }
        return bundle.g + File.separator + APKStructure.Assets_Type + File.separator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3f0c403034cab4ad334e1fc289eb76f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3f0c403034cab4ad334e1fc289eb76f");
            return;
        }
        if (!this.j) {
            if (this.k != null) {
                this.b.e = this.k;
            } else {
                int i = this.f;
                int i2 = this.g;
                if (i >= i2) {
                    this.b.e = new int[]{i, 0};
                } else {
                    this.b.e = new int[]{0, i2};
                }
            }
        } else {
            this.b.e = null;
            this.b.f = -1;
        }
        this.b.i = getBorderRadii();
        this.b.j = this.d;
        this.b.l = this.g;
        this.b.k = this.f;
        this.b.o = !TextUtils.isEmpty(this.o);
        this.b.n = true ^ TextUtils.isEmpty(this.n);
        com.sankuai.waimai.machpro.adapter.a aVar = f.a().b;
        if (aVar != null) {
            this.p = false;
            this.w = this.b.c;
            a((Drawable) null);
            aVar.a(this.b, this);
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateViewStyle(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "876bc351f3d6fed5d2289b1db5199d52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "876bc351f3d6fed5d2289b1db5199d52");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (ResizeMode.NAME.equals(str)) {
                a(com.sankuai.waimai.machpro.util.b.a(obj, ""));
            } else {
                super.updateViewStyle(str, obj);
            }
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void resetCssProperty(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d09c2cfd62403b9151c05c9bf1a922de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d09c2cfd62403b9151c05c9bf1a922de");
        } else if (ResizeMode.NAME.equals(str)) {
            a("aspectFit");
        } else {
            super.resetCssProperty(str);
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d42c230f6e1bbef6fcee87ce001a7f6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d42c230f6e1bbef6fcee87ce001a7f6c");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.d = str;
        }
        if ("centerCrop".equals(str)) {
            ((MPImageView) this.mView).setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else if (DynamicTitleParser.PARSER_KEY_STRETCH.equals(str) || "scaleToFill".equals(str)) {
            ((MPImageView) this.mView).setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            ((MPImageView) this.mView).setScaleType(ImageView.ScaleType.CENTER);
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public com.sankuai.waimai.machpro.view.decoration.b getBackgroundDrawable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "323a0caa41fc18c0ad2ce09d7e9c0155", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.machpro.view.decoration.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "323a0caa41fc18c0ad2ce09d7e9c0155");
        }
        com.sankuai.waimai.machpro.view.decoration.b backgroundDrawable = super.getBackgroundDrawable();
        backgroundDrawable.d = false;
        return backgroundDrawable;
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAttachToParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8bd0fadff49f6189341c0342e3bda60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8bd0fadff49f6189341c0342e3bda60");
            return;
        }
        super.onAttachToParent();
        if (this.i != null && this.i.a() && this.x) {
            this.i.a(this.y);
            this.i.c();
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onDetachFromParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b27f387c3f56a9d82a7d82b36626d1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b27f387c3f56a9d82a7d82b36626d1a");
            return;
        }
        super.onDetachFromParent();
        if (this.i == null || !this.i.a()) {
            return;
        }
        this.i.d();
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcc52b446830dc76ba88186a8a549cae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcc52b446830dc76ba88186a8a549cae");
            return;
        }
        List<com.sankuai.waimai.machpro.component.view.b> blurComponents = this.mMachContext.getBlurComponents();
        if (com.sankuai.waimai.machpro.util.b.c((List) blurComponents)) {
            return;
        }
        for (com.sankuai.waimai.machpro.component.view.b bVar : blurComponents) {
            if (com.sankuai.waimai.machpro.util.b.a(bVar, this)) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.component.view.b.d;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "221e44eb65ab60b30f45f728099c8565", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "221e44eb65ab60b30f45f728099c8565");
                }
            }
        }
    }

    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
    public final void a(com.sankuai.waimai.machpro.component.image.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbea11916d8dee95f7bd734c211c82d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbea11916d8dee95f7bd734c211c82d5");
            return;
        }
        if (this.i != null && this.i.a()) {
            this.i.d();
        }
        this.i = aVar;
        if (this.i == null || this.i.b() == null) {
            return;
        }
        if (!this.w.equals(aVar.e())) {
            com.sankuai.waimai.machpro.util.a.c("MachPro 图片不匹配 当前URI = " + aVar.e() + " 期望URI = " + this.w);
            return;
        }
        this.p = true;
        if ("widthFix".equals(this.d)) {
            int intrinsicHeight = this.i.b().getIntrinsicHeight();
            int round = Math.round(this.mYogaNode.o().d);
            if (this.mYogaNode.o().e != YogaUnit.POINT) {
                round = 0;
            }
            if (Math.abs(intrinsicHeight - round) > 2) {
                this.mYogaNode.h(intrinsicHeight);
                requestLayout();
            } else {
                a(this.i.b());
            }
        } else if ("heightFix".equals(this.d)) {
            int intrinsicWidth = this.i.b().getIntrinsicWidth();
            int round2 = Math.round(this.mYogaNode.m().d);
            if (this.mYogaNode.m().e != YogaUnit.POINT) {
                round2 = 0;
            }
            if (Math.abs(intrinsicWidth - round2) > 2) {
                this.mYogaNode.f(intrinsicWidth);
                requestLayout();
            } else {
                a(this.i.b());
            }
        } else {
            a(this.i.b());
        }
        if (this.h != null) {
            this.h.a();
        }
        if (this.i.a() && this.x) {
            this.i.a(this.y);
            this.i.c();
        }
        if (TextUtils.isEmpty(this.l)) {
            return;
        }
        MachMap machMap = new MachMap();
        machMap.put("width", Integer.valueOf(this.i.b().getIntrinsicWidth()));
        machMap.put("height", Integer.valueOf(this.i.b().getIntrinsicHeight()));
        MachArray machArray = new MachArray();
        machArray.add(machMap);
        dispatchEvent(this.l, machArray);
    }

    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02634fdf549e436139b50e63c9983670", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02634fdf549e436139b50e63c9983670");
            return;
        }
        com.sankuai.waimai.machpro.util.a.c("MachPro 图片加载失败 当前URI = " + this.w);
        if (TextUtils.isEmpty(this.m)) {
            return;
        }
        dispatchEvent(this.m, null);
    }

    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
    public final void b(com.sankuai.waimai.machpro.component.image.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "385eded1c80c2e0bdc3854b6f0772d0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "385eded1c80c2e0bdc3854b6f0772d0d");
        } else if (this.p || aVar == null) {
        } else {
            a(aVar.b());
        }
    }

    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
    public final void c(com.sankuai.waimai.machpro.component.image.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b449371880dc00e300edcf8f96b7f0a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b449371880dc00e300edcf8f96b7f0a7");
        } else if (aVar != null) {
            this.p = true;
            a(aVar.b());
        }
    }

    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
    public final int a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "423a94abd82b78ad5e86039c265e793b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "423a94abd82b78ad5e86039c265e793b")).intValue();
        }
        if (!TextUtils.isEmpty(this.o) && bitmap != null) {
            try {
                this.s = new CountDownLatch(1);
                MachMap machMap = new MachMap();
                machMap.put("width", Integer.valueOf(bitmap.getWidth()));
                machMap.put("height", Integer.valueOf(bitmap.getHeight()));
                final MachArray machArray = new MachArray();
                machArray.add(machMap);
                com.sankuai.waimai.machpro.util.b.b().post(new Runnable() { // from class: com.sankuai.waimai.machpro.component.image.b.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4190a01f871110f475590bc5d22bf3b0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4190a01f871110f475590bc5d22bf3b0");
                            return;
                        }
                        b.this.u = (int) Math.ceil(com.sankuai.waimai.machpro.util.b.b(b.this.dispatchEvent(b.this.o, machArray)));
                        b.this.s.countDown();
                    }
                });
                this.s.await(1L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                com.sankuai.waimai.machpro.util.a.a(" blur js execute error");
            }
        }
        return this.u;
    }

    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
    public final MachMap b(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88c88ed0f88df622ac7edca3dcaf9246", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88c88ed0f88df622ac7edca3dcaf9246");
        }
        if (!TextUtils.isEmpty(this.n) && bitmap != null) {
            try {
                this.r = new CountDownLatch(1);
                MachMap machMap = new MachMap();
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                machMap.put("width", Integer.valueOf(width));
                machMap.put("height", Integer.valueOf(height));
                final MachArray machArray = new MachArray();
                machArray.add(machMap);
                com.sankuai.waimai.machpro.util.b.b().post(new Runnable() { // from class: com.sankuai.waimai.machpro.component.image.b.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f1818689722cf22b9380425d02dad7f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f1818689722cf22b9380425d02dad7f");
                            return;
                        }
                        Object dispatchEvent = b.this.dispatchEvent(b.this.n, machArray);
                        if (dispatchEvent instanceof MachMap) {
                            b.this.t = (MachMap) dispatchEvent;
                        }
                        b.this.r.countDown();
                    }
                });
                this.r.await(1L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                com.sankuai.waimai.machpro.util.a.a(" clip js execute error");
            }
        }
        return this.t;
    }

    private void a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd8ef0fd7e089d5d3e19f09c971eb79b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd8ef0fd7e089d5d3e19f09c971eb79b");
            return;
        }
        if (drawable != null) {
            float f = com.sankuai.waimai.machpro.a.b.density;
            float intrinsicWidth = drawable.getIntrinsicWidth() * f;
            float intrinsicHeight = drawable.getIntrinsicHeight() * f;
            if ("top".equals(this.d)) {
                Matrix matrix = new Matrix();
                matrix.setScale(f, f);
                matrix.postTranslate(Math.round((this.f - intrinsicWidth) * 0.5f), 0.0f);
                ((MPImageView) this.mView).setScaleType(ImageView.ScaleType.MATRIX);
                ((MPImageView) this.mView).setImageMatrix(matrix);
            } else if ("bottom".equals(this.d)) {
                Matrix matrix2 = new Matrix();
                matrix2.setScale(f, f);
                matrix2.postTranslate(Math.round((this.f - intrinsicWidth) * 0.5f), this.g - intrinsicHeight);
                ((MPImageView) this.mView).setScaleType(ImageView.ScaleType.MATRIX);
                ((MPImageView) this.mView).setImageMatrix(matrix2);
            } else if ("center".equals(this.d)) {
                Matrix matrix3 = new Matrix();
                matrix3.setScale(f, f);
                matrix3.postTranslate(Math.round((this.f - intrinsicWidth) * 0.5f), Math.round((this.g - intrinsicHeight) * 0.5f));
                ((MPImageView) this.mView).setScaleType(ImageView.ScaleType.MATRIX);
                ((MPImageView) this.mView).setImageMatrix(matrix3);
            } else if ("left".equals(this.d)) {
                Matrix matrix4 = new Matrix();
                matrix4.setScale(f, f);
                matrix4.postTranslate(0.0f, Math.round((this.g - intrinsicHeight) * 0.5f));
                ((MPImageView) this.mView).setScaleType(ImageView.ScaleType.MATRIX);
                ((MPImageView) this.mView).setImageMatrix(matrix4);
            } else if ("right".equals(this.d)) {
                Matrix matrix5 = new Matrix();
                matrix5.setScale(f, f);
                matrix5.postTranslate(this.f - intrinsicWidth, Math.round((this.g - intrinsicHeight) * 0.5f));
                ((MPImageView) this.mView).setScaleType(ImageView.ScaleType.MATRIX);
                ((MPImageView) this.mView).setImageMatrix(matrix5);
            } else if ("top left".equals(this.d)) {
                Matrix matrix6 = new Matrix();
                matrix6.setScale(f, f);
                ((MPImageView) this.mView).setScaleType(ImageView.ScaleType.MATRIX);
                ((MPImageView) this.mView).setImageMatrix(matrix6);
            } else if ("top right".equals(this.d)) {
                Matrix matrix7 = new Matrix();
                matrix7.setScale(f, f);
                matrix7.postTranslate(this.f - intrinsicWidth, 0.0f);
                ((MPImageView) this.mView).setScaleType(ImageView.ScaleType.MATRIX);
                ((MPImageView) this.mView).setImageMatrix(matrix7);
            } else if ("bottom left".equals(this.d)) {
                Matrix matrix8 = new Matrix();
                matrix8.setScale(f, f);
                matrix8.postTranslate(0.0f, this.g - intrinsicHeight);
                ((MPImageView) this.mView).setScaleType(ImageView.ScaleType.MATRIX);
                ((MPImageView) this.mView).setImageMatrix(matrix8);
            } else if ("bottom right".equals(this.d)) {
                Matrix matrix9 = new Matrix();
                matrix9.setScale(f, f);
                matrix9.postTranslate(this.f - intrinsicWidth, this.g - intrinsicHeight);
                ((MPImageView) this.mView).setScaleType(ImageView.ScaleType.MATRIX);
                ((MPImageView) this.mView).setImageMatrix(matrix9);
            }
        }
        ((MPImageView) this.mView).setImageDrawable(drawable);
        d();
    }
}
