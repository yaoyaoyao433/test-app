package com.sankuai.waimai.business.restaurant.poicontainer.machpro.rooimage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.recce.props.gens.ResizeMode;
import com.meituan.android.recce.props.gens.TintColor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.resfetcher.runtime.c;
import com.sankuai.waimai.machpro.adapter.a;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.util.b;
import java.io.File;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a extends MPComponent<MPRooImageView> implements a.InterfaceC1022a {
    public static ChangeQuickRedirect a;
    public a.b b;
    boolean c;
    Handler d;
    int e;
    int f;
    private com.sankuai.waimai.machpro.component.image.a g;
    private boolean h;
    private int[] i;
    private String j;
    private String k;
    private boolean l;
    private String m;
    private String n;

    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
    public final int a(Bitmap bitmap) {
        return 0;
    }

    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
    public final MachMap b(Bitmap bitmap) {
        return null;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.l = false;
        return false;
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ MPRooImageView createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c62480e9e35352ee033b3bf823691a1d", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPRooImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c62480e9e35352ee033b3bf823691a1d");
        }
        MPRooImageView mPRooImageView = new MPRooImageView(this.mMachContext.getContext());
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = MPRooImageView.a;
        if (PatchProxy.isSupport(objArr2, mPRooImageView, changeQuickRedirect2, false, "fdce52b8682b0ebff3b22d6eca101571", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mPRooImageView, changeQuickRedirect2, false, "fdce52b8682b0ebff3b22d6eca101571");
        } else {
            mPRooImageView.b = new WeakReference<>(this);
        }
        mPRooImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.mMachContext.getInstance().r.b(1);
        return mPRooImageView;
    }

    public a(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b6b1e448a2a2b218563f9d411d6a7bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b6b1e448a2a2b218563f9d411d6a7bb");
            return;
        }
        this.m = "aspectFit";
        this.d = new Handler(Looper.getMainLooper());
        this.e = 0;
        this.f = 0;
        this.b = new a.b();
        this.b.b = (ImageView) this.mView;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateAttribute(String str, Object obj) {
        char c;
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fb4081c7aa8c3278c2875fd9fb6233b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fb4081c7aa8c3278c2875fd9fb6233b");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            switch (str.hashCode()) {
                case -1092912869:
                    if (str.equals("cdnoptimizationsize")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 114148:
                    if (str.equals(RaptorUploaderImpl.SRC)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 96784904:
                    if (str.equals("error")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 451247665:
                    if (str.equals("srcrookey")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 598246771:
                    if (str.equals(ReactTextInputShadowNode.PROP_PLACEHOLDER)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 764208690:
                    if (str.equals("disablecdnoptimization")) {
                        c = 4;
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
                    this.n = c.a(this.mMachContext.getContext(), b.a(obj, ""));
                    this.c = true;
                    requestLayout();
                    return;
                case 1:
                    String a2 = b.a(obj, "");
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
                    this.c = true;
                    requestLayout();
                    return;
                case 2:
                    String a3 = b.a(obj, "");
                    if (a3.startsWith("assets://")) {
                        String substring2 = a3.substring(9);
                        a.b bVar2 = this.b;
                        bVar2.g = b() + substring2;
                        return;
                    }
                    return;
                case 3:
                    String a4 = b.a(obj, "");
                    if (a4.startsWith("assets://")) {
                        String substring3 = a4.substring(9);
                        a.b bVar3 = this.b;
                        bVar3.h = b() + substring3;
                        return;
                    }
                    return;
                case 4:
                    this.h = b.d(obj);
                    this.c = true;
                    requestLayout();
                    return;
                case 5:
                    String[] split = b.a(obj, "").split("\\.");
                    if (split.length == 3) {
                        this.i = new int[2];
                        this.i[0] = b.c((Object) split[0]);
                        this.i[1] = b.c((Object) split[1]);
                        this.b.f = b.c((Object) split[2]);
                    } else {
                        this.i = null;
                        this.b.f = -1;
                    }
                    this.c = true;
                    requestLayout();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22356b3f3e21ce0efa4a5f51205c447c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22356b3f3e21ce0efa4a5f51205c447c");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if ("loadSuccess".equals(str)) {
                this.j = b.a((Object) str, "");
            } else if ("loadError".equals(str)) {
                this.k = b.a((Object) str, "");
            } else {
                super.addEventListener(str);
            }
        }
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62e6472c6df9726949d810c22162c44c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62e6472c6df9726949d810c22162c44c");
        }
        com.sankuai.waimai.mach.manager.cache.c bundle = this.mMachContext.getBundle();
        if (bundle == null) {
            return "";
        }
        return bundle.g + File.separator + APKStructure.Assets_Type + File.separator;
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateViewStyle(String str, Object obj) {
        char c;
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "159eac860963b80a0e211e856150485a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "159eac860963b80a0e211e856150485a");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            int hashCode = str.hashCode();
            if (hashCode == -911634660) {
                if (str.equals(ResizeMode.NAME)) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != 1327599912) {
                if (hashCode == 1515751784 && str.equals("capInsets")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (str.equals(TintColor.LOWER_CASE_NAME)) {
                    c = 1;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    String a2 = b.a(obj, "");
                    if (TextUtils.isEmpty(a2)) {
                        return;
                    }
                    this.m = a2;
                    return;
                case 1:
                    int b = b.b(b.a(obj, ""));
                    if (b != -1) {
                        ((MPRooImageView) this.mView).setColorFilter(b);
                        return;
                    }
                    return;
                case 2:
                    String[] split = b.a(obj, "").split("\\s+");
                    if (split.length == 4) {
                        this.b.m = new a.c();
                        this.b.m.a = (int) b.a((Object) split[0]);
                        this.b.m.b = (int) b.a((Object) split[1]);
                        this.b.m.c = (int) b.a((Object) split[2]);
                        this.b.m.d = (int) b.a((Object) split[3]);
                        return;
                    }
                    return;
                default:
                    super.updateViewStyle(str, obj);
                    return;
            }
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public com.sankuai.waimai.machpro.view.decoration.b getBackgroundDrawable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a046ad76e7cd4c05ab98ef768e4fe2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.machpro.view.decoration.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a046ad76e7cd4c05ab98ef768e4fe2c");
        }
        com.sankuai.waimai.machpro.view.decoration.b backgroundDrawable = super.getBackgroundDrawable();
        backgroundDrawable.d = false;
        return backgroundDrawable;
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAttachToParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a480cae568e53d9bec6f9b655cb2fb34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a480cae568e53d9bec6f9b655cb2fb34");
            return;
        }
        super.onAttachToParent();
        if (this.g == null || !this.g.a()) {
            return;
        }
        this.g.c();
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onDetachFromParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61e9078395281b948b39875783868ec9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61e9078395281b948b39875783868ec9");
            return;
        }
        super.onDetachFromParent();
        if (this.g == null || !this.g.a()) {
            return;
        }
        this.g.d();
    }

    private void a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37d850537ba395ec0064e47837552017", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37d850537ba395ec0064e47837552017");
            return;
        }
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if ("top".equals(this.m)) {
                Matrix matrix = new Matrix();
                matrix.setTranslate(Math.round((this.e - intrinsicWidth) * 0.5f), 0.0f);
                ((MPRooImageView) this.mView).setScaleType(ImageView.ScaleType.MATRIX);
                ((MPRooImageView) this.mView).setImageMatrix(matrix);
            } else if ("bottom".equals(this.m)) {
                Matrix matrix2 = new Matrix();
                matrix2.setTranslate(Math.round((this.e - intrinsicWidth) * 0.5f), this.f - intrinsicHeight);
                ((MPRooImageView) this.mView).setScaleType(ImageView.ScaleType.MATRIX);
                ((MPRooImageView) this.mView).setImageMatrix(matrix2);
            } else if ("center".equals(this.m)) {
                Matrix matrix3 = new Matrix();
                matrix3.setTranslate(Math.round((this.e - intrinsicWidth) * 0.5f), Math.round((this.f - intrinsicHeight) * 0.5f));
                ((MPRooImageView) this.mView).setScaleType(ImageView.ScaleType.MATRIX);
                ((MPRooImageView) this.mView).setImageMatrix(matrix3);
            } else if ("left".equals(this.m)) {
                Matrix matrix4 = new Matrix();
                matrix4.setTranslate(0.0f, Math.round((this.f - intrinsicHeight) * 0.5f));
                ((MPRooImageView) this.mView).setScaleType(ImageView.ScaleType.MATRIX);
                ((MPRooImageView) this.mView).setImageMatrix(matrix4);
            } else if ("right".equals(this.m)) {
                Matrix matrix5 = new Matrix();
                matrix5.setTranslate(this.e - intrinsicWidth, Math.round((this.f - intrinsicHeight) * 0.5f));
                ((MPRooImageView) this.mView).setScaleType(ImageView.ScaleType.MATRIX);
                ((MPRooImageView) this.mView).setImageMatrix(matrix5);
            } else if ("top left".equals(this.m)) {
                Matrix matrix6 = new Matrix();
                ((MPRooImageView) this.mView).setScaleType(ImageView.ScaleType.MATRIX);
                ((MPRooImageView) this.mView).setImageMatrix(matrix6);
            } else if ("top right".equals(this.m)) {
                Matrix matrix7 = new Matrix();
                matrix7.setTranslate(this.e - intrinsicWidth, 0.0f);
                ((MPRooImageView) this.mView).setScaleType(ImageView.ScaleType.MATRIX);
                ((MPRooImageView) this.mView).setImageMatrix(matrix7);
            } else if ("bottom left".equals(this.m)) {
                Matrix matrix8 = new Matrix();
                matrix8.setTranslate(0.0f, this.f - intrinsicHeight);
                ((MPRooImageView) this.mView).setScaleType(ImageView.ScaleType.MATRIX);
                ((MPRooImageView) this.mView).setImageMatrix(matrix8);
            } else if ("bottom right".equals(this.m)) {
                Matrix matrix9 = new Matrix();
                matrix9.setTranslate(this.e - intrinsicWidth, this.f - intrinsicHeight);
                ((MPRooImageView) this.mView).setScaleType(ImageView.ScaleType.MATRIX);
                ((MPRooImageView) this.mView).setImageMatrix(matrix9);
            }
        }
        ((MPRooImageView) this.mView).setImageDrawable(drawable);
    }

    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
    public final void a(com.sankuai.waimai.machpro.component.image.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4e3e5ea6fd5ffb8146693456e781f56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4e3e5ea6fd5ffb8146693456e781f56");
            return;
        }
        if (this.g != null && this.g.a()) {
            this.g.d();
        }
        this.g = aVar;
        if (this.g == null || this.g.b() == null) {
            return;
        }
        this.l = true;
        a(this.g.b());
        if (this.g.a()) {
            this.g.c();
        }
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeb85a0622ce2d3001bfe66872f93272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeb85a0622ce2d3001bfe66872f93272");
        } else if (TextUtils.isEmpty(this.k)) {
        } else {
            dispatchEvent(this.k, null);
        }
    }

    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
    public final void b(com.sankuai.waimai.machpro.component.image.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30aaeba40ff8156246457c43ab4d16f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30aaeba40ff8156246457c43ab4d16f3");
        } else if (this.l || aVar == null) {
        } else {
            a(aVar.b());
        }
    }

    @Override // com.sankuai.waimai.machpro.adapter.a.InterfaceC1022a
    public final void c(com.sankuai.waimai.machpro.component.image.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fc55096742fa0269995f22510d142ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fc55096742fa0269995f22510d142ac");
        } else if (aVar != null) {
            this.l = true;
            a(aVar.b());
        }
    }
}
