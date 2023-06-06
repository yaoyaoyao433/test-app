package com.sankuai.waimai.irmo.render.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.mach.b;
import com.sankuai.waimai.irmo.render.bean.assets.IrmoAssetInfo;
import com.sankuai.waimai.irmo.render.bean.layers.GyroEffectParams;
import com.sankuai.waimai.irmo.render.bean.layers.IrmoLayerInfo;
import java.io.File;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IrmoGyroView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    public int b;
    public GyroEffectParams.EffectActionGroup c;
    public a d;
    public IrmoLayerInfo e;
    public boolean f;
    private final float g;
    private final float h;

    public IrmoGyroView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbe18db70289c648b2d531da283647fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbe18db70289c648b2d531da283647fa");
            return;
        }
        this.b = 16;
        this.g = (float) Math.toDegrees(0.39269908169872414d);
        this.f = false;
        this.h = b.a(context, 20.0f);
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v2 */
    public final void a(float f, float f2) {
        int i;
        int i2;
        Iterator<GyroEffectParams.EffectAction> it;
        float f3;
        int i3;
        float f4 = f;
        int i4 = 2;
        ?? r12 = 0;
        char c = 1;
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a425772a8a6c34ccb3171cab6d6bc57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a425772a8a6c34ccb3171cab6d6bc57");
            return;
        }
        Iterator<GyroEffectParams.EffectAction> it2 = this.c.mActions.iterator();
        while (it2.hasNext()) {
            GyroEffectParams.EffectAction next = it2.next();
            int i5 = next.x;
            int i6 = next.y;
            int i7 = next.isPositive() ? -1 : 1;
            int i8 = next.isPositive() ? 1 : -1;
            if (i6 > 0) {
                if (RecceAnimUtils.ROTATION.equalsIgnoreCase(next.type)) {
                    float a2 = a(f4, i6) * i8 * (-1.0f);
                    Object[] objArr2 = new Object[i4];
                    objArr2[r12] = this;
                    objArr2[c] = Float.valueOf(a2);
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    i3 = i6;
                    i2 = i7;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6d1009af45500d70551bf528a28a1f9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, r12, "f6d1009af45500d70551bf528a28a1f9");
                    } else {
                        setRotationX(a2);
                    }
                } else {
                    i3 = i6;
                    i2 = i7;
                    if ("translation".equalsIgnoreCase(next.type)) {
                        i = i3;
                        float a3 = a(f4, i, i8);
                        Object[] objArr3 = new Object[2];
                        objArr3[r12] = this;
                        objArr3[1] = Float.valueOf(a3);
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        it = it2;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f843b77bd2f7afca1591fb920d1dc73b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f843b77bd2f7afca1591fb920d1dc73b");
                        } else {
                            setTranslationY(a3);
                        }
                    }
                }
                it = it2;
                i = i3;
            } else {
                i = i6;
                i2 = i7;
                it = it2;
            }
            if (i5 > 0) {
                if (RecceAnimUtils.ROTATION.equalsIgnoreCase(next.type)) {
                    float a4 = a(f2, i5) * i2 * (-1.0f);
                    Object[] objArr4 = {this, Float.valueOf(a4)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "da97600761270448c116ebafac595c46", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "da97600761270448c116ebafac595c46");
                    } else {
                        setRotationY(a4);
                    }
                } else {
                    int i9 = i2;
                    if ("translation".equalsIgnoreCase(next.type)) {
                        float a5 = a(f2, i5, i9);
                        Object[] objArr5 = {this, Float.valueOf(a5)};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "de852a3eef041f89c1ac7cd158784f50", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "de852a3eef041f89c1ac7cd158784f50");
                        } else {
                            setTranslationX(a5);
                        }
                    }
                }
            }
            if ("alpha".equalsIgnoreCase(next.type)) {
                float a6 = i5 > 0 ? a(f2, i5) / this.g : 0.0f;
                if (i > 0) {
                    f4 = f;
                    f3 = a(f4, i) / this.g;
                } else {
                    f4 = f;
                    f3 = 0.0f;
                }
                if (a6 != 0.0f || f3 != 0.0f) {
                    float max = 1.0f - Math.max(Math.abs(a6), Math.abs(f3));
                    c = 1;
                    Object[] objArr6 = {this, Float.valueOf(max)};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "71404cd605b252d7a40c38fc01560d77", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "71404cd605b252d7a40c38fc01560d77");
                    } else {
                        setAlpha(max);
                    }
                    it2 = it;
                    i4 = 2;
                    r12 = 0;
                }
            } else {
                f4 = f;
            }
            c = 1;
            it2 = it;
            i4 = 2;
            r12 = 0;
        }
    }

    private float a(double d, int i) {
        Object[] objArr = {Double.valueOf(d), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0351e17a0941e813c733521397f6c6c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0351e17a0941e813c733521397f6c6c1")).floatValue();
        }
        if (d < 0.0d) {
            return Math.max(-this.g, ((float) d) * this.g * i);
        }
        return Math.min(this.g, ((float) d) * this.g * i);
    }

    private float a(float f, int i, int i2) {
        return f * this.h * i2 * (-1.0f);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a {
        public boolean a;
        public boolean b;
        @Nullable
        public String c;
        @Nullable
        public File d;
        @Nullable
        public String e;

        public a(@NonNull IrmoLayerInfo irmoLayerInfo) {
            this.a = false;
            GyroEffectParams gyroEffectParams = irmoLayerInfo.effectParams instanceof GyroEffectParams ? (GyroEffectParams) irmoLayerInfo.effectParams : null;
            if (gyroEffectParams == null) {
                this.a = false;
                return;
            }
            IrmoAssetInfo assetById = irmoLayerInfo.getAssetById(gyroEffectParams.pid);
            if (assetById == null) {
                this.a = false;
                return;
            }
            if (!TextUtils.isEmpty(irmoLayerInfo.rootPath) && !TextUtils.isEmpty(assetById.path)) {
                this.b = false;
                this.d = new File(irmoLayerInfo.rootPath, assetById.path);
                this.a = this.d.exists();
                this.e = assetById.type;
            }
            if (this.a || TextUtils.isEmpty(assetById.url)) {
                return;
            }
            this.a = true;
            this.b = true;
            this.c = assetById.url;
            this.e = assetById.type;
        }
    }
}
