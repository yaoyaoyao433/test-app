package com.sankuai.waimai.business.page.home.gray;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.Gson;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.gray.HomeGrayModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class HomeGrayManager {
    public static ChangeQuickRedirect a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public Gson f;
    public HomeGrayModel.PositionsDTO.ResourcesDTO.ConfigDTO g;
    public HomeGrayModel.PositionsDTO.ResourcesDTO.ConfigDTO h;
    public Set<GrayViewWrapper> i;
    public List<a> j;
    private int k;
    private Map<String, Integer> l;
    private WeakReference<View> m;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface GrayViewLevel {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(HomeGrayModel.PositionsDTO.ResourcesDTO.ConfigDTO configDTO);
    }

    public HomeGrayManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae857950e3c139b32ff3e8277132b1e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae857950e3c139b32ff3e8277132b1e6");
            return;
        }
        this.f = new Gson();
        this.l = new HashMap();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e56fb951b727a564ebe4da43414ddb88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e56fb951b727a564ebe4da43414ddb88");
            return;
        }
        Object[] objArr3 = {"home_gray_config_key"};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        String b2 = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f18bfd396ee02a189f8ec13356883f57", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f18bfd396ee02a189f8ec13356883f57") : q.a(com.meituan.android.singleton.b.a, "home_gray_cip_channel").b("home_gray_config_key", "");
        if (!TextUtils.isEmpty(b2)) {
            a((HomeGrayModel.PositionsDTO.ResourcesDTO.ConfigDTO) this.f.fromJson(b2, (Class<Object>) HomeGrayModel.PositionsDTO.ResourcesDTO.ConfigDTO.class), false);
            return;
        }
        this.g = new HomeGrayModel.PositionsDTO.ResourcesDTO.ConfigDTO("");
        a(false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class b {
        private static final HomeGrayManager a = new HomeGrayManager();
    }

    public static HomeGrayManager a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3833f4bb6a8846eec67f5b0159ee017f", RobustBitConfig.DEFAULT_VALUE) ? (HomeGrayManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3833f4bb6a8846eec67f5b0159ee017f") : b.a;
    }

    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7b8c917b6f24c7966111f7fadfbaf2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7b8c917b6f24c7966111f7fadfbaf2b");
        } else if (z2) {
            if (!z) {
                a((HomeGrayModel.PositionsDTO.ResourcesDTO.ConfigDTO) null, true);
            }
            this.c = z;
        } else {
            this.b = z;
        }
    }

    public final void b() {
        this.e = false;
        this.k = 0;
    }

    private float a(HomeGrayModel.PositionsDTO.ResourcesDTO.ConfigDTO configDTO) {
        Object[] objArr = {configDTO};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1446ec70b5024c9c1f34be46e0237dec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1446ec70b5024c9c1f34be46e0237dec")).floatValue();
        }
        if (configDTO != null) {
            return configDTO.getGrayRate();
        }
        return 1.0f;
    }

    public final void a(View view, int i, int i2, String str, int i3) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "210a8059917e7e7dd7a0d9e4a1a092d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "210a8059917e7e7dd7a0d9e4a1a092d7");
            return;
        }
        if (i == 1) {
            this.m = new WeakReference<>(view);
        }
        if (this.i == null) {
            this.i = new HashSet();
        }
        GrayViewWrapper grayViewWrapper = new GrayViewWrapper();
        grayViewWrapper.viewLevel = i;
        grayViewWrapper.viewType = i2;
        grayViewWrapper.view = view;
        if (i2 == 1) {
            grayViewWrapper.position = i3;
            if (!TextUtils.isEmpty(str)) {
                this.l.put(str, Integer.valueOf(grayViewWrapper.position));
            }
        } else if (i2 != 2) {
            grayViewWrapper.position = -1;
        } else if (i3 >= 0) {
            grayViewWrapper.position = i3;
        }
        a(this.g, grayViewWrapper);
        this.i.add(grayViewWrapper);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e81105c72f3b51e881d7e7a4affe8e7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e81105c72f3b51e881d7e7a4affe8e7b");
        } else if (this.d && this.e) {
            if (this.h == null && this.g == null) {
                return;
            }
            if (this.h == null || !this.h.equals(this.g)) {
                this.g = this.h;
                if (this.b && this.m != null) {
                    a(false, this.m.get(), 1.0f);
                }
                if (this.i == null || this.i.size() <= 0) {
                    return;
                }
                Iterator<GrayViewWrapper> it = this.i.iterator();
                while (it != null && it.hasNext()) {
                    a(this.h, it.next());
                }
            }
        }
    }

    private void a(HomeGrayModel.PositionsDTO.ResourcesDTO.ConfigDTO configDTO, GrayViewWrapper grayViewWrapper) {
        Object[] objArr = {configDTO, grayViewWrapper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2914731f4278bacabaaab4b67ddcf26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2914731f4278bacabaaab4b67ddcf26");
        } else if (configDTO == null || !configDTO.graySwitch() || grayViewWrapper == null) {
            if (grayViewWrapper != null) {
                a(false, grayViewWrapper.view, a(configDTO));
            }
        } else if (grayViewWrapper.shouldSetGray(configDTO, this.l)) {
            a(true, grayViewWrapper.view, a(configDTO));
            grayViewWrapper.isGray = true;
        } else {
            a(false, grayViewWrapper.view, a(configDTO));
        }
    }

    public final void a(HomeGrayModel.PositionsDTO.ResourcesDTO.ConfigDTO configDTO, boolean z) {
        boolean z2 = false;
        Object[] objArr = {configDTO, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc4cc1ba58de705034bd58191f031515", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc4cc1ba58de705034bd58191f031515");
            return;
        }
        if (configDTO != null) {
            if (z) {
                this.h = configDTO;
            } else {
                this.g = configDTO;
            }
            if (z) {
                try {
                    if (configDTO == null) {
                        a("home_gray_config_key", "");
                    } else {
                        a("home_gray_config_key", this.f.toJson(configDTO));
                    }
                } catch (Exception unused) {
                    a("home_gray_config_key", "");
                }
            }
            if (configDTO != null && configDTO.graySwitch()) {
                z2 = true;
            }
            a(z2, z);
        } else if (z) {
            this.h = null;
            a("home_gray_config_key", "");
        }
        if (z && ((this.g != null && this.g.getGrayLevel() > 0 && this.h == null) || (this.h != null && !this.h.equals(this.g)))) {
            b(this.h);
        }
        this.d = z;
        if (z) {
            c();
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b82864ecf5f64216c2d85cbefb0846f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b82864ecf5f64216c2d85cbefb0846f");
            return;
        }
        this.e = true;
        c();
    }

    public final void a(boolean z, View view, float f) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), view, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc986a21288d9437bfcb6f6c3a826685", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc986a21288d9437bfcb6f6c3a826685");
        } else if (view == null) {
        } else {
            Paint paint = new Paint();
            ColorMatrix colorMatrix = new ColorMatrix();
            if (z) {
                colorMatrix.setSaturation(f);
            } else {
                colorMatrix.setSaturation(1.0f);
            }
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            view.setLayerType(2, paint);
        }
    }

    private void b(HomeGrayModel.PositionsDTO.ResourcesDTO.ConfigDTO configDTO) {
        Object[] objArr = {configDTO};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0efa093c5901678a2e12d2297b2be38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0efa093c5901678a2e12d2297b2be38");
        } else if (this.j != null && this.j.size() > 0) {
            for (a aVar : this.j) {
                if (aVar != null) {
                    aVar.a(configDTO);
                }
            }
        }
    }

    private static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ab44a8b7a537457b3c096bd8a75a8ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ab44a8b7a537457b3c096bd8a75a8ac");
        } else {
            q.a(com.meituan.android.singleton.b.a, "home_gray_cip_channel").a(str, str2);
        }
    }
}
