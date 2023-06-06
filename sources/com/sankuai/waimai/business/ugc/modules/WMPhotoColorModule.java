package com.sankuai.waimai.business.ugc.modules;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.ugc.utils.b;
import java.util.Arrays;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
@ReactModule(name = WMPhotoColorModule.TAG)
/* loaded from: classes4.dex */
public class WMPhotoColorModule extends ReactContextBaseJavaModule {
    public static final String TAG = "WMPhotoColorModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return TAG;
    }

    public WMPhotoColorModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31e8ae2e9160995d55c195e31938f6a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31e8ae2e9160995d55c195e31938f6a8");
        }
    }

    @ReactMethod
    public void getPaletteColorWithURL(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22ace720a14f0239a25354b6379984be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22ace720a14f0239a25354b6379984be");
            return;
        }
        try {
            final boolean[] zArr = new boolean[4];
            Arrays.fill(zArr, true);
            final b.a aVar = new b.a() { // from class: com.sankuai.waimai.business.ugc.modules.WMPhotoColorModule.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.ugc.utils.b.a
                public final void a(int[] iArr) {
                    Object[] objArr2 = {iArr};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2778978cf587d56311a4945a3b6b9e58", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2778978cf587d56311a4945a3b6b9e58");
                        return;
                    }
                    WritableArray createArray = Arguments.createArray();
                    int length = iArr.length;
                    for (int i = 0; i < length; i++) {
                        createArray.pushString(String.format("#%06X", Integer.valueOf(iArr[i] & ViewCompat.MEASURED_SIZE_MASK)));
                    }
                    promise.resolve(createArray);
                }
            };
            Object[] objArr2 = {str, zArr, aVar};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "cd5d7d5a092fff8d5b9655fbdcae6452", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "cd5d7d5a092fff8d5b9655fbdcae6452");
                return;
            }
            final int[] iArr = new int[0];
            ai.a(new Runnable() { // from class: com.sankuai.waimai.business.ugc.utils.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "cb2fc53300c1ddef4173b9bfe812deba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "cb2fc53300c1ddef4173b9bfe812deba");
                        return;
                    }
                    b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a2.b = com.meituan.android.singleton.b.a;
                    a2.c = str;
                    a2.a(new b.a() { // from class: com.sankuai.waimai.business.ugc.utils.b.1.1
                        public static ChangeQuickRedirect a;

                        {
                            AnonymousClass1.this = this;
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a(Bitmap bitmap) {
                            C08771 c08771;
                            Bitmap bitmap2;
                            Object[] objArr4 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "7ccfda5524f52a3b767d3d7a2807708b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "7ccfda5524f52a3b767d3d7a2807708b");
                                return;
                            }
                            boolean[] zArr2 = zArr;
                            Object[] objArr5 = {bitmap, Float.valueOf(0.1f), zArr2};
                            ChangeQuickRedirect changeQuickRedirect6 = b.a;
                            int[] iArr2 = null;
                            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect6, true, "2bd7a125241e22aaaaaf7a0b0b2b45ca", RobustBitConfig.DEFAULT_VALUE)) {
                                iArr2 = (int[]) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect6, true, "2bd7a125241e22aaaaaf7a0b0b2b45ca");
                                c08771 = this;
                            } else {
                                if (zArr2 != null && zArr2.length == 4) {
                                    boolean z = zArr2[0];
                                    boolean z2 = zArr2[1];
                                    boolean z3 = zArr2[2];
                                    boolean z4 = zArr2[3];
                                    System.currentTimeMillis();
                                    bitmap.getWidth();
                                    bitmap.getHeight();
                                    float min = Math.min(1.0f, 50.0f / bitmap.getHeight());
                                    if (min < 1.0f) {
                                        Matrix matrix = new Matrix();
                                        matrix.postScale(min, min);
                                        bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                                    } else {
                                        bitmap2 = bitmap;
                                    }
                                    int[] iArr3 = new int[bitmap2.getWidth() * bitmap2.getHeight()];
                                    bitmap2.getPixels(iArr3, 0, bitmap2.getWidth(), 0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                                    int i = 0;
                                    int i2 = 0;
                                    int i3 = 0;
                                    int i4 = 0;
                                    for (int i5 = 0; i5 < iArr3.length * 0.1f && z2; i5++) {
                                        i2 += (iArr3[i5] & 16711680) >> 16;
                                        i3 += (iArr3[i5] & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                                        i4 += iArr3[i5] & 255;
                                        i++;
                                    }
                                    if (i != 0) {
                                        i2 /= i;
                                        i3 /= i;
                                        i4 /= i;
                                    }
                                    int i6 = 0;
                                    int i7 = 0;
                                    int i8 = 0;
                                    int i9 = 0;
                                    int i10 = 0;
                                    while (i6 < bitmap2.getWidth() * 0.1f && z) {
                                        int i11 = i7;
                                        for (int i12 = 0; i12 < bitmap2.getHeight(); i12++) {
                                            i8 += (iArr3[(bitmap2.getWidth() * i12) + i6] & 16711680) >> 16;
                                            i9 += (iArr3[(bitmap2.getWidth() * i12) + i6] & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                                            i10 += iArr3[(bitmap2.getWidth() * i12) + i6] & 255;
                                            i11++;
                                        }
                                        i6++;
                                        i7 = i11;
                                    }
                                    if (i7 != 0) {
                                        i8 /= i7;
                                        i9 /= i7;
                                        i10 /= i7;
                                    }
                                    int i13 = 0;
                                    int i14 = 0;
                                    int i15 = 0;
                                    int i16 = 0;
                                    for (int length = (int) (iArr3.length * 0.9f); length < iArr3.length && z4; length++) {
                                        i14 += (iArr3[length] & 16711680) >> 16;
                                        i15 += (iArr3[length] & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                                        i16 += iArr3[length] & 255;
                                        i13++;
                                    }
                                    if (i13 != 0) {
                                        i14 /= i13;
                                        i15 /= i13;
                                        i16 /= i13;
                                    }
                                    int width = (int) (bitmap2.getWidth() * 0.9f);
                                    int i17 = 0;
                                    int i18 = 0;
                                    int i19 = 0;
                                    int i20 = 0;
                                    while (width < bitmap2.getWidth() && z3) {
                                        int i21 = i17;
                                        int i22 = 0;
                                        while (i22 < bitmap2.getHeight()) {
                                            i18 += (iArr3[(bitmap2.getWidth() * i22) + width] & 16711680) >> 16;
                                            i19 += (iArr3[(bitmap2.getWidth() * i22) + width] & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                                            i20 += iArr3[(bitmap2.getWidth() * i22) + width] & 255;
                                            i21++;
                                            i22++;
                                            bitmap2 = bitmap2;
                                        }
                                        width++;
                                        i17 = i21;
                                    }
                                    if (i17 != 0) {
                                        i18 /= i17;
                                        i19 /= i17;
                                        i20 /= i17;
                                    }
                                    iArr2 = new int[]{Color.argb(255, i8, i9, i10), Color.argb(255, i2, i3, i4), Color.argb(255, i18, i19, i20), Color.argb(255, i14, i15, i16)};
                                }
                                c08771 = this;
                            }
                            aVar.a(iArr2);
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "48fa450619f11edf6036053459d8ff54", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "48fa450619f11edf6036053459d8ff54");
                            } else {
                                aVar.a(iArr);
                            }
                        }
                    });
                }
            });
        } catch (Exception unused) {
            promise.reject("");
        }
    }
}
