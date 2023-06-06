package com.sankuai.waimai.business.user.rn.studentcenter;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.support.constraint.R;
import android.view.View;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.user.rn.studentcenter.a;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.io.ByteArrayOutputStream;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class StudentCenterModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "StudentCenterModule";
    }

    public StudentCenterModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bff8ad041391bb30e781d8127737c574", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bff8ad041391bb30e781d8127737c574");
        }
    }

    @ReactMethod
    public void authenticate(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e061c2092d5fc595d5920247b54ca644", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e061c2092d5fc595d5920247b54ca644");
            return;
        }
        a a = a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "d4aba22454abff48c5377ca81a5b0807", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "d4aba22454abff48c5377ca81a5b0807");
        } else {
            b.a("StudentCenter");
        }
        final a a2 = a.a();
        final Activity currentActivity = getCurrentActivity();
        final a.InterfaceC0881a interfaceC0881a = new a.InterfaceC0881a() { // from class: com.sankuai.waimai.business.user.rn.studentcenter.StudentCenterModule.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.user.rn.studentcenter.a.InterfaceC0881a
            public final void a(WritableMap writableMap) {
                Object[] objArr3 = {writableMap};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a333929501fbd9eca04f01ccbb13fa4c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a333929501fbd9eca04f01ccbb13fa4c");
                    return;
                }
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putMap("result", writableMap);
                promise.resolve(writableNativeMap);
            }

            @Override // com.sankuai.waimai.business.user.rn.studentcenter.a.InterfaceC0881a
            public final void a(String str2) {
                Object[] objArr3 = {str2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "dd15135c465d41d510924856b0b526c8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "dd15135c465d41d510924856b0b526c8");
                    return;
                }
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("errorMessage", StudentCenterModule.this.getReactApplicationContext().getString(R.string.wm_mine_student_auth_timeout));
                promise.resolve(writableNativeMap);
            }
        };
        Object[] objArr3 = {currentActivity, str, interfaceC0881a};
        ChangeQuickRedirect changeQuickRedirect4 = a.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect4, false, "32d8516a5516120df5efc85784edb123", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect4, false, "32d8516a5516120df5efc85784edb123");
            return;
        }
        final a.b bVar = new a.b() { // from class: com.sankuai.waimai.business.user.rn.studentcenter.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.user.rn.studentcenter.a.b
            public final void a(byte[] bArr) {
                Object[] objArr4 = {bArr};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "244b85d831e5295814e9aa276a827826", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "244b85d831e5295814e9aa276a827826");
                } else {
                    a.a(a.this, bArr, new InterfaceC0881a() { // from class: com.sankuai.waimai.business.user.rn.studentcenter.a.2.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.user.rn.studentcenter.a.InterfaceC0881a
                        public final void a(WritableMap writableMap) {
                            Object[] objArr5 = {writableMap};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "800f604a33bc3e81f1e280e8c06d076c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "800f604a33bc3e81f1e280e8c06d076c");
                                return;
                            }
                            a.a(a.this);
                            interfaceC0881a.a(writableMap);
                        }

                        @Override // com.sankuai.waimai.business.user.rn.studentcenter.a.InterfaceC0881a
                        public final void a(String str2) {
                            Object[] objArr5 = {str2};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "cd444febc07dbf1efe407912a808fb5d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "cd444febc07dbf1efe407912a808fb5d");
                                return;
                            }
                            a.a(a.this);
                            interfaceC0881a.a(str2);
                        }
                    });
                }
            }

            @Override // com.sankuai.waimai.business.user.rn.studentcenter.a.b
            public final void a(String str2) {
                Object[] objArr4 = {str2};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "0a8f71217a9ab8b679562d8e8e139616", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "0a8f71217a9ab8b679562d8e8e139616");
                    return;
                }
                a.a(a.this);
                interfaceC0881a.a(str2);
            }
        };
        Object[] objArr4 = {currentActivity, str, bVar};
        ChangeQuickRedirect changeQuickRedirect5 = a.a;
        if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect5, false, "24f534005ce3a11c62a8e396ecada265", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect5, false, "24f534005ce3a11c62a8e396ecada265");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.user.rn.studentcenter.a.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "f13db38ad3f7cd5f8ae595b19dfa1bc1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "f13db38ad3f7cd5f8ae595b19dfa1bc1");
                        return;
                    }
                    try {
                        if (f.a(currentActivity)) {
                            bVar.a("activity dead");
                            return;
                        }
                        a.a(a.this, currentActivity);
                        View a3 = a.this.a(currentActivity.getWindow().getDecorView(), str);
                        if (a3 != null && a3.isAttachedToWindow() && a3.getVisibility() == 0) {
                            int width = (int) (a3.getWidth() * 2.5d);
                            int width2 = a3.getWidth();
                            if (a3.getHeight() < width) {
                                width = a3.getHeight();
                            }
                            Bitmap createBitmap = Bitmap.createBitmap(width2, width, Bitmap.Config.RGB_565);
                            a3.draw(new Canvas(createBitmap));
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            createBitmap.compress(Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            if (byteArray != null) {
                                bVar.a(byteArray);
                                return;
                            } else {
                                bVar.a("data null");
                                return;
                            }
                        }
                        bVar.a("view unavailable");
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                        bVar.a(e.getMessage());
                    }
                }
            });
        }
    }
}
