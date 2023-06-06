package com.sankuai.eh.plugins.detector.imgs;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.network.EHNetService;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.f;
import com.tencent.mapsdk.internal.jw;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static byte[] a(Bitmap bitmap, int i) {
        Bitmap a2;
        Object[] objArr = {bitmap, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56da4e8d8a771cf95531b64bc94e981e", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56da4e8d8a771cf95531b64bc94e981e");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Object[] objArr2 = {byteArray, 270, Integer.valueOf((int) jw.g)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "420b2e0454828a44ca943a027fbcceea", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (Bitmap) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "420b2e0454828a44ca943a027fbcceea");
            } else {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                com.sankuai.waimai.launcher.util.image.a.a(byteArray, 0, byteArray.length, options);
                options.inSampleSize = a(options, 270, (int) jw.g);
                options.inJustDecodeBounds = false;
                a2 = com.sankuai.waimai.launcher.util.image.a.a(byteArray, 0, byteArray.length, options);
            }
            return a(a2, i);
        } catch (Exception e) {
            d.a(e);
            return null;
        }
    }

    private static int a(BitmapFactory.Options options, int i, int i2) {
        int i3 = 1;
        Object[] objArr = {options, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c0b9893fc05f1c41df8b7b72a70e55c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c0b9893fc05f1c41df8b7b72a70e55c")).intValue();
        }
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        while (i4 / i3 >= i2 && i5 / i3 >= i) {
            i3 *= 2;
        }
        return i3;
    }

    private static byte[] a(Bitmap bitmap, long j) {
        Object[] objArr = {bitmap, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0049f503ee9b5a475e495aae4997b779", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0049f503ee9b5a475e495aae4997b779");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        for (int i = 100; i > 0 && byteArrayOutputStream.toByteArray().length / 1024 > j; i -= 10) {
            byteArrayOutputStream.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void a(byte[] bArr, String str, String str2) {
        Object[] objArr = {bArr, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5167dad6233fc72cb2c2a859898c9a3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5167dad6233fc72cb2c2a859898c9a3f");
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("token", com.sankuai.eh.component.service.a.c().e());
        hashMap.put("client-id", "gnsj86rktpsnh2xj0000000000daed59");
        hashMap.put(TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_FILENAME, str);
        ae.b a2 = ae.b.a("file", str, al.a(bArr, "image/*"));
        EHNetService a3 = com.sankuai.eh.component.service.network.a.a(false);
        a3.upload2Venus("http://pic-up.meituan.com/extrastorage/new/" + str2, hashMap, a2).a(new f<ap>() { // from class: com.sankuai.eh.plugins.detector.imgs.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onResponse(Call<ap> call, Response<ap> response) {
                Object[] objArr2 = {call, response};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b003f953805b9f2c7787a0e3b648118", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b003f953805b9f2c7787a0e3b648118");
                } else {
                    d.a("upload2venus", response.e() != null ? response.e().string() : StringUtil.NULL);
                }
            }

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onFailure(Call<ap> call, Throwable th) {
                Object[] objArr2 = {call, th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26220a2b4278ee5f3f93951177ed6726", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26220a2b4278ee5f3f93951177ed6726");
                } else {
                    d.a(th);
                }
            }
        });
    }
}
